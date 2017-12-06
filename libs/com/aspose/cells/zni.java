package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zni
  extends zcd
{
  zni()
  {
    c(432);
  }
  
  void a(FormatConditionCollection paramFormatConditionCollection, int paramInt1, int paramInt2)
  {
    int i = paramFormatConditionCollection.getRangeCount();
    int j = 14 + i * 8;
    if (j <= 8224) {
      a((short)j);
    } else {
      throw new CellsException(10, "There are too much ranges in one conditional formatting.");
    }
    this.b = new byte[d()];
    int k = 0;
    System.arraycopy(zc.a((short)paramInt1), 0, this.b, k, 2);
    System.arraycopy(zc.a((short)(paramInt2 << 1 | (paramFormatConditionCollection.c ? 1 : 0))), 0, this.b, k + 2, 2);
    k = 12;
    System.arraycopy(zc.a(i), 0, this.b, k, 2);
    k += 2;
    int m = 65535;
    int n = 255;
    int i1 = 0;
    int i2 = 0;
    byte[] arrayOfByte = this.b;
    for (int i3 = 0; i3 < i; i3++)
    {
      CellArea localCellArea = (CellArea)paramFormatConditionCollection.b.get(i3);
      if (localCellArea.StartRow < m) {
        m = localCellArea.StartRow;
      }
      if (localCellArea.StartColumn < n) {
        n = localCellArea.StartColumn;
      }
      if (localCellArea.EndRow > i1) {
        i1 = localCellArea.EndRow;
      }
      if (localCellArea.EndColumn > i2) {
        i2 = localCellArea.EndColumn;
      }
      k += a(arrayOfByte, k, localCellArea);
    }
    System.arraycopy(zc.a(m), 0, this.b, 4, 2);
    System.arraycopy(zc.a(i1), 0, this.b, 6, 2);
    System.arraycopy(zc.a(n), 0, this.b, 8, 2);
    System.arraycopy(zc.a(i2), 0, this.b, 10, 2);
  }
  
  static int a(byte[] paramArrayOfByte, int paramInt, CellArea paramCellArea)
  {
    System.arraycopy(zc.a(paramCellArea.StartRow), 0, paramArrayOfByte, paramInt, 2);
    System.arraycopy(zc.a(paramCellArea.EndRow), 0, paramArrayOfByte, paramInt + 2, 2);
    System.arraycopy(zc.a(paramCellArea.StartColumn), 0, paramArrayOfByte, paramInt + 4, 2);
    System.arraycopy(zc.a(paramCellArea.EndColumn), 0, paramArrayOfByte, paramInt + 6, 2);
    return 8;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zni.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */