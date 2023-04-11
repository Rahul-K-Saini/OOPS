package Generics;

import java.util.Arrays;

public class CustomGenArrayList<T> {

    private Object[] data;
    private final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }
    private void resize(){
        Object[] temp = new Object[data.length * 2];
        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }
    public T remove(int index){
        T removed =  (T)data[index];
        data[index] = 0;
        --size;
        return removed;
    }
    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return  Arrays.toString(data) ;
    }
    public int size(){
        return size;
    }

    public static void main(String[] args) {
        CustomGenArrayList<Integer> list  = new CustomGenArrayList<>();
        CustomGenArrayList<String> list2  = new CustomGenArrayList<>();
        list2.add("My");
        list2.add("Name");
        list2.add("is");
        list2.add("Rahul");
        
//        list.add(34);
//        list.add(22);
//        list.add(1);
//        System.out.println(list.remove(0));
//        System.out.println(list.size());
        System.out.println(list2);


    }
}

