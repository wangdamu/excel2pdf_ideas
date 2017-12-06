package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.HashMap;

class zauf
  extends CollectionBase
{
  private HashMap a = new HashMap();
  
  public zasl a(boolean paramBoolean, int paramInt)
  {
    String str = paramBoolean + "_" + paramInt;
    Object localObject = this.a.get(str);
    if (localObject == null)
    {
      zasl localzasl = new zasl(paramBoolean, paramInt);
      zf.a(this.InnerList, localzasl);
      localzasl.a("ro" + this.InnerList.size());
      this.a.put(str, localzasl);
      return localzasl;
    }
    return (zasl)localObject;
  }
  
  public zasl a(Cells paramCells)
  {
    return a(paramCells.isDefaultRowHeightMatched(), paramCells.n());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zauf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */