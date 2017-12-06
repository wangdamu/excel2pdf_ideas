package com.aspose.cells;

class zbdv
  implements zail, zajc
{
  private int a;
  private int[] b;
  private int[] c;
  private int d = 0;
  
  zbdv(int paramInt, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    this.a = paramInt;
    this.b = paramArrayOfInt1;
    this.c = paramArrayOfInt2;
  }
  
  public int b()
  {
    return this.c.length;
  }
  
  public int c(int paramInt)
  {
    return this.b[paramInt];
  }
  
  public int a(int paramInt)
  {
    this.d = zld.a(this, paramInt, this.d);
    if (this.d < 0)
    {
      this.d = (-this.d - 1);
      return this.a;
    }
    return this.c[this.d];
  }
  
  public int a(int paramInt1, int paramInt2)
  {
    int i = zld.a(this, paramInt1, -1);
    if (i < 0)
    {
      if (paramInt1 == paramInt2) {
        return this.a;
      }
      i = -i - 1;
      if ((i >= this.b.length) || (this.b[i] > paramInt2)) {
        return (paramInt2 - paramInt1 + 1) * this.a;
      }
      if ((this.b[i] == paramInt2) || (i == this.b.length - 1)) {
        return (paramInt2 - paramInt1) * this.a + this.c[i];
      }
    }
    else
    {
      if (paramInt1 == paramInt2) {
        return this.c[i];
      }
      if (i == this.b.length - 1) {
        return (paramInt2 - paramInt1) * this.a + this.c[i];
      }
    }
    int j = zld.a(this, paramInt2, i + 1, this.c.length - 1);
    if (j < 0) {
      j = -j - 1;
    } else {
      j++;
    }
    int k = (paramInt2 - paramInt1 + 1 - (j - i)) * this.a;
    while (i < j)
    {
      k += this.c[i];
      i++;
    }
    return k;
  }
  
  public void a(int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt[0];
    int j = zld.a(this, i, -1);
    if (j < 0) {
      j = -j - 1;
    }
    int k;
    int m;
    if (paramArrayOfInt[2] < 0)
    {
      k = -paramArrayOfInt[2] - paramArrayOfInt[1];
      if (k <= 0)
      {
        paramArrayOfInt[2] = (-k);
        paramArrayOfInt[1] = 0;
        a(paramArrayOfInt);
        return;
      }
      i--;
      if (i < 0)
      {
        paramArrayOfInt[1] = 0;
        paramArrayOfInt[2] = (this.b[0] == 0 ? this.c[0] : this.a);
        return;
      }
      while (j > -1)
      {
        if ((this.b[j] < i) && (this.a > 0))
        {
          m = (k - 1) / this.a;
          if (i - m > this.b[j])
          {
            k -= m * this.a;
            paramArrayOfInt[0] = (i - m);
            paramArrayOfInt[1] = (this.a - k);
            paramArrayOfInt[2] = k;
            return;
          }
          k -= (i - this.b[j]) * this.a;
        }
        if (k <= this.c[j])
        {
          paramArrayOfInt[0] = this.b[j];
          paramArrayOfInt[1] = (this.c[j] - k);
          paramArrayOfInt[2] = k;
          return;
        }
        k -= this.c[j];
        i = this.b[j] - 1;
        j--;
      }
      if (this.a == 0)
      {
        paramArrayOfInt[0] = (i + 1);
        paramArrayOfInt[1] = 0;
        paramArrayOfInt[2] = this.a;
        return;
      }
      m = (k - 1) / this.a;
      if (i < m)
      {
        paramArrayOfInt[0] = 0;
        paramArrayOfInt[1] = 0;
        paramArrayOfInt[2] = this.a;
      }
      k -= m * this.a;
      paramArrayOfInt[0] = (i - m);
      paramArrayOfInt[1] = (this.a - k);
      paramArrayOfInt[2] = k;
    }
    else
    {
      k = paramArrayOfInt[1] + paramArrayOfInt[2];
      while (j < this.b.length)
      {
        if ((this.b[j] > i) && (this.a > 0))
        {
          m = (k - 1) / this.a;
          if (i + m < this.b[j])
          {
            k -= m * this.a;
            paramArrayOfInt[0] = (i + m);
            paramArrayOfInt[1] = k;
            paramArrayOfInt[2] = (this.a - k);
            return;
          }
          k -= (this.b[j] - i) * this.a;
        }
        if (k <= this.c[j])
        {
          paramArrayOfInt[0] = this.b[j];
          paramArrayOfInt[1] = k;
          paramArrayOfInt[2] = (this.c[j] - k);
          return;
        }
        k -= this.c[j];
        i = this.b[j] + 1;
        j++;
      }
      if (this.a == 0)
      {
        paramArrayOfInt[0] = (i - 1);
        paramArrayOfInt[1] = k;
        paramArrayOfInt[2] = (-k);
        return;
      }
      m = (k - 1) / this.a;
      k -= m * this.a;
      paramArrayOfInt[0] = (i + m);
      paramArrayOfInt[1] = k;
      paramArrayOfInt[2] = (this.a - k);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbdv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */