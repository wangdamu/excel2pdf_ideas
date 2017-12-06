package com.aspose.cells;

import com.aspose.cells.a.d.zav;
import com.aspose.cells.a.d.zb;
import com.aspose.cells.a.d.zhb;
import com.aspose.cells.a.d.zn;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;
import java.util.Iterator;

class zmx
{
  private static String a = "Cell:";
  private static String b = "Comment:";
  private float c;
  private float d;
  private Comment e;
  private Worksheet f;
  private double[] g;
  private float h;
  private float i;
  private float j;
  private float k;
  private int l;
  private int m = 0;
  private float n;
  private float o;
  private zb p;
  private int q = 0;
  private Font r;
  private float s;
  private float t;
  private float u;
  private float v;
  private float w;
  private float x;
  private float y;
  private com.aspose.cells.a.d.zf z;
  private float A;
  private double[] B;
  
  zmx(float paramFloat1, float paramFloat2, Comment paramComment, Worksheet paramWorksheet, double[] paramArrayOfDouble1, float paramFloat3, float paramFloat4, com.aspose.cells.a.d.zf paramzf, float paramFloat5, double[] paramArrayOfDouble2)
  {
    this.c = paramFloat1;
    this.d = paramFloat2;
    this.e = paramComment;
    this.f = paramWorksheet;
    this.g = paramArrayOfDouble1;
    this.h = paramFloat3;
    this.i = paramFloat4;
    this.z = paramzf;
    this.A = paramFloat5;
    this.B = paramArrayOfDouble2;
    d();
  }
  
  private void d()
  {
    this.r = this.f.d().getDefaultStyle().getFont();
    this.s = zbxp.a();
    int i1 = this.f.c().U() * 8 + zlp.a;
    int i2 = (i1 / 8 + 1) * 8;
    this.t = ((int)this.f.c().a / 20.0F * this.s / 72.0F);
    this.u = i2;
    this.v = (this.t / this.s * 72.0F * (float)this.g[1]);
    this.w = (this.u / this.s * 72.0F * (float)this.g[0]);
    this.x = (this.h / 72.0F * this.s);
    this.y = (this.i / 72.0F * this.s);
  }
  
  zb a(int paramInt)
    throws Exception
  {
    this.p = new zb();
    int i1 = 0;
    this.n = 0.0F;
    this.o = 0.0F;
    this.j = this.c;
    this.k = this.d;
    int[] arrayOfInt;
    zb localzb1;
    Object localObject;
    if ((paramInt == 0) || (paramInt == 2))
    {
      this.l = 8;
      arrayOfInt = new int[] { i1 };
      localzb1 = a(a, this.w, this.u * (float)this.g[0] + 100.0F, arrayOfInt);
      i1 = arrayOfInt[0];
      this.p.a(localzb1);
      this.j += this.n;
      localObject = this.f.getCells().get(this.e.getRow(), this.e.getColumn()).getName();
      this.l = 7;
      arrayOfInt[0] = i1;
      zb localzb2 = a((String)localObject, this.h - this.w, this.x - this.u * (float)this.g[0], arrayOfInt);
      i1 = arrayOfInt[0];
      this.p.a(localzb2);
      if (paramInt == 0) {
        return this.p;
      }
    }
    if ((paramInt == 1) || (paramInt == 2))
    {
      this.j = this.c;
      this.k += this.o;
      this.l = 8;
      arrayOfInt = new int[] { i1 };
      localzb1 = a(b, this.w, this.u * (float)this.g[0] + 100.0F, arrayOfInt);
      i1 = arrayOfInt[0];
      this.p.a(localzb1);
      this.j += this.n;
      this.l = 7;
      arrayOfInt[0] = i1;
      localObject = a(this.e.getNote(), this.h - this.w, this.x - this.u * (float)this.g[0], arrayOfInt);
      i1 = arrayOfInt[0];
      this.p.a((zn)localObject);
      this.q = (1 + i1);
      if (paramInt == 1) {
        return this.p;
      }
    }
    return this.p;
  }
  
  zb a()
    throws Exception
  {
    return a(2);
  }
  
  private zb a(String paramString, float paramFloat1, float paramFloat2, int[] paramArrayOfInt)
    throws Exception
  {
    zqb localzqb = new zqb();
    localzqb.a = paramString;
    localzqb.b = this.r;
    ArrayList localArrayList = new ArrayList();
    com.aspose.cells.b.a.a.zf.a(localArrayList, localzqb);
    a(localArrayList);
    zmy localzmy = new zmy(localArrayList, paramFloat2, this.t * (float)this.g[1], this.A, this.g, this.l, this.z);
    paramArrayOfInt[0] = localzmy.a();
    this.n = paramFloat1;
    this.o = (this.v * localzmy.a());
    zb localzb1 = new zb();
    localzmy.a(localzb1);
    zq localzq = a(localzmy.b(), localzmy.c());
    zb localzb2 = new zb();
    localzb2.a(new zi(1.0F, 0.0F, 0.0F, 1.0F, localzq.j(), localzq.m()));
    localzb2.a(localzb1);
    return localzb2;
  }
  
  private zq a(float paramFloat1, float paramFloat2)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    switch (this.m)
    {
    case 0: 
      f2 = this.k + this.o - paramFloat2 - (float)(1.0D * this.g[1]);
      break;
    default: 
      f2 = this.k + this.o - paramFloat2 - (float)(1.0D * this.g[1]);
    }
    switch (this.l)
    {
    case 7: 
      f1 = this.j + (float)(1.0D * this.g[0]);
      break;
    case 8: 
      f1 = this.j + (this.n - paramFloat1 - 1.0F);
      break;
    default: 
      f1 = this.j + (float)(1.0D * this.g[0]);
    }
    zq localzq = new zq(f1, f2, paramFloat1, paramFloat2);
    return localzq;
  }
  
  int b()
    throws Exception
  {
    if (this.q <= 0) {
      a();
    }
    return this.q;
  }
  
  int c()
    throws Exception
  {
    return b() - 1;
  }
  
  void a(zo paramzo)
  {
    this.c = paramzo.d();
    this.d = paramzo.e();
  }
  
  private void a(ArrayList paramArrayList)
    throws Exception
  {
    int i1 = 0;
    Font localFont1 = this.f.d().getDefaultStyle().q();
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      zqb localzqb = (zqb)localIterator.next();
      if (!zav.a().a(localzqb.b.getName(), localzqb.b.p(), localzqb.a))
      {
        Font localFont2 = new Font(this.f.d().getWorksheets(), null, false);
        localFont2.a(localzqb.b, null);
        String str = this.z.b().a(localzqb.b.getName(), localzqb.b.p(), false, localzqb.a);
        if (str != null)
        {
          localFont2.setName(str);
          localzqb.b = localFont2;
        }
        else
        {
          i1 = 1;
          break;
        }
      }
    }
    if (i1 != 0) {
      zavt.a(paramArrayList, this.f.d(), false, this.z.b());
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zmx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */