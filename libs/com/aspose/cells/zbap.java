package com.aspose.cells;

import com.aspose.cells.a.c.zi;
import com.aspose.cells.b.a.zs;

class zbap
{
  private zwp a;
  private int b;
  private int c;
  private short d;
  private short e;
  private byte f;
  
  public zbap() {}
  
  public zbap(zwp paramzwp, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a = paramzwp;
    this.b = paramInt1;
    this.d = ((short)paramInt2);
    this.c = paramInt3;
    this.e = ((short)paramInt4);
  }
  
  public zbap(zwp paramzwp, int paramInt1, int paramInt2)
  {
    this.a = paramzwp;
    this.b = paramInt1;
    this.d = ((short)paramInt2);
    this.c = paramInt1;
    this.e = this.d;
  }
  
  public zbap(zwp paramzwp, CellArea paramCellArea)
  {
    this.a = paramzwp;
    this.b = paramCellArea.StartRow;
    this.d = ((short)paramCellArea.StartColumn);
    this.c = paramCellArea.EndRow;
    this.e = ((short)paramCellArea.EndColumn);
  }
  
  public zbap(zbap paramzbap)
  {
    a(paramzbap);
  }
  
  void a(zbap paramzbap)
  {
    this.a = paramzbap.a;
    this.b = paramzbap.b;
    this.d = paramzbap.d;
    this.c = paramzbap.c;
    this.e = paramzbap.e;
    this.f = paramzbap.f;
  }
  
  public zwp a()
  {
    return this.a;
  }
  
  public void a(zwp paramzwp)
  {
    this.a = paramzwp;
  }
  
  zwp a(zaca paramzaca)
  {
    if (this.a == null) {
      return null;
    }
    if (((this.a.b & 0xFFFF) == 65534) && ((this.a.c & 0xFFFF) == 65534) && (paramzaca.p.e.w().a(this.a.a & 0xFFFF).a() == 5)) {
      return null;
    }
    return this.a;
  }
  
  public int b()
  {
    return this.b;
  }
  
  public void a(int paramInt)
  {
    this.b = paramInt;
  }
  
