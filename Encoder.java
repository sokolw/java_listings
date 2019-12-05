package arrayfulltime;


public class Encoder {
        public static void main(String[] args) {
        
        String ret = ABC("123123",3);
        
    }
        public static String ABC (String abc, int n) {
            String top = "";
            for (int i = 0; i < abc.length(); i=i+2*n-3) {
                top = top + abc.charAt(i);
                
            }
            System.out.println(top);
            top = "";
            for (int i = n-1; i < abc.length(); i=i+2*n-3) {
                top = top + abc.charAt(i);
                
            }
            
            System.out.println(top);
            return "32131"; /*НЕДОДЕЛАНО*/
    }
}
