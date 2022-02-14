# Groovy Fundamentals Quick Reference

>  Apache Groovy is a **powerful**, **optionally typed** and **dynamic** language, with **static-typing and static compilation** capabilities, for the Java platform aimed at improving developer productivity thanks to a concise, **familiar and easy to learn syntax**.

<br>

Its almost used in all top organizations in combination with Grails(Web Framework). For example, 

* NetFlix who use Groovy to offer various levels of filtering and they also built a cloud management platform (called Asgard) built on Groovy and Grails.

* LinkedIn use Groovy also in their "Glu" open source deployment & monitoring automation platform.

* * * 

## Important points on groovy

1. Its dynamically typed ie., variables are not defined to use strict data types and type checking is performed at runtime. 

2. Think of like everything in groovy is an object

## References

1. [The Apache Groovy programming language - Documentation](https://groovy-lang.org/documentation.html)

2. [Groovy Language Documentation](https://docs.groovy-lang.org/next/html/documentation/)

3. [Groovy Web Console for online testing](http://groovyconsole.appspot.com/)

* * * 

## Installation

1. Install JAVA

2. Set JAVA_HOME environment variable

* * * 

## Table of Contents
1. [Hello World](#less1)
1. [Math](#less2)
1. [Strings](#less3)
1. [IO](#less4)
1. [Lists and Maps](#less5)
1. [Logical Conditions and Loops](#less6)
1. [Functions](#less7)
1. [Closure](#less8)  
1. [Files](#less9)

* * * 

<a id="less1"></a>

## Hello World

```groovy
class HelloWorld{
    static void main(String[] args){
        println("Hello World!");
        println 'Hello Again!';
        println "Hi!";
    }
}
```

In the above 

1. `static`means the function/method belongs to the class

2. `void` means function doesn't return any values

3. `string[] args` this function accepts command line arguments

### Variables

```groovy
class HelloWorld2{
    static void main(String[] args){
        
        /* Variable has to be defined to be used in the program */

        /* Dynamically Typed */
        def age = "Four";  /* String type */
        println age
        /* getClass returns the exact type of an object */
        println age.getClass() 
        // Output: class java.lang.String

        age = 4; /* Integer type */
        println age
        println age.getClass().getName()
        // Output: java.lang.Integer
    
        /* instanceof checks if obj is the subclass of some class */
        println (age instanceof List) /* Result will be True or False */
        // Output: false
        println (age instanceof Integer)
        // Output: True        
 }
}
```

### Typed Variables
```groovy 
class HelloWorld2{
    static void main(String[] args){        

        /* Typed Variables */
        String str = "Hello World!" 
        int a = 5; 
        long b = 100L; 
        float c = 10.56f; 
        double d = 10.5e40; 
        BigInteger bi = 30g; 
        BigDecimal bd = 3.5g; 

        println(str);  
        println(a)  
        println(b)  
        println(c)  
        println(d)  
        println(bi)  
        println(bd)  
 }
}
```

### Casting

```groovy
class casting{
    static void main(String[] args){        

        String str = "Hello World!"
        int a = 5; 

        println(str)
        println str.getClass().getName()

        str = "100"
        str = str.toInteger()
        str = a + str
        println(str)
        println str.getClass().getName()

        def str1 = "Hello World!"
        println(str1)

        str1 = "100"
        str1 = str1.toInteger()
        str1 = a + str1
        println(str1)
        println str1.getClass().getName()

        /* Note : Above differences of String vs. def */   

        /* Likewise there is toBigDecimal(), toBigInteger()
        , toBoolean(), toCharacter(), toDouble(), toFloat(), toList(), and toLong()
        */
 }
}
```

### Range

```groovy
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
```

More Range Examples
```groovy
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
```

**Note:**  A program will terminate when an exception is encountered. If we see a possibility of that happening, programmer should handle it.

### Handling Exception

```groovy
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
```

Note : If we know what type exception we might expect, we can mention that specifically `ArrayIndexOutOfBoundsException`

* * * 

<a id="less2"></a>

## Math Operations

```groovy
 class mathops{
     static void main(String[] args){
         try {   
            /* Integer Operations */
            println("5 + 4 = "+ (5 + 4));
            println("5 - 4 = "+ (5 - 4));
            println("5 * 4 = "+ (5 * 4));
            println("5 / 4 = "+ (5.intdiv(4)));

            /* Modulus - gets you remindier of division */ 
            println("5 % 4 = "+ (5 % 4)); 

            /* Floating point Operations */
            println("5.1 + 4.2 = "+ (5.1.plus(4.2)) );
            println("5.1 - 4.2 = "+ (5.1.minus(4.2)) );
            println("5.1 * 4.2 = "+ (5.1.multiply(4.2)) );
            println("5.1 / 4.2 = "+ (5.1/4.2));     

            // Causes ArithmeticException 
            println("5 / 0 = "+ (5.intdiv(0)));
         }catch (ArithmeticException e) {
          println('Caught divide by zero exception')
         }

          println('Ending Program')

     }
 }
```

### Order of precedence

```groovy
class oop{
    static void main(String[] args){
        println("3 + 2 * 5 = " + (3 + 2 * 5) );      //3 + (2 * 5) = 13
        println("(3 + 2) * 5 = " + ( (3 + 2) * 5) ); //25   

        def age = 10
        println("age++ = "+ (age++)); /* Print and Increment */
        println("++age = "+ (++age)); /* Increment and Print */
        println("age-- = "+ (age--));
        println("--age = "+ (--age));
    }
}
```
* [More on Operators Precedence](https://groovy-lang.org/operators.html#_operator_precedence)
* [introcs.cs.princeton.edu/java](https://introcs.cs.princeton.edu/java/11precedence/)
* [cs.bilkent.edu.tr](https://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html)


### Numeric Limits

```groovy
class limits {
    static public void main(String[] args){        

        /* Choose your datatypes based on the limits */
        
        println("Max Byte " + Byte.MAX_VALUE);      // 127
        println("Min Byte " + Byte.MIN_VALUE);      //-128

        println("Max Short " + Short.MAX_VALUE);    // 32767  
        println("Min Short " + Short.MIN_VALUE);    //-32768 

        println("Max Int " + Integer.MAX_VALUE);    // 2147483647
        println("Min Int " + Integer.MIN_VALUE);    //-2147483648

        println("Max Long " + Long.MAX_VALUE);      // 9223372036854775807
        println("Min Long " + Long.MIN_VALUE);      //-9223372036854775808

        println("Max Float " + Float.MAX_VALUE);    // 3.4028235E38
        println("Min Float " + Float.MIN_VALUE);    // 1.4E-45

        println("Max Double " + Double.MAX_VALUE);  // 1.7976931348623157E308
        println("Min Double " + Double.MIN_VALUE);  // 4.9E-324

    }
}
```

### Math Functions

```groovy
class mathFunctions{
    static void main(String[] args){

      def randNum = 2.0;
      println("Math.abs(-2.45) = " + (Math.abs(-2.45)));
      println("Math.round(2.45) = " + (Math.round(2.45)));
      println("randNum.pow(3) = " + (randNum.pow(3)));
      println("3.0.equals(2.0) = " + (3.0.equals(2.0)));
      println("randNum.equals(Float.NaN) = " + (randNum.equals(Float.NaN)));
      println("Math.sqrt(9) = " + (Math.sqrt(9)));
      println("Math.cbrt(27) = " + (Math.cbrt(27)));
      println("Math.ceil(2.45) = " + (Math.ceil(2.45)));
      println("Math.floor(2.45) = " + (Math.floor(2.45)));
      println("Math.min(2,3) = " + (Math.min(2,3)));
      println("Math.max(2,3) = " + (Math.max(2,3)));    

      // Number to the power of e    
      println("Math.log(2) = " + (Math.log(2)));

      // Base 10 logarithm
      println("Math.log10(2) = " + (Math.log10(2)));

      // Degrees and radians
      println("Math.toDegrees(Math.PI) = " + (Math.toDegrees(Math.PI)));
      println("Math.toRadians(90) = " + (Math.toRadians(90)));

      // sin, cos, tan, asin, acos, atan, sinh, cosh, tanh
      println("Math.sin(0.5 * Math.PI) = " + (Math.sin(0.5 * Math.PI)));

      // Generate random value from 1 to 100
      println("Math.abs(new Random().nextInt() % 100) + 1 = " + (Math.abs(new Random().nextInt() % 100) + 1));

    }
}
```

<a id="less3"></a>

## String Operations

Understanding Single and Double Quotes

```groovy
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
```
**Note:** With double quotes you can print variables

### String Slicing 

**Note:** Index starts from 0

```groovy
class stringSlicing{
    static void main(String[] args){
      
      def name = 'i.am.sushanth'
      //          012345
      // You can access a string by index   
      println("3rd Index of Name " + name[3]);    // m
      println("Index of . " + name.indexOf('.')); // 1
      println("Index of z " + name.indexOf('z')); // -1

      // You can also get a slice
      println("1st 4 Characters " + name[0..3]);  
      // Output: i.am

      // Get specific Characters
      println("Every Other Character " + name[0,2,4]); 
      // Output: ia.

      // Get characters starting at index
      println("Substring at 1 " + name.substring(5));
      // Output: sushanth

      // Get characters at index up to another
      println("Substring at 1 to 4 " + name.substring(1,4));
      // Output: .am

      //Spliting String
      println(name.split(''))
      // Output: [i, ., a, m, ., s, u, s, h, a, n, t, h]

      //Since input can be of regular expression(. is any character). DoubleSlash is required.
      println(name.split("\\.")) 
      // Output: [i, am, sushanth]      
    }
}
```

### More string operations

```groovy
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
```

* * * 

<a id="less4"></a>

## IO

### OUTPUT : println / printf

```groovy
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
```

### INPUT : Read typed-in value from console/terminal

```groovy
class inputReads{
    static void main(String[] args){

      print("Whats your name ");    
      def fName = System.console().readLine();
      println("Hello " + fName);

      // IF you are not reading string cast appropriately
      // toInteger, toDouble
      print("Enter a number ");
      def num1 = System.console().readLine().toDouble();
      print("Enter another ");
      def num2 = System.console().readLine().toDouble();
      printf("%.2f + %.2f = %.2f \n", [num1, num2, (num1 + num2)]);
    }
}
```

* * * 

<a id="less5"></a>

## Lists

```groovy
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
```
Note: Iterating lists in Loops Section

* * * 

## Maps/Dictionary

```groovy
class maps{
    static void main(String[] args){

      def ironMan = [
        'name' : 'Anthony "Tony" Stark',
        'Place of birth' : 'Long Island, New York',
        'Known superhuman powers' : 'none',
        'Other abilities' : ['genius', 'inventor', ]
      ];

      // Access with key
      println("Name " + ironMan['name']);
      // Output: Name Anthony "Tony" Stark

      println("One ability known for is " + ironMan['Other abilities'][1]);
      // Output: One ability known for is inventor

      println("Place of birth " + ironMan.get('Place of birth'));        //Place of birth Long Island, New York
      println("Weapons " + ironMan.getOrDefault('weapons','-'));  //-
      //-----------------------------------------------------------------------------------------

      // Add key value
      ironMan.put('weapons', 'body armor');

      //-----------------------------------------------------------------------------------------

      // Check for key
      println("Has Weapons " + ironMan.containsKey('weapons')); // true
      println("Has Weapons " + ('weapons' in ironMan));         // true
      println("Checking for value " + ironMan.containsValue('Anthony "Tony" Stark'));  //true

      //-----------------------------------------------------------------------------------------

      // Size
      println("Size " + ironMan.size());

      // Get keys of Map
      println(ironMan.keySet())
      // Output: [name, Place of birth, Known superhuman powers, Other abilities, weapons]

      // Get values of Map
      println(ironMan.values())
      // Output: [Anthony "Tony" Stark, Long Island, New York, none, [genius, inventor], body armor]

      // Remove key-value
      ironMan.remove('Place of birth');
      println(ironMan)
      // Output: [name:Anthony "Tony" Stark, Known superhuman powers:none, Other abilities:[genius, inventor], weapons:body armor]
    }
}
```

### Map of Maps

```groovy
class mapOfMaps{
    static void main(String[] args){

      def ironMan = [
        'name' : 'Anthony "Tony" Stark',
        'sh_name' : 'Iron Man',
        'Place of birth' : 'Long Island, New York',
        'Known superhuman powers' : 'none',
        'Other abilities' : ['genius', 'inventor', ],
        'weapons' : 'body armor'
      ];

      def blackWidow = [
        'name' : 'Natalia “Natasha” Alianovna Romanova',
        'sh_name' : 'Black Widow',
        'Place of birth' : 'Stalingrad, former Union of Soviet Socialist Republics now Volgograd, Russia',
        'Known superhuman powers' : 'none',
        'Other abilities' : ['Olympic class athlete'],
        'weapons' : 'Bracelets that contain both the “widow’s line” which fires her cable, and the “widow’s bite” which releases electric bolts to stun her adversaries with a charge of up to 30,000 volts. Her gloves and boots are equipped with miniature suction cups which enable her to cling to surfaces. Her belt contains plastic explosives.'
      ];

      def avengers = [:] //defining empty map

      avengers['ironMan'] = ironMan;
      avengers['blackWidow'] = blackWidow;

      print(avengers);         
    }
}
```

Info from [Marvel Directory]([Black Widow](http://www.marveldirectory.com/individuals/b/blackwidowi.htm))

### Null Safe

```groovy
class safeNavigationOper {
   static void main(String[] args) {

      /* The Safe Navigation operator is used to avoid a NullPointerException. */

      def starlord = ['name':'Peter Jason Quill']
      def iamgroot = null

      println(starlord.name)
      
      // println(iamgroot.name) // This causes java.lang.NullPointerException: Cannot get property 'name' on null object

      println(iamgroot?.name)
      // This is equvalent to  iamgroot!= null && iamgroot.name

   }
}
```

* * * 

<a id="less6"></a>

## Conditions and Logical Operators

```groovy
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
```

### Switch Statement

```groovy
class switchLogic{
    static void main(String[] args){

      def ageOld = 6;

      // Switch statement
      switch(ageOld) {
        case 16: println("You can drive");
        case 18:
          println("You can vote");
          // Stops checking the rest if true
          break;
        default: println("Have Fun");
      }

      ageOld = 15

      // Switch with list options
      switch(ageOld){
        case 0..6 : println("Toddler"); break;
        case 7..12 : println("Child"); break;
        case 13..18 : println("Teenager"); break;
        default : println("Adult");
      }

    }
}
```

* * * 

## Loops

### While Loop

```groovy
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
```

### For Loop and Each Iteration

```groovy
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
```

* * * 

<a id="less7"></a>

## Functions or Methods - mean the same

```groovy
class methodsExample{

    // This function can be defined above or below the main function.
    static def void sayHello(){
        println('Inside Function')
        println('Hello')
    }

    static void main(String[] args){
        sayHello();

        // Pass parameters
        println("5 + 4 = " + getSum(5,4)); //9
        println("5 + 0 = " + getSum(5));   //5
        println("0 + 0 = " + getSum());    //0

        // Demonstrate pass by value
        def myName = "Razor";
        passByValue(myName);
        // Output: 
        // myName : T-Bone
        // parmValue : Razor

        println("In Main : " + myName);
        // Output: Razor
    }

    static def getSum(num1=0, num2=0){
        return num1 + num2;
    }

    static def passByValue(parmValue){
        def myName = "T-Bone";
        println('myName : ' + myName);
        println('parmValue : ' + parmValue);
    }
}
```

### Passing Structures to functions

```groovy
class passingStructs{

    // Reference : http://docs.groovy-lang.org/latest/html/documentation/#_named_parameters

    static void main(String[] args){

      // Pass a list for doubling
      def listToDouble = [1,2,3,4];
      listToDouble = doubleList(listToDouble);
      println(listToDouble);

      // Pass unknown number of elements to a method
      def nums = sumAll(1,2,3,4);
      println("Sum : " + nums);
    }

    static def doubleList(list) {
        def newList = list.collect {it * 2};
        return newList;
    }

    static def sumAll(int... numList){
        def sum = 0;
        numList.each{ sum += it; }
        return sum;
    } 
}
```

### Named Parameters

```groovy
class passingStructs{

    // Reference : http://docs.groovy-lang.org/latest/html/documentation/#_named_parameters

    static void main(String[] args){

      // Maps can be named parameters 
      // - they need to be in first argument 
      // - While calling they can be in any order
      // Positional parameter must be in order
      namedParameters(text:'Hello', 1, 'string') 
      // Output: 
      // Map     : Hello
      // Integer : 1
      // String  : string

      println('-'*20)

      // Below positional parameter is not in order
      namedParameters(text:'Hello', 'string', 1)
      // Output: 
      // Map     : Hello
      // Integer : string
      // String  : 1
      // Above would fail, if function had definition like 
      // static def namedParameters(Map msg, Integer inte, String stri){

      println('-'*20)

      namedParameters(1, 'string', text:'Hello')
      // Output: 
      // Map     : Hello
      // Integer : 1
      // String  : string
    }

    static def namedParameters(Map msg, inte, stri){
        println("Map     : $msg.text");
        println("Integer : $inte");
        println("String  : $stri");
    }
}
```

### Recursion

Factorial Concept

```sh
Factorial of 4 thats 4! is
4 * 3 * 2 * 1 = 24
=================================
# Recursion Concept

n = 4 then 

n * fact(3)
-- n * fact(2)
---- n * fact(1)
=================================
# Applying values in the concept

4 * fact(3)
-- 3 * fact(2)
---- 2 * fact(1)

---- 2 * 1 = 2
-- 3 * 2   = 6
4 * 6      = 24
```

```groovy
class recursionTest{
    static void main(String[] args){
      // Calculate factorial (Recursion)
      def fact4 = factorial(4);
      println("Factorial 4 : " + fact4);            
    }

    static def factorial(num){
        if(num<=1){
            println("Return 1")
            return 1;
        }else{
            println("$num * factorial($num - 1)")
            return (num * factorial(num-1));
        }
    }
}
```

<a id="less8"></a>

## Closures - short inline functions/methods

```groovy
class closuresEx1{
    static void main(String[] args){

        println "Executing the Closure:"
        def closHW = { println "Hello World!" }        
        closHW()

        def p = { println it }
        p("Hello World!")

        //Passing parameters to a closure
        def multiply = { x, y -> x * y };
        p("Multiply(2,2) = ${multiply(2,2)}");
    }
}
```

### Closure examples

```groovy
class closuresFuncs{
    static void main(String[] args){

      // A closure can access values outside of it
      def greeting = "Hi";
      def sayHi = {theName -> println("$greeting $theName")}
      sayHi("Tony");
      // Hi Tony

      def birds = ["Parrot", "Cockatiel", "Pigeon"] as String[]         
      def reversedBirds = birds.collect { it.reverse() }         
      println reversedBirds 
      // [torraP, leitakcoC, noegiP]

      // Below code does the same thing as above. 
      // call() calls the same code to be executed.
      def getFactorial = { num -> (num <= 1) ? 1 : num * call(num - 1) }
      println("Factorial 4 : " + getFactorial(4));
      // Factorial 4 : 24
    }
}
```

### More closure examples

```groovy
class moreClosures{
    static void main(String[] args){
       // each performs an operation on each item in list
      def numList = [1,2,3,4];
      numList.each { println(it); }

      // Do the same with a map
      def avengers = [
        'ScarletWitch' : 1,
        'DrStrange' : 2,
        'AntMan' : 3,
        'CaptainMarvel' : 4,
        'Thor' : 5,
      ];      
      avengers.each { printf("\n%15s : %5d", it.key, it.value); }
      // Output: 
      //  ScarletWitch :     1
      //     DrStrange :     2
      //        AntMan :     3
      // CaptainMarvel :     4
      //          Thor :     5            

      println('')
      // Print only evens
      def randNums = [1,2,3,4,5,6];
      randNums.each {num -> if(num % 2 == 0) println(num);}

      // find returns a match
      def nameList = ['Wanda', 'Stephen', 'Scott'];
      def matchEle = nameList.find {item -> item == 'Stephen'}
      println('matchEle = ' + matchEle);

      // findAll finds all matches
      def randNumList = [1,2,3,4,5,6];
      def numMatches = randNumList.findAll {item -> item > 4}
      println("findAll = " + numMatches);
      // Output: [5, 6]

      // any checks if any item matches
      println("> 5 : " + randNumList.any {item -> item > 5});
      // Output: > 5 : true

      // every checks that all items match
      println("> 1 : " + randNumList.every {item -> item > 1});
      // Output: > 1 : false

      // collect performs operations on every item
      println("Double : " + randNumList.collect { item -> item * 2});
      // Output: Double : [2, 4, 6, 8, 10, 12]

      // pass closure to a method
      // Theres this possibility - It doesn't mean you have to do it. 
      def getEven = {num -> return(num % 2 == 0)}
      def evenNums = listEdit(randNumList, getEven);
      println("Evens : " + evenNums);   
      // Output: Evens : [2, 4, 6]
    }

    static def listEdit(list, closre){
        return list.findAll(closre)
    }
}
```

* * * 

<a id="less9"></a>

## File Operations

```groovy
class fileOps{
    static void main(String[] args){

      // Open a file, read each line and output them
      new File("test.txt").eachLine {
        line -> println "Read: $line";
      }

      // Overwrite the file
      new File("test.txt").withWriter('utf-8') {
        writer -> writer.writeLine("Line 4");
      }

      // Append the file
      File file = new File("test.txt");
      file.append('Line 5');

      // Get the file as a string
      println(file.text);

      // Get the file size
      println("File Size : ${file.length()} bytes");

      // Check if a file or directory
      println("File : ${file.isFile()}");
      println("Dir : ${file.isDirectory()}");

      // Copy file to another file
      def newFile = new File("test2.txt");
      newFile << file.text;

      newFile = new File("test3.txt");      
      newFile << file.text;

      // Delete a file
      newFile.delete();

      // Get directory files
      def dirFiles = new File("");
      
      def dlist = []
      new File('../').eachDir {dlist << it.name }
      println(dlist)
      dlist.each {
        item -> println item;
      }    
    }
}
```
