public class ch6_6 {
    
    public static void main(String[] args) {
        int[] a={2,7,6,3,8,4};      //宣告陣列a
        int[] b={2,7,6,3,8,4};      //宣告陣列b
        int[] c=a;                  //設定陣列變數c的位址指向a

        c[0]=10;    //將[0]修改為10
        System.out.printf("a[0]=%d\n",a[0]);
        System.out.printf("a==b: %b\n",a==b);       //判斷a是否與b相同
        System.out.printf("a==c: %b\n",a==c);       //判斷a是否與c相同
    }
}
