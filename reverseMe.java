public class reverseMe {

static String reverseMe(String s) {
   if(s.length() == 0)
     return "";
   return s.charAt(s.length() - 1) + reverseMe(s.substring(0,s.length()-1));
 }
}