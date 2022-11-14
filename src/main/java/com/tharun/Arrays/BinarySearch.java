package com.tharun.Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int [] ar={10,20,30,40,50,60,70,80,90};
        System.out.println(ar.getClass().getName());
        Scanner sc=new Scanner(System.in);
        int key= sc.nextInt();
        int low=0;
        boolean flag=false;
        int high=ar.length-1;

        while(low<=high)
        {
            int mid=(low+high)/2;
            if(key==ar[mid])
            {
                System.out.println("key is found at index "+mid);
                flag=true;
                break;
            } else if (key<ar[mid])
            {
                high=mid-1;
            }
            else if(key >ar[mid])
            {
                low=mid+1;
            }

        }
        if(flag==false)
        {
            System.out.println("key is not found");
        }

    }
}
