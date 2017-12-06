package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zh;

class zcbg
  extends zche
{
  zcbg()
  {
    this.d = 1048;
  }
  
  void a(FormatCondition paramFormatCondition)
    throws Exception
  {
    zcfz localzcfz = new zcfz(paramFormatCondition);
    int i = 66 + localzcfz.c();
    int j = paramFormatCondition.getType();
    String str = paramFormatCondition.getText();
    if (str != null) {
      i += 4 + str.length() * 2;
    }
    this.c = new byte[i];
    int k = localzcfz.b(this.c, 0);
    switch (j)
    {
    case 5: 
      this.c[(k + 0)] = 5;
      this.c[(k + 4)] = 5;
      this.c[(k + 16)] = ((byte)paramFormatCondition.getTop10().getRank());
      break;
    case 1: 
      this.c[(k + 0)] = 2;
      this.c[(k + 4)] = 0;
      break;
    case 0: 
      this.c[(k + 0)] = 1;
      this.c[(k + 4)] = 0;
      this.c[(k + 16)] = ((byte)zcij.b(paramFormatCondition.getOperator()));
      break;
    case 2: 
      this.c[(k + 0)] = 3;
      this.c[(k + 4)] = 2;
      break;
    case 3: 
      this.c[(k + 0)] = 4;
      this.c[(k + 4)] = 3;
      break;
    case 4: 
      this.c[(k + 0)] = 6;
      this.c[(k + 4)] = 4;
      break;
    case 17: 
      AboveAverage localAboveAverage = paramFormatCondition.getAboveAverage();
      System.arraycopy(zc.a(localAboveAverage.getStdDev()), 0, this.c, k + 16, 4);
      if (localAboveAverage.isAboveAverage())
      {
        if (localAboveAverage.isEqualAverage())
        {
          this.c[(k + 0)] = 2;
          this.c[(k + 4)] = 29;
        }
        else
        {
          this.c[(k + 0)] = 2;
          this.c[(k + 4)] = 25;
        }
      }
      else if (localAboveAverage.isEqualAverage())
      {
        this.c[(k + 0)] = 2;
        this.c[(k + 4)] = 30;
      }
      else
      {
        this.c[(k + 0)] = 2;
        this.c[(k + 4)] = 26;
      }
      break;
    case 6: 
      this.c[(k + 0)] = 2;
      this.c[(k + 4)] = 7;
      break;
    case 8: 
      this.c[(k + 0)] = 2;
      this.c[(k + 4)] = 8;
      this.c[(k + 16)] = 0;
      break;
    case 9: 
      this.c[(k + 0)] = 2;
      this.c[(k + 4)] = 8;
      this.c[(k + 16)] = 1;
      break;
    case 10: 
      this.c[(k + 0)] = 2;
      this.c[(k + 4)] = 8;
      this.c[(k + 16)] = 2;
      break;
    case 11: 
      this.c[(k + 0)] = 2;
      this.c[(k + 4)] = 8;
      this.c[(k + 16)] = 3;
      break;
    case 12: 
      this.c[(k + 0)] = 2;
      this.c[(k + 4)] = 9;
      break;
    case 14: 
      this.c[(k + 0)] = 2;
      this.c[(k + 4)] = 11;
      break;
    case 13: 
      this.c[(k + 0)] = 2;
      this.c[(k + 4)] = 10;
      break;
    case 15: 
      this.c[(k + 0)] = 2;
      this.c[(k + 4)] = 12;
      break;
    case 7: 
      this.c[(k + 0)] = 2;
      this.c[(k + 4)] = 27;
      break;
    case 16: 
      switch (paramFormatCondition.getTimePeriod())
      {
      case 0: 
        this.c[(k + 0)] = 2;
        this.c[(k + 4)] = 15;
        break;
      case 2: 
        this.c[(k + 0)] = 2;
        this.c[(k + 4)] = 16;
        break;
      case 1: 
        this.c[(k + 0)] = 2;
        this.c[(k + 4)] = 17;
        break;
      case 3: 
        this.c[(k + 0)] = 2;
        this.c[(k + 4)] = 18;
        break;
      case 5: 
        this.c[(k + 0)] = 2;
        this.c[(k + 4)] = 19;
        break;
      case 6: 
        this.c[(k + 0)] = 2;
        this.c[(k + 4)] = 20;
        break;
      case 7: 
        this.c[(k + 0)] = 2;
        this.c[(k + 4)] = 21;
        break;
      case 9: 
        this.c[(k + 0)] = 2;
        this.c[(k + 4)] = 22;
        break;
      case 8: 
        this.c[(k + 0)] = 2;
        this.c[(k + 4)] = 23;
        break;
      case 4: 
        this.c[(k + 0)] = 2;
        this.c[(k + 4)] = 24;
        break;
      default: 
        this.c[(k + 0)] = 2;
        this.c[(k + 4)] = 15;
      }
      break;
    }
    if (paramFormatCondition.getType() == 3)
    {
      System.arraycopy(zc.a(-1), 0, this.c, k + 12, 4);
    }
    else
    {
      System.arraycopy(zc.a(paramFormatCondition.d()), 0, this.c, k + 8, 4);
      System.arraycopy(zc.a(paramFormatCondition.getPriority()), 0, this.c, k + 12, 4);
    }
    int m = 0;
    if (paramFormatCondition.getStopIfTrue()) {
      m = (byte)(m | 0x2);
    }
    if ((paramFormatCondition.getTop10() != null) && (paramFormatCondition.getTop10().isBottom())) {
      m = (byte)(m | 0x8);
    }
    if ((paramFormatCondition.getTop10() != null) && (paramFormatCondition.getTop10().isPercent())) {
      m = (byte)(m | 0x10);
    }
    this.c[(k + 28)] = m;
    if (localzcfz.c != null) {
      for (int n = 0; n < localzcfz.c.length; n++) {
        System.arraycopy(localzcfz.c[n], 0, this.c, k + 30 + n * 4, 4);
      }
    }
    k += 46;
    byte[] arrayOfByte = paramFormatCondition.b().a();
    System.arraycopy(arrayOfByte, 0, this.c, k, 16);
    this.c[(k + 16)] = 1;
    k += 20;
    if (str != null) {
      k = zcgj.a(this.c, k, str);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcbg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */