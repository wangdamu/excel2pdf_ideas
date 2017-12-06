package com.aspose.cells;

public class FindOptions
{
  private boolean a;
  private int b = 0;
  private CellArea c;
  private boolean d;
  private boolean e = true;
  private boolean f = true;
  private int g = 0;
  private boolean h = false;
  private boolean i = false;
  private Style j = null;
  private boolean k = false;
  
  public boolean getCaseSensitive()
  {
    return this.a;
  }
  
  public void setCaseSensitive(boolean value)
  {
    this.a = value;
  }
  
  public int getLookAtType()
  {
    return this.b;
  }
  
  public void setLookAtType(int value)
  {
    this.b = value;
  }
  
  public CellArea getRange()
  {
    return this.c;
  }
  
  public void setRange(CellArea ca)
  {
    this.c = ca;
    this.d = true;
  }
  
  public boolean isRangeSet()
  {
    return this.d;
  }
  
  public boolean getSearchNext()
  {
    return this.e;
  }
  
  public void setSearchNext(boolean value)
  {
    this.e = value;
  }
  
  public boolean getSeachOrderByRows()
  {
    return this.f;
  }
  
  public void setSeachOrderByRows(boolean value)
  {
    this.f = value;
  }
  
  public int getLookInType()
  {
    return this.g;
  }
  
  public void setLookInType(int value)
  {
    this.g = value;
  }
  
  public boolean getRegexKey()
  {
    return this.h;
  }
  
  public void setRegexKey(boolean value)
  {
    this.h = value;
  }
  
  boolean a()
  {
    return this.i;
  }
  
  void a(boolean paramBoolean)
  {
    this.i = paramBoolean;
  }
  
  public Style getStyle()
  {
    return this.j;
  }
  
  public void setStyle(Style value)
  {
    this.j = value;
  }
  
  public boolean getConvertNumericData()
  {
    return this.k;
  }
  
  public void setConvertNumericData(boolean value)
  {
    this.k = value;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/FindOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */