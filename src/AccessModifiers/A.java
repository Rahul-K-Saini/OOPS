package AccessModifiers;

public class A {
    private int num;
    protected String name;
    int[] arr;
    A(int num,String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
    public int getnum(){
        return num;
    }
    public void setnum(int num){
        this.num = num;
    }
}
