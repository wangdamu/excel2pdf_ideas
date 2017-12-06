package com.aspose.cells;

class zbbz
  extends zbbu
{
  CellArea b;
  CellArea c;
  boolean d;
  int e;
  int f;
  int g;
  boolean h;
  zbca i;
  
  public int a()
  {
    return 8;
  }
  
  String b()
  {
    return this.b.a(1048575, 16383, false);
  }
  
  void a(String paramString)
  {
    this.b = CellArea.a(paramString);
  }
  
  String c()
  {
    return this.c.a(1048575, 16383, false);
  }
  
  void b(String paramString)
  {
    this.c = CellArea.a(paramString);
  }
  
  zbca d()
  {
    if (this.i == null) {
      this.i = new zbca(this);
    }
    return this.i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbbz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */