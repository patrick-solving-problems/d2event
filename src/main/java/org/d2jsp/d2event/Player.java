package org.d2jsp.d2event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Player {

    private String name;
    private List<Char> alive;
    private List<Char> dead;

}
