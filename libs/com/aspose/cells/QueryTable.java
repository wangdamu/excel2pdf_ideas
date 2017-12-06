package com.aspose.cells;

import com.aspose.cells.b.a.zs;

public class QueryTable
{
  Object a;
  String b;
  int c = 1055305;
  int d = 16;
  int e = -1;
  String f;
  zayf g;
  zayf h;
  DataSorter i;
  String j;
  int k = -1;
  int l = 23;
  int m = 0;
  int n = 0;
  
  QueryTable(Object parent)
  {
    this.a = parent;
    a(true);
    setPreserveFormatting(true);
    setAdjustColumnWidth(true);
    h(true);
    d(true);
  }
  
  public int getConnectionId()
  {
    return this.e;
  }
  
  public String getName()
  {
    return this.f;
  }
  
  String a()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    char[] arrayOfChar = getName().toCharArray();
    for (int i1 = 0; i1 < arrayOfChar.length; i1++) {
      switch (arrayOfChar[i1])
      {
      case ' ': 
      case '(': 
        localStringBuilder.append('_');
        break;
      case ')': 
        break;
      default: 
        localStringBuilder.append(arrayOfChar[i1]);
      }
    }
    return zs.a(localStringBuilder);
  }
  
  DataSorter b()
  {
    if (this.i == null) {
      this.i = new DataSorter(this);
    }
    return this.i;
  }
  
  zayf c()
  {
    if (this.g == null) {
      this.g = new zayf();
    }
    return this.g;
  }
  
  zayf d()
  {
    if (this.h == null) {
      this.h = new zayf();
    }
    return this.h;
  }
  
  boolean e()
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
  
  boolean f()
  {
    return (this.c & 0x2) != 0;
  }
  
  void b(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.c |= 0x2;
    } else {
      this.c &= 0xFFFFFFFD;
    }
  }
  
  boolean g()
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
  
  boolean h()
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
  
  boolean i()
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
  
  boolean j()
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
  
  int k()
  {
    if ((this.c & 0x40) != 0) {
      return 1;
    }
    if ((this.c & 0x80) != 0) {
      return 2;
    }
    return 0;
  }
  
  void a(int paramInt)
  {
    this.c &= 0xFF3F;
    switch (paramInt)
    {
    case 0: 
      break;
    case 1: 
      this.c |= 0x40;
      break;
    case 2: 
      this.c |= 0x80;
      break;
    }
  }
  
  boolean l()
  {
    return (this.c & 0x100) != 0;
  }
  
  void g(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.c |= 0x100;
    } else {
      this.c &= 0xFEFF;
    }
  }
  
  boolean m()
  {
    return (this.c & 0x200) != 0;
  }
  
  void h(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.c |= 0x200;
    } else {
      this.c &= 0xFDFF;
    }
  }
  
  boolean n()
  {
    return (this.c & 0x400) != 0;
  }
  
  void i(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.c |= 0x400;
    } else {
      this.c &= 0xFBFF;
    }
  }
  
  public boolean getPreserveFormatting()
  {
    return (this.c & 0x800) != 0;
  }
  
  public void setPreserveFormatting(boolean value)
  {
    if (value) {
      this.c |= 0x800;
    } else {
      this.c &= 0xF7FF;
    }
  }
  
  public boolean getAdjustColumnWidth()
  {
    return (this.c & 0x1000) != 0;
  }
  
  public void setAdjustColumnWidth(boolean value)
  {
    if (value) {
      this.c |= 0x1000;
    } else {
      this.c &= 0xEFFF;
    }
  }
  
  boolean o()
  {
    return (this.c & 0x2000) != 0;
  }
  
  void j(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.c |= 0x2000;
    } else {
      this.c &= 0xDFFF;
    }
  }
  
  boolean p()
  {
    return (this.c & 0x4000) != 0;
  }
  
  void k(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.c |= 0x4000;
    } else {
      this.c &= 0xBFFF;
    }
  }
  
  boolean q()
  {
    return (this.c & 0x8000) != 0;
  }
  
  void l(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.c |= 0x8000;
    } else {
      this.c &= 0xFFFF7FFF;
    }
  }
  
  boolean r()
  {
    return (this.c & 0x10000) != 0;
  }
  
  void m(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.c |= 0x10000;
    } else {
      this.c &= 0xFFFEFFFF;
    }
  }
  
  boolean s()
  {
    return (this.c & 0x20000) != 0;
  }
  
  void n(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.c |= 0x20000;
    } else {
      this.c &= 0xFFFDFFFF;
    }
  }
  
  boolean t()
  {
    return (this.c & 0x40000) != 0;
  }
  
  void o(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.c |= 0x40000;
    } else {
      this.c &= 0xFFFBFFFF;
    }
  }
  
  void p(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.c |= 0x80000;
    } else {
      this.c &= 0xFFF7FFFF;
    }
  }
  
  boolean u()
  {
    return (this.c & 0x1000000) != 0;
  }
  
  void q(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.c |= 0x1000000;
    } else {
      this.c &= 0xFEFFFFFF;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/QueryTable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */