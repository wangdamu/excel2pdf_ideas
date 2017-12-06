package com.aspose.cells;

class zbbk
{
  public static long a(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean) {
      return 0x10800000000000 | paramInt;
    }
    return 0x10000000000000 | paramInt;
  }
  
  public static long b(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean) {
      return 0x20400000000000 | paramInt << 32;
    }
    return 0x10000000000000 | paramInt << 32;
  }
  
  public static long a(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    long l = paramInt1 | paramInt2 << 32;
    if (paramBoolean1) {
      l |= 0x800000000000;
    }
    if (paramBoolean2) {
      l |= 0x400000000000;
    }
    return l;
  }
  
  public static long a(char[] paramArrayOfChar, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    long l1;
    if (paramArrayOfChar[paramInt1] == '$')
    {
      l1 = 0;
      paramInt1++;
      if (paramInt1 >= paramInt2) {
        return 13510798882111488L;
      }
    }
    else
    {
      l1 = 1;
    }
    int i = 0;
    int j = (char)(paramArrayOfChar[paramInt1] | 0x20);
    long l2;
    while ((j >= 97) && (j <= 122))
    {
      i = i * 26 + j - 97 + 1;
      if (i > paramInt4) {
        return 13510798882111488L;
      }
      paramInt1++;
      if (paramInt1 < paramInt2)
      {
        j = (char)(paramArrayOfChar[paramInt1] | 0x20);
      }
      else
      {
        l2 = i - 1;
        l2 <<= 32;
        l2 |= 0x20000000000000;
        if (l1 != 0) {
          l2 |= 0x400000000000;
        }
        return l2;
      }
    }
    i--;
    int k;
    if (i < 0)
    {
      l2 = l1;
      l1 = 0;
    }
    else if (paramArrayOfChar[paramInt1] == '$')
    {
      k = 0;
      paramInt1++;
      if (paramInt1 >= paramInt2) {
        return 13510798882111488L;
      }
    }
    else
    {
      k = 1;
    }
    int m = 0;
    j = paramArrayOfChar[paramInt1];
    while ((j >= 48) && (j <= 57))
    {
      m = m * 10 + j - 48;
      if (m > paramInt3) {
        return 13510798882111488L;
      }
      paramInt1++;
      if (paramInt1 < paramInt2)
      {
        j = paramArrayOfChar[paramInt1];
      }
      else
      {
        if (m < 1) {
          return 13510798882111488L;
        }
        long l3 = m - 1;
        if (i < 0)
        {
          l3 |= 0x10000000000000;
        }
        else
        {
          l3 |= i << 32;
          if (l1 != 0) {
            l3 |= 0x400000000000;
          }
        }
        if (k != 0) {
          l3 |= 0x800000000000;
        }
        return l3;
      }
    }
    return 13510798882111488L;
  }
  
  public static long a(zaao paramzaao, char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = (char)(paramArrayOfChar[paramInt1] | 0x20);
    if (paramzaao.s)
    {
      if (m == 115) {
        i = 1;
      } else if (m != 122) {
        return 13510798882111488L;
      }
    }
    else if (m == 99) {
      i = 1;
    } else if (m != 114) {
      return 13510798882111488L;
    }
    paramInt1++;
    if (paramInt1 == paramInt2) {
      return i != 0 ? b(paramzaao.e, false) : a(paramzaao.d, false);
    }
    m = paramArrayOfChar[paramInt1];
    if (m == 91)
    {
      j = 1;
      paramInt1++;
      if (paramInt1 == paramInt2) {
        return 13510798882111488L;
      }
      m = paramArrayOfChar[paramInt1];
      if (m == 45)
      {
        paramInt1++;
        if (paramInt1 == paramInt2) {
          return 13510798882111488L;
        }
        m = paramArrayOfChar[paramInt1];
        k = 1;
      }
      else if (m == 43)
      {
        paramInt1++;
        if (paramInt1 == paramInt2) {
          return 13510798882111488L;
        }
        m = paramArrayOfChar[paramInt1];
      }
    }
    int n = -1;
    if ((m >= 48) && (m <= 57))
    {
      n = m - 48;
      i1 = i != 0 ? paramzaao.x : paramzaao.w;
      if (j == 0) {
        i1++;
      }
      do
      {
        paramInt1++;
        if (paramInt1 == paramInt2)
        {
          if (j != 0) {
            return 13510798882111488L;
          }
          n--;
          if (n < 0) {
            return 13510798882111488L;
          }
          return i != 0 ? b(n, false) : a(n, false);
        }
        m = paramArrayOfChar[paramInt1];
        if ((m < 48) || (m > 57))
        {
          if (j != 0)
          {
            if (m != 93) {
              return 13510798882111488L;
            }
            paramInt1++;
          }
          if (i == 0) {
            break;
          }
          if (paramInt1 != paramInt2) {
            return 13510798882111488L;
          }
          if (j != 0)
          {
            if (k != 0) {
              n = paramzaao.e - n;
            } else {
              n = paramzaao.e + n;
            }
            if (n < 0)
            {
              n++;
              n += paramzaao.x;
            }
            else if (n > paramzaao.x)
            {
              n--;
              n -= paramzaao.x;
            }
          }
          else
          {
            if (n == 0) {
              return 13510798882111488L;
            }
            n--;
          }
          return b(n, j);
        }
        n *= 10;
        n += m - 48;
      } while (n <= i1);
      return 13510798882111488L;
    }
    else if (i != 0)
    {
      return 13510798882111488L;
    }
    if (j != 0)
    {
      if (k != 0) {
        n = paramzaao.d - n;
      } else {
        n = paramzaao.d + n;
      }
      if (n < 0)
      {
        n++;
        n += paramzaao.w;
      }
      else if (n > paramzaao.w)
      {
        n--;
        n -= paramzaao.w;
      }
    }
    else if (n < 0)
    {
      n = paramzaao.d;
    }
    else
    {
      n--;
      if (n < 0) {
        return 13510798882111488L;
      }
    }
    if (paramInt1 == paramInt2) {
      return a(n, j);
    }
    m = (char)(paramArrayOfChar[paramInt1] | 0x20);
    if (paramzaao.s)
    {
      if (m != 115) {
        return 13510798882111488L;
      }
    }
    else if (m == 99) {
      return 13510798882111488L;
    }
    paramInt1++;
    if (paramInt1 == paramInt2) {
      return a(n, j, paramzaao.e, false);
    }
    int i1 = j;
    j = 0;
    k = 0;
    m = paramArrayOfChar[paramInt1];
    if (m == 91)
    {
      j = 1;
      paramInt1++;
      if (paramInt1 == paramInt2) {
        return 13510798882111488L;
      }
      m = paramArrayOfChar[paramInt1];
      if (m == 45)
      {
        paramInt1++;
        if (paramInt1 == paramInt2) {
          return 13510798882111488L;
        }
        m = paramArrayOfChar[paramInt1];
        k = 1;
      }
      else if (m == 43)
      {
        paramInt1++;
        if (paramInt1 == paramInt2) {
          return 13510798882111488L;
        }
        m = paramArrayOfChar[paramInt1];
      }
      if (m == 93)
      {
        if (paramInt1 + 1 != paramInt2) {
          return 13510798882111488L;
        }
        return a(n, i1, paramzaao.e, false);
      }
    }
    if ((m >= 48) && (m <= 57))
    {
      int i2 = n;
      n = m - 48;
      int i3 = paramzaao.x;
      if (j == 0) {
        i3++;
      }
      do
      {
        paramInt1++;
        if (paramInt1 == paramInt2)
        {
          if (j != 0) {
            return 13510798882111488L;
          }
          n--;
          if (n < 0) {
            return 13510798882111488L;
          }
          return a(i2, i1, n, false);
        }
        m = paramArrayOfChar[paramInt1];
        if ((m < 48) || (m > 57))
        {
          if ((j == 0) || (m != 93) || (paramInt1 + 1 != paramInt2)) {
            return 13510798882111488L;
          }
          if (k != 0) {
            n = paramzaao.e - n;
          } else {
            n = paramzaao.e + n;
          }
          if (n < 0)
          {
            n++;
            n += paramzaao.x;
          }
          else if (n > paramzaao.x)
          {
            n--;
            n -= paramzaao.x;
          }
          return a(i2, i1, n, true);
        }
        n *= 10;
        n += m - 48;
      } while (n <= i3);
      return 13510798882111488L;
    }
    return 13510798882111488L;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbbk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */