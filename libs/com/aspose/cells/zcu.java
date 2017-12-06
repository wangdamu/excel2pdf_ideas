package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcu
  extends zcd
{
  static int a = 0;
  private int c = 0;
  
  zcu(CustomProperty paramCustomProperty)
    throws Exception
  {
    c(1048);
    String str1 = paramCustomProperty.getName();
    String str2 = paramCustomProperty.getValue();
    this.c = (7 + str1.length() + str2.length() * 2);
    this.b = new byte[this.c];
    this.b[1] = 16;
    System.arraycopy(zc.a(str2.length() * 2), 0, this.b, 2, 4);
    this.b[6] = ((byte)str1.length());
    System.arraycopy(Encoding.getASCII().a(str1), 0, this.b, 7, str1.length());
    System.arraycopy(Encoding.getUnicode().a(str2), 0, this.b, str1.length() + 7, str2.length() * 2);
  }
  
  void a(zrg paramzrg)
    throws Exception
  {
    if (this.c < 8224)
    {
      a((short)this.c);
      super.a(paramzrg);
    }
    else
    {
      byte[] arrayOfByte = new byte[4];
      System.arraycopy(zc.a(f()), 0, arrayOfByte, 0, 2);
      System.arraycopy(zc.a((short)8224), 0, arrayOfByte, 2, 2);
      paramzrg.a(arrayOfByte);
      paramzrg.a(this.b, 0, 8224);
      int i = 8224;
      for (;;)
      {
        int j = this.b.length - i;
        if (j > 8224)
        {
          System.arraycopy(zc.a(1084), 0, arrayOfByte, 0, 2);
          System.arraycopy(zc.a((short)8224), 0, arrayOfByte, 2, 2);
          paramzrg.a(arrayOfByte);
          paramzrg.a(this.b, i, 8224);
          i += 8224;
        }
        else
        {
          System.arraycopy(zc.a(1084), 0, arrayOfByte, 0, 2);
          System.arraycopy(zc.a(j), 0, arrayOfByte, 2, 2);
          paramzrg.a(arrayOfByte);
          paramzrg.a(this.b, i, j);
          j = 0;
          break;
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */