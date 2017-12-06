package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcbh
  extends zche
{
  zcbh()
  {
    this.d = 463;
  }
  
  void a(FormatCondition paramFormatCondition)
    throws Exception
  {
    int i = 42;
    byte[] arrayOfByte1 = null;
    byte[] arrayOfByte2 = null;
    int j = paramFormatCondition.getType();
    arrayOfByte1 = paramFormatCondition.a();
    arrayOfByte2 = paramFormatCondition.c();
    Object localObject = null;
    String str = paramFormatCondition.getText();
    if (arrayOfByte1 != null) {
      i += arrayOfByte1.length;
    }
    if (arrayOfByte2 != null) {
      i += arrayOfByte2.length;
    }
    if (localObject != null) {
      i += localObject.length;
    }
    if (str != null) {
      i += 4 + str.length() * 2;
    } else {
      i += 4;
    }
    this.c = new byte[i];
    switch (j)
    {
    case 5: 
      this.c[0] = 5;
      this.c[4] = 5;
      this.c[16] = ((byte)paramFormatCondition.getTop10().getRank());
      break;
    case 1: 
      this.c[0] = 2;
      this.c[4] = 0;
      break;
    case 0: 
      this.c[0] = 1;
      this.c[4] = 0;
      this.c[16] = ((byte)zcij.b(paramFormatCondition.getOperator()));
      break;
    case 2: 
      this.c[0] = 3;
      this.c[4] = 2;
      break;
    case 3: 
      this.c[0] = 4;
      this.c[4] = 3;
      break;
    case 4: 
      this.c[0] = 6;
      this.c[4] = 4;
      break;
    case 17: 
      AboveAverage localAboveAverage = paramFormatCondition.getAboveAverage();
      System.arraycopy(zc.a(localAboveAverage.getStdDev()), 0, this.c, 16, 4);
      if (localAboveAverage.isAboveAverage())
      {
        if (localAboveAverage.isEqualAverage())
        {
          this.c[0] = 2;
          this.c[4] = 29;
        }
        else
        {
          this.c[0] = 2;
          this.c[4] = 25;
        }
      }
      else if (localAboveAverage.isEqualAverage())
      {
        this.c[0] = 2;
        this.c[4] = 30;
      }
      else
      {
        this.c[0] = 2;
        this.c[4] = 26;
      }
      break;
    case 6: 
      this.c[0] = 2;
      this.c[4] = 7;
      break;
    case 8: 
      this.c[0] = 2;
      this.c[4] = 8;
      this.c[16] = 0;
      break;
    case 9: 
      this.c[0] = 2;
      this.c[4] = 8;
      this.c[16] = 1;
      break;
    case 10: 
      this.c[0] = 2;
      this.c[4] = 8;
      this.c[16] = 2;
      break;
    case 11: 
      this.c[0] = 2;
      this.c[4] = 8;
      this.c[16] = 3;
      break;
    case 12: 
      this.c[0] = 2;
      this.c[4] = 9;
      break;
    case 14: 
      this.c[0] = 2;
      this.c[4] = 11;
      break;
    case 13: 
      this.c[0] = 2;
      this.c[4] = 10;
      break;
    case 15: 
      this.c[0] = 2;
      this.c[4] = 12;
      break;
    case 7: 
      this.c[0] = 2;
      this.c[4] = 27;
      break;
    case 16: 
      switch (paramFormatCondition.getTimePeriod())
      {
      case 0: 
        this.c[0] = 2;
        this.c[4] = 15;
        break;
      case 2: 
        this.c[0] = 2;
        this.c[4] = 16;
        break;
      case 1: 
        this.c[0] = 2;
        this.c[4] = 17;
        break;
      case 3: 
        this.c[0] = 2;
        this.c[4] = 18;
        break;
      case 5: 
        this.c[0] = 2;
        this.c[4] = 19;
        break;
      case 6: 
        this.c[0] = 2;
        this.c[4] = 20;
        break;
      case 7: 
        this.c[0] = 2;
        this.c[4] = 21;
        break;
      case 9: 
        this.c[0] = 2;
        this.c[4] = 22;
        break;
      case 8: 
        this.c[0] = 2;
        this.c[4] = 23;
        break;
      case 4: 
        this.c[0] = 2;
        this.c[4] = 24;
        break;
      default: 
        this.c[0] = 2;
        this.c[4] = 15;
      }
      break;
    }
    System.arraycopy(zc.a(paramFormatCondition.d()), 0, this.c, 8, 4);
    System.arraycopy(zc.a(paramFormatCondition.getPriority()), 0, this.c, 12, 4);
    int k = 0;
    if (paramFormatCondition.getStopIfTrue()) {
      k = (byte)(k | 0x2);
    }
    if ((paramFormatCondition.getTop10() != null) && (paramFormatCondition.getTop10().isBottom())) {
      k = (byte)(k | 0x8);
    }
    if ((paramFormatCondition.getTop10() != null) && (paramFormatCondition.getTop10().isPercent())) {
      k = (byte)(k | 0x10);
    }
    this.c[28] = k;
    if (arrayOfByte1 != null) {
      System.arraycopy(arrayOfByte1, 0, this.c, 30, 4);
    }
    if (arrayOfByte2 != null) {
      System.arraycopy(arrayOfByte2, 0, this.c, 34, 4);
    }
    if (localObject != null) {
      System.arraycopy(localObject, 0, this.c, 38, 4);
    }
    int m = 42;
    if (str != null)
    {
      m = zcgj.a(this.c, m, str);
    }
    else
    {
      byte[] arrayOfByte3 = { -1, -1, -1, -1 };
      System.arraycopy(arrayOfByte3, 0, this.c, m, 4);
      m += 4;
    }
    if (arrayOfByte1 != null)
    {
      System.arraycopy(arrayOfByte1, 0, this.c, m, arrayOfByte1.length);
      m += arrayOfByte1.length;
    }
    if (arrayOfByte2 != null)
    {
      System.arraycopy(arrayOfByte2, 0, this.c, m, arrayOfByte2.length);
      m += arrayOfByte2.length;
    }
    if (localObject != null)
    {
      System.arraycopy(localObject, 0, this.c, m, localObject.length);
      m += localObject.length;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcbh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */