package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class znh
  extends zcd
{
  znh()
  {
    c(2169);
  }
  
  void a(FormatConditionCollection paramFormatConditionCollection, int paramInt1, int paramInt2)
  {
    int i = paramFormatConditionCollection.getRangeCount();
    a((short)(26 + i * 8));
    this.b = new byte[d()];
    this.b[0] = 121;
    this.b[1] = 8;
    this.b[2] = 1;
    int j = 12;
    System.arraycopy(zc.a((short)paramInt1), 0, this.b, j, 2);
    j += 2;
    System.arraycopy(zc.a((short)(paramInt2 << 1 | (paramFormatConditionCollection.c ? 1 : 0))), 0, this.b, j, 2);
    j += 10;
    System.arraycopy(zc.a(i), 0, this.b, j, 2);
    j += 2;
    int k = 65535;
    int m = 255;
    int n = 0;
    int i1 = 0;
    byte[] arrayOfByte = this.b;
    for (int i2 = 0; i2 < i; i2++)
    {
      CellArea localCellArea = (CellArea)paramFormatConditionCollection.b.get(i2);
      if (localCellArea.StartRow < k) {
        k = localCellArea.StartRow;
      }
      if (localCellArea.StartColumn < m) {
        m = localCellArea.StartColumn;
      }
      if (localCellArea.EndRow > n) {
        n = localCellArea.EndRow;
      }
      if (localCellArea.EndColumn > i1) {
        i1 = localCellArea.EndColumn;
      }
      j += a(arrayOfByte, j, localCellArea);
    }
    System.arraycopy(zc.a(k), 0, this.b, 4, 2);
    System.arraycopy(zc.a(n), 0, this.b, 6, 2);
    System.arraycopy(zc.a(m), 0, this.b, 8, 2);
    System.arraycopy(zc.a(i1), 0, this.b, 10, 2);
    System.arraycopy(this.b, 4, this.b, 16, 8);
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/znh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */