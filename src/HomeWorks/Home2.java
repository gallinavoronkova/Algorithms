package HomeWorks;

public class Home2 {

    public static void main(String[] args)
    {
        int n = 5;
        System.out.println("The Factorial of " + n + " is " + factorial(n));
    }

    public static int factorial(int n)
    {
        if (n < 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
