package com.aspose.cells;

public class CellsException
  extends IllegalStateException
{
  private int a;
  
  CellsException(int code, String message)
  {
    super(message);
    this.a = code;
  }
  
  CellsException(int code, String message, Exception innerException)
  {
    super(message, innerException);
    this.a = code;
  }
  
  public int getCode()
  {
    return this.a;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/CellsException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */