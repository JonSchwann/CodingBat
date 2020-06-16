public int[] squareUp(int n) {
  int[] square= new int[n*n];
  for (int i = 0; i < n; i++){
    for (int j = n - i - 1; j < n; j++){
      square[i*n + j] = n - j;
    }
  }
  return square;
}
