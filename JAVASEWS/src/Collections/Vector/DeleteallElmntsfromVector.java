package Collections.Vector;

import java.util.Vector;

// How to Delete all Elments from a Vector?
public class DeleteallElmntsfromVector {
	public static void main(String[] args) {
		Vector<String> vct=new Vector<String>();
		// Adding Elements to the end
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Random");
		System.out.println("Actual Vector:"+vct);
		vct.clear();
		System.out.println("After Deleting of elements in:"+vct);
	}
}
