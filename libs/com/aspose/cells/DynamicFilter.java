package com.aspose.cells;

public class DynamicFilter
{
  private int a;
  private Object b;
  private Object c;
  
  void a(DynamicFilter paramDynamicFilter)
  {
    this.a = paramDynamicFilter.a;
    this.c = paramDynamicFilter.c;
    this.b = paramDynamicFilter.b;
  }
  
  public int getDynamicFilterType()
  {
    return this.a;
  }
  
  public void setDynamicFilterType(int value)
  {
    this.a = value;
  }
  
  public Object getValue()
  {
    return this.b;
  }
  
  public void setValue(Object value)
  {
    this.b = value;
  }
  
  public Object getMaxValue()
  {
    return this.c;
  }
  
  public void setMaxValue(Object value)
  {
    this.c = value;
  }
  
  void a(Cells paramCells, int paramInt1, int paramInt2, int paramInt3)
  {
    double d1;
    switch (this.a)
    {
    case 0: 
    case 1: 
      int i = 0;
      d1 = 0.0D;
      for (int j = paramInt2; j <= paramInt3; j++)
      {
        Cell localCell = paramCells.checkCell(j, paramInt1);
        if ((localCell != null) && ((localCell.getType() == 4) || (localCell.getType() == 1)))
        {
          d1 += localCell.getDoubleValue();
          i++;
        }
      }
      this.b = Double.valueOf(d1 / i);
      return;
    case 29: 
      DateTime localDateTime1 = DateTime.getNow();
      d1 = (int)CellsHelper.getDoubleFromDateTime(localDateTime1, paramCells.p().p().getSettings().getDate1904());
      this.b = Double.valueOf(d1 - localDateTime1.getDayOfWeek());
      this.c = Double.valueOf(d1 + 6.0D - localDateTime1.getDayOfWeek());
      break;
    case 4: 
      DateTime localDateTime2 = DateTime.getNow().addDays(-7.0D);
      double d2 = (int)CellsHelper.getDoubleFromDateTime(localDateTime2, paramCells.p().p().getSettings().getDate1904());
      this.b = Double.valueOf(d2 - localDateTime2.getDayOfWeek());
      this.c = Double.valueOf(d2 + 6.0D - localDateTime2.getDayOfWeek());
      break;
    case 20: 
      DateTime localDateTime3 = DateTime.getNow().addDays(7.0D);
      double d3 = (int)CellsHelper.getDoubleFromDateTime(localDateTime3, paramCells.p().p().getSettings().getDate1904());
      this.b = Double.valueOf(d3 - localDateTime3.getDayOfWeek());
      this.c = Double.valueOf(d3 + 6.0D - localDateTime3.getDayOfWeek());
    }
  }
  
  boolean a(Object paramObject, boolean paramBoolean)
  {
    if (this.a == 22) {
      return true;
    }
    if ((paramObject != null) && (!(paramObject instanceof DateTime))) {
      return false;
    }
    double d1 = paramObject == null ? 0.0D : CellsHelper.getDoubleFromDateTime((DateTime)paramObject, paramBoolean);
    switch (this.a)
    {
    case 0: 
      return d1 > ((Double)getValue()).doubleValue();
    case 1: 
      return d1 < ((Double)getValue()).doubleValue();
    }
    DateTime localDateTime1 = CellsHelper.getDateTimeFromDouble(d1, paramBoolean);
    DateTime localDateTime2 = DateTime.getNow();
    switch (this.a)
    {
    case 6: 
      return localDateTime1.getMonth() == 1;
    case 10: 
      return localDateTime1.getMonth() == 2;
    case 11: 
      return localDateTime1.getMonth() == 3;
    case 12: 
      return localDateTime1.getMonth() == 4;
    case 13: 
      return localDateTime1.getMonth() == 5;
    case 14: 
      return localDateTime1.getMonth() == 6;
    case 15: 
      return localDateTime1.getMonth() == 7;
    case 16: 
      return localDateTime1.getMonth() == 8;
    case 17: 
      return localDateTime1.getMonth() == 9;
    case 7: 
      return localDateTime1.getMonth() == 10;
    case 8: 
      return localDateTime1.getMonth() == 11;
    case 9: 
      return localDateTime1.getMonth() == 12;
    case 23: 
      return (localDateTime1.getMonth() >= 1) && (localDateTime1.getMonth() <= 3);
    case 24: 
      return (localDateTime1.getMonth() >= 4) && (localDateTime1.getMonth() <= 6);
    case 25: 
      return (localDateTime1.getMonth() >= 7) && (localDateTime1.getMonth() <= 9);
    case 26: 
      return (localDateTime1.getMonth() >= 10) && (localDateTime1.getMonth() <= 20);
    case 31: 
      return (localDateTime1.getYear() == localDateTime2.getYear()) && (localDateTime1.getMonth() == localDateTime2.getMonth()) && (localDateTime1.getDay() == localDateTime2.getDay());
    case 34: 
      localDateTime1 = localDateTime1.addDays(1.0D);
      return (localDateTime1.getYear() == localDateTime2.getYear()) && (localDateTime1.getMonth() == localDateTime2.getMonth()) && (localDateTime1.getDay() == localDateTime2.getDay());
    case 32: 
      localDateTime1 = localDateTime1.addDays(-1.0D);
      return (localDateTime1.getYear() == localDateTime2.getYear()) && (localDateTime1.getMonth() == localDateTime2.getMonth()) && (localDateTime1.getDay() == localDateTime2.getDay());
    case 33: 
      if (localDateTime1.getYear() == localDateTime2.getYear())
      {
        if (localDateTime1.getMonth() < localDateTime2.getMonth()) {
          return true;
        }
        if (localDateTime1.getMonth() == localDateTime2.getMonth()) {
          return localDateTime1.getDay() <= localDateTime2.getDay();
        }
      }
      return false;
    case 5: 
      return localDateTime1.getYear() + 1 == localDateTime2.getYear();
    case 2: 
      if (localDateTime1.getYear() == localDateTime2.getYear()) {
        return localDateTime1.getMonth() + 1 == localDateTime2.getMonth();
      }
      if (localDateTime1.getYear() + 1 == localDateTime2.getYear()) {
        return (localDateTime1.getMonth() == 12) && (localDateTime2.getMonth() == 1);
      }
      return false;
    case 3: 
      if (localDateTime1.getYear() == localDateTime2.getYear()) {
        return Math.ceil(localDateTime1.getMonth() / 3.0F) + 1.0D == Math.ceil(localDateTime2.getMonth() / 3.0F);
      }
      if (localDateTime1.getYear() + 1 == localDateTime2.getYear()) {
        return (Math.ceil(localDateTime1.getMonth() / 3.0F) == 4.0D) && (Math.ceil(localDateTime2.getMonth() / 3.0F) == 1.0D);
      }
      return false;
    case 4: 
    case 20: 
    case 29: 
      double d2 = (int)CellsHelper.getDoubleFromDateTime(localDateTime1, paramBoolean);
      return (d2 >= ((Double)this.b).doubleValue()) && (d2 <= ((Double)this.c).doubleValue());
    case 30: 
      return localDateTime1.getYear() == localDateTime2.getYear();
    case 28: 
      if (localDateTime1.getYear() == localDateTime2.getYear()) {
        return Math.ceil(localDateTime1.getMonth() / 3.0F) == Math.ceil(localDateTime2.getMonth() / 3.0F);
      }
      return false;
    case 27: 
      return (localDateTime1.getYear() == localDateTime2.getYear()) && (localDateTime1.getMonth() == localDateTime2.getMonth());
    case 18: 
      if (localDateTime1.getYear() == localDateTime2.getYear()) {
        return localDateTime1.getMonth() - 1 == localDateTime2.getMonth();
      }
      if (localDateTime1.getYear() - 1 == localDateTime2.getYear()) {
        return (localDateTime1.getMonth() == 1) && (localDateTime2.getMonth() == 12);
      }
      return false;
    case 21: 
      return localDateTime1.getYear() - 1 == localDateTime2.getYear();
    case 19: 
      if (localDateTime1.getYear() == localDateTime2.getYear()) {
        return Math.ceil(localDateTime1.getMonth() / 3.0F) - 1.0D == Math.ceil(localDateTime2.getMonth() / 3.0F);
      }
      if (localDateTime1.getYear() + 1 == localDateTime2.getYear()) {
        return (Math.ceil(localDateTime1.getMonth() / 3.0F) == 1.0D) && (Math.ceil(localDateTime2.getMonth() / 3.0F) == 4.0D);
      }
      return false;
    }
    return true;
  }
  
