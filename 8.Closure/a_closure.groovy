class closuresEx1{
    static void main(String[] args){

        println "Executing the Closure:"
        def closHW = { println "Hello World!" }        
        closHW()

        def p = { println it }
        p("Hello World!")

        //Passing parameters to a closure
        def multiply = { x, y -> x * y };
        p("Multiply(2,2) = ${multiply(2,2)}");

    }
}