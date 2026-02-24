package array1;

public class BinarySearch {
	public static int search(int a[],int target) {

           int left = 0;
           int right = a.length-1;
           while(left<=right) {
        	   int mid =(right+left)/2;
           for(int i =0;i<a.length;i++) {
        	   if(target == a[mid]) {
        		   return mid;
        	   }
        	   else if(target<a[mid]) {
        		   right = mid-1;
        		   }
        	   else {
        		   left = mid +1 ;
        	   }
        	   }
           }
           return -1;
      }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {5,8,21,34,56,59,60,78};
    int target = 78;
    System.out.println(search(a,target));
    
	}

}
