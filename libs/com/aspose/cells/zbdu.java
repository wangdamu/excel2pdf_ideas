package com.aspose.cells;

class zbdu
  implements zajc
{
  private int a;
  private int[] b;
  
  zbdu(int paramInt, int[] paramArrayOfInt)
  {
    this.a = paramInt;
    this.b = paramArrayOfInt;
    for (int i = 1; i < paramArrayOfInt.length; i++) {
      paramArrayOfInt[i] += paramArrayOfInt[(i - 1)];
    }
  }
  
  public int a(int paramInt)
  {
    if ((this.b == null) || (paramInt >= this.b.length)) {
      return this.a;
    }
    if (paramInt > 0) {
      return this.b[paramInt] - this.b[(paramInt - 1)];
    }
    return this.b[0];
  }
  
  public int a(int paramInt1, int paramInt2)
  {
    if (this.b != null)
    {
      if (paramInt2 < this.b.length)
      {
        if (paramInt1 == 0) {
          return this.b[paramInt2];
        }
        return this.b[paramInt2] - this.b[(paramInt1 - 1)];
      }
      if (paramInt1 == 0)
      {
        if (this.a == 0) {
          return this.b[(this.b.length - 1)];
        }
        return this.b[(this.b.length - 1)] + (paramInt2 - this.b.length + 1) * this.a;
      }
      if (paramInt1 < this.b.length)
      {
        if (this.a == 0) {
          return this.b[(this.b.length - 1)] - this.b[(paramInt1 - 1)];
        }
        return this.b[(this.b.length - 1)] - this.b[(paramInt1 - 1)] + (paramInt2 - this.b.length + 1) * this.a;
      }
    }
    if (this.a == 0) {
      return 0;
    }
    return (paramInt2 - paramInt1 + 1) * this.a;
  }
  
  public void a(int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt[0];
    int j;
    int k;
    if (paramArrayOfInt[2] < 0)
    {
      j = -paramArrayOfInt[2] - paramArrayOfInt[1];
      if (j <= 0)
      {
        paramArrayOfInt[2] = (-j);
        paramArrayOfInt[1] = 0;
        a(paramArrayOfInt);
        return;
      }
      i--;
      if (i < 0)
      {
        paramArrayOfInt[1] = 0;
        paramArrayOfInt[2] = (this.b == null ? this.a : this.b[0]);
        return;
      }
      if (this.b == null)
      {
        if (this.a == 0) {
          return;
        }
        k = (j - 1) / this.a;
        if (k > i)
        {
          paramArrayOfInt[0] = 0;
          paramArrayOfInt[1] = 0;
          paramArrayOfInt[2] = this.a;
        }
        else
        {
          j -= k * this.a;
          paramArrayOfInt[0] = (i - k);
          paramArrayOfInt[1] = (this.a - j);
          paramArrayOfInt[2] = j;
        }
        return;
      }
      if (i >= this.b.length)
      {
        if (this.a != 0)
        {
          k = (j - 1) / this.a;
          i -= k;
          if (i >= this.b.length)
          {
            j -= k * this.a;
            paramArrayOfInt[0] = i;
            paramArrayOfInt[1] = (this.a - j);
            paramArrayOfInt[2] = j;
            return;
          }
          j -= (i - this.b.length + 1) * this.a;
        }
        i = this.b.length - 1;
      }
      j = this.b[i] - j;
      if (j <= 0)
      {
        paramArrayOfInt[0] = 0;
        paramArrayOfInt[1] = 0;
        paramArrayOfInt[2] = this.b[0];
        return;
      }
      i--;
      while (i > -1)
      {
        if (j >= this.b[i])
        {
          paramArrayOfInt[0] = (i + 1);
          paramArrayOfInt[1] = (j - this.b[i]);
          paramArrayOfInt[2] = (this.b[(i + 1)] - j);
          return;
        }
        i--;
      }
      paramArrayOfInt[0] = 0;
      paramArrayOfInt[1] = j;
      paramArrayOfInt[2] = (this.b[0] - j);
    }
    else
    {
      j = paramArrayOfInt[1] + paramArrayOfInt[2];
      if ((this.b != null) && (i < this.b.length))
      {
        if (i > 0) {
          j += this.b[(i - 1)];
        }
        while (i < this.b.length)
        {
          if (j <= this.b[i])
          {
            paramArrayOfInt[0] = i;
            paramArrayOfInt[1] = (i > 0 ? j - this.b[(i - 1)] : j);
            paramArrayOfInt[2] = (this.b[i] - j);
            return;
          }
          i++;
        }
        j -= this.b[(this.b.length - 1)];
      }
      if (this.a == 0)
      {
        paramArrayOfInt[0] = i;
        paramArrayOfInt[1] = j;
        paramArrayOfInt[2] = (-paramArrayOfInt[1]);
        return;
      }
      k = (j - 1) / this.a;
      j -= k * this.a;
      paramArrayOfInt[0] = (i + k);
      paramArrayOfInt[1] = j;
      paramArrayOfInt[2] = (this.a - j);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbdu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */