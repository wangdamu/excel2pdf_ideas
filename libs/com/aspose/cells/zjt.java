package com.aspose.cells;

import com.aspose.cells.a.c.zp;
import com.aspose.cells.b.a.zs;

class zjt
{
  Object a;
  int b;
  String c;
  boolean d = true;
  boolean e = false;
  boolean f = false;
  int g;
  
  zjt() {}
  
  zjt(Object paramObject, int paramInt, String paramString)
  {
    this.a = paramObject;
    this.b = paramInt;
    this.c = paramString;
    if (paramObject == null)
    {
      this.g = 3;
      this.e = true;
    }
    else
    {
      this.e = false;
      switch (zaoj.a(paramObject.getClass()))
      {
      case 18: 
        this.g = 5;
        break;
      case 9: 
      case 14: 
        this.g = 4;
        break;
      case 3: 
        this.g = 0;
        break;
      case 16: 
        this.g = 1;
        break;
      }
    }
  }
  
  String a()
  {
    if (this.a == null) {
      return "";
    }
    return zs.a(this.a);
  }
  
  String b()
  {
    String str = "0";
    if (this.a == null)
    {
      str = "0";
    }
    else
    {
      if (this.g == 0)
      {
        if (((Boolean)this.a).booleanValue()) {
          return "1";
        }
        return "0";
      }
      if (this.g == 1) {
        str = zp.b(((Double)this.a).doubleValue());
      } else if (this.g == 4) {
        str = zp.b(((Double)this.a).doubleValue());
      }
    }
    return str;
  }
  
  boolean a(zjt paramzjt)
  {
    if (paramzjt == null) {
      return false;
    }
    if ((this.a == null) && (paramzjt.a == null)) {
      return true;
    }
    if (((this.a == null) && (paramzjt.a != null)) || ((this.a != null) && (paramzjt.a == null))) {
      return false;
    }
    return this.a.equals(paramzjt.a);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zjt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */