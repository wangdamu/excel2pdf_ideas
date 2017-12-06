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

class zado
  implements zaih
{
  private int a = 0;
  private float b = 0.0F;
  private zadu c = new zadu();
  private int d = 4;
  
  public int a()
  {
    return this.a;
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public float b()
  {
    return this.b;
  }
  
  public void a(float paramFloat)
  {
    this.b = paramFloat;
  }
  
  zadu c()
  {
    return this.c;
  }
  
  public zaij d()
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
    if (a() == 0)
    {
      localObject = new zh(localzq, Color.getRed(), Color.getGreen(), b());
      if (localzc != null) {
        ((zh)localObject).a(localzc);
      }
      return (com.aspose.cells.b.a.b.zc)localObject;
    }
    zr localzr;
    if (a() == 1)
    {
      localObject = a(localzq);
      localzr = new zr((com.aspose.cells.b.a.b.a.ze)localObject, 1);
      if (localzc != null) {
        localzr.a(localzc);
      }
      return localzr;
    }
    if (a() == 2)
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
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < this.c.getCount(); i++) {
      zf.a(localArrayList, this.c.a(i));
    }
    zadx localzadx = new zadx();
    Collections.sort(localArrayList, localzadx);
    for (int j = 1; j < localArrayList.size(); j++)
    {
      localObject1 = (zaii)localArrayList.get(j);
      localObject2 = (zaii)localArrayList.get(j - 1);
      if (localArrayList.size() == 1) {
        break;
      }
      if (Math.abs(((zaii)localObject1).c() - ((zaii)localObject2).c()) < 1.0E-5F)
      {
        localArrayList.remove(j);
        j--;
      }
    }
    j = localArrayList.size();
    Object localObject1 = new ArrayList();
    Object localObject2 = new ArrayList();
    for (int k = 0; k < j; k++)
    {
      localObject3 = (zaii)localArrayList.get(k);
      Color localColor1 = Color.fromArgb(((zaii)localObject3).a().getA() & 0xFF, (int)((((zaii)localObject3).a().getR() & 0xFF) * paramFloat), (int)((((zaii)localObject3).a().getG() & 0xFF) * paramFloat), (int)((((zaii)localObject3).a().getB() & 0xFF) * paramFloat));
      float f1 = ((zaii)localObject3).c() / 100.0F;
      zf.a((ArrayList)localObject1, localColor1);
      zf.a((ArrayList)localObject2, Float.valueOf(f1));
      if ((k == 0) && (f1 != 0.0F))
      {
        ((ArrayList)localObject1).add(0, localColor1);
        ((ArrayList)localObject2).add(0, Integer.valueOf(0));
      }
      if ((k == j - 1) && (f1 != 1.0F))
      {
        zf.a((ArrayList)localObject1, localColor1);
        zf.a((ArrayList)localObject2, Integer.valueOf(1));
      }
    }
    Color[] arrayOfColor = new Color[((ArrayList)localObject1).size()];
    Object localObject3 = new float[((ArrayList)localObject2).size()];
    int m = a() == 0 ? 0 : 1;
    for (int n = 0; n < ((ArrayList)localObject1).size(); n++)
    {
      int i1 = n;
      if (m != 0) {
        i1 = ((ArrayList)localObject1).size() - 1 - n;
      }
      Color localColor2 = (Color)((ArrayList)localObject1).get(i1);
      float f2 = (float)com.aspose.cells.b.a.ze.g(((ArrayList)localObject2).get(i1));
      f2 = m != 0 ? 1.0F - f2 : f2;
      arrayOfColor[n] = localColor2;
      localObject3[n] = f2;
    }
    com.aspose.cells.b.a.b.a.zc localzc = new com.aspose.cells.b.a.b.a.zc();
    localzc.a(arrayOfColor);
    localzc.a((float[])localObject3);
    return localzc;
  }
  
  private com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    Object localObject;
    if (e() == 4)
    {
      if (a() == 1)
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
      if (a() == 1)
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
  
  boolean a(zado paramzado)
  {
    if (paramzado != null)
    {
      if (a() != paramzado.a()) {
        return false;
      }
      if (b() != paramzado.b()) {
        return false;
      }
      if (e() != paramzado.e()) {
        return false;
      }
      if (a() != paramzado.a()) {
        return false;
      }
      return c().a(paramzado.c());
    }
    return false;
  }
  
  void b(zado paramzado)
  {
    this.a = paramzado.a;
    this.b = paramzado.b;
    this.d = paramzado.d;
    this.c.clear();
    for (int i = 0; i < paramzado.c().getCount(); i++)
    {
      this.c.a(paramzado.c().a(i).a(), paramzado.c().a(i).c());
      this.c.a(i).a(paramzado.c().a(i).b());
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zado.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */