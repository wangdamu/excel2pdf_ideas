package com.aspose.cells;

class zapz
  extends zw
{
  String e = null;
  
  zapz(ShadowEffect paramShadowEffect)
  {
    super(paramShadowEffect);
    this.a = paramShadowEffect;
  }
  
  int a()
  {
    return 3;
  }
  
  void a(zw paramzw, CopyOptions paramCopyOptions)
  {
    super.a(paramzw, paramCopyOptions);
    this.e = ((zapz)paramzw).e;
  }
  
  boolean a(zw paramzw)
  {
    if (!super.a(paramzw)) {
      return false;
    }
    return com.aspose.cells.b.a.zw.b(this.e, ((zapz)paramzw).e);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zapz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */