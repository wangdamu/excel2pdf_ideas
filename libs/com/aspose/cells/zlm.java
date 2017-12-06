package com.aspose.cells;

final class zlm
{
  public static float a = 0.3F;
  public static float b = 0.5F;
  
  public static Color a(Color paramColor, float paramFloat)
  {
    if (paramFloat == 0.0F) {
      return paramColor;
    }
    float f1 = paramColor.getR() & 0xFF;
    float f2 = paramColor.getG() & 0xFF;
    float f3 = paramColor.getB() & 0xFF;
    if (paramFloat < 0.0F)
    {
      paramFloat = 1.0F + paramFloat;
      f1 *= paramFloat;
      f2 *= paramFloat;
      f3 *= paramFloat;
    }
    else
    {
      f1 = (255.0F - f1) * paramFloat + f1;
      f2 = (255.0F - f2) * paramFloat + f2;
      f3 = (255.0F - f3) * paramFloat + f3;
    }
    return Color.fromArgb(paramColor.getA() & 0xFF, (int)f1, (int)f2, (int)f3);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zlm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */