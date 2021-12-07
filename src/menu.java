import java.util.Scanner;

public class menu extends main
{
    public void changeMenu()
        {
            String input = main.input;
            String output = main.output;
            int exit = 0;
            int exit2 = 0;

                while (exit == 0) {
                    System.out.println("需要调整MAX(M) LOW(L) 输入E退出");
                    Scanner scanner = new Scanner(System.in);
                    String answer = scanner.next();
                    switch (answer) {
                        case "M":
                        case "m":
                            opencv_test.opencv(input, output, 2);
                            break;
                        case "L":
                        case "l":
                            opencv_test.opencv(input, output, 1);
                            break;
                        case "I":
                        case "i":
                            break;
                        case "E":
                        case "e":
                            opencv_test.opencv(input, output, 0);
                            exit = 1;
                            break;
                        default:
                            System.out.println("=A=?");
                    }
                }
            }
    public void increaseMenu()
    {
        int exit = 0;
        while (exit == 0)
        {
        System.out.println("递减MAX（M）递增 LOW（L）输入E退出");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        switch (answer)
        {
            case "M":
            case "m":
                System.out.println("递减L/A/B E停止");
                int exit2 = 0;
                while(exit2 == 0)
                {
                    Scanner scanner2 = new Scanner(System.in);
                    answer = scanner2.next();
                    switch (answer)
                    {
                        case "L":
                        case "l":
                            while (true)
                            {
                                String str = null;
                                if(!"e".equals(str))
                                {
                                    maxL -= 2;
                                    System.out.println("现在的L是："+maxL);
                                    opencv_test.opencv(input, output,0);
                                    System.out.println("按任意键继续，E停止");
                                    Scanner temp = new Scanner(System.in);
                                    str = temp.next();
                                }
                                else
                                    {
                                    break;
                                }
                            }
                            break;
                        case "A":
                        case "a":
                            while (true)
                            {
                                String str = null;
                                if(!"E".equals(str)||!"e".equals(str))
                                {
                                    maxA -= 2;
                                    System.out.println("现在的A是："+maxA);
                                    opencv_test.opencv(input, output,0);
                                    System.out.println("按任意键继续，E停止");
                                    Scanner temp = new Scanner(System.in);
                                    str = temp.next();
                                }
                                else
                                {
                                    break;
                                }
                            }
                            break;
                        case "B":
                        case "b":
                            while (true)
                            {
                                String str = null;
                                if(!"E".equals(str)||!"e".equals(str))
                                {
                                    maxB -= 2;
                                    System.out.println("现在的B是："+maxB);
                                    opencv_test.opencv(input, output,0);
                                    System.out.println("按任意键继续，E停止");
                                    Scanner temp = new Scanner(System.in);
                                    str = temp.next();
                                }
                                else
                                {
                                    break;
                                }
                            }
                            break;
                        case "E":
                        case "e":
                            exit2 = 1;
                            break;
                        default:
                            System.out.println("=A=?");
                    }
                }
                    case "L":
                    case "l":
                        System.out.println("递增L/A/B E停止");
                        int exit3 = 0;
                        while(exit3 == 0)
                        {
                            Scanner scanner2 = new Scanner(System.in);
                            answer = scanner2.next();
                            switch (answer)
                            {
                                case "L":
                                case "l":
                                    while (true)
                                    {
                                        String str = null;
                                        if(!"E".equals(str)||!"e".equals(str))
                                        {
                                            lowL += 2;
                                            System.out.println("现在的L是："+lowL);
                                            opencv_test.opencv(input, output,0);
                                            System.out.println("按任意键继续，E停止");
                                            Scanner temp = new Scanner(System.in);
                                            str = temp.next();
                                        }
                                        else
                                        {
                                            break;
                                        }
                                    }
                                    break;
                                case "A":
                                case "a":
                                    while (true)
                                    {
                                        String str = null;
                                        if(!"E".equals(str)||!"e".equals(str))
                                        {
                                            lowA += 2;
                                            System.out.println("现在的A是："+lowA);
                                            opencv_test.opencv(input, output,0);
                                            System.out.println("按任意键继续，E停止");
                                            Scanner temp = new Scanner(System.in);
                                            str = temp.next();
                                        }
                                        else
                                        {
                                            break;
                                        }
                                    }
                                    break;
                                case "B":
                                case "b":
                                    while (true)
                                    {
                                        String str = null;
                                        if(!"E".equals(str)||!"e".equals(str))
                                        {
                                            lowB += 2;
                                            System.out.println("现在的B是："+lowB);
                                            opencv_test.opencv(input, output,0);
                                            System.out.println("按任意键继续，E停止");
                                            Scanner temp = new Scanner(System.in);
                                            str = temp.next();
                                        }
                                        else
                                        {
                                            break;
                                        }
                                    }
                                    break;
                                case "E":
                                case "e":
                                    exit2 = 1;
                                    break;
                                default:
                                    System.out.println("=A=?");
                            }
                        }
                        break;
                    case "E":
                    case "e":
                        opencv_test.opencv(input, output,0);
                        exit = 1;
                        break;
                    default:
                        System.out.println("=A=?");
                }

            }
    }

    public int setLowL()
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("L最小值？");
        return scanner.nextInt();
    }
    public int setLowA()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A最小值？");
        return scanner.nextInt();
    }
    public int setLowB()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("B最小值？");
        return scanner.nextInt();
    }
    public int setMaxL()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("L最大值？");
        return scanner.nextInt();
    }
    public int setMaxA()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A最大值？");
        return scanner.nextInt();
    }
    public int setMaxB()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("B最大值？");
        return scanner.nextInt();
    }
}
