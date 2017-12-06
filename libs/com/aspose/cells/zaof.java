package com.aspose.cells;

class zaof
{
  private long[] a;
  private int b;
  
  zaof(int paramInt)
  {
    this.a = new long[paramInt];
  }
  
  int a()
  {
    return this.b;
  }
  
  void a(long paramLong)
  {
    if (this.b == this.a.length)
    {
      long[] arrayOfLong = new long[this.b << 1];
      System.arraycopy(this.a, 0, arrayOfLong, 0, this.b);
      this.a = arrayOfLong;
    }
    this.a[(this.b++)] = paramLong;
  }
  
  void a(long[] paramArrayOfLong, int paramInt1, int paramInt2)
  {
    if (this.b + paramInt2 > this.a.length)
    {
      long[] arrayOfLong;
      if (this.a.length <= paramInt2) {
        arrayOfLong = new long[this.a.length + paramInt2];
      } else {
        arrayOfLong = new long[this.a.length << 1];
      }
      System.arraycopy(this.a, 0, arrayOfLong, 0, this.b);
      this.a = arrayOfLong;
    }
    System.arraycopy(paramArrayOfLong, paramInt1, this.a, this.b, paramInt2);
    this.b += paramInt2;
  }
  
  void a(long paramLong, int paramInt)
  {
    if (this.b == this.a.length)
    {
      long[] arrayOfLong = new long[this.b << 1];
      System.arraycopy(this.a, 0, arrayOfLong, 0, paramInt);
      System.arraycopy(this.a, paramInt, arrayOfLong, paramInt + 1, this.b - paramInt);
      this.a = arrayOfLong;
    }
    else
    {
      System.arraycopy(this.a, paramInt, this.a, paramInt + 1, this.b - paramInt);
    }
    this.a[paramInt] = paramLong;
    this.b += 1;
  }
  
  long a(int paramInt)
  {
    return this.a[paramInt];
  }
  
  void a(int paramInt, long paramLong)
  {
    this.a[paramInt] = paramLong;
  }
  
  void a(int paramInt1, int paramInt2)
  {
    if (this.b > paramInt2) {
      System.arraycopy(this.a, paramInt2, this.a, paramInt1, this.b - paramInt2);
    }
    this.b -= paramInt2 - paramInt1;
  }
  
  long[] b()
  {
    long[] arrayOfLong = new long[this.b];
    System.arraycopy(this.a, 0, arrayOfLong, 0, this.b);
    return arrayOfLong;
  }
  
  long[] b(int paramInt1, int paramInt2)
  {
    long[] arrayOfLong = new long[paramInt2];
    System.arraycopy(this.a, paramInt1, arrayOfLong, 0, paramInt2);
    return arrayOfLong;
  }
  
  long[] c()
  {
    return this.a;
  }
  
  void a(int paramInt, boolean paramBoolean)
  {
    if (this.b < paramInt + 2) {
      return;
    }
    int i;
    long l;
    int j;
    if (paramBoolean)
    {
      paramInt--;
      for (i = this.b - 1; i > paramInt; i--)
      {
        l = this.a[i];
        for (j = i - 1; j > paramInt; j--) {
          if (l == this.a[j])
          {
            this.b -= 1;
            if (i >= this.b) {
              break;
            }
            System.arraycopy(this.a, i + 1, this.a, i, this.b - i);
            break;
          }
        }
      }
    }
    else
    {
      for (i = paramInt; i < this.b; i++)
      {
        l = this.a[i];
        for (j = i + 1; j < this.b; j++) {
          if (l == this.a[j])
          {
            this.b -= 1;
            this.a[j] = this.a[this.b];
          }
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaof.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */