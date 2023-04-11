import java.util.ArrayList;
import java.util.Scanner;

public class Union {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of 1st array: ");
        int n = in.nextInt();
        System.out.print("Enter the size of 2nd array: ");
        int m = in.nextInt();
        int[] arr1 =  new int[n];
        int[] arr2 =  new int[m];
        System.out.print("Enter the elements of array1: ");
        ArrayList<Integer> unionList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
            unionList.add(arr1[i]);
        }
        System.out.print("Enter the elements of array2: ");
        for (int i = 0; i < m; i++) {
            arr2[i] = in.nextInt();
        }
        for (int i = 0; i <m ; i++) {
            boolean isexist = false;
            for (int j = 0; j <unionList.size() ; j++) {
                if(arr2[i]==unionList.get(j)){
                    isexist = true;
                    break;
                }

            }
            if(!isexist) unionList.add(arr2[i]);
        }
        System.out.println(unionList);


    }
}
