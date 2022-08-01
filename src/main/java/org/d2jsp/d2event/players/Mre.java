package org.d2jsp.d2event.players;

import com.google.common.collect.Lists;
import org.d2jsp.d2event.model.Char;
import org.d2jsp.d2event.model.D2Build;
import org.d2jsp.d2event.model.Player;

import java.util.List;

public class Mre extends Player {

    @Override
    public Player create() {
        return new Mre();
    }

    @Override
    public String name() {
        return "mRe";
    }

    @Override
    public List<Char> alive() {
        return Lists.newArrayList(
                Char.builder()
                        .d2Build(D2Build.SUMMONER_DRUID)
                        .level(87)
                        .progress("story durch")
                        .build()
        );
    }

    @Override
    public List<Char> dead() {
        return Lists.newArrayList(
                Char.builder()
                        .d2Build(D2Build.PSN_JAVA)
                        .level(25)
                        .ripCause("norm CS")
                        .build());
    }
}
