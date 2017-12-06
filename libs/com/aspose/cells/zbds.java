package com.aspose.cells;

class zbds
  implements zajd
{
  private static int[] a = { 0, 16, 32, 48, 64, 80, 96, 112, 128, 144, 160, 176, 192, 208, 224, 240, 256, 272, 288, 304, 320, 336, 352, 368, 384, 400, 416, 432, 448, 464, 480, 496, 512, 528, 544, 560, 576, 592, 608, 624, 634, 634, 634, 634, 634 };
  private double b;
  
  public zbds(double paramDouble)
  {
    this.b = (paramDouble / 16.0D);
  }
  
  public void a(double paramDouble)
  {
    this.b = (paramDouble / 16.0D);
  }
  
  public int a(int paramInt)
  {
    if (paramInt < a.length) {
      return a[paramInt];
    }
    return paramInt << 4;
  }
  
  public int b(int paramInt)
  {
    return (int)(paramInt / this.b);
  }
  
  public int c(int paramInt)
  {
    return paramInt >> 4;
  }
  
  public double d(int paramInt)
  {
    return paramInt / 320.0D;
  }
  
  public double e(int paramInt)
  {
    return paramInt / 23040.0D;
  }
  
  public int f(int paramInt)
  {
    return (int)(paramInt * this.b);
  }
  
  public static boolean g(int paramInt)
  {
    return (paramInt > 40) && (paramInt < a.length);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */