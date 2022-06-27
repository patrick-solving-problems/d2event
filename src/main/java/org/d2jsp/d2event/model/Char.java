package org.d2jsp.d2event.model;

import lombok.*;

@EqualsAndHashCode(exclude = "player")
@ToString(exclude = "player")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Char {

    private Player player;
    private D2Build d2Build;
    private int level;
    private boolean alive;
    private String progress;
    private String ripCause;

    public Integer score() {
        return (int) Math.floor(Math.pow(1.1, level));
    }

    public String printScoreAndLvl() {
        return score() + " (lvl " + level + ")";
    }
}
