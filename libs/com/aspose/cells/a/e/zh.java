package com.aspose.cells.a.e;

public class zh
{
  private int[] a = null;
  private int b = 0;
  
  public zh()
  {
    b();
  }
  
  public int a()
  {
    return this.b;
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    a(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    while (paramInt1 < paramInt2)
    {
      int i = this.b;
      i >>>= 24;
      i ^= paramArrayOfByte[paramInt1] & 0xFF;
      this.b <<= 8;
      this.b ^= this.a[i];
      paramInt1++;
    }
  }
  
  private void b()
  {
    for (int i = 0; i < 256; i++)
    {
      int j = i;
      j <<= 24;
      for (int k = 0; k < 8; k++) {
        if ((j & 0x80000000) != 0)
        {
          j <<= 1;
          j ^= 0xAF;
        }
        else
        {
          j <<= 1;
        }
      }
      this.a[i] = j;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/e/zh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */