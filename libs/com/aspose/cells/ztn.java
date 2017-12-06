package com.aspose.cells;

import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zc;

class ztn
{
  private ztl a;
  
  private void a(ztl paramztl)
    throws Exception
  {
    if (paramztl == null) {
      this.a = ztl.a();
    } else {
      this.a = paramztl;
    }
  }
  
  void a(zm paramzm, ztl paramztl)
    throws Exception
  {
    a(paramztl);
    paramzm.a(0L, 0);
    while (paramzm.i() < paramzm.h())
    {
      byte[] arrayOfByte = new byte[2];
      paramzm.a(arrayOfByte, 0, 2);
      int i = zc.e(arrayOfByte, 0);
      int j;
      switch (i)
      {
      case 2057: 
        paramzm.a(18L, 1);
        break;
      case 225: 
        paramzm.a(4L, 1);
        break;
      case 47: 
        paramzm.a(arrayOfByte, 0, 2);
        j = zc.b(arrayOfByte, 0);
        paramzm.a(j, 1);
        break;
      case 133: 
        paramzm.a(arrayOfByte, 0, 2);
        j = zc.b(arrayOfByte, 0);
        paramzm.a(4L, 1);
        arrayOfByte = new byte[j - 4];
        paramzm.a(arrayOfByte, 0, j - 4);
        arrayOfByte = a(paramzm, arrayOfByte);
        paramzm.a(4 - j, 1);
        paramzm.b(arrayOfByte, 0, j - 4);
        break;
      default: 
        paramzm.a(arrayOfByte, 0, 2);
        j = zc.b(arrayOfByte, 0);
        if (j != 0)
        {
          arrayOfByte = new byte[j];
          paramzm.a(arrayOfByte, 0, j);
          arrayOfByte = a(paramzm, arrayOfByte);
          paramzm.a(-j, 1);
          paramzm.b(arrayOfByte, 0, j);
        }
        break;
      }
    }
  }
  
  void a(zm paramzm, zcc paramzcc)
    throws Exception
  {
    paramzm.a(0L, 0);
    while (paramzm.i() < paramzm.h())
    {
      byte[] arrayOfByte1 = new byte[2];
      byte[] arrayOfByte2 = null;
      paramzm.a(arrayOfByte1, 0, 2);
      int i = zc.e(arrayOfByte1, 0);
      int j;
      switch (i)
      {
      case 2057: 
        paramzm.a(18L, 1);
        break;
      case 225: 
        paramzm.a(4L, 1);
        break;
      case 47: 
        paramzm.a(arrayOfByte1, 0, 2);
        j = zc.b(arrayOfByte1, 0);
        paramzm.a(j, 1);
        break;
      case 133: 
        paramzm.a(arrayOfByte1, 0, 2);
        j = zc.b(arrayOfByte1, 0);
        paramzm.a(4L, 1);
        arrayOfByte1 = new byte[j - 4];
        paramzm.a(arrayOfByte1, 0, j - 4);
        arrayOfByte1 = a(paramzm, arrayOfByte1, paramzcc);
        paramzm.a(4 - j, 1);
        paramzm.b(arrayOfByte1, 0, j - 4);
        break;
      case 92: 
        paramzm.a(arrayOfByte1, 0, 2);
        j = zc.b(arrayOfByte1, 0);
        arrayOfByte2 = new byte[j];
        paramzm.a(arrayOfByte2, 0, j);
        arrayOfByte2 = a(paramzm, arrayOfByte2, paramzcc);
        paramzm.a(-j, 1);
        paramzm.b(arrayOfByte2, 0, j);
        paramzcc.a(0L);
        long l = paramzm.i() - j;
        paramzcc.a(arrayOfByte2, l);
        break;
      default: 
        paramzm.a(arrayOfByte1, 0, 2);
        j = zc.b(arrayOfByte1, 0);
        if (j != 0)
        {
          arrayOfByte2 = new byte[j];
          paramzm.a(arrayOfByte2, 0, j);
          arrayOfByte2 = a(paramzm, arrayOfByte2, paramzcc);
          paramzm.a(-j, 1);
          paramzm.b(arrayOfByte2, 0, j);
        }
        break;
      }
    }
  }
  
