package Generics;

import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }
    private void resize(){
        int[] temp = new int[data.length * 2];
        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }
    public int remove(int index){
         int removed =  data[index];
         data[index] = 0;
         --size;
         return removed;
    }
    public void set(int index, int value){
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
        CustomArrayList list  = new CustomArrayList();
        list.add(34);
        list.add(22);
        list.add(1);
        System.out.println(list.remove(0));
        System.out.println(list.size());
        System.out.println(list);

    }
}
