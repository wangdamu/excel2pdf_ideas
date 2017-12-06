package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

public class ProtectedRange
{
  private String b;
  private ArrayList c;
  private String d;
  private int e;
  private ProtectedRangeCollection f;
  private String g;
  byte[] a;
  
  ProtectedRange(ProtectedRangeCollection ranges)
  {
    this.f = ranges;
    this.c = new ArrayList();
  }
  
  ProtectedRange(ProtectedRangeCollection ranges, String name, CellArea cellArea)
  {
    this.f = ranges;
    this.b = name;
    this.c = new ArrayList();
    zf.a(this.c, cellArea);
  }
  
  ProtectedRange(ProtectedRangeCollection ranges, String name, ArrayList cellAreaList)
  {
    this.f = ranges;
    this.b = name;
    this.c = new ArrayList();
    zf.a(this.c, cellAreaList);
  }
  
  void a(ProtectedRange paramProtectedRange)
  {
    this.b = paramProtectedRange.b;
    this.d = paramProtectedRange.d;
    this.e = paramProtectedRange.e;
    this.g = paramProtectedRange.g;
    for (int i = 0; i < paramProtectedRange.c.size(); i++)
    {
      CellArea localCellArea1 = (CellArea)paramProtectedRange.c.get(i);
      CellArea localCellArea2 = new CellArea();
      localCellArea2.StartRow = localCellArea1.StartRow;
      localCellArea2.StartColumn = localCellArea1.StartColumn;
      localCellArea2.EndRow = localCellArea1.EndRow;
      localCellArea2.EndColumn = localCellArea1.EndColumn;
      zf.a(this.c, localCellArea2);
    }
  }
  
  public String getName()
  {
    return this.b;
  }
  
  public void setName(String value)
  {
    this.b = value;
  }
  
  public CellArea getCellArea()
  {
    return (CellArea)this.c.get(0);
  }
  
  public CellArea[] getAreas()
  {
    CellArea[] arrayOfCellArea = new CellArea[this.c.size()];
    zf.a(this.c, arrayOfCellArea);
    return arrayOfCellArea;
  }
  
  ArrayList a()
  {
    return this.c;
  }
  
  public void addArea(int startRow, int startColumn, int endRow, int endColumn)
  {
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = startRow;
    localCellArea.StartColumn = startColumn;
    localCellArea.EndRow = endRow;
    localCellArea.EndColumn = endColumn;
    zf.a(this.c, localCellArea);
  }
  
  void a(CellArea paramCellArea)
  {
    zf.a(this.c, paramCellArea);
  }
  
  public String getPassword()
  {
    return this.d;
  }
  
  public void setPassword(String value)
  {
    this.d = value;
    if ((value != null) && (!"".equals(value))) {
      this.e = zui.a(value);
    } else {
      this.e = 0;
    }
  }
  
  int b()
  {
    return this.e;
  }
  
  void a(int paramInt)
  {
    this.e = paramInt;
  }
  
  public String getSecurityDescriptor()
  {
    return this.g;
  }
  
  public void setSecurityDescriptor(String value)
  {
    this.g = value;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ProtectedRange.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */