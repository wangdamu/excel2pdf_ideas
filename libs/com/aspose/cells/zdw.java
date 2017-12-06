package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zdw
  extends zche
{
  zdw(WebQueryConnection paramWebQueryConnection)
    throws Exception
  {
    this.d = 261;
    int i = 5;
    int j = 0;
    if (paramWebQueryConnection.d != null)
    {
      i += 4 + paramWebQueryConnection.d.length() * 2;
      j = (byte)(j | 0x4);
    }
    if (paramWebQueryConnection.c != null)
    {
      i += 4 + paramWebQueryConnection.c.length() * 2;
      j = (byte)(j | 0x1);
    }
    if (paramWebQueryConnection.a != null)
    {
      i += 4 + paramWebQueryConnection.a.length() * 2;
      j = (byte)(j | 0x2);
    }
    this.c = new byte[i];
    int k = 0;
    switch (paramWebQueryConnection.b)
    {
    case 0: 
      this.c[k] = 2;
      break;
    case 1: 
      this.c[k] = 1;
      break;
    case 2: 
      this.c[k] = 0;
      break;
    }
    k++;
    System.arraycopy(zc.a(paramWebQueryConnection.y), 0, this.c, k, 2);
    k += 3;
    this.c[k] = j;
    k++;
    if (paramWebQueryConnection.d != null) {
      k = zcgj.a(this.c, k, paramWebQueryConnection.d);
    }
    if (paramWebQueryConnection.c != null) {
      k = zcgj.a(this.c, k, paramWebQueryConnection.c);
    }
    if (paramWebQueryConnection.a != null) {
      k = zcgj.a(this.c, k, paramWebQueryConnection.a);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zdw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */