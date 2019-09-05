package FirstLastList;

class FirstLastApp {

    public static void main(String args[])
    {
        FirstLastList theList = new FirstLastList();

        theList.insertFirst(45);
        theList.insertFirst(22);
        theList.insertFirst(66);
        theList.displayList();

        theList.insertLast(55);
        theList.insertLast(33);

        theList.displayList();
    }
}