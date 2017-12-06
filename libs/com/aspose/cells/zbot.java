package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.g.a.ze;
import java.util.ArrayList;

class zbot
  extends zcd
{
  private long c = 0L;
  private int d = 0;
  private long e;
  private ArrayList f;
  int a;
  private ze g;
  private zajl h;
  private zatv i;
  
  zbot()
  {
    c(252);
    b(8);
    this.f = new ArrayList();
    this.g = new ze("[^\\x00-\\x7f]+");
  }
  
  void a(zajl paramzajl)
  {
    this.h = paramzajl;
    this.d = paramzajl.c();
    this.c = paramzajl.b();
    this.e = Math.max(this.d / 128 + 1, 8);
  }
  
  void b(zrg paramzrg)
    throws Exception
  {
    System.arraycopy(com.aspose.cells.b.a.zc.a(this.a - 4), 0, this.b, 2, 2);
    paramzrg.a(this.b, this.a);
  }
  
  void a(zrg paramzrg)
    throws Exception
  {
    this.b = new byte['․'];
    this.b[0] = -4;
    this.a = 4;
    System.arraycopy(com.aspose.cells.b.a.zc.a(this.c), 0, this.b, this.a, 4);
    System.arraycopy(com.aspose.cells.b.a.zc.a(this.d), 0, this.b, this.a + 4, 4);
    this.a += 8;
    for (int j = 0; j < this.d; j++)
    {
      zbbj localzbbj = this.h.a(j);
      boolean bool = j % (this.e & 0xFFFFFFFF) == 0L;
      a(localzbbj, bool, paramzrg);
      if (bool) {
        zf.a(this.f, this.i);
      }
    }
    b(paramzrg);
    this.b = null;
    this.h = null;
    ztb localztb = new ztb();
    localztb.a(paramzrg, this.f);
    this.f.clear();
    this.f = null;
    this.a = (this.d = 0);
    this.c = 0L;
  }
  
  void a(zbbj paramzbbj, boolean paramBoolean, zrg paramzrg)
    throws Exception
  {
    int j = 3;
    byte[] arrayOfByte1 = null;
    byte[] arrayOfByte2 = null;
    int k = 1;
    int m = 0;
    int n = 1;
    byte[] arrayOfByte3;
    Object localObject;
    if (paramzbbj == null)
    {
      arrayOfByte3 = new byte[] { 114 };
    }
    else
    {
      String str = paramzbbj.c;
      if (str.length() > 32767) {
        str = str.substring(0, 32767);
      }
      n = str.length();
      if (paramzbbj.g())
      {
        localObject = (zawb)paramzbbj;
        arrayOfByte1 = ((zawb)localObject).d();
        if (arrayOfByte1 != null)
        {
          j += 4;
          m = (byte)(m | 0x4);
        }
        if (paramzbbj.f())
        {
          m = (byte)(m | 0x8);
          j += 2;
          arrayOfByte2 = ((zawb)localObject).f;
        }
      }
      else if (paramzbbj.f())
      {
        m = (byte)(m | 0x8);
        j += 2;
        arrayOfByte2 = ((zbdd)paramzbbj).f;
      }
      localObject = this.g.a(str);
      if (((com.aspose.cells.b.a.g.a.zc)localObject).c())
      {
        arrayOfByte3 = Encoding.getUnicode().a(str);
        k = 0;
        m = (byte)(m | 0x1);
      }
      else
      {
        arrayOfByte3 = Encoding.getASCII().a(str);
      }
    }
    if (this.a + j >= this.b.length)
    {
      b(paramzrg);
      this.b[0] = 60;
      this.a = 4;
    }
    if (paramBoolean)
    {
      this.i = new zatv();
      this.i.a = (paramzrg.b() + this.a);
      this.i.b = this.a;
    }
    int i1;
    if (arrayOfByte1 != null)
    {
      i1 = 3 + arrayOfByte3.length;
      if (arrayOfByte2 != null) {
        i1 += 2 + arrayOfByte2.length;
      }
      i1 += 4 + arrayOfByte1.length;
      if (this.a + i1 > this.b.length)
      {
        b(paramzrg);
        this.b[0] = 60;
        this.a = 4;
      }
    }
    System.arraycopy(com.aspose.cells.b.a.zc.a(n), 0, this.b, this.a, 2);
    this.a += 2;
    this.b[(this.a++)] = m;
    if (arrayOfByte2 != null)
    {
      System.arraycopy(com.aspose.cells.b.a.zc.a(arrayOfByte2.length / 4), 0, this.b, this.a, 2);
      this.a += 2;
    }
    if (arrayOfByte1 != null)
    {
      System.arraycopy(com.aspose.cells.b.a.zc.a(arrayOfByte1.length), 0, this.b, this.a, 4);
      this.a += 4;
    }
    if (arrayOfByte3.length + this.a > this.b.length)
    {
      if (k != 0)
      {
        i1 = this.b.length - this.a;
        System.arraycopy(arrayOfByte3, 0, this.b, this.a, i1);
        this.a += i1;
        b(paramzrg);
        this.b[0] = 60;
        this.a = 4;
        localObject = i1;
        i1 = arrayOfByte3.length - i1;
        while (i1 + 1 > 8224)
        {
          this.b[4] = 0;
          System.arraycopy(arrayOfByte3, localObject, this.b, 5, 8223);
          i1 -= 8223;
          localObject += 8223;
          this.a = 8228;
          b(paramzrg);
        }
        this.b[4] = 0;
        System.arraycopy(arrayOfByte3, localObject, this.b, 5, i1);
        this.a = (5 + i1);
      }
      else
      {
        i1 = this.b.length - this.a;
        if (i1 % 2 == 1) {
          i1--;
        }
        System.arraycopy(arrayOfByte3, 0, this.b, this.a, i1);
        this.a += i1;
        b(paramzrg);
        this.b[0] = 60;
        this.a = 4;
        localObject = i1;
        i1 = arrayOfByte3.length - i1;
        while (i1 + 2 > 8224)
        {
          this.b[4] = 1;
          System.arraycopy(arrayOfByte3, localObject, this.b, 5, 8222);
          i1 -= 8222;
          localObject += 8222;
          this.a = 8227;
          b(paramzrg);
        }
        this.b[4] = 1;
        System.arraycopy(arrayOfByte3, localObject, this.b, 5, i1);
        this.a = (5 + i1);
      }
    }
    else
    {
      System.arraycopy(arrayOfByte3, 0, this.b, this.a, arrayOfByte3.length);
      this.a += arrayOfByte3.length;
    }
    if (arrayOfByte2 != null) {
      if (arrayOfByte2.length + this.a > this.b.length)
      {
        i1 = (this.b.length - this.a) / 4 * 4;
        if (i1 != 0)
        {
          System.arraycopy(arrayOfByte2, 0, this.b, this.a, i1);
          this.a += i1;
          b(paramzrg);
          this.b[0] = 60;
          System.arraycopy(arrayOfByte2, i1, this.b, 4, arrayOfByte2.length - i1);
          this.a = (arrayOfByte2.length - i1 + 4);
        }
        else
        {
          b(paramzrg);
          this.b[0] = 60;
          System.arraycopy(arrayOfByte2, 0, this.b, 4, arrayOfByte2.length);
          this.a = (arrayOfByte2.length + 4);
        }
      }
      else
      {
        System.arraycopy(arrayOfByte2, 0, this.b, this.a, arrayOfByte2.length);
        this.a += arrayOfByte2.length;
      }
    }
    if (arrayOfByte1 != null) {
      if (arrayOfByte1.length + this.a > this.b.length)
      {
        i1 = this.b.length - this.a;
        System.arraycopy(arrayOfByte1, 0, this.b, this.a, i1);
        this.a += i1;
        b(paramzrg);
        this.b[0] = 60;
        this.a = 4;
        localObject = i1;
        i1 = arrayOfByte1.length - i1;
        while (i1 > 8224)
        {
          System.arraycopy(arrayOfByte1, localObject, this.b, 4, 8224);
          i1 -= 8224;
          localObject += 8224;
          this.a = 8228;
          b(paramzrg);
        }
        System.arraycopy(arrayOfByte1, localObject, this.b, 4, i1);
        this.a = (4 + i1);
      }
      else
      {
        System.arraycopy(arrayOfByte1, 0, this.b, this.a, arrayOfByte1.length);
        this.a += arrayOfByte1.length;
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbot.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */