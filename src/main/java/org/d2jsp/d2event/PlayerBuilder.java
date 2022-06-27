package org.d2jsp.d2event;


import com.google.common.collect.Lists;
import org.d2jsp.d2event.players.Mre;

import java.util.List;

public class PlayerBuilder {

    public static List<Player> create() {
        return Lists.newArrayList(
                new Mre()
        );
    }
}
