package com.aspose.cells;

import com.aspose.cells.b.a.zs;

abstract class zaau
  implements zaie
{
  public abstract void a(zahh paramzahh, zaah paramzaah);
  
  public abstract byte a();
  
  public abstract int b();
  
  public abstract Object c();
  
  public boolean d()
  {
    return false;
  }
  
  public boolean e()
  {
    return false;
  }
  
  public boolean f()
  {
    return false;
  }
  
  public int g()
  {
    return 64;
  }
  
  public int a(zaca paramzaca)
  {
    return g();
  }
  
  public void h() {}
  
  public Object b(zaca paramzaca)
  {
    return c();
  }
  
  public boolean c(zaca paramzaca)
  {
    return false;
  }
  
  public zaie d(zaca paramzaca)
  {
    return this;
  }
  
  public zaie e(zaca paramzaca)
  {
    return this;
  }
  
  public boolean i()
  {
    return true;
  }
  
  public boolean j()
  {
    return false;
  }
  
  public boolean f(zaca paramzaca)
  {
    return true;
  }
  
  public boolean g(zaca paramzaca)
  {
    return true;
  }
  
  public boolean h(zaca paramzaca)
  {
    return true;
  }
  
  public zaie a(int[] paramArrayOfInt, zaca paramzaca, boolean paramBoolean)
  {
    paramArrayOfInt[0] = 1;
    paramArrayOfInt[1] = 1;
    return this;
  }
  
  public zaie a(int[] paramArrayOfInt, zaca paramzaca)
  {
    paramArrayOfInt[0] = 1;
    return this;
  }
  
  public zaie b(int[] paramArrayOfInt, zaca paramzaca)
  {
    paramArrayOfInt[0] = 1;
    return this;
  }
  
  public zabb a(zaca paramzaca, int paramInt)
  {
    zaie localzaie = e(paramzaca);
    if (localzaie == null)
    {
      if (zabt.d(paramInt)) {
        return zabb.a;
      }
      return null;
    }
    if (localzaie != this) {
      return localzaie.a(paramzaca, paramInt);
    }
    return null;
  }
  
  public zabp i(zaca paramzaca)
  {
    zaie localzaie = e(paramzaca);
    if ((localzaie != null) && (localzaie != this)) {
      return localzaie.i(paramzaca);
    }
    return null;
  }
  
  public zaba j(zaca paramzaca)
  {
    zaie localzaie = e(paramzaca);
    if (localzaie == null) {
      return zaba.b;
    }
    if (localzaie != this) {
      return localzaie.j(paramzaca);
    }
    return null;
  }
  
  public zaiw a(zaca paramzaca, boolean paramBoolean)
  {
    return new zbak(this);
  }
  
  public String a(zaah paramzaah)
  {
    zbpe localzbpe = new zbpe();
    a(localzbpe, paramzaah);
    return zs.a(localzbpe);
  }
  
  public String toString()
  {
    return a(null);
  }
  
  public boolean k()
  {
    return false;
  }
  
  public void a(boolean paramBoolean) {}
  
  public zabu l()
  {
    return null;
  }
  
  public void a(zabu paramzabu) {}
  
  public void b(boolean paramBoolean) {}
  
  public int b(zaca paramzaca, boolean paramBoolean)
  {
    return 3;
  }
  
  public boolean a(zaca paramzaca, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return false;
  }
  
  public boolean c(zaca paramzaca, boolean paramBoolean)
  {
    return false;
  }
  
  public zaie m()
  {
    return this;
  }
  
  public void n() {}
  
  public int b(zaca paramzaca, int paramInt)
  {
    return 0;
  }
  
  public boolean a(zaie paramzaie)
  {
    if (paramzaie.b() != b()) {
      return false;
    }
    Object localObject1 = c();
    Object localObject2 = paramzaie.c();
    if (localObject1 == null)
    {
      if (localObject2 != null) {
        return false;
      }
    }
    else
    {
      if (localObject2 == null) {
        return false;
      }
      if (!localObject1.equals(localObject2)) {
        return false;
      }
    }
    return true;
  }
  
  public zaie b(zaie paramzaie)
  {
    if (a(paramzaie)) {
      return this;
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaau.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */