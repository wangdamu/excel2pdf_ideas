package com.aspose.cells.a.d.a.a;

import com.aspose.cells.a.d.a.zb;
import com.aspose.cells.a.d.a.zg;
import java.io.IOException;

public class zal
  extends zg
{
  private String b = "";
  
  public zal()
  {
    super(70, 1);
  }
  
  public void a(int paramInt, zb paramzb)
    throws IOException
  {
    byte[] arrayOfByte = this.b.getBytes();
    paramzb.b(arrayOfByte.length);
    paramzb.b(arrayOfByte);
    if (arrayOfByte.length % 4 != 0) {
      for (int i = 0; i < 4 - arrayOfByte.length % 4; i++) {
        paramzb.g(0);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/a/a/zal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */