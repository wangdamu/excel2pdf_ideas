package com.aspose.cells;

public class CalculationData
{
  private zaca d;
  private zabe e;
  private zaie[] f;
  boolean a;
  Object b;
  zaie c;
  
  CalculationData(zaca relInfo, zabe funcNode)
  {
    this.d = relInfo;
    this.e = funcNode;
    this.f = funcNode.r();
    this.a = false;
  }
  
  public Object getCalculatedValue()
  {
    if ((!this.a) && (this.c == null))
    {
      this.c = this.e.k(this.d);
      if (this.c == null) {
        this.c = zabg.a;
      }
      this.b = this.c.b(this.d);
    }
    return this.b;
  }
  
  public void setCalculatedValue(Object value)
  {
    this.a = true;
    this.b = value;
  }
  
  public Workbook getWorkbook()
  {
    return this.d.p.d;
  }
  
  public Worksheet getWorksheet()
  {
    return this.d.c;
  }
  
  public Cell getCell()
  {
    return this.d.g.checkCell(this.d.d, this.d.e);
  }
  
  public String getFunctionName()
  {
    return this.e.p().a();
  }
  
  public int getParamCount()
  {
    return this.e.q();
  }
  
  public Object getParamValue(int index)
  {
    return this.f[index].b(this.d);
  }
  
  public String getParamText(int index)
  {
    return this.f[index].a(this.d.i());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/CalculationData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */