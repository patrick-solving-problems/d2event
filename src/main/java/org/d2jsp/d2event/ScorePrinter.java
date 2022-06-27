package org.d2jsp.d2event;

import java.awt.Toolkit;
import java.util.List;

import java.awt.datatransfer.StringSelection;

public class ScorePrinter {

    public static void main(final String[] args) {

        List<Player> players = PlayerBuilder.create();

        final String scoreString = createScoreString();

        System.out.println(scoreString);

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(
                new StringSelection(scoreString), null
        );
    }

    private static String createScoreString() {
        return "[CODE]";
    }
}