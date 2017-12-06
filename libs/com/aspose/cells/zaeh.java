package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;

final class zaeh
{
  public static void a(zq[] paramArrayOfzq, zo paramzo)
  {
    a(paramArrayOfzq, paramzo.d());
    b(paramArrayOfzq, paramzo.e());
  }
  
  public static void a(zq[] paramArrayOfzq, float paramFloat)
  {
    if (paramFloat < paramArrayOfzq[0].f())
    {
      paramArrayOfzq[0].c(paramArrayOfzq[0].l() - paramFloat);
      paramArrayOfzq[0].a(paramFloat);
    }
    else if (paramFloat > paramArrayOfzq[0].l())
    {
      paramArrayOfzq[0].c(paramFloat - paramArrayOfzq[0].f());
    }
  }
  
  public static void b(zq[] paramArrayOfzq, float paramFloat)
  {
    if (paramFloat < paramArrayOfzq[0].g())
    {
      paramArrayOfzq[0].d(paramArrayOfzq[0].m() - paramFloat);
      paramArrayOfzq[0].b(paramFloat);
    }
    else if (paramFloat > paramArrayOfzq[0].m())
    {
      paramArrayOfzq[0].d(paramFloat - paramArrayOfzq[0].g());
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaeh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */