import java.util.Scanner;

public class main extends opencv_test {

    static String input = "C:\\Users\\17367\\Desktop\\EIS\\20180227220000001.jpg";
    static String output = "C:\\Users\\17367\\Desktop\\Test\\test_" ;

    public static void main(String[] args) {
        menu menu = new menu();
        System.out.println("手动设定参数C 自动递增I 矩形识别框调整P 不调整N");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        switch (answer) {
            case "C", "c" -> menu.changeMenu();
            case "I", "i" -> menu.increaseMenu();
            case "N", "n" -> {
                System.out.println("Good Bye~");
                opencv_test.opencv(input ,output, 0);
            }
            case "P","p" -> {
                test.photo(input);
            }
            default -> System.out.println("=A=?");
        }


    }

}
