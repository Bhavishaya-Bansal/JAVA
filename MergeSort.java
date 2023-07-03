import java.util.*;

public class MergeSort{
	public static void main(String args[]){
		int arr[]= {5, 4, 2, 3, 1};
		arr= sort(arr);
		System.out.println(Arrays.toString(arr));

		// if we do..
		// int ans[] = sort(arr);
		// System.out.println(Arrays.toString(arr));  
		// we will get the same array without as our array is not being modified
	}

	public static int[] sort(int arr[]){
		if(arr.length== 1){
			return arr; // when length of our element is equal to 1 just return the arr itself
		}
		int mid= arr.length/2;

		// Copy Of Range -> copies the specified range in the new array
		// by using COPY OF RANGE method it's creating new objects everytime rather than just modifying the original array
		int left[]= sort(Arrays.copyOfRange(arr, 0, mid)); // every time making a copy of array(new array) for left half by Copy Of Range method
		int right[]= sort(Arrays.copyOfRange(arr, mid, arr.length)); // same ways amking new array for right half by same method

		return merge(left, right);
	}

	public static int[] merge(int[] first, int[] second) { // takes first and second half and merges them in sorted manner
		int mix[]= new int[first.length + second.length];

		int i= 0; // pointer for first array
		int j= 0; // pointer for second array
		int k= 0; // pointer for new array(mix)

		while(i< first.length && j< second.length){
			if(first[i]< second[j]){
				mix[k]= first[i];
				i++;
			}
			else{
				mix[k]= second[j];
				j++;
			}
			k++;
		}

		// It may be possible that one of the arrays is not completed.. 
		// ex: first= {3, 5, 6, 9, 12, 54};
		//    second= {1, 4, 7, 10}; 
		// here our 'second' array will get completed but still our 'first' array would have some elements left.. therefore we would add all remaining elements as it is
		while(i< first.length){
			mix[k]= first[i];
			i++;
			k++;
		}
		
		while(j< second.length){
			mix[k]= second[j];
			j++;
			k++;
		}
		// only one of these loops would be true therefore only one of them would execute

		return mix;
	}
}