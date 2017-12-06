package com.aspose.cells;

import com.aspose.cells.a.c.zg;
import com.aspose.cells.a.c.zy;
import com.aspose.cells.b.a.a.zd;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class NameCollection
  extends CollectionBase
{
  private WorksheetCollection a;
  private HashMap b;
  
  NameCollection(WorksheetCollection sheets)
  {
    this.a = sheets;
  }
  
  WorksheetCollection a()
  {
    return this.a;
  }
  
  Range[] a(WorksheetCollection paramWorksheetCollection)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < this.InnerList.size(); i++)
    {
      Name localName = (Name)this.InnerList.get(i);
      if (localName.r() != 0)
      {
        Range localRange = localName.getRange();
        if (localRange != null) {
          zf.a(localArrayList, localRange);
        }
      }
    }
    if (localArrayList.size() == 0) {
      return null;
    }
    Range[] arrayOfRange = new Range[localArrayList.size()];
    zf.a(localArrayList, arrayOfRange);
    return arrayOfRange;
  }
  
  public int add(String text)
  {
    int i = -1;
    int[] arrayOfInt = { i };
    text = a(text, arrayOfInt);
    i = arrayOfInt[0];
    return a(i, text);
  }
  
  int a(int paramInt, String paramString)
  {
    int i = a(paramString, paramInt, false);
    if (i != -1) {
      return i;
    }
    Name localName = new Name(this.a, paramString);
    localName.setSheetIndex(paramInt + 1);
    return a(localName, true);
  }
  
  int b(int paramInt, String paramString)
  {
    int i = a(paramString, paramInt, false);
    if (i != -1) {
      return i;
    }
    Name localName = new Name(this.a);
    localName.g(paramString);
    localName.setSheetIndex(paramInt + 1);
    return a(localName, true);
  }
  
  int c(int paramInt, String paramString)
  {
    int i = a(paramString, paramInt, false);
    if (i != -1) {
      return i;
    }
    Name localName = new Name(this.a, paramString, paramInt + 1);
    return a(localName, true);
  }
  
  int d(int paramInt, String paramString)
  {
    int i = a(paramString, paramInt, true);
    if (i != -1) {
      return i;
    }
    Name localName = new Name(this.a, paramString);
    localName.setSheetIndex(paramInt + 1);
    return a(localName, true);
  }
  
  private HashMap d()
  {
    if (this.b == null)
    {
      this.b = zg.a();
      for (int i = 0; i < getCount(); i++)
      {
        Name localName = get(i);
        String str = g(localName.getSheetIndex() - 1, localName.getText());
        if (this.b.get(str) == null) {
          this.b.put(str, Integer.valueOf(i));
        }
      }
    }
    return this.b;
  }
  
  int a(Name paramName, boolean paramBoolean)
  {
    int i = getCount();
    if (paramBoolean)
    {
      String str = g(paramName.getSheetIndex() - 1, paramName.getText());
      d().put(str, Integer.valueOf(i));
    }
    zf.a(this.InnerList, paramName);
    return i;
  }
  
  void a(boolean paramBoolean)
  {
    int i;
    Name localName;
    if (paramBoolean) {
      for (i = 0; i < getCount(); i++)
      {
        localName = get(i);
        if (localName.b() == null) {
          localName.setRefersTo(localName.getRefersTo());
        }
      }
    } else {
      for (i = 0; i < getCount(); i++)
      {
        localName = get(i);
        if (localName.b() == null) {
          localName.i(localName.getRefersTo());
        }
      }
    }
  }
  
  public Name get(int index)
  {
    return (Name)this.InnerList.get(index);
  }
  
  public Name get(String text)
  {
    int i = -1;
    int[] arrayOfInt = { i };
    text = a(text, arrayOfInt);
    i = arrayOfInt[0];
    int j = a(text, i, false);
    if (j == -1) {
      return null;
    }
    return get(j);
  }
  
  private void a(HashMap paramHashMap)
  {
    this.b = null;
    Object localObject2;
    int i1;
    Object localObject6;
    for (int i = 0; i < this.a.getCount(); i++)
    {
      localObject1 = this.a.get(i);
      localObject2 = ((Worksheet)localObject1).getCells().a;
      if (((zabw)localObject2).c > 0)
      {
        localObject3 = ((zabw)localObject2).b;
        for (int n = ((zabw)localObject2).d - 1; n > -1; n--) {
          if (localObject3[n] != null)
          {
            Object localObject4 = localObject3[n];
            if (((zaai)localObject4).a() != null) {
              zaaq.a(((zaai)localObject4).a().c(), -1, -1, paramHashMap, this.a);
            } else {
              zaaq.a(((zaai)localObject4).b, -1, -1, paramHashMap, this.a);
            }
          }
        }
      }
      if ((((Worksheet)localObject1).w() != null) && (((Worksheet)localObject1).getCharts().getCount() > 0)) {
        ((Worksheet)localObject1).getCharts().b(paramHashMap);
      }
      localObject3 = ((Worksheet)localObject1).getConditionalFormattings();
      Object localObject7;
      for (int m = 0; m < ((ConditionalFormattingCollection)localObject3).getCount(); m++)
      {
        FormatConditionCollection localFormatConditionCollection = ((ConditionalFormattingCollection)localObject3).get(m);
        if (localFormatConditionCollection.getRangeCount() != 0) {
          for (int i2 = 0; i2 < localFormatConditionCollection.getCount(); i2++)
          {
            localObject7 = localFormatConditionCollection.get(i2);
            ((FormatCondition)localObject7).f();
            byte[] arrayOfByte;
            if (((FormatCondition)localObject7).a() != null)
            {
              arrayOfByte = ((FormatCondition)localObject7).a();
              zaaq.a(arrayOfByte, -1, arrayOfByte.length - 1, paramHashMap, this.a);
            }
            if (((FormatCondition)localObject7).c() != null)
            {
              arrayOfByte = ((FormatCondition)localObject7).c();
              zaaq.a(arrayOfByte, -1, arrayOfByte.length - 1, paramHashMap, this.a);
            }
          }
        }
      }
      localObject5 = ((Worksheet)localObject1).getValidations();
      for (i1 = 0; i1 < ((ValidationCollection)localObject5).getCount(); i1++)
      {
        localObject6 = ((ValidationCollection)localObject5).get(i1);
        if (((Validation)localObject6).c != null)
        {
          localObject7 = (byte[])((Validation)localObject6).c;
          zaaq.a((byte[])localObject7, 0, localObject7.length - 1, paramHashMap, this.a);
        }
        if (((Validation)localObject6).d != null)
        {
          localObject7 = (byte[])((Validation)localObject6).d;
          zaaq.a((byte[])localObject7, 0, localObject7.length - 1, paramHashMap, this.a);
        }
      }
    }
    zd localzd = new zd();
    Object localObject1 = paramHashMap.keySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = ((Iterator)localObject1).next();
      localzd.a(localObject2, paramHashMap.get(localObject2));
    }
    int j = 0;
    int k = -1;
    Object localObject3 = new HashMap();
    Object localObject5 = localzd.c().iterator();
    while (((Iterator)localObject5).hasNext())
    {
      i1 = ((Integer)((Iterator)localObject5).next()).intValue();
      if (((Boolean)localzd.d(Integer.valueOf(i1))).booleanValue())
      {
        localObject6 = (Name)this.InnerList.get(i1);
        ((Name)localObject6).w();
      }
      else
      {
        if ((k != -1) && (k + 1 != i1))
        {
          k++;
          while (k < i1)
          {
            ((HashMap)localObject3).put(Integer.valueOf(k), Integer.valueOf(k - j));
            k++;
          }
        }
        k = i1;
        j++;
      }
    }
    if (k == -1) {
      return;
    }
    if (k < getCount())
    {
      k++;
      while (k < getCount())
      {
        ((HashMap)localObject3).put(Integer.valueOf(k), Integer.valueOf(k - j));
        k++;
      }
    }
    j = 0;
    localObject5 = localzd.c().iterator();
    while (((Iterator)localObject5).hasNext())
    {
      i1 = ((Integer)((Iterator)localObject5).next()).intValue();
      if (!((Boolean)localzd.d(Integer.valueOf(i1))).booleanValue())
      {
        this.InnerList.remove(i1 - j);
        j++;
      }
    }
    b((HashMap)localObject3);
  }
  
  public void remove(String[] names)
  {
    HashMap localHashMap = new HashMap();
    for (int i = 0; i < names.length; i++)
    {
      String str = names[i];
      int j = -1;
      int[] arrayOfInt = { j };
      str = a(str, arrayOfInt);
      j = arrayOfInt[0];
      int k = a(str, j, false);
      if (k != -1) {
        localHashMap.put(Integer.valueOf(k), Boolean.valueOf(false));
      }
    }
    a(localHashMap);
  }
  
  public void remove(String text)
  {
    int i = -1;
    int[] arrayOfInt = { i };
    text = a(text, arrayOfInt);
    i = arrayOfInt[0];
    int j = a(text, i, false);
    if (j != -1) {
      removeAt(j);
    }
  }
  
  public void removeAt(int index)
  {
    Name localName = get(index);
    if (localName.isReferred())
    {
      localName.w();
      return;
    }
    this.b = null;
    HashMap localHashMap = new HashMap();
    for (int i = index + 1; i < getCount(); i++) {
      localHashMap.put(Integer.valueOf(i), Integer.valueOf(i - 1));
    }
    this.InnerList.remove(index);
    b(localHashMap);
  }
  
  private boolean[] e()
  {
    HashMap localHashMap = new HashMap();
    for (int i = 0; i < getCount(); i++) {
      localHashMap.put(Integer.valueOf(i), znq.e);
    }
    Cell localCell = null;
    for (int j = 0; j < this.a.getCount(); j++)
    {
      Cells localCells = this.a.get(j).getCells();
      for (int m = 0; m < localCells.getRows().getCount(); m++)
      {
        localObject1 = localCells.getRows().getRowByIndex(m);
        for (n = 0; n < ((Row)localObject1).a(); n++)
        {
          localCell = ((Row)localObject1).getCellByIndex(n);
          if (localCell.g()) {
            if (localCell.F() != null) {
              zaaq.a(localCell.F().c(), -1, -1, localHashMap, this.a);
            } else {
              zaaq.a(localCell.v(), -1, -1, localHashMap, this.a);
            }
          }
        }
      }
      Worksheet localWorksheet = this.a.get(j);
      if ((localWorksheet.w() != null) && (localWorksheet.getCharts().getCount() > 0)) {
        localWorksheet.getCharts().b(localHashMap);
      }
      Object localObject1 = localWorksheet.getConditionalFormattings();
      Object localObject2;
      for (int n = 0; n < ((ConditionalFormattingCollection)localObject1).getCount(); n++)
      {
        FormatConditionCollection localFormatConditionCollection = ((ConditionalFormattingCollection)localObject1).get(n);
        for (int i2 = 0; i2 < localFormatConditionCollection.getCount(); i2++)
        {
          localObject2 = localFormatConditionCollection.get(i2);
          ((FormatCondition)localObject2).f();
          byte[] arrayOfByte;
          if (((FormatCondition)localObject2).a() != null)
          {
            arrayOfByte = ((FormatCondition)localObject2).a();
            zaaq.a(arrayOfByte, -1, arrayOfByte.length - 1, localHashMap, this.a);
          }
          if (((FormatCondition)localObject2).c() != null)
          {
            arrayOfByte = ((FormatCondition)localObject2).c();
            zaaq.a(arrayOfByte, -1, arrayOfByte.length - 1, localHashMap, this.a);
          }
        }
      }
      ValidationCollection localValidationCollection = localWorksheet.getValidations();
      for (int i1 = 0; i1 < localValidationCollection.getCount(); i1++)
      {
        Validation localValidation = localValidationCollection.get(i1);
        if (localValidation.c != null)
        {
          localObject2 = (byte[])localValidation.c;
          zaaq.a((byte[])localObject2, 0, localObject2.length - 1, localHashMap, this.a);
        }
        if (localValidation.d != null)
        {
          localObject2 = (byte[])localValidation.d;
          zaaq.a((byte[])localObject2, 0, localObject2.length - 1, localHashMap, this.a);
        }
      }
    }
    boolean[] arrayOfBoolean = new boolean[getCount()];
    for (int k = 0; k < getCount(); k++) {
      arrayOfBoolean[k] = ((Boolean)localHashMap.get(Integer.valueOf(k))).booleanValue();
    }
    return arrayOfBoolean;
  }
  
  public void clear()
  {
    boolean[] arrayOfBoolean = e();
    HashMap localHashMap = new HashMap();
    this.b = null;
    int i = 0;
    for (int j = 0; j < getCount(); j++)
    {
      Name localName = get(j);
      if (arrayOfBoolean[i] != 0)
      {
        localHashMap.put(Integer.valueOf(i), Integer.valueOf(localHashMap.size()));
        localName.w();
      }
      else
      {
        this.InnerList.remove(j--);
      }
      i++;
    }
    b(localHashMap);
  }
  
  void b()
  {
    this.b = null;
    this.InnerList.clear();
  }
  
  public void removeDuplicateNames()
  {
    c();
    this.b = null;
    HashMap localHashMap = new HashMap();
    boolean[] arrayOfBoolean = new boolean[getCount()];
    int i = 0;
    for (int j = 0; j < getCount(); j++) {
      if (arrayOfBoolean[j] != 0)
      {
        i++;
      }
      else
      {
        Name localName1 = get(j);
        localHashMap.put(Integer.valueOf(j), Integer.valueOf(j - i));
        for (int k = j + 1; k < getCount(); k++)
        {
          Name localName2 = get(k);
          if ((localName1.getSheetIndex() == localName2.getSheetIndex()) && (zw.a(localName1.k(), localName2.k(), true) == 0))
          {
            arrayOfBoolean[k] = true;
            localHashMap.put(Integer.valueOf(k), Integer.valueOf(j - i));
          }
        }
      }
    }
    for (j = 0; j < getCount(); j++) {
      if (arrayOfBoolean[j] != 0) {
        this.InnerList.remove(j);
      }
    }
    b(localHashMap);
  }
  
  public void sort()
  {
    c();
    this.b = null;
    HashMap localHashMap = zaqi.a(this.a);
    b(localHashMap);
  }
  
  private void b(HashMap paramHashMap)
  {
    if (paramHashMap.size() == 0) {
      return;
    }
    Object localObject1;
    for (int i = 0; i < getCount(); i++)
    {
      localObject1 = get(i).b();
      if (localObject1 != null) {
        zaaq.b((byte[])localObject1, -1, localObject1.length - 1, paramHashMap, this.a);
      }
    }
    for (i = 0; i < this.a.getCount(); i++)
    {
      localObject1 = this.a.get(i);
      zabw localzabw = ((Worksheet)localObject1).getCells().a;
      if (localzabw.c > 0)
      {
        localObject2 = localzabw.b;
        for (int k = localzabw.d - 1; k > -1; k--) {
          if (localObject2[k] != null)
          {
            Object localObject3 = localObject2[k];
            if (((zaai)localObject3).a() != null) {
              zaaq.b(((zaai)localObject3).a().c(), -1, -1, paramHashMap, a());
            } else {
              zaaq.b(((zaai)localObject3).b, -1, -1, paramHashMap, a());
            }
          }
        }
      }
      if (((Worksheet)localObject1).w() != null) {
        ((Worksheet)localObject1).getShapes().a(paramHashMap);
      }
      Object localObject2 = this.a.get(i).getConditionalFormattings();
      Object localObject5;
      Object localObject6;
      for (int j = 0; j < ((ConditionalFormattingCollection)localObject2).getCount(); j++)
      {
        FormatConditionCollection localFormatConditionCollection = ((ConditionalFormattingCollection)localObject2).get(j);
        for (int n = 0; n < localFormatConditionCollection.getCount(); n++)
        {
          localObject5 = localFormatConditionCollection.get(n);
          ((FormatCondition)localObject5).f();
          if (((FormatCondition)localObject5).a() != null)
          {
            localObject6 = (byte[])((FormatCondition)localObject5).a();
            zaaq.b((byte[])localObject6, -1, localObject6.length - 1, paramHashMap, this.a);
          }
          if (((FormatCondition)localObject5).c() != null)
          {
            localObject6 = (byte[])((FormatCondition)localObject5).c();
            zaaq.b((byte[])localObject6, -1, localObject6.length - 1, paramHashMap, this.a);
          }
        }
      }
      ValidationCollection localValidationCollection = ((Worksheet)localObject1).getValidations();
      Object localObject4;
      for (int m = 0; m < localValidationCollection.getCount(); m++)
      {
        localObject4 = localValidationCollection.get(m);
        if (((Validation)localObject4).c != null)
        {
          localObject5 = (byte[])((Validation)localObject4).c;
          zaaq.b((byte[])localObject5, 0, localObject5.length - 1, paramHashMap, this.a);
        }
        if (((Validation)localObject4).d != null)
        {
          localObject5 = (byte[])((Validation)localObject4).d;
          zaaq.b((byte[])localObject5, 0, localObject5.length - 1, paramHashMap, this.a);
        }
      }
      ListObjectCollection localListObjectCollection = ((Worksheet)localObject1).getListObjects();
      if (localListObjectCollection.getCount() > 0)
      {
        localObject4 = localListObjectCollection.iterator();
        while (((Iterator)localObject4).hasNext())
        {
          localObject5 = (ListObject)((Iterator)localObject4).next();
          localObject6 = ((ListObject)localObject5).getListColumns().iterator();
          while (((Iterator)localObject6).hasNext())
          {
            ListColumn localListColumn = (ListColumn)((Iterator)localObject6).next();
            byte[] arrayOfByte = (byte[])localListColumn.e;
            if (arrayOfByte != null) {
              zaaq.b(arrayOfByte, -1, arrayOfByte.length - 1, paramHashMap, this.a);
            }
          }
        }
      }
    }
  }
  
  int a(String paramString, int paramInt, boolean paramBoolean)
  {
    Object localObject = d().get(g(paramInt, paramString));
    if (localObject != null) {
      return ((Integer)localObject).intValue();
    }
    if ((paramBoolean) && (paramInt >= 0))
    {
      localObject = d().get(paramString);
      if (localObject != null) {
        return ((Integer)localObject).intValue();
      }
    }
    return -1;
  }
  
  Name a(String paramString, int paramInt)
  {
    int i = a(paramString, paramInt, false);
    if (i == -1) {
      return null;
    }
    return get(i);
  }
  
  int b(String paramString, int paramInt)
  {
    return a(paramString, paramInt, false);
  }
  
  int[] a(int paramInt, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = -1;
    int j = paramString.indexOf("!");
    int k = -1;
    int m = -1;
    int n = 0;
    if ((j == -1) && (!"".equals(paramString)) && (paramString.charAt(0) == '['))
    {
      j = paramString.indexOf(']');
      n = j != -1 ? 1 : 0;
    }
    Object localObject;
    if (j != -1)
    {
      localObject = paramString.substring(0, 0 + (j + (n != 0 ? 1 : 0)));
      paramString = paramString.substring(j + 1);
      int[] arrayOfInt = zaap.a(this.a, (String)localObject, true);
      k = arrayOfInt[0];
      int i1 = arrayOfInt[1];
      i = arrayOfInt[2];
      int i2 = arrayOfInt[3];
      if (i1 != this.a.v())
      {
        zbti localzbti = this.a.w().a(i1);
        if (localzbti.b().size() > 0) {
          for (int i3 = 0; i3 < localzbti.b().size(); i3++)
          {
            zwh localzwh2 = (zwh)localzbti.b().get(i3);
            if (zy.a(localzwh2.e(), paramString)) {
              m = i3;
            }
          }
        }
        if (m == -1)
        {
          zwh localzwh1 = new zwh(localzbti);
          localzwh1.a(paramString);
          m = zf.a(localzbti.b(), localzwh1);
        }
        return new int[] { k, m };
      }
      if (i != -1) {
        m = a(paramString, i, true);
      } else {
        m = a(paramString, paramInt, true);
      }
    }
    else
    {
      m = a(paramString, paramInt, true);
    }
    if (m == -1)
    {
      if (paramBoolean2)
      {
        localObject = new Name(this.a, paramString);
        ((Name)localObject).setSheetIndex(i + 1);
        m = a((Name)localObject, true);
        if (paramBoolean1) {
          ((Name)localObject).a(14);
        }
      }
    }
    else if (k != -1)
    {
      localObject = get(m);
      if (((Name)localObject).getSheetIndex() == 0) {
        k = -1;
      }
    }
    return new int[] { k, m };
  }
  
  void e(int paramInt, String paramString)
  {
    int i = a(paramString, paramInt, false);
    if (i > -1)
    {
      Name localName = get(i);
      if (localName.r() == 0)
      {
        localName.a(true);
        localName.w();
      }
    }
  }
  
  void a(int paramInt)
  {
    HashMap localHashMap = new HashMap();
    for (int i = 0; i < this.InnerList.size(); i++)
    {
      Name localName = (Name)this.InnerList.get(i);
      if (localName.getSheetIndex() == paramInt + 1) {
        localHashMap.put(Integer.valueOf(i), Boolean.valueOf(false));
      } else if (localName.getSheetIndex() > paramInt + 1) {
        localName.v();
      }
    }
    a(localHashMap);
  }
  
  void b(int paramInt)
  {
    paramInt++;
    this.b = null;
    for (int i = 0; i < this.InnerList.size(); i++)
    {
      Name localName = (Name)this.InnerList.get(i);
      if (localName.getSheetIndex() >= paramInt) {
        localName.setSheetIndex(localName.getSheetIndex() + 1);
      }
    }
  }
  
  void a(int paramInt1, int paramInt2)
  {
    this.b = null;
    for (int i = 0; i < this.InnerList.size(); i++)
    {
      Name localName = (Name)this.InnerList.get(i);
      int j = localName.getSheetIndex() - 1;
      if (j == paramInt1) {
        localName.setSheetIndex(paramInt2 + 1);
      } else if (paramInt1 > paramInt2)
      {
        if ((j < paramInt1) && (j >= paramInt2)) {
          localName.setSheetIndex(localName.getSheetIndex() + 1);
        }
      }
      else if ((paramInt1 < paramInt2) && (j > paramInt1) && (j <= paramInt2)) {
        localName.setSheetIndex(localName.getSheetIndex() - 1);
      }
    }
  }
  
  void a(NameCollection paramNameCollection, CopyOptions paramCopyOptions)
  {
    this.InnerList.clear();
    this.b = null;
    for (int i = 0; i < paramNameCollection.getCount(); i++)
    {
      Name localName1 = (Name)paramNameCollection.InnerList.get(i);
      Name localName2 = new Name(this.a);
      localName2.a(localName1, paramCopyOptions);
      a(localName2, false);
      localName1 = null;
      localName2 = null;
    }
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3)
  {
    for (int i = 0; i < getCount(); i++)
    {
      Name localName = get(i);
      if (((localName.getSheetIndex() == 0) || (localName.getSheetIndex() == paramInt1 + 1)) && (localName.b() != null)) {
        localName.b(paramInt1, paramInt2, paramInt3);
      }
    }
  }
  
  void b(int paramInt1, int paramInt2, int paramInt3)
  {
    for (int i = 0; i < getCount(); i++)
    {
      Name localName = get(i);
      if (((localName.getSheetIndex() == 0) || (localName.getSheetIndex() == paramInt1 + 1)) && (localName.b() != null)) {
        localName.a(paramInt1, paramInt2, paramInt3);
      }
    }
  }
  
  void a(Worksheet paramWorksheet, CellArea paramCellArea, int paramInt1, int paramInt2)
  {
    for (int i = 0; i < getCount(); i++)
    {
      Name localName = get(i);
      if (((localName.getSheetIndex() == 0) || (localName.getSheetIndex() == paramWorksheet.getIndex() + 1)) && (localName.b() != null))
      {
        zaaq.a(paramCellArea, paramInt1, paramInt2, paramWorksheet, false, localName.b(), -1, -1, 0, 0, 0, 0);
        localName.h(null);
      }
    }
  }
  
  void c()
  {
    for (int i = 0; i < this.a.getCount(); i++)
    {
      Worksheet localWorksheet = this.a.get(i);
      try
      {
        if (localWorksheet.hasAutofilter())
        {
          int j = a(i, "_FILTERDATABASE");
          Name localName = get(j);
          localName.a(true);
          localName.setSheetIndex(i + 1);
          localName.f("_FILTERDATABASE");
          localName.a(i, localWorksheet.getAutoFilter().i());
        }
        else
        {
          e(i, "_FILTERDATABASE");
        }
      }
      catch (Exception localException)
      {
        throw new CellsException(6, "error in set autofilter");
      }
    }
  }
  
  Range[] f(int paramInt, String paramString)
  {
    int i = a(paramString, paramInt, false);
    if (i < 0) {
      return null;
    }
    Name localName = get(i);
    return localName.c(16);
  }
  
  void a(int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    int i;
    Name localName;
    if ((paramString2 == null) || ("".equals(paramString2)))
    {
      i = a(paramString1, paramInt, false);
      if (i > -1)
      {
        localName = get(i);
        localName.a(true);
        localName.w();
      }
    }
    else
    {
      i = a(paramInt, paramString1);
      localName = get(i);
      localName.f(paramString1);
      localName.a(a().y().a(paramInt, paramString2, 0, 0, 2, 32, false, true, true));
      localName.b.a();
    }
  }
  
  void a(Name paramName, String paramString)
  {
    if (this.b != null)
    {
      String str2;
      if (paramName.getText() == null)
      {
        int i = paramName.j();
        if (i != -1)
        {
          str2 = g(paramName.getSheetIndex() - 1, paramString);
          this.b.put(str2, Integer.valueOf(i));
        }
      }
      else
      {
        String str1 = g(paramName.getSheetIndex() - 1, paramName.getText());
        str2 = g(paramName.getSheetIndex() - 1, paramString);
        if (this.b.get(str2) != null) {
          throw new CellsException(7, "The defined name[" + paramString + "] already exists.");
        }
        Object localObject = this.b.get(str1);
        if (localObject != null)
        {
          this.b.remove(str1);
          this.b.put(str2, localObject);
        }
      }
    }
  }
  
  private static String g(int paramInt, String paramString)
  {
    if (paramInt < 0) {
      return paramString;
    }
    return paramInt + "!" + paramString;
  }
  
  private String a(String paramString, int[] paramArrayOfInt)
  {
    paramArrayOfInt[0] = -1;
    int i = paramString.lastIndexOf('!');
    if (i > 0)
    {
      String str = paramString.substring(0, 0 + i);
      if (str.charAt(0) == '\'') {
        str = str.substring(1, 1 + (str.length() - 2));
      }
      for (int j = 0; j < this.a.getCount(); j++) {
        if (zy.a(this.a.get(j).getName(), str))
        {
          paramArrayOfInt[0] = j;
          paramString = paramString.substring(i + 1);
          break;
        }
      }
    }
    return paramString;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/NameCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */