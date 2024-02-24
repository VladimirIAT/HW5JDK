public class Main {
    public static void main(String[] args) {
        int count = 0;
        int[] myArray = new int[5];
        int i = 0;
        do {
            if (myArray[i] < 3) {
                myArray[i]++;
                System.out.println("Философ " + (i + 1) + " поел " + myArray[i] + " раз/а");
                count++;
                i = i + 2;
            } else {
                i++;
            }

            if (i > 4) {
                i = i - 5;
            }

        } while (count < 15);
        System.out.println("Все накормлены");

    }
}
