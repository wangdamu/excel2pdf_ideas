package com.aspose.cells;

public class DateTimeGroupItem
{
  private int a;
  private int b;
  private byte c;
  private byte d;
  private byte e;
  private byte f;
  private byte g;
  
  void a(DateTimeGroupItem paramDateTimeGroupItem)
  {
    this.a = paramDateTimeGroupItem.a;
    this.b = paramDateTimeGroupItem.b;
    this.c = paramDateTimeGroupItem.c;
    this.d = paramDateTimeGroupItem.d;
    this.e = paramDateTimeGroupItem.e;
    this.f = paramDateTimeGroupItem.f;
    this.g = paramDateTimeGroupItem.g;
  }
  
  DateTimeGroupItem() {}
  
  boolean a(Cell paramCell)
  {
    switch (paramCell.getType())
    {
    case 1: 
    case 4: 
      DateTime localDateTime = paramCell.getDateTimeValue();
      switch (this.a)
      {
      case 5: 
        return localDateTime.getYear() == (this.b & 0xFFFF);
      case 3: 
        return (localDateTime.getYear() == (this.b & 0xFFFF)) && (localDateTime.getMonth() == (this.c & 0xFF));
      case 0: 
        return (localDateTime.getYear() == (this.b & 0xFFFF)) && (localDateTime.getMonth() == (this.c & 0xFF)) && (localDateTime.getDay() == (this.d & 0xFF));
      case 1: 
        return (localDateTime.getYear() == (this.b & 0xFFFF)) && (localDateTime.getMonth() == (this.c & 0xFF)) && (localDateTime.getDay() == (this.d & 0xFF)) && (localDateTime.getHour() == (this.e & 0xFF));
      case 2: 
        return (localDateTime.getYear() == (this.b & 0xFFFF)) && (localDateTime.getMonth() == (this.c & 0xFF)) && (localDateTime.getDay() == (this.d & 0xFF)) && (localDateTime.getHour() == (this.e & 0xFF)) && (localDateTime.getMinute() == (this.f & 0xFF));
      case 4: 
        return (localDateTime.getYear() == (this.b & 0xFFFF)) && (localDateTime.getMonth() == (this.c & 0xFF)) && (localDateTime.getDay() == (this.d & 0xFF)) && (localDateTime.getHour() == (this.e & 0xFF)) && (localDateTime.getMinute() == (this.f & 0xFF)) && (localDateTime.getSecond() == (this.g & 0xFF));
      }
      break;
    }
    return false;
  }
  
  boolean a(Object paramObject)
  {
    DateTime localDateTime = (DateTime)paramObject;
    switch (this.a)
    {
    case 5: 
      return localDateTime.getYear() == (this.b & 0xFFFF);
    case 3: 
      return (localDateTime.getYear() == (this.b & 0xFFFF)) && (localDateTime.getMonth() == (this.c & 0xFF));
    case 0: 
      return (localDateTime.getYear() == (this.b & 0xFFFF)) && (localDateTime.getMonth() == (this.c & 0xFF)) && (localDateTime.getDay() == (this.d & 0xFF));
    case 1: 
      return (localDateTime.getYear() == (this.b & 0xFFFF)) && (localDateTime.getMonth() == (this.c & 0xFF)) && (localDateTime.getDay() == (this.d & 0xFF)) && (localDateTime.getHour() == (this.e & 0xFF));
    case 2: 
      return (localDateTime.getYear() == (this.b & 0xFFFF)) && (localDateTime.getMonth() == (this.c & 0xFF)) && (localDateTime.getDay() == (this.d & 0xFF)) && (localDateTime.getHour() == (this.e & 0xFF)) && (localDateTime.getMinute() == (this.f & 0xFF));
    case 4: 
      return (localDateTime.getYear() == (this.b & 0xFFFF)) && (localDateTime.getMonth() == (this.c & 0xFF)) && (localDateTime.getDay() == (this.d & 0xFF)) && (localDateTime.getHour() == (this.e & 0xFF)) && (localDateTime.getMinute() == (this.f & 0xFF)) && (localDateTime.getSecond() == (this.g & 0xFF));
    }
    return false;
  }
  
  public DateTime getMinValue()
  {
    switch (this.a)
    {
    case 5: 
      return new DateTime(this.b & 0xFFFF, 1, 1);
    case 3: 
      return new DateTime(this.b & 0xFFFF, this.c & 0xFF, 1);
    case 0: 
      return new DateTime(this.b & 0xFFFF, this.c & 0xFF, this.d & 0xFF);
    case 1: 
      return new DateTime(this.b & 0xFFFF, this.c & 0xFF, this.d & 0xFF, this.e & 0xFF, 0, 0);
    case 2: 
      return new DateTime(this.b & 0xFFFF, this.c & 0xFF, this.d & 0xFF, this.e & 0xFF, this.f & 0xFF, 0);
    case 4: 
      return new DateTime(this.b & 0xFFFF, this.c & 0xFF, this.d & 0xFF, this.e & 0xFF, this.f & 0xFF, this.g & 0xFF);
    }
    return DateTime.getNow();
  }
  
  public DateTimeGroupItem(int type, int year, int month, int day, int hour, int minute, int second)
  {
    this.a = type;
    this.b = year;
    this.c = ((byte)month);
    this.d = ((byte)day);
    this.e = ((byte)hour);
    this.f = ((byte)minute);
    this.g = ((byte)second);
  }
  
  public int getDateTimeGroupingType()
  {
    return this.a;
  }
  
  public void setDateTimeGroupingType(int value)
  {
    this.a = value;
  }
  
  public int getYear()
  {
    return this.b;
  }
  
  public void setYear(int value)
  {
    this.b = value;
  }
  
  public int getMonth()
  {
    return this.c;
  }
  
  public void setMonth(int value)
  {
    this.c = ((byte)value);
  }
  
  public int getDay()
  {
    return this.d;
  }
  
  public void setDay(int value)
  {
    this.d = ((byte)value);
  }
  
  public int getHour()
  {
    return this.e;
  }
  
  public void setHour(int value)
  {
    this.e = ((byte)value);
  }
  
  public int getMinute()
  {
    return this.f;
  }
  
  public void setMinute(int value)
  {
    this.f = ((byte)value);
  }
  
  public int getSecond()
  {
    return this.g;
  }
  
  public void setSecond(int value)
  {
    this.g = ((byte)value);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/DateTimeGroupItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */