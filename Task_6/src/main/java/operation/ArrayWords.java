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

    public ArrayList words(String line) {
        arrayWords = new ArrayList(Arrays.asList(line.split(" ")));
        return arrayWords;
    }


}
