package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zw;

class ztm
{
  String a;
  byte[] b;
  byte[] c;
  int d = 100000;
  
  boolean a()
  {
    return (!zw.b(this.a)) || ((this.b != null) && ((zc.e(this.b, 0) & 0xFFFF) != 0));
  }
  
  int b()
  {
    if ((this.a != null) || (this.b == null)) {
      return 0;
    }
    return zc.e(this.b, 0);
  }
  
  void a(int paramInt)
  {
    this.b = zc.a(paramInt);
    this.a = null;
    this.c = null;
  }
  
  void a(ztm paramztm)
  {
    this.a = paramztm.a;
    this.b = paramztm.b;
    this.c = paramztm.c;
    this.d = paramztm.d;
  }
  
  boolean a(String paramString)
  {
    if (this.a == null)
    {
      int i = b();
      if ((paramString == null) || ("".equals(paramString))) {
        return i == 0;
      }
      return i == (zui.a(paramString) & 0xFFFF);
    }
    return zuh.a(paramString, this.a, this.b, this.c, this.d);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ztm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */