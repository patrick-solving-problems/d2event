package org.d2jsp.d2event.players;

import com.google.common.collect.Lists;
import org.d2jsp.d2event.model.Char;
import org.d2jsp.d2event.model.D2Build;
import org.d2jsp.d2event.model.Player;

import java.util.List;

public class Fernsehen extends Player {
    @Override
    public String name() {
        return "fernsehen123";
    }

    @Override
    public List<Char> alive() {
        return Lists.newArrayList(
                Char.builder()
                        .d2Build(D2Build.FIRE_SORC)
                        .level(87)
                        .progress("story durch")
                        .build()
        );
    }

    @Override
    public List<Char> dead() {
        return Lists.newArrayList(
                Char.builder()
                        .d2Build(D2Build.FIRE_SORC)
                        .level(73)
                        .ripCause("bei baal nm")
                        .build(),
                Char.builder()
                        .d2Build(D2Build.GOLEM_PSN_DAGGER_CE_NEC)
                        .level(54)
                        .ripCause("im flameriver nm")
                        .build()
        );
    }

    @Override
    public Player create() {
        return new Fernsehen();
    }
}
