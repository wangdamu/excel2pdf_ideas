package com.aspose.cells;

import com.aspose.cells.b.a.b.zw;

final class zte
{
  private static float a = 0.4F;
  
  public static Color a(int paramInt, Color paramColor)
  {
    if ((paramInt == 7) || (paramInt == 8)) {
      paramInt = a(paramColor, paramInt);
    }
    float f = 0.0F;
    switch (paramInt)
    {
    case 1: 
      return zw.a();
    case 2: 
      return paramColor;
    case 9: 
      return a(paramColor);
    case 3: 
      f = -zlm.a;
      break;
    case 4: 
      f = -zlm.b;
      break;
    case 5: 
      f = zlm.a;
      break;
    case 6: 
      f = zlm.b;
      break;
    case 0: 
      return Color.getTransparent();
    }
    return zlm.a(paramColor, f);
  }
  
  private static int a(Color paramColor, int paramInt)
  {
    if (paramColor.b() > a)
    {
      if (paramInt == 7) {
        return 3;
      }
      return 4;
    }
    if (paramInt == 7) {
      return 5;
    }
    return 6;
  }
  
  private static Color a(Color paramColor)
  {
    if (paramColor.b() > a) {
      return Color.getBlack();
    }
    return Color.getWhite();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zte.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */