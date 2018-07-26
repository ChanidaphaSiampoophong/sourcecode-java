
public class WorkingWithString {

    public static void main(String[] args) {
        String name ="Chanidapha";
        int age = 24;
        String result = name +" "+ age;//1
        String result2 = String.format("%s %d", name,age);//4 
        
        StringBuffer buffer = new StringBuffer();//2
        buffer.append(name).append(" ").append(age);
        
        StringBuilder buider = new StringBuilder();//3
        buider.append(name).append(" ").append(age);
        
        
        System.out.println(result);//1
        System.out.println(result2);//4
        System.out.println(buffer.toString());//2
        System.out.println(buider.toString());//3
        

     }

}
