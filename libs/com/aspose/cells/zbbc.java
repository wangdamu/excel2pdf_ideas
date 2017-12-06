package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbbc
  extends zcd
{
  zbbc()
  {
    c(2138);
  }
  
  void a(int paramInt1, int paramInt2)
  {
    if ((paramInt1 != -1) && (paramInt2 != -1))
    {
      b(16);
      this.b = new byte[] { 90, 8, 0, 0, 9, 0, 2, 0, 1, 0, 0, 0, 1, 0, 0, 0 };
      System.arraycopy(zc.a(paramInt1), 0, this.b, 10, 2);
      System.arraycopy(zc.a(paramInt2), 0, this.b, 14, 2);
    }
    else
    {
      int i = paramInt1 == -1 ? paramInt2 : paramInt1;
      b(12);
      this.b = new byte[] { 90, 8, 0, 0, 9, 0, 1, 0, 1, 0, 5, 0 };
      System.arraycopy(zc.a(i), 0, this.b, 10, 2);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbbc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */