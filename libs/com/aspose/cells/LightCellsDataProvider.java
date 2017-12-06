package com.aspose.cells;

public abstract interface LightCellsDataProvider
{
  public abstract boolean startSheet(int paramInt);
  
  public abstract int nextRow();
  
  public abstract void startRow(Row paramRow);
  
  public abstract int nextCell();
  
  public abstract void startCell(Cell paramCell);
  
  public abstract boolean isGatherString();
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/LightCellsDataProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */