class exceptionTest {
   static void main(String[] args) {
      try {
             def oneTo10 = 1..10;
             println oneTo10.toList()

             println("2nd Item " + oneTo10.get(-1)); //throws exception
             
             println("This is never reached")
             
      } catch(Exception ex) {
         println("Catching the exception:");
         println(ex)
      }

      println("This gets printed");
   }
}
