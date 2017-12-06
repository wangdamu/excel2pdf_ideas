package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;
import java.util.Iterator;

class zfb
  extends zcd
{
  private FormatCondition a;
  
  zfb()
  {
    c(2170);
  }
  
  void a(zzt paramzzt)
  {
    this.a = paramzzt.a;
    int i = 18;
    byte[] arrayOfByte1 = null;
    byte[] arrayOfByte2 = null;
    int j;
    switch (this.a.getType())
    {
    case 0: 
      j = 1;
      this.a.f();
      arrayOfByte1 = this.a.a();
      arrayOfByte2 = this.a.c();
      break;
    case 2: 
      j = 3;
      i += a(this.a.getColorScale());
      break;
    case 3: 
      j = 4;
      i += a(this.a.getDataBar());
      break;
    case 5: 
      j = 5;
      i += 6;
      break;
    case 4: 
      j = 6;
      i += a(this.a.getIconSet());
      break;
    case 1: 
    default: 
      j = 2;
      if (paramzzt.f != null)
      {
        arrayOfByte1 = paramzzt.f;
      }
      else
      {
        this.a.f();
        arrayOfByte1 = this.a.a();
      }
      break;
    }
    if (arrayOfByte1 != null)
    {
      i += arrayOfByte1.length - 2;
      if (arrayOfByte2 != null) {
        i += arrayOfByte2.length - 2;
      }
    }
    i += paramzzt.c();
    i += 24;
    a((short)i);
    this.b = new byte[i];
    this.b[0] = 122;
    this.b[1] = 8;
    int k = 12;
    this.b[k] = j;
    this.b[(k + 1)] = zfd.a(j != 1 ? 6 : this.a.getOperator());
    k += 2;
    if (arrayOfByte1 != null)
    {
      System.arraycopy(zc.a((short)(arrayOfByte1.length - 2)), 0, this.b, k, 2);
      if (arrayOfByte2 != null) {
        System.arraycopy(zc.a((short)(arrayOfByte2.length - 2)), 0, this.b, k + 2, 2);
      }
    }
    k += 4;
    k = a(paramzzt.d, paramzzt.c, this.b, k);
    if (arrayOfByte1 != null)
    {
      System.arraycopy(arrayOfByte1, 2, this.b, k, arrayOfByte1.length - 2);
      k += arrayOfByte1.length - 2;
      if (arrayOfByte2 != null)
      {
        System.arraycopy(arrayOfByte2, 2, this.b, k, arrayOfByte2.length - 2);
        k += arrayOfByte2.length - 2;
      }
    }
    k += 2;
    if (this.a.getStopIfTrue()) {
      this.b[k] = 2;
    }
    k++;
    System.arraycopy(zc.a(this.a.getPriority()), 0, this.b, k, 2);
    k += 2;
    System.arraycopy(zc.a(a(this.a)), 0, this.b, k, 2);
    k += 2;
    k = a(this.a, this.b, k);
    switch (this.a.getType())
    {
    case 2: 
      k = a(this.a.getColorScale(), this.b, k);
      break;
    case 3: 
      k = a(this.a.getDataBar(), this.b, k);
      break;
    case 5: 
      k = a(this.a.getTop10(), this.b, k);
      break;
    case 4: 
      k = a(this.a.getIconSet(), this.b, k);
    }
  }
  
  static int a(zsz paramzsz, zbzi paramzbzi, byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramInt;
    i += 4;
    int j = i;
    if (paramzsz != null)
    {
      System.arraycopy(paramzsz.e(), 0, paramArrayOfByte, i, paramzsz.d());
      i += paramzsz.d();
    }
    if (paramzbzi != null)
    {
      paramArrayOfByte[(i + 2)] = -1;
      paramArrayOfByte[(i + 3)] = -1;
      i += 6;
      System.arraycopy(zc.a(paramzbzi.getCount()), 0, paramArrayOfByte, i, 2);
      i += 2;
      i = zbzh.a(paramzbzi, paramArrayOfByte, i);
    }
    if (i > j) {
      System.arraycopy(zc.a(i - j), 0, paramArrayOfByte, j - 4, 4);
    } else {
      i += 2;
    }
    return i;
  }
  
  static int a(FormatCondition paramFormatCondition)
  {
    switch (paramFormatCondition.getType())
    {
    case 0: 
      return 0;
    case 1: 
      return 1;
    case 2: 
      return 2;
    case 3: 
      return 3;
    case 4: 
      return 4;
    case 5: 
      return 5;
    case 6: 
      return 7;
    case 8: 
    case 9: 
    case 10: 
    case 11: 
      return 8;
    case 12: 
      return 9;
    case 13: 
      return 10;
    case 14: 
      return 11;
    case 15: 
      return 12;
    case 16: 
      switch (paramFormatCondition.getTimePeriod())
      {
      case 0: 
        return 15;
      case 2: 
        return 16;
      case 1: 
        return 17;
      case 3: 
        return 18;
      case 5: 
        return 19;
      case 6: 
        return 20;
      case 7: 
        return 21;
      case 9: 
        return 22;
      case 8: 
        return 23;
      case 4: 
        return 24;
      }
      break;
    case 17: 
      AboveAverage localAboveAverage = paramFormatCondition.getAboveAverage();
      if (localAboveAverage.isAboveAverage())
      {
        if (localAboveAverage.isEqualAverage()) {
          return 29;
        }
        return 25;
      }
      if (localAboveAverage.isEqualAverage()) {
        return 30;
      }
      return 26;
    case 7: 
      return 27;
    }
    return 1;
  }
  
  static int a(FormatCondition paramFormatCondition, byte[] paramArrayOfByte, int paramInt)
  {
    paramArrayOfByte[paramInt] = 16;
    paramInt++;
    Object localObject;
    switch (paramFormatCondition.getType())
    {
    case 5: 
      localObject = paramFormatCondition.getTop10();
      int i = 0;
      if (!((Top10)localObject).isBottom()) {
        i = (byte)(i | 0x1);
      }
      if (((Top10)localObject).isPercent()) {
        i = (byte)(i | 0x2);
      }
      paramArrayOfByte[paramInt] = i;
      System.arraycopy(zc.a((short)((Top10)localObject).getRank()), 0, paramArrayOfByte, paramInt + 1, 2);
      break;
    case 8: 
      paramArrayOfByte[paramInt] = 0;
      break;
    case 9: 
      paramArrayOfByte[paramInt] = 1;
      break;
    case 10: 
      paramArrayOfByte[paramInt] = 2;
      break;
    case 11: 
      paramArrayOfByte[paramInt] = 3;
      break;
    case 17: 
      localObject = paramFormatCondition.getAboveAverage();
      System.arraycopy(zc.a((short)((AboveAverage)localObject).getStdDev()), 0, paramArrayOfByte, paramInt, 2);
      break;
    case 16: 
      short s = 0;
      switch (paramFormatCondition.getTimePeriod())
      {
      case 0: 
        s = 0;
        break;
      case 2: 
        s = 6;
        break;
      case 1: 
        s = 1;
        break;
      case 3: 
        s = 2;
        break;
      case 5: 
        s = 5;
        break;
      case 6: 
        s = 8;
        break;
      case 7: 
        s = 3;
        break;
      case 9: 
        s = 7;
        break;
      case 8: 
        s = 4;
        break;
      case 4: 
        s = 9;
      }
      System.arraycopy(zc.a(s), 0, paramArrayOfByte, paramInt, 2);
      break;
    }
    return paramInt + 16;
  }
  
  private int a(DataBar paramDataBar)
  {
    int i = 22;
    i += a(paramDataBar.a);
    i += a(paramDataBar.b);
    return i;
  }
  
  private int a(DataBar paramDataBar, byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramInt;
    i += 3;
    if (!paramDataBar.getShowValue())
    {
      int tmp16_14 = i;
      byte[] tmp16_13 = paramArrayOfByte;
      tmp16_13[tmp16_14] = ((byte)(tmp16_13[tmp16_14] | 0x2));
    }
    i++;
    paramArrayOfByte[i] = 10;
    paramArrayOfByte[(i + 1)] = 90;
    i += 2;
    i = a(paramDataBar.b(), paramArrayOfByte, i);
    i = a(paramDataBar.getMinCfvo(), paramArrayOfByte, i);
    i = a(paramDataBar.getMaxCfvo(), paramArrayOfByte, i);
    return i;
  }
  
  private int a(ColorScale paramColorScale)
  {
    int i = 6;
    i += a(paramColorScale.a) + 32;
    boolean bool = paramColorScale.a();
    if (bool) {
      i += a(paramColorScale.b) + 32;
    }
    i += a(paramColorScale.c) + 32;
    return i;
  }
  
  private int a(ColorScale paramColorScale, byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramInt;
    i += 3;
    boolean bool = paramColorScale.a();
    paramArrayOfByte[i] = ((byte)(bool ? 3 : 2));
    paramArrayOfByte[(i + 1)] = paramArrayOfByte[i];
    i += 2;
    paramArrayOfByte[i] = 3;
    i++;
    i = a(paramColorScale.getMinCfvo(), paramArrayOfByte, i);
    i += 8;
    if (bool)
    {
      i = a(paramColorScale.getMidCfvo(), paramArrayOfByte, i);
      System.arraycopy(zc.a(0.5D), 0, paramArrayOfByte, i, 8);
      i += 8;
    }
    i = a(paramColorScale.getMaxCfvo(), paramArrayOfByte, i);
    System.arraycopy(zc.a(1.0D), 0, paramArrayOfByte, i, 8);
    i += 8;
    i += 8;
    i = a(paramColorScale.d, paramArrayOfByte, i);
    if (bool)
    {
      System.arraycopy(zc.a(0.5D), 0, paramArrayOfByte, i, 8);
      i += 8;
      i = a(paramColorScale.e, paramArrayOfByte, i);
    }
    System.arraycopy(zc.a(1.0D), 0, paramArrayOfByte, i, 8);
    i += 8;
    i = a(paramColorScale.f, paramArrayOfByte, i);
    return i;
  }
  
  private int a(IconSet paramIconSet)
  {
    int i = 6;
    if (paramIconSet.getCfvos().getCount() > 0)
    {
      Iterator localIterator = paramIconSet.getCfvos().iterator();
      while (localIterator.hasNext())
      {
        ConditionalFormattingValue localConditionalFormattingValue = (ConditionalFormattingValue)localIterator.next();
        i += a(localConditionalFormattingValue) + 5;
      }
    }
    return i;
  }
  
  private int a(IconSet paramIconSet, byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramInt;
    i += 3;
    paramArrayOfByte[i] = ((byte)paramIconSet.getCfvos().getCount());
    i++;
    paramArrayOfByte[i] = ((byte)ztr.i(paramIconSet.getType()));
    i++;
    if (!paramIconSet.getShowValue())
    {
      int tmp46_44 = i;
      byte[] tmp46_43 = paramArrayOfByte;
      tmp46_43[tmp46_44] = ((byte)(tmp46_43[tmp46_44] | 0x1));
    }
    if (paramIconSet.b)
    {
      int tmp62_60 = i;
      byte[] tmp62_59 = paramArrayOfByte;
      tmp62_59[tmp62_60] = ((byte)(tmp62_59[tmp62_60] | 0x4));
    }
    i++;
    int j = zauj.Y(paramIconSet.getType());
    if (paramIconSet.getCfvos().getCount() < j) {
      throw new CellsException(3, zs.a(a(null).append("Need more CFVO for IconSet")));
    }
    for (int k = 0; k < j; k++)
    {
      ConditionalFormattingValue localConditionalFormattingValue = paramIconSet.getCfvos().get(k);
      i = a(localConditionalFormattingValue, paramArrayOfByte, i);
      if (localConditionalFormattingValue.isGTE()) {
        paramArrayOfByte[i] = 1;
      }
      i += 5;
    }
    return i;
  }
  
  private static int a(Top10 paramTop10, byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramInt;
    paramArrayOfByte[i] = 4;
    i += 3;
    if (!paramTop10.isBottom())
    {
      int tmp18_17 = i;
      byte[] tmp18_16 = paramArrayOfByte;
      tmp18_16[tmp18_17] = ((byte)(tmp18_16[tmp18_17] | 0x1));
    }
    if (paramTop10.isPercent())
    {
      int tmp33_32 = i;
      byte[] tmp33_31 = paramArrayOfByte;
      tmp33_31[tmp33_32] = ((byte)(tmp33_31[tmp33_32] | 0x2));
    }
    i++;
    System.arraycopy(zc.a((short)paramTop10.getRank()), 0, paramArrayOfByte, i, 2);
    i += 2;
    return i;
  }
  
  private int a(ConditionalFormattingValue paramConditionalFormattingValue)
  {
    switch (paramConditionalFormattingValue.getType())
    {
    case 1: 
    case 2: 
    case 6: 
    case 7: 
      return 3;
    case 0: 
    case 3: 
    case 4: 
    case 5: 
      if (paramConditionalFormattingValue.e())
      {
        if (paramConditionalFormattingValue.f() == null) {
          throw new CellsException(3, zs.a(a(null).append("Invalid formula for CFVO")));
        }
        if (paramConditionalFormattingValue.f().length > 2) {
          return 1 + paramConditionalFormattingValue.f().length;
        }
      }
      return 11;
    }
    return 0;
  }
  
  private static int a(ConditionalFormattingValue paramConditionalFormattingValue, byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramInt;
    switch (paramConditionalFormattingValue.getType())
    {
    case 0: 
      paramArrayOfByte[i] = 7;
      i++;
      i = b(paramConditionalFormattingValue, paramArrayOfByte, i);
      break;
    case 2: 
    case 7: 
      paramArrayOfByte[i] = 2;
      i += 3;
      break;
    case 1: 
    case 6: 
      paramArrayOfByte[i] = 3;
      i += 3;
      break;
    case 3: 
      paramArrayOfByte[i] = 1;
      i++;
      i = b(paramConditionalFormattingValue, paramArrayOfByte, i);
      break;
    case 4: 
      paramArrayOfByte[i] = 4;
      i++;
      i = b(paramConditionalFormattingValue, paramArrayOfByte, i);
      break;
    case 5: 
      paramArrayOfByte[i] = 5;
      i++;
      i = b(paramConditionalFormattingValue, paramArrayOfByte, i);
    }
    return i;
  }
  
  private static int b(ConditionalFormattingValue paramConditionalFormattingValue, byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramInt;
    if ((paramConditionalFormattingValue.e()) && (paramConditionalFormattingValue.f() != null) && (paramConditionalFormattingValue.f().length > 2))
    {
      System.arraycopy(paramConditionalFormattingValue.f(), 0, paramArrayOfByte, i, paramConditionalFormattingValue.f().length);
      return i + paramConditionalFormattingValue.f().length;
    }
    i += 2;
    System.arraycopy(zc.a(paramConditionalFormattingValue.d()), 0, paramArrayOfByte, i, 8);
    i += 8;
    return i;
  }
  
  static int a(zaml paramzaml, byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramInt;
    switch (paramzaml.c())
    {
    case 0: 
    case 1: 
      return i + 16;
    case 3: 
      paramArrayOfByte[i] = 1;
      i += 4;
      System.arraycopy(zc.a(paramzaml.e()), 0, paramArrayOfByte, i, 4);
      break;
    case 4: 
      paramArrayOfByte[i] = 3;
      i += 4;
      System.arraycopy(zc.a(paramzaml.e()), 0, paramArrayOfByte, i, 4);
      break;
    case 2: 
    default: 
      paramArrayOfByte[i] = 2;
      i += 4;
      int j = paramzaml.e();
      paramArrayOfByte[i] = ((byte)((j & 0xFF0000) >> 16));
      paramArrayOfByte[(i + 1)] = ((byte)((j & 0xFF00) >> 8));
      paramArrayOfByte[(i + 2)] = ((byte)(j & 0xFF));
      break;
    }
    i += 4;
    System.arraycopy(zc.a(paramzaml.g()), 0, paramArrayOfByte, i, 8);
    i += 8;
    return i;
  }
  
  private StringBuilder a(StringBuilder paramStringBuilder)
  {
    CellArea localCellArea = (CellArea)this.a.a.b.get(0);
    if (paramStringBuilder == null) {
      paramStringBuilder = new StringBuilder();
    }
    paramStringBuilder.append("FormatCondition at [").append(this.a.a.a.a.getName()).append("!");
    CellsHelper.a(paramStringBuilder, localCellArea.StartRow, localCellArea.StartColumn, localCellArea.EndRow, localCellArea.EndColumn);
    paramStringBuilder.append("]:");
    return paramStringBuilder;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zfb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */