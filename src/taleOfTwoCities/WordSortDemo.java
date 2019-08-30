/** 
 * Project 6
 * 
 * Use Quicksort or Mergesort (your choice) to sort words from a file
 * by word length, from the longest words to the shortest.
 * You may use the implementation given in the book for Mergesort and/or Quicksort.
 * 
 * Write the output of the program to files Lexicographical.txt and TaleOfTwoCitiesLongToShort.txt.
 * Submit four files for grading:
 * 1. the sorted text file
 * 2. the modified WordSorter Demo program
 * 3. your Quicksort or Mergesort implementation, and
 * 4. the StringLengthComparitor.
 * 
 * Included in this week's content are
 * 1. IOExample.java -- an example program showing how read from and write to files Java 
 * 2. SortExample.java -- an example program demonstrating the use of comparators
 * 3. TaleOfTwoCities.txt -- a text file of Charles Dickens' masterpiece opening to the book
 * 4. WordSortDemo driver file to get you started
 *     
 *     Note: Punctuation marks will be stuck to some of the words. That's fine.
 *     
 *  Grading:
 *  3 pt - Your implementation of Mergesort or Quicksort
 *  2 pt - Your implementation of StringLengthComparitor
 *  1 pt - The text file sorted from longest to shorts word
 *  3 pt - Your modified WordSortDemo program putting it all together
 *  1 pt - Proper use of Javadoc comments and coherent code
 */

package taleOfTwoCities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;

public class WordSortDemo {
	// quickSort method
	public static <K> void quickSortInPlace(K[] S, Comparator<K> comp, int a, int b) {
		if (a >= b)
			return;
		int left = a;
		int right = b - 1;
		K pivot = S[b];
		K temp;
		while (left <= right) {
			while (left <= right && comp.compare(S[left], pivot) < 0)
				left++;
			while (left <= right && comp.compare(S[right], pivot) > 0)
				right--;
			if (left <= right) {
				temp = S[left];
				S[left] = S[right];
				S[right] = temp;
				left++;
				right--;
			}
		}
		temp = S[left];
		S[left] = S[b];
		S[b] = temp;
		quickSortInPlace(S, comp, a, left - 1);
		quickSortInPlace(S, comp, left + 1, b);
	}

	public static void main(String[] args) {

		// We want the words of file to be elements in an array, but how many words?
		// Hint: Use ArrayList with its dynamic array as an intermediary.
		ArrayList<String> wordAL = new ArrayList<>();

		// TODO: Get the file TaleOfTwoCities.txt -- word by word -- into the ArrayList
		// Hint: see IOExample for how to read in a file in. Add every word to the
		// ArrayList.
		int n;

		try {
			Scanner fileInput = new Scanner(new File(
					"/Users/benguericke/OneDrive/Documents/CSCI 132/Projects/src/taleOfTwoCities/ospd2.txt"));
			while (fileInput.hasNext()) {
				wordAL.add(fileInput.next());
			}
		} catch (FileNotFoundException exc) {
			System.out.println("There was a problem opening the input file");
			System.exit(0);
		}
		// TODO: change this array to contain the words from the Array List (see
		// ArrayList API)
		String[] wordArray = new String[wordAL.size()];
		wordArray = wordAL.toArray(wordArray);

		// TODO: Make another comparator and instantiate byWordLength (see p 363). Use
		// it instead.
		// Comparator<String> byLexigraphical = Comparator.naturalOrder();
		StringLengthComparator byLength = new StringLengthComparator();

		// TODO: Use Mergesort (book, pp 537-538) or Quicksort (p 553), not Arrays.sort.
		// Sort by length
		// Arrays.sort(wordArray, byLexigraphical);
		// Arrays.sort(wordArray, byLength);

		// TODO: Sort by word length -- longest to shortest -- into a file
		// TaleOfTwoCitiesLongToShort

		quickSortInPlace(wordArray, byLength, 0, wordArray.length - 1);

		try {
			PrintWriter outputFile = new PrintWriter(new FileWriter(
					"/Users/benguericke/OneDrive/Documents/CSCI 132/Projects/src/taleOfTwoCities/ospd2Demo.txt"));

			for (String word : wordArray) {
				outputFile.println(word);
			}

			outputFile.close();
		} catch (IOException exc) {
			System.out.println("There was a problem opening the output file.");
			System.exit(0);
		}

		System.out.println("The deed is done.");
		System.out.println("<end>");
	}
}
