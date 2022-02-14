/*
Factorial of 4 thats 4! is
4 * 3 * 2 * 1 = 24
=================================
# Recursion Concept

n = 4 then 

n * fact(3)
-- n * fact(2)
---- n * fact(1)
=================================
# Applying values in the concept

4 * fact(3)
-- 3 * fact(2)
---- 2 * fact(1)

---- 2 * 1 = 2
-- 3 * 2   = 6
4 * 6      = 24
*/

class recursionTest{
    static void main(String[] args){
      // Calculate factorial (Recursion)
      def fact4 = factorial(4);
      println("Factorial 4 : " + fact4);            
    }

    static def factorial(num){
        if(num<=1){
            println("Return 1")
            return 1;
        }else{
            println("$num * factorial($num - 1)")
            return (num * factorial(num-1));
        }
    }

}