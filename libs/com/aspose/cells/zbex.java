package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zbex
  extends zcd
{
  zbex()
  {
    c(29);
  }
  
  void a(zbev paramzbev)
  {
    a((short)(9 + 6 * paramzbev.b().size()));
    this.b = new byte[d()];
    this.b[0] = paramzbev.a();
    System.arraycopy(zc.a(paramzbev.c()), 0, this.b, 1, 2);
    System.arraycopy(zc.a(paramzbev.d()), 0, this.b, 3, 2);
    System.arraycopy(zc.a(paramzbev.e()), 0, this.b, 5, 2);
    ArrayList localArrayList = paramzbev.b();
    System.arraycopy(zc.a(localArrayList.size()), 0, this.b, 7, 2);
    int i = 9;
    for (int j = 0; j < localArrayList.size(); j++)
    {
      CellArea localCellArea = (CellArea)localArrayList.get(j);
      System.arraycopy(zc.a(localCellArea.StartRow), 0, this.b, i, 2);
      System.arraycopy(zc.a(localCellArea.EndRow), 0, this.b, i + 2, 2);
      this.b[(i + 4)] = ((byte)localCellArea.StartColumn);
      this.b[(i + 5)] = ((byte)localCellArea.EndColumn);
      i += 6;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbex.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */