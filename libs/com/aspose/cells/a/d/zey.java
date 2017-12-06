package com.aspose.cells.a.d;

import com.aspose.cells.b.a.zp;

public abstract class zey
{
  protected zdz e;
  private String a;
  private int b;
  private int c = -1;
  
  public zey(zdz paramzdz)
  {
    this.e = paramzdz;
    this.b = paramzdz.a();
  }
  
  public int n()
  {
    return this.b;
  }
  
  public String o()
  {
    return zp.a(this.b) + " 0 R";
  }
  
  public boolean p()
  {
    return e_() != 0;
  }
  
  public String q()
    throws Exception
  {
    if ((p()) && (this.a == null)) {
      this.a = s();
    }
    return this.a;
  }
  
  public int e_()
  {
    return 0;
  }
  
  public int r()
  {
    return this.c;
  }
  
  public void b(int paramInt)
  {
    this.c = paramInt;
  }
  
  public abstract void a(zez paramzez)
    throws Exception;
  
  public String s()
    throws Exception
  {
    if (!p()) {
      throw new Exception("Tried to generate a resource name not being a resource.");
    }
    return zfp.c(e_()) + zp.a(this.e.c().a(e_()) + 1);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */