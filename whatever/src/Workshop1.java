
public class Workshop1 {

    public static void main(String[] args) {
        int a,b,c= 0;
        a=c++;
        System.out.println(a);
        System.out.println("====a=c++=====");
        
        
        b=++a;
        System.out.println(b);
        System.out.println("====c++=====");

        c++;
        System.out.println(c);
        System.out.println("====b=++c+a++=====");
      
        b=++c+a++;
        System.out.println(b);
        System.out.println("====a=--b+c++=====");
        
        a=--b+c++;
        System.out.println(a);
        System.out.println("=========");
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        

        
        


    }
}
