import java.util.Scanner;

public class main extends opencv_test {

    static String input = "C:\\Users\\lenovo\\Pictures\\Camera Roll\\WIN_20211202_17_41_10_Pro.jpg";
    static String output = "C:\\Users\\lenovo\\Pictures\\Camera Roll\\test\\test.jpg";

    public static void main(String[] args) {
        menu menu = new menu();
        System.out.println("手动设定参数C 自动递增I 不调整N");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        switch (answer) {
            case "C", "c" -> menu.changeMenu();
            case "I", "i" -> menu.increaseMenu();
            case "N", "n" -> {
                System.out.println("Good Bye~");
            }
            default -> System.out.println("=A=?");
        }


    }

}
