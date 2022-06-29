package org.d2jsp.d2event.players;

import com.google.common.collect.Lists;
import org.d2jsp.d2event.model.Char;
import org.d2jsp.d2event.model.D2Build;
import org.d2jsp.d2event.model.Player;

import java.util.List;

public class Ququ extends Player {
    @Override
    public String name() {
        return "QuQu";
    }

    @Override
    public List<Char> alive() {
        return Lists.newArrayList(
                Char.builder()
                        .d2Build(D2Build.PSN_JAVA)
                        .level(79)
                        .progress("a4 hell")
                        .build()
        );
    }

    @Override
    public List<Char> dead() {
        return Lists.newArrayList();
    }

    @Override
    public Player create() {
        return new Ququ();
    }
}
