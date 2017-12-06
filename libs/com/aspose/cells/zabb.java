package com.aspose.cells;

import com.aspose.cells.a.c.zi;
import com.aspose.cells.b.a.zo;

class zabb
  extends zaau
{
  static zabb a = new zabb(0.0D);
  static zabb b = new zabb(1.0D);
  private double c;
  
  public zabb(double paramDouble)
  {
    this.c = paramDouble;
  }
  
  public double o()
  {
    return this.c;
  }
  
  public boolean p()
  {
    return (!Double.isInfinite(this.c)) && (!Double.isNaN(this.c));
  }
  
  public boolean q()
  {
    return this.c == 0.0D;
  }
  
  public boolean r()
  {
    return zga.a(this.c);
  }
  
  public int s()
  {
    if (zga.a(this.c)) {
      return 0;
    }
    if (this.c > 0.0D) {
      return 1;
    }
    return -1;
  }
  
  public int t()
  {
    if (zga.a(this.c, 1.0D)) {
      return 0;
    }
    if (this.c > 1.0D) {
      return 1;
    }
    return -1;
  }
  
  public int b()
  {
    return 3;
  }
  
  public Object c()
  {
    return Double.valueOf(this.c);
  }
  
  public boolean d()
  {
    return true;
  }
  
  public byte a()
  {
    int i = (int)this.c;
    if ((this.c == i) && (i >= 0) && (i <= 65535)) {
      return 30;
    }
    return 31;
  }
  
  public zabb a(zaca paramzaca, int paramInt)
  {
    return this;
  }
  
  public zabp i(zaca paramzaca)
  {
    return new zabp(zo.b(this.c));
  }
  
  public zaba j(zaca paramzaca)
  {
    return this.c != 0.0D ? zaba.a : zaba.b;
  }
  
  public void a(zahh paramzahh, zaah paramzaah)
  {
    if (paramzaah != null)
    {
      paramzahh.a(paramzaah.a(this.c));
      return;
    }
    if ((this.c >= 1.0E21D) || (Math.abs(this.c) <= 1.0E-21D)) {
      paramzahh.a(zi.a(this.c));
    } else {
      paramzahh.a(zarb.a(this.c));
    }
  }
  
  public String a(zaah paramzaah)
  {
    if (paramzaah != null) {
      return paramzaah.a(this.c);
    }
    if ((this.c >= 1.0E21D) || (Math.abs(this.c) <= 1.0E-21D)) {
      return zi.a(this.c);
    }
    return zarb.a(this.c);
  }
  
  public String toString()
  {
    return zi.a(this.c);
  }
  
  public boolean a(zaie paramzaie)
  {
    return (paramzaie == this) || ((paramzaie.b() == 3) && (((zabb)paramzaie).c == this.c));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zabb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */