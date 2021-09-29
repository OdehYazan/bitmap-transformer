package bitmap.transformer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class xxxxx {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 2},
                {4, 5, 6},
                {7, 8, 9}};
        System.out.println(matrix(arr));

        System.out.println(new App().getGreeting());
        System.out.println(fib(14));
        System.out.println(fib2(14));
    }
    static int fib(int n)
    {
        // Base Case
        if (n <= 1)
            return n;
        // Recursive call
        return fib(n - 1) + fib(n - 2);
    }

    static int fib2(int n){
        int n1=0,n2=1,n3 = 0,i,count=n;


        for(i=1;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;

            n1=n2;
            n2=n3;
        }
        return n3;
    }

    // Driver Code
//    public static void main(int n)
//    {
//        // Given Number N
//        int N = 10;
//        // Print the first N numbers
//        for (int i = 0; i < N; i++) {
//
//            System.out.print(fib(i) + " ");
//        }
//    }
    public static List<Integer> matrix (int [][]arr){
        int row =0;
        int cols=0;
        int sumRow =0;
        int sumCol=0;


        row=arr.length;
        cols=arr[0].length;

        ArrayList<Integer>  result = new ArrayList<>();

        for(int i = 0; i < cols; i++){

            sumCol = 0;
            for(int j = 0; j < row; j++){
                sumCol = sumCol + arr[i ][j];

            }
            result.add(sumCol);



        }


        return result;
    }


}
