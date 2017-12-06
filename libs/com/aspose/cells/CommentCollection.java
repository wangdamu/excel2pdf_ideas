package com.aspose.cells;

import java.util.ArrayList;
import java.util.Collections;

public class CommentCollection
  extends CollectionBase
{
  private Comment a;
  private Worksheet b;
  
  CommentCollection(Worksheet sheet)
  {
    this.b = sheet;
    this.a = new Comment();
  }
  
  Worksheet a()
  {
    return this.b;
  }
  
  public int add(int row, int column)
  {
    zamm.a(row, column);
    int i = a(row, column);
    if (i > -1) {
      return i;
    }
    i = -i - 1;
    Comment localComment = new Comment(this, row, column);
    localComment.c();
    this.InnerList.add(i, localComment);
    this.b.getShapes().c(localComment.getCommentShape());
    return i;
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
    return add(i, j);
  }
  
  int a(String paramString)
  {
    int i = 0;
    int j = 0;
    int[] arrayOfInt1 = { i };
    int[] arrayOfInt2 = { j };
    CellsHelper.a(paramString, arrayOfInt1, arrayOfInt2);
    i = arrayOfInt1[0];
    j = arrayOfInt2[0];
    return add(i, j);
  }
  
  public Comment get(int index)
  {
    return (Comment)this.InnerList.get(index);
  }
  
  public Comment get(String cellName)
  {
    int i = 0;
    int j = 0;
    int[] arrayOfInt1 = { i };
    int[] arrayOfInt2 = { j };
    CellsHelper.a(cellName, arrayOfInt1, arrayOfInt2);
    i = arrayOfInt1[0];
    j = arrayOfInt2[0];
    int k = a(i, j);
    if (k < 0) {
      return null;
    }
    return (Comment)this.InnerList.get(k);
  }
  
  public Comment get(int row, int column)
  {
    zamm.a(row, column);
    int i = a(row, column);
    if (i < 0) {
      return null;
    }
    return (Comment)this.InnerList.get(i);
  }
  
  int a(int paramInt1, int paramInt2)
  {
    this.a.a(paramInt1);
    this.a.b(paramInt2);
    return Collections.binarySearch(this.InnerList, this.a, zamm.a());
  }
  
  void a(Comment paramComment)
  {
    int i = Collections.binarySearch(this.InnerList, paramComment, zamm.a());
    if (i < 0)
    {
      i = -i - 1;
      this.InnerList.add(i, paramComment);
    }
  }
  
  void a(CellArea paramCellArea, int paramInt1, int paramInt2)
  {
    int i = 0;
    for (int j = getCount() - 1; j > -1; j--)
    {
      Comment localComment = (Comment)this.InnerList.get(j);
      if (paramCellArea.a(localComment.getRow(), localComment.getColumn()))
      {
        int k = localComment.getRow();
        int m = localComment.getColumn();
        localComment.a(k + paramInt1);
        localComment.b(m + paramInt2);
        int n = localComment.getCommentShape().getUpperLeftRow() + paramInt1;
        n = n < 0 ? 0 : n;
        localComment.getCommentShape().setUpperLeftRow(n);
        n = localComment.getCommentShape().getUpperLeftColumn() + paramInt2;
        n = n < 0 ? 0 : n;
        localComment.getCommentShape().setUpperLeftColumn(n);
        i = 1;
      }
    }
    if (i != 0) {
      Collections.sort(this.InnerList, zamm.a());
    }
  }
  
  void b(Comment paramComment)
  {
    this.InnerList.remove(paramComment);
  }
  
  public void removeAt(String cellName)
  {
    int i = 0;
    int j = 0;
    int[] arrayOfInt1 = { i };
    int[] arrayOfInt2 = { j };
    CellsHelper.a(cellName, arrayOfInt1, arrayOfInt2);
    i = arrayOfInt1[0];
    j = arrayOfInt2[0];
    removeAt(i, j);
  }
  
  public void removeAt(int row, int column)
  {
    int i = a(row, column);
    if (i < 0) {
      return;
    }
    Comment localComment = (Comment)this.InnerList.get(i);
    this.InnerList.remove(i);
    ShapeCollection localShapeCollection = this.b.getShapes();
    localShapeCollection.d(localComment.getCommentShape().w());
  }
  
  void a(int paramInt)
  {
    this.InnerList.remove(paramInt);
  }
  
  void b()
  {
    this.InnerList.clear();
  }
  
  public void clear()
  {
    this.InnerList.clear();
    ShapeCollection localShapeCollection = this.b.getShapes();
    for (int i = localShapeCollection.getCount() - 1; i >= 0; i--) {
      if (localShapeCollection.get(i).getMsoDrawingType() == 25) {
        localShapeCollection.d(i);
      }
    }
  }
  
  void a(Range paramRange1, Range paramRange2, boolean paramBoolean, CopyOptions paramCopyOptions)
  {
    for (int i = getCount() - 1; i > -1; i--)
    {
      Comment localComment1 = get(i);
      if (paramRange2.a().a(localComment1.getRow(), localComment1.getColumn())) {
        a().getShapes().b(localComment1.getCommentShape());
      }
    }
    ArrayList localArrayList = paramRange1.getWorksheet().getComments().InnerList;
    if (localArrayList.size() < 1) {
      return;
    }
    if (paramRange1.getWorksheet().getComments() == this) {
      localArrayList = new ArrayList(localArrayList);
    }
    int j;
    int k;
    int m;
    if (paramBoolean)
    {
      j = paramRange1.a().StartRow;
      k = paramRange1.a().StartColumn;
      m = paramRange2.a().StartRow;
      int n = paramRange2.a().StartColumn;
      for (int i1 = localArrayList.size() - 1; i1 > -1; i1--)
      {
        Comment localComment3 = (Comment)localArrayList.get(i1);
        if (paramRange1.a().a(localComment3.getRow(), localComment3.getColumn())) {
          get(add(m + localComment3.getColumn() - k, n + localComment3.getRow() - j)).a(localComment3, paramCopyOptions);
        }
      }
    }
    else
    {
      j = paramRange2.a().StartRow - paramRange1.a().StartRow;
      k = paramRange2.a().StartColumn - paramRange1.a().StartColumn;
      for (m = localArrayList.size() - 1; m > -1; m--)
      {
        Comment localComment2 = (Comment)localArrayList.get(m);
        if (paramRange1.a().a(localComment2.getRow(), localComment2.getColumn())) {
          get(add(localComment2.getRow() + j, localComment2.getColumn() + k)).a(localComment2, paramCopyOptions);
        }
      }
    }
  }
  
  void a(CommentCollection paramCommentCollection, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt1 + paramInt3 - 1;
    int j = paramInt2 + paramInt3 - 1;
    for (int k = getCount() - 1; k > -1; k--)
    {
      Comment localComment1 = (Comment)this.InnerList.get(k);
      if ((localComment1.getColumn() >= paramInt2) && (localComment1.getColumn() <= j)) {
        this.b.getShapes().b(localComment1.getCommentShape());
      }
    }
    if (paramCommentCollection.getCount() < 1) {
      return;
    }
    ArrayList localArrayList = paramCommentCollection.InnerList;
    if (paramCommentCollection == this) {
      localArrayList = new ArrayList(localArrayList);
    }
    int m = paramInt2 - paramInt1;
    for (int n = localArrayList.size() - 1; n > -1; n--)
    {
      Comment localComment2 = (Comment)localArrayList.get(n);
      if ((localComment2.getColumn() >= paramInt1) && (localComment2.getColumn() <= i)) {
        get(add(localComment2.getRow(), localComment2.getColumn() + m)).b().a(localComment2.b(), null);
      }
    }
  }
  
  void b(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return;
    }
    for (int i = 0; i < getCount(); i++)
    {
      Comment localComment = get(i);
      if (paramInt1 <= localComment.getRow()) {
        if ((paramInt2 < 0) && (localComment.getRow() >= paramInt1) && (localComment.getRow() < paramInt1 - paramInt2))
        {
          removeAt(i);
          this.b.getShapes().b(localComment.getCommentShape());
          i--;
        }
        else
        {
          if (localComment.getRow() + paramInt2 > 1048575) {
            throw new CellsException(10, "Aspose.Cells cannot shift nonblank cell off the worksheet.");
          }
          localComment.a(localComment.getRow() + paramInt2);
          if (localComment.getCommentShape().getPlacement() == 0)
          {
            int j = localComment.getCommentShape().c(paramInt1, 0, paramInt2 < 0 ? paramInt1 - paramInt2 : paramInt1 + paramInt2, 0);
            if (paramInt2 < 0) {
              localComment.getCommentShape().setTopToCorner(localComment.getCommentShape().getTopToCorner() - j);
            } else {
              localComment.getCommentShape().setTopToCorner(localComment.getCommentShape().getTopToCorner() + j);
            }
          }
        }
      }
    }
  }
  
  void c(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return;
    }
    for (int i = 0; i < getCount(); i++)
    {
      Comment localComment = get(i);
      if (paramInt1 <= localComment.getColumn())
      {
        if ((paramInt2 < 0) && (paramInt1 - paramInt2 > localComment.getColumn()))
        {
          removeAt(i);
          this.b.getShapes().b(localComment.getCommentShape());
          i--;
        }
        if (localComment.getColumn() + paramInt2 > 16383) {
          throw new CellsException(10, "Aspose.Cells cannot shift nonblank cell off the worksheet.");
        }
        localComment.b(localComment.getColumn() + paramInt2);
        if (localComment.getCommentShape().getPlacement() == 0)
        {
          int j = localComment.getCommentShape().d(paramInt1, 0, paramInt2 < 0 ? paramInt1 - paramInt2 : paramInt1 + paramInt2, 0);
          if (paramInt2 < 0) {
            localComment.getCommentShape().setLeftToCorner(localComment.getCommentShape().getLeftToCorner() - j);
          } else {
            localComment.getCommentShape().setLeftToCorner(localComment.getCommentShape().getLeftToCorner() + j);
          }
        }
      }
    }
  }
  
  void b(CellArea paramCellArea, int paramInt1, int paramInt2)
  {
    switch (paramInt2)
    {
    case 0: 
      f(paramCellArea, paramInt1, paramInt2);
      break;
    case 3: 
      e(paramCellArea, paramInt1, paramInt2);
      break;
    case 4: 
      d(paramCellArea, paramInt1, paramInt2);
      break;
    case 1: 
      c(paramCellArea, paramInt1, paramInt2);
      break;
    }
  }
  
  private void c(CellArea paramCellArea, int paramInt1, int paramInt2)
  {
    for (int i = 0; i < getCount(); i++)
    {
      Comment localComment = get(i);
      int j = localComment.getRow();
      int k = localComment.getColumn();
      if ((j >= paramCellArea.StartRow) && (j <= paramCellArea.EndRow) && (k >= paramCellArea.StartColumn)) {
        if (k <= paramCellArea.EndColumn)
        {
          this.b.getShapes().b(localComment.getCommentShape());
          i--;
        }
        else
        {
          localComment.b(localComment.getColumn() - paramInt1);
          int m = localComment.getCommentShape().getUpperLeftColumn() - paramInt1;
          if (m < 0) {
            m = 0;
          }
          localComment.getCommentShape().setUpperLeftColumn(m);
        }
      }
    }
  }
  
  private void d(CellArea paramCellArea, int paramInt1, int paramInt2)
  {
    int i = 0;
    for (int j = 0; j < getCount(); j++)
    {
      Comment localComment = get(j);
      int k = localComment.getRow();
      int m = localComment.getColumn();
      if ((m >= paramCellArea.StartColumn) && (m <= paramCellArea.EndColumn) && (k >= paramCellArea.StartRow)) {
        if (k <= paramCellArea.EndRow)
        {
          this.b.getShapes().b(localComment.getCommentShape());
          j--;
        }
        else
        {
          localComment.a(k - paramInt1);
          int n = localComment.getCommentShape().getUpperLeftRow() - paramInt1;
          if (n < 0) {
            n = 0;
          }
          localComment.getCommentShape().setUpperLeftRow(n);
          i = 1;
        }
      }
    }
    if (i != 0) {
      Collections.sort(this.InnerList, zamm.a());
    }
  }
  
  private void e(CellArea paramCellArea, int paramInt1, int paramInt2)
  {
    for (int i = 0; i < getCount(); i++)
    {
      Comment localComment = get(i);
      if ((localComment.getRow() >= paramCellArea.StartRow) && (localComment.getRow() <= paramCellArea.EndRow) && (localComment.getColumn() >= paramCellArea.StartColumn))
      {
        localComment.b(localComment.getColumn() + paramInt1);
        if (localComment.getCommentShape().getPlacement() == 0)
        {
          int j = localComment.getCommentShape().d(paramCellArea.StartColumn, 0, paramCellArea.StartColumn + paramInt1, 0);
          localComment.getCommentShape().setLeftToCorner(localComment.getCommentShape().getLeftToCorner() + j);
        }
      }
    }
  }
  
  private void f(CellArea paramCellArea, int paramInt1, int paramInt2)
  {
    int i = 0;
    for (int j = 0; j < getCount(); j++)
    {
      Comment localComment = get(j);
      if ((localComment.getRow() >= paramCellArea.StartRow) && (localComment.getColumn() >= paramCellArea.StartColumn) && (localComment.getColumn() <= paramCellArea.EndColumn))
      {
        localComment.a(localComment.getRow() + paramInt1);
        if (localComment.getCommentShape().getPlacement() == 0)
        {
          int k = localComment.getCommentShape().c(paramCellArea.StartRow, 0, paramCellArea.StartRow + paramInt1, 0);
          localComment.getCommentShape().setTopToCorner(localComment.getCommentShape().getTopToCorner() + k);
        }
        i = 1;
      }
    }
    if (i != 0) {
      Collections.sort(this.InnerList, zamm.a());
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/CommentCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */