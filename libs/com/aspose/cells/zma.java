package com.aspose.cells;

class zma
{
  private int a;
  private int b;
  private int c;
  private int[] d;
  private int e;
  
  zma(Cells paramCells, int paramInt, zahr paramzahr)
  {
    ColumnCollection localColumnCollection = paramCells.getColumns();
    Column localColumn1 = localColumnCollection.a;
    this.b = paramzahr.a(localColumnCollection.b());
    int i;
    if (localColumn1 != null)
    {
      i = localColumn1.getIndex();
      this.c = (localColumn1.isHidden() ? 0 : paramzahr.a(localColumn1.getWidth()));
    }
    else
    {
      i = paramInt + 1;
      this.c = this.b;
    }
    int j = localColumnCollection.getCount();
    int[] arrayOfInt = null;
    if (j > 0)
    {
      j--;
      for (;;)
      {
        Column localColumn2 = localColumnCollection.getColumnByIndex(j);
        if (localColumn2.getIndex() < paramInt)
        {
          arrayOfInt = new int[localColumn2.getIndex() + 1];
          arrayOfInt[localColumn2.getIndex()] = (localColumn2.isHidden() ? 0 : paramzahr.a(localColumn2.getWidth()));
          int k;
          if (i < arrayOfInt.length)
          {
            for (k = 0; k < i; k++) {
              arrayOfInt[k] = this.b;
            }
            for (k = arrayOfInt.length - 2; k >= i; k--) {
              arrayOfInt[k] = this.c;
            }
            i = arrayOfInt.length;
          }
          else
          {
            for (k = arrayOfInt.length - 2; k > -1; k--) {
              arrayOfInt[k] = this.b;
            }
          }
          j--;
          while (j > -1)
          {
            localColumn2 = localColumnCollection.getColumnByIndex(j);
            arrayOfInt[localColumn2.getIndex()] = (localColumn2.isHidden() ? 0 : paramzahr.a(localColumn2.getWidth()));
            j--;
          }
          for (j = 1; j < arrayOfInt.length; j++) {
            arrayOfInt[j] += arrayOfInt[(j - 1)];
          }
        }
        j--;
        if (j < 0) {
          break;
        }
      }
    }
    this.d = arrayOfInt;
    this.a = i;
    if ((arrayOfInt != null) && (this.a > this.d.length)) {
      this.e = ((this.a - this.d.length) * this.b);
    } else {
      this.e = 0;
    }
  }
  
  public int a(int paramInt)
  {
    if ((this.d != null) && (paramInt < this.d.length))
    {
      if (paramInt == 0) {
        return this.d[0];
      }
      return this.d[paramInt] - this.d[(paramInt - 1)];
    }
    if (paramInt >= this.a) {
      return this.c;
    }
    return this.b;
  }
  
