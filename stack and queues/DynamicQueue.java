public class DynamicQueue extends CustomCircularQueue{
    public DynamicQueue(){
        super();
    }
    public DynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean insert(int item) throws Exception {
        if(isFull()){
            // double the array size
            int temp[] = new int[data.length*2];
            // insert previous values
            for(int i=0;i<data.length;i++){
                temp[i] = data[(front+i)% data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
        // at this point, we know that queue is not full so we insert using our super class method
        return super.insert(item);
    }
}
