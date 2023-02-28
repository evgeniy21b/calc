import java.util.Scanner;

class Main {
    static int x;
    static int y;
    static int result;

    static char operator;
    static String inResult;

    public static void main(String[] args) throws Exception {
        System.out.println("Введите два числа и оператор:");
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        calc(S);


        System.out.println("Результат: \n" + inResult);

    }

    public static String calc(String input) throws Exception {
        String[] numbers = input.split(" ");
        if (numbers.length != 3) {
            throw new Exception("Неправильное значение");
        }
        try {
            x = Integer.parseInt(numbers[0]);
            operator = numbers[1].charAt(0);
            y = Integer.parseInt(numbers[2]);
            result = operations(x, operator, y);
        } catch (Exception e) {
            System.out.println(e);
        }
        return inResult = "" + result;

    }

    private static int operations(int x, char operator, int y) throws Exception {
        check(x, y);
        return switch (operator) {
            case '+' -> result = x + y;
            case '-' -> result = x - y;
            case '*' -> result = x * y;
            case '/' -> result = x / y;
            default -> throw new Exception("Ты косякнул, братишка");
        };
    }

    private static void check(int x, int y) throws Exception {
        if (x < 1 || x > 10 || y < 1 || y > 10) {
            throw new Exception("Ты косякнул, братишка");
        }

    }
}
