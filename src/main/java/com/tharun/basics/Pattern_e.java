package com.tharun.basics;

public class Pattern_e
{
    public static void main(String[] args)
    {
        int n=11;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0||i==n-1||i==(n-1)/2|| j==0)
                {
                    System.out.print(" * ");
                }
                else 
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
