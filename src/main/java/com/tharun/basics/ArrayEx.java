package com.tharun.basics;

import java.util.Scanner;

public class ArrayEx {
    // to store and display marks of 5 students
    int[] ar=new int[5];
    Scanner sc=new Scanner(System.in);

    for(int i=0;i<5;i++)
    {
        ar[i]=sc.nextInt();
    }
    for(int i=0;i<5;i++)
    {
        System.out.println(ar[i]);
    }
}
