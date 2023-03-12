//К калькулятору из предыдущего дз добавить логирование.

import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

//import static jdk.vm.ci.meta.JavaKind.Char;

public class Task_4 {
    static void task_4() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число : ");
        int num = in.nextInt();
        calcLog(Integer.toString(num));
        Scanner in2 = new Scanner(System.in);
        System.out.println("Введите оператор ( *,/,+,-) : ");
        char operator = in.next().charAt(0);
        calcLog(Character.toString(operator));
        Scanner in3 = new Scanner(System.in);
        System.out.println("Введите второе число : ");
        int num2 = in.nextInt();
        calcLog(Integer.toString(num2));
        double result;

        switch (operator) {
            case '+':
                result = num + num2;
                calcLog("=");
                calcLog(Integer.toString((int) result));
                break;
            case '-':
                result = num - num2;
                calcLog("=");
                calcLog(Integer.toString((int) result));
                break;
            case'*':
                result = num * num2;
                calcLog("=");
                calcLog(Integer.toString((int) result));
                break;
            case '/':
                result = num / num2;
                calcLog("=");
                calcLog(Integer.toString((int) result));
                break;
            default:
                System.out.println("Не знаком пока с такой операцией");
                return;
        }
        System.out.printf("Результат вычисления : " + num + " " + operator  + " " + num2 + " = " + result);
        System.out.println("\nЛогирование добавлено в файл log4.txt");
    }

    private static void calcLog(String message) {
        try {
            FileWriter writer = new FileWriter("log4.txt", true);
            writer.write(message + "\n");
            writer.close();
        } catch (Exception e) {
            System.out.println("Ошибка записи в лог-файл");
        }
    }

}