  boolean a(Cell paramCell, boolean paramBoolean)
  {
    if (this.a == 22) {
      return true;
    }
    if ((paramCell != null) && (paramCell.getType() != 1) && (paramCell.getType() != 4)) {
      return false;
    }
    double d1 = paramCell == null ? 0.0D : paramCell.getDoubleValue();
    switch (this.a)
    {
    case 0: 
      return d1 > ((Double)getValue()).doubleValue();
    case 1: 
      return d1 < ((Double)getValue()).doubleValue();
    }
    DateTime localDateTime1 = CellsHelper.getDateTimeFromDouble(d1, paramBoolean);
    DateTime localDateTime2 = DateTime.getNow();
    switch (this.a)
    {
    case 6: 
      return localDateTime1.getMonth() == 1;
    case 10: 
      return localDateTime1.getMonth() == 2;
    case 11: 
      return localDateTime1.getMonth() == 3;
    case 12: 
      return localDateTime1.getMonth() == 4;
    case 13: 
      return localDateTime1.getMonth() == 5;
    case 14: 
      return localDateTime1.getMonth() == 6;
    case 15: 
      return localDateTime1.getMonth() == 7;
    case 16: 
      return localDateTime1.getMonth() == 8;
    case 17: 
      return localDateTime1.getMonth() == 9;
    case 7: 
      return localDateTime1.getMonth() == 10;
    case 8: 
      return localDateTime1.getMonth() == 11;
    case 9: 
      return localDateTime1.getMonth() == 12;
    case 23: 
      return (localDateTime1.getMonth() >= 1) && (localDateTime1.getMonth() <= 3);
    case 24: 
      return (localDateTime1.getMonth() >= 4) && (localDateTime1.getMonth() <= 6);
    case 25: 
      return (localDateTime1.getMonth() >= 7) && (localDateTime1.getMonth() <= 9);
    case 26: 
      return (localDateTime1.getMonth() >= 10) && (localDateTime1.getMonth() <= 20);
    case 31: 
      return (localDateTime1.getYear() == localDateTime2.getYear()) && (localDateTime1.getMonth() == localDateTime2.getMonth()) && (localDateTime1.getDay() == localDateTime2.getDay());
    case 34: 
      localDateTime1 = localDateTime1.addDays(1.0D);
      return (localDateTime1.getYear() == localDateTime2.getYear()) && (localDateTime1.getMonth() == localDateTime2.getMonth()) && (localDateTime1.getDay() == localDateTime2.getDay());
    case 32: 
      localDateTime1 = localDateTime1.addDays(-1.0D);
      return (localDateTime1.getYear() == localDateTime2.getYear()) && (localDateTime1.getMonth() == localDateTime2.getMonth()) && (localDateTime1.getDay() == localDateTime2.getDay());
    case 33: 
      if (localDateTime1.getYear() == localDateTime2.getYear())
      {
        if (localDateTime1.getMonth() < localDateTime2.getMonth()) {
          return true;
        }
        if (localDateTime1.getMonth() == localDateTime2.getMonth()) {
          return localDateTime1.getDay() <= localDateTime2.getDay();
        }
      }
      return false;
    case 5: 
      return localDateTime1.getYear() + 1 == localDateTime2.getYear();
    case 2: 
      if (localDateTime1.getYear() == localDateTime2.getYear()) {
        return localDateTime1.getMonth() + 1 == localDateTime2.getMonth();
      }
      if (localDateTime1.getYear() + 1 == localDateTime2.getYear()) {
        return (localDateTime1.getMonth() == 12) && (localDateTime2.getMonth() == 1);
      }
      return false;
    case 3: 
      if (localDateTime1.getYear() == localDateTime2.getYear()) {
        return Math.ceil(localDateTime1.getMonth() / 3.0F) + 1.0D == Math.ceil(localDateTime2.getMonth() / 3.0F);
      }
      if (localDateTime1.getYear() + 1 == localDateTime2.getYear()) {
        return (Math.ceil(localDateTime1.getMonth() / 3.0F) == 4.0D) && (Math.ceil(localDateTime2.getMonth() / 3.0F) == 1.0D);
      }
      return false;
    case 4: 
    case 20: 
    case 29: 
      double d2 = (int)CellsHelper.getDoubleFromDateTime(localDateTime1, paramBoolean);
      return (d2 >= ((Double)this.b).doubleValue()) && (d2 <= ((Double)this.c).doubleValue());
    case 30: 
      return localDateTime1.getYear() == localDateTime2.getYear();
    case 28: 
      if (localDateTime1.getYear() == localDateTime2.getYear()) {
        return Math.ceil(localDateTime1.getMonth() / 3.0F) == Math.ceil(localDateTime2.getMonth() / 3.0F);
      }
      return false;
    case 27: 
      return (localDateTime1.getYear() == localDateTime2.getYear()) && (localDateTime1.getMonth() == localDateTime2.getMonth());
    case 18: 
      if (localDateTime1.getYear() == localDateTime2.getYear()) {
        return localDateTime1.getMonth() - 1 == localDateTime2.getMonth();
      }
      if (localDateTime1.getYear() - 1 == localDateTime2.getYear()) {
        return (localDateTime1.getMonth() == 1) && (localDateTime2.getMonth() == 12);
      }
      return false;
    case 21: 
      return localDateTime1.getYear() - 1 == localDateTime2.getYear();
    case 19: 
      if (localDateTime1.getYear() == localDateTime2.getYear()) {
        return Math.ceil(localDateTime1.getMonth() / 3.0F) - 1.0D == Math.ceil(localDateTime2.getMonth() / 3.0F);
      }
      if (localDateTime1.getYear() + 1 == localDateTime2.getYear()) {
        return (Math.ceil(localDateTime1.getMonth() / 3.0F) == 1.0D) && (Math.ceil(localDateTime2.getMonth() / 3.0F) == 4.0D);
      }
      return false;
    }
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/DynamicFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */