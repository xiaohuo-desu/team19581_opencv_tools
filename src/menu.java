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
                System.out.println("递减H/S/V E停止");
                int exit2 = 0;
                while(exit2 == 0)
                {
                    Scanner scanner2 = new Scanner(System.in);
                    answer = scanner2.next();
                    switch (answer)
                    {
                        case "H":
                        case "h":
                            while (true)
                            {
                                String str = null;
                                if(!"e".equals(str))
                                {
                                    maxH -= 2;
                                    System.out.println("现在的H是："+maxH);
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
                        case "S":
                        case "s":
                            while (true)
                            {
                                String str = null;
                                if(!"E".equals(str)||!"e".equals(str))
                                {
                                    maxS -= 2;
                                    System.out.println("现在的S是："+maxS);
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
                        case "V":
                        case "v":
                            while (true)
                            {
                                String str = null;
                                if(!"E".equals(str)||!"e".equals(str))
                                {
                                    maxV -= 2;
                                    System.out.println("现在的V是："+maxV);
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
                System.out.println("递增H/S/V E停止");
                int exit3 = 0;
                while(exit3 == 0)
                {
                            Scanner scanner2 = new Scanner(System.in);
                            answer = scanner2.next();
                            switch (answer)
                            {
                                case "H":
                                case "h":
                                    while (true)
                                    {
                                        String str = null;
                                        if(!"E".equals(str)||!"e".equals(str))
                                        {
                                            lowH += 2;
                                            System.out.println("现在的H是："+lowH);
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
                                case "S":
                                case "s":
                                    while (true)
                                    {
                                        String str = null;
                                        if(!"E".equals(str)||!"e".equals(str))
                                        {
                                            lowS += 2;
                                            System.out.println("现在的S是："+lowS);
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
                                case "V":
                                case "v":
                                    while (true)
                                    {
                                        String str = null;
                                        if(!"E".equals(str)||!"e".equals(str))
                                        {
                                            lowV += 2;
                                            System.out.println("现在的V是："+lowV);
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
                Random r = new Random(1);
                int x = 0;
                test = 0;
                while(test<10)
                {
                    /*
                    lowL+=1;
                    opencv_test.opencv(input, output,0);
                    System.out.println("目前的参数是："+lowL);
                     */
                    //玄学调试
                    int ranlH = r.nextInt(10);
                    int ranlS = r.nextInt(50);
                    int ranlV = r.nextInt(60);
                    int ranmH = r.nextInt(70);
                    int ranmS = r.nextInt(255);
                    int ranmV = r.nextInt(255);

                    if (ranlH<ranmH&&ranlS<ranmS&&ranlV<ranmV)
                    {
                        lowH = ranlH;
                        lowS = ranlS;
                        lowV = ranlV;
                        maxH = ranmH;
                        //maxA = ranmS;
                        //maxB = ranmV;
                        x+=1;
                        opencv_test.opencv(input, output, 0);
                        System.out.println("已尝试："+x+"次");
                        if (percentage>350&&percentage<390)
                        {
                            test += 1;
                            System.out.println("---序列" + test + "---");
                            System.out.println("目前最小H的是：" + lowH);
                            System.out.println("目前最小S的是：" + lowS);
                            System.out.println("目前最小V的是：" + lowV);
                            System.out.println("目前最大H的是：" + maxH);
                            System.out.println("识别率为："+percentage);
                        }
                        //System.out.println("目前最小S的是：" + maxS);
                        //System.out.println("目前最小V的是：" + maxV);
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

    public int setLowH()
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("H最小值？");
        return scanner.nextInt();
    }
    public int setLowS()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("S最小值？");
        return scanner.nextInt();
    }
    public int setLowV()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("V最小值？");
        return scanner.nextInt();
    }
    public int setMaxH()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("H最大值？");
        return scanner.nextInt();
    }
    public int setMaxS()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("S最大值？");
        return scanner.nextInt();
    }
    public int setMaxV()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("V最大值？");
        return scanner.nextInt();
    }
}
