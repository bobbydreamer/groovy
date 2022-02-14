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