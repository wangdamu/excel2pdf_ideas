package com.aspose.cells;

class zbtn
{
  private int a;
  private int b = 0;
  private byte[] c = null;
  
  public void a(byte[] paramArrayOfByte, short paramShort, int paramInt)
  {
    this.c = paramArrayOfByte;
    this.b = paramShort;
    this.a = (paramInt - paramShort);
  }
  
  public int a()
  {
    return this.a + this.b;
  }
  
  public int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    for (int i = 0; i < paramInt2; i++) {
      paramArrayOfByte[(paramInt1 + i)] = this.c[(this.b + i)];
    }
    this.b += paramInt2;
    return paramInt2;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbtn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */