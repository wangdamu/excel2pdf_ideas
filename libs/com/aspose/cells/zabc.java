package com.aspose.cells;

import com.aspose.cells.b.c.a.za;

abstract class zabc
  extends zaau
{
  static zabc a = new za();
  static zabc b = new ze();
  static zabc c = new zf();
  static zabc d = new zd();
  static zabc e = new zc();
  static zabc f = new zg();
  static zabc g = new zb();
  private static final za h = new za(new String[] { "#DIV/0!", "#N/A", "#NAME?", "#NULL!", "#NUM!", "#REF!", "#VALUE!" });
  
  static zabc a(byte paramByte)
  {
    switch (paramByte)
    {
    case 7: 
      return a;
    case 42: 
      return g;
    case 29: 
      return e;
    case 0: 
      return d;
    case 36: 
      return ze.h;
    case 23: 
      return c;
    case 15: 
      return f;
    }
    return f;
  }
  
  static zabc a(String paramString)
  {
    if ((paramString.length() < 4) || (paramString.charAt(0) != '#') || (paramString.length() > 7)) {
      return null;
    }
    switch (h.a(paramString))
    {
    case 0: 
      return a;
    case 1: 
      return g;
    case 2: 
      return e;
    case 3: 
      return d;
    case 4: 
      return ze.h;
    case 5: 
      return c;
    case 6: 
      return f;
    }
    return null;
  }
  
  public abstract zuf o();
  
  public abstract zabb p();
  
  public abstract String q();
  
  public int b()
  {
    return 0;
  }
  
  public boolean f()
  {
    return true;
  }
  
  public byte a()
  {
    return 28;
  }
  
  public Object b(zaca paramzaca)
  {
    return i(paramzaca).o();
  }
  
  public zabb a(zaca paramzaca, int paramInt)
  {
    return null;
  }
  
  public zaba j(zaca paramzaca)
  {
    return null;
  }
  
  public boolean a(zaie paramzaie)
  {
    return paramzaie == this;
  }
  
  public void a(zahh paramzahh, zaah paramzaah)
  {
    paramzahh.a(paramzaah == null ? q() : paramzaah.a(q()));
  }
  
  public String a(zaah paramzaah)
  {
    return paramzaah == null ? q() : paramzaah.a(q());
  }
  
  public String toString()
  {
    return q();
  }
  
  private static class zg
    extends zabc
  {
    static zabc h = new zg();
    
    public zuf o()
    {
      return zuf.i;
    }
    
    public String q()
    {
      return "#VALUE!";
    }
    
    public zabb p()
    {
      return new zabb(3.0D);
    }
    
    public Object c()
    {
      return Byte.valueOf();
    }
    
    public zabp i(zaca paramzaca)
    {
      return zabp.j;
    }
  }
  
  private static class zf
    extends zabc
  {
    static zabc h = new zf();
    
    public zuf o()
    {
      return zuf.g;
    }
    
    public String q()
    {
      return "#REF!";
    }
    
    public zabb p()
    {
      return new zabb(4.0D);
    }
    
    public Object c()
    {
      return Byte.valueOf();
    }
    
    public zabp i(zaca paramzaca)
    {
      return zabp.i;
    }
  }
  
  private static class ze
    extends zabc
  {
    static zabc h = new ze();
    
    public zuf o()
    {
      return zuf.f;
    }
    
    public String q()
    {
      return "#NUM!";
    }
    
    public zabb p()
    {
      return new zabb(6.0D);
    }
    
    public Object c()
    {
      return Byte.valueOf();
    }
    
    public zabp i(zaca paramzaca)
    {
      return zabp.h;
    }
  }
  
  private static class zd
    extends zabc
  {
    static zabc h = new zd();
    
    public zuf o()
    {
      return zuf.e;
    }
    
    public String q()
    {
      return "#NULL!";
    }
    
    public zabb p()
    {
      return zabb.b;
    }
    
    public Object c()
    {
      return Byte.valueOf();
    }
    
    public zabp i(zaca paramzaca)
    {
      return zabp.g;
    }
  }
  
  private static class zc
    extends zabc
  {
    static zabc h = new zc();
    
    public zuf o()
    {
      return zuf.d;
    }
    
    public String q()
    {
      return "#NAME?";
    }
    
    public zabb p()
    {
      return new zabb(5.0D);
    }
    
    public Object c()
    {
      return Byte.valueOf();
    }
    
    public zabp i(zaca paramzaca)
    {
      return zabp.f;
    }
  }
  
  private static class zb
    extends zabc
  {
    static zabc h = new zb();
    
    public zuf o()
    {
      return zuf.c;
    }
    
    public String q()
    {
      return "#N/A";
    }
    
    public zabb p()
    {
      return new zabb(7.0D);
    }
    
    public Object c()
    {
      return Byte.valueOf();
    }
    
    public zabp i(zaca paramzaca)
    {
      return zabp.e;
    }
  }
  
  private static class za
    extends zabc
  {
    static zabc h = new za();
    
    public zuf o()
    {
      return zuf.a;
    }
    
    public String q()
    {
      return "#DIV/0!";
    }
    
    public zabb p()
    {
      return new zabb(2.0D);
    }
    
    public Object c()
    {
      return Byte.valueOf();
    }
    
    public zabp i(zaca paramzaca)
    {
      return zabp.d;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zabc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */