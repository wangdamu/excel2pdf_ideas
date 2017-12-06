package com.aspose.cells;

import com.aspose.cells.b.a.zs;

public class PivotFilter
{
  int a;
  int b;
  int c;
  int d;
  int e = -1;
  AutoFilter f = new AutoFilter(sheet, this);
  String g;
  String h;
  int i = -1;
  String j;
  
  PivotFilter(Worksheet sheet)
  {
    this.f.setRange("A1");
  }
  
  public AutoFilter getAutoFilter()
  {
    return this.f;
  }
  
  public int getFilterType()
  {
    return this.b;
  }
  
  public int getFieldIndex()
  {
    return this.a;
  }
  
  public String getValue1()
  {
    AutoFilter localAutoFilter = getAutoFilter();
    if (localAutoFilter != null)
    {
      FilterColumnCollection localFilterColumnCollection = localAutoFilter.c;
      FilterColumn localFilterColumn = localFilterColumnCollection.get(0);
      switch (localFilterColumn.getFilterType())
      {
      case 5: 
        Top10Filter localTop10Filter = (Top10Filter)localFilterColumn.getFilter();
        return zauj.z(localTop10Filter.getItems());
      case 1: 
        CustomFilterCollection localCustomFilterCollection = (CustomFilterCollection)localFilterColumn.getFilter();
        CustomFilter localCustomFilter = localCustomFilterCollection.get(0);
        if (localCustomFilter.getCriteria() == null) {
          return "";
        }
        return zs.a(localCustomFilter.getCriteria());
      }
      return this.g;
    }
    return this.g;
  }
  
  public void setValue1(String value)
  {
    AutoFilter localAutoFilter = getAutoFilter();
    if (localAutoFilter != null)
    {
      FilterColumnCollection localFilterColumnCollection = localAutoFilter.c;
      FilterColumn localFilterColumn = localFilterColumnCollection.get(0);
      switch (localFilterColumn.getFilterType())
      {
      case 5: 
        Top10Filter localTop10Filter = (Top10Filter)localFilterColumn.getFilter();
        localTop10Filter.setItems(zauj.F(value));
        break;
      case 1: 
        CustomFilterCollection localCustomFilterCollection = (CustomFilterCollection)localFilterColumn.getFilter();
        CustomFilter localCustomFilter = localCustomFilterCollection.get(0);
        localCustomFilter.setCriteria(value);
        break;
      default: 
        this.g = value;
      }
    }
    this.g = value;
  }
  
  public String getValue2()
  {
    AutoFilter localAutoFilter = getAutoFilter();
    if (localAutoFilter != null)
    {
      FilterColumnCollection localFilterColumnCollection = localAutoFilter.c;
      FilterColumn localFilterColumn = localFilterColumnCollection.get(0);
      switch (localFilterColumn.getFilterType())
      {
      case 1: 
        CustomFilterCollection localCustomFilterCollection = (CustomFilterCollection)localFilterColumn.getFilter();
        if (localCustomFilterCollection.getCount() > 1)
        {
          CustomFilter localCustomFilter = localCustomFilterCollection.get(1);
          return zs.a(localCustomFilter.getCriteria());
        }
        return this.h;
      }
      return this.h;
    }
    return this.h;
  }
  
  public void setValue2(String value)
  {
    AutoFilter localAutoFilter = getAutoFilter();
    if (localAutoFilter != null)
    {
      FilterColumnCollection localFilterColumnCollection = localAutoFilter.c;
      FilterColumn localFilterColumn = localFilterColumnCollection.get(0);
      switch (localFilterColumn.getFilterType())
      {
      case 5: 
        Top10Filter localTop10Filter = (Top10Filter)localFilterColumn.getFilter();
        localTop10Filter.setItems(zauj.F(value));
        break;
      case 1: 
        CustomFilterCollection localCustomFilterCollection = (CustomFilterCollection)localFilterColumn.getFilter();
        if (localCustomFilterCollection.getCount() > 1)
        {
          CustomFilter localCustomFilter = localCustomFilterCollection.get(1);
          localCustomFilter.setCriteria(value);
        }
        else
        {
          this.h = value;
        }
        break;
      default: 
        this.h = value;
      }
    }
    this.h = value;
  }
  
  public int getMeasureFldIndex()
  {
    return this.d;
  }
  
  public void setMeasureFldIndex(int value)
  {
    this.d = value;
  }
  
  public int getMemberPropertyFieldIndex()
  {
    return this.i;
  }
  
  public void setMemberPropertyFieldIndex(int value)
  {
    this.i = value;
  }
  
  public String getName()
  {
    return this.j;
  }
  
  public void setName(String value)
  {
    this.j = value;
  }
  
  public int getEvaluationOrder()
  {
    return this.e;
  }
  
  public void setEvaluationOrder(int value)
  {
    this.e = value;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/PivotFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */