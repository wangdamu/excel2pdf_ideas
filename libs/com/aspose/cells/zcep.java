package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.HashMap;

class zcep
  extends zche
{
  static int a(byte[] paramArrayOfByte, boolean paramBoolean, Cell paramCell, HashMap paramHashMap)
  {
    int i = 2;
    if (paramBoolean)
    {
      paramArrayOfByte[0] = 1;
      paramArrayOfByte[1] = 8;
      System.arraycopy(zc.a(paramCell.getColumn()), 0, paramArrayOfByte, i, 4);
      i += 4;
    }
    else
    {
      paramArrayOfByte[0] = 12;
      paramArrayOfByte[1] = 4;
    }
    int j = ((Integer)paramHashMap.get(Integer.valueOf(paramCell.r()))).intValue();
    System.arraycopy(zc.a(j), 0, paramArrayOfByte, i, 4);
    i += 4;
    return i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcep.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */