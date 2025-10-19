// ID: C1230155
// Name: Hafso Abdinasir Mohamed
// Class: CA232
import java.util.Arrays;
import java.util.EmptyStackException;
public class ArrayStack<E> {
    // declaring and initializing default size array capacity
    private static final int DEFAULT_CAPACITY = 6;
    // top I will use to track my stack
    private int top;
    // declaration my stack variable
    private E[] myStack;

    //No Arg Constructor, if user not initialize capacity it automatically use default capacity
    ArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    //Parameterized Constructor, if user initialize capacity it automatically use its new initialization capacity
    ArrayStack(int newInitialSize) {
        top = 0;
        myStack = (E[]) (new Object[newInitialSize]);
    }

    //the bellow function return number of elements in myStack
    public int size() {
        return top;
    }

    //create push method to add new element
    public void push(E item) {
        // before adding new element first i check is size array or stack is equal or same to list of my stack
        if (size() == myStack.length) // if true expend the capacity to a void error
            ExpandCapacity();
        // else change the current position top into new element I added
        myStack[top] = item;
        // increment the top (tracker) variable + 1
            top++;
    }
    //Create pop method to remove element on the stack, also pop returns what is removed.
    public E pop() {
        // before remove element I checked if my stack list is empty or not
        if (isEmpty()) // if true throw exception handler
            throw new EmptyStackException();
        else {
            //top--;
            // create variable that stores element dropped, then decrease 1 in top because top has positioning from 1, and index starts 0
            E elementRemoved = myStack[--top];
            // make null the current position top
            myStack[top] = null;
            // finally return element dropped
            return elementRemoved;
        }
    }

    //create peek method to get or read last element added without removing.
    public E peek(){
        //  before i read the last element added, first check is my stack list is empty or not.
        if (isEmpty()) // if ture throw also exception handler error
            throw new EmptyStackException();
        else
            return myStack[top-1]; // decrease top  - 1, because arrays can access through index.
    }
    //create isEmpty method that return true if my stack list is empty or false if is not.
    public boolean isEmpty(){
        // return top, because top is position based that starts 1 if top is equal to 0
        return top ==0;
    }
    //Create expand method // if array or stack is exceeded its capacity the expended method must doubled
    public void ExpandCapacity(){
        myStack = Arrays.copyOf(myStack,myStack.length*2);
    }

    //create display message to print stack or array list elements
    public void displayMessage(){
        if (isEmpty())
            throw new EmptyStackException();
        else
            System.out.println("Elements of an array List: ");
        for (int i = 0; i<top;i++)
            System.out.println(myStack[i] + " ");
        System.out.println();
    }
}