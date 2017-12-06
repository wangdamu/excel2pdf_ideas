package com.aspose.cells;

import com.aspose.cells.a.c.zn;
import com.aspose.cells.a.d.zr;
import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.a.zh;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zu;
import java.util.ArrayList;
import java.util.Collections;

class zads
{
  private int a = 0;
  private float b = 0.0F;
  private zadw c = new zadw();
  private int d = 4;
  private boolean e = true;
  
  public boolean a()
  {
    return this.e;
  }
  
  public void a(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }
  
  public int b()
  {
    return this.a;
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public float c()
  {
    return this.b;
  }
  
  public void a(float paramFloat)
  {
    this.b = paramFloat;
  }
  
  public zadw d()
  {
    return this.c;
  }
  
  public int e()
  {
    return this.d;
  }
  
  public void b(int paramInt)
  {
    this.d = paramInt;
  }
  
  com.aspose.cells.b.a.b.zc a(com.aspose.cells.b.a.b.a.ze paramze, zs paramzs, boolean paramBoolean, float paramFloat)
  {
    if (paramzs != null) {
      paramze.a(paramzs.r());
    }
    zq localzq = zn.a(paramze);
    if ((localzq.h() <= 0.0F) || (localzq.i() <= 0.0F)) {
      return new zu(Color.getEmpty());
    }
    com.aspose.cells.b.a.b.a.zc localzc = b(paramFloat);
    if (localzc == null) {
      return new zu(Color.getWhite());
    }
    if (b() == 0)
    {
      localObject = new zh(localzq, Color.getRed(), Color.getGreen(), c());
      if (localzc != null) {
        ((zh)localObject).a(localzc);
      }
      return (com.aspose.cells.b.a.b.zc)localObject;
    }
    zr localzr;
    if (b() == 1)
    {
      localObject = a(localzq);
      localzr = new zr((com.aspose.cells.b.a.b.a.ze)localObject, 1);
      if (localzc != null) {
        localzr.a(localzc);
      }
      return localzr;
    }
    if (b() == 2)
    {
      localObject = a(localzq);
      localzr = new zr((com.aspose.cells.b.a.b.a.ze)localObject, 2);
      if (localzc != null) {
        localzr.a(localzc);
      }
      return localzr;
    }
    Object localObject = new zr(paramze, 3);
    if (localzc != null) {
      ((zr)localObject).a(localzc);
    }
    return (com.aspose.cells.b.a.b.zc)localObject;
  }
  
  private com.aspose.cells.b.a.b.a.zc b(float paramFloat)
  {
    if (this.c.getCount() == 0) {
      return null;
    }
    ArrayList localArrayList1 = new ArrayList();
    for (int i = 0; i < this.c.getCount(); i++) {
      zf.a(localArrayList1, this.c.a(i));
    }
    zadz localzadz = new zadz();
    Collections.sort(localArrayList1, localzadz);
    int j = localArrayList1.size();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    for (int k = 0; k < j; k++)
    {
      localObject = (zaeb)localArrayList1.get(k);
      Color localColor1 = Color.fromArgb(((zaeb)localObject).a().getA() & 0xFF, (int)((((zaeb)localObject).a().getR() & 0xFF) * paramFloat), (int)((((zaeb)localObject).a().getG() & 0xFF) * paramFloat), (int)((((zaeb)localObject).a().getB() & 0xFF) * paramFloat));
      float f1 = ((zaeb)localObject).b() / 100.0F;
      zf.a(localArrayList2, localColor1);
      zf.a(localArrayList3, Float.valueOf(f1));
      if ((k == 0) && (f1 != 0.0F))
      {
        localArrayList2.add(0, localColor1);
        localArrayList3.add(0, Integer.valueOf(0));
      }
      if ((k == j - 1) && (f1 != 1.0F))
      {
        zf.a(localArrayList2, localColor1);
        zf.a(localArrayList3, Integer.valueOf(1));
      }
    }
    Color[] arrayOfColor = new Color[localArrayList2.size()];
    Object localObject = new float[localArrayList3.size()];
    int m = b() == 0 ? 0 : 1;
    for (int n = 0; n < localArrayList2.size(); n++)
    {
      int i1 = n;
      if (m != 0) {
        i1 = localArrayList2.size() - 1 - n;
      }
      Color localColor2 = (Color)localArrayList2.get(i1);
      float f2 = (float)com.aspose.cells.b.a.ze.g(localArrayList3.get(i1));
      f2 = m != 0 ? 1.0F - f2 : f2;
      arrayOfColor[n] = localColor2;
      localObject[n] = f2;
    }
    com.aspose.cells.b.a.b.a.zc localzc = new com.aspose.cells.b.a.b.a.zc();
    localzc.a(arrayOfColor);
    localzc.a((float[])localObject);
    return localzc;
  }
  
  private com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    Object localObject;
    if (e() == 4)
    {
      if (b() == 1)
      {
        localze.b(paramzq);
      }
      else
      {
        float f1 = (float)Math.sqrt(paramzq.h() / 2.0F * paramzq.h() / 2.0F + paramzq.i() / 2.0F * paramzq.i() / 2.0F);
        localObject = new zo(paramzq.j() + paramzq.h() / 2.0F, paramzq.k() + paramzq.i() / 2.0F);
        localze.a(((zo)localObject).d() - f1, ((zo)localObject).e() - f1, 2.0F * f1, 2.0F * f1);
      }
    }
    else
    {
      zo localzo = zo.a();
      if (e() == 2) {
        localzo = new zo(paramzq.j(), paramzq.m());
      } else if (e() == 3) {
        localzo = new zo(paramzq.l(), paramzq.m());
      } else if (e() == 0) {
        localzo = new zo(paramzq.j(), paramzq.k());
      } else {
        localzo = new zo(paramzq.l(), paramzq.k());
      }
      if (b() == 1)
      {
        localObject = zq.c();
        ((zq)localObject).a(localzo.d() - paramzq.h());
        ((zq)localObject).b(localzo.e() - paramzq.i());
        ((zq)localObject).c(2.0F * paramzq.h());
        ((zq)localObject).d(2.0F * paramzq.i());
        localze.b((zq)localObject);
      }
      else
      {
        float f2 = (float)Math.sqrt(paramzq.h() * paramzq.h() + paramzq.i() * paramzq.i());
        localze.a(localzo.d() - f2, localzo.e() - f2, 2.0F * f2, 2.0F * f2);
      }
    }
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zads.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */