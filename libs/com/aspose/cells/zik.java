package com.aspose.cells;

import com.aspose.cells.a.a.za;
import com.aspose.cells.b.a.g.ze;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;

class zik
  implements ICustomParser
{
  private StringBuilder a = new StringBuilder(50);
  private StringBuilder b = new StringBuilder(50);
  private zavq c = new zavq();
  private za d;
  private zavl e;
  private zaiu f;
  
  public zik(zavl paramzavl)
  {
    this.d = paramzavl.a().f();
    this.e = paramzavl;
    this.f = paramzavl.b();
    if (this.f == null) {
      this.f = new zil(paramzavl);
    }
  }
  
  public Object parseObject(String value)
  {
    this.a.setLength(0);
    this.b.setLength(0);
    this.c.c();
    if (zw.b(value)) {
      return null;
    }
    char[] arrayOfChar = value.toCharArray();
    int i = 0;
    int j = arrayOfChar.length;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int k;
    while (i < j) {
      switch (arrayOfChar[i])
      {
      case '-': 
        if (i1 != 0) {
          return null;
        }
        m = 1;
        i1 = 1;
        i++;
        break;
      case '+': 
        if (i1 != 0) {
          return null;
        }
        i1 = 1;
        i++;
        break;
      case ' ': 
        this.a.append(' ');
        i++;
        break;
      case '(': 
        if ((i1 != 0) || (!this.e.d())) {
          return null;
        }
        n = 1;
        i1 = 1;
        this.a.append('(');
        i++;
        break;
      default: 
        if (this.c.f() != null) {
          break label272;
        }
        k = this.f.b(arrayOfChar, i, false);
        if (k <= 0) {
          break label272;
        }
        if (i + k >= arrayOfChar.length) {
          return null;
        }
        this.c.b(new String(arrayOfChar, i, k));
        this.a.append(arrayOfChar, i, k);
        i += k;
      }
    }
    label272:
    int i2 = 0;
    int i3 = -1;
    while (j > i) {
      switch (arrayOfChar[(j - 1)])
      {
      case ' ': 
        j--;
        break;
      case ')': 
        if ((n != 0) && (i2 == 0)) {
          j--;
        } else {
          return null;
        }
        break;
      default: 
        if ((i3 > -1) || (this.c.f() != null)) {
          break label481;
        }
        k = this.f.b(arrayOfChar, j - 1, true);
        if (k > 0)
        {
          j -= k;
          if (j <= i) {
            return null;
          }
          this.c.b(new String(arrayOfChar, j, k));
        }
        else
        {
          k = this.f.a(arrayOfChar, j - 1, true);
          if (k <= 0) {
            break label481;
          }
          i3 = j;
          j -= k;
          if (j <= i) {
            return null;
          }
          this.c.c(new String(arrayOfChar, j, k));
        }
        break;
      }
    }
    label481:
    if (i >= j) {
      return null;
    }
    int i4 = this.a.length();
    int i5 = arrayOfChar[i] == '0' ? 1 : 0;
    if (i5 != 0)
    {
      i++;
      if (i < j)
      {
        this.a.append('0');
        while (arrayOfChar[i] == '0')
        {
          this.a.append('0');
          i++;
          if (i == j) {
            break;
          }
        }
      }
    }
    double d1 = 0.0D;
    boolean bool = i3 > -1;
    if (i < j)
    {
      int i6 = -1;
      for (;;)
      {
        if ((arrayOfChar[i] >= '0') && (arrayOfChar[i] <= '9'))
        {
          this.b.append(arrayOfChar[i]);
          d1 = d1 * 10.0D + (arrayOfChar[i] - '0');
          if ((i5 != 0) && (i6 < 0)) {
            this.a.append('0');
          }
        }
        else
        {
          k = this.f.a(arrayOfChar, i);
          if (k > 0)
          {
            if (i6 > -1)
            {
              if (i - i6 != 4) {
                return null;
              }
              i6 = -1;
            }
            i += k;
            if (this.a.length() > i4) {
              this.a.append('.');
            } else if ((i4 > 0) || (j < arrayOfChar.length) || (i == j) || ((i5 == 0) && (d1 < 0.1D))) {
              this.a.append("#.");
            }
            if (bool)
            {
              b();
              d1 /= 100.0D;
              bool = false;
              break;
            }
            if (this.b.length() < 1)
            {
              this.b.append("0.");
              break;
            }
            this.b.append('.');
            break;
          }
          if ((i5 == 0) && (d1 < 0.1D)) {
            return null;
          }
          k = this.f.b(arrayOfChar, i);
          if (k > 0)
          {
            if (i6 < 0)
            {
              if ((i5 == 0) && ((this.a.length() < 1) || (this.a.charAt(this.a.length() - 1) != '#'))) {
                this.a.append('#');
              }
              this.a.append(',');
              if (i5 != 0) {
                this.a.append("000");
              } else {
                this.a.append("###");
              }
            }
            else if (i - i6 == 4)
            {
              if (i5 != 0) {
                this.a.append(",000");
              }
            }
            else
            {
              return null;
            }
            i6 = i;
            i += k;
            if (i < j) {
              continue;
            }
            break;
          }
          if (i6 > -1)
          {
            if (i - i6 != 4) {
              return null;
            }
            i6 = -1;
          }
          if ((arrayOfChar[i] | 0x20) == 'e')
          {
            if (this.a.length() == i4) {
              this.a.append("#");
            }
            d1 = a(arrayOfChar, i, j, d1, bool);
            if (!this.c.h()) {
              return null;
            }
            bool = false;
            i = j;
            break;
          }
          return null;
        }
        i++;
        if (i >= j) {
          break;
        }
      }
      if ((i6 > -1) && (i - i6 != 4)) {
        return null;
      }
      if (i >= j)
      {
        if ((i5 == 0) && (!this.c.h()) && (d1 < 0.1D)) {
          return null;
        }
      }
      else
      {
        int i7 = i;
        double d2 = 0.0D;
        for (;;)
        {
          if ((arrayOfChar[i] >= '0') && (arrayOfChar[i] <= '9'))
          {
            this.b.append(arrayOfChar[i]);
            d2 = d2 * 10.0D + (arrayOfChar[i] - '0');
          }
          else
          {
            if ((i5 == 0) && (d1 < 0.1D) && (i7 == i)) {
              return null;
            }
            if ((arrayOfChar[i] | 0x20) == 'e')
            {
              if (this.a.length() == i4) {
                this.a.append("#.");
              }
              i7 = i - i7;
              d1 += d2 / Math.pow(10.0D, (!bool) && (i3 > -1) ? i7 + 2 : i7);
              ze.a(this.a, arrayOfChar[(i - 1)] == '0' ? '0' : '#', i7);
              d1 = a(arrayOfChar, i, j, d1, bool);
              if (!this.c.h()) {
                return null;
              }
              i = j;
              bool = false;
              break;
            }
            return null;
          }
          i++;
          if (i >= j) {
            break;
          }
        }
        if (!this.c.h())
        {
          i7 = i - i7;
          d1 += d2 / Math.pow(10.0D, (!bool) && (i3 > -1) ? i7 + 2 : i7);
          if (arrayOfChar[(i - 1)] == '0')
          {
            if (this.a.length() == i4) {
              this.a.append("#.");
            }
            ze.a(this.a, '0', i7);
          }
          else if (this.a.length() > 0)
          {
            if (this.a.length() == i4) {
              this.a.append("#.");
            }
            ze.a(this.a, '#', i7);
          }
        }
      }
    }
    if (j < arrayOfChar.length)
    {
      if (this.a.length() == i4) {
        this.a.append('0');
      }
      i = j;
      j = arrayOfChar.length;
      if (i3 > -1) {
        if (this.c.h())
        {
          j = i3 - this.c.g().length();
        }
        else if (bool)
        {
          d1 /= 100.0D;
          b();
          bool = false;
        }
      }
      while (i < j)
      {
        this.a.append(arrayOfChar[i]);
        i++;
      }
      if ((j < arrayOfChar.length) && (i3 < arrayOfChar.length))
      {
        i = i3;
        j = arrayOfChar.length;
        while (i < j)
        {
          this.a.append(arrayOfChar[i]);
          i++;
        }
      }
    }
    if (this.a.length() > 0)
    {
      if (this.a.length() == i4) {
        this.a.append('0');
      }
      this.c.a(zs.a(this.a));
      if (n != 0)
      {
        ze.a(this.a, "(", "");
        ze.a(this.a, ")", "");
        this.a.append(";");
        this.a.append(this.c.e());
        this.c.a(zs.a(this.a));
      }
    }
    if ((i5 != 0) && (this.b.length() < 1))
    {
      this.b.append("0");
    }
    else if ((m != 0) || (n != 0))
    {
      this.b.insert(0, '-');
      d1 = -d1;
    }
    this.c.d(zs.a(this.b));
    this.c.a(Double.valueOf(d1));
    return Double.valueOf(d1);
  }
  
  public zavq a()
  {
    return this.c;
  }
  
  private double a(char[] paramArrayOfChar, int paramInt1, int paramInt2, double paramDouble, boolean paramBoolean)
  {
    
    if (paramInt1 == paramInt2) {
      return paramDouble;
    }
    this.a.append("E+");
    int i = 0;
    int j;
    switch (paramArrayOfChar[paramInt1])
    {
    case '-': 
      paramInt1++;
      if (paramInt1 == paramInt2) {
        return paramDouble;
      }
      i = 1;
      j = paramArrayOfChar[paramInt1] == '0' ? 1 : 0;
      break;
    case '+': 
      paramInt1++;
      if (paramInt1 == paramInt2)
      {
        this.a.setLength(0);
        return paramDouble;
      }
      j = paramArrayOfChar[paramInt1] == '0' ? 1 : 0;
      break;
    case '0': 
      j = 1;
      break;
    default: 
      j = 0;
    }
    int k;
    int m;
    if (paramDouble == 0.0D)
    {
      k = 1;
      m = this.c.g() != null ? 311 : i != 0 ? 307 : this.c.g() != null ? 305 : 309;
    }
    else
    {
      k = 0;
      m = paramBoolean ? 309 : i != 0 ? 309 : paramBoolean ? 307 : 307;
    }
    int n = 0;
    int i1 = -1;
    int i2 = 0;
    while (paramInt1 < paramInt2) {
      if ((paramArrayOfChar[paramInt1] >= '0') && (paramArrayOfChar[paramInt1] <= '9'))
      {
        if (j != 0) {
          this.a.append('0');
        }
        n = n * 10 + (paramArrayOfChar[paramInt1] - '0');
        if (i1 < 0) {
          if (k != 0)
          {
            i1 = m;
          }
          else
          {
            i2 = (int)Math.floor(Math.log10(paramDouble));
            i1 = i != 0 ? m + i2 : m - i2;
          }
        }
        if (n > i1)
        {
          this.a.setLength(0);
          return paramDouble;
        }
        paramInt1++;
      }
      else
      {
        this.a.setLength(0);
        return paramDouble;
      }
    }
    this.c.a(true);
    if (j == 0) {
      this.a.append("0");
    }
    if (k != 0)
    {
      this.b.append('0');
      return paramDouble;
    }
    if (i != 0) {
      n = -n;
    }
    if (paramBoolean) {
      n -= 2;
    }
    int i3;
    int i4;
    if (i2 > 0)
    {
      i3 = 0;
      for (i4 = this.b.length() - 1; i4 > 1; i4--) {
        if (i3 != 0) {
          this.b.setCharAt(i4 + 1, this.b.charAt(i4));
        } else if (this.b.charAt(i4) == '.') {
          i3 = 1;
        }
      }
      if (i3 != 0)
      {
        this.b.setCharAt(2, this.b.charAt(1));
        this.b.setCharAt(1, '.');
      }
      else
      {
        this.b.insert(1, '.');
      }
      n += i2;
      this.b.append('E');
      this.b.append(n);
      return paramDouble / Math.pow(10.0D, i2) * Math.pow(10.0D, n);
    }
    if (i2 < 0)
    {
      for (i3 = 0;; i3++)
      {
        i4 = this.b.charAt(i3);
        if ((i4 != 48) && (i4 != 46)) {
          break;
        }
      }
      this.b.delete(0, 0 + (i3 - 1));
      this.b.setCharAt(0, this.b.charAt(1));
      this.b.setCharAt(1, '.');
      n += i2;
      this.b.append('E');
      this.b.append(n);
      return paramDouble / Math.pow(10.0D, i2) * Math.pow(10.0D, n);
    }
    this.b.append('E');
    this.b.append(n);
    return paramDouble * Math.pow(10.0D, n);
  }
  
  private void b()
  {
    switch (this.b.length())
    {
    case 0: 
      this.b.append("0.00");
      break;
    case 1: 
      this.b.insert(0, "0.0");
      break;
    case 2: 
      this.b.insert(0, "0.");
      break;
    default: 
      this.b.insert(this.b.length() - 2, '.');
    }
  }
  
  public String getFormat()
  {
    return this.c.e();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zik.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */