package array1;//logic is to find the longest pressed keyword which is given as a string .

public class Maxtime {
	public static void Max(String a,int pt[]) {
		int n=pt.length;
		int dt[]=new int[n];
		dt[0]= pt[0];
		for(int i =1;i<n;i++) {
			dt[i] = pt[i]-pt[i-1];
		}
		char ch[]=new char[n];
		for(int j=0;j<n;j++) {
			ch[j]=a.charAt(j);
			}
		int max=dt[0];
		char res = ch[0];
		for(int k =1;k<n;k++) {
			if(max < dt[k]){
				max = dt[k];
				res= ch [k];
				}
			else if(max == dt[k]&&ch[k]>res) {
				res = ch [k];
			}
		}
		System.out.println(res);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="abcd";
		int pt[]= {10,20,40,50};
		Max(a,pt);

	}

}
