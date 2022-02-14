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