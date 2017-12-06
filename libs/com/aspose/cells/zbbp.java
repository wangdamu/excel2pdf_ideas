package com.aspose.cells;

class zbbp
  implements zaix
{
  public int a(char[] paramArrayOfChar, int paramInt1, int paramInt2, StringBuilder paramStringBuilder, zzv paramzzv)
  {
    switch (paramArrayOfChar[paramInt1])
    {
    case 'G': 
    case 'g': 
      paramStringBuilder.append('d');
      paramzzv.a = 19;
      return paramInt1 + 1;
    case 'A': 
    case 'a': 
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
      paramStringBuilder.append('a');
      paramzzv.a = 17;
      return paramInt1 + 1;
    case 'D': 
    case 'd': 
      paramStringBuilder.append('g');
      paramzzv.a = 19;
      return paramInt1 + 1;
    case 'A': 
    case 'a': 
      paramStringBuilder.append('\\');
      paramStringBuilder.append(paramArrayOfChar[paramInt1]);
      paramzzv.a = 48;
      return paramInt1 + 1;
    case 'G': 
    case 'g': 
      paramStringBuilder.append('x');
      paramzzv.a = 20;
      return paramInt1 + 1;
    }
    return zl.c(paramArrayOfChar, paramInt1, paramInt2, paramStringBuilder);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbbp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */