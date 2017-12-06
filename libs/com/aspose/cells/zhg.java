package com.aspose.cells;

import com.aspose.cells.a.c.zl;
import com.aspose.cells.b.a.zs;

class zhg
  implements zaha
{
  private int a = -1;
  private int[] b;
  
  zhg(int[] paramArrayOfInt)
  {
    this.b = paramArrayOfInt;
  }
  
  public boolean a(zt paramzt, int paramInt)
  {
    this.a += 1;
    if (paramzt.h(paramInt) != 5)
    {
      if (zl.a())
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Invalid cell in array formula's range: ");
        CellsHelper.a(localStringBuilder, paramzt.i(), paramzt.a(paramInt));
        zl.a(zs.a(localStringBuilder));
      }
      return false;
    }
    this.b[this.a] = paramzt.j(paramInt);
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zhg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */