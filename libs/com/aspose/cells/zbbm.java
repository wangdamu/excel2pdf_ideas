package com.aspose.cells;

class zbbm
  implements zaix
{
  public int a(char[] paramArrayOfChar, int paramInt1, int paramInt2, StringBuilder paramStringBuilder, zzv paramzzv)
  {
    switch (paramArrayOfChar[paramInt1])
    {
    case 'T': 
    case 't': 
      paramStringBuilder.append('d');
      paramzzv.a = 19;
      return paramInt1 + 1;
    case 'J': 
    case 'j': 
      paramStringBuilder.append('y');
      paramzzv.a = 17;
      return paramInt1 + 1;
    case 'D': 
    case 'Y': 
    case 'd': 
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
    case 'Y': 
    case 'y': 
      paramStringBuilder.append('J');
      paramzzv.a = 17;
      return paramInt1 + 1;
    case 'D': 
    case 'd': 
      paramStringBuilder.append('T');
      paramzzv.a = 19;
      return paramInt1 + 1;
    case 'J': 
    case 'T': 
    case 'j': 
    case 't': 
      paramStringBuilder.append('\\');
      paramStringBuilder.append(paramArrayOfChar[paramInt1]);
      paramzzv.a = 48;
      return paramInt1 + 1;
    }
    return zl.c(paramArrayOfChar, paramInt1, paramInt2, paramStringBuilder);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbbm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */