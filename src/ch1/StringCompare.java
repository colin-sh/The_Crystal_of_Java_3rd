package ch1;

public class StringCompare {
	public static void main(String[] args){
		String s1 = "aaa";
		String s2 = "aaa";
		String s3 = new String("aaa");
		String s4 = new String("aaa");

		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		s1 = "aab";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s5 = "aab";
		String s6 = "aaa";
		
		System.out.println(s1==s5);
		System.out.println(s1.equals(s5));
		
		System.out.println(s2==s6);
		System.out.println(s2.equals(s6));
		
		
		//System.out.println(s3 == s4);
		//System.out.println(s1==s3);
		//System.out.println(s1.equals(s3));
		//System.out.println(s3.equals(s4));
		//System.out.println(s1.equals(s2));
		//System.out.println(s1 == s3);
		//System.out.println(s3 == s4);
	}
}
