package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbyx
  extends zcd
{
  zbyx()
  {
    c(574);
    b(18);
    this.b = new byte[18];
  }
  
  private void a(int paramInt)
  {
    if (paramInt > 65535) {
      paramInt = 65535;
    }
    System.arraycopy(zc.a(paramInt), 0, this.b, 2, 2);
  }
  
  private void d(int paramInt)
  {
    this.b[4] = ((byte)paramInt);
  }
  
  void a(Worksheet paramWorksheet)
  {
    System.arraycopy(zc.a(paramWorksheet.h()), 0, this.b, 0, 2);
    if (paramWorksheet.isPageBreakPreview())
    {
      int tmp29_28 = 1;
      byte[] tmp29_25 = this.b;
      tmp29_25[tmp29_28] = ((byte)(tmp29_25[tmp29_28] | 0x8));
    }
    a(paramWorksheet.getFirstVisibleRow());
    d(paramWorksheet.getFirstVisibleColumn());
    int i = paramWorksheet.B();
    if (i == -1) {
      this.b[6] = 64;
    } else {
      this.b[6] = ((byte)i);
    }
    System.arraycopy(zc.a(paramWorksheet.y()[1]), 0, this.b, 10, 2);
    System.arraycopy(zc.a(paramWorksheet.y()[0]), 0, this.b, 12, 2);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbyx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */