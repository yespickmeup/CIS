/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.combo;

import cis.utils.DateType;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mijzcx.synapse.desk.utils.FitIn;

/**
 *
 * @author Ronescape
 */
public class Combo {

    public static List<String> regions() {
        List<String> regions = new ArrayList();
        regions.add("ARMM");
        regions.add("CAR");
        regions.add("NCR");
        regions.add("Region 1");
        regions.add("Region 2");
        regions.add("Region 3");
        regions.add("Region 4A");
        regions.add("Region 4B");
        regions.add("Region 5");
        regions.add("Region 6");
        regions.add("Region 7");
        regions.add("Region 8");
        regions.add("Region 9");
        regions.add("Region 10");
        regions.add("Region 11");
        regions.add("Region 12");
        regions.add("Region 13");
        return regions;
    }

    public static void main(String[] args) {
        List<String> combo = Combo.years();
        for (String s : combo) {
            System.out.println(s);
        }

    }

    public static List<String> years() {
        List<String> years = new ArrayList();
        int year = FitIn.toInt(DateType.y.format(new Date()));
        years.add("" + year);

        for (int i = 0; i < 50; i++) {
            int count = year - i;
            years.add("" + count);
            System.out.println(count);
        }
        return years;
    }

    public static List<String> status() {
        List<String> statuses = new ArrayList();
        statuses.add("Single");
        statuses.add("Married");
        statuses.add("Widow");
        statuses.add("Annulled");
        statuses.add("Divorsed");
        return statuses;
    }
    
    
     
}
