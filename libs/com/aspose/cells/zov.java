package com.aspose.cells;

import com.aspose.cells.a.d.zb;
import com.aspose.cells.a.d.zj;
import com.aspose.cells.a.d.zn;
import com.aspose.cells.a.d.zx;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.za;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zi;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zu;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Iterator;

class zov
  extends zahw
{
  DataBar a;
  private boolean e = false;
  private static Object f = new Object();
  
  public zov(DataBar paramDataBar, zaca paramzaca, zgs paramzgs, ArrayList paramArrayList)
  {
    super(paramzaca, paramzgs, paramArrayList);
    this.a = paramDataBar;
    paramDataBar.getMaxCfvo().setValue(Double.valueOf(a(paramDataBar.getMaxCfvo(), paramzaca).o()));
    paramDataBar.getMinCfvo().setValue(Double.valueOf(a(paramDataBar.getMinCfvo(), paramzaca).o()));
  }
  
  public zov(DataBar paramDataBar, zaca paramzaca, zgs paramzgs, ArrayList paramArrayList, boolean paramBoolean)
  {
    this(paramDataBar, paramzaca, paramzgs, paramArrayList);
  }
  
  public ArrayList a(zq paramzq)
    throws Exception
  {
    if (this.b == null)
    {
      localObject1 = d();
      b((zaca)localObject1);
      a((zaca)localObject1);
    }
    if (this.b.b() != 3) {
      return null;
    }
    Object localObject1 = new ArrayList();
    double d1 = ((Double)this.a.getMaxCfvo().getValue()).doubleValue();
    double d2 = ((Double)this.a.getMinCfvo().getValue()).doubleValue();
    try
    {
      float f1 = 0.0F;
      double d3 = ((zabb)this.b).o();
      if (d1 == d2)
      {
        if (d1 == 0.0D) {
          f1 = 0.0F;
        } else if (d3 == d1)
        {
          if ((this.a.getMaxCfvo().getType() == 6) && (this.a.getMinCfvo().getType() == 7)) {
            f1 = 1.0F;
          } else {
            f1 = 0.5F;
          }
        }
        else if (d3 > d1) {
          f1 = 1.0F;
        } else {
          f1 = 0.0F;
        }
      }
      else if (d2 >= 0.0D)
      {
        if (this.a.getMinCfvo().getType() == 7) {
          f1 = (float)(d3 / d1);
        } else {
          f1 = (float)((d3 - d2) / (d1 - d2));
        }
        if (this.a.getAxisPosition() == 1) {
          f1 /= 2.0F;
        }
      }
      else if (d1 <= 0.0D)
      {
        if (this.a.getMaxCfvo().getType() == 6) {
          f1 = (float)(Math.abs(d3) / Math.abs(d2));
        } else {
          f1 = (float)((Math.abs(d3) - Math.abs(d1)) / (d1 - d2));
        }
        if (this.a.getAxisPosition() == 1) {
          f1 /= 2.0F;
        }
      }
      else
      {
        switch (this.a.getAxisPosition())
        {
        case 0: 
          f1 = (float)(Math.abs(d3) / (d1 - d2));
          break;
        case 1: 
          double d4 = Math.max(Math.abs(d2), Math.abs(d1));
          f1 = (float)(Math.abs(d3) / d4 / 2.0D);
          break;
        case 2: 
          f1 = (float)((d3 - d2) / (d1 - d2));
          break;
        default: 
          f1 = (float)(Math.abs(d3) / (d1 - d2));
        }
      }
      f1 = (f1 * (this.a.getMaxLength() - this.a.getMinLength()) + this.a.getMinLength()) / 100.0F;
      if (f1 > this.a.getMaxLength() / 100.0F) {
        f1 = this.a.getMaxLength() / 100.0F;
      }
      if (f1 < this.a.getMinLength() / 100.0F) {
        f1 = this.a.getMinLength() / 100.0F;
      }
      Color localColor1;
      if (d3 >= 0.0D) {
        localColor1 = Color.a(255, this.a.getColor());
      } else if (this.a.getNegativeBarFormat().getColorType() == 1) {
        localColor1 = Color.a(255, this.a.getColor());
      } else {
        localColor1 = Color.a(255, this.a.getNegativeBarFormat().getColor());
      }
      Color localColor2 = Color.fromArgb(255, 255, 255, 255);
      int i = this.a.getDirection();
      if (i == 0) {
        if (this.c.getDisplayRightToLeft()) {
          i = 2;
        } else {
          i = 1;
        }
      }
      float f2 = 0.0F;
      if ((d2 < 0.0D) && (d1 > 0.0D))
      {
        if (this.a.getAxisPosition() == 0)
        {
          if (i == 2) {
            f2 = (float)(d1 / (d1 - d2));
          } else {
            f2 = (float)(Math.abs(d2) / (d1 - d2));
          }
        }
        else if (this.a.getAxisPosition() == 1) {
          f2 = 0.5F;
        }
      }
      else if (d2 >= 0.0D)
      {
        if (i == 2) {
          f2 = 1.0F;
        } else {
          f2 = 0.0F;
        }
        if (this.a.getAxisPosition() == 1) {
          f2 = 0.5F;
        }
      }
      else if (d1 <= 0.0D)
      {
        if (i == 2) {
          f2 = 0.0F;
        } else {
          f2 = 1.0F;
        }
        if (this.a.getAxisPosition() == 1) {
          f2 = 0.5F;
        }
      }
      com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
      Object localObject2 = null;
      zq localzq;
      if ((d2 < 0.0D) && (d1 > 0.0D) && (this.a.getAxisPosition() != 2))
      {
        if (((i == 2) && (d3 >= 0.0D)) || ((i == 1) && (d3 < 0.0D)))
        {
          localzq = new zq(new zo(paramzq.d().d() + paramzq.h() * f2 - paramzq.h() * f1, paramzq.d().e() + 1.0F), new zt(paramzq.h() * f1, paramzq.i() - 2.0F));
          localzq = b(localzq, paramzq);
          localzq.b(localzq.g() - 1.0F);
          localzq.a(0.0F);
          localzq.d(localzq.i() + 2.0F);
          localze.b(localzq);
          if (this.a.getBarFillType() == 0) {
            localObject2 = new zu(localColor1);
          } else {
            localObject2 = new com.aspose.cells.b.a.b.a.zh(localzq, localColor1, localColor2, 180.0F);
          }
        }
        else
        {
          localzq = new zq(new zo(paramzq.d().d() + paramzq.h() * f2, paramzq.d().e() + 1.0F), new zt(paramzq.h() * f1, paramzq.i() - 2.0F));
          localzq = b(localzq, paramzq);
          localzq.b(localzq.g() - 1.0F);
          localzq.a(0.0F);
          localzq.d(localzq.i() + 2.0F);
          localze.b(localzq);
          if (this.a.getBarFillType() == 0) {
            localObject2 = new zu(localColor1);
          } else {
            localObject2 = new com.aspose.cells.b.a.b.a.zh(localzq, localColor1, localColor2, 180.0F);
          }
        }
      }
      else if (((i == 2) && (d3 >= 0.0D)) || ((d3 < 0.0D) && (((i == 2) && (this.a.getAxisPosition() == 2)) || ((i == 1) && (this.a.getAxisPosition() != 2)))))
      {
        localzq = new zq(new zo(paramzq.d().d() + paramzq.h() * f2 - paramzq.h() * f1, paramzq.d().e() + 1.0F), new zt(paramzq.h() * f1, paramzq.i() - 2.0F));
        localzq = b(localzq, paramzq);
        localzq.b(localzq.g() - 1.0F);
        localzq.a(0.0F);
        localzq.d(localzq.i() + 2.0F);
        localze.b(localzq);
        if (this.a.getBarFillType() == 0) {
          localObject2 = new zu(localColor1);
        } else {
          localObject2 = new com.aspose.cells.b.a.b.a.zh(localzq, localColor1, localColor2, 180.0F);
        }
      }
      else
      {
        localzq = new zq(new zo(paramzq.d().d() + paramzq.h() * f2, paramzq.d().e() + 1.0F), new zt(paramzq.h() * f1, paramzq.i() - 2.0F));
        localzq = b(localzq, paramzq);
        localzq.b(localzq.g() - 1.0F);
        localzq.a(0.0F);
        localzq.d(localzq.i() + 2.0F);
        localze.b(localzq);
        if (this.a.getBarFillType() == 0) {
          localObject2 = new zu(localColor1);
        } else {
          localObject2 = new com.aspose.cells.b.a.b.a.zh(localzq, localColor1, localColor2, 180.0F);
        }
      }
      int j = (int)localzq.h();
      int k = (int)localzq.i();
      if ((j == 0) || (k == 0)) {
        return null;
      }
      za localza = new za(j, k);
      zi localzi = zi.a(localza);
      synchronized (f)
      {
        localObject3 = new zq((float)localze.getBounds().getX(), (float)localze.getBounds().getY(), (float)localze.getBounds().getWidth(), (float)localze.getBounds().getHeight());
        localzi.a((zc)localObject2, (zq)localObject3);
      }
      if ((this.a.getBarBorder().getType() == 1) && (f1 > 0.0F))
      {
        if (d3 >= 0.0D) {
          ??? = Color.a(255, this.a.getBarBorder().getColor());
        } else if (this.a.getNegativeBarFormat().getBorderColorType() == 1) {
          ??? = Color.a(255, this.a.getBarBorder().getColor());
        } else {
          ??? = Color.a(255, this.a.getNegativeBarFormat().getBorderColor());
        }
        localObject3 = new com.aspose.cells.b.a.b.zp((int)localzq.f(), (int)localzq.g(), (int)localzq.h() - 1, (int)localzq.i() - 2);
        localObject5 = new com.aspose.cells.b.a.b.zm((Color)???);
        synchronized (f)
        {
          localzi.a((com.aspose.cells.b.a.b.zm)localObject5, (com.aspose.cells.b.a.b.zp)localObject3);
        }
      }
      localzi.e();
      ??? = null;
      Object localObject3 = new com.aspose.cells.b.a.d.zh();
      try
      {
        localza.a((com.aspose.cells.b.a.d.zm)localObject3, ImageFormat.getPng());
        ((com.aspose.cells.b.a.d.zh)localObject3).b();
        ??? = com.aspose.cells.b.a.ze.a(((com.aspose.cells.b.a.d.zh)localObject3).m(), 0, (int)((com.aspose.cells.b.a.d.zh)localObject3).h());
      }
      finally
      {
        if (localObject3 != null) {
          ((com.aspose.cells.b.a.d.zh)localObject3).a();
        }
      }
      Object localObject5 = new ArrayList();
      zf.a((ArrayList)localObject5, ???);
      zf.a((ArrayList)localObject5, Integer.valueOf((int)localzq.h()));
      zf.a((ArrayList)localObject5, Integer.valueOf((int)localzq.i()));
      return (ArrayList)localObject5;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public zb a(zq paramzq, double[] paramArrayOfDouble, int paramInt1, int paramInt2)
  {
    zq localzq1 = new zq(paramzq.f() + 1.0F, paramzq.g() + 1.0F, paramzq.h() - 2.0F, paramzq.i() - 2.0F);
    if (this.b == null)
    {
      localObject1 = d();
      b((zaca)localObject1);
      a((zaca)localObject1);
    }
    if (this.b.b() != 3) {
      return null;
    }
    Object localObject1 = new ArrayList();
    double d1 = ((Double)this.a.getMaxCfvo().getValue()).doubleValue();
    double d2 = ((Double)this.a.getMinCfvo().getValue()).doubleValue();
    try
    {
      float f1 = 0.0F;
      double d3 = ((zabb)this.b).o();
      if (d1 == d2)
      {
        if (d1 == 0.0D) {
          f1 = 0.0F;
        } else if (d3 == d1)
        {
          if ((this.a.getMaxCfvo().getType() == 6) && (this.a.getMinCfvo().getType() == 7)) {
            f1 = 1.0F;
          } else {
            f1 = 0.5F;
          }
        }
        else if (d3 > d1) {
          f1 = 1.0F;
        } else {
          f1 = 0.0F;
        }
      }
      else if (d2 >= 0.0D)
      {
        if (this.a.getMinCfvo().getType() == 7) {
          f1 = (float)(d3 / d1);
        } else {
          f1 = (float)((d3 - d2) / (d1 - d2));
        }
        if (this.a.getAxisPosition() == 1) {
          f1 /= 2.0F;
        }
      }
      else if (d1 <= 0.0D)
      {
        if (this.a.getMaxCfvo().getType() == 6) {
          f1 = (float)(Math.abs(d3) / Math.abs(d2));
        } else {
          f1 = (float)((Math.abs(d3) - Math.abs(d1)) / (d1 - d2));
        }
        if (this.a.getAxisPosition() == 1) {
          f1 /= 2.0F;
        }
      }
      else
      {
        switch (this.a.getAxisPosition())
        {
        case 0: 
          f1 = (float)(Math.abs(d3) / (d1 - d2));
          break;
        case 1: 
          double d4 = Math.max(Math.abs(d2), Math.abs(d1));
          f1 = (float)(Math.abs(d3) / d4 / 2.0D);
          break;
        case 2: 
          f1 = (float)((d3 - d2) / (d1 - d2));
          break;
        default: 
          f1 = (float)(Math.abs(d3) / (d1 - d2));
        }
      }
      f1 = (f1 * (this.a.getMaxLength() - this.a.getMinLength()) + this.a.getMinLength()) / 100.0F;
      if (f1 > this.a.getMaxLength() / 100.0F) {
        f1 = this.a.getMaxLength() / 100.0F;
      }
      if (f1 < this.a.getMinLength() / 100.0F) {
        f1 = this.a.getMinLength() / 100.0F;
      }
      Color localColor1;
      if (d3 >= 0.0D) {
        localColor1 = Color.a(255, this.a.getColor());
      } else if (this.a.getNegativeBarFormat().getColorType() == 1) {
        localColor1 = Color.a(255, this.a.getColor());
      } else {
        localColor1 = Color.a(255, this.a.getNegativeBarFormat().getColor());
      }
      Color localColor2 = Color.fromArgb(255, 255, 255, 255);
      int i = this.a.getDirection();
      if (i == 0) {
        if (this.c.getDisplayRightToLeft()) {
          i = 2;
        } else {
          i = 1;
        }
      }
      float f2 = 0.0F;
      if ((d2 < 0.0D) && (d1 > 0.0D))
      {
        if (this.a.getAxisPosition() == 0)
        {
          if (i == 2) {
            f2 = (float)(d1 / (d1 - d2));
          } else {
            f2 = (float)(Math.abs(d2) / (d1 - d2));
          }
        }
        else if (this.a.getAxisPosition() == 1) {
          f2 = 0.5F;
        }
      }
      else if (d2 >= 0.0D)
      {
        if (i == 2) {
          f2 = 1.0F;
        } else {
          f2 = 0.0F;
        }
        if (this.a.getAxisPosition() == 1) {
          f2 = 0.5F;
        }
      }
      else if (d1 <= 0.0D)
      {
        if (i == 2) {
          f2 = 0.0F;
        } else {
          f2 = 1.0F;
        }
        if (this.a.getAxisPosition() == 1) {
          f2 = 0.5F;
        }
      }
      ArrayList localArrayList = null;
      zb localzb = new zb();
      zq localzq2;
      Object localObject2;
      if ((d2 < 0.0D) && (d1 > 0.0D) && (this.a.getAxisPosition() != 2))
      {
        if (((i == 2) && (d3 >= 0.0D)) || ((i == 1) && (d3 < 0.0D)))
        {
          localzq2 = new zq(new zo(localzq1.d().d() + localzq1.h() * f2 - localzq1.h() * f1, localzq1.d().e()), new zt(localzq1.h() * f1, localzq1.i()));
          localzq2 = a(localzq2, localzq1);
          if (this.a.getBarFillType() == 0)
          {
            localObject2 = new com.aspose.cells.a.d.zp(localzq2);
            ((com.aspose.cells.a.d.zp)localObject2).a(new zu(localColor1));
            localzb.a((zn)localObject2);
          }
          else
          {
            localArrayList = zj.a(localColor2, localColor1, localzq2, 5, 1);
          }
        }
        else
        {
          localzq2 = new zq(new zo(localzq1.d().d() + localzq1.h() * f2, localzq1.d().e()), new zt(localzq1.h() * f1, localzq1.i()));
          localzq2 = a(localzq2, localzq1);
          if (this.a.getBarFillType() == 0)
          {
            localObject2 = new com.aspose.cells.a.d.zp(localzq2);
            ((com.aspose.cells.a.d.zp)localObject2).a(new zu(localColor1));
            localzb.a((zn)localObject2);
          }
          else
          {
            localArrayList = zj.a(localColor1, localColor2, localzq2, 5, 1);
          }
        }
      }
      else if (((i == 2) && (d3 >= 0.0D)) || ((d3 < 0.0D) && (((i == 2) && (this.a.getAxisPosition() == 2)) || ((i == 1) && (this.a.getAxisPosition() != 2)))))
      {
        localzq2 = new zq(new zo(localzq1.d().d() + localzq1.h() * f2 - localzq1.h() * f1, localzq1.d().e()), new zt(localzq1.h() * f1, localzq1.i()));
        localzq2 = a(localzq2, localzq1);
        if (this.a.getBarFillType() == 0)
        {
          localObject2 = new com.aspose.cells.a.d.zp(localzq2);
          ((com.aspose.cells.a.d.zp)localObject2).a(new zu(localColor1));
          localzb.a((zn)localObject2);
        }
        else
        {
          localArrayList = zj.a(localColor2, localColor1, localzq2, 5, 1);
        }
      }
      else
      {
        localzq2 = new zq(new zo(localzq1.d().d() + localzq1.h() * f2, localzq1.d().e()), new zt(localzq1.h() * f1, localzq1.i()));
        localzq2 = a(localzq2, localzq1);
        if (this.a.getBarFillType() == 0)
        {
          localObject2 = new com.aspose.cells.a.d.zp(localzq2);
          ((com.aspose.cells.a.d.zp)localObject2).a(new zu(localColor1));
          localzb.a((zn)localObject2);
        }
        else
        {
          localArrayList = zj.a(localColor1, localColor2, localzq2, 5, 1);
        }
      }
      localzb.a(new com.aspose.cells.a.d.zp(localzq1));
      Object localObject3;
      if (localArrayList != null)
      {
        localObject2 = localArrayList.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (com.aspose.cells.a.d.zp)((Iterator)localObject2).next();
          localzb.a((zn)localObject3);
        }
      }
      if ((this.a.getBarBorder().getType() == 1) && (f1 > 0.0F))
      {
        if (d3 >= 0.0D) {
          localObject2 = Color.a(255, this.a.getBarBorder().getColor());
        } else if (this.a.getNegativeBarFormat().getBorderColorType() == 1) {
          localObject2 = Color.a(255, this.a.getBarBorder().getColor());
        } else {
          localObject2 = Color.a(255, this.a.getNegativeBarFormat().getBorderColor());
        }
        localObject3 = new com.aspose.cells.a.d.zp(localzq2);
        ((com.aspose.cells.a.d.zp)localObject3).a(new zx((Color)localObject2, 1.0F * (float)paramArrayOfDouble[0]));
        localzb.a((zn)localObject3);
      }
      if ((f2 > 0.0F) && (f2 < 1.0F) && (this.a.getAxisPosition() != 2))
      {
        localObject2 = Color.a(255, this.a.getAxisColor());
        localObject3 = new zx((Color)localObject2, 1.0F * (float)paramArrayOfDouble[0]);
        ((zx)localObject3).i = 0;
        ((zx)localObject3).a(new float[] { 1.0F, 1.0F });
        float f3 = localzq1.d().d() + localzq1.h() * f2;
        com.aspose.cells.a.d.zm localzm = new com.aspose.cells.a.d.zm(f3, localzq1.d().e(), f3, localzq1.d().e() + localzq1.i(), (zx)localObject3);
        localzb.a(localzm);
      }
      return localzb;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public boolean c()
  {
    return this.a.getShowValue();
  }
  
  private zq a(zq paramzq1, zq paramzq2)
  {
    float f1 = paramzq1.j();
    float f2 = paramzq1.l();
    if ((this.e) && (this.a.getBarBorder().getType() == 1)) {
      return new zq(a(f1, false), a(paramzq1.k(), false), a(f2 - f1 - 2.0F > 0.0F ? f2 - f1 - 2.0F : f2 - f1, true), a(paramzq1.i() - 2.0F > 0.0F ? paramzq1.i() - 2.0F : paramzq1.i(), true));
    }
    return new zq(a(f1, false), a(paramzq1.k(), false), a(f2 - f1, true), a(paramzq1.i(), true));
  }
  
  private float a(float paramFloat, boolean paramBoolean)
  {
    if (!this.e) {
      return paramFloat;
    }
    int i = (int)(paramFloat * zbxp.a() / 72.0F + 0.5D);
    if ((paramBoolean) && (i == 0)) {
      i = 1;
    }
    return i * 72.0F / zbxp.a();
  }
  
  private zq b(zq paramzq1, zq paramzq2)
  {
    float f1 = paramzq1.j();
    float f2 = paramzq1.l();
    if (Math.abs(f1 - paramzq2.j()) <= 0.1D) {
      f1 = paramzq2.j() + 1.0F;
    }
    if (Math.abs(f2 - paramzq2.l()) <= 0.1D) {
      f2 = paramzq2.l() - 1.0F;
    }
    if (f2 - f1 < 0.0F)
    {
      if ((this.e) && (this.a.getBarBorder().getType() == 1)) {
        return new zq(a(paramzq1.f()), a(paramzq1.g()), a(paramzq1.h() - 2.0F > 0.0F ? paramzq1.h() - 2.0F : paramzq1.h()), a(paramzq1.i() - 2.0F > 0.0F ? paramzq1.i() - 2.0F : paramzq1.i()));
      }
      return new zq(a(paramzq1.f()), a(paramzq1.g()), a(paramzq1.h()), a(paramzq1.i()));
    }
    if ((this.e) && (this.a.getBarBorder().getType() == 1)) {
      return new zq(a(f1), a(paramzq1.k()), a(f2 - f1 - 2.0F > 0.0F ? f2 - f1 - 2.0F : f2 - f1), a(paramzq1.i() - 2.0F > 0.0F ? paramzq1.i() - 2.0F : paramzq1.i()));
    }
    return new zq(a(f1), a(paramzq1.k()), a(f2 - f1), a(paramzq1.i()));
  }
  
  private float a(float paramFloat)
  {
    if (!this.e) {
      return paramFloat;
    }
    return (int)(paramFloat * zbxp.a() / 72.0F + 0.5D) * 72.0F / zbxp.a();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zov.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */