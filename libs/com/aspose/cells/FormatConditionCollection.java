package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;
import java.util.Iterator;

public class FormatConditionCollection
{
  ConditionalFormattingCollection a;
  private ArrayList f;
  ArrayList b;
  boolean c;
  boolean d = false;
  Worksheet e;
  
  FormatConditionCollection(ConditionalFormattingCollection cfs)
  {
    this.a = cfs;
    this.b = new ArrayList(4);
    this.f = new ArrayList(3);
    this.c = false;
    this.e = cfs.a;
  }
  
  FormatConditionCollection(Worksheet sheet)
  {
    this.b = new ArrayList(4);
    this.f = new ArrayList(3);
    this.c = false;
    this.e = sheet;
  }
  
  ArrayList a()
  {
    return this.f;
  }
  
  void a(FormatConditionCollection paramFormatConditionCollection, CopyOptions paramCopyOptions)
  {
    this.c = paramFormatConditionCollection.c;
    this.b = new ArrayList(paramFormatConditionCollection.b.size());
    this.f = new ArrayList(paramFormatConditionCollection.getCount());
    this.d = paramFormatConditionCollection.d;
    for (int i = 0; i < paramFormatConditionCollection.getCount(); i++)
    {
      FormatCondition localFormatCondition = new FormatCondition(this);
      localFormatCondition.a(paramFormatConditionCollection.get(i), paramCopyOptions);
      zf.a(this.f, localFormatCondition);
    }
  }
  
  void a(FormatConditionCollection paramFormatConditionCollection, CellArea paramCellArea, CopyOptions paramCopyOptions)
  {
    this.c = paramFormatConditionCollection.c;
    this.b = new ArrayList(paramFormatConditionCollection.b.size());
    this.f = new ArrayList(paramFormatConditionCollection.getCount());
    this.d = paramFormatConditionCollection.d;
    zf.a(this.b, paramCellArea);
    for (int i = 0; i < paramFormatConditionCollection.getCount(); i++)
    {
      FormatCondition localFormatCondition = new FormatCondition(this);
      localFormatCondition.a(paramFormatConditionCollection.get(i), paramCopyOptions);
      zf.a(this.f, localFormatCondition);
    }
  }
  
  void a(FormatConditionCollection paramFormatConditionCollection, ArrayList paramArrayList, CopyOptions paramCopyOptions)
  {
    this.c = paramFormatConditionCollection.c;
    this.b = new ArrayList(paramFormatConditionCollection.b.size());
    this.f = new ArrayList(paramFormatConditionCollection.getCount());
    this.d = paramFormatConditionCollection.d;
    this.b = paramArrayList;
    for (int i = 0; i < paramFormatConditionCollection.getCount(); i++)
    {
      FormatCondition localFormatCondition = new FormatCondition(this);
      localFormatCondition.a(paramFormatConditionCollection.get(i), paramCopyOptions);
      zf.a(this.f, localFormatCondition);
    }
  }
  
  void b()
  {
    FormatConditionCollection localFormatConditionCollection = new FormatConditionCollection(this.a);
    localFormatConditionCollection.b = this.b;
    localFormatConditionCollection.d = this.d;
    localFormatConditionCollection.c = this.c;
    for (int i = 0; i < getCount(); i++)
    {
      FormatCondition localFormatCondition = new FormatCondition(localFormatConditionCollection);
      if (get(i).a(false))
      {
        localFormatCondition = get(i);
        zf.a(localFormatConditionCollection.f, localFormatCondition);
        this.f.remove(i);
        i--;
      }
    }
    this.e.getConditionalFormattings().a(localFormatConditionCollection);
  }
  
  boolean a(boolean paramBoolean)
  {
    return b(paramBoolean) != 0;
  }
  
  int b(boolean paramBoolean)
  {
    int i = 0;
    Iterator localIterator = this.f.iterator();
    while (localIterator.hasNext())
    {
      FormatCondition localFormatCondition = (FormatCondition)localIterator.next();
      if (localFormatCondition.a(paramBoolean)) {
        i++;
      }
    }
    return i;
  }
  
  void b(FormatConditionCollection paramFormatConditionCollection, CopyOptions paramCopyOptions)
  {
    this.c = paramFormatConditionCollection.c;
    this.b = new ArrayList(paramFormatConditionCollection.b.size());
    this.f = new ArrayList(paramFormatConditionCollection.getCount());
    this.d = paramFormatConditionCollection.d;
    Iterator localIterator = paramFormatConditionCollection.b.iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      localObject = (CellArea)localIterator.next();
      CellArea localCellArea = new CellArea();
      localCellArea.StartRow = ((CellArea)localObject).StartRow;
      localCellArea.StartColumn = ((CellArea)localObject).StartColumn;
      localCellArea.EndRow = ((CellArea)localObject).EndRow;
      localCellArea.EndColumn = ((CellArea)localObject).EndColumn;
      zf.a(this.b, localCellArea);
    }
    for (int i = 0; i < paramFormatConditionCollection.getCount(); i++)
    {
      localObject = new FormatCondition(this);
      ((FormatCondition)localObject).a(paramFormatConditionCollection.get(i), paramCopyOptions);
      zf.a(this.f, localObject);
    }
  }
  
  public int[] add(CellArea cellArea, int type, int operatorType, String formula1, String formula2)
  {
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = addCondition(type, operatorType, formula1, formula2);
    arrayOfInt[1] = zf.a(this.b, cellArea);
    return arrayOfInt;
  }
  
  public int addArea(CellArea cellArea)
  {
    int i = zf.a(this.b, cellArea);
    if (i == 0) {
      for (int j = 0; j < a().size(); j++) {
        ((FormatCondition)a().get(j)).f();
      }
    }
    return i;
  }
  
  public int addCondition(int type, int operatorType, String formula1, String formula2)
  {
    FormatCondition localFormatCondition = new FormatCondition(this);
    localFormatCondition.setType(type);
    localFormatCondition.setOperator(operatorType);
    localFormatCondition.setFormula1(formula1);
    localFormatCondition.setFormula2(formula2);
    zf.a(this.f, localFormatCondition);
    localFormatCondition.setPriority(this.e.f());
    this.e.a(this.e.f() + 1);
    return this.f.size() - 1;
  }
  
  public int addCondition(int type)
  {
    FormatCondition localFormatCondition = new FormatCondition(this);
    localFormatCondition.setType(type);
    localFormatCondition.setPriority(this.e.f());
    this.e.a(this.e.f() + 1);
    return zf.a(this.f, localFormatCondition);
  }
  
  int a(FormatCondition paramFormatCondition)
  {
    return zf.a(this.f, paramFormatCondition);
  }
  
  public int getCount()
  {
    return this.f.size();
  }
  
  public int getRangeCount()
  {
    return this.b.size();
  }
  
  public FormatCondition get(int index)
  {
    if ((index < 0) || (index >= getCount())) {
      throw new IllegalArgumentException("Invalid formatting condition index : " + index);
    }
    return (FormatCondition)this.f.get(index);
  }
  
  public CellArea getCellArea(int index)
  {
    a(index);
    return (CellArea)this.b.get(index);
  }
  
  public void removeArea(int index)
  {
    a(index);
    this.b.remove(index);
  }
  
  public boolean removeArea(int startRow, int startColumn, int totalRows, int totalColumns)
  {
    if ((this.b == null) || (this.b.size() == 0)) {
      return true;
    }
    CellArea localCellArea1 = new CellArea();
    localCellArea1.StartRow = startRow;
    localCellArea1.StartColumn = startColumn;
    localCellArea1.EndRow = (startRow + totalRows - 1);
    localCellArea1.EndColumn = (startColumn + totalColumns - 1);
    for (int i = this.b.size() - 1; i >= 0; i--)
    {
      CellArea localCellArea2 = (CellArea)this.b.get(i);
      int j = 0;
      boolean[] arrayOfBoolean = { j };
      CellArea localCellArea3 = a(localCellArea1, localCellArea2, arrayOfBoolean);
      j = arrayOfBoolean[0];
      if (j == 0)
      {
        CellArea localCellArea4;
        if (localCellArea3.StartRow > localCellArea2.StartRow)
        {
          localCellArea4 = new CellArea();
          localCellArea4.StartRow = localCellArea2.StartRow;
          localCellArea4.EndRow = (localCellArea3.StartRow - 1);
          localCellArea4.StartColumn = localCellArea2.StartColumn;
          localCellArea4.EndColumn = localCellArea2.EndColumn;
          zf.a(this.b, localCellArea4);
        }
        if (localCellArea3.EndRow < localCellArea2.EndRow)
        {
          localCellArea4 = new CellArea();
          localCellArea4.StartRow = (localCellArea3.EndRow + 1);
          localCellArea4.EndRow = localCellArea2.EndRow;
          localCellArea4.StartColumn = localCellArea2.StartColumn;
          localCellArea4.EndColumn = localCellArea2.EndColumn;
          zf.a(this.b, localCellArea4);
        }
        localCellArea2.StartRow = localCellArea3.StartRow;
        localCellArea2.EndRow = localCellArea3.EndRow;
        if (localCellArea3.StartColumn > localCellArea2.StartColumn)
        {
          localCellArea4 = new CellArea();
          localCellArea4.StartRow = localCellArea2.StartRow;
          localCellArea4.EndRow = localCellArea2.EndRow;
          localCellArea4.StartColumn = localCellArea2.StartColumn;
          localCellArea4.EndColumn = (localCellArea3.StartColumn - 1);
          zf.a(this.b, localCellArea4);
        }
        if (localCellArea3.EndColumn < localCellArea2.EndColumn)
        {
          localCellArea4 = new CellArea();
          localCellArea4.StartRow = localCellArea2.StartRow;
          localCellArea4.EndRow = localCellArea2.EndRow;
          localCellArea4.StartColumn = (localCellArea3.EndColumn + 1);
          localCellArea4.EndColumn = localCellArea2.EndColumn;
          zf.a(this.b, localCellArea4);
        }
        this.b.remove(i);
      }
    }
    return this.b.size() == 0;
  }
  
  static CellArea a(CellArea paramCellArea1, CellArea paramCellArea2, boolean[] paramArrayOfBoolean)
  {
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = (paramCellArea1.StartRow < paramCellArea2.StartRow ? paramCellArea2.StartRow : paramCellArea1.StartRow);
    localCellArea.StartColumn = (paramCellArea1.StartColumn < paramCellArea2.StartColumn ? paramCellArea2.StartColumn : paramCellArea1.StartColumn);
    localCellArea.EndRow = (paramCellArea1.EndRow < paramCellArea2.EndRow ? paramCellArea1.EndRow : paramCellArea2.EndRow);
    localCellArea.EndColumn = (paramCellArea1.EndColumn < paramCellArea2.EndColumn ? paramCellArea1.EndColumn : paramCellArea2.EndColumn);
    paramArrayOfBoolean[0] = ((localCellArea.StartRow > localCellArea.EndRow) || (localCellArea.StartColumn > localCellArea.EndColumn) ? 1 : false);
    return localCellArea;
  }
  
  public void removeCondition(int index)
  {
    this.f.remove(index);
  }
  
  boolean c()
  {
    Iterator localIterator = this.f.iterator();
    while (localIterator.hasNext())
    {
      FormatCondition localFormatCondition = (FormatCondition)localIterator.next();
      switch (localFormatCondition.getType())
      {
      case 8: 
      case 9: 
      case 13: 
      case 15: 
        return true;
      }
    }
    return false;
  }
  
  boolean d()
  {
    Iterator localIterator = this.f.iterator();
    while (localIterator.hasNext())
    {
      FormatCondition localFormatCondition = (FormatCondition)localIterator.next();
      byte[] arrayOfByte = localFormatCondition.a();
      if ((arrayOfByte != null) && (zaaq.a(this.a.a.c(), arrayOfByte, -1, arrayOfByte.length - 1))) {
        return true;
      }
      if (((localFormatCondition.getOperator() == 0) || (localFormatCondition.getOperator() == 7)) && (localFormatCondition.c() != null))
      {
        arrayOfByte = localFormatCondition.c();
        if ((arrayOfByte != null) && (zaaq.a(this.a.a.c(), arrayOfByte, -1, arrayOfByte.length - 1))) {
          return true;
        }
      }
    }
    return false;
  }
  
  int[] e()
  {
    int i = 0;
    int j = 0;
    if (this.b.size() == 0) {
      return null;
    }
    for (int k = 0; k < this.b.size(); k++)
    {
      CellArea localCellArea = (CellArea)this.b.get(k);
      if (k == 0)
      {
        i = localCellArea.StartRow;
        j = localCellArea.StartColumn;
      }
      else
      {
        if (i > localCellArea.StartRow) {
          i = localCellArea.StartRow;
        }
        if (j > localCellArea.StartColumn) {
          j = localCellArea.StartColumn;
        }
      }
    }
    return new int[] { i, j };
  }
  
  void a(byte[] paramArrayOfByte, int paramInt)
  {
    this.c = ((paramArrayOfByte[2] & 0xFF & 0x1) != 0);
    int i = zc.b(paramArrayOfByte, 12);
    for (int j = 14; j < paramInt; j += 8)
    {
      CellArea localCellArea = new CellArea();
      localCellArea.StartRow = (zc.e(paramArrayOfByte, j) & 0xFFFF);
      localCellArea.StartColumn = (zc.e(paramArrayOfByte, j + 4) & 0xFFFF);
      localCellArea.EndRow = (zc.e(paramArrayOfByte, j + 2) & 0xFFFF);
      localCellArea.EndColumn = (zc.e(paramArrayOfByte, j + 6) & 0xFFFF);
      zf.a(this.b, localCellArea);
    }
  }
  
  void f()
  {
    Iterator localIterator = this.f.iterator();
    while (localIterator.hasNext())
    {
      FormatCondition localFormatCondition = (FormatCondition)localIterator.next();
      localFormatCondition.f();
    }
  }
  
  private void a(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.b.size())) {
      throw new IllegalArgumentException("Invalid conditional formatted cell range index:" + paramInt);
    }
  }
  
  void a(boolean paramBoolean, zbcq paramzbcq)
  {
    int[] arrayOfInt = e();
    if (arrayOfInt == null) {
      return;
    }
    int i = arrayOfInt[0];
    int j = arrayOfInt[1];
    Iterator localIterator = a().iterator();
    while (localIterator.hasNext())
    {
      FormatCondition localFormatCondition = (FormatCondition)localIterator.next();
      if (localFormatCondition != null) {
        localFormatCondition.a(paramBoolean, i, j, paramzbcq);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/FormatConditionCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */