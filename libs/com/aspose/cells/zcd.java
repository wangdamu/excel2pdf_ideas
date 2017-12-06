package com.aspose.cells;

import com.aspose.cells.b.a.zc;

abstract class zcd
{
  protected byte[] b;
  private short a;
  private short c;
  
  short d()
  {
    return this.a;
  }
  
  void a(short paramShort)
  {
    this.a = paramShort;
  }
  
  void b(int paramInt)
  {
    this.a = ((short)paramInt);
  }
  
  void c(int paramInt)
  {
    this.c = ((short)paramInt);
  }
  
  byte[] e()
  {
    return this.b;
  }
  
  short f()
  {
    return this.c;
  }
  
  void a(zrg paramzrg)
    throws Exception
  {
    byte[] arrayOfByte;
    if ((this.b != null) && (this.b.length != 0))
    {
      arrayOfByte = new byte[this.b.length + 4];
      System.arraycopy(zc.a(this.c), 0, arrayOfByte, 0, 2);
      System.arraycopy(zc.a(this.a), 0, arrayOfByte, 2, 2);
      System.arraycopy(this.b, 0, arrayOfByte, 4, this.b.length);
    }
    else
    {
      arrayOfByte = new byte[4];
      System.arraycopy(zc.a(this.c), 0, arrayOfByte, 0, 2);
      System.arraycopy(zc.a(this.a), 0, arrayOfByte, 2, 2);
    }
    paramzrg.a(arrayOfByte);
  }
  
  void b(byte[] paramArrayOfByte)
  {
    this.b = paramArrayOfByte;
    if (paramArrayOfByte != null) {
      this.a = ((short)paramArrayOfByte.length);
    } else {
      this.a = 0;
    }
  }
  
  void a(zcd paramzcd)
  {
    a(paramzcd.d());
    this.b = new byte[d()];
    System.arraycopy(paramzcd.b, 0, this.b, 0, d());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */