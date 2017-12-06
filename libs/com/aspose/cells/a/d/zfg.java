package com.aspose.cells.a.d;

import java.util.HashMap;
import java.util.Iterator;

public class zfg
{
  private zdz b;
  private zfh c;
  private zfh d;
  private HashMap e;
  
  public zfg(zdz paramzdz)
  {
    this.b = paramzdz;
    this.c = new zfh(this.b, "Root", -1, null, true);
    this.d = this.c;
    this.e = new HashMap();
  }
  
  public void a(String paramString, int paramInt, zeb paramzeb, boolean paramBoolean)
  {
    if ((!a) && (paramString == null)) {
      throw new AssertionError();
    }
    if ((!a) && (paramInt < 0)) {
      throw new AssertionError();
    }
    if ((!a) && (paramzeb == null)) {
      throw new AssertionError();
    }
    this.e.put(paramzeb.o(), paramzeb);
    zfh localzfh = new zfh(this.b, paramString, paramInt, paramzeb, paramBoolean);
    if (localzfh.b > this.d.b)
    {
      this.d.a(localzfh);
    }
    else if (localzfh.b < this.d.b)
    {
      while (this.d.b >= localzfh.b) {
        this.d = this.d.c;
      }
      this.d.a(localzfh);
    }
    else
    {
      this.d.c.a(localzfh);
    }
    this.d = localzfh;
  }
  
  public void a(zez paramzez)
    throws Exception
  {
    paramzez.a(this.c);
    paramzez.g();
    paramzez.a("/Type", "/Outlines");
    if (this.c.g != null) {
      paramzez.a("/First", this.c.g.o());
    }
    if (this.c.h != null) {
      paramzez.a("/Last", this.c.h.o());
    }
    paramzez.h();
    paramzez.b();
    for (Object localObject = this.c.g; localObject != null; localObject = ((zfh)localObject).f) {
      ((zfh)localObject).a(paramzez);
    }
    localObject = this.e.keySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      zeb localzeb = (zeb)this.e.get(str);
      localzeb.a(paramzez);
    }
  }
  
  public boolean a()
  {
    return this.c.g == null;
  }
  
  public String b()
  {
    return this.c.o();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zfg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */