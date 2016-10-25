package PCLJava;

public class DecimalFormat {
	public static void main(String[] args) {
		String num=String.format("%.2f",23.59004);
		System.out.println(num);
		// another way
		DecimalFormat df=new DecimalFormat("#.00");
		num=df.format(22.0/7.0);
		System.out.println(num);
	}

}
