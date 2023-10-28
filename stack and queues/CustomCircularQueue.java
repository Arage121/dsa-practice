public class CustomCircularQueue { // in circular we imagine array is like circular array, and with the help of poniters end and front we make it happen
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int end = 0;
    protected int front = 0;
    private int size = 0;
    CustomCircularQueue(){
        this(DEFAULT_SIZE);
    }
    CustomCircularQueue(int size){
        this.data = new int[size];
    }
    public boolean isFull(){
        return size == data.length;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean insert(int item) throws Exception{
        if(isFull()){
            throw new Exception("CircularQueue is Full!!");
        }
        data[end++] = item;
        end = end%data.length;// and this is the main line without this the whole motive of circular array will not work(if u have doubt, then see the kunal
        // kushwaha dsa playlist stacks and heap video timestamp topic: circular queue)
        // point: as u know that whenever an item is removed front pointer gets ahead by 1 and the item that was at 0 will remain their and will be override
        // later when the end pointer gets to that index(when the whole array is filled(linear one)) using end%data.length so for e.g if end is equal to size
        // of the array then modulo will give 0 and u will insert at that place new value Note: the only start of circular queue is at front and the end is at end
        size++;
        return true;
    }
    public int remove() throws Exception{
      if(isEmpty()){
          throw new Exception("Circular Queue is Empty!!");
      }
      int removed = data[front++];
      front = front%data.length; //here we use modulo the size of array bcz we want the specific pointer in that circular array(and without this u can't make
        // it behave like a proper circular queue)
      size--;
      return removed;
    }
    public int front() throws Exception{
        if(isEmpty()) throw new Exception("Circular Queue is empty");
        return data[front];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        int i=front;
        do{
            System.out.print(data[i]+" -> ");
            i++;
            i %= data.length;
        }while(i != end);
//        for(int i=front%data.length;i<end;i++){ another way to print
//            System.out.print(data[i]+" -> ");
//        }
        System.out.print("end of line");
    }
}
