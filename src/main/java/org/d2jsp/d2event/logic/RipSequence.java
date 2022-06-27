package org.d2jsp.d2event.logic;

import com.google.common.collect.Lists;
import org.d2jsp.d2event.model.Player;
import org.d2jsp.d2event.players.Mre;

import java.util.List;

public class RipSequence {
    public static List<Player> create() {
        return Lists.newArrayList(
                new Mre().build()
        );
    }
}