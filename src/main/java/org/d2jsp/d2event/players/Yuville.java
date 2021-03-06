package org.d2jsp.d2event.players;

import com.google.common.collect.Lists;
import org.d2jsp.d2event.model.Char;
import org.d2jsp.d2event.model.D2Build;
import org.d2jsp.d2event.model.Player;

import java.util.List;

public class Yuville extends Player {
    @Override
    public String name() {
        return "yuville";
    }

    @Override
    public List<Char> alive() {
        return Lists.newArrayList(
                Char.builder()
                        .d2Build(D2Build.BERSERK_BARB)
                        .level(43)
                        .progress("a3 nm")
                        .build()
        );
    }

    @Override
    public List<Char> dead() {
        return Lists.newArrayList(
                Char.builder()
                        .d2Build(D2Build.COLD_FIRE_BOWA)
                        .level(80)
                        .ripCause("bei rq hell auf der ps5")
                        .build()
        );
    }

    @Override
    public Player create() {
        return new Yuville();
    }
}
