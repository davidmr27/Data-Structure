package ADT.LinkStack;

//Linkstack
//David Moran

class Link{
    public long dData;
    public Link next;
    //----------------------------------------
    public Link(long dd) //constructor
    {
        dData = dd;
    }
    //--------------------------------------
    public void displayLink() //display ourself
    {
        System.out.print(dData+" ");
    }
}// end class Link