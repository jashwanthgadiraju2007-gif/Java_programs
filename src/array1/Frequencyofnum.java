package array1;

public class Frequencyofnum {
	    public static int frequency(int arr[], int target) {
	        int count = 0;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == target) {
	                count++;
	            }
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        int arr[] = {2, 5, 2, 7, 2, 9};
	        int target = 2;

	        int result = frequency(arr, target);
	        System.out.println("Frequency = " + result);
	    }
	}

