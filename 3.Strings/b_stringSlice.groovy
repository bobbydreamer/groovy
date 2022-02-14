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