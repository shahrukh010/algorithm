package com.code.main;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

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

	private Consumer<int[]>rotate = (input)->{

		int tmp = input[0];
		for(int index = 0; index < input.length-1; index++){

			input[index] = input[index+1];
		}
		input[input.length-1] = tmp;

	};

	public int[] rotateByD(int[] input,int d){

		for(int index = 0; index < d; index++){

			rotate.accept(input);
		}
		return input;
	}

	public Function<int[],int[]>leader = (input)->{

		int current_leader = input[input.length-1];
		List<Integer> res = new ArrayList<>();
		res.add(current_leader);

		for(int index = input.length-2; index>=0; index--){
			
			if(input[index] > current_leader){

				current_leader = input[index];
				res.add(current_leader);
			}
		}

		int[] result = res.stream().mapToInt(Integer::intValue).toArray();
		return result;
	};


	public Function<int[],Integer>maxDiff = (input)->{

		int max_diff = input[1] - input[0];
		int min = input[0];

		for(int index = 1; index < input.length;index++){

			max_diff = Math.max(input[index] - min,max_diff);
			min = Math.min(min,input[index]);
		}
		return max_diff;
	};

	public Consumer<int[]> frequence = (input)->{

		java.util.Map<Integer,Integer> result = new java.util.HashMap<>();
		Integer count = 1;
		
		for(int index = 0; index < input.length; index++){

			//get()method return null 
			//getOrDefault()method return if present key value is not 0
			result.put(input[index],result.getOrDefault(input[index],0)+1);
		}

		for(Map.Entry<Integer,Integer> m : result.entrySet()){
			System.out.println(m.getKey()+":"+m.getValue());
		}
	};


    public Function<int[],Integer> maxProfit = (input)->{

        int profit = 0;
        for(int index = 1; index < input.length-1; index++){

            if(input[index] > input[index-1])
                profit +=input[index] - input[index-1];
        }
        return profit;
    };

    public Function<int[],Integer>maxWater = (input)->{

        int result = 0;

        for(int index = 1; index < input.length;index++){

            int leftMax = input[index];
        for(int lindex = index; lindex >=0; lindex--){

             leftMax = Math.max(input[lindex],leftMax);
        }
           int rightMax = input[index];

           for(int rindex = index+1;rindex<input.length;rindex++)
               rightMax = Math.max(rightMax,input[rindex]);

         result +=(Math.min(leftMax,rightMax))- input[index];

      }
      return result;

    };

    public Function<int[],Integer> consecutive = (input)->{

        int result = 0;
        int count = 0;

        for(int index = 0 ; index < input.length; index++){

            if(input[index] !=0){
                count++;
                result = Math.max(result,count);
            }
            else
                count = 0;

        }
        return result;
    };



	private void swap(int[]input,int low,int high){

			int tmp = input[low];
			input[low] = input[high];
			input[high] = tmp;
	}

	

}
