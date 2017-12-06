package com.aspose.cells;

class zbbn
  implements zaix
{
  public int a(char[] paramArrayOfChar, int paramInt1, int paramInt2, StringBuilder paramStringBuilder, zzv paramzzv)
  {
    switch (paramArrayOfChar[paramInt1])
    {
    case 'R': 
    case 'r': 
      paramStringBuilder.append("yyyy");
      paramInt1++;
      while ((paramInt1 < paramInt2) && ((paramArrayOfChar[paramInt1] == 'r') || (paramArrayOfChar[paramInt1] == 'R'))) {
        paramInt1++;
      }
      paramzzv.a = 17;
      return paramInt1;
    }
    return zl.c(paramArrayOfChar, paramInt1, paramInt2, paramStringBuilder);
  }
  
  public int b(char[] paramArrayOfChar, int paramInt1, int paramInt2, StringBuilder paramStringBuilder, zzv paramzzv)
  {
    return zl.c(paramArrayOfChar, paramInt1, paramInt2, paramStringBuilder);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbbn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */