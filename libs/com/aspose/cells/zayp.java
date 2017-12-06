package com.aspose.cells;

abstract class zayp
  implements zaiw
{
  private boolean a = false;
  
  public abstract int c();
  
  public abstract int d();
  
  public abstract boolean b(int paramInt1, int paramInt2);
  
  public abstract boolean a(int paramInt);
  
  public abstract int i();
  
  public abstract int j();
  
  public abstract zaiw b(zaca paramzaca);
  
  public abstract int r();
  
  public abstract int s();
  
  public abstract int t();
  
  public abstract int u();
  
  protected static boolean a(zaie paramzaie1, zaie paramzaie2)
  {
    if (paramzaie2 == paramzaie1) {
      return true;
    }
    return paramzaie2.a(paramzaie1);
  }
  
  public boolean a()
  {
    return this.a;
  }
  
  public void a(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  public boolean l()
  {
    return (c() == 1) && (d() == 1);
  }
  
  public boolean m()
  {
    return c() == 1;
  }
  
  public boolean n()
  {
    return d() == 1;
  }
  
  public int e()
  {
    return c() * d();
  }
  
  public int k()
  {
    return i() * d() + j();
  }
  
  public boolean a(zaie paramzaie)
  {
    return paramzaie == zabg.a;
  }
  
  public zaie o()
  {
    return zabg.a;
  }
  
  public zaie p()
  {
    return zabg.a;
  }
  
  public int v()
  {
    return r() * d() + t();
  }
  
  public int w()
  {
    return s() * d() + u();
  }
  
  public boolean a(zaca paramzaca, int[] paramArrayOfInt)
  {
    paramArrayOfInt[0] = r();
    if (paramArrayOfInt[0] < 0) {
      return false;
    }
    paramArrayOfInt[1] = t();
    paramArrayOfInt[2] = s();
    paramArrayOfInt[3] = u();
    return true;
  }
  
  public boolean b(zaca paramzaca, int[] paramArrayOfInt)
  {
    paramArrayOfInt[0] = v();
    if (paramArrayOfInt[0] < 0) {
      return false;
    }
    paramArrayOfInt[1] = w();
    return true;
  }
  
  public boolean x()
  {
    return false;
  }
  
  public boolean y()
  {
    return false;
  }
  
  public void a(zaca paramzaca) {}
  
  public boolean z()
  {
    return true;
  }
  
  public void b(boolean paramBoolean) {}
  
  public boolean A()
  {
    return false;
  }
  
  public zaiw c(zaca paramzaca)
  {
    return this;
  }
  
  public zajg d(zaca paramzaca)
  {
    return c(paramzaca);
  }
  
  public void a(zaca paramzaca, zaiw paramzaiw) {}
  
  public int B()
  {
    return 3;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zayp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */