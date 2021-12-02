import java.util.ArrayList;

class Question2 {
    
    /**
     * Removes the smallest number in the list nums
     */
    public static void removeSmallest(ArrayList<Integer> nums) {
        int min = nums.get(0);
        for(int i=0; i<nums.size(); i++){
            if(nums.get(i)<min){
                min = i;
            }
        }      
        
        //System.out.println(min);
        nums.remove(min);
    }
  
    public static void main (String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            nums.add( (int) (Math.random()*100) );
        }
        
        System.out.println("Our list before: " + nums);
        removeSmallest(nums); 
        System.out.println("Our list after:  " + nums);
    }
    
    
}
