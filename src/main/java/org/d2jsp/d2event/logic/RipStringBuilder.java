package org.d2jsp.d2event.logic;

import com.google.common.collect.Lists;
import org.d2jsp.d2event.model.Char;
import org.d2jsp.d2event.model.Player;

import java.util.*;
import java.util.stream.Collectors;

import static org.d2jsp.d2event.logic.BasicStringBuilder.buildBasicString;

public class RipStringBuilder {
    public static String createRipString(final List<Player> ripSequence) {
        Map<Player, Integer> rips = ripSequence.stream()
                .distinct()
                .collect(Collectors.toMap(player -> player, player -> 0));

        List<String> playerNames = new ArrayList<>();
        List<String> playerLevels = new ArrayList<>();
        List<String> playerBuilds = new ArrayList<>();
        List<String> ripCause = new ArrayList<>();

        for (Player player : ripSequence) {
            Char deadChar = player.getDead().get(rips.get(player));
            rips.put(player, rips.get(player) + 1);

            playerNames.add(deadChar.getPlayer().getName());
            playerLevels.add("lvl " + levelString(deadChar.getLevel()));
            playerBuilds.add(String.valueOf(deadChar.getD2Build()));
            ripCause.add(deadChar.getRipCause());
        }

        return "Dead:\n" + buildBasicString(Lists.newArrayList(playerNames, playerLevels, playerBuilds, ripCause), Set.of(0,2,3));
    }

    private static String levelString(int level) {
        if (level < 10)
            return " " + level;
        return "" + level;
    }

}
