package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {

        HashSet<Integer> outList = new HashSet<>();

        for(int i = 0; i < sourceList.size(); i++) {

            if(sourceList.get(i) % 2 != 0) {

                outList.add(sourceList.get(i));

                outList.add(2 * sourceList.get(i));

            } else {

                int x = sourceList.get(i);

                outList.add(sourceList.get(i));

                do {

                    x = x/2;

                    outList.add(x);

                } while(x >= 1 && x % 2 == 0);

            }

        }

        return outList;

    }
}
