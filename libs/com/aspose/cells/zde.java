package com.aspose.cells;

class zde
{
  private byte[] e = null;
  private byte[] f;
  int a;
  byte b;
  byte c;
  private zcf g;
  private int h;
  private short i;
  byte d = -1;
  
  byte[] a()
  {
    return this.e;
  }
  
  void a(byte[] paramArrayOfByte)
  {
    this.e = paramArrayOfByte;
  }
  
  zde(zcf paramzcf, byte[] paramArrayOfByte, int paramInt)
  {
    this.g = paramzcf;
    this.f = paramArrayOfByte;
    this.b = 0;
    this.c = -2;
    this.a = paramInt;
    switch (this.g.n())
    {
    case 2: 
      this.h = 61466;
      this.i = 980;
      break;
    case 3: 
      this.h = 61467;
      this.i = 534;
      break;
    case 4: 
      this.h = 61468;
      this.i = 1346;
      break;
    case 5: 
      this.h = 61469;
      this.i = 1130;
      break;
    case 6: 
      this.h = 61470;
      this.i = 1760;
      break;
    case 7: 
      this.h = 61471;
      this.i = 1960;
      break;
    default: 
      throw new IllegalArgumentException("Unsupported image format.");
    }
  }
  
  zde(zcf paramzcf)
  {
    this.g = paramzcf;
  }
  
  void a(zde paramzde)
  {
    if (paramzde.f == null)
    {
      this.f = null;
    }
    else
    {
      this.f = new byte[paramzde.f.length];
      System.arraycopy(paramzde.f, 0, this.f, 0, this.f.length);
    }
    this.b = paramzde.b;
    this.c = paramzde.c;
    this.a = paramzde.a;
    this.h = paramzde.h;
    this.i = paramzde.i;
    if (paramzde.e != null)
    {
      this.e = new byte[paramzde.e.length];
      System.arraycopy(paramzde.e, 0, this.e, 0, paramzde.e.length);
    }
    else
    {
      this.e = null;
    }
  }
  
  long b()
  {
    if (e() == null) {
      return 0L;
    }
    long l = f() + e().length;
    return l;
  }
  
  int c()
  {
    return this.h;
  }
  
  void a(int paramInt)
  {
    this.h = paramInt;
  }
  
  short d()
  {
    return this.i;
  }
  
  void a(short paramShort)
  {
    this.i = paramShort;
  }
  
  byte[] e()
  {
    return this.f;
  }
  
  void b(byte[] paramArrayOfByte)
  {
    this.f = paramArrayOfByte;
  }
  
  int f()
  {
    if (e() == null) {
      return 0;
    }
    int j = 0;
    if (this.e != null) {
      j += 16;
    }
    if (g()) {
      j += 50;
    } else {
      j += 17;
    }
    return j;
  }
  
  boolean g()
  {
    switch (this.g.n())
    {
    case 2: 
    case 3: 
    case 4: 
      return true;
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zde.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */