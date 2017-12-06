package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

public class SmartTagSetting
  extends CollectionBase
{
  private Worksheet a;
  
  Worksheet a()
  {
    return this.a;
  }
  
  SmartTagSetting(Worksheet sheet)
  {
    this.a = sheet;
  }
  
  public int add(int row, int column)
  {
    for (int i = 0; i < getCount(); i++)
    {
      SmartTagCollection localSmartTagCollection2 = (SmartTagCollection)this.InnerList.get(i);
      if ((localSmartTagCollection2.getRow() == row) && (localSmartTagCollection2.getColumn() == column)) {
        return i;
      }
    }
    SmartTagCollection localSmartTagCollection1 = new SmartTagCollection(this, row, column);
    zf.a(this.InnerList, localSmartTagCollection1);
    return getCount() - 1;
  }
  
  public int add(String cellName)
  {
    int i = 0;
    int j = 0;
    int[] arrayOfInt1 = { i };
    int[] arrayOfInt2 = { j };
    CellsHelper.a(cellName, arrayOfInt1, arrayOfInt2);
    i = arrayOfInt1[0];
    j = arrayOfInt2[0];
    return add(i, j);
  }
  
  public SmartTagCollection get(int index)
  {
    return (SmartTagCollection)this.InnerList.get(index);
  }
  
  public SmartTagCollection get(int row, int column)
  {
    for (int i = 0; i < getCount(); i++)
    {
      SmartTagCollection localSmartTagCollection = (SmartTagCollection)this.InnerList.get(i);
      if ((localSmartTagCollection.getRow() == row) && (localSmartTagCollection.getColumn() == column)) {
        return localSmartTagCollection;
      }
    }
    return null;
  }
  
  public SmartTagCollection get(String cellName)
  {
    int i = 0;
    int j = 0;
    int[] arrayOfInt1 = { i };
    int[] arrayOfInt2 = { j };
    CellsHelper.a(cellName, arrayOfInt1, arrayOfInt2);
    i = arrayOfInt1[0];
    j = arrayOfInt2[0];
    return get(i, j);
  }
  
  void a(SmartTagSetting paramSmartTagSetting)
  {
    this.InnerList.clear();
    for (int i = 0; i < paramSmartTagSetting.InnerList.size(); i++)
    {
      SmartTagCollection localSmartTagCollection1 = (SmartTagCollection)paramSmartTagSetting.InnerList.get(i);
      SmartTagCollection localSmartTagCollection2 = new SmartTagCollection(this, localSmartTagCollection1.getRow(), localSmartTagCollection1.getColumn());
      zf.a(this.InnerList, localSmartTagCollection2);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/SmartTagSetting.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */