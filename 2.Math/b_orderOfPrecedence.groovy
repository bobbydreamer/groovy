/* Links to Precedence - Same as Java
   https://introcs.cs.princeton.edu/java/11precedence/
   https://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
*/
class oop{
    static void main(String[] args){
        println("3 + 2 * 5 = " + (3 + 2 * 5) );      //3 + (2 * 5) = 13
        println("(3 + 2) * 5 = " + ( (3 + 2) * 5) ); //25   

        def age = 10
        println("age++ = "+ (age++)); /* Print and Increment */
        println("++age = "+ (++age)); /* Increment and Print */
        println("age-- = "+ (age--));
        println("--age = "+ (--age));
    }
}
