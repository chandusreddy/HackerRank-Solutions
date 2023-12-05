package com.chandu.HackerRank.Arrays;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.stream.Stream;

public class ArraysMain {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int arrCount = Integer.parseInt(bufferReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());

		// Calling Reverse_Array 
		List<Integer> res = Arrays_Reverse.reverseArray(arr);

		bufferWriter.write(res.stream().map(Object::toString).collect(joining(" ")) + "\n");

		bufferReader.close();
		bufferWriter.close();
	}

}
