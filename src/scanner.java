import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.w3c.dom.css.CSSPrimitiveValue;

import java.awt.*;
import java.util.Scanner;

public class scanner {
    static int ROIchange = 0;
    public static Rect setRect()  {
        int x1,x2,y1,y2;
        Scanner Reader = new Scanner(System.in);
        System.out.print("Please input x1:");
        x1 = Reader.nextInt();
        System.out.print("Please input y1 :");
        y1 = Reader.nextInt();
        System.out.print("Please input x2:");
        x2 = Reader.nextInt();
        System.out.print("Please input y2 :");
        y2 = Reader.nextInt();

        Rect ROI2 = new Rect(
                new Point(x1,y1),
                new Point(x2,y2));
        ROIchange = 1;
        return ROI2;
    }
}
