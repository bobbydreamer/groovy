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