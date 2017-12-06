package com.aspose.cells;

import com.aspose.cells.b.a.zs;

class zbro
  implements zaji
{
  private int a;
  private zne b = null;
  
  public zbro(int paramInt)
  {
    this.a = paramInt;
    b();
  }
  
  public void b()
  {
    switch (this.a)
    {
    case 412: 
      this.b = new zne(0.0D, 0.0D);
      break;
    case 413: 
      this.b = new zne(1.0D, 0.0D);
    }
  }
  
  public zaie a()
  {
    return new zabp(zs.a(this.b));
  }
  
  public boolean a(zaie paramzaie, boolean paramBoolean)
  {
    return paramzaie.b() == 12;
  }
  
  public zaie a(zaie paramzaie, zaca paramzaca, boolean paramBoolean)
  {
    zne localzne = null;
    paramzaie = paramzaie.e(paramzaca);
    switch (paramzaie.b())
    {
    case 12: 
      return zaba.b;
    case 0: 
      return paramzaie;
    case 3: 
      localzne = new zne(((zabb)paramzaie).o(), 0.0D);
      break;
    default: 
      Object localObject = paramzaie.c();
      if (localObject != null) {
        try
        {
          localzne = new zne(zs.a(localObject));
        }
        catch (Exception localException)
        {
          return zabc.b;
        }
      }
      break;
    }
    if (localzne != null) {
      switch (this.a)
      {
      case 412: 
        this.b = this.b.a(localzne);
        return null;
      case 413: 
        this.b = this.b.c(localzne);
        return null;
      }
    }
    return zaba.b;
  }
  
  public zaie a(zaie paramzaie, zaca paramzaca, boolean paramBoolean, int paramInt)
  {
    zne localzne = null;
    paramzaie = paramzaie.e(paramzaca);
    switch (paramzaie.b())
    {
    case 12: 
      return zaba.b;
    case 0: 
      return paramzaie;
    case 3: 
      localzne = new zne(((zabb)paramzaie).o(), 0.0D);
      break;
    default: 
      Object localObject = paramzaie.c();
      if (localObject != null) {
        try
        {
          localzne = new zne(zs.a(localObject));
        }
        catch (Exception localException)
        {
          return zabc.b;
        }
      }
      break;
    }
    if (localzne != null) {
      switch (this.a)
      {
      case 412: 
        if (paramInt > 1)
        {
          localzne.a(localzne.a() * paramInt);
          localzne.b(localzne.b() * paramInt);
        }
        this.b = this.b.a(localzne);
        return null;
      case 413: 
        if (paramInt > 1) {
          do
          {
            this.b = this.b.c(localzne);
            paramInt--;
          } while (paramInt != 0);
        } else {
          this.b = this.b.c(localzne);
        }
        return null;
      }
    }
    return zaba.b;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbro.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */