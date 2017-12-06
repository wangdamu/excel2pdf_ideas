package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

class zpz
{
  ArrayList a;
  byte[] b;
  private Area f;
  private Line g;
  private Marker h;
  private zkd i;
  private boolean j = false;
  private boolean k = false;
  boolean c = false;
  private Object l;
  private boolean m = true;
  boolean d;
  private int n;
  int e = 0;
  private boolean o = false;
  
  zpz(Object paramObject)
  {
    this.l = paramObject;
  }
  
  void a(Object paramObject)
  {
    this.m = false;
  }
  
  boolean a()
  {
    return this.m;
  }
  
  void a(boolean paramBoolean)
  {
    this.m = paramBoolean;
  }
  
  int b()
  {
    if ((this.l instanceof Series)) {
      return ((Series)this.l).getType();
    }
    if ((this.l instanceof ChartPoint)) {
      return ((ChartPoint)this.l).b();
    }
    if ((this.l instanceof zka)) {
      return ((zka)this.l).j();
    }
    return 14;
  }
  
  public int c()
  {
    if (!this.d)
    {
      switch (b())
      {
      case 9: 
      case 10: 
      case 11: 
      case 17: 
      case 18: 
      case 19: 
      case 20: 
        return 0;
      case 21: 
      case 22: 
      case 23: 
      case 24: 
      case 25: 
      case 26: 
      case 27: 
        return 4;
      case 28: 
      case 29: 
      case 30: 
      case 31: 
      case 32: 
      case 33: 
      case 34: 
        return 3;
      case 50: 
      case 51: 
      case 52: 
      case 53: 
      case 54: 
      case 55: 
      case 56: 
        return 1;
      }
      return this.n;
    }
    return this.n;
  }
  
  public void a(int paramInt)
  {
    if (ChartCollection.j(b()))
    {
      this.d = true;
      this.n = paramInt;
    }
  }
  
  void b(int paramInt)
  {
    this.d = true;
    this.n = paramInt;
  }
  
  int d()
  {
    return this.n;
  }
  
  void a(zpz paramzpz, CopyOptions paramCopyOptions)
  {
    this.e = paramzpz.e;
    this.k = paramzpz.k;
    this.j = paramzpz.j;
    this.o = paramzpz.o;
    this.n = paramzpz.n;
    this.d = paramzpz.d;
    this.m = paramzpz.m;
    this.c = paramzpz.c;
    if (paramzpz.f != null)
    {
      u();
      this.f.a(paramzpz.f, paramCopyOptions);
    }
    if (paramzpz.g != null)
    {
      v();
      this.g.a(paramzpz.g);
    }
    if (paramzpz.h != null)
    {
      w();
      this.h.a(paramzpz.h, paramCopyOptions);
    }
    if (paramzpz.i != null)
    {
      this.i = new zkd(this);
      this.i.a(paramzpz.i);
    }
    this.b = paramzpz.b;
    if ((paramzpz.a != null) && (paramzpz.a.size() > 0))
    {
      this.a = new ArrayList();
      for (int i1 = 0; i1 < paramzpz.a.size(); i1++) {
        zf.a(this.a, paramzpz.a.get(i1));
      }
    }
  }
  
  Area e()
  {
    u();
    return this.f;
  }
  
  Line f()
  {
    v();
    return this.g;
  }
  
  Line g()
  {
    return this.g;
  }
  
  Area h()
  {
    return this.f;
  }
  
  zkd i()
  {
    return this.i;
  }
  
  Marker j()
  {
    w();
    return this.h;
  }
  
  Marker k()
  {
    return this.h;
  }
  
  zkd l()
  {
    if (this.i == null) {
      this.i = new zkd(this);
    }
    return this.i;
  }
  
  boolean m()
  {
    return this.j;
  }
  
  void b(boolean paramBoolean)
  {
    this.j = paramBoolean;
    this.e |= 0x2;
    a(false);
  }
  
  boolean n()
  {
    return (this.e & 0xFFFF & 0x2) != 0;
  }
  
  void c(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.e |= 0x2;
    } else {
      this.e |= 0xFFFD;
    }
  }
  
  boolean o()
  {
    return this.k;
  }
  
  void d(boolean paramBoolean)
  {
    this.k = paramBoolean;
    this.e |= 0x1;
    a(false);
  }
  
  boolean p()
  {
    return (this.e & 0xFFFF & 0x1) != 0;
  }
  
  void e(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.e |= 0x1;
    } else {
      this.e |= 0xFFFE;
    }
  }
  
  boolean q()
  {
    return this.o;
  }
  
  void f(boolean paramBoolean)
  {
    this.o = paramBoolean;
    a(false);
  }
  
  Chart r()
  {
    if (this.l == null) {
      return null;
    }
    if ((this.l instanceof ChartPoint)) {
      return ((ChartPoint)this.l).a().i().e();
    }
    if ((this.l instanceof Series)) {
      return ((Series)this.l).i().e();
    }
    if ((this.l instanceof zka)) {
      return ((zka)this.l).a().a();
    }
    return null;
  }
  
  private void u()
  {
    if (this.f == null)
    {
      this.f = new Area(r(), this);
      if ((this.l != null) && ((this.l instanceof Series)))
      {
        Series localSeries = (Series)this.l;
        zka localzka = localSeries.u();
        if ((localzka != null) && (localzka.d() != null))
        {
          Area localArea = localzka.d().h();
          if (localArea != null) {
            this.f.a(localArea, null);
          }
        }
      }
    }
  }
  
  private void v()
  {
    if (this.g == null)
    {
      this.g = new Line(r(), this);
      if ((this.l != null) && ((this.l instanceof Series)))
      {
        Series localSeries = (Series)this.l;
        zka localzka = localSeries.u();
        if ((localzka != null) && (localzka.d() != null))
        {
          Line localLine = localzka.d().g();
          if (localLine != null) {
            this.g.a(localLine);
          }
        }
      }
    }
  }
  
  private void w()
  {
    if (this.h == null)
    {
      this.h = new Marker(this.l, this);
      if ((this.l != null) && ((this.l instanceof Series)))
      {
        Series localSeries = (Series)this.l;
        zka localzka = localSeries.u();
        if ((localzka != null) && (localzka.d() != null))
        {
          Marker localMarker = localzka.d().k();
          if (localMarker != null) {
            this.h.a(localMarker, null);
          }
        }
      }
    }
  }
  
  void s()
  {
    switch (b())
    {
    case 37: 
    case 38: 
    case 39: 
    case 57: 
      j().b(b());
      break;
    case 60: 
      f().setVisible(false);
      j().b(b());
      break;
    case 64: 
      v();
      j().b(b());
      break;
    case 61: 
    case 62: 
      this.j = true;
      c(true);
      v();
      j().b(b());
      break;
    case 13: 
      this.k = true;
      e(true);
      v();
      u();
      j().b(b());
      break;
    case 12: 
      v();
      j().b(b());
      break;
    case 35: 
    case 36: 
    case 47: 
    case 48: 
      this.i = new zkd(this);
      break;
    case 44: 
      this.i = new zkd(this);
      this.i.a(0);
      break;
    }
  }
  
  Object t()
  {
    return this.l;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zpz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */