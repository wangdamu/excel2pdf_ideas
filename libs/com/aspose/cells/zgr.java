package com.aspose.cells;

import com.aspose.cells.b.a.zi;
import com.aspose.cells.b.a.zs;

final class zgr
  implements zi
{
  public int a;
  public int b;
  public int c;
  public int d;
  
  public zgr() {}
  
  public int compareTo(Object obj)
  {
    zgr localzgr = (zgr)obj;
    if (this.a > localzgr.a) {
      return 1;
    }
    if (this.a < localzgr.a) {
      return -1;
    }
    if (this.b > localzgr.b) {
      return 1;
    }
    if (this.b < localzgr.b) {
      return -1;
    }
    return 0;
  }
  
  public zgr(CellArea paramCellArea)
  {
    this.a = paramCellArea.StartRow;
    this.b = paramCellArea.StartColumn;
    this.c = paramCellArea.EndRow;
    this.d = paramCellArea.EndColumn;
  }
  
  public zgr(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.a);
    localStringBuilder.append(",");
    localStringBuilder.append(this.b);
    localStringBuilder.append(' ');
    localStringBuilder.append(this.c);
    localStringBuilder.append(",");
    localStringBuilder.append(this.d);
    return zs.a(localStringBuilder);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zgr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */