public class ch6_4 {
    
    public static void main(String[] args) {
        int sum=0;
        int[][] sales={{32,35,26,30},{34,30,33,31}};

        for(int r=0;r<sales.length;r++){
            for(int c=0;c<sales[r].length;c++){
                System.out.print(sales[r][c]+" ");      //宣告陣列並設定功能
                sum+=sales[r][c];       //加總銷售量
            }
            System.out.println();        //換行    
            }
        System.out.printf("總銷售量為 %d 部車",sum);    
        }
    }

