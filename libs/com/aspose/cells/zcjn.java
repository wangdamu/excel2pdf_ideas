package com.aspose.cells;

public class zcjn
  extends zcjs
{
  public zcjh a;
  
  public zcjn(zcjs paramzcjs)
  {
    super(paramzcjs, 1);
  }
  
  public zcjh e()
  {
    if (this.a == null) {
      this.a = new zcjh(this, 8);
    }
    return this.a;
  }
  
  public boolean f()
  {
    return this.d == null;
  }
  
  public String a(String paramString)
  {
    if (this.a == null) {
      return null;
    }
    zcjg localzcjg = e().a(paramString);
    if (localzcjg != null) {
      return localzcjg.h;
    }
    return null;
  }
  
  public String a(String paramString1, String paramString2)
  {
    if (this.a == null) {
      return null;
    }
    zcjg localzcjg = e().b(paramString1, paramString2);
    if (localzcjg != null) {
      return localzcjg.h;
    }
    return null;
  }
  
  public boolean g()
  {
    if (this.a == null) {
      return false;
    }
    return this.a.getCount() != 0;
  }
  
  public zcjg b(String paramString)
  {
    if (this.a == null) {
      return null;
    }
    zcjg localzcjg = e().a(paramString);
    if (localzcjg != null) {
      return localzcjg;
    }
    return null;
  }
  
  public String b()
    throws Exception
  {
    return super.b();
  }
  
  public void c(zcjz paramzcjz)
    throws Exception
  {
    for (zcjs localzcjs = m(); localzcjs != null; localzcjs = localzcjs.n()) {
      localzcjs.a(paramzcjz);
    }
  }
  
  public void a(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.c(this.f, this.g, null);
    if (g())
    {
      zcjh localzcjh = e();
      for (int i = 0; i < localzcjh.getCount(); i++) {
        localzcjh.a(i).a(paramzcjz);
      }
    }
    if (f())
    {
      paramzcjz.b();
    }
    else
    {
      c(paramzcjz);
      paramzcjz.a();
    }
  }
  
  public String toString()
  {
    return k();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcjn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */