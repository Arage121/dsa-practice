import java.util.Arrays;

public class CustomArrayListGeneric<T>{
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayListGeneric(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T val){
        if(isFull()){
            resize();
        }
        data[size++] = val;
    }

    private boolean isFull(){
        return size == data.length;
    }

    private void resize(){
        Object[] temp = new Object[data.length*2];
        for(int i=0;i< data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public T get(int index){
        return (T)data[index];
    }

    public void set(int index, int val){
        data[index] = val;
    }

    public int size(){
        return size;
    }

    public T remove(){
        T removed = (T)data[--size];
        return removed;
    }

    @Override
    public String toString() {
        return "CustomArrayListGeneric{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayListGeneric<String> list = new CustomArrayListGeneric<>();
        list.add("aasdi");
        System.out.println(list);
    }
}
