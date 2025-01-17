package Programs;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamtoArrayList {
	public static void main(String[] args) {
		Stream<Integer>stream=Stream.of(1,2,3,4,5);
		ArrayList<Integer>arraylist=new ArrayList<Integer>(stream.collect(Collectors.toList()));
		System.out.println(arraylist);
	}

}
