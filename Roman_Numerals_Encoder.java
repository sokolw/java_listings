package rush10;
public class Roman_Numerals_Encoder {
    public static void main(String[] args) {
        
        System.out.println(solution(2193));
    }
    public static String solution(int n) {
        String[] romansymbols = new String[1001];
        int[] razbienie = new int[4];
        int index;
        String stroka="";
        
        romansymbols[1]="I";
        romansymbols[5]="V";
        romansymbols[10]="X";
        romansymbols[50]="L";
        romansymbols[100]="C";
        romansymbols[500]="D";
        romansymbols[1000]="M";
        for (int i = 0; i < 4; i++) {
            razbienie[3-i] = (int) (n%Math.pow(10,i+1));
            if (n-razbienie[3-i] == 0){
                razbienie[3-i]=n;
                break;
            } else{
                n=(int) (n-razbienie[3-i]);
            }
        }
        
        for (int i = 0; i < 4; i++) {
            index =(int) Math.pow(10,3-i);
            if (razbienie[i] !=0){
                if (razbienie[i]/Math.pow(10,3-i)<4){
                    for (int j = (int) (razbienie[i]/Math.pow(10,3-i)); j > 0; j--) {
                        stroka = stroka+romansymbols[index];
                    }
                }
                if(razbienie[i]/Math.pow(10,3-i) == 4){
                    stroka = stroka+romansymbols[index]+romansymbols[index+4*index];
                }
                if(razbienie[i]/Math.pow(10,3-i) == 9){
                    stroka = stroka+romansymbols[index]+romansymbols[10*index];
                }
                if (razbienie[i]/Math.pow(10,3-i) == 5){
                    stroka = stroka+romansymbols[index*5];
                }
                if (razbienie[i]/Math.pow(10,3-i)>5 & razbienie[i]/Math.pow(10,3-i)<9){
                        stroka = stroka+romansymbols[index*5];
                    for (int j = (int) (razbienie[i]/Math.pow(10,3-i)-5); j > 0; j--) {
                        stroka = stroka+romansymbols[index];
                    }
                }
            } else{
                continue;
            }
        }
        /*String k = Integer.toString(n);
        int lenth = k.length();
        int[] razbienie = new int[lenth];
        for (int i = lenth-1; i >= 0; i--) {
            razbienie[i] =(int) (Integer.valueOf(String.valueOf(k.charAt(i)),10) * Math.pow(10, lenth-i-1));
            System.out.println(razbienie[i]);
        }
        for (int i = 0; i < lenth; i++) {
                strsum = romansymbols[razbienie[i]]+strsum;
        }*/
        return stroka;
    }
    
}
