package arrayfulltime;


public class Sum_of_odd_numbers {
    public static void main(String[] args) {
        
        System.out.println(rowSumOddNumbers(99));
    }
    public static int rowSumOddNumbers(int n) {
        int[][] piramida = new int[n][n];
        int temp=1;
        int sum=0;
        for (int i = 0; i < piramida.length; i++) {
            for (int j = 0; j < i+1; j++) {
                if (i == 0) {
                    piramida[i][j] = 1;
                } else {
                    piramida[i][j] = temp+2;
                    temp = piramida[i][j];
                }
            }
            if (piramida.length-1 == i){
                for (int j = 0; j < piramida.length; j++) {
                sum = sum+piramida[i][j];
                }
            }
        }
//        return sum;
        return n*n*n; /*Лучшее решение*/
    }
   
}
