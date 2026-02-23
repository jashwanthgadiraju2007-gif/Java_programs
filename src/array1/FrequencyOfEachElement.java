package array1;

public class FrequencyOfEachElement {
	public static void freq(int a[]) {
		int i = 0;
		while( i < a.length) {

		int count =1;
		int target = a[i];

			for(int j = i +1;j<a.length;j++) {
				if( a[j] == target) {
					count ++;
					}
			}
				System.out.println("frequency of "+target+" is "+count);
			
				i++;
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {2,6,8,9,2,};
       freq(a);
       
	}

}
