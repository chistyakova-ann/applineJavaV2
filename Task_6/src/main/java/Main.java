import operation.ReadFile;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Чтение из файла и создание списка слов
        ReadFile readFile = new ReadFile();
        List arrayList = readFile.readFile(".\\File.txt");

        //Сортировка списка по алфавиту
        Collections.sort(arrayList);

        //Вывод слов в алфавитном порядке
        Iterator iterator = arrayList.iterator();
        System.out.println("Слова в алфавитном порядке: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Вывод статистики: слово и количество раз, сколько оно всьреччается в файле
        TreeMap<String, Integer> count = countWord(arrayList);
        //Вывод часто используемого слова
        max(count);
    }

    /**
     * Функция для подсчета и вывода слов
     * @param countList
     * @return мапу <слово, его кол-во в тексте>
     */
    public static TreeMap<String, Integer> countWord(List countList) {
        String[] countWords = new String[countList.size()];
        for (int i = 0; i < countList.size(); i++) {
            countWords[i] = String.valueOf(countList.get(i));
        }
        TreeMap<String, Integer> count = new TreeMap<>();
        for (String word : countWords) {
            if (!count.containsKey(word)) {
                count.put(word, 0);
            }
            count.put(word, count.get(word) + 1);

        }
        System.out.println("  Статистика  ");
        for (String word : count.keySet()) {
            System.out.println(word + ": " + count.get(word));

        }
        return count;
    }

    /**
     * Нахождение и вывод слов(а) которое встречается наибольшее кол-во раз
     * @param count
     */
    public static void max(TreeMap<String, Integer> count) {
        int max = 0;

        for (Integer maxCount : count.values()) {
            if (maxCount > max)
                max = maxCount;
        }
        for (String word : count.keySet()) {
            if (count.get(word) == max) {
                System.out.println("Часто повтряющееся слово(а): "+word + " - " + count.get(word));

            }

        }

    }
}
