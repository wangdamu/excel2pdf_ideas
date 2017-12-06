package com.aspose.cells;

class zaqt
{
  int a;
  int b;
  int c;
  
  void a(zaqt paramzaqt)
  {
    this.a = paramzaqt.a;
    this.b = paramzaqt.b;
    this.c = paramzaqt.c;
  }
  
  boolean b(zaqt paramzaqt)
  {
    if (this.a != paramzaqt.a) {
      return false;
    }
    if (this.b != paramzaqt.b) {
      return false;
    }
    return this.c == paramzaqt.c;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaqt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */