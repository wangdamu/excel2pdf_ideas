package com.aspose.cells.a.d;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import java.util.ArrayList;

public class zbi
{
  private zz b;
  private boolean c;
  private boolean d;
  private zbt e;
  public zgl a;
  private int[] f;
  private ArrayList g;
  private zh h;
  private zh i;
  private zh j;
  private int k = 0;
  
  public zh a()
  {
    return this.h;
  }
  
  public zh b()
  {
    return this.i;
  }
  
  public zh c()
  {
    return this.j;
  }
  
  public int d()
  {
    return this.k;
  }
  
  public zbi(zz paramzz, boolean paramBoolean1, boolean paramBoolean2, zbt paramzbt)
  {
    this.b = paramzz;
    this.d = paramBoolean1;
    this.c = paramBoolean2;
    this.e = paramzbt;
  }
  
  public int a(zha paramzha1, zha paramzha2, zgl paramzgl)
    throws Exception
  {
    a(paramzha1);
    a(paramzha2, paramzgl);
    e();
    return this.g.size() - 1;
  }
  
  private void a(zha paramzha)
    throws Exception
  {
    this.b.a().b(paramzha.c);
    int m;
    int n;
    if (this.d)
    {
      m = paramzha.d / 2;
      this.f = new int[m];
      for (n = 0; n < m; n++) {
        this.f[n] = ((this.b.e() & 0xFFFF) * 2);
      }
    }
    else
    {
      m = paramzha.d / 4;
      this.f = new int[m];
      for (n = 0; n < m; n++) {
        this.f[n] = this.b.b();
      }
    }
  }
  
  private void e()
    throws Exception
  {
    this.h = new zh();
    zaa localzaa = new zaa(this.h);
    int m;
    if (this.d) {
      for (m = 0; m < this.g.size(); m++) {
        localzaa.c(((Integer)this.g.get(m)).intValue() / 2);
      }
    } else {
      for (m = 0; m < this.g.size(); m++) {
        localzaa.a(((Integer)this.g.get(m)).intValue());
      }
    }
    localzaa.b();
  }
  
  private void a(zha paramzha, zgl paramzgl)
    throws Exception
  {
    this.a = new zgl();
    for (int m = 0; m < paramzgl.a(); m++)
    {
      int n = paramzgl.d(m);
      i1 = ((Integer)paramzgl.c(m)).intValue();
      if (!this.a.b(i1)) {
        this.a.a(i1, Integer.valueOf(n));
      }
    }
    this.g = new ArrayList();
    this.i = new zh();
    zaa localzaa1 = new zaa(this.i);
    this.j = new zh();
    zaa localzaa2 = new zaa(this.j);
    int i1 = 0;
    int i2 = -1;
    int i4;
    while (i1 < this.a.a())
    {
      i3 = ((Integer)this.a.c(i1)).intValue();
      if (i3 >= this.f.length - 1)
      {
        i1++;
      }
      else
      {
        i4 = ((Integer)paramzgl.e(i3)).intValue();
        int i6 = (int)localzaa1.a().i() + 3 & 0xFFFFFFFC;
        if ((this.c) && (i2 >= 0))
        {
          localzbs2 = new zbs(0, (short)0);
          for (i7 = i2 + 1; i7 < i4; i7++)
          {
            zf.a(this.g, Integer.valueOf(i6));
            localzbs2.a(localzaa2);
            this.k += 1;
          }
        }
        zf.a(this.g, Integer.valueOf(i6));
        zbs localzbs2 = this.e.a(i3);
        localzbs2.a(localzaa2);
        this.k += 1;
        i2 = i4;
        localzaa1.a(new byte[4], 0, i6 - (int)localzaa1.a().i());
        this.b.a().b(paramzha.c + this.f[i3]);
        int i7 = this.f[(i3 + 1)] - this.f[i3];
        int i8 = i7;
        if (i7 > 0)
        {
          int i9 = this.b.d();
          byte[] arrayOfByte1;
          if (i9 <= 0)
          {
            localzaa1.b(i9);
            arrayOfByte1 = this.b.a(8);
            localzaa1.a(arrayOfByte1, 0, arrayOfByte1.length);
            i8 -= arrayOfByte1.length;
            for (;;)
            {
              int i10 = this.b.e() & 0xFFFF;
              localzaa1.c(i10);
              i8 -= 2;
              int i11 = this.b.e() & 0xFFFF;
              Object localObject = paramzgl.e(i11);
              int i12;
              if (localObject != null)
              {
                i12 = ((Integer)localObject).intValue();
              }
              else
              {
                int i13 = this.a.d(this.a.a() - 1);
                i12 = i13 + 1;
                paramzgl.a(i11, Integer.valueOf(i12));
                this.a.a(i12, Integer.valueOf(i11));
              }
              byte[] arrayOfByte2 = this.b.a(a(i10));
              localzaa1.c(i12);
              i8 -= 2;
              localzaa1.a(arrayOfByte2, 0, arrayOfByte2.length);
              i8 -= arrayOfByte2.length;
              if ((i10 & 0x20) == 0)
              {
                if ((i10 & 0x100) != 0)
                {
                  int i14 = this.b.e() & 0xFFFF;
                  byte[] arrayOfByte3 = this.b.a(i14);
                  localzaa1.c(i14);
                  i8 -= 2;
                  localzaa1.a(arrayOfByte3, 0, arrayOfByte3.length);
                  i8 -= arrayOfByte3.length;
                }
                if (i8 <= 0) {
                  break;
                }
                this.b.a(i8);
                localzaa1.a(new byte[20], 0, i8);
                break;
              }
            }
          }
          else
          {
            this.b.a().b(this.b.a().i() - 2L);
            arrayOfByte1 = this.b.a(i7);
            localzaa1.a(arrayOfByte1, 0, arrayOfByte1.length);
          }
        }
        i1++;
      }
    }
    int i3 = (int)localzaa1.a().i() + 3 & 0xFFFFFFFC;
    localzaa1.a(new byte[4], 0, i3 - (int)localzaa1.a().i());
    localzaa1.b();
    if (this.c)
    {
      for (i4 = i2 + 1; i4 < this.f.length - 1; i4++) {
        zf.a(this.g, Integer.valueOf(i3));
      }
      if (i2 + 1 < this.f.length - 1)
      {
        zbs localzbs1 = new zbs(0, (short)0);
        localzbs1.a(localzaa2);
        this.k += 1;
      }
      for (int i5 = i2 + 2; i5 < this.f.length - 1; i5++) {
        localzaa2.b(0);
      }
    }
    zf.a(this.g, Integer.valueOf(i3));
    localzaa2.b();
  }
  
  private static int a(int paramInt)
  {
    int m;
    if ((paramInt & 0x1) != 0) {
      m = 4;
    } else {
      m = 2;
    }
    if ((paramInt & 0x8) != 0) {
      m += 2;
    } else if ((paramInt & 0x40) != 0) {
      m += 4;
    } else if ((paramInt & 0x80) != 0) {
      m += 8;
    }
    return m;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zbi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */