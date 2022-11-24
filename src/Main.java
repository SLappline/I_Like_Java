import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите: " + "\"I Like Java!!!\"" + " в строке ниже");
        String x = scanner.nextLine();
        //1. Проверить, содержит ли строка подстроку “Java” (используйте contains()).
        Boolean r1 = x.contains("Java");
        //2. Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
        Boolean r2 = x.startsWith("I Like");
        //3. Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
        Boolean r3 = x.endsWith("!!!");
        //4. Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
        if (r1 & r2 & r3){
            System.out.print("Строка в верхнем регистре: ");
            System.out.println(x.toUpperCase());
            //5. Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран (используйте substring()).
            System.out.print("Заменили все а на о: ");
            String result = x.replace("a", "o");
            System.out.print(result.substring(7,11));
        }
        else{
            System.out.println("Вы ввели строку не правильно...");
        }
    }
}