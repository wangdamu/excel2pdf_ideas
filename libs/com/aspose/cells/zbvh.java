package com.aspose.cells;

class zbvh
{
  private CellArea a = new CellArea();
  private ListObject b = null;
  
  CellArea a()
  {
    return this.a;
  }
  
  public ListObject b()
  {
    return this.b;
  }
  
  boolean c()
  {
    return this.b == null;
  }
  
  zbvh(int paramInt1, int paramInt2, int paramInt3, int paramInt4, ListObject paramListObject)
  {
    this.a.StartRow = paramInt1;
    this.a.StartColumn = paramInt2;
    this.a.EndRow = paramInt3;
    this.a.EndColumn = paramInt4;
    this.b = paramListObject;
  }
  
  boolean a(CellArea paramCellArea)
  {
    return this.a.b(paramCellArea);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbvh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */