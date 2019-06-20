package java8.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8IntStream {

	// Declarative Style of programming
	public static void main(String[] args) {

		System.out.println(IntStream.range(1, 100).sum());

		// To use multi core
		System.out.println(IntStream.range(1, 100).parallel().sum());

		// removing duplicate from list

		List<Integer> intList = Arrays.asList(1, 2, 3, 3, 4, 5, 6, 7, 5);

		List<Integer> distintIntList = intList.stream().parallel().distinct().collect(Collectors.toList());

		System.out.println(distintIntList);

	}

}
