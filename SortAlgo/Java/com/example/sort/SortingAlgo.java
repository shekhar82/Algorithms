package com.example.sort;


import java.util.Comparator;

public class SortingAlgo<E> {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] array = {5,2,4,3,6,1};
		String[] names = {"Shekhar","Ashish","Ashutosh"};
		array = insertionSort(array);
		names = insertionSort(names);
		for(int elem : array){
			System.out.println(elem);
		}
		for(String str : names){
			System.out.println(str);
		}

	}




	
	public static <T extends Comparable> T[] insertionSort(T[] array){
		int len = array.length;
		for(int j=1;j < len;j++){
			T key  = array[j];
			int i = j-1;
			while(i >=0 && array[i].compareTo(key) > 0){
				array[i+1] = array[i];
				i -= 1;
			}
			array[i+1] = key;
		}
		return array;
	}
	
	public static int[] insertionSort(int[] array){
		int len = array.length;
		for(int j=1;j < len;j++){
			int key = array[j];
			int i = j-1;
			while(i >=0 && array[i] > key){
				array[i+1] = array[i];
				i = i-1;
			}
			array[i+1] = key;
		}
		
		return array;
	}

}
