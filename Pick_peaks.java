package rush10;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
public class Pick_peaks {
    public static void main(String[] args) {
        //int[] arr  = {13, 12, 14, 11, -5, 10, 3, 3, -4, 13, 4, 10, 18, 2, -3, 1, -2, 15, 19, 18, 7, 3, 10, 15, 7, -4};
        int[] arr  = {2, 1, 3, 2, 2, 2, 2, 1};
        System.out.println(getPeaks(arr));
    } 
    public static Map<String,List<Integer>> getPeaks(int[]arr) {
        List<Integer> piki = new ArrayList<Integer>();
        List<Integer> indexiPiki = new ArrayList<Integer>();
        Map<String,List<Integer>> mapPicks = new HashMap<String,List<Integer>>();
        int startPlatoIndex=0;
        int indexMin=0;
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i]>arr[i-1]&arr[i]>arr[i+1]){
                piki.add(arr[i]);
                indexiPiki.add(i);
                System.out.println("Пик: "+arr[i]+" Индекс: "+i);
            }
            if (arr[i]==arr[i+1]&arr[i]>arr[i-1]) {
                startPlatoIndex=i;
                
                }
            if (i<arr.length-2){
                if (arr[i]==arr[i+1]&arr[i]<arr[i-1]) {
                    continue;
                }
                if (arr[i]==arr[i+1]&arr[i+1]>arr[i+2] | arr[i]==arr[i+1]&arr[i+1]>arr[i+2]&arr[i]>arr[i-1]) {
                    if (startPlatoIndex!=0) {
                        piki.add(arr[i]);
                        indexiPiki.add(startPlatoIndex);
                    }
                    System.out.println("Пик: "+arr[i]+" Индекс плато: "+startPlatoIndex);
                } else if (arr[i]==arr[i+1]&arr[i+1]<arr[i+2]) {
                startPlatoIndex=0;
                }
            } else continue;
        }
        mapPicks.put("pos", indexiPiki);
        mapPicks.put("peaks", piki);
//        String intArrayString = Arrays.toString(arr);
//        System.out.println(intArrayString);
        return mapPicks;
        
    }
}
