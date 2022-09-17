package mypackage;
public class StringMtd {
	public static void main(String[] args) {
		String s= new String ("ab");
		s=s.intern();
		String s5= "ab";
		 s5= "a"+"b";
		String s1= s+"cd";
		String s2="abcd";
		s1=	s1.intern();
		String s3=new String ("abcd");
		System.out.println(s1==s3);
		s3=	s3.intern();
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		System.out.println(s==s5);
		System.out.println(s.equals(s5));
}
	}
