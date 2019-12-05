package arrayfulltime;


public class Credit_Card_Mask {
    public static void main(String[] args) {
        System.out.println(maskify("45;563646"));
    }
    public static String maskify(String str) {
//        String code;
//        String nomask;
//        if ("".equals(str)) {
//            return "";
//        }
//        if (str.length() <= 4) {
//            return str;
//        } else {
//            code = str.substring(0, str.length()-4);
//            nomask = str.substring(str.length()-4, str.length());
//            code = code.replaceAll("\\w", "#");
//            code = code.replaceAll("\\W", "#");
//            return code+nomask;
//        }
        return str.replaceAll(".(?=.{4})", "#"); /*лучшее решение*/ 
        
        /*int sL = str.length();
        if(sL > 4){
          return new String(new char[sL-4]).replace('\0', '#') + str.substring(sL-4, sL);
        }
        return str; другое решение*/
    }
}
