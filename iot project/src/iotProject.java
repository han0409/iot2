import java.io.*;



public class iotProject {
   
   public static void COUNT(){
      int i = 0;
      
      System.out.println("20122948 �������� ���� 10 ���� COUNT");
      while(i<10){
         i++;
         System.out.println(i);
      }
   }
   
   public static void Gugudan(){
       System.out.println("20122957 �ŵ����� 2�� �������Դϴ�.");
        
           for(int i = 2; i <= 2; i++) {
                
               for(int j=1; j <= 9; j++) {
                    
                   System.out.println(i + " * " + j + " = " + i * j);
                    
               }
                
               System.out.println();
           }
       }
   
   public static void main(String[] args) {
      System.out.println("iot ���̳� 2���Դϴ�.");
      System.out.println("20122994 �Ѽ����Դϴ�.");
      System.out.println("20113148 �������Դϴ�.");
      System.out.println("20133046 ���ʱ��Դϴ�.");
      
      
      COUNT();
      Gugudan();
   }

}