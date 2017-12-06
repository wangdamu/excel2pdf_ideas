package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

public class PivotFormatConditionCollection
  extends CollectionBase
{
  Worksheet a;
  PivotTable b;
  
  PivotFormatConditionCollection(PivotTable table, Worksheet sheet)
  {
    this.b = table;
    this.a = sheet;
  }
  
  int a()
  {
    zf.a(this.InnerList, new PivotFormatCondition(this, false));
    return getCount() - 1;
  }
  
  public int add()
  {
    zf.a(this.InnerList, new PivotFormatCondition(this, true));
    return getCount() - 1;
  }
  
  public PivotFormatCondition get(int index)
  {
    return (PivotFormatCondition)this.InnerList.get(index);
  }
  
  void a(PivotFormatConditionCollection paramPivotFormatConditionCollection)
  {
    for (int i = 0; i < paramPivotFormatConditionCollection.getCount(); i++)
    {
      PivotFormatCondition localPivotFormatCondition = new PivotFormatCondition(this, false);
      localPivotFormatCondition.a(paramPivotFormatConditionCollection.get(i));
      zf.a(this.InnerList, localPivotFormatCondition);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/PivotFormatConditionCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */