package com.aspose.cells;

public class HTMLLoadOptions
  extends LoadOptions
{
  private String g = null;
  private boolean h = true;
  private Encoding i = Encoding.getUTF8();
  private boolean j = true;
  private boolean k = false;
  private boolean l = false;
  private boolean m = false;
  private boolean n = false;
  private boolean o = false;
  boolean a = true;
  private int p = 2;
  boolean b = false;
  private IStreamProvider q = new zbsl();
  
  public HTMLLoadOptions()
  {
    this.m_LoadFormat = 12;
  }
  
  public HTMLLoadOptions(int loadFormat)
  {
    this.m_LoadFormat = loadFormat;
  }
  
  /**
   * @deprecated
   */
  public String getAttachedFilesDirectory()
  {
    return this.g;
  }
  
  /**
   * @deprecated
   */
  public void setAttachedFilesDirectory(String value)
  {
    if ((!value.endsWith("/")) && (!value.endsWith("\\"))) {
      value = value + "\\";
    }
    this.g = value;
  }
  
  public boolean getLoadFormulas()
  {
    return this.h;
  }
  
  public void setLoadFormulas(boolean value)
  {
    this.h = value;
  }
  
  public boolean getSupportDivTag()
  {
    return this.n;
  }
  
  public void setSupportDivTag(boolean value)
  {
    this.n = value;
  }
  
  public boolean getDeleteRedundantSpaces()
  {
    return this.l;
  }
  
  public void setDeleteRedundantSpaces(boolean value)
  {
    this.l = value;
  }
  
  public boolean getAutoFitColsAndRows()
  {
    return this.o;
  }
  
  public void setAutoFitColsAndRows(boolean value)
  {
    this.o = value;
  }
  
  public Encoding getEncoding()
  {
    return this.i;
  }
  
  public void setEncoding(Encoding value)
  {
    this.i = value;
    this.a = false;
  }
  
  public int getLoadStyleStrategy()
  {
    return this.p;
  }
  
  public void setLoadStyleStrategy(int value)
  {
    this.p = value;
  }
  
  public boolean getConvertNumericData()
  {
    return this.d;
  }
  
  public void setConvertNumericData(boolean value)
  {
    this.d = value;
  }
  
  public boolean getKeepPrecision()
  {
    return this.b;
  }
  
  public void setKeepPrecision(boolean value)
  {
    this.b = value;
  }
  
  public boolean getConvertFormulasData()
  {
    return this.k;
  }
  
  public void setConvertFormulasData(boolean value)
  {
    this.k = value;
  }
  
  public IStreamProvider getStreamProvider()
  {
    return this.q;
  }
  
  public void setStreamProvider(IStreamProvider value)
  {
    this.q = value;
  }
  
  public boolean getConvertDateTimeData()
  {
    return this.j;
  }
  
  public void setConvertDateTimeData(boolean value)
  {
    this.j = value;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/HTMLLoadOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */