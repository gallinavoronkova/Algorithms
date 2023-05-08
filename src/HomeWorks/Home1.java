package HomeWorks;

public class Home1 {
    public static void main(String[] args) {
        int[] num = {1, 1, 2, 3, 3};
        System.out.println(findElement(num));
    }

    // O(n)
    private static int findElement(int[] numbers) {
        for (int i = 0; i <= numbers.length - 1; i = i + 2) {
            if (i == numbers.length - 1) {
                return numbers[i];
            } else if (numbers[i] != numbers[i + 1]) {
                return numbers[i];
            }
        }
        throw new RuntimeException("No single value in array found.");
    }
}
