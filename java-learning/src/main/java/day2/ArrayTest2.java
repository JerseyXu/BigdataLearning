package day2;

public class ArrayTest2 {
    public static void main(String[] args) {
        /**
         * 二维数组可以看成是一个一维数组作为另一个一维数组的元素而存在。
         * 二维数组的使用：
         *   1 二维数组的声明和初始化
         *   2 如何调用数组指定位置的元素
         *   3 如何取数组的长度
         *   4 如何遍历数组
         *      双层for循环进行嵌套
         *   5 数组元素的默认初始化值
         *       针对初始化方式一： int[][] arr=new int[4][3]：
         *      外层元素：打印出来的是地址
         *      内层元素：与一位数组初始化的值相同
         *      针对初始化方式一： int[][] arr=new int[4][]：
         *      外层元素：null
         *      内层元素：不能调用，否则报错
         *   6数组的内存解析
         *
          */
        //动态初始化
        int[][] arr=new int[4][3];
        //或者 int[] arr2[]=new int[4][3]; int arr[][]=new int[4][3];

        //静态初始化
        int[][] arr1=new int[][]{{1,2,3},{5,6},{7,8,9}};

        System.out.println("输出指定位置的二维数组元素："+ arr1[0][2]);

        System.out.println("获取到数组的长度："+arr.length);

        //遍历二维数组
        int aa=0;
        for(int i=0;i<arr1.length;i++){
            for (int j=0;j<arr1[i].length;j++){
                       aa +=arr1[i][j];
                System.out.println("遍历二维数组的结果是："+arr1[i][j]);
            }
        }
        System.out.println("加和二维数组的结果是："+aa);
    }
}




























































