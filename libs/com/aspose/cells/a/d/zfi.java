package com.aspose.cells.a.d;

import com.aspose.cells.Color;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;

public class zfi
  extends zey
{
  private static float b = 14400.0F;
  private float c;
  private float d;
  private zfu f;
  private zp g;
  private zq h;
  private zfy i;
  private zeu j;
  private zfk k;
  private zfm l;
  private float m = 1.0F;
  private int n = -1;
  private int o = -1;
  
  public zfi(zdz paramzdz, float paramFloat1, float paramFloat2)
    throws Exception
  {
    super(paramzdz);
    if (paramzdz.b().t())
    {
      if (paramFloat1 > b * this.m) {
        this.m = ((int)(paramFloat1 / b + 1.0F));
      }
      if (paramFloat2 > b * this.m) {
        this.m = ((int)(paramFloat2 / b + 1.0F));
      }
    }
    this.c = (paramFloat1 / this.m);
    this.d = (paramFloat2 / this.m);
    this.f = new zfu(this.e, false);
    this.k = new zfk(null, this.f);
    this.i = new zfy(this.e, this.f);
    this.j = new zeu(this.e, this.e.c(), this.f);
    this.e.j().a();
    this.e.j().a(new com.aspose.cells.b.a.b.a.zi(1.0F / this.m, 0.0F, 0.0F, -1.0F / this.m, 0.0F, this.d), this.f);
  }
  
  public void b() {}
  
  public void a(zb paramzb)
    throws Exception
  {
    if (this.e.b().v())
    {
      zdr localzdr = paramzb.g();
      if ((localzdr != null) && (localzdr.c() != 0)) {
        if (localzdr.c() == 2) {
          this.f.c("/Artifact BMC");
        } else {
          this.f.c("/P <</MCID " + c() + ">> BDC");
        }
      }
    }
    a(paramzb);
  }
  
  private zfv a(zdr paramzdr)
  {
    zfv localzfv1 = (zfv)this.e.h().d().get(0);
    if (localzfv1.c().size() > 0)
    {
      int i1 = localzfv1.c().size() - 1;
      localzfs = (zfs)localzfv1.c().get(i1);
      if (localzfs.b() == paramzdr.a())
      {
        localzfx = (zfx)localzfs.c().get(0);
        if (paramzdr.c() != 1) {
          return localzfx;
        }
        if (localzfx.b() >= 0)
        {
          int i2;
          if (paramzdr.b() <= localzfx.d())
          {
            if (paramzdr.b() >= localzfx.b())
            {
              localzfv2 = (zfv)localzfx.e().get(paramzdr.b() - localzfx.b());
            }
            else
            {
              for (i2 = localzfx.b() - 1; i2 > paramzdr.b(); i2--) {
                localzfx.b(0, new zfv(this.e, "/TR"));
              }
              localzfv2 = new zfv(this.e, "/TR");
              localzfx.b(0, localzfv2);
              localzfx.c(paramzdr.b());
            }
          }
          else
          {
            for (i2 = localzfx.d() + 1; i2 < paramzdr.b(); i2++) {
              localzfx.b(new zfv(this.e, "/TR"));
            }
            localzfv2 = new zfv(this.e, "/TR");
            localzfx.b(localzfv2);
            localzfx.d(paramzdr.b());
          }
        }
        else
        {
          localzfv2 = new zfv(this.e, "/TR");
          localzfx.b(localzfv2);
          localzfx.c(paramzdr.b());
          localzfx.d(paramzdr.b());
        }
        localzfv3 = new zfv(this.e, "/TD");
        localzfv3.b(o());
        localzfv2.a(localzfv3);
        return localzfv3;
      }
    }
    if (paramzdr.c() == 11)
    {
      localzfs = new zfs(this.e, "/Chartsheet", paramzdr.a());
      localzfv1.a(localzfs);
      return localzfs;
    }
    zfs localzfs = new zfs(this.e, "/Worksheet", paramzdr.a());
    localzfv1.a(localzfs);
    zfx localzfx = new zfx(this.e);
    localzfs.a(localzfx);
    if (paramzdr.c() != 1) {
      return localzfx;
    }
    zfv localzfv2 = new zfv(this.e, "/TR");
    localzfx.b(localzfv2);
    localzfx.c(paramzdr.b());
    localzfx.d(paramzdr.b());
    zfv localzfv3 = new zfv(this.e, "/TD");
    localzfv3.b(o());
    localzfv2.a(localzfv3);
    return localzfv3;
  }
  
  private static String a(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return "/P";
    case 4: 
    case 11: 
      return "/Chart";
    case 5: 
      return "/Shape";
    case 6: 
      return "/Figure";
    case 2: 
      return "/Artifact";
    case 3: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 12: 
      return "/Span";
    }
    throw new IllegalArgumentException("Invalid page element role type");
  }
  
  public void b(zb paramzb)
    throws Exception
  {
    b(paramzb);
    zdt localzdt = null;
    if (paramzb.d() != null) {
      localzdt = a(paramzb.d());
    }
    if (this.e.b().v())
    {
      zdr localzdr = paramzb.g();
      if ((localzdr != null) && (localzdr.c() != 0))
      {
        this.f.c("EMC");
        if (localzdr.c() == 2) {
          return;
        }
        zfv localzfv1 = a(localzdr);
        zfv localzfv2;
        Object localObject;
        if (localzdt != null)
        {
          localzfv2 = new zfv(this.e, a(localzdr.c()));
          localzfv2.b(o());
          localzfv1.a(localzfv2);
          localObject = new zfv(this.e, "/Link");
          ((zfv)localObject).b(o());
          localzfv2.a((zfv)localObject);
          zfe localzfe = new zfe(this.e);
          localzfe.a(localzdt.o());
          localzfe.b(o());
          ((zfv)localObject).a(localzfe);
          if (localzdt.d() < 0)
          {
            localzdt.a(this.e.h().c());
            zf.a(this.e.h().b(), ((zfv)localObject).o());
          }
          zfv localzfv3 = new zfv(this.e, "/Span");
          localzfv3.b(o());
          localzfv3.a(this.o);
          ((zfv)localObject).a(localzfv3);
          if (this.n < 0)
          {
            this.n = this.e.h().c();
            zf.a(this.e.h().b(), new ArrayList());
          }
          ArrayList localArrayList = (ArrayList)this.e.h().b().get(this.n);
          zf.a(localArrayList, localzfv3.o());
        }
        else
        {
          localzfv2 = new zfv(this.e, a(localzdr.c()));
          localzfv2.b(o());
          localzfv2.a(this.o);
          localzfv1.a(localzfv2);
          if (this.n < 0)
          {
            this.n = this.e.h().c();
            zf.a(this.e.h().b(), new ArrayList());
          }
          localObject = (ArrayList)this.e.h().b().get(this.n);
          zf.a((ArrayList)localObject, localzfv2.o());
        }
      }
    }
  }
  
  public void a(zh paramzh)
    throws Exception
  {
    a(paramzh);
    this.i.a(paramzh);
    if (paramzh.m() != null) {
      a(paramzh.m());
    }
    b(paramzh);
  }
  
  public void a(zp paramzp)
    throws Exception
  {
    a(paramzp);
    if (c(paramzp)) {
      this.j.a(paramzp.e(), false);
    }
    if (paramzp.d() != null) {
      this.j.a(paramzp.d());
    }
    this.g = paramzp;
  }
  
  public void b(zp paramzp)
    throws Exception
  {
    this.f.c(d());
    this.h = null;
    b(paramzp);
  }
  
  public void a(zq paramzq)
    throws Exception
  {
    if (e()) {
      this.f.c("h");
    }
    this.k.a(paramzq);
    this.h = paramzq;
  }
  
  public void b(zq paramzq)
    throws Exception
  {
    this.k.b(paramzq);
  }
  
  public void a(zu paramzu)
    throws Exception
  {
    this.k.a(paramzu);
  }
  
  public void a(zt paramzt)
    throws Exception
  {
    this.k.a(paramzt);
  }
  
  public void a(za paramza)
    throws Exception
  {
    this.k.a(paramza);
  }
  
  public void a(zl paramzl)
    throws Exception
  {
    if ((!a) && (paramzl == null)) {
      throw new AssertionError();
    }
    if (paramzl.e() != 0)
    {
      com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh(paramzl.d());
      try
      {
        com.aspose.cells.b.a.b.za localza = (com.aspose.cells.b.a.b.za)com.aspose.cells.b.a.b.za.a(localzh);
        if ((localza.c() == 2498570) || (localza.c() == 139273))
        {
          this.j.a(localza, paramzl.b(), paramzl.c(), paramzl.a());
        }
        else
        {
          localza = zcc.a(localza);
          this.j.a(localza, paramzl.b(), paramzl.c(), paramzl.a());
        }
        if (paramzl.g() != null) {
          a(paramzl.g());
        }
      }
      catch (Exception localException)
      {
        com.aspose.cells.a.c.zl.b(localException);
      }
    }
  }
  
  public void a(zez paramzez)
    throws Exception
  {
    b(paramzez);
    this.f.a(paramzez);
  }
  
  private void b(zez paramzez)
    throws Exception
  {
    paramzez.a(this);
    paramzez.g();
    paramzez.a("/Type", "/Page");
    paramzez.a("/Parent", this.e.d().o());
    paramzez.a("/Contents", this.f.o());
    paramzez.a("/MediaBox", new com.aspose.cells.b.a.b.zq(0.0F, 0.0F, this.c, this.d));
    if (!this.e.b().u()) {
      paramzez.a("/Group", "<< /CS /DeviceRGB /S /Transparency /Type /Group >>");
    }
    if ((this.e.b().v()) && (this.n >= 0)) {
      paramzez.a("/StructParents", this.n);
    }
    if (this.l != null)
    {
      paramzez.a("/Annots");
      this.l.a(paramzez);
    }
    if (this.m > 1.0F) {
      paramzez.a("/UserUnit", this.m);
    }
    paramzez.a("/Resources");
    paramzez.g();
    this.e.c().a(paramzez, n());
    paramzez.h();
    paramzez.h();
    paramzez.b();
  }
  
  private void a(zbv paramzbv)
    throws Exception
  {
    if (zbn.a(paramzbv))
    {
      this.e.j().a(this.f);
      if (zbn.c(paramzbv)) {
        this.e.j().a(paramzbv.a(), this.f);
      }
      if (zbn.d(paramzbv))
      {
        if (zbn.c(paramzbv.b())) {
          this.e.j().a(paramzbv.b().a(), this.f);
        }
        this.e.j().a(paramzbv.b(), this.f);
        if (zbn.c(paramzbv.b()))
        {
          com.aspose.cells.b.a.b.a.zi localzi = paramzbv.b().a().b();
          localzi.e();
          this.e.j().a(localzi, this.f);
          localzi = null;
        }
      }
    }
  }
  
  private void b(zbv paramzbv)
    throws Exception
  {
    if (zbn.a(paramzbv)) {
      this.e.j().b(this.f);
    }
  }
  
  private String d()
    throws Exception
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if ((!a) && (this.g.e() == null) && (this.g.d() == null)) {
      throw new AssertionError();
    }
    boolean bool = c(this.g);
    if ((bool) && (this.g.d() != null))
    {
      localStringBuilder.append(e() ? "b" : "B");
      if (this.g.f() == 0) {
        localStringBuilder.append("*");
      }
    }
    else if (bool)
    {
      if ((this.g.e() instanceof zi))
      {
        localStringBuilder.append(" W  n ");
        zfr localzfr = this.e.c().a(this.g.e());
        localzfr.b(n());
        localStringBuilder.append("/" + localzfr.q() + " sh ");
      }
      else
      {
        localStringBuilder.append("f");
        if (this.g.f() == 0) {
          localStringBuilder.append("*");
        }
      }
    }
    else if (this.g.d() != null)
    {
      localStringBuilder.append(e() ? "s" : "S");
    }
    return zs.a(localStringBuilder);
  }
  
  public zdt a(zk paramzk)
  {
    if ((!a) && (paramzk == null)) {
      throw new AssertionError();
    }
    if (this.l == null) {
      this.l = new zfm();
    }
    zdt localzdt = new zdt(this.e, this.e.j().a(paramzk.a()), paramzk.c(), paramzk.b());
    this.l.add(localzdt.o());
    this.e.e().a(localzdt);
    this.e.e().a(paramzk.c(), localzdt.a());
    return localzdt;
  }
  
  private boolean e()
  {
    return (this.h != null) && (this.h.b());
  }
  
  public void a(zm paramzm)
    throws Exception
  {
    this.e.j().a(this.f);
    this.j.a(paramzm.c);
    StringBuilder localStringBuilder = new StringBuilder(16);
    zgd.a(paramzm.a, localStringBuilder);
    localStringBuilder.append(" m");
    this.f.c(zs.a(localStringBuilder));
    localStringBuilder.setLength(0);
    zgd.a(paramzm.b, localStringBuilder);
    localStringBuilder.append(" l");
    this.f.c(zs.a(localStringBuilder));
    this.f.c("S");
    this.e.j().b(this.f);
  }
  
  private boolean c(zp paramzp)
  {
    if (paramzp.e() == null) {
      return false;
    }
    if ((this.e.b().u()) && ((paramzp.e() instanceof com.aspose.cells.b.a.b.zu)))
    {
      com.aspose.cells.b.a.b.zu localzu = (com.aspose.cells.b.a.b.zu)paramzp.e();
      if (localzu.a().getA() == 0) {
        return false;
      }
    }
    return true;
  }
  
  public int c()
  {
    return ++this.o;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zfi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */