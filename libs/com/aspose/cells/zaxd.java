package com.aspose.cells;

import java.util.ArrayList;

class zaxd
{
  static zaie a(int paramInt1, int paramInt2, ArrayList paramArrayList, boolean paramBoolean)
  {
    if ((paramInt2 == 0) && (!paramBoolean)) {
      return zabg.a;
    }
    switch (paramInt1)
    {
    case 1: 
      return zabt.a(paramInt2);
    case 6: 
      return zabt.a(paramArrayList.size());
    case 0: 
      return new zabb(a(paramArrayList));
    case 3: 
      return b(paramArrayList);
    case 4: 
      return c(paramArrayList);
    case 5: 
      return d(paramArrayList);
    case 7: 
      return h(paramArrayList);
    case 8: 
      return e(paramArrayList);
    case 9: 
      return g(paramArrayList);
    case 10: 
      return f(paramArrayList);
    case 2: 
      return a(paramArrayList, paramBoolean);
    }
    return zabg.a;
  }
  
  private static double a(ArrayList paramArrayList)
  {
    double d = 0.0D;
    for (int i = 0; i < paramArrayList.size(); i++) {
      d += ((Double)paramArrayList.get(i)).doubleValue();
    }
    return d;
  }
  
  private static zaie b(ArrayList paramArrayList)
  {
    if (paramArrayList.size() == 0) {
      return zabb.a;
    }
    double d = ((Double)paramArrayList.get(0)).doubleValue();
    for (int i = 1; i < paramArrayList.size(); i++) {
      if (((Double)paramArrayList.get(i)).doubleValue() > d) {
        d = ((Double)paramArrayList.get(i)).doubleValue();
      }
    }
    return new zabb(d);
  }
  
  private static zaie c(ArrayList paramArrayList)
  {
    if (paramArrayList.size() == 0) {
      return zabb.a;
    }
    double d = ((Double)paramArrayList.get(0)).doubleValue();
    for (int i = 1; i < paramArrayList.size(); i++) {
      if (((Double)paramArrayList.get(i)).doubleValue() < d) {
        d = ((Double)paramArrayList.get(i)).doubleValue();
      }
    }
    return new zabb(d);
  }
  
  private static zaie d(ArrayList paramArrayList)
  {
    if (paramArrayList.size() == 0) {
      return zabb.a;
    }
    double d = 1.0D;
    for (int i = 0; i < paramArrayList.size(); i++) {
      d *= ((Double)paramArrayList.get(i)).doubleValue();
    }
    return new zabb(d);
  }
  
  private static zaie e(ArrayList paramArrayList)
  {
    if (paramArrayList.size() < 1) {
      return zabc.a;
    }
    double d1 = 0.0D;
    double d2 = 0.0D;
    int i = paramArrayList.size();
    for (int j = 0; j < paramArrayList.size(); j++)
    {
      double d3 = ((Double)paramArrayList.get(j)).doubleValue();
      d1 += d3;
      d2 += d3 * d3;
    }
    return new zabb(Math.sqrt((i * d2 - d1 * d1) / (i * i)));
  }
  
  private static zaie f(ArrayList paramArrayList)
  {
    if (paramArrayList.size() < 1) {
      return zabc.a;
    }
    double d1 = 0.0D;
    double d2 = 0.0D;
    int i = paramArrayList.size();
    for (int j = 0; j < paramArrayList.size(); j++)
    {
      double d3 = ((Double)paramArrayList.get(j)).doubleValue();
      d1 += d3;
      d2 += d3 * d3;
    }
    return new zabb((i * d2 - d1 * d1) / (i * i));
  }
  
  private static zaie g(ArrayList paramArrayList)
  {
    if (paramArrayList.size() < 2) {
      return zabc.a;
    }
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = paramArrayList.size();
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      double d4 = ((Double)paramArrayList.get(i)).doubleValue();
      d1 += d4;
      d2 += d4 * d4;
    }
    return new zabb((d3 * d2 - d1 * d1) / (d3 * (d3 - 1.0D)));
  }
  
  private static zaie a(ArrayList paramArrayList, boolean paramBoolean)
  {
    if (paramArrayList.size() == 0)
    {
      if (paramBoolean) {
        return zabc.a;
      }
      return zabb.a;
    }
    double d = 0.0D;
    for (int i = 0; i < paramArrayList.size(); i++) {
      d += ((Double)paramArrayList.get(i)).doubleValue();
    }
    return new zabb(d / paramArrayList.size());
  }
  
  private static zaie h(ArrayList paramArrayList)
  {
    if (paramArrayList.size() < 2) {
      return zabc.a;
    }
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = paramArrayList.size();
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      double d4 = ((Double)paramArrayList.get(i)).doubleValue();
      d1 += d4;
      d2 += d4 * d4;
    }
    return new zabb(Math.sqrt((d3 * d2 - d1 * d1) / (d3 * (d3 - 1.0D))));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaxd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */