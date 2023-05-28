import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в калькулятор!");
        System.out.println("Это простое приложение позволяет выполнять арифметические операции над двумя числами.");

        Scanner scanner = new Scanner(System.in);

        double num1 = readNumber("Введите первое число: ", scanner);
        double num2 = readNumber("Введите второе число: ", scanner);

        System.out.println("Выберите операцию: ");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        int choice = readChoice(scanner);

        double result = 0;

        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка: Деление на ноль!");
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Неверный выбор операции.");
        }

        System.out.println("Результат: " + result);

        scanner.close();
    }

    private static double readNumber(String message, Scanner scanner) {
        double number;
        while (true) {
            try {
                System.out.print(message);
                number = scanner.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Ошибка: Введите корректное число!");
                scanner.nextLine();
            }
        }
        return number;
    }

    private static int readChoice(Scanner scanner) {
        int choice;
        while (true) {
            try {
                System.out.print("Ваш выбор: ");
                choice = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Ошибка: Введите корректный выбор!");
                scanner.nextLine();
            }
        }
        return choice;
    }
}
