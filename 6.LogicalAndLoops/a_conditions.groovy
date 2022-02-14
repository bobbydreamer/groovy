class condLogical{
    static void main(String[] args){

    // Conditonal Operators : ==, !=, >, <, >=, <=
    // Logical Operators : && || !

      def ageOld = 6;

      if(ageOld == 5){
        println("Go to Kindergarten");
      } else if((ageOld > 5) && (ageOld < 18)) {
        printf("Go to grade %d \n", (ageOld - 5));
      } else {
        println("Go to College");
      }

      def canVote = true;

      // Ternary operator
      println(canVote ? "Can Vote" : "Can't Vote");

      String number = "66"
      if (number.isInteger()) {
        int value = number as Integer
        println('Value = ' + value)
      }else{
        println('NaN')
      }

      // Above condition to inline using ternary operator      
      def num = number.isInteger() ? number.toInteger() : null
      println("num = $num")

      number = "66A"
      num = number.isInteger() ? number.toInteger() : null
      println("num = $num")

    }
}