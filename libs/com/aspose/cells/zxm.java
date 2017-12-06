package com.aspose.cells;

import com.aspose.cells.b.a.zs;

class zxm
{
  int a;
  int b;
  int c = 6;
  int d = 6;
  Object e;
  Object f;
  
  zxm(int paramInt)
  {
    this.a = paramInt;
  }
  
  void a(boolean[] paramArrayOfBoolean1, boolean[] paramArrayOfBoolean2, int[] paramArrayOfInt)
  {
    paramArrayOfBoolean1[0] = ((this.b & 0xFFFF & 0x20) != 0 ? 1 : false);
    paramArrayOfBoolean2[0] = ((this.b & 0xFFFF & 0x40) != 0 ? 1 : false);
    paramArrayOfInt[0] = ((this.b & 0xFFFF & 0xFF80) >> 7);
  }
  
  boolean a()
  {
    return (this.b & 0xFFFF & 0x1) == 0;
  }
  
  boolean b()
  {
    return (this.b & 0xFFFF & 0x4) != 0;
  }
  
  boolean c()
  {
    return (this.b & 0xFFFF & 0x8) != 0;
  }
  
  FilterColumn a(FilterColumnCollection paramFilterColumnCollection)
  {
    FilterColumn localFilterColumn = new FilterColumn(paramFilterColumnCollection, this.a);
    if (d())
    {
      int i = 0;
      int j = 0;
      int k = 0;
      boolean[] arrayOfBoolean1 = { i };
      boolean[] arrayOfBoolean2 = { j };
      int[] arrayOfInt = { k };
      a(arrayOfBoolean1, arrayOfBoolean2, arrayOfInt);
      i = arrayOfBoolean1[0];
      j = arrayOfBoolean2[0];
      k = arrayOfInt[0];
      Top10Filter localTop10Filter = new Top10Filter(i, j, k);
      localFilterColumn.setFilterType(5);
      localFilterColumn.setFilter(localTop10Filter);
      localTop10Filter.setCriteria(this.f);
      return localFilterColumn;
    }
    if (this.f == null)
    {
      switch (this.c)
      {
      case 2: 
        localFilterColumn.d();
        break;
      case 4: 
        localFilterColumn.e();
      }
      return localFilterColumn;
    }
    if (this.d == 6)
    {
      if (b()) {
        localFilterColumn.b(zs.a(this.f));
      } else {
        localFilterColumn.a(this.c, this.f, false, 6, null);
      }
    }
    else if ((b()) && (c()))
    {
      localFilterColumn.b(zs.a(this.f));
      if (this.e != null) {
        localFilterColumn.b(zs.a(this.e));
      }
    }
    else
    {
      localFilterColumn.a(this.c, this.f, a(), this.d, this.e);
    }
    return localFilterColumn;
  }
  
  zxm(FilterColumn paramFilterColumn)
  {
    this.a = paramFilterColumn.getFieldIndex();
    Object localObject1;
    Object localObject2;
    switch (paramFilterColumn.getFilterType())
    {
    case 5: 
      Top10Filter localTop10Filter = (Top10Filter)paramFilterColumn.getFilter();
      this.b = 16;
      if (localTop10Filter.isTop())
      {
        this.b |= 0x20;
        this.c = 5;
      }
      else
      {
        this.c = 0;
      }
      if (localTop10Filter.isPercent()) {
        this.b |= 0x40;
      }
      this.b |= localTop10Filter.getItems() << 7;
      this.f = localTop10Filter.getCriteria();
      break;
    case 3: 
      MultipleFilterCollection localMultipleFilterCollection = (MultipleFilterCollection)paramFilterColumn.getFilter();
      if (localMultipleFilterCollection.getMatchBlank())
      {
        this.c = 2;
        return;
      }
      if (localMultipleFilterCollection.getCount() > 0)
      {
        localObject1 = localMultipleFilterCollection.get(0);
        if ((localObject1 instanceof DateTimeGroupItem))
        {
          localObject2 = (DateTimeGroupItem)localObject1;
          this.c = 5;
          this.f = Double.valueOf(CellsHelper.getDoubleFromDateTime(((DateTimeGroupItem)localObject2).getMinValue(), paramFilterColumn.c().a().a().c().p().getSettings().getDate1904()));
        }
        else
        {
          this.c = 2;
          this.f = localObject1;
          if ((localObject1 instanceof String)) {
            this.b |= 0x4;
          }
        }
      }
      if (localMultipleFilterCollection.getCount() > 1)
      {
        this.b |= 0x1;
        localObject1 = localMultipleFilterCollection.get(1);
        if ((localObject1 instanceof DateTimeGroupItem))
        {
          localObject2 = (DateTimeGroupItem)localObject1;
          this.d = 5;
          this.e = Double.valueOf(CellsHelper.getDoubleFromDateTime(((DateTimeGroupItem)localObject2).getMinValue(), paramFilterColumn.c().a().a().c().p().getSettings().getDate1904()));
        }
        else
        {
          this.d = 2;
          this.e = localObject1;
          if ((localObject1 instanceof String)) {
            this.b |= 0x8;
          }
        }
      }
      break;
    case 1: 
      localObject1 = (CustomFilterCollection)paramFilterColumn.getFilter();
      if (!((CustomFilterCollection)localObject1).getAnd()) {
        this.b |= 0x1;
      }
      if (((CustomFilterCollection)localObject1).getCount() > 0)
      {
        localObject2 = ((CustomFilterCollection)localObject1).get(0);
        this.c = ((CustomFilter)localObject2).getFilterOperatorType();
        this.f = ((CustomFilter)localObject2).getCriteria();
      }
      if (((CustomFilterCollection)localObject1).getCount() > 1)
      {
        localObject2 = ((CustomFilterCollection)localObject1).get(1);
        this.d = ((CustomFilter)localObject2).getFilterOperatorType();
        this.e = ((CustomFilter)localObject2).getCriteria();
      }
      break;
    }
  }
  
  boolean d()
  {
    return (this.b & 0xFFFF & 0x10) != 0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zxm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */