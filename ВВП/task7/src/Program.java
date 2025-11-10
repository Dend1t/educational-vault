
import util.ArrayUtils;
public class Program{
    public static void main(String[] args) throws Exception {
        int[] arr = ArrayUtils.readIntArrayFromConsole();
        Interval ans = solution(arr);
        System.out.println(ans.firstIndex + " " + ans.length);
    }

    public static Interval solution(int[] arr) {
        int iterNums = 0;
        int mVL = 0;
        Interval ans = Interval.defaultInterval();
        for(int x = 0; x< arr.length; x++){
            int sumOfOne = 0;
            for(int i = x; i < arr.length ;i++){
                sumOfOne+=arr[i];
                if(iterNums <= 1 && mVL <= i+1 && sumOfOne == 0 ){
                    iterNums++;
                    ans.firstIndex=x;
                    ans.length=x+1;
                    if(mVL<i+1){
                        iterNums = 0;
                        mVL = i+1;
                    }
                }
            }
            System.out.println();
        }
        return ans;
    }

}
