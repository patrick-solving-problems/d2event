package org.d2jsp.d2event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Char {

    private D2Build d2Build;
    private int level;
    private boolean alive;

}
