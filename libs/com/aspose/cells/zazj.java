package com.aspose.cells;

class zazj
  extends zayp
{
  private zaie a;
  private int b;
  private int c;
  private int d;
  
  public zazj(zaie paramzaie, int paramInt1, int paramInt2)
  {
    this(paramzaie, paramzaie == null ? 16 : paramzaie.b(), paramInt1, paramInt2);
  }
  
  public zazj(zaie paramzaie, int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramzaie;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
  }
  
  public zaiw b(zaca paramzaca)
  {
    return new zazj(this.a, this.b, this.c, this.d);
  }
  
  public int c()
  {
    return this.c;
  }
  
  public int d()
  {
    return this.d;
  }
  
  public int e()
  {
    return this.c * this.d;
  }
  
  public boolean l()
  {
    return false;
  }
  
  public boolean m()
  {
    return this.c == 1;
  }
  
  public boolean n()
  {
    return this.d == 1;
  }
  
  public int b()
  {
    return this.b;
  }
  
  public zaie a(int paramInt1, int paramInt2)
  {
    return this.a;
  }
  
  public void f() {}
  
  public boolean b(int paramInt1, int paramInt2)
  {
    return false;
  }
  
  public boolean a(int paramInt)
  {
    return false;
  }
  
  public boolean g()
  {
    return false;
  }
  
  public zaie h()
  {
    return this.a;
  }
  
  public int i()
  {
    return 0;
  }
  
  public int j()
  {
    return 0;
  }
  
  public int k()
  {
    return 0;
  }
  
  public zaiw b(int paramInt)
  {
    if (this.c == 1) {
      return this;
    }
    return new zazj(this.a, this.b, 1, this.d);
  }
  
  public zaiw c(int paramInt)
  {
    if (this.d == 1) {
      return this;
    }
    return new zazj(this.a, this.b, this.c, 1);
  }
  
  public boolean a()
  {
    return true;
  }
  
  public void a(boolean paramBoolean) {}
  
  public boolean q()
  {
    return true;
  }
  
  public int s()
  {
    return -1;
  }
  
  public int u()
  {
    return -1;
  }
  
  public int r()
  {
    return -1;
  }
  
  public int t()
  {
    return -1;
  }
  
  public zaie o()
  {
    return this.a;
  }
  
  public zaie p()
  {
    return this.a;
  }
  
  public boolean a(zaie paramzaie)
  {
    return a(paramzaie, this.a);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zazj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */