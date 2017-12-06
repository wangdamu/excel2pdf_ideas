package com.aspose.cells;

import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;

public class DataLabels
  extends ChartTextFrame
{
  private Object p;
  private byte q;
  private boolean r;
  private int s = 0;
  ArrayList k;
  private boolean t;
  boolean l;
  private boolean u;
  private boolean v;
  private boolean w;
  private boolean x;
  private String y = null;
  private int z = 0;
  private boolean A = true;
  private int B = 0;
  private String C = "";
  boolean m = false;
  private int D = 3;
  boolean n = true;
  private int E = 9;
  boolean o = true;
  private static final za F = new za(new String[] { ", ", ". ", "; ", " ", "\n" });
  
  DataLabels(Object parent, Chart chart)
  {
    super(chart);
    this.p = parent;
    if ((chart != null) && (chart.getChartArea() != null)) {
      this.m_AutoScaleFont = chart.getChartArea().getAutoScaleFont();
    }
    if ((ChartCollection.g(chart.getType())) && (ChartCollection.i(chart.getType()))) {
      this.D = 0;
    }
    if ((parent != null) && ((parent instanceof Trendline))) {
      b(6);
    } else {
      b(5);
    }
  }
  
  public boolean isAutoText()
  {
    return this.m_IsAutoText;
  }
  
  public void setAutoText(boolean value)
  {
    if (value)
    {
      this.m_CharsList = null;
      this.m_text = null;
      this.i = null;
      if ((R() instanceof Series))
      {
        Series localSeries = (Series)R();
        int i = localSeries.getPoints().getCount();
        for (int j = 0; j < i; j++) {
          localSeries.getPoints().get(j).getDataLabels().setAutoText(value);
        }
      }
    }
    this.m_IsAutoText = value;
  }
  
  public String getText()
  {
    if (this.i != null)
    {
      this.m_text = this.i.r();
    }
    else if (Z())
    {
      DataLabels localDataLabels = ((ChartPoint)R()).a().r();
      int i = 0;
      boolean[] arrayOfBoolean = { i };
      ArrayList localArrayList = localDataLabels.i.a(false, false, arrayOfBoolean, true);
      i = arrayOfBoolean[0];
      int j = ((ChartPoint)R()).a;
      if (j < localArrayList.size())
      {
        zjt localzjt = (zjt)localArrayList.get(j);
        Workbook localWorkbook = ((ChartPoint)R()).a().k().d();
        String str = localzjt.c;
        if (((str == null) || ("".equals(str))) && (localzjt.b != 0)) {
          str = localWorkbook.getSettings().f().d(localzjt.b);
        }
        zzz localzzz = localWorkbook.getSettings().f().a(str, localzjt.a, false);
        return localzzz.h();
      }
    }
    return this.m_text;
  }
  
  public void setText(String value)
  {
    this.m_text = value;
    this.i = null;
    this.m_IsAutoText = false;
    if (value == null) {
      this.m_deleted = true;
    } else {
      this.m_deleted = false;
    }
    this.m_CharsList = null;
  }
  
  public boolean isTextWrapped()
  {
    return this.j;
  }
  
  public void setTextWrapped(boolean value)
  {
    this.j = value;
    b((byte)10, value);
  }
  
  boolean J()
  {
    return (getBorder().isVisible()) || (getArea().getFormatting() != 1);
  }
  
  int K()
  {
    if ((this.p instanceof ChartPoint)) {
      return ((ChartPoint)this.p).b();
    }
    if ((this.p instanceof Series)) {
      return ((Series)this.p).getType();
    }
    return 14;
  }
  
  public int getBackgroundMode()
  {
    return this.m_BackgroundMode;
  }
  
  public void setBackgroundMode(int value)
  {
    if ((this.p != null) && ((this.p instanceof Series)))
    {
      Series localSeries = (Series)this.p;
      if (localSeries.c() != null) {
        for (int i = 0; i < localSeries.getPoints().a(); i++)
        {
          ChartPoint localChartPoint = localSeries.getPoints().c(i);
          if (localChartPoint.j() != null) {
            localChartPoint.getDataLabels().setBackgroundMode(value);
          }
        }
      }
    }
    this.m_BackgroundMode = value;
  }
  
  /**
   * @deprecated
   */
  public boolean isValueShown()
  {
    return this.t;
  }
  
  /**
   * @deprecated
   */
  public void setValueShown(boolean value)
  {
    setShowValue(value);
  }
  
  public boolean getShowValue()
  {
    if ((!this.m) && (R() != null) && ((R() instanceof ChartPoint)))
    {
      ChartPoint localChartPoint = (ChartPoint)R();
      Series localSeries = localChartPoint.a();
      if ((localSeries.r() != null) && (localSeries.getDataLabels().m)) {
        return localSeries.getDataLabels().getShowValue();
      }
    }
    return this.t;
  }
  
  public void setShowValue(boolean value)
  {
    a((byte)0, value);
    if (this.t == value) {
      return;
    }
    this.t = value;
    this.m = true;
  }
  
  public boolean getShowCellRange()
  {
    if ((!this.m) && (R() != null) && ((R() instanceof ChartPoint)))
    {
      ChartPoint localChartPoint = (ChartPoint)R();
      Series localSeries = localChartPoint.a();
      if ((localSeries.r() != null) && (localSeries.getDataLabels().m)) {
        return localSeries.getDataLabels().getShowCellRange();
      }
    }
    return this.l;
  }
  
  public void setShowCellRange(boolean value)
  {
    a((byte)11, value);
    if (this.l == value) {
      return;
    }
    this.l = value;
    this.m = true;
  }
  
  void a(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean) {
      this.m = true;
    }
    switch (paramInt)
    {
    case 1: 
      this.t = paramBoolean;
      break;
    case 2: 
      this.u = paramBoolean;
      break;
    case 3: 
      this.w = paramBoolean;
      break;
    case 4: 
      this.v = paramBoolean;
      break;
    case 5: 
      this.x = paramBoolean;
      break;
    case 6: 
      this.l = paramBoolean;
      break;
    }
  }
  
  private void a(byte paramByte, boolean paramBoolean)
  {
    if (!(this.p instanceof Series)) {
      return;
    }
    Series localSeries = (Series)this.p;
    if (localSeries.c() == null) {
      return;
    }
    int i = localSeries.c().getCount();
    for (int j = 0; j < i; j++)
    {
      ChartPoint localChartPoint = localSeries.c().get(j);
      if ((localChartPoint.j() != null) && (!localChartPoint.j().m)) {
        switch (paramByte)
        {
        case 0: 
          localChartPoint.getDataLabels().setShowValue(paramBoolean);
          break;
        case 1: 
          localChartPoint.getDataLabels().setShowPercentage(paramBoolean);
          break;
        case 2: 
          localChartPoint.getDataLabels().setShowCategoryName(paramBoolean);
          break;
        case 3: 
          localChartPoint.getDataLabels().setShowBubbleSize(paramBoolean);
          break;
        case 4: 
          localChartPoint.getDataLabels().setShowSeriesName(paramBoolean);
          break;
        case 5: 
          localChartPoint.getDataLabels().setShowLegendKey(paramBoolean);
          break;
        case 10: 
          localChartPoint.getDataLabels().j = paramBoolean;
          break;
        case 11: 
          localChartPoint.getDataLabels().setShowCellRange(paramBoolean);
        }
      }
    }
  }
  
  private void b(byte paramByte, boolean paramBoolean)
  {
    if (!(this.p instanceof Series)) {
      return;
    }
    Series localSeries = (Series)this.p;
    if (localSeries.c() == null) {
      return;
    }
    int i = localSeries.c().getCount();
    for (int j = 0; j < i; j++)
    {
      ChartPoint localChartPoint = localSeries.c().get(j);
      if (paramByte == 10) {
        localChartPoint.getDataLabels().j = paramBoolean;
      }
    }
  }
  
  /**
   * @deprecated
   */
  public boolean isPercentageShown()
  {
    return this.u;
  }
  
  /**
   * @deprecated
   */
  public void setPercentageShown(boolean value)
  {
    setShowPercentage(value);
  }
  
  public boolean getShowPercentage()
  {
    if ((!this.m) && (R() != null) && ((R() instanceof ChartPoint)))
    {
      ChartPoint localChartPoint = (ChartPoint)R();
      Series localSeries = localChartPoint.a();
      if ((localSeries.r() != null) && (localSeries.getDataLabels().m)) {
        return localSeries.getDataLabels().getShowPercentage();
      }
    }
    return this.u;
  }
  
  public void setShowPercentage(boolean value)
  {
    a((byte)1, value);
    this.m = true;
    if (this.u != value) {
      switch (K())
      {
      case 35: 
      case 36: 
      case 44: 
      case 45: 
      case 46: 
      case 47: 
      case 48: 
      case 49: 
        this.u = value;
        break;
      }
    }
  }
  
  /**
   * @deprecated
   */
  public boolean isBubbleSizeShown()
  {
    return this.v;
  }
  
  /**
   * @deprecated
   */
  public void setBubbleSizeShown(boolean value)
  {
    setShowBubbleSize(value);
  }
  
  public boolean getShowBubbleSize()
  {
    if ((!this.m) && (R() != null) && ((R() instanceof ChartPoint)))
    {
      ChartPoint localChartPoint = (ChartPoint)R();
      Series localSeries = localChartPoint.a();
      if ((localSeries.r() != null) && (localSeries.getDataLabels().m)) {
        return localSeries.getDataLabels().getShowBubbleSize();
      }
    }
    return this.v;
  }
  
  public void setShowBubbleSize(boolean value)
  {
    a((byte)3, value);
    if (this.v != value) {
      switch (K())
      {
      case 12: 
      case 13: 
        this.v = value;
        break;
      }
    }
    this.m = true;
  }
  
  public boolean getShowCategoryName()
  {
    if ((!this.m) && (R() != null) && ((R() instanceof ChartPoint)))
    {
      ChartPoint localChartPoint = (ChartPoint)R();
      Series localSeries = localChartPoint.a();
      if ((localSeries.r() != null) && (localSeries.getDataLabels().m)) {
        return localSeries.getDataLabels().getShowCategoryName();
      }
    }
    return this.w;
  }
  
  public void setShowCategoryName(boolean value)
  {
    a((byte)2, value);
    this.m = true;
    if (this.w != value) {
      this.w = value;
    }
  }
  
  /**
   * @deprecated
   */
  public boolean isCategoryNameShown()
  {
    return this.w;
  }
  
  /**
   * @deprecated
   */
  public void setCategoryNameShown(boolean value)
  {
    setShowCategoryName(value);
  }
  
  /**
   * @deprecated
   */
  public boolean isSeriesNameShown()
  {
    return this.x;
  }
  
  /**
   * @deprecated
   */
  public void setSeriesNameShown(boolean value)
  {
    setShowSeriesName(value);
  }
  
  public boolean getShowSeriesName()
  {
    if ((!this.m) && (R() != null) && ((R() instanceof ChartPoint)))
    {
      ChartPoint localChartPoint = (ChartPoint)R();
      Series localSeries = localChartPoint.a();
      if ((localSeries.r() != null) && (localSeries.getDataLabels().m)) {
        return localSeries.getDataLabels().getShowSeriesName();
      }
    }
    return this.x;
  }
  
  public void setShowSeriesName(boolean value)
  {
    a((byte)4, value);
    this.x = value;
    this.m = true;
  }
  
  /**
   * @deprecated
   */
  public boolean isLegendKeyShown()
  {
    if ((!this.m) && (R() != null) && ((R() instanceof ChartPoint)))
    {
      ChartPoint localChartPoint = (ChartPoint)R();
      Series localSeries = localChartPoint.a();
      if ((localSeries.r() != null) && (localSeries.getDataLabels().m)) {
        return localSeries.getDataLabels().getShowLegendKey();
      }
    }
    return this.r;
  }
  
  /**
   * @deprecated
   */
  public void setLegendKeyShown(boolean value)
  {
    setShowLegendKey(value);
  }
  
  public boolean getShowLegendKey()
  {
    return this.r;
  }
  
  public void setShowLegendKey(boolean value)
  {
    a((byte)5, value);
    this.r = value;
    this.m = true;
  }
  
  void m(boolean paramBoolean)
  {
    this.r = paramBoolean;
  }
  
  public String getNumberFormat()
  {
    Object localObject;
    if ((!O()) && (this.p != null) && ((this.p instanceof ChartPoint)))
    {
      localObject = (ChartPoint)R();
      DataLabels localDataLabels = ((ChartPoint)localObject).a().r();
      if ((localDataLabels != null) && (localDataLabels.O())) {
        return localDataLabels.y;
      }
    }
    if (this.y == null)
    {
      if ((!getNumberFormatLinked()) && (getNumber() != 0)) {
        return getChart().getWorksheet().d().getSettings().f().d(getNumber());
      }
      if (getNumberFormatLinked())
      {
        localObject = aa();
        if (localObject != null) {
          return (String)localObject;
        }
      }
    }
    return this.y;
  }
  
  public void setNumberFormat(String value)
  {
    this.q = ((byte)(this.q | 0x1));
    this.y = value;
    this.z = 0;
    this.A = false;
    if ((this.p != null) && ((this.p instanceof Series)))
    {
      Series localSeries = (Series)this.p;
      if (localSeries.c() != null) {
        for (int i = 0; i < localSeries.getPoints().a(); i++)
        {
          ChartPoint localChartPoint = localSeries.getPoints().c(i);
          if (localChartPoint.j() != null) {
            localChartPoint.getDataLabels().setNumberFormat(value);
          }
        }
      }
    }
  }
  
  private String aa()
  {
    Series localSeries = null;
    ChartPoint localChartPoint = null;
    if (this.p != null) {
      if ((this.p instanceof Series))
      {
        localSeries = (Series)this.p;
      }
      else if ((this.p instanceof ChartPoint))
      {
        localChartPoint = (ChartPoint)R();
        localSeries = localChartPoint.a();
      }
    }
    if ((localSeries != null) && (getNumberFormatLinked()))
    {
      int i = 0;
      boolean[] arrayOfBoolean = { i };
      ArrayList localArrayList = localSeries.m().a(true, false, arrayOfBoolean, false);
      i = arrayOfBoolean[0];
      int j = 0;
      if (localChartPoint != null) {
        j = localChartPoint.a;
      }
      if (localArrayList.size() > j)
      {
        zjt localzjt = (zjt)localArrayList.get(j);
        String str = localzjt.c;
        if (((str == null) || ("".equals(str))) && (localzjt.b != 0)) {
          str = getChart().getWorksheet().d().getSettings().f().d(localzjt.b);
        }
        return str;
      }
    }
    return null;
  }
  
  String L()
  {
    return this.y;
  }
  
  void d(String paramString)
  {
    this.y = paramString;
    this.z = 0;
    this.A = false;
    this.q = ((byte)(this.q | 0x1));
  }
  
  public int getNumber()
  {
    if ((!O()) && (this.p != null) && ((this.p instanceof ChartPoint)))
    {
      ChartPoint localChartPoint = (ChartPoint)R();
      DataLabels localDataLabels = localChartPoint.a().r();
      if ((localDataLabels != null) && (localDataLabels.O()))
      {
        if ((localDataLabels.z >= 0) && (localDataLabels.z < 59)) {
          return (byte)localDataLabels.z;
        }
        return 0;
      }
    }
    if ((this.z >= 0) && (this.z < 59)) {
      return (byte)this.z;
    }
    return 0;
  }
  
  public void setNumber(int value)
  {
    if ((value < 59) && (value >= 0))
    {
      this.y = null;
      this.z = value;
    }
    else
    {
      this.z = value;
    }
    this.A = false;
    this.q = ((byte)(this.q | 0x1));
  }
  
  int M()
  {
    return this.z;
  }
  
  void a(int paramInt)
  {
    this.z = paramInt;
  }
  
  public boolean getNumberFormatLinked()
  {
    if ((!O()) && (this.p != null) && ((this.p instanceof ChartPoint)))
    {
      ChartPoint localChartPoint = (ChartPoint)R();
      DataLabels localDataLabels = localChartPoint.a().r();
      if ((localDataLabels != null) && (localDataLabels.O())) {
        return localDataLabels.A;
      }
    }
    return this.A;
  }
  
  public void setNumberFormatLinked(boolean value)
  {
    this.A = value;
    this.q = ((byte)(this.q | 0x1));
  }
  
  void n(boolean paramBoolean)
  {
    this.A = paramBoolean;
    this.q = ((byte)(this.q | 0x1));
  }
  
  boolean N()
  {
    return this.A;
  }
  
  boolean O()
  {
    return (this.q & 0xFF & 0x1) != 0;
  }
  
  void o(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.q = ((byte)(this.q | 0x1));
    } else {
      this.q = ((byte)(this.q & 0xFE));
    }
  }
  
  public Font getFont()
  {
    Chart localChart = getChart();
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if ((this.m_font == null) && (l() == -1) && (this.p != null) && ((this.p instanceof ChartPoint)))
    {
      localObject1 = (ChartPoint)R();
      localObject2 = ((ChartPoint)localObject1).a().r();
      if (localObject2 != null)
      {
        if ((((DataLabels)localObject2).m_font != null) || (((DataLabels)localObject2).l() != -1))
        {
          this.m_font = new Font(localChart.n(), null, true);
          localObject3 = ((DataLabels)localObject2).getFont();
          this.m_font.a((Font)localObject3, null);
          if (getAutoScaleFont()) {
            this.m_font.a(new zbm(getChart(), ((Font)localObject3).getSize(), true));
          }
          return this.m_font;
        }
        if ((((DataLabels)localObject2).O()) && (!O()))
        {
          this.z = ((DataLabels)localObject2).z;
          this.y = ((DataLabels)localObject2).y;
          o(true);
        }
      }
    }
    if (this.m_font == null)
    {
      this.m_font = new Font(localChart.n(), null, true);
      this.m_font.setSize(10);
      localObject1 = null;
      if (this.m_fontIndex != -1)
      {
        localObject1 = getChart().n().i(this.m_fontIndex);
        this.m_font.a((Font)localObject1, null);
        this.m_font.c(true);
        localObject2 = getChart().e(this.m_fontIndex);
        if (localObject2 != null)
        {
          localObject3 = new zbm(((zbm)localObject2).f, 0, false);
          ((zbm)localObject3).a((zbm)localObject2);
          this.m_font.a((zbm)localObject3);
        }
      }
      else
      {
        localObject1 = localChart.getChartArea().getFont();
        this.m_font.a((Font)localObject1, null);
        if (getAutoScaleFont()) {
          this.m_font.a(new zbm(getChart(), 10, true));
        }
      }
    }
    return this.m_font;
  }
  
  public int getSeparator()
  {
    if ((!Q()) && ((R() instanceof ChartPoint)))
    {
      ChartPoint localChartPoint = (ChartPoint)R();
      DataLabels localDataLabels = localChartPoint.a().r();
      if ((localDataLabels != null) && (localDataLabels.Q())) {
        return localDataLabels.getSeparator();
      }
    }
    if (this.B == 0)
    {
      int i = 14;
      if ((R() instanceof ChartPoint)) {
        i = ((ChartPoint)R()).a().getType();
      } else if ((R() instanceof Series)) {
        i = ((Series)R()).getType();
      }
      if ((ChartCollection.c(i)) && (getShowCategoryName()) && (getShowPercentage()) && (!getShowSeriesName()) && (!getShowValue())) {
        return 5;
      }
    }
    return this.B;
  }
  
  public void setSeparator(int value)
  {
    p(value);
  }
  
  private void p(int paramInt)
  {
    this.B = paramInt;
    q(paramInt);
    this.q = ((byte)(this.q | 0x2));
  }
  
  private void q(int paramInt)
  {
    switch (paramInt)
    {
    case 2: 
      this.C = ", ";
      break;
    case 5: 
      this.C = "\n";
      break;
    case 4: 
      this.C = ". ";
      break;
    case 3: 
      this.C = "; ";
      break;
    case 1: 
      this.C = " ";
      break;
    }
  }
  
  int P()
  {
    return this.B;
  }
  
  boolean Q()
  {
    return (this.q & 0xFF & 0x2) != 0;
  }
  
  public String getSeparatorValue()
  {
    if ((!Q()) && ((R() instanceof ChartPoint)))
    {
      localObject = (ChartPoint)R();
      DataLabels localDataLabels = ((ChartPoint)localObject).a().r();
      if ((localDataLabels != null) && (localDataLabels.Q())) {
        return localDataLabels.getSeparatorValue();
      }
    }
    Object localObject = "";
    if (this.C != null) {
      localObject = this.C;
    } else {
      localObject = "";
    }
    if (("".equals(localObject)) && (!Q()))
    {
      int i = 14;
      if ((R() instanceof ChartPoint)) {
        i = ((ChartPoint)R()).a().getType();
      } else if ((R() instanceof Series)) {
        i = ((Series)R()).getType();
      }
      if ((ChartCollection.c(i)) && (getShowCategoryName()) && (getShowPercentage()) && (!getShowSeriesName()) && (!getShowValue())) {
        return "\n";
      }
    }
    return (String)localObject;
  }
  
  public void setSeparatorValue(String value)
  {
    if ((value == null) || ("".equals(value)))
    {
      setSeparator(0);
    }
    else
    {
      switch (F.a(value))
      {
      case 0: 
        setSeparator(2);
        break;
      case 1: 
        setSeparator(4);
        break;
      case 2: 
        setSeparator(3);
        break;
      case 3: 
        setSeparator(1);
        break;
      case 4: 
        setSeparator(5);
        break;
      default: 
        setSeparator(6);
      }
      if (value.length() > 255) {
        this.C = value.substring(0, 255);
      } else {
        this.C = value;
      }
    }
  }
  
  void a(DataLabels paramDataLabels, CopyOptions paramCopyOptions)
  {
    super.a(paramDataLabels, paramCopyOptions);
    this.q = paramDataLabels.q;
    this.B = paramDataLabels.B;
    this.C = paramDataLabels.C;
    this.w = paramDataLabels.w;
    this.u = paramDataLabels.u;
    this.t = paramDataLabels.t;
    this.r = paramDataLabels.r;
    this.v = paramDataLabels.v;
    this.x = paramDataLabels.x;
    this.l = paramDataLabels.l;
    this.m = paramDataLabels.m;
    this.D = paramDataLabels.D;
    this.n = paramDataLabels.n;
    this.y = paramDataLabels.y;
    this.z = paramDataLabels.z;
    this.A = paramDataLabels.A;
    this.s = paramDataLabels.s;
  }
  
  void b(DataLabels paramDataLabels, CopyOptions paramCopyOptions)
  {
    super.b(paramDataLabels, paramCopyOptions);
  }
  
  void a(DataLabels paramDataLabels)
  {
    this.y = paramDataLabels.y;
    this.z = paramDataLabels.z;
    this.A = paramDataLabels.A;
  }
  
  void b(DataLabels paramDataLabels)
  {
    this.q = paramDataLabels.q;
    this.B = paramDataLabels.B;
    this.C = paramDataLabels.C;
  }
  
  void c(DataLabels paramDataLabels)
  {
    this.w = paramDataLabels.w;
    this.u = paramDataLabels.u;
    this.t = paramDataLabels.t;
    this.r = paramDataLabels.r;
    this.v = paramDataLabels.v;
    this.x = paramDataLabels.x;
    this.m = paramDataLabels.m;
    this.D = paramDataLabels.D;
    this.n = paramDataLabels.n;
  }
  
  boolean d(DataLabels paramDataLabels)
  {
    if (paramDataLabels == null) {
      return false;
    }
    if (this.q != paramDataLabels.q) {
      return false;
    }
    if (this.B != paramDataLabels.B) {
      return false;
    }
    if (this.w != paramDataLabels.w) {
      return false;
    }
    if (this.u != paramDataLabels.u) {
      return false;
    }
    if (this.t != paramDataLabels.t) {
      return false;
    }
    if (this.r != paramDataLabels.r) {
      return false;
    }
    if (this.v != paramDataLabels.v) {
      return false;
    }
    if (this.x != paramDataLabels.x) {
      return false;
    }
    if (this.D != paramDataLabels.D) {
      return false;
    }
    if (this.n != paramDataLabels.n) {
      return false;
    }
    if (!zw.b(this.y, paramDataLabels.y)) {
      return false;
    }
    if (this.z != paramDataLabels.z) {
      return false;
    }
    if (this.A != paramDataLabels.A) {
      return false;
    }
    if (this.s != paramDataLabels.s) {
      return false;
    }
    return super.a(paramDataLabels);
  }
  
  Object R()
  {
    return this.p;
  }
  
  boolean S()
  {
    return this.p instanceof Series;
  }
  
  boolean T()
  {
    if (this.x) {
      return true;
    }
    int i = 0;
    if (this.t) {
      i++;
    }
    if (getShowCategoryName()) {
      i++;
    }
    if (getShowPercentage()) {
      i++;
    }
    if (this.v) {
      i++;
    }
    if ((i == 2) && (getShowCategoryName()) && (getShowPercentage())) {
      return false;
    }
    return i > 1;
  }
  
  boolean U()
  {
    boolean bool = ChartCollection.p(getChart().getType());
    if (bool)
    {
      if (this.w) {
        return true;
      }
    }
    else if (this.x) {
      return true;
    }
    int i = 0;
    if (this.t) {
      i++;
    }
    if (bool)
    {
      if (this.x) {
        i++;
      }
    }
    else if (this.w) {
      i++;
    }
    if (this.u) {
      i++;
    }
    if (this.v) {
      i++;
    }
    if ((i == 2) && (getShowCategoryName()) && (getShowPercentage()) && (this.B == 0)) {
      return false;
    }
    return i > 1;
  }
  
  boolean V()
  {
    return (this.v) || (this.w) || (this.u) || (this.t);
  }
  
  boolean W()
  {
    return (V()) || (getShowSeriesName());
  }
  
  boolean X()
  {
    if ((F() != null) && (!isDeleted())) {
      return true;
    }
    if ((ChartCollection.c(K())) || (ChartCollection.m(K()))) {
      return (getShowSeriesName()) || (this.w) || (this.t) || (this.u) || (getShowCellRange());
    }
    if (ChartCollection.q(K())) {
      return (getShowSeriesName()) || (this.w) || (this.t) || (this.v) || (getShowCellRange());
    }
    return (getShowSeriesName()) || (this.w) || (this.t) || (getShowCellRange());
  }
  
  public int getPosition()
  {
    if (((this.p != null & this.p instanceof ChartPoint)) && (this.n))
    {
      ChartPoint localChartPoint = (ChartPoint)R();
      DataLabels localDataLabels = localChartPoint.a().r();
      if ((localDataLabels != null) && (localDataLabels.n)) {
        return localDataLabels.getPosition();
      }
    }
    else if (this.n)
    {
      if (ChartCollection.c(getChart().getType())) {
        return 8;
      }
      if (ChartCollection.i(getChart().getType())) {
        return 0;
      }
    }
    return this.D;
  }
  
  public void setPosition(int value)
  {
    if (this.D == value)
    {
      this.n = false;
      return;
    }
    switch (value)
    {
    case 4: 
    case 5: 
    case 6: 
    case 7: 
      if ((ChartCollection.n(K())) || (ChartCollection.k(K())) || (ChartCollection.q(K())))
      {
        this.n = false;
        this.D = value;
      }
      break;
    case 1: 
    case 2: 
      if ((ChartCollection.g(K())) || (ChartCollection.c(K())))
      {
        this.n = false;
        this.D = value;
      }
      break;
    case 3: 
      if (((ChartCollection.g(K())) && (!ChartCollection.i(K()))) || (ChartCollection.c(K())))
      {
        this.n = false;
        this.D = value;
      }
      break;
    case 8: 
      if (ChartCollection.c(K()))
      {
        this.n = false;
        this.D = value;
      }
      break;
    case 0: 
      this.n = false;
      this.D = value;
      break;
    }
  }
  
  void n(int paramInt)
  {
    this.D = paramInt;
    this.n = false;
  }
  
  int Y()
  {
    return this.E;
  }
  
  void o(int paramInt)
  {
    this.E = paramInt;
    this.o = false;
  }
  
  boolean Z()
  {
    if ((this.m_text != null) && ("[CELLRANGE]".equals(this.m_text)) && ((R() instanceof ChartPoint)))
    {
      DataLabels localDataLabels = ((ChartPoint)R()).a().r();
      if ((localDataLabels != null) && (localDataLabels.i != null)) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/DataLabels.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */