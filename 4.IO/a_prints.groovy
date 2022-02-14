class prints{
    static void main(String[] args){

      // Double quotes - variable value will be printed
      def abc = "Alpha Bravo Charlie";
      println("$abc Delta");

      def oneTo10 = 1..10;
      println("Min= ${oneTo10.min()}, Max=${oneTo10.max()}")

      // You can do the same thing with printf
      printf("- %s - \n", abc);

      // Sophisticated approach
      printf("%-15s | %d | %.2f | %10s \n", ['String', 17, 1.234, 'big']);
      // Output: String          | 17 | 1.23 |        big
      //         lefAligned                   rightAligned

      println("\nLimits using print formatting")
      printf("\n%-10s %25d %25d",'Byte', Byte.MIN_VALUE, Byte.MAX_VALUE)
      printf("\n%-10s %25d %25d",'Short', Short.MIN_VALUE, Short.MAX_VALUE)
      printf("\n%-10s %25d %25d",'Integer', Integer.MIN_VALUE, Integer.MAX_VALUE)
      printf("\n%-10s %25d %25d",'Long', Long.MIN_VALUE, Long.MAX_VALUE)
      printf("\n%-10s %25f %f",'Float', Float.MIN_VALUE, Float.MAX_VALUE)    // Big Values
      printf("\n%-10s %25f %f",'Double', Double.MIN_VALUE, Double.MAX_VALUE) // Big Values
      printf("\n%-10s %25s %25s",'Float', Float.MIN_VALUE, Float.MAX_VALUE)
      printf("\n%-10s %25s %25s",'Double', Double.MIN_VALUE, Double.MAX_VALUE)      
    }
}