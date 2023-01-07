package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class FilterTest {
    List<Integer> list = new ArrayList<>();

    @Test
    void filterOut() {
        list.add(12);
        list.add(9);
        list.add(11);
        list.add(7);
        list.add(4);
        list.add(14);
        Filter filter = new Filter(10);
        List<Integer> filteredList = filter.filterOut(list);
        Assertions.assertEquals(3, filteredList.size());
    }
}