package com.aspose.cells;

class znj
{
  int a;
  String b;
  int c = 60;
  
  boolean a()
  {
    return (this.c & 0x1) != 0;
  }
  
  void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.c |= 0x1;
    } else {
      this.c &= 0xFFFFFFFE;
    }
  }
  
  boolean b()
  {
    return (this.c & 0x2) == 0;
  }
  
  void b(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.c &= 0x2;
    } else {
      this.c |= 0xFFFFFFFD;
    }
  }
  
  boolean c()
  {
    return (this.c & 0x4) != 0;
  }
  
  void c(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.c |= 0x4;
    } else {
      this.c &= 0xFFFFFFFB;
    }
  }
  
  boolean d()
  {
    return (this.c & 0x8) != 0;
  }
  
  void d(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.c |= 0x8;
    } else {
      this.c &= 0xFFFFFFF7;
    }
  }
  
  boolean e()
  {
    return (this.c & 0x10) != 0;
  }
  
  void e(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.c |= 0x10;
    } else {
      this.c &= 0xFFFFFFEF;
    }
  }
  
  boolean f()
  {
    return (this.c & 0x20) != 0;
  }
  
  void f(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.c |= 0x20;
    } else {
      this.c &= 0xFFFFFFDF;
    }
  }
  
  boolean g()
  {
    return (this.c & 0x40) != 0;
  }
  
  void g(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.c |= 0x40;
    } else {
      this.c &= 0xFFFFFFBF;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/znj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */