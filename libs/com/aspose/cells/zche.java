package com.aspose.cells;

import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zc;

class zche
{
  byte[] c;
  protected int d;
  
  protected zche() {}
  
  zche(int paramInt)
  {
    this.d = paramInt;
  }
  
  zche(int paramInt1, int paramInt2)
  {
    this.d = paramInt1;
    this.c = zc.a(paramInt2);
  }
  
  void a(zm paramzm)
    throws Exception
  {
    byte[] arrayOfByte = new byte[8];
    int i = 0;
    i = a(arrayOfByte, i, this.d);
    if (this.c != null)
    {
      i = a(arrayOfByte, i, this.c.length);
      paramzm.b(arrayOfByte, 0, i);
      paramzm.b(this.c, 0, this.c.length);
    }
    else
    {
      paramzm.b(arrayOfByte, 0, i + 1);
    }
  }
  
  static void a(int paramInt, zm paramzm)
    throws Exception
  {
    byte[] arrayOfByte = new byte[5];
    int i = 0;
    i = a(arrayOfByte, i, paramInt);
    paramzm.b(arrayOfByte, 0, i + 1);
  }
  
  static void a(int paramInt, byte[] paramArrayOfByte, zm paramzm)
    throws Exception
  {
    byte[] arrayOfByte = new byte[8 + paramArrayOfByte.length];
    int i = 0;
    i = a(arrayOfByte, i, paramInt);
    i = a(arrayOfByte, i, paramArrayOfByte.length);
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, i, paramArrayOfByte.length);
    i += paramArrayOfByte.length;
    paramzm.b(arrayOfByte, 0, i);
  }
  
  static void a(int paramInt, String paramString, zm paramzm)
    throws Exception
  {
    byte[] arrayOfByte = new byte[12 + paramString.length() * 2];
    int i = 0;
    i = a(arrayOfByte, i, paramInt);
    i = a(arrayOfByte, i, 4 + paramString.length() * 2);
    i = zcgj.a(arrayOfByte, i, paramString);
    paramzm.b(arrayOfByte, 0, i);
  }
  
  static void a(int paramInt1, int paramInt2, int paramInt3, zm paramzm)
    throws Exception
  {
    byte[] arrayOfByte = new byte[7];
    int i = 0;
    i = a(arrayOfByte, i, paramInt1);
    arrayOfByte[i] = ((byte)paramInt3);
    i++;
    System.arraycopy(zc.a(paramInt2), 0, arrayOfByte, i, paramInt3);
    i += paramInt3;
    paramzm.b(arrayOfByte, 0, i);
  }
  
  static int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    for (;;)
    {
      int i = paramInt2 % 128;
      int j = paramInt2 / 128;
      if (j > 0)
      {
        i |= 0x80;
        paramArrayOfByte[(paramInt1++)] = ((byte)i);
        paramInt2 = j;
      }
      else
      {
        paramArrayOfByte[(paramInt1++)] = ((byte)i);
        break;
      }
    }
    return paramInt1;
  }
  
  protected int a(String paramString, int paramInt)
  {
    int i = paramInt;
    int j;
    if (paramString == null)
    {
      for (j = 0; j < 4; j++) {
        this.c[(i++)] = -1;
      }
    }
    else if (paramString.length() == 0)
    {
      for (j = 0; j < 4; j++) {
        this.c[(i++)] = 0;
      }
    }
    else
    {
      System.arraycopy(zc.a(paramString.length()), 0, this.c, i, 4);
      i += 4;
      byte[] arrayOfByte = Encoding.getUnicode().a(paramString);
      System.arraycopy(arrayOfByte, 0, this.c, i, arrayOfByte.length);
      i += arrayOfByte.length;
    }
    return i;
  }
  
  protected void a(DateTime paramDateTime, int paramInt)
  {
    System.arraycopy(zc.a(paramDateTime.getYear()), 0, this.c, paramInt, 2);
    this.c[(paramInt + 2)] = ((byte)paramDateTime.getMonth());
    this.c[(paramInt + 3)] = ((byte)paramDateTime.getDay());
    this.c[(paramInt + 4)] = ((byte)paramDateTime.getHour());
    this.c[(paramInt + 5)] = ((byte)paramDateTime.getMinute());
    this.c[(paramInt + 6)] = ((byte)paramDateTime.getSecond());
    int i = paramDateTime.getDayOfWeek();
    if (i == 0) {
      i = 7;
    }
    this.c[(paramInt + 7)] = ((byte)i);
  }
  
  static void a(byte[] paramArrayOfByte, int paramInt1, zaml paramzaml, int paramInt2, Workbook paramWorkbook)
  {
    switch (paramzaml.c())
    {
    case 0: 
    case 1: 
      paramArrayOfByte[(paramInt1 + 1)] = ((byte)paramInt2);
      return;
    case 3: 
      paramArrayOfByte[paramInt1] = 3;
      paramArrayOfByte[(paramInt1 + 1)] = ((byte)paramzaml.e());
      break;
    case 2: 
      paramArrayOfByte[paramInt1] = 5;
      break;
    case 4: 
      paramArrayOfByte[paramInt1] = 6;
      paramArrayOfByte[(paramInt1 + 1)] = ((byte)paramzaml.e());
      break;
    }
    System.arraycopy(zc.a((short)(int)(paramzaml.g() * 32767.0D)), 0, paramArrayOfByte, paramInt1 + 2, 2);
    int i = paramzaml.c(paramWorkbook);
    paramArrayOfByte[(paramInt1 + 4)] = ((byte)((i & 0xFF0000) >> 16));
    paramArrayOfByte[(paramInt1 + 5)] = ((byte)((i & 0xFF00) >> 8));
    paramArrayOfByte[(paramInt1 + 6)] = ((byte)(i & 0xFF));
    paramArrayOfByte[(paramInt1 + 7)] = -1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zche.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */