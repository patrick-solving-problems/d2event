package org.d2jsp.d2event.logic;

import org.d2jsp.d2event.model.Char;
import org.d2jsp.d2event.model.Player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.d2jsp.d2event.logic.BasicStringBuilder.buildBasicString;

public class ScoreStringBuilder {
    public static String createScoreString(final List<Player> players) {
        List<List<String>> lists = new ArrayList<>();
        players.sort((o1, o2) -> o2.calcScore().compareTo(o1.calcScore()));

        // Player names
        lists.add(players.stream()
                .map(Player::getName)
                .collect(Collectors.toList()));

        // Single char scores
        int maxChars = players.stream().mapToInt(
                player -> player.getAlive().size()
                        + player.getDead().size()
        ).max().getAsInt();
        for (int i = 0; i < maxChars; i++) {
            List<String> singleCharScoreList = new ArrayList<>();
            List<String> plusSigns = new ArrayList<>();

            for (Player player : players) {
                Char aChar = getChar(player, i);
                if (aChar == null) {
                    singleCharScoreList.add("");
                    plusSigns.add("");
                } else {
                    singleCharScoreList.add(aChar.printScoreAndLvl());
                    plusSigns.add("+");
                }
            }
            if (i != 0)
                lists.add(plusSigns);
            lists.add(singleCharScoreList);
        }

        // Sum score
        lists.add(players.stream()
                .map(player -> "=")
                .collect(Collectors.toList()));
        lists.add(players.stream()
                .map(player -> "" + player.calcScore() + " Punkte")
                .collect(Collectors.toList()));

        return "Score:\n" + buildBasicString(lists, Set.of(0));
    }

    private static Char getChar(Player player, int i) {
        List<Char> combined = new ArrayList<>();
        combined.addAll(player.getAlive());
        combined.addAll(player.getDead());
        if (i < combined.size()) {
            return combined.get(i);
        }
        return null;
    }
}
