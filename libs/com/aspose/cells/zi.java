package com.aspose.cells;

abstract class zi
  implements zahc
{
  public abstract int a();
  
  public abstract int a(int paramInt);
  
  public abstract int b(int paramInt);
  
  public abstract int a(int paramInt1, int paramInt2);
  
  public abstract int a(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract int b(int paramInt1, int paramInt2);
  
  public abstract int c(int paramInt);
  
  public abstract int d(int paramInt);
  
  public abstract int a(int paramInt, boolean paramBoolean);
  
  public abstract zaiv b();
  
  public abstract zaiv a(int paramInt1, int paramInt2, boolean paramBoolean);
  
  public abstract void c(int paramInt1, int paramInt2);
  
  public abstract int d(int paramInt1, int paramInt2);
  
  public abstract int e(int paramInt1, int paramInt2);
  
  public abstract void f(int paramInt1, int paramInt2);
  
  public abstract void e(int paramInt);
  
  public abstract boolean g(int paramInt1, int paramInt2);
  
  public zajl c()
  {
    return null;
  }
  
  public void a(zajl paramzajl) {}
  
  public boolean a(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    int i;
    if (paramInt1 < 0)
    {
      i = a(-1, false);
      if (i < 0) {
        return false;
      }
    }
    else
    {
      if ((paramInt1 > paramInt2) && (paramInt2 > -1)) {
        return false;
      }
      if (paramArrayOfInt[0] > -1) {
        i = a(paramInt1, paramArrayOfInt[0]);
      } else {
        i = b(paramInt1);
      }
    }
    int j;
    if (paramInt2 < 0)
    {
      j = a(-1, true);
      if (j < 0) {
        return false;
      }
      if (i < 0) {
        i = -i - 1;
      }
      if (j < i) {
        return false;
      }
    }
    else if (paramInt1 == paramInt2)
    {
      if (i < 0) {
        return false;
      }
      j = i;
    }
    else if (i < 0)
    {
      i = -i - 1;
      if (paramArrayOfInt[1] > i) {
        j = a(paramInt2, paramArrayOfInt[1]);
      } else {
        j = a(paramInt2, i, -1);
      }
      if (j < 0)
      {
        j = a(-j - 1, true);
        if (j < i) {
          return false;
        }
      }
    }
    else if (paramInt1 < 0)
    {
      if (paramArrayOfInt[1] > i) {
        j = a(paramInt2, paramArrayOfInt[1]);
      } else {
        j = b(paramInt2);
      }
      if (j < 0)
      {
        j = a(-j - 1, true);
        if (j < i) {
          return false;
        }
      }
    }
    else if (paramArrayOfInt[1] > i)
    {
      j = a(paramInt2, paramArrayOfInt[1]);
      if (j < 0) {
        j = a(-j - 1, true);
      }
    }
    else
    {
      j = a(i, false);
      if (j < 0)
      {
        j = i;
      }
      else
      {
        j = a(paramInt2, j, -1);
        if (j < 0) {
          j = a(-j - 1, true);
        }
      }
    }
    paramArrayOfInt[0] = i;
    paramArrayOfInt[1] = j;
    return true;
  }
  
  public zaiv b(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i;
    if (paramInt1 < 0)
    {
      if (paramInt2 < 0) {
        return a(-1, -1, paramBoolean);
      }
      i = a(-1, false);
      if (i < 0) {
        return null;
      }
    }
    else
    {
      if ((paramInt1 > paramInt2) && (paramInt2 > -1)) {
        return null;
      }
      i = b(paramInt1);
    }
    int j;
    if (paramInt2 < 0)
    {
      j = a(-1, true);
      if (i < 0)
      {
        if (j < 0) {
          return null;
        }
        i = -i - 1;
      }
      if (j < i) {
        return null;
      }
    }
    else if (paramInt1 == paramInt2)
    {
      if (i < 0) {
        return null;
      }
      j = i;
    }
    else if (i < 0)
    {
      i = -i - 1;
      j = a(paramInt2, i, -1);
      if (j < 0)
      {
        j = a(-j - 1, true);
        if (j < i) {
          return null;
        }
      }
    }
    else if (paramInt1 < 0)
    {
      j = b(paramInt2);
      if (j < 0)
      {
        j = a(-j - 1, true);
        if (j < i) {
          return null;
        }
      }
    }
    else
    {
      j = a(i, false);
      if (j < 0)
      {
        j = i;
      }
      else
      {
        j = a(paramInt2, j, -1);
        if (j < 0) {
          j = a(-j - 1, true);
        }
      }
    }
    return a(paramInt1, i, paramInt2, j, paramBoolean);
  }
  
  public zaiv a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    return a(paramInt2, paramInt4, paramBoolean);
  }
  
  public int h(int paramInt1, int paramInt2)
  {
    int j;
    int i;
    if (paramInt1 < 0)
    {
      if (paramInt2 < 0)
      {
        j = a();
        e(-1);
        return j;
      }
      i = a(-1, false);
      if (i < 0) {
        return 0;
      }
    }
    else
    {
      i = b(paramInt1);
    }
    if (paramInt2 < 0)
    {
      j = a(-1, true);
      if (i < 0)
      {
        if (j < 0) {
          return 0;
        }
        i = -i - 1;
      }
      if (j < i) {
        return 0;
      }
    }
    else if (paramInt1 == paramInt2)
    {
      if (i < 0) {
        return 0;
      }
      j = i;
    }
    else if (i < 0)
    {
      i = -i - 1;
      j = a(paramInt2, i, -1);
      if (j < 0)
      {
        j = a(-j - 1, true);
        if (j < i) {
          return 0;
        }
      }
    }
    else if (paramInt1 < 0)
    {
      j = b(paramInt2);
      if (j < 0)
      {
        j = a(-j - 1, true);
        if (j < i) {
          return 0;
        }
      }
    }
    else
    {
      j = a(i, false);
      if (j < 0)
      {
        j = i;
      }
      else
      {
        j = a(paramInt2, j, -1);
        if (j < 0) {
          j = a(-j - 1, true);
        }
      }
    }
    return d(i, j);
  }
  
  public void i(int paramInt1, int paramInt2)
  {
    int i = b(paramInt1);
    if (i < 0) {
      i = -i - 1;
    }
    f(i, paramInt2);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */