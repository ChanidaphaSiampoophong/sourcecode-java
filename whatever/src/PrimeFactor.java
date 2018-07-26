
public class PrimeFactor {
    public String of(int number) {
        String result = "";
        
        for (int primeNumber = 2;number > 1; primeNumber++) {
            while (number % primeNumber == 0) {
                result = result + primeNumber;
                number = number / primeNumber;
            } 
        }
        
        return result;

    }

}
