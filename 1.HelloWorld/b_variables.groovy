class HelloWorld2{
    static void main(String[] args){
        
        /* Variable has to be defined to be used in the program */

        /* Dynamically Typed */
        def age = "Four";  /* String type */
        println age
        /* getClass returns the exact type of an object */
        println age.getClass() 
        // Output: class java.lang.String

        age = 4; /* Integer type */
        println age
        println age.getClass().getName()
        // Output: java.lang.Integer
    
        /* instanceof checks if obj is the subclass of some class */
        println (age instanceof List) /* Result will be True or False */
        // Output: false
        println (age instanceof Integer)
        // Output: True        
 }
}
