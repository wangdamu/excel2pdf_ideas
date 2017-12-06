package com.aspose.cells.a.d;

import com.aspose.cells.Color;
import com.aspose.cells.b.a.b.zi;
import com.aspose.cells.b.a.b.zj;

public class zdv
  extends zex
{
  private com.aspose.cells.b.a.b.za d;
  private int e;
  private boolean f = false;
  private boolean g = false;
  
  private zdv() {}
  
  public zdv(com.aspose.cells.b.a.b.za paramza, boolean paramBoolean)
    throws Exception
  {
    this.d = paramza;
    this.g = paramBoolean;
    o();
    p();
  }
  
  private void o()
  {
    com.aspose.cells.b.a.b.za localza = null;
    if ((this.d.c() != 2498570) && (this.d.c() != 139273))
    {
      localza = zcc.a(this.d.i(), this.d.h());
      zi localzi = zi.a(localza);
      localzi.a(this.d, 0, 0);
      this.d = localza;
    }
    this.e = this.d.c();
  }
  
  private void p()
    throws Exception
  {
    if (!i()) {
      q();
    } else {
      r();
    }
  }
  
  private void q()
    throws Exception
  {
    int i = this.d.i() * this.d.h() * 3;
    this.a = new byte[i];
    int j = this.d.i() * this.d.h();
    this.b = new byte[j];
    this.c = new Color[0];
    byte[] arrayOfByte = new byte[0];
    int k = 0;
    byte[][] arrayOfByte1 = { arrayOfByte };
    int[] arrayOfInt = { k };
    zac.a(this.d, arrayOfByte1, arrayOfInt);
    arrayOfByte = arrayOfByte1[0];
    k = arrayOfInt[0];
    int m = k * this.d.h();
    int n = k < 0 ? this.a.length - this.d.i() * 3 : 0;
    int i1 = k < 0 ? this.b.length - this.d.i() * 1 : 0;
    int i2 = 0;
    this.f = false;
    int i3 = this.d.c() == 139273 ? 1 : 0;
    for (int i4 = 0; i4 < this.d.h(); i4++) {
      for (int i5 = 0; i5 < this.d.i(); i5++)
      {
        this.a[(n + 2)] = arrayOfByte[(i2++)];
        this.a[(n + 1)] = arrayOfByte[(i2++)];
        this.a[(n + 0)] = arrayOfByte[(i2++)];
        if (i3 != 0)
        {
          i2++;
        }
        else
        {
          int i6 = arrayOfByte[(i2++)];
          this.b[(i1++)] = i6;
          if ((i6 & 0xFF) < 255) {
            if (this.g)
            {
              double d1 = i6 / 255.0D;
              double d2 = 1.0D - d1;
              this.a[(n + 2)] = ((byte)(int)Math.round((this.a[(n + 2)] & 0xFF) * d1 + 255.0D * d2));
              this.a[(n + 1)] = ((byte)(int)Math.round((this.a[(n + 1)] & 0xFF) * d1 + 255.0D * d2));
              this.a[(n + 0)] = ((byte)(int)Math.round((this.a[(n + 0)] & 0xFF) * d1 + 255.0D * d2));
            }
            else
            {
              this.f = true;
            }
          }
        }
        n += 3;
      }
    }
  }
  
  private void r()
    throws Exception
  {
    int i = (int)Math.ceil(this.d.i() * d() / 8.0F);
    int j = i * this.d.h();
    this.a = new byte[j];
    int k = h() ? this.d.i() * this.d.h() * 1 : 0;
    this.b = new byte[k];
    this.c = this.d.l().a();
    int m = 0;
    int n = 0;
    Object localObject = null;
    int i1 = 0;
    byte[][] arrayOfByte = { localObject };
    int[] arrayOfInt = { i1 };
    zac.a(this.d, arrayOfByte, arrayOfInt);
    localObject = arrayOfByte[0];
    i1 = arrayOfInt[0];
    int i2 = i1 * this.d.h();
    int i3 = i1 - i;
    int i4;
    int i5;
    if (!h())
    {
      for (i4 = 0; i4 < this.d.h(); i4++)
      {
        for (i5 = 0; i5 < i; i5++) {
          this.a[(m++)] = localObject[(n++)];
        }
        n += i3;
      }
    }
    else
    {
      i4 = 0;
      i5 = (1 << d()) - 1;
      for (int i6 = 0; i6 < this.d.h(); i6++)
      {
        for (int i7 = 0; i7 < i; i7++)
        {
          this.a[m] = localObject[(n++)];
          int i8 = 8 - d();
          while (i8 > 0)
          {
            int i9 = (this.a[m] & 0xFF) >> i8 & i5;
            Color localColor = this.c[i9];
            this.b[(i4++)] = localColor.getA();
            if ((localColor.getA() & 0xFF) < 255) {
              this.f = true;
            }
            i8 -= d();
          }
          m++;
        }
        n += i3;
      }
    }
  }
  
  public zj a()
  {
    return this.d;
  }
  
  public int b()
  {
    return this.d.i();
  }
  
  public int c()
  {
    return this.d.h();
  }
  
  public int d()
    throws Exception
  {
    switch (this.e)
    {
    case 196865: 
      return 1;
    case 197634: 
      return 4;
    case 137224: 
    case 139273: 
    case 198659: 
    case 925707: 
    case 2498570: 
      return 8;
    case 1060876: 
    case 1851406: 
    case 3424269: 
      return 16;
    }
    throw new Exception("Unexpected pixel format.");
  }
  
  public zdy e()
  {
    return i() ? zdy.c() : zdy.b();
  }
  
  public boolean f()
  {
    return this.f;
  }
  
  public boolean g()
  {
    return (j() < 4096) && (!this.f);
  }
  
  public boolean h()
  {
    return (zj.b(this.e)) || ((i()) && ((this.d.l().b() & 0x1) == 1));
  }
  
  public boolean i()
  {
    return (this.e & 0x10000) == 65536;
  }
  
  public int j()
  {
    return this.d.i() * this.d.h() * zj.a(this.e) / 8;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zdv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */