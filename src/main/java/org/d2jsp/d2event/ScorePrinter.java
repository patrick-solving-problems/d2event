package org.d2jsp.d2event;

import org.d2jsp.d2event.logic.*;
import org.d2jsp.d2event.model.Player;

import java.awt.Toolkit;
import java.util.List;

import java.awt.datatransfer.StringSelection;
import java.util.stream.Collectors;

public class ScorePrinter {

    public static void main(final String[] args) {

        // Prepare
        final List<Player> players = PlayerBuilder.create();
        final List<Player> ripSequence = RipSequence.create();

        // Calculate
        final String resultString = "[CODE]\n"
                + AliveStringBuilder.createAliveString(players) + "\n"
                + RipStringBuilder.createRipString(ripSequence) + "\n"
                + ScoreStringBuilder.createScoreString(players)
                + "[/CODE]\n\n"
                + linkAllPlayers(players);

        // Console log
        System.out.println(resultString);

        // Copy into clipboard
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(
                new StringSelection(resultString), null
        );
    }

    private static String linkAllPlayers(final List<Player> players) {
        return players.stream()
                .map(player -> "^" + player.getName())
                .collect(Collectors.joining(" "));
    }
}