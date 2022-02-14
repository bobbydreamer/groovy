class otherStringOperations{
    static void main(String[] args){

     def c = "Charlie";

     // Concatenate strings - Below two works same
      println("Alpha Bravo " + c);
      println("Alpha Bravo ".concat(c));

      // Uppercase and lowercase
      println("Uppercase " + c.toUpperCase());
      println("Lowercase " + c.toLowerCase());

      // Repeat a string
      def repeatStr = "-" * 50;
      println(repeatStr);

      // Check for equality
      println("Alpha == Alpha : " + ('Alpha'.equals('Alpha')));
      println("Alpha == alpha : " + ('Alpha'.equalsIgnoreCase('alpha')));

      // Get length of string
      println("Size " + repeatStr.length());

      // Remove first occurance
      println(repeatStr - "-----");

      // Replace all strings
      println(repeatStr.replaceAll('-', '-+'));
    }
}