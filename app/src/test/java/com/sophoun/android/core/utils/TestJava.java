package com.sophoun.android.core.utils;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TestJava {

    // Generic function to partition a list into sublists of size n each in Java
    // (The final list might have less items)
    static<T> List[] partition(List<T> list, int n)
    {
        // get size of the list
        int size = list.size();

        // calculate number of partitions m of size n each
        int m = size / n;
        if (size % n != 0)
            m++;

        // create m empty lists
        List<T>[] partition = new ArrayList[m];
        for (int i = 0; i < m; i++)
            partition[i] = new ArrayList();

        // process each element of the list and add it corresponding
        // list based on its position in the original list
        for (int i = 0; i < size; i++)
        {
            int index = i / n;
            partition[index].add(list.get(i));
        }

        // return the lists
        return partition;
    }

    @Test
    void testPartitionFunction() {
        // source list
        List<String> list = new ArrayList<>(
                Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M"));

        // size of each partition
        int size = 5;

        // partition a list into partitions of given size
        List<String>[] partition = partition(list, size);

        // print the partitions
        for (int i = 0; i < partition.length; i++)
            System.out.println("Partition " + (i + 1) + ": " + partition[i]);

    }
}
