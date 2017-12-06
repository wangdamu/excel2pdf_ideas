package com.aspose.cells;

class zhc
  extends zhd
{
  private boolean c;
  private boolean d;
  private boolean e;
  
  zhc(zaca paramzaca, zaji paramzaji, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    super(paramzaca, paramzaji);
    this.c = paramBoolean1;
    this.d = paramBoolean2;
    this.e = paramBoolean3;
  }
  
  protected boolean a(zt paramzt)
  {
    return (this.c) && (zbdx.c(paramzt.l(0)));
  }
  
  protected boolean a(zaai paramzaai)
  {
    if (this.d)
    {
      if (!paramzaai.h()) {
        paramzaai.a(this.a);
      }
      if (paramzaai.f()) {
        return true;
      }
      return (this.e) && (paramzaai.g());
    }
    if (this.e)
    {
      if (!paramzaai.h()) {
        paramzaai.a(this.a);
      }
      return paramzaai.g();
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zhc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */