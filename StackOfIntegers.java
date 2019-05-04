import java.util.Arrays;
import java.util.ArrayList;

public class StackOfIntegers extends ArrayList{
	int[] stack;
	int size;
	ArrayList<String> list = new ArrayList<String>();
	
	StackOfIntegers(){
		size = 16;
		int[] stack = new int[size];
		this.stack = stack;
		}
	
	StackOfIntegers(int size, int[] arr) {
		this.size = size;
		stack = arr;
	}
	
	StackOfIntegers(ArrayList<String> list){
		
	}
	
	public boolean isEmpty() {
		int stackSum = 0;
		for(int i = 0; i < size-1; i++) {
			stackSum = stack[i] + stack[i+1];
		}
		if(stackSum == 0)
			return true;
		else
			return false;
	}
	
	int peek() {
		return stack[size-1];
	}
	
	void push(int x) {
		stack = Arrays.copyOf(stack, size+1);
		stack[size] = x;
	}
	
	int pop() {
		int temp = stack[size-1];
		stack = Arrays.copyOf(stack, size-1);
		return temp;
	}
	
	int getSize() {
		return size;
	}
	
	public ArrayList<String> reverse(ArrayList<String> list){
		
		for(int i = 0; i < list.size(); i++) {
			char[] arr = new char[list.size()];
			arr = list.get(i).toCharArray();
			for(int j = 1; j <= (Math.floor(list.get(i).length() / 2)); j++) {
				char temp = arr[j - 1];
				arr[j - 1] = arr[list.get(i).length() - j];
				arr[list.get(i).length() - j] = temp;
			}
			list.set(i, new String(arr));
	}
		return list;
	
	
}
}
