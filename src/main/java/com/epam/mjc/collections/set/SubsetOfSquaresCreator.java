package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {

        Set<Integer> outList = new HashSet<>();

        for(int i = 0; i < sourceList.size(); i++) {

            int x = sourceList.get(i);

            int result = x * x;

            if(lowerBound <= result && result <= upperBound) {

                outList.add(result);

            }

        }

        return outList;

    }
}
