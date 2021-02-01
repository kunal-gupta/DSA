import java.util.Arrays;
class Sort012 {
    private static void sortNos(int[] nums) {
        int zero = 0, one = 0, two = 0;
        int i;
		//Count number of 0, 1 and 2
        for(i =0; i<nums.length; i++){
            if(nums[i] == 0)
                zero++;
            else if(nums[i] == 1)
                one++;
            else
                two ++;
        }
        
		//Replace these values in the array
        for(i =0; i< nums.length; i++){
            if(zero-- > 0)
                nums[i] = 0;
            else if(one-- > 0)
                nums[i] = 1;
            else
                nums[i] =2;
        }
    }
	
	public static void main(String[] args){
		int[] array = { 2, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };

		sortNos(array);
		System.out.println(Arrays.toString(array));
	}
}