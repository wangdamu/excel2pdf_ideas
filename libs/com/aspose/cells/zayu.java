package com.aspose.cells;

abstract class zayu
  extends zayp
{
  private boolean f = false;
  protected Worksheet a;
  protected zaca b;
  protected zgs c;
  protected zaie d;
  protected int e = 5;
  
  public zayu(zaca paramzaca, Worksheet paramWorksheet)
  {
    this.a = paramWorksheet;
    this.b = paramzaca;
  }
  
  public void d(int paramInt)
  {
    this.e = paramInt;
  }
  
  public zaie h()
  {
    if (this.d == null) {
      this.d = C();
    }
    return this.d;
  }
  
  public int b()
  {
    return 9;
  }
  
  public boolean z()
  {
    return this.f;
  }
  
  public void b(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  protected zaie C()
  {
    return zabt.a(this.a, this.c, this.f, this.b);
  }
  
  protected zaie a(zgs paramzgs)
  {
    return zabt.a(this.a, paramzgs, this.f, this.b);
  }
  
  protected void a(zayu paramzayu)
  {
    this.f = paramzayu.f;
    this.e = paramzayu.e;
    this.c = paramzayu.c;
    this.d = paramzayu.d;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zayu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */