class safeNavigationOper {
   static void main(String[] args) {

      /* The Safe Navigation operator is used to avoid a NullPointerException. */

      def starlord = ['name':'Peter Jason Quill']
      def iamgroot = null

      println(starlord.name)
      
      // println(iamgroot.name) // This causes java.lang.NullPointerException: Cannot get property 'name' on null object

      println(iamgroot?.name)
      // This is equvalent to  iamgroot!= null && iamgroot.name

   }
}
