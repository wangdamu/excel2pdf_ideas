package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zavx
  extends zcd
{
  zavx()
  {
    c(239);
  }
  
  void a(zavw paramzavw, zrg paramzrg)
    throws Exception
  {
    int i = 6 + paramzavw.c.size() * 8;
    if (i > 8224)
    {
      this.b = new byte['․'];
    }
    else
    {
      a((short)i);
      this.b = new byte[i + 4];
    }
    this.b[0] = ((byte)f());
    int j = 4;
    System.arraycopy(zc.a(paramzavw.b), 0, this.b, j, 2);
    this.b[(j + 2)] = paramzavw.a;
    j += 4;
    System.arraycopy(zc.a(paramzavw.c.size()), 0, this.b, j, 2);
    j += 2;
    for (int k = 0; k < paramzavw.c.size(); k++)
    {
      if (j + 8 > this.b.length)
      {
        System.arraycopy(zc.a(j - 4), 0, this.b, 2, 2);
        paramzrg.a(this.b, j);
        this.b[0] = 60;
        j = 4;
      }
      CellArea localCellArea = (CellArea)paramzavw.c.get(k);
      System.arraycopy(zc.a(localCellArea.StartRow), 0, this.b, j, 2);
      System.arraycopy(zc.a(localCellArea.EndRow), 0, this.b, j + 2, 2);
      System.arraycopy(zc.a(localCellArea.StartColumn), 0, this.b, j + 4, 2);
      System.arraycopy(zc.a(localCellArea.EndColumn), 0, this.b, j + 6, 2);
      j += 8;
    }
    System.arraycopy(zc.a(j - 4), 0, this.b, 2, 2);
    paramzrg.a(this.b, j);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zavx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */