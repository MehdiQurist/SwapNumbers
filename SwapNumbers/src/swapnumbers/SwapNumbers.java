
package swapnumbers;

public class SwapNumbers {

    public static void main(String[] args) {
        // TODO code application logic here
    int a = 10, b= 20;  
        System.out.println("befo swaping values are  "+a+" "+b);
        
   // logic 1 thord varioble      
  /*int t = a;
  
 a=b;
 b=t;*/
    
 
 // logic 2 - use +& with out using  thord variables 
 /*
a=a+b;//10+20=30
b=a-b;//30-20=10
a=a-b;//30-10=20
*/




// logic 3 use and with out using thord  variables
//here a & b values  shold not  be zero 

    a=a*b;//10*20=200
    b=a/b;//200/20=10
    a=a/b;//200/10=20
    

    
    
    
    //   bitwish  xor operator 
System.out.println("after swapping vaalues are  "+ a +"  " +b );
/* 
 a=a^b;//10^20=30
 b=a^b;//30^20=10
 a=a^b;//30^10=20
 */
    }
    
}
