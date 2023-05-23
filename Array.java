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
	
	

}
