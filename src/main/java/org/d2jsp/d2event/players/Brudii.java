package org.d2jsp.d2event.players;

import com.google.common.collect.Lists;
import org.d2jsp.d2event.model.Char;
import org.d2jsp.d2event.model.D2Build;
import org.d2jsp.d2event.model.Player;

import java.util.List;

public class Brudii extends Player {
    @Override
    public String name() {
        return "brudii";
    }

    @Override
    public List<Char> alive() {
        return Lists.newArrayList(
                Char.builder()
                        .d2Build(D2Build.COLD_SORC)
                        .level(27)
                        .progress("a1 nm")
                        .build()
        );
    }

    @Override
    public List<Char> dead() {
        return Lists.newArrayList(
                Char.builder()
                        .d2Build(D2Build.LIGHT_SORC)
                        .level(56)
                        .ripCause("travi nm beim rushen")
                        .build());
    }

    @Override
    public Player create() {
        return new Brudii();
    }
}
