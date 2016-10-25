package Aug08;

//5. Write a program to print perfect number which are square of a number as well cube between 0 to 1000. 
//EX: 1, 64, 729 which is cube of 4 and square of 8 for 64.


public class PerfectSquareandCube {
	
    public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        int num;
        
        int starting_number = 1;
        
                int ending_number = 1000;
        
                System.out.println("Perfect Numbers between "+starting_number+ " and "+ending_number);
        
                for (int i = starting_number; i <= ending_number; i++) 
                {
                    int number = i;
                    int sqrt = (int) Math.sqrt(number);
//                    int cube =  (int) Math.pow(i,1);
                    if (sqrt * sqrt == number) // & (cube * cube * cube == number))
                    {
                        System.out.println(number+ " = "+sqrt+"*"+sqrt);
                    }
//                    System.out.println(number+ " = "+ cube+ " * "+ cube+ " * " + cube);                  
                  }
                }
   /* PerfectSquareandCube.cube();
    	public static void cube(int num){
	num=0;
	for (int j =1 ; j <= 10; j++)
    {
		int cube = num*num*num;
    }
  }*/
}     
      /*  System.out.print("Enter an integer number: ");
        num=sc.nextInt();
     
        for (int i=0;i<=1000;i++)  	
        {
        	System.out.println("Square of "+ num + " is: "+ Math.pow(num, 2));	
        }
        
      
        System.out.println("Square Root of "+ num + " is: "+ Math.sqrt(num));
    }
} */
