package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ConditionalFormattingCollection
  extends CollectionBase
{
  Worksheet a;
  
  ConditionalFormattingCollection(Worksheet sheet)
  {
    this.a = sheet;
  }
  
  public void removeArea(int startRow, int startColumn, int totalRows, int totalColumns)
  {
    for (int i = 0; i < getCount(); i++)
    {
      FormatConditionCollection localFormatConditionCollection = get(i);
      if (localFormatConditionCollection.removeArea(startRow, startColumn, totalRows, totalColumns)) {
        this.InnerList.remove(i--);
      }
    }
  }
  
  public void copy(ConditionalFormattingCollection cfs)
  {
    CopyOptions localCopyOptions = new CopyOptions(1, cfs.a, this.a);
    this.a.a(cfs.a.f());
    for (int i = 0; i < cfs.getCount(); i++)
    {
      FormatConditionCollection localFormatConditionCollection = new FormatConditionCollection(this);
      localFormatConditionCollection.b(cfs.get(i), localCopyOptions);
      zf.a(this.InnerList, localFormatConditionCollection);
    }
  }
  
  void a(ConditionalFormattingCollection paramConditionalFormattingCollection, CopyOptions paramCopyOptions)
  {
    this.a.a(paramConditionalFormattingCollection.a.f());
    for (int i = 0; i < paramConditionalFormattingCollection.getCount(); i++)
    {
      FormatConditionCollection localFormatConditionCollection = new FormatConditionCollection(this);
      localFormatConditionCollection.b(paramConditionalFormattingCollection.get(i), paramCopyOptions);
      zf.a(this.InnerList, localFormatConditionCollection);
    }
  }
  
  void a(CellArea paramCellArea1, CellArea paramCellArea2)
  {
    int i = getCount();
    for (int j = i - 1; j >= 0; j--)
    {
      FormatConditionCollection localFormatConditionCollection = get(j);
      ArrayList localArrayList1 = localFormatConditionCollection.b;
      int k = localFormatConditionCollection.b.size();
      for (int m = k - 1; m >= 0; m--)
      {
        CellArea localCellArea1 = (CellArea)localArrayList1.get(m);
        Object localObject = zban.e(localCellArea1, paramCellArea1);
        if (localObject != null)
        {
          ArrayList localArrayList2 = zban.d(localCellArea1, (CellArea)localObject);
          localArrayList1.remove(m);
          zf.a(localArrayList1, localArrayList2);
          CellArea localCellArea2 = (CellArea)localObject;
          CellArea localCellArea3 = new CellArea();
          localCellArea3.StartRow = (paramCellArea2.StartRow + localCellArea2.StartRow - paramCellArea1.StartRow);
          localCellArea3.EndRow = (localCellArea3.StartRow + localCellArea2.EndRow - localCellArea2.StartRow);
          localCellArea3.StartColumn = (paramCellArea2.StartColumn + localCellArea2.StartColumn - paramCellArea1.StartColumn);
          localCellArea3.EndColumn = (localCellArea3.StartColumn + localCellArea2.EndColumn - localCellArea2.StartColumn);
          zf.a(localArrayList1, localCellArea3);
        }
      }
      if (localArrayList1.size() == 0) {
        removeAt(j);
      }
    }
  }
  
  ConditionalFormattingCollection a(ConditionalFormattingCollection paramConditionalFormattingCollection, boolean paramBoolean, CellArea paramCellArea1, CellArea paramCellArea2)
  {
    int i = getCount();
    for (int j = i - 1; j >= 0; j--)
    {
      FormatConditionCollection localFormatConditionCollection = get(j);
      ArrayList localArrayList1 = localFormatConditionCollection.b;
      int k = localFormatConditionCollection.b.size();
      for (int m = k - 1; m >= 0; m--)
      {
        CellArea localCellArea = (CellArea)localArrayList1.get(m);
        Object localObject = zban.e(localCellArea, paramCellArea2);
        if (localObject != null)
        {
          ArrayList localArrayList2 = zban.d(localCellArea, (CellArea)localObject);
          localArrayList1.remove(m);
          zf.a(localArrayList1, localArrayList2);
        }
      }
      if (localArrayList1.size() == 0) {
        removeAt(j);
      }
    }
    return paramConditionalFormattingCollection;
  }
  
  void a(ConditionalFormattingCollection paramConditionalFormattingCollection, int paramInt1, int paramInt2, int paramInt3, CopyOptions paramCopyOptions, boolean paramBoolean)
  {
    CellArea localCellArea1 = CellArea.createCellArea(0, paramInt1, 16383, paramInt1 + paramInt3 - 1);
    CellArea localCellArea2 = CellArea.createCellArea(0, paramInt2, 16383, paramInt2 + paramInt3 - 1);
    a(paramConditionalFormattingCollection, localCellArea1, localCellArea2, paramCopyOptions, paramBoolean);
  }
  
  void a(ConditionalFormattingCollection paramConditionalFormattingCollection, CellArea paramCellArea1, CellArea paramCellArea2, CopyOptions paramCopyOptions, boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    boolean bool1 = paramConditionalFormattingCollection == this;
    if ((bool1) && (zban.e(paramCellArea1, paramCellArea2) == null)) {
      paramConditionalFormattingCollection = a(paramConditionalFormattingCollection, bool1, paramCellArea1, paramCellArea2);
    }
    for (int i = 0; i < paramConditionalFormattingCollection.getCount(); i++)
    {
      FormatConditionCollection localFormatConditionCollection1 = paramConditionalFormattingCollection.get(i);
      int j = localFormatConditionCollection1.b.size();
      boolean bool2 = false;
      for (int k = 0; k < j; k++)
      {
        CellArea localCellArea1 = (CellArea)localFormatConditionCollection1.b.get(k);
        Object localObject = zban.e(localCellArea1, paramCellArea1);
        if (localObject != null)
        {
          localCellArea1 = (CellArea)localObject;
          CellArea localCellArea2 = new CellArea();
          localCellArea2.StartRow = (localCellArea1.StartRow - paramCellArea1.StartRow + paramCellArea2.StartRow);
          localCellArea2.StartColumn = (localCellArea1.StartColumn - paramCellArea1.StartColumn + paramCellArea2.StartColumn);
          localCellArea2.EndRow = (localCellArea1.EndRow - localCellArea1.StartRow + localCellArea2.StartRow);
          localCellArea2.EndColumn = (localCellArea1.EndColumn - localCellArea1.StartColumn + localCellArea2.StartColumn);
          if (bool1)
          {
            bool2 |= zban.a(localFormatConditionCollection1.b, localCellArea2);
          }
          else
          {
            FormatConditionCollection localFormatConditionCollection2 = new FormatConditionCollection(this);
            localFormatConditionCollection2.a(localFormatConditionCollection1, localCellArea2, paramCopyOptions);
            zf.a(this.InnerList, localFormatConditionCollection2);
          }
        }
      }
      if (bool2) {
        zban.a(localFormatConditionCollection1.b);
      }
    }
  }
  
  public FormatConditionCollection get(int index)
  {
    return (FormatConditionCollection)this.InnerList.get(index);
  }
  
  public int add()
  {
    zf.a(this.InnerList, new FormatConditionCollection(this));
    return getCount() - 1;
  }
  
  int a(FormatConditionCollection paramFormatConditionCollection)
  {
    zf.a(this.InnerList, paramFormatConditionCollection);
    return getCount() - 1;
  }
  
  void a(ConditionalFormattingCollection paramConditionalFormattingCollection, int paramInt1, int paramInt2, int paramInt3, CopyOptions paramCopyOptions)
  {
    int i;
    if (paramConditionalFormattingCollection != this)
    {
      for (i = 0; i < paramConditionalFormattingCollection.getCount(); i++)
      {
        FormatConditionCollection localFormatConditionCollection1 = paramConditionalFormattingCollection.get(i);
        a(localFormatConditionCollection1, paramInt1, paramInt2, paramInt3, paramCopyOptions);
      }
    }
    else
    {
      i = getCount();
      for (int j = 0; j < i; j++)
      {
        FormatConditionCollection localFormatConditionCollection2 = get(j);
        a(localFormatConditionCollection2.b, paramInt1, paramInt2, paramInt3, paramCopyOptions);
      }
    }
  }
  
  private void a(FormatConditionCollection paramFormatConditionCollection, int paramInt1, int paramInt2, int paramInt3, CopyOptions paramCopyOptions)
  {
    ArrayList localArrayList1 = paramFormatConditionCollection.b;
    ArrayList localArrayList2 = new ArrayList();
    for (int i = localArrayList1.size() - 1; i >= 0; i--)
    {
      CellArea localCellArea1 = (CellArea)localArrayList1.get(i);
      Object localObject = zban.b(localCellArea1, paramInt1, paramInt3);
      if (localObject != null)
      {
        CellArea localCellArea2 = (CellArea)localObject;
        int j = localCellArea1.StartRow - paramInt1;
        if (j < 0) {
          j = 0;
        }
        int k = paramInt2 + j;
        int m = localCellArea2.EndRow - localCellArea2.StartRow + 1;
        CellArea localCellArea3 = new CellArea();
        localCellArea3.StartRow = k;
        localCellArea3.EndRow = (k + m - 1);
        localCellArea3.StartColumn = localCellArea1.StartColumn;
        localCellArea3.EndColumn = localCellArea1.EndColumn;
        zf.a(localArrayList2, localCellArea3);
      }
    }
    if (localArrayList2.size() != 0)
    {
      FormatConditionCollection localFormatConditionCollection = new FormatConditionCollection(this);
      localFormatConditionCollection.a(paramFormatConditionCollection, localArrayList2, paramCopyOptions);
      zf.a(this.InnerList, localFormatConditionCollection);
    }
  }
  
  private void a(ArrayList paramArrayList, int paramInt1, int paramInt2, int paramInt3, CopyOptions paramCopyOptions)
  {
    CellArea localCellArea1;
    Object localObject;
    for (int i = paramArrayList.size() - 1; i >= 0; i--)
    {
      localCellArea1 = (CellArea)paramArrayList.get(i);
      localObject = zban.a(localCellArea1, paramInt2, paramInt3);
      paramArrayList.remove(i);
      paramArrayList.addAll(i, (Collection)localObject);
    }
    for (i = paramArrayList.size() - 1; i >= 0; i--)
    {
      localCellArea1 = (CellArea)paramArrayList.get(i);
      localObject = zban.b(localCellArea1, paramInt1, paramInt3);
      if (localObject != null)
      {
        CellArea localCellArea2 = (CellArea)localObject;
        int j = localCellArea2.StartRow - paramInt1;
        int k = paramInt2 + j;
        int m = localCellArea2.EndRow;
        int n = m - localCellArea2.StartRow + 1;
        CellArea localCellArea3 = new CellArea();
        localCellArea3.StartRow = k;
        localCellArea3.EndRow = (k + n - 1);
        localCellArea3.StartColumn = localCellArea1.StartColumn;
        localCellArea3.EndColumn = localCellArea1.EndColumn;
        int i1 = 0;
        boolean[] arrayOfBoolean = { i1 };
        localCellArea1 = zban.a(localCellArea1, localCellArea3, arrayOfBoolean);
        i1 = arrayOfBoolean[0];
        if (i1 != 0) {
          paramArrayList.set(i, localCellArea1);
        } else {
          zf.a(paramArrayList, localCellArea3);
        }
      }
    }
  }
  
  void a(FormatConditionCollection paramFormatConditionCollection, ArrayList paramArrayList)
  {
    CopyOptions localCopyOptions = new CopyOptions(0, paramFormatConditionCollection.e, this.a);
    for (int i = paramArrayList.size() - 1; i > 0; i--)
    {
      int j = add();
      FormatConditionCollection localFormatConditionCollection = get(j);
      localFormatConditionCollection.c = paramFormatConditionCollection.c;
      zf.a(localFormatConditionCollection.b, paramArrayList.get(i));
      for (int k = 0; k < paramFormatConditionCollection.getCount(); k++)
      {
        FormatCondition localFormatCondition = new FormatCondition(localFormatConditionCollection);
        localFormatCondition.a(paramFormatConditionCollection.get(k), localCopyOptions);
        this.a.a(this.a.f() + 1);
        localFormatCondition.setPriority(this.a.f());
        localFormatConditionCollection.a(localFormatCondition);
      }
    }
    paramFormatConditionCollection.b.clear();
    zf.a(paramFormatConditionCollection.b, paramArrayList.get(0));
  }
  
  private void a(FormatConditionCollection paramFormatConditionCollection, int paramInt)
  {
    CopyOptions localCopyOptions = new CopyOptions(0, paramFormatConditionCollection.e, this.a);
    ArrayList localArrayList = paramFormatConditionCollection.b;
    for (int i = localArrayList.size() - 1; i > 0; i--)
    {
      paramInt++;
      FormatConditionCollection localFormatConditionCollection = new FormatConditionCollection(this);
      this.InnerList.add(paramInt, localFormatConditionCollection);
      localFormatConditionCollection.c = paramFormatConditionCollection.c;
      CellArea localCellArea1 = (CellArea)localArrayList.get(i);
      CellArea localCellArea2 = new CellArea();
      localCellArea2.StartRow = localCellArea1.StartRow;
      localCellArea2.StartColumn = localCellArea1.StartColumn;
      localCellArea2.EndColumn = localCellArea1.EndColumn;
      localCellArea2.EndRow = localCellArea1.EndRow;
      zf.a(localFormatConditionCollection.b, localCellArea2);
      for (int j = 0; j < paramFormatConditionCollection.getCount(); j++)
      {
        FormatCondition localFormatCondition = new FormatCondition(localFormatConditionCollection);
        localFormatCondition.a(paramFormatConditionCollection.get(j), localCopyOptions);
        localFormatConditionCollection.a(localFormatCondition);
      }
      localArrayList.remove(i);
    }
    for (i = 0; i < paramFormatConditionCollection.getCount(); i++)
    {
      paramFormatConditionCollection.get(i).d = null;
      paramFormatConditionCollection.get(i).e = null;
    }
  }
  
  void a(CellArea paramCellArea, int paramInt1, int paramInt2, Worksheet paramWorksheet, boolean paramBoolean)
  {
    CopyOptions localCopyOptions = new CopyOptions(0, paramWorksheet, this.a);
    switch (paramInt2)
    {
    case 0: 
      b(paramCellArea, paramInt1, paramWorksheet, paramBoolean, localCopyOptions);
      return;
    case 3: 
      a(paramCellArea, paramInt1, paramWorksheet, paramBoolean, localCopyOptions);
      return;
    }
    for (int i = 0; i < getCount(); i++)
    {
      Object localObject = get(i);
      if ((((FormatConditionCollection)localObject).b != null) && (((FormatConditionCollection)localObject).b.size() != 0))
      {
        int j = ((FormatConditionCollection)localObject).b.size();
        ((FormatConditionCollection)localObject).f();
        boolean bool = ((FormatConditionCollection)localObject).d();
        ArrayList localArrayList1 = new ArrayList();
        ArrayList localArrayList2 = new ArrayList();
        switch (paramInt2)
        {
        case 1: 
          zban.c(((FormatConditionCollection)localObject).b, this.a.c().p().g(), paramCellArea, paramInt1, localArrayList1, localArrayList2);
          break;
        case 3: 
          zban.d(((FormatConditionCollection)localObject).b, this.a.c().p().g(), paramCellArea, paramInt1, localArrayList1, localArrayList2);
          break;
        case 4: 
          zban.b(((FormatConditionCollection)localObject).b, this.a.c().p().g(), paramCellArea, paramInt1, localArrayList1, localArrayList2);
          break;
        case 0: 
          zban.a(((FormatConditionCollection)localObject).b, this.a.c().p().g(), paramCellArea, paramInt1, localArrayList1, localArrayList2);
          break;
        }
        int[] arrayOfInt = ((FormatConditionCollection)localObject).e();
        int k = arrayOfInt[0];
        int m = arrayOfInt[1];
        if (bool)
        {
          ((FormatConditionCollection)localObject).b.clear();
          if (localArrayList1.size() != 0)
          {
            zf.a(((FormatConditionCollection)localObject).b, localArrayList1);
            FormatConditionCollection localFormatConditionCollection = null;
            if (localArrayList2.size() != 0)
            {
              localFormatConditionCollection = new FormatConditionCollection(this);
              localFormatConditionCollection.a((FormatConditionCollection)localObject, localCopyOptions);
            }
            a((FormatConditionCollection)localObject, paramCellArea, paramInt1, paramInt2, paramWorksheet, paramBoolean, k, m, k, m);
            if (localArrayList2.size() != 0)
            {
              localObject = localFormatConditionCollection;
              this.InnerList.add(i, localObject);
              zf.a(((FormatConditionCollection)localObject).b, localArrayList2);
              arrayOfInt = ((FormatConditionCollection)localObject).e();
              k = arrayOfInt[0];
              m = arrayOfInt[1];
              a((FormatConditionCollection)localObject, paramCellArea, paramInt1, paramInt2, paramWorksheet, paramBoolean, k, m - paramInt1, k, m);
              i++;
            }
          }
          else if (localArrayList2.size() != 0)
          {
            zf.a(((FormatConditionCollection)localObject).b, localArrayList2);
            arrayOfInt = ((FormatConditionCollection)localObject).e();
            k = arrayOfInt[0];
            m = arrayOfInt[1];
            a((FormatConditionCollection)localObject, paramCellArea, paramInt1, paramInt2, paramWorksheet, paramBoolean, k, m - paramInt1, k, m);
          }
        }
        else
        {
          ((FormatConditionCollection)localObject).b.clear();
          zf.a(((FormatConditionCollection)localObject).b, localArrayList1);
          zf.a(((FormatConditionCollection)localObject).b, localArrayList2);
          a((FormatConditionCollection)localObject, paramCellArea, paramInt1, paramInt2, paramWorksheet, paramBoolean, k, m, k, m);
        }
        if (((FormatConditionCollection)localObject).b.size() == 0)
        {
          removeAt(i);
          i--;
        }
      }
    }
  }
  
  private void a(FormatConditionCollection paramFormatConditionCollection, CellArea paramCellArea, int paramInt1, int paramInt2, Worksheet paramWorksheet, boolean paramBoolean, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    for (int i = 0; i < paramFormatConditionCollection.getCount(); i++)
    {
      FormatCondition localFormatCondition = paramFormatConditionCollection.get(i);
      byte[] arrayOfByte;
      if (localFormatCondition.a() != null)
      {
        arrayOfByte = localFormatCondition.a();
        zaaq.a(paramCellArea, paramInt1, paramInt2, paramWorksheet, paramBoolean, arrayOfByte, -1, arrayOfByte.length, paramInt3, paramInt4, paramInt5, paramInt6);
        localFormatCondition.a(arrayOfByte);
      }
      if (((localFormatCondition.getOperator() == 0) || (localFormatCondition.getOperator() == 7)) && (localFormatCondition.c() != null))
      {
        arrayOfByte = localFormatCondition.c();
        zaaq.a(paramCellArea, paramInt1, paramInt2, paramWorksheet, paramBoolean, arrayOfByte, -1, arrayOfByte.length, paramInt3, paramInt4, paramInt5, paramInt6);
        localFormatCondition.b(arrayOfByte);
      }
    }
  }
  
  private void a(CellArea paramCellArea, int paramInt, Worksheet paramWorksheet, boolean paramBoolean, CopyOptions paramCopyOptions)
  {
    for (int i = 0; i < getCount(); i++)
    {
      Object localObject = get(i);
      if ((((FormatConditionCollection)localObject).b != null) && (((FormatConditionCollection)localObject).b.size() != 0))
      {
        int j = ((FormatConditionCollection)localObject).b.size();
        ((FormatConditionCollection)localObject).f();
        boolean bool = ((FormatConditionCollection)localObject).d();
        ArrayList localArrayList1 = new ArrayList();
        ArrayList localArrayList2 = new ArrayList();
        zban.d(((FormatConditionCollection)localObject).b, this.a.c().p().g(), paramCellArea, paramInt, localArrayList1, localArrayList2);
        int[] arrayOfInt = ((FormatConditionCollection)localObject).e();
        int k = arrayOfInt[0];
        int m = arrayOfInt[1];
        if (bool)
        {
          ((FormatConditionCollection)localObject).b.clear();
          if (localArrayList1.size() != 0)
          {
            zf.a(((FormatConditionCollection)localObject).b, localArrayList1);
            a((FormatConditionCollection)localObject, paramCellArea, paramInt, 3, paramWorksheet, paramBoolean, k, m, k, m);
            if (localArrayList2.size() != 0)
            {
              FormatConditionCollection localFormatConditionCollection = new FormatConditionCollection(this);
              localFormatConditionCollection.a((FormatConditionCollection)localObject, paramCopyOptions);
              localObject = localFormatConditionCollection;
              this.InnerList.add(i, localObject);
              zf.a(((FormatConditionCollection)localObject).b, localArrayList2);
              arrayOfInt = ((FormatConditionCollection)localObject).e();
              k = arrayOfInt[0];
              m = arrayOfInt[1];
              a((FormatConditionCollection)localObject, paramCellArea, paramInt, 3, paramWorksheet, paramBoolean, k, m - paramInt, k, m);
              i++;
            }
          }
          else if (localArrayList2.size() != 0)
          {
            zf.a(((FormatConditionCollection)localObject).b, localArrayList2);
            arrayOfInt = ((FormatConditionCollection)localObject).e();
            k = arrayOfInt[0];
            m = arrayOfInt[1];
            a((FormatConditionCollection)localObject, paramCellArea, paramInt, 3, paramWorksheet, paramBoolean, k, m - paramInt, k, m);
          }
        }
        else
        {
          ((FormatConditionCollection)localObject).b.clear();
          zf.a(((FormatConditionCollection)localObject).b, localArrayList1);
          zf.a(((FormatConditionCollection)localObject).b, localArrayList2);
          a((FormatConditionCollection)localObject, paramCellArea, paramInt, 3, paramWorksheet, paramBoolean, k, m, k, m);
        }
      }
    }
  }
  
  private void b(CellArea paramCellArea, int paramInt, Worksheet paramWorksheet, boolean paramBoolean, CopyOptions paramCopyOptions)
  {
    for (int i = 0; i < getCount(); i++)
    {
      FormatConditionCollection localFormatConditionCollection = get(i);
      if ((localFormatConditionCollection.b != null) && (localFormatConditionCollection.b.size() != 0))
      {
        int j = localFormatConditionCollection.b.size();
        int k = 0;
        localFormatConditionCollection.f();
        Object localObject1;
        Object localObject2;
        if ((localFormatConditionCollection.c()) || (!localFormatConditionCollection.d()))
        {
          for (int m = 0; m < j; m++)
          {
            localObject1 = (CellArea)localFormatConditionCollection.b.get(m);
            localObject2 = new boolean[] { k };
            ArrayList localArrayList = zban.a(paramWorksheet.c().p().g(), paramCellArea, paramInt, (CellArea)localObject1, (boolean[])localObject2);
            k = localObject2[0];
            if (k != 0) {
              if (localArrayList.size() == 1)
              {
                localFormatConditionCollection.b.set(m, localArrayList.get(0));
              }
              else
              {
                localFormatConditionCollection.b.remove(m--);
                j--;
                zf.a(localFormatConditionCollection.b, localArrayList);
              }
            }
          }
        }
        else
        {
          if (j > 1) {
            a(localFormatConditionCollection, i);
          }
          CellArea localCellArea = (CellArea)localFormatConditionCollection.b.get(0);
          localObject1 = new boolean[] { k };
          localObject2 = zban.b(paramCellArea, localCellArea, (boolean[])localObject1);
          k = localObject1[0];
          if ((k != 0) && (localObject2 != null) && (((ArrayList)localObject2).size() > 1)) {
            a(localFormatConditionCollection, (ArrayList)localObject2);
          }
          localCellArea = (CellArea)localFormatConditionCollection.b.get(0);
          int n = localCellArea.StartRow;
          int i1 = localCellArea.StartColumn;
          int i2 = n;
          int i3 = i1;
          localObject1[0] = k;
          localObject2 = zban.a(paramWorksheet.c().p().g(), paramCellArea, paramInt, localCellArea, (boolean[])localObject1);
          k = localObject1[0];
          if (k != 0)
          {
            localFormatConditionCollection.b = ((ArrayList)localObject2);
            int[] arrayOfInt = localFormatConditionCollection.e();
            i2 = arrayOfInt[0];
            i3 = arrayOfInt[1];
          }
          for (int i4 = 0; i4 < localFormatConditionCollection.getCount(); i4++)
          {
            FormatCondition localFormatCondition = localFormatConditionCollection.get(i4);
            byte[] arrayOfByte;
            if (localFormatCondition.a() != null)
            {
              arrayOfByte = localFormatCondition.a();
              zaaq.a(paramCellArea, paramInt, 0, paramWorksheet, paramBoolean, arrayOfByte, -1, arrayOfByte.length, n, i1, i2, i3);
              localFormatCondition.a(arrayOfByte);
            }
            if (((localFormatCondition.getOperator() == 0) || (localFormatCondition.getOperator() == 7)) && (localFormatCondition.c() != null))
            {
              arrayOfByte = localFormatCondition.c();
              zaaq.a(paramCellArea, paramInt, 0, paramWorksheet, paramBoolean, arrayOfByte, -1, arrayOfByte.length, n, i1, i2, i3);
              localFormatCondition.b(arrayOfByte);
            }
          }
        }
      }
    }
  }
  
  void a(int paramInt1, int paramInt2)
  {
    CellArea localCellArea1 = CellArea.createCellArea(paramInt1, 0, paramInt1 + (paramInt2 > 0 ? paramInt2 : -paramInt2), 16383);
    for (int i = 0; i < getCount(); i++)
    {
      FormatConditionCollection localFormatConditionCollection = get(i);
      if ((localFormatConditionCollection.b != null) && (localFormatConditionCollection.b.size() != 0))
      {
        localFormatConditionCollection.f();
        if ((localFormatConditionCollection.b.size() > 1) && (zban.b(localFormatConditionCollection.b, localCellArea1)) && (localFormatConditionCollection.d())) {
          a(localFormatConditionCollection, i);
        }
        CellArea localCellArea2 = (CellArea)localFormatConditionCollection.b.get(0);
        int[] arrayOfInt = localFormatConditionCollection.e();
        int j = arrayOfInt[0];
        Object localObject1;
        Object localObject2;
        for (int k = localFormatConditionCollection.getRangeCount() - 1; k >= 0; k--)
        {
          localObject1 = (CellArea)localFormatConditionCollection.b.get(k);
          int m = 0;
          if ((paramInt2 > 0) && (paramInt1 == ((CellArea)localObject1).EndRow + 1))
          {
            ((CellArea)localObject1).EndRow = (paramInt1 + paramInt2 - 1);
          }
          else
          {
            localObject2 = new boolean[] { m };
            localObject1 = zban.a((CellArea)localObject1, paramInt1, paramInt2, (boolean[])localObject2);
            m = localObject2[0];
          }
          if (m != 0) {
            localFormatConditionCollection.b.remove(k);
          } else {
            localFormatConditionCollection.b.set(k, localObject1);
          }
        }
        if (localFormatConditionCollection.getRangeCount() == 0)
        {
          removeAt(i);
          i--;
        }
        else
        {
          arrayOfInt = localFormatConditionCollection.e();
          k = arrayOfInt[0];
          localObject1 = localFormatConditionCollection.a().iterator();
          while (((Iterator)localObject1).hasNext())
          {
            FormatCondition localFormatCondition = (FormatCondition)((Iterator)localObject1).next();
            localObject2 = localFormatCondition.a();
            if (localObject2 != null)
            {
              zaaq.a(this.a, true, paramInt1, paramInt2, j, k, -1, localObject2.length - 1, (byte[])localObject2);
              localFormatCondition.a((byte[])localObject2);
              if (localFormatCondition.c() != null)
              {
                localObject2 = localFormatCondition.c();
                zaaq.a(this.a, true, paramInt1, paramInt2, j, k, -1, localObject2.length - 1, (byte[])localObject2);
                localFormatCondition.b((byte[])localObject2);
              }
            }
          }
        }
      }
    }
  }
  
  void b(int paramInt1, int paramInt2)
  {
    for (int i = 0; i < getCount(); i++)
    {
      FormatConditionCollection localFormatConditionCollection = get(i);
      if ((localFormatConditionCollection.b != null) && (localFormatConditionCollection.b.size() != 0))
      {
        localFormatConditionCollection.f();
        if ((localFormatConditionCollection.b.size() > 1) && (localFormatConditionCollection.d())) {
          a(localFormatConditionCollection, i);
        }
        CellArea localCellArea1 = (CellArea)localFormatConditionCollection.b.get(0);
        int j = localCellArea1.StartColumn;
        Object localObject;
        for (int k = localFormatConditionCollection.getRangeCount() - 1; k >= 0; k--)
        {
          CellArea localCellArea2 = (CellArea)localFormatConditionCollection.b.get(k);
          int n = 0;
          if ((paramInt2 > 0) && (paramInt1 == localCellArea2.EndColumn + 1))
          {
            localCellArea2.EndColumn = (paramInt1 + paramInt2 - 1);
          }
          else
          {
            localObject = new boolean[] { n };
            localCellArea2 = zban.b(localCellArea2, paramInt1, paramInt2, (boolean[])localObject);
            n = localObject[0];
          }
          if (n != 0) {
            localFormatConditionCollection.b.remove(k);
          } else {
            localFormatConditionCollection.b.set(k, localCellArea2);
          }
        }
        if (localFormatConditionCollection.getRangeCount() == 0)
        {
          removeAt(i);
          i--;
        }
        else
        {
          int[] arrayOfInt = localFormatConditionCollection.e();
          k = arrayOfInt[0];
          int m = arrayOfInt[1];
          localObject = localFormatConditionCollection.a().iterator();
          while (((Iterator)localObject).hasNext())
          {
            FormatCondition localFormatCondition = (FormatCondition)((Iterator)localObject).next();
            byte[] arrayOfByte = localFormatCondition.a();
            if (arrayOfByte != null)
            {
              zaaq.b(this.a, true, paramInt1, paramInt2, j, m, -1, arrayOfByte.length - 1, arrayOfByte);
              localFormatCondition.a(arrayOfByte);
            }
            if (localFormatCondition.c() != null)
            {
              arrayOfByte = localFormatCondition.c();
              zaaq.b(this.a, true, paramInt1, paramInt2, j, m, -1, arrayOfByte.length - 1, arrayOfByte);
              localFormatCondition.b(arrayOfByte);
            }
          }
        }
      }
    }
  }
  
  boolean a()
  {
    for (int i = 0; i < getCount(); i++)
    {
      FormatConditionCollection localFormatConditionCollection = get(i);
      int j = localFormatConditionCollection.b(false);
      if ((j != 0) && (j != localFormatConditionCollection.getCount())) {
        localFormatConditionCollection.b();
      }
      if ((localFormatConditionCollection.getRangeCount() == 0) && (!localFormatConditionCollection.d))
      {
        removeAt(i--);
      }
      else
      {
        for (int k = 0; k < localFormatConditionCollection.getCount(); k++)
        {
          FormatCondition localFormatCondition = localFormatConditionCollection.get(k);
          if (localFormatCondition == null) {
            localFormatConditionCollection.removeCondition(k--);
          } else {
            switch (localFormatCondition.getType())
            {
            case 0: 
            case 1: 
              localFormatCondition.f();
              if (localFormatCondition.a() == null) {
                localFormatConditionCollection.removeCondition(k--);
              } else if ((localFormatCondition.c == 0) && ((localFormatCondition.b == 0) || (localFormatCondition.b == 7)) && (localFormatCondition.c() == null)) {
                localFormatConditionCollection.removeCondition(k--);
              }
              break;
            case 2: 
            case 3: 
            case 4: 
              break;
            case 5: 
              if (localFormatConditionCollection.b.size() > 1) {
                localFormatCondition.setFormula1(null);
              } else {
                localFormatCondition.setFormula1(localFormatCondition.g());
              }
              break;
            default: 
              localFormatCondition.setFormula1(localFormatCondition.g());
            }
          }
        }
        if (localFormatConditionCollection.getCount() == 0) {
          removeAt(i--);
        }
      }
    }
    return true;
  }
  
  boolean b()
  {
    if (getCount() == 0) {
      return false;
    }
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      FormatConditionCollection localFormatConditionCollection = (FormatConditionCollection)localIterator.next();
      if (localFormatConditionCollection.b(true) != 0) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ConditionalFormattingCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */