package com.aspose.cells;

public class TxtLoadOptions
  extends LoadOptions
{
  private String b;
  private Encoding g = Encoding.getDefault();
  boolean a = true;
  private boolean h = false;
  private ICustomParser[] i;
  private boolean j = true;
  private boolean k = true;
  private int l = 2;
  private boolean m;
  
  public boolean getConvertNumericData()
  {
    return this.d;
  }
  
  public void setConvertNumericData(boolean value)
  {
    this.d = value;
  }
  
  public TxtLoadOptions()
  {
    this.m_LoadFormat = 1;
    this.b = ",";
  }
  
  public TxtLoadOptions(int loadFormat)
  {
    this.m_LoadFormat = loadFormat;
    switch (loadFormat)
    {
    case 0: 
    case 1: 
      this.b = ",";
      break;
    case 11: 
      this.b = "\t";
    }
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
  
  boolean c()
  {
    return (this.b != null) && (this.b.length() == 1);
  }
  
  public Encoding getEncoding()
  {
    return this.g;
  }
  
  public void setEncoding(Encoding value)
  {
    this.g = value;
    this.a = false;
  }
  
  public boolean isMultiEncoded()
  {
    return this.h;
  }
  
  public void setMultiEncoded(boolean value)
  {
    this.h = value;
  }
  
  public ICustomParser[] getPreferredParsers()
  {
    return this.i;
  }
  
  public void setPreferredParsers(ICustomParser[] value)
  {
    this.i = value;
  }
  
  public boolean getConvertDateTimeData()
  {
    return this.j;
  }
  
  public void setConvertDateTimeData(boolean value)
  {
    this.j = value;
  }
  
  boolean d()
  {
    return this.k;
  }
  
  public int getLoadStyleStrategy()
  {
    return this.l;
  }
  
  public void setLoadStyleStrategy(int value)
  {
    this.l = value;
  }
  
  public boolean hasFormula()
  {
    return this.m;
  }
  
  public void setHasFormula(boolean value)
  {
    this.m = value;
  }
  
  /**
   * @deprecated
   */
  public boolean getKeepExactFormat()
  {
    return this.l == 2;
  }
  
  /**
   * @deprecated
   */
  public void setKeepExactFormat(boolean value)
  {
    if (value) {
      this.l = 2;
    } else {
      this.l = 1;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/TxtLoadOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */