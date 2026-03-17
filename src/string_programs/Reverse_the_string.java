package string_programs;

public class Reverse_the_string {
	public static void reverse(String s1) { //m1
		for(int i = s1.length()-1;i>=0;i--) {
			System.out.print(s1.charAt(i));
}
		System.out.println();
	}
	public static void reverse1(String s2) { //m2
		char arr[]=s2.toCharArray();
		int j =arr.length-1;
		for(int i =0 ;i<arr.length;i++) {
			if(i<j) {
				char temp = arr[i];
				arr[i]=arr[j];
				arr[j]= temp ;
				j--;
			}
		}
		String result = new String(arr);
		System.out.println(result);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s1 = "jashwanth";
      reverse(s1);
      reverse1(s1);
	}

}
