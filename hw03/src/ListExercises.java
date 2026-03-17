import java.util.*;
import java.util.ArrayList;

public class ListExercises {
    /** Returns the total sum in a list of integers */
    public static int sum(List<Integer> L) {
        // TODO: Implement this method
        int sum = 0;
        for(int i:L){
            sum+=i;
        }
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Implement this method
        List<Integer> lst=new ArrayList<>();
        for(int i:L){
            if(i%2==0){
                lst.add(i);
            }
        }
        return lst;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Implement this method
        /*
        List<Integer> lst =new ArrayList<>();
        for(int i:L1){
            if(L2.contains(i)){
                lst.add(i);
            }
        }
        if(lst.isEmpty()){
            return null;
        }
        return lst;
        将以上思路进行优化：
        1.如果 $L1$ 的长度是 $n$，$L2$ 的长度是 $m$，那么整段代码的时间复杂度是 $O(n \times m)$。
        优化建议： 将 $L2$ 转换成 HashSet。在 HashSet 中查找元素的时间复杂度是 $O(1)$，这样总复杂度能优化到 $O(n + m)$
        2.在 Java 开发规范中，通常建议返回一个空集合（Empty List）而不是 null。
        原因： 如果返回 null，调用这个方法的人必须额外写一行 if (result != null) 来判空，否则会直接触发 NullPointerException。
        返回 Collections.emptyList() 或空列表会让代码更健壮
        3.通常“求公共元素”的预期结果是不含重复项的集合。如果需要去重，建议结果集也使用 Set

         */
        Set<Integer> set2= new HashSet<>(L2);
        List<Integer> result =new ArrayList<>();
        for(int num:L1){
            if(set2.contains(num)){
                result.add(num);
            }
        }
        return result;
    }

    public static int countOccurrencesOfWord(List<String> words, String w) {
        // TODO: Implement this method
        int count=0;
        for(String sign:words){
            if(sign.equals(w)){
                count++;
            }
        }
        return count;
    }

    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Implement this method
        int count=0;
        for(String word:words){
            for(int i = 0;i<word.length();i++){
                if(word.charAt(i)==c){
                    count++;
                }
            }
        }
        return count;
    }
}
