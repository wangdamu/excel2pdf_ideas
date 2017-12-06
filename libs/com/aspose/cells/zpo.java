package com.aspose.cells;

import com.aspose.cells.a.c.zi;
import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.HashMap;

class zpo
{
  ArrayList a = new ArrayList();
  ArrayList b = new ArrayList();
  ArrayList c = new ArrayList();
  ArrayList d = new ArrayList();
  ArrayList e = new ArrayList();
  HashMap f = new HashMap();
  HashMap g = new HashMap();
  private zpt h = null;
  
  static zpo a(zpt paramzpt)
  {
    zpo localzpo = new zpo();
    localzpo.h = paramzpt;
    localzpo.a();
    localzpo.b();
    zajm localzajm = paramzpt.a.getWorksheets().C();
    Style localStyle = localzajm.a(0);
    localStyle.a(false);
    localzpo.a(localStyle, 0);
    localStyle = localzajm.a(15);
    localStyle.a(true);
    localzpo.a(localStyle, 15);
    int i = localzajm.b();
    for (int j = 1; j < i; j++) {
      if (j != 15)
      {
        localStyle = localzajm.a(j);
        localzpo.a(localStyle, j);
      }
    }
    return localzpo;
  }
  
  void a()
  {
    zpv localzpv1 = new zpv();
    localzpv1.b = new zrh();
    localzpv1.b.a = "none";
    localzpv1.a = zf.a(this.a, localzpv1);
    zpv localzpv2 = new zpv();
    localzpv2.b = new zrh();
    localzpv2.b.a = "gray125";
    localzpv2.a = zf.a(this.a, localzpv2);
  }
  
  void b()
  {
    zow localzow = new zow();
    localzow.c = new zox();
    localzow.e = new zox();
    localzow.b = new zox();
    localzow.d = new zox();
    localzow.f = new zox();
    localzow.a = zf.a(this.b, localzow);
  }
  
  void a(Style paramStyle, int paramInt)
  {
    zrv localzrv = new zrv();
    localzrv.r = paramStyle;
    localzrv.b = paramStyle.g();
    if ((paramStyle.r() != -1) && (paramStyle.r() != 0)) {
      localzrv.l = true;
    }
    localzrv.e = ((short)paramStyle.r());
    if (paramStyle.q() != null)
    {
      localzrv.f = ((short)paramStyle.getFont().m());
      localzrv.m = true;
    }
    if ((paramStyle.getPattern() != 0) || (paramStyle.isGradient()))
    {
      localzrv.g = a(paramStyle);
      localzrv.n = true;
    }
    if (paramStyle.d() != null)
    {
      localzrv.h = b(paramStyle);
      localzrv.o = true;
    }
    localzrv.c = zot.a(paramStyle);
    if (localzrv.c != null) {
      localzrv.p = true;
    }
    localzrv.d = zrk.b(paramStyle);
    if (localzrv.d != null) {
      localzrv.q = true;
    }
    localzrv.j = ((short)paramInt);
    int i;
    if (!paramStyle.g())
    {
      i = zf.a(this.c, localzrv);
      localzrv.a = i;
      this.g.put(Integer.valueOf(paramInt), Integer.valueOf(i));
      if (paramInt == 0) {
        a(paramStyle, "Normal", localzrv.a);
      } else if (paramStyle.getName() != null) {
        a(paramStyle, paramStyle.getName(), localzrv.a);
      }
    }
    else
    {
      if ((paramStyle.h() != 0) && (this.g.containsKey(Integer.valueOf(paramStyle.h())))) {
        localzrv.i = zi.a((Integer)this.g.get(Integer.valueOf(paramStyle.h())));
      }
      i = zf.a(this.d, localzrv);
      localzrv.a = i;
      if (this.h.r) {
        this.f.put(Integer.valueOf(paramInt), zauj.z(i));
      } else {
        this.f.put(Integer.valueOf(paramInt), Integer.valueOf(i));
      }
    }
  }
  
  void a(Style paramStyle, String paramString, int paramInt)
  {
    zoz localzoz = new zoz();
    localzoz.a = paramString;
    localzoz.b = paramInt;
    localzoz.d = paramStyle.u();
    zf.a(this.e, localzoz);
  }
  
  private short a(Style paramStyle)
  {
    if ((paramStyle.getPattern() == 0) && (!paramStyle.isGradient())) {
      return 0;
    }
    zpv localzpv1 = zpv.a(paramStyle);
    for (int i = 0; i < this.a.size(); i++)
    {
      zpv localzpv2 = (zpv)this.a.get(i);
      if (zpv.a(localzpv1, localzpv2)) {
        return (short)localzpv2.a;
      }
    }
    i = zf.a(this.a, localzpv1);
    localzpv1.a = i;
    return (short)i;
  }
  
  private short b(Style paramStyle)
  {
    if (!paramStyle.f()) {
      return 0;
    }
    zow localzow1 = zow.b(paramStyle);
    for (int i = 0; i < this.b.size(); i++)
    {
      zow localzow2 = (zow)this.b.get(i);
      if (zow.a(localzow1, localzow2)) {
        return (short)localzow2.a;
      }
    }
    i = zf.a(this.b, localzow1);
    localzow1.a = i;
    return (short)i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zpo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */