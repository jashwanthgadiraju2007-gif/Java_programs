package array1;

public class AvgofEvenindex {
	public static int sum(int ar1[]) {
		int sum = 0;
		for(int i=0;i<ar1.length;i++) {
			if(i%2==0) {
			sum += ar1[i];
			}
		}
		return sum ;
		
	}
	public static float avg(int ar1[]) {
		if (ar1.length == 0) { 
			return 0;
		}
		int total = sum(ar1);
		int evencount=(ar1.length + 1)/2;
		
		return (float) total/evencount;
		
	}
   public static void main(String[] args) {
	   int ar[]= {2,4,6,7,8,10};
	   System.out.println(avg(ar));
	   
}
}
