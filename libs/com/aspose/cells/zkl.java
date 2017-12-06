package com.aspose.cells;

import com.aspose.cells.a.d.zap;
import com.aspose.cells.a.d.zb;
import com.aspose.cells.a.d.zm;
import com.aspose.cells.a.d.zn;
import com.aspose.cells.a.d.zp;
import com.aspose.cells.a.d.zx;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zu;
import com.aspose.cells.b.a.zg;
import com.aspose.cells.b.a.zj;
import java.util.ArrayList;
import java.util.List;

class zkl
  implements zj
{
  private SparklineGroup a;
  private zbqw[] b;
  private int c;
  private int d;
  private zr e;
  private boolean f = false;
  private boolean g = false;
  private zb h = new zb();
  
  public zb a()
  {
    zi localzi = new zi();
    float f1 = zap.b();
    localzi.a(72.0F / f1, 72.0F / f1);
    this.h.a(localzi);
    return this.h;
  }
  
  zkl(SparklineGroup paramSparklineGroup, zbqw[] paramArrayOfzbqw, int paramInt1, int paramInt2)
  {
    this.a = paramSparklineGroup;
    this.b = paramArrayOfzbqw;
    this.c = paramInt2;
    this.d = paramInt1;
    this.g = false;
  }
  
  public void b()
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    double[] arrayOfDouble1 = { d2 };
    double[] arrayOfDouble2 = { d1 };
    ArrayList localArrayList1 = a(arrayOfDouble1, arrayOfDouble2);
    d2 = arrayOfDouble1[0];
    d1 = arrayOfDouble2[0];
    double d3 = d1;
    double d4 = d2;
    if (d2 == d1) {
      if (d2 > 0.0D)
      {
        d1 = 0.0D;
      }
      else if (d2 < 0.0D)
      {
        d2 = 0.0D;
      }
      else
      {
        d2 = 1.0D;
        d1 = -1.0D;
      }
    }
    int i = this.a.getType() == 2 ? 1 : 0;
    if (i != 0)
    {
      d2 = 1.0D;
      d1 = -1.0D;
    }
    double d5 = 0.0D;
    if (d5 > d2) {
      d5 = d2;
    }
    if (d5 < d1) {
      d5 = d1;
    }
    int j = 1;
    int k = 4;
    int m = this.d - 2 * j;
    int n = this.c - 2 * k;
    int i1 = localArrayList1.size();
    double d6 = m / i1;
    float f1 = (float)(d6 * 0.7D);
    double d7 = (d2 - d5) / (d2 - d1) * n + k;
    Object localObject2;
    Object localObject3;
    if ((this.a.getShowHorizontalAxis()) && (d5 == 0.0D)) {
      if (this.g)
      {
        com.aspose.cells.a.d.zs localzs = new com.aspose.cells.a.d.zs(Color.a(255, this.a.getHorizontalAxisColor().getColor()), 1.0F);
        try
        {
          this.e.b(localzs, 0.0F, (float)d7, this.d, (float)d7);
        }
        finally
        {
          if (localzs != null) {
            localzs.s();
          }
        }
      }
      else
      {
        float f2 = 1.0F;
        Color localColor1 = Color.a(255, this.a.getHorizontalAxisColor().getColor());
        localObject2 = new zx(localColor1, f2);
        zo localzo1 = new zo(0.0F, (float)d7);
        localObject3 = new zo(this.d, (float)d7);
        zm localzm = new zm(localzo1, (zo)localObject3);
        localzm.c = ((zx)localObject2);
        this.h.a(localzm);
      }
    }
    ArrayList localArrayList2 = new ArrayList();
    double d9;
    for (int i2 = 0; i2 < localArrayList1.size(); i2++)
    {
      localObject2 = (zaxl)localArrayList1.get(i2);
      if (((zaxl)localObject2).d() != null)
      {
        double d8 = com.aspose.cells.b.a.ze.g(((zaxl)localObject2).d());
        if (i != 0)
        {
          if (d8 > 1.0D) {
            d8 = 1.0D;
          }
          if (d8 < 0.0D) {
            d8 = -1.0D;
          }
        }
        d9 = d6 * i2 + d6 / 2.0D;
        if (this.a.getPlotRightToLeft()) {
          d9 = -j - d9;
        }
        double d10 = d7;
        double d11 = (d8 - d5) / (d2 - d1) * n;
        d10 -= d11;
        if (this.a.getType() == 0)
        {
          zo localzo2 = new zo((float)d9, (float)d10);
          ((zaxl)localObject2).a(localzo2.d());
          ((zaxl)localObject2).b(localzo2.e());
          com.aspose.cells.b.a.a.zf.a(localArrayList2, localzo2);
        }
        else if (d2 != d1)
        {
          float f3 = (float)(d9 - f1 / 2.0F);
          float f4 = (float)d10;
          if (d8 < 0.0D) {
            f4 = (float)d7;
          }
          float f5 = (float)Math.abs(d11);
          if ((d8 != 0.0D) && (f5 < 1.0F))
          {
            f5 = 1.0F;
            if (d8 < 0.0D) {
              f4 = (float)d7;
            } else {
              f4 = (float)d7 - 1.0F;
            }
          }
          if ((f5 != 0.0F) && (f1 != 0.0F))
          {
            com.aspose.cells.b.a.b.zq localzq = new com.aspose.cells.b.a.b.zq(f3, f4, f1, f5);
            ((zaxl)localObject2).a(localzq);
            Color localColor3 = Color.a(255, this.a.getSeriesColor().getColor());
            c((zaxl)localObject2, localColor3);
          }
        }
      }
      else
      {
        com.aspose.cells.b.a.a.zf.a(localArrayList2, null);
      }
    }
    if (this.a.getType() == 0) {
      if (this.g)
      {
        com.aspose.cells.b.a.b.a.zf localzf = this.e.d();
        this.e.a(4, true);
        a(localArrayList2, localArrayList1);
        this.e.a(localzf);
      }
      else
      {
        a(localArrayList2, localArrayList1);
      }
    }
    int i3 = -1;
    for (int i4 = 0; i4 <= localArrayList1.size() - 1; i4++)
    {
      zaxl localzaxl = (zaxl)localArrayList1.get(i4);
      if (localzaxl.d() != null)
      {
        i3 = i4;
        break;
      }
    }
    i4 = -1;
    for (int i5 = localArrayList1.size() - 1; i5 >= 0; i5--)
    {
      localObject3 = (zaxl)localArrayList1.get(i5);
      if (((zaxl)localObject3).d() != null)
      {
        i4 = i5;
        break;
      }
    }
    for (i5 = 0; i5 < localArrayList1.size(); i5++)
    {
      localObject3 = (zaxl)localArrayList1.get(i5);
      if (((zaxl)localObject3).d() != null)
      {
        d9 = com.aspose.cells.b.a.ze.g(((zaxl)localObject3).d());
        Color localColor2 = Color.getEmpty();
        if (this.a.getShowMarkers()) {
          localColor2 = Color.a(255, this.a.getMarkersColor().getColor());
        }
        if ((this.a.getShowNegativePoints()) && (d9 < 0.0D)) {
          localColor2 = Color.a(255, this.a.getNegativePointsColor().getColor());
        }
        if ((this.a.getShowFirstPoint()) && (i5 == i3)) {
          localColor2 = Color.a(255, this.a.getFirstPointColor().getColor());
        }
        if ((this.a.getShowLastPoint()) && (i5 == i4)) {
          localColor2 = Color.a(255, this.a.getLastPointColor().getColor());
        }
        if ((this.a.getShowHighPoint()) && (d9 == d4)) {
          localColor2 = Color.a(255, this.a.getHighPointColor().getColor());
        }
        if ((this.a.getShowLowPoint()) && (d9 == d3)) {
          localColor2 = Color.a(255, this.a.getLowPointColor().getColor());
        }
        if (!localColor2.isEmpty()) {
          a((zaxl)localObject3, localColor2);
        }
      }
    }
  }
  
  public ArrayList a(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    SparklineGroup localSparklineGroup = this.a;
    zbqw[] arrayOfzbqw1 = this.b;
    paramArrayOfDouble2[0] = 0.0D;
    paramArrayOfDouble1[0] = 0.0D;
    ArrayList localArrayList = new ArrayList();
    int i = 1;
    for (zbqw localzbqw : arrayOfzbqw1)
    {
      zaxl localzaxl = new zaxl(localSparklineGroup.getPlotEmptyCellsType(), localzbqw);
      com.aspose.cells.b.a.a.zf.a(localArrayList, localzaxl);
      double d1;
      if (localzbqw.b == 5)
      {
        d1 = 0.0D;
      }
      else if (localzbqw.b == 2)
      {
        if ("#N/A".equals(com.aspose.cells.b.a.zs.a(localzbqw.a))) {
          continue;
        }
        d1 = 0.0D;
      }
      else if (localzbqw.b == 3)
      {
        if (localSparklineGroup.getPlotEmptyCellsType() != 1) {
          continue;
        }
        d1 = 0.0D;
      }
      else
      {
        d1 = com.aspose.cells.b.a.ze.g(localzbqw.a);
      }
      if (i != 0)
      {
        paramArrayOfDouble2[0] = d1;
        paramArrayOfDouble1[0] = d1;
        i = 0;
      }
      if (d1 > paramArrayOfDouble1[0]) {
        paramArrayOfDouble1[0] = d1;
      }
      if (d1 < paramArrayOfDouble2[0]) {
        paramArrayOfDouble2[0] = d1;
      }
    }
    if ((localSparklineGroup.getVerticalAxisMinValueType() == 2) && (localSparklineGroup.d != 0.0D)) {
      paramArrayOfDouble2[0] = localSparklineGroup.d;
    }
    if ((localSparklineGroup.getVerticalAxisMaxValueType() == 2) && (localSparklineGroup.c != 0.0D)) {
      paramArrayOfDouble1[0] = localSparklineGroup.c;
    }
    return localArrayList;
  }
  
  private void a(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    float f1 = zbxz.d(this.a.getLineWeight());
    if (f1 < 1.0F) {
      f1 = 1.0F;
    }
    zx localzx = new zx(Color.a(255, this.a.getSeriesColor().getColor()), f1);
    com.aspose.cells.a.d.zs localzs = new com.aspose.cells.a.d.zs(Color.a(255, this.a.getSeriesColor().getColor()), f1);
    try
    {
      ArrayList localArrayList = new ArrayList();
      Object localObject1;
      Object localObject2;
      for (int i = 0; i < paramArrayList1.size(); i++)
      {
        localObject1 = (zaxl)paramArrayList2.get(i);
        if (!((zaxl)localObject1).c()) {
          if (paramArrayList1.get(i) != null) {
            com.aspose.cells.b.a.a.zf.a(localArrayList, paramArrayList1.get(i));
          } else if (this.a.getPlotEmptyCellsType() != 2) {
            if (localArrayList.size() > 1)
            {
              localObject2 = a(localArrayList);
              Object localObject3;
              if (this.g)
              {
                localObject3 = new com.aspose.cells.b.a.b.a.ze();
                ((com.aspose.cells.b.a.b.a.ze)localObject3).a((zo[])localObject2);
                this.e.a(localzs, (com.aspose.cells.b.a.b.a.ze)localObject3);
              }
              else
              {
                localObject3 = new zp();
                com.aspose.cells.a.d.zq localzq = com.aspose.cells.a.d.zq.a((zo[])localObject2, false);
                ((zp)localObject3).a(localzx);
                ((zp)localObject3).a(localzq);
                this.h.a((zn)localObject3);
              }
              localArrayList.clear();
            }
            else
            {
              localArrayList.clear();
            }
          }
        }
      }
      if (localArrayList.size() > 1)
      {
        zo[] arrayOfzo = a(localArrayList);
        if (this.g)
        {
          localObject1 = new com.aspose.cells.b.a.b.a.ze();
          ((com.aspose.cells.b.a.b.a.ze)localObject1).a(arrayOfzo);
          this.e.a(localzs, (com.aspose.cells.b.a.b.a.ze)localObject1);
        }
        else
        {
          localObject1 = new zp();
          localObject2 = com.aspose.cells.a.d.zq.a(arrayOfzo, false);
          ((zp)localObject1).a(localzx);
          ((zp)localObject1).a((zn)localObject2);
          this.h.a((zn)localObject1);
        }
        localArrayList.clear();
      }
    }
    finally
    {
      if (localzs != null) {
        localzs.s();
      }
    }
  }
  
  private zo[] a(List paramList)
  {
    zo[] arrayOfzo = new zo[paramList.size()];
    zbxz.a(arrayOfzo);
    for (int i = 0; i < paramList.size(); i++) {
      arrayOfzo[i] = ((zo)paramList.get(i));
    }
    return arrayOfzo;
  }
  
  private void a(zaxl paramzaxl, Color paramColor)
  {
    if (this.a.getType() == 0) {
      b(paramzaxl, paramColor);
    } else {
      c(paramzaxl, paramColor);
    }
  }
  
  private void b(zaxl paramzaxl, Color paramColor)
  {
    float f1 = paramzaxl.a();
    float f2 = paramzaxl.b();
    float f3 = 3.0F;
    float f4 = (float)(this.a.getLineWeight() / 0.75D);
    if (f4 > 1.0F) {
      f3 += (f4 - 1.0F) * 1.5F;
    }
    zo[] arrayOfzo = new zo[4];
    zbxz.a(arrayOfzo);
    int i = (int)(f3 / 2.0F + 0.5F);
    arrayOfzo[0].a(f1 - i);
    arrayOfzo[0].b(f2);
    arrayOfzo[1].a(f1);
    arrayOfzo[1].b(f2 - i);
    arrayOfzo[2].a(f1 + i);
    arrayOfzo[2].b(f2);
    arrayOfzo[3].a(f1);
    arrayOfzo[3].b(f2 + i);
    Object localObject1;
    Object localObject2;
    if (this.g)
    {
      localObject1 = new com.aspose.cells.b.a.b.a.ze();
      try
      {
        localObject2 = new zu(paramColor);
        try
        {
          ((com.aspose.cells.b.a.b.a.ze)localObject1).b(arrayOfzo);
          this.e.a((zc)localObject2, (com.aspose.cells.b.a.b.a.ze)localObject1);
        }
        finally
        {
          if (localObject2 != null) {
            ((zc)localObject2).f();
          }
        }
      }
      finally
      {
        if (localObject1 != null) {
          ((com.aspose.cells.b.a.b.a.ze)localObject1).h();
        }
      }
    }
    else
    {
      localObject1 = new zp();
      localObject2 = com.aspose.cells.a.d.zq.a(arrayOfzo, true);
      ((zp)localObject1).a(new zu(paramColor));
      ((zp)localObject1).a((zn)localObject2);
      this.h.a((zn)localObject1);
    }
  }
  
  private void c(zaxl paramzaxl, Color paramColor)
  {
    com.aspose.cells.b.a.b.zq localzq = paramzaxl.e();
    zu localzu = new zu(paramColor);
    if (this.g)
    {
      this.e.b(localzu, localzq);
    }
    else
    {
      zp localzp = new zp(localzq);
      localzp.a(localzu);
      this.h.a(localzp);
    }
  }
  
  public void dispose()
    throws Exception
  {
    a(true);
    zg.a(this);
  }
  
  protected void a(boolean paramBoolean)
    throws Exception
  {
    if (!this.f)
    {
      if ((paramBoolean) && (this.g)) {
        this.e.dispose();
      }
      this.f = true;
    }
  }
  
  protected void finalize()
    throws Exception
  {
    dispose();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zkl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */