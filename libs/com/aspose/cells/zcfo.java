package com.aspose.cells;

import com.aspose.cells.a.f.zj;

abstract class zcfo
  extends zp
{
  com.aspose.cells.b.a.d.zh b;
  
  boolean a()
  {
    return false;
  }
  
  abstract void d()
    throws Exception;
  
  void a(zj paramzj)
    throws Exception
  {
    this.b = new com.aspose.cells.b.a.d.zh();
    d();
    a(this.a, this.b, paramzj);
    this.b.a();
    this.b = null;
  }
  
  static void a(String paramString, com.aspose.cells.b.a.d.zh paramzh, zj paramzj)
    throws Exception
  {
    com.aspose.cells.a.f.zh localzh = paramzj.a(paramString);
    localzh.a(DateTime.getNow());
    paramzj.a(localzh);
    paramzh.b(0L);
    byte[] arrayOfByte = new byte['Ѐ'];
    int i = 0;
    do
    {
      i = paramzh.a(arrayOfByte, 0, arrayOfByte.length);
      paramzj.b(arrayOfByte, 0, i);
    } while (i > 0);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */