package com.aspose.cells;

public class FilterColumn
{
  private int a = 6;
  private Object b;
  private boolean c = false;
  private boolean d = true;
  private int e;
  private FilterColumnCollection f;
  
  public boolean getVisibledropdown()
  {
    return (!this.c) && (this.d);
  }
  
  public void setVisibledropdown(boolean value)
  {
    this.c = (!value);
    this.d = value;
  }
  
  boolean a()
  {
    return this.c;
  }
  
  void a(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  boolean b()
  {
    return this.d;
  }
  
  void b(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }
  
  public Object getFilter()
  {
    return this.b;
  }
  
  public void setFilter(Object value)
  {
    this.b = value;
  }
  
  public int getFilterType()
  {
    return this.a;
  }
  
  public void setFilterType(int value)
  {
    this.a = value;
  }
  
  public int getFieldIndex()
  {
    return this.e;
  }
  
  public void setFieldIndex(int value)
  {
    this.e = value;
  }
  
  FilterColumnCollection c()
  {
    return this.f;
  }
  
  FilterColumn(FilterColumnCollection filterColumns, int fieldIndex)
  {
    this.e = fieldIndex;
    this.f = filterColumns;
  }
  
  FilterColumn(FilterColumnCollection filterColumns, int fieldIndex, boolean hiddenButton, boolean showButton)
  {
    this.e = fieldIndex;
    this.f = filterColumns;
    this.c = hiddenButton;
    this.d = showButton;
  }
  
  void a(FilterColumn paramFilterColumn)
  {
    this.a = paramFilterColumn.a;
    this.c = paramFilterColumn.c;
    this.d = paramFilterColumn.d;
    switch (this.a)
    {
    case 0: 
      ColorFilter localColorFilter1 = (ColorFilter)paramFilterColumn.b;
      ColorFilter localColorFilter2 = new ColorFilter(this);
      this.b = localColorFilter2;
      localColorFilter2.a(localColorFilter1, true);
      break;
    case 2: 
      DynamicFilter localDynamicFilter1 = (DynamicFilter)paramFilterColumn.b;
      DynamicFilter localDynamicFilter2 = new DynamicFilter();
      this.b = localDynamicFilter2;
      localDynamicFilter2.a(localDynamicFilter1);
      break;
    case 4: 
      IconFilter localIconFilter1 = (IconFilter)paramFilterColumn.b;
      IconFilter localIconFilter2 = new IconFilter(this);
      this.b = localIconFilter2;
      localIconFilter2.a(localIconFilter1);
      break;
    case 3: 
      MultipleFilterCollection localMultipleFilterCollection1 = (MultipleFilterCollection)paramFilterColumn.b;
      MultipleFilterCollection localMultipleFilterCollection2 = new MultipleFilterCollection();
      this.b = localMultipleFilterCollection2;
      localMultipleFilterCollection2.a(localMultipleFilterCollection1);
      break;
    case 5: 
      Top10Filter localTop10Filter1 = (Top10Filter)paramFilterColumn.b;
      Top10Filter localTop10Filter2 = new Top10Filter();
      this.b = localTop10Filter2;
      localTop10Filter2.a(localTop10Filter1);
      break;
    case 1: 
      CustomFilterCollection localCustomFilterCollection1 = (CustomFilterCollection)paramFilterColumn.b;
      CustomFilterCollection localCustomFilterCollection2 = new CustomFilterCollection();
      this.b = localCustomFilterCollection2;
      localCustomFilterCollection2.a(localCustomFilterCollection1);
    }
  }
  
  private static boolean d(String paramString)
  {
    return (paramString.indexOf('?') == -1) && (paramString.indexOf('*') == -1);
  }
  
  void a(String paramString)
  {
    if (this.a != 3) {
      return;
    }
    MultipleFilterCollection localMultipleFilterCollection = (MultipleFilterCollection)this.b;
    if (paramString == null)
    {
      localMultipleFilterCollection.setMatchBlank(true);
      return;
    }
    localMultipleFilterCollection.a(paramString);
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    if (this.a != 3) {
      return;
    }
    MultipleFilterCollection localMultipleFilterCollection = (MultipleFilterCollection)this.b;
    localMultipleFilterCollection.a(paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
  }
  
  void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    if (this.a != 3)
    {
      this.a = 3;
      this.b = new MultipleFilterCollection();
    }
    MultipleFilterCollection localMultipleFilterCollection = (MultipleFilterCollection)this.b;
    DateTimeGroupItem localDateTimeGroupItem = new DateTimeGroupItem(paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
    localMultipleFilterCollection.a(localDateTimeGroupItem);
  }
  
  void a(int paramInt1, int paramInt2)
  {
    IconFilter localIconFilter = new IconFilter(this);
    localIconFilter.setIconSetType(paramInt1);
    localIconFilter.setIconId(paramInt2);
    this.b = localIconFilter;
    this.a = 4;
  }
  
  void a(CellsColor paramCellsColor)
  {
    AutoFilter localAutoFilter = this.f.a();
    Worksheet localWorksheet = localAutoFilter.a();
    ColorFilter localColorFilter = new ColorFilter(this);
    this.b = localColorFilter;
    this.a = 0;
    localColorFilter.setFilterByFillColor(false);
    Style localStyle = new Style(localWorksheet.c());
    localStyle.setPattern(1);
    localStyle.b = paramCellsColor.a;
    if (!paramCellsColor.a.b()) {
      localStyle.b(34);
    }
    localColorFilter.a(localWorksheet.c().getDxfs().a(localStyle));
  }
  
  void a(int paramInt, CellsColor paramCellsColor1, CellsColor paramCellsColor2)
  {
    ColorFilter localColorFilter = new ColorFilter(this);
    localColorFilter.setFilterByFillColor(true);
    this.b = localColorFilter;
    this.a = 0;
    AutoFilter localAutoFilter = this.f.a();
    Worksheet localWorksheet = localAutoFilter.a();
    Style localStyle = new Style(localWorksheet.c());
    if (paramInt == 0)
    {
      localStyle.setPattern(paramInt);
      localStyle.b.a(1, 100);
      localStyle.a.a(1, 101);
    }
    else if (paramInt == 1)
    {
      localStyle.setPattern(paramInt);
      localStyle.b = paramCellsColor1.a;
      localStyle.b(34);
      localStyle.a.a(2, 0);
    }
    else
    {
      localStyle.setPattern(paramInt);
      localStyle.b = paramCellsColor1.a;
      localStyle.b(34);
      localStyle.a = paramCellsColor2.a;
      localStyle.b(35);
    }
    localColorFilter.a(localWorksheet.c().getDxfs().a(localStyle));
  }
  
  void b(String paramString)
  {
    if (this.a != 3)
    {
      this.a = 3;
      this.b = new MultipleFilterCollection();
    }
    MultipleFilterCollection localMultipleFilterCollection = (MultipleFilterCollection)this.b;
    if (paramString == null)
    {
      localMultipleFilterCollection.setMatchBlank(true);
      return;
    }
    localMultipleFilterCollection.b(paramString);
  }
  
  void c(String paramString)
  {
    if (d(paramString))
    {
      this.a = 3;
      this.b = new MultipleFilterCollection();
      MultipleFilterCollection localMultipleFilterCollection = (MultipleFilterCollection)this.b;
      localMultipleFilterCollection.b(paramString);
    }
    else
    {
      a(2, paramString, false, 6, null);
    }
  }
  
  void d()
  {
    if (this.a != 3)
    {
      this.a = 3;
      this.b = new MultipleFilterCollection();
    }
    MultipleFilterCollection localMultipleFilterCollection = (MultipleFilterCollection)this.b;
    localMultipleFilterCollection.setMatchBlank(true);
  }
  
  void e()
  {
    this.a = 1;
    CustomFilterCollection localCustomFilterCollection = new CustomFilterCollection();
    localCustomFilterCollection.setAnd(false);
    this.b = localCustomFilterCollection;
    CustomFilter localCustomFilter = new CustomFilter();
    localCustomFilter.setFilterOperatorType(4);
    localCustomFilter.setCriteria(null);
    localCustomFilterCollection.a(localCustomFilter);
  }
  
  void a(int paramInt1, Object paramObject1, boolean paramBoolean, int paramInt2, Object paramObject2)
  {
    this.a = 1;
    CustomFilterCollection localCustomFilterCollection = new CustomFilterCollection();
    localCustomFilterCollection.setAnd(paramBoolean);
    this.b = localCustomFilterCollection;
    CustomFilter localCustomFilter1 = new CustomFilter();
    localCustomFilter1.setFilterOperatorType(paramInt1);
    localCustomFilter1.setCriteria(paramObject1);
    localCustomFilterCollection.a(localCustomFilter1);
    if (paramInt2 != 6)
    {
      CustomFilter localCustomFilter2 = new CustomFilter();
      localCustomFilter2.setFilterOperatorType(paramInt2);
      localCustomFilter2.setCriteria(paramObject2);
      localCustomFilterCollection.a(localCustomFilter2);
    }
  }
  
  void a(int paramInt)
  {
    DynamicFilter localDynamicFilter = new DynamicFilter();
    localDynamicFilter.setDynamicFilterType(paramInt);
    this.a = 2;
    this.b = localDynamicFilter;
  }
  
  void a(boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    Top10Filter localTop10Filter = new Top10Filter(paramBoolean1, paramBoolean2, paramInt);
    this.b = localTop10Filter;
    this.a = 5;
  }
  
  boolean a(Object paramObject)
  {
    switch (getFilterType())
    {
    case 1: 
      return ((CustomFilterCollection)this.b).a(paramObject, this.f.a().a().c().p().getSettings().getDate1904());
    case 3: 
      return ((MultipleFilterCollection)this.b).a(paramObject);
    case 0: 
    case 2: 
      return ((DynamicFilter)this.b).a(paramObject, this.f.a().a().c().p().getSettings().getDate1904());
    case 5: 
      return true;
    }
    return true;
  }
  
  boolean a(Cell paramCell, int paramInt1, int paramInt2)
  {
    switch (getFilterType())
    {
    case 1: 
      return ((CustomFilterCollection)this.b).a(paramCell, this.f.a().a().c().p().getSettings().getDate1904());
    case 3: 
      return ((MultipleFilterCollection)this.b).a(paramCell);
    case 0: 
      return ((ColorFilter)this.b).a(paramCell, paramInt1, paramInt2);
    case 2: 
      return ((DynamicFilter)this.b).a(paramCell, this.f.a().a().c().p().getSettings().getDate1904());
    case 4: 
      return ((IconFilter)this.b).a(paramCell);
    case 5: 
      return true;
    }
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/FilterColumn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */