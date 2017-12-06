package com.aspose.cells;

import java.util.Iterator;

class zwk
  implements Iterator
{
  private zwn a;
  private short b;
  private short c;
  private int d;
  private int e;
  private zgs f = new zgs();
  private int g;
  
  zwk(zwn paramzwn, int paramInt1, int paramInt2)
  {
    this.a = paramzwn;
    this.e = paramzwn.c();
    if (paramInt1 < 0)
    {
      this.f.a = -1;
      this.g = 10;
      this.d = this.g;
      this.b = this.f.a;
      this.c = ((short)paramInt2);
    }
    else
    {
      this.f.a = ((short)paramInt1);
      this.g = paramzwn.a(this.f, -1, (short)-1, false, false);
      if (this.g < 0)
      {
        this.g = this.e;
        this.d = this.g;
        this.b = -1;
        this.c = -1;
      }
      else
      {
        this.d = this.g;
        zgs tmp147_144 = this.f;
        tmp147_144.a = ((short)(tmp147_144.a - 1));
        this.b = this.f.a;
        this.c = ((short)paramInt2);
      }
    }
  }
  
  public boolean hasNext()
  {
    if (this.g < this.e)
    {
      this.g = this.a.a(this.g, this.f);
      return this.f.a <= this.c;
    }
    this.f.a = -1;
    return false;
  }
  
  public zgs a()
  {
    return this.f;
  }
  
  public Object next()
  {
    return this.f;
  }
  
  public void b()
  {
    this.g = this.d;
    this.f.a = this.b;
  }
  
  public boolean a(int paramInt)
  {
    if (this.f.a == paramInt) {
      return true;
    }
    if (paramInt < this.b)
    {
      b();
      return hasNext();
    }
    if (paramInt > this.c) {
      return false;
    }
    if (this.f.a > paramInt) {
      b();
    } else if (this.g == this.e) {
      return false;
    }
    this.g = this.a.a(this.g, this.f);
    if (this.f.a >= paramInt) {
      return this.f.a <= this.c;
    }
    while (this.g < this.e)
    {
      this.g = this.a.a(this.g, this.f);
      if (this.f.a >= paramInt) {
        return this.f.a <= this.c;
      }
    }
    return false;
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zwk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */