package com.delhivery;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArraylist {
	public static void main(String[] args) {
	/*	ArrayList<String> stud = new ArrayList<>();
		
		// size = n
		//		  n + n/2 +1
		
		
		stud.add("srishti");
		stud.add("rahul");
		stud.add("doremon");
		System.out.println(stud);
		
		stud.add("bhavya"); // This will add bhavya at the end of the list.
		
		System.out.println(stud);
		
		stud.add(1, "shivam");// This will add the element on the discriebed position.
		System.out.println(stud);
		
		List<String> students = new ArrayList<String>();
		students.add("abc");
		students.add("abcd");
		stud.addAll(students);// This will add all elements of list2 at the end of list1.
		
		System.out.println(stud);
		
		stud.remove(1);// Remove element at 1st index.
		System.out.println(stud);
		
		stud.remove(String.valueOf("abc"));
		System.out.println(stud);
		
		stud.clear(); // This will remove all the elements in the list.
		System.out.println(stud);
		*/
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		
		System.out.println(list);
		
		list.set(2, 1000);// will set value of the given index.
		System.out.println(list);
		
		System.out.println(list.contains(500));//check whether true or not.e3
		
		for(int i=0; i < list.size();i++)// traditional for loop
		{
			System.out.println("the element is " + list.get(i));
		}
		
		
		for (Integer element: list)// foreach loop
		{
			System.out.println("foreach element is" + element);
		}
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext())
		{
			System.out.println("iterator" + it.next() );
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
