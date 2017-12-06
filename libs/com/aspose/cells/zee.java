package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zee
  extends zche
{
  zee(ScenarioCollection paramScenarioCollection)
  {
    this.d = 500;
    int i = 8 + (paramScenarioCollection.c == null ? 0 : paramScenarioCollection.c.size() * 16);
    this.c = new byte[i];
    System.arraycopy(zc.a(paramScenarioCollection.a), 0, this.c, 0, 2);
    System.arraycopy(zc.a(paramScenarioCollection.b), 0, this.c, 2, 2);
    int j = 4;
    zcgj.a(paramScenarioCollection.c, this.c, j);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */