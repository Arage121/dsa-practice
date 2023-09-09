import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList { // making our own arraylist
    private int data[];
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList(){ //constructor
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int val){
        if(isFull()){
            resize();
        }
        data[size++] = val;
    }

    private void resize(){
        int temp[] = new int[data.length*2];
        //copy the current items in the new array
        for(int i=0;i<data.length;i++){
            temp[i] = data[i];
        }
        data = temp; // then make the new doubled array, before one value
    }

    private boolean isFull(){
     return size == data.length;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int val){
        data[index] = val;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
//        list.add(2);
        for(int i=0;i<14;i++){
            list.add(i*2);
        }
        System.out.println(list);

        //but in this custom arraylist we are only able to create a integer type arraylist, and not for all the datatypes, as we have in built
        // like ArrayList<Integer> so these Integer or String we can do with the help of generics. We will have a basic structure, and all the generics
        // will take the structure from their and use it so that we can also create any type of arraylist.
    }
}
