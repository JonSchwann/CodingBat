public int countClumps(int[] nums) {
  boolean match = false;
  int x = 0;
  for (int i = 0; i < nums.length-1; i++){
    if (nums[i] == nums[i + 1] && !match){
      match = true;
      x++;
    }
    else if (nums[i] != nums[i + 1]){
      match = false;
    }
  }
  return x;
}
