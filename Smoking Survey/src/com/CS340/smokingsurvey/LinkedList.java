/*
 *	Author: MICHAEL BROOKS
 *  -Linked list implementation originally planned to be used for our non-linear questions. We scratched the idea, but kept it because our read
 *  	file uses this a bit during it's parsing.	
*/

package com.CS340.smokingsurvey;


public class LinkedList {
	public FilesList first; //Head of list
	public FilesList last;	//Tail of list
	public int listCount;	//total list count
	
	// LinkedList constructor
	public LinkedList()
	{
		// this is an empty list, so the reference to the head node
		// is set to a new node with no data
		first = null;
		last = null;
		listCount = 0;
	}
	
	public void add(FilesList p)
	// post: appends the specified element to the end of this list.
	{
		
		if(first == null){
			first = p;
			p.prevFile = p.nextFile = null;
		}
		else{
			last.nextFile = p;				//.next is rightNeighbor
												//.prev is leftNeighbor
			p.prevFile = last;
			p.nextFile = null;
					
		}
		last = p;		
		listCount++;// increment the number of elements variable
	}
}
