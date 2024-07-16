public class ch6_3 {
    
    public static void main(String[] args) {
        int arr[]={17,48,3074,62};      //宣告整數陣列a,並設定初值
        int max=arr[0];     //將max設值微陣列的第0個元素

        for(int i:arr){
            if(i>max)
                max=i;

        }   
        System.out.printf("Maximum is %d",max);     //印出最大值
    }
}
