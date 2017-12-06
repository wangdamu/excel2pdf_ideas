package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zauq
  extends zcd
{
  zauq()
  {
    c(77);
  }
  
  void a(byte[] paramArrayOfByte)
  {
    this.b = paramArrayOfByte;
  }
  
  void a(zrg paramzrg)
    throws Exception
  {
    byte[] arrayOfByte = new byte[6];
    arrayOfByte[0] = 77;
    if (this.b.length + 2 <= 8224)
    {
      System.arraycopy(zc.a(this.b.length + 2), 0, arrayOfByte, 2, 2);
      paramzrg.a(arrayOfByte);
      paramzrg.a(this.b);
    }
    else
    {
      System.arraycopy(zc.a((short)8224), 0, arrayOfByte, 2, 2);
      paramzrg.a(arrayOfByte);
      paramzrg.a(this.b, 8222);
      int i = 8222;
      arrayOfByte = new byte[4];
      arrayOfByte[0] = 60;
      while (i < this.b.length)
      {
        int j = this.b.length - i;
        if (j > 8224)
        {
          System.arraycopy(zc.a((short)8224), 0, arrayOfByte, 2, 2);
          paramzrg.a(arrayOfByte);
          paramzrg.a(this.b, i, 8224);
          i += 8224;
        }
        else
        {
          System.arraycopy(zc.a(j), 0, arrayOfByte, 2, 2);
          paramzrg.a(arrayOfByte);
          paramzrg.a(this.b, i, j);
          i += j;
          break;
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zauq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */