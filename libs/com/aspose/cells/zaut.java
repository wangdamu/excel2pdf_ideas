package com.aspose.cells;

import com.aspose.cells.a.d.zm;
import com.aspose.cells.a.d.zp;
import com.aspose.cells.a.d.zq;
import com.aspose.cells.a.d.zu;
import com.aspose.cells.b.a.b.zo;
import java.util.HashMap;

class zaut
{
  private HashMap a;
  private int b;
  private int c;
  private int d;
  private int e;
  private boolean f = false;
  private zdm g = null;
  private zdm h = null;
  private zp i = null;
  private zq j;
  private zu k;
  private int l = 0;
  private int m = 0;
  
  zaut(HashMap paramHashMap, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    this.a = paramHashMap;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = paramInt4;
    this.f = paramBoolean;
  }
  
  void a()
  {
    this.m = 0;
    this.i = null;
    int i1;
    int i2;
    for (int n = this.b; n <= this.c + 1; n++) {
      for (i1 = this.d; i1 <= this.e; i1++)
      {
        i2 = (n << 11) + (i1 << 1) + 0;
        a(i2, i1, this.d, this.e, true);
      }
    }
    a(true);
    this.m = 0;
    this.i = null;
    for (n = this.d; n <= this.e + 1; n++) {
      for (i1 = this.b; i1 <= this.c; i1++)
      {
        i2 = (i1 << 11) + (n << 1) + 1;
        a(i2, i1, this.b, this.c, false);
      }
    }
    a(false);
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    zdm localzdm = (zdm)this.a.get(Integer.valueOf(paramInt1));
    if ((localzdm != null) && (localzdm.a() != 6) && (localzdm.c() != null) && ((localzdm.c() instanceof zm)))
    {
      if (this.m == 0)
      {
        this.g = localzdm;
        this.h = localzdm;
        this.l = paramInt1;
        this.m += 1;
        if (paramInt2 == paramInt4) {
          b(paramBoolean);
        }
      }
      else if ((localzdm.a() == this.g.a()) && (localzdm.b().toArgb() == this.g.b().toArgb()))
      {
        this.m += 1;
        this.h = localzdm;
        this.a.put(Integer.valueOf(paramInt1), null);
        if (paramInt2 == paramInt3) {
          this.g = localzdm;
        }
        if (paramInt2 == paramInt4) {
          b(paramBoolean);
        }
      }
      else
      {
        a(paramBoolean);
      }
    }
    else {
      a(paramBoolean);
    }
  }
  
  private void a(boolean paramBoolean)
  {
    if (this.m > 1)
    {
      b(paramBoolean);
      this.a.put(Integer.valueOf(this.l), new zdm(this.i, this.g.a(), this.g.b()));
    }
    this.m = 0;
    this.i = null;
  }
  
  private void b(boolean paramBoolean)
  {
    zm localzm1 = (zm)this.g.c();
    zm localzm2 = (zm)this.h.c();
    if (this.i == null) {
      this.i = new zp(localzm1.c);
    }
    if ((paramBoolean) && (this.f))
    {
      this.j = new zq(new zo(localzm1.b.d(), localzm1.b.e()));
      this.k = new zu(new float[] { localzm2.a.d(), localzm2.a.e() });
    }
    else
    {
      this.j = new zq(new zo(localzm1.a.d(), localzm1.a.e()));
      this.k = new zu(new float[] { localzm2.b.d(), localzm2.b.e() });
    }
    this.j.a(this.k);
    this.i.a(this.j);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaut.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */