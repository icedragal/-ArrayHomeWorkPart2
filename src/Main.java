public class Main {
    public static void main(String[] args) {
        //Task 1
        int[] arr = generateRandomArray();

        System.out.println("Задание 1");
        int sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //Task 2
        System.out.println("Задание 2");
        int minElement = 200000;
        int maxElement = -1;
        for (int j : arr) {
            if (j < minElement) {
                minElement = j;
            }
            if (j > maxElement) {
                maxElement = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minElement + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxElement + " рублей");

        //Task 3
        System.out.println("Задание 3");
        double average = sum / arr.length;
        System.out.println("Средняя сумма трат за день составила " + average + " рублей");

        //Task 4
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
