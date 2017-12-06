package com.aspose.cells;

import com.aspose.cells.b.a.zs;

class zio
  extends zm
{
  private int d;
  private int e;
  private boolean f;
  
  public zio(zig paramzig, String paramString)
  {
    super(paramzig);
    if (paramString == null) {
      paramString = paramzig.b();
    }
    char[] arrayOfChar = paramString.toCharArray();
    b(arrayOfChar, 0, arrayOfChar.length);
  }
  
  protected double c(double paramDouble)
  {
    if (paramDouble == 0.0D) {
      return 0.0D;
    }
    int i = 0;
    if (paramDouble < 0.0D)
    {
      i = 1;
      paramDouble = -paramDouble;
    }
    int j = (int)Math.floor(Math.log10(paramDouble));
    double d1 = Math.pow(10.0D, j);
    paramDouble /= d1;
    paramDouble += 5.0E-15D;
    paramDouble = com.aspose.cells.a.c.zm.b(paramDouble, this.e);
    paramDouble *= d1;
    return i != 0 ? -paramDouble : paramDouble;
  }
  
  protected char[] a(char[] paramArrayOfChar, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    paramArrayOfInt1[1] = -1;
    for (int i = 0; i < paramArrayOfChar.length; i++) {
      if (paramArrayOfChar[i] == c())
      {
        paramArrayOfInt1[1] = i;
        paramArrayOfInt2[1] = 1;
      }
      else if ((paramArrayOfChar[i] == 'e') || (paramArrayOfChar[i] == 'E'))
      {
        if (paramArrayOfInt1[1] < 0)
        {
          paramArrayOfInt1[1] = i;
          paramArrayOfInt2[1] = 0;
        }
        paramArrayOfInt1[2] = i;
        if (i + 1 < paramArrayOfChar.length) {
          if ((paramArrayOfChar[(i + 1)] == '-') || (paramArrayOfChar[(i + 1)] == '+'))
          {
            paramArrayOfInt2[2] = 2;
          }
          else if (this.f)
          {
            char[] arrayOfChar = new char[paramArrayOfChar.length + 1];
            System.arraycopy(paramArrayOfChar, 0, arrayOfChar, 0, i + 1);
            arrayOfChar[(i + 1)] = '+';
            System.arraycopy(paramArrayOfChar, i + 1, arrayOfChar, i + 2, paramArrayOfChar.length - i - 1);
            paramArrayOfChar = arrayOfChar;
            paramArrayOfInt2[2] = 2;
            paramArrayOfInt1[3] = paramArrayOfChar.length;
          }
          else
          {
            paramArrayOfInt2[2] = 1;
          }
        }
        return paramArrayOfChar;
      }
    }
    if (paramArrayOfInt1[1] < 0)
    {
      paramArrayOfInt1[1] = paramArrayOfChar.length;
      paramArrayOfInt2[1] = 0;
    }
    paramArrayOfInt1[2] = paramArrayOfChar.length;
    paramArrayOfInt2[2] = 0;
    return paramArrayOfChar;
  }
  
  private void b(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    a(this.a.c());
    StringBuilder localStringBuilder1 = new StringBuilder(paramInt2 - paramInt1);
    super.d(paramArrayOfChar, paramInt1, paramInt2, localStringBuilder1);
    paramArrayOfChar = zs.a(localStringBuilder1).toCharArray();
    localStringBuilder1.setLength(0);
    paramInt1 = 0;
    paramInt2 = paramArrayOfChar.length;
    StringBuilder localStringBuilder2 = new StringBuilder(paramInt2 - paramInt1);
    zmv localzmv = new zmv(this.a, localStringBuilder1, localStringBuilder2);
    this.f = true;
    this.e = this.c.b();
    this.c.b(-1);
    this.c.c(-1);
    while (paramInt1 < paramInt2)
    {
      switch (paramArrayOfChar[paramInt1])
      {
      case 'E': 
      case 'e': 
        if (this.c.d() < 0)
        {
          if (this.c.c() < 0)
          {
            this.d = localzmv.c().length();
            localzmv.a(true, this.d);
            localzmv.a(true, this.d);
          }
          else
          {
            this.d = this.c.c();
            localzmv.a(false, this.c.c() + 1);
          }
          this.c.c(localzmv.c().length());
          localzmv.c().append('E');
          i = 0;
          int j = 1;
          paramInt1++;
          while (paramInt1 < paramInt2) {
            switch (paramArrayOfChar[paramInt1])
            {
            case '0': 
              localzmv.a();
              i = 1;
              localzmv.c().append('0');
              break;
            case '#': 
              localzmv.a();
              localzmv.c().append(i != 0 ? '0' : '#');
              break;
            case '?': 
              localzmv.a(false);
              localzmv.a();
              localzmv.c().append(i != 0 ? '0' : '#');
              break;
            case '+': 
              if (j != 0) {
                j = 0;
              } else {
                paramInt1 = a(paramArrayOfChar, paramInt1, paramInt2, localzmv);
              }
              break;
            case '-': 
              if (j != 0)
              {
                j = 0;
                this.f = false;
              }
              else
              {
                paramInt1 = a(paramArrayOfChar, paramInt1, paramInt2, localzmv);
              }
              break;
            case '.': 
              localzmv.b().append(c());
              paramInt1++;
              while (paramInt1 < paramInt2) {
                if (paramArrayOfChar[paramInt1] == '#') {
                  paramInt1++;
                } else {
                  paramInt1 = b(paramArrayOfChar, paramInt1, paramInt2, localzmv.b());
                }
              }
            default: 
              paramInt1 = a(paramArrayOfChar, paramInt1, paramInt2, localzmv);
              continue;
              paramInt1++;
            }
          }
        }
        localzmv.b().append(paramArrayOfChar[paramInt1]);
        break;
      default: 
        paramInt1 = a(paramArrayOfChar, paramInt1, paramInt2, localzmv);
        break;
      }
      paramInt1++;
    }
    localzmv.a(true, localzmv.c().length());
    for (int i = localzmv.c().length() - 1; i > this.c.d(); i--) {
      if (localzmv.c().charAt(i) == '#') {
        localzmv.c().delete(i, i + 1);
      }
    }
    if (this.c.d() + 1 == localzmv.c().length()) {
      localzmv.c().append('0');
    }
    a(localzmv, zs.a(localStringBuilder2));
  }
  
  public int a()
  {
    return 5;
  }
  
  public int g()
  {
    return 6;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zio.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */