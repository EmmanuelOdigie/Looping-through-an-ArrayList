package JavaLoopArrayList;// project made in eclipse
import java.util.ArrayList;// import ArrayList class
import java.util.Collections;// import Collections class
import java.util.Arrays; // imported Arrays class

public class LoopArrayList {// public class 'LoopArrayList' created

	public static void main(String[] args) {// reads, runs & executes code
	// created an object of the imported ArrayList class class is set to take in integer <Integer>
	// object named 'myNewList'
		ArrayList<Integer> myNewList = new ArrayList<Integer>();
		
	// object calls onto the '.add()' method to add number into the object
		myNewList.add(10);
		myNewList.add(7);
		myNewList.add(31);
		myNewList.add(36);
		myNewList.add(42);
		
		Collections.sort(myNewList); // Used Collections class to call onto .sort() method
		// put object created in the brackets and it sorts the number out
		
		for(int i:myNewList) {// data in the object 'myNewList' is pass down to int i 
			System.out.println(i); // display the content in the arraylist
		}

	}

}

// result:
//7
//10
//31
//36
//42