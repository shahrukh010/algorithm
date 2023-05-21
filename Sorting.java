package com.code.main;

public class Sorting {


	public int sortByHoarsPartition(int[]input,int left, int right){

		int low = left-1;
		int high = right+1;
		int pivot = left;

		while(true){

			do{
				low++;
			}while(input[low] < input[pivot]);
			do{
				high--;
			}while(input[high] > input[pivot]);

			if(low>=high)return high;
			swap(input,low,high);
		}
	}

	private void swap(int[]input,int low,int high){

		int tmp = input[low];
		input[low] = input[high];
		input[high] = tmp;
	}

	public void quickSort(int[]input,int low,int high){

		if(low < high){

			int pivot = sortByHoarsPartition(input,low,high);
			quickSort(input,low,pivot);
			quickSort(input,pivot+1,high);
		}
	}


	public void merge(int[]input,int left, int mid, int right){

		int low = left;
		int high= mid+1;
		int index = left;

		int[] merge = new int[input.length];

		while(low<=mid && high <= right){

			if(input[low] < input[high])
				merge[index++] = input[low++];
			else
				merge[index++] = input[high++];
		}

		for(;low<=mid;low++)
			merge[index++] = input[low];
		for(;high<=right;high++)
			merge[index++] = input[high];


		for(int i = left;i<=right;i++)
			input[i] = merge[i];
	}


	public void mergeSort(int[]input, int low,int high){

		if(low < high){

			int mid = ((low + high)/2);
			mergeSort(input,low,mid);
			mergeSort(input,mid+1,high);
			merge(input,low,mid,high);
		}
	}


}
