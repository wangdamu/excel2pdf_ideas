package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

public class ErrorCheckOptionCollection
  extends CollectionBase
{
  Worksheet a;
  
  ErrorCheckOptionCollection(Worksheet sheet)
  {
    this.a = sheet;
  }
  
  public ErrorCheckOption get(int index)
  {
    return (ErrorCheckOption)this.InnerList.get(index);
  }
  
  public int add()
  {
    ErrorCheckOption localErrorCheckOption = new ErrorCheckOption();
    zf.a(this.InnerList, localErrorCheckOption);
    return this.InnerList.size() - 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ErrorCheckOptionCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */