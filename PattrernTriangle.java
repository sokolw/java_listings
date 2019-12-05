package arrayfulltime;


public class PattrernTriangle {
 
//    public PattrernTriangle(int n) {
//        this.n = n;
//    }
    
    
    public static void main(String[] args) {
    int n=5;
    String t = "*";
    String[][] fill = new String[n][n];
    
        for (int i = 0; i < fill.length; i++) {
            for (int j = 0; j < fill.length; j++) {
                fill[i][j]= t;
            }
        }
        for (int i = fill.length-1; i >= 0; i--) {
//B            n--;
            for (int j = 0; j < i+1; j++) {
                System.out.print(fill[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < fill.length; i++) {
//A            n--;
            for (int j = 0; j < i+1; j++) {
                System.out.print(fill[i][j]);
            }
            System.out.println();
        }
            String str1 = " ";
            String str2 = "";
        for (int i = 0; i < fill.length; i++) {
//C            n--;
            
            for (int j = fill.length-i-1; j < fill.length; j++) {
                if (fill.length-i-1 == j){
                    for (int k = 0; k < fill.length-i; k++) {
                    str2 = str2.concat(str1);
                    }
                }
                System.out.print(str2+fill[i][j]);
                str2 = "";
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < fill.length; i++) {
//D            n--;
            for (int j = i; j < fill.length; j++) {
                if (i == j){
                    for (int k = 0; k < i; k++) {
                    str2 = str2.concat(str1);
                    }
                }
                System.out.print(str2+fill[i][j]);
                str2 = "";
            }
            System.out.println();
            
        }

    }
    
    
    
//    private String[][] fill (String[][] fill, String n){
//        
//    }
    private void Apattern (String[][] fill, int n){
        
    }
    
    

    
}
