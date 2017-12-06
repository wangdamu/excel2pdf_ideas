package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

public class SmartTagCollection
  extends CollectionBase
{
  private SmartTagSetting a;
  private int b;
  private int c;
  
  SmartTagSetting a()
  {
    return this.a;
  }
  
  SmartTagCollection(SmartTagSetting tagsCollection, int row, int column)
  {
    this.a = tagsCollection;
    this.b = row;
    this.c = column;
  }
  
  public int getRow()
  {
    return this.b;
  }
  
  public int getColumn()
  {
    return this.c;
  }
  
  public SmartTag get(int index)
  {
    return (SmartTag)this.InnerList.get(index);
  }
  
  public int add(String uri, String name)
  {
    int i = this.a.a().c().aa().a(uri, name);
    zbqf localzbqf = this.a.a().c().aa().a(i);
    SmartTag localSmartTag = new SmartTag(this);
    localSmartTag.a(localzbqf);
    zf.a(this.InnerList, localSmartTag);
    return getCount() - 1;
  }
  
  int a(SmartTag paramSmartTag)
  {
    zf.a(this.InnerList, paramSmartTag);
    return getCount() - 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/SmartTagCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */