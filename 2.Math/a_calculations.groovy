 class mathops{
     static void main(String[] args){
         try {   
            /* Integer Operations */
            println("5 + 4 = "+ (5 + 4));
            println("5 - 4 = "+ (5 - 4));
            println("5 * 4 = "+ (5 * 4));
            println("5 / 4 = "+ (5.intdiv(4)));

            /* Modulus - gets you remindier of division */ 
            println("5 % 4 = "+ (5 % 4)); 

            /* Floating point Operations */
            println("5.1 + 4.2 = "+ (5.1.plus(4.2)) );
            println("5.1 - 4.2 = "+ (5.1.minus(4.2)) );
            println("5.1 * 4.2 = "+ (5.1.multiply(4.2)) );
            println("5.1 / 4.2 = "+ (5.1/4.2));     

            // Causes ArithmeticException 
            println("5 / 0 = "+ (5.intdiv(0)));
         }catch (ArithmeticException e) {
          println('Caught divide by zero exception')
         }

          println('Ending Program')

     }
 }
