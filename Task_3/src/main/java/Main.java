public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[20];
        final int min = -10;
        final int max = 10;
        int maxMinus = -10;
        int minPlus = 10;
        int rnd = 0;
        for (int i = 0; i < 20; i++) {
            do {
                rnd = (int) rnd(min, max);
            } while (rnd > 10 | rnd < -10);

            myArray[i] = rnd;
            System.out.print(myArray[i] + " ");
        }
        for (int i = 0; i < 20; i++) {
            if (myArray[i] > 0) {
                if (myArray[i] < minPlus) {
                    minPlus = myArray[i];
                }
            } else if (myArray[i] < 0) {
                if (myArray[i] > maxMinus) {
                    maxMinus = myArray[i];
                }
            }
        }
        System.out.print("\n");
        System.out.println("Максимальный отрицательный "+maxMinus);
        System.out.println("Минимальный положительный "+minPlus);

        for (int i = 0; i < 20; i++) {
            if (myArray[i] == maxMinus) {
                myArray[i] = minPlus;
            } else if (myArray[i] == minPlus) {
                myArray[i] = maxMinus;
            }else continue;

        }
        System.out.print("\n");

        for (int i = 0; i < 20; i++) {
            System.out.print(myArray[i] + " ");
        }

    }

    public static double rnd(int min, int max) {

        max -= min;
        return (Math.random() * ++max) + min;
    }
}
