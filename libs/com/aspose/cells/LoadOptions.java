package com.aspose.cells;

import com.aspose.cells.a.c.zj;
import com.aspose.cells.b.a.c.za;
import java.util.Locale;

public class LoadOptions
{
  protected int m_LoadFormat;
  private String a;
  private boolean b = true;
  int c = -1;
  private LoadDataOption g;
  private int h = 0;
  private za i;
  boolean d = true;
  boolean e = false;
  boolean f = false;
  private String j = "Arial";
  private int k = 200;
  private InterruptMonitor l;
  private boolean m = false;
  private boolean n = false;
  private boolean o = true;
  private LoadFilter p = new LoadFilter();
  private LightCellsDataHandler q;
  private int r = znq.s;
  private IWarningCallback s = null;
  
  public int getLoadFormat()
  {
    return this.m_LoadFormat;
  }
  
  void a(int paramInt)
  {
    this.m_LoadFormat = paramInt;
  }
  
  public LoadOptions()
  {
    this.m_LoadFormat = 0;
  }
  
  public LoadOptions(int loadFormat)
  {
    this.m_LoadFormat = loadFormat;
  }
  
  public String getPassword()
  {
    return this.a;
  }
  
  public void setPassword(String value)
  {
    this.a = value;
  }
  
  public boolean getParsingFormulaOnOpen()
  {
    return this.b;
  }
  
  public void setParsingFormulaOnOpen(boolean value)
  {
    this.b = value;
  }
  
  /**
   * @deprecated
   */
  public boolean getLoadDataAndFormatting()
  {
    return (this.p.getLoadDataFilterOptions() == 127) && (this.q == null);
  }
  
  /**
   * @deprecated
   */
  public void setLoadDataAndFormatting(boolean value)
  {
    if (value)
    {
      this.p.setLoadDataFilterOptions(127);
      this.q = null;
    }
    else
    {
      this.p.setLoadDataFilterOptions(Integer.MAX_VALUE);
    }
  }
  
  public void setPaperSize(int type)
  {
    this.c = type;
  }
  
  /**
   * @deprecated
   */
  public boolean getLoadDataOnly()
  {
    return getLoadDataAndFormatting();
  }
  
  /**
   * @deprecated
   */
  public void setLoadDataOnly(boolean value)
  {
    setLoadDataAndFormatting(value);
  }
  
  /**
   * @deprecated
   */
  public boolean getOnlyLoadDocumentProperties()
  {
    return this.p.getLoadDataFilterOptions() == 128;
  }
  
  /**
   * @deprecated
   */
  public void setOnlyLoadDocumentProperties(boolean value)
  {
    if (value) {
      this.p.setLoadDataFilterOptions(128);
    } else {
      this.p.setLoadDataFilterOptions(Integer.MAX_VALUE);
    }
  }
  
  /**
   * @deprecated
   */
  public LoadDataOption getLoadDataOptions()
  {
    if (this.g == null) {
      this.g = new LoadDataOption();
    }
    return this.g;
  }
  
  /**
   * @deprecated
   */
  public void setLoadDataOptions(LoadDataOption value)
  {
    this.g = value;
  }
  
  public int getLanguageCode()
  {
    return this.h;
  }
  
  public void setLanguageCode(int value)
  {
    this.h = value;
  }
  
  public int getRegion()
  {
    if (this.i == null) {
      return 0;
    }
    return zamr.c((short)this.i.g());
  }
  
  public void setRegion(int value)
  {
    this.i = zj.a(value);
  }
  
  public Locale getLocale()
  {
    return zj.a(this.i);
  }
  
  public void setLocale(Locale value)
  {
    this.i = zj.a(value);
  }
  
  za a()
  {
    return this.i;
  }
  
  /**
   * @deprecated
   */
  public boolean getConvertNumericData()
  {
    return this.d;
  }
  
  /**
   * @deprecated
   */
  public void setConvertNumericData(boolean value)
  {
    this.d = value;
  }
  
  public String getStandardFont()
  {
    return this.j;
  }
  
  public void setStandardFont(String value)
  {
    this.j = value;
    this.e = true;
  }
  
  public double getStandardFontSize()
  {
    return (this.k & 0xFFFF) / 20.0F;
  }
  
  public void setStandardFontSize(double value)
  {
    this.k = ((int)(value * 20.0D + 0.5D));
    this.f = true;
  }
  
  public InterruptMonitor getInterruptMonitor()
  {
    return this.l;
  }
  
  public void setInterruptMonitor(InterruptMonitor value)
  {
    this.l = value;
  }
  
  public boolean getIgnoreNotPrinted()
  {
    return this.m;
  }
  
  public void setIgnoreNotPrinted(boolean value)
  {
    this.m = value;
  }
  
  boolean b()
  {
    return this.n;
  }
  
  public boolean getCheckExcelRestriction()
  {
    return this.o;
  }
  
  public void setCheckExcelRestriction(boolean value)
  {
    this.o = value;
  }
  
  public LoadFilter getLoadFilter()
  {
    return this.p;
  }
  
  public void setLoadFilter(LoadFilter value)
  {
    this.p = value;
  }
  
  /**
   * @deprecated
   */
  public int getLoadDataFilterOptions()
  {
    return this.p.getLoadDataFilterOptions();
  }
  
  /**
   * @deprecated
   */
  public void setLoadDataFilterOptions(int value)
  {
    this.p.setLoadDataFilterOptions(value);
  }
  
  public LightCellsDataHandler getLightCellsDataHandler()
  {
    return this.q;
  }
  
  public void setLightCellsDataHandler(LightCellsDataHandler value)
  {
    this.q = value;
  }
  
  public int getMemorySetting()
  {
    return this.r;
  }
  
  public void setMemorySetting(int value)
  {
    this.r = value;
  }
  
  void a(LoadOptions paramLoadOptions)
  {
    this.d = paramLoadOptions.d;
  }
  
  public IWarningCallback getWarningCallback()
  {
    return this.s;
  }
  
  public void setWarningCallback(IWarningCallback value)
  {
    this.s = value;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/LoadOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */