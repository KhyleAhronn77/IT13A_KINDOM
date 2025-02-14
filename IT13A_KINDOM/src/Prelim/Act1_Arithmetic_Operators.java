
package Prelim;


public class Act1_Arithmetic_Operators {
     public static void main(String[] org){
             
        int numb1 = 10;
        int numb2 = 6;
        int numb3 = 4;
        int numb4 = 3; 
        
        
        
        int kindom1 = numb1 * numb3 + numb2;
        int backup1 = numb1 - numb3;
        int kindom2 = backup1 % numb2;
        int backup2 = numb1 + numb3 + numb2;
        int kindom3 = backup2 / numb4;
        int backup3 = numb3 * numb3;
        int kindom4 = numb1 * numb2 - backup3;
        
          System.out.println("10 * 4 + 6 ="+ kindom1);
         System.out.println("(10-4) % 6 = "+ kindom2);
            System.out.println("(10 + 4 + 6)/3 = "+ kindom3);
               System.out.println("10 * 6 -(4 * 4 ) = "+ kindom4);
               
     }
}

