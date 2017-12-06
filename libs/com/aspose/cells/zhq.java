package com.aspose.cells;

class zhq
  extends zhd
{
  private boolean c;
  
  zhq(zaca paramzaca, zaji paramzaji, boolean paramBoolean)
  {
    super(paramzaca, paramzaji);
    this.c = paramBoolean;
  }
  
  protected boolean a(zt paramzt)
  {
    if (zbdx.c(paramzt.l(0)))
    {
      if (this.c) {
        return true;
      }
      if (this.b.hasAutofilter())
      {
        CellArea localCellArea = this.b.getAutoFilter().a;
        if (paramzt.i() >= localCellArea.StartRow) {
          return true;
        }
      }
    }
    return false;
  }
  
  protected boolean a(zaai paramzaai)
  {
    if (!paramzaai.h()) {
      paramzaai.a(this.a);
    }
    return paramzaai.f();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zhq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */