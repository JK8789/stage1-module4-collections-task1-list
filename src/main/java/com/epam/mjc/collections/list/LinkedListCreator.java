package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> newList = new LinkedList<>();
        sourceList.forEach((element) ->
        {
            if (element % 2 != 0) {
                newList.addFirst(element);
            } else {
                newList.addLast(element);
            }
        });
        return newList;
    }
}
