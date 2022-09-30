package methods;

public class Methods {

    public static void findNumber() {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0, 15, 36, 76, 2353, 657};
        int searchNumber = 3;
        boolean isExist = false;

        for (int number : numbers) {
            if (number == searchNumber) {
                isExist = true;
                break;
            }
        }
        if (isExist) {
            giveMessage("Number is exist: " + searchNumber);
        } else {
            giveMessage("Number is not exist: " + searchNumber);
        }
    }

    public static void giveMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {

        findNumber();

    }

}
