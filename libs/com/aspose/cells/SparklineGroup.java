package com.aspose.cells;

import com.aspose.cells.b.a.zr;
import com.aspose.cells.b.a.zw;

public class SparklineGroup
{
  private SparklineGroupCollection e;
  int a = 0;
  private SparklineCollection f;
  private int g;
  private CellsColor h;
  private CellsColor i;
  private CellsColor j;
  private CellsColor k;
  private CellsColor l;
  private CellsColor m;
  private CellsColor n;
  private double o = 0.75D;
  private CellsColor p;
  byte[] b;
  double c;
  double d;
  
  SparklineGroup(SparklineGroupCollection groups, int type, String dataRange, boolean isVertical, CellArea locationRange)
  {
    this.e = groups;
    this.g = type;
    if (type == 2) {
      setShowNegativePoints(true);
    }
    this.f = new SparklineCollection(this, dataRange, isVertical, locationRange);
    setPresetStyle(0);
    g();
  }
  
  SparklineGroup(SparklineGroupCollection groups)
  {
    this.e = groups;
    g();
    this.f = new SparklineCollection(this);
  }
  
  private void g()
  {
    this.a |= 0x800;
    this.a |= 0x1000;
  }
  
  public void resetRanges(String dataRange, boolean isVertical, CellArea locationRange)
  {
    this.f.a(dataRange, isVertical, locationRange);
  }
  
  SparklineGroupCollection a()
  {
    return this.e;
  }
  
