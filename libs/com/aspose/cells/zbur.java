package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

class zbur
{
  byte a;
  byte b = -1;
  int c = 528;
  int d = 0;
  ArrayList e = new ArrayList();
  byte f;
  byte g;
  byte h;
  byte i;
  boolean j = false;
  
  void a(zbur paramzbur)
  {
    this.a = paramzbur.a;
    this.b = paramzbur.b;
    this.c = paramzbur.c;
    this.d = paramzbur.d;
    this.f = paramzbur.f;
    this.g = paramzbur.g;
    this.h = paramzbur.h;
    this.i = paramzbur.i;
    this.j = paramzbur.j;
    for (int k = 0; k < paramzbur.e.size(); k++)
    {
      zbtz localzbtz = new zbtz();
      localzbtz.a((zbtz)paramzbur.e.get(k));
      zf.a(this.e, localzbtz);
    }
  }
  
  boolean a()
  {
    return (this.c & 0xFFFF & 0x200) != 0;
  }
  
  void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.c |= 0x200;
    }
    else
    {
      int k = 65023;
      this.c &= k;
    }
  }
  
  boolean b()
  {
    return (this.c & 0xFFFF & 0x400) != 0;
  }
  
  void b(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.c |= 0x400;
    }
    else
    {
      int k = 64511;
      this.c &= k;
    }
  }
  
  boolean c()
  {
    return (this.c & 0xFFFF & 0x800) != 0;
  }
  
  void c(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.c |= 0x800;
    }
    else
    {
      int k = 63487;
      this.c &= k;
    }
  }
  
  boolean d()
  {
    return (this.c & 0xFFFF & 0x1000) != 0;
  }
  
  void d(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.c |= 0x1000;
    }
    else
    {
      int k = 61439;
      this.c &= k;
    }
  }
  
  boolean e()
  {
    return (this.c & 0xFFFF & 0x4000) != 0;
  }
  
  void e(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.c |= 0x4000;
    }
    else
    {
      int k = 49151;
      this.c &= k;
    }
  }
  
  byte f()
  {
    return (byte)(this.c & 0xFFFF & 0xF);
  }
  
  void a(byte paramByte)
  {
    this.c |= paramByte;
  }
  
  byte g()
  {
    return (byte)((this.c & 0xFFFF & 0xF0) >> 4);
  }
  
  void b(byte paramByte)
  {
    this.c &= 0xFF0F;
    this.c |= (paramByte & 0xFF) << 4;
  }
  
  boolean h()
  {
    return (this.d & 0xFFFF & 0x1) != 0;
  }
  
  void f(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.d |= 0x1;
    }
    else
    {
      int k = -2;
      this.d &= k;
    }
  }
  
  boolean i()
  {
    return (this.d & 0xFFFF & 0x2) != 0;
  }
  
  void g(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.d |= 0x2;
    }
    else
    {
      int k = -3;
      this.d &= k;
    }
  }
  
  boolean j()
  {
    return (this.c & 0xFFFF & 0x100) != 0;
  }
  
  void h(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.c |= 0x100;
    }
    else
    {
      int k = 65279;
      this.c &= k;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbur.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */