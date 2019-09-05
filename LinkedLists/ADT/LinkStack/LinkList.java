package ADT.LinkStack;

class LinkList {
    
    private Link first; //ref to first item

    public LinkList()
    {
        first = null;
    }
    //-----------------------------
    public boolean isEmpty() //true if list is empty
    {
        return (first==null);
    }
    //------------------------------
    public void insertFirst(long dd)
    {
        Link newLink = new Link(dd);
        newLink.next = first;
        first = newLink;
    }
    //-----------------------------
    public long deleteFirst()
    {
        Link temp = first;
        first = first.next;
        return temp.dData;
    }
    //----------------------------
    public void displayList()
    {
        Link current = first;
        while(current != null)
        {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
    //------------------------------------
}