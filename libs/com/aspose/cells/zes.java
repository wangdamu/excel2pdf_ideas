package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zes
  extends zche
{
  zes(ScenarioInputCell paramScenarioInputCell)
    throws Exception
  {
    this.d = 504;
    int i = 22 + (paramScenarioInputCell.c == null ? 0 : paramScenarioInputCell.c.length() * 2);
    this.c = new byte[i];
    int j = 0;
    System.arraycopy(zc.a(paramScenarioInputCell.a), 0, this.c, j, 4);
    j += 4;
    System.arraycopy(zc.a(paramScenarioInputCell.b), 0, this.c, j, 4);
    j += 4;
    j += 8;
    System.arraycopy(zc.a(paramScenarioInputCell.d), 0, this.c, j, 2);
    j += 2;
    j = zcgj.a(this.c, j, paramScenarioInputCell.c);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */