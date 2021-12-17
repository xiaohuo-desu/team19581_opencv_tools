import org.opencv.core.Mat;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

import java.util.Scanner;

public class test extends opencv_test{


    public static void photo(String input){

        System.load("C:\\Users\\17367\\Desktop\\opencv\\build\\java\\x64\\opencv_java454.dll");
        System.load("C:\\Users\\17367\\Desktop\\opencv\\build\\java\\x64\\opencv_videoio_ffmpeg454_64.dll");

        Mat srcImgMat = Imgcodecs.imread(input);

        //矩形设定
        Rect ROI2 = scanner.setRect();
        Scalar colorStone = new Scalar(0, 255, 0);
        Imgproc.rectangle(srcImgMat, ROI2, colorStone);

        HighGui.imshow("opencv",srcImgMat);
        HighGui.waitKey(10);

    }




}
