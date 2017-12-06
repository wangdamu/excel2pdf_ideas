package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.c.a.za;
import java.util.HashMap;

class zces
  extends zche
{
  private static final za a = new za(new String[] { "#NULL!", "#DIV/0!", "#VALUE!", "#REF!", "#NAME?", "#NUM!", "#N/A" });
  
  void a(Cell paramCell, HashMap paramHashMap)
    throws Exception
  {
    int i = 0;
    int j = 0;
    byte[] arrayOfByte = paramCell.x();
    j = arrayOfByte.length;
    Object localObject = paramCell.getValue();
    switch (paramCell.getType())
    {
    case 0: 
      this.d = 10;
      this.c = new byte[11 + j];
      if (((Boolean)localObject).booleanValue()) {
        this.c[8] = 1;
      }
      i = 9;
      break;
    case 2: 
      this.d = 11;
      this.c = new byte[11 + j];
      switch (a.a((String)localObject))
      {
      case 0: 
        this.c[8] = 0;
        break;
      case 1: 
        this.c[8] = 7;
        break;
      case 2: 
        this.c[8] = 15;
        break;
      case 3: 
        this.c[8] = 23;
        break;
      case 4: 
        this.c[8] = 29;
        break;
      case 5: 
        this.c[8] = 36;
        break;
      case 6: 
        this.c[8] = 42;
      }
      i = 9;
      break;
    case 1: 
    case 4: 
      this.d = 9;
      this.c = new byte[18 + j];
      double d = 0.0D;
      d = paramCell.getDoubleValue();
      System.arraycopy(zc.a(d), 0, this.c, 8, 8);
      i = 16;
      break;
    case 3: 
    case 5: 
      this.d = 8;
      String str = (String)localObject;
      if (str == null) {
        str = "";
      }
      this.c = new byte[14 + str.length() * 2 + j];
      i = 8;
      i = zcgj.a(this.c, i, str);
    }
    System.arraycopy(zc.a(paramCell.getColumn()), 0, this.c, 0, 4);
    int k = ((Integer)paramHashMap.get(Integer.valueOf(paramCell.r()))).intValue();
    System.arraycopy(zc.a(k), 0, this.c, 4, 4);
    if (paramCell.d.p().p().getSettings().getReCalculateOnOpen()) {
      this.c[i] = 2;
    }
    System.arraycopy(arrayOfByte, 0, this.c, i + 2, arrayOfByte.length);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zces.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */