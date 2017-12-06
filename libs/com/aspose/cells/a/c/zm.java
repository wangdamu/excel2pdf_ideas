package com.aspose.cells.a.c;

public class zm
{
  public static int a(double paramDouble)
  {
    return new Double(paramDouble).hashCode();
  }
  
  public static double a(double paramDouble, int paramInt)
  {
    return a(paramDouble, paramInt, (byte)0);
  }
  
  public static double a(double paramDouble, int paramInt, boolean paramBoolean)
  {
    return a(paramDouble, paramInt, (byte)(paramBoolean ? 1 : -1));
  }
  
  private static double a(double paramDouble, int paramInt, byte paramByte)
  {
    if (paramDouble == 0.0D) {
      return paramDouble;
    }
    int i;
    if (paramDouble < 0.0D)
    {
      i = 1;
      paramDouble = -paramDouble;
    }
    else
    {
      i = 0;
    }
    int j;
    if (paramDouble >= 1.0D) {
      j = (int)Math.log10(paramDouble) + 1;
    } else {
      j = (int)Math.floor(Math.log10(paramDouble)) + 1;
    }
    paramInt += j;
    if ((paramInt < -1) && (paramByte != 1)) {
      return 0.0D;
    }
    if (paramInt > 15) {
      paramInt = 15;
    }
    double d1;
    if ((j < 339) && (j > 65242))
    {
      d1 = Math.pow(10.0D, 15 - j);
      paramDouble = Math.floor(paramDouble * d1 + 0.51D) / d1;
    }
    else
    {
      d1 = Math.pow(10.0D, 1 - j);
      paramDouble = Math.floor(paramDouble * d1 * 1.0E14D + 0.51D) / d1 / 1.0E14D;
    }
    double d2 = paramInt - j;
    if ((d2 > -324.0D) && (d2 < 309.0D))
    {
      d1 = Math.pow(10.0D, d2);
      paramDouble *= d1;
      d2 = -1.0D;
    }
    else
    {
      d1 = Math.pow(10.0D, paramInt);
      d2 = Math.pow(10.0D, -j);
      paramDouble = paramDouble * d1 * d2;
    }
    switch (paramByte)
    {
    case 1: 
      paramDouble = Math.floor(paramDouble + 1.0D - Math.pow(10.0D, paramInt - 16));
      break;
    case -1: 
      paramDouble = Math.floor(paramDouble + Math.pow(10.0D, paramInt - 16));
      break;
    default: 
      paramDouble = Math.floor(paramDouble + 0.5D + Math.pow(10.0D, paramInt - 16));
    }
    if (d2 < 0.0D) {
      return (i != 0 ? -paramDouble : paramDouble) / d1;
    }
    return (i != 0 ? -paramDouble : paramDouble) / d2 / d1;
  }
  
  public static double b(double paramDouble, int paramInt)
  {
    return a(paramDouble, paramInt, (byte)0);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/c/zm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */