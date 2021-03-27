package arrary.day1;


/**
 * 这是关于一维数组基础知识的运用
 */
public class ArrayTest {
    public static void main(String[] args) {
        /**
         * 数组是一类数据按照顺序排列的集合，可以是基本数据类型，也可以是引用数据类型
         * 数据一旦确定长度，就无法修改。
         * 数据是在内存种开辟一段连续的空间，而链表则是正好相反
         * 数据按维度可分为：一维数组，二维数组等等。 按照数据类型分可分为：引用数据类型数组和基本类型数据数组
         * 数组的初始化分为动态和静态。动态： int[]aa=new int[5]  静态:int[] aa=int[]{0,1,2,3,4}
         * 数据每一个元素角标都从0开始
         * 数组不同类型元素的 默认值：
         *  基本数据类型：
         *      整形（byte，int，short，long）：0
         *      浮点型（double,float）:0.0
         *      boolean型：false
         *      char型：0
         *  引用数据类型：
         *      String：null
         *
         *
         */
        int[] aa=new int[]{0,1,2,3,4,5,6};
        for (int i=0;i<aa.length;i++){
            System.out.println(aa[i]);
        }
        System.out.println("*************************");
        int[] arr=new int[5];
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[0]);
        }
        System.out.println("*************************");
        float[] arr2=new float[5];
        for (int i=0;i<arr2.length;i++){
            System.out.println(arr2[0]);
        }
        System.out.println("*************************");
        boolean[] arr3=new boolean[5];
        for (int i=0;i<arr3.length;i++){
            System.out.println(arr3[0]);
        }
        System.out.println("*************************");
        char[] arr4=new char[5];
        for (int i=0;i<arr4.length;i++){
            System.out.println(arr4[0]);
        }
        if (arr4[0]==0){
            System.out.println("char型默认结果是0");
        }

        System.out.println("*************************");
        String[] arr5=new String[5];
        for (int i=0;i<arr5.length;i++){
            System.out.println(arr5[0]);
        }


    }


}
