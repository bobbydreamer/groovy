class lists{
    static void main(String[] args){

      // Lists hold a list of objects with an index
      def primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89];
      //Index       0  1  2  3  4   5   7   8

      println primes.getClass() 
      // Output: class java.util.ArrayList

      //-----------------------------------------------------------------------------------------
      // Get a value at an index
      println("2nd Prime " + primes[1]);
      // Output: 3
      
      // Using get Vs. getAt - getAt can traverse in reverse order as well, similar to python
      println("3rd Prime " + primes.get(2));
      println("3rd Prime " + primes.getAt(2));
      // Output: 5
      println("Last Prime in list " + primes.getAt(-1));
      // Output: 89      

      //-----------------------------------------------------------------------------------------
      // Slicing Array
      println("Slicing Array = " + primes[1..5])
      // Output: Slicing Array = [3, 5, 7, 11, 13]

      // Splitting Array. Evenly 
      def listOfLists = primes.collate(10)
      println(listOfLists)
      // Output: [[2, 3, 5, 7, 11, 13, 17, 19, 23, 29], [31, 37, 41, 43, 47, 53, 59, 61, 67, 71], [73, 79, 83, 89]]

      //-----------------------------------------------------------------------------------------
      // Lists can hold different datatypes
      def employee = ['Tony', 45, 9.01, [1,2,3]];
      //               0      1   2    3[0,1,2]
      println("2nd Number " + employee[3][1]); // 2

      //-----------------------------------------------------------------------------------------
      // Checking list contents
      def contained = employee.contains( 'Tony' )
      println('Does employee contains Tony = ' + contained) // true
      // or
      contained = 'Tony' in employee
      println('Is Tony in employee = ' + contained) // true

      // Check for multiple contents
      println('Checking if all values are in array = ' + employee.containsAll(['Tony',9.01])) // true
      println('Checking if all values are in array = ' + employee.containsAll(['Tony',7.01])) // false

      //Replace all elements in the list
      Collections.replaceAll(employee, 'Tony', 'Stark')
      println(employee)

      //-----------------------------------------------------------------------------------------

      // Get the length
      println("Length " + primes.size()); // 24

      // Adding to the end of the list
      primes<<17;
      primes.add(19); 
      
      //Pushes item to the front of the list
      primes.push(23)  
      println("Current Primes = " + primes)
      // Output: [23, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 17, 19]

      println("Length " + primes.size()); // 27
      println('First=' + primes.first() + ', Last=' + primes.last())
      // Output: First=23, Last=19

      // Pop removes item from front of the list
      println("Item popped = " + primes.pop() + ', Current list = ' + primes);
      // Output: Item popped = 23, Current list = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 17, 19]      

      // removeLast removes item from end of the list
      println("removeLast = " + primes.removeLast() + ', Current list = ' + primes);
      // Output: removeLast = 19, Current list = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 17]

      println("Length " + primes.size()); // 25

      // Adding some duplicate values
      primes << 41 << 43 << 47 ;
      println("Length " + primes.size()); // 28

      // Calling unique() function - Sorts and removes duplicates inline
      println('Unique Values = ' + primes.unique().size()) //24

      //-----------------------------------------------------------------------------------------
      // Concatenate 2 Lists
      primes = primes + [29,31];
      println("Length " + primes.size()); // 26

      def temp = primes.findAll{element -> element == 31} // This uses closure technique to find values
      println("Number of 31 = " + temp) // [31, 31]

      // Removing 31s from array
      primes = primes - [31];
      println("Length " + primes.size()); // 24

      //-----------------------------------------------------------------------------------------
      // Check if empty
      println("Is empty " + primes.isEmpty());

      // Get matches
      println("Matches " + primes.intersect([2,3,6])); //[2,3]

      // Reverse
      println("Current Primes = " + primes)
      // Output: Current Primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 29]
      println("Reverse " + primes.reverse());
      // Output: Reverse [29, 89, 83, 79, 73, 71, 67, 61, 59, 53, 47, 43, 41, 37, 29, 23, 19, 17, 13, 11, 7, 5, 3, 2]

      // Sorted
      primes = primes.sort()
      println("Sorted " + primes);

      //-----------------------------------------------------------------------------------------

      //Spread operator:  invoke an action on all items of an aggregate object.
      def technologies = ['Groovy','Grails','Gradle']
      println(technologies*.toUpperCase())

    }
}