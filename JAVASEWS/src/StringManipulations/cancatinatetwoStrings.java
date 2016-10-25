package StringManipulations;


//WAP to print "WatBottleer" from the 2 individual strings str1="Water" and str2="Bottle"
public class cancatinatetwoStrings {

	public static void main(String[] args) {
		String str1="Water";
		String str2="Bottle";
		System.out.println(str1.length());
		String res = str2.replaceFirst("",str1.substring(0,3));
		System.out.println(res);
		
		String res1=str1.substring(str1.length()-2,str1.length());
		System.out.println(res1);
		
		System.out.println(str2.replaceFirst("",str1.substring(0,3)) + str1.substring(str1.length()-2,str1.length()));
	}
}
