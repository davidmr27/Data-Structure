package LinkList;

class LinkListApp
{
	public static void main(String[] args)
	{
		LinkList theList = new LinkList(); //make new list


		theList.insertFirst(22,2.99);
		theList.insertFirst(44,4.99);
		theList.insertFirst(66, 6.99);
		theList.insertFirst(88, 8.99);

		theList.displayList(); //display list

		while( !theList.isEmpty())
		{
			Link aLink = theList.deleteFirst(); //delete link
			System.out.print("delete");
			aLink.displayLink();
			System.out.println("");
		}

		theList.displayList();
	}
}