package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcag
{
  static byte[] a(WorksheetCollection paramWorksheetCollection, int paramInt, CellArea paramCellArea)
  {
    byte[] arrayOfByte = null;
    int i = paramWorksheetCollection.r().b(paramWorksheetCollection.v(), paramInt);
    if ((paramCellArea.StartRow == paramCellArea.EndRow) && (paramCellArea.StartColumn == paramCellArea.EndColumn))
    {
      arrayOfByte = new byte[9];
      arrayOfByte[0] = 7;
      arrayOfByte[2] = 58;
      System.arraycopy(zc.a(paramCellArea.StartRow), 0, arrayOfByte, 5, 2);
      arrayOfByte[7] = ((byte)paramCellArea.StartColumn);
    }
    else
    {
      arrayOfByte = new byte[13];
      arrayOfByte[0] = 11;
      arrayOfByte[2] = 59;
      System.arraycopy(zc.a(paramCellArea.StartRow), 0, arrayOfByte, 5, 2);
      System.arraycopy(zc.a(paramCellArea.EndRow), 0, arrayOfByte, 7, 2);
      arrayOfByte[9] = ((byte)paramCellArea.StartColumn);
      arrayOfByte[11] = ((byte)paramCellArea.EndColumn);
    }
    System.arraycopy(zc.a(i), 0, arrayOfByte, 3, 2);
    return arrayOfByte;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */