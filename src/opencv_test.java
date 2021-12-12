import org.opencv.core.*;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

import java.util.Scanner;

public class opencv_test
{
    //默认参数
   static int lowL = 0;
   static int lowA = -127;
   static int lowB = -127;
   static int maxL = 100;
   static int maxA = 127;
   static int maxB = 127;
   static double persentage = 0;
   //设定识别范围
   static final Rect ROI = new Rect(
           new Point(520, 280),
           new Point(690, 460));
    public static void opencv(String input, String output,int change)
    {

        //动态设定值
        menu setting = new menu();
        switch (change)
        {
            case 0:
                break;
            case 1:
                lowL = setting.setLowL();
                lowA = setting.setLowA();
                lowB = setting.setLowB();
                break;
            case 2:
                maxL = setting.setMaxL();
                maxA = setting.setMaxA();
                maxB = setting.setMaxB();
                break;
            default:
                break;
        }

        System.load("E:\\下载\\opencv\\opencv\\build\\java\\x64\\opencv_java454.dll");
        System.load("E:\\下载\\opencv\\opencv\\build\\java\\x64\\opencv_videoio_ffmpeg454_64.dll");
        Mat srcImgMat = Imgcodecs.imread(input);
        Mat desImaMat= new Mat(srcImgMat.rows(),srcImgMat.cols(), CvType.CV_32FC3);

        //转换
        Imgproc.cvtColor(srcImgMat, desImaMat, Imgproc.COLOR_BGR2Lab);

        //将LAB转换为OpenCV的屑LAB

        /*
        lowL = lowL*255/100;
        maxL = maxL*255/100;
        lowA += 128;
        maxA += 128;
        lowB += 128;
        maxB += 128;
        */

        //设定Lab颜色
        Scalar lowLAB = new Scalar(lowL,lowA,lowB);
        Scalar maxLAB = new Scalar(maxL,maxA ,maxB);

        //识别方框内容
        Mat content = desImaMat.submat(ROI);

        //识别内容的数值
        double value = Core.sumElems(content).val[0] / ROI.area() / 255;
        content.release();
        persentage = Math.round(value * 100);
        System.out.println("识别率为："+persentage);

        //存储二值图像至desImaMat
        Core.inRange(srcImgMat,lowLAB,maxLAB,desImaMat);

        //去除噪点，小于5x5的都将忽略
        Mat kernel = Imgproc.getStructuringElement(Imgproc.MORPH_RECT,new Size(5,5));
        Imgproc.morphologyEx(desImaMat,desImaMat,Imgproc.MORPH_CLOSE,kernel);

        //输出
        int test = menu.test;
        Imgcodecs.imwrite(output+test+".jpg",desImaMat);

        //识别区域上色
        Scalar colorStone = new Scalar(255, 0, 0);
        Imgproc.rectangle(desImaMat, ROI, colorStone);
        //GUI
        HighGui.imshow("opencv",desImaMat);
        HighGui.waitKey(10);
    }

}
