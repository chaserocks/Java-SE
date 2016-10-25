package InterviewQsandAs;

public class PascalTriangle {
public static void main(String[] args) {
	for(int i=1;i<=6;i++)
	{
		int c=1;
		for(int j=i;j<6;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print(" ");
     		System.out.print(c);
		    c=c*(i-k)/k;
		}
		System.out.println();
	}
	
	/*for(int i=1;i<=5;i++){                                   //o/P:              1
		for(int j=5;j>i;j--){                                                    1   1
		System.out.print(" ");                                                 1   1   1
		}                                                                    1   1   1   1
		for(int k=1;k<=i*2-1;k++){                                         1   1   1   1   1
			if(k%2==0){
				System.out.print(" ");
			}else{
				System.out.print("1");
			}
		}
		System.out.println();
	}*/
	
	
	
	
	
	
	
  }
}
