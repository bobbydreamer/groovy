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