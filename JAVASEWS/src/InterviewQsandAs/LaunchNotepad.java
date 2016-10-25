package InterviewQsandAs;

import java.io.IOException;

public class LaunchNotepad {
	public static void main(String[] args) {
		Runtime rs=Runtime.getRuntime();
		try{
			rs.exec("notepad");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
