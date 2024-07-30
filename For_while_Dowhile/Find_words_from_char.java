package For_while_Dowhile;

import java.util.ArrayList;
import java.util.List;

public class Find_words_from_char {
    public static void main(String[] args) {
        String [] words = {"Leet", "code"};
        char x = 'e';
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < words.length; i++){
            if(words[i].indexOf(x) != -1){
                lst.add(i);
            }
        }
        System.out.println(lst);
    }
}
