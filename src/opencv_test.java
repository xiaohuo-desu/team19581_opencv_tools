import org.opencv.core.*;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class opencv_test
{
    //默认参数
   static int lowH = 4;
   static int lowS = 42;
   static int lowV = 23;
   static int maxH = 67;
   static int maxS = 255;
   static int maxV = 255;

    public static void opencv(String input, String output,int change)
    {

        //动态设定值
        menu setting = new menu();
        switch (change)
        {
            case 0:
                break;
            case 1:
                lowH = setting.setLowL();
                lowS = setting.setLowA();
                lowV = setting.setLowB();
                break;
            case 2:
                maxH = setting.setMaxL();
                maxS = setting.setMaxA();
                maxV = setting.setMaxB();
                break;
            default:
                break;
        }

        System.load("E:\\下载\\opencv\\opencv\\build\\java\\x64\\opencv_java454.dll");
        System.load("E:\\下载\\opencv\\opencv\\build\\java\\x64\\opencv_videoio_ffmpeg454_64.dll");
        Mat srcImgMat = Imgcodecs.imread(input);
        Mat desImaMat = srcImgMat.clone();

        //转换
        Imgproc.cvtColor(srcImgMat, desImaMat, Imgproc.COLOR_BGR2HSV);

        //设定HSV颜色
        Scalar lowHSV = new Scalar(lowH,lowS,lowV);
        Scalar maxHSV = new Scalar(maxH,maxS ,maxV);

        //存储二值图像至desImaMat
        Core.inRange(desImaMat,lowHSV,maxHSV,desImaMat);

        //去除噪点，小于5x5的都将忽略
        Mat kernel = Imgproc.getStructuringElement(Imgproc.MORPH_RECT,new Size(5,5));
        Imgproc.morphologyEx(desImaMat,desImaMat,Imgproc.MORPH_CLOSE,kernel);

        //输出
        int test = menu.test;
        test += 1;
        Imgcodecs.imwrite(output+test+".jpg",desImaMat);

        //GUI
        HighGui.imshow("opencv",desImaMat);
        HighGui.waitKey(10);
    }

}
