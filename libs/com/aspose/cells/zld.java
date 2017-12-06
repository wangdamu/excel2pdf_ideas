package com.aspose.cells;

abstract class zld
{
  public static int a(zail paramzail, int paramInt1, int paramInt2)
  {
    int i = paramzail.b() - 1;
    if (i < 0) {
      return -1;
    }
    if (paramInt2 < 0) {
      paramInt2 = 0;
    } else if (paramInt2 > i) {
      paramInt2 = i;
    }
    int j = paramzail.c(paramInt2);
    if (paramInt1 == j) {
      return paramInt2;
    }
    if (paramInt1 < j)
    {
      if (paramInt2 == 0) {
        return -1;
      }
      return a(paramzail, paramInt1, Math.max(0, paramInt2 + paramInt1 - j), paramInt2 - 1);
    }
    if (paramInt2 == i) {
      return -i - 2;
    }
    return a(paramzail, paramInt1, paramInt2 + 1, Math.min(i, paramInt2 + paramInt1 - j));
  }
  
  public static int a(zail paramzail, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramzail.c(paramInt2);
    if (paramInt1 == i) {
      return paramInt2;
    }
    if (paramInt1 < i) {
      return -paramInt2 - 1;
    }
    if (paramInt2 == paramInt3) {
      return -paramInt3 - 2;
    }
    paramInt3 = Math.min(paramInt3, paramInt2 + paramInt1 - i);
    i = paramzail.c(paramInt3);
    if (paramInt1 == i) {
      return paramInt3;
    }
    if (paramInt1 > i) {
      return -paramInt3 - 2;
    }
    paramInt2 = Math.max(paramInt2 + 1, paramInt3 + paramInt1 - i);
    paramInt3--;
    if (paramInt3 < paramInt2) {
      return -paramInt2 - 1;
    }
    if (paramInt3 == paramInt2)
    {
      i = paramzail.c(paramInt3);
      if (paramInt1 < i) {
        return -paramInt3 - 1;
      }
      if (paramInt1 == i) {
        return paramInt3;
      }
      return -paramInt3 - 2;
    }
    int j;
    for (;;)
    {
      j = paramInt2 + paramInt3 >> 1;
      i = paramzail.c(j);
      if (j == paramInt2)
      {
        if (paramInt1 == i) {
          return paramInt2;
        }
        if (paramInt1 < i) {
          return -paramInt2 - 1;
        }
        if (paramInt2 < paramInt3)
        {
          i = paramzail.c(paramInt3);
          if (paramInt1 == i) {
            return paramInt3;
          }
          if (paramInt1 < i) {
            return -paramInt3 - 1;
          }
        }
        return -paramInt3 - 2;
      }
      if (paramInt1 < i)
      {
        paramInt3--;
        if (paramInt3 == paramInt2)
        {
          i = paramzail.c(paramInt2);
          if (paramInt1 == i) {
            return paramInt2;
          }
          if (paramInt1 < i) {
            return -paramInt2 - 1;
          }
          return -j - 1;
        }
        paramInt2 = Math.max(paramInt2, j + paramInt1 - i);
      }
      else
      {
        if (paramInt1 <= i) {
          break;
        }
        paramInt2++;
        if (paramInt3 == paramInt2)
        {
          i = paramzail.c(paramInt2);
          if (paramInt1 == i) {
            return paramInt2;
          }
          if (paramInt1 > i) {
            return -paramInt3 - 2;
          }
          return -paramInt2 - 1;
        }
        paramInt3 = Math.min(paramInt3, j + paramInt1 - i);
      }
    }
    return j;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zld.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */