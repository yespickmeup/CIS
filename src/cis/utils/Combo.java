/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.utils;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ronescape
 */
public class Combo {

    public static List<String> citizenship() {
        List<String> cit = new ArrayList();
        return cit;
    }

    public static List<String> year_levels() {
        List<String> levels = new ArrayList();
        levels.add("First Year");
        levels.add("Second Year");
        levels.add("Third Year");
        levels.add("Fourth Year");
        levels.add("Fifth Year");
        return levels;
    }

    public static List<String> periods(String period) {
        List<String> periods = new ArrayList();

        if (period.equalsIgnoreCase("Semester")) {
            periods.add("First Semester");
            periods.add("Second Semester");
            periods.add("Summer Class");

        }
        if (period.equalsIgnoreCase("Trimester")) {
            periods.add("First Trimester");
            periods.add("Second Trimester");
            periods.add("Third Trimester");
            periods.add("Summer Class");
        }
        if (period.equalsIgnoreCase("Quarter")) {
            periods.add("First Quarter");
            periods.add("Second Quarter");
            periods.add("Third Quarter");
            periods.add("Fourth Quarter");
            periods.add("Summer Class");
        }
        if (period.equalsIgnoreCase("Whole")) {
            periods.add("First Semester");
            periods.add("Summer Class");
        }
        return periods;
    }
}
