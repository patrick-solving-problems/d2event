package org.d2jsp.d2event.logic;

import com.google.common.collect.Lists;
import org.d2jsp.d2event.model.Char;
import org.d2jsp.d2event.model.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.d2jsp.d2event.logic.BasicStringBuilder.buildBasicString;

public class AliveStringBuilder {
    public static String createAliveString(final List<Player> players) {

        List<Char> chars = players.stream()
                .flatMap(player -> player.getAlive().stream())
                .sorted((c1, c2) -> c2.getLevel() - c1.getLevel())
                .collect(Collectors.toList());

        List<String> playerNames = new ArrayList<>();
        List<String> playerLevels = new ArrayList<>();
        List<String> playerBuilds = new ArrayList<>();
        List<String> playerProgress = new ArrayList<>();

        for (Char aChar : chars) {
            playerNames.add(aChar.getPlayer().getName());
            playerLevels.add(String.valueOf(aChar.getLevel()));
            playerBuilds.add(String.valueOf(aChar.getD2Build()));
            playerProgress.add(aChar.getProgress());
        }

        return "Alive:\n" + buildBasicString(Lists.newArrayList(playerNames, playerLevels, playerBuilds, playerProgress));
    }
}
