package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;

public class PivotItem
{
  PivotItemCollection a;
  int b;
  int c;
  String d;
  PivotField e;
  private int j;
  boolean f;
  boolean g;
  boolean h;
  Object i;
  
  PivotItem(PivotItemCollection pivotItems)
  {
    this.a = pivotItems;
    this.b = 0;
    this.j = -1;
  }
  
  /**
   * @deprecated
   */
  public void hide(boolean value)
  {
    setHidden(value);
  }
  
  public boolean isHidden()
  {
    return b(1);
  }
  
  public void setHidden(boolean value)
  {
    a(value, 1);
  }
  
  public void setPosition(int value)
  {
    int k = e();
    int m = value;
    if (m < 0) {
      m = 0;
    }
    if (m >= this.a.getCount()) {
      m = this.a.getCount() - 1;
    }
    move(m - k);
  }
  
  public void setPositionInSameParentNode(int value)
  {
    int k = e();
    int m = value;
    int n = this.a.a.getPosition();
    if (n == 0)
    {
      move(m);
      return;
    }
    int i1 = this.a.a.m;
    ArrayList localArrayList1 = null;
    if (i1 == 1) {
      localArrayList1 = this.a.a.k.b.b.g;
    }
    if (i1 == 2) {
      localArrayList1 = this.a.a.k.b.b.h;
    }
    if ((localArrayList1 == null) || (localArrayList1.size() == 0) || (((int[])localArrayList1.get(0)).length < 4 + n + 1)) {
      return;
    }
    int i2 = -1;
    int i3 = 4 + n - 1;
    ArrayList localArrayList2 = new ArrayList();
    int i4 = localArrayList1.size();
    int[] arrayOfInt = null;
    for (int i5 = 0; i5 < i4; i5++)
    {
      arrayOfInt = (int[])localArrayList1.get(i5);
      if (arrayOfInt[(4 + n)] == k)
      {
        i2 = arrayOfInt[i3];
        zf.a(localArrayList2, Integer.valueOf(i2));
      }
      else
      {
        zf.a(localArrayList2, Integer.valueOf(arrayOfInt[i3]));
      }
    }
    if (i2 == -1) {
      return;
    }
    if (localArrayList2.size() == 1)
    {
      move(m);
      return;
    }
    ArrayList localArrayList3 = new ArrayList();
    int i6 = 0;
    for (int i7 = 0; i7 < i4; i7++)
    {
      arrayOfInt = (int[])localArrayList1.get(i7);
      if (arrayOfInt[i3] == i2)
      {
        if (k == arrayOfInt[(4 + n)]) {
          i6 = localArrayList3.size();
        }
        zf.a(localArrayList3, Integer.valueOf(arrayOfInt[(4 + n)]));
      }
    }
    if (m < 0) {
      m = 0;
    }
    if (m >= localArrayList3.size()) {
      m = localArrayList3.size() - 1;
    }
    i7 = ((Integer)localArrayList3.get(m)).intValue();
    int i8 = i7 - k;
    if (i8 > 0) {
      this.a.a(k, i7);
    } else {
      this.a.b(k, i7);
    }
  }
  
  public void move(int count, boolean isSameParent)
  {
    if (isSameParent) {
      a(count);
    } else {
      move(count);
    }
  }
  
  void a(int paramInt)
  {
    int k = this.a.a.getPosition();
    if (k == 0)
    {
      move(paramInt);
      return;
    }
    int m = this.a.a.m;
    ArrayList localArrayList1 = null;
    if (m == 1) {
      localArrayList1 = this.a.a.k.b.b.g;
    }
    if (m == 2) {
      localArrayList1 = this.a.a.k.b.b.h;
    }
    if ((localArrayList1 == null) || (localArrayList1.size() == 0) || (((int[])localArrayList1.get(0)).length < 4 + k + 1)) {
      return;
    }
    int n = e();
    int i1 = -1;
    int i2 = 4 + k - 1;
    ArrayList localArrayList2 = new ArrayList();
    int i3 = localArrayList1.size();
    int[] arrayOfInt = null;
    for (int i4 = 0; i4 < i3; i4++)
    {
      arrayOfInt = (int[])localArrayList1.get(i4);
      if (arrayOfInt[(4 + k)] == n)
      {
        i1 = arrayOfInt[i2];
        zf.a(localArrayList2, Integer.valueOf(i1));
      }
      else
      {
        zf.a(localArrayList2, Integer.valueOf(arrayOfInt[i2]));
      }
    }
    if (i1 == -1) {
      return;
    }
    if (localArrayList2.size() == 1)
    {
      move(paramInt);
      return;
    }
    ArrayList localArrayList3 = new ArrayList();
    int i5 = 0;
    for (int i6 = 0; i6 < i3; i6++)
    {
      arrayOfInt = (int[])localArrayList1.get(i6);
      if (arrayOfInt[i2] == i1)
      {
        if (n == arrayOfInt[(4 + k)]) {
          i5 = localArrayList3.size();
        }
        zf.a(localArrayList3, Integer.valueOf(arrayOfInt[(4 + k)]));
      }
    }
    i6 = i5 + paramInt;
    int i7;
    if (paramInt > 0)
    {
      i7 = i5 + paramInt;
      if (i7 < 0) {
        i7 = 0;
      }
      if (i7 >= localArrayList3.size()) {
        i7 = localArrayList3.size() - 1;
      }
      this.a.a(n, ((Integer)localArrayList3.get(i7)).intValue());
    }
    else
    {
      i7 = i5 + paramInt;
      if (i7 >= localArrayList3.size()) {
        i7 = localArrayList3.size() - 1;
      }
      if (i7 < 0) {
        i7 = 0;
      }
      this.a.b(n, ((Integer)localArrayList3.get(i7)).intValue());
    }
  }
  
  /**
   * @deprecated
   */
  public void move(int count)
  {
    int k = e() + count;
    int m;
    int n;
    if (count > 0)
    {
      m = e();
      n = e() + count;
      if (n < 0) {
        n = 0;
      }
      if (n >= this.a.getCount()) {
        n = this.a.getCount() - 1;
      }
      this.a.a(m, n);
    }
    else
    {
      m = e();
      n = m + count;
      if (n >= this.a.getCount()) {
        n = this.a.getCount() - 1;
      }
      if (n < 0) {
        n = 0;
      }
      this.a.b(m, n);
    }
  }
  
  boolean a()
  {
    return b(2);
  }
  
  void a(boolean paramBoolean)
  {
    a(paramBoolean, 2);
  }
  
  boolean b()
  {
    return b(8);
  }
  
  void b(boolean paramBoolean)
  {
    a(paramBoolean, 8);
  }
  
  boolean c()
  {
    return b(16);
  }
  
  void c(boolean paramBoolean)
  {
    a(paramBoolean, 16);
  }
  
  boolean b(int paramInt)
  {
    return (this.c & 0xFFFF & paramInt) != 0;
  }
  
  void a(boolean paramBoolean, int paramInt)
  {
    this.c &= (paramInt ^ 0xFFFFFFFF);
    this.c |= (paramBoolean ? paramInt : 0);
  }
  
  zbtv d()
  {
    return this.a.a.h;
  }
  
  public String getStringValue()
  {
    Object localObject = getValue();
    if (localObject == null) {
      return "";
    }
    return zs.a(localObject);
  }
  
  public double getDoubleValue()
  {
    Object localObject = getValue();
    if (localObject == null) {
      return 0.0D;
    }
    if ((localObject instanceof Double)) {
      return ((Double)localObject).doubleValue();
    }
    if ((localObject instanceof Integer)) {
      return ((Integer)localObject).intValue();
    }
    if ((localObject instanceof DateTime)) {
      return CellsHelper.getDoubleFromDateTime((DateTime)localObject, false);
    }
    return 0.0D;
  }
  
  public DateTime getDateTimeValue()
  {
    Object localObject = getValue();
    if (localObject == null) {
      return DateTime.a;
    }
    if ((localObject instanceof DateTime)) {
      return (DateTime)localObject;
    }
    if ((localObject instanceof Double)) {
      return CellsHelper.getDateTimeFromDouble(((Double)localObject).doubleValue(), false);
    }
    if ((localObject instanceof Integer)) {
      return CellsHelper.getDateTimeFromDouble(((Integer)localObject).intValue(), false);
    }
    return DateTime.a;
  }
  
  public Object getValue()
  {
    if ((d() != null) && (d().j != null) && (d().j.d != null) && (this.j < d().j.d.size()) && (d().j.d.get(this.j) != null)) {
      return ((zbos)d().j.d.get(this.j)).a;
    }
    if ((d() != null) && (d().c != null) && (this.j < d().c.size()) && (d().c.get(this.j) != null)) {
      return ((zbos)d().c.get(this.j)).a;
    }
    return null;
  }
  
  public String getName()
  {
    if (this.d == null)
    {
      if (getIndex() == -1)
      {
        this.d = this.a.a.b.b.getGrandTotalName();
        if (this.d == null)
        {
          GlobalizationSettings localGlobalizationSettings = this.a.a.l.a.a.getWorkbook().getSettings().getGlobalizationSettings();
          return localGlobalizationSettings.getPivotGrandTotalName();
        }
      }
      if (d().n())
      {
        if ((d().j == null) || (d().j.d == null) || (d().j.d.get(getIndex()) == null)) {
          return null;
        }
        return zs.a(((zbos)d().j.d.get(this.j)).a);
      }
      if ((d().c == null) || (d().c.get(getIndex()) == null) || (((zbos)d().c.get(getIndex())).a == null)) {
        return null;
      }
      return zs.a(((zbos)d().c.get(getIndex())).a);
    }
    return this.d;
  }
  
  public int getIndex()
  {
    return this.j;
  }
  
  public void setIndex(int value)
  {
    this.j = value;
  }
  
  int e()
  {
    return this.a.b(this);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/PivotItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */