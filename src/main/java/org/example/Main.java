package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    static List<Integer> list = Arrays.asList(8,5,2,3,23,43,1);
    public static void main(String[] args) {
        int temp, i, j;
        System.out.println("Before sorting: \n"+ list);
        for(i=0;i<list.size();i++ )
        {
            for(j=0;j<list.size()-1;j++){
                if(list.get(j)>list.get(j+1) && j+1<= list.size())
                {
                    temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                    System.out.println(list);
                }
            }
        }
        System.out.println("After sorting: \n"+ list);

    }
}