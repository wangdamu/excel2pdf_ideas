package com.aspose.cells;

class zpd
{
  boolean a = false;
  boolean b = false;
  boolean c = false;
  boolean d = false;
  boolean e = false;
  boolean f = false;
  boolean g = false;
  boolean h = false;
  boolean i = false;
  boolean j = false;
  
  void a(zka paramzka)
  {
    int k = paramzka.j();
    if ((ChartCollection.c(k)) || (ChartCollection.m(k))) {
      return;
    }
    this.i = true;
    int m = paramzka.m() ? 0 : 1;
    String str = null;
    if ((ChartCollection.g(k)) || (ChartCollection.j(k)))
    {
      Object localObject = null;
      String[] arrayOfString1 = { localObject };
      String[] arrayOfString2 = { str };
      zauj.a(paramzka.j(), arrayOfString1, arrayOfString2);
      localObject = arrayOfString1[0];
      str = arrayOfString2[0];
      if ("bar".equals(localObject)) {
        if (m != 0) {
          this.c = true;
        } else {
          this.d = true;
        }
      }
    }
    else if (ChartCollection.n(k))
    {
      str = zauj.J(paramzka.j());
    }
    else if (((ChartCollection.q(k)) || (ChartCollection.k(k))) && ((!this.a) || (m == 0)) && ((!this.b) || (m != 0)))
    {
      if (m != 0) {
        this.e = true;
      } else {
        this.f = true;
      }
    }
    if ("percentStacked".equals(str)) {
      if (m != 0) {
        this.g = true;
      } else {
        this.h = true;
      }
    }
    if (m != 0) {
      this.a = true;
    } else {
      this.b = true;
    }
    if (ChartCollection.f(k)) {
      this.j = true;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zpd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */