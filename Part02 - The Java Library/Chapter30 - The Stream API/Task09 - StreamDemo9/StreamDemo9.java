import java.util.*;
import java.util.stream.*;

class StreamDemo9 {
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>( );
		myList.add("Alpha");
		myList.add("Beta");
		myList.add("Gamma");
		myList.add("Delta");
		myList.add("Phi");
		myList.add("Omega");
		Stream<String> myStream = myList.stream();
		Spliterator<String> splitItr = myStream.spliterator();
		while(splitItr.tryAdvance((n) -> System.out.println(n)));
	}
}