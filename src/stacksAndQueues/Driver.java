package stacksAndQueues;

public class Driver {
	public static void main(String[] args) {
		//Testing the stack
		ArrayStack<Integer> arrayStack = new ArrayStack<>();
		arrayStack.push(10);
		arrayStack.push(14);
		arrayStack.push(211);
		System.out.println("Top: "  + arrayStack.top());
		arrayStack.pop();
		System.out.println("Top: " + arrayStack.top());
		
		// test doubly linked list stack
		DLLStack<String> dllTestStack = new DLLStack<>();

		dllTestStack.push("one");
		dllTestStack.push("two");
		dllTestStack.push("three");
		dllTestStack.push("four");
		dllTestStack.push("five");

		System.out.println(dllTestStack.toString());

		dllTestStack.pop();
		dllTestStack.pop();
		System.out.println(dllTestStack.toString());
		
		//Testing DLLQueue
		DLLQueue<Integer> dllQueue = new DLLQueue<>();
		dllQueue.enqueue(1);
		dllQueue.enqueue(2);
		dllQueue.enqueue(3);
		System.out.println("First: " + dllQueue.first());
		dllQueue.dequeue();
		System.out.println("First: " + dllQueue.first());
		
		CallStackValidator tester = new CallStackValidator();

		// should validate

		String callStack = "A calls B B calls C C halts B halts A halts";
		System.out.println(tester.isValid(callStack));

		callStack = "A calls B B calls C C calls D D halts C calls E E halts C halts B halts A halts";
		System.out.println(tester.isValid(callStack));

		callStack = "A calls A A halts A halts";
		System.out.println(tester.isValid(callStack));

		callStack = "main calls functionA functionA calls testMe testMe halts functionA calls runRun runRun halts functionA halts main halts";
		System.out.println(tester.isValid(callStack));

		// Should fail

		callStack = "main calls A A calls B A calls C B halts C halts A halts main halts";
		System.out.println(tester.isValid(callStack));

		callStack = "A calls B B halts";
		System.out.println(tester.isValid(callStack));
		
		
	}
}
