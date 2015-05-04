package com.example.sort;

/**
 * Created by gupsh09 on 04/05/15.
 */
public class CountSort  {

    private int[] inputArray;
    private int maxNum = 0;

    public CountSort(int[] array, int maxNum)
    {
        this.inputArray = array;

        this.maxNum = maxNum;
    }


    public int[] sort()
    {
        int[] countArray = new int[maxNum + 1];
        for (int i=0;i<countArray.length;i++)
            countArray[i] = 0;

        for(int i=0;i<this.inputArray.length;i++)
        {
            countArray[this.inputArray[i]]++;
        }

        for(int i=1;i<countArray.length;i++)
            countArray[i] = countArray[i] + countArray[i-1];


        int[] sorted = new int[this.inputArray.length];

        for(int i=0;i<this.inputArray.length;i++)
        {
            sorted[countArray[this.inputArray[i]]-1] = this.inputArray[i];
            countArray[this.inputArray[i]] -= 1;
        }

        return  sorted;
    }

    public static void main(String[] args)
    {
        int[] array = {2,5,3,0,2,3,0,3};

        CountSort cSort = new CountSort(array,5);

        int[] sorted = cSort.sort();

        for(int i: sorted)
            System.out.print(i + ",");

    }
}
