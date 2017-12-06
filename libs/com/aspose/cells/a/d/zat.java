package com.aspose.cells.a.d;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;

public class zat
{
  public zq a;
  public boolean b = false;
  public int c = 0;
  public zo d;
  public int e = 0;
  public int f = -1;
  
  public zat(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, boolean paramBoolean, zo paramzo)
  {
    this.a = new zq();
    this.a.a(paramFloat1);
    this.a.b(paramFloat2);
    this.a.c(paramFloat3);
    this.a.d(paramFloat4);
    this.b = paramBoolean;
    this.c = 1;
    this.d = paramzo;
  }
  
  public zat(zq paramzq, boolean paramBoolean, zo paramzo)
  {
    this.a = paramzq;
    this.b = paramBoolean;
    this.c = 1;
    this.d = paramzo;
  }
  
  public zat(zq paramzq, boolean paramBoolean, int paramInt, zo paramzo)
  {
    this.a = paramzq;
    this.b = paramBoolean;
    this.c = paramInt;
    this.d = paramzo;
  }
  
  public boolean a(zat paramzat)
  {
    zq localzq = paramzat.a;
    return (this.a.f() >= localzq.f()) && (this.a.g() >= localzq.g()) && (this.a.l() <= localzq.l()) && (this.a.m() <= localzq.m());
  }
  
  public int b(zat paramzat)
  {
    zq localzq1 = paramzat.a;
    zq localzq2 = new zq();
    int i = 0;
    for (int j = 0; j < this.a.h() / localzq1.h() + 2.0F; j++) {
      for (int k = 0; k < this.a.i() / localzq1.i() + 2.0F; k++)
      {
        if (this.b) {
          localzq2.a(localzq1.f() - localzq1.h() * j);
        } else {
          localzq2.a(localzq1.f() + localzq1.h() * j);
        }
        localzq2.b(localzq1.g() + localzq1.i() * k);
        localzq2.c(localzq1.h());
        localzq2.d(localzq1.i());
        if (a(localzq2, this.a)) {
          i++;
        }
        if (this.b)
        {
          if ((localzq2.l() < this.a.j()) && (localzq2.k() > this.a.m())) {
            return i;
          }
        }
        else if ((localzq2.j() > this.a.l()) && (localzq2.k() > this.a.m())) {
          return i;
        }
      }
    }
    return 1;
  }
  
  static boolean a(zq paramzq1, zq paramzq2)
  {
    zq localzq = new zq(paramzq1.d(), paramzq1.e());
    localzq.a(paramzq2);
    return (localzq.e().c() > 0.5D) && (localzq.e().b() > 0.5D);
  }
  
  public boolean c(zat paramzat)
  {
    zq localzq = new zq(paramzat.a.d(), paramzat.a.e());
    localzq.a(this.a);
    return (localzq.e().c() > 0.5D) && (localzq.e().b() > 0.5D);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */