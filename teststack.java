import java.util.ArrayList;
public class teststack {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Please enter 5 str: ");
		String str0 = input.next();
		String str1 = input.next();
		String str2 = input.next();
		String str3 = input.next();
		String str4 = input.next();
		list.add(str0);
		list.add(str1);
		list.add(str2);
		list.add(str3);
		list.add(str4);
		
		
		StackOfIntegers s1 = new StackOfIntegers(list);
		
		System.out.println(s1.reverse(list).toString());
	
}
}
