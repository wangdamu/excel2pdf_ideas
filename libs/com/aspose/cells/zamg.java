package com.aspose.cells;

class zamg
  extends zw
{
  int e;
  
  zamg(ShadowEffect paramShadowEffect)
  {
    super(paramShadowEffect);
  }
  
  int a()
  {
    return 1;
  }
  
  public double e()
  {
    return zbxp.c(this.e);
  }
  
  public void c(double paramDouble)
  {
    this.e = zbxp.f(paramDouble);
  }
  
  void a(zw paramzw, CopyOptions paramCopyOptions)
  {
    super.a(paramzw, paramCopyOptions);
    this.e = ((zamg)paramzw).e;
  }
  
  boolean a(zw paramzw)
  {
    if (this.e != ((zamg)paramzw).e) {
      return false;
    }
    return super.a(paramzw);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zamg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */