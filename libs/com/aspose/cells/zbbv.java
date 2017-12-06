package com.aspose.cells;

class zbbv
  extends zbbu
{
  int b;
  int c;
  CellArea d;
  int e;
  
  public int a()
  {
    return 3;
  }
  
  boolean b()
  {
    return (this.b & 0x1) != 0;
  }
  
  boolean c()
  {
    return (this.b & 0x2) != 0;
  }
  
  void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.b |= 0x2;
    } else {
      this.b &= 0xFFFFFFFD;
    }
  }
  
  boolean d()
  {
    return (this.b & 0x4) != 0;
  }
  
  void b(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.b |= 0x4;
    } else {
      this.b &= 0xFFFFFFFB;
    }
  }
  
  boolean e()
  {
    return (this.b & 0x8) != 0;
  }
  
  void c(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.b |= 0x8;
    } else {
      this.b &= 0xFFFFFFF7;
    }
  }
  
  boolean f()
  {
    return (this.b & 0x10) != 0;
  }
  
  void d(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.b |= 0x10;
    } else {
      this.b &= 0xFFFFFFEF;
    }
  }
  
  boolean g()
  {
    return (this.b & 0x20) != 0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbbv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */