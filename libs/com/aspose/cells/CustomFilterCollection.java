package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.g.a.ze;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;

public class CustomFilterCollection
  extends CollectionBase
{
  private boolean a;
  
  void a(CustomFilterCollection paramCustomFilterCollection)
  {
    this.a = paramCustomFilterCollection.a;
    for (int i = 0; i < paramCustomFilterCollection.getCount(); i++)
    {
      CustomFilter localCustomFilter1 = paramCustomFilterCollection.get(i);
      CustomFilter localCustomFilter2 = new CustomFilter();
      localCustomFilter2.a(localCustomFilter1);
      zf.a(this.InnerList, localCustomFilter2);
    }
  }
  
  public boolean getAnd()
  {
    return this.a;
  }
  
  public void setAnd(boolean value)
  {
    this.a = value;
  }
  
  void a(CustomFilter paramCustomFilter)
  {
    zf.a(this.InnerList, paramCustomFilter);
  }
  
  public CustomFilter get(int index)
  {
    return (CustomFilter)this.InnerList.get(index);
  }
  
  boolean a(Object paramObject, boolean paramBoolean)
  {
    for (int i = 0; i < getCount(); i++)
    {
      CustomFilter localCustomFilter = get(i);
      if (a(paramObject, localCustomFilter.getFilterOperatorType(), localCustomFilter.getCriteria(), paramBoolean))
      {
        if (!getAnd()) {
          return true;
        }
      }
      else if (getAnd()) {
        return false;
      }
    }
    return getAnd();
  }
  
  private boolean a(Object paramObject1, int paramInt, Object paramObject2, boolean paramBoolean)
  {
    if (paramObject1 == null)
    {
      switch (paramInt)
      {
      case 2: 
        return paramObject2 == null;
      case 4: 
        return paramObject2 != null;
      }
      return false;
    }
    switch (paramInt)
    {
    case 2: 
      if (paramObject2 == null) {
        return paramObject1 == null;
      }
      String str1 = zs.a(paramObject2).toLowerCase();
      str1 = zw.a(str1, "?", ".?");
      str1 = zw.a(str1, "*", ".*");
      ze localze1 = new ze("^" + str1 + "$");
      return localze1.d(zs.a(paramObject1).toLowerCase());
    case 4: 
      if (paramObject2 == null) {
        return paramObject1 != null;
      }
      String str2 = zs.a(paramObject2).toLowerCase();
      str2 = zw.a(str2, "?", ".?");
      str2 = zw.a(str2, "*", ".*");
      ze localze2 = new ze("^" + str2 + "$");
      return !localze2.d(zs.a(paramObject1).toLowerCase());
    case 3: 
      Object localObject1 = znc.a(paramObject1, paramObject2, ">", paramBoolean);
      if ((localObject1 instanceof Boolean)) {
        return ((Boolean)localObject1).booleanValue();
      }
      return false;
    case 5: 
      Object localObject2 = znc.a(paramObject1, paramObject2, ">=", paramBoolean);
      if ((localObject2 instanceof Boolean)) {
        return ((Boolean)localObject2).booleanValue();
      }
      return false;
    case 1: 
      Object localObject3 = znc.a(paramObject1, paramObject2, "<", paramBoolean);
      if ((localObject3 instanceof Boolean)) {
        return ((Boolean)localObject3).booleanValue();
      }
      return false;
    case 0: 
      Object localObject4 = znc.a(paramObject1, paramObject2, "<=", paramBoolean);
      if ((localObject4 instanceof Boolean)) {
        return ((Boolean)localObject4).booleanValue();
      }
      return false;
    }
    return true;
  }
  
  boolean a(Cell paramCell, boolean paramBoolean)
  {
    for (int i = 0; i < getCount(); i++)
    {
      CustomFilter localCustomFilter = get(i);
      if (a(paramCell, localCustomFilter.getFilterOperatorType(), localCustomFilter.getCriteria(), paramBoolean))
      {
        if (!getAnd()) {
          return true;
        }
      }
      else if (getAnd()) {
        return false;
      }
    }
    return getAnd();
  }
  
  private boolean a(Cell paramCell, int paramInt, Object paramObject, boolean paramBoolean)
  {
    if ((paramCell == null) || (paramCell.c.c == 0))
    {
      switch (paramInt)
      {
      case 2: 
        return paramObject == null;
      case 4: 
        return paramObject != null;
      }
      return false;
    }
    switch (paramInt)
    {
    case 2: 
      if (paramObject == null) {
        return paramCell.c.c == 0;
      }
      String str1 = zs.a(paramObject).toLowerCase();
      str1 = zw.a(str1, "?", ".?");
      str1 = zw.a(str1, "*", ".*");
      ze localze1 = new ze("^" + str1 + "$");
      return localze1.d(paramCell.k().toLowerCase());
    case 4: 
      if (paramObject == null) {
        return (paramCell != null) && (!"".equals(paramCell.getStringValue(0)));
      }
      String str2 = zs.a(paramObject).toLowerCase();
      str2 = zw.a(str2, "?", ".?");
      str2 = zw.a(str2, "*", ".*");
      ze localze2 = new ze("^" + str2 + "$");
      return !localze2.d(paramCell.k().toLowerCase());
    case 3: 
      Object localObject1 = znc.a(paramCell.getValue(), paramObject, ">", paramBoolean);
      if ((localObject1 instanceof Boolean)) {
        return ((Boolean)localObject1).booleanValue();
      }
      return false;
    case 5: 
      Object localObject2 = znc.a(paramCell.getValue(), paramObject, ">=", paramBoolean);
      if ((localObject2 instanceof Boolean)) {
        return ((Boolean)localObject2).booleanValue();
      }
      return false;
    case 1: 
      Object localObject3 = znc.a(paramCell.getValue(), paramObject, "<", paramBoolean);
      if ((localObject3 instanceof Boolean)) {
        return ((Boolean)localObject3).booleanValue();
      }
      return false;
    case 0: 
      Object localObject4 = znc.a(paramCell.getValue(), paramObject, "<=", paramBoolean);
      if ((localObject4 instanceof Boolean)) {
        return ((Boolean)localObject4).booleanValue();
      }
      return false;
    }
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/CustomFilterCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */