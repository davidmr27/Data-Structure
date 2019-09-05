public class ArrayStack<E> implements Stack<E>{

	public static final int CAPACITY=1000; //default array capacity
	private E[] data;		//generic array used for storage
	private int top = -1;	//index of the top element in stack
	public ArrayStack(){ this(CAPACITY); } //construct stack with default capacity
	public ArrayStack(int capacity){	//contructs stack with given capacity
		data = (E[]) new Object[capacity]; //safe cast; compiler may give warning
	}
	public int size(){ return (top + 1);}

	public boolean isEmpty(){ return (top==-1);}

	public void push(E e)throws IllegalStateException{
		if(size() == data.length) throw new IllegalStateException("Stack is full");
		data[++top] = e;
	}

	public E top(){
		if(isEmpty() )return null;
		return data[top];
	}

	public E pop(){
		if(isEmpty() ) return null;

		E answer = data[top];
		data[top] = null;
		top--;
		return answer;
	}
}