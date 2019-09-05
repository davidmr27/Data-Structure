package LinkList2;

import LinkList.*;

public class LinkList2
{
	private Link first; //referce to first

	//-----------------------------------
	public void LinkList2() //constructor
	{
		first = null;  //no items on list yet
	}
	//-------------------------------------
	public boolean isEmpty() //true if list is empty
	{
		return (first == null);
	}
	//-------------------------------------

	public void insertFirst(int id, double dd) //insert at start of list
	{
		Link newLink = new Link(id,dd);
		newLink.next = first; //newLink ---> old first
		first  = newLink;   //first ----> newLink
	}
	//-----------------------------------------------
	public Link deleteFirst() // delete first item
	{						  //(assumes list not empty)
		Link temp = first; //Save refence to link
		first = first.next; //delete it: first-->old next
		return temp; //return deleted link
	}
	//---------------------------------------------
	public Link find(int key) //find Link with given key
	{
		Link current = first;
		while(current.iData  != key)
		{
			if(current.next == null)
				return null;
			else
				current = current.next; //go to next link
		}
		return current;   //found it
	}
	//----------------------------------------------
	public Link delete(int key) //delete link with given key
	{							// (assumes non-empty list)
		Link current = first;  //search for link
		Link previous = first;

		while(current.iData != key)
		{
			if(current.next == null)
				return null;
			else
			{
				previous = current; //go to next link
				current = current.next;
			}
		} //found it

		if( current == first ) //if first link,
			first = first.next; //change first
		else   //otherwise
			previous.next = current.next; //bypass it

		return current;
	}
	//----------------------------------------------
	public void displayList()
	{
		System.out.print("List (first-->last): ");
		Link current = first; //start at beginning of list
		while(current != null) //until end of list
		{
			current.displayLink(); //print data
			current = current.next; //move to next link
		}
		System.out.println("");
	}

}	
