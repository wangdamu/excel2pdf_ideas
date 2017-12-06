package com.aspose.cells;

import com.aspose.cells.a.f.zi;
import com.aspose.cells.b.a.d.zm;

class zqr
{
  zm a = null;
  zi b = null;
  
  void a(zm paramzm)
    throws Exception
  {
    long l = paramzm.h();
    if (l > 2147483647L) {
      throw new CellsException(10, "File Size is too large to process...");
    }
    int i = (int)l;
    this.a = CustomImplementationFactory.a.a(i);
    byte[] arrayOfByte = new byte['Ѐ'];
    int j;
    do
    {
      j = paramzm.a(arrayOfByte, 0, arrayOfByte.length);
      this.a.b(arrayOfByte, 0, j);
    } while (j > 0);
    this.a.b(0L);
    this.b = zi.a(this.a);
  }
  
  void a()
    throws Exception
  {
    this.b.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zqr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */