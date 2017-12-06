package com.aspose.cells;

import com.aspose.cells.a.d.zb;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.d.zh;

public class DataBar
{
  ConditionalFormattingValue a = null;
  ConditionalFormattingValue b = null;
  private zaml d;
  private zaml e;
  private DataBarBorder f = null;
  private NegativeBarFormat g = null;
  private int h = 10;
  private int i = 90;
  private boolean j = true;
  Workbook c;
  private FormatCondition k;
  private int l;
  private int m;
  private int n;
  
  zaml a()
  {
    return this.e;
  }
  
  void a(zaml paramzaml)
  {
    this.e = paramzaml;
  }
  
  public Color getAxisColor()
  {
    return this.e.b(this.c);
  }
  
  public void setAxisColor(Color value)
  {
    this.e.a(2, value.toArgb());
  }
  
  public int getAxisPosition()
  {
    return this.l;
  }
  
  public void setAxisPosition(int value)
  {
    this.l = value;
  }
  
  public int getBarFillType()
  {
    return this.m;
  }
  
  public void setBarFillType(int value)
  {
    this.m = value;
  }
  
  public int getDirection()
  {
    return this.n;
  }
  
  public void setDirection(int value)
  {
    this.n = value;
  }
  
  public DataBarBorder getBarBorder()
  {
    return this.f;
  }
  
  public NegativeBarFormat getNegativeBarFormat()
  {
    return this.g;
  }
  
  DataBar(Workbook workbook, FormatCondition fmtCond)
  {
    this.k = fmtCond;
    this.c = workbook;
    this.d = new zaml(false);
    this.e = new zaml(false);
    this.f = new DataBarBorder(this);
    this.g = new NegativeBarFormat(this);
    zaml localzaml1 = new zaml(false);
    getBarBorder().a(localzaml1);
    getBarBorder().setType(0);
    zaml localzaml2 = new zaml(false);
    localzaml2.a(2, 0);
    a(localzaml2);
    setAxisPosition(2);
    setBarFillType(1);
    setDirection(0);
  }
  
  void a(DataBar paramDataBar, CopyOptions paramCopyOptions, int paramInt1, int paramInt2)
  {
    this.h = paramDataBar.h;
    this.j = paramDataBar.j;
    this.i = paramDataBar.i;
    if (paramDataBar.b != null)
    {
      this.b = new ConditionalFormattingValue(this.k);
      this.b.a(paramDataBar.b, paramDataBar.c.getWorksheets(), this.c.getWorksheets(), paramCopyOptions, paramInt1, paramInt2);
    }
    if (paramDataBar.a != null)
    {
      this.a = new ConditionalFormattingValue(this.k);
      this.a.a(paramDataBar.a, paramDataBar.c.getWorksheets(), this.c.getWorksheets(), paramCopyOptions, paramInt1, paramInt2);
    }
    this.d.f(paramDataBar.d);
    this.e.f(paramDataBar.e);
    this.l = paramDataBar.l;
    this.m = paramDataBar.m;
    this.n = paramDataBar.n;
    if (paramDataBar.f != null)
    {
      this.f = new DataBarBorder(this);
      this.f.a(paramDataBar.f);
    }
    if (paramDataBar.g != null)
    {
      this.g = new NegativeBarFormat(this);
      this.g.a(paramDataBar.g);
    }
  }
  
  static DataBar a(Workbook paramWorkbook, FormatCondition paramFormatCondition)
  {
    DataBar localDataBar = new DataBar(paramWorkbook, paramFormatCondition);
    localDataBar.a = new ConditionalFormattingValue(paramFormatCondition, 7, null);
    localDataBar.b = new ConditionalFormattingValue(paramFormatCondition, 6, null);
    zaml localzaml1 = new zaml(false);
    localzaml1.a(2, zauj.r("FF638EC6"));
    localDataBar.b(localzaml1);
    localDataBar.c = paramWorkbook;
    zaml localzaml2 = new zaml(false);
    localDataBar.getBarBorder().a(localzaml2);
    localDataBar.getBarBorder().setType(0);
    zaml localzaml3 = new zaml(false);
    localzaml3.a(2, 0);
    localDataBar.a(localzaml3);
    localDataBar.setAxisPosition(0);
    localDataBar.setBarFillType(0);
    localDataBar.setDirection(0);
    return localDataBar;
  }
  
  public ConditionalFormattingValue getMinCfvo()
  {
    if (this.a == null) {
      this.a = new ConditionalFormattingValue(this.k, 2, null);
    }
    return this.a;
  }
  
  public ConditionalFormattingValue getMaxCfvo()
  {
    if (this.b == null) {
      this.b = new ConditionalFormattingValue(this.k, 1, null);
    }
    return this.b;
  }
  
  void a(ConditionalFormattingValue paramConditionalFormattingValue)
  {
    this.b = paramConditionalFormattingValue;
  }
  
  void b(ConditionalFormattingValue paramConditionalFormattingValue)
  {
    this.a = paramConditionalFormattingValue;
  }
  
  public Color getColor()
  {
    return this.d.b(this.c);
  }
  
  public void setColor(Color value)
  {
    this.d.a(2, value.toArgb());
  }
  
  zaml b()
  {
    return this.d;
  }
  
  void b(zaml paramzaml)
  {
    this.d = paramzaml;
  }
  
  public int getMinLength()
  {
    return this.h;
  }
  
  public void setMinLength(int value)
  {
    this.h = value;
  }
  
  public int getMaxLength()
  {
    return this.i;
  }
  
  public void setMaxLength(int value)
  {
    this.i = value;
  }
  
  public boolean getShowValue()
  {
    return this.j;
  }
  
  public void setShowValue(boolean value)
  {
    this.j = value;
  }
  
  public byte[] toImage(Cell cell, ImageOrPrintOptions imgOpts)
    throws Exception
  {
    zaca localzaca = zla.a(this.k.a.e);
    localzaca.a(this.k);
    localzaca.d = cell.getRow();
    localzaca.e = ((short)cell.getColumn());
    FormatConditionCollection localFormatConditionCollection = this.k.a;
    zov localzov = new zov(this, localzaca, cell.c, localFormatConditionCollection.b, true);
    int i1 = cell.d.getColumnWidthPixel(cell.getColumn());
    int i2 = cell.d.getRowHeightPixel(cell.getRow());
    zq localzq = new zq(0.0F, 0.0F, i1 * 72.0F / zbxp.a(), i2 * 72.0F / zbxp.a());
    zb localzb1 = new zb();
    zb localzb2 = localzov.a(localzq, new double[] { 1.0D, 1.0D }, 5, 0);
    localzb1.a(localzb2);
    zh localzh = new zh();
    try
    {
      zbxz.a(localzh, localzb1, imgOpts, i1, i2);
      localzaca.c();
      byte[] arrayOfByte = localzh.o();
      return arrayOfByte;
    }
    finally
    {
      if (localzh != null) {
        localzh.a();
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/DataBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */