package com.tharun.Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean flag=false;
        int key=sc.nextInt();
        int[] ar={10,20,30,40,50,60,70,80,90};
        for(int i=0;i<ar.length;i++)
        {
            if(key==ar[i])
            {
                System.out.println("key is found at "+i+" index");
                flag=true;
                break;
            }
        }
        if(flag==false)
        {
            System.out.println("key is not found");
        }
    }
}
