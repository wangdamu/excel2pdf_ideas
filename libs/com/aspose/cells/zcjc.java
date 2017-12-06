package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcjc
{
  static byte[] a(WorksheetCollection paramWorksheetCollection, int paramInt, CellArea paramCellArea)
  {
    byte[] arrayOfByte = null;
    int i = paramWorksheetCollection.r().b(paramWorksheetCollection.v(), paramInt);
    if ((paramCellArea.StartRow == paramCellArea.EndRow) && (paramCellArea.StartColumn == paramCellArea.EndColumn))
    {
      arrayOfByte = new byte[17];
      arrayOfByte[0] = 9;
      arrayOfByte[4] = 58;
      zcjb.a(arrayOfByte, 7, paramCellArea.StartRow, 0, true, false);
      zcjb.c(arrayOfByte, 11, paramCellArea.StartColumn, 0, true, false);
    }
    else
    {
      arrayOfByte = new byte[23];
      arrayOfByte[0] = 15;
      arrayOfByte[4] = 59;
      zcjb.a(arrayOfByte, 7, paramCellArea.StartRow, 0, true, false);
      zcjb.a(arrayOfByte, 11, paramCellArea.EndRow, 0, true, false);
      zcjb.c(arrayOfByte, 15, paramCellArea.StartColumn, 0, true, false);
      zcjb.c(arrayOfByte, 17, paramCellArea.EndColumn, 0, true, false);
    }
    System.arraycopy(zc.a(i), 0, arrayOfByte, 5, 2);
    return arrayOfByte;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcjc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */