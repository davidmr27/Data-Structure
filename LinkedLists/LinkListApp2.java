package LinkList2;

import LinkList.*;
class LinkListApp
{
	public static void main(String[] args)
	{
		LinkList2 theList = new LinkList2(); //make new list


		theList.insertFirst(22,2.99);
		theList.insertFirst(44,4.99);
		theList.insertFirst(66, 6.99);
		theList.insertFirst(88, 8.99);

		theList.displayList(); //display list

		Link f = theList.find(44); //find item
		if( f != null)
			System.out.println("Found link with key " + f.iData + "---"+f.dData);
		else
			System.out.println("Can\'t Found key ---->"+f.iData);
	}
}