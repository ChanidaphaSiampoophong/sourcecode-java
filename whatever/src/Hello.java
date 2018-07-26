
public class Hello {

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.say(100);
    }
    private static final int NUMBER_TWO = 2;
    static int index = 1;
    private int number;
    private void say(int number) {
      int index = 0;
      System.out.println(index);
      System.out.println(this.index);
      System.out.println(Hello.index);
      System.out.println(this.number);
      System.out.println(number);
      System.out.println(NUMBER_TWO);
        
        
    }

}
