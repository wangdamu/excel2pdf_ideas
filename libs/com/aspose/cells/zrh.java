package com.aspose.cells;

class zrh
{
  String a = null;
  zaml b = new zaml(false);
  zaml c = new zaml(false);
  
  static boolean a(zrh paramzrh1, zrh paramzrh2)
  {
    if ((paramzrh1 == null) && (paramzrh2 == null)) {
      return true;
    }
    if ((paramzrh1 != null) && (paramzrh2 != null))
    {
      if (paramzrh1.b.c(paramzrh2.b)) {
        return false;
      }
      if (paramzrh1.c.c(paramzrh2.c)) {
        return false;
      }
      return paramzrh1.a.equals(paramzrh2.a);
    }
    return false;
  }
  
  static zrh a(Style paramStyle)
  {
    zrh localzrh = new zrh();
    localzrh.c.f(paramStyle.a);
    if (paramStyle.a.b()) {
      localzrh.c.a(1, paramStyle.a());
    }
    localzrh.b.f(paramStyle.b);
    if (paramStyle.b.b()) {
      localzrh.b.a(1, paramStyle.b());
    }
    localzrh.a = zauj.g(paramStyle.getPattern());
    return localzrh;
  }
  
  void b(Style paramStyle)
  {
    if ((this.a != null) && (this.a.length() > 0)) {
      paramStyle.setPattern(zauj.i(this.a));
    }
    if (!this.b.b())
    {
      paramStyle.b.f(this.b);
      paramStyle.b(34);
      paramStyle.g(true);
    }
    if (!this.c.b())
    {
      paramStyle.a.f(this.c);
      paramStyle.b(35);
      paramStyle.g(true);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zrh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */