package com.tharun.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] ar={7,2,5,3,6,4,1,9};
        for(int i=0;i<ar.length-1;i++)
        {
//            for(int j=0;j<ar.length-i-1;j++)
            for(int j=1;j<ar.length-i;j++)
            {
//                if(ar[j+1]<ar[j])
//                {
//                    int temp=ar[j+1];
//                    ar[j+1]=ar[j];
//                    ar[j]=temp;
//                }
                if(ar[j]<ar[j-1])
                {
                    int temp=ar[j];
                    ar[j]=ar[j-1];
                    ar[j-1]=temp;
                }

            }
        }
        for(int x:ar)
        {
            System.out.print(x+" ");
        }
    }
}
