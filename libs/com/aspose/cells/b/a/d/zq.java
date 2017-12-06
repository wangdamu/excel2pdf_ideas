package com.aspose.cells.b.a.d;

public abstract class zq
{
  public void a()
    throws Exception
  {
    a(true);
  }
  
  protected abstract void a(boolean paramBoolean)
    throws Exception;
  
  public abstract int c()
    throws Exception;
  
  public abstract int d()
    throws Exception;
  
  public int a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
    throws Exception
  {
    if (paramArrayOfChar == null) {
      throw new NullPointerException("buffer");
    }
    if (paramInt1 < 0) {
      throw new IndexOutOfBoundsException("index");
    }
    if (paramInt2 < 0) {
      throw new IndexOutOfBoundsException("count");
    }
    if (paramArrayOfChar.length - paramInt1 < paramInt2) {
      throw new IllegalArgumentException("index and count don't match buffer length");
    }
    int i = 0;
    do
    {
      int j = d();
      if (j == -1) {
        break;
      }
      paramArrayOfChar[(paramInt1 + i++)] = ((char)j);
    } while (i < paramInt2);
    return i;
  }
  
  public String e()
    throws Exception
  {
    char[] arrayOfChar = new char['က'];
    StringBuilder localStringBuilder = new StringBuilder(4096);
    int i;
    while ((i = a(arrayOfChar, 0, arrayOfChar.length)) != 0) {
      localStringBuilder.append(arrayOfChar, 0, i);
    }
    return localStringBuilder.toString();
  }
  
  public String f()
    throws Exception
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (;;)
    {
      int i = d();
      if (i == -1) {
        break;
      }
      if ((i == 13) || (i == 10))
      {
        if ((i == 13) && (c() == 10)) {
          d();
        }
        return localStringBuilder.toString();
      }
      localStringBuilder.append((char)i);
    }
    if (localStringBuilder.length() > 0) {
      return localStringBuilder.toString();
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/d/zq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */