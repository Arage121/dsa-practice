public class CustomQueue {// in Queue it is FIFO and LILO means whatever u have put first u can take that out in first and whatever u put last u can take out
    // in last like for e.g many people are in the queue for movie tickets in front of movie ticket counter(so whoever is in first in the line will get out first
    // and whoever is in last will get out last)

    protected int[] data; // internally in queues we use arrays only
    private static final int DEFAULT_SIZE = 10;
    protected int end = 0; // insertion is done from last that's why we have end pointer
    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){
        this.data = new int[size];
    }
    public boolean isFull(){
        return end == data.length;
    }
    public boolean isEmpty(){
        return end == 0;
    }
    public boolean insert(int item) throws Exception{
        if(isFull()){
            throw new Exception("Queue is full!!");
        }
        data[end++] = item;
        return true;
    }
    public int remove() throws Exception{ // so this is taking O(N) and it's not good that's why use circular queue
        if(isEmpty()) throw new Exception("Queue is empty!!");
        int removed = data[0];
        for(int i=1;i<end;i++){ // we have to delete the first element in the queue therefore we will shift all the elements left from one place
            data[i-1] = data[i]; // data[0] = data[1] before element will get the next element value
        }
        end--; // after that we will decrease the end as first item is removed
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()) throw new Exception("Queue is empty!!");
        return data[0];
    }
    public void display(){
        for(int i=0;i<end;i++){
            System.out.print(data[i]+" <- ");
        }
        System.out.print("End of line");
    }
}
