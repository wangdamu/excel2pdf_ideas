package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

public class PivotPageFields
{
  private ArrayList a = new ArrayList();
  private ArrayList b = new ArrayList();
  
  public void addPageField(String[] pageItems)
  {
    if (this.a.size() == 4) {
      return;
    }
    zf.a(this.a, pageItems);
  }
  
  public int getPageFieldCount()
  {
    return this.a.size();
  }
  
  public void addIdentify(int rangeIndex, int[] pageItemIndex)
  {
    this.b.add(rangeIndex, pageItemIndex);
  }
  
  ArrayList a()
  {
    return this.a;
  }
  
  ArrayList b()
  {
    return this.b;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/PivotPageFields.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */