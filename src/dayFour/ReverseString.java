package dayFour;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABCDEF";
		String s1 = "";
		for(int i=s.length()-1;i>=0;i--) {
			s1 += s.charAt(i);
		}
		System.out.println("Original String is: "+s);
		System.out.println("Reversed String is: "+s1);
	}

}
