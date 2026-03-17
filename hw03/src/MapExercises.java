import Jama.util.Maths;
import net.sf.saxon.expr.Component;

import java.util.*;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        // TODO: Implement this method
        Map<Character,Integer> letterToNum =new TreeMap<>();
        for(char c='a';c<='z';c++){
            letterToNum.put(c,c-'a'+1);
        }/*此处对字符和数字之间的转换的理解更深了*/
        return letterToNum;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        // TODO: Implement this method
        Map<Integer,Integer> squares = new TreeMap<>();
        for(int i: nums){
            squares.put(i, i*i);
        }
        return squares;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        // TODO: Implement this method
        Map<String, Integer> countWords = new HashMap<>();
        for (String word : words) {
            if (countWords.containsKey(word)) {
                int oldvalue = countWords.get(word);
                countWords.put(word, oldvalue + 1);
            } else {
                countWords.put(word, 1);
            }

        }
        return countWords;
    }
    }
/*方法二：
for (String word : words) {
        // getOrDefault 的意思是：如果 word 存在，取它的值；如果不存在，取默认值 0
        // 然后统一 +1 并存回去
        countwords.put(word, countwords.getOrDefault(word, 0) + 1);
    }*/