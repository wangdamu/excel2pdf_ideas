package com.aspose.cells;

class zcy
{
  byte[] a;
  private int b;
  
  zcy(byte[] paramArrayOfByte)
  {
    this.a = paramArrayOfByte;
    this.b = paramArrayOfByte.length;
  }
  
  zcy(int paramInt)
  {
    if (paramInt < 16) {
      paramInt *= 2;
    }
    this.a = new byte[paramInt];
    this.b = 0;
  }
  
  void a(byte paramByte)
  {
    b(1);
    this.a[(this.b++)] = paramByte;
  }
  
  void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    b(paramInt2);
    System.arraycopy(paramArrayOfByte, paramInt1, this.a, this.b, paramInt2);
    this.b += paramInt2;
  }
  
  void a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    System.arraycopy(paramArrayOfByte, paramInt2, this.a, paramInt1, paramInt3);
  }
  
  void a(int paramInt1, int paramInt2)
  {
    b(paramInt2);
    System.arraycopy(this.a, paramInt1, this.a, paramInt1 + paramInt2, this.b - paramInt1);
    this.b += paramInt2;
  }
  
  void a(int paramInt)
  {
    b(paramInt);
    this.b += paramInt;
  }
  
  void a(byte[] paramArrayOfByte, int paramInt)
  {
    System.arraycopy(this.a, 0, paramArrayOfByte, paramInt, this.b);
  }
  
  byte[] a()
  {
    if (this.b == this.a.length) {
      return this.a;
    }
    byte[] arrayOfByte = new byte[this.b];
    System.arraycopy(this.a, 0, arrayOfByte, 0, this.b);
    return arrayOfByte;
  }
  
  private void b(int paramInt)
  {
    if (this.b + paramInt > this.a.length)
    {
      int i = this.a.length << 1;
      if (this.b + paramInt > i) {
        i = this.b + paramInt << 1;
      }
      byte[] arrayOfByte = new byte[i];
      System.arraycopy(this.a, 0, arrayOfByte, 0, this.b);
      this.a = arrayOfByte;
    }
  }
  
  int b()
  {
    return this.b;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */