package com.aspose.cells.b.a.d;

import com.aspose.cells.b.a.zw;

public abstract class zr
{
  public static final zr h = new za();
  private static final String a = System.getProperty("line.separator");
  protected static char[] i = a.toCharArray();
  
  public void b()
    throws Exception
  {
    a(true);
  }
  
  protected void a(boolean paramBoolean)
    throws Exception
  {}
  
  public void c()
    throws Exception
  {}
  
  public void b(String paramString)
  {
    if (paramString == null) {
      paramString = a;
    }
    i = paramString.toCharArray();
  }
  
  public abstract void a(char paramChar)
    throws Exception;
  
  public void a(char[] paramArrayOfChar)
    throws Exception
  {
    if (paramArrayOfChar != null) {
      a(paramArrayOfChar, 0, paramArrayOfChar.length);
    }
  }
  
  public void a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
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
      throw new IllegalArgumentException("(buffer.length - index) should be less than count");
    }
    for (int j = 0; j < paramInt2; j++) {
      a(paramArrayOfChar[(paramInt1 + j)]);
    }
  }
  
  public void a(String paramString)
    throws Exception
  {
    if (paramString != null) {
      a(paramString.toCharArray());
    }
  }
  
  public void f()
    throws Exception
  {
    a(i);
  }
  
  public void c(String paramString)
    throws Exception
  {
    if (paramString == null)
    {
      f();
    }
    else
    {
      int j = paramString.length();
      int k = i.length;
      char[] arrayOfChar = new char[j + k];
      zw.a(paramString, 0, arrayOfChar, 0, j);
      if (k == 2)
      {
        arrayOfChar[j] = i[0];
        arrayOfChar[(j + 1)] = i[1];
      }
      else if (k == 1)
      {
        arrayOfChar[j] = i[0];
      }
      else
      {
        System.arraycopy(i, 0, arrayOfChar, j * 2, k * 2);
      }
      a(arrayOfChar, 0, j + k);
    }
  }
  
  private static final class za
    extends zr
  {
    public void a(char paramChar) {}
    
    public void a(char[] paramArrayOfChar, int paramInt1, int paramInt2) {}
    
    public void a(String paramString) {}
    
    public void f() {}
    
    public void c(String paramString) {}
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/d/zr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */