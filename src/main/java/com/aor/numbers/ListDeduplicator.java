package com.aor.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * An utility class that removes duplicate numbers
 * from a list.
 */
public class ListDeduplicator implements GenericListDeduplicator {
    public List<Integer> list;
    public void helper(List<Integer> list){
        list = Arrays.asList(1,2,4,2,5);
    }


    /**
     * Removes duplicate numbers from a list.
     * @return A list having the same numbers as the original
     * but withou duplicates. The order of the numbers might
     * change.
     */
    public List<Integer> deduplicate(List<Integer> list) {
        ListSorter listSorter = new ListSorter();
        List<Integer> sorted = listSorter.sort(list);
        List<Integer> unique = new ArrayList<>();

        Integer last = null;

        for (Integer number : sorted)
            if (!number.equals(last)) {
                last = number;
                unique.add(number);
            }

        return unique;
    }
}
