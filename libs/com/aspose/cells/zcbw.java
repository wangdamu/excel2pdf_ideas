package com.aspose.cells;

class zcbw
{
  private int a = 0;
  private byte[] b = null;
  
  zcbw(byte[] paramArrayOfByte)
  {
    this.b = paramArrayOfByte;
  }
  
  int a()
  {
    int i = c() & 0xFF;
    if (i >= 128)
    {
      i &= 0x7F;
      i |= (c() & 0xFF) << 7;
    }
    return i;
  }
  
  int b()
  {
    int i = 0;
    int j = 0;
    int k = 0;
    for (int m = 0; m < 4; m++)
    {
      j = c();
      if ((j & 0xFF) >= 128)
      {
        i |= (j & 0xFF & 0x7F) << k;
      }
      else
      {
        i |= (j & 0xFF) << k;
        break;
      }
      k += 7;
    }
    return i;
  }
  
  byte[] a(int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    System.arraycopy(this.b, this.a, arrayOfByte, 0, paramInt);
    this.a += paramInt;
    return arrayOfByte;
  }
  
  byte c()
  {
    return this.b[(this.a++)];
  }
  
  void b(int paramInt)
  {
    this.a = paramInt;
  }
  
  void a(long paramLong)
  {
    this.a += (int)paramLong;
  }
  
  byte[] d()
  {
    int i = b();
    return a(i);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcbw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */