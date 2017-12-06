package com.aspose.cells;

import com.aspose.cells.a.c.zy;
import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.HashMap;

public class ListObjectCollection
  extends CollectionBase
{
  private Worksheet b;
  zajn a;
  
  ListObjectCollection(Worksheet sheet)
  {
    this.b = sheet;
    this.a = new zbvi(this);
  }
  
  void a()
  {
    if (getCount() < 1) {
      return;
    }
    this.a = new zbvj(this);
    for (int i = getCount() - 1; i > -1; i--) {
      ((ListObject)this.InnerList.get(i)).C();
    }
  }
  
  void b()
  {
    this.a = new zbvi(this);
  }
  
  Style a(int paramInt1, int paramInt2)
  {
    ListObject localListObject = c(paramInt1, paramInt2);
    if (localListObject != null) {
      return localListObject.d(paramInt1, paramInt2);
    }
    return null;
  }
  
  String a(String paramString)
  {
    while (zbvl.a(this.b.c(), paramString) != null)
    {
      this.b.c().e += 1;
      paramString = "Table" + this.b.c().e;
    }
    return paramString;
  }
  
  void a(ListObjectCollection paramListObjectCollection, CopyOptions paramCopyOptions)
  {
    clear();
    int i = (paramListObjectCollection.b.c() != this.b.c()) && (!paramCopyOptions.a()) ? 1 : 0;
    for (int j = 0; j < paramListObjectCollection.getCount(); j++)
    {
      ListObject localListObject1 = paramListObjectCollection.get(j);
      this.b.c().e += 1;
      String str = "Table" + this.b.c().e;
      if ((i != 0) && (zbvl.a(this.b.c(), localListObject1.o()) == null)) {
        str = localListObject1.o();
      }
      if (i == 0) {
        str = a(str);
      }
      ListObject localListObject2 = new ListObject(this, str, this.b.c().e);
      localListObject2.a(localListObject1, paramCopyOptions);
      a(localListObject2);
      paramCopyOptions.b(localListObject1.a(), localListObject2.a());
    }
  }
  
  void a(ListObjectCollection paramListObjectCollection, CellArea paramCellArea1, CellArea paramCellArea2, CopyOptions paramCopyOptions)
  {
    int i = getCount();
    ListObject localListObject1;
    int k;
    int m;
    int n;
    int i1;
    for (int j = i - 1; j >= 0; j--)
    {
      localListObject1 = get(j);
      k = localListObject1.getStartRow();
      m = localListObject1.getStartColumn();
      n = localListObject1.getEndRow();
      i1 = localListObject1.getEndColumn();
      if ((paramCellArea2.StartRow <= k) && (paramCellArea2.StartColumn <= m) && (paramCellArea2.EndRow >= n - 1) && (paramCellArea2.EndColumn >= i1)) {
        removeAt(j);
      }
    }
    i = paramListObjectCollection.getCount();
    for (j = 0; j < i; j++)
    {
      localListObject1 = paramListObjectCollection.get(j);
      k = localListObject1.getStartRow();
      m = localListObject1.getStartColumn();
      n = localListObject1.getEndRow();
      i1 = localListObject1.getEndColumn();
      if ((paramCellArea1.StartRow <= k) && (paramCellArea1.StartColumn <= m) && (paramCellArea1.EndRow >= n - 1) && (paramCellArea1.EndColumn >= i1))
      {
        this.b.c().e += 1;
        ListObject localListObject2 = new ListObject(this, "Table" + this.b.c().e, this.b.c().e);
        localListObject2.a(localListObject1, paramCopyOptions);
        int i2 = n - k;
        int i3 = i1 - m;
        localListObject2.a(paramCellArea2.StartRow + localListObject1.getStartRow() - paramCellArea1.StartRow);
        localListObject2.b(paramCellArea2.StartColumn + localListObject1.getStartColumn() - paramCellArea1.StartColumn);
        localListObject2.c(localListObject2.getStartRow() + i2);
        localListObject2.d(localListObject2.getStartColumn() + i3);
        a(localListObject2);
        paramCopyOptions.b(localListObject1.a(), localListObject2.a());
      }
    }
  }
  
  int b(int paramInt1, int paramInt2)
  {
    for (int i = getCount() - 1; i > -1; i--)
    {
      ListObject localListObject = (ListObject)this.InnerList.get(i);
      if ((paramInt1 >= localListObject.getStartRow()) && (paramInt1 <= localListObject.getEndRow()) && (paramInt2 >= localListObject.getStartColumn()) && (paramInt2 <= localListObject.getEndColumn())) {
        return i;
      }
    }
    return -1;
  }
  
  ListObject c(int paramInt1, int paramInt2)
  {
    for (int i = 0; i < getCount(); i++)
    {
      ListObject localListObject = (ListObject)this.InnerList.get(i);
      if ((paramInt1 >= localListObject.getStartRow()) && (paramInt1 <= localListObject.getEndRow()) && (paramInt2 >= localListObject.getStartColumn()) && (paramInt2 <= localListObject.getEndColumn())) {
        return localListObject;
      }
    }
    return null;
  }
  
  public ListObject get(int index)
  {
    return (ListObject)this.InnerList.get(index);
  }
  
  public ListObject get(String tableName)
  {
    for (int i = 0; i < this.InnerList.size(); i++)
    {
      ListObject localListObject = (ListObject)this.InnerList.get(i);
      if (zy.a(localListObject.b(), tableName)) {
        return localListObject;
      }
    }
    return null;
  }
  
  public int add(int startRow, int startColumn, int endRow, int endColumn, boolean hasHeaders)
  {
    this.b.c().e += 1;
    ListObject localListObject = new ListObject(this, "Table" + this.b.c().e, this.b.c().e);
    localListObject.a(startRow, startColumn, endRow, endColumn, hasHeaders);
    a(localListObject);
    return getCount() - 1;
  }
  
  public int add(String startCell, String endCell, boolean hasHeaders)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int[] arrayOfInt1 = { i };
    int[] arrayOfInt2 = { k };
    CellsHelper.a(startCell, arrayOfInt1, arrayOfInt2);
    i = arrayOfInt1[0];
    k = arrayOfInt2[0];
    int[] arrayOfInt3 = { j };
    int[] arrayOfInt4 = { m };
    CellsHelper.a(endCell, arrayOfInt3, arrayOfInt4);
    j = arrayOfInt3[0];
    m = arrayOfInt4[0];
    this.b.c().e += 1;
    ListObject localListObject = new ListObject(this, "Table" + this.b.c().e, this.b.c().e);
    localListObject.a(i, k, j, m, hasHeaders);
    a(localListObject);
    return getCount() - 1;
  }
  
  int c()
  {
    this.b.c().e += 1;
    ListObject localListObject = new ListObject(this, "Table" + this.b.c().e, this.b.c().e);
    a(localListObject);
    return getCount() - 1;
  }
  
  void d(int paramInt1, int paramInt2)
  {
    for (int i = 0; i < getCount(); i++) {
      if (get(i).b(paramInt1, paramInt2)) {
        removeAt(i--);
      }
    }
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    for (int i = 0; i < getCount(); i++)
    {
      ListObject localListObject = get(i);
      if ((localListObject.getStartRow() >= paramInt1) && (localListObject.getEndRow() <= paramInt3) && (localListObject.getStartColumn() >= paramInt2) && (localListObject.getEndColumn() <= paramInt4)) {
        removeAt(i--);
      }
    }
  }
  
  void a(CellArea paramCellArea, int paramInt1, int paramInt2)
  {
    for (int i = 0; i < getCount(); i++) {
      if (get(i).a(paramCellArea, paramInt1, paramInt2)) {
        removeAt(i--);
      }
    }
  }
  
  boolean b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    for (int i = 0; i < getCount(); i++) {
      if (!get(i).a(paramInt1, paramInt2, paramInt3, paramInt4)) {
        return false;
      }
    }
    return true;
  }
  
  void e(int paramInt1, int paramInt2)
  {
    for (int i = 0; i < getCount(); i++) {
      if (get(i).a(paramInt1, paramInt2)) {
        removeAt(i--);
      }
    }
  }
  
  int a(ListObject paramListObject)
  {
    if (paramListObject.o() != null) {
      d().c().i.put(paramListObject.o().toUpperCase(), paramListObject);
    }
    zf.a(this.InnerList, paramListObject);
    return getCount() - 1;
  }
  
  ListObject a(int paramInt)
  {
    for (int i = 0; i < getCount(); i++) {
      if (get(i).a() == paramInt) {
        return get(i);
      }
    }
    return null;
  }
  
  void f(int paramInt1, int paramInt2) {}
  
  Worksheet d()
  {
    return this.b;
  }
  
  boolean g(int paramInt1, int paramInt2)
  {
    for (int i = 0; i < getCount(); i++)
    {
      ListObject localListObject = get(i);
      if ((localListObject.A()) && (paramInt1 == localListObject.getAutoFilter().i().StartRow) && (paramInt2 >= localListObject.getAutoFilter().i().StartColumn) && (paramInt2 <= localListObject.getAutoFilter().i().EndColumn)) {
        return true;
      }
    }
    return false;
  }
  
  void e()
  {
    for (int i = 0; i < getCount(); i++) {
      get(i).B();
    }
  }
  
  public void updateColumnName()
  {
    for (int i = 0; i < getCount(); i++) {
      get(i).updateColumnName();
    }
  }
  
  void b(ListObject paramListObject)
  {
    this.InnerList.remove(paramListObject);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ListObjectCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */