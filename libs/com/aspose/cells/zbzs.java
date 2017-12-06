package com.aspose.cells;

import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.g.zd;

class zbzs
{
  zm b;
  String c = "";
  
  zbzs(zm paramzm)
  {
    this.b = paramzm;
  }
  
  void a(String paramString)
    throws Exception
  {
    byte[] arrayOfByte = zd.getUTF8().a(paramString);
    this.b.b(arrayOfByte, 0, arrayOfByte.length);
    this.b.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbzs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */