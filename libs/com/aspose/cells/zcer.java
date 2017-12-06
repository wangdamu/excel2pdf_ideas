package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.c.a.za;
import java.util.HashMap;

class zcer
  extends zche
{
  private static final za a = new za(new String[] { "#NULL!", "#DIV/0!", "#VALUE!", "#REF!", "#NAME?", "#NUM!", "#N/A" });
  
  static int a(byte[] paramArrayOfByte, Cell paramCell, HashMap paramHashMap)
  {
    paramArrayOfByte[0] = 3;
    paramArrayOfByte[1] = 9;
    int i = 2;
    System.arraycopy(zc.a(paramCell.getColumn()), 0, paramArrayOfByte, i, 4);
    i += 4;
    int j = ((Integer)paramHashMap.get(Integer.valueOf(paramCell.r()))).intValue();
    System.arraycopy(zc.a(j), 0, paramArrayOfByte, i, 4);
    i += 4;
    switch (a.a(paramCell.k()))
    {
    case 0: 
      paramArrayOfByte[i] = 0;
      break;
    case 1: 
      paramArrayOfByte[i] = 7;
      break;
    case 2: 
      paramArrayOfByte[i] = 15;
      break;
    case 3: 
      paramArrayOfByte[i] = 23;
      break;
    case 4: 
      paramArrayOfByte[i] = 29;
      break;
    case 5: 
      paramArrayOfByte[i] = 36;
      break;
    case 6: 
      paramArrayOfByte[i] = 42;
      break;
    }
    i++;
    return i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */