package org.d2jsp.d2event.logic;

import com.google.common.collect.Lists;
import org.d2jsp.d2event.model.Player;

import java.util.ArrayList;
import java.util.List;

import static org.d2jsp.d2event.logic.BasicStringBuilder.buildBasicString;

public class ScoreStringBuilder {
    public static String createScoreString(List<Player> players) {
        List<List<String>> lists = new ArrayList<>();



        return "Dead:\n" + buildBasicString(lists);
    }
}
