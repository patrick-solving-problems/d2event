package org.d2jsp.d2event.logic;

import com.google.common.collect.Lists;
import org.d2jsp.d2event.model.Player;
import org.d2jsp.d2event.players.*;

import java.util.List;

public class PlayerBuilder {

    public static List<Player> create() {
        return Lists.newArrayList(
                new Abulabdah().build(),
                new Brudii().build(),
                new Cardano().build(),
                new Fernsehen().build(),
                new Mre().build(),
                new Multifunktionsdrucker().build(),
                new Ququ().build(),
                new Subbrot().build(),
                new Swayy().build(),
                new Yuville().build()
        );
    }
}
