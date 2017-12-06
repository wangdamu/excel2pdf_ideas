package com.aspose.cells;

/**
 * @deprecated
 */
public abstract interface CellHandler
{
  public abstract boolean startSheet(int paramInt);
  
  public abstract boolean startCell(int paramInt1, int paramInt2);
  
  public abstract void process(LightCell paramLightCell);
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/CellHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */