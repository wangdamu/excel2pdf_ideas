package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

public class HorizontalPageBreakCollection
  extends CollectionBase
{
  public HorizontalPageBreak get(int index)
  {
    return (HorizontalPageBreak)this.InnerList.get(index);
  }
  
  public HorizontalPageBreak get(String cellName)
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
      HorizontalPageBreak localHorizontalPageBreak = get(k);
      if ((localHorizontalPageBreak.getRow() == i) && (localHorizontalPageBreak.getStartColumn() <= j) && (localHorizontalPageBreak.getEndColumn() >= j)) {
        return localHorizontalPageBreak;
      }
    }
    return null;
  }
  
  public int add(int row, int startColumn, int endColumn)
  {
    if (this.InnerList.size() >= 1024) {
      throw new CellsException(10, "The count of HPageBreaks cannot be larger than 1024.");
    }
    HorizontalPageBreak localHorizontalPageBreak = null;
    int i = -1;
    for (int j = 0; j < getCount(); j++)
    {
      localHorizontalPageBreak = get(j);
      if (localHorizontalPageBreak.getRow() == row)
      {
        if (endColumn < localHorizontalPageBreak.getStartColumn())
        {
          i = j;
          break;
        }
        if (startColumn <= localHorizontalPageBreak.getEndColumn())
        {
          localHorizontalPageBreak.a(Math.min(startColumn, localHorizontalPageBreak.getStartColumn()));
          localHorizontalPageBreak.b(Math.max(endColumn, localHorizontalPageBreak.getEndColumn()));
          return j;
        }
      }
      else if (localHorizontalPageBreak.getRow() > row)
      {
        i = j;
        break;
      }
    }
    localHorizontalPageBreak = new HorizontalPageBreak(row);
    localHorizontalPageBreak.a(startColumn);
    localHorizontalPageBreak.b(endColumn);
    if (i != -1)
    {
      this.InnerList.add(i, localHorizontalPageBreak);
      return i;
    }
    zf.a(this.InnerList, localHorizontalPageBreak);
    return this.InnerList.size() - 1;
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3)
  {
    HorizontalPageBreak localHorizontalPageBreak = new HorizontalPageBreak(paramInt1);
    localHorizontalPageBreak.a(paramInt2);
    localHorizontalPageBreak.b(paramInt3);
    zf.a(this.InnerList, localHorizontalPageBreak);
  }
  
  void a(int paramInt1, int paramInt2)
  {
    a(paramInt1, 0, 16383);
  }
  
  public int add(int row)
  {
    return add(row, 0, 16383);
  }
  
  public int add(int row, int column)
  {
    return add(row, 0, 16383);
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
    return add(i, 0, 255);
  }
  
  void a(HorizontalPageBreakCollection paramHorizontalPageBreakCollection)
  {
    for (int i = 0; i < paramHorizontalPageBreakCollection.InnerList.size(); i++)
    {
      HorizontalPageBreak localHorizontalPageBreak = paramHorizontalPageBreakCollection.get(i);
      a(localHorizontalPageBreak.getRow(), localHorizontalPageBreak.getStartColumn(), localHorizontalPageBreak.getEndColumn());
    }
  }
  
  public void removeAt(int index)
  {
    HorizontalPageBreak localHorizontalPageBreak = (HorizontalPageBreak)this.InnerList.get(index);
    super.removeAt(index);
  }
  
  int a(int paramInt)
  {
    for (int i = 0; i < this.InnerList.size(); i++)
    {
      HorizontalPageBreak localHorizontalPageBreak = (HorizontalPageBreak)this.InnerList.get(i);
      if (localHorizontalPageBreak.getRow() == paramInt) {
        return i;
      }
    }
    return -1;
  }
  
  void b(int paramInt1, int paramInt2)
  {
    for (int i = 0; i < this.InnerList.size(); i++)
    {
      HorizontalPageBreak localHorizontalPageBreak = (HorizontalPageBreak)this.InnerList.get(i);
      if (localHorizontalPageBreak.getRow() >= paramInt1) {
        if (paramInt2 < 0)
        {
          if (paramInt1 - paramInt2 > localHorizontalPageBreak.getRow())
          {
            this.InnerList.remove(i--);
          }
          else
          {
            int j = localHorizontalPageBreak.getRow() + paramInt2;
            if (j < paramInt1) {
              j = paramInt1;
            }
            localHorizontalPageBreak.c(j);
          }
        }
        else {
          localHorizontalPageBreak.c(localHorizontalPageBreak.getRow() + paramInt2);
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/HorizontalPageBreakCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */