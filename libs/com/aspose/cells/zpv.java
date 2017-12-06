package com.aspose.cells;

class zpv
{
  int a;
  zrh b;
  zoy c;
  
  static zpv a(Style paramStyle)
  {
    zpv localzpv = new zpv();
    if (paramStyle.isGradient()) {
      localzpv.c = zoy.a(paramStyle);
    } else {
      localzpv.b = zrh.a(paramStyle);
    }
    return localzpv;
  }
  
  static boolean a(zpv paramzpv1, zpv paramzpv2)
  {
    if ((paramzpv1 == null) && (paramzpv2 == null)) {
      return true;
    }
    if ((paramzpv1 != null) && (paramzpv2 != null))
    {
      if (!zrh.a(paramzpv1.b, paramzpv2.b)) {
        return false;
      }
      return zoy.a(paramzpv1.c, paramzpv2.c);
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zpv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */