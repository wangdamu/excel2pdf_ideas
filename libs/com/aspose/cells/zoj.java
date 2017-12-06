package com.aspose.cells;

import com.aspose.cells.b.a.zh;

class zoj
{
  int a;
  zh b;
  int c = 240;
  int d = 120;
  int e = 14940;
  int f = 9225;
  int g = 66359;
  int h = 600;
  int i;
  String j;
  
  boolean a()
  {
    return (this.g & 0x1) != 0;
  }
  
  void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.g |= 0x1;
    } else {
      this.g &= 0xFFFFFFFE;
    }
  }
  
  boolean b()
  {
    return (this.g & 0x2) != 0;
  }
  
  void b(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.g |= 0x2;
    } else {
      this.g &= 0xFFFFFFFD;
    }
  }
  
  int c()
  {
    switch (this.g & 0xC)
    {
    case 0: 
      return 2;
    case 4: 
      return 1;
    case 8: 
      return 0;
    }
    return 0;
  }
  
  void a(int paramInt)
  {
    int k = 0;
    switch (paramInt)
    {
    case 2: 
      k = 0;
      break;
    case 1: 
      k = 4;
      break;
    case 0: 
      k = 8;
    }
    this.g &= 0xFFFFFFF3;
    this.g |= k;
  }
  
  boolean d()
  {
    return (this.g & 0x10) != 0;
  }
  
  void c(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.g |= 0x10;
    } else {
      this.g &= 0xFFFFFFEF;
    }
  }
  
  boolean e()
  {
    return (this.g & 0x20) != 0;
  }
  
  void d(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.g |= 0x20;
    } else {
      this.g &= 0xFFFFFFDF;
    }
  }
  
  int f()
  {
    switch (this.g & 0xC0)
    {
    case 128: 
      return 1;
    case 64: 
      return 2;
    case 0: 
      return 0;
    }
    return 1;
  }
  
  void b(int paramInt)
  {
    int k = 0;
    switch (paramInt)
    {
    case 1: 
      k = 80;
      break;
    case 2: 
      k = 64;
      break;
    case 0: 
      k = 0;
    }
    this.g &= 0xFF3F;
    this.g |= k;
  }
  
  boolean g()
  {
    return (this.g & 0x100) != 0;
  }
  
  void e(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.g |= 0x100;
    } else {
      this.g &= 0xFEFF;
    }
  }
  
  boolean h()
  {
    return (this.g & 0x200) != 0;
  }
  
  void f(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.g |= 0x200;
    } else {
      this.g &= 0xFDFF;
    }
  }
  
  boolean i()
  {
    return (this.g & 0x400) != 0;
  }
  
  void g(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.g |= 0x400;
    } else {
      this.g &= 0xFBFF;
    }
  }
  
  boolean j()
  {
    return (this.g & 0x800) != 0;
  }
  
  void h(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.g |= 0x800;
    } else {
      this.g &= 0xF7FF;
    }
  }
  
  boolean k()
  {
    return (this.g & 0x1000) != 0;
  }
  
  void i(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.g |= 0x1000;
    } else {
      this.g &= 0xEFFF;
    }
  }
  
  boolean l()
  {
    return (this.g & 0x2000) != 0;
  }
  
  void j(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.g |= 0x2000;
    } else {
      this.g &= 0xDFFF;
    }
  }
  
  boolean m()
  {
    return (this.g & 0x4000) != 0;
  }
  
  void k(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.g |= 0x4000;
    } else {
      this.g &= 0xBFFF;
    }
  }
  
  boolean n()
  {
    return (this.g & 0x8000) != 0;
  }
  
  void l(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.g |= 0x8000;
    } else {
      this.g &= 0xFFFF7FFF;
    }
  }
  
  boolean o()
  {
    return (this.g & 0x20000) != 0;
  }
  
  void m(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.g |= 0x20000;
    } else {
      this.g &= 0xFFFDFFFF;
    }
  }
  
  boolean p()
  {
    return (this.g & 0x10000) != 0;
  }
  
  void n(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.g |= 0x10000;
    } else {
      this.g &= 0xFFFEFFFF;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zoj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */