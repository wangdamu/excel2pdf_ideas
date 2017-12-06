package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcgs
  extends zche
{
  zcgs()
  {
    this.d = 151;
  }
  
  void a(PaneCollection paramPaneCollection, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.c = new byte[29];
    System.arraycopy(zc.a(paramPaneCollection.e()), 0, this.c, 0, 8);
    System.arraycopy(zc.a(paramPaneCollection.d()), 0, this.c, 8, 8);
    System.arraycopy(zc.a(paramPaneCollection.b()), 0, this.c, 16, 4);
    System.arraycopy(zc.a(paramPaneCollection.c()), 0, this.c, 20, 4);
    this.c[24] = paramPaneCollection.a();
    if (paramBoolean1)
    {
      byte[] tmp104_99 = this.c;
      tmp104_99[28] = ((byte)(tmp104_99[28] | 0x1));
      if (!paramBoolean2)
      {
        byte[] tmp120_115 = this.c;
        tmp120_115[28] = ((byte)(tmp120_115[28] | 0x2));
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcgs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */