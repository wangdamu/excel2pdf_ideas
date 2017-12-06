package com.aspose.cells;

public class ExportTableOptions
{
  private boolean a;
  private boolean b;
  private boolean c;
  private boolean d;
  private boolean e = false;
  private boolean f = false;
  private int g = 1;
  private boolean h = false;
  private boolean i = true;
  private int[] j;
  private int k = 0;
  
  public boolean getExportColumnName()
  {
    return this.a;
  }
  
  public void setExportColumnName(boolean value)
  {
    this.a = value;
  }
  
  public boolean getSkipErrorValue()
  {
    return this.b;
  }
  
  public void setSkipErrorValue(boolean value)
  {
    this.b = value;
  }
  
  public boolean getPlotVisibleCells()
  {
    return (this.c) && (this.d);
  }
  
  public void setPlotVisibleCells(boolean value)
  {
    this.c = value;
    this.d = value;
  }
  
  public boolean getPlotVisibleRows()
  {
    return this.c;
  }
  
  public void setPlotVisibleRows(boolean value)
  {
    this.c = value;
  }
  
  public boolean getPlotVisibleColumns()
  {
    return this.d;
  }
  
  public void setPlotVisibleColumns(boolean value)
  {
    this.d = value;
  }
  
  public boolean getExportAsString()
  {
    return this.e;
  }
  
  public void setExportAsString(boolean value)
  {
    this.e = value;
  }
  
  public boolean getExportAsHtmlString()
  {
    return this.f;
  }
  
  public void setExportAsHtmlString(boolean value)
  {
    this.f = value;
  }
  
  public int getFormatStrategy()
  {
    return this.g;
  }
  
  public void setFormatStrategy(int value)
  {
    this.g = value;
  }
  
  public boolean getCheckMixedValueType()
  {
    return this.h;
  }
  
  public void setCheckMixedValueType(boolean value)
  {
    this.h = value;
  }
  
  public boolean isVertical()
  {
    return this.i;
  }
  
  public void setVertical(boolean value)
  {
    this.i = value;
  }
  
  public int[] getIndexes()
  {
    return this.j;
  }
  
  public void setIndexes(int[] value)
  {
    this.j = value;
  }
  
  public int getRenameStrategy()
  {
    return this.k;
  }
  
  public void setRenameStrategy(int value)
  {
    this.k = value;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ExportTableOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */