package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbsw
  extends zcd
{
  private boolean a = true;
  private int c = 0;
  
  zbsw(String paramString)
  {
    c(519);
    this.b = zct.c(paramString);
    this.c = paramString.length();
    if (this.b != null) {
      this.a = (this.b.length == paramString.length());
    }
  }
  
  void a(zrg paramzrg)
    throws Exception
  {
    if (this.b == null)
    {
      this.b = new byte[7];
      this.b[0] = 7;
      this.b[1] = 2;
      this.b[2] = 3;
      paramzrg.a(this.b);
      return;
    }
    int i = 3 + this.b.length;
    byte[] arrayOfByte = new byte[7];
    arrayOfByte[0] = 7;
    arrayOfByte[1] = 2;
    System.arraycopy(zc.a(this.c), 0, arrayOfByte, 4, 2);
    if (!this.a) {
      arrayOfByte[6] = 1;
    }
    if (i < 8224)
    {
      System.arraycopy(zc.a(3 + this.b.length), 0, arrayOfByte, 2, 2);
      paramzrg.a(arrayOfByte);
      paramzrg.a(this.b);
    }
    else
    {
      int j = this.a ? 8221 : 8220;
      System.arraycopy(zc.a(3 + j), 0, arrayOfByte, 2, 2);
      paramzrg.a(arrayOfByte);
      paramzrg.a(this.b, 0, j);
      int k = j;
      j = this.a ? 8223 : 8222;
      arrayOfByte = new byte[5];
      arrayOfByte[0] = 60;
      if (!this.a) {
        arrayOfByte[4] = 1;
      }
      while (k < this.b.length)
      {
        if (j > this.b.length - k) {
          j = this.b.length - k;
        }
        System.arraycopy(zc.a(1 + j), 0, arrayOfByte, 2, 2);
        paramzrg.a(arrayOfByte);
        paramzrg.a(this.b, k, j);
        k += j;
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbsw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */