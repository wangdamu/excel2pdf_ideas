package com.aspose.cells.a.d;

public class zfh
  extends zey
{
  public String a;
  public int b;
  private zeb k;
  public zfh c;
  public zfh d;
  public zfh f;
  public zfh g;
  public zfh h;
  public boolean i = false;
  
  public zfh(zdz paramzdz, String paramString, int paramInt, zeb paramzeb, boolean paramBoolean)
  {
    super(paramzdz);
    if ((!j) && (paramString == null)) {
      throw new AssertionError();
    }
    this.a = paramString;
    this.b = paramInt;
    this.k = paramzeb;
    this.i = paramBoolean;
  }
  
  public void a(zez paramzez)
    throws Exception
  {
    paramzez.a(this);
    paramzez.g();
    paramzez.c("/Title", this.a);
    paramzez.a("/Parent", this.c.o());
    if (this.d != null) {
      paramzez.a("/Prev", this.d.o());
    }
    if (this.f != null) {
      paramzez.a("/Next", this.f.o());
    }
    if (this.g != null) {
      paramzez.a("/First", this.g.o());
    }
    if (this.h != null) {
      paramzez.a("/Last", this.h.o());
    }
    if (this.g != null)
    {
      int m = b();
      paramzez.a("/Count", m);
    }
    paramzez.a("/A", this.k.o());
    paramzez.h();
    paramzez.b();
    for (zfh localzfh = this.g; localzfh != null; localzfh = localzfh.f) {
      localzfh.a(paramzez);
    }
  }
  
  public void a(zfh paramzfh)
  {
    if (this.g == null)
    {
      this.g = paramzfh;
    }
    else
    {
      this.h.f = paramzfh;
      paramzfh.d = this.h;
    }
    this.h = paramzfh;
    paramzfh.c = this;
  }
  
  private int b()
  {
    int m = 0;
    for (zfh localzfh = this.g; localzfh != null; localzfh = localzfh.f) {
      m++;
    }
    if (this.i) {
      return m;
    }
    return -m;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zfh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */