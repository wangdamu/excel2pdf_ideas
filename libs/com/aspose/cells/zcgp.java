package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcgp
  extends zche
{
  zcgp()
  {
    this.d = 39;
  }
  
  void a(Name paramName)
    throws Exception
  {
    int i = 9;
    String str = paramName.getText();
    if (str != null) {
      i += str.length() * 2 + 4;
    } else {
      i += 4;
    }
    byte[] arrayOfByte1 = paramName.b();
    byte[] arrayOfByte2 = null;
    if (arrayOfByte1 != null)
    {
      arrayOfByte2 = new byte[arrayOfByte1.length];
      if (arrayOfByte2 != null)
      {
        System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
        i += arrayOfByte2.length;
      }
    }
    else
    {
      i += 8;
    }
    if (paramName.getComment() != null) {
      i += paramName.getComment().length() * 2 + 4;
    } else {
      i += 4;
    }
    if ((paramName.p()) && (!paramName.o()))
    {
      if (paramName.c() != null) {
        i += paramName.c().length() * 2 + 4;
      } else {
        i += 4;
      }
      if (paramName.d() != null) {
        i += paramName.d().length() * 2 + 4;
      } else {
        i += 4;
      }
      if (paramName.e() != null) {
        i += paramName.e().length() * 2 + 4;
      } else {
        i += 4;
      }
      if (paramName.f() != null) {
        i += paramName.f().length() * 2 + 4;
      } else {
        i += 4;
      }
    }
    this.c = new byte[i];
    System.arraycopy(zc.a(paramName.a() & 0xFFFF), 0, this.c, 0, 4);
    this.c[4] = paramName.g();
    System.arraycopy(zc.a(paramName.getSheetIndex() - 1), 0, this.c, 5, 4);
    int j = 9;
    byte[] arrayOfByte3 = { -1, -1, -1, -1 };
    if (str != null)
    {
      j = zcgj.a(this.c, j, str);
    }
    else
    {
      System.arraycopy(arrayOfByte3, 0, this.c, j, 4);
      j += 4;
    }
    if (arrayOfByte2 != null)
    {
      System.arraycopy(arrayOfByte2, 0, this.c, j, arrayOfByte2.length);
      j += arrayOfByte2.length;
    }
    else
    {
      j += 8;
    }
    if (paramName.getComment() != null)
    {
      j = zcgj.a(this.c, j, paramName.getComment());
    }
    else
    {
      System.arraycopy(arrayOfByte3, 0, this.c, j, 4);
      j += 4;
    }
    if ((paramName.p()) && (!paramName.o()))
    {
      if (paramName.c() != null)
      {
        j = zcgj.a(this.c, j, paramName.c());
      }
      else
      {
        System.arraycopy(arrayOfByte3, 0, this.c, j, 4);
        j += 4;
      }
      if (paramName.d() != null)
      {
        j = zcgj.a(this.c, j, paramName.d());
      }
      else
      {
        System.arraycopy(arrayOfByte3, 0, this.c, j, 4);
        j += 4;
      }
      if (paramName.e() != null)
      {
        j = zcgj.a(this.c, j, paramName.e());
      }
      else
      {
        System.arraycopy(arrayOfByte3, 0, this.c, j, 4);
        j += 4;
      }
      if (paramName.f() != null)
      {
        j = zcgj.a(this.c, j, paramName.f());
      }
      else
      {
        System.arraycopy(arrayOfByte3, 0, this.c, j, 4);
        j += 4;
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcgp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */