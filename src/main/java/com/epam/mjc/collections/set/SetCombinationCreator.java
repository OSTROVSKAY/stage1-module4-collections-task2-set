package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {

        Set<String> outSet = new HashSet<>();

        Set<String> out1 = new HashSet<>();

        for(String firstSet1 : firstSet) {

            for(String secondSet1 : secondSet) {

                if(firstSet1.equals(secondSet1)) {

                    out1.add(firstSet1);

                }

            }

        }


        int check1 = 0;

        for(String a : out1) {

            check1 = 0;

            for(String thirdSet1 : thirdSet) {

                if(a.equals(thirdSet1)) {

                    check1++;

                }

            }

            if(check1 == 0) {

                outSet.add(a);

            }

        }


        int check2 = 0;

        int check3 = 0;

        for(String thirdSet1 : thirdSet) {

            check2 = 0;

            check3 = 0;

            for(String firstSet1 : firstSet) {

                if(firstSet1.equals(thirdSet1)) {

                    check2 ++;

                }

            }


            for(String secondSet1 : secondSet) {

                if(secondSet1.equals(thirdSet1)) {

                    check3 ++;

                }

            }


            if(check2 == 0 && check3 == 0) {

                outSet.add(thirdSet1);

            }

        }

        return outSet;
    }
}
