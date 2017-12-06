package com.aspose.cells;

import com.aspose.cells.a.c.zh;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zu;

final class zbd
{
  public static void a(zr paramzr, zq paramzq, zay paramzay)
    throws Exception
  {
    if (paramzay.h() != 0)
    {
      zc localzc = a(paramzay, paramzq);
      try
      {
        paramzr.b(localzc, paramzq);
      }
      finally
      {
        if (localzc != null) {
          localzc.f();
        }
      }
    }
  }
  
  public static zc a(zay paramzay, zq paramzq)
    throws Exception
  {
    return a(paramzay, paramzq, false);
  }
  
  public static zc a(zay paramzay, zq paramzq, boolean paramBoolean)
    throws Exception
  {
    Object localObject = null;
    if (paramzay.f())
    {
      ze localze = new ze();
      localze.b(paramzq);
      localObject = paramzay.c().a(localze, paramBoolean, 1.0F);
    }
    else if (paramBoolean)
    {
      localObject = new zu(paramzay.b());
    }
    else
    {
      localObject = new zu(paramzay.e());
    }
    return (zc)localObject;
  }
  
  public static zc a(zay paramzay, zq paramzq, float paramFloat)
    throws Exception
  {
    Object localObject1 = null;
    Object localObject2;
    if (paramzay.f())
    {
      localObject2 = new ze();
      ((ze)localObject2).b(paramzq);
      localObject1 = paramzay.c().a((ze)localObject2, false, paramFloat);
    }
    else
    {
      localObject2 = Color.fromArgb((int)((zh.b(paramzay.e()) & 0xFF) * paramFloat), (int)((zh.c(paramzay.e()) & 0xFF) * paramFloat), (int)((zh.d(paramzay.e()) & 0xFF) * paramFloat));
      if (zh.a(paramzay.e())) {
        localObject2 = Color.getEmpty();
      }
      localObject1 = new zu((Color)localObject2);
    }
    return (zc)localObject1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */