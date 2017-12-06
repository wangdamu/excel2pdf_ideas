package com.aspose.cells;

class zaye
{
  int a;
  String b;
  int c;
  int d = 1;
  
  boolean a()
  {
    return (this.d & 0x1) != 0;
  }
  
  void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.d |= 0x1;
    } else {
      this.d &= 0xFFFFFFFE;
    }
  }
  
  boolean b()
  {
    return (this.d & 0x2) != 0;
  }
  
  void b(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.d |= 0x2;
    } else {
      this.d &= 0xFFFFFFFD;
    }
  }
  
  boolean c()
  {
    return (this.d & 0x4) != 0;
  }
  
  void c(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.d |= 0x4;
    } else {
      this.d &= 0xFFFFFFFB;
    }
  }
  
  boolean d()
  {
    return (this.d & 0x8) != 0;
  }
  
  void d(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.d |= 0x8;
    } else {
      this.d &= 0xFFFFFFF7;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaye.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */