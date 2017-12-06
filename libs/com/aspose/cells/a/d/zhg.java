package com.aspose.cells.a.d;

import com.aspose.cells.Color;
import com.aspose.cells.a.c.zd;
import com.aspose.cells.a.c.zp;
import com.aspose.cells.b.a.b.a.zg;
import com.aspose.cells.b.a.b.a.zh;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zu;
import com.aspose.cells.b.a.b.zx;
import com.aspose.cells.b.a.zm;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.zas;

public class zhg
{
  public static void a(zas paramzas, zhi paramzhi, zc paramzc)
    throws Exception
  {
    if (paramzc == null) {
      return;
    }
    if ((paramzc instanceof zu))
    {
      a(paramzas, (zu)paramzc);
    }
    else
    {
      Object localObject;
      if ((paramzc instanceof zx))
      {
        localObject = (zx)zm.a(paramzc, zx.class);
        a(paramzas, paramzhi, (zx)localObject);
      }
      else if ((paramzc instanceof zg))
      {
        b(paramzas, paramzhi, (zg)paramzc);
      }
      else if ((paramzc instanceof zi))
      {
        localObject = (zi)paramzc;
        zh localzh = new zh(((zi)localObject).d(), ((zi)localObject).c(), ((zi)localObject).b(), ((zi)localObject).a());
        a(paramzas, localzh);
      }
    }
  }
  
  public static void a(zas paramzas, zhi paramzhi, byte[] paramArrayOfByte, zq paramzq, int paramInt, com.aspose.cells.b.a.b.a.zi paramzi)
    throws Exception
  {
    zhn localzhn = paramzhi.a(paramArrayOfByte);
    paramzas.b("ImageBrush");
    paramzas.c("ImageSource", localzhn.a());
    zcb localzcb = localzhn.b();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(0);
    localStringBuilder.append(',');
    localStringBuilder.append(0);
    localStringBuilder.append(',');
    localStringBuilder.append(zhj.b(localzcb.f()));
    localStringBuilder.append(',');
    localStringBuilder.append(zhj.b(localzcb.g()));
    String str1 = zs.a(localStringBuilder);
    paramzas.c("Viewbox", str1);
    localStringBuilder = new StringBuilder();
    localStringBuilder.append(zp.b(paramzq.f()));
    localStringBuilder.append(',');
    localStringBuilder.append(zp.b(paramzq.g()));
    localStringBuilder.append(',');
    localStringBuilder.append(zp.b(paramzq.h() > 0.0F ? paramzq.h() : (float)localzcb.f()));
    localStringBuilder.append(',');
    localStringBuilder.append(zp.b(paramzq.i() > 0.0F ? paramzq.i() : (float)localzcb.g()));
    String str2 = zs.a(localStringBuilder);
    paramzas.c("Viewport", str2);
    paramzas.c("ViewboxUnits", "Absolute");
    paramzas.c("ViewportUnits", "Absolute");
    if (paramzi != null) {
      paramzas.c("Transform", zhj.a(paramzi.b()));
    }
    paramzas.c("TileMode", zhj.d(paramInt));
    paramzas.c();
  }
  
  private static void a(zas paramzas, zu paramzu)
    throws Exception
  {
    paramzas.b("SolidColorBrush");
    paramzas.c("Color", zhj.a(paramzu.a()));
    paramzas.c();
  }
  
  private static void a(zas paramzas, zh paramzh)
    throws Exception
  {
    paramzas.b("LinearGradientBrush");
    paramzas.c("MappingMode", "Absolute");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(zp.b(paramzh.o().f()));
    localStringBuilder.append(',');
    localStringBuilder.append(zp.b(paramzh.o().g()));
    paramzas.c("StartPoint", zs.a(localStringBuilder));
    localStringBuilder = new StringBuilder();
    localStringBuilder.append(zp.b(paramzh.o().l()));
    localStringBuilder.append(',');
    localStringBuilder.append(zp.b(paramzh.o().k()));
    paramzas.c("EndPoint", zs.a(localStringBuilder));
    paramzas.c("SpreadMethod", "Repeat");
    if (paramzh.n() != null) {
      paramzas.c("Transform", zhj.a(paramzh.n()));
    } else {
      paramzas.c("Transform", zhj.a(new com.aspose.cells.b.a.b.a.zi()));
    }
    paramzas.b("LinearGradientBrush.GradientStops");
    if (paramzh.p() != null) {
      for (int i = 0; i < paramzh.p().length; i++) {
        a(paramzas, paramzh.p()[i], i);
      }
    }
    paramzas.c();
    paramzas.c();
  }
  
  private static void a(zas paramzas, Color paramColor, float paramFloat)
    throws Exception
  {
    paramzas.b("GradientStop");
    paramzas.c("Color", zhj.a(paramColor));
    paramzas.c("Offset", zp.b(paramFloat));
    paramzas.c();
  }
  
  private static void b(zas paramzas, zhi paramzhi, zc paramzc)
    throws Exception
  {
    byte[] arrayOfByte = zbp.a((zg)paramzc);
    a(paramzas, paramzhi, arrayOfByte, zq.c(), 0, null);
  }
  
  private static void a(zas paramzas, zhi paramzhi, zx paramzx)
    throws Exception
  {
    zd localzd = new zd(paramzx);
    try
    {
      byte[] arrayOfByte = zho.a(localzd);
      try
      {
        zcb localzcb = zcc.b(arrayOfByte);
        zq localzq = new zq(0.0F, 0.0F, localzcb.b(), localzcb.c());
        a(paramzas, paramzhi, arrayOfByte, localzq, paramzx.c(), paramzx.b().b());
      }
      catch (Exception localException) {}
    }
    finally
    {
      if (localzd != null) {
        localzd.a();
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zhg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */