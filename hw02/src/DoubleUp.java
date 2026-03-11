public class DoubleUp {
   /**
     * Returns a new string where each character of the given string is repeated twice.
     * Example: doubleUp("hello") -> "hheelllloo"
     */
   public static String doubleUp(String s) {
      // TODO: Fill in this function
      /*方法二：空字符串的建立
      String result = "";
      for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        result = result + c + c;
    }
       */
      String newString =s.substring(0,1) ;
      int newlength = s.length();
      newlength += newlength;
      for(int i = 1;i < newlength;i++){
         newString += s.charAt(i / 2);

      }
      /*
      !!!空字符串
如果传入的 s 是空字符串 ""：
执行 s.substring(0, 1) 会直接抛出 StringIndexOutOfBoundsException 异常，导致程序崩溃。
建议：在处理字符串前，先判断 if (s.isEmpty()) return ""

!!!性能（针对大字符串）
在 Java 中，频繁使用 += 拼接字符串会产生大量临时对象。虽然对于 HW02 的短字符串没问题，但如果你处理几万个字符，程序会变慢。
大厂做法：使用 StringBuilder
*/

      return newString;
   }
   
   public static void main(String[] args) {
      String s = doubleUp("hello");
      System.out.println(s);
      
      System.out.println(doubleUp("cat"));
   }
}