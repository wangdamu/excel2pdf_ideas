package com.aspose.cells;

class zbbl
  implements zaix
{
  public int a(char[] paramArrayOfChar, int paramInt1, int paramInt2, StringBuilder paramStringBuilder, zzv paramzzv)
  {
    switch (paramArrayOfChar[paramInt1])
    {
    case 'å': 
      paramStringBuilder.append('y');
      paramzzv.a = 17;
      return paramInt1 + 1;
    case 't': 
      paramStringBuilder.append('h');
      paramzzv.a = 25;
      return paramInt1 + 1;
    case 'H': 
    case 'Y': 
    case 'h': 
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
    case 't': 
    case 'å': 
      paramStringBuilder.append('\\');
      paramStringBuilder.append(paramArrayOfChar[paramInt1]);
      paramzzv.a = 48;
      return paramInt1 + 1;
    case 'Y': 
    case 'y': 
      paramStringBuilder.append('å');
      paramzzv.a = 17;
      return paramInt1 + 1;
    case 'H': 
    case 'h': 
      paramStringBuilder.append('t');
      paramzzv.a = 25;
      return paramInt1 + 1;
    }
    return zl.c(paramArrayOfChar, paramInt1, paramInt2, paramStringBuilder);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbbl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */