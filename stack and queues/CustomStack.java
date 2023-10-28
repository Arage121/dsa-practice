public class CustomStack { // in Stack it is FILO and LIFO means whatever u have put first u can only take that at last and whatever u put last u can take out
    // it first like for e.g plates that are stacked above one another
    protected int[] data; //inside stack the normal array is used only(but it's not accesible outside it's package)
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1; // pointer( insertion is done from top)

    public CustomStack(){ // when the user creates CustomStack s = new CustomStack(); new array will be created according to the parameters
        this(DEFAULT_SIZE); // calling the below constructor through this which takes size as an argument
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item) throws StackException{ // but in stack we see it never gets full so we will create dynamicstack
        if(isFull()){
            throw new StackException("Stack is full!!");
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public boolean isFull(){
        return ptr == data.length-1; // if ptr has reached the last index of array in stack then it's full
    }

    public boolean isEmpty(){
        return ptr == -1; // if ptr has not been moved from -1 then it means stack is empty
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack!!");
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;
         return data[ptr--]; // same as above three lines meaning
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Can't peek in an empty stack!!");
        }
        return data[ptr];
    }
}
