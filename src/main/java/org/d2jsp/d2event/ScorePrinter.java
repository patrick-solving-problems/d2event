package org.d2jsp.d2event;

import org.d2jsp.d2event.logic.*;
import org.d2jsp.d2event.model.Player;

import java.awt.Toolkit;
import java.util.List;

import java.awt.datatransfer.StringSelection;

public class ScorePrinter {

    public static void main(final String[] args) {

        // Vorbereitung
        final List<Player> players = PlayerBuilder.create();
        final List<Player> ripSequence = RipSequence.create();

        // Berechnung
        final String resultString = "[CODE]\n"
                + AliveStringBuilder.createAliveString(players) + "\n"
                + RipStringBuilder.createRipString(ripSequence) + "\n"
                + ScoreStringBuilder.createScoreString(players)
                + "[/CODE]";

        // Console log
        System.out.println(resultString);

        // Und in den Zwischenspeicher
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(
                new StringSelection(resultString), null
        );
    }
}