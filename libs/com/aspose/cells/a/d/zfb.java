package com.aspose.cells.a.d;

public class zfb
  extends zey
{
  private zfc a;
  
  public zfb(zdz paramzdz)
  {
    super(paramzdz);
  }
  
  public zfc b()
  {
    if (this.a == null) {
      this.a = new zfc(this.e);
    }
    return this.a;
  }
  
  public boolean c()
  {
    return this.a == null;
  }
  
  public void a(zez paramzez)
    throws Exception
  {
    paramzez.a(this);
    paramzez.g();
    if (this.a != null) {
      paramzez.a("/Dests", this.a.o());
    }
    paramzez.h();
    paramzez.b();
    if (this.a != null) {
      this.a.a(paramzez);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zfb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */