class range{
    static void main(String[] args){

    // Ranges represent a range of values in shorthand notation

      def oneTo10 = 1..10;
      def aToZ = 'a'..'z';
      def zToA = 'z'..'a';
      def array = (0..20).toArray()

      println(oneTo10); // 1..10
      println(aToZ);    // a..z
      println(zToA);    // z..a
      println(array);   // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]

      // Range type 
      println(oneTo10.getClass())  
      // Output: class groovy.lang.IntRange

      // Range needs to be converted to list to print all values
      println oneTo10.toList()
      // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

      // Since its a range, we can specify step() to jump/skip numbers
      oneTo10 = oneTo10.step(2)
      println(oneTo10.toList())
      // Output: [1, 3, 5, 7, 9]

      // step() acccepts only integer arguments, we can use by() decimal jumps
      oneTo10 = 1.0..10.0
      oneTo10 = oneTo10.by(0.5)
      println(oneTo10.toList())
      // Output: [1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0, 5.5, 6.0, 6.5, 7.0, 7.5, 8.0, 8.5, 9.0, 9.5, 10.0]

      // by() cannot be used for characters jumps
      aToZ = aToZ.step(2)
      println(aToZ.toList())
      //Output: [a, c, e, g, i, k, m, o, q, s, u, w, y]
    }
}
