//infix.java
//converts infix arithmetic expressions to postfix
//to run this program: C> java InfixApp

import java.io.*;

/////////////////////////////////////////////////////
class StackX
{
	private int maxSize;
	private char[] stackArray;
	private int top;
	//----------------------------------------------

	public StackX(int size) //constructor
	{
		maxSize = size;
		stackArray = new char[maxSize];
		top = -1;
	}
	//----------------------------------------------
	public void push(char item) //put item on top of stack
	{ stackArray[++top] = item; }
	//--------------------------------------------------
	public char pop() //take item from top of stack
	{
		return stackArray[top--];
	}
	//----------------------------------------------------
	public char peek() ///peek at top of stack
	{ return stackArray[top]; }
	//----------------------------------------------------
	public boolean isEmpty() //true if stack is empty
	{ return (top == -1); }
	//--------------------------------------------------
	public int size()
	{ return top+1; }
	//--------------------------------------------------
	public char peekN(int n) //return item at index n
	{ return stackArray[n]; }
	//--------------------------------------------------
	public void displayStack(String s)
	{
		System.out.print(s);
		System.out.print("Stack (bottom-->top): ");
		for(int j=0; j<size(); j++)
		{
			System.out.print( peekN(j) );
			System.out.print(' ');
		}
		System.out.println("");
	}
	//------------------------------------------------
}//end class StackX

class InToPost
{
	private StackX theStack;
	private String input;
	private String output = "";
	//--------------------------------------------------

	public InToPost(String in) //contructor
	{
		input = in;
		int stackSize = input.length();
		theStack = new StackX(stackSize);
	}
	//-------------------------------------------------------
	public String doTrans() //do translation to postfix
	{
		for(int j=0; j<input.length(); j++)
		{
			char ch = input.charAt(j);
			theStack.displayStack("For " + ch +" "); //*diagnostic*
			switch(ch)
			{
				case '+':
				case '-':
					gotOper(ch,1); //go pop operators
					break;  // preceden 1
				case '*':
				case '/':
					gotOper(ch,2);
					break;
				case '(':
					theStack.push(ch); //push it
					break;
				case ')':
					gotParen(ch);
					break;
				default:
					output = output + ch; //write it to output
					break;
			}//end switch
		}//end to for

		while( !theStack.isEmpty() ) //pop reamaining opers
		{
			theStack.displayStack("While "); //*diagnostic*
			output = output + theStack.pop(); //write output
		}
	theStack.displayStack("End:  "); //*diagnostic*}
	return output;
	}//end doTrans()

	//------------------------------------------------------
	public void gotOper(char opThis, int prec1)
	{
		while( !theStack.isEmpty() )
		{
			char opTop = theStack.pop();
			if( opTop == '(')
			{
				theStack.push(opTop);
				break;
			}else{
				int prec2;

				if(opTop=='+' || opTop=='-')
				{
					prec2 = 1;
				}else{
					prec2 = 2;
				}

				if(prec2 < prec1)
				{
					theStack.push(opTop);
					break;
				}else{
					output = output +opTop;
				} 
			}//end else(it's an operator)
		}//end while
		theStack.push(opThis);
	}//end gotOp()
	//------------------------------------------------------
	public void gotParen(char ch)
	{
		while( !theStack.isEmpty() )
		{
			char chx = theStack.pop();
			if( chx == '(')
			{
				break;
			}else{
				output = output +chx;
			}
		}
	}//end gotParen
}

class InfixApp
{
	public static void main(String args[]) throws IOException
	{
		String input,output;
		while(true)
		{
			System.out.print("Enter infix: ");
			System.out.flush();
			input = getString();
			if( input.equals("") )
				break;

			InToPost theTrans = new InToPost(input);
			output = theTrans.doTrans();
			System.out.println("Postfix is " + output + '\n');
		}
	}//end main

	//--------------------------------------------------------------
	public static String getString() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
//--------------------------------------------------------------
}