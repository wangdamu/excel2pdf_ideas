package com.aspose.cells;

class zacr
  extends zacp
{
  private byte a;
  private byte b;
  
  public zacr(int paramInt1, int paramInt2, int paramInt3, byte paramByte1, byte paramByte2)
  {
    super(paramInt1, paramInt2, paramInt3);
    this.a = paramByte1;
    this.b = paramByte2;
  }
  
  public zacr(int paramInt, int[] paramArrayOfInt1, int[] paramArrayOfInt2, byte paramByte1, byte paramByte2)
  {
    super(paramInt, paramArrayOfInt1, paramArrayOfInt2);
    this.a = paramByte1;
    this.b = paramByte2;
  }
  
  public int b()
  {
    return this.b & 0xFF & 0xFF;
  }
  
  public int c()
  {
    return this.a & 0xFF & 0xFF;
  }
  
  public boolean d()
  {
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zacr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */