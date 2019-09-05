package ADT.LinkStack;

class LinkStackApp
{
    public static void main(String args[])
    {
        LinkStack theStack = new LinkStack();//make stack

        theStack.push(20);
        theStack.push(40);

        theStack.displayStack();

        theStack.push(600);
        theStack.push(80);

        theStack.displayStack();

        theStack.pop();
        theStack.pop();

        theStack.displayStack();
    }
}