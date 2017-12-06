package com.aspose.cells;

import java.util.ArrayList;

class zcfx
  extends zcfo
{
  private zbti c = null;
  
  zcfx(zbti paramzbti)
  {
    this.c = paramzbti;
  }
  
  void d()
    throws Exception
  {
    zcbj localzcbj = new zcbj();
    localzcbj.a(this.c);
    localzcbj.a(this.b);
    if (this.c.c() != null)
    {
      localObject = new zcia(this.c);
      ((zcia)localObject).a(this.b);
    }
    e();
    f();
    Object localObject = new zche(588);
    ((zche)localObject).a(this.b);
  }
  
  private void e()
    throws Exception
  {
    ArrayList localArrayList = this.c.b();
    if (localArrayList.size() == 0) {
      return;
    }
    for (int i = 0; i < localArrayList.size(); i++)
    {
      zwh localzwh = (zwh)localArrayList.get(i);
      zchz localzchz = new zchz(localzwh);
      localzchz.a(this.b);
      if (localzwh.h() != null)
      {
        localObject = new zchy(localzwh);
        ((zchy)localObject).a(this.b);
      }
      Object localObject = new zchx(this.c, localzwh);
      ((zchx)localObject).a(this.b);
      zche localzche = new zche(587);
      localzche.a(this.b);
    }
  }
  
  private void f()
    throws Exception
  {
    String[] arrayOfString = this.c.c();
    if ((arrayOfString == null) || (arrayOfString.length == 0)) {
      return;
    }
    int i = arrayOfString.length;
    int j = 0;
    zwr localzwr;
    for (int k = 0; k < i; k++)
    {
      localzwr = this.c.a(arrayOfString[k], false);
      if (localzwr != null)
      {
        j = 1;
        break;
      }
    }
    if (j == 0) {
      return;
    }
    for (k = 0; k < i; k++)
    {
      localzwr = this.c.a(arrayOfString[k], false);
      if (localzwr != null)
      {
        boolean bool = false;
        Object localObject1 = localzwr.a().a(3);
        if ((localObject1 != null) && (((String)localObject1).equals("true"))) {
          bool = true;
        }
        zcfy localzcfy = new zcfy(k, bool);
        localzcfy.a(this.b);
        if (localzwr.c())
        {
          localObject2 = localzwr.a;
          int m = ((ArrayList)localObject2).size();
          for (int n = 0; n < m; n++)
          {
            zwn localzwn = (zwn)((ArrayList)localObject2).get(n);
            zche localzche = new zche(366, localzwn.a());
            localzche.a(this.b);
            if (localzwn.d())
            {
              ArrayList localArrayList = localzwn.f();
              int i1 = localArrayList.size();
              for (int i2 = 0; i2 < i1; i2++)
              {
                zwj localzwj = (zwj)localArrayList.get(i2);
                a(localzwj);
              }
            }
          }
        }
        Object localObject2 = new zche(364);
        ((zche)localObject2).a(this.b);
      }
    }
  }
  
  private void a(zwj paramzwj)
    throws Exception
  {
    switch (paramzwj.a())
    {
    case 4: 
      zcfu localzcfu = new zcfu();
      localzcfu.a(paramzwj);
      localzcfu.a(this.b);
      break;
    case 0: 
      zcfr localzcfr = new zcfr();
      localzcfr.a(paramzwj);
      localzcfr.a(this.b);
      break;
    case 2: 
      zcfs localzcfs = new zcfs();
      localzcfs.a(paramzwj);
      localzcfs.a(this.b);
      break;
    case 5: 
      zcfv localzcfv = new zcfv();
      localzcfv.a(paramzwj);
      localzcfv.a(this.b);
      break;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcfx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */