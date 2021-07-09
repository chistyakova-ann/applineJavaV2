package operation;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Класс ArrayWords
 */
public class ArrayWords {
    private String line;
    ArrayList arrayWords;

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public ArrayList getArrayWords() {
        return arrayWords;
    }

    public void setArrayWords(ArrayList arrayWords) {
        this.arrayWords = arrayWords;
    }
//добавление слова в массив
    public void addWord(String word) {
        ArrayList array = this.getArrayWords();
        if (array == null) {
            ArrayList array1 = new ArrayList();
            array1.add(word);
            this.setArrayWords(array1);

        }else{
//        System.out.println(word);
        array.add(word);
        this.setArrayWords(array);
        }
    }

    public ArrayList words(String line) {
        arrayWords = new ArrayList(Arrays.asList(line.split(" ")));
        return arrayWords;
    }


}
