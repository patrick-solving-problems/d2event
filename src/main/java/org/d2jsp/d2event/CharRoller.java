package org.d2jsp.d2event;

import org.d2jsp.d2event.logic.PlayerBuilder;
import org.d2jsp.d2event.model.Char;
import org.d2jsp.d2event.model.D2Build;
import org.d2jsp.d2event.model.Player;

import java.util.*;

public class CharRoller {

    public static void main(String[] args) {
        rollChars(3, null);
    }

    private static void rollChars(int rolls, D2Build lastBuild) {

        // Prepare
        final List<Player> players = PlayerBuilder.create();
        final Set<D2Build> usedBuilds = usedBuilds(players);
        System.out.println("Wir rollen " + rolls + " chars B)");

        // Rolling
        List<D2Build> legitRolls = new ArrayList<>();
        while (legitRolls.size() < rolls) {
            D2Build roll = roll();
            if (lastBuild != null && lastBuild.equals(roll)) {
                System.out.println(roll + " hast du vorher schon gespielt");
            } else if (usedBuilds.contains(roll)) {
                System.out.println(roll + " wird von wem anders schon gespielt");
            } else if (legitRolls.contains(roll)) {
                System.out.println(roll + " haben wir schon in der Auswahl");
            } else {
                System.out.println(roll + " kannst du spielen!");
                legitRolls.add(roll);
            }
        }

        // Show results
        System.out.println();
        System.out.println("deine rolls:");
        for (D2Build d2Build : legitRolls) {
            System.out.println(d2Build);
        }
    }

    private static Set<D2Build> usedBuilds(List<Player> players) {
        Set<D2Build> output = new HashSet<>();
        for (Player player : players) {
            for (Char aChar : player.getAlive()) {
                output.add(aChar.getD2Build());
            }
        }
        return output;
    }

    private static D2Build roll() {
        int rnd = new Random().nextInt(D2Build.values().length);
        return D2Build.values()[rnd];
    }

}
