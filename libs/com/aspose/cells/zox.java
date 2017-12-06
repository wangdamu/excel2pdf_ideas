package com.aspose.cells;

class zox
{
  String a;
  zaml b = new zaml(false);
  int c;
  
  static zox a(Style paramStyle, int paramInt)
  {
    zox localzox = new zox();
    localzox.b.f(paramStyle.getBorders().getByBorderType(paramInt).a);
    if (localzox.b.b()) {
      localzox.b.a(1, 64);
    }
    localzox.a = zauj.h(paramStyle.getBorders().getByBorderType(paramInt).getLineStyle());
    localzox.c = paramStyle.getBorders().getByBorderType(paramInt).getLineStyle();
    return localzox;
  }
  
  static zox a(Border paramBorder)
  {
    zox localzox = new zox();
    localzox.b.f(paramBorder.a);
    if (localzox.b.b()) {
      localzox.b.a(1, 64);
    }
    localzox.a = zauj.h(paramBorder.getLineStyle());
    localzox.c = paramBorder.getLineStyle();
    return localzox;
  }
  
  static boolean a(zox paramzox1, zox paramzox2)
  {
    if ((paramzox1 == null) && (paramzox2 == null)) {
      return true;
    }
    if ((paramzox1 != null) && (paramzox2 != null))
    {
      if (paramzox1.b.c(paramzox2.b)) {
        return false;
      }
      return paramzox1.a.equals(paramzox2.a);
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */