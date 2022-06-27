package org.d2jsp.d2event.model;

import lombok.Data;

import java.util.List;
import java.util.stream.IntStream;

@Data
public abstract class Player {

    String name;
    List<Char> alive;
    List<Char> dead;

    public abstract String name();

    public abstract List<Char> alive();

    public abstract List<Char> dead();

    public abstract Player create();

    public Player build() {

        Player player = create();
        player.setName(name());
        player.setAlive(alive());
        player.setDead(dead());

        player.getAlive().forEach(aChar -> aChar.setPlayer(player));
        player.getAlive().forEach(aChar -> aChar.setAlive(true));
        player.getDead().forEach(aChar -> aChar.setPlayer(player));
        player.getDead().forEach(aChar -> aChar.setAlive(false));
        return player;
    }

    public Integer calcScore() {
        return alive().stream()
                .flatMapToInt(aChar -> IntStream.of(aChar.score()))
                .sum()
                + dead().stream()
                .flatMapToInt(aChar -> IntStream.of(aChar.score()))
                .sum();
    }

}
