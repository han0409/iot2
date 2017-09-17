import java.io.*;



public class iotProject {
   
   public static void COUNT(){
      int i = 0;
      
      System.out.println("20122948 박종국이 만든 10 까찌 COUNT");
      while(i<10){
         i++;
         System.out.println(i);
      }
   }
   
   public static void Gugudan(){
       System.out.println("20122957 신동현의 2단 구구단입니다.");
        
           for(int i = 2; i <= 2; i++) {
                
               for(int j=1; j <= 9; j++) {
                    
                   System.out.println(i + " * " + j + " = " + i * j);
                    
               }
                
               System.out.println();
           }
       }
   
   public static void main(String[] args) {
      System.out.println("iot 세미나 2조입니다.");
      System.out.println("20122994 한성진입니다.");
      System.out.println("20113148 조현태입니다.");
      System.out.println("20133046 안필규입니다.");
      
      
      COUNT();
      Gugudan();
   }

}