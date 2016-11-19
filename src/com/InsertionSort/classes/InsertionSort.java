package com.InsertionSort.classes;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = {12,9,4,99,120,1,3,10};
		insertionSort(num);
	}
	public static void printNumber(int[]num){
		for(int i =0;i<num.length;i++){
			System.out.print(num[i]+", ");
		}
		System.out.println("\n");
	}
	public static void insertionSort(int []arr){
		for (int j= 1;j<arr.length;j++){
			 int key = arr[j];
	            int i = j-1;
	            while ( (i > -1) && ( arr [i] > key ) ) {
	                arr [i+1] = arr [i];
	                i--;
	            }
	            arr[i+1] = key;
	            printNumber(arr);
			}
		
	}
	

	}


