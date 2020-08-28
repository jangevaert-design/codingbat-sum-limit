public class sumLimit {
  public int sumLimit(int a, int b) {
    int sum = a + b;
    String result = String.valueOf(sum);
    String valA = String.valueOf(a);

    if (valA.length() < result.length()) {
      return a;
    }
    return sum;
  }

}
