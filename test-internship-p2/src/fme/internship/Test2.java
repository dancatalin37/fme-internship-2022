/*______________________________________________________________________________________________________
 * 
 * Write a Java program that reads text from a file and prints out the third most frequent word(s)
 * in the text. If there is more than one word they will all be printed. 
 * 
 * The text contains only alpha-numerical characters and spaces, 
 * and words are delimited by one or more spaces.
 * _____________________________________________________________________________________________________
 * 
 * 
 * Example:
 * 
 *______________________________________________________________________________________________________
 *
 *  Input: test.in
 *      
 *       test1 test2 test3 test1 test test2 test2
 *       test1 test3 test1 test test0
 *       
 *  Output:
 *      test3, test
 *______________________________________________________________________________________________________
 *
 *______________________________________________________________________________________________________ 
 */

package fme.internship;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 
 * @author <full name>
 * @email <email address>
 * 
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        System.out.println("FME Internship - Test2");

        String line;
        FileReader fileReader = new FileReader("test-internship-p2/src/test.in");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        HashMap<String, Integer> map = new LinkedHashMap<>();

        while ((line = bufferedReader.readLine()) != null) {
            String[] textLine = line.split(" ");
            for(String word : textLine) {
                if(!word.isEmpty()){
                    if(map.containsKey(word)) {
                        map.put(word, map.get(word) + 1);
                    } else {
                        map.put(word, 1);
                    }
                }
            }
        }
        int count = 0;
        int value = 0;
        for(Map.Entry<String, Integer> pair : map.entrySet()){
            if(count == 2){
                value = pair.getValue();
            }
            if(pair.getValue() == value){
                System.out.println(pair.getKey());
            }
            count++;
        }
    }
}