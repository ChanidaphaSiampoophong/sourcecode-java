
public class FizzBuzz2 {

    public String sendAndReturn(int number) {
        String result = "" + number;
        if (mod3andmod5(number)) {
            result = "FizzBuzz";
        } else if (mod3(number)) {
            result = "Fizz";
        } else if (mod5(number)) {
            result = "Buzz";
        }
        return result;
    }

    private boolean mod3andmod5(int number) {
        return mod3(number) && mod5(number);
    }

    private boolean mod5(int number) {
        return number % 5 == 0;
    }

    private boolean mod3(int number) {
        return number % 3 == 0;
    }

}
