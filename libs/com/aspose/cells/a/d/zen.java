package com.aspose.cells.a.d;

import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;

public class zen
  extends zel
{
  private zh b;
  private zcl[] c;
  private int d;
  private byte e;
  private int f;
  
  public zen(zm paramzm)
  {
    super(paramzm);
    this.a = paramzm;
    this.c = new zcl['᎝'];
    for (int i = 0; i < 5021; i++) {
      this.c[i] = new zcl();
    }
  }
  
  public void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws Exception
  {
    this.b = new zh(paramArrayOfByte, paramInt1, paramInt2);
    m();
    n();
    p();
  }
  
  private void m()
  {
    this.d = 0;
    this.e = Byte.MIN_VALUE;
    this.f = 9;
  }
  
  private void n()
  {
    for (int i = 0; i < this.c.length; i++) {
      this.c[i].a(-1);
    }
  }
  
  private void o()
    throws Exception
  {
    if ((this.e & 0xFF) != 128) {
      this.a.a((byte)this.d);
    }
  }
  
  private void a(boolean paramBoolean)
    throws Exception
  {
    if (paramBoolean) {
      this.d |= this.e;
    }
    this.e = ((byte)((this.e & 0xFF) >> 1));
    if (this.e == 0)
    {
      this.a.a((byte)this.d);
      this.d = 0;
      this.e = Byte.MIN_VALUE;
    }
  }
  
  private void a(int paramInt)
    throws Exception
  {
    int i = 1 << this.f - 1;
    while (i != 0)
    {
      a((i & paramInt) != 0);
      i >>= 1;
    }
  }
  
  private void p()
    throws Exception
  {
    int k = 258;
    int j = this.b.c();
    if (j == -1) {
      j = 257;
    }
    a(256);
    int i;
    while ((i = this.b.c()) != -1)
    {
      int m = a(j, i);
      if (k == 1 << this.f) {
        if (this.f < 12)
        {
          this.f += 1;
        }
        else
        {
          k = 258;
          n();
          a(256);
          this.f = 9;
        }
      }
      if (this.c[m].a() != -1)
      {
        j = this.c[m].a();
      }
      else
      {
        this.c[m].a(k++);
        this.c[m].b(j);
        this.c[m].a((byte)i);
        a(j);
        j = i;
      }
    }
    a(j);
    a(257);
    o();
  }
  
  private int a(int paramInt1, int paramInt2)
  {
    int i = paramInt2 << this.f - 8 ^ paramInt1;
    int j = i == 0 ? 1 : 5021 - i;
    for (;;)
    {
      zcl localzcl = this.c[i];
      if ((localzcl.a() == -1) || ((localzcl.b() == paramInt1) && (localzcl.c() == (byte)paramInt2))) {
        return i;
      }
      i -= j;
      if (i < 0) {
        i += 5021;
      }
    }
  }
  
  public void a()
    throws Exception
  {
    super.a();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */