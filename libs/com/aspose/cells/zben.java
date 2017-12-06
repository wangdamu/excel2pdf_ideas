package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zben
  extends zcd
{
  zben(ScenarioCollection paramScenarioCollection)
  {
    c(174);
    b(8);
    int i = 0;
    if ((paramScenarioCollection.c != null) && (paramScenarioCollection.c.size() > 0))
    {
      i = paramScenarioCollection.c.size();
      b(d() + (short)(8 * i));
    }
    this.b = new byte[d()];
    System.arraycopy(zc.a(paramScenarioCollection.getCount()), 0, this.b, 0, 2);
    System.arraycopy(zc.a(paramScenarioCollection.a), 0, this.b, 2, 2);
    System.arraycopy(zc.a(paramScenarioCollection.b), 0, this.b, 4, 2);
    System.arraycopy(zc.a(i), 0, this.b, 6, 2);
    int j = 8;
    if (i != 0) {
      for (int k = 0; k < i; k++)
      {
        CellArea localCellArea = (CellArea)paramScenarioCollection.c.get(k);
        System.arraycopy(zc.a(localCellArea.StartRow), 0, this.b, j + 0, 2);
        System.arraycopy(zc.a(localCellArea.EndRow), 0, this.b, j + 2, 2);
        System.arraycopy(zc.a(localCellArea.StartColumn), 0, this.b, j + 4, 2);
        System.arraycopy(zc.a(localCellArea.EndColumn), 0, this.b, j + 6, 2);
        j += 8;
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zben.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */