
class Queue
{
	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int nItems;

	//--------------------------------------
	public Queue(int s) //constructor
	{
		maxSize = s;
		queArray = new long[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	//-----------------------------------------
	public void insert(long val)
	{
		if(rear == maxSize-1)
			rear = -1;
		queArray[++rear] = val;
		nItems++;
	}
	//--------------------------------------------
	public long remove()
	{
		long temp = queArray[front++];
		if(front == maxSize)
		{
			front = 0;
		}
		nItems--;
		return temp;
	}
	//-------------------------------------------
	public long peekFront()
	{
		return queArray[front];
	}
	//-------------------------------------------
	public boolean isEmpty()//tru if queue is empty
	{
		return (nItems == 0);
	}
	//-------------------------------------------
	public boolean isFull()
	{
		return (nItems==maxSize);
	}
	//-------------------------------------------
	public int size() //number of items in queue
	{
		return nItems;
	}
}//end clas Queue