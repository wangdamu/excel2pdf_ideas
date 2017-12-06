package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zs;

class zawa
{
  byte a = 5;
  int b;
  zavz c = new zavz();
  
  int a()
  {
    switch ((this.a & 0xFF & 0xC) >> 2)
    {
    case 0: 
      return 3;
    case 1: 
      return 2;
    case 2: 
      return 0;
    case 3: 
      return 1;
    }
    return 2;
  }
  
  void a(int paramInt)
  {
    int i = 0;
    switch (paramInt)
    {
    case 3: 
      break;
    case 2: 
      i = 1;
      break;
    case 0: 
      i = 2;
      break;
    case 1: 
      i = 3;
      break;
    }
    this.a = ((byte)(this.a & 0x33));
    this.a = ((byte)(this.a | (byte)((i & 0xFF) << 2)));
  }
  
  int b()
  {
    switch (this.a & 0xFF & 0x3)
    {
    case 0: 
      return 1;
    case 1: 
      return 0;
    case 2: 
      return 2;
    case 3: 
      return 3;
    }
    return 0;
  }
  
  void b(int paramInt)
  {
    int i = 0;
    switch (paramInt)
    {
    case 1: 
      i = 0;
      break;
    case 0: 
      i = 1;
      break;
    case 2: 
      i = 2;
      break;
    case 3: 
      i = 3;
      break;
    }
    this.a = ((byte)(this.a & 0x3C));
    this.a = ((byte)(this.a | i));
  }
  
  void a(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramArrayOfByte.length < 10) {
      return;
    }
    int i = 4;
    this.b = (zc.e(paramArrayOfByte, i) & 0xFFFF);
    i += 2;
    this.a = paramArrayOfByte[i];
    i += 2;
    int j = zc.e(paramArrayOfByte, i) & 0xFFFF;
    i += 2;
    int k = zc.e(paramArrayOfByte, i) & 0xFFFF;
    i += 4;
    String str = null;
    if (k == 0)
    {
      i += 2;
      return;
    }
    str = Encoding.getUnicode().a(paramArrayOfByte, i, k * 2);
    i += 2 * k;
    Object localObject;
    if (j == 0)
    {
      localObject = new zavy();
      ((zavy)localObject).a = 0;
      ((zavy)localObject).b = paramInt;
      ((zavy)localObject).c = str;
      this.c.a((zavy)localObject);
    }
    else
    {
      localObject = null;
      int m = 0;
      for (int n = 0; n < j; n++)
      {
        int i1 = zc.e(paramArrayOfByte, i) & 0xFFFF;
        if (i1 >= str.length())
        {
          if (localObject != null) {
            ((zavy)localObject).c = str.substring(m);
          }
          return;
        }
        int i2 = zc.e(paramArrayOfByte, i + 2) & 0xFFFF;
        int i3 = zc.e(paramArrayOfByte, i + 4) & 0xFFFF;
        zavy localzavy = new zavy();
        localzavy.a = i2;
        localzavy.b = (i3 - i2 + 1);
        this.c.a(localzavy);
        if (localObject != null) {
          ((zavy)localObject).c = str.substring(m, m + (i1 - m + 1));
        }
        localObject = localzavy;
        m = i1;
        i += 6;
      }
      if (localObject != null) {
        ((zavy)localObject).c = str.substring(m);
      }
    }
  }
  
  byte[] c(int paramInt)
  {
    if (this.c.getCount() == 0) {
      return null;
    }
    int i = 14 + this.c.getCount() * 6;
    StringBuilder localStringBuilder = new StringBuilder();
    for (int j = 0; j < this.c.getCount(); j++)
    {
      localStringBuilder.append(this.c.a(j).c);
      i += this.c.a(j).c.length() * 2;
    }
    byte[] arrayOfByte = new byte[i];
    int k = 0;
    arrayOfByte[k] = 1;
    k += 2;
    System.arraycopy(zc.a(i - 4), 0, arrayOfByte, k, 2);
    k += 2;
    System.arraycopy(zc.a(this.b), 0, arrayOfByte, k, 2);
    k += 2;
    arrayOfByte[k] = this.a;
    k += 2;
    System.arraycopy(zc.a(this.c.getCount()), 0, arrayOfByte, k, 2);
    k += 2;
    System.arraycopy(zc.a(localStringBuilder.length()), 0, arrayOfByte, k, 2);
    k += 2;
    System.arraycopy(zc.a(localStringBuilder.length()), 0, arrayOfByte, k, 2);
    k += 2;
    System.arraycopy(Encoding.getUnicode().a(zs.a(localStringBuilder)), 0, arrayOfByte, k, localStringBuilder.length() * 2);
    k += localStringBuilder.length() * 2;
    int m = 0;
    for (int n = 0; n < this.c.getCount(); n++)
    {
      zavy localzavy = this.c.a(n);
      System.arraycopy(zc.a(m), 0, arrayOfByte, k, 2);
      System.arraycopy(zc.a(localzavy.a), 0, arrayOfByte, k + 2, 2);
      System.arraycopy(zc.a(localzavy.b + localzavy.a - 1), 0, arrayOfByte, k + 4, 2);
      m += localzavy.c.length();
      k += 6;
    }
    return arrayOfByte;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zawa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */