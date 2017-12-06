package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcbj
  extends zche
{
  zcbj()
  {
    this.d = 360;
  }
  
  void a(zbti paramzbti)
    throws Exception
  {
    int i = 2;
    byte[] arrayOfByte;
    if (paramzbti.a() == 0)
    {
      i += 12;
      i += 4;
      this.c = new byte[i];
      arrayOfByte = new byte[] { -1, -1, -1, -1 };
      System.arraycopy(zc.a((short)0), 0, this.c, 0, 2);
      int j = 2;
      j = zcgj.a(this.c, j, "rId1");
      System.arraycopy(arrayOfByte, 0, this.c, j, 4);
    }
    else
    {
      String str;
      String[] arrayOfString1;
      String[] arrayOfString2;
      int k;
      if (paramzbti.a() == 3)
      {
        arrayOfByte = null;
        str = null;
        arrayOfString1 = new String[] { str };
        arrayOfString2 = new String[] { arrayOfByte };
        paramzbti.a(arrayOfString1, arrayOfString2);
        str = arrayOfString1[0];
        arrayOfByte = arrayOfString2[0];
        i += 8 + arrayOfByte.length() * 2 + str.length() * 2;
        this.c = new byte[i];
        System.arraycopy(zc.a((short)1), 0, this.c, 0, 2);
        k = 2;
        k = zcgj.a(this.c, k, arrayOfByte);
        k = zcgj.a(this.c, k, str);
      }
      else
      {
        arrayOfByte = null;
        str = null;
        arrayOfString1 = new String[] { str };
        arrayOfString2 = new String[] { arrayOfByte };
        paramzbti.b(arrayOfString1, arrayOfString2);
        str = arrayOfString1[0];
        arrayOfByte = arrayOfString2[0];
        i += 16 + str.length() * 2;
        this.c = new byte[i];
        System.arraycopy(zc.a((short)2), 0, this.c, 0, 2);
        k = 2;
        k = zcgj.a(this.c, k, "rId1");
        k = zcgj.a(this.c, k, str);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcbj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */