package com.aspose.cells;

import com.aspose.cells.a.d.zgs;

class zaew
  extends zaev
{
  zaew(boolean paramBoolean, boolean[] paramArrayOfBoolean, float paramFloat1, float paramFloat2, zgw paramzgw, float paramFloat3, double[] paramArrayOfDouble)
  {
    super(paramBoolean, paramArrayOfBoolean, paramFloat1, paramFloat2, paramzgw, paramFloat3, paramArrayOfDouble);
  }
  
  protected float a(double paramDouble, float paramFloat)
  {
    return zgz.b(paramDouble, paramFloat);
  }
  
  protected float a(zgs paramzgs, int paramInt, float paramFloat)
    throws Exception
  {
    return paramzgs.a(paramInt, paramFloat);
  }
  
  protected float a(zgs paramzgs, String paramString, float paramFloat)
    throws Exception
  {
    return paramzgs.c(paramString, paramFloat);
  }
  
  protected float a(zgs paramzgs, zqb paramzqb)
    throws Exception
  {
    float f = zbra.a(paramzqb.b.getName(), paramzqb.b.getDoubleSize());
    if (f > -1.0F) {
      return f;
    }
    return super.a(paramzgs, paramzqb);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaew.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */