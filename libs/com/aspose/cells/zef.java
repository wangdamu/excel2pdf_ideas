package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zef
  extends zche
{
  zef(Scenario paramScenario)
    throws Exception
  {
    this.d = 502;
    int i = 10;
    i += 4 + (paramScenario.b == null ? 0 : paramScenario.b.length() * 2);
    i += 4 + (paramScenario.getComment() == null ? 0 : paramScenario.getComment().length() * 2);
    i += 4 + (paramScenario.getUser() == null ? 0 : paramScenario.getUser().length() * 2);
    this.c = new byte[i];
    int j = 0;
    System.arraycopy(zc.a(paramScenario.getInputCells().getCount()), 0, this.c, j, 2);
    j += 2;
    this.c[j] = ((byte)(paramScenario.isLocked() ? 1 : 0));
    j += 4;
    this.c[j] = ((byte)(paramScenario.isHidden() ? 1 : 0));
    j += 4;
    j = zcgj.a(this.c, j, paramScenario.b);
    j = zcgj.a(this.c, j, paramScenario.getComment());
    j = zcgj.a(this.c, j, paramScenario.getUser());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */