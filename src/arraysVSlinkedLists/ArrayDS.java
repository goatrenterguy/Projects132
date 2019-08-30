package arraysVSlinkedLists;

public class ArrayDS {
	public int[] copy;

	public ArrayDS(int length) {
		copy = new int[length];
	}

	public void addFirst(int[] original) {
		for (int i = 0; i < copy.length; i++) {
			original[i] = copy[i];
		}
	}
	public void addLast(int[] original) {
		for (int i = copy.length - 1; i >= 0; i--) {
			original[i] = copy[i];
		}
	}

	public int getNth(int n) {
		return copy[n];	
	}
}