  private byte[] a(zm paramzm, byte[] paramArrayOfByte, zcc paramzcc)
    throws Exception
  {
    long l = paramzm.i() - paramArrayOfByte.length;
    return paramzcc.b(paramArrayOfByte, l);
  }
  
  private byte[] a(zm paramzm, byte[] paramArrayOfByte)
    throws Exception
  {
    long l = paramzm.i() - paramArrayOfByte.length;
    return this.a.a(paramArrayOfByte, 0, paramArrayOfByte.length, l);
  }
  
  private byte[] a(zm paramzm, byte[] paramArrayOfByte, zca paramzca)
    throws Exception
  {
    int i = (int)(paramzm.i() - paramArrayOfByte.length);
    return paramzca.a(paramArrayOfByte, i, (short)paramArrayOfByte.length);
  }
  
  private byte[] b(zm paramzm, byte[] paramArrayOfByte, zca paramzca)
    throws Exception
  {
    int i = (int)(paramzm.i() - paramArrayOfByte.length);
    return paramzca.b(paramArrayOfByte, i, (short)paramArrayOfByte.length);
  }
  
  void a(zm paramzm, zca paramzca)
    throws Exception
  {
    paramzm.a(0L, 0);
    while (paramzm.i() < paramzm.h())
    {
      byte[] arrayOfByte = new byte[2];
      paramzm.a(arrayOfByte, 0, 2);
      int i = zc.e(arrayOfByte, 0);
      int j;
      switch (i)
      {
      case 2057: 
        paramzm.a(18L, 1);
        break;
      case 225: 
        paramzm.a(4L, 1);
        break;
      case 47: 
        paramzm.a(8L, 1);
        break;
      case 133: 
        paramzm.a(arrayOfByte, 0, 2);
        j = zc.b(arrayOfByte, 0);
        arrayOfByte = new byte[j];
        paramzm.a(arrayOfByte, 0, j);
        arrayOfByte = b(paramzm, arrayOfByte, paramzca);
        paramzm.a(4 - j, 1);
        paramzm.b(arrayOfByte, 4, j - 4);
        break;
      default: 
        paramzm.a(arrayOfByte, 0, 2);
        j = zc.b(arrayOfByte, 0);
        if (j != 0)
        {
          arrayOfByte = new byte[j];
          paramzm.a(arrayOfByte, 0, j);
          arrayOfByte = b(paramzm, arrayOfByte, paramzca);
          paramzm.a(-j, 1);
          paramzm.b(arrayOfByte, 0, j);
        }
        break;
      }
    }
  }
  
  void b(zm paramzm, zca paramzca)
    throws Exception
  {
    paramzm.a(0L, 0);
    while (paramzm.i() < paramzm.h())
    {
      byte[] arrayOfByte = new byte[2];
      paramzm.a(arrayOfByte, 0, 2);
      int i = zc.e(arrayOfByte, 0);
      int j;
      switch (i)
      {
      case 2057: 
        paramzm.a(18L, 1);
        break;
      case 225: 
        paramzm.a(4L, 1);
        break;
      case 47: 
        paramzm.a(8L, 1);
        break;
      case 133: 
        paramzm.a(arrayOfByte, 0, 2);
        j = zc.b(arrayOfByte, 0);
        arrayOfByte = new byte[j];
        paramzm.a(arrayOfByte, 0, j);
        arrayOfByte = a(paramzm, arrayOfByte, paramzca);
        paramzm.a(4 - j, 1);
        paramzm.b(arrayOfByte, 4, j - 4);
        break;
      default: 
        paramzm.a(arrayOfByte, 0, 2);
        j = zc.b(arrayOfByte, 0);
        if (j != 0)
        {
          arrayOfByte = new byte[j];
          paramzm.a(arrayOfByte, 0, j);
          arrayOfByte = a(paramzm, arrayOfByte, paramzca);
          paramzm.a(-j, 1);
          paramzm.b(arrayOfByte, 0, j);
        }
        break;
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ztn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */