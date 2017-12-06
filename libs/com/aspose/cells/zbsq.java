package com.aspose.cells;

class zbsq
  implements zajk
{
  private char[] a;
  
  zbsq(char[] paramArrayOfChar)
  {
    this.a = paramArrayOfChar;
  }
  
  public boolean a(String paramString)
  {
    return a(paramString.toUpperCase().toCharArray(), 0, 0) == 0;
  }
  
  public int b(String paramString)
  {
    return a(paramString.toUpperCase().toCharArray(), 0, 0);
  }
  
  private int a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    while (paramInt1 < this.a.length)
    {
      if (paramInt2 >= paramArrayOfChar.length)
      {
        if ((this.a[paramInt1] == '*') && (paramInt1 + 1 == this.a.length)) {
          return 0;
        }
        return 1;
      }
      int i;
      switch (this.a[paramInt1])
      {
      case '~': 
        if (paramInt1 + 1 < this.a.length)
        {
          i = this.a[(paramInt1 + 1)];
          if ((i == 42) || (i == 63) || (i == 126)) {
            paramInt1++;
          }
        }
        if (this.a[paramInt1] > paramArrayOfChar[paramInt2]) {
          return 1;
        }
        if (this.a[paramInt1] < paramArrayOfChar[paramInt2]) {
          return -1;
        }
        break;
      case '?': 
        break;
      case '*': 
        paramInt1++;
        if (paramInt1 == this.a.length) {
          return 0;
        }
        i = a(paramArrayOfChar, paramInt1, paramInt2);
        if (i == 0) {
          return 0;
        }
        paramInt2++;
        if (paramInt2 == paramArrayOfChar.length) {
          return i;
        }
        for (;;)
        {
          if (a(paramArrayOfChar, paramInt1, paramInt2) == 0) {
            return 0;
          }
          paramInt2++;
          if (paramInt2 == paramArrayOfChar.length) {
            break;
          }
        }
        return i;
      default: 
        if (this.a[paramInt1] > paramArrayOfChar[paramInt2]) {
          return 1;
        }
        if (this.a[paramInt1] < paramArrayOfChar[paramInt2]) {
          return -1;
        }
        break;
      }
      paramInt1++;
      paramInt2++;
    }
    if (paramInt2 < paramArrayOfChar.length) {
      return -1;
    }
    return 0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbsq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */