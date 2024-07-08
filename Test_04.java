public class Test_04 {
    public static void main(String args[]){
    double principal = 1000.0;      //本金
    double rate = 0.05;             //年利率
    double time = 2.0;              //年數
    double a = (principal*rate*time);   //利息公式
    System.out.printf("=%.2f\n",a);   
    }
}
