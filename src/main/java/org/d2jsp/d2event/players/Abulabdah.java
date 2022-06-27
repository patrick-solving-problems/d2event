package org.d2jsp.d2event.players;

import com.google.common.collect.Lists;
import org.d2jsp.d2event.model.Char;
import org.d2jsp.d2event.model.D2Build;
import org.d2jsp.d2event.model.Player;

import java.util.List;

public class Abulabdah extends Player {
    @Override
    public String name() {
        return "AbulAbdah";
    }

    @Override
    public List<Char> alive() {
        return Lists.newArrayList(
                Char.builder()
                        .d2Build(D2Build.BLADEFURY_ASSA)
                        .level(1)
                        .progress("a1 hell")
                        .build()
        );
    }

    @Override
    public List<Char> dead() {
        return Lists.newArrayList();
    }

    @Override
    public Player create() {
        return new Abulabdah();
    }
}