  public int a(int paramInt1, int paramInt2)
  {
    if ((this.d != null) && (paramInt1 < this.d.length))
    {
      if (paramInt2 < this.d.length)
      {
        if (paramInt1 == 0) {
          return this.d[paramInt2];
        }
        return this.d[paramInt2] - this.d[(paramInt1 - 1)];
      }
      if (paramInt1 == 0)
      {
        if (paramInt2 < this.a) {
          return this.d[(this.d.length - 1)] + this.b * (paramInt2 - this.d.length + 1);
        }
        return this.d[(this.d.length - 1)] + this.e + this.c * (paramInt2 - this.a + 1);
      }
      if (paramInt2 < this.a) {
        return this.d[(this.d.length - 1)] - this.d[(paramInt1 - 1)] + this.b * (paramInt2 - this.d.length + 1);
      }
      return this.d[(this.d.length - 1)] - this.d[(paramInt1 - 1)] + this.e + this.c * (paramInt2 - this.a + 1);
    }
    if (paramInt1 < this.a)
    {
      if (paramInt2 < this.a) {
        return this.b * (paramInt2 - paramInt1 + 1);
      }
      return this.b * (this.a - paramInt1) + this.c * (paramInt2 - this.a + 1);
    }
    return this.c * (paramInt2 - paramInt1 + 1);
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
        paramArrayOfInt[2] = (this.d == null ? this.b : this.d[0]);
        return;
      }
      if (i >= this.a)
      {
        if (this.c > 0)
        {
          k = (j - 1) / this.c;
          if (i - k >= this.a)
          {
            j -= k * this.c;
            paramArrayOfInt[0] = (i - k);
            paramArrayOfInt[1] = (this.c - j);
            paramArrayOfInt[2] = j;
            return;
          }
          j -= (i - this.a + 1) * this.c;
        }
        i = this.a - 1;
      }
      if (this.d == null)
      {
        if (this.b > 0)
        {
          k = (j - 1) / this.b;
          if (i < k)
          {
            paramArrayOfInt[0] = 0;
            paramArrayOfInt[1] = 0;
            paramArrayOfInt[2] = this.b;
            return;
          }
          j -= k * this.b;
          paramArrayOfInt[0] = (i - k);
          paramArrayOfInt[1] = (this.b - j);
          paramArrayOfInt[2] = j;
        }
        else
        {
          paramArrayOfInt[0] = i;
          paramArrayOfInt[1] = 0;
          paramArrayOfInt[2] = j;
        }
      }
      else
      {
        if (i >= this.d.length)
        {
          if (j <= this.e)
          {
            k = (j - 1) / this.b;
            j -= k * this.b;
            paramArrayOfInt[0] = (i - k);
            paramArrayOfInt[1] = (this.b - j);
            paramArrayOfInt[2] = j;
            return;
          }
          j -= this.e;
          i = this.d.length - 1;
        }
        j = this.d[i] - j;
        if (j > 0)
        {
          i--;
          while (i > -1)
          {
            if (this.d[i] <= j)
            {
              paramArrayOfInt[0] = (i + 1);
              paramArrayOfInt[1] = (j - this.d[i]);
              paramArrayOfInt[2] = (this.d[(i + 1)] - j);
              return;
            }
            i--;
          }
        }
        paramArrayOfInt[0] = 0;
        paramArrayOfInt[1] = 0;
        paramArrayOfInt[2] = this.d[0];
      }
    }
    else
    {
      j = paramArrayOfInt[1] + paramArrayOfInt[2];
      if ((this.d != null) && (i < this.d.length))
      {
        if (i > 0) {
          j += this.d[(i - 1)];
        }
        while (i < this.d.length)
        {
          if (j <= this.d[i])
          {
            paramArrayOfInt[0] = i;
            paramArrayOfInt[1] = (i > 0 ? j - this.d[(i - 1)] : j);
            paramArrayOfInt[2] = (this.d[i] - j);
            return;
          }
          i++;
        }
        j -= this.d[(this.d.length - 1)];
        if (j < this.e)
        {
          k = (j - 1) / this.b;
          j -= k * this.b;
          paramArrayOfInt[0] = (this.d.length + k);
          paramArrayOfInt[1] = j;
          paramArrayOfInt[2] = (this.b - j);
          return;
        }
        if (j == this.e)
        {
          paramArrayOfInt[0] = (this.a - 1);
          paramArrayOfInt[1] = this.b;
          paramArrayOfInt[2] = 0;
          return;
        }
        j -= this.e;
        i = this.a;
      }
      if (i < this.a)
      {
        if (this.b > 0)
        {
          k = (j - 1) / this.b;
          if (i + k < this.a)
          {
            j -= k * this.b;
            paramArrayOfInt[0] = (i + k);
            paramArrayOfInt[1] = j;
            paramArrayOfInt[2] = (this.b - j);
            return;
          }
          j -= (this.a - i) * this.b;
        }
        i = this.a;
      }
      if (this.c > 0)
      {
        k = (j - 1) / this.c;
        j -= k * this.c;
        paramArrayOfInt[0] = (i + k);
        paramArrayOfInt[1] = j;
        paramArrayOfInt[2] = (this.c - j);
      }
      else
      {
        paramArrayOfInt[0] = i;
        paramArrayOfInt[1] = j;
        paramArrayOfInt[2] = (-j);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zma.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */