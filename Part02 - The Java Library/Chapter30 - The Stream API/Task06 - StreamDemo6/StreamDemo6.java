import java.util.*;
import java.util.stream.*;

class StreamDemo6 {
	public static void main(String[] args) {
		ArrayList<Double> myList = new ArrayList<>( );
		myList.add(1.1);
		myList.add(3.6);
		myList.add(9.2);
		myList.add(4.7);
		myList.add(12.1);
		myList.add(5.0);
		System.out.print("Original values in myList: ");
		myList.stream().forEach( (a) -> {
			System.out.print(a + " ");
		});
		System.out.println();
		IntStream cStrm = myList.stream().mapToInt((a) -> (int) Math.ceil(a));
		System.out.print("The ceilings of the values in myList: ");
		cStrm.forEach( (a) -> {
			System.out.print(a + " ");
		});
	}
}