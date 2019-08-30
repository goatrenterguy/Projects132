package stacksAndQueues;

public class DLLStack<E> implements Stack<E> {
	private DoublyLinkedList<E> list = new DoublyLinkedList<>();

	public DLLStack() {
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	public void push(E e) {
		list.addFirst(e);
	}

	public E top() {
		return list.first();
	}

	public E pop() {
		return list.removeFirst();
	}
	@Override
	public String toString() {
		return list.toString();
	}
}
