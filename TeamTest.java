package com.ionos.ccdev.genesysnotificationservice;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.*;

public class TeamTest {

    @Disabled
    @Test
    public void testTeam() {
        List<String> arr = Arrays.asList("a1", "a2", "a3", "a4",
                "b1", "b2", "b3", "b4", "c1", "c2", "c3", "c4",
                "d1", "d2", "d3", "d4", "e1", "e2", "e3", "e4");
        Map<Integer,String> teamMap = new HashMap<>(){{
            put(1,"meet 1 - and game link - ");
            put(2,"meet 2 - and game link - ");
            put(3,"meet 3 - and game link - ");
            put(4,"meet 4 - and game link - ");
            put(5,"meet 5 - and game link - ");
        }};
        Collections.shuffle(arr);
        int teams = 5;
        int teamSize = 4;
        if (arr.size() >= teams * teamSize) {
            for (int i = 0; (i < arr.size()) && (i < teams * teamSize); i += teamSize) {
                int key = i / teamSize + 1;
                System.out.println("Team " + key + " - with " + teamMap.get(key));
                for (int j = 0; j < teamSize; j++) {
                    System.out.print(arr.get(i + j) + "    ");
                }
                System.out.println("\n\n");
            }
        }
        System.out.println("Have fun!");
    }
}