  public boolean c()
  {
    return (this.f & 0xFF & 0x80) == 0;
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.f = ((byte)(this.f & 0x7F));
    } else {
      this.f = ((byte)(this.f | 0x80));
    }
  }
  
  public int d()
  {
    return this.d;
  }
  
  public void b(int paramInt)
  {
    this.d = ((short)paramInt);
  }
  
  public boolean e()
  {
    return (this.f & 0xFF & 0x40) == 0;
  }
  
  public void b(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.f = ((byte)(this.f & 0xBF));
    } else {
      this.f = ((byte)(this.f | 0x40));
    }
  }
  
  public int f()
  {
    return this.c;
  }
  
  public void c(int paramInt)
  {
    this.c = paramInt;
  }
  
  public boolean g()
  {
    return (this.f & 0xFF & 0x20) == 0;
  }
  
  public void c(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.f = ((byte)(this.f & 0xDF));
    } else {
      this.f = ((byte)(this.f | 0x20));
    }
  }
  
  public int h()
  {
    return this.e;
  }
  
  public void d(int paramInt)
  {
    this.e = ((short)paramInt);
  }
  
  public boolean i()
  {
    return (this.f & 0xFF & 0x10) == 0;
  }
  
  public void d(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.f = ((byte)(this.f & 0xEF));
    } else {
      this.f = ((byte)(this.f | 0x10));
    }
  }
  
  public boolean j()
  {
    return (this.f & 0xFF & 0xA0) != 0;
  }
  
  public boolean k()
  {
    return (this.f & 0xFF & 0x50) != 0;
  }
  
  public boolean l()
  {
    return (this.f & 0xFF & 0xF0) != 0;
  }
  
  public boolean m()
  {
    return (this.b == this.c) && (this.d == this.e) && ((this.a == null) || (this.a.b == this.a.c));
  }
  
  public boolean n()
  {
    return this.b == this.c;
  }
  
  public boolean o()
  {
    return this.d == this.e;
  }
  
  public int p()
  {
    return this.e - this.d + 1;
  }
  
  public int q()
  {
    return this.c - this.b + 1;
  }
  
  boolean r()
  {
    return (this.f & 0xFF & 0x8) != 0;
  }
  
  void e(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.f = ((byte)(this.f | 0x8));
    } else {
      this.f = ((byte)(this.f & 0xF7));
    }
  }
  
  void s()
  {
    int i;
    boolean bool;
    if (this.b > this.c)
    {
      i = this.b;
      this.b = this.c;
      this.c = i;
      bool = c();
      if (bool != g())
      {
        a(!bool);
        c(bool);
      }
    }
    if (this.d > this.e)
    {
      i = this.d;
      this.d = this.e;
      this.e = i;
      bool = e();
      if (bool != i())
      {
        b(!bool);
        d(bool);
      }
    }
  }
  
  void t()
  {
    this.c = this.b;
    this.e = this.d;
    c(c());
    d(e());
  }
  
  public int hashCode()
  {
    return super.hashCode();
  }
  
  public boolean equals(Object obj)
  {
    if (!(obj instanceof zbap)) {
      return false;
    }
    zbap localzbap = (zbap)obj;
    return (this.b == localzbap.b) && (this.d == localzbap.d) && (this.c == localzbap.c) && (this.e == localzbap.e) && (b(localzbap.a));
  }
  
  boolean e(int paramInt)
  {
    return (this.b <= paramInt) && (this.c >= paramInt);
  }
  
  boolean f(int paramInt)
  {
    return (this.d <= paramInt) && (this.e >= paramInt);
  }
  
  CellArea u()
  {
    return CellArea.createCellArea(this.b, this.d, this.c, this.e);
  }
  
  Range b(zaca paramzaca)
  {
    Cells localCells = null;
    if (this.a == null)
    {
      if (paramzaca.g == null) {
        return null;
      }
      localCells = paramzaca.g;
    }
    else
    {
      if ((this.a.a & 0xFFFF) != paramzaca.p.f) {
        return null;
      }
      int i = this.a.b & 0xFFFF;
      if ((i != (this.a.c & 0xFFFF)) || (i < 0) || (i >= paramzaca.p.e.getCount())) {
        return null;
      }
      localCells = paramzaca.p.e.get(this.a.b & 0xFFFF).getCells();
    }
    return localCells.createRange(this.b, this.d, this.c - this.b + 1, this.e - this.d + 1);
  }
  
  boolean b(zwp paramzwp)
  {
    if (this.a == paramzwp) {
      return true;
    }
    if ((this.a == null) || (paramzwp == null)) {
      return false;
    }
    return (this.a.a == paramzwp.a) && (this.a.b == paramzwp.b) && (this.a.c == paramzwp.c);
  }
  
  public void a(StringBuilder paramStringBuilder)
  {
    CellsHelper.a(paramStringBuilder, this.b, this.d, this.c, this.e);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (this.a != null)
    {
      localStringBuilder.append('[');
      localStringBuilder.append(this.a.a);
      localStringBuilder.append('-');
      localStringBuilder.append(this.a.b);
      localStringBuilder.append('-');
      localStringBuilder.append(this.a.c);
      localStringBuilder.append(']');
    }
    CellsHelper.a(localStringBuilder, this.b, this.d, this.c, this.e);
    return zs.a(localStringBuilder);
  }
  
  public void a(zahh paramzahh)
  {
    if (this.a != null)
    {
      zabq.a(this.a, paramzahh);
      paramzahh.a('!');
    }
    if (e()) {
      paramzahh.a('$');
    }
    CellsHelper.a(paramzahh, this.d);
    if (c()) {
      paramzahh.a('$');
    }
    paramzahh.a(zi.a(this.b + 1));
    if ((r()) || (this.b != this.c) || (this.d != this.e))
    {
      paramzahh.a(':');
      if (i()) {
        paramzahh.a('$');
      }
      CellsHelper.a(paramzahh, this.e);
      if (g()) {
        paramzahh.a('$');
      }
      paramzahh.a(zi.a(this.c + 1));
    }
  }
  
  public void a(zahh paramzahh, zaah paramzaah)
  {
    if (this.a != null)
    {
      zabq.a(paramzaah, this.a, paramzahh);
      paramzahh.a('!');
    }
    if ((this.d == 0) && (e() == i()) && (this.e == paramzaah.x))
    {
      if (paramzaah.r)
      {
        if (c()) {
          paramzahh.a('$');
        }
        paramzahh.a(zi.a(this.b + 1));
        paramzahh.a(':');
        if (g()) {
          paramzahh.a('$');
        }
        paramzahh.a(zi.a(this.c + 1));
      }
      else
      {
        paramzahh.a('R');
        if (c())
        {
          paramzahh.a(zi.a(this.b + 1));
        }
        else
        {
          paramzahh.a('[');
          paramzahh.a(zi.a(this.b - paramzaah.d));
          paramzahh.a(']');
        }
        paramzahh.a(":R");
        if (g())
        {
          paramzahh.a(zi.a(this.c + 1));
        }
        else
        {
          paramzahh.a('[');
          paramzahh.a(zi.a(this.c - paramzaah.d));
          paramzahh.a(']');
        }
      }
      return;
    }
    if ((this.b == 0) && (c() == g()) && (this.c == paramzaah.w))
    {
      if (paramzaah.r)
      {
        if (e()) {
          paramzahh.a('$');
        }
        CellsHelper.a(paramzahh, this.d);
        paramzahh.a(':');
        if (i()) {
          paramzahh.a('$');
        }
        CellsHelper.a(paramzahh, this.e);
      }
      else
      {
        paramzahh.a('C');
        if (e())
        {
          paramzahh.a(zi.a(this.d + 1));
        }
        else
        {
          paramzahh.a('[');
          paramzahh.a(zi.a(this.d - paramzaah.e));
          paramzahh.a(']');
        }
        paramzahh.a(":C");
        if (i())
        {
          paramzahh.a(zi.a(this.e + 1));
        }
        else
        {
          paramzahh.a('[');
          paramzahh.a(zi.a(this.e - paramzaah.e));
          paramzahh.a(']');
        }
      }
      return;
    }
    if (paramzaah.r)
    {
      if (e()) {
        paramzahh.a('$');
      }
      CellsHelper.a(paramzahh, this.d);
      if (c()) {
        paramzahh.a('$');
      }
      paramzahh.a(zi.a(this.b + 1));
      if ((r()) || (this.b != this.c) || (this.d != this.e))
      {
        paramzahh.a(':');
        if (i()) {
          paramzahh.a('$');
        }
        CellsHelper.a(paramzahh, this.e);
        if (g()) {
          paramzahh.a('$');
        }
        paramzahh.a(zi.a(this.c + 1));
      }
      return;
    }
    paramzahh.a('R');
    if (c())
    {
      paramzahh.a(zi.a(this.b + 1));
    }
    else
    {
      paramzahh.a('[');
      paramzahh.a(zi.a(this.b - paramzaah.d));
      paramzahh.a(']');
    }
    paramzahh.a('C');
    if (e())
    {
      paramzahh.a(zi.a(this.d + 1));
    }
    else
    {
      paramzahh.a('[');
      paramzahh.a(zi.a(d() - paramzaah.e));
      paramzahh.a(']');
    }
    if ((r()) || (this.b != this.c) || (this.d != this.e))
    {
      paramzahh.a(":R");
      if (g())
      {
        paramzahh.a(zi.a(this.c + 1));
      }
      else
      {
        paramzahh.a('[');
        paramzahh.a(zi.a(this.c - paramzaah.d));
        paramzahh.a(']');
      }
      paramzahh.a('C');
      if (i())
      {
        paramzahh.a(zi.a(this.e + 1));
      }
      else
      {
        paramzahh.a('[');
        paramzahh.a(zi.a(this.e - paramzaah.e));
        paramzahh.a(']');
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */