

public class WorkingWithForEach {

    public static void main(String[] args) {
        // Old way
        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }

        System.out.println("===========for each=============");
        // for each
        for (int i : numbers) {
            System.out.println(i);
        }

    }

}
