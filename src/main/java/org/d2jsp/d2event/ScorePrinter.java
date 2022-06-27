package org.d2jsp.d2event;

import org.d2jsp.d2event.logic.*;
import org.d2jsp.d2event.model.Player;

import java.awt.Toolkit;
import java.util.List;

import java.awt.datatransfer.StringSelection;

public class ScorePrinter {

    public static void main(final String[] args) {

        final List<Player> players = PlayerBuilder.create();
        final List<Player> ripSequence = RipSequence.create();

        final String resultString = "[CODE]\n"
                + AliveStringBuilder.createAliveString(players) + "\n\n"
                + RipStringBuilder.createRipString(ripSequence) + "\n\n"
                + ScoreStringBuilder.createScoreString(players)
                + "\n[/CODE]";

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(
                new StringSelection(resultString), null
        );
    }
}