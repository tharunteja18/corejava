cpackage com.tharun.Assignment1;

public class Ineuron {
    public static void main(String[] args) {
        int n=8;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(((i == 0) && j<n) || ((j == (n / 2)) && (i < n)) || ((i == n) && (j < n)))
                {
                    System.out.print("*");
                }
                else {
                    System.out.println(" ");
                }
            }
        }
    }



}
