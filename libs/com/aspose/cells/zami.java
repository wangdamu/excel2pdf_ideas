package com.aspose.cells;

class zami
{
  private int[] a;
  private int b;
  
  public zami(int paramInt)
  {
    this.a = new int[paramInt];
    this.b = 0;
  }
  
  public zami()
  {
    this.a = new int[8];
    this.b = 0;
  }
  
  public zami(int[] paramArrayOfInt, int paramInt)
  {
    this.b = paramInt;
    this.a = paramArrayOfInt;
  }
  
  public void a(int paramInt)
  {
    if (this.b >= this.a.length)
    {
      int[] arrayOfInt = new int[this.b << 1];
      System.arraycopy(this.a, 0, arrayOfInt, 0, this.a.length);
      this.a = arrayOfInt;
    }
    this.a[(this.b++)] = paramInt;
  }
  
  public int a()
  {
    return this.b;
  }
  
  public int b(int paramInt)
  {
    return this.a[paramInt];
  }
  
  int b()
  {
    if (this.b == 0) {
      throw new CellsException(6, "No data in the stack");
    }
    int i = this.a[(this.b - 1)];
    c(-1);
    this.b -= 1;
    return i;
  }
  
  void c()
  {
    this.b = 0;
    this.a = new int[8];
  }
  
  void c(int paramInt)
  {
    int i = this.b + paramInt;
    int[] arrayOfInt;
    if (i > this.a.length)
    {
      arrayOfInt = new int[i * 2];
      System.arraycopy(this.a, 0, arrayOfInt, 0, this.b);
      this.a = arrayOfInt;
    }
    else if ((i > 8) && (i < this.a.length / 3))
    {
      arrayOfInt = new int[this.a.length / 2];
      System.arraycopy(this.a, 0, arrayOfInt, 0, i);
      this.a = arrayOfInt;
    }
  }
  
  void a(int paramInt1, int paramInt2)
  {
    int i = paramInt1 + paramInt2;
    if (i < this.b) {
      System.arraycopy(this.a, i, this.a, paramInt1, this.b - i);
    }
    this.b -= paramInt2;
  }
  
  void b(int paramInt1, int paramInt2)
  {
    c(1);
    if (paramInt1 < this.b) {
      System.arraycopy(this.a, paramInt1, this.a, paramInt1 + 1, this.b - paramInt1);
    }
    this.a[paramInt1] = paramInt2;
    this.b += 1;
  }
  
  void a(int paramInt1, int[] paramArrayOfInt, int paramInt2, int paramInt3)
  {
    c(paramInt3);
    if (paramInt1 < this.b) {
      System.arraycopy(this.a, paramInt1, this.a, paramInt1 + paramInt3, this.b - paramInt1);
    }
    System.arraycopy(paramArrayOfInt, paramInt2, this.a, paramInt1, paramInt3);
    this.b += paramInt3;
  }
  
  int[] d()
  {
    return this.a;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zami.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */