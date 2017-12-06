package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zbqk
  extends zcd
{
  zbqk()
  {
    c(2197);
  }
  
  void a(DataSorter paramDataSorter, CellArea paramCellArea)
  {
    b(38);
    this.b = new byte[d()];
    this.b[0] = -107;
    this.b[1] = 8;
    if (paramDataSorter.getSortLeftToRight())
    {
      byte[] tmp45_40 = this.b;
      tmp45_40[12] = ((byte)(tmp45_40[12] | 0x1));
    }
    if (paramDataSorter.getCaseSensitive())
    {
      byte[] tmp64_59 = this.b;
      tmp64_59[12] = ((byte)(tmp64_59[12] | 0x2));
    }
    if ((paramDataSorter.b != null) && (!"".equals(paramDataSorter.b)))
    {
      byte[] tmp95_90 = this.b;
      tmp95_90[12] = ((byte)(tmp95_90[12] | 0x4));
    }
    int i = 0;
    if ((paramDataSorter.c() instanceof AutoFilter)) {
      i = 2;
    }
    byte[] tmp121_116 = this.b;
    tmp121_116[12] = ((byte)(tmp121_116[12] | (byte)((i & 0xFF) << 3)));
    System.arraycopy(zc.a(paramCellArea.StartRow), 0, this.b, 14, 4);
    System.arraycopy(zc.a(paramCellArea.EndRow), 0, this.b, 18, 4);
    System.arraycopy(zc.a(paramCellArea.StartColumn), 0, this.b, 22, 4);
    System.arraycopy(zc.a(paramCellArea.EndColumn), 0, this.b, 26, 4);
    System.arraycopy(zc.a(paramDataSorter.a().size()), 0, this.b, 30, 4);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbqk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */