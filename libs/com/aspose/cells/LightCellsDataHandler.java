package com.aspose.cells;

public abstract interface LightCellsDataHandler
{
  public abstract boolean startSheet(Worksheet paramWorksheet);
  
  public abstract boolean startRow(int paramInt);
  
  public abstract boolean processRow(Row paramRow);
  
  public abstract boolean startCell(int paramInt);
  
  public abstract boolean processCell(Cell paramCell);
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/LightCellsDataHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */