package com.aspose.cells;

public class TxtSaveOptions
  extends SaveOptions
{
  private String b;
  private Encoding c = Encoding.getDefault();
  boolean a = true;
  private int d = 0;
  private int j = 1;
  private boolean k = false;
  
  public TxtSaveOptions()
  {
    this.m_SaveFormat = 1;
    this.b = ",";
  }
  
  public TxtSaveOptions(int format)
  {
    this.m_SaveFormat = format;
    switch (format)
    {
    case 0: 
      this.m_SaveFormat = 1;
      this.b = ",";
      break;
    case 1: 
      this.b = ",";
      break;
    case 11: 
      this.b = "\t";
    }
  }
  
  TxtSaveOptions(int format, SaveOptions options)
  {
    this.m_SaveFormat = format;
    switch (format)
    {
    case 0: 
      this.m_SaveFormat = 1;
      this.b = ",";
      break;
    case 1: 
      this.b = ",";
      break;
    case 11: 
      this.b = "\t";
    }
    b(options);
  }
  
  public char getSeparator()
  {
    if ((this.b != null) && (this.b.length() >= 1)) {
      return this.b.charAt(0);
    }
    return ',';
  }
  
  public void setSeparator(char value)
  {
    this.b = ("" + value);
  }
  
  public String getSeparatorString()
  {
    return this.b;
  }
  
  public void setSeparatorString(String value)
  {
    this.b = value;
  }
  
  public Encoding getEncoding()
  {
    return this.c;
  }
  
  public void setEncoding(Encoding value)
  {
    this.c = value;
    this.a = false;
  }
  
  static TxtSaveOptions a(WorkbookSettings paramWorkbookSettings, int paramInt, SaveOptions paramSaveOptions)
  {
    TxtSaveOptions localTxtSaveOptions = null;
    if ((paramSaveOptions instanceof TxtSaveOptions)) {
      localTxtSaveOptions = (TxtSaveOptions)paramSaveOptions;
    } else {
      localTxtSaveOptions = new TxtSaveOptions(paramInt, paramSaveOptions);
    }
    if ((localTxtSaveOptions.a) && (!paramWorkbookSettings.l)) {
      localTxtSaveOptions.setEncoding(paramWorkbookSettings.g());
    }
    return localTxtSaveOptions;
  }
  
  /**
   * @deprecated
   */
  public boolean getAlwaysQuoted()
  {
    return this.d == 1;
  }
  
  /**
   * @deprecated
   */
  public void setAlwaysQuoted(boolean value)
  {
    this.d = (value ? 1 : 0);
  }
  
  public int getQuoteType()
  {
    return this.d;
  }
  
  public void setQuoteType(int value)
  {
    this.d = value;
  }
  
  public int getFormatStrategy()
  {
    return this.j;
  }
  
  public void setFormatStrategy(int value)
  {
    this.j = value;
  }
  
  public LightCellsDataProvider getLightCellsDataProvider()
  {
    return this.i;
  }
  
  public void setLightCellsDataProvider(LightCellsDataProvider value)
  {
    this.i = value;
  }
  
  public boolean getTrimLeadingBlankRowAndColumn()
  {
    return this.k;
  }
  
  public void setTrimLeadingBlankRowAndColumn(boolean value)
  {
    this.k = value;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/TxtSaveOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */