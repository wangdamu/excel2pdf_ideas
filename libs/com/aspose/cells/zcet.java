package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.HashMap;

class zcet
  extends zche
{
  static int a(byte[] paramArrayOfByte, boolean paramBoolean, Cell paramCell, HashMap paramHashMap)
  {
    int i = 2;
    int j;
    if (paramCell.c.c == 6)
    {
      if (paramBoolean)
      {
        paramArrayOfByte[0] = 2;
        paramArrayOfByte[1] = 12;
        System.arraycopy(zc.a(paramCell.getColumn()), 0, paramArrayOfByte, i, 4);
        i += 4;
      }
      else
      {
        paramArrayOfByte[0] = 13;
        paramArrayOfByte[1] = 8;
      }
      j = ((Integer)paramHashMap.get(Integer.valueOf(paramCell.r()))).intValue();
      System.arraycopy(zc.a(j), 0, paramArrayOfByte, i, 4);
      i += 4;
      System.arraycopy(zc.a(((Integer)paramCell.c.d).intValue()), 0, paramArrayOfByte, i, 4);
      i += 4;
    }
    else
    {
      if (paramBoolean)
      {
        paramArrayOfByte[0] = 5;
        paramArrayOfByte[1] = 16;
        System.arraycopy(zc.a(paramCell.getColumn()), 0, paramArrayOfByte, i, 4);
        i += 4;
      }
      else
      {
        paramArrayOfByte[0] = 16;
        paramArrayOfByte[1] = 12;
      }
      j = ((Integer)paramHashMap.get(Integer.valueOf(paramCell.r()))).intValue();
      System.arraycopy(zc.a(j), 0, paramArrayOfByte, i, 4);
      i += 4;
      System.arraycopy(zc.a(((Double)paramCell.c.d).doubleValue()), 0, paramArrayOfByte, i, 8);
      i += 8;
    }
    return i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */