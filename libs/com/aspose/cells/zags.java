package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zags
  extends zcd
{
  zags(boolean paramBoolean)
  {
    if (paramBoolean) {
      c(20);
    } else {
      c(21);
    }
  }
  
  void a(String[] paramArrayOfString)
  {
    byte[][] arrayOfByte = new byte[3][];
    b(3);
    int i = 0;
    if (paramArrayOfString != null)
    {
      for (int j = 0; j < 3; j++)
      {
        String str = paramArrayOfString[j];
        if ((str != null) && (!"".equals(str)))
        {
          switch (j)
          {
          case 0: 
            if (!str.startsWith("&L")) {
              str = "&L" + str;
            }
            break;
          case 1: 
            if (!str.startsWith("&C")) {
              str = "&C" + str;
            }
            break;
          case 2: 
            if (!str.startsWith("&R")) {
              str = "&R" + str;
            }
            break;
          }
          arrayOfByte[j] = Encoding.getUnicode().a(str);
          b(d() + (short)arrayOfByte[j].length);
          i += str.length();
        }
      }
      this.b = new byte[d()];
      System.arraycopy(zc.a((short)i), 0, this.b, 0, 2);
      this.b[2] = 1;
      j = 3;
      for (int k = 0; k < 3; k++) {
        if (arrayOfByte[k] != null)
        {
          System.arraycopy(arrayOfByte[k], 0, this.b, j, arrayOfByte[k].length);
          j += arrayOfByte[k].length;
        }
      }
    }
  }
  
  void a(zrg paramzrg)
    throws Exception
  {
    if (this.b == null)
    {
      paramzrg.a(f());
      paramzrg.c(0);
    }
    else
    {
      super.a(paramzrg);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zags.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */