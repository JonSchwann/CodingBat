public int maxSpan(int[] nums) {
  if (nums.length == 0){
    return 0;
  }
  int y = 1;
  for (int i = 0; i < nums.length; i++){
    for (int j = nums.length - 1; j > i; j--){
      if (nums[i] == nums[j]){
        if (j - i + 1 > y){
          y = j - i + 1;
        }
      }
    }
  }
  return y;
}
