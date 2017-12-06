package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zq;

final class zjz
{
  /* Error */
  public static void a(zr paramzr, zjx paramzjx)
    throws Exception
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 48	com/aspose/cells/zjx:D	()Z
    //   4: ifeq +4 -> 8
    //   7: return
    //   8: aload_1
    //   9: invokevirtual 49	com/aspose/cells/zjx:d	()Lcom/aspose/cells/zay;
    //   12: aload_1
    //   13: getfield 21	com/aspose/cells/zjx:a	Lcom/aspose/cells/b/a/b/zp;
    //   16: invokestatic 22	com/aspose/cells/a/c/zn:a	(Lcom/aspose/cells/b/a/b/zp;)Lcom/aspose/cells/b/a/b/zq;
    //   19: invokestatic 40	com/aspose/cells/zbd:a	(Lcom/aspose/cells/zay;Lcom/aspose/cells/b/a/b/zq;)Lcom/aspose/cells/b/a/b/zc;
    //   22: astore_2
    //   23: aload_0
    //   24: aload_2
    //   25: aload_1
    //   26: getfield 21	com/aspose/cells/zjx:a	Lcom/aspose/cells/b/a/b/zp;
    //   29: invokeinterface 57 3 0
    //   34: aload_2
    //   35: ifnull +21 -> 56
    //   38: aload_2
    //   39: invokevirtual 28	com/aspose/cells/b/a/b/zc:f	()V
    //   42: goto +14 -> 56
    //   45: astore_3
    //   46: aload_2
    //   47: ifnull +7 -> 54
    //   50: aload_2
    //   51: invokevirtual 28	com/aspose/cells/b/a/b/zc:f	()V
    //   54: aload_3
    //   55: athrow
    //   56: aload_1
    //   57: invokevirtual 50	com/aspose/cells/zjx:f	()Lcom/aspose/cells/zanq;
    //   60: invokevirtual 35	com/aspose/cells/zanq:f	()Z
    //   63: ifeq +15 -> 78
    //   66: aload_0
    //   67: aload_1
    //   68: getfield 21	com/aspose/cells/zjx:a	Lcom/aspose/cells/b/a/b/zp;
    //   71: aload_1
    //   72: invokevirtual 50	com/aspose/cells/zjx:f	()Lcom/aspose/cells/zanq;
    //   75: invokestatic 38	com/aspose/cells/zanv:a	(Lcom/aspose/cells/zr;Lcom/aspose/cells/b/a/b/zp;Lcom/aspose/cells/zanq;)V
    //   78: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	paramzr	zr
    //   0	79	1	paramzjx	zjx
    //   22	29	2	localzc	zc
    //   45	10	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   23	34	45	finally
  }
  
  public static void a(zr paramzr, zje paramzje)
    throws Exception
  {
    float f1 = paramzje.a();
    float f2 = paramzje.b();
    float f3 = (float)paramzje.i().f().h();
    zq localzq1 = zbxz.a(paramzje, paramzje.V(), (float)paramzje.i().f().h(), paramzje.i().f().e());
    zq localzq2 = new zq(localzq1.f(), localzq1.g(), localzq1.h(), localzq1.i());
    if (paramzje.w())
    {
      zbd.a(paramzr, localzq2, paramzje.i().d());
      zanv.b(paramzr, localzq1.f(), localzq1.g(), localzq1.h(), localzq1.i(), paramzje.i().f());
    }
    else
    {
      zc localzc = zbd.a(paramzje.i().d(), localzq2);
      try
      {
        a(paramzr, localzc, localzq2.f(), localzq2.g(), localzq2.h(), localzq2.i(), 13.0F);
      }
      finally
      {
        if (localzc != null) {
          localzc.f();
        }
      }
      zs localzs = zanv.a(paramzje.i().f());
      try
      {
        a(paramzr, localzs, localzq1.f(), localzq1.g(), localzq1.h(), localzq1.i(), 13.0F);
      }
      finally
      {
        if (localzs != null) {
          localzs.s();
        }
      }
    }
  }
  
  private static void a(zr paramzr, zs paramzs, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    zf localzf = paramzr.d();
    paramzr.a(4, true);
    ze localze = new ze();
    localze.b(paramFloat1 + paramFloat5, paramFloat2, paramFloat1 + paramFloat3 - paramFloat5 * 2.0F, paramFloat2);
    localze.a(paramFloat1 + paramFloat3 - paramFloat5 * 2.0F, paramFloat2, paramFloat5 * 2.0F, paramFloat5 * 2.0F, 270.0F, 90.0F);
    localze.b(paramFloat1 + paramFloat3, paramFloat2 + paramFloat5, paramFloat1 + paramFloat3, paramFloat2 + paramFloat4 - paramFloat5 * 2.0F);
    localze.a(paramFloat1 + paramFloat3 - paramFloat5 * 2.0F, paramFloat2 + paramFloat4 - paramFloat5 * 2.0F, paramFloat5 * 2.0F, paramFloat5 * 2.0F, 0.0F, 90.0F);
    localze.b(paramFloat1 + paramFloat3 - paramFloat5 * 2.0F, paramFloat2 + paramFloat4, paramFloat1 + paramFloat5, paramFloat2 + paramFloat4);
    localze.a(paramFloat1, paramFloat2 + paramFloat4 - paramFloat5 * 2.0F, paramFloat5 * 2.0F, paramFloat5 * 2.0F, 90.0F, 90.0F);
    localze.b(paramFloat1, paramFloat2 + paramFloat4 - paramFloat5 * 2.0F, paramFloat1, paramFloat2 + paramFloat5);
    localze.a(paramFloat1, paramFloat2, paramFloat5 * 2.0F, paramFloat5 * 2.0F, 180.0F, 90.0F);
    localze.j();
    paramzr.a(paramzs, localze);
    paramzr.a(localzf);
  }
  
  private static void a(zr paramzr, zc paramzc, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    zf localzf = paramzr.d();
    paramzr.a(4, true);
    ze localze = new ze();
    localze.b(paramFloat1 + paramFloat5, paramFloat2, paramFloat1 + paramFloat3 - paramFloat5 * 2.0F, paramFloat2);
    localze.a(paramFloat1 + paramFloat3 - paramFloat5 * 2.0F, paramFloat2, paramFloat5 * 2.0F, paramFloat5 * 2.0F, 270.0F, 90.0F);
    localze.b(paramFloat1 + paramFloat3, paramFloat2 + paramFloat5, paramFloat1 + paramFloat3, paramFloat2 + paramFloat4 - paramFloat5 * 2.0F);
    localze.a(paramFloat1 + paramFloat3 - paramFloat5 * 2.0F, paramFloat2 + paramFloat4 - paramFloat5 * 2.0F, paramFloat5 * 2.0F, paramFloat5 * 2.0F, 0.0F, 90.0F);
    localze.b(paramFloat1 + paramFloat3 - paramFloat5 * 2.0F, paramFloat2 + paramFloat4, paramFloat1 + paramFloat5, paramFloat2 + paramFloat4);
    localze.a(paramFloat1, paramFloat2 + paramFloat4 - paramFloat5 * 2.0F, paramFloat5 * 2.0F, paramFloat5 * 2.0F, 90.0F, 90.0F);
    localze.b(paramFloat1, paramFloat2 + paramFloat4 - paramFloat5 * 2.0F, paramFloat1, paramFloat2 + paramFloat5);
    localze.a(paramFloat1, paramFloat2, paramFloat5 * 2.0F, paramFloat5 * 2.0F, 180.0F, 90.0F);
    localze.j();
    paramzr.a(paramzc, localze);
    paramzr.a(localzf);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zjz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */