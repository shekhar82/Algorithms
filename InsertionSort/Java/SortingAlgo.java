package com.example.sort;

import java.util.List;

public class SortingAlgo<E> {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {5,2,4,3,6,1};
		array = insertionSort(array);
		for(int elem : array){
			System.out.println(elem);
		}

	}
	
	
	
	public static <T> T[] insertionSort(T[] array){
		int len = array.length;
		for(int j=1;j < len;j++){
			T key  = array[j];
			int i = j-1;
//			while(i > 0 && array[i] < array[j]){
//				
//			}
		}
		return null;
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
