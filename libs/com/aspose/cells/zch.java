package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.za;
import com.aspose.cells.b.a.b.zj;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zch
  extends zcd
{
  private ArrayList a;
  
  zch()
  {
    c(233);
  }
  
  static byte[] a(int paramInt1, int paramInt2, int paramInt3)
  {
    byte[] arrayOfByte = new byte[20];
    arrayOfByte[0] = 9;
    arrayOfByte[2] = 1;
    System.arraycopy(zc.a(paramInt1), 0, arrayOfByte, 4, 4);
    int i = 8;
    arrayOfByte[i] = 12;
    i += 4;
    System.arraycopy(zc.a(paramInt2), 0, arrayOfByte, i, 2);
    System.arraycopy(zc.a(paramInt3), 0, arrayOfByte, i + 2, 2);
    i += 4;
    arrayOfByte[i] = 1;
    arrayOfByte[(i + 2)] = 24;
    i += 4;
    return arrayOfByte;
  }
  
  void a(byte[] paramArrayOfByte)
    throws Exception
  {
    com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh(paramArrayOfByte);
    za localza = new za(zj.a(localzh));
    int i = localza.i();
    int j = localza.h();
    int k = (i & 0xFFFF) * 3;
    int m = k % 4;
    if (m != 0)
    {
      m = 4 - m;
      k += m;
    }
    int n = k * (j & 0xFFFF) + 12;
    int i1 = 8212;
    int i2 = 20;
    Color localColor;
    if (n < i1)
    {
      this.b = new byte[n + 8];
      a((short)this.b.length);
      System.arraycopy(a(n, i, j), 0, this.b, 0, 20);
      for (int i3 = (j & 0xFFFF) - 1; i3 >= 0; i3--)
      {
        for (i4 = 0; i4 < (i & 0xFFFF); i4++)
        {
          localColor = localza.a(i4, i3);
          if (localColor.toArgb() == 0) {
            localColor = Color.getWhite();
          }
          this.b[(i2++)] = com.aspose.cells.a.c.zh.d(localColor);
          this.b[(i2++)] = com.aspose.cells.a.c.zh.c(localColor);
          this.b[(i2++)] = com.aspose.cells.a.c.zh.b(localColor);
        }
        if (m != 0) {
          for (i4 = 0; i4 < m; i4++) {
            this.b[(i2++)] = 0;
          }
        }
      }
      return;
    }
    this.b = a(n, i, j);
    b(20);
    this.a = new ArrayList();
    byte[] arrayOfByte = new byte[i1 - 12];
    n -= 12;
    i2 = 0;
    for (int i4 = (j & 0xFFFF) - 1; i4 >= 0; i4--)
    {
      for (int i5 = 0; i5 < (i & 0xFFFF); i5++)
      {
        localColor = localza.a(i5, i4);
        int i6 = localColor.toArgb();
        int i7 = i6 >> 24 & 0xFF;
        int i8 = i6 >> 16 & 0xFF;
        int i9 = i6 >> 8 & 0xFF;
        int i10 = i6 & 0xFF;
        if (i7 != 255)
        {
          double d = (255 - i7) / 255.0F;
          i8 += (int)((255 - i8) * d);
          i9 += (int)((255 - i9) * d);
          i10 += (int)((255 - i10) * d);
        }
        arrayOfByte[(i2++)] = ((byte)i10);
        if (i2 == arrayOfByte.length)
        {
          zf.a(this.a, arrayOfByte);
          n -= arrayOfByte.length;
          arrayOfByte = new byte[n > i1 ? i1 : n];
          i2 = 0;
        }
        arrayOfByte[(i2++)] = ((byte)i9);
        if (i2 == arrayOfByte.length)
        {
          zf.a(this.a, arrayOfByte);
          n -= arrayOfByte.length;
          arrayOfByte = new byte[n > i1 ? i1 : n];
          i2 = 0;
        }
        arrayOfByte[(i2++)] = ((byte)i8);
        if (i2 == arrayOfByte.length)
        {
          zf.a(this.a, arrayOfByte);
          n -= arrayOfByte.length;
          arrayOfByte = new byte[n > i1 ? i1 : n];
          i2 = 0;
        }
      }
      if (m != 0) {
        for (i5 = 0; i5 < m; i5++)
        {
          arrayOfByte[(i2++)] = 0;
          if (i2 == arrayOfByte.length)
          {
            zf.a(this.a, arrayOfByte);
            n -= arrayOfByte.length;
            arrayOfByte = new byte[n > i1 ? i1 : n];
            i2 = 0;
          }
        }
      }
    }
    zf.a(this.a, arrayOfByte);
  }
  
  void a(zrg paramzrg)
    throws Exception
  {
    paramzrg.a(f());
    if (this.a == null)
    {
      paramzrg.a(d());
      paramzrg.a(this.b);
    }
    else
    {
      byte[] arrayOfByte = (byte[])this.a.get(0);
      paramzrg.a((short)(d() + arrayOfByte.length));
      paramzrg.a(this.b);
      paramzrg.a(arrayOfByte);
      for (int i = 1; i < this.a.size(); i++)
      {
        paramzrg.a((short)60);
        arrayOfByte = (byte[])this.a.get(i);
        paramzrg.a((short)arrayOfByte.length);
        paramzrg.a(arrayOfByte);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */