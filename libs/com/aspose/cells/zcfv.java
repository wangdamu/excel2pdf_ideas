package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcfv
  extends zche
{
  zcfv()
  {
    this.d = 371;
  }
  
  void a(zwj paramzwj)
    throws Exception
  {
    String str = (String)paramzwj.b;
    this.c = new byte[8 + str.length() * 2];
    System.arraycopy(zc.a(paramzwj.a), 0, this.c, 0, 4);
    int i = 4;
    i = zcgj.a(this.c, i, str);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcfv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */