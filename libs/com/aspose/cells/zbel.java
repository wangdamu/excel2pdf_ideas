package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zbel
{
  private ArrayList d;
  private WorksheetCollection e;
  byte[] a = null;
  int b = 0;
  int c = 8;
  
  zbel(ArrayList paramArrayList, WorksheetCollection paramWorksheetCollection)
  {
    this.d = paramArrayList;
    this.e = paramWorksheetCollection;
  }
  
  void a()
  {
    try
    {
      this.a = ((byte[])this.d.get(0));
      int i = zc.a(this.a, 4);
      zajl localzajl = this.e.g;
      for (int j = 0; j < i; j++)
      {
        zbbj localzbbj = b();
        localzbbj.e = j;
        localzajl.b(localzbbj);
      }
    }
    catch (Exception localException)
    {
      throw new CellsException(6, "Invalid string in the file.");
    }
  }
  
  zbbj a(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    this.b = paramInt1;
    this.a = paramArrayOfByte;
    this.c = paramInt2;
    return b();
  }
  
  zbbj b()
  {
    byte[] arrayOfByte1 = null;
    byte[] arrayOfByte2 = null;
    if (this.c >= this.a.length)
    {
      this.b += 1;
      this.c = 0;
      this.a = ((byte[])this.d.get(this.b));
    }
    int i = zc.e(this.a, this.c) & 0xFFFF;
    int j = this.a[(this.c + 2)] & 0xFF & 0xD;
    this.c += 3;
    int k = (j & 0x1) == 0 ? 1 : 0;
    int m = 0;
    int n = 0;
    if ((j & 0x8) != 0)
    {
      n = (zc.e(this.a, this.c) & 0xFFFF) * 4;
      this.c += 2;
    }
    if ((j & 0x4) != 0)
    {
      m = zc.a(this.a, this.c);
      this.c += 4;
    }
    Object localObject;
    if (i == 0)
    {
      localObject = new zbbj("", 0);
      this.c += m + n;
      return (zbbj)localObject;
    }
    byte[] arrayOfByte3 = new byte[i * 2];
    int i1 = 0;
    int i2;
    while (i > 0)
    {
      i2 = this.a.length - this.c;
      int i3;
      if (k != 0)
      {
        if (i2 >= i)
        {
          for (i3 = 0; i3 < i; i3++) {
            arrayOfByte3[(i1 + 2 * i3)] = this.a[(i3 + this.c)];
          }
          this.c += i;
          i = 0;
        }
        else
        {
          for (i3 = 0; i3 < i2; i3++) {
            arrayOfByte3[(i1 + 2 * i3)] = this.a[(i3 + this.c)];
          }
          i -= i2;
          i1 += i2 * 2;
          this.b += 1;
          this.a = ((byte[])this.d.get(this.b));
          k = (this.a[0] & 0xFF & 0x1) == 0 ? 1 : 0;
          this.c = 1;
        }
      }
      else
      {
        i3 = i + i;
        if (i2 >= i3)
        {
          System.arraycopy(this.a, this.c, arrayOfByte3, i1, i3);
          this.c += i3;
          i = 0;
        }
        else
        {
          System.arraycopy(this.a, this.c, arrayOfByte3, i1, i2);
          i -= i2 / 2;
          i1 += i2;
          this.b += 1;
          this.a = ((byte[])this.d.get(this.b));
          k = (this.a[0] & 0xFF & 0x1) == 0 ? 1 : 0;
          this.c = 1;
        }
      }
    }
    String str = Encoding.getUnicode().a(arrayOfByte3);
    if ((n == 0) && (m == 0))
    {
      localObject = new zbbj(str, 0);
    }
    else
    {
      arrayOfByte1 = arrayOfByte2 = null;
      if (n > 0)
      {
        arrayOfByte1 = new byte[n];
        i1 = 0;
        while (n > 0)
        {
          i2 = this.a.length - this.c;
          if (i2 >= n)
          {
            System.arraycopy(this.a, this.c, arrayOfByte1, i1, n);
            this.c += n;
            n = 0;
          }
          else
          {
            System.arraycopy(this.a, this.c, arrayOfByte1, i1, i2);
            n -= i2;
            i1 += i2;
            this.b += 1;
            this.a = ((byte[])this.d.get(this.b));
            this.c = 0;
          }
        }
      }
      if (m > 0)
      {
        arrayOfByte2 = new byte[m];
        i1 = 0;
        while (m > 0)
        {
          i2 = this.a.length - this.c;
          if (i2 >= m)
          {
            System.arraycopy(this.a, this.c, arrayOfByte2, i1, m);
            this.c += m;
            m = 0;
          }
          else
          {
            System.arraycopy(this.a, this.c, arrayOfByte2, i1, i2);
            m -= i2;
            i1 += i2;
            this.b += 1;
            this.a = ((byte[])this.d.get(this.b));
            this.c = 0;
          }
        }
      }
      if (arrayOfByte2 != null) {
        localObject = new zawb(str, arrayOfByte1, arrayOfByte2);
      } else if (arrayOfByte1 != null) {
        localObject = new zbdd(str, arrayOfByte1, 0);
      } else {
        localObject = new zbbj(str, 0);
      }
    }
    return (zbbj)localObject;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */