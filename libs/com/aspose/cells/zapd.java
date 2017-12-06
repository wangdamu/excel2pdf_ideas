package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;

class zapd
  extends CollectionBase
{
  public CellArea a(int paramInt)
  {
    return (CellArea)this.InnerList.get(paramInt);
  }
  
  void a(CellArea paramCellArea)
  {
    zf.a(this.InnerList, paramCellArea);
  }
  
  void a(int paramInt, CellArea paramCellArea)
  {
    this.InnerList.set(paramInt, paramCellArea);
  }
  
  void a(int paramInt1, int paramInt2)
  {
    if (this.InnerList.size() != 0) {
      for (int i = 0; i < this.InnerList.size(); i++)
      {
        CellArea localCellArea = (CellArea)this.InnerList.get(i);
        int j = 0;
        boolean[] arrayOfBoolean = { j };
        localCellArea = zban.a(localCellArea, paramInt1, paramInt2, arrayOfBoolean);
        j = arrayOfBoolean[0];
        if ((j != 0) || (localCellArea.c()))
        {
          this.InnerList.remove(i);
          i--;
        }
        else
        {
          this.InnerList.set(i, localCellArea);
        }
      }
    }
  }
  
  void b(int paramInt1, int paramInt2)
  {
    if (this.InnerList.size() != 0) {
      for (int i = 0; i < this.InnerList.size(); i++)
      {
        CellArea localCellArea = (CellArea)this.InnerList.get(i);
        int j = 0;
        boolean[] arrayOfBoolean = { j };
        localCellArea = zban.b(localCellArea, paramInt1, paramInt2, arrayOfBoolean);
        j = arrayOfBoolean[0];
        if ((j != 0) || (localCellArea.c()))
        {
          this.InnerList.remove(i);
          i--;
        }
        else
        {
          this.InnerList.set(i, localCellArea);
        }
      }
    }
  }
  
  boolean c(int paramInt1, int paramInt2)
  {
    for (int i = 0; i < this.InnerList.size(); i++)
    {
      CellArea localCellArea = (CellArea)this.InnerList.get(i);
      if ((localCellArea.StartRow <= paramInt1) && (localCellArea.EndRow >= paramInt1) && (localCellArea.StartColumn <= paramInt2) && (localCellArea.EndColumn >= paramInt2)) {
        return true;
      }
    }
    return false;
  }
  
  public Range a(Cells paramCells, int paramInt1, int paramInt2)
  {
    for (int i = 0; i < this.InnerList.size(); i++)
    {
      CellArea localCellArea = (CellArea)this.InnerList.get(i);
      if ((localCellArea.StartRow <= paramInt1) && (localCellArea.EndRow >= paramInt1) && (localCellArea.StartColumn <= paramInt2) && (localCellArea.EndColumn >= paramInt2)) {
        return paramCells.createRange(localCellArea.StartRow, localCellArea.StartColumn, localCellArea.EndRow - localCellArea.StartRow + 1, localCellArea.EndColumn - localCellArea.StartColumn + 1);
      }
    }
    return null;
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt3 == 0) || (paramInt4 == 0)) {
      throw new IllegalArgumentException("Row number or column number cannot be zero");
    }
    zamm.a(paramInt1, paramInt2, paramInt1 + paramInt3 - 1, paramInt2 + paramInt4 - 1);
    CellArea localCellArea;
    if ((paramInt3 == 1) && (paramInt4 == 1))
    {
      for (i = 0; i < this.InnerList.size(); i++)
      {
        localCellArea = (CellArea)this.InnerList.get(i);
        if ((localCellArea.StartRow <= paramInt1) && (localCellArea.EndRow >= paramInt1) && (localCellArea.StartColumn <= paramInt2) && (localCellArea.EndColumn >= paramInt2))
        {
          this.InnerList.remove(i);
          return;
        }
      }
      return;
    }
    for (int i = 0; i < this.InnerList.size(); i++)
    {
      localCellArea = (CellArea)this.InnerList.get(i);
      if ((localCellArea.StartRow == paramInt1) && (localCellArea.EndRow == paramInt1 + paramInt3 - 1) && (localCellArea.StartColumn == paramInt2) && (localCellArea.EndColumn == paramInt2 + paramInt4 - 1))
      {
        this.InnerList.remove(i);
        return;
      }
    }
  }
  
  public void a(Cells paramCells, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt3 == 0) || (paramInt4 == 0)) {
      throw new IllegalArgumentException("Row number or column number cannot be zero");
    }
    zamm.a(paramInt1, paramInt2, paramInt1 + paramInt3 - 1, paramInt2 + paramInt4 - 1);
    if ((paramInt4 == 1) && (paramInt3 == 1)) {
      return;
    }
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = paramInt1;
    localCellArea.StartColumn = paramInt2;
    localCellArea.EndRow = (paramInt1 + paramInt3 - 1);
    localCellArea.EndColumn = (paramInt2 + paramInt4 - 1);
    Object localObject3;
    for (int i = 0; i < this.InnerList.size(); i++)
    {
      localObject1 = (CellArea)this.InnerList.get(i);
      Object localObject2 = zban.e(localCellArea, (CellArea)localObject1);
      if (localObject2 != null)
      {
        localObject3 = (CellArea)localObject2;
        if ((((CellArea)localObject3).StartRow == ((CellArea)localObject1).StartRow) && (((CellArea)localObject3).StartColumn == ((CellArea)localObject1).StartColumn) && (((CellArea)localObject3).EndRow == ((CellArea)localObject1).EndRow) && (((CellArea)localObject3).EndColumn == ((CellArea)localObject1).EndColumn))
        {
          this.InnerList.remove(i--);
        }
        else
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Cells in range ");
          CellsHelper.a(localStringBuilder, localCellArea.StartRow, localCellArea.StartColumn, localCellArea.EndRow, localCellArea.EndColumn);
          localStringBuilder.append(" cannot be merged because cells in range ");
          CellsHelper.a(localStringBuilder, ((CellArea)localObject1).StartRow, ((CellArea)localObject1).StartColumn, ((CellArea)localObject1).EndRow, ((CellArea)localObject1).EndColumn);
          localStringBuilder.append(" have already been merged.");
          throw new CellsException(10, zs.a(localStringBuilder));
        }
      }
    }
    i = 0;
    Object localObject1 = paramCells.a(paramInt1, paramInt2, false);
    for (int j = paramInt1; j < paramInt1 + paramInt3; j++)
    {
      localObject3 = paramCells.getRows().a(j, true, false, false);
      if (localObject3 != null) {
        for (int k = paramInt2; k < paramInt2 + paramInt4; k++)
        {
          Cell localCell = ((Row)localObject3).getCellOrNull(k);
          if ((localCell != null) && (localCell.c.c != 0))
          {
            if (i == 0)
            {
              if (localCell != localObject1)
              {
                switch (localCell.c.c)
                {
                case 1: 
                case 6: 
                  ((Cell)localObject1).a(localCell.c.c, localCell.c.d, true);
                  break;
                case 4: 
                  ((Cell)localObject1).d(localCell, null);
                  break;
                }
                ((Cell)localObject1).b(localCell.r());
              }
              i = 1;
            }
            if ((j != paramInt1) || (k != paramInt2)) {
              localCell.putValue((String)null);
            }
          }
        }
      }
    }
    zf.a(this.InnerList, localCellArea);
  }
  
  public void a(Cells paramCells, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramInt3 == 0) || (paramInt4 == 0)) {
      throw new IllegalArgumentException("Row number or column number cannot be zero");
    }
    zamm.a(paramInt1, paramInt2, paramInt1 + paramInt3 - 1, paramInt2 + paramInt4 - 1);
    CellArea localCellArea1 = new CellArea();
    localCellArea1.StartRow = paramInt1;
    localCellArea1.StartColumn = paramInt2;
    localCellArea1.EndRow = (paramInt1 + paramInt3 - 1);
    localCellArea1.EndColumn = (paramInt2 + paramInt4 - 1);
    Object localObject1;
    Object localObject2;
    if (paramBoolean1) {
      for (i = 0; i < this.InnerList.size(); i++)
      {
        CellArea localCellArea2 = (CellArea)this.InnerList.get(i);
        localObject1 = zban.e(localCellArea1, localCellArea2);
        if (localObject1 != null)
        {
          CellArea localCellArea3 = (CellArea)localObject1;
          if ((localCellArea3.StartRow == localCellArea2.StartRow) && (localCellArea3.StartColumn == localCellArea2.StartColumn) && (localCellArea3.EndRow == localCellArea2.EndRow) && (localCellArea3.EndColumn == localCellArea2.EndColumn))
          {
            this.InnerList.remove(i--);
          }
          else if (paramBoolean2)
          {
            if (localCellArea1.StartRow > localCellArea2.StartRow) {
              localCellArea1.StartRow = localCellArea2.StartRow;
            }
            if (localCellArea1.StartColumn > localCellArea2.StartColumn) {
              localCellArea1.StartColumn = localCellArea2.StartColumn;
            }
            if (localCellArea1.EndColumn < localCellArea2.EndColumn) {
              localCellArea1.EndColumn = localCellArea2.EndColumn;
            }
            if (localCellArea1.EndRow < localCellArea2.EndRow) {
              localCellArea1.EndRow = localCellArea2.EndRow;
            }
            this.InnerList.remove(i--);
          }
          else
          {
            localObject2 = new StringBuilder();
            ((StringBuilder)localObject2).append("Cells in range ");
            CellsHelper.a((StringBuilder)localObject2, localCellArea1.StartRow, localCellArea1.StartColumn, localCellArea1.EndRow, localCellArea1.EndColumn);
            ((StringBuilder)localObject2).append(" cannot be merged because cells in range ");
            CellsHelper.a((StringBuilder)localObject2, localCellArea2.StartRow, localCellArea2.StartColumn, localCellArea2.EndRow, localCellArea2.EndColumn);
            ((StringBuilder)localObject2).append(" have already been merged.");
            throw new CellsException(10, zs.a(localObject2));
          }
        }
      }
    }
    int i = 0;
    for (int j = paramInt1; j < paramInt1 + paramInt3; j++)
    {
      localObject1 = paramCells.getRows().a(j, true, false, false);
      if (localObject1 != null) {
        for (int k = paramInt2; k < paramInt2 + paramInt4; k++)
        {
          localObject2 = ((Row)localObject1).getCellOrNull(k);
          if ((localObject2 != null) && (((Cell)localObject2).c.c != 0))
          {
            if (i == 0)
            {
              if ((j != paramInt1) || (k != paramInt2))
              {
                Cell localCell = paramCells.a(paramInt1, paramInt2, false);
                switch (((Cell)localObject2).c.c)
                {
                case 1: 
                case 6: 
                  localCell.a(((Cell)localObject2).c.c, ((Cell)localObject2).c.d, true);
                  break;
                case 4: 
                  localCell.d((Cell)localObject2, null);
                  break;
                }
                localCell.b(((Cell)localObject2).r());
              }
              i = 1;
            }
            if ((j != paramInt1) || (k != paramInt2)) {
              ((Cell)localObject2).putValue((String)null);
            }
          }
        }
      }
    }
    zf.a(this.InnerList, localCellArea1);
  }
  
  ArrayList a()
  {
    ArrayList localArrayList = new ArrayList();
    zf.a(localArrayList, this.InnerList);
    return localArrayList;
  }
  
  void b()
  {
    for (int i = this.InnerList.size() - 1; i >= 0; i--)
    {
      CellArea localCellArea = (CellArea)this.InnerList.get(i);
      if ((localCellArea.StartRow > 65535) || (localCellArea.StartColumn > 255))
      {
        this.InnerList.remove(i);
      }
      else if (localCellArea.EndRow > 65535)
      {
        localCellArea.EndRow = 65535;
        if (localCellArea.EndColumn > 255) {
          localCellArea.EndColumn = 255;
        }
        this.InnerList.set(i, localCellArea);
      }
      else if (localCellArea.EndColumn > 255)
      {
        localCellArea.EndColumn = 255;
        this.InnerList.set(i, localCellArea);
      }
    }
  }
  
  void a(CellArea paramCellArea, int paramInt)
  {
    for (int i = 0; i < this.InnerList.size(); i++)
    {
      CellArea localCellArea = (CellArea)this.InnerList.get(i);
      if (localCellArea.StartColumn > paramCellArea.EndColumn)
      {
        if ((localCellArea.StartRow >= paramCellArea.StartRow) && (localCellArea.EndRow <= paramCellArea.EndRow))
        {
          localCellArea.StartColumn -= paramInt;
          localCellArea.EndColumn -= paramInt;
          this.InnerList.set(i, localCellArea);
        }
      }
      else if ((localCellArea.StartRow >= paramCellArea.StartRow) && (localCellArea.EndRow <= paramCellArea.EndRow) && (localCellArea.StartColumn >= paramCellArea.StartColumn) && (localCellArea.EndColumn <= paramCellArea.EndColumn))
      {
        this.InnerList.remove(i);
        i--;
      }
    }
  }
  
  void b(CellArea paramCellArea, int paramInt)
  {
    for (int i = 0; i < this.InnerList.size(); i++)
    {
      CellArea localCellArea = (CellArea)this.InnerList.get(i);
      if (localCellArea.StartRow > paramCellArea.EndRow)
      {
        if ((localCellArea.StartColumn >= paramCellArea.StartColumn) && (localCellArea.EndColumn <= paramCellArea.EndColumn))
        {
          localCellArea.StartRow -= paramInt;
          localCellArea.EndRow -= paramInt;
          this.InnerList.set(i, localCellArea);
        }
      }
      else if ((localCellArea.StartRow >= paramCellArea.StartRow) && (localCellArea.EndRow <= paramCellArea.EndRow) && (localCellArea.StartColumn >= paramCellArea.StartColumn) && (localCellArea.EndColumn <= paramCellArea.EndColumn))
      {
        this.InnerList.remove(i);
        i--;
      }
    }
  }
  
  void c(CellArea paramCellArea, int paramInt)
  {
    for (int i = 0; i < this.InnerList.size(); i++)
    {
      CellArea localCellArea = (CellArea)this.InnerList.get(i);
      if ((paramCellArea.StartColumn <= localCellArea.StartColumn) && (localCellArea.StartRow >= paramCellArea.StartRow) && (localCellArea.EndRow <= paramCellArea.EndRow))
      {
        localCellArea.StartColumn += paramInt;
        localCellArea.EndColumn += paramInt;
        this.InnerList.set(i, localCellArea);
      }
    }
  }
  
  void d(CellArea paramCellArea, int paramInt)
  {
    for (int i = 0; i < this.InnerList.size(); i++)
    {
      CellArea localCellArea = (CellArea)this.InnerList.get(i);
      if ((paramCellArea.StartRow <= localCellArea.StartRow) && (localCellArea.StartColumn >= paramCellArea.StartColumn) && (localCellArea.EndColumn <= paramCellArea.EndColumn))
      {
        localCellArea.StartRow += paramInt;
        localCellArea.EndRow += paramInt;
        this.InnerList.set(i, localCellArea);
      }
    }
  }
  
  void a(zapd paramzapd, int paramInt1, int paramInt2, int paramInt3)
  {
    for (int i = 0; i < paramzapd.getCount(); i++)
    {
      CellArea localCellArea1 = paramzapd.a(i);
      if ((localCellArea1.StartColumn >= paramInt1) && (localCellArea1.EndColumn <= paramInt1 + paramInt3 - 1))
      {
        CellArea localCellArea2 = new CellArea();
        localCellArea2.StartRow = localCellArea1.StartRow;
        localCellArea2.EndRow = localCellArea1.EndRow;
        localCellArea2.StartColumn = (paramInt2 + localCellArea1.StartColumn - paramInt1);
        localCellArea2.EndColumn = (localCellArea2.StartColumn + localCellArea1.EndColumn - localCellArea1.StartColumn);
        zf.a(this.InnerList, localCellArea2);
      }
    }
  }
  
  void a(zapd paramzapd)
  {
    for (int i = 0; i < paramzapd.getCount(); i++)
    {
      CellArea localCellArea1 = paramzapd.a(i);
      CellArea localCellArea2 = CellArea.d(localCellArea1);
      zf.a(this.InnerList, localCellArea2);
    }
  }
  
  void b(zapd paramzapd, int paramInt1, int paramInt2, int paramInt3)
  {
    for (int i = getCount() - 1; i >= 0; i--)
    {
      CellArea localCellArea1 = a(i);
      if ((localCellArea1.StartRow >= paramInt2) && (localCellArea1.EndRow < paramInt2 + paramInt3)) {
        this.InnerList.remove(localCellArea1);
      }
    }
    i = paramzapd.getCount();
    for (int j = 0; j < i; j++)
    {
      CellArea localCellArea2 = paramzapd.a(j);
      if ((localCellArea2.StartRow >= paramInt1) && (localCellArea2.EndRow < paramInt1 + paramInt3))
      {
        CellArea localCellArea3 = new CellArea();
        int k = localCellArea2.StartRow - paramInt1;
        int m = localCellArea2.EndRow - localCellArea2.StartRow;
        localCellArea3.StartRow = (paramInt2 + k);
        localCellArea3.EndRow = (localCellArea3.StartRow + m);
        localCellArea3.StartColumn = localCellArea2.StartColumn;
        localCellArea3.EndColumn = localCellArea2.EndColumn;
        zf.a(this.InnerList, localCellArea3);
      }
    }
  }
  
  void a(CellArea paramCellArea, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    for (int i = 0; i < getCount(); i++)
    {
      CellArea localCellArea = a(i);
      if ((paramCellArea.StartRow <= localCellArea.StartRow) && (paramCellArea.EndRow >= localCellArea.EndRow) && (paramCellArea.StartColumn <= localCellArea.StartColumn) && (paramCellArea.EndColumn >= localCellArea.EndColumn))
      {
        localCellArea.StartRow += paramInt3 - paramCellArea.StartRow;
        localCellArea.EndRow += paramInt3 - paramCellArea.StartRow;
        localCellArea.StartColumn += paramInt4 - paramCellArea.StartColumn;
        localCellArea.EndColumn += paramInt4 - paramCellArea.StartColumn;
        this.InnerList.set(i, localCellArea);
      }
      else if ((paramInt3 <= localCellArea.StartRow) && (paramInt3 + paramInt1 - 1 >= localCellArea.EndRow) && (paramInt4 <= localCellArea.StartColumn) && (paramInt4 + paramInt2 - 1 >= localCellArea.EndColumn))
      {
        this.InnerList.remove(i--);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zapd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */