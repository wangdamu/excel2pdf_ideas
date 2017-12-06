package com.aspose.cells;

abstract class zt
  extends zi
{
  public abstract boolean d();
  
  public abstract boolean e();
  
  public abstract boolean f();
  
  public abstract int g();
  
  public abstract void h();
  
  public abstract void f(int paramInt);
  
  public abstract int a(int paramInt, zgs paramzgs);
  
  public abstract int a(int paramInt1, zgs[] paramArrayOfzgs, int paramInt2, int paramInt3);
  
  public abstract zbdx a(zbdx paramzbdx, int paramInt);
  
  public abstract void b(zbdx paramzbdx, int paramInt);
  
  public abstract int g(int paramInt);
  
  public abstract void j(int paramInt1, int paramInt2);
  
  public abstract int h(int paramInt);
  
  public abstract Object i(int paramInt);
  
  public abstract void b(int paramInt, zgs paramzgs);
  
  public abstract int j(int paramInt);
  
  public abstract void k(int paramInt1, int paramInt2);
  
  public abstract zgs c(int paramInt, zgs paramzgs);
  
  public abstract zgs a(int paramInt1, zgs paramzgs, int paramInt2);
  
  public abstract void b(int paramInt1, zgs paramzgs, int paramInt2);
  
  public abstract int i();
  
  public abstract int j();
  
  public abstract void k(int paramInt);
  
  public abstract byte l(int paramInt);
  
  public abstract void a(int paramInt, byte paramByte);
  
  public abstract int k();
  
  public abstract void m(int paramInt);
  
  public abstract boolean l(int paramInt1, int paramInt2);
  
  public abstract Object l();
  
  public int a(int paramInt1, zt paramzt, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    zgs[] arrayOfzgs = new zgs[paramInt3];
    zaiv localzaiv = paramzt.a(paramInt2, -1, false);
    zgs localzgs1 = new zgs();
    for (int i = 0; i < arrayOfzgs.length; i++)
    {
      zgs localzgs2 = paramzt.a(localzaiv.a(), localzgs1, 7);
      if (localzgs2 == localzgs1)
      {
        arrayOfzgs[i] = localzgs2;
        localzgs1 = new zgs();
      }
      else if (paramBoolean)
      {
        localzgs1.a(localzgs2);
        arrayOfzgs[i] = localzgs1;
        localzgs1 = new zgs();
      }
      else
      {
        arrayOfzgs[i] = localzgs2;
      }
    }
    return a(paramInt1, arrayOfzgs, 0, arrayOfzgs.length);
  }
  
  public int a(zt paramzt, boolean paramBoolean)
  {
    e(-1);
    return a(-1, paramzt, -1, paramzt.a(), paramBoolean);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */