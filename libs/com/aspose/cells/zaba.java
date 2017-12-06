package com.aspose.cells;

abstract class zaba
  extends zaau
{
  static zaba a = new zb();
  static zaba b = new za();
  
  public abstract boolean o();
  
  public int b()
  {
    return 1;
  }
  
  public boolean e()
  {
    return true;
  }
  
  public byte a()
  {
    return 29;
  }
  
  public zaba j(zaca paramzaca)
  {
    return this;
  }
  
  public boolean a(zaie paramzaie)
  {
    return paramzaie == this;
  }
  
  public void a(zahh paramzahh, zaah paramzaah)
  {
    paramzahh.a(paramzaah == null ? "FALSE" : o() ? "TRUE" : paramzaah.a(o()));
  }
  
  public String a(zaah paramzaah)
  {
    return paramzaah == null ? "FALSE" : o() ? "TRUE" : paramzaah.a(o());
  }
  
  public String toString()
  {
    return o() ? "TRUE" : "FALSE";
  }
  
  static class za
    extends zaba
  {
    public boolean o()
    {
      return false;
    }
    
    public Object c()
    {
      return znq.e;
    }
    
    public zabb a(zaca paramzaca, int paramInt)
    {
      if ((zabt.c(paramInt)) || (paramzaca.c.m())) {
        return zabb.a;
      }
      return null;
    }
    
    public zabp i(zaca paramzaca)
    {
      return zabp.c;
    }
  }
  
  private static class zb
    extends zaba
  {
    public boolean o()
    {
      return true;
    }
    
    public Object c()
    {
      return znq.d;
    }
    
    public zabb a(zaca paramzaca, int paramInt)
    {
      if ((zabt.c(paramInt)) || (paramzaca.c.m())) {
        return zabb.b;
      }
      return null;
    }
    
    public zabp i(zaca paramzaca)
    {
      return zabp.b;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */