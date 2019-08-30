package stacksAndQueues;

import java.util.Scanner;

public class CallStackValidator {

	public CallStackValidator() {
	}

	public boolean isValid(String in) {
		DLLStack<String> stack = new DLLStack<>();
		Scanner callStack = new Scanner(in);
		String buff = "";
		stack.push(callStack.next());
		while (callStack.hasNext()) {
			buff = callStack.next();
			if (buff.contains("calls") && buff != stack.top()) {
				stack.push(callStack.next());
			} else if (buff.contains("halts") || buff == stack.top()) {
				stack.pop();
			} else if (!buff.equals(stack.top())) {
				callStack.close();
				return false;
			}
		}
		callStack.close();
		return stack.isEmpty();
	}
}
