package com.aspose.cells.a.d;

import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.zas;

public class zhq
{
  public static boolean a(zas paramzas, zhi paramzhi, zp paramzp)
    throws Exception
  {
    zhp localzhp = new zhp(null);
    String str = localzhp.a(paramzp, false);
    if (!zdh.a(str)) {
      return false;
    }
    paramzas.b("Path");
    if (paramzp.d() != null)
    {
      paramzas.c("StrokeThickness", com.aspose.cells.a.c.zp.b(paramzp.d().b));
      paramzas.c("StrokeLineJoin", zhj.a(paramzp.d().f));
      if ((paramzp.d().f == 0) || (paramzp.d().f == 3)) {
        paramzas.c("StrokeMiterLimit", com.aspose.cells.a.c.zp.b(paramzp.d().h));
      }
      paramzas.c("StrokeStartLineCap", zhj.b(paramzp.d().c));
      paramzas.c("StrokeEndLineCap", zhj.b(paramzp.d().d));
      if (paramzp.d().g != 0)
      {
        paramzas.c("StrokeDashOffset", com.aspose.cells.a.c.zp.b(paramzp.d().k));
        paramzas.c("StrokeDashCap", zhj.c(paramzp.d().e));
        paramzas.c("StrokeDashArray", zhj.a(zhj.a(paramzp.d())));
      }
    }
    if (paramzp.a() != null) {
      paramzas.c("RenderTransform", zhj.a(paramzp.a()));
    }
    paramzas.c("Data", str);
    if (paramzp.b() != null) {
      paramzas.c("Clip", localzhp.a(paramzp.b(), true));
    }
    if (paramzp.e() != null) {
      a(paramzas, paramzhi, paramzp.e());
    }
    if (paramzp.d() != null) {
      a(paramzas, paramzhi, paramzp.d());
    }
    return true;
  }
  
  public static void a(zas paramzas)
    throws Exception
  {
    paramzas.c();
  }
  
  public static void a(zas paramzas, zhi paramzhi, zx paramzx)
    throws Exception
  {
    if (paramzx.i != 0) {
      return;
    }
    paramzas.b("Path.Stroke");
    paramzas.b("SolidColorBrush");
    paramzas.c("Color", zhj.a(paramzx.a));
    paramzas.c();
    paramzas.c();
  }
  
  public static void a(zas paramzas, zhi paramzhi, zc paramzc)
    throws Exception
  {
    paramzas.b("Path.Fill");
    zhg.a(paramzas, paramzhi, paramzc);
    paramzas.c();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zhq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */