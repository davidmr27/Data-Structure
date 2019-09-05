/*The Queue Class Without nItems*/
class Queue2{

	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	//-----------------------------------
	public Queue2(int s) //constructor
	{
		maxSize = s+1; //array is 1 cell larger
		queArray = new long[maxSize]; //than requested
		front = 0;
		rear = -1;
	}
	//------------------------------------
	public void insert(long j)//put item at rear of queue
	{
		if(rear == maxSize-1)
		{
			rear = -1;
		}
		queArray[++rear] = j;
	}
	//---------------------------------------
	public long remove()  //take item from front of queue
	{
		long temp = queArray[front++]
		if(front == maxSize)
			front = 0;
		return temp;
	}
	//----------------------------------------------
	public boolean isFull() //true is full
	{
		return (rear+2=front || (front+maxSize-2 == rear));
	}
	//----------------------------------------------
	public boolean isEmpty() //true is empty
	{
		return (rear+1==front || (front + maxSize-1 == rear));
	}
	//-----------------------------------------------
	public int size()
	{
		if(rear >= front)  //contiguos sequence
			return rear-front+1;
		else    //broken sequence
			return (maxSize-front) + (rear+1);
	}
}