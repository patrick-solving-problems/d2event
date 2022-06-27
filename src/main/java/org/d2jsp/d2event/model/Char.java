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

}
