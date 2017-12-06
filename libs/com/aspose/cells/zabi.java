package com.aspose.cells;

import com.aspose.cells.a.c.zl;

abstract class zabi
  extends zabk
{
  abstract boolean a(int paramInt);
  
  public static zabi q()
  {
    return new za(null);
  }
  
  public static zabi r()
  {
    return new zb(null);
  }
  
  public static zabi s()
  {
    return new zc(null);
  }
  
  public static zabi t()
  {
    return new zd(null);
  }
  
  public static zabi u()
  {
    return new ze(null);
  }
  
  public static zabi v()
  {
    return new zf(null);
  }
  
  protected zaie k(zaca paramzaca)
  {
    zaie localzaie1 = this.a.e(paramzaca);
    if (localzaie1.b() == 0) {
      return localzaie1;
    }
    zaie localzaie2 = this.b.e(paramzaca);
    if (localzaie2.b() == 0) {
      return localzaie2;
    }
    int i;
    if (localzaie1 == localzaie2) {
      i = 0;
    } else {
      switch (localzaie2.b())
      {
      case 3: 
        i = zoc.a(localzaie1, ((zabb)localzaie2).o(), paramzaca);
        break;
      case 2: 
        i = zod.a(localzaie1, ((zabp)localzaie2).o(), paramzaca);
        break;
      case 1: 
        i = znz.a(localzaie1, ((zaba)localzaie2).o(), paramzaca);
        break;
      case 12: 
        i = zob.a(localzaie1, paramzaca);
        break;
      default: 
        if (paramzaca.p.L.n.a) {
          zl.a("Unsupported node type to compare for Operator: " + localzaie2.b());
        }
        i = -1;
      }
    }
    return a(i) ? zaba.a : zaba.b;
  }
  
  private static class zf
    extends zabi
  {
    public byte a()
    {
      return 14;
    }
    
    public zabk w()
    {
      return new zf();
    }
    
    public String p()
    {
      return "<>";
    }
    
    public void b(zahh paramzahh, zaah paramzaah)
    {
      paramzahh.a("<>");
    }
    
    boolean a(int paramInt)
    {
      return paramInt != 0;
    }
    
    protected zaie k(zaca paramzaca)
    {
      zaie localzaie1 = this.a.e(paramzaca);
      if (localzaie1.b() == 0) {
        return localzaie1;
      }
      zaie localzaie2 = this.b.e(paramzaca);
      if (localzaie2.b() == 0) {
        return localzaie2;
      }
      return zabt.a(localzaie1, localzaie2, paramzaca) ? zaba.b : zaba.a;
    }
  }
  
  private static class ze
    extends zabi
  {
    public byte a()
    {
      return 9;
    }
    
    public zabk w()
    {
      return new ze();
    }
    
    public String p()
    {
      return "<";
    }
    
    public void b(zahh paramzahh, zaah paramzaah)
    {
      paramzahh.a("<");
    }
    
    boolean a(int paramInt)
    {
      return paramInt < 0;
    }
  }
  
  private static class zd
    extends zabi
  {
    public byte a()
    {
      return 10;
    }
    
    public zabk w()
    {
      return new zd();
    }
    
    public String p()
    {
      return "<=";
    }
    
    public void b(zahh paramzahh, zaah paramzaah)
    {
      paramzahh.a("<=");
    }
    
    boolean a(int paramInt)
    {
      return paramInt <= 0;
    }
  }
  
  private static class zc
    extends zabi
  {
    public byte a()
    {
      return 13;
    }
    
    public zabk w()
    {
      return new zc();
    }
    
    public String p()
    {
      return ">";
    }
    
    public void b(zahh paramzahh, zaah paramzaah)
    {
      paramzahh.a(">");
    }
    
    boolean a(int paramInt)
    {
      return paramInt > 0;
    }
  }
  
  private static class zb
    extends zabi
  {
    public byte a()
    {
      return 12;
    }
    
    public zabk w()
    {
      return new zb();
    }
    
    public String p()
    {
      return ">=";
    }
    
    public void b(zahh paramzahh, zaah paramzaah)
    {
      paramzahh.a(">=");
    }
    
    boolean a(int paramInt)
    {
      return paramInt >= 0;
    }
  }
  
  private static class za
    extends zabi
  {
    public byte a()
    {
      return 11;
    }
    
    public zabk w()
    {
      return new za();
    }
    
    public String p()
    {
      return "=";
    }
    
    public void b(zahh paramzahh, zaah paramzaah)
    {
      paramzahh.a("=");
    }
    
    boolean a(int paramInt)
    {
      return paramInt == 0;
    }
    
    protected zaie k(zaca paramzaca)
    {
      zaie localzaie1 = this.a.e(paramzaca);
      if (localzaie1.b() == 0) {
        return localzaie1;
      }
      zaie localzaie2 = this.b.e(paramzaca);
      if (localzaie2.b() == 0) {
        return localzaie2;
      }
      return zabt.a(localzaie1, localzaie2, paramzaca) ? zaba.a : zaba.b;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zabi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */