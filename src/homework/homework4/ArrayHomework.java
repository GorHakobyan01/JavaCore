package homework.homework4;

public class ArrayHomework {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 6, 6, 43, 54, 1, 7, 5, 2, 3};
        int n = 6;
        int quantity = 0;
        for (int tiv : numbers) {
            if (tiv == n) {
                quantity = quantity + 1;
            }
        }
        System.out.println(quantity);

        int b = 0;
        for (int i = numbers.length - 1; i > b; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        int RepeatNumber = 0;
        for (int i = 0; i < numbers.length; i++)
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    RepeatNumber++;
                }
            }
        System.out.println(RepeatNumber);
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        char [] vowel = {'ա','է','ը','ի','օ',};
        int j = 0;
        for (char a : chars) {
            for (char c : vowel) {
                if (a == c) {
                    j++;
                }
            }
        }System.out.println(j);
    }
}

