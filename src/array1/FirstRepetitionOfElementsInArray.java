package array1;

public class FirstRepetitionOfElementsInArray {
	public static int first(int a[]) {
		for(int i = 0;i<a.length-1;i++) {
			for(int j = i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						return a[i] ;
					}
			}
		}
		return -1 ;
	}
	public static void main(String[] args) {
		int ar[]= {2,4,3,4,6,1};
		int c = first(ar);
		System.out.println("the first repettion is "+c);
	}

}
