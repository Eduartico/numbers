package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListFiltererTest {
    public List<Integer> list;
    @BeforeEach
    public void helper(List<Integer> list){
        list = Arrays.asList(1,2,4,2,5);
    }
    @Test
    public void filter() {



        Assertions.assertEquals(14, sum);
    }
}
