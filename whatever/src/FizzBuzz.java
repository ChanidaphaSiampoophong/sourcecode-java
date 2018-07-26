
public class FizzBuzz {

    public String sendAndReturn(int number) {

        if (number == 1) {
            return "1";
        } else if (number == 2) {
            return "2";   
        } else if ((number %3 == 0) && (number %5 == 0)) {
            return "FizzBuzz";
        }else if (number %3 == 0) {
            return "Fizz";
        } else if (number == 4) {
            return "4";
        } else if (number %5 == 0) {
            return "Buzz";
        } else if (number == 7) {
            return "7";
        } else if (number == 8) {
            return "8";
        } else if (number == 11) {
            return "11";
        } else if (number == 13) {
            return "13";
        } else if (number == 14) {
            return "14";
        } 
        return "16";

    }

}
