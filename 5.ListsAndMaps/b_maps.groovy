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