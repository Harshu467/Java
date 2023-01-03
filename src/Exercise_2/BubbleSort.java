package Exercise_2;
import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int len = sc.nextInt();
        System.out.print("Enter Elements of Arrays : ");
        int [] Arr ;
        Arr = new int[len];
        for(int i=0;i<len;i++)
        {
            Arr[i]=sc.nextInt();
        }
        new BubbleSort().sort(Arr);
        System.out.println(Arrays.toString(Arr));
    }
    public  void sort(int [] Arr)
    {
        for(int i=0;i<Arr.length-1;i++)
        {
            for (int j=0;j<Arr.length-1-i;j++)
            {
                if(Arr[j]>Arr[j+1])
                {
                    int temp = Arr[j+1];
                    Arr[j+1] = Arr[j];
                    Arr[j] = temp;
                }
            }
        }
    }
}
