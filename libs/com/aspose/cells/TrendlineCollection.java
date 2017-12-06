package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

public class TrendlineCollection
  extends CollectionBase
{
  private Series a;
  
  TrendlineCollection(Series parent)
  {
    this.a = parent;
  }
  
  public int add(int type)
  {
    Trendline localTrendline = new Trendline(this.a, type);
    zf.a(this.InnerList, localTrendline);
    return getCount() - 1;
  }
  
  int a(int paramInt)
  {
    Trendline localTrendline = new Trendline(this.a, paramInt);
    localTrendline.p(this.a.i().e().q++);
    zf.a(this.InnerList, localTrendline);
    return getCount() - 1;
  }
  
  public int add(int type, String name)
  {
    if ((name == null) || ("".equals(name))) {
      return add(type);
    }
    if (name.length() > 255) {
      throw new IllegalArgumentException("Too long name.");
    }
    Trendline localTrendline = new Trendline(this.a, type, name);
    localTrendline.p(this.a.i().e().q++);
    zf.a(this.InnerList, localTrendline);
    return getCount() - 1;
  }
  
  public Trendline get(int index)
  {
    return (Trendline)this.InnerList.get(index);
  }
  
  void a(Trendline paramTrendline)
  {
    zf.a(this.InnerList, paramTrendline);
  }
  
  void a(TrendlineCollection paramTrendlineCollection, CopyOptions paramCopyOptions)
  {
    for (int i = 0; i < paramTrendlineCollection.getCount(); i++)
    {
      Trendline localTrendline = new Trendline(this.a, paramTrendlineCollection.get(i).getType(), paramTrendlineCollection.get(i).getName());
      zf.a(this.InnerList, localTrendline);
      localTrendline.a(paramTrendlineCollection.get(i), paramCopyOptions);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/TrendlineCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */