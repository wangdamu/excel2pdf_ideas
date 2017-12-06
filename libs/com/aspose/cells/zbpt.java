package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

class zbpt
  extends CollectionBase
{
  zbpp a;
  
  zbpt(zbpp paramzbpp)
  {
    this.a = paramzbpp;
  }
  
  ArrayList a()
  {
    zawp localzawp = this.a.a().W().a(this.a.i);
    if (localzawp != null)
    {
      ArrayList localArrayList = localzawp.i;
      int i = localArrayList.size();
      zbtv localzbtv = null;
      for (int j = 0; j < i; j++)
      {
        localzbtv = (zbtv)localArrayList.get(j);
        if (localzbtv.a.equals(this.a.g())) {
          return localzbtv.c;
        }
      }
    }
    return null;
  }
  
  public zbps a(int paramInt)
  {
    return (zbps)this.InnerList.get(paramInt);
  }
  
  public int getCount()
  {
    return this.InnerList.size();
  }
  
  int a(zbps paramzbps)
  {
    zf.a(this.InnerList, paramzbps);
    return this.InnerList.size() - 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbpt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */