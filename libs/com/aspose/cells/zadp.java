package com.aspose.cells;

class zadp
{
  int a;
  boolean b;
  
  void a(zadp paramzadp)
  {
    this.a = paramzadp.a;
    this.b = paramzadp.b;
  }
  
  boolean b(zadp paramzadp)
  {
    if (this.a != paramzadp.a) {
      return false;
    }
    return this.b == paramzadp.b;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zadp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */