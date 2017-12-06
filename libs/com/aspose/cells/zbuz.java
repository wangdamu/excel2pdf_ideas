package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.Iterator;

class zbuz
{
  PivotTable a;
  PivotFieldCollection b;
  PivotFieldCollection c;
  PivotFieldCollection d;
  PivotFieldCollection e;
  PivotFieldCollection f;
  String g;
  String h;
  int i;
  short j;
  
  zbuz(PivotTable paramPivotTable)
  {
    this.a = paramPivotTable;
    this.h = "Data";
    this.i = 527;
    this.j = 1;
    this.b = new PivotFieldCollection(this.a, 0);
    this.e = new PivotFieldCollection(this.a, 2);
    this.d = new PivotFieldCollection(this.a, 1);
    this.c = new PivotFieldCollection(this.a, 8);
    this.f = new PivotFieldCollection(this.a, 4);
  }
  
  zbuz(PivotTable paramPivotTable, String paramString)
  {
    this.a = paramPivotTable;
    this.g = paramString;
    this.h = "Data";
    this.i = 527;
    this.j = 1;
    this.b = new PivotFieldCollection(this.a, this.a.d);
    this.e = new PivotFieldCollection(this.a, 2);
    this.d = new PivotFieldCollection(this.a, 1);
    this.c = new PivotFieldCollection(this.a, 8);
    this.f = new PivotFieldCollection(this.a, 4);
  }
  
  void a(int paramInt)
  {
    this.b = new PivotFieldCollection(this.a, this.a.d, paramInt);
  }
  
  void a(zbuz paramzbuz)
  {
    this.g = paramzbuz.g;
    this.h = paramzbuz.h;
    this.i = paramzbuz.i;
    this.j = paramzbuz.j;
    int k = 0;
    int m = 0;
    Iterator localIterator = paramzbuz.b.a.iterator();
    PivotField localPivotField;
    while (localIterator.hasNext())
    {
      localPivotField = (PivotField)localIterator.next();
      this.a.getBaseFields().get(m).a(localPivotField);
      m++;
    }
    localIterator = paramzbuz.c.a.iterator();
    while (localIterator.hasNext())
    {
      localPivotField = (PivotField)localIterator.next();
      k = this.a.addFieldToArea(8, localPivotField.getBaseIndex());
      this.a.getDataFields().get(k).a(localPivotField);
    }
    localIterator = paramzbuz.e.a.iterator();
    while (localIterator.hasNext())
    {
      localPivotField = (PivotField)localIterator.next();
      if (localPivotField.getBaseIndex() >= 0)
      {
        k = this.a.addFieldToArea(2, localPivotField.getBaseIndex());
        if ((k >= 0) && (k < this.a.getColumnFields().getCount())) {
          this.a.getColumnFields().get(k).a(localPivotField);
        }
      }
      else if (this.a.getDataField().m == 1)
      {
        this.a.getRowFields().e(this.a.getDataField());
        this.a.getDataField().m = 2;
        zf.a(this.a.getColumnFields().a, this.a.getDataField());
      }
    }
    localIterator = paramzbuz.d.a.iterator();
    while (localIterator.hasNext())
    {
      localPivotField = (PivotField)localIterator.next();
      if (localPivotField.getBaseIndex() >= 0)
      {
        k = this.a.addFieldToArea(1, localPivotField.getBaseIndex());
        if ((k >= 0) && (k < this.a.getRowFields().getCount())) {
          this.a.getRowFields().get(k).a(localPivotField);
        }
      }
      else if (this.a.getDataField().m == 2)
      {
        this.a.getColumnFields().e(this.a.getDataField());
        this.a.getDataField().m = 1;
        zf.a(this.a.getRowFields().a, this.a.getDataField());
      }
    }
    localIterator = paramzbuz.f.a.iterator();
    while (localIterator.hasNext())
    {
      localPivotField = (PivotField)localIterator.next();
      k = this.a.addFieldToArea(4, localPivotField.getBaseIndex());
      if ((k >= 0) && (k < this.a.getPageFields().getCount())) {
        this.a.getPageFields().get(k).a(localPivotField);
      }
    }
  }
  
  void a(boolean paramBoolean, int paramInt)
  {
    this.i &= (paramInt ^ 0xFFFFFFFF);
    this.i |= (paramBoolean ? paramInt : 0);
  }
  
  boolean b(int paramInt)
  {
    return (this.i & 0xFFFF & paramInt) != 0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbuz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */