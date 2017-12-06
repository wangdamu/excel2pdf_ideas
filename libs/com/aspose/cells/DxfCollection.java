package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Iterator;

public class DxfCollection
  extends CollectionBase
{
  private WorksheetCollection a;
  
  DxfCollection(WorksheetCollection sheets)
  {
    this.a = sheets;
  }
  
  void a()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      Worksheet localWorksheet = (Worksheet)localIterator.next();
      Object localObject;
      if (localWorksheet.r != null) {
        for (int i = 0; i < localWorksheet.getConditionalFormattings().getCount(); i++)
        {
          localObject = localWorksheet.getConditionalFormattings().get(i);
          for (int j = 0; j < ((FormatConditionCollection)localObject).getCount(); j++)
          {
            FormatCondition localFormatCondition = ((FormatConditionCollection)localObject).get(j);
            Style localStyle = localFormatCondition.f;
            if (localStyle != null) {
              localFormatCondition.a(a(localStyle));
            }
          }
        }
      }
      if (localWorksheet.hasAutofilter())
      {
        DataSorter localDataSorter = localWorksheet.getAutoFilter().c();
        if ((localDataSorter != null) && (localDataSorter.a().size() > 0))
        {
          localObject = localDataSorter.a().iterator();
          while (((Iterator)localObject).hasNext())
          {
            zrr localzrr = (zrr)((Iterator)localObject).next();
            switch (localzrr.d())
            {
            case 1: 
              if (localzrr.j() != null) {
                localzrr.d(a(localzrr.j()));
              }
              break;
            case 2: 
              if (localzrr.k() != null) {
                localzrr.d(a(localzrr.k()));
              }
              break;
            }
          }
        }
      }
    }
  }
  
  int a(Style paramStyle)
  {
    if (paramStyle.e() == this.a) {
      for (int i = 0; i < this.InnerList.size(); i++)
      {
        Style localStyle2 = (Style)this.InnerList.get(i);
        if ((paramStyle == localStyle2) || ((paramStyle.h() == localStyle2.h()) && (paramStyle.c(localStyle2)))) {
          return i;
        }
      }
    }
    Style localStyle1 = new Style(this.a);
    localStyle1.copy(paramStyle);
    zf.a(this.InnerList, localStyle1);
    return this.InnerList.size() - 1;
  }
  
  int b(Style paramStyle)
  {
    zf.a(this.InnerList, paramStyle);
    return getCount() - 1;
  }
  
  public Style get(int index)
  {
    return (Style)this.InnerList.get(index);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/DxfCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */