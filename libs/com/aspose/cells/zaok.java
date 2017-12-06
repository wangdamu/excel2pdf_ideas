package com.aspose.cells;

class zaok
{
  private byte[] a = new byte[16];
  private zkt b = zks.a(zcke.b, zckh.c);
  private zsj c = zsh.a(zcki.a);
  
  public void a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte = new byte[64];
    int i = 0;
    int j = 16;
    while ((i < j) && ((paramArrayOfByte1[(2 * i)] != 0) || (paramArrayOfByte1[(2 * i + 1)] != 0)))
    {
      arrayOfByte[(2 * i)] = ((byte)(paramArrayOfByte1[(2 * i)] & 0xFF));
      arrayOfByte[(2 * i + 1)] = ((byte)(paramArrayOfByte1[(2 * i + 1)] & 0xFF));
      i++;
    }
    arrayOfByte[(2 * i)] = Byte.MIN_VALUE;
    arrayOfByte[56] = ((byte)(i << 4));
    zsh.a(this.c, arrayOfByte, 0, arrayOfByte.length);
    zsh.a(this.c, arrayOfByte, 16);
    for (i = 0; i < 16; i++)
    {
      zsh.a(this.c, arrayOfByte, 0, 5);
      zsh.a(this.c, paramArrayOfByte2, 0, 16);
    }
    arrayOfByte[16] = Byte.MIN_VALUE;
    for (i = 17; i < arrayOfByte.length; i++) {
      arrayOfByte[i] = 0;
    }
    arrayOfByte[56] = Byte.MIN_VALUE;
    arrayOfByte[57] = 10;
    zsh.a(this.c, arrayOfByte, 16, arrayOfByte.length - 16);
    zsh.a(this.c, this.a, this.a.length);
  }
  
  public void a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3)
  {
    a(0);
    zks.b(this.b, paramArrayOfByte1, 0, 16, paramArrayOfByte2, 0, 16);
    byte[] arrayOfByte1 = new byte[64];
    System.arraycopy(paramArrayOfByte1, 0, arrayOfByte1, 0, paramArrayOfByte1.length);
    arrayOfByte1[16] = Byte.MIN_VALUE;
    for (int i = 17; i < arrayOfByte1.length; i++) {
      arrayOfByte1[i] = 0;
    }
    arrayOfByte1[56] = Byte.MIN_VALUE;
    byte[] arrayOfByte2 = new byte[16];
    zsh.a(this.c, arrayOfByte1, 0, arrayOfByte1.length);
    zsh.a(this.c, arrayOfByte2, arrayOfByte2.length);
    zks.b(this.b, arrayOfByte2, 0, arrayOfByte2.length, arrayOfByte1, 0, arrayOfByte1.length);
    System.arraycopy(arrayOfByte1, 0, paramArrayOfByte3, 0, 16);
  }
  
  public boolean a(int paramInt)
  {
    byte[] arrayOfByte = new byte[64];
    for (int i = 0; i < 5; i++) {
      arrayOfByte[i] = this.a[i];
    }
    arrayOfByte[5] = ((byte)(paramInt >>> 0 & 0xFF));
    arrayOfByte[6] = ((byte)(paramInt >>> 8 & 0xFF));
    arrayOfByte[7] = ((byte)(paramInt >>> 16 & 0xFF));
    arrayOfByte[8] = ((byte)(paramInt >>> 24 & 0xFF));
    arrayOfByte[9] = Byte.MIN_VALUE;
    arrayOfByte[56] = 72;
    this.b = zks.a(zcke.b, zckh.c);
    this.c = zsh.a(zcki.a);
    zsh.a(this.c, arrayOfByte, 0, arrayOfByte.length);
    zsh.a(this.c, arrayOfByte, 16);
    zckg localzckg = zks.b(this.b, zckf.b, arrayOfByte, 16, null, 0);
    return localzckg == zckg.a;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaok.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */