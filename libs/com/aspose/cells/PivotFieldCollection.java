package com.aspose.cells;

import com.aspose.cells.a.c.zy;
import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Iterator;

public class PivotFieldCollection
{
  ArrayList a;
  PivotTable b;
  int c;
  int d;
  
  PivotFieldCollection(PivotTable pivotTable, int fieldType)
  {
    this.b = pivotTable;
    this.a = new ArrayList();
    this.c = fieldType;
  }
  
  PivotFieldCollection(PivotTable pivotTable, zawp pivotCache)
  {
    this.b = pivotTable;
    this.a = new ArrayList();
    this.c = 0;
    int i = 0;
    if (pivotCache.i != null) {
      i = pivotCache.i.size();
    }
    for (int j = 0; j < i; j++) {
      if (!((zbtv)pivotCache.i.get(j)).o)
      {
        PivotField localPivotField = new PivotField(this);
        localPivotField.h = ((zbtv)pivotCache.i.get(j));
        localPivotField.a(j);
        zf.a(this.a, localPivotField);
      }
    }
  }
  
  PivotFieldCollection(PivotTable pivotTable, zawp pivotCache, int count)
  {
    this.b = pivotTable;
    this.a = new ArrayList();
    this.c = 0;
    for (int i = 0; i < count; i++)
    {
      PivotField localPivotField = new PivotField(this);
      localPivotField.h = new zbtv(pivotCache);
      localPivotField.a(i);
      zf.a(this.a, localPivotField);
    }
  }
  
  void a(zbtv paramzbtv)
  {
    this.b.g();
    PivotField localPivotField = new PivotField(this);
    localPivotField.c.a = 0;
    localPivotField.d.a = 13328;
    localPivotField.h = paramzbtv;
    localPivotField.a(getCount());
    zf.a(this.a, localPivotField);
  }
  
  public int getType()
  {
    return this.c;
  }
  
  public int getCount()
  {
    return this.a.size();
  }
  
  public PivotField get(int index)
  {
    return (PivotField)this.a.get(index);
  }
  
  public PivotField get(String name)
  {
    if (null == name) {
      return null;
    }
    String str = name.toUpperCase();
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      PivotField localPivotField = (PivotField)localIterator.next();
      if ((localPivotField.getName() != null) && (localPivotField.getName().toUpperCase().equals(str))) {
        return localPivotField;
      }
    }
    return null;
  }
  
  void a(int paramInt)
  {
    this.b.g();
    this.a.remove(paramInt);
  }
  
  boolean a()
  {
    for (int i = 0; i < this.a.size() - 1; i++)
    {
      PivotField localPivotField = (PivotField)this.a.get(i);
      if ((localPivotField.getInsertBlankRow()) && (!localPivotField.i())) {
        return true;
      }
    }
    return false;
  }
  
  int b()
  {
    int i = 0;
    for (int j = 0; j < this.a.size(); j++)
    {
      PivotField localPivotField = (PivotField)this.a.get(j);
      if (localPivotField.u) {
        i++;
      }
    }
    return i;
  }
  
  public int addByBaseIndex(int baseFieldIndex)
  {
    return add(this.b.getBaseFields().get(baseFieldIndex));
  }
  
  private void b(PivotField paramPivotField, int paramInt)
  {
    if (paramPivotField.i()) {
      return;
    }
    if (paramPivotField.isCalculatedField()) {
      return;
    }
    zbtv localzbtv = paramPivotField.h;
    if (localzbtv != null) {
      if (localzbtv.c == null)
      {
        if (localzbtv.t()) {
          throw new CellsException(12, "This pivot field has more unique items than can be used in a pivot table.");
        }
        if (localzbtv.a().h != null) {
          localzbtv.a().h.a(localzbtv);
        }
        if (localzbtv.t()) {
          throw new CellsException(12, "This pivot field has more unique items than can be used in a pivot table.");
        }
        if ((localzbtv.c != null) && (localzbtv.c.size() > paramInt)) {
          throw new CellsException(12, "This pivot field has more unique items than can be used in a pivot table.");
        }
      }
      else if (localzbtv.c.size() > paramInt)
      {
        throw new CellsException(12, "This pivot field has more unique items than can be used in a pivot table.");
      }
    }
  }
  
  public int add(PivotField pivotField)
  {
    this.b.g();
    if (pivotField == null) {
      throw new CellsException(12, "You could not null to the specific type PivotFields.");
    }
    if (pivotField.b.c != 0) {
      throw new CellsException(12, "This pivot field has been dragged to specific area.");
    }
    int i = pivotField.m;
    if (this.c == i) {
      return d(pivotField);
    }
    this.b.s = false;
    switch (this.c)
    {
    case 0: 
      throw new CellsException(12, "You could not add field to base fields");
    case 8: 
      pivotField.a(true);
      PivotField localPivotField = new PivotField(this, pivotField);
      zf.a(this.a, localPivotField);
      localPivotField.a(this.a.size() - 1);
      a(true, getCount() - 1);
      return getCount() - 1;
    case 2: 
      if (!pivotField.getDragToColumn()) {
        throw new CellsException(12, "This pivot field can't be dragged to the column position");
      }
      int j = 0;
      if (!this.b.a.a.d().h()) {
        j = 255;
      } else {
        j = 16383;
      }
      b(pivotField, j);
      if (i == 0)
      {
        pivotField.initPivotItems();
      }
      else
      {
        e(pivotField);
        pivotField.initPivotItems();
      }
      pivotField.m = this.c;
      zf.a(this.a, pivotField);
      return getCount() - 1;
    case 1: 
      if (!pivotField.getDragToRow()) {
        throw new CellsException(12, "This pivot field can't be dragged to the row position");
      }
      if (!this.b.a.a.d().h()) {
        b(pivotField, 32767);
      }
      if (i == 0)
      {
        pivotField.initPivotItems();
      }
      else
      {
        e(pivotField);
        pivotField.initPivotItems();
      }
      pivotField.m = this.c;
      zf.a(this.a, pivotField);
      int k = this.a.size() - 1;
      b(k);
      return k;
    case 4: 
      if (!pivotField.getDragToPage()) {
        throw new CellsException(12, "This pivot field can't be dragged to the page position");
      }
      if (pivotField.l != null) {
        throw new CellsException(12, "You could not add data field to the page fields");
      }
      b(pivotField, 32767);
      if (i == 0)
      {
        pivotField.initPivotItems();
      }
      else
      {
        e(pivotField);
        pivotField.initPivotItems();
      }
      if (getCount() + 1 > this.b.i) {
        this.b.i += 2;
      } else if (getCount() + 1 == this.b.i) {
        this.b.i += 1;
      }
      pivotField.j = new zbuo(pivotField);
      pivotField.m = this.c;
      zf.a(this.a, pivotField);
      return getCount() - 1;
    }
    return -1;
  }
  
  int a(PivotField paramPivotField, int paramInt)
  {
    this.b.g();
    if (paramPivotField == null) {
      throw new CellsException(12, "You could not null to the specific type PivotFields.");
    }
    if (paramPivotField.b.c != 0) {
      throw new CellsException(12, "This pivot field has been dragged to specific area.");
    }
    int i = paramPivotField.m;
    if (this.c == i) {
      return d(paramPivotField);
    }
    this.b.s = false;
    switch (this.c)
    {
    case 0: 
      throw new CellsException(12, "You could not add field to base fields");
    case 8: 
      if (paramPivotField.l != null) {
        throw new CellsException(12, "You could not add data field to the data fields");
      }
      paramPivotField.a(true);
      PivotField localPivotField = new PivotField(this, paramPivotField);
      zf.a(this.a, localPivotField);
      localPivotField.a(this.a.size() - 1);
      a(true, getCount() - 1);
      return getCount() - 1;
    case 2: 
      if (!paramPivotField.getDragToColumn()) {
        throw new CellsException(12, "This pivot field can't be dragged to the column position");
      }
      int j = 0;
      if (!this.b.a.a.d().h()) {
        j = 255;
      } else {
        j = 16383;
      }
      b(paramPivotField, j);
      if (i == 0) {
        paramPivotField.initPivotItems();
      } else {
        e(paramPivotField);
      }
      paramPivotField.m = this.c;
      this.a.add(paramInt, paramPivotField);
      return getCount() - 1;
    case 1: 
      if (!paramPivotField.getDragToRow()) {
        throw new CellsException(12, "This pivot field can't be dragged to the row position");
      }
      b(paramPivotField, 32767);
      if (i == 0) {
        paramPivotField.initPivotItems();
      } else {
        e(paramPivotField);
      }
      paramPivotField.m = this.c;
      this.a.add(paramInt, paramPivotField);
      b(paramInt);
      return paramInt;
    case 4: 
      if (!paramPivotField.getDragToPage()) {
        throw new CellsException(12, "This pivot field can't be dragged to the page position");
      }
      if (paramPivotField.l != null) {
        throw new CellsException(12, "You could not add data field to the page fields");
      }
      b(paramPivotField, 32767);
      if (i == 0) {
        paramPivotField.initPivotItems();
      } else {
        e(paramPivotField);
      }
      if (getCount() + 1 > this.b.i) {
        this.b.i += 2;
      } else if (getCount() + 1 == this.b.i) {
        this.b.i += 1;
      }
      paramPivotField.j = new zbuo(paramPivotField);
      paramPivotField.m = this.c;
      this.a.add(paramInt, paramPivotField);
      return getCount() - 1;
    }
    return -1;
  }
  
  void c()
  {
    int i = getCount();
    if (i <= 1) {
      return;
    }
    for (int j = 0; j < i; j++) {
      b(j);
    }
  }
  
  private void b(int paramInt)
  {
    if (getCount() <= 1) {
      return;
    }
    switch (this.b.getAutoFormatType())
    {
    case 2: 
    case 3: 
    case 4: 
    case 9: 
    case 10: 
    case 12: 
    case 13: 
    case 14: 
    case 15: 
    case 16: 
    case 18: 
      if (paramInt == 0)
      {
        get(0).setInsertBlankRow(true);
        get(1).setInsertBlankRow(false);
      }
      else
      {
        get(paramInt).setInsertBlankRow(false);
      }
      break;
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 11: 
      if (paramInt == getCount() - 1)
      {
        get(paramInt).setInsertBlankRow(false);
        get(paramInt - 1).setInsertBlankRow(true);
      }
      else
      {
        get(paramInt).setInsertBlankRow(true);
      }
      break;
    }
  }
  
  void a(PivotField paramPivotField)
  {
    this.b.g();
    zf.a(this.a, paramPivotField);
  }
  
  void b(PivotField paramPivotField)
  {
    this.b.g();
    if (this.c == 0) {
      return;
    }
    this.b.s = false;
    for (int i = 0; i < getCount(); i++) {
      if (get(i).getBaseIndex() == paramPivotField.getBaseIndex())
      {
        a(i);
        i--;
      }
    }
    if (this.c == 8) {
      paramPivotField.a(false);
    } else {
      paramPivotField.m = 0;
    }
  }
  
  public void clear()
  {
    this.b.g();
    int i;
    if (this.c == 8)
    {
      if ((this.b.f != null) && (getCount() > 1)) {
        c(this.b.f);
      } else {
        for (i = getCount() - 1; i >= 0; i--) {
          c(get(i));
        }
      }
    }
    else if ((this.c == 1) || (this.c == 2))
    {
      if (this.b.f != null) {
        c(this.b.f);
      }
      for (i = getCount() - 1; i >= 0; i--) {
        c(get(i));
      }
    }
    else if (this.c == 4)
    {
      for (i = getCount() - 1; i >= 0; i--) {
        c(get(i));
      }
    }
  }
  
  void c(PivotField paramPivotField)
  {
    this.b.g();
    if (this.c == 0) {
      return;
    }
    this.b.s = false;
    int i = this.b.getDataFields().getCount();
    for (int j = 0; j < getCount(); j++) {
      if (get(j).getBaseIndex() == paramPivotField.getBaseIndex())
      {
        a(j);
        j--;
      }
    }
    this.b.d();
    if (this.c == 8)
    {
      paramPivotField.a(false);
      if (this.b.f != null)
      {
        if (this.b.f.m == 1)
        {
          this.b.getRowFields().c(this.b.f);
          this.b.g = null;
        }
        else if (this.b.f.m == 2)
        {
          this.b.getColumnFields().c(this.b.f);
          this.b.h = null;
        }
        this.b.f = null;
      }
    }
    else
    {
      if ((paramPivotField == this.b.f) && (i > 1))
      {
        this.b.b.c.a.clear();
        this.b.f = null;
        for (j = 0; j < this.b.getBaseFields().getCount(); j++)
        {
          PivotField localPivotField = this.b.getBaseFields().get(j);
          if (localPivotField.h()) {
            localPivotField.a(false);
          }
        }
      }
      paramPivotField.m = 0;
    }
  }
  
  private void a(boolean paramBoolean, int paramInt)
  {
    PivotFieldCollection localPivotFieldCollection1 = this.b.getDataFields();
    PivotField localPivotField = this.b.f;
    PivotFieldCollection localPivotFieldCollection2 = null;
    if (localPivotField != null)
    {
      int i = this.b.getRowFields().d(localPivotField);
      if (i == -1) {
        localPivotFieldCollection2 = this.b.getColumnFields();
      } else {
        localPivotFieldCollection2 = this.b.getRowFields();
      }
    }
    if (localPivotFieldCollection1.getCount() <= 1)
    {
      if (localPivotField == null) {
        return;
      }
      localPivotFieldCollection2.c(localPivotField);
      this.b.f = null;
    }
    else
    {
      if (localPivotField == null)
      {
        localPivotField = this.b.f = new PivotField(this.b, localPivotFieldCollection1);
        localPivotField.a(65534);
        localPivotFieldCollection2 = this.b.getRowFields();
        zf.a(localPivotFieldCollection2.a, localPivotField);
        return;
      }
      if (paramBoolean)
      {
        PivotItem localPivotItem1 = new PivotItem(localPivotField.e);
        localPivotField.e.a(localPivotItem1);
        localPivotItem1.setIndex(paramInt);
        localPivotItem1.e = localPivotFieldCollection1.get(paramInt);
      }
      else
      {
        int j = localPivotField.e.getCount();
        localPivotField.e.a(paramInt);
        if (paramInt != j - 1)
        {
          int k = 0;
          Iterator localIterator = localPivotField.e.b.iterator();
          while (localIterator.hasNext())
          {
            PivotItem localPivotItem2 = (PivotItem)localIterator.next();
            localPivotItem2.setIndex(k++);
          }
        }
      }
    }
  }
  
  int d(PivotField paramPivotField)
  {
    int i = -1;
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      PivotField localPivotField = (PivotField)localIterator.next();
      i++;
      if (localPivotField == paramPivotField) {
        return i;
      }
      if (localPivotField.getBaseIndex() == paramPivotField.getBaseIndex()) {
        return i;
      }
    }
    return -1;
  }
  
  PivotField a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      PivotField localPivotField = (PivotField)localIterator.next();
      if ((localPivotField.getName() != null) && (zy.a(localPivotField.getName(), paramString))) {
        return localPivotField;
      }
    }
    return null;
  }
  
  void e(PivotField paramPivotField)
  {
    this.b.g();
    zbuz localzbuz = this.b.b;
    switch (paramPivotField.m)
    {
    case 2: 
      localzbuz.e.b(paramPivotField);
      break;
    case 1: 
      localzbuz.d.b(paramPivotField);
      break;
    case 8: 
      paramPivotField.b = this.b.getBaseFields();
      localzbuz.c.b(paramPivotField);
      paramPivotField.k.a(false);
      break;
    case 4: 
      paramPivotField.j.a = null;
      paramPivotField.j = null;
      localzbuz.f.b(paramPivotField);
      break;
    case 0: 
      throw new CellsException(12, "Can't remove the base field from BaseFields.");
    case 3: 
    case 5: 
    case 6: 
    case 7: 
    default: 
      throw new CellsException(12, "Invalid field type");
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/PivotFieldCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */