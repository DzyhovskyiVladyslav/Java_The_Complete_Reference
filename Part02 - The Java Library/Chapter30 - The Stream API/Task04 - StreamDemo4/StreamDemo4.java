import java.util.*;
import java.util.stream.*;

class StreamDemo4 {
	public static void main(String[] args) {
		ArrayList<Double> myList = new ArrayList<>( );
		myList.add(7.0);
		myList.add(18.0);
		myList.add(10.0);
		myList.add(24.0);
		myList.add(17.0);
		myList.add(5.0);
		Stream<Double> sqrtRootStrm = myList.stream().map((a) -> Math.sqrt(a));
		double productOfSqrRoots = sqrtRootStrm.reduce(1.0, (a, b) -> a * b);
		System.out.println("Product of square roots is " + productOfSqrRoots);
	}
}