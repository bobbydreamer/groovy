class loop{
    static void main(String[] args){

      // Normal for loop
      println('Normal for loop : ')
      for (def i = 0; i < 5; i++) {
        print(i+', ');
      }
      // Output: 0, 1, 2, 3, 4,
      println('')

      // for loop with a range
      println('For loop with a range : ')
      for(j in 2..6){
        print(j + ', ');
      }
      // Output: 2, 3, 4, 5, 6,
      println('')

      // for loop with a list 
      println('For loop with list : ')
      def randList = [10,12,13,14]; 
      for(j in randList){
        print(j + ', ');
      }
      // Output: 10, 12, 13, 14,
      println('')

      // for loop with a map
      println('For loop with MAP : ')
      def custs = [
        100 : "Paul",
        101 : "Sally",
        102 : "Sue"
      ];

      for(cust in custs){
        println("$cust.value : $cust.key ");
      }    
      // Output: 
      // Paul : 100
      // Sally : 101
      // Sue : 102

      // Iterate over elements of a list
      println('Iterate with each closure : ')
      randList.each { println "Numbers: $it"}
      // Output: 
      // Numbers: 10
      // Numbers: 12
      // Numbers: 13
      // Numbers: 14      

      println('Iterate with each with index closure : ')
      randList.eachWithIndex { it, i -> println "$i: $it"}
      // Output: 
      // 0: 10
      // 1: 12
      // 2: 13
      // 3: 14      

    }
}