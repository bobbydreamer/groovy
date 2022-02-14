class stringOperations{
    static void main(String[] args){

      def name = "Sushanth";

      //Due to single quotes all characters within quotes are printed. 
      println('I am ${name}\n');
      // Output: I am ${name}

      //Due to double quotes groovy recognizes string placeholder 
      print("I am $name \n");
      // Output: I am Sushanth

      //When using any functions use curly braces
      println("I am ${name.reverse()}");
      // Output: I am Sushanth
      // 

      // Triple quoted strings continue over many lines
      def multString = '''Alpha
      Bravo
      Charlie
      Delta''';
      println(multString);              

      def b='Bravo', c='Charlie'
      multString = """Alpha
      $b
$c
Delta"""      
      println(multString);
    }
}