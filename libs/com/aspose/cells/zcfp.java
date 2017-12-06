package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcfp
{
  private zchd a;
  private Workbook b;
  private zqh c;
  private zcbw d;
  private int e;
  private byte[] f;
  private int g;
  private ExternalConnection h;
  
  zcfp(zchd paramzchd)
  {
    this.a = paramzchd;
    this.b = paramzchd.a;
    this.c = paramzchd.b;
  }
  
  void a(zcbw paramzcbw)
    throws Exception
  {
    this.d = paramzcbw;
    for (;;)
    {
      this.e = this.d.a();
      switch (this.e)
      {
      case 201: 
        c();
        break;
      case 203: 
        d();
        break;
      case 205: 
        e();
        break;
      case 261: 
        b();
        break;
      case 267: 
        a();
        break;
      case 538: 
        a(false);
        break;
      case 1068: 
        f();
        break;
      case 2109: 
        g();
        break;
      case 430: 
        return;
      default: 
        this.g = this.d.b();
        this.d.a(this.g);
      }
    }
  }
  
  private void a()
    throws Exception
  {
    this.f = this.a.a(this.d);
    ConnectionParameter localConnectionParameter = new ConnectionParameter(this.h);
    if (this.h.g == null) {
      this.h.g = new ConnectionParameterCollection(this.h);
    }
    this.h.g.a(localConnectionParameter);
    int i = 0;
    int j = this.f[i] & 0xFF & 0x7;
    switch (j)
    {
    case 0: 
      localConnectionParameter.setType(1);
      break;
    case 1: 
      localConnectionParameter.setType(2);
      break;
    case 2: 
      localConnectionParameter.setType(0);
      break;
    }
    localConnectionParameter.setRefreshOnChange((this.f[i] & 0xFF & 0x8) != 0);
    i += 2;
    localConnectionParameter.e = zwl.f(this.f[i] & 0xFF);
    i += 2;
    int k = this.f[i] & 0xFF;
    i += 4;
    localConnectionParameter.b = zcgj.d(this.f, i);
    i += 4 + localConnectionParameter.b.length() * 2;
    String str;
    if ((j == 0) && (k == 1))
    {
      str = zcgj.d(this.f, i);
      localConnectionParameter.a = str;
      i += 4 + str.length() * 2;
    }
    if (j == 1) {
      if (k == 2)
      {
        str = zcgj.d(this.f, i);
        localConnectionParameter.a = str;
        i += 4 + str.length() * 2;
      }
      else if ((k == 1) || (k == 32768))
      {
        localConnectionParameter.a = Double.valueOf(zc.f(this.f, i));
        i += 8;
      }
      else if (k == 4)
      {
        localConnectionParameter.a = (this.f[i] == 1 ? znq.d : znq.e);
        i++;
      }
    }
    if (j == 2)
    {
      int m = zc.a(this.f, i);
      int n = zc.a(this.f, i + m + 4);
      byte[] arrayOfByte = new byte[m + n + 8];
      System.arraycopy(this.f, i, arrayOfByte, 0, arrayOfByte.length);
      localConnectionParameter.a = arrayOfByte;
    }
  }
  
  private void b()
    throws Exception
  {
    this.f = this.a.a(this.d);
    WebQueryConnection localWebQueryConnection = (WebQueryConnection)this.h;
    int i = 0;
    switch (this.f[i])
    {
    case 0: 
      localWebQueryConnection.setHtmlFormat(1);
      break;
    case 1: 
      localWebQueryConnection.setHtmlFormat(2);
      break;
    case 2: 
      localWebQueryConnection.setHtmlFormat(0);
      break;
    }
    i++;
    localWebQueryConnection.y = zc.b(this.f, i);
    i += 3;
    int j = this.f[i] & 0xFF;
    i++;
    if ((j & 0x4) != 0)
    {
      localWebQueryConnection.d = zcgj.d(this.f, i);
      i += 4 + (localWebQueryConnection.d == null ? 0 : localWebQueryConnection.d.length() * 2);
    }
    if ((j & 0x1) != 0)
    {
      localWebQueryConnection.c = zcgj.d(this.f, i);
      i += 4 + (localWebQueryConnection.c == null ? 0 : localWebQueryConnection.c.length() * 2);
    }
    if ((j & 0x2) != 0)
    {
      localWebQueryConnection.a = zcgj.d(this.f, i);
      i += 4 + (localWebQueryConnection.a == null ? 0 : localWebQueryConnection.a.length() * 2);
    }
    for (;;)
    {
      this.e = this.d.a();
      zbvs localzbvs;
      switch (this.e)
      {
      case 262: 
        this.g = this.d.b();
        this.d.a(this.g);
        return;
      case 20: 
        this.f = this.a.a(this.d);
        localzbvs = new zbvs();
        localzbvs.b = true;
        localWebQueryConnection.a().a(localzbvs);
        break;
      case 24: 
        this.f = this.a.a(this.d);
        localzbvs = new zbvs();
        localzbvs.a = zcgj.d(this.f, 0);
        localWebQueryConnection.a().a(localzbvs);
        break;
      case 26: 
        this.f = this.a.a(this.d);
        localzbvs = new zbvs();
        localzbvs.a = Integer.valueOf(zc.a(this.f, 0));
        localWebQueryConnection.a().a(localzbvs);
        break;
      default: 
        this.g = this.d.b();
        this.d.a(this.g);
      }
    }
  }
  
  private void c()
    throws Exception
  {
    this.f = this.a.a(this.d);
    int i = zc.b(this.f, 10);
    this.h = zwl.a(i, this.b.getDataConnections());
    this.b.getDataConnections().a(this.h);
    int j = 0;
    this.h.s = this.f[j];
    this.h.o = this.f[(j + 1)];
    j += 2;
    this.h.t = (this.f[j] == 1);
    j += 2;
    this.h.n = zc.b(this.f, j);
    j += 2;
    this.h.m = zc.b(this.f, j);
    int k = this.f[(j + 2)] & 0xFF;
    j += 4;
    this.h.w = i;
    j += 4;
    switch (this.f[j])
    {
    case 1: 
      this.h.r = 1;
      break;
    case 2: 
      this.h.r = 2;
      break;
    case 3: 
      this.h.r = 3;
      break;
    }
    j += 4;
    this.h.l = zc.a(this.f, j);
    j += 4;
    switch (this.f[j])
    {
    case 0: 
      this.h.j = 0;
      break;
    case 1: 
      this.h.j = 1;
      break;
    case 2: 
      this.h.j = 3;
      break;
    case 3: 
      this.h.j = 2;
      break;
    }
    j++;
    if ((k & 0x1) != 0)
    {
      this.h.v = zcgj.d(this.f, j);
      j += 4 + (this.h.v == null ? 0 : this.h.v.length() * 2);
    }
    if ((k & 0x2) != 0)
    {
      this.h.q = zcgj.d(this.f, j);
      j += 4 + (this.h.q == null ? 0 : this.h.q.length() * 2);
    }
    if ((k & 0x4) != 0)
    {
      this.h.k = zcgj.d(this.f, j);
      j += 4 + (this.h.k == null ? 0 : this.h.k.length() * 2);
    }
    if ((k & 0x8) != 0)
    {
      this.h.p = zcgj.d(this.f, j);
      j += 4 + (this.h.p == null ? 0 : this.h.p.length() * 2);
    }
    if ((k & 0x10) != 0)
    {
      this.h.u = zcgj.d(this.f, j);
      j += 4 + (this.h.u == null ? 0 : this.h.u.length() * 2);
    }
  }
  
  private void d()
    throws Exception
  {
    this.f = this.a.a(this.d);
    if (!(this.h instanceof DBConnection)) {
      return;
    }
    int i = 0;
    DBConnection localDBConnection = (DBConnection)this.h;
    localDBConnection.setCommandType(zwl.h(this.f[0] & 0xFF));
    i += 4;
    int j = this.f[i];
    i++;
    localDBConnection.d = zcgj.d(this.f, i);
    i += 4 + localDBConnection.d.length() * 2;
    if ((j & 0xFF & 0x2) != 0)
    {
      localDBConnection.a = zcgj.d(this.f, i);
      i += 4 + (localDBConnection.a == null ? 0 : localDBConnection.a.length() * 2);
    }
    if ((j & 0xFF & 0x1) != 0)
    {
      localDBConnection.b = zcgj.d(this.f, i);
      i += 4 + (localDBConnection.b == null ? 0 : localDBConnection.b.length() * 2);
    }
  }
  
  private void e()
    throws Exception
  {
    this.f = this.a.a(this.d);
    DBConnection localDBConnection = (DBConnection)this.h;
    znj localznj = this.h.b();
    int i = 0;
    localznj.c = (this.f[i] & 0xFF);
    i++;
    localznj.a = zc.a(this.f, i);
    i += 4;
    int j = (this.f[i] & 0xFF & 0x1) != 0 ? 1 : 0;
    i++;
    if (j != 0) {
      localznj.b = zcgj.d(this.f, i);
    }
  }
  
  private void f()
    throws Exception
  {
    this.f = this.a.a(this.d);
    int i = 4;
    zwc localzwc = new zwc();
    localzwc.a = zcgj.d(this.f, i);
    i += 4 + (localzwc.a == null ? 0 : localzwc.a.length() * 2);
    localzwc.b = zcgj.d(this.f, i);
    this.h.e = localzwc;
  }
  
  private void g()
    throws Exception
  {
    this.f = this.a.a(this.d);
    int i = 4;
    zwd localzwd = new zwd();
    this.h.f = localzwd;
    localzwd.a = this.f[i];
    i++;
    localzwd.b = zcgj.d(this.f, i);
    for (;;)
    {
      this.e = this.d.a();
      switch (this.e)
      {
      case 2110: 
        this.g = this.d.b();
        this.d.a(this.g);
        return;
      case 2129: 
        a(true);
        break;
      case 2115: 
        k();
        break;
      case 2116: 
        h();
        break;
      case 2111: 
      case 2113: 
      case 2117: 
      case 2120: 
        a(this.e);
        break;
      case 2112: 
      case 2114: 
      case 2118: 
      case 2119: 
      case 2121: 
      case 2122: 
      case 2123: 
      case 2124: 
      case 2125: 
      case 2126: 
      case 2127: 
      case 2128: 
      default: 
        this.g = this.d.b();
        this.d.a(this.g);
      }
    }
  }
  
  private void h()
    throws Exception
  {
    zbao localzbao = new zbao();
    localzbao.a = i();
    this.h.f.c = localzbao;
  }
  
  private void a(int paramInt)
    throws Exception
  {
    zauh localzauh = null;
    if (this.h.f != null)
    {
      localzauh = (zauh)this.h.f.c;
    }
    else
    {
      localzauh = new zauh();
      this.h.f.c = localzauh;
    }
    switch (paramInt)
    {
    case 2111: 
      localzauh.a = 0;
      localzauh.b = i();
      break;
    case 2113: 
      localzauh.a = 1;
      localzauh.b = i();
      break;
    case 2120: 
      localzauh.d = i();
      break;
    case 2117: 
      localzauh.c = i();
      break;
    }
  }
  
  private String i()
    throws Exception
  {
    this.f = this.a.a(this.d);
    int i = 4;
    return zcgj.d(this.f, i);
  }
  
  private zbvu j()
  {
    if ((this.h instanceof zbvu)) {
      return (zbvu)this.h;
    }
    zbvu localzbvu = new zbvu(this.b.getDataConnections());
    this.b.getDataConnections().removeAt(this.b.getDataConnections().getCount() - 1);
    localzbvu.a(this.h);
    this.b.getDataConnections().a(localzbvu);
    return localzbvu;
  }
  
  private void k()
  {
    this.f = this.a.a(this.d);
    zbvu localzbvu = j();
    localzbvu.z = ((this.f[0] & 0xFF & 0x1) != 0);
  }
  
  private void a(boolean paramBoolean)
    throws Exception
  {
    this.f = this.a.a(this.d);
    int i = paramBoolean ? 4 : 0;
    int j = i;
    zbvu localzbvu = j();
    localzbvu.A = zc.a(this.f, j);
    localzbvu.d = zbvu.d((localzbvu.A & 0xFFC) >> 2);
    j += 4;
    if (localzbvu.m()) {
      localzbvu.c = ((char)zc.b(this.f, j));
    }
    j += 2;
    localzbvu.B = zc.a(this.f, j);
    j += 4;
    localzbvu.a = ((char)(this.f[j] & 0xFF));
    j++;
    localzbvu.b = ((char)(this.f[j] & 0xFF));
    j++;
    localzbvu.y = zcgj.d(this.f, j);
    localzbvu.C = new znm();
    for (;;)
    {
      this.e = this.d.a();
      switch (this.e)
      {
      case 539: 
      case 2130: 
        this.g = this.d.b();
        this.d.a(this.g);
        return;
      case 542: 
      case 2133: 
        this.f = this.a.a(this.d);
        localzbvu.C.a(zc.a(this.f, 4 + i), zc.a(this.f, i));
        break;
      default: 
        this.g = this.d.b();
        this.d.a(this.g);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcfp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */