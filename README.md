# 19581的opencv测试工具

## 环境配置
JDK开发环境为15+

opencv为4.5.4

opencv下载地址:<https://opencv.org/releases/>

温馨提醒：IDEA需要在“项目结构-依赖”中添加opencv的JAR

## 源码环境配置
共有两处地方需要按环境修改

**main中的**

static String input = "C:\\Users\\lenovo\\Pictures\\Camera Roll\\WIN_20211202_17_41_10_Pro.jpg";

修改为需要导入的图片

static String output = "C:\\Users\\lenovo\\Pictures\\Camera Roll\\test\\test_";

需要修改为自己的目录（图片必须为JPG结尾）

**opencv_test中的**

System.load("E:\\下载\\opencv\\opencv\\build\\java\\x64\\opencv_java454.dll");

System.load("E:\\下载\\opencv\\opencv\\build\\java\\x64\\opencv_videoio_ffmpeg454_64.dll");

需要修改为自己opencv的DLL文件

##识别区域
opencv_test中的此行代码

static final Rect ROI = new Rect(
new Point(550, 250),
new Point(650, 470));

为识别区域，请按需修改
##Test模式
Test模式目前实现的是图片筛选，根据提供的识别率范围存储图片以及对应HSV数值，用于快速应用至FTC颜色配置中
## TODO

- E键返回
- 随时选择目录
- 控制台设定识别区（原图+识别框）