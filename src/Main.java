import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
        int b;
        int result = 0;
        System.out.println("_____________________<<Введите арифметическую операцию>>________________________");
        System.out.println(calc(String.valueOf(result)));
    }

    public static String calc(String input) {

        String arithmeticSigns, input1, output;


                String[] nums = scanner.nextLine().replaceAll("\\s", "").split("");

                input = nums[0];
                arithmeticSigns = nums[1];
                input1 = nums[2];


                int x = Integer.parseInt(input);
                int y = Integer.parseInt(input1);
                int result = 0;


                switch (arithmeticSigns) {
                    case "+":
                        result = x + y;
                        break;
                    case "-":
                        result = x - y;
                        break;
                    case "/":
                        result = x / y;
                        break;
                    case "*":
                        result = x * y;
                        break;
                    default:
                        System.out.println("Ошибка!");
                        break;
                }
                output = Integer.toString(result);


                return output;
            }

        }

