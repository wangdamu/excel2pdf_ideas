package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

class zbpr
  extends CollectionBase
{
  private Worksheet a;
  
  zbpr() {}
  
  zbpr(Worksheet paramWorksheet)
  {
    this.a = paramWorksheet;
  }
  
  Worksheet a()
  {
    return this.a;
  }
  
  public zbpo a(int paramInt)
  {
    return (zbpo)this.InnerList.get(paramInt);
  }
  
  int a(zbpo paramzbpo)
  {
    zf.a(this.InnerList, paramzbpo);
    return this.InnerList.size() - 1;
  }
  
  void b(zbpo paramzbpo)
  {
    for (int i = 0; i < getCount(); i++) {
      if (a(i) == paramzbpo)
      {
        removeAt(i);
        i--;
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbpr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */