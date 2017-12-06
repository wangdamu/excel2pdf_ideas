package com.aspose.cells;

class zdn
  extends zcd
{
  private int a;
  private short c;
  
  zdn(short paramShort, String paramString)
    throws Exception
  {
    c(133);
    this.a = 0;
    this.c = paramShort;
    byte[] arrayOfByte2 = Encoding.getUnicode().a(paramString);
    int i = 0;
    for (int j = 0; j < arrayOfByte2.length; j++) {
      if (j % 2 == 0)
      {
        if ((arrayOfByte2[j] & 0xFF) > Byte.MAX_VALUE)
        {
          i = 1;
          break;
        }
      }
      else if (arrayOfByte2[j] != 0)
      {
        i = 1;
        break;
      }
    }
    if (i != 0)
    {
      this.b = new byte[2 * paramString.length() + 2];
      this.b[0] = ((byte)paramString.length());
      this.b[1] = 1;
      System.arraycopy(arrayOfByte2, 0, this.b, 2, arrayOfByte2.length);
      a((short)(8 + 2 * paramString.length()));
    }
    else
    {
      this.b = new byte[paramString.length() + 2];
      this.b[0] = ((byte)paramString.length());
      byte[] arrayOfByte1 = new byte[paramString.length()];
      this.b[1] = 0;
      for (j = 0; j < arrayOfByte1.length; j++) {
        arrayOfByte1[j] = arrayOfByte2[(2 * j)];
      }
      System.arraycopy(arrayOfByte1, 0, this.b, 2, arrayOfByte1.length);
      a((short)(8 + paramString.length()));
    }
  }
  
  void a(zrg paramzrg)
    throws Exception
  {
    paramzrg.a(f());
    paramzrg.a(d());
    paramzrg.a(this.a);
    paramzrg.a(this.c);
    paramzrg.a(this.b);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zdn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */