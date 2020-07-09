package lists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class ListsDemo {

	public static void main(String[] args) {
		// Lists
		// ArrayList
		List<String> myArrayList=new ArrayList<String>();
		myArrayList.add("Hugo");
		myArrayList.add("Paco");
		myArrayList.add("Luis");
		System.out.println("Printing from ArrayList\n");
		for (String str:myArrayList) {
			System.out.println(str);
		}
		System.out.println();
		// LinkedList
		List<String> myLinkedList= new LinkedList<String>();
		myLinkedList.add("Hugo");
		myLinkedList.add("Paco");
		myLinkedList.add("Luis");
		System.out.println("Printing from LinkedList\n");
		for (String str:myLinkedList) {
			System.out.println(str);
		}
		System.out.println();
		// Vector
		List<String> myVector=new Vector<String>();
		myVector.add("Hugo");
		myVector.add("Paco");
		myVector.add("Luis");
		System.out.println("Printing from Vector\n");
		for (String str:myLinkedList) {
			System.out.println(str);
		}
		System.out.println();
		// Stack
		List<String> myStack = new Stack<String>(); 
		myStack.add("Hugo");
		myStack.add("Paco");
		myStack.add("Luis");
		System.out.println("Printing from Stack\n");
		for (String str:myStack) {
			System.out.println(str);
		}
		System.out.println();
		// Sets
		// HashSet - Unordered 
		Set<String> myHashSet = new HashSet<String>();
		myHashSet.add("Hugo");
		myHashSet.add("Paco");
		myHashSet.add("Luis");
		System.out.println("Printing from HashSet\n");
		for (String str:myHashSet) {
			System.out.println(str);
		}
		System.out.println();
		// TreeSet - Orders elements in an ascending manner
		Set<String> myTreeSet = new TreeSet<String>();
		myTreeSet.add("Hugo");
		myTreeSet.add("Paco");
		myTreeSet.add("Luis");
		System.out.println("Printing from TreeSet\n");
		for (String str:myTreeSet) {
			System.out.println(str);
		}
		System.out.println();
		// LinkedHashSet - Preserves insertion order
		Set<String> myLinkedHashSet = new LinkedHashSet<String>();
		myLinkedHashSet.add("Hugo");
		myLinkedHashSet.add("Paco");
		myLinkedHashSet.add("Luis");
		System.out.println("Printing from HashTreeSet\n");
		for (String str:myLinkedHashSet) {
			System.out.println(str);
		}
	}

}
