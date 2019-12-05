package arrayfulltime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ones_and_Zeros {
    public static void main(String[] args) {
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,0,1,1))));
    }
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int dec=0,conv,length;
        length = binary.size()-1;
        if (length < 0) return 0;
        for (Integer integer : binary) {
            conv=(int) (integer* Math.pow(2, length));
            dec = conv+dec;
            length--;
        }
        return dec;
        /*return binary.stream().reduce((x, y) -> x * 2 + y).get(); лучшее решение*/
        /*  int number = 0;
        for (int bit : binary)
            number = number << 1 | bit;
        return number;*/
    }
}
