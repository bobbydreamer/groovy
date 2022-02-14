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