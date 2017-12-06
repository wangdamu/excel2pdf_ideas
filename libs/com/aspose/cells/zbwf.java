package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Iterator;

class zbwf
  extends ChartTextFrame
{
  private zbwc s;
  private int t;
  private String u;
  private int v;
  private zauc w;
  private Color x;
  private WorksheetCollection y;
  boolean k = true;
  boolean l = false;
  boolean m = true;
  boolean n = false;
  int o;
  zbm p;
  boolean q = false;
  boolean r = false;
  private boolean z;
  
  zbwf(WorksheetCollection paramWorksheetCollection, Chart paramChart)
  {
    super(paramChart);
    this.y = paramWorksheetCollection;
  }
  
  boolean J()
  {
    return this.z;
  }
  
  void m(boolean paramBoolean)
  {
    this.z = paramBoolean;
  }
  
  zbwc K()
  {
    if (this.s == null) {
      this.s = new zbwc();
    }
    return this.s;
  }
  
  void a(Color paramColor)
  {
    this.x = paramColor;
  }
  
  zauc L()
  {
    if (this.w == null) {
      this.w = new zauc();
    }
    return this.w;
  }
  
  zauc M()
  {
    return this.w;
  }
  
  void a(int paramInt)
  {
    this.v = paramInt;
  }
  
  void d(String paramString)
  {
    this.u = paramString;
  }
  
  void n(int paramInt)
  {
    this.k = false;
    this.t = paramInt;
  }
  
  boolean N()
  {
    Font localFont = (Font)this.y.A().get(l() > 4 ? l() - 1 : l());
    return zkp.a(localFont, this.x);
  }
  
  void a(LegendEntry paramLegendEntry)
  {
    if (l() != -1)
    {
      paramLegendEntry.a(l());
      paramLegendEntry.a(this.p != null);
      if (!N()) {
        paramLegendEntry.getFont().setColor(this.x);
      }
    }
    paramLegendEntry.setBackgroundMode(getBackgroundMode());
  }
  
  void a(ChartFrame paramChartFrame, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramChartFrame.a(this.s);
    if (l() != -1)
    {
      paramChartFrame.c(l());
      paramChartFrame.a(this.p != null, this.p);
      if (!N()) {
        paramChartFrame.getFont().setColor(this.x);
      }
    }
    if (!paramBoolean1) {
      if (((paramChartFrame.f() == 3) && (q() > 63536) && (r() > 63536)) || (paramChartFrame.f() == 4) || (paramChartFrame.f() == 5) || (paramChartFrame.f() == 7))
      {
        if ((q() != 0) || (r() != 0))
        {
          paramChartFrame.m(2003);
          paramChartFrame.i(q());
          paramChartFrame.j(r());
          paramChartFrame.k(t());
          paramChartFrame.l(s());
          paramChartFrame.e(n());
          paramChartFrame.f(o());
          paramChartFrame.g(p());
          if ((!paramBoolean2) && ((this.q) || (q() != 0) || (r() != 0)))
          {
            paramChartFrame.e(false);
            paramChartFrame.f(false);
          }
        }
      }
      else if (paramChartFrame.f() != 3)
      {
        paramChartFrame.e(q());
        paramChartFrame.f(r());
        paramChartFrame.h(t());
        paramChartFrame.g(s());
        paramChartFrame.e(n());
        paramChartFrame.f(o());
        paramChartFrame.g(p());
        if ((!paramBoolean2) && ((this.q) || (q() != 0) || (r() != 0)))
        {
          paramChartFrame.e(false);
          paramChartFrame.f(false);
          if ((paramChartFrame.f() == 6) || (paramChartFrame.f() == 5))
          {
            paramChartFrame.i(paramChartFrame.q());
            paramChartFrame.j(paramChartFrame.r());
          }
        }
      }
    }
    paramChartFrame.setBackgroundMode(getBackgroundMode());
    if (!u())
    {
      paramChartFrame.getArea().a(getArea(), null);
      paramChartFrame.getBorder().a(getBorder());
      paramChartFrame.setShadow(getShadow());
      paramChartFrame.h(u());
    }
    if (b() != null) {
      paramChartFrame.a(b());
    }
    if (c() != null) {
      paramChartFrame.b(c());
    }
    if (this.a != null) {
      paramChartFrame.a = this.a;
    }
    if (this.b != null) {
      paramChartFrame.b = this.b;
    }
    if (this.c != null) {
      paramChartFrame.c = this.c;
    }
  }
  
  void a(Legend paramLegend, boolean paramBoolean)
  {
    a(paramLegend, paramBoolean, true);
  }
  
  void a(ChartDataTable paramChartDataTable)
  {
    if (l() != -1)
    {
      paramChartDataTable.a(l());
      paramChartDataTable.a(this.p != null);
      if (!N()) {
        paramChartDataTable.getFont().setColor(this.x);
      }
    }
    if (u()) {
      return;
    }
    paramChartDataTable.getBorder().a(getBorder());
    paramChartDataTable.setBackgroundMode(getBackgroundMode());
  }
  
  void a(Title paramTitle)
  {
    paramTitle.i = this.i;
    paramTitle.getBorder().setVisible(true);
    paramTitle.getBorder().c(true);
    paramTitle.getArea().setFormatting(0);
    a(paramTitle, false, false);
    paramTitle.a(this.s);
    paramTitle.g(true);
    if ((this.o & 0xFFFF & 0x40) != 0)
    {
      paramTitle.b(null);
    }
    else
    {
      paramTitle.b(getText());
      paramTitle.setDeleted(false);
      paramTitle.setAutoText((this.o & 0xFFFF & 0x10) != 0);
    }
    paramTitle.k(H());
    paramTitle.setTextDirection(getTextDirection());
    paramTitle.setTextHorizontalAlignment(getTextHorizontalAlignment());
    paramTitle.setTextVerticalAlignment(getTextVerticalAlignment());
    if (!this.n) {
      paramTitle.setRotationAngle(getRotationAngle());
    }
    if (E() != null) {
      paramTitle.a(E());
    }
    if (!this.r)
    {
      paramTitle.getBorder().setVisible(false);
      paramTitle.getArea().setFormatting(1);
    }
  }
  
  void a(Axis paramAxis, DisplayUnitLabel paramDisplayUnitLabel, ArrayList paramArrayList)
  {
    a(paramDisplayUnitLabel, false, false);
    paramDisplayUnitLabel.setText(getText());
    if ((this.o & 0xFFFF & 0x40) != 0) {
      paramAxis.b(false);
    }
    paramDisplayUnitLabel.i = this.i;
    paramDisplayUnitLabel.k(H());
    paramDisplayUnitLabel.setTextDirection(getTextDirection());
    paramDisplayUnitLabel.setTextHorizontalAlignment(getTextHorizontalAlignment());
    paramDisplayUnitLabel.setTextVerticalAlignment(getTextVerticalAlignment());
    if (!this.n) {
      paramDisplayUnitLabel.setRotationAngle(getRotationAngle());
    }
  }
  
  void a(Chart paramChart, boolean paramBoolean)
  {
    if (paramBoolean) {
      switch (L().a)
      {
      case 2: 
        a(paramChart.getSecondValueAxis().getTitle());
        break;
      case 3: 
        a(paramChart.getSecondCategoryAxis().getTitle());
      }
    } else {
      switch (L().a)
      {
      case 2: 
        a(paramChart.getValueAxis().getTitle());
        break;
      case 3: 
        a(paramChart.getCategoryAxis().getTitle());
        break;
      case 7: 
        a(paramChart.getSeriesAxis().getTitle());
      }
    }
  }
  
  void a(Chart paramChart, ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    int i = paramChart.getType();
    int j = 0;
    DataLabels localDataLabels = null;
    int i1 = -1;
    if ((L().b & 0xFFFF) >= paramArrayList1.size()) {
      return;
    }
    zip localzip = (zip)paramArrayList1.get(L().b & 0xFFFF);
    if (localzip != null)
    {
      Object localObject;
      if (localzip.b == 0)
      {
        localObject = (Series)localzip.a;
        i = ((Series)localObject).getType();
        j = 1;
        if (L().c == 65535)
        {
          i1 = L().b & 0xFFFF;
          localDataLabels = ((Series)localObject).getDataLabels();
        }
        else
        {
          ChartPoint localChartPoint = ((Series)localObject).getPoints().a(L().c & 0xFFFF);
          localDataLabels = localChartPoint.getDataLabels();
        }
      }
      else if (localzip.b == 1)
      {
        localObject = (Trendline)localzip.a;
        localDataLabels = ((Trendline)localObject).getDataLabels();
      }
      else
      {
        return;
      }
    }
    a(localDataLabels, false, false);
    localDataLabels.a(this.m_text);
    localDataLabels.i = this.i;
    localDataLabels.j((this.o & 0xFFFF & 0x10) != 0);
    localDataLabels.setDeleted((this.o & 0xFFFF & 0x40) != 0);
    localDataLabels.a(E());
    localDataLabels.k(H());
    localDataLabels.setTextDirection(getTextDirection());
    localDataLabels.setTextHorizontalAlignment(getTextHorizontalAlignment());
    localDataLabels.setTextVerticalAlignment(getTextVerticalAlignment());
    if (!this.n) {
      localDataLabels.setRotationAngle(getRotationAngle());
    }
    int i2;
    if (!this.k)
    {
      i2 = 0;
      if ((this.t != 9) && (j != 0)) {
        switch (this.t)
        {
        case 3: 
          switch (i)
          {
          case 7: 
          case 8: 
          case 15: 
          case 16: 
            localDataLabels.n(0);
            i2 = 1;
          }
          break;
        }
      }
      if (i2 == 0) {
        localDataLabels.n(this.t);
      }
    }
    localDataLabels.setNumberFormatLinked(this.m);
    if (!this.m) {
      if ((this.u != null) && (!"".equals(this.u))) {
        localDataLabels.d(this.u);
      } else {
        localDataLabels.a(this.v);
      }
    }
    localDataLabels.m(this.l);
    if (L().d)
    {
      i2 = L().e;
      if (i2 == 0)
      {
        localDataLabels.a(1, (this.o & 0xFFFF & 0x4) != 0);
        localDataLabels.a(2, (this.o & 0xFFFF & 0x1000) != 0);
        localDataLabels.a(4, (this.o & 0xFFFF & 0x2000) != 0);
        localDataLabels.a(3, (this.o & 0xFFFF & 0x4000) != 0);
      }
      else
      {
        localDataLabels.a(5, (i2 & 0xFF & 0x1) != 0);
        localDataLabels.a(3, (i2 & 0xFF & 0x2) != 0);
        localDataLabels.a(1, (i2 & 0xFF & 0x4) != 0);
        localDataLabels.a(2, (i2 & 0xFF & 0x8) != 0);
        localDataLabels.a(4, (i2 & 0xFF & 0x10) != 0);
      }
      localDataLabels.setSeparatorValue(L().f);
    }
    else if (localDataLabels.m)
    {
      localDataLabels.a(1, (this.o & 0xFFFF & 0x4) != 0);
      localDataLabels.a(2, (this.o & 0xFFFF & 0x1000) != 0);
      localDataLabels.a(4, (this.o & 0xFFFF & 0x2000) != 0);
      if (ChartCollection.p(i))
      {
        localDataLabels.a(5, (this.o & 0xFFFF & 0x4000) != 0);
        localDataLabels.a(3, false);
      }
      else
      {
        localDataLabels.a(3, (this.o & 0xFFFF & 0x4000) != 0);
      }
    }
    else
    {
      localDataLabels.a(1, (this.o & 0xFFFF & 0x4) != 0);
      localDataLabels.a(2, (this.o & 0xFFFF & 0x1000) != 0);
      localDataLabels.a(4, (this.o & 0xFFFF & 0x2000) != 0);
      localDataLabels.a(3, (this.o & 0xFFFF & 0x4000) != 0);
    }
    if (i1 != -1) {
      b(localDataLabels, i1, paramArrayList2);
    }
  }
  
  void a(DataLabels paramDataLabels, int paramInt, ArrayList paramArrayList)
  {
    a(paramDataLabels, false, false);
    paramDataLabels.a(getText());
    paramDataLabels.j((this.o & 0xFFFF & 0x10) != 0);
    paramDataLabels.k(H());
    paramDataLabels.setTextDirection(getTextDirection());
    paramDataLabels.setTextHorizontalAlignment(getTextHorizontalAlignment());
    paramDataLabels.setTextVerticalAlignment(getTextVerticalAlignment());
    if (!this.n) {
      paramDataLabels.setRotationAngle(getRotationAngle());
    }
    if (!this.k) {
      paramDataLabels.n(this.t);
    }
    paramDataLabels.setNumberFormatLinked(this.m);
    if (!this.m) {
      if ((this.u != null) && (!"".equals(this.u))) {
        paramDataLabels.setNumberFormat(this.u);
      } else {
        paramDataLabels.a(this.v);
      }
    }
    paramDataLabels.setShowLegendKey(this.l);
    if (L().d)
    {
      int i = L().e;
      paramDataLabels.setShowSeriesName((i & 0xFF & 0x1) != 0);
      paramDataLabels.setShowCategoryName((i & 0xFF & 0x2) != 0);
      paramDataLabels.setShowValue((i & 0xFF & 0x4) != 0);
      paramDataLabels.setShowPercentage((i & 0xFF & 0x8) != 0);
      paramDataLabels.setShowBubbleSize((i & 0xFF & 0x10) != 0);
      if (L().f != null) {
        switch (L().f.charAt(0))
        {
        case ',': 
          paramDataLabels.setSeparator(2);
          break;
        case '.': 
          paramDataLabels.setSeparator(4);
          break;
        case ';': 
          paramDataLabels.setSeparator(3);
          break;
        case ' ': 
          paramDataLabels.setSeparator(1);
          break;
        case '\n': 
          paramDataLabels.setSeparator(5);
        }
      }
    }
    else if (paramDataLabels.m)
    {
      paramDataLabels.setShowValue((this.o & 0xFFFF & 0x4) != 0);
      paramDataLabels.setShowPercentage((this.o & 0xFFFF & 0x1000) != 0);
      paramDataLabels.setShowBubbleSize((this.o & 0xFFFF & 0x2000) != 0);
      paramDataLabels.setShowCategoryName((this.o & 0xFFFF & 0x4000) != 0);
    }
    if (paramInt != -1) {
      b(paramDataLabels, paramInt, paramArrayList);
    }
  }
  
  void b(DataLabels paramDataLabels, int paramInt, ArrayList paramArrayList)
  {
    Series localSeries = (Series)paramDataLabels.R();
    if (localSeries.c() == null) {
      return;
    }
    ArrayList localArrayList = new ArrayList();
    zauc localzauc = null;
    int i;
    if (paramArrayList != null) {
      for (i = paramArrayList.size() - 1; i >= 0; i--)
      {
        localzauc = (zauc)paramArrayList.get(i);
        if (((localzauc.b & 0xFFFF) == paramInt) && ((localzauc.c & 0xFFFF) != 65535)) {
          zf.a(localArrayList, Integer.valueOf(localzauc.c));
        }
      }
    }
    if (localArrayList.size() == 0)
    {
      for (i = 0; i < localSeries.getPoints().a(); i++)
      {
        DataLabels localDataLabels1 = localSeries.getPoints().c(i).j();
        if (localDataLabels1 != null) {
          a(paramDataLabels, localDataLabels1);
        }
      }
    }
    else
    {
      i = 1;
      for (int j = 0; j < localSeries.getPoints().a(); j++)
      {
        ChartPoint localChartPoint = localSeries.getPoints().c(j);
        DataLabels localDataLabels2 = localChartPoint.j();
        if (localDataLabels2 != null)
        {
          i = 1;
          Iterator localIterator = localArrayList.iterator();
          while (localIterator.hasNext())
          {
            int i1 = ((Integer)localIterator.next()).intValue();
            if ((i1 & 0xFFFF) == localChartPoint.a)
            {
              i = 0;
              break;
            }
          }
          if (i != 0) {
            a(paramDataLabels, localDataLabels2);
          }
        }
      }
    }
  }
  
  void a(DataLabels paramDataLabels1, DataLabels paramDataLabels2)
  {
    CopyOptions localCopyOptions = null;
    paramDataLabels2.a(paramDataLabels1.getAutoScaleFont(), null);
    paramDataLabels2.d(paramDataLabels1.getBackgroundMode());
    paramDataLabels2.h(paramDataLabels1.u());
    paramDataLabels2.getBorder().a(paramDataLabels1.getBorder());
    paramDataLabels2.getArea().a(paramDataLabels1.getArea(), localCopyOptions);
    paramDataLabels2.c(paramDataLabels1.l());
    Font localFont = paramDataLabels1.j();
    if (localFont != null) {
      paramDataLabels2.getFont().a(localFont, null);
    }
    paramDataLabels2.n(paramDataLabels1.getNumberFormatLinked());
    if (!paramDataLabels1.getNumberFormatLinked()) {
      if ((paramDataLabels1.getNumberFormat() != null) && (!"".equals(paramDataLabels1.getNumberFormat()))) {
        paramDataLabels2.d(paramDataLabels1.getNumberFormat());
      } else {
        paramDataLabels2.a(paramDataLabels1.getNumber());
      }
    }
    paramDataLabels2.setRotationAngle(paramDataLabels1.getRotationAngle());
    paramDataLabels2.setTextHorizontalAlignment(paramDataLabels1.getTextHorizontalAlignment());
    paramDataLabels2.setTextVerticalAlignment(paramDataLabels1.getTextVerticalAlignment());
    paramDataLabels2.setTextDirection(paramDataLabels1.getTextDirection());
    if ((paramDataLabels1.m) && (paramDataLabels1.m))
    {
      if (paramDataLabels1.getShowValue()) {
        paramDataLabels2.setShowValue(true);
      }
      if (paramDataLabels1.getShowPercentage()) {
        paramDataLabels2.setShowPercentage(true);
      }
      if (paramDataLabels1.getShowCategoryName()) {
        paramDataLabels2.setShowCategoryName(true);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbwf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */