
package feladat_1;
import java.util.Scanner;

public class Feladat_1 {

   
    public static void main(String[] args) {
        
        int átmérő;
        int mélység;
        double térfogat;
        int sugár;
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Kérem adja meg a medence sugarát: ");
       
        sugár= input.nextInt();
       
         System.out.println("Kérem adja meg a medence mélységét: ");
        
        mélység= input.nextInt();
       
        
      térfogat=sugár*sugár*3.1415*mélység;
 
        System.out.println("A medencébe enyyi köbméter víz fér bele: "+térfogat +"m3");

             
    }
    
}
