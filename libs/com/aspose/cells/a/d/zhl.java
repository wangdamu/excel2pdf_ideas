package com.aspose.cells.a.d;

import com.aspose.cells.Color;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.zas;
import com.aspose.cells.zcjz;
import java.util.ArrayList;

public class zhl
{
  private boolean a;
  private zhi b;
  private zas c;
  private boolean d;
  
  public zhl(zhi paramzhi, zas paramzas, boolean paramBoolean)
  {
    this.b = paramzhi;
    this.c = paramzas;
    this.d = paramBoolean;
  }
  
  public void a(int paramInt, float paramFloat1, float paramFloat2)
    throws Exception
  {
    if (this.d) {
      this.c.a("FixedPage");
    } else {
      this.c.b("FixedPage");
    }
    if (this.d)
    {
      this.c.c("xmlns", "http://schemas.microsoft.com/xps/2005/06");
      this.c.c("xmlns:x", "http://schemas.microsoft.com/xps/2005/06/resourcedictionary-key");
    }
    this.c.c("xml:lang", "en-us");
    this.c.c("Width", zhj.b(paramFloat1));
    this.c.c("Height", zhj.b(paramFloat2));
    this.c.c("Name", "Page" + paramInt);
    if ((zdh.a(this.b.d().a())) && (this.d)) {
      this.c.a().c("Generated by " + this.b.d().a());
    }
    this.c.b("Canvas");
    zi localzi = new zi();
    localzi.a(1.3333334F, 1.3333334F, 0);
    this.c.c("RenderTransform", zhj.a(localzi));
  }
  
  public void a()
    throws Exception
  {
    this.c.c();
    if (this.d) {
      this.c.b();
    } else {
      this.c.c();
    }
  }
  
  public void a(zb paramzb)
    throws Exception
  {
    this.c.b("Canvas");
    if (paramzb.d() != null) {
      this.c.c("FixedPage.NavigateUri", a(paramzb.d()));
    }
    if (paramzb.a() != null) {
      this.c.c("RenderTransform", zhj.a(paramzb.a()));
    }
    if (zbn.d(paramzb))
    {
      if ((paramzb.b() != null) && (paramzb.b().h().size() > 0))
      {
        localObject = paramzb.b().h();
        zq localzq = (zq)((ArrayList)localObject).get(0);
        if ((Math.abs(localzq.a().d()) > 1.0E7D) || (Math.abs(localzq.a().e()) > 1.0E7D)) {
          return;
        }
      }
      Object localObject = new zhp(null, true);
      this.c.c("Clip", ((zhp)localObject).a(paramzb.b(), true));
    }
  }
  
  public void b()
    throws Exception
  {
    this.c.c();
  }
  
  public void a(zp paramzp)
    throws Exception
  {
    this.a = zhq.a(this.c, this.b, paramzp);
  }
  
  public void c()
    throws Exception
  {
    if (this.a) {
      zhq.a(this.c);
    }
  }
  
  public void a(zl paramzl)
    throws Exception
  {
    this.c.b("Path");
    if (paramzl.g() != null) {
      this.c.c("FixedPage.NavigateUri", a(paramzl.g()));
    }
    zp localzp = zp.b(new com.aspose.cells.b.a.b.zq(paramzl.b(), paramzl.c()));
    zhp localzhp = new zhp(null);
    this.c.c("Data", localzhp.a(localzp, false));
    this.c.b("Path.Fill");
    zhg.a(this.c, this.b, paramzl.d(), paramzl.h(), 4, null);
    this.c.c();
    this.c.c();
  }
  
  public void a(zh paramzh)
    throws Exception
  {
    String str1 = this.c.d(paramzh.h());
    zgs localzgs = zav.a().b(paramzh.d().a(), paramzh.d().c(), false);
    str1 = this.b.a(localzgs, str1);
    if (zdh.a(str1))
    {
      str1 = str1.startsWith("{") ? "{}" + str1 : str1;
      this.c.b("Glyphs");
      this.c.c("OriginX", com.aspose.cells.a.c.zp.b(paramzh.g().d()));
      this.c.c("OriginY", com.aspose.cells.a.c.zp.b(paramzh.g().e()));
      this.c.c("UnicodeString", str1);
      Color localColor = paramzh.e().isEmpty() ? paramzh.f() : paramzh.f().isEmpty() ? Color.getBlack() : paramzh.e();
      this.c.c("Fill", zhj.a(localColor));
      this.c.c("FontRenderingEmSize", com.aspose.cells.a.c.zp.b(paramzh.d().b()));
      localzgs = zav.a().b(paramzh.d().a(), paramzh.d().c(), false);
      String str2 = this.b.a(localzgs);
      this.c.c("FontUri", str2);
      String str3 = a(paramzh.d());
      if (zdh.a(str3)) {
        this.c.c("StyleSimulations", str3);
      }
      if (paramzh.a() != null) {
        this.c.c("RenderTransform", zhj.a(paramzh.a()));
      }
      if (paramzh.b() != null)
      {
        zhp localzhp = new zhp(null);
        this.c.c("Clip", localzhp.a(paramzh.b(), true));
      }
      if (paramzh.m() != null) {
        this.c.c("FixedPage.NavigateUri", a(paramzh.m()));
      }
      this.c.c();
    }
  }
  
  private static String a(zbj paramzbj)
  {
    String str = "";
    if (paramzbj.k().k() != paramzbj.c()) {
      if ((paramzbj.d()) && (paramzbj.e())) {
        str = "BoldItalicSimulation";
      } else if (paramzbj.d()) {
        str = "BoldSimulation";
      } else if (paramzbj.e()) {
        str = "ItalicSimulation";
      }
    }
    return str;
  }
  
  private String a(zk paramzk)
  {
    return paramzk.b() ? "#" + this.b.a(paramzk.c()) : this.d ? "../FixedDocument.fdoc#" + this.b.a(paramzk.c()) : paramzk.c();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zhl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */