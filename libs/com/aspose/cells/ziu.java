package com.aspose.cells;

class ziu
  implements ICellsDataTable
{
  String[] a;
  Object[] b;
  private int c = -1;
  
  ziu(String paramString, Object[] paramArrayOfObject)
  {
    this.b = paramArrayOfObject;
    this.a = new String[] { paramString };
  }
  
  public String[] getColumns()
  {
    return this.a;
  }
  
  public int getCount()
  {
    return this.b.length;
  }
  
  public void beforeFirst()
  {
    this.c = -1;
  }
  
  public Object get(int index)
  {
    return this.b[this.c];
  }
  
  public Object get(String columnName)
  {
    return this.b[this.c];
  }
  
  public boolean next()
  {
    this.c += 1;
    return this.c < this.b.length;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ziu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */