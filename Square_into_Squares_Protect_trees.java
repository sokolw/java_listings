package arrayfulltime;
import java.util.ArrayList;
import java.util.List;

public class Square_into_Squares_Protect_trees {
    public static void main(String[] args) {
        System.out.println(decompose(50));
    }
    public static  String decompose(long n) {
		List<Long> decomposeArray = Decomposer(n, n * n);
                
		if(decomposeArray == null) return null;
                
		decomposeArray.remove(decomposeArray.size() - 1);
                
		List<String> result = new ArrayList<>();

		for(Long ele : decomposeArray){
			result.add(String.valueOf(ele.longValue()));
		}		
		return String.join(" ", result);
	}
	
    public static List<Long> Decomposer(long n, long remain){

		if(remain == 0){
			List<Long> r = new ArrayList<Long>();
			r.add(n);
			return r;
		}

		for(long i = n - 1 ; i > 0; i--){
			if((remain - i * i) >= 0){
				List<Long> r = Decomposer(i, (remain - i * i));
				
				if(r != null){
					r.add(n);
					return r;
				}
			}
		}
		return null;
	}
}
