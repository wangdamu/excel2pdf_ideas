package com.aspose.cells;

abstract class zj
  extends zx
{
  public int a(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (paramInt < 0) {
        return this.a - 1;
      }
      return paramInt - 1;
    }
    if (paramInt == this.a - 1) {
      return -this.a - 1;
    }
    return paramInt + 1;
  }
  
  public zaiv a(zahc paramzahc)
  {
    return a(paramzahc, -1, -1, false);
  }
  
  public zaiv a(zahc paramzahc, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i;
    if (paramInt1 < 0)
    {
      paramInt1 = 0;
      i = -1;
    }
    else
    {
      i = paramzahc.a(paramInt1);
    }
    int j;
    if (paramInt2 < 0)
    {
      paramInt2 = this.a - 1;
      j = -1;
    }
    else
    {
      j = paramzahc.a(paramInt2);
    }
    if (paramBoolean) {
      return new ztz(paramzahc, i, paramInt1, j, paramInt2, 1);
    }
    return new zua(paramzahc, i, paramInt1, j, paramInt2, 1);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */