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
