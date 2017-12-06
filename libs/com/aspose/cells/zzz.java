package com.aspose.cells;

public class zzz
{
  static char[] a = new char[0];
  private static int[] b = { a(true, 0, '#') };
  private int c = 7;
  private char[] d = a;
  private Color e = Color.getEmpty();
  private boolean f = false;
  private int[] g;
  
  void a()
  {
    this.c = 7;
    this.d = a;
    this.e = Color.getEmpty();
    this.f = false;
    this.g = null;
  }
  
  public boolean b()
  {
    return (this.d.length < 1) && (this.g == null);
  }
  
  public boolean c()
  {
    return this.d.length < 1;
  }
  
  void d()
  {
    this.c = 1;
    this.d = a;
  }
  
  public boolean e()
  {
    return this.f;
  }
  
  void a(char paramChar)
  {
    this.f = true;
    d();
    if (paramChar == '#') {
      this.g = b;
    } else {
      this.g = new int[] { a(true, 0, paramChar) };
    }
  }
  
  public int f()
  {
    return this.c;
  }
  
  public char[] g()
  {
    return this.d;
  }
  
  public String h()
  {
    if (this.d.length < 1) {
      return "";
    }
    return new String(this.d);
  }
  
  void a(int paramInt, String paramString)
  {
    this.c = paramInt;
    this.d = paramString.toCharArray();
  }
  
  void a(int paramInt, char[] paramArrayOfChar)
  {
    this.c = paramInt;
    this.d = paramArrayOfChar;
  }
  
  public String a(int paramInt, boolean paramBoolean)
  {
    if (this.g == null) {
      return h();
    }
    return new String(b(paramInt, paramBoolean));
  }
  
  public char[] b(int paramInt, boolean paramBoolean)
  {
    if (this.g == null) {
      return this.d;
    }
    if (paramInt < 0) {
      paramInt = 0;
    }
    int i = 0;
    for (int j = 0; j < this.g.length; j++) {
      if (a(j)) {
        i++;
      }
    }
    char[] arrayOfChar = new char[this.d.length + (i > 0 ? this.g.length - i + paramInt : this.g.length)];
    int k = arrayOfChar.length;
    int m = this.d.length;
    int n = 0;
    if (paramInt < 1) {
      i = 0;
    }
    for (int i1 = this.g.length - 1; i1 > -1; i1--)
    {
      n = 0;
      if (a(i1))
      {
        if (i >= 1)
        {
          i = 0;
          n = 1;
        }
      }
      else
      {
        int i2 = b(i1);
        int i3 = m - i2;
        if (i3 > 0) {
          System.arraycopy(this.d, i2, arrayOfChar, k - i3, i3);
        }
        m = i2;
        k -= i3;
        if (n != 0)
        {
          int i4 = c(i1);
          for (int i5 = 0; i5 < paramInt; i5++) {
            arrayOfChar[(--k)] = i4;
          }
        }
        else
        {
          arrayOfChar[(--k)] = (paramBoolean ? 32 : c(i1));
        }
      }
    }
    if (m > 0) {
      System.arraycopy(this.d, 0, arrayOfChar, 0, m);
    }
    return arrayOfChar;
  }
  
  void a(Color paramColor)
  {
    this.e = paramColor;
  }
  
  void a(int[] paramArrayOfInt)
  {
    this.g = paramArrayOfInt;
  }
  
  int[] i()
  {
    return this.g;
  }
  
  public int j()
  {
    return this.g == null ? 0 : this.g.length;
  }
  
  public boolean a(int paramInt)
  {
    return (this.g[paramInt] & 0x80000000) != 0L;
  }
  
  public int b(int paramInt)
  {
    return (this.g[paramInt] & 0x7FFF0000) >> 16;
  }
  
  void a(int paramInt1, int paramInt2)
  {
    this.g[paramInt1] &= 0x8000FFFF;
    this.g[paramInt1] |= paramInt2 << 16;
  }
  
  public char c(int paramInt)
  {
    return (char)(this.g[paramInt] & 0xFFFF);
  }
  
  static int a(boolean paramBoolean, int paramInt, char paramChar)
  {
    char c1 = paramBoolean ? Integer.MIN_VALUE : '\000';
    c1 |= paramInt << 16;
    c1 |= paramChar;
    return c1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zzz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */