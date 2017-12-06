package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

public class QueryTableCollection
  extends CollectionBase
{
  int a(QueryTable paramQueryTable)
  {
    zf.a(this.InnerList, paramQueryTable);
    return this.InnerList.size() - 1;
  }
  
  public QueryTable get(int index)
  {
    return (QueryTable)this.InnerList.get(index);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/QueryTableCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */