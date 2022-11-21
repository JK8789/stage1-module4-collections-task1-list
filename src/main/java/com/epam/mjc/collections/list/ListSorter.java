package com.epam.mjc.collections.list;

import java.util.*;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int newA = 5 * (Integer.parseInt(a) * Integer.parseInt(a)) + 3;
        int newB = 5 * (Integer.parseInt(b) * Integer.parseInt(b)) + 3;
        if (newA == newB) {
            return Integer.parseInt(a) - Integer.parseInt(b);
        }
        return newA - newB;
    }
}
