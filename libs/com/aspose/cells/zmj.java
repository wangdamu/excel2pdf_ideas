package com.aspose.cells;

class zmj
  implements zaht, zahv
{
  private zaca a;
  private boolean b;
  private boolean c;
  
  zmj(zaca paramzaca, boolean paramBoolean)
  {
    this.a = paramzaca;
    this.b = paramBoolean;
  }
  
  public zahs a(zaca paramzaca)
  {
    if (paramzaca == null) {
      return this;
    }
    return new zmj(paramzaca == null ? this.a : paramzaca, this.b);
  }
  
  public boolean a()
  {
    return false;
  }
  
  public void a(boolean paramBoolean) {}
  
  public void b(zaca paramzaca)
  {
    if (paramzaca != this.a)
    {
      this.a.d = paramzaca.d;
      this.a.e = paramzaca.e;
    }
  }
  
  public int b()
  {
    return 5;
  }
  
  public boolean a(zaie paramzaie)
  {
    zaba localzaba = paramzaie.j(this.a);
    if ((localzaba != null) && (localzaba.o()))
    {
      if (!this.b)
      {
        this.c = true;
        return true;
      }
    }
    else if (this.b)
    {
      this.c = false;
      return true;
    }
    return false;
  }
  
  public boolean b(zaie paramzaie)
  {
    return a(paramzaie);
  }
  
  public void c() {}
  
  public boolean a(int paramInt, zaie paramzaie)
  {
    return a(paramzaie);
  }
  
  public zaie d()
  {
    return this.b ? zaba.a : zaba.b;
  }
  
  public zaie b(boolean paramBoolean)
  {
    return this.b ? zaba.a : zaba.b;
  }
  
  public zaie e()
  {
    return this.c ? zaba.a : zaba.b;
  }
  
  public boolean f()
  {
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zmj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */