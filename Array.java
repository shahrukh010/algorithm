package com.code.main;
import java.util.function.Function;
import java.util.function.Predicate;

public class Array{


	public Function<int[],Integer> largestElement = (input)->{

		int result = input[0];
		for(int index = 1; index < input.length; index++){

			if(result < input[index])
				result = input[index];
		}
		return result;

	};


	public Function<int[],Integer>secondLarge = (input)->{


		int result = -1;

		int largest = largestElement.apply(input);

		int res = -1;

		for(int index = 0; index < input.length;index++){

			if(input[index] !=largest){

				if(res == -1)
					res = index;
				else if(input[res] < input[index])
					res = index;
			}
		}
		return res != -1 ?input[res] : -1;
	};

	//optimize solution
	public Function<int[],Integer>secondLargest = (input)->{

		int lg = 0;
		int res= -1;

		for(int index = 1; index < input.length; index++){

			if(input[index] > input[lg]){
				res = lg;
				lg = index;
			}
			
			else if(input[index] !=input[lg]){

				if(res == -1 || input[index] > input[res])
					res = index;
			}
		}
		return res != -1 ? input[res] : -1;
	};


	public Predicate<int[]>isSorted = (input)->{

		for(int index = 0; index < input.length-1; index++){

			if(input[index+1] < input[index])return false;
		}
		return true;
	};

	public Function<int[],int[]> reverseArray = (input)->{

		int low = 0;
		int high = input.length-1;

		while(low < high){

			swap(input,low,high);
			low++;
			high--;
		}
		return input;
	};

	public Function<int[],int[]>removeDuplicate = (input)->{

		int prev = 0;
		int next = 1;

		while(next < input.length){

			if(input[prev] !=input[next]){

				input[prev +1] = input[next];
				prev++;
			}
			next++;
		}
		return java.util.Arrays.copyOfRange(input,0,prev+1);
	};

	public Function<int[],int[]>moveZero = (input)->{

		int i =0;
		int j = 0;

		while(j < input.length){

			if(input[j] !=0){
				swap(input,i,j);
				i++;
			}
			j++;
		}
		return input;
	};

	private void swap(int[]input,int low,int high){

			int tmp = input[low];
			input[low] = input[high];
			input[high] = tmp;
	}

	

}
