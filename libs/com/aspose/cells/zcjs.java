package com.aspose.cells;

import com.aspose.cells.b.a.zg;
import com.aspose.cells.b.a.zs;
import java.util.Iterator;

public abstract class zcjs
  implements Iterable
{
  public zcjs b;
  public zcjs c;
  public zcjs d;
  public int e;
  public String f;
  public String g;
  public String h;
  public String i;
  public boolean j;
  
  void h()
  {
    if (this.d != null) {
      this.d.h();
    }
    this.d = null;
    Object localObject = this.c;
    this.c = null;
    while ((localObject != null) && (localObject != this))
    {
      ((zcjs)localObject).h();
      zcjs localzcjs = ((zcjs)localObject).c;
      ((zcjs)localObject).c = null;
      localObject = localzcjs;
    }
    zg.a(this);
  }
  
  public zcjs(zcjs paramzcjs, int paramInt)
  {
    this.b = paramzcjs;
    this.e = paramInt;
  }
  
  public String d()
  {
    return a();
  }
  
  public String a()
  {
    zcjs localzcjs = m();
    if (localzcjs == null) {
      return "";
    }
    if (localzcjs.n() == null) {
      switch (localzcjs.e)
      {
      case 3: 
        return localzcjs.h;
      }
    }
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder);
    return zs.a(localStringBuilder);
  }
  
  public void i()
  {
    Object localObject = m();
    zcjs localzcjs = null;
    while (localObject != null)
    {
      localzcjs = ((zcjs)localObject).c;
      ((zcjs)localObject).c = null;
      localObject = localzcjs;
    }
    this.d = null;
    if (this.e == 1) {
      ((zcjn)this).a = null;
    }
  }
  
  private void a(StringBuilder paramStringBuilder)
  {
    for (zcjs localzcjs = m(); localzcjs != null; localzcjs = localzcjs.n()) {
      if (localzcjs.m() == null)
      {
        if (localzcjs.e == 3) {
          paramStringBuilder.append(localzcjs.a());
        }
      }
      else {
        localzcjs.a(paramStringBuilder);
      }
    }
  }
  
  public zcjs a(zcjs paramzcjs)
  {
    paramzcjs.b = this;
    if (this.d != null)
    {
      zcjs localzcjs = this.d.c;
      paramzcjs.c = localzcjs;
      this.d.c = paramzcjs;
      this.d = paramzcjs;
    }
    else
    {
      paramzcjs.c = paramzcjs;
      this.d = paramzcjs;
    }
    return paramzcjs;
  }
  
  public zcju c(String paramString)
  {
    int k = paramString.indexOf(':');
    String str1 = paramString;
    String str2 = null;
    if (k != -1)
    {
      str2 = paramString.substring(0, 0 + k);
      str1 = paramString.substring(k + 1);
    }
    return new zcjo(this, str2, str1);
  }
  
  public zcju b(String paramString1, String paramString2)
  {
    return new zcjo(this, paramString1);
  }
  
  public Iterator iterator()
  {
    return new zcjt(this);
  }
  
  /* Error */
  public String c()
    throws Exception
  {
    // Byte code:
    //   0: new 16	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 55	java/lang/StringBuilder:<init>	()V
    //   7: astore_1
    //   8: new 11	com/aspose/cells/zcjz
    //   11: dup
    //   12: aload_1
    //   13: invokespecial 47	com/aspose/cells/zcjz:<init>	(Ljava/lang/StringBuilder;)V
    //   16: astore_2
    //   17: aload_2
    //   18: aload_0
    //   19: getfield 31	com/aspose/cells/zcjs:j	Z
    //   22: invokevirtual 49	com/aspose/cells/zcjz:c	(Z)V
    //   25: aload_2
    //   26: iconst_0
    //   27: invokevirtual 48	com/aspose/cells/zcjz:a	(I)V
    //   30: aload_0
    //   31: aload_2
    //   32: invokevirtual 37	com/aspose/cells/zcjs:a	(Lcom/aspose/cells/zcjz;)V
    //   35: aload_2
    //   36: invokevirtual 50	com/aspose/cells/zcjz:f	()V
    //   39: goto +10 -> 49
    //   42: astore_3
    //   43: aload_2
    //   44: invokevirtual 50	com/aspose/cells/zcjz:f	()V
    //   47: aload_3
    //   48: athrow
    //   49: aload_1
    //   50: invokestatic 33	com/aspose/cells/b/a/zs:a	(Ljava/lang/Object;)Ljava/lang/String;
    //   53: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	54	0	this	zcjs
    //   7	43	1	localStringBuilder	StringBuilder
    //   16	28	2	localzcjz	zcjz
    //   42	6	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   30	35	42	finally
  }
  
  public void c(zcjz paramzcjz)
    throws Exception
  {}
  
  public void a(zcjz paramzcjz)
    throws Exception
  {}
  
  /* Error */
  public String b()
    throws Exception
  {
    // Byte code:
    //   0: new 16	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 55	java/lang/StringBuilder:<init>	()V
    //   7: astore_1
    //   8: new 11	com/aspose/cells/zcjz
    //   11: dup
    //   12: aload_1
    //   13: invokespecial 47	com/aspose/cells/zcjz:<init>	(Ljava/lang/StringBuilder;)V
    //   16: astore_2
    //   17: aload_2
    //   18: aload_0
    //   19: getfield 31	com/aspose/cells/zcjs:j	Z
    //   22: invokevirtual 49	com/aspose/cells/zcjz:c	(Z)V
    //   25: aload_0
    //   26: aload_2
    //   27: invokevirtual 39	com/aspose/cells/zcjs:c	(Lcom/aspose/cells/zcjz;)V
    //   30: aload_2
    //   31: invokevirtual 50	com/aspose/cells/zcjz:f	()V
    //   34: goto +10 -> 44
    //   37: astore_3
    //   38: aload_2
    //   39: invokevirtual 50	com/aspose/cells/zcjz:f	()V
    //   42: aload_3
    //   43: athrow
    //   44: aload_1
    //   45: invokestatic 33	com/aspose/cells/b/a/zs:a	(Ljava/lang/Object;)Ljava/lang/String;
    //   48: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	49	0	this	zcjs
    //   7	38	1	localStringBuilder	StringBuilder
    //   16	23	2	localzcjz	zcjz
    //   37	6	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   25	30	37	finally
  }
  
  public boolean j()
  {
    return this.d != null;
  }
  
  public String k()
  {
    if (this.i == null) {
      if (this.f == null) {
        this.i = this.g;
      } else {
        this.i = (this.f + ":" + this.g);
      }
    }
    return this.i;
  }
  
  public void d(String paramString)
  {
    int k = paramString.indexOf(':');
    if (k == -1)
    {
      this.g = paramString;
    }
    else
    {
      this.f = paramString.substring(0, 0 + k);
      this.g = paramString.substring(k + 1);
    }
  }
  
  public zcju l()
  {
    return new zcju(this);
  }
  
  public zcjs m()
  {
    zcjs localzcjs = this.d;
    if (localzcjs != null) {
      return localzcjs.c;
    }
    return null;
  }
  
  public zcjs e(String paramString)
  {
    return l().a(paramString);
  }
  
  public zcjs n()
  {
    if ((this.b != null) && (this.b.d != this)) {
      return this.c;
    }
    return null;
  }
  
  public void a(zaqr paramzaqr)
  {
    this.g = paramzaqr.c;
    this.f = paramzaqr.b;
    this.e = paramzaqr.a;
    this.h = paramzaqr.d;
  }
  
  public zcjh e()
  {
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcjs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */