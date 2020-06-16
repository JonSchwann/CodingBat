public boolean linearIn(int[] outer, int[] inner) {
  int x = 0;
  for (int i = 0; i < inner.length; i++){
    for (int j = 0; j < outer.length; j++){
      if (inner[i] == outer[j]){
        x++;
      }
    }
    if (x == 0){
      return false;
    }
    x = 0;
  }
  return true;
}
