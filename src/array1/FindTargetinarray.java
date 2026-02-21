package array1;

public class FindTargetinarray {
	public static int find(int a[],int target ) {
		for(int i = 0;i<a.length;i++) {
			if(target == a[i]) {
				return i;
			}
		}
		return -1 ;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {5,3,6,8,4,3};
       System.out.println(find(a,6));
       System.out.println(find(a,3));
	}

}
