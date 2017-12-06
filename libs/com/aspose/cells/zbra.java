package com.aspose.cells;

import com.aspose.cells.a.d.zf;

class zbra
{
  static float a(float paramFloat1, String paramString, float paramFloat2, zf paramzf, zgw paramzgw)
  {
    if (paramString.equals("Lucida Sans Unicode"))
    {
      paramFloat1 = paramFloat1 * 2.0F / 3.0F;
    }
    else if ((paramString.equals("Arial Narrow")) && (paramzgw.c() != null) && (paramzgw.c().getVerticalAlignment() == 9))
    {
      paramFloat1 += 1.0F * paramFloat2;
      if (paramzgw.c().isTextWrapped()) {
        paramFloat1 += 1.0F * paramFloat2;
      }
    }
    return paramFloat1;
  }
  
  static float a(String paramString, float paramFloat1, float paramFloat2)
  {
    if ((paramFloat1 == 6.48F) && (paramFloat2 == 1.0F) && (paramString.equals("Arial"))) {
      return 0.0F;
    }
    if ((paramFloat1 == 6.96F) && (paramString.equals("Arial Cyr"))) {
      return 2.2F;
    }
    if ((paramFloat1 == 10.0F) && (paramString.equals("DFKai-SB"))) {
      return 8.0F;
    }
    return -1.0F;
  }
  
  static double a(double paramDouble)
  {
    if (paramDouble == 14.1D) {
      return 13.97D;
    }
    if (paramDouble == 12.95D) {
      return 12.87D;
    }
    return paramDouble;
  }
  
  static float a(String paramString, double paramDouble)
  {
    if ((paramDouble == 6.5D) && ("Arial".equals(paramString))) {
      return 12.0F;
    }
    if ((paramDouble == 8.0D) && ("Arial".equals(paramString))) {
      return 14.0F;
    }
    return -1.0F;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbra.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */