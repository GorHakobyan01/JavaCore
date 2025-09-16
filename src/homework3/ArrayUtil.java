package homework3;


public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println(numbers[0]);
        System.out.println(numbers.length - 1);
        System.out.println(numbers.length);
        int amenamecTiv = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < amenamecTiv) {
                amenamecTiv = numbers[i];
                System.out.println(amenamecTiv);
            }
        }

        if (numbers.length > 2) {
            if (numbers.length % 2 == 0) {
                System.out.println(numbers[numbers.length / 2]);
                System.out.println(numbers[(numbers.length / 2) - 1]);
            }
            if (numbers.length % 2 != 0) {
                System.out.println(numbers[numbers.length / 2]);
            }
        }

        if (numbers.length <= 2) {
            System.out.println("can't print middle values");
        }

        int zuygeriQanak = 0;
        int kenteriQanak = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                zuygeriQanak++;
            }

            if (numbers[i] % 2 != 0) {
                kenteriQanak++;
            }
        }

        System.out.println(zuygeriQanak);
        System.out.println(kenteriQanak);

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);

        double average = sum / numbers.length;
        System.out.println(average);
    }

}
