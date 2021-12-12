import java.util.Random;
import java.util.Scanner;

public class menu extends main
{
    static int test = 0;
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
        System.out.println("递减MAX（M）递增 LOW（L） Test（T） 输入E退出");
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
            case "T":
            case "t":
                int x = 0;
                Random r = new Random(1);
                int times = 0;
                while(times<100000)
                {
                    /*
                    lowL+=1;
                    opencv_test.opencv(input, output,0);
                    System.out.println("目前的参数是："+lowL);
                     */
                    //玄学调试
                    int ranlL = r.nextInt(100);
                    int ranlA = r.nextInt(127);
                    int ranlB = r.nextInt(127);
                    int ranmL = r.nextInt(100);
                    int ranmA = r.nextInt(127);
                    int ranmB = r.nextInt(127);

                    if (ranlL<ranmL&&ranlA<ranmA&&ranlB<ranmB) {
                        x=x+1;
                        lowL = ranlL;
                        lowA = ranlA;
                        lowB = ranlB;
                        maxL = ranmL;
                        maxA = ranmA;
                        maxB = ranmB;
                        opencv_test.opencv(input, output, 0);
                        times+=1;
                        System.out.println("已尝试"+times+"次");
                        if (persentage>80)
                        {
                            test += 1;
                            System.out.println("---序列" + test + "---");
                            System.out.println("目前L的参数是：" + lowL);
                            System.out.println("目前A的参数是：" + lowA);
                            System.out.println("目前B的参数是：" + lowB);
                            System.out.println("目前L的参数是：" + maxL);
                            System.out.println("目前A的参数是：" + maxA);
                            System.out.println("目前B的参数是：" + maxB);
                            System.out.println("识别率为："+persentage+"%");
                        }
                    }
                    //System.out.println("按任意键继续");
                    //Scanner temp = new Scanner(System.in);
                    //String str = null;
                    //str = temp.next();
                }

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
