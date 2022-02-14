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