package Link;

public class LinkList
{
	public Link first; //referce to first

	//-----------------------------------
	public void LinkList() //constructor
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
