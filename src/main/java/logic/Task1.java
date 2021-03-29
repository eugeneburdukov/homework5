package logic;

public class Task1 {
    /*Дана строка символов. Выделить подстроку между первой и второй точками и вывести ее на экран монитора.*/

    public static final String TEXT = "Hello Eugene. It's Jason. How are you?";

    public static void main(String[] args) {

        String text1 = TEXT.substring(TEXT.indexOf(".") + 1);
        String text2 = text1.substring(1, text1.indexOf("."));
        System.out.println(text2);
    }
}
