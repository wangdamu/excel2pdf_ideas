package com.aspose.cells;

class zadq
{
  int a;
  int b;
  int c;
  int d;
  int e;
  
  void a(zadq paramzadq)
  {
    this.a = paramzadq.a;
    this.b = paramzadq.b;
    this.e = paramzadq.e;
    this.c = paramzadq.c;
    this.d = paramzadq.d;
  }
  
  boolean b(zadq paramzadq)
  {
    if (this.a != paramzadq.a) {
      return false;
    }
    if (this.b != paramzadq.b) {
      return false;
    }
    if (this.e != paramzadq.e) {
      return false;
    }
    if (this.c != paramzadq.c) {
      return false;
    }
    return this.d == paramzadq.d;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zadq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */