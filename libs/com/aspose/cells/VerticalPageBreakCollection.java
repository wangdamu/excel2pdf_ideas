package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

public class VerticalPageBreakCollection
  extends CollectionBase
{
  public VerticalPageBreak get(int index)
  {
    return (VerticalPageBreak)this.InnerList.get(index);
  }
  
  public VerticalPageBreak get(String cellName)
  {
    int i = 0;
    int j = 0;
    int[] arrayOfInt1 = { i };
    int[] arrayOfInt2 = { j };
    CellsHelper.a(cellName, arrayOfInt1, arrayOfInt2);
    i = arrayOfInt1[0];
    j = arrayOfInt2[0];
    for (int k = 0; k < this.InnerList.size(); k++)
    {
      VerticalPageBreak localVerticalPageBreak = get(k);
      if ((localVerticalPageBreak.getColumn() == j) && (localVerticalPageBreak.getStartRow() <= i) && (localVerticalPageBreak.getEndRow() >= i)) {
        return localVerticalPageBreak;
      }
    }
    return null;
  }
  
  public int add(int startRow, int endRow, int column)
  {
    if (this.InnerList.size() >= 1024) {
      throw new CellsException(10, "The count of VPageBreaks cannot be larger than 1024.");
    }
    VerticalPageBreak localVerticalPageBreak = null;
    int i = -1;
    for (int j = 0; j < this.InnerList.size(); j++)
    {
      localVerticalPageBreak = get(j);
      if (localVerticalPageBreak.getColumn() == column)
      {
        if (endRow < localVerticalPageBreak.getStartRow())
        {
          i = j;
          break;
        }
        if (startRow <= localVerticalPageBreak.getEndRow())
        {
          localVerticalPageBreak.a(Math.min(startRow, localVerticalPageBreak.getStartRow()));
          localVerticalPageBreak.b(Math.max(endRow, localVerticalPageBreak.getEndRow()));
          return j;
        }
      }
      else if (localVerticalPageBreak.getColumn() > column)
      {
        i = j;
        break;
      }
    }
    localVerticalPageBreak = new VerticalPageBreak(column);
    localVerticalPageBreak.a(startRow);
    localVerticalPageBreak.b(endRow);
    if (i != -1)
    {
      this.InnerList.add(i, localVerticalPageBreak);
      return i;
    }
    zf.a(this.InnerList, localVerticalPageBreak);
    return this.InnerList.size() - 1;
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3)
  {
    VerticalPageBreak localVerticalPageBreak = new VerticalPageBreak(paramInt3);
    localVerticalPageBreak.a(paramInt1);
    localVerticalPageBreak.b(paramInt2);
    zf.a(this.InnerList, localVerticalPageBreak);
  }
  
  void a(int paramInt1, int paramInt2)
  {
    a(0, 1048575, paramInt2);
  }
  
  public int add(int column)
  {
    return add(0, 1048575, column);
  }
  
  public int add(int row, int column)
  {
    return add(0, 1048575, column);
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
    return add(0, 65535, j);
  }
  
  void a(VerticalPageBreakCollection paramVerticalPageBreakCollection)
  {
    for (int i = 0; i < paramVerticalPageBreakCollection.InnerList.size(); i++)
    {
      VerticalPageBreak localVerticalPageBreak = paramVerticalPageBreakCollection.get(i);
      a(localVerticalPageBreak.getStartRow(), localVerticalPageBreak.getEndRow(), localVerticalPageBreak.getColumn());
    }
  }
  
  public void removeAt(int index)
  {
    VerticalPageBreak localVerticalPageBreak = (VerticalPageBreak)this.InnerList.get(index);
    super.removeAt(index);
  }
  
  void b(int paramInt1, int paramInt2)
  {
    for (int i = 0; i < this.InnerList.size(); i++)
    {
      VerticalPageBreak localVerticalPageBreak = (VerticalPageBreak)this.InnerList.get(i);
      if (localVerticalPageBreak.getColumn() >= paramInt1) {
        if (paramInt2 < 0)
        {
          if (paramInt1 - paramInt2 > localVerticalPageBreak.getColumn())
          {
            this.InnerList.remove(i--);
          }
          else
          {
            int j = localVerticalPageBreak.getColumn() + paramInt2;
            if (j < paramInt1) {
              j = paramInt1;
            }
            localVerticalPageBreak.c(j);
          }
        }
        else {
          localVerticalPageBreak.c(localVerticalPageBreak.getColumn() + paramInt2);
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/VerticalPageBreakCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */