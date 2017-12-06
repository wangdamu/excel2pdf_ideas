package com.aspose.cells.a.d;

import com.aspose.cells.DateTime;

public class zfa
  extends zey
{
  private String a;
  private String b;
  private String c;
  private String d;
  private String f;
  private DateTime g;
  
  public zfa(zdz paramzdz)
  {
    super(paramzdz);
  }
  
  public String b()
  {
    return this.a;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public String c()
  {
    return this.b;
  }
  
  public void b(String paramString)
  {
    this.b = paramString;
  }
  
  public String d()
  {
    return this.c;
  }
  
  public void c(String paramString)
  {
    this.c = paramString;
  }
  
  public String e()
  {
    return this.d;
  }
  
  public void d(String paramString)
  {
    this.d = paramString;
  }
  
  public DateTime f()
  {
    return this.g;
  }
  
  public void a(DateTime paramDateTime)
  {
    this.g = paramDateTime;
  }
  
  public String g()
  {
    return this.f;
  }
  
  public void e(String paramString)
  {
    this.f = paramString;
  }
  
  public void a(zez paramzez)
    throws Exception
  {
    paramzez.a(this);
    paramzez.g();
    if (this.e.k() != null)
    {
      this.e.k().a(this);
      paramzez.a(this.e.k());
    }
    paramzez.c("/Title", this.a);
    paramzez.c("/Author", this.b);
    paramzez.c("/Subject", this.c);
    paramzez.c("/Keywords", this.d);
    paramzez.c("/Producer", this.f);
    paramzez.c("/Creator", "Aspose.Cells");
    paramzez.a("/CreationDate", this.g);
    paramzez.a("/ModDate", this.g);
    paramzez.h();
    paramzez.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zfa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */