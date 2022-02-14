class closuresFuncs{
    static void main(String[] args){

      // A closure can access values outside of it
      def greeting = "Hi";
      def sayHi = {theName -> println("$greeting $theName")}
      sayHi("Tony");
      // Hi Tony

      def birds = ["Parrot", "Cockatiel", "Pigeon"] as String[]         
      def reversedBirds = birds.collect { it.reverse() }         
      println reversedBirds 
      // [torraP, leitakcoC, noegiP]

      // Below code does the same thing as above. 
      // call() calls the same code to be executed.
      def getFactorial = { num -> (num <= 1) ? 1 : num * call(num - 1) }
      println("Factorial 4 : " + getFactorial(4));
      // Factorial 4 : 24

    }
}