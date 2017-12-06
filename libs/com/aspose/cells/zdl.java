package com.aspose.cells;

import java.util.HashMap;

class zdl
{
  private static HashMap a = null;
  private static Object b = new Object();
  private int c;
  private Color d;
  
  private static HashMap c()
  {
    if (a == null) {
      synchronized (b)
      {
        if (a == null)
        {
          a = new HashMap();
          a.put(Integer.valueOf(0), Integer.valueOf(0));
          a.put(Integer.valueOf(7), Integer.valueOf(1));
          a.put(Integer.valueOf(11), Integer.valueOf(2));
          a.put(Integer.valueOf(9), Integer.valueOf(3));
          a.put(Integer.valueOf(4), Integer.valueOf(4));
          a.put(Integer.valueOf(3), Integer.valueOf(5));
          a.put(Integer.valueOf(1), Integer.valueOf(6));
          a.put(Integer.valueOf(12), Integer.valueOf(7));
          a.put(Integer.valueOf(13), Integer.valueOf(8));
          a.put(Integer.valueOf(10), Integer.valueOf(9));
          a.put(Integer.valueOf(8), Integer.valueOf(10));
          a.put(Integer.valueOf(2), Integer.valueOf(11));
          a.put(Integer.valueOf(5), Integer.valueOf(12));
          a.put(Integer.valueOf(6), Integer.valueOf(13));
        }
      }
    }
    return a;
  }
  
  zdl(int paramInt, Color paramColor)
  {
    this.c = paramInt;
    this.d = paramColor;
  }
  
  int a()
  {
    return this.c;
  }
  
  Color b()
  {
    return this.d;
  }
  
  boolean a(zdl paramzdl)
  {
    return a(paramzdl, this);
  }
  
  static boolean a(zdl paramzdl1, zdl paramzdl2)
  {
    Object localObject1 = c().get(Integer.valueOf(paramzdl2.a()));
    Object localObject2 = c().get(Integer.valueOf(paramzdl1.a()));
    if ((localObject1 == null) || (localObject2 == null)) {
      return false;
    }
    if (((Integer)localObject1).intValue() < ((Integer)localObject2).intValue()) {
      return false;
    }
    if ((Integer)localObject1 == (Integer)localObject2) {
      return a(paramzdl1.b(), paramzdl2.b());
    }
    return true;
  }
  
  private static boolean a(Color paramColor1, Color paramColor2)
  {
    if ((paramColor1.getR() == paramColor2.getR()) && (paramColor1.getG() == paramColor2.getG()) && (paramColor1.getB() == paramColor2.getB())) {
      return false;
    }
    return a(paramColor1) > a(paramColor2);
  }
  
  private static double a(Color paramColor)
  {
    return Math.sqrt((paramColor.getR() & 0xFF) * (paramColor.getR() & 0xFF) * 0.299D + (paramColor.getG() & 0xFF) * (paramColor.getG() & 0xFF) * 0.587D + (paramColor.getB() & 0xFF) * (paramColor.getB() & 0xFF) * 0.114D);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zdl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */