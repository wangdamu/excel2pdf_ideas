package com.aspose.cells.a.d;

public class zgl
{
  public int[] a = new int[16];
  public Object[] b = new Object[16];
  private int c;
  
  public void a(int paramInt, Object paramObject)
  {
    int i = zw.a(this.a, 0, this.c, paramInt);
    if (i >= 0) {
      throw new IllegalArgumentException("duplicate");
    }
    a(i ^ 0xFFFFFFFF, paramInt, paramObject);
  }
  
  public void a(int paramInt)
  {
    if (paramInt != this.a.length)
    {
      if (paramInt < this.c) {
        throw new IllegalArgumentException("Parameter name: value");
      }
      if (paramInt > 0)
      {
        int[] arrayOfInt = new int[paramInt];
        Object[] arrayOfObject = new Object[paramInt];
        if (this.c > 0)
        {
          System.arraycopy(this.a, 0, arrayOfInt, 0, this.c);
          System.arraycopy(this.b, 0, arrayOfObject, 0, this.c);
        }
        this.a = arrayOfInt;
        this.b = arrayOfObject;
      }
      else
      {
        this.a = new int[16];
        this.b = new Object[16];
      }
    }
  }
  
  public int a()
  {
    return this.c;
  }
  
  public boolean b(int paramInt)
  {
    return f(paramInt) >= 0;
  }
  
  private void g(int paramInt)
  {
    int i = this.a.length == 0 ? 16 : this.a.length * 2;
    if (i < paramInt) {
      i = paramInt;
    }
    a(i);
  }
  
  public Object c(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.c)) {
      throw new IllegalArgumentException("Parameter name: index");
    }
    return this.b[paramInt];
  }
  
  public int d(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.c)) {
      throw new IllegalArgumentException("Parameter name: index");
    }
    return this.a[paramInt];
  }
  
  public Object e(int paramInt)
  {
    int i = f(paramInt);
    if (i >= 0) {
      return this.b[i];
    }
    return null;
  }
  
  public void b(int paramInt, Object paramObject)
  {
    int i = zw.a(this.a, 0, this.c, paramInt);
    if (i >= 0)
    {
      this.b[i] = paramObject;
      return;
    }
    a(i ^ 0xFFFFFFFF, paramInt, paramObject);
  }
  
  public int f(int paramInt)
  {
    int i = zw.a(this.a, 0, this.c, paramInt);
    return i >= 0 ? i : -1;
  }
  
  private void a(int paramInt1, int paramInt2, Object paramObject)
  {
    if (this.c == this.a.length) {
      g(this.c + 1);
    }
    if (paramInt1 < this.c)
    {
      System.arraycopy(this.a, paramInt1, this.a, paramInt1 + 1, this.c - paramInt1);
      System.arraycopy(this.b, paramInt1, this.b, paramInt1 + 1, this.c - paramInt1);
    }
    this.a[paramInt1] = paramInt2;
    this.b[paramInt1] = paramObject;
    this.c += 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zgl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */