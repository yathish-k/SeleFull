package challenges;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinMax {

    static void miniMaxSum(int[] arr) {
        // Complete this function
        Arrays.sort(arr);
        
    	List<Integer> li1 = new LinkedList<Integer>();
        
        
        for(int a: arr)
            li1.add(a);
        System.out.println(li1);
        
        List<Integer> li2 = new LinkedList<Integer>(li1);
        System.out.println(li2);
        
        int last = ((LinkedList<Integer>) li2).getLast();
        int first = ((LinkedList<Integer>) li1).getFirst();
        
        li1.remove(last);
        li2.remove(first);
        
        int min=0;
        for(int i: li1)
        	min+=i;
        
        System.out.println(min);
        int max=0;
        for(int i: li2)
        	max+=i;
        System.out.println(max);
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
