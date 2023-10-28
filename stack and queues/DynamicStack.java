public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super(); // calls the CustomStack constructor with no parameters
    }
    public DynamicStack(int size){
        super(size); // calls the CustomStack constructor with size parameter
    }

    @Override
    public boolean push(int item) throws StackException {
        if(isFull()){
            int[] temp = new int[data.length*2]; //create a new temp array of double the previous array size
            for(int i=0;i< data.length;i++){
                temp[i] = data[i];
            }
            data = temp; // we will make this temp as our main data array
        }
        // now at this point our stack is not full so we will add it using parent push method
        return super.push(item);
    }
}
