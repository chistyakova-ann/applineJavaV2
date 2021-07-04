package operation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Класс ReadFile
 * Осуществляет чтение из файла
 */
public class ReadFile {
    /**
     * @param path
     * @return список слов
     */
    public ArrayList readFile(String path) {
        ArrayWords line = new ArrayWords();
        try {
            FileReader fr = new FileReader(path);
            Scanner scanner = new Scanner(fr);
            line.setLine(scanner.nextLine());

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return line.words(line.getLine());
    }

}
