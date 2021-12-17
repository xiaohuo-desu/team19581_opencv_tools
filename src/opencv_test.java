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
   static double percentage;
    static Rect ROI = new Rect(
            new Point(0, 0),
            new Point(200, 200));
    public static void opencv(String input, String output,int change)
    {
        //判断ROI是否自定义

        if(scanner.ROIchange == 1)
        {
            Rect ROI2 = scanner.setRect();
            ROI = ROI2;
        }
        //动态设定值
        menu setting = new menu();
        switch (change)
        {
            case 0:
                break;
            case 1:
                lowH = setting.setLowH();
                lowS = setting.setLowS();
                lowV = setting.setLowV();
                break;
            case 2:
                maxH = setting.setMaxH();
                maxS = setting.setMaxS();
                maxV = setting.setMaxV();
                break;
            default:
                break;
        }

        System.load("C:\\Users\\17367\\Desktop\\opencv\\build\\java\\x64\\opencv_java454.dll");
        System.load("C:\\Users\\17367\\Desktop\\opencv\\build\\java\\x64\\opencv_videoio_ffmpeg454_64.dll");
        Mat srcImgMat = Imgcodecs.imread(input);
        Mat desImaMat = srcImgMat.clone();

        //转换
        Imgproc.cvtColor(srcImgMat, desImaMat, Imgproc.COLOR_BGR2HSV);

        //设定HSV颜色
        Scalar lowHSV = new Scalar(lowH,lowS,lowV);
        Scalar maxHSV = new Scalar(maxH,maxS ,maxV);

        //存储二值图像至desImaMat
        Core.inRange(desImaMat,lowHSV,maxHSV,desImaMat);

        //识别方框内容
        Mat content = desImaMat.submat(ROI);
        double Value = Core.sumElems(desImaMat).val[0] / ROI.area() / 255;

        content.release();

        percentage = Math.round(Value * 100);
        //System.out.println("识别率为："+percentage);

        //去除噪点，小于5x5的都将忽略
        Mat kernel = Imgproc.getStructuringElement(Imgproc.MORPH_RECT,new Size(5,5));
        Imgproc.morphologyEx(desImaMat,desImaMat,Imgproc.MORPH_CLOSE,kernel);

        //输出
        int test = menu.test;
        test += 1;
        Imgcodecs.imwrite(output+test+".jpg",desImaMat);

        //识别区域上色
        Scalar colorStone = new Scalar(0, 255, 0);
        Imgproc.rectangle(desImaMat, ROI, colorStone);

        //GUI
        HighGui.imshow("opencv",desImaMat);
        HighGui.waitKey(10);
    }


}
