package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zaby
  extends zcd
{
  zaby(byte[] paramArrayOfByte)
  {
    c(6);
    a((short)(20 + paramArrayOfByte.length));
    this.b = new byte[d()];
    this.b[19] = -1;
    System.arraycopy(paramArrayOfByte, 0, this.b, 20, paramArrayOfByte.length);
  }
  
  void a(int paramInt1, byte paramByte1, int paramInt2, int paramInt3, Object paramObject, boolean paramBoolean, byte paramByte2)
  {
    System.arraycopy(zc.a(paramInt1), 0, this.b, 0, 2);
    this.b[2] = paramByte1;
    System.arraycopy(zc.a(paramInt2), 0, this.b, 4, 2);
    byte[] tmp41_36 = this.b;
    tmp41_36[14] = ((byte)(tmp41_36[14] | paramByte2));
    if (paramBoolean)
    {
      byte[] tmp59_54 = this.b;
      tmp59_54[14] = ((byte)(tmp59_54[14] | 0x8));
    }
    switch (paramInt3)
    {
    case 1: 
      System.arraycopy(zc.a(((Double)paramObject).doubleValue()), 0, this.b, 6, 8);
      break;
    case 6: 
      System.arraycopy(zc.a(zayi.a(((Integer)paramObject).intValue())), 0, this.b, 6, 8);
      break;
    case 4: 
      this.b[6] = 0;
      this.b[12] = -1;
      this.b[13] = -1;
      break;
    case 3: 
      this.b[12] = -1;
      this.b[13] = -1;
      int i = ((Byte)paramObject).byteValue();
      zuf localzuf = zuf.h;
      if (ztr.b(localzuf) == i)
      {
        this.b[6] = 3;
      }
      else
      {
        this.b[6] = 2;
        this.b[8] = i;
      }
      break;
    case 2: 
      this.b[6] = 1;
      this.b[8] = ((byte)(((Boolean)paramObject).booleanValue() ? 1 : 0));
      this.b[12] = -1;
      this.b[13] = -1;
      break;
    case 5: 
    default: 
      this.b[6] = 3;
      this.b[12] = -1;
      this.b[13] = -1;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaby.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */