import java.util.Scanner;

public class main extends opencv_test {

    static String input = "C:\\Users\\lenovo\\Pictures\\Camera Roll\\WIN_20211209_13_55_34_Pro.jpg";
    static String output = "C:\\Users\\lenovo\\Pictures\\Camera Roll\\test\\test_";

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
                opencv_test.opencv(input, output, 0);
            }
            default -> System.out.println("=A=?");
        }


    }

}