  void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.a |= 0x1;
    } else {
      this.a &= 0xFFFFFFFE;
    }
  }
  
  public int getPresetStyle()
  {
    return zbqx.a(this);
  }
  
  public void setPresetStyle(int value)
  {
    zbqx.a(this, value);
  }
  
  public SparklineCollection getSparklineCollection()
  {
    return this.f;
  }
  
  public int getType()
  {
    return this.g;
  }
  
  public void setType(int value)
  {
    this.g = value;
  }
  
  public int getPlotEmptyCellsType()
  {
    switch (this.a & 0x6)
    {
    case 0: 
      return 0;
    case 2: 
      return 1;
    case 4: 
      return 2;
    }
    return 0;
  }
  
  public void setPlotEmptyCellsType(int value)
  {
    int i1 = 0;
    switch (value)
    {
    case 0: 
      i1 = 0;
      break;
    case 1: 
      i1 = 2;
      break;
    case 2: 
      i1 = 4;
      break;
    }
    this.a &= 0xFFFFFFF9;
    this.a |= i1;
  }
  
  public boolean getDisplayHidden()
  {
    return (this.a & 0x400) != 0;
  }
  
  public void setDisplayHidden(boolean value)
  {
    if (value) {
      this.a |= 0x400;
    } else {
      this.a &= 0xFBFF;
    }
  }
  
  boolean b()
  {
    return (this.a & 0x800) != 0;
  }
  
  void b(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.a |= 0x800;
    } else {
      this.a &= 0xF7FF;
    }
  }
  
  boolean c()
  {
    return (this.a & 0x1000) != 0;
  }
  
  void c(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.a |= 0x1000;
    } else {
      this.a &= 0xEFFF;
    }
  }
  
  boolean d()
  {
    return (this.a & 0x2000) != 0;
  }
  
  void d(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.a |= 0x2000;
    } else {
      this.a &= 0xDFFF;
    }
  }
  
  boolean e()
  {
    return (this.a & 0x4000) != 0;
  }
  
  void e(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.a |= 0x4000;
    } else {
      this.a &= 0xBFFF;
    }
  }
  
  public boolean getShowHighPoint()
  {
    return (this.a & 0x10) != 0;
  }
  
  public void setShowHighPoint(boolean value)
  {
    if (value) {
      this.a |= 0x10;
    } else {
      this.a &= 0xFFFFFFEF;
    }
  }
  
  public CellsColor getHighPointColor()
  {
    return this.h;
  }
  
  public void setHighPointColor(CellsColor value)
  {
    if (value == null) {
      return;
    }
    this.h = value;
  }
  
  public boolean getShowLowPoint()
  {
    return (this.a & 0x20) != 0;
  }
  
  public void setShowLowPoint(boolean value)
  {
    if (value) {
      this.a |= 0x20;
    } else {
      this.a &= 0xFFFFFFDF;
    }
  }
  
  public CellsColor getLowPointColor()
  {
    return this.i;
  }
  
  public void setLowPointColor(CellsColor value)
  {
    if (value == null) {
      return;
    }
    this.i = value;
  }
  
  public boolean getShowNegativePoints()
  {
    return (this.a & 0x100) != 0;
  }
  
  public void setShowNegativePoints(boolean value)
  {
    if (value) {
      this.a |= 0x100;
    } else {
      this.a &= 0xFEFF;
    }
  }
  
  public CellsColor getNegativePointsColor()
  {
    return this.j;
  }
  
  public void setNegativePointsColor(CellsColor value)
  {
    if (value == null) {
      return;
    }
    this.j = value;
  }
  
  public boolean getShowFirstPoint()
  {
    return (this.a & 0x40) != 0;
  }
  
  public void setShowFirstPoint(boolean value)
  {
    if (value) {
      this.a |= 0x40;
    } else {
      this.a &= 0xFFFFFFBF;
    }
  }
  
  public CellsColor getFirstPointColor()
  {
    return this.k;
  }
  
  public void setFirstPointColor(CellsColor value)
  {
    if (value == null) {
      return;
    }
    this.k = value;
  }
  
  public boolean getShowLastPoint()
  {
    return (this.a & 0x80) != 0;
  }
  
  public void setShowLastPoint(boolean value)
  {
    if (value) {
      this.a |= 0x80;
    } else {
      this.a &= 0xFF7F;
    }
  }
  
  public CellsColor getLastPointColor()
  {
    return this.l;
  }
  
  public void setLastPointColor(CellsColor value)
  {
    if (value == null) {
      return;
    }
    this.l = value;
  }
  
  public boolean getShowMarkers()
  {
    return (this.a & 0x8) != 0;
  }
  
  public void setShowMarkers(boolean value)
  {
    if (value) {
      this.a |= 0x8;
    } else {
      this.a &= 0xFFFFFFF7;
    }
  }
  
  public CellsColor getMarkersColor()
  {
    return this.m;
  }
  
  public void setMarkersColor(CellsColor value)
  {
    if (value == null) {
      return;
    }
    this.m = value;
  }
  
  public CellsColor getSeriesColor()
  {
    return this.n;
  }
  
  public void setSeriesColor(CellsColor value)
  {
    if (value == null) {
      return;
    }
    this.n = value;
  }
  
  public boolean getPlotRightToLeft()
  {
    return (this.a & 0x8000) != 0;
  }
  
  public void setPlotRightToLeft(boolean value)
  {
    if (value) {
      this.a |= 0x8000;
    } else {
      this.a &= 0xFFFF7FFF;
    }
  }
  
  public double getLineWeight()
  {
    return zr.b(this.o, 2);
  }
  
  public void setLineWeight(double value)
  {
    if (value < 0.0D) {
      throw new CellsException(6, "Line weight must greater than zero.");
    }
    this.o = value;
  }
  
  public CellsColor getHorizontalAxisColor()
  {
    return this.p;
  }
  
  public void setHorizontalAxisColor(CellsColor value)
  {
    this.p = value;
  }
  
  public boolean getShowHorizontalAxis()
  {
    return (this.a & 0x200) != 0;
  }
  
  public void setShowHorizontalAxis(boolean value)
  {
    if (value) {
      this.a |= 0x200;
    } else {
      this.a &= 0xFDFF;
    }
  }
  
  public String getHorizontalAxisDateRange()
  {
    if (this.b == null) {
      return null;
    }
    Worksheet localWorksheet = a().a();
    String str = localWorksheet.c().d().a(-1, -1, this.b, 0, 0, false, false);
    return zauj.L(str);
  }
  
  public void setHorizontalAxisDateRange(String value)
  {
    a(false);
    if (value == null)
    {
      this.b = null;
      return;
    }
    if (zw.b(value))
    {
      this.b = null;
      return;
    }
    Worksheet localWorksheet = this.f.a().a().a();
    this.b = localWorksheet.c().y().a(localWorksheet.getIndex(), value, 0, 0, 0, 32, false, true, true);
    Range localRange = f();
    a(true);
    if ((localRange.getRowCount() != 1) && (localRange.getColumnCount() != 1)) {
      throw new CellsException(14, "Data range cells must in same column or row");
    }
  }
  
  Range f()
  {
    if (this.b == null) {
      return null;
    }
    Worksheet localWorksheet = this.f.a().a().a();
    return zabx.b(9, this, true, this.b, 0, -1, 0, 0, localWorksheet.c(), localWorksheet.getIndex());
  }
  
  public int getVerticalAxisMaxValueType()
  {
    if (b()) {
      return 0;
    }
    if (d()) {
      return 1;
    }
    return 2;
  }
  
  public void setVerticalAxisMaxValueType(int value)
  {
    switch (value)
    {
    case 2: 
      b(false);
      d(false);
      break;
    case 1: 
      b(false);
      d(true);
      break;
    default: 
      b(true);
      d(false);
    }
  }
  
  public double getVerticalAxisMaxValue()
  {
    return this.c;
  }
  
  public void setVerticalAxisMaxValue(double value)
  {
    this.c = value;
    setVerticalAxisMaxValueType(2);
  }
  
  public int getVerticalAxisMinValueType()
  {
    if (c()) {
      return 0;
    }
    if (e()) {
      return 1;
    }
    return 2;
  }
  
  public void setVerticalAxisMinValueType(int value)
  {
    switch (value)
    {
    case 2: 
      c(false);
      e(false);
      break;
    case 1: 
      c(false);
      e(true);
      break;
    default: 
      c(true);
      e(false);
    }
  }
  
  public double getVerticalAxisMinValue()
  {
    return this.d;
  }
  
  public void setVerticalAxisMinValue(double value)
  {
    this.d = value;
    setVerticalAxisMinValueType(2);
  }
  
  int a(Cells paramCells, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return this.f.a(paramCells, paramInt1, paramInt2, paramBoolean);
  }
  
  int b(Cells paramCells, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return this.f.b(paramCells, paramInt1, paramInt2, paramBoolean);
  }
  
  void a(SparklineGroup paramSparklineGroup, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, CopyOptions paramCopyOptions)
  {
    a(paramSparklineGroup, paramCopyOptions);
    for (int i1 = 0; i1 < paramSparklineGroup.f.getCount(); i1++)
    {
      Sparkline localSparkline1 = paramSparklineGroup.f.get(i1);
      int i2 = paramBoolean ? localSparkline1.getRow() : localSparkline1.getColumn();
      if ((i2 >= paramInt1) && (i2 <= paramInt1 + paramInt3 - 1))
      {
        Sparkline localSparkline2 = new Sparkline(this.f);
        this.f.a(localSparkline2);
        localSparkline2.a(localSparkline1, paramBoolean, paramInt1, paramInt2, paramInt3, paramCopyOptions);
      }
    }
  }
  
  void a(SparklineGroup paramSparklineGroup, CopyOptions paramCopyOptions)
  {
    this.a = paramSparklineGroup.a;
    this.k = a(paramSparklineGroup.k, paramCopyOptions);
    this.h = a(paramSparklineGroup.h, paramCopyOptions);
    this.p = a(paramSparklineGroup.p, paramCopyOptions);
    this.b = paramSparklineGroup.b;
    this.l = a(paramSparklineGroup.l, paramCopyOptions);
    this.o = paramSparklineGroup.o;
    this.i = a(paramSparklineGroup.i, paramCopyOptions);
    this.m = a(paramSparklineGroup.m, paramCopyOptions);
    this.j = a(paramSparklineGroup.j, paramCopyOptions);
    this.n = a(paramSparklineGroup.n, paramCopyOptions);
    this.g = paramSparklineGroup.g;
    this.c = paramSparklineGroup.c;
    this.d = paramSparklineGroup.d;
  }
  
  void b(SparklineGroup paramSparklineGroup, CopyOptions paramCopyOptions)
  {
    a(paramSparklineGroup, paramCopyOptions);
    for (int i1 = 0; i1 < paramSparklineGroup.f.getCount(); i1++)
    {
      Sparkline localSparkline1 = paramSparklineGroup.f.get(i1);
      Sparkline localSparkline2 = new Sparkline(this.f);
      this.f.a(localSparkline2);
      localSparkline2.a(localSparkline1, paramCopyOptions);
    }
  }
  
  private CellsColor a(CellsColor paramCellsColor, CopyOptions paramCopyOptions)
  {
    if (paramCellsColor == null) {
      return null;
    }
    CellsColor localCellsColor = this.e.a().d().createCellsColor();
    localCellsColor.a(paramCellsColor, paramCopyOptions);
    return localCellsColor;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/SparklineGroup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */