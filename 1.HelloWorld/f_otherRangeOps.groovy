class range{
    static void main(String[] args){

    // Ranges represent a range of values in shorthand notation

      def oneTo10 = 1..10;
      def array = (0..20).toArray()

      // Get size
      println("Size " + oneTo10.size());
      
      println("Min=" + oneTo10.min() +", Max=" + oneTo10.max())

      // Retreiving element from array
      println("2nd Item " + oneTo10.get(1));    
      // println("2nd Item " + oneTo10.get(-1));   // This fails
      println("3rd Item " + oneTo10.getAt(2));  // Works same as .get(1)
      println("3rd Item " + oneTo10.getAt(-1)); // This retreives last value

      println("Getting a out of range value = " + oneTo10[20]) //Returns null

      // Check if range contains
      println("oneTo10 contains 11 " + oneTo10.contains(11)); //false
      println("array contains 11 " + array.contains(11));     //true

      // Get first and last item
      println("Get First " + oneTo10.getFrom());    //1
      println("Get Last " + oneTo10.getTo());       //10
      println("Get second to last " + oneTo10[-2]); //9

      // Slicing Array
      println("Slicing Array = " + array[1..5])
      // Output:  [1, 2, 3, 4, 5]

    }
}
