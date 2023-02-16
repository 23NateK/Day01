public class CodingBat{
public static boolean sum28(int[] nums){
    int sum=0;
    for(int n=0;n<nums.length;n++){
        if(nums[n]==2){

        
        sum+=nums[n];
        }
    }
    if(sum==8){
        return true;
    }else{
        return false;
    }
}
public static boolean only14(int[] nums){
    int a=0;
    for(int n=0;n<nums.length;n++){
        if(nums[n]==1||nums[n]==4){
            a++;
        }
    }
    if(a==nums.length){
        return true;
    }
    return false;

}
public static int sum13(int[] nums){
    int sum=0;
    for(int n=0;n<nums.length;n++){
        if(nums[n]!=13){
            sum+=nums[n];
        }
        if(nums[n]==13){
            n++;
        }
        if(n>=nums.length){
            return sum;
        }
    }
    return sum;
}
public static boolean lucky13(int[] nums){
boolean ans=true;
for(int n=0;n<nums.length;n++){
    if(nums[n]==1||nums[n]==3){
        ans=false;
    }
}

return ans;
}
public static boolean haveThree(int[] nums) {
  boolean bool=false;
  int count=0;
  for(int n=0;n<nums.length;n++){
    if(nums[n]==3){
        count++;
        n++;
    }
  }
  if(count==3){
    bool=true;
  }
  return bool;

}
public static boolean tripleUp(int[] nums) {
  boolean bool=false;
  if(nums.length<3){
    return bool;
  }else{
    for(int n=0;n+2<nums.length;n++){
        if(nums[n+1]==nums[n]+1&&nums[n+1]==nums[n]+2){
            bool=true;
        }
    }
  }
  return bool;
}

    public static void main(String[] args) {
        
    }
}