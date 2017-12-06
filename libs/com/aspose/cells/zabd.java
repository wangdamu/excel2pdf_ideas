package com.aspose.cells;

import com.aspose.cells.a.c.zi;

class zabd
  extends zaau
{
  private zaai a;
  private int b;
  
  public zabd(int paramInt, zaai paramzaai)
  {
    this.a = paramzaai;
    this.b = paramInt;
  }
  
  public int b()
  {
    return 13;
  }
  
  public Object c()
  {
    return this.a;
  }
  
  public zaai o()
  {
    return this.a;
  }
  
  public Object b(zaca paramzaca)
  {
    return e(paramzaca).b(paramzaca);
  }
  
  public int g()
  {
    return 32;
  }
  
  public byte a()
  {
    return -1;
  }
  
  public zabb a(zaca paramzaca, int paramInt)
  {
    return e(paramzaca).a(paramzaca, paramInt);
  }
  
  public zabp i(zaca paramzaca)
  {
    return e(paramzaca).i(paramzaca);
  }
  
  public zaba j(zaca paramzaca)
  {
    return e(paramzaca).j(paramzaca);
  }
  
  public zaie e(zaca paramzaca)
  {
    if ((paramzaca.p.L.m) && (this.a.b(paramzaca, this.b)))
    {
      zaca localzaca = new zaca(paramzaca);
      if (localzaca.n != this.b) {
        localzaca.a(paramzaca.p.e.get(this.b));
      }
      this.a.b(localzaca);
    }
    return this.a.m();
  }
  
  public zaie d(zaca paramzaca)
  {
    return e(paramzaca);
  }
  
  public boolean i()
  {
    return false;
  }
  
  public boolean j()
  {
    return true;
  }
  
  public zaie a(int[] paramArrayOfInt, zaca paramzaca, boolean paramBoolean)
  {
    paramArrayOfInt[0] = 1;
    paramArrayOfInt[1] = 1;
    return e(paramzaca);
  }
  
  public zaiw a(zaca paramzaca, boolean paramBoolean)
  {
    return new zbak(e(paramzaca));
  }
  
  public boolean c(zaca paramzaca, boolean paramBoolean)
  {
    return this.a.c() == 0;
  }
  
  public void a(zahh paramzahh, zaah paramzaah)
  {
    if (paramzaah != null)
    {
      paramzahh.a(paramzaah.u.get(this.b).getName());
      paramzahh.a("!");
      CellsHelper.a(paramzahh, this.a.e, this.a.f);
    }
    else
    {
      paramzahh.a("Sheet[");
      paramzahh.a(zi.a(this.b));
      paramzahh.a("]!");
      CellsHelper.a(paramzahh, this.a.e, this.a.f);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zabd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */