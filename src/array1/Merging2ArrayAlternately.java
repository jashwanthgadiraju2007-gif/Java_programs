package array1;

public class Merging2ArrayAlternately {

    public static int[] Alternate(int ar1[], int ar2[]) {
        int size = ar1.length + ar2.length;
        int arr[] = new int[size];

        int i = 0, j = 0, k = 0;

        while(i < ar1.length && j < ar2.length) {
            arr[k++] = ar1[i++];  
           arr[k++] = ar2[j++]; 
        }

        return arr;
    }

    public static void main(String[] args) {
        int ar1[] = {2,4,6};
        int ar2[] = {1,3,5};

        int a[] = Alternate(ar1, ar2);

        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}