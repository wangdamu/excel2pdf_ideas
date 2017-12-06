package com.aspose.cells;

class zrk
{
  boolean a = true;
  boolean b = false;
  
  boolean a(zrk paramzrk)
  {
    return (this.a == paramzrk.a) && (this.b == paramzrk.a);
  }
  
  void a(Style paramStyle)
  {
    paramStyle.setLocked(this.a);
    paramStyle.setFormulaHidden(this.b);
  }
  
  static zrk b(Style paramStyle)
  {
    if (!paramStyle.o())
    {
      localObject = paramStyle.getParentStyle();
      if ((localObject == null) || (!((Style)localObject).o())) {
        return null;
      }
    }
    Object localObject = new zrk();
    ((zrk)localObject).a = paramStyle.isLocked();
    ((zrk)localObject).b = paramStyle.isFormulaHidden();
    return (zrk)localObject;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zrk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */