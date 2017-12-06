package com.aspose.cells.a.d;

import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;

public class zcq
  implements zbx
{
  private zh a;
  
  public byte[] a()
  {
    if (this.a == null) {
      return null;
    }
    if (this.a.i_() != this.a.m().length)
    {
      byte[] arrayOfByte = this.a.o();
      this.a = new zh(arrayOfByte, 0, arrayOfByte.length, true, true);
    }
    return this.a.m();
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    this.a = new zh(paramArrayOfByte, 0, paramArrayOfByte.length, true, true);
  }
  
  public zm b()
  {
    this.a.a(0);
    return this.a;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zcq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */