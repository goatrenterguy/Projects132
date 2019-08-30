package arraysVSlinkedLists;

import java.util.Random;

public class LinkedListVsArrayDemo {
	static Random rand = new Random();
	
	public static long before;
	public static long after;
	public static int n = 1;
	public static int[] test = new int[n];

	//Tests array
	public static void testArray() {
		ArrayDS a = new ArrayDS(n);
		//Tests addFirst
		before = System.nanoTime();
		a.addFirst(test);
		after = System.nanoTime();
		System.out.println("addFirst -- Array  = " + (after - before) + " microseconds");
		
		//Tests addLast
		before = System.nanoTime();
		a.addLast(test);
		after = System.nanoTime();
		System.out.println("addLast -- Array  = " + (after - before) + " microseconds");
		
		//Tests getNth
		before = System.nanoTime();
		a.getNth(n/2);
		after = System.nanoTime();
		System.out.println("getNth -- Array  = " + (after - before) + " microseconds");
	}

	// Tests the linked list
	public static void testLinkedList() {
		LinkedListDS<Integer> a = new LinkedListDS<>();
		//Tests addFirst
		before = System.nanoTime();
		for (int i = 0; i < test.length; i++) {
			a.addFirst(test[i]);
		}
		after = System.nanoTime();
		System.out.println("addFirst -- List  = " + (after - before) + " microseconds");
		
		//Test addLast
		before = System.nanoTime();
		for (int i = 0; i < test.length; i++) {
			a.addLast(test[i]);
		}
		after = System.nanoTime();
		System.out.println("addLast -- List  = " + (after - before) + " microseconds");
		
		//Test getNth
		before = System.nanoTime();
		a.getNth(n);
		after = System.nanoTime();
		System.out.println("getNth -- List  = " + (after - before) + " microseconds");
	}

	public static void main(String[] args) {
		// Create array of random variables
		for (int i = 0; i < test.length; i++) {
			test[i] = rand.nextInt();
		}
		testArray();
		testLinkedList();
		System.out.println("RESULTS:\n" + 
				"aArrayDS.addFirst(): linear Time *\n" + 
				"ArrayDS.addLast(): linear Time\n" + 
				"ArrayDS.getNth:	 constant Time\n" + 
				"-----\n" + 
				"LListDS.addFirst(): linear Time\n" + 
				"LList.addLast(): cubic Time\n" + 
				"LList.getNth():	 quadratic Time");
	}
}
