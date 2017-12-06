package com.aspose.cells.b.c.a;

public final class za
{
  private final String[] b;
  private final za[] c;
  private final int d;
  
  public za(String... paramVarArgs)
  {
    this.b = paramVarArgs;
    int i = b(this.b.length);
    this.c = new za[i];
    this.d = (i - 1);
    for (int j = 0; j < this.b.length; j++)
    {
      String str = this.b[j];
      if ((!a) && (str == null)) {
        throw new AssertionError("The map doesn't accept null keys.");
      }
      int k = str.hashCode();
      for (int m = a(k);; m++)
      {
        int n = m & this.d;
        za localza = this.c[n];
        if (localza == null)
        {
          this.c[n] = new za(str, j);
          break;
        }
        if (localza.a.equals(str)) {
          throw new IllegalArgumentException("duplicate key: " + str);
        }
      }
    }
  }
  
  public int a(String paramString)
  {
    if (paramString == null) {
      return -1;
    }
    for (int i = a(paramString.hashCode());; i++)
    {
      int j = i & this.d;
      za localza = this.c[j];
      if (localza == null) {
        return -1;
      }
      if (localza.a.equals(paramString)) {
        return localza.b;
      }
    }
  }
  
  private static int a(int paramInt)
  {
    paramInt ^= paramInt >>> 20 ^ paramInt >>> 12;
    return paramInt ^ paramInt >>> 7 ^ paramInt >>> 4;
  }
  
  private static int b(int paramInt)
  {
    if (paramInt < 536870912) {
      return Integer.highestOneBit(paramInt) << 2;
    }
    if ((!a) && (paramInt >= 1073741824)) {
      throw new AssertionError("collection too large");
    }
    return 1073741824;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(this.b.length * 16).append('{');
    for (String str : this.b) {
      localStringBuilder.append(str).append(" : ").append(a(str)).append("\r\n");
    }
    return '}';
  }
  
  static class za
  {
    final String a;
    final int b;
    
    za(String paramString, int paramInt)
    {
      if ((!c) && (paramString == null)) {
        throw new AssertionError();
      }
      this.a = paramString;
      this.b = paramInt;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/c/a/za.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */