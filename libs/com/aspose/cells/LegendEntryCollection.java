package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Iterator;

public class LegendEntryCollection
  extends CollectionBase
{
  private Chart a;
  
  LegendEntryCollection(Chart chart)
  {
    this.a = chart;
  }
  
  public LegendEntry get(int index)
  {
    LegendEntry localLegendEntry = a(index);
    if (localLegendEntry == null)
    {
      localLegendEntry = new LegendEntry(this.a.getLegend(), index);
      zf.a(this.InnerList, localLegendEntry);
    }
    return localLegendEntry;
  }
  
  LegendEntry a(int paramInt)
  {
    Iterator localIterator = this.InnerList.iterator();
    while (localIterator.hasNext())
    {
      LegendEntry localLegendEntry = (LegendEntry)localIterator.next();
      if (localLegendEntry.c() == paramInt) {
        return localLegendEntry;
      }
    }
    return null;
  }
  
  LegendEntry b(int paramInt)
  {
    return (LegendEntry)this.InnerList.get(paramInt);
  }
  
  void a(LegendEntryCollection paramLegendEntryCollection)
  {
    this.InnerList.clear();
    for (int i = 0; i < paramLegendEntryCollection.InnerList.size(); i++)
    {
      LegendEntry localLegendEntry1 = (LegendEntry)paramLegendEntryCollection.InnerList.get(i);
      LegendEntry localLegendEntry2 = new LegendEntry(this.a.getLegend(), localLegendEntry1.c());
      localLegendEntry2.a(localLegendEntry1);
      zf.a(this.InnerList, localLegendEntry2);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/LegendEntryCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */