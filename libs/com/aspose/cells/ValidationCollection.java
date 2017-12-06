package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;
import java.util.Iterator;

public class ValidationCollection
  extends CollectionBase
{
  private Worksheet a;
  private int b = -1;
  
  Worksheet a()
  {
    return this.a;
  }
  
  ValidationCollection(Worksheet sheet)
  {
    this.a = sheet;
  }
  
  int a(Validation paramValidation)
  {
    zf.a(this.InnerList, paramValidation);
    return getCount() - 1;
  }
  
  /**
   * @deprecated
   */
  public int add()
  {
    Validation localValidation = new Validation(this);
    zf.a(this.InnerList, localValidation);
    return getCount() - 1;
  }
  
  public int add(CellArea ca)
  {
    Validation localValidation = new Validation(this);
    zf.a(this.InnerList, localValidation);
    zf.a(localValidation.b, ca);
    return getCount() - 1;
  }
  
  public int add(Validation validation)
  {
    for (int i = 0; i < validation.getAreaList().size(); i++)
    {
      CellArea localCellArea = (CellArea)validation.getAreaList().get(i);
      removeArea(localCellArea);
    }
    zf.a(this.InnerList, validation);
    return getCount() - 1;
  }
  
  public Validation get(int index)
  {
    return (Validation)this.InnerList.get(index);
  }
  
  public void removeACell(int row, int column)
  {
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      Validation localValidation = (Validation)localIterator.next();
      localValidation.removeACell(row, column);
    }
  }
  
  public void removeArea(CellArea ca)
  {
    for (int i = 0; i < getCount(); i++)
    {
      Validation localValidation = get(i);
      localValidation.removeArea(ca);
      if (localValidation.getAreaList().size() <= 0) {
        removeAt(i--);
      }
    }
  }
  
  void a(CellArea paramCellArea, Validation paramValidation)
  {
    for (int i = 0; i < getCount(); i++)
    {
      Validation localValidation = get(i);
      localValidation.removeArea(paramCellArea);
      if ((localValidation != paramValidation) && (localValidation.getAreaList().size() <= 0)) {
        removeAt(i--);
      }
    }
  }
  
  public Validation getValidationInCell(int row, int column)
  {
    for (int i = 0; i < getCount(); i++)
    {
      Validation localValidation = get(i);
      for (int j = 0; j < localValidation.getAreaList().size(); j++)
      {
        CellArea localCellArea = (CellArea)localValidation.getAreaList().get(j);
        if ((row >= localCellArea.StartRow) && (row <= localCellArea.EndRow) && (column >= localCellArea.StartColumn) && (column <= localCellArea.EndColumn)) {
          return localValidation;
        }
      }
    }
    return null;
  }
  
  void a(ValidationCollection paramValidationCollection, CopyOptions paramCopyOptions)
  {
    Iterator localIterator = paramValidationCollection.iterator();
    while (localIterator.hasNext())
    {
      Validation localValidation1 = (Validation)localIterator.next();
      Validation localValidation2 = new Validation(this);
      localValidation2.a(localValidation1, paramCopyOptions);
      a(localValidation2);
    }
    this.b = paramValidationCollection.b;
  }
  
  void a(ValidationCollection paramValidationCollection, int paramInt1, int paramInt2, int paramInt3, CopyOptions paramCopyOptions)
  {
    for (int i = 0; i < paramValidationCollection.getCount(); i++)
    {
      Validation localValidation1 = paramValidationCollection.get(i);
      int j = localValidation1.getAreaList().size();
      for (int k = 0; k < j; k++)
      {
        CellArea localCellArea1 = (CellArea)localValidation1.getAreaList().get(k);
        Object localObject = zban.b(localCellArea1, paramInt1, paramInt3);
        if (localObject != null)
        {
          CellArea localCellArea2 = (CellArea)localObject;
          CellArea localCellArea3 = new CellArea();
          localCellArea3.StartRow = (paramInt2 + localCellArea2.StartRow - paramInt1);
          localCellArea3.StartColumn = localCellArea2.StartColumn;
          localCellArea3.EndRow = (localCellArea2.EndRow - localCellArea2.StartRow + localCellArea3.StartRow);
          localCellArea3.EndColumn = localCellArea2.EndColumn;
          if (paramValidationCollection == this)
          {
            zban.a(localValidation1.getAreaList(), localCellArea3);
          }
          else
          {
            Validation localValidation2 = new Validation(this);
            localValidation2.a(localValidation1, localCellArea3, this.a, paramCopyOptions);
            zf.a(this.InnerList, localValidation2);
          }
        }
      }
    }
  }
  
  void b(ValidationCollection paramValidationCollection, int paramInt1, int paramInt2, int paramInt3, CopyOptions paramCopyOptions)
  {
    for (int i = 0; i < paramValidationCollection.getCount(); i++)
    {
      Validation localValidation1 = paramValidationCollection.get(i);
      int j = localValidation1.getAreaList().size();
      for (int k = 0; k < j; k++)
      {
        CellArea localCellArea1 = (CellArea)localValidation1.getAreaList().get(k);
        Object localObject = zban.c(localCellArea1, paramInt1, paramInt3);
        if (localObject != null)
        {
          CellArea localCellArea2 = (CellArea)localObject;
          CellArea localCellArea3 = new CellArea();
          localCellArea3.StartRow = localCellArea2.StartRow;
          localCellArea3.EndRow = localCellArea2.EndRow;
          localCellArea3.StartColumn = (paramInt2 + localCellArea2.StartColumn - paramInt1);
          localCellArea3.EndColumn = (localCellArea2.EndColumn - localCellArea2.StartColumn + localCellArea3.StartColumn);
          if (paramValidationCollection == this)
          {
            zban.a(localValidation1.getAreaList(), localCellArea3);
          }
          else
          {
            Validation localValidation2 = new Validation(this);
            localValidation2.a(localValidation1, localCellArea3, this.a, paramCopyOptions);
            zf.a(this.InnerList, localValidation2);
          }
        }
      }
    }
  }
  
  void a(ValidationCollection paramValidationCollection, CellArea paramCellArea1, CellArea paramCellArea2, CopyOptions paramCopyOptions, boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    int i = paramValidationCollection == this ? 1 : 0;
    for (int j = 0; j < paramValidationCollection.getCount(); j++)
    {
      Validation localValidation1 = paramValidationCollection.get(j);
      int k = localValidation1.getAreaList().size();
      for (int m = 0; m < k; m++)
      {
        CellArea localCellArea1 = (CellArea)localValidation1.getAreaList().get(m);
        Object localObject = zban.e(localCellArea1, paramCellArea1);
        if (localObject != null)
        {
          localCellArea1 = (CellArea)localObject;
          CellArea localCellArea2 = new CellArea();
          localCellArea2.StartRow = (localCellArea1.StartRow - paramCellArea1.StartRow + paramCellArea2.StartRow);
          localCellArea2.StartColumn = (localCellArea1.StartColumn - paramCellArea1.StartColumn + paramCellArea2.StartColumn);
          localCellArea2.EndRow = (localCellArea1.EndRow - localCellArea1.StartRow + localCellArea2.StartRow);
          localCellArea2.EndColumn = (localCellArea1.EndColumn - localCellArea1.StartColumn + localCellArea2.StartColumn);
          if (paramValidationCollection == this)
          {
            zban.a(localValidation1.getAreaList(), localCellArea2);
          }
          else
          {
            Validation localValidation2 = new Validation(this);
            localValidation2.a(localValidation1, localCellArea2, this.a, paramCopyOptions);
            zf.a(this.InnerList, localValidation2);
          }
        }
      }
    }
  }
  
  void a(CellArea paramCellArea, int paramInt1, int paramInt2, Worksheet paramWorksheet, boolean paramBoolean)
  {
    WorksheetCollection localWorksheetCollection = this.a.c();
    for (int i = 0; i < getCount(); i++)
    {
      Object localObject1 = get(i);
      if ((((Validation)localObject1).getAreaList() != null) && (((Validation)localObject1).getAreaList().size() != 0))
      {
        int j = ((Validation)localObject1).getAreaList().size();
        int k = 0;
        int m = 1;
        int[] arrayOfInt = ((Validation)localObject1).b();
        k = arrayOfInt[0];
        m = arrayOfInt[1];
        boolean bool = ((Validation)localObject1).d();
        ArrayList localArrayList1 = new ArrayList();
        ArrayList localArrayList2 = new ArrayList();
        switch (paramInt2)
        {
        case 1: 
          zban.c(((Validation)localObject1).getAreaList(), localWorksheetCollection.p().g(), paramCellArea, paramInt1, localArrayList1, localArrayList2);
          break;
        case 3: 
          zban.d(((Validation)localObject1).getAreaList(), localWorksheetCollection.p().g(), paramCellArea, paramInt1, localArrayList1, localArrayList2);
          break;
        case 4: 
          zban.b(((Validation)localObject1).getAreaList(), localWorksheetCollection.p().g(), paramCellArea, paramInt1, localArrayList1, localArrayList2);
          break;
        case 0: 
          zban.a(((Validation)localObject1).getAreaList(), localWorksheetCollection.p().g(), paramCellArea, paramInt1, localArrayList1, localArrayList2);
          break;
        }
        if (bool)
        {
          ((Validation)localObject1).getAreaList().clear();
          if (localArrayList1.size() != 0)
          {
            zf.a(((Validation)localObject1).getAreaList(), localArrayList1);
            a(false, (Validation)localObject1, paramCellArea, paramInt1, paramInt2, paramWorksheet, paramBoolean, k, m);
          }
          if (localArrayList2.size() != 0)
          {
            if (localArrayList1.size() != 0)
            {
              localObject2 = new Validation(this);
              ((Validation)localObject2).a((Validation)localObject1);
              localObject1 = localObject2;
              this.InnerList.add(i, localObject1);
              i++;
            }
            zf.a(((Validation)localObject1).getAreaList(), localArrayList2);
            Object localObject2 = ((Validation)localObject1).b();
            k = localObject2[0];
            m = localObject2[1];
            a(true, (Validation)localObject1, paramCellArea, paramInt1, paramInt2, paramWorksheet, paramBoolean, k, m);
          }
        }
        else
        {
          ((Validation)localObject1).getAreaList().clear();
          zf.a(((Validation)localObject1).getAreaList(), localArrayList1);
          zf.a(((Validation)localObject1).getAreaList(), localArrayList2);
          a(false, (Validation)localObject1, paramCellArea, paramInt1, paramInt2, paramWorksheet, paramBoolean, k, m);
        }
      }
    }
  }
  
  private void a(boolean paramBoolean1, Validation paramValidation, CellArea paramCellArea, int paramInt1, int paramInt2, Worksheet paramWorksheet, boolean paramBoolean2, int paramInt3, int paramInt4)
  {
    int i = paramInt3;
    int j = paramInt4;
    if (paramBoolean1) {
      switch (paramInt2)
      {
      case 1: 
        j += paramInt1;
        break;
      case 3: 
        j -= paramInt1;
        break;
      case 4: 
        i += paramInt1;
        break;
      case 0: 
        i -= paramInt1;
        break;
      }
    }
    byte[] arrayOfByte;
    if (paramValidation.c != null)
    {
      arrayOfByte = paramValidation.c;
      zaaq.a(paramCellArea, paramInt1, paramInt2, paramWorksheet, paramBoolean2, arrayOfByte, 0, arrayOfByte.length - 1, i, j, paramInt3, paramInt4);
      paramValidation.c = arrayOfByte;
    }
    if (((paramValidation.getOperator() == 0) || (paramValidation.getOperator() == 7)) && (paramValidation.d != null))
    {
      arrayOfByte = paramValidation.d;
      zaaq.a(paramCellArea, paramInt1, paramInt2, paramWorksheet, paramBoolean2, arrayOfByte, 0, arrayOfByte.length - 1, i, j, paramInt3, paramInt4);
      paramValidation.d = arrayOfByte;
    }
  }
  
  void a(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return;
    }
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      Validation localValidation = (Validation)localIterator.next();
      localValidation.a(paramInt1, paramInt2, this.a);
    }
  }
  
  void b(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return;
    }
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      Validation localValidation = (Validation)localIterator.next();
      localValidation.b(paramInt1, paramInt2, this.a);
    }
  }
  
  int b()
  {
    return this.b;
  }
  
  void a(int paramInt)
  {
    this.b = paramInt;
  }
  
  boolean c()
  {
    if (this.b != -1) {
      return true;
    }
    if (getCount() == 0) {
      return false;
    }
    String str = this.a.getActiveCell();
    int i = 0;
    int j = 0;
    int[] arrayOfInt1 = { i };
    int[] arrayOfInt2 = { j };
    CellsHelper.a(str, arrayOfInt1, arrayOfInt2);
    i = arrayOfInt1[0];
    j = arrayOfInt2[0];
    Iterator localIterator1 = iterator();
    while (localIterator1.hasNext())
    {
      Validation localValidation = (Validation)localIterator1.next();
      if ((localValidation.getType() == 3) && (localValidation.getInCellDropDown()))
      {
        ArrayList localArrayList = localValidation.getAreaList();
        if ((localArrayList != null) && (localArrayList.size() != 0))
        {
          Iterator localIterator2 = localArrayList.iterator();
          while (localIterator2.hasNext())
          {
            CellArea localCellArea = (CellArea)localIterator2.next();
            if ((i >= localCellArea.StartRow) && (i <= localCellArea.EndRow) && (j >= localCellArea.StartColumn) && (j <= localCellArea.EndColumn)) {
              return true;
            }
          }
        }
      }
    }
    return false;
  }
  
  void a(byte[] paramArrayOfByte)
  {
    int i = zc.a(paramArrayOfByte, 10);
    if (i != -1)
    {
      this.a.getShapes().e(i);
      this.b = -1;
    }
  }
  
  void d()
  {
    for (int i = getCount() - 1; i >= 0; i--)
    {
      Validation localValidation = get(i);
      if (localValidation.b.size() == 0)
      {
        removeAt(i);
      }
      else if (!localValidation.a)
      {
        if ((localValidation.c == null) && (localValidation.getType() != 0)) {
          throw new CellsException(2, "You must enter data for validation criteria.");
        }
        switch (localValidation.getType())
        {
        case 1: 
        case 2: 
        case 4: 
        case 5: 
        case 6: 
          if (!zbyi.b(localValidation, localValidation.c)) {
            throw new CellsException(2, "You must enter a numberic value or numberic expression as validation criteria.");
          }
          switch (localValidation.getOperator())
          {
          case 0: 
          case 7: 
            if (localValidation.d == null) {
              throw new CellsException(2, "You must enter data as validation criteria if the operator is between or notbetween.");
            }
            if (!zbyi.b(localValidation, localValidation.c)) {
              throw new CellsException(2, "You must enter a numberic value or numberic expression as validation criteria.");
            }
            break;
          }
          break;
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ValidationCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */