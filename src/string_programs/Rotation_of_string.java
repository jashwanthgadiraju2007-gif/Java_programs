package string_programs;

public class Rotation_of_string {
	public static void main(String[] args) {
	String s1="abcdcb";
	String s2 = "dcbabc";
     if(s1.length() == s2.length() && (s1+s1) .contains(s2)) {
    	 System.out.println("true");
     }
     else
    	 System.out.println("false");
	
}
}
