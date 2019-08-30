package stacksAndQueues;

public class DLLQueue<E> implements Queue<E> {
	private DoublyLinkedList<E> list = new DoublyLinkedList<>();
	
	public DLLQueue() {
		
	}
	@Override
	public int size() {
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public void enqueue(E e) {
		list.addLast(e);
	}

	@Override
	public E first() {
		return list.first();
	}

	@Override
	public E dequeue() {
		return list.removeFirst();
	}

}
