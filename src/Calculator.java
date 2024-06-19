import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два операнда (от 1 до 10) и оператор между ними (+, -, /, *)");
        String input = scanner.nextLine();
        String[] mathOperation = input.split(" ");

        if (mathOperation.length != 3) {
            throw new Exception("Строка не является математической операцией");
        }

        int num1, num2;
        char operator;

        try {
            num1 = Integer.parseInt(mathOperation[0]);
            operator = mathOperation[1].charAt(0);
            num2 = Integer.parseInt(mathOperation[2]);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Калькулятор должен принимать на вход только целые числа");
            return;
        }

        if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
            throw new Exception("Ошибка: Калькулятор должен принимать на вход целые числа от 1 до 10 включительно, не более.");
        }

        int result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println(result);
                break;
            default:
                System.out.println("Ошибка: Неверный оператор. Используйте +, -, * или /) ");
        }

        scanner.close();
    }
}