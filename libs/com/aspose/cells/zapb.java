package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zapb
  extends zcd
{
  zapb(zapd paramzapd)
  {
    c(229);
    a((short)(paramzapd.getCount() * 8 + 2));
    this.b = new byte[d()];
    System.arraycopy(zc.a((short)paramzapd.getCount()), 0, this.b, 0, 2);
    for (int i = 0; i < paramzapd.getCount(); i++)
    {
      CellArea localCellArea = paramzapd.a(i);
      System.arraycopy(zc.a(localCellArea.StartRow), 0, this.b, 8 * i + 2, 2);
      System.arraycopy(zc.a(localCellArea.EndRow), 0, this.b, 8 * i + 4, 2);
      this.b[(8 * i + 6)] = ((byte)localCellArea.StartColumn);
      this.b[(8 * i + 8)] = ((byte)localCellArea.EndColumn);
    }
  }
  
  zapb(zapd paramzapd, int paramInt1, int paramInt2)
  {
    c(229);
    a((short)((paramInt2 - paramInt1) * 8 + 2));
    this.b = new byte[d()];
    System.arraycopy(zc.a((short)(paramInt2 - paramInt1)), 0, this.b, 0, 2);
    for (int i = paramInt1; i < paramInt2; i++)
    {
      CellArea localCellArea = paramzapd.a(i);
      System.arraycopy(zc.a(localCellArea.StartRow), 0, this.b, 8 * (i - paramInt1) + 2, 2);
      System.arraycopy(zc.a(localCellArea.EndRow), 0, this.b, 8 * (i - paramInt1) + 4, 2);
      this.b[(8 * (i - paramInt1) + 6)] = ((byte)localCellArea.StartColumn);
      this.b[(8 * (i - paramInt1) + 8)] = ((byte)localCellArea.EndColumn);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zapb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */