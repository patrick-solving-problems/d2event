package org.d2jsp.d2event.players;

import com.google.common.collect.Lists;
import org.d2jsp.d2event.model.Char;
import org.d2jsp.d2event.model.D2Build;
import org.d2jsp.d2event.model.Player;

import java.util.List;

public class Multifunktionsdrucker extends Player {
    @Override
    public String name() {
        return "Multifunktionsdrucker";
    }

    @Override
    public List<Char> alive() {
        return Lists.newArrayList(
                Char.builder()
                        .d2Build(D2Build.THROW_BARB)
                        .level(83)
                        .progress("a5 hell")
                        .build()
        );
    }

    @Override
    public List<Char> dead() {
        return Lists.newArrayList(
                Char.builder()
                        .d2Build(D2Build.WW_BARB)
                        .level(50)
                        .ripCause("nm CS bei seis")
                        .build()
        );
    }

    @Override
    public Player create() {
        return new Multifunktionsdrucker();
    }
}
