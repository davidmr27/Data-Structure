package LinkList2;

public class Link2
{
    public long dData;
    public Link2 next;
    //-----------------------------------
    public Link2(long d)
    {
        dData = d;
    }
    //-----------------------------------
    public void displayLink()
    {
        System.out.print(dData + " ");
    }
}