package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.HashMap;

class zceq
  extends zche
{
  static int a(byte[] paramArrayOfByte, boolean paramBoolean, Cell paramCell, HashMap paramHashMap)
  {
    int i = 2;
    if (paramBoolean)
    {
      paramArrayOfByte[0] = 4;
      paramArrayOfByte[1] = 9;
      System.arraycopy(zc.a(paramCell.getColumn()), 0, paramArrayOfByte, i, 4);
      i += 4;
    }
    else
    {
      paramArrayOfByte[0] = 15;
      paramArrayOfByte[1] = 5;
    }
    int j = ((Integer)paramHashMap.get(Integer.valueOf(paramCell.r()))).intValue();
    System.arraycopy(zc.a(j), 0, paramArrayOfByte, i, 4);
    i += 4;
    paramArrayOfByte[i] = ((byte)(paramCell.getBoolValue() ? 1 : 0));
    i++;
    return i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zceq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */