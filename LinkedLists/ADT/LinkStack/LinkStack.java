package ADT.LinkStack;

class LinkStack
{
    private LinkList theList; 

    //----------------------
    public LinkStack()//constructor
    {
        theList = new LinkList();
    }
    //--------------------------
    public void push(long item)
    {
        theList.insertFirst(item);
    }
    //--------------------------
    public long pop()
    {
        return theList.deleteFirst();
    }
    //---------------------------
    public boolean isEmpty()
    {
        return theList.isEmpty();
    }
    //--------------------------
    public void displayStack()
    {
        System.out.print("Stack (top-->bottom): ");
        theList.displayList();
    }
    //-------------------------
} //end class LinkStack
