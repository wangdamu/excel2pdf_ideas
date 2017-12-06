package com.aspose.cells;

public abstract interface ICellsDataTable
{
  public abstract String[] getColumns();
  
  public abstract int getCount();
  
  public abstract void beforeFirst();
  
  public abstract Object get(int paramInt);
  
  public abstract Object get(String paramString);
  
  public abstract boolean next();
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ICellsDataTable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */