package com.aspose.cells;

import com.aspose.cells.b.a.zw;

class zabp
  extends zaau
{
  static zabp a = new zabp("");
  static zabp b = new zabp("TRUE");
  static zabp c = new zabp("FALSE");
  static zabp d = new zabp("#DIV/0!");
  static zabp e = new zabp("#N/A");
  static zabp f = new zabp("#NAME?");
  static zabp g = new zabp("#NULL!");
  static zabp h = new zabp("#NUM!");
  static zabp i = new zabp("#REF!");
  static zabp j = new zabp("#VALUE!");
  private String k;
  
  public zabp(String paramString)
  {
    this.k = paramString;
  }
  
  public String o()
  {
    return this.k;
  }
  
  public boolean p()
  {
    return "".equals(this.k);
  }
  
  public int b()
  {
    return 2;
  }
  
  public Object c()
  {
    return this.k;
  }
  
  public byte a()
  {
    return 23;
  }
  
  public zabb a(zaca paramzaca, int paramInt)
  {
    if (paramzaca.c.m()) {
      return zabb.a;
    }
    if (zabt.b(paramInt)) {
      return zabt.a(this.k, paramzaca);
    }
    return null;
  }
  
  public zabp i(zaca paramzaca)
  {
    return this;
  }
  
  public zaba j(zaca paramzaca)
  {
    String str = this.k.toUpperCase();
    if (str.equals("TRUE")) {
      return zaba.a;
    }
    if (str.equals("FALSE")) {
      return zaba.b;
    }
    return null;
  }
  
  public void a(zahh paramzahh, zaah paramzaah)
  {
    paramzahh.a('"');
    paramzahh.a(zw.a(this.k, "\"", "\"\""));
    paramzahh.a('"');
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zabp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */