package com.aspose.cells;

import com.aspose.cells.b.a.zw;

class zot
{
  int a;
  String b = null;
  boolean c;
  String d = null;
  private int g = 0;
  private boolean h = false;
  private int i = 0;
  private boolean j = false;
  private int k;
  int e;
  int f;
  private byte l;
  
  public int a()
  {
    return this.g;
  }
  
  public void a(int paramInt)
  {
    this.g = paramInt;
    e(28);
  }
  
  public boolean b()
  {
    return this.h;
  }
  
  public void a(boolean paramBoolean)
  {
    this.h = paramBoolean;
    e(29);
  }
  
  public int c()
  {
    return this.i;
  }
  
  public void b(int paramInt)
  {
    this.i = paramInt;
    e(27);
  }
  
  public boolean d()
  {
    return this.j;
  }
  
  public void b(boolean paramBoolean)
  {
    this.j = paramBoolean;
    e(30);
  }
  
  public int e()
  {
    return this.k;
  }
  
  public void c(int paramInt)
  {
    this.k = paramInt;
    e(31);
  }
  
  private boolean d(int paramInt)
  {
    switch (paramInt)
    {
    case 29: 
      return (this.l & 0xFF & 0x1) != 0;
    case 27: 
      return (this.l & 0xFF & 0x2) != 0;
    case 28: 
      return (this.l & 0xFF & 0x4) != 0;
    case 30: 
      return (this.l & 0xFF & 0x8) != 0;
    case 31: 
      return (this.l & 0xFF & 0x10) != 0;
    }
    return false;
  }
  
  private void e(int paramInt)
  {
    switch (paramInt)
    {
    case 29: 
      this.l = ((byte)(this.l | 0x1));
      break;
    case 27: 
      this.l = ((byte)(this.l | 0x2));
      break;
    case 28: 
      this.l = ((byte)(this.l | 0x4));
      break;
    case 30: 
      this.l = ((byte)(this.l | 0x8));
      break;
    case 31: 
      this.l = ((byte)(this.l | 0x10));
      break;
    }
  }
  
  boolean a(zot paramzot)
  {
    return (zw.b(this.b, paramzot.b)) && (zw.b(this.d, paramzot.d)) && (b() == paramzot.b()) && (d() == paramzot.d()) && (a() == paramzot.a()) && (e() == paramzot.e());
  }
  
  void a(Style paramStyle, boolean paramBoolean)
  {
    if (this.b != null) {
      paramStyle.setHorizontalAlignment(zauj.k(this.b));
    }
    if (this.c) {
      paramStyle.setJustifyDistributed(true);
    }
    if (this.d != null) {
      paramStyle.setVerticalAlignment(zauj.l(this.d));
    }
    if ((d(27)) && (c() != 0)) {
      if (paramBoolean) {
        paramStyle.d(c());
      } else {
        paramStyle.setIndentLevel(c());
      }
    }
    if ((this.a != 0) && (paramBoolean)) {
      paramStyle.e(this.a);
    }
    if (d(29)) {
      paramStyle.setTextWrapped(b());
    }
    if (d(30)) {
      paramStyle.setShrinkToFit(d());
    }
    if (d(28)) {
      if ((a() == 255) || (a() <= 90)) {
        paramStyle.setRotationAngle(a());
      } else {
        paramStyle.setRotationAngle(90 - a());
      }
    }
    if (d(31)) {
      paramStyle.setTextDirection(e());
    }
  }
  
  static zot a(Style paramStyle)
  {
    boolean bool = paramStyle.l();
    Object localObject;
    if ((!bool) && (paramStyle.h() > 0) && (paramStyle.h() < paramStyle.e().C().b()))
    {
      localObject = paramStyle.e().C().a(paramStyle.h());
      bool = ((Style)localObject).l();
    }
    if (bool)
    {
      localObject = new zot();
      if (paramStyle.isModified(25)) {
        ((zot)localObject).b = zauj.i(paramStyle.getHorizontalAlignment());
      }
      if (paramStyle.isJustifyDistributed()) {
        ((zot)localObject).c = true;
      }
      if (paramStyle.isModified(26)) {
        ((zot)localObject).d = zauj.j(paramStyle.getVerticalAlignment());
      }
      int m = paramStyle.getRotationAngle();
      if (m >= 0) {
        ((zot)localObject).a(m);
      } else {
        ((zot)localObject).a(90 - m);
      }
      ((zot)localObject).a(paramStyle.isTextWrapped());
      ((zot)localObject).b(paramStyle.getIndentLevel());
      ((zot)localObject).a = paramStyle.p();
      ((zot)localObject).b(paramStyle.getShrinkToFit());
      ((zot)localObject).c(paramStyle.getTextDirection());
      ((zot)localObject).e = paramStyle.getHorizontalAlignment();
      ((zot)localObject).f = paramStyle.getVerticalAlignment();
      return (zot)localObject;
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zot.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */