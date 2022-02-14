class loop{
    static void main(String[] args){

      // While loop 
      def i = 0;

      while(i < 10){

        // If i is odd skip back to the beginning of the loop
        if(i % 2){
          i++;
          continue;
        }

        // If i equals 8 stop looping
        // A Condition to STOP LOOP must exist
        if(i == 8){
          break;
        }

        println(i);
        // Increment/Decrement must exist
        i++;
      }
    }
}