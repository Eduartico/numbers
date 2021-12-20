package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
/*
public class ListFiltererTest {
    private List<Integer> list;
    @BeforeEach
    public void helper(){
        list = Arrays.asList(1,2,4,-2,7,9,-26,27,30,55,0,-1,-10,3);

    }

    @Test
    public void ListFilterer(){
        List<Integer> expected = Arrays.asList(1,2,4,-2,7,9,-26,27,30,55,0,-1,-10,3);

        GenericListFilter stubFilter = Mockito.mock(GenericListFilter.class);
        Mockito.when(stubFilter.accept(Mockito.anyInt())).thenReturn(true);

        ListFilterer filterer = new ListFilterer(stubFilter);
        List<Integer> nothingFilter = filterer.filter(list);

        Assertions.assertEquals(expected, nothingFilter);

    }

    @Test
    public void PositiveFilter(){
        List<Integer> expected = Arrays.asList(1,2,4,7,9,27,30,55,3);

        ListFilterer filterer = new ListFilterer(new PositiveFilter());
        List<Integer> positives = filterer.filter(list);

        Assertions.assertEquals(expected, positives);

    }

    @Test
    public void DivisibleByFilter(){
        List<Integer> expected = Arrays.asList(9,27,30,0,3);

        ListFilterer filterer = new ListFilterer(new DivisibleByFilter(3));
        List<Integer> divisibleByThree = filterer.filter(list);

        Assertions.assertEquals(expected, divisibleByThree);

    }
}
*/