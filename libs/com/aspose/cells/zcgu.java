package com.aspose.cells;

import com.aspose.cells.b.a.d.zh;
import java.util.ArrayList;

class zcgu
  extends zcfo
{
  private zawp c;
  private zri d;
  
  zcgu(zri paramzri)
  {
    this.d = paramzri;
    this.c = paramzri.b;
  }
  
  void d()
    throws Exception
  {
    if (null == this.c) {
      return;
    }
    this.c.e.a.p().i();
    zccu localzccu = new zccu(this.d);
    localzccu.a(this.b);
    d(this.b);
    b(this.b);
    c(this.b);
    a(this.b);
    zche localzche = new zche(180);
    localzche.a(this.b);
  }
  
  void a(zh paramzh)
    throws Exception
  {
    zcdk localzcdk = new zcdk();
    localzcdk.a(paramzh);
    zcbz localzcbz = new zcbz(this.c);
    localzcbz.a(paramzh);
    zche localzche1 = new zche(1067);
    localzche1.a(paramzh);
    zche localzche2 = new zche(36);
    localzche2.a(paramzh);
  }
  
  void b(zh paramzh)
    throws Exception
  {
    if ((this.c.i == null) || (0 == this.c.i.size())) {
      return;
    }
    zche localzche1 = new zche(181, this.c.i.size());
    localzche1.a(paramzh);
    zbtv localzbtv = null;
    for (int i = 0; i < this.c.i.size(); i++)
    {
      localzbtv = (zbtv)this.c.i.get(i);
      zcce localzcce = new zcce(localzbtv);
      localzcce.a(paramzh);
      if (!localzbtv.o)
      {
        localObject = new zccb(localzbtv);
        ((zccb)localObject).a(paramzh);
        b(localzbtv, paramzh);
        zche localzche3 = new zche(190);
        localzche3.a(paramzh);
      }
      if (null != localzbtv.j) {
        a(localzbtv, paramzh);
      }
      if ((localzbtv.f != null) && (0 != localzbtv.f.size()))
      {
        localObject = new zche(253, localzbtv.f.size());
        ((zche)localObject).a(paramzh);
        for (int j = 0; j < localzbtv.f.size(); j++) {
          a((zbui)localzbtv.f.get(j), paramzh);
        }
        zche localzche4 = new zche(254);
        localzche4.a(paramzh);
      }
      Object localObject = new zche(184);
      ((zche)localObject).a(paramzh);
    }
    zche localzche2 = new zche(182);
    localzche2.a(paramzh);
  }
  
  void a(zbtv paramzbtv, zh paramzh)
    throws Exception
  {
    SxRng localSxRng = paramzbtv.j;
    zccd localzccd = new zccd(localSxRng);
    localzccd.a(paramzh);
    if (paramzbtv.o)
    {
      zche localzche1;
      if ((localSxRng.n == null) || (localSxRng.n.size() == 0))
      {
        localObject1 = new zccc(localSxRng);
        ((zccc)localObject1).a(paramzh);
        localzche1 = new zche(224);
        localzche1.a(paramzh);
      }
      else
      {
        localObject1 = new zche(225, localSxRng.n.size());
        ((zche)localObject1).a(paramzh);
        localzche1 = null;
        for (int i = 0; i < localSxRng.n.size(); i++)
        {
          Object localObject2 = localSxRng.n.get(i);
          if ((localObject2 instanceof String)) {
            localzche1 = new zche(26, zauj.F((String)localObject2));
          } else {
            localzche1 = new zche(26, ((Integer)localObject2).intValue());
          }
          localzche1.a(paramzh);
        }
        zche localzche2 = new zche(226);
        localzche2.a(paramzh);
      }
      a(localSxRng, paramzh);
    }
    Object localObject1 = new zche(220);
    ((zche)localObject1).a(paramzh);
  }
  
  void a(SxRng paramSxRng, zh paramzh)
    throws Exception
  {
    if ((paramSxRng.d == null) || (paramSxRng.d.size() == 0)) {
      return;
    }
    zche localzche1 = new zche(221, paramSxRng.d.size());
    localzche1.a(paramzh);
    for (int i = 0; i < paramSxRng.d.size(); i++) {
      zchq.a().a((zbos)paramSxRng.d.get(i)).a(paramzh);
    }
    zche localzche2 = new zche(222);
    localzche2.a(paramzh);
  }
  
  void b(zbtv paramzbtv, zh paramzh)
    throws Exception
  {
    if ((paramzbtv.c == null) || (paramzbtv.c.size() == 0)) {
      return;
    }
    for (int i = 0; i < paramzbtv.c.size(); i++) {
      zchq.a().a((zbos)paramzbtv.c.get(i)).a(paramzh);
    }
  }
  
  void a(zbui paramzbui, zh paramzh)
    throws Exception
  {
    zccl localzccl = new zccl(paramzbui);
    localzccl.a(paramzh);
    zbul localzbul = paramzbui.a();
    if ((localzbul != null) && (localzbul.getCount() != 0))
    {
      localObject = null;
      zche localzche1 = new zche(257, localzbul.getCount());
      localzche1.a(paramzh);
      for (int i = 0; i < localzbul.getCount(); i++)
      {
        localObject = localzbul.a(i);
        zcck localzcck = new zcck((zbuj)localObject);
        localzcck.a(paramzh);
        zche localzche3 = new zche(260);
        localzche3.a(paramzh);
      }
      zche localzche2 = new zche(258);
      localzche2.a(paramzh);
    }
    Object localObject = new zche(256);
    ((zche)localObject).a(paramzh);
  }
  
  void c(zh paramzh)
    throws Exception
  {
    if ((this.c.m == null) || (this.c.m.getCount() == 0)) {
      return;
    }
    zche localzche1 = new zche(243, this.c.m.getCount());
    localzche1.a(paramzh);
    zaxa localzaxa = null;
    for (int i = 0; i < this.c.m.getCount(); i++)
    {
      localzaxa = this.c.m.a(i);
      zcca localzcca = new zcca(localzaxa);
      localzcca.a(paramzh);
      if (localzaxa.g != null) {
        a(localzaxa.g, paramzh);
      }
      if ((localzaxa.e != null) && (localzaxa.e.getCount() != 0)) {
        for (int j = 0; j < localzaxa.e.getCount(); j++) {
          a(localzaxa.e.a(j), paramzh);
        }
      }
      zche localzche3 = new zche(246);
      localzche3.a(paramzh);
    }
    zche localzche2 = new zche(244);
    localzche2.a(paramzh);
  }
  
  void a(zbur paramzbur, zh paramzh)
    throws Exception
  {
    zcct localzcct = new zcct(paramzbur, true);
    localzcct.a(paramzh);
    zccr localzccr = new zccr(paramzbur);
    localzccr.a(paramzh);
    zccp localzccp = null;
    zche localzche1 = null;
    zche localzche2 = null;
    zccn localzccn = null;
    zbtz localzbtz = null;
    ArrayList localArrayList = null;
    for (int i = 0; i < paramzbur.e.size(); i++)
    {
      localzbtz = (zbtz)paramzbur.e.get(i);
      localzccp = new zccp(localzbtz);
      localzccp.a(paramzh);
      localArrayList = localzbtz.c;
      for (int j = 0; j < localArrayList.size(); j++)
      {
        localzccn = new zccn(((Integer)localArrayList.get(j)).intValue());
        localzccn.a(paramzh);
        localzche2 = new zche(383);
        localzche2.a(paramzh);
      }
      localzche1 = new zche(252);
      localzche1.a(paramzh);
    }
    zche localzche3 = new zche(250);
    localzche3.a(paramzh);
    zche localzche4 = new zche(248);
    localzche4.a(paramzh);
  }
  
  void d(zh paramzh)
    throws Exception
  {
    zccj localzccj = new zccj(this.c);
    localzccj.a(paramzh);
    switch (this.c.f.c())
    {
    case 1: 
      e(paramzh);
      break;
    case 4: 
      f(paramzh);
      break;
    }
    zche localzche = new zche(186);
    localzche.a(paramzh);
  }
  
  void e(zh paramzh)
    throws Exception
  {
    zcci localzcci = new zcci(this.d.e[0]);
    localzcci.a(paramzh);
    zche localzche = new zche(188);
    localzche.a(paramzh);
  }
  
  void f(zh paramzh)
    throws Exception
  {
    zno localzno = (zno)this.c.f;
    zcch localzcch = new zcch(localzno);
    localzcch.a(paramzh);
    a(paramzh, localzno);
    b(paramzh, localzno);
    zche localzche = new zche(208);
    localzche.a(paramzh);
  }
  
  void a(zh paramzh, zno paramzno)
    throws Exception
  {
    if ((paramzno.c == null) || (paramzno.c.length == 0)) {
      return;
    }
    zche localzche1 = new zche(209, paramzno.c.length);
    localzche1.a(paramzh);
    for (int i = 0; i < paramzno.c.length; i++)
    {
      String[] arrayOfString = paramzno.c[i];
      if (arrayOfString.length != 0)
      {
        zche localzche3 = new zche(211, arrayOfString.length);
        localzche3.a(paramzh);
        for (int j = 0; j < arrayOfString.length; j++)
        {
          zccf localzccf = new zccf(arrayOfString[j]);
          localzccf.a(paramzh);
          zche localzche5 = new zche(214);
          localzche5.a(paramzh);
        }
        zche localzche4 = new zche(212);
        localzche4.a(paramzh);
      }
    }
    zche localzche2 = new zche(210);
    localzche2.a(paramzh);
  }
  
  void b(zh paramzh, zno paramzno)
    throws Exception
  {
    if ((paramzno.b == null) || (paramzno.b.length == 0)) {
      return;
    }
    zche localzche1 = new zche(215, paramzno.b.length);
    localzche1.a(paramzh);
    for (int i = 0; i < paramzno.b.length; i++)
    {
      znp localznp = paramzno.b[i];
      zccg localzccg = new zccg(localznp.a, this.d.e[i]);
      localzccg.a(paramzh);
      zche localzche3 = new zche(218);
      localzche3.a(paramzh);
    }
    zche localzche2 = new zche(216);
    localzche2.a(paramzh);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcgu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */