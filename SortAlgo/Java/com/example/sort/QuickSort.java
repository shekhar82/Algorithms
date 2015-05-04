package com.example.sort;

import java.util.Comparator;

/**
 * Created by gupsh09 on 03/05/15.
 */
public class QuickSort<T extends Comparable> {

    private T[] inputArray;


    public QuickSort(T[] array) {
        this.inputArray = array;
    }

    public T[] sort()
    {
        int length = this.inputArray.length;

        quickSort(0,length-1);

        return this.inputArray;
    }

    public void quickSort(int startLen, int endLen) {
        if (startLen < endLen)
        {
            int partition = this.partition(startLen, endLen);
            quickSort(startLen, partition-1);
            quickSort(partition + 1, endLen);
        }
    }

    private int partition(int startLen, int endLen)
    {
        T element = this.inputArray[endLen];
        int i = startLen - 1;

        for(int j = startLen;j<=endLen-1;j++)
        {
            if (this.inputArray[j].compareTo(element) <= 0)
            {
                i += 1;
                swap(i,j);
            }
        }
        System.out.println("Partition i value " + i);
        swap(i + 1, endLen);
        return i+1;
    }

    private void swap(int i, int j)
    {
        T temp = this.inputArray[i];
        this.inputArray[i] = this.inputArray[j];
        this.inputArray[j] = temp;
    }


    public static void main(String[] args)
    {
        Integer[] numbers = {5,2,1,3,7,4};

        QuickSort<Integer> quickAlgo = new QuickSort<Integer>(numbers);
        numbers =quickAlgo.sort();

        for(Integer i : numbers)
        {
            System.out.print(i + ",");
        }

    }
}
