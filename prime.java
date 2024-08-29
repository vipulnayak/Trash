import java.util.Scanner;

public class Main {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int nextPrime(int num) {
        int next = num + 1;
        while (!isPrime(next)) {
            next++;
        }
        return next;
    }
    
    public static int previousPrime(int num) {
        int prev = num - 1;
        while (prev>1 && !isPrime(prev)) {
            prev--;
        }
        return prev>1 ? prev :0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int forwardPrime = nextPrime(number);
        System.out.println(forwardPrime);
        int backwardPrime = previousPrime(number);
        if (backwardPrime != -1) {
            System.out.println(backwardPrime);
        } else {
            System.out.println(number);
        }
        scanner.close();
    }
}
