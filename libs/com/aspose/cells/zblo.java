package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zblo
  extends zcp
{
  private zq l = zq.c();
  
  zblo(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    float f1 = paramzq.f();
    float f2 = paramzq.g();
    float f3 = paramzq.h();
    float f4 = paramzq.i();
    float f5 = 0.0F;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0)
      {
        if (f3 > f4)
        {
          f6 = Math.min(f3, f4);
          f5 = f6 * com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F;
        }
        else
        {
          f6 = Math.max(f3, f4);
          f5 = f6 * com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F;
        }
      }
      else if (f3 > f4)
      {
        f6 = Math.min(f3, f4);
        f5 = f6 * 42533.0F / 100000.0F;
      }
      else
      {
        f6 = Math.max(f3, f4);
        f5 = f6 * 42533.0F / 100000.0F;
      }
    }
    else if (f3 > f4)
    {
      f6 = Math.min(f3, f4);
      f5 = f6 * 42533.0F / 100000.0F;
    }
    else
    {
      f6 = Math.max(f3, f4);
      f5 = f6 * 42533.0F / 100000.0F;
    }
    f3 = (float)(f3 / Math.cos(zbkt.a(18.0D)));
    float f6 = paramzq.i() / 2.0F - f5;
    float f7 = f4 - 2.0F * f6;
    float f8 = f7 * f3 / f4;
    f1 = (float)(f1 - f3 * (1.0D - Math.cos(zbkt.a(18.0D))) / 2.0D);
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    zo[] arrayOfzo1 = new zo[3];
    zo[] arrayOfzo2 = new zo[3];
    for (int i = 0; i < 10; i++)
    {
      arrayOfzo1[0] = new zo((int)(f1 + f3 / 2.0F + Math.cos(zbkt.a(18 + i * 36)) * f3 / 2.0D), (int)(f2 + f4 / 2.0F + -Math.sin(zbkt.a(18 + i * 36)) * f4 / 2.0D));
      arrayOfzo1[2] = new zo((int)(f1 + f3 / 2.0F + Math.cos(zbkt.a(18 + (i + 1) * 36)) * f3 / 2.0D), (int)(f2 + f4 / 2.0F + -Math.sin(zbkt.a(18 + (i + 1) * 36)) * f4 / 2.0D));
      arrayOfzo1[1] = new zo((int)(f1 + f3 / 2.0F + Math.cos(zbkt.a(36 + i * 36)) * f8 / 2.0D), (int)(f2 + f4 / 2.0F + -Math.sin(zbkt.a(36 + i * 36)) * f7 / 2.0D));
      localze.a(arrayOfzo1[0], arrayOfzo1[1]);
      localze.a(arrayOfzo1[1], arrayOfzo1[2]);
      if (i == 0) {
        arrayOfzo2[0] = new zo(arrayOfzo1[1].d(), arrayOfzo1[1].e());
      } else if (i == 3) {
        arrayOfzo2[1] = new zo(arrayOfzo1[1].d(), arrayOfzo1[1].e());
      } else if (i == 5) {
        arrayOfzo2[2] = new zo(arrayOfzo1[1].d(), arrayOfzo1[1].e());
      }
    }
    this.l.a(arrayOfzo2[1].d());
    this.l.b(arrayOfzo2[1].e());
    this.l.c(arrayOfzo2[0].d() - arrayOfzo2[1].d());
    this.l.d(arrayOfzo2[2].e() - arrayOfzo2[1].e());
    return localze;
  }
  
  void a()
    throws Exception
  {
    super.c(this.l);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zblo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */