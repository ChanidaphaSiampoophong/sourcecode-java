
public class WorkingWithLoop {

    public static void main(String[] args) {
       System.out.println("=========for==========");
       for (int i = 0; i < 5; i++) {
        System.out.println(i);
       }
       System.out.println("=========while===========");
       int number = 0 ;
       while(number < 5) {
           System.out.println(number);
           number ++;
       }
       System.out.println("==========do-while==========");
       number = 0 ;
       do {
           System.out.println(number);
           number ++;
       }while(number < 5);
           
    }

}
