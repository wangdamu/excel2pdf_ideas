package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.c.a.za;

class zbtb
  extends zcd
{
  private static final za a = new za(new String[] { "Normal", "Comma", "Currency", "Percent", "Comma [0]", "Currency [0]", "Hyperlink", "Followed Hyperlink" });
  
  zbtb()
  {
    c(659);
    b(4);
  }
  
  void a(int paramInt, byte paramByte)
  {
    this.b = new byte[] { 16, Byte.MIN_VALUE, 5, -1 };
    paramInt |= 0x8000;
    System.arraycopy(zc.a(paramInt), 0, this.b, 0, 2);
    this.b[2] = paramByte;
  }
  
  void a(int paramInt, String paramString)
  {
    switch (a.a(paramString))
    {
    case 0: 
      this.b = new byte[] { 0, Byte.MIN_VALUE, 0, -1 };
      paramInt |= 0x8000;
      break;
    case 1: 
      this.b = new byte[] { 19, Byte.MIN_VALUE, 3, -1 };
      paramInt |= 0x8000;
      break;
    case 2: 
      this.b = new byte[] { 17, Byte.MIN_VALUE, 4, -1 };
      paramInt |= 0x8000;
      break;
    case 3: 
      this.b = new byte[] { 16, Byte.MIN_VALUE, 5, -1 };
      paramInt |= 0x8000;
      break;
    case 4: 
      this.b = new byte[] { 20, Byte.MIN_VALUE, 6, -1 };
      paramInt |= 0x8000;
      break;
    case 5: 
      this.b = new byte[] { 18, Byte.MIN_VALUE, 7, -1 };
      paramInt |= 0x8000;
      break;
    case 6: 
      this.b = new byte[] { 21, Byte.MIN_VALUE, 8, -1 };
      paramInt |= 0x8000;
      break;
    case 7: 
      this.b = new byte[] { 22, Byte.MIN_VALUE, 9, -1 };
      paramInt |= 0x8000;
      break;
    default: 
      byte[] arrayOfByte = Encoding.getUnicode().a(paramString);
      a((short)(arrayOfByte.length + 5));
      this.b = new byte[d()];
      System.arraycopy(zc.a(paramString.length()), 0, this.b, 2, 2);
      this.b[4] = 1;
      System.arraycopy(arrayOfByte, 0, this.b, 5, arrayOfByte.length);
    }
    System.arraycopy(zc.a(paramInt), 0, this.b, 0, 2);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbtb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */