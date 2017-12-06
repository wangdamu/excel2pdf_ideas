package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

public class ReferredAreaCollection
  extends CollectionBase
{
  private boolean a = true;
  
  void a(ReferredArea paramReferredArea)
  {
    for (int i = 0; i < getCount(); i++) {
      if ((get(i) != null) && (get(i).a(paramReferredArea))) {
        return;
      }
    }
    zf.a(this.InnerList, paramReferredArea);
  }
  
  public ReferredArea get(int index)
  {
    return (ReferredArea)this.InnerList.get(index);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ReferredAreaCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */