/*Clase de lista*/
package LinkList;

public class Link{

	public int iData; //data item
	public double dData; //data item
	public Link next; //next link in list
	//-----------------------------
	public Link(int id,double dd)
	{
		iData = id; //initialize data
		dData = dd; // ('next' is automatically set to null)
	}
	//---------------------------------
	public void displayLink()
	{
		System.out.print("{"+iData+", "+ dData +"} ");
	}
}//end class link