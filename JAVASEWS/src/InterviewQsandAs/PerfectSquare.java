package InterviewQsandAs;

import java.util.Scanner;

public class PerfectSquare {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=in.nextInt();
		int sq=0;
		for(int i=1;i<(num/2);i++)
		{
			if((i*i)==num)
			{
				sq=i;
				break;
			}
		}
		if(sq==0)
		{
			System.out.println("Not A Perfect square");
		}
		else
		{
			System.out.println(num+ "is a perfect Square");
		}
	}

}
