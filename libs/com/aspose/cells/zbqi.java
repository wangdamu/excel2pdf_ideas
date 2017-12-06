package com.aspose.cells;

import com.aspose.cells.b.a.zo;
import com.aspose.cells.b.a.zp;
import java.util.Comparator;
import java.util.HashMap;

class zbqi
  implements Comparator
{
  private boolean a;
  private HashMap b;
  
  zbqi(boolean paramBoolean, HashMap paramHashMap)
  {
    this.a = paramBoolean;
    this.b = paramHashMap;
  }
  
  private double a(long paramLong)
  {
    return zauj.C(zauj.a(paramLong));
  }
  
  private double a(int paramInt)
  {
    return zauj.C(zauj.z(paramInt));
  }
  
  public int compare(Object x, Object y)
  {
    if ((x instanceof String))
    {
      if ((y instanceof String))
      {
        if (this.b.size() != 0)
        {
          Object localObject1 = this.b.get(x);
          Object localObject2 = this.b.get(y);
          if ((localObject1 != null) && (localObject2 != null)) {
            return this.a ? zp.a(((Integer)localObject1).intValue(), ((Integer)localObject2).intValue()) : zp.a(((Integer)localObject2).intValue(), ((Integer)localObject1).intValue());
          }
          if ((localObject1 != null) && (localObject2 == null)) {
            return this.a ? -1 : 1;
          }
          if ((localObject1 == null) && (localObject2 != null)) {
            return this.a ? 1 : -1;
          }
          return this.a ? ((String)x).compareTo((String)y) : ((String)y).compareTo((String)x);
        }
        return this.a ? ((String)x).compareTo((String)y) : ((String)y).compareTo((String)x);
      }
      if ((y instanceof Double)) {
        return this.a ? 1 : -1;
      }
      if (((y instanceof Integer)) || ((y instanceof Long))) {
        return this.a ? 1 : -1;
      }
      if ((y instanceof DateTime)) {
        return this.a ? -1 : 1;
      }
      if (y == null) {
        return this.a ? -1 : 1;
      }
    }
    else if ((x instanceof Double))
    {
      if ((y instanceof String)) {
        return this.a ? -1 : 1;
      }
      if (((y instanceof Double)) || ((y instanceof Integer)) || ((y instanceof Long)))
      {
        if ((y instanceof Double)) {
          return this.a ? zo.a(((Double)x).doubleValue(), ((Double)y).doubleValue()) : zo.a(((Double)y).doubleValue(), ((Double)x).doubleValue());
        }
        if ((y instanceof Integer)) {
          return this.a ? zo.a(((Double)x).doubleValue(), a(((Integer)y).intValue())) : zo.a(a(((Integer)y).intValue()), ((Double)x).doubleValue());
        }
        return this.a ? zo.a(((Double)x).doubleValue(), a(((Long)y).longValue())) : zo.a(a(((Long)y).longValue()), ((Double)x).doubleValue());
      }
      if ((y instanceof DateTime)) {
        return this.a ? -1 : 1;
      }
      if (y == null) {
        return this.a ? -1 : 1;
      }
    }
    else if ((x instanceof Long))
    {
      if ((y instanceof String)) {
        return this.a ? -1 : 1;
      }
      if ((y instanceof Double)) {
        return this.a ? zo.a(a(((Long)x).longValue()), ((Double)y).doubleValue()) : zo.a(((Double)y).doubleValue(), a(((Long)x).longValue()));
      }
      if ((y instanceof Long)) {
        return this.a ? zo.a(a(((Long)x).longValue()), a(((Long)y).longValue())) : zo.a(a(((Long)y).longValue()), a(((Long)x).longValue()));
      }
      if ((y instanceof Integer)) {
        return this.a ? zo.a(a(((Long)x).longValue()), a(((Integer)y).intValue())) : zo.a(a(((Integer)y).intValue()), a(((Long)x).longValue()));
      }
      if ((y instanceof DateTime)) {
        return this.a ? -1 : 1;
      }
      if (y == null) {
        return this.a ? -1 : 1;
      }
    }
    else if ((x instanceof Integer))
    {
      if ((y instanceof String)) {
        return this.a ? -1 : 1;
      }
      if ((y instanceof Double)) {
        return this.a ? zo.a(a(((Integer)x).intValue()), ((Double)y).doubleValue()) : zo.a(((Double)y).doubleValue(), a(((Integer)x).intValue()));
      }
      if ((y instanceof Long)) {
        return this.a ? zo.a(a(((Integer)x).intValue()), a(((Long)y).longValue())) : zo.a(a(((Long)y).longValue()), a(((Integer)x).intValue()));
      }
      if ((y instanceof Integer)) {
        return this.a ? zp.a(((Integer)x).intValue(), ((Integer)y).intValue()) : zp.a(((Integer)y).intValue(), ((Integer)x).intValue());
      }
      if ((y instanceof DateTime)) {
        return this.a ? -1 : 1;
      }
      if (y == null) {
        return this.a ? -1 : 1;
      }
    }
    else if ((x instanceof DateTime))
    {
      if ((y instanceof String)) {
        return this.a ? 1 : -1;
      }
      if ((y instanceof Double)) {
        return this.a ? 1 : -1;
      }
      if ((y instanceof Long)) {
        return this.a ? 1 : -1;
      }
      if ((y instanceof Integer)) {
        return this.a ? 1 : -1;
      }
      if ((y instanceof DateTime)) {
        return this.a ? ((DateTime)x).compareTo((DateTime)y) : ((DateTime)y).compareTo((DateTime)x);
      }
      if (y == null) {
        return this.a ? -1 : 1;
      }
    }
    else if (x == null)
    {
      return this.a ? 1 : -1;
    }
    return this.a ? 1 : -1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbqi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */