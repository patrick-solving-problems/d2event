package org.d2jsp.d2event.players;

import com.google.common.collect.Lists;
import org.d2jsp.d2event.model.Char;
import org.d2jsp.d2event.model.D2Build;
import org.d2jsp.d2event.model.Player;

import java.util.List;

public class Swayy extends Player {
    @Override
    public String name() {
        return "SwaYy";
    }

    @Override
    public List<Char> alive() {
        return Lists.newArrayList(
                Char.builder()
                        .d2Build(D2Build.SUMMONER_NEC)
                        .level(33)
                        .progress("a2 nm")
                        .build()
        );
    }

    @Override
    public List<Char> dead() {
        return Lists.newArrayList(
                Char.builder()
                        .d2Build(D2Build.WEREBEAR_DRUID)
                        .level(74)
                        .ripCause("a2 stony tomb hell")
                        .build()
        );
    }

    @Override
    public Player create() {
        return new Swayy();
    }
}
