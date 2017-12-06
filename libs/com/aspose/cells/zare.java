package com.aspose.cells;

class zare
{
  public static double a = ((zabb)a(1.0D)).o();
  public static double b = ((zabb)b(1.0D)).o();
  public static double c = 10.0D * b;
  
  public static zaie a(double paramDouble)
  {
    if ((Double.isInfinite(paramDouble)) || (Double.isNaN(paramDouble))) {
      return zabc.g;
    }
    long l = Double.doubleToRawLongBits(paramDouble);
    if (l == 0L)
    {
      l += 1L;
      return new zabb(Double.longBitsToDouble(l) - paramDouble);
    }
    if (l-- < 0L) {
      return new zabb(Double.longBitsToDouble(l) - paramDouble);
    }
    return new zabb(paramDouble - Double.longBitsToDouble(l));
  }
  
  public static zaie b(double paramDouble)
  {
    zaie localzaie = a(paramDouble);
    if (localzaie.b() == 0) {
      return localzaie;
    }
    return new zabb(2.0D * ((zabb)localzaie).o());
  }
  
  public static boolean a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    if (((paramDouble1 == 0.0D) && (Math.abs(paramDouble2) < paramDouble4)) || ((paramDouble2 == 0.0D) && (Math.abs(paramDouble1) < paramDouble4))) {
      return true;
    }
    return Math.abs(paramDouble3) < paramDouble4 * Math.max(Math.abs(paramDouble1), Math.abs(paramDouble2));
  }
  
  public static boolean a(double paramDouble1, double paramDouble2)
  {
    return a(paramDouble1, paramDouble2, paramDouble1 - paramDouble2, c);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zare.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */