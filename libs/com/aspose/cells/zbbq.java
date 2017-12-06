package com.aspose.cells;

import com.aspose.cells.b.a.zw;

class zbbq
  implements zaix
{
  private boolean a = false;
  private boolean b = false;
  
  public int a(char[] paramArrayOfChar, int paramInt1, int paramInt2, StringBuilder paramStringBuilder, zzv paramzzv)
  {
    switch (paramArrayOfChar[paramInt1])
    {
    case 'Г': 
      paramStringBuilder.append('y');
      paramzzv.a = 17;
      return paramInt1 + 1;
    case 'М': 
      paramStringBuilder.append('m');
      paramzzv.a = 18;
      return paramInt1 + 1;
    case 'Д': 
      paramStringBuilder.append('d');
      paramzzv.a = 19;
      return paramInt1 + 1;
    case 'ч': 
      paramStringBuilder.append('h');
      paramzzv.a = 25;
      return paramInt1 + 1;
    case 'м': 
      paramStringBuilder.append('M');
      paramzzv.a = 26;
      return paramInt1 + 1;
    case 'C': 
    case 'c': 
      paramStringBuilder.append('s');
      paramzzv.a = 27;
      return paramInt1 + 1;
    case 'D': 
    case 'H': 
    case 'M': 
    case 'S': 
    case 'Y': 
    case 'd': 
    case 'h': 
    case 'm': 
    case 's': 
    case 'y': 
      paramStringBuilder.append('\\');
      paramStringBuilder.append(paramArrayOfChar[paramInt1]);
      paramzzv.a = 48;
      return paramInt1 + 1;
    }
    return zl.c(paramArrayOfChar, paramInt1, paramInt2, paramStringBuilder);
  }
  
  public int b(char[] paramArrayOfChar, int paramInt1, int paramInt2, StringBuilder paramStringBuilder, zzv paramzzv)
  {
    switch (paramArrayOfChar[paramInt1])
    {
    case '[': 
      paramStringBuilder.append('[');
      paramInt1++;
      while (paramInt1 < paramInt2) {
        switch (paramArrayOfChar[paramInt1])
        {
        case 'M': 
        case 'm': 
          paramStringBuilder.append('м');
          paramInt1++;
          paramzzv.a = 26;
          break;
        case ']': 
          paramStringBuilder.append(']');
          return paramInt1 + 1;
        default: 
          paramStringBuilder.append(paramArrayOfChar[paramInt1]);
          paramInt1++;
        }
      }
      return paramInt1;
    case 'Y': 
    case 'y': 
      paramStringBuilder.append('Г');
      paramzzv.a = 17;
      return paramInt1 + 1;
    case 'M': 
    case 'm': 
      int i = paramInt1;
      paramInt1++;
      while ((paramInt1 < paramInt2) && ((paramArrayOfChar[paramInt1] | 0x20) == 'm')) {
        paramInt1++;
      }
      i = paramInt1 - i;
      if (i > 2)
      {
        paramStringBuilder.append(zw.a('М', i));
        paramzzv.a = 18;
        return paramInt1;
      }
      char c = 'М';
      paramzzv.a = 18;
      if (this.a)
      {
        if (!this.b)
        {
          c = 'м';
          paramzzv.a = 26;
        }
      }
      else {
        for (int j = paramInt1; j < paramInt2; j++) {
          switch (paramArrayOfChar[j])
          {
          case 'D': 
          case 'H': 
          case 'Y': 
          case 'd': 
          case 'h': 
          case 'y': 
            break;
          case 'S': 
          case 's': 
            c = 'м';
            paramzzv.a = 26;
            break;
          }
        }
      }
      paramStringBuilder.append(c);
      if (i > 1) {
        paramStringBuilder.append(c);
      }
      return paramInt1;
    case 'D': 
    case 'd': 
      paramStringBuilder.append('Д');
      paramzzv.a = 19;
      return paramInt1 + 1;
    case 'H': 
    case 'h': 
      this.a = true;
      paramStringBuilder.append('ч');
      paramzzv.a = 25;
      return paramInt1 + 1;
    case 'S': 
    case 's': 
      this.a = true;
      paramStringBuilder.append('c');
      paramzzv.a = 27;
      return paramInt1 + 1;
    case 'C': 
    case 'c': 
    case 'Г': 
    case 'Д': 
    case 'М': 
    case 'м': 
    case 'ч': 
      paramStringBuilder.append('\\');
      paramStringBuilder.append(paramArrayOfChar[paramInt1]);
      paramzzv.a = 48;
      return paramInt1 + 1;
    }
    return zl.c(paramArrayOfChar, paramInt1, paramInt2, paramStringBuilder);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbbq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */