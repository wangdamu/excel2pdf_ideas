package com.aspose.cells.a.d;

public class zap
{
  private static float a = 96.0F;
  private static float b = 0.0F;
  private static Object c = new Object();
  
  public static float a()
  {
    return a;
  }
  
  public static float b()
  {
    if (b == 0.0F) {
      synchronized (c)
      {
        if (b == 0.0F) {
          b = c();
        }
      }
    }
    return b;
  }
  
  public static boolean a(float paramFloat)
  {
    if (b == 0.0F) {
      synchronized (c)
      {
        if (b == 0.0F)
        {
          b = paramFloat;
          return true;
        }
      }
    }
    return false;
  }
  
  /* Error */
  private static float c()
  {
    // Byte code:
    //   0: new 3	com/aspose/cells/b/a/b/za
    //   3: dup
    //   4: iconst_1
    //   5: iconst_1
    //   6: invokespecial 12	com/aspose/cells/b/a/b/za:<init>	(II)V
    //   9: astore_0
    //   10: aload_0
    //   11: invokestatic 14	com/aspose/cells/b/a/b/zi:a	(Lcom/aspose/cells/b/a/b/zj;)Lcom/aspose/cells/b/a/b/zi;
    //   14: astore_1
    //   15: aload_1
    //   16: invokevirtual 16	com/aspose/cells/b/a/b/zi:f	()F
    //   19: fstore_2
    //   20: fload_2
    //   21: fstore_3
    //   22: aload_1
    //   23: ifnull +7 -> 30
    //   26: aload_1
    //   27: invokevirtual 15	com/aspose/cells/b/a/b/zi:d	()V
    //   30: aload_0
    //   31: ifnull +7 -> 38
    //   34: aload_0
    //   35: invokevirtual 13	com/aspose/cells/b/a/b/za:b	()V
    //   38: fload_3
    //   39: freturn
    //   40: astore 4
    //   42: aload_1
    //   43: ifnull +7 -> 50
    //   46: aload_1
    //   47: invokevirtual 15	com/aspose/cells/b/a/b/zi:d	()V
    //   50: aload 4
    //   52: athrow
    //   53: astore 5
    //   55: aload_0
    //   56: ifnull +7 -> 63
    //   59: aload_0
    //   60: invokevirtual 13	com/aspose/cells/b/a/b/za:b	()V
    //   63: aload 5
    //   65: athrow
    //   66: astore_0
    //   67: getstatic 8	com/aspose/cells/a/d/zap:a	F
    //   70: freturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   9	51	0	localza	com.aspose.cells.b.a.b.za
    //   66	1	0	localException	Exception
    //   14	33	1	localzi	com.aspose.cells.b.a.b.zi
    //   19	2	2	f1	float
    //   21	18	3	f2	float
    //   40	11	4	localObject1	Object
    //   53	11	5	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   15	22	40	finally
    //   40	42	40	finally
    //   10	30	53	finally
    //   40	55	53	finally
    //   0	38	66	java/lang/Exception
    //   40	66	66	java/lang/Exception
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */