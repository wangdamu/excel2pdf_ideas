package com.aspose.cells;

public class ScenarioInputCell
{
  int a;
  int b;
  String c;
  int d;
  boolean e = false;
  boolean f = false;
  
  public int getRow()
  {
    return this.a;
  }
  
  public int getColumn()
  {
    return this.b;
  }
  
  public String getName()
  {
    return CellsHelper.cellIndexToName(this.a, this.b);
  }
  
  void a(String paramString)
  {
    int[] arrayOfInt1 = { this.a };
    int[] arrayOfInt2 = { this.b };
    CellsHelper.a(paramString, arrayOfInt1, arrayOfInt2);
    this.a = arrayOfInt1[0];
    this.b = arrayOfInt2[0];
  }
  
  public String getValue()
  {
    return this.c;
  }
  
  public void setValue(String value)
  {
    this.c = value;
  }
  
  public boolean isDeleted()
  {
    return this.e;
  }
  
  public void setDeleted(boolean value)
  {
    this.e = value;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ScenarioInputCell.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */