package com.aspose.cells.a.d;

import java.util.Iterator;
import java.util.List;

public class zdp
  implements Iterable
{
  private String a;
  private zgm b;
  private zgm c;
  private int d = 1;
  
  public zdp(String paramString)
  {
    this.a = paramString;
    this.b = new zgm(true);
    this.c = new zgm(false);
  }
  
  public String a(String paramString1, String paramString2, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (zhf.b(paramString2))
      {
        paramString2 = "file:///" + paramString2;
        paramString2 = zhf.f(paramString2);
      }
    }
    else {
      paramString2 = zdk.a(this.a, paramString2);
    }
    zdo localzdo = (zdo)this.c.d(paramString2);
    if (localzdo != null) {
      return localzdo.a();
    }
    String str = "rId" + this.d;
    this.d += 1;
    a(str, paramString1, paramString2, paramBoolean);
    return str;
  }
  
  public void a(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    zdo localzdo = new zdo(paramString1, paramString2, paramString3, paramBoolean);
    this.b.b(paramString1, localzdo);
    this.c.b(paramString3, localzdo);
  }
  
  public Iterator iterator()
  {
    return this.b.e().iterator();
  }
  
  public int a()
  {
    return this.b.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zdp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */