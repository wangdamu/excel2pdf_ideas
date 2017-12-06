package com.aspose.cells;

import com.aspose.cells.a.d.zb;
import com.aspose.cells.b.a.a.zd;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.za;
import com.aspose.cells.b.a.b.zs;
import com.aspose.cells.b.a.c.zc;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.ze;
import com.aspose.cells.b.a.zj;
import com.aspose.cells.b.a.zo;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class zkq
  implements zj
{
  private Chart b;
  private zahj c;
  private zje d;
  private zjf e;
  private ImageOrPrintOptions f;
  private Workbook g;
  private boolean h = false;
  private boolean i = true;
  private boolean j = false;
  boolean a = false;
  private boolean k = false;
  
  zkq(ImageOrPrintOptions paramImageOrPrintOptions)
  {
    this.f = paramImageOrPrintOptions;
    if (this.f == null) {
      this.f = new ImageOrPrintOptions();
    }
  }
  
  private boolean f(Chart paramChart)
  {
    if ((paramChart.getChartObject().getHeight() == 0) || (paramChart.getChartObject().getWidth() == 0)) {
      return false;
    }
    switch (paramChart.getType())
    {
    case 69: 
    case 70: 
    case 71: 
    case 72: 
      return false;
    }
    return true;
  }
  
  private zr a(Chart paramChart, zm paramzm, ImageFormat paramImageFormat)
    throws Exception
  {
    za localza = new za(1, 1);
    int m = 0;
    int n = zbxp.a();
    int i1 = paramChart.getChartObject().getWidth();
    int i2 = paramChart.getChartObject().getHeight();
    if ((!CellsHelper.a(localza)) && (localza.j() != n))
    {
      m = 1;
      i3 = (int)(i1 * localza.j() / n + 0.5F);
      int i4 = (int)(i2 * localza.k() / n + 0.5F);
      paramChart.getChartObject().setWidth(i3);
      paramChart.getChartObject().setHeight(i4);
    }
    localza.d();
    a(paramChart, true);
    this.c.a(this.f);
    int i3 = zaed.b;
    zs localzs = this.c.V();
    zr localzr = zaed.a(i3, localzs.b(), localzs.c(), paramImageFormat, this.f, paramzm, this.c, new zis());
    if (m != 0)
    {
      paramChart.getChartObject().setWidth(i1);
      paramChart.getChartObject().setHeight(i2);
    }
    return localzr;
  }
  
  za a(Chart paramChart)
    throws Exception
  {
    if (!f(paramChart)) {
      return null;
    }
    ImageFormat localImageFormat = ImageFormat.getBmp();
    zr localzr = a(paramChart, null, localImageFormat);
    if (localzr != null)
    {
      za localza = localzr.m();
      return localza;
    }
    return null;
  }
  
  void a(zm paramzm, Chart paramChart)
    throws Exception
  {
    if (!f(paramChart)) {
      return;
    }
    ImageFormat localImageFormat = this.f.getImageFormat();
    zr localzr = a(paramChart, paramzm, localImageFormat);
    if (localzr != null) {
      localzr.l();
    }
  }
  
  zb b(Chart paramChart)
    throws Exception
  {
    if (!f(paramChart)) {
      return new zb();
    }
    za localza = new za(1, 1);
    int m = 0;
    int n = zbxp.a();
    int i1 = paramChart.getChartObject().getWidth();
    int i2 = paramChart.getChartObject().getHeight();
    if ((!CellsHelper.a(localza)) && (localza.j() != n))
    {
      m = 1;
      int i3 = (int)(i1 * localza.j() / n + 0.5F);
      i4 = (int)(i2 * localza.k() / n + 0.5F);
      paramChart.getChartObject().setWidth(i3);
      paramChart.getChartObject().setHeight(i4);
    }
    localza.d();
    zahj localzahj = a(paramChart, true);
    this.c.a(this.f);
    int i4 = zaed.b;
    zav localzav = (zav)zaed.a(i4, this.c.V().b(), this.c.V().c(), ImageFormat.getBmp(), null, null, localzahj, new zis());
    if (m != 0)
    {
      paramChart.getChartObject().setWidth(i1);
      paramChart.getChartObject().setHeight(i2);
    }
    return localzav.n();
  }
  
  zje c(Chart paramChart)
    throws Exception
  {
    if (!f(paramChart)) {
      return null;
    }
    ImageFormat localImageFormat = ImageFormat.getBmp();
    a(paramChart, null, localImageFormat);
    this.d.ao();
    return this.d;
  }
  
  zjf d(Chart paramChart)
    throws Exception
  {
    if (!f(paramChart)) {
      return null;
    }
    ImageFormat localImageFormat = ImageFormat.getBmp();
    a(paramChart, null, localImageFormat);
    this.e.am();
    return this.e;
  }
  
  void e(Chart paramChart)
    throws Exception
  {
    a(paramChart, false);
  }
  
  private zahj a(Chart paramChart, boolean paramBoolean)
    throws Exception
  {
    this.g = paramChart.n().p();
    if (paramChart.L() == 2) {
      this.i = false;
    } else if (paramChart.L() == 1) {
      this.i = true;
    } else {
      this.i = this.g.g();
    }
    this.b = paramChart;
    this.h = ((paramChart.getPivotSource() != null) && (paramChart.getPivotSource().length() > 0));
    if ((this.h) && (paramChart.getNSeries().getCount() == 0)) {
      paramChart.refreshPivotData();
    }
    this.j = paramChart.N();
    com.aspose.cells.b.a.b.zg localzg = null;
    Color localColor = Color.getEmpty();
    localzg = zbxz.a("", paramChart.getChartArea().getFont());
    if ((!paramChart.getChartArea().getFont().k()) && (!paramChart.getChartArea().getFont().getColor().isEmpty()))
    {
      if (paramChart.getChartArea().getFont().getColor().getA() == 0) {
        localColor = Color.fromArgb(paramChart.getChartArea().getFont().getColor().toArgb() | 0xFF000000);
      } else {
        localColor = paramChart.getChartArea().getFont().getColor();
      }
    }
    else if ((this.i) && (paramChart.D()) && (paramChart.Q().b().g() != null)) {
      localColor = paramChart.Q().b().g().b.b.a(this.g, paramChart);
    }
    if (this.i)
    {
      this.e = new zjf(localzg, localColor);
      this.c = this.e;
    }
    else
    {
      this.d = new zje(localzg, localColor);
      this.c = this.d;
    }
    this.c.b(paramChart.getWorksheet().d().m());
    this.c.h(this.b.o().a().c().p().getSettings().getDate1904());
    b();
    c();
    g();
    if (this.i) {
      a(paramChart, this.e);
    } else {
      a(paramChart, this.d);
    }
    b(paramBoolean);
    this.c.j(this.b.n);
    this.b.n = false;
    this.c.k(this.b.o);
    this.b.o = false;
    if (paramBoolean) {
      this.b.i();
    }
    return this.c;
  }
  
  private void b()
    throws Exception
  {
    this.c.l(this.b.getChartObject().W());
    this.c.a(this.b.n().p().getSettings().f());
    this.c.j(this.b.a());
    this.c.q(this.b.getPlotEmptyCellsType());
    if (this.c.R() == -1) {
      this.c.j(2);
    }
    this.c.a(zkn.a(this.b.n().p().getSettings()));
    a(this.b.n().p());
    this.c.i(zko.i(this.b.getType()));
    this.c.e(this.b.isRectangularCornered());
    this.c.i(this.b.l());
    this.c.a(this.b);
    e();
    f();
    h();
    j();
    if (this.i)
    {
      if ((this.b.r() != null) && ((!this.b.getTitle().K()) || ((this.b.getTitle().getText() != null) && (!"".equals(this.b.getTitle().getText()))))) {
        a(this.b.getTitle(), this.c.L(), true);
      }
    }
    else
    {
      String str;
      if (this.b.r() == null)
      {
        if ((this.b.getNSeries().getCount() == 1) && (this.b.getNSeries().get(0).getName() != null))
        {
          str = a(this.b.getNSeries().get(0), true);
          if (str != null) {
            this.c.L().a(str);
          }
        }
      }
      else if (this.b.getTitle().getText() == null)
      {
        if ((this.b.getTitle().isAutoText()) && ((this.b.getNSeries().getCount() == 1) || (ChartCollection.c(this.b.getType()))) && (this.b.getNSeries().get(0).getName() != null))
        {
          str = a(this.b.getNSeries().get(0), true);
          if (str != null)
          {
            this.c.L().a(str);
            a(this.b.getTitle(), this.c.L(), true);
          }
        }
      }
      else if (!"".equals(this.b.getTitle().getText())) {
        a(this.b.getTitle(), this.c.L(), true);
      }
    }
    if (ChartCollection.b(this.b.getType()))
    {
      this.c.d(this.b.getGapDepth());
      this.c.e(this.b.getGapWidth());
      this.c.f(this.b.getElevation());
      this.c.h(this.b.getRotationAngle());
      this.c.a(this.b.getAutoScaling());
      this.c.b(this.b.getRightAngleAxes());
      this.c.c(this.b.getDepthPercent());
      this.c.g(this.b.getHeightPercent());
      if (this.b.w() != null) {
        a(this.b.getFloor(), this.c.t());
      }
      if (this.b.x() != null) {
        a(this.b.getWalls(), this.c.O());
      }
      if (this.b.y() != null) {
        a(this.b.getBackWall(), this.c.P());
      } else if (this.b.x() != null) {
        a(this.b.getWalls(), this.c.P());
      }
      if (this.b.A() != null) {
        a(this.b.getSideWall(), this.c.Q());
      } else if (this.b.x() != null) {
        a(this.b.getWalls(), this.c.Q());
      }
    }
  }
  
  private void b(boolean paramBoolean)
    throws Exception
  {
    Iterator localIterator = this.b.getShapes().iterator();
    while (localIterator.hasNext())
    {
      Shape localShape = (Shape)localIterator.next();
      if (localShape.getMsoDrawingType() == 5)
      {
        ChartShape localChartShape = (ChartShape)localShape;
        Chart localChart = localChartShape.a();
        localChart.n = this.b.n;
        localChart.o = this.b.o;
        zkq localzkq = new zkq(this.f);
        zahj localzahj = localzkq.a(localChart, paramBoolean);
        localzahj.b(null);
        localzahj.a(localShape.getLeft());
        localzahj.b(localShape.getTop());
        this.c.Y().a(localzahj);
      }
    }
  }
  
  private void c()
    throws Exception
  {
    k();
    int m = 0;
    ArrayList localArrayList = new ArrayList();
    if (this.b.D())
    {
      localObject1 = this.b.getNSeries().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Series)((Iterator)localObject1).next();
        if (((Series)localObject2).v())
        {
          localObject3 = new zbqo((Series)localObject2);
          ((zbqo)localObject3).a(m);
          zf.a(localArrayList, localObject3);
        }
      }
    }
    else
    {
      localObject1 = this.b.q().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (zka)((Iterator)localObject1).next();
        localObject3 = this.b.getNSeries().iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localSeries = (Series)((Iterator)localObject3).next();
          if ((localSeries.v()) && (localSeries.u() == localObject2))
          {
            zbqo localzbqo1 = new zbqo(localSeries);
            localzbqo1.a(m);
            m++;
            zf.a(localArrayList, localzbqo1);
          }
        }
      }
    }
    Collections.sort(localArrayList);
    Object localObject1 = new ArrayList();
    Object localObject2 = new ArrayList();
    Object localObject3 = null;
    Series localSeries = null;
    for (int n = 0; n < localArrayList.size(); n++)
    {
      zbqo localzbqo2 = (zbqo)localArrayList.get(n);
      if (!localzbqo2.b().getPlotOnSecondAxis())
      {
        zf.a((ArrayList)localObject1, localzbqo2.b());
        if (localObject3 == null) {
          localObject3 = localzbqo2.b();
        }
      }
      else
      {
        zf.a((ArrayList)localObject2, localzbqo2.b());
        if (localSeries == null) {
          localSeries = localzbqo2.b();
        }
      }
    }
    n = 0;
    if (((ArrayList)localObject2).size() > 0)
    {
      i1 = localObject3 == null ? false : a(((Series)localObject3).getType());
      int i2 = localSeries == null ? false : a(localSeries.getType());
      boolean bool1 = a((ArrayList)localObject1);
      boolean bool2 = a((ArrayList)localObject2);
      if ((a(this.b.getSecondCategoryAxis(), bool1, bool2, localSeries)) && (i1 == i2)) {
        n = 1;
      }
    }
    for (int i1 = 0; i1 < localArrayList.size(); i1++)
    {
      zbqo localzbqo3 = (zbqo)localArrayList.get(i1);
      int i3 = zko.i(localzbqo3.b().getType());
      zaje localzaje = this.c.A().b(i3);
      localzaje.l(localzbqo3.a());
      a(localzbqo3.b(), localzaje, n);
      if (localzaje.k().getCount() == 0) {
        this.c.A().removeAt(this.c.A().getCount() - 1);
      } else if ((localzbqo3.b().getTrendLines() != null) && (localzbqo3.b().getTrendLines().getCount() > 0)) {
        a(localzaje, localzbqo3.b());
      }
    }
    a(this.b.getCategoryAxis(), this.c.A().a());
    a(this.b.getSecondCategoryAxis(), this.c.A().b());
  }
  
  private boolean a(int paramInt)
  {
    switch (paramInt)
    {
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 24: 
    case 25: 
    case 26: 
    case 31: 
    case 33: 
    case 53: 
    case 54: 
    case 55: 
      return true;
    }
    return false;
  }
  
  private boolean a(ArrayList paramArrayList)
  {
    int m = 0;
    int n = 0;
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      Series localSeries = (Series)localIterator.next();
      if (ChartCollection.k(localSeries.getType())) {
        m = 1;
      } else {
        n = 1;
      }
    }
    return (m != 0) && (n == 0);
  }
  
  private boolean a(Axis paramAxis, boolean paramBoolean1, boolean paramBoolean2, Series paramSeries)
  {
    if (paramAxis.isVisible()) {
      return false;
    }
    if (!d()) {
      return false;
    }
    if ((paramBoolean1) && (!paramBoolean2)) {
      return false;
    }
    return !ChartCollection.c(paramSeries.getType());
  }
  
  private boolean d()
  {
    Iterator localIterator1 = this.b.q().iterator();
    zka localzka;
    Iterator localIterator2;
    Series localSeries;
    while (localIterator1.hasNext())
    {
      localzka = (zka)localIterator1.next();
      localIterator2 = this.b.getNSeries().iterator();
      while (localIterator2.hasNext())
      {
        localSeries = (Series)localIterator2.next();
        if ((localSeries.v()) && (localSeries.u() == localzka)) {
          if ((localSeries.getType() == 57) || (localSeries.getType() == 59) || (localSeries.getType() == 58)) {
            return false;
          }
        }
      }
    }
    localIterator1 = this.b.q().iterator();
    while (localIterator1.hasNext())
    {
      localzka = (zka)localIterator1.next();
      localIterator2 = this.b.getNSeries().iterator();
      while (localIterator2.hasNext())
      {
        localSeries = (Series)localIterator2.next();
        if ((localSeries.v()) && (localSeries.u() == localzka)) {
          if (localSeries.getPlotOnSecondAxis()) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  private void a(boolean paramBoolean, ArrayList paramArrayList)
  {
    Axis localAxis = paramBoolean ? this.b.getSecondCategoryAxis() : this.b.getCategoryAxis();
    zagz localzagz = paramBoolean ? this.c.A().b() : this.c.A().a();
    boolean bool = b(localAxis, localzagz);
    if (bool) {
      for (int m = 0; m < localzagz.getCount(); m++)
      {
        zagy localzagy1 = localzagz.a(m);
        if (localzagy1.g())
        {
          for (int n = m + 1; n < localzagz.getCount(); n++)
          {
            zagy localzagy2 = localzagz.a(n);
            if ((!localzagy2.g()) && (paramArrayList.size() > n))
            {
              zjt localzjt = (zjt)paramArrayList.get(n);
              paramArrayList.remove(n);
              paramArrayList.add(m, localzjt);
              m++;
            }
          }
          break;
        }
      }
    }
  }
  
  private void a(Axis paramAxis, zagz paramzagz)
  {
    boolean bool = b(paramAxis, paramzagz);
    if (bool) {
      for (int m = 0; m < paramzagz.getCount(); m++)
      {
        zagy localzagy1 = paramzagz.a(m);
        if (localzagy1.g())
        {
          for (int n = m + 1; n < paramzagz.getCount(); n++)
          {
            zagy localzagy2 = paramzagz.a(n);
            if (!localzagy2.g())
            {
              paramzagz.b(n);
              paramzagz.a(m, localzagy2);
              m++;
            }
          }
          break;
        }
      }
    }
  }
  
  private int a(zagz paramzagz)
  {
    int m = 0;
    for (int n = 0; n < paramzagz.getCount(); n++)
    {
      zagy localzagy = paramzagz.a(n);
      if (localzagy != null)
      {
        if (localzagy.d().getCount() == 0) {
          return paramzagz.getCount();
        }
        m += a(localzagy.d());
      }
    }
    return m;
  }
  
  private boolean b(Axis paramAxis, zagz paramzagz)
  {
    if (!this.i) {
      return false;
    }
    boolean bool = false;
    if ("dateAx".equals(paramAxis.d))
    {
      bool = true;
    }
    else if ((paramAxis.getCategoryType() == 0) && (paramzagz.getCount() > 0))
    {
      bool = true;
      for (int m = 0; m < paramzagz.getCount(); m++)
      {
        zagy localzagy = paramzagz.a(m);
        if ((!localzagy.g()) && (!localzagy.f()))
        {
          bool = false;
          break;
        }
      }
    }
    return bool;
  }
  
  private void a(Series paramSeries, zaje paramzaje, boolean paramBoolean)
    throws Exception
  {
    paramzaje.d(zko.C(paramSeries.getBar3DShapeType()));
    String str1 = null;
    boolean bool = false;
    String str2 = a(paramSeries, false);
    if (str2 != null) {
      paramzaje.a(str2);
    }
    if (paramSeries.m() == null) {
      return;
    }
    int m = 0;
    boolean[] arrayOfBoolean1 = { m };
    ArrayList localArrayList1 = paramSeries.m().a(true, (this.h) || (this.j), arrayOfBoolean1, false);
    m = arrayOfBoolean1[0];
    paramSeries.m().a(localArrayList1);
    if ((localArrayList1 == null) || (localArrayList1.size() == 0)) {
      return;
    }
    a(paramSeries.getPlotOnSecondAxis(), localArrayList1);
    int n = localArrayList1.size();
    ArrayList localArrayList2 = null;
    int i1 = 1;
    if (((ChartCollection.k(paramSeries.getType())) || (ChartCollection.q(paramSeries.getType()))) && (paramSeries.o() != null))
    {
      int i2 = 0;
      int[] arrayOfInt = { i1 };
      boolean[] arrayOfBoolean2 = { i2 };
      localArrayList2 = paramSeries.o().a(paramSeries.m().m(), (this.h) || (this.j), arrayOfInt, arrayOfBoolean2);
      i1 = arrayOfInt[0];
      i2 = arrayOfBoolean2[0];
      if (i1 == 1)
      {
        if ((localArrayList2.size() < n) && (localArrayList2.size() > 0)) {
          n = localArrayList2.size();
        }
      }
      else if (localArrayList2.size() > 0)
      {
        int i3 = ((ArrayList)localArrayList2.get(0)).size();
        if (i3 < n) {
          n = i3;
        }
      }
    }
    Axis localAxis = paramSeries.getPlotOnSecondAxis() ? this.b.getSecondCategoryAxis() : this.b.getCategoryAxis();
    zagz localzagz = paramSeries.getPlotOnSecondAxis() ? this.c.A().b() : this.c.A().a();
    if (b(localAxis, localzagz)) {
      if (paramBoolean)
      {
        if ((this.c.A().a().getCount() < n) && (this.c.A().a().getCount() > 0)) {
          n = a(this.c.A().a());
        }
      }
      else if ((localzagz.getCount() < n) && (localzagz.getCount() > 0)) {
        n = a(localzagz);
      }
    }
    int i4 = 0;
    Object localObject2;
    Object localObject3;
    for (int i5 = 0; i5 < localArrayList1.size(); i5++)
    {
      zjt localzjt1 = (zjt)localArrayList1.get(i5);
      if ((!this.b.getPlotVisibleCells()) || (localzjt1.d))
      {
        if (i4 == n) {
          break;
        }
        i4++;
        double d1 = 0.0D;
        localObject2 = new double[] { d1 };
        a(localzjt1, (double[])localObject2);
        d1 = localObject2[0];
        localObject3 = paramzaje.k().a(d1);
        ((zahn)localObject3).b(localzjt1.a);
        ((zahn)localObject3).b(zko.J(localzjt1.g));
        str1 = localzjt1.c;
        if (((str1 == null) || ("".equals(str1))) && (localzjt1.b != 0)) {
          str1 = this.g.getSettings().f().d(localzjt1.b);
        }
        ((zahn)localObject3).b(str1);
        ((zahn)localObject3).g(bool);
        if ((localzjt1.e) && (!b(paramSeries.getType()))) {
          if (this.b.getPlotEmptyCellsType() == 0)
          {
            ((zahn)localObject3).a(true);
          }
          else if (this.b.getPlotEmptyCellsType() == 2)
          {
            ((zahn)localObject3).c(true);
            ((zahn)localObject3).a(true);
          }
        }
        if (localzjt1.g == 2) {
          ((zahn)localObject3).e(true);
        }
        if ((this.i) && (this.b.D()) && (this.b.Q().a().b() != null) && (!this.b.Q().a().b().h())) {
          a(this.b.Q().a().a(), ((zahn)localObject3).l(), false);
        }
      }
    }
    int i8;
    Object localObject4;
    Object localObject1;
    if ((ChartCollection.k(paramSeries.getType())) || (ChartCollection.q(paramSeries.getType())))
    {
      i5 = 0;
      if (paramSeries.o() != null)
      {
        if ((i1 > 1) && (localArrayList2.size() > 1))
        {
          localArrayList1 = (ArrayList)localArrayList2.get(0);
          for (int i7 = 1; i7 < localArrayList2.size(); i7++)
          {
            ArrayList localArrayList4 = (ArrayList)localArrayList2.get(i7);
            for (int i11 = 0; i11 < localArrayList1.size(); i11++)
            {
              localObject2 = (zjt)localArrayList1.get(i11);
              localObject3 = (zjt)localArrayList4.get(i11);
              ((zjt)localObject2).a = (((zjt)localObject2).a() + ((zjt)localObject3).a());
              ((zjt)localObject2).g = 5;
            }
          }
        }
        else
        {
          boolean[] arrayOfBoolean4 = { m };
          localArrayList1 = paramSeries.o().a(false, (this.h) || (this.j), arrayOfBoolean4, false);
          m = arrayOfBoolean4[0];
        }
        paramSeries.o().a(localArrayList1);
        i8 = 0;
        for (int i9 = 0; (i9 < localArrayList1.size()) && (i8 < paramzaje.k().getCount()); i9++)
        {
          zjt localzjt2 = (zjt)localArrayList1.get(i9);
          if ((!this.b.getPlotVisibleCells()) || (localzjt2.d))
          {
            double d3 = 0.0D;
            localObject4 = new double[] { d3 };
            a(localzjt2, (double[])localObject4);
            d3 = localObject4[0];
            zahn localzahn = paramzaje.k().a(i8);
            i8++;
            localzahn.a(d3);
            localzahn.a(localzjt2.a);
            localzahn.a(zko.J(localzjt2.g));
            str1 = localzjt2.c;
            if (((str1 == null) || ("".equals(str1))) && (localzjt2.b != 0)) {
              str1 = this.g.getSettings().f().d(localzjt2.b);
            }
            localzahn.a(str1);
            localzahn.f(bool);
            if (localzjt2.g == 2) {
              localzahn.d(true);
            }
            if ((localzjt2.e) && (this.b.getPlotEmptyCellsType() == 0)) {
              localzahn.b(true);
            } else {
              switch (localzjt2.g)
              {
              case 5: 
              case 6: 
                i5 = 1;
                break;
              case 2: 
                localzahn.b(true);
              }
            }
          }
        }
      }
      else
      {
        i5 = 1;
      }
      if (i5 != 0)
      {
        for (i8 = 0; i8 < paramzaje.k().getCount(); i8++)
        {
          localObject1 = paramzaje.k().a(i8);
          ((zahn)localObject1).b(false);
          ((zahn)localObject1).d(false);
          ((zahn)localObject1).a(i8 + 1);
        }
        if (ChartCollection.q(paramSeries.getType())) {
          this.c.f().c(1.0D);
        }
      }
    }
    if ((ChartCollection.q(paramSeries.getType())) && (paramSeries.p() != null))
    {
      paramzaje.j(paramSeries.getBubbleScale());
      paramzaje.i(paramSeries.getShowNegativeBubbles());
      paramzaje.k(zko.e(paramSeries.getSizeRepresents()));
      boolean[] arrayOfBoolean3 = { m };
      localArrayList1 = paramSeries.p().a(true, (this.h) || (this.j), arrayOfBoolean3, false);
      m = arrayOfBoolean3[0];
      paramSeries.p().a(localArrayList1);
      i6 = 0;
      for (i8 = 0; (i8 < localArrayList1.size()) && (i6 < paramzaje.k().getCount()); i8++)
      {
        localObject1 = (zjt)localArrayList1.get(i8);
        if ((!this.b.getPlotVisibleCells()) || (((zjt)localObject1).d))
        {
          double d2 = 0.0D;
          localObject3 = new double[] { d2 };
          a((zjt)localObject1, (double[])localObject3);
          d2 = localObject3[0];
          localObject4 = paramzaje.k().a(i6);
          i6++;
          ((zahn)localObject4).e(d2);
          str1 = ((zjt)localObject1).c;
          if (((str1 == null) || ("".equals(str1))) && (((zjt)localObject1).b != 0)) {
            str1 = this.g.getSettings().f().d(((zjt)localObject1).b);
          }
          ((zahn)localObject4).c(str1);
          ((zahn)localObject4).h(bool);
        }
      }
    }
    if (d(paramSeries.getType())) {
      a(paramSeries.getMarker(), paramzaje.h());
    }
    if (paramSeries.e() != null)
    {
      a(paramSeries.getArea(), paramzaje.g());
    }
    else if (paramSeries.u().h() != null)
    {
      a(paramSeries.u().h(), paramzaje.g());
    }
    else if ((this.i) && (this.b.D()))
    {
      a(this.b.Q().a().d(), paramzaje.g());
      for (i6 = 0; i6 < paramzaje.k().getCount(); i6++) {
        a(this.b.Q().a().d(), paramzaje.k().a(i6).j());
      }
    }
    if (paramSeries.f() != null)
    {
      a(paramSeries.getBorder(), paramzaje.f(), false);
    }
    else if (paramSeries.u().g() != null)
    {
      a(paramSeries.u().g(), paramzaje.f(), false);
    }
    else if ((this.i) && (this.b.D()) && (this.b.Q().a().b() != null) && (!this.b.Q().a().b().h()))
    {
      a(this.b.Q().a().b(), paramzaje.f(), false);
      for (i6 = 0; i6 < paramzaje.k().getCount(); i6++) {
        a(this.b.Q().a().b(), paramzaje.k().a(i6).l(), false);
      }
    }
    int i6 = 0;
    if (paramSeries.c() != null)
    {
      i6 = 1;
      for (i8 = 0; i8 < paramzaje.k().getCount(); i8++) {
        b(paramSeries, paramzaje.k().a(i8), i8);
      }
      if ((paramSeries.getType() == 49) || (paramSeries.getType() == 46)) {
        b(paramSeries, paramzaje.b(), paramzaje.k().getCount());
      }
    }
    else if (((paramSeries.f() != null) && (!paramSeries.getBorder().isAuto())) || ((paramSeries.e() != null) && (paramSeries.getArea().getFormatting() != 0)) || ((paramSeries.w() != null) && (paramSeries.getMarker().getMarkerStyle() != 0)) || ((paramSeries.w() != null) && (paramSeries.getMarker().getBorder().getFormattingType() != 0)) || ((paramSeries.w() != null) && (paramSeries.getMarker().getArea().getFormatting() != 0)))
    {
      i6 = 1;
      for (i8 = 0; i8 < paramzaje.k().getCount(); i8++) {
        a(paramSeries, paramzaje.k().a(i8), i8);
      }
      if ((paramSeries.getType() == 49) || (paramSeries.getType() == 46)) {
        a(paramSeries, paramzaje.b(), paramzaje.k().getCount());
      }
    }
    if ((i6 == 0) && ((paramSeries.getType() == 49) || (paramSeries.getType() == 46))) {
      a(paramSeries, paramzaje.b(), paramzaje.k().getCount());
    }
    if (paramzaje.h().d() != 1) {
      switch (paramzaje.m())
      {
      case 62: 
        paramzaje.c(61);
        break;
      case 64: 
        paramzaje.c(63);
        break;
      }
    }
    paramzaje.a(paramSeries.getPlotOnSecondAxis());
    paramzaje.c(paramSeries.isColorVaried());
    if (paramSeries.r() != null)
    {
      a(paramSeries.getDataLabels(), paramzaje.c(), paramSeries.getType(), 0);
      if (i6 == 0) {
        for (i8 = 0; i8 < paramzaje.k().getCount(); i8++) {
          a(paramSeries.getDataLabels(), paramzaje.k().a(i8).p(), paramSeries.getType(), i8);
        }
      }
    }
    if (paramSeries.y() != null) {
      a(paramSeries.getXErrorBar(), paramzaje.e());
    }
    if (paramSeries.z() != null) {
      a(paramSeries.getYErrorBar(), paramzaje.d());
    }
    paramzaje.b(paramSeries.getSmooth());
    paramzaje.d(paramSeries.hasDropLines());
    if (paramSeries.hasDropLines()) {
      a(paramSeries.getDropLines(), paramzaje.n(), false);
    }
    paramzaje.e(paramSeries.hasHiLoLines());
    if (paramSeries.hasHiLoLines()) {
      a(paramSeries.getHiLoLines(), paramzaje.o(), false);
    }
    paramzaje.g(paramSeries.hasLeaderLines());
    if (paramSeries.hasLeaderLines()) {
      a(paramSeries.getLeaderLines(), paramzaje.p(), false);
    }
    paramzaje.f(paramSeries.hasUpDownBars());
    if (paramSeries.hasUpDownBars())
    {
      a(paramSeries.getUpBars(), paramzaje.q());
      a(paramSeries.getDownBars(), paramzaje.r());
    }
    paramzaje.e(paramSeries.getGapWidth());
    paramzaje.f(paramSeries.getOverlap());
    paramzaje.g(paramSeries.getFirstSliceAngle());
    paramzaje.h(paramSeries.getDoughnutHoleSize());
    paramzaje.i(paramSeries.getSecondPlotSize());
    if (!paramSeries.B()) {
      paramzaje.a(paramSeries.getExplosion());
    }
    if (!paramSeries.isAutoSplit())
    {
      paramzaje.m(zko.I(paramSeries.getSplitType()));
      paramzaje.a(paramSeries.getSplitValue());
      if (paramSeries.getSplitType() == 3) {
        paramzaje.a(paramSeries.A());
      }
    }
    else
    {
      paramzaje.m(0);
    }
    paramzaje.h(paramSeries.hasSeriesLines());
    if (paramSeries.hasSeriesLines()) {
      a(paramSeries.getSeriesLines(), paramzaje.s(), false);
    }
    paramzaje.a(paramSeries.b());
    paramzaje.b(paramSeries.E());
    if (!this.i) {
      paramzaje.j(paramSeries.F());
    }
    paramzaje.k(paramSeries.getShadow());
    ArrayList localArrayList3 = zbxz.a(paramzaje.i(), 1, this.b.getChartArea().getFont(), false);
    zbxz.a(localArrayList3, paramzaje.t(), this.c.j().h(), this.c.j().j(), this.c.j().k());
    if ((paramSeries.getType() == 78) && (paramSeries.a().f().length > 0)) {
      for (int i10 = 0; i10 < paramSeries.a().f().length; i10++)
      {
        int i12 = paramSeries.a().f()[i10];
        if (i12 < paramzaje.k().getCount()) {
          paramzaje.k().a(i12).j(true);
        }
      }
    }
    paramzaje.a(paramSeries.a());
  }
  
  private boolean b(int paramInt)
  {
    switch (paramInt)
    {
    case 39: 
    case 42: 
      return true;
    }
    return false;
  }
  
  private void a(Series paramSeries, zahn paramzahn, int paramInt)
    throws Exception
  {
    Line localLine = paramSeries.f() == null ? paramSeries.u().g() : paramSeries.f();
    if (localLine != null) {
      a(localLine, paramzahn.l(), false);
    }
    Area localArea = paramSeries.e() == null ? paramSeries.u().h() : paramSeries.e();
    if (localArea != null) {
      a(localArea, paramzahn.j());
    }
    Marker localMarker = paramSeries.w() == null ? paramSeries.u().f() : paramSeries.w();
    if (localMarker != null) {
      a(localMarker, paramzahn.n());
    }
    DataLabels localDataLabels = paramSeries.r();
    if (localDataLabels != null) {
      a(localDataLabels, paramzahn.p(), paramSeries.getType(), paramInt);
    }
    paramzahn.i(paramSeries.getShadow());
  }
  
  private void b(Series paramSeries, zahn paramzahn, int paramInt)
    throws Exception
  {
    ChartPoint localChartPoint = paramSeries.getPoints().b(paramInt);
    Line localLine;
    Area localArea;
    Marker localMarker;
    DataLabels localDataLabels;
    if (localChartPoint == null)
    {
      paramzahn.i(paramSeries.getShadow());
      localLine = paramSeries.f();
      if (localLine == null) {
        localLine = paramSeries.u().g();
      }
      if (localLine != null) {
        a(localLine, paramzahn.l(), false);
      }
      localArea = paramSeries.e();
      if (localArea == null) {
        localArea = paramSeries.u().h();
      }
      if (localArea != null) {
        a(localArea, paramzahn.j());
      }
      localMarker = paramSeries.w();
      if (localMarker == null) {
        localMarker = paramSeries.u().f();
      }
      if (localMarker != null) {
        a(localMarker, paramzahn.n());
      }
      localDataLabels = paramSeries.r();
      if (localDataLabels != null) {
        a(localDataLabels, paramzahn.p(), paramSeries.getType(), paramInt);
      }
    }
    else
    {
      paramzahn.i(localChartPoint.getShadow());
      if (!localChartPoint.d()) {
        paramzahn.a(localChartPoint.getExplosion());
      }
      localLine = localChartPoint.f() == null ? paramSeries.f() : localChartPoint.f();
      if (localLine == null) {
        localLine = paramSeries.u().g();
      }
      if (localLine != null) {
        a(localLine, paramzahn.l(), false);
      }
      localArea = localChartPoint.g() == null ? paramSeries.e() : localChartPoint.g();
      if (localArea == null) {
        localArea = paramSeries.u().h();
      }
      if (localArea != null) {
        a(localArea, paramzahn.j());
      }
      localMarker = localChartPoint.h() == null ? paramSeries.w() : localChartPoint.h();
      if (localMarker == null) {
        localMarker = paramSeries.u().f();
      }
      if (localMarker != null) {
        a(localMarker, paramzahn.n());
      }
      localDataLabels = localChartPoint.j() == null ? paramSeries.r() : localChartPoint.j();
      if (localDataLabels != null) {
        a(localDataLabels, paramzahn.p(), paramSeries.getType(), paramInt);
      }
    }
  }
  
  private void e()
    throws Exception
  {
    a(this.b.getChartArea(), this.c.j());
    if ((this.i) && (this.b.D())) {
      a(this.b.Q().b().d(), this.c.j().e());
    }
    this.c.j().a(this.b.getChartObject().getWidth());
    this.c.j().b(this.b.getChartObject().getHeight());
    if (this.b.f) {
      this.c.o(this.b.b());
    }
    if (this.b.f) {
      this.c.p(this.b.c());
    }
  }
  
  private void f()
    throws Exception
  {
    a(this.b.getPlotArea(), this.c.C());
    if ((this.i) && (this.b.D())) {
      a(this.b.Q().b().d(), this.c.C().e());
    }
    if ((this.b.k() & 0xFF & 0x18) == 24)
    {
      this.c.C().c(this.b.getPlotArea().q());
      this.c.C().d(this.b.getPlotArea().r());
      this.c.C().a(this.b.getPlotArea().getWidth());
      this.c.C().b(this.b.getPlotArea().getHeight());
    }
    this.c.f(this.b.getPlotArea().isInnerMode());
    if ((this.b.getPlotArea().isInnerMode()) && ((!this.b.getPlotArea().m()) || (!this.b.getPlotArea().p())))
    {
      this.c.C().a(false);
      this.c.C().c(this.b.getPlotArea().getInnerX());
      this.c.C().d(this.b.getPlotArea().getInnerY());
      this.c.C().a(this.b.getPlotArea().getInnerWidth());
      this.c.C().b(this.b.getPlotArea().getInnerHeight());
    }
  }
  
  private void g()
    throws Exception
  {
    a(this.b.getCategoryAxis(), this.c.f());
    a(this.b.getValueAxis(), this.c.F());
    a(this.b.getSecondCategoryAxis(), this.c.h());
    a(this.b.getSecondValueAxis(), this.c.H());
    for (int m = 0; m < this.b.i.getCount(); m++)
    {
      zka localzka = this.b.i.a(m);
      if (ChartCollection.o(localzka.j())) {
        if (localzka.m())
        {
          if (!localzka.M()) {
            this.c.h().j(3);
          }
        }
        else if (!localzka.M()) {
          this.c.f().j(3);
        }
      }
    }
    if (g(this.b)) {
      a(this.b.getSeriesAxis(), this.c.J());
    }
  }
  
  private void a(Axis paramAxis, zagv paramzagv)
    throws Exception
  {
    paramzagv.d(paramAxis.isVisible());
    paramzagv.a(paramAxis.d);
    paramzagv.a(paramAxis.getAxisBetweenCategories());
    if ((!this.i) && (paramAxis.b() == 2)) {
      paramzagv.a(true);
    }
    if (paramAxis.i() != null) {
      a(paramAxis.getAxisLine(), paramzagv.h(), false);
    }
    paramzagv.d(zko.h(paramAxis.getCategoryType()));
    if (paramAxis.getCategoryType() != 1)
    {
      paramzagv.e(paramAxis.isBaseUnitAuto());
      if (!paramAxis.isBaseUnitAuto()) {
        paramzagv.c(zko.f(paramAxis.getBaseUnitScale()));
      }
      paramzagv.g(zko.f(paramAxis.getMajorUnitScale()));
      paramzagv.i(zko.f(paramAxis.getMinorUnitScale()));
    }
    boolean bool = a(paramAxis);
    paramzagv.k(bool);
    paramzagv.e(zko.g(paramAxis.getCrossType()));
    if (paramAxis.getCrossType() == 2)
    {
      paramzagv.a(paramAxis.getCrossAt());
      if ((bool) && (this.i)) {
        paramzagv.a(paramzagv.l() * 0.01D);
      }
    }
    else if ((paramAxis.getCrossType() == 0) && (paramAxis.isLogarithmic()))
    {
      paramzagv.a(1.0D);
    }
    paramzagv.b(paramAxis.isLogarithmic());
    paramzagv.b(paramAxis.getLogBase());
    paramzagv.c(paramAxis.isPlotOrderReversed());
    paramzagv.i(paramAxis.g());
    if (!paramAxis.g())
    {
      paramzagv.c(a(paramAxis.getMajorUnit()));
      if ((bool) && (this.i)) {
        paramzagv.c(paramzagv.x() * 0.01D);
      }
    }
    paramzagv.j(paramAxis.h());
    if (!paramAxis.h())
    {
      paramzagv.e(a(paramAxis.getMinorUnit()));
      if ((bool) && (this.i)) {
        paramzagv.e(paramzagv.B() * 0.01D);
      }
    }
    paramzagv.h(paramAxis.f());
    if (!paramAxis.f())
    {
      if ((paramAxis.getMaxValue() instanceof DateTime)) {
        paramzagv.d(CellsHelper.getDoubleFromDateTime((DateTime)paramAxis.getMaxValue(), this.b.o().a().c().p().getSettings().getDate1904()));
      } else {
        paramzagv.d(a(((Double)paramAxis.getMaxValue()).doubleValue()));
      }
      if ((bool) && (this.i)) {
        paramzagv.d(paramzagv.z() * 0.01D);
      }
    }
    paramzagv.g(paramAxis.e());
    if (!paramAxis.e())
    {
      if ((paramAxis.getMinValue() instanceof DateTime)) {
        paramzagv.f(CellsHelper.getDoubleFromDateTime((DateTime)paramAxis.getMinValue(), this.b.o().a().c().p().getSettings().getDate1904()));
      } else {
        paramzagv.f(a(((Double)paramAxis.getMinValue()).doubleValue()));
      }
      if ((bool) && (this.i)) {
        paramzagv.f(paramzagv.D() * 0.01D);
      }
    }
    if (paramAxis.o() != null) {
      a(paramAxis.getMajorGridLines(), paramzagv.t(), false);
    } else {
      paramzagv.t().a(0);
    }
    if (paramAxis.p() != null) {
      a(paramAxis.getMinorGridLines(), paramzagv.v(), false);
    } else {
      paramzagv.v().a(0);
    }
    if ((paramAxis.n() != null) && (((paramAxis.getTitle().getText() != null) && (!"".equals(paramAxis.getTitle().getText()))) || (paramAxis.getTitle().isAutoText()))) {
      a(paramAxis.getTitle(), paramzagv.L(), false);
    }
    if (paramAxis.j())
    {
      paramzagv.f(zko.q(paramAxis.getMajorTickMark()));
      paramzagv.h(zko.q(paramAxis.getMinorTickMark()));
      paramzagv.j(zko.p(paramAxis.getTickLabelPosition()));
      paramzagv.f(paramAxis.l());
      if (!paramAxis.l())
      {
        paramzagv.k(paramAxis.getTickLabelSpacing());
      }
      else if ((this.i) && (!paramzagv.O()) && ("dateAx".equals(paramAxis.d)))
      {
        paramzagv.k(ze.f(Double.valueOf(paramzagv.x())));
        paramzagv.f(false);
      }
      paramzagv.l(paramAxis.getTickMarkSpacing());
      if (paramAxis.k() != null) {
        a(paramAxis, paramAxis.getTickLabels(), paramzagv.G());
      }
    }
    if (paramAxis.getDisplayUnit() != 0)
    {
      paramzagv.R().a(zko.a(paramAxis.getDisplayUnit()));
      if (paramzagv.R().d() == -11) {
        paramzagv.R().b(paramAxis.getCustUnit());
      }
      if (paramAxis.isDisplayUnitLabelShown())
      {
        paramzagv.R().d(true);
        a(paramAxis.getDisplayUnitLabel(), paramzagv.R());
      }
      else
      {
        paramzagv.R().d(false);
      }
    }
    if (paramAxis.d() != null) {
      a(paramAxis.getArea(), paramzagv.i());
    }
  }
  
  private boolean a(Axis paramAxis)
  {
    if (paramAxis.b() == 1) {
      for (int m = 0; m < this.c.A().getCount(); m++)
      {
        zaje localzaje = this.c.A().a(m);
        if ((!localzaje.j()) && (paramAxis.q()))
        {
          if (zkn.d(localzaje.m())) {
            return true;
          }
        }
        else if ((localzaje.j()) && (!paramAxis.q()) && (zkn.d(localzaje.m()))) {
          return true;
        }
      }
    }
    return false;
  }
  
  private void h()
    throws Exception
  {
    if (!this.b.getShowLegend())
    {
      this.c.d(false);
      return;
    }
    this.c.d(true);
    if (this.b.t() == null) {
      return;
    }
    Legend localLegend = this.b.getLegend();
    zaim localzaim = this.c.y();
    localzaim.a(localLegend.G());
    a(localLegend, localzaim.a());
    localzaim.a(zko.n(localLegend.getPosition()));
    localzaim.b(localLegend.isOverLay());
    localzaim.a().e(localLegend.p());
    localzaim.a().c(localLegend.n());
    localzaim.a().d(localLegend.o());
    if ((!this.i) && (localLegend.getPosition() == 3) && (!localzaim.a().q()) && (this.b.getPlotArea().p()) && (this.b.getPlotArea().m())) {
      localzaim.a().c(true);
    }
    if (!localLegend.p())
    {
      localzaim.a().a(localLegend.getWidth());
      localzaim.a().b(localLegend.getHeight());
    }
    if ((!localLegend.n()) && (!localLegend.p()) && (localLegend.getX() + localLegend.getWidth() > 4000)) {
      localzaim.a().c(4000 - localLegend.getWidth());
    }
    if ((!localLegend.o()) && (!localLegend.p()) && (localLegend.getY() + localLegend.getHeight() > 4000)) {
      localzaim.a().d(4000 - localLegend.getHeight());
    }
    if (localLegend.F() != null) {
      i();
    }
  }
  
  private void i()
    throws Exception
  {
    Legend localLegend = this.b.getLegend();
    zaim localzaim = this.c.y();
    for (int m = 0; m < localLegend.getLegendEntries().getCount(); m++)
    {
      LegendEntry localLegendEntry = localLegend.getLegendEntries().b(m);
      zaio localzaio = localzaim.b().a(localLegendEntry.c());
      localzaio.a(zbxz.a("", localLegendEntry.getFont()));
      if (a(localLegendEntry.getFont())) {
        a(localLegendEntry.getFont(), localzaio.a());
      }
      if (localLegendEntry.getFont().b().a()) {
        localzaio.a(Color.getEmpty());
      } else if (!localLegendEntry.getFont().getColor().isEmpty()) {
        if (localLegendEntry.getFont().getColor().getA() == 0) {
          localzaio.a(Color.fromArgb(localLegendEntry.getFont().getColor().toArgb() | 0xFF000000));
        } else {
          localzaio.a(localLegendEntry.getFont().getColor());
        }
      }
      localzaio.a(localLegendEntry.isDeleted());
    }
  }
  
  private void j()
    throws Exception
  {
    this.c.c(this.b.getShowDataTable());
    Object localObject1 = this.b.getNSeries().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Series)((Iterator)localObject1).next();
      if ((ChartCollection.q(((Series)localObject2).getType())) || (ChartCollection.k(((Series)localObject2).getType())) || (ChartCollection.o(((Series)localObject2).getType())) || (ChartCollection.c(((Series)localObject2).getType())) || (ChartCollection.m(((Series)localObject2).getType())))
      {
        this.c.c(false);
        break;
      }
    }
    if (!this.b.getShowDataTable()) {
      return;
    }
    localObject1 = this.b.getChartDataTable();
    Object localObject2 = this.c.l();
    a(((ChartDataTable)localObject1).getBorder(), ((zahl)localObject2).e(), false);
    if ((((ChartDataTable)localObject1).a() != null) || (((ChartDataTable)localObject1).b() != -1))
    {
      ((zahl)localObject2).a(zbxz.a("", ((ChartDataTable)localObject1).getFont()));
      if (((ChartDataTable)localObject1).getFont().b().a()) {
        ((zahl)localObject2).a(Color.getEmpty());
      } else if (!((ChartDataTable)localObject1).getFont().getColor().isEmpty()) {
        ((zahl)localObject2).a(a(((ChartDataTable)localObject1).getFont().getColor()));
      }
    }
    ((zahl)localObject2).c(((ChartDataTable)localObject1).hasBorderHorizontal());
    ((zahl)localObject2).a(((ChartDataTable)localObject1).getShowLegendKey());
    ((zahl)localObject2).d(((ChartDataTable)localObject1).hasBorderOutline());
    ((zahl)localObject2).b(((ChartDataTable)localObject1).hasBorderVertical());
  }
  
  private void a(Chart paramChart, zjf paramzjf)
    throws Exception
  {
    if ((paramChart.p() == null) || (paramChart.p().getCount() == 0)) {
      return;
    }
    Iterator localIterator = paramChart.getShapes().iterator();
    while (localIterator.hasNext())
    {
      Shape localShape = (Shape)localIterator.next();
      if ((!localShape.isHidden()) && (localShape.getMsoDrawingType() != 5))
      {
        zbni localzbni = paramzjf.ac().b(zbor.c(localShape.getMsoDrawingType()));
        localShape.u = paramChart.n;
        localShape.v = paramChart.o;
        zbor.a(localShape, localzbni, false);
      }
    }
  }
  
  private void a(Chart paramChart, zje paramzje)
    throws Exception
  {
    if ((paramChart.p() == null) || (paramChart.p().getCount() == 0)) {
      return;
    }
    int m = ziy.c;
    Iterator localIterator = paramChart.getShapes().iterator();
    while (localIterator.hasNext())
    {
      Shape localShape = (Shape)localIterator.next();
      if ((!localShape.isHidden()) && (localShape.getMsoDrawingType() != 5))
      {
        zbnh localzbnh = paramzje.X().b(zboq.c(localShape.getMsoDrawingType()));
        zboq.a(localShape, localzbnh);
        float f1 = (paramzje.a() - 2 * m) / paramzje.a();
        float f2 = (paramzje.b() - 2 * m) / paramzje.b();
        if (!localzbnh.k())
        {
          localzbnh.c((int)(localzbnh.h() * f1 + m));
          localzbnh.d((int)(localzbnh.i() * f2 + m));
          localzbnh.a((int)(localzbnh.f() * f1));
          localzbnh.b((int)(localzbnh.g() * f2));
        }
        else
        {
          localzbnh.c((int)(localzbnh.h() * f2 + m));
          localzbnh.d((int)(localzbnh.i() * f1 + m));
          localzbnh.a((int)(localzbnh.f() * f2));
          localzbnh.b((int)(localzbnh.g() * f1));
        }
      }
    }
  }
  
  private ArrayList[] a(boolean paramBoolean, zjk paramzjk, zagz paramzagz)
  {
    boolean bool1;
    if (paramBoolean) {
      bool1 = this.b.getSecondCategoryAxis().hasMultiLevelLabels();
    } else {
      bool1 = this.b.getCategoryAxis().hasMultiLevelLabels();
    }
    int m = 1;
    boolean bool2 = false;
    for (int n = 0; n < this.b.getNSeries().getCount(); n++)
    {
      localObject1 = this.b.getNSeries().get(n);
      localObject2 = this.b.getNSeries().get(n).m();
      if ((((Series)localObject1).getPlotOnSecondAxis() == paramBoolean) && (localObject2 != null) && (((zjk)localObject2).m()))
      {
        bool2 = true;
        break;
      }
    }
    n = 0;
    Object localObject1 = { m };
    Object localObject2 = { n };
    ArrayList localArrayList = paramzjk.a(bool2, (this.h) || (this.j), (int[])localObject1, (boolean[])localObject2);
    m = localObject1[0];
    n = localObject2[0];
    paramzjk.a(localArrayList);
    if ((localArrayList == null) || (localArrayList.size() == 0)) {
      return null;
    }
    if (m == 1)
    {
      boolean bool3 = b(localArrayList);
      for (int i2 = 0; i2 < localArrayList.size(); i2++)
      {
        localObject4 = (zjt)localArrayList.get(i2);
        if ((!this.b.getPlotVisibleCells()) || (((zjt)localObject4).d))
        {
          Object localObject5 = ((zjt)localObject4).a;
          if ((bool3) && (((zjt)localObject4).a != null))
          {
            localObject6 = ((zjt)localObject4).c;
            if ((localObject6 != null) && ("".equals(localObject6))) {
              localObject6 = null;
            }
            zzz localzzz = this.g.getSettings().f().a((String)localObject6, ((zjt)localObject4).a, false);
            localObject5 = localzzz.h();
          }
          Object localObject6 = paramzagz.a(localObject5);
          ((zagy)localObject6).c(((zjt)localObject4).e);
          ((zagy)localObject6).a(((zjt)localObject4).c);
          ((zagy)localObject6).a(zko.J(((zjt)localObject4).g));
          if (((zjt)localObject4).g == 1)
          {
            ((zagy)localObject6).b(((zjt)localObject4).f);
          }
          else if ((((zjt)localObject4).g == 5) && (((zjt)localObject4).f) && (zw.b(((zjt)localObject4).a())))
          {
            ((zagy)localObject6).c(true);
            ((zagy)localObject6).b(((zjt)localObject4).f);
          }
          if (((zjt)localObject4).b != 0) {
            ((zagy)localObject6).a(this.g.getSettings().f().d(((zjt)localObject4).b));
          }
        }
      }
      if (paramzagz.getCount() == 0)
      {
        localObject3 = paramzagz.a("");
        ((zagy)localObject3).c(true);
      }
      return null;
    }
    int i6;
    zjt localzjt;
    if (bool1)
    {
      i1 = localArrayList.size();
      localObject3 = new ArrayList[i1];
      localObject4 = new ArrayList[i1];
      for (i3 = 0; i3 < localObject4.length; i3++)
      {
        localObject3[i3] = ((ArrayList)localArrayList.get(i3));
        localObject4[i3] = new ArrayList();
      }
      localObject3[(i1 - 1)] = ((ArrayList)localArrayList.get(i1 - 1));
      i3 = localObject3[0].size();
      for (i4 = 0; i4 < i3; i4++)
      {
        int i5 = 0;
        for (i6 = 0; i6 < localObject3.length; i6++)
        {
          localzjt = (zjt)localObject3[i6].get(i4);
          if ((!this.b.getPlotVisibleCells()) || (localzjt.d)) {
            if ((i4 != 0) && (i5 == 0) && (i6 != localObject3.length - 1) && (a(localzjt)))
            {
              boolean bool4 = a((ArrayList[])localObject3, i6, i4 + 1);
              boolean bool5 = true;
              if (i4 == i3 - 1) {
                bool5 = a((ArrayList[])localObject3, i6, i3 - 1);
              }
              if ((!bool4) || (!bool5)) {}
            }
            else
            {
              i5 = 1;
              zagy localzagy1;
              if (i6 == 0)
              {
                localzagy1 = paramzagz.a(localzjt.a);
              }
              else
              {
                Object localObject8 = localObject4[(i6 - 1)];
                zagy localzagy2 = (zagy)((ArrayList)localObject8).get(((ArrayList)localObject8).size() - 1);
                localzagy1 = localzagy2.d().a(localzjt.a);
              }
              localzagy1.c(localzjt.e);
              localzagy1.a(localzjt.c);
              localzagy1.a(zko.J(localzjt.g));
              if (localzjt.g == 1) {
                localzagy1.b(localzjt.f);
              }
              if (localzjt.b != 0) {
                localzagy1.a(this.g.getSettings().f().d(localzjt.b));
              }
              zf.a(localObject4[i6], localzagy1);
            }
          }
        }
      }
      return (ArrayList[])localObject4;
    }
    int i1 = localArrayList.size();
    Object localObject3 = new ArrayList[i1];
    Object localObject4 = new ArrayList[i1];
    for (int i3 = 0; i3 < localObject4.length; i3++)
    {
      localObject3[i3] = ((ArrayList)localArrayList.get(i3));
      localObject4[i3] = new ArrayList();
    }
    localObject3[(i1 - 1)] = ((ArrayList)localArrayList.get(i1 - 1));
    i3 = localObject3[0].size();
    for (int i4 = 0; i4 < i3; i4++)
    {
      Object localObject7 = null;
      for (i6 = localObject3.length - 1; i6 >= 0; i6--)
      {
        localzjt = (zjt)localObject3[i6].get(i4);
        if (localzjt != null) {
          if ((localObject7 == null) || ("".equals(localObject7))) {
            localObject7 = localzjt.a();
          } else if ((localzjt.a() != null) && (!"".equals(localzjt.a()))) {
            localObject7 = (String)localObject7 + "\n" + localzjt.a();
          }
        }
      }
      paramzagz.a(localObject7);
    }
    return null;
  }
  
  private boolean a(ArrayList[] paramArrayOfArrayList, int paramInt1, int paramInt2)
  {
    for (int m = paramInt1; (m >= paramInt1) && (m < paramArrayOfArrayList.length); m++)
    {
      ArrayList localArrayList = paramArrayOfArrayList[m];
      for (int n = paramInt2; n < localArrayList.size(); n++)
      {
        zjt localzjt = (zjt)localArrayList.get(n);
        if (!a(localzjt)) {
          return false;
        }
      }
    }
    return true;
  }
  
  private boolean a(zjt paramzjt)
  {
    if (paramzjt.a == null) {
      return true;
    }
    return ((paramzjt.a instanceof String)) && ("".equals((String)paramzjt.a));
  }
  
  private boolean b(ArrayList paramArrayList)
  {
    for (int m = 0; m < paramArrayList.size(); m++)
    {
      zjt localzjt = (zjt)paramArrayList.get(m);
      if (((!this.b.getPlotVisibleCells()) || (localzjt.d)) && (!localzjt.e) && (localzjt.g == 5) && (!localzjt.a().equals(""))) {
        return true;
      }
    }
    return false;
  }
  
  private void k()
  {
    if (this.b.getNSeries().getCount() == 0) {
      return;
    }
    ArrayList localArrayList = new ArrayList();
    Object localObject;
    if (this.i)
    {
      localIterator1 = this.b.q().iterator();
      while (localIterator1.hasNext())
      {
        localObject = (zka)localIterator1.next();
        Iterator localIterator2 = this.b.getNSeries().iterator();
        while (localIterator2.hasNext())
        {
          Series localSeries1 = (Series)localIterator2.next();
          if ((localSeries1.v()) && (localSeries1.u() == localObject))
          {
            int m = 0;
            if (localSeries1.C() >= 0) {
              for (int n = 0; n < localArrayList.size(); n++)
              {
                Series localSeries2 = (Series)localArrayList.get(n);
                if (localSeries1.C() < localSeries2.C())
                {
                  localArrayList.add(n, localSeries1);
                  m = 1;
                  break;
                }
              }
            }
            if (m == 0) {
              zf.a(localArrayList, localSeries1);
            }
          }
        }
      }
    }
    else
    {
      localIterator1 = this.b.getNSeries().iterator();
      while (localIterator1.hasNext())
      {
        localObject = (Series)localIterator1.next();
        if (((Series)localObject).v()) {
          zf.a(localArrayList, localObject);
        }
      }
    }
    Iterator localIterator1 = localArrayList.iterator();
    while (localIterator1.hasNext())
    {
      localObject = (Series)localIterator1.next();
      if ((!((Series)localObject).getPlotOnSecondAxis()) && (!ChartCollection.l(((Series)localObject).getType())) && (((Series)localObject).o() != null)) {
        a(false, ((Series)localObject).o(), this.c.A().a());
      }
    }
    localIterator1 = localArrayList.iterator();
    while (localIterator1.hasNext())
    {
      localObject = (Series)localIterator1.next();
      if ((((Series)localObject).getPlotOnSecondAxis()) && (!ChartCollection.l(((Series)localObject).getType())) && (((Series)localObject).o() != null)) {
        a(true, ((Series)localObject).o(), this.c.A().b());
      }
    }
  }
  
  private String a(Series paramSeries, boolean paramBoolean)
  {
    if (paramSeries.l() != null)
    {
      if ((paramSeries.l() instanceof String)) {
        return paramSeries.getName();
      }
      if (((this.h) || (this.j)) && (paramSeries.c != null)) {
        return paramSeries.c;
      }
      int m = 0;
      zjk localzjk = new zjk(paramSeries.i().e(), null);
      localzjk.c = ((byte[])paramSeries.l());
      if (!zw.b(paramSeries.c))
      {
        localzjk.b = new ArrayList();
        zf.a(localzjk.b, paramSeries.c);
      }
      boolean[] arrayOfBoolean = { m };
      ArrayList localArrayList = localzjk.a(false, (this.h) || (this.j), arrayOfBoolean, true);
      m = arrayOfBoolean[0];
      if ((m != 0) || ((localArrayList != null) && (localArrayList.size() == 0)))
      {
        if (paramSeries.c != null) {
          return paramSeries.c;
        }
      }
      else if ((localArrayList != null) && (localArrayList.size() != 0))
      {
        String str1 = "";
        for (int n = 0; n < localArrayList.size(); n++)
        {
          zjt localzjt = (zjt)localArrayList.get(n);
          String str2 = a(localzjt, this.g);
          if ("".equals(str2))
          {
            if ((str1.length() > 0) && (str1.charAt(str1.length() - 1) != ' ')) {
              str1 = str1 + " ";
            }
          }
          else {
            str1 = str1 + str2;
          }
          if ((n != localArrayList.size() - 1) && (str1.length() > 0) && (str1.charAt(str1.length() - 1) != ' ')) {
            str1 = str1 + " ";
          }
        }
        if ((this.i) && (paramBoolean)) {
          return "".equals(str1) ? " " : str1;
        }
        return str1;
      }
    }
    return null;
  }
  
  static String a(zjt paramzjt, Workbook paramWorkbook)
  {
    switch (paramzjt.g)
    {
    case 1: 
      if ((paramzjt.a != null) && (!"".equals(paramzjt.a())))
      {
        double d1 = 0.0D;
        try
        {
          d1 = ((Double)paramzjt.a).doubleValue();
        }
        catch (Exception localException)
        {
          return paramzjt.a();
        }
        String str2 = null;
        str2 = paramzjt.c;
        if (((str2 == null) || ("".equals(str2))) && (paramzjt.b != 0)) {
          str2 = paramWorkbook.getSettings().f().d(paramzjt.b);
        }
        DateTime localDateTime = CellsHelper.getDateTimeFromDouble(d1, paramWorkbook.getSettings().getDate1904());
        if ((str2 != null) && ("".equals(str2))) {
          str2 = null;
        }
        zzz localzzz2 = paramWorkbook.getSettings().f().a(str2, localDateTime, false);
        return localzzz2.h();
      }
      return paramzjt.a();
    }
    if ((paramzjt.a != null) && (!"".equals(paramzjt.a())))
    {
      String str1 = null;
      str1 = paramzjt.c;
      if (((str1 == null) || ("".equals(str1))) && (paramzjt.b != 0)) {
        str1 = paramWorkbook.getSettings().f().d(paramzjt.b);
      }
      if ((str1 != null) && ("".equals(str1))) {
        str1 = null;
      }
      zzz localzzz1 = paramWorkbook.getSettings().f().a(str1, paramzjt.a, false);
      return localzzz1.h();
    }
    return paramzjt.a();
  }
  
  static boolean a(zjt paramzjt, double[] paramArrayOfDouble)
  {
    switch (paramzjt.g)
    {
    case 0: 
      try
      {
        paramArrayOfDouble[0] = ze.g(paramzjt.a);
      }
      catch (Exception localException)
      {
        paramArrayOfDouble[0] = 0.0D;
      }
      return true;
    case 2: 
    case 5: 
    case 6: 
      paramArrayOfDouble[0] = 0.0D;
      return true;
    case 3: 
      paramArrayOfDouble[0] = 0.0D;
      return false;
    case 1: 
    case 4: 
      if (!"".equals(paramzjt.a()))
      {
        paramArrayOfDouble[0] = ze.g(paramzjt.a);
        return true;
      }
      paramArrayOfDouble[0] = 0.0D;
      return false;
    }
    paramArrayOfDouble[0] = 0.0D;
    return true;
  }
  
  private void a(Workbook paramWorkbook)
  {
    Object localObject1;
    Object localObject2;
    int n;
    int i1;
    int i3;
    if (this.i)
    {
      localObject1 = null;
      if (!a(this.b.O())) {
        localObject1 = this.b.O();
      } else {
        localObject1 = paramWorkbook.d();
      }
      localObject2 = ((zrs)localObject1).e;
      Color[] arrayOfColor = new Color[12];
      for (n = 0; (n < arrayOfColor.length) && (n < localObject2.length); n++) {
        arrayOfColor[n] = localObject2[n].a();
      }
      n = 6;
      if (this.b.D())
      {
        if (this.b.P().a().size() > 0) {
          n = this.b.P().a().size();
        }
        for (i1 = 0; i1 < this.b.P().a().size(); i1++)
        {
          String str = (String)this.b.P().a().get(i1);
          i3 = -1;
          try
          {
            i3 = zp.a(str.substring(6));
          }
          catch (Exception localException) {}
          if ((i3 > 0) && (i3 < 7)) {
            arrayOfColor[(4 + i1)] = localObject2[(4 + i3 - 1)].a();
          }
        }
      }
      this.c.a(arrayOfColor, this.b.P().c(), n, this.b.P().b());
    }
    else
    {
      localObject1 = paramWorkbook.getWorksheets().o().b();
      localObject2 = new Color[((zd)localObject1).b() - 8];
      int m = 0;
      int i2;
      int i4;
      for (n = 24; n < ((zd)localObject1).b(); n++)
      {
        i1 = ((Integer)((zd)localObject1).d(Integer.valueOf(n))).intValue();
        i2 = i1 & 0xFF;
        i3 = (i1 & 0xFF00) >> 8;
        i4 = (i1 & 0xFF0000) >> 16;
        localObject2[(m++)] = Color.fromArgb(i2, i3, i4);
      }
      for (n = 8; n < 24; n++)
      {
        i1 = ((Integer)((zd)localObject1).d(Integer.valueOf(n))).intValue();
        i2 = i1 & 0xFF;
        i3 = (i1 & 0xFF00) >> 8;
        i4 = (i1 & 0xFF0000) >> 16;
        localObject2[(m++)] = Color.fromArgb(i2, i3, i4);
      }
      this.c.a((Color[])localObject2, 0, 6, null);
    }
  }
  
  private boolean a(zrs paramzrs)
  {
    if ((paramzrs == null) || (paramzrs.e == null) || (paramzrs.e.length == 0)) {
      return true;
    }
    for (int m = 0; m < paramzrs.e.length; m++) {
      if (paramzrs.e[m] == null) {
        return true;
      }
    }
    return false;
  }
  
  private void a(Marker paramMarker, zair paramzair)
  {
    if (!paramMarker.a) {
      paramzair.a((int)(paramMarker.getMarkerSize() * zbxp.a() / 72.0F + 0.5F));
    }
    paramzair.b(zko.c(paramMarker.getMarkerStyle()));
    Line localLine = paramMarker.c();
    if (localLine != null) {
      a(localLine, paramzair.b(), false);
    }
    Area localArea = paramMarker.b();
    if (localArea != null) {
      a(localArea, paramzair.a());
    }
  }
  
  private void a(DropBars paramDropBars, zahm paramzahm)
  {
    if (paramDropBars.b() != null) {
      a(paramDropBars.getArea(), paramzahm.e());
    }
    if (paramDropBars.a() != null) {
      a(paramDropBars.getBorder(), paramzahm.g(), false);
    }
  }
  
  private ArrayList a(Series paramSeries, zjk paramzjk)
  {
    int m = 0;
    boolean[] arrayOfBoolean = { m };
    ArrayList localArrayList1 = paramzjk.a(true, (this.h) || (this.j), arrayOfBoolean, false);
    m = arrayOfBoolean[0];
    ArrayList localArrayList2 = new ArrayList();
    int n;
    Object localObject;
    if (localArrayList1.size() == 1)
    {
      n = paramSeries.getPoints().getCount();
      localObject = ((zjt)localArrayList1.get(0)).a;
      for (int i1 = 0; i1 < n; i1++) {
        zf.a(localArrayList2, localObject);
      }
    }
    else
    {
      for (n = 0; n < localArrayList1.size(); n++)
      {
        localObject = ((zjt)localArrayList1.get(n)).a;
        zf.a(localArrayList2, localObject);
      }
    }
    return localArrayList2;
  }
  
  private void a(ErrorBar paramErrorBar, zaia paramzaia)
  {
    paramzaia.b(zko.k(paramErrorBar.getType()));
    paramzaia.a(paramErrorBar.getAmount());
    paramzaia.a(zko.j(paramErrorBar.getDisplayType()));
    if (paramErrorBar.getType() == 0)
    {
      zjk localzjk;
      ArrayList localArrayList;
      if (((paramErrorBar.getDisplayType() == 0) || (paramErrorBar.getDisplayType() == 1)) && (paramErrorBar.c() != null))
      {
        localzjk = paramErrorBar.c();
        if (localzjk.n())
        {
          paramzaia.b(1);
        }
        else
        {
          localArrayList = a(paramErrorBar.d(), localzjk);
          if (localArrayList != null) {
            paramzaia.a(localArrayList);
          }
        }
      }
      if (((paramErrorBar.getDisplayType() == 0) || (paramErrorBar.getDisplayType() == 3)) && (paramErrorBar.b() != null))
      {
        localzjk = paramErrorBar.b();
        if (localzjk.n())
        {
          paramzaia.b(1);
        }
        else
        {
          localArrayList = a(paramErrorBar.d(), localzjk);
          if (localArrayList != null) {
            paramzaia.b(localArrayList);
          }
        }
      }
    }
    paramzaia.a(paramErrorBar.a());
    paramzaia.b(paramErrorBar.getShowMarkerTTop());
    a(paramErrorBar, paramzaia.b(), false);
  }
  
  private void a(DataLabels paramDataLabels, zahx paramzahx, int paramInt1, int paramInt2)
    throws Exception
  {
    if (paramDataLabels.isDeleted())
    {
      paramzahx.c("");
      return;
    }
    Series localSeries1 = null;
    if ((paramDataLabels.R() instanceof Series)) {
      localSeries1 = (Series)paramDataLabels.R();
    }
    int m;
    Object localObject2;
    int i1;
    Object localObject5;
    if (!paramDataLabels.isAutoText())
    {
      if (paramDataLabels.getText() == null)
      {
        paramzahx.c("");
      }
      else
      {
        paramzahx.c(paramDataLabels.getText());
        m = 0;
        localObject1 = null;
        localObject2 = null;
        i1 = -1;
        Object localObject3;
        if ((paramDataLabels.R() instanceof ChartPoint))
        {
          localObject3 = (ChartPoint)paramDataLabels.R();
          localObject2 = ((ChartPoint)localObject3).a().getDataLabels();
          i1 = ((ChartPoint)localObject3).a;
        }
        if ((localObject2 != null) && (((DataLabels)localObject2).i != null))
        {
          localObject3 = new boolean[] { m };
          localObject1 = ((DataLabels)localObject2).i.a(false, false, (boolean[])localObject3, true);
          m = localObject3[0];
        }
        if (paramDataLabels.E() != null)
        {
          boolean bool = false;
          if (paramDataLabels.E().size() > 1)
          {
            bool = a(paramDataLabels.E(), paramDataLabels.getText(), paramDataLabels.getTextDirection(), paramzahx.u());
            if ((localObject1 != null) && (i1 >= 0) && (i1 < ((ArrayList)localObject1).size())) {
              for (int i2 = 0; i2 < paramzahx.u().getCount(); i2++)
              {
                zaiy localzaiy = paramzahx.u().a(i2);
                if (localzaiy.a().indexOf("[CELLRANGE]") >= 0)
                {
                  zjt localzjt = (zjt)((ArrayList)localObject1).get(i1);
                  String str = zra.a(this.c.an(), localzjt.a, localzjt.c, false, this.c.U());
                  localzaiy.a(zw.a(localzaiy.a(), "[CELLRANGE]", str));
                }
              }
            }
          }
          if ((bool) || (paramDataLabels.E().size() == 1))
          {
            localObject5 = (FontSetting)paramDataLabels.E().get(0);
            paramzahx.b().a(zbxz.a("", ((FontSetting)localObject5).getFont()));
            if (((FontSetting)localObject5).getFont().b().a()) {
              paramzahx.b().a(Color.getEmpty());
            } else if (!((FontSetting)localObject5).getFont().getColor().isEmpty()) {
              if (((FontSetting)localObject5).getFont().getColor().getA() == 0) {
                paramzahx.b().a(Color.fromArgb(((FontSetting)localObject5).getFont().getColor().toArgb() | 0xFF000000));
              } else {
                paramzahx.b().a(((FontSetting)localObject5).getFont().getColor());
              }
            }
          }
        }
      }
    }
    else if ((localSeries1 != null) && (localSeries1.f.getShowCellRange()))
    {
      m = 0;
      localObject1 = null;
      localObject2 = localSeries1.getDataLabels();
      i1 = paramInt2;
      Object localObject4;
      if ((localObject2 != null) && (((DataLabels)localObject2).i != null))
      {
        localObject4 = new boolean[] { m };
        localObject1 = ((DataLabels)localObject2).i.a(false, false, (boolean[])localObject4, true);
        m = localObject4[0];
      }
      if ((localObject1 != null) && (i1 >= 0) && (i1 < ((ArrayList)localObject1).size()))
      {
        localObject4 = (zjt)((ArrayList)localObject1).get(i1);
        localObject5 = zra.a(this.c.an(), ((zjt)localObject4).a, ((zjt)localObject4).c, false, this.c.U());
        paramzahx.c((String)localObject5);
      }
    }
    paramzahx.a(paramDataLabels.getShowCategoryName());
    paramzahx.b(paramDataLabels.getShowLegendKey());
    paramzahx.c(paramDataLabels.getShowPercentage());
    paramzahx.e(paramDataLabels.getShowSeriesName());
    paramzahx.d(paramDataLabels.getShowValue());
    paramzahx.f(paramDataLabels.getShowBubbleSize());
    paramzahx.a(paramDataLabels.getSeparatorValue());
    DataLabels localDataLabels = null;
    Object localObject1 = paramDataLabels.R();
    if ((localObject1 instanceof ChartPoint)) {
      localDataLabels = ((ChartPoint)localObject1).a().getDataLabels();
    }
    if (paramDataLabels.n)
    {
      if ((localDataLabels != null) && (!localDataLabels.n)) {
        paramzahx.a(zko.m(localDataLabels.getPosition()));
      } else {
        paramzahx.a(c(paramInt1));
      }
    }
    else {
      paramzahx.a(zko.m(paramDataLabels.getPosition()));
    }
    if (!paramDataLabels.o) {
      paramzahx.b(zko.m(paramDataLabels.Y()));
    }
    a(paramDataLabels, paramzahx.b());
    if ((paramDataLabels.j() == null) && (paramDataLabels.l() == -1) && (paramDataLabels.R() != null) && ((paramDataLabels.R() instanceof ChartPoint)))
    {
      localObject2 = (ChartPoint)paramDataLabels.R();
      Series localSeries2 = ((ChartPoint)localObject2).a();
      if ((localSeries2.getDataLabels().j() != null) || (localSeries2.getDataLabels().l() != -1))
      {
        paramzahx.b().a(zbxz.a("", localSeries2.getDataLabels().getFont()));
        if (localSeries2.getDataLabels().getFont().b().a()) {
          paramzahx.b().a(Color.getEmpty());
        } else if (!localSeries2.getDataLabels().getFont().getColor().isEmpty()) {
          if (localSeries2.getDataLabels().getFont().getColor().getA() == 0) {
            paramzahx.b().a(Color.fromArgb(localSeries2.getDataLabels().getFont().getColor().toArgb() | 0xFF000000));
          } else {
            paramzahx.b().a(localSeries2.getDataLabels().getFont().getColor());
          }
        }
      }
    }
    paramzahx.i(paramDataLabels.getNumberFormatLinked());
    if (!paramDataLabels.getNumberFormatLinked()) {
      if (paramDataLabels.getNumber() != 0)
      {
        paramzahx.b(this.g.getSettings().f().d(paramDataLabels.getNumber()));
      }
      else if ((paramDataLabels.getNumberFormat() != null) && (!"".equals(paramDataLabels.getNumberFormat())))
      {
        paramzahx.b(paramDataLabels.getNumberFormat());
        int n = b(paramzahx.p());
        if (n != 0) {
          paramzahx.b(this.g.getSettings().f().d(n));
        }
      }
    }
    paramzahx.d(paramDataLabels.getRotationAngle());
    paramzahx.e(zko.o(paramDataLabels.getTextHorizontalAlignment()));
    paramzahx.f(zko.o(paramDataLabels.getTextVerticalAlignment()));
    paramzahx.g(paramDataLabels.H());
    paramzahx.g(paramDataLabels.getTextDirection());
    paramzahx.h(paramDataLabels.I());
    if (paramDataLabels.I())
    {
      paramzahx.d(0);
      paramzahx.g(2);
    }
    if (paramDataLabels.x())
    {
      paramzahx.b().b(true);
      paramzahx.b().c(paramDataLabels.getX());
      paramzahx.b().d(paramDataLabels.getY());
      paramzahx.b().a(paramDataLabels.getWidth());
      paramzahx.b().b(paramDataLabels.getHeight());
    }
    else if (paramDataLabels.y())
    {
      paramzahx.b().b(false);
      paramzahx.b().c(paramDataLabels.z());
      paramzahx.b().d(paramDataLabels.A());
    }
    if (!paramDataLabels.p())
    {
      paramzahx.b().a(paramDataLabels.getWidth());
      paramzahx.b().b(paramDataLabels.getHeight());
    }
    paramzahx.j(paramDataLabels.isTextWrapped());
  }
  
  boolean a(ArrayList paramArrayList, String paramString, int paramInt, zaiz paramzaiz)
    throws Exception
  {
    boolean bool = true;
    Color localColor1 = Color.getEmpty();
    Object localObject = null;
    for (int m = 0; m < paramArrayList.size(); m++)
    {
      FontSetting localFontSetting = (FontSetting)paramArrayList.get(m);
      String str = paramString.substring(localFontSetting.getStartIndex(), localFontSetting.getStartIndex() + localFontSetting.getLength());
      com.aspose.cells.b.a.b.zg localzg = zbxz.a("", localFontSetting.getFont());
      zzo localzzo = b(localFontSetting.getFont());
      if (m == 0)
      {
        localObject = localzg;
        localColor1 = localFontSetting.getFont().getColor();
      }
      else if (bool)
      {
        if ((!a((com.aspose.cells.b.a.b.zg)localObject, localzg)) || (!a(localColor1, localFontSetting.getFont().getColor()))) {
          bool = false;
        }
        if ((a(localFontSetting.getFont())) || (a(str))) {
          bool = false;
        }
      }
      Color localColor2 = Color.a(255, localFontSetting.getFont().getColor());
      ArrayList localArrayList = zbxz.a(str, paramInt, localFontSetting.getFont(), false);
      zbda localzbda = new zbda();
      zbxz.a(localArrayList, localzbda, localzg, localColor2, localzzo);
      if (localArrayList.size() > 0) {
        for (int n = 0; n < localArrayList.size(); n++) {
          paramzaiz.a(localzbda.a(n).a(), localzbda.a(n).b(), localzbda.a(n).c(), localzbda.a(n).d(), 2);
        }
      } else {
        paramzaiz.a(str, localzg, localColor2, localzzo, 2);
      }
    }
    if (bool) {
      paramzaiz.clear();
    }
    return bool;
  }
  
  private boolean a(Color paramColor1, Color paramColor2)
  {
    if (paramColor1.getR() != paramColor2.getR()) {
      return false;
    }
    if (paramColor1.getG() != paramColor2.getG()) {
      return false;
    }
    return paramColor1.getB() == paramColor2.getB();
  }
  
  private boolean a(String paramString)
  {
    if (paramString.indexOf("[SERIES NAME]") >= 0) {
      return true;
    }
    if (paramString.indexOf("[CATEGORY NAME]") >= 0) {
      return true;
    }
    if (paramString.indexOf("[VALUE]") >= 0) {
      return true;
    }
    if (paramString.indexOf("[CELLRANGE]") >= 0) {
      return true;
    }
    return paramString.indexOf("[PERCENTAGE]") >= 0;
  }
  
  private int c(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 7: 
    case 8: 
    case 10: 
    case 11: 
    case 15: 
    case 16: 
    case 19: 
    case 20: 
    case 22: 
    case 23: 
    case 25: 
    case 26: 
    case 29: 
    case 30: 
    case 32: 
    case 33: 
    case 35: 
    case 36: 
    case 51: 
    case 52: 
    case 54: 
    case 55: 
      return 1;
    case 6: 
    case 9: 
    case 14: 
    case 17: 
    case 18: 
    case 21: 
    case 24: 
    case 27: 
    case 28: 
    case 31: 
    case 34: 
    case 50: 
    case 53: 
    case 56: 
      return 4;
    case 12: 
    case 13: 
    case 37: 
    case 38: 
    case 39: 
    case 40: 
    case 41: 
    case 42: 
    case 43: 
    case 60: 
    case 61: 
    case 62: 
    case 63: 
    case 64: 
      return 8;
    case 44: 
    case 45: 
    case 46: 
    case 47: 
    case 48: 
    case 49: 
      return 0;
    }
    return 1;
  }
  
  private boolean g(Chart paramChart)
  {
    switch (paramChart.getType())
    {
    case 3: 
    case 17: 
    case 27: 
    case 34: 
    case 43: 
    case 56: 
      return true;
    }
    return false;
  }
  
  private double a(double paramDouble)
  {
    if (paramDouble > 1.0D) {
      return paramDouble;
    }
    int m = b(paramDouble);
    if (m > 15)
    {
      double d1 = paramDouble * Math.pow(10.0D, m - 15 - 1);
      double d2 = com.aspose.cells.b.a.zr.b(d1, 15);
      double d3 = d2 * Math.pow(10.0D, 16 - m);
      return d3;
    }
    return paramDouble;
  }
  
  private int b(double paramDouble)
  {
    char c1 = ze.a(zc.a().c());
    int m = 1;
    String str1 = "";
    String str2 = zo.b(paramDouble);
    int n = str2.indexOf("E");
    int i1 = str2.indexOf("e");
    int i3;
    if ((n > 0) || (i1 > 0))
    {
      String[] arrayOfString;
      if (n > 0) {
        arrayOfString = zw.d(str2, 'E');
      } else {
        arrayOfString = zw.d(str2, 'e');
      }
      if (arrayOfString[0].charAt(0) == '-') {
        arrayOfString[0] = arrayOfString[0].substring(1);
      }
      i3 = arrayOfString[0].indexOf(c1);
      int i4 = Math.abs(ze.f(arrayOfString[1]));
      int i5;
      if (i3 > 0)
      {
        str1 = arrayOfString[0].substring(0, 0 + i3) + arrayOfString[0].substring(i3 + 1);
        if (arrayOfString[1].charAt(0) == '-')
        {
          i5 = i4 - (i3 - 1);
          if (i5 > 0)
          {
            while (i5 > 0)
            {
              str1 = "0" + str1;
              i5--;
            }
            str1 = Character.toString(str1.charAt(0)) + c1 + str1.substring(1);
          }
          else if (i5 < 0)
          {
            str1 = str1.substring(0, 0 + (i3 + i5)) + c1 + str1.substring(i3 + i5);
          }
        }
        else
        {
          while (i4 > 0)
          {
            str1 = str1 + "0";
            i4--;
          }
        }
      }
      else
      {
        str1 = arrayOfString[0];
        if (arrayOfString[1].charAt(0) == '-')
        {
          i5 = i4 - (str1.length() - 1);
          if (i5 > 0)
          {
            while (i5 > 0)
            {
              str1 = "0" + str1;
              i5--;
            }
            str1 = Character.toString(str1.charAt(0)) + c1 + str1.substring(1);
          }
          else if (i5 < 0)
          {
            str1 = str1.substring(0, 0 + (str1.length() + i5)) + c1 + str1.substring(str1.length() + i5);
          }
        }
        else
        {
          while (i4 > 0)
          {
            str1 = str1 + "0";
            i4--;
          }
        }
      }
      str2 = str1;
    }
    int i2 = str2.indexOf(c1, 0);
    if (i2 > 0) {
      for (i3 = i2 + 1; i3 < str2.length(); i3++) {
        m++;
      }
    }
    return m;
  }
  
  private void a(DisplayUnitLabel paramDisplayUnitLabel, zahz paramzahz)
    throws Exception
  {
    a(paramDisplayUnitLabel, paramzahz.c());
    paramzahz.d(zko.o(paramDisplayUnitLabel.getTextHorizontalAlignment()));
    paramzahz.e(zko.o(paramDisplayUnitLabel.getTextVerticalAlignment()));
    paramzahz.c(paramDisplayUnitLabel.getRotationAngle());
    paramzahz.b(paramDisplayUnitLabel.H());
    paramzahz.f(paramDisplayUnitLabel.getTextDirection());
    paramzahz.c(paramDisplayUnitLabel.I());
    if (paramDisplayUnitLabel.I())
    {
      paramzahz.c(0);
      paramzahz.f(2);
    }
    if ((paramDisplayUnitLabel.getText() != null) && (!"".equals(paramDisplayUnitLabel.getText()))) {
      paramzahz.a(paramDisplayUnitLabel.getText());
    }
    if (paramDisplayUnitLabel.x())
    {
      paramzahz.c().b(true);
      paramzahz.c().c(paramDisplayUnitLabel.getX());
      paramzahz.c().d(paramDisplayUnitLabel.getY());
      paramzahz.c().a(paramDisplayUnitLabel.getWidth());
      paramzahz.c().b(paramDisplayUnitLabel.getHeight());
    }
    else if (paramDisplayUnitLabel.y())
    {
      paramzahz.c().b(false);
      paramzahz.c().c(paramDisplayUnitLabel.z());
      paramzahz.c().d(paramDisplayUnitLabel.A());
    }
  }
  
  private void a(Axis paramAxis, TickLabels paramTickLabels, zajr paramzajr)
    throws Exception
  {
    if ((paramTickLabels.a() != null) || (paramTickLabels.b() != -1))
    {
      paramzajr.a(zbxz.a("", paramTickLabels.getFont()));
      if (paramTickLabels.getFont().b().a()) {
        paramzajr.a(Color.getEmpty());
      } else if (!paramTickLabels.getFont().getColor().isEmpty()) {
        paramzajr.a(a(paramTickLabels.getFont().getColor()));
      }
    }
    paramzajr.a(paramTickLabels.getNumberFormatLinked());
    if (!paramTickLabels.getNumberFormatLinked())
    {
      int m = paramTickLabels.getNumber();
      String str = paramTickLabels.getNumberFormat();
      if ((m != 0) || (!paramTickLabels.a))
      {
        paramzajr.a(this.g.getSettings().f().d(m));
      }
      else if ((str != null) && (!"".equals(str)))
      {
        paramzajr.a(str);
        int n = b(paramzajr.b());
        if (n != 0) {
          paramzajr.a(this.g.getSettings().f().d(n));
        }
      }
    }
    paramzajr.a(paramTickLabels.getOffset());
    if (!paramTickLabels.c()) {
      paramzajr.b(paramTickLabels.getRotationAngle());
    }
    paramzajr.b(paramTickLabels.e());
    paramzajr.c(paramTickLabels.getTextDirection());
    paramzajr.a(paramTickLabels.getFont());
    paramzajr.c(paramTickLabels.f());
    if (paramTickLabels.f())
    {
      paramzajr.b(0);
      paramzajr.c(2);
    }
  }
  
  private void a(ChartFrame paramChartFrame, zahm paramzahm)
    throws Exception
  {
    boolean bool = paramChartFrame.f() == 0;
    a(paramChartFrame.getBorder(), paramzahm.g(), bool);
    a(paramChartFrame.getArea(), paramzahm.e());
    Font localFont = paramChartFrame.j();
    if (localFont != null)
    {
      paramzahm.a(zbxz.a("", localFont));
      if (a(localFont)) {
        a(localFont, paramzahm.k());
      }
      if (localFont.b().a()) {
        paramzahm.a(Color.getEmpty());
      } else if ((!localFont.k()) && (!localFont.getColor().isEmpty())) {
        if (localFont.getColor().getA() == 0) {
          paramzahm.a(Color.fromArgb(localFont.getColor().toArgb() | 0xFF000000));
        } else {
          paramzahm.a(localFont.getColor());
        }
      }
    }
    if ((paramChartFrame.f() != 5) && ((!paramChartFrame.m()) || (!paramChartFrame.p())))
    {
      paramzahm.a(false);
      paramzahm.c(paramChartFrame.q());
      paramzahm.d(paramChartFrame.r());
      paramzahm.a(paramChartFrame.getWidth());
      paramzahm.b(paramChartFrame.getHeight());
    }
  }
  
  private void a(Title paramTitle, zajs paramzajs, boolean paramBoolean)
    throws Exception
  {
    a(paramTitle.getBorder(), paramzajs.a().g(), false);
    a(paramTitle.getArea(), paramzajs.a().e());
    if ((paramTitle.j() != null) || (paramTitle.l() != -1))
    {
      paramzajs.a().a(zbxz.a("", paramTitle.getFont()));
      if (a(paramTitle.getFont())) {
        a(paramTitle.getFont(), paramzajs.a().k());
      }
      if (paramTitle.getFont().b().a()) {
        paramzajs.a().a(Color.getEmpty());
      } else if ((!paramTitle.getFont().k()) && (!paramTitle.getFont().getColor().isEmpty())) {
        if (paramTitle.getFont().getColor().getA() == 0) {
          paramzajs.a().a(Color.fromArgb(paramTitle.getFont().getColor().toArgb() | 0xFF000000));
        } else {
          paramzajs.a().a(paramTitle.getFont().getColor());
        }
      }
    }
    else if ((this.i) && ((paramTitle.getChart().getChartArea().j() == null) || (paramTitle.getChart().getChartArea().l() == -1)))
    {
      paramzajs.a().a(zbxz.a("", paramTitle.getFont()));
    }
    if (this.i)
    {
      if (!paramTitle.m())
      {
        paramzajs.a().c(paramTitle.q());
        paramzajs.a().d(paramTitle.r());
      }
      paramzajs.a().b((paramTitle.d()) || (paramTitle.e()));
      paramzajs.a(paramTitle.getOverLay());
    }
    else if (!paramTitle.m())
    {
      if (paramTitle.x())
      {
        paramzajs.a().b(true);
        paramzajs.a().c(paramTitle.getX());
        paramzajs.a().d(paramTitle.getY());
      }
      else if (paramTitle.y())
      {
        paramzajs.a().b(false);
        paramzajs.a().c(paramTitle.z());
        paramzajs.a().d(paramTitle.A());
      }
    }
    paramzajs.a().e(true);
    paramzajs.a(paramTitle.getRotationAngle());
    if (paramTitle.isAutoText())
    {
      if (paramBoolean)
      {
        if (this.i) {
          if (((this.b.getNSeries().getCount() == 1) || (ChartCollection.c(this.b.getType()))) && (this.b.getNSeries().get(0).getName() != null))
          {
            String str = a(this.b.getNSeries().get(0), true);
            if (str != null) {
              this.c.L().a(str);
            } else {
              paramzajs.a("Chart Title");
            }
          }
          else
          {
            paramzajs.a("Chart Title");
          }
        }
      }
      else if (paramTitle.k != null) {
        paramzajs.a("Axis Title");
      }
    }
    else if (paramzajs.b() == null)
    {
      paramzajs.a("");
    }
    else
    {
      paramzajs.a(paramTitle.getText());
      if (paramTitle.E() != null)
      {
        boolean bool = false;
        if (paramTitle.E().size() > 1) {
          bool = a(paramTitle.E(), paramTitle.getText(), paramTitle.getTextDirection(), paramzajs.d());
        }
        if ((bool) || (paramTitle.E().size() == 1))
        {
          FontSetting localFontSetting = (FontSetting)paramTitle.E().get(0);
          paramzajs.a().a(zbxz.a("", localFontSetting.getFont()));
          if (localFontSetting.getFont().b().a()) {
            paramzajs.a().a(Color.getEmpty());
          } else if (!localFontSetting.getFont().getColor().isEmpty()) {
            if (localFontSetting.getFont().getColor().getA() == 0) {
              paramzajs.a().a(Color.fromArgb(localFontSetting.getFont().getColor().toArgb() | 0xFF000000));
            } else {
              paramzajs.a().a(localFontSetting.getFont().getColor());
            }
          }
        }
      }
    }
    paramzajs.b(zko.o(paramTitle.getTextHorizontalAlignment()));
    paramzajs.c(zko.o(paramTitle.getTextVerticalAlignment()));
    paramzajs.b(paramTitle.H());
    paramzajs.d(paramTitle.getTextDirection());
    paramzajs.c(paramTitle.I());
    if (paramTitle.I())
    {
      paramzajs.a(0);
      paramzajs.d(2);
    }
    if (paramzajs.d().getCount() == 0)
    {
      ArrayList localArrayList = zbxz.a(paramzajs.b(), paramTitle.getTextDirection(), paramTitle.getFont(), false);
      zbxz.a(localArrayList, paramzajs.d(), paramzajs.a().h(), paramzajs.a().j(), paramzajs.a().k());
    }
  }
  
  private boolean a(com.aspose.cells.b.a.b.zg paramzg1, com.aspose.cells.b.a.b.zg paramzg2)
  {
    if (!zw.b(paramzg1.g(), paramzg2.g())) {
      return false;
    }
    if (paramzg1.h() != paramzg2.h()) {
      return false;
    }
    if (paramzg1.c() != paramzg2.c()) {
      return false;
    }
    if (paramzg1.f() != paramzg2.f()) {
      return false;
    }
    if (paramzg1.j() != paramzg2.j()) {
      return false;
    }
    return paramzg1.l() == paramzg2.l();
  }
  
  private boolean a(Font paramFont)
  {
    if (((paramFont.isSubscript()) || (paramFont.isSuperscript())) && (paramFont.getScriptOffset() != 0.0D)) {
      return true;
    }
    if (paramFont.getCapsType() != 0) {
      return true;
    }
    return paramFont.isNormalizeHeights();
  }
  
  private zzo b(Font paramFont)
  {
    zzo localzzo = new zzo();
    localzzo.a(paramFont.isStrikeout());
    localzzo.b(paramFont.getStrikeType() == 1);
    localzzo.c(paramFont.isSuperscript());
    localzzo.d(paramFont.isSubscript());
    localzzo.a(paramFont.getScriptOffset());
    localzzo.e(paramFont.getCapsType() == 2);
    localzzo.f(paramFont.getCapsType() == 1);
    localzzo.g(paramFont.isNormalizeHeights());
    return localzzo;
  }
  
  private void a(Font paramFont, zaid paramzaid)
  {
    paramzaid.a(paramFont.isStrikeout());
    paramzaid.b(paramFont.getStrikeType() == 1);
    paramzaid.c(paramFont.isSuperscript());
    paramzaid.d(paramFont.isSubscript());
    paramzaid.a(paramFont.getScriptOffset());
    paramzaid.e(paramFont.getCapsType() == 2);
    paramzaid.f(paramFont.getCapsType() == 1);
    paramzaid.g(paramFont.isNormalizeHeights());
  }
  
  private void a(Line paramLine, zaip paramzaip, boolean paramBoolean)
  {
    if (paramLine == null) {
      return;
    }
    if (!paramLine.isVisible())
    {
      paramzaip.a(0);
      return;
    }
    if (paramLine.isAuto())
    {
      paramzaip.a(1);
      if ((paramzaip instanceof zanr)) {
        a(paramLine, (zanr)paramzaip);
      }
      return;
    }
    paramzaip.a(zko.s(paramLine.getFormattingType()));
    if (paramLine.getColor().isEmpty())
    {
      paramzaip.a(true);
    }
    else
    {
      paramzaip.a(false);
      paramzaip.a(a(paramLine.getColor(), paramLine.i()));
      if ((paramLine.b != null) && (paramLine.b.i())) {
        paramzaip.a(paramLine.b);
      }
    }
    if (this.i)
    {
      if (paramLine.k()) {
        paramzaip.b().a(paramLine.getWeightPt() * zbxp.a() / 72.0D);
      }
      paramzaip.b().a(zko.w(paramLine.getCompoundType()));
      paramzaip.b().b(zko.t(paramLine.getDashType()));
      paramzaip.b().c(zko.x(paramLine.getCapType()));
      paramzaip.b().d(zko.y(paramLine.getJoinType()));
      paramzaip.b().g(zko.A(paramLine.getBeginArrowLength()));
      paramzaip.b().e(zko.z(paramLine.getBeginType()));
      paramzaip.b().f(zko.B(paramLine.getBeginArrowWidth()));
      paramzaip.b().j(zko.A(paramLine.getEndArrowLength()));
      paramzaip.b().h(zko.z(paramLine.getEndType()));
      paramzaip.b().i(zko.B(paramLine.getEndArrowWidth()));
      if (paramLine.getGradientFill() != null) {
        a(paramLine.getGradientFill(), paramzaip.d());
      }
    }
    else
    {
      paramzaip.b().b(zko.u(paramLine.getStyle()));
      double d1 = zko.v(paramLine.getWeight());
      paramzaip.b().a(d1);
    }
  }
  
  private void a(Line paramLine, zanr paramzanr)
  {
    switch (paramzanr.k())
    {
    case 2: 
    case 3: 
    case 4: 
    case 13: 
      LineFormat localLineFormat = this.b.O().e();
      if (localLineFormat != null)
      {
        Object localObject1 = paramLine.g().a(2);
        if (localObject1 != null) {
          paramzanr.b().c(zko.x(paramLine.getCapType()));
        }
        Object localObject2 = paramLine.g().a(0);
        if (localObject2 != null) {
          paramzanr.b().a(zko.w(paramLine.getCompoundType()));
        }
        if (paramLine.k()) {
          paramzanr.b().a(paramLine.getWeightPt() * zbxp.a() / 72.0D);
        }
      }
      break;
    }
  }
  
  private void a(Area paramArea, zagu paramzagu)
  {
    if (paramArea == null) {
      return;
    }
    if (!(paramArea.a instanceof zju)) {
      paramzagu.b(true);
    }
    paramzagu.a(zko.l(paramArea.getFormatting()));
    if (paramArea.getFormatting() == 2)
    {
      if (!paramArea.getBackgroundColor().isEmpty())
      {
        paramzagu.a(a(paramArea.getBackgroundColor(), paramArea.h()));
        if ((paramArea.e() != null) && (paramArea.e().i())) {
          paramzagu.b(paramArea.e());
        }
      }
      if (!paramArea.getForegroundColor().isEmpty())
      {
        paramzagu.b(a(paramArea.getForegroundColor(), paramArea.h()));
        if ((paramArea.f() != null) && (paramArea.f().i())) {
          paramzagu.a(paramArea.f());
        }
      }
    }
    if (paramArea.b()) {
      a(paramArea.getFillFormat(), paramzagu);
    }
    paramzagu.a(paramArea.getInvertIfNegative());
  }
  
  private void a(FillFormat paramFillFormat, zagu paramzagu)
  {
    zaib localzaib = paramzagu.d();
    Object localObject;
    switch (paramFillFormat.getFillType())
    {
    case 3: 
      paramzagu.a(3);
      a(paramFillFormat.getGradientFill(), localzaib.f());
      break;
    case 5: 
      paramzagu.a(5);
      if ((paramFillFormat.getPatternFill().getPattern() == 0) || (paramFillFormat.getPatternFill().getPattern() == 50))
      {
        paramzagu.a(0);
      }
      else
      {
        localObject = a(paramFillFormat.getPatternFill().getForegroundColor(), paramFillFormat.getPatternFill().e());
        Color localColor = a(paramFillFormat.getPatternFill().getBackgroundColor(), paramFillFormat.getPatternFill().f());
        localzaib.a((Color)localObject, localColor, zko.b(paramFillFormat.getPattern()));
        if ((paramFillFormat.getPatternFill().b != null) && (paramFillFormat.getPatternFill().b.i())) {
          localzaib.b(paramFillFormat.getPatternFill().b);
        }
        if ((paramFillFormat.getPatternFill().d() != null) && (paramFillFormat.getPatternFill().d().i())) {
          localzaib.a(paramFillFormat.getPatternFill().d());
        }
      }
      break;
    case 4: 
      if (paramFillFormat.getTextureFill().getImageData() == null) {
        paramzagu.a(0);
      } else {
        try
        {
          paramzagu.a(4);
          localObject = paramFillFormat.getTextureFill().getImageData();
          a(paramFillFormat, paramFillFormat.getTextureFill(), localzaib.g());
          localzaib.g().a((byte[])localObject);
        }
        catch (Exception localException)
        {
          paramzagu.a(0);
        }
      }
      break;
    }
  }
  
  private void a(GradientFill paramGradientFill, zaih paramzaih)
  {
    paramzaih.a(paramGradientFill.getAngle());
    paramzaih.a(zko.D(paramGradientFill.getFillType()));
    paramzaih.b(zko.E(paramGradientFill.getDirectionType()));
    for (int m = 0; m < paramGradientFill.getGradientStops().getCount(); m++)
    {
      GradientStop localGradientStop = paramGradientFill.getGradientStops().get(m);
      Color localColor = localGradientStop.a.a(this.g, this.b);
      localColor = Color.a(localGradientStop.a() * 255 / 100, localColor);
      paramzaih.d().a(localColor, (float)localGradientStop.getPosition());
      if ((localGradientStop.a != null) && (localGradientStop.a.i())) {
        paramzaih.d().a(m).a(localGradientStop.a);
      }
    }
  }
  
  private void a(FillFormat paramFillFormat, TextureFill paramTextureFill, zajp paramzajp)
  {
    paramzajp.a(paramFillFormat.e());
    if (paramTextureFill == null) {
      return;
    }
    paramzajp.a(paramTextureFill.isTiling());
    if (paramTextureFill.isTiling())
    {
      paramzajp.a(paramTextureFill.getTilePicOption().getOffsetX());
      paramzajp.b(paramTextureFill.getTilePicOption().getOffsetY());
      paramzajp.c(paramTextureFill.getTilePicOption().getScaleX());
      paramzajp.d(paramTextureFill.getTilePicOption().getScaleY());
      paramzajp.b(zko.F(paramTextureFill.getTilePicOption().getAlignmentType()));
      paramzajp.c(zko.G(paramTextureFill.getTilePicOption().getMirrorType()));
    }
    else
    {
      paramzajp.d(zko.H(paramTextureFill.getPicFormatOption().getType()));
      paramzajp.e(paramTextureFill.getPicFormatOption().getLeft());
      paramzajp.f(paramTextureFill.getPicFormatOption().getRight());
      paramzajp.g(paramTextureFill.getPicFormatOption().getTop());
      paramzajp.h(paramTextureFill.getPicFormatOption().getBottom());
      paramzajp.i(paramTextureFill.getPicFormatOption().getScale());
    }
  }
  
  private int b(String paramString)
  {
    if ("m/d/yyyy".equals(paramString.toLowerCase())) {
      return 14;
    }
    return 0;
  }
  
  private void a(zaje paramzaje, Series paramSeries)
    throws Exception
  {
    Iterator localIterator = paramSeries.getTrendLines().iterator();
    while (localIterator.hasNext())
    {
      Trendline localTrendline = (Trendline)localIterator.next();
      int m = zko.r(localTrendline.getType());
      int n = paramzaje.l().b(m);
      zajt localzajt = paramzaje.l().a(n);
      localzajt.c(localTrendline.isNameAuto());
      if (!localTrendline.isNameAuto()) {
        localzajt.a(localTrendline.getName());
      }
      a(localTrendline, localzajt.a(), false);
      if (m == 4) {
        localzajt.a(localTrendline.getOrder());
      } else if (m == 3) {
        localzajt.b(localTrendline.getPeriod());
      }
      localzajt.b(localTrendline.getForward());
      localzajt.a(localTrendline.getBackward());
      a(localTrendline.getDataLabels(), localzajt.b(), paramSeries.getType(), 0);
      if (localTrendline.c()) {
        localzajt.c(localTrendline.getIntercept());
      }
      localzajt.a(localTrendline.getDisplayEquation());
      localzajt.b(localTrendline.getDisplayRSquared());
      localzajt.c(localTrendline.d());
    }
  }
  
  private void a(Floor paramFloor, zaic paramzaic)
  {
    a(paramFloor, paramzaic.d());
    a(paramFloor.getBorder(), paramzaic.b(), false);
  }
  
  private void a(Walls paramWalls, zajv paramzajv)
  {
    a(paramWalls, paramzajv.b());
    a(paramWalls.getBorder(), paramzajv.a(), false);
  }
  
  private Color a(Color paramColor, int paramInt)
  {
    return Color.a(paramInt * 255 / 100, paramColor);
  }
  
  private Color a(Color paramColor)
  {
    return Color.fromArgb(255, paramColor.getR() & 0xFF, paramColor.getG() & 0xFF, paramColor.getB() & 0xFF);
  }
  
  private boolean d(int paramInt)
  {
    switch (paramInt)
    {
    case 37: 
    case 38: 
    case 39: 
    case 40: 
    case 41: 
    case 42: 
    case 43: 
    case 57: 
    case 58: 
    case 60: 
    case 61: 
    case 62: 
    case 63: 
    case 64: 
      return true;
    }
    return false;
  }
  
  protected void finalize()
    throws Exception
  {
    a(false);
  }
  
  public void dispose()
  {
    a(true);
    com.aspose.cells.b.a.zg.a(this);
  }
  
  public void a()
  {
    dispose();
  }
  
  protected void a(boolean paramBoolean)
  {
    if (!this.k)
    {
      if (paramBoolean)
      {
        if (this.d != null)
        {
          this.d.dispose();
          this.d = null;
        }
        if (this.e != null)
        {
          this.e.dispose();
          this.e = null;
        }
      }
      this.k = true;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zkq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */