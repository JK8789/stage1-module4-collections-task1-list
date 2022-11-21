package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> list = new ArrayList<>();

        ListIterator<String> it = sourceList.listIterator(0);
        while (it.hasNext()) {
            if ((it.nextIndex() + 1) % 3 == 0) {
                String nextWord = it.next();
                list.add(nextWord);
                list.add(nextWord);
            } else it.next();
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayListCreator arrayListCreator = new ArrayListCreator();
        List<String> source = Arrays.asList("The", "ArrayList", "class", "has", "many", "useful", "methods");
        System.out.println("Source List: " + source);
        System.out.println("New List: " + arrayListCreator.createArrayList(source));
    }
}
