package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFiltererTest {
    public PositiveFilter posfilter = new PositiveFilter();
    public DivisibleByFilter divfilter = new DivisibleByFilter(2);
    public List<Integer> list;

    @BeforeEach
    public void helper(List<Integer> list) {
        this.list = Arrays.asList(1, 2, 4, 2, 5, -1);
    }

    @Test
    public void positivefilter() {
        List<Integer> expected = Arrays.asList(1, 2, 4, 2, 5);
        List<Integer> filtered = new ArrayList<>();
        for (Integer i : this.list) {
            if (this.posfilter.accept(i)) {
                filtered.add(i);
            }
        }
        Assertions.assertEquals(expected, filtered);
    }

    @Test
    public void divfilter() {
        List<Integer> expected = Arrays.asList(2, 4, 2);
        ListFilterer qualquermerda = new ListFilterer(divfilter);
        qualquermerda.filter(list);
        Assertions.assertEquals(expected, qualquermerda);
    }
}

