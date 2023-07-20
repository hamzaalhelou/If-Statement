/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FirstConditional;

/**
 *
 * @author Moatasem
 */
public class If {
    
 //   if ( condition )
// {
    // إذا كان الشرط صحيحاً نفذ هذا الكود
// }

// else if ( condition )
// {
    // إذا كان الشرط صحيحاً نفذ هذا الكود
// }

// else
// {
    // نفذ هذا الكود في حال لم يتم التعرف على الكود في أي شرط
// }
    
     /**
     *
     * IF CONDITIONS
     * => if (condition){} 
     * => if (condition) {} else {} 
     * => if(condition) {} else if (condition) {} 
     * => if (condition) {} else if(condition) {} else {}
     */
    /**
     *
     * Arithmetic Operators:
     *
     * => Bigger-Than >  //  اكبر
     * => Less Than  <   //  اصغر
     * => Equal ==   // يساوي
     * => Not Equal != //  لا يساوي
     * => Bigger Or Equal >=   //  اكبر او يساوي
     * => Less Or Equal <=    //  اصغر او يساوي
    
     */
    
    /**
     *
     * Logical Operators:
     * => AND && 
     * => OR ||
     *
     */
    
      public static void main(String[] args) {

        //int s = 3;
/*
        if( s < 5 )
        {
            System.out.println("S is less than 5");
        }
 */    
   
/*
         if( s == 5 ) {
            System.out.println("S is equal 5");
        }
 
        else {
            System.out.println("S is not equal 5");
        }
*/
    
         /////////////////////////////////////////////////////////
 
          int number =3;
 
         if( number == 1 ) {
            System.out.println("one");
        }
 
        else if( number == 2 ) {
            System.out.println("two");
        }
 
        else if( number == 3 ) {
            System.out.println("three"); // هنا تحقق الشرط
        }
 
        else if( number >= 4 ) {
            System.out.println("four or greater");  // تشمل كل الارقام من اربعه واكبر
        }
 
        else {
            System.out.println("negative number");
        }
       
    
      
        //  Relational Operators  And >> &&    Or >> || 
        
        // اذا كانت قيمة المتغير بين الصفر والعشرين اطبع الجملة  لانه تحقق الشرطين
      
//        int a = 25;
// 
//        if( a >= 0 && a <=20 ) {
//            System.out.println("true number");
//        }
//      
//        //  اذا كانت قيمة المتغير واحد او اتنين او تلاته اطبع الجمله
//     
//        int B = 2;
// 
//        if( B == 1 || B == 2 || B == 3 ) {
//            System.out.println("'B' is a valid number");  //  بما ان الشرط الثاني تحقق نفذ امر الطباعه مباشرة ولم ينظر االى الشرط الثالث
//       }

 
    }
 
    
}
