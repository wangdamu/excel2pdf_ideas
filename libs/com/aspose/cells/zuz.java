package com.aspose.cells;

import java.util.HashMap;

class zuz
  extends ztp
{
  private zpu b;
  private int c = 1;
  
  zuz(zpu paramzpu)
  {
    this.b = paramzpu;
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    zvu.b(paramzcjz);
    b(paramzcjz);
    c(paramzcjz);
    ShapeCollection localShapeCollection = this.b.a.getPageSetup().j();
    for (int i = 0; i < localShapeCollection.getCount(); i++)
    {
      Picture localPicture = (Picture)localShapeCollection.get(i);
      a(paramzcjz, localPicture);
    }
    paramzcjz.b();
    paramzcjz.e();
  }
  
  private void b(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.c("o:shapelayout", null);
    paramzcjz.a("v:ext", null, "edit");
    paramzcjz.c("o:idmap", null);
    paramzcjz.a("v:ext", null, "edit");
    paramzcjz.a("data", "1");
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private void c(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.c("v:shapetype", null);
    paramzcjz.a("id", "\000t75");
    paramzcjz.a("coordsize", "21600,21600");
    paramzcjz.a("o:spt", null, "75");
    paramzcjz.a("o:preferrelative", null, "t");
    paramzcjz.a("path", "m@4@5l@4@11@9@11@9@5xe");
    paramzcjz.a("filled", "f");
    paramzcjz.a("stroked", "f");
    paramzcjz.c("v:stroke", null);
    paramzcjz.a("joinstyle", "miter");
    paramzcjz.b();
    d(paramzcjz);
    paramzcjz.c("v:path", null);
    paramzcjz.a("o:extrusionok", null, "f");
    paramzcjz.a("gradientshapeok", "t");
    paramzcjz.a("o:connecttype", null, "rect");
    paramzcjz.b();
    a(paramzcjz, true);
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, boolean paramBoolean)
    throws Exception
  {
    paramzcjz.c("o:lock", null);
    paramzcjz.a("v:ext", null, "edit");
    if (paramBoolean) {
      paramzcjz.a("aspectratio", "t");
    } else {
      paramzcjz.a("rotation", "t");
    }
    paramzcjz.b();
  }
  
  private void d(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.c("v:formulas", null);
    a(paramzcjz, "if lineDrawn pixelLineWidth 0");
    a(paramzcjz, "sum @0 1 0");
    a(paramzcjz, "sum 0 0 @1");
    a(paramzcjz, "prod @2 1 2");
    a(paramzcjz, "prod @3 21600 pixelWidth");
    a(paramzcjz, "prod @3 21600 pixelHeight");
    a(paramzcjz, "sum @0 0 1");
    a(paramzcjz, "prod @6 1 2");
    a(paramzcjz, "prod @7 21600 pixelWidth");
    a(paramzcjz, "sum @8 21600 0");
    a(paramzcjz, "prod @7 21600 pixelHeight");
    a(paramzcjz, "sum @10 21600 0");
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, String paramString)
    throws Exception
  {
    paramzcjz.c("v:f", null);
    paramzcjz.a("eqn", paramString);
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, Picture paramPicture)
    throws Exception
  {
    paramzcjz.c("v:shape", null);
    paramzcjz.a("id", paramPicture.getName());
    paramzcjz.a("type", "#\000t75");
    paramzcjz.a("style", a(paramPicture));
    paramzcjz.c("v:imagedata", null);
    String str = (String)this.b.i.b.get(Integer.valueOf(paramPicture.b()));
    paramzcjz.a("o:relid", null, str);
    if (paramPicture.getFormatPicture().getTopCrop() > 0.0D) {
      paramzcjz.a("croptop", zauj.b(paramPicture.getFormatPicture().getTopCrop() * 65536.0D) + "f");
    }
    if (paramPicture.getFormatPicture().getBottomCrop() > 0.0D) {
      paramzcjz.a("cropbottom", zauj.b(paramPicture.getFormatPicture().getBottomCrop() * 65536.0D) + "f");
    }
    if (paramPicture.getFormatPicture().getLeftCrop() > 0.0D) {
      paramzcjz.a("cropleft", zauj.b(paramPicture.getFormatPicture().getLeftCrop() * 65536.0D) + "f");
    }
    if (paramPicture.getFormatPicture().getRightCrop() > 0.0D) {
      paramzcjz.a("cropright", zauj.b(paramPicture.getFormatPicture().getRightCrop() * 65536.0D) + "f");
    }
    if (paramPicture.a != -1.0D) {
      paramzcjz.a("gain", zauj.b(paramPicture.a * 65536.0D) + "f");
    }
    if (paramPicture.b != -1.0D) {
      paramzcjz.a("blacklevel", zauj.b(paramPicture.b * 65536.0D) + "f");
    }
    paramzcjz.b();
    a(paramzcjz, false);
    paramzcjz.b();
  }
  
  private String a(Shape paramShape)
  {
    String str = "position:absolute;margin-left:" + paramShape.getLeftToCorner() + "px;margin-top:" + paramShape.getTopToCorner() + "px;width:" + zauj.z(paramShape.getWidth()) + "px;height:" + zauj.z(paramShape.getHeight()) + "px;z-index:" + this.c + ";";
    this.c += 1;
    return str;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zuz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */