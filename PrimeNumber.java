import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Enter the range of Array: ");
        n = scanner.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) 
        {
            a[i] = scanner.nextInt();
        }

        System.out.print("Prime numbers in the array are: ");
        for (int i = 0; i < n; i++) 
        {
            int item = a[i];
            if (prime(item)) 
            {
                System.out.print(item+" ");
            }
        }
        System.out.println();
    }

    public static boolean prime(int num) 
    {
        if (num <= 1) 
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) 
        {
            if (num % i == 0) 
            {
                return false;
            }
        }
        return true;
    }
}
