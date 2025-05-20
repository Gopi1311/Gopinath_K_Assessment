
import java.util.*;

public class Problem-4 {
    public static void main(String[] args) {
        List<Integer> input=Arrays.asList(1,2,8,9,12,46,76,82,15,20,30);
        Map<Integer,Integer> result=new HashMap<>();
        for(int i=1;i<=9;i++){
            int count=0;
            for (Integer num1:input){
                if(num1%i==0){
                    count++;
                }
            }
            result.put(i,count);
        }
        System.out.println(result);
    }
}