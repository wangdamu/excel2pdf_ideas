package com.aspose.cells;

public abstract class AbstractCalculationMonitor
{
  int a = 0;
  Object b;
  int c = 0;
  Object d;
  
  protected void interrupt(String msg)
  {
    throw new CellsException(17, msg == null ? "" : msg);
  }
  
  public Object getOriginalValue()
  {
    if (this.a == 3) {
      return ztr.b(((Byte)this.b).byteValue());
    }
    return this.b;
  }
  
  public boolean getValueChanged()
  {
    return zgj.a.a(this.a, this.b, this.c, this.d);
  }
  
  public Object getCalculatedValue()
  {
    if (this.c == 3) {
      return ztr.b(((Byte)this.d).byteValue());
    }
    return this.d;
  }
  
  public void beforeCalculate(int sheetIndex, int rowIndex, int colIndex) {}
  
  public void afterCalculate(int sheetIndex, int rowIndex, int colIndex) {}
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/AbstractCalculationMonitor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */