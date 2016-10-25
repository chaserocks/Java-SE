package PCLJava;

public class PascalTriangle {
public static void main(String[] args) {
	for(int i=1;i<=6;i++)
	{
		int c=1;
		for(int j=i;j<6;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=1;k++)
		{
			System.out.println(c);
			System.out.print(" ");
		    c=c*(i-k)/k;
		}
		System.out.println();
	}
  }
}


/* Program to print pascal triangle for 10 rows in java */

//public class PascalTriangle {

/*    public static void main(String[] args) {
        int rows = 10;
        for(int i =0;i<rows;i++) {
            int number = 1;
            System.out.format("%"+(rows-i)*2+"s","");
            for(int j=0;j<=i;j++) 
            {
                 System.out.format("%4d",number);
                 number = number * (i - j) / (j + 1);
            System.out.println();
            }
        }
    }
}
*/

/*public static void main(String[] args) {

       int rows = Integer.parseInt(args[0]);
       for(int i =0;i<rows;i++) {
           int number = 1;
           System.out.format("%"+(rows-i)*2+"s","");
           for(int j=0;j<=i;j++) {
                System.out.format("%4d",number);
                number = number * (i - j) / (j + 1);
           }
           System.out.println();
       }
   }
}
*/