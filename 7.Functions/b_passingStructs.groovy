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