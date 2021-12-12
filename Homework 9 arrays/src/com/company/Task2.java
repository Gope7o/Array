public class Task2 {

    public static void main(String[] args) {
        int[] numberArrayOne= {1, 2, 3, 4, 5, 1};
        int[] numberArrayTwo = {4, 10, 2, 6, 20};
        int []result = new int[numberArrayOne.length];
        for(int numbers1 : numberArrayOne) {
            for (int numbers2 : numberArrayTwo) {
                if (numbers1 == numbers2) {
                    System.out.print(numbers1 + ",");
                }
            }
        }
    }
}
