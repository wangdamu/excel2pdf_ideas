package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;

public class MultipleFilterCollection
  extends CollectionBase
{
  private boolean b;
  String a;
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    for (int i = 0; i < getCount(); i++)
    {
      Object localObject = get(i);
      if ((localObject instanceof DateTimeGroupItem))
      {
        DateTimeGroupItem localDateTimeGroupItem = (DateTimeGroupItem)localObject;
        if (localDateTimeGroupItem.getDateTimeGroupingType() == paramInt1) {
          switch (paramInt1)
          {
          case 5: 
            if (localDateTimeGroupItem.getYear() == paramInt2)
            {
              this.InnerList.remove(i);
              return;
            }
            break;
          case 3: 
            if ((localDateTimeGroupItem.getYear() == paramInt2) && (localDateTimeGroupItem.getMonth() == paramInt3))
            {
              this.InnerList.remove(i);
              return;
            }
            break;
          case 0: 
            if ((localDateTimeGroupItem.getYear() == paramInt2) && (localDateTimeGroupItem.getMonth() == paramInt3) && (localDateTimeGroupItem.getDay() == paramInt4))
            {
              this.InnerList.remove(i);
              return;
            }
            break;
          case 1: 
            if ((localDateTimeGroupItem.getYear() == paramInt2) && (localDateTimeGroupItem.getMonth() == paramInt3) && (localDateTimeGroupItem.getDay() == paramInt4) && (localDateTimeGroupItem.getHour() == paramInt5))
            {
              this.InnerList.remove(i);
              return;
            }
            break;
          case 2: 
            if ((localDateTimeGroupItem.getYear() == paramInt2) && (localDateTimeGroupItem.getMonth() == paramInt3) && (localDateTimeGroupItem.getDay() == paramInt4) && (localDateTimeGroupItem.getHour() == paramInt5) && (localDateTimeGroupItem.getMinute() == paramInt6))
            {
              this.InnerList.remove(i);
              return;
            }
            break;
          case 4: 
            if ((localDateTimeGroupItem.getYear() == paramInt2) && (localDateTimeGroupItem.getMonth() == paramInt3) && (localDateTimeGroupItem.getDay() == paramInt4) && (localDateTimeGroupItem.getHour() == paramInt5) && (localDateTimeGroupItem.getMinute() == paramInt6) && (localDateTimeGroupItem.getSecond() == paramInt7))
            {
              this.InnerList.remove(i);
              return;
            }
            break;
          }
        }
      }
    }
  }
  
  void a(String paramString)
  {
    if (paramString == null)
    {
      this.b = false;
      return;
    }
    for (int i = 0; i < getCount(); i++)
    {
      Object localObject = get(i);
      if (((localObject instanceof String)) && (zw.b((String)localObject, paramString)))
      {
        this.InnerList.remove(i);
        return;
      }
    }
  }
  
  void a(MultipleFilterCollection paramMultipleFilterCollection)
  {
    this.b = paramMultipleFilterCollection.b;
    for (int i = 0; i < paramMultipleFilterCollection.getCount(); i++)
    {
      Object localObject = paramMultipleFilterCollection.get(i);
      if ((localObject instanceof DateTimeGroupItem))
      {
        DateTimeGroupItem localDateTimeGroupItem1 = (DateTimeGroupItem)localObject;
        DateTimeGroupItem localDateTimeGroupItem2 = new DateTimeGroupItem();
        localDateTimeGroupItem2.a(localDateTimeGroupItem1);
        zf.a(this.InnerList, localDateTimeGroupItem2);
      }
      else
      {
        zf.a(this.InnerList, localObject);
      }
    }
  }
  
  public boolean getMatchBlank()
  {
    return this.b;
  }
  
  public void setMatchBlank(boolean value)
  {
    this.b = value;
  }
  
  public Object get(int index)
  {
    return this.InnerList.get(index);
  }
  
  void b(String paramString)
  {
    zf.a(this.InnerList, paramString);
  }
  
  void a(DateTimeGroupItem paramDateTimeGroupItem)
  {
    zf.a(this.InnerList, paramDateTimeGroupItem);
  }
  
  boolean a(Cell paramCell)
  {
    if ((getMatchBlank()) && ((paramCell == null) || (paramCell.getType() == 3))) {
      return true;
    }
    if ((paramCell == null) || (paramCell.getType() == 3)) {
      return false;
    }
    for (int i = 0; i < getCount(); i++)
    {
      Object localObject = get(i);
      if ((localObject instanceof DateTimeGroupItem))
      {
        if (((DateTimeGroupItem)localObject).a(paramCell)) {
          return true;
        }
      }
      else if (zs.a(localObject).equals(paramCell.k())) {
        return true;
      }
    }
    return false;
  }
  
  boolean a(Object paramObject)
  {
    if ((getMatchBlank()) && (paramObject == null)) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    for (int i = 0; i < getCount(); i++)
    {
      Object localObject = get(i);
      if ((localObject instanceof DateTimeGroupItem))
      {
        if (((DateTimeGroupItem)localObject).a(paramObject)) {
          return true;
        }
      }
      else
      {
        if (zs.a(localObject).equals(zs.a(paramObject))) {
          return true;
        }
        if ((paramObject instanceof Boolean))
        {
          String str = zs.a(localObject).toUpperCase();
          if (((Boolean)paramObject).booleanValue())
          {
            if (str.equals("TRUE")) {
              return true;
            }
          }
          else if (str.equals("FALSE")) {
            return true;
          }
        }
      }
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/MultipleFilterCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */