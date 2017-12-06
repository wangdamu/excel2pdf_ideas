package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

class zbpq
  extends CollectionBase
{
  WorksheetCollection a;
  
  zbpq(WorksheetCollection paramWorksheetCollection)
  {
    this.a = paramWorksheetCollection;
  }
  
  WorksheetCollection a()
  {
    return this.a;
  }
  
  int a(zbpp paramzbpp)
  {
    zf.a(this.InnerList, paramzbpp);
    return this.InnerList.size() - 1;
  }
  
  public zbpp a(int paramInt)
  {
    return (zbpp)this.InnerList.get(paramInt);
  }
  
  public void b(zbpp paramzbpp)
  {
    zbpp localzbpp = null;
    for (int i = 0; i < getCount(); i++)
    {
      localzbpp = a(i);
      if (localzbpp == paramzbpp)
      {
        localzbpp.k();
        removeAt(i);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbpq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */