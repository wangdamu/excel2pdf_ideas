package com.aspose.cells;

public class ColorHelper
{
  public static Color fromOleColor(int oleColor)
  {
    int i = oleColor >> 24 & 0xFF;
    int j = oleColor >> 16 & 0xFF;
    int k = oleColor & 0xFFFF;
    switch (i)
    {
    case 0: 
      return zava.d(oleColor);
    case 1: 
      return a(k);
    case 2: 
      return Color.fromArgb(oleColor & 0xFFFFFF);
    case 128: 
      return a(k);
    }
    return Color.getEmpty();
  }
  
  static Color a(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return Color.fromArgb(-3618616);
    case 1: 
      return Color.getBlack();
    case 2: 
      return Color.fromArgb(-6703919);
    case 3: 
      return Color.fromArgb(-4207141);
    case 4: 
      return Color.fromArgb(-986896);
    case 5: 
      return Color.getWhite();
    case 6: 
      return Color.fromArgb(-10197916);
    case 7: 
      return Color.getBlack();
    case 8: 
      return Color.getBlack();
    case 9: 
      return Color.getBlack();
    case 10: 
      return Color.fromArgb(-4934476);
    case 11: 
      return Color.fromArgb(-722948);
    case 12: 
      return Color.fromArgb(-5526613);
    case 13: 
      return Color.fromArgb(-13395457);
    case 14: 
      return Color.getWhite();
    case 15: 
      return Color.fromArgb(-986896);
    case 16: 
      return Color.fromArgb(-6250336);
    case 17: 
      return Color.fromArgb(-9605779);
    case 18: 
      return Color.getBlack();
    case 19: 
      return Color.fromArgb(-12366252);
    case 20: 
      return Color.getWhite();
    case 21: 
      return Color.fromArgb(-9868951);
    case 22: 
      return Color.fromArgb(-1842205);
    case 23: 
      return Color.getBlack();
    case 24: 
      return Color.fromArgb(-31);
    }
    return Color.getEmpty();
  }
  
  public static int toOleColor(Color color, Workbook workbook)
  {
    return color.toArgb() & 0xFFFFFF | 0x2000000;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ColorHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */