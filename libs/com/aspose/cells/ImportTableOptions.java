package com.aspose.cells;

public class ImportTableOptions
{
  private boolean a;
  private boolean b = false;
  private boolean c = false;
  private boolean d = true;
  private boolean e = true;
  private boolean f = true;
  private String g = null;
  private String[] h = null;
  private int i = -1;
  private int j = -1;
  private int[] k = null;
  private Object[] l = null;
  
  public boolean getConvertGridStyle()
  {
    return this.a;
  }
  
  public void setConvertGridStyle(boolean value)
  {
    this.a = value;
  }
  
  public boolean getConvertNumericData()
  {
    return this.c;
  }
  
  public void setConvertNumericData(boolean value)
  {
    this.c = value;
  }
  
  public boolean getInsertRows()
  {
    return this.d;
  }
  
  public void setInsertRows(boolean value)
  {
    this.d = value;
  }
  
  public boolean getShiftFirstRowDown()
  {
    return this.e;
  }
  
  public void setShiftFirstRowDown(boolean value)
  {
    this.e = value;
  }
  
  public boolean isFieldNameShown()
  {
    return this.f;
  }
  
  public void setFieldNameShown(boolean value)
  {
    this.f = value;
  }
  
  public String getDateFormat()
  {
    return this.g;
  }
  
  public void setDateFormat(String value)
  {
    this.g = value;
  }
  
  public String[] getNumberFormats()
  {
    return this.h;
  }
  
  public void setNumberFormats(String[] value)
  {
    this.h = value;
  }
  
  public int getTotalRows()
  {
    return this.i;
  }
  
  public void setTotalRows(int value)
  {
    this.i = value;
  }
  
  public int getTotalColumns()
  {
    return this.j;
  }
  
  public void setTotalColumns(int value)
  {
    this.j = value;
  }
  
  public int[] getColumnIndexes()
  {
    return this.k;
  }
  
  public void setColumnIndexes(int[] value)
  {
    this.k = value;
  }
  
  public Object[] getDefaultValues()
  {
    return this.l;
  }
  
  public void setDefaultValues(Object[] value)
  {
    this.l = value;
  }
  
  public boolean isHtmlString()
  {
    return this.b;
  }
  
  public void setHtmlString(boolean value)
  {
    this.b = value;
  }
  
  Object a(int paramInt)
  {
    if ((this.l != null) && (paramInt < this.l.length)) {
      return this.l[paramInt];
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ImportTableOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */