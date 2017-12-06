package com.aspose.cells;

class zbqz
{
  static double a = Math.sqrt(2.0D);
  static double b = Math.sqrt(3.141592653589793D);
  private static double[] f;
  static double[] c = { 1.0D, 1.0D, 2.0D, 6.0D, 24.0D, 120.0D, 720.0D, 5040.0D, 40320.0D, 362880.0D, 3628800.0D, 3.99168E7D, 4.790016E8D, 6.2270208E9D, 8.71782912E10D, 1.307674368E12D, 2.0922789888E13D, 3.55687428096E14D, 6.402373705728E15D, 1.21645100408832E17D, 2.43290200817664E18D, 5.109094217170944E19D, 1.1240007277776077E21D, 2.585201673888498E22D, 6.204484017332394E23D, 1.5511210043330986E25D, 4.0329146112660565E26D, 1.0888869450418352E28D, 3.0488834461171387E29D, 8.841761993739702E30D, 2.6525285981219107E32D, 8.222838654177922E33D };
  private static double[] g = { -39.69683028665376D, 220.9460984245205D, -275.9285104469687D, 138.357751867269D, -30.66479806614716D, 2.506628277459239D };
  private static double[] h = { -54.47609879822406D, 161.5858368580409D, -155.6989798598866D, 66.80131188771972D, -13.28068155288572D };
  private static double[] i = { -0.007784894002430293D, -0.3223964580411365D, -2.400758277161838D, -2.549732539343734D, 4.374664141464968D, 2.938163982698783D };
  private static double[] j = { 0.007784695709041462D, 0.3224671290700398D, 2.445134137142996D, 3.754408661907416D };
  static int d = 32;
  static double[] e = { 0.0D, 1.0D, 1.5D, 1.8333333333333333D, 2.0833333333333335D, 2.283333333333333D, 2.45D, 2.592857142857143D, 2.717857142857143D, 2.828968253968254D, 2.9289682539682538D, 3.019877344877345D, 3.103210678210678D, 3.180133755133755D, 3.2515623265623264D, 3.3182289932289932D, 3.3807289932289932D, 3.4395525226407577D, 3.4951080781963135D, 3.547739657143682D, 3.597739657143682D, 3.6453587047627294D, 3.690813250217275D, 3.73429151108684D, 3.7759581777535067D, 3.8159581777535068D, 3.8544197162150455D, 3.8914567532520823D, 3.927171038966368D, 3.961653797587058D, 3.994987130920391D, 4.02724519543652D };
  
  public static double a(int paramInt)
  {
    if (paramInt < 0) {
      throw new IllegalArgumentException("ArgumentPositive\\r\\nParameter name: \"value");
    }
    if (paramInt <= 1) {
      return 0.0D;
    }
    if (paramInt >= 64) {
      return zacz.a(paramInt + 1.0D);
    }
    if (f == null) {
      f = new double[64];
    }
    return f[paramInt] != 0.0D ? f[paramInt] : (f[paramInt] = zacz.a(paramInt + 1.0D));
  }
  
  public static double a(int paramInt1, int paramInt2)
  {
    if ((paramInt2 < 0) || (paramInt1 < 0) || (paramInt2 > paramInt1)) {
      return 0.0D;
    }
    return Math.floor(0.5D + Math.exp(a(paramInt1) - a(paramInt2) - a(paramInt1 - paramInt2)));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbqz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */