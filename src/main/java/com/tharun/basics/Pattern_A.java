package com.tharun.basics;

public class Pattern_A {
    public static void main(String[] args) {
        int n=25;
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                if((i!=0 && j==0) || (i==0 && j>0 && j<(n-1)/2)  || (i==(n-1)/2 && j<=(n-1)/2) || (i!=0) && j==(n-1)/2 )
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
