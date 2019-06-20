package java8.demo;

import java.util.stream.IntStream;

public class Java8IntStream {

	// Declarative Style of programming
	public static void main(String[] args) {

		System.out.println(IntStream.range(1, 100).sum());

		// To use multi core
		System.out.println(IntStream.range(1, 100).parallel().sum());

	}

}
