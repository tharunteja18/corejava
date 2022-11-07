package com.tharun.Assignment1;

public class Pattern3 {
    public static void main(String[] args) {
        int n=15;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
             if(i==n-1 || i+j<=7 || j==0 || j==n-1 || j-i>6)
             {
                 System.out.print("*");
             }
             else
             {
                 System.out.print(" ");
             }
            }
            System.out.println();
        }
    }
}
