package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

public class ProtectedRangeCollection
  extends CollectionBase
{
  private Worksheet a;
  
  ProtectedRangeCollection(Worksheet sheet)
  {
    this.a = sheet;
  }
  
  public ProtectedRange get(int index)
  {
    return (ProtectedRange)this.InnerList.get(index);
  }
  
  public int add(String name, int startRow, int startColumn, int endRow, int endColumn)
  {
    if (name == null) {
      throw new CellsException(6, "Name of AllowEditRange cannot be null");
    }
    zamm.a(startRow, startColumn, endRow, endColumn);
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = startRow;
    localCellArea.StartColumn = startColumn;
    localCellArea.EndRow = endRow;
    localCellArea.EndColumn = endColumn;
    ProtectedRange localProtectedRange = new ProtectedRange(this, name, localCellArea);
    zf.a(this.InnerList, localProtectedRange);
    return getCount() - 1;
  }
  
  int a(ProtectedRange paramProtectedRange)
  {
    zf.a(this.InnerList, paramProtectedRange);
    return getCount() - 1;
  }
  
  int a(String paramString, ArrayList paramArrayList)
  {
    if (paramString == null) {
      throw new CellsException(6, "Name of AllowEditRange cannot be null");
    }
    ProtectedRange localProtectedRange = new ProtectedRange(this, paramString, paramArrayList);
    zf.a(this.InnerList, localProtectedRange);
    return getCount() - 1;
  }
  
  void a(ProtectedRangeCollection paramProtectedRangeCollection)
  {
    this.InnerList.clear();
    for (int i = 0; i < paramProtectedRangeCollection.getCount(); i++)
    {
      ProtectedRange localProtectedRange1 = paramProtectedRangeCollection.get(i);
      ProtectedRange localProtectedRange2 = new ProtectedRange(this);
      localProtectedRange2.a(localProtectedRange1);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ProtectedRangeCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */