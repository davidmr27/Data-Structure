package FirstLastList;

import LinkList2.*;

class FirstLastList
{
    private Link2 first;   //ref to first link
    private Link2 last;    //ref to last link
    //--------------------------------------------
    public FirstLastList() //constructor
    {
        first = null; //no links on list yet
        last = null;
    }
    //-------------------------------------------
    public boolean isEmpty()
    { return first == null; }  //true if no links
    //-------------------------------------------
    public void insertFirst(long dd) //insert at front of list
    {
        Link2 newLink = new Link2(dd); //make new link

        if( isEmpty())  //if empty list,
            last = newLink; //newLink <-- last
        newLink.next = first; //newLink --> old first
        first = newLink; //first --> newLink
    }
    //---------------------------------------------
    public void insertLast(long dd) //insert at end of list
    {
        Link2 newLink = new Link2(dd); //make new link
        if( isEmpty() ) //if empty list,
            first = newLink; //first --> newLink
        else
            last.next = newLink; //old last --> newLink
        last = newLink; //newLink <-- last
    }
    //-----------------------------------------------
    public long deleteFirst() //delete first link
    {                         //(assumes non-empty list)
        long temp = first.dData;
        if( first.next == null) //if only one item
            last = null;    //null <-- last
        first = first.next; //first --> old next
        return temp;
    }
    //------------------------------------------------
    public void displayList()
    {
        System.out.print("List (first-->last): ");
        Link2 current = first; //start at begin
        while(current != null)
        {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}