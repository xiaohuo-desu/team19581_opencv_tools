import org.opencv.core.*;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class opencv_test
{
    //默认参数
   static int lowH = 98;
   static int lowS = 230;
   static int lowV = 80;
   static int maxH = 100;
   static int maxS = 255;
   static int maxV = 255;
   static double percentage;


    static final Rect ROI = new Rect(
            new Point(600, 350),
            new Point(650, 380));

    public static void opencv(String input, String output,int change)
    {

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

        System.load("E:\\下载\\opencv\\opencv\\build\\java\\x64\\opencv_java454.dll");
        System.load("E:\\下载\\opencv\\opencv\\build\\java\\x64\\opencv_videoio_ffmpeg454_64.dll");
        Mat srcImgMat = Imgcodecs.imread(input);
        Mat srcHSV = srcImgMat.clone();
        Mat mask = srcImgMat.clone();

        //转换
        Imgproc.cvtColor(srcImgMat, srcHSV, Imgproc.COLOR_BGR2HSV);

        //设定HSV颜色
        Scalar lowHSV = new Scalar(lowH,lowS,lowV);
        Scalar maxHSV = new Scalar(maxH,maxS ,maxV);

        //去除噪点，小于5x5的都将忽略
        Mat kernel = Imgproc.getStructuringElement(Imgproc.MORPH_RECT,new Size(5,5));
        Imgproc.morphologyEx(mask,mask,Imgproc.MORPH_CLOSE,kernel);

        //存储二值图像至desImaMat
        Core.inRange(srcHSV,lowHSV,maxHSV,mask);

        //识别方框内容
        Mat content = mask.submat(ROI);
        double Value = Core.sumElems(content).val[0] / ROI.area() / 255;

        content.release();

        percentage = Math.round(Value*100);
        //System.out.println("识别率为："+percentage);

        //输出
        int test = menu.test;
        test += 1;
        Imgcodecs.imwrite(output+test+".jpg",mask);

        //识别区域上色
        Scalar colorStone = new Scalar(255, 0 , 0);
        Imgproc.rectangle(mask, ROI, colorStone);

        //GUI
        HighGui.imshow("opencv",mask);
        HighGui.waitKey(10);
    }

}
