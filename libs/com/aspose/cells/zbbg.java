package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zbbg
  extends zcd
{
  public zbbg()
  {
    c(2152);
  }
  
  void a(ProtectedRange paramProtectedRange)
    throws Exception
  {
    a((short)(27 + paramProtectedRange.a().size() * 8 + 8 + 3 + paramProtectedRange.getName().length() * 2));
    if (paramProtectedRange.a != null) {
      b(d() + (short)paramProtectedRange.a.length);
    }
    this.b = new byte[d()];
    this.b[0] = 104;
    this.b[1] = 8;
    this.b[12] = 2;
    int i = 19;
    System.arraycopy(zc.a(paramProtectedRange.a().size()), 0, this.b, i, 2);
    i += 8;
    for (int j = 0; j < paramProtectedRange.a().size(); j++)
    {
      CellArea localCellArea = (CellArea)paramProtectedRange.a().get(j);
      System.arraycopy(zc.a(localCellArea.StartRow), 0, this.b, i, 2);
      System.arraycopy(zc.a(localCellArea.EndRow), 0, this.b, i + 2, 2);
      System.arraycopy(zc.a(localCellArea.StartColumn), 0, this.b, i + 4, 2);
      System.arraycopy(zc.a(localCellArea.EndColumn), 0, this.b, i + 6, 2);
      i += 8;
    }
    if (paramProtectedRange.a != null) {
      this.b[i] = 1;
    }
    i += 4;
    System.arraycopy(zc.a(paramProtectedRange.b()), 0, this.b, i, 2);
    i += 4;
    System.arraycopy(zc.a(paramProtectedRange.getName().length()), 0, this.b, i, 2);
    this.b[(i + 2)] = 1;
    i += 3;
    System.arraycopy(Encoding.getUnicode().a(paramProtectedRange.getName()), 0, this.b, i, paramProtectedRange.getName().length() * 2);
    i += paramProtectedRange.getName().length() * 2;
    if (paramProtectedRange.a != null) {
      System.arraycopy(paramProtectedRange.a, 0, this.b, i, paramProtectedRange.a.length);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbbg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */