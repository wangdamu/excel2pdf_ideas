package com.aspose.cells;

import com.aspose.cells.b.c.a.za;
import java.util.HashMap;

class zakq
{
  private zqh a = null;
  private Chart b = null;
  private ShapePropertyCollection c = null;
  private HashMap d = null;
  private Workbook e = null;
  private static final za f = new za(new String[] { "pct25", "pct50", "pct75" });
  
  zakq(ShapePropertyCollection paramShapePropertyCollection, zqi paramzqi, Chart paramChart, HashMap paramHashMap)
  {
    this.c = paramShapePropertyCollection;
    this.b = paramChart;
    this.d = paramHashMap;
    this.a = paramzqi.m;
    this.e = this.a.a;
  }
  
  zakq(zqi paramzqi, HashMap paramHashMap)
  {
    this.d = paramHashMap;
    if (paramzqi != null) {
      this.a = paramzqi.m;
    }
    this.e = this.a.a;
  }
  
  void a(zcjy paramzcjy, Object paramObject)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    Area localArea = new Area(this.b, paramObject);
    Line localLine = this.c.l();
    if (localLine != null) {
      localLine.n(0);
    }
    paramzcjy.d();
    Object localObject;
    while (zauz.a(paramzcjy)) {
      if ("noFill".equals(paramzcjy.q()))
      {
        localArea.setFormatting(1);
        paramzcjy.a();
      }
      else if (("solidFill".equals(paramzcjy.q())) && (!paramzcjy.o()))
      {
        localObject = zakf.a(paramzcjy);
        if (!((zaml)localObject).b())
        {
          localArea.getFillFormat().setFillType(2);
          localArea.getFillFormat().getSolidFill().a = ((zaml)localObject);
        }
      }
      else if (("pattFill".equals(paramzcjy.q())) && (!paramzcjy.o()))
      {
        b(paramzcjy, localArea.getFillFormat());
      }
      else if (("gradFill".equals(paramzcjy.q())) && (!paramzcjy.o()))
      {
        localArea.getFillFormat().setFillType(3);
        localObject = localArea.getFillFormat().getGradientFill();
        a(paramzcjy, (GradientFill)localObject);
      }
      else if (("blipFill".equals(paramzcjy.q())) && (!paramzcjy.o()))
      {
        a(paramzcjy, localArea.getFillFormat());
      }
      else if ("grpFill".equals(paramzcjy.q()))
      {
        localArea.getFillFormat().setFillType(6);
        paramzcjy.a();
      }
      else if ("ln".equals(paramzcjy.q()))
      {
        a(paramzcjy, this.c.m());
      }
      else if ("scene3d".equals(paramzcjy.q()))
      {
        if (paramzcjy.o()) {
          paramzcjy.a();
        } else {
          zalf.a(paramzcjy, this.c.e());
        }
      }
      else if ("sp3d".equals(paramzcjy.q()))
      {
        zalf.a(paramzcjy, this.c.c());
      }
      else if ("effectLst".equals(paramzcjy.q()))
      {
        zalf.a(paramzcjy, this.c.g());
      }
      else
      {
        paramzcjy.a();
      }
    }
    if (localArea.getFormatting() != 0)
    {
      localObject = this.c.k();
      if (localObject != null) {
        ((Area)localObject).a(localArea, null);
      }
    }
    this.c.n();
  }
  
  void a(zcjy paramzcjy, FillFormat paramFillFormat)
    throws Exception
  {
    paramFillFormat.setFillType(4);
    TextureFill localTextureFill = paramFillFormat.getTextureFill();
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if ("blip".equals(paramzcjy.q())) {
        b(paramzcjy, localTextureFill);
      } else if ("stretch".equals(paramzcjy.q())) {
        c(paramzcjy, localTextureFill);
      } else if ("tile".equals(paramzcjy.q())) {
        a(paramzcjy, localTextureFill);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void a(zcjy paramzcjy, TextureFill paramTextureFill)
    throws Exception
  {
    paramTextureFill.setTilePicOption(new TilePicOption());
    if (paramzcjy.n())
    {
      TilePicOption localTilePicOption = paramTextureFill.getTilePicOption();
      while (paramzcjy.m()) {
        if ("tx".equals(paramzcjy.q())) {
          localTilePicOption.setOffsetX(zauj.C(paramzcjy.t()));
        } else if ("ty".equals(paramzcjy.q())) {
          localTilePicOption.setOffsetY(zauj.C(paramzcjy.t()));
        } else if ("sx".equals(paramzcjy.q())) {
          localTilePicOption.setScaleX(zauj.C(paramzcjy.t()) / 1000.0D);
        } else if ("sy".equals(paramzcjy.q())) {
          localTilePicOption.setScaleY(zauj.C(paramzcjy.t()) / 1000.0D);
        } else if ("flip".equals(paramzcjy.q())) {
          localTilePicOption.setMirrorType(zauj.aw(paramzcjy.t()));
        } else if ("algn".equals(paramzcjy.q())) {
          localTilePicOption.setAlignmentType(zauj.ax(paramzcjy.t()));
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
  }
  
  private void b(zcjy paramzcjy, TextureFill paramTextureFill)
    throws Exception
  {
    if (this.a == null)
    {
      paramzcjy.a();
      return;
    }
    String str = paramzcjy.a("embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
    if (str == null)
    {
      paramzcjy.a();
      return;
    }
    Object localObject;
    if (this.d != null)
    {
      localObject = this.d.get(str);
      if (localObject != null)
      {
        zrl localzrl = (zrl)localObject;
        int i = localzrl.a(true);
        if (i == -1) {
          paramTextureFill.d = localzrl.h;
        } else {
          paramTextureFill.a(localzrl.a(true));
        }
      }
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("alphaModFix".equals(paramzcjy.q()))
      {
        localObject = paramzcjy.a("amt");
        paramzcjy.a();
        if (localObject != null) {
          paramTextureFill.b(zauj.F((String)localObject));
        }
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void c(zcjy paramzcjy, TextureFill paramTextureFill)
    throws Exception
  {
    paramTextureFill.setPicFormatOption(new PicFormatOption());
    PicFormatOption localPicFormatOption = paramTextureFill.getPicFormatOption();
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("fillRect".equals(paramzcjy.q()))
      {
        String str1 = paramzcjy.a("l");
        String str2 = paramzcjy.a("t");
        String str3 = paramzcjy.a("r");
        String str4 = paramzcjy.a("b");
        paramzcjy.a();
        if (str1 != null) {
          localPicFormatOption.b(zauj.F(str1));
        }
        if (str2 != null) {
          localPicFormatOption.c(zauj.F(str2));
        }
        if (str3 != null) {
          localPicFormatOption.d(zauj.F(str3));
        }
        if (str4 != null) {
          localPicFormatOption.e(zauj.F(str4));
        }
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  void a(zcjy paramzcjy, GradientFill paramGradientFill)
    throws Exception
  {
    String str1 = paramzcjy.a("rotWithShape");
    if (str1 != null) {
      paramGradientFill.c = ("1".equals(str1));
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if (("gsLst".equals(paramzcjy.q())) && (!paramzcjy.o()))
      {
        c(paramzcjy, paramGradientFill);
      }
      else if ("lin".equals(paramzcjy.q()))
      {
        paramGradientFill.b = new zadp();
        zadp localzadp = paramGradientFill.e();
        String str2 = paramzcjy.a("ang");
        if (str2 != null) {
          localzadp.a = zauj.F(str2);
        }
        String str3 = paramzcjy.a("scaled");
        if ("1".equals(str3)) {
          localzadp.b = true;
        }
        paramzcjy.a();
      }
      else if ("path".equals(paramzcjy.q()))
      {
        paramGradientFill.b = new zadq();
        b(paramzcjy, paramGradientFill);
      }
      else if ("tileRect".equals(paramzcjy.q()))
      {
        a(paramzcjy, paramGradientFill.g());
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void b(zcjy paramzcjy, GradientFill paramGradientFill)
    throws Exception
  {
    zadq localzadq = paramGradientFill.f();
    String str = paramzcjy.a("path");
    if (str != null) {
      localzadq.a = zauj.au(str);
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if ("fillToRect".equals(paramzcjy.q())) {
        a(paramzcjy, localzadq);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void a(zcjy paramzcjy, zadq paramzadq)
    throws Exception
  {
    String str1 = paramzcjy.a("l");
    String str2 = paramzcjy.a("t");
    String str3 = paramzcjy.a("r");
    String str4 = paramzcjy.a("b");
    paramzcjy.a();
    if (str1 != null) {
      paramzadq.b = zauj.F(str1);
    }
    if (str2 != null) {
      paramzadq.c = zauj.F(str2);
    }
    if (str3 != null) {
      paramzadq.e = zauj.F(str3);
    }
    if (str4 != null) {
      paramzadq.d = zauj.F(str4);
    }
  }
  
  private void c(zcjy paramzcjy, GradientFill paramGradientFill)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramGradientFill.getGradientStops().clear();
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("gs".equals(paramzcjy.q()))
      {
        GradientStop localGradientStop = new GradientStop(paramGradientFill.getGradientStops());
        String str = paramzcjy.a("pos");
        if (str != null) {
          localGradientStop.setPosition(zauj.F(str) / 1000.0D);
        }
        localGradientStop.a = zakf.a(paramzcjy);
        CellsColor localCellsColor = localGradientStop.getCellsColor();
        Color localColor = localCellsColor.getColor();
        paramGradientFill.getGradientStops().a(localGradientStop);
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  void b(zcjy paramzcjy, FillFormat paramFillFormat)
    throws Exception
  {
    paramFillFormat.setFillType(5);
    String str = paramzcjy.a("prst");
    PatternFill localPatternFill = paramFillFormat.getPatternFill();
    if (str != null) {
      localPatternFill.setPattern(zauj.Y(str));
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if (("fgClr".equals(paramzcjy.q())) && (!paramzcjy.o())) {
        localPatternFill.b = zakf.a(paramzcjy);
      } else if (("bgClr".equals(paramzcjy.q())) && (!paramzcjy.o())) {
        localPatternFill.a = zakf.a(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  void a(zcjy paramzcjy, Line paramLine)
    throws Exception
  {
    LineFormat localLineFormat = null;
    if (this.b != null) {
      localLineFormat = this.b.O().e();
    } else {
      localLineFormat = this.e.d().e();
    }
    Object localObject;
    if ((this.b != null) && (localLineFormat != null))
    {
      localObject = null;
      if (this.c.b == 8) {
        localObject = (Series)this.c.a;
      } else if (this.c.b == 5) {
        localObject = ((ChartPoint)this.c.a).a();
      }
      if (localObject != null) {
        switch (((Series)localObject).getType())
        {
        case 37: 
        case 38: 
        case 39: 
        case 40: 
        case 41: 
        case 42: 
        case 57: 
        case 58: 
        case 61: 
        case 62: 
        case 63: 
        case 64: 
          paramLine.b(localLineFormat);
          int i = 3;
          if ((((this.b.getStyle() >= 9) && (this.b.getStyle() <= 24) ? 1 : 0) | ((this.b.getStyle() >= 33) && (this.b.getStyle() <= 48) ? 1 : 0)) != 0) {
            i = 5;
          } else if ((this.b.getStyle() >= 25) && (this.b.getStyle() <= 32)) {
            i = 7;
          }
          paramLine.c(i * localLineFormat.getWeight());
          break;
        case 43: 
        case 44: 
        case 45: 
        case 46: 
        case 47: 
        case 48: 
        case 49: 
        case 50: 
        case 51: 
        case 52: 
        case 53: 
        case 54: 
        case 55: 
        case 56: 
        case 59: 
        case 60: 
        default: 
          paramLine.a(localLineFormat);
          break;
        }
      } else {
        paramLine.a(localLineFormat);
      }
    }
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("w".equals(paramzcjy.q())) {
          paramLine.c(zauj.l(zauj.F(paramzcjy.t())));
        } else if ("cap".equals(paramzcjy.q())) {
          paramLine.d(zaui.b(paramzcjy.t()));
        } else if ("cmpd".equals(paramzcjy.q())) {
          paramLine.b(zaui.a(paramzcjy.t()));
        }
      }
      paramzcjy.l();
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("noFill".equals(paramzcjy.q()))
      {
        paramLine.n(2);
        paramzcjy.a();
      }
      else if (("solidFill".equals(paramzcjy.q())) && (!paramzcjy.o()))
      {
        paramLine.n(1);
        paramLine.b = zakf.a(paramzcjy);
        paramLine.b(true);
      }
      else if (("gradFill".equals(paramzcjy.q())) && (!paramzcjy.o()))
      {
        paramLine.n(3);
        a(paramzcjy, paramLine.getGradientFill());
        paramLine.b(true);
      }
      else if ("pattFill".equals(paramzcjy.q()))
      {
        paramLine.n(1);
        localObject = paramzcjy.a("prst");
        switch (f.a((String)localObject))
        {
        case 0: 
          paramLine.m(8);
          break;
        case 1: 
          paramLine.m(7);
          break;
        case 2: 
          paramLine.m(6);
          break;
        default: 
          paramLine.m(0);
        }
        paramzcjy.a();
      }
      else if ("prstDash".equals(paramzcjy.q()))
      {
        localObject = a(paramzcjy);
        if (localObject != null) {
          paramLine.c(zaui.a((String)localObject, paramLine.getCapType()));
        }
      }
      else if ("miter".equals(paramzcjy.q()))
      {
        paramLine.e(2);
        paramzcjy.a();
      }
      else if ("round".equals(paramzcjy.q()))
      {
        paramLine.e(0);
        paramzcjy.a();
      }
      else if ("bevel".equals(paramzcjy.q()))
      {
        paramLine.e(1);
        paramzcjy.a();
      }
      else if ("headEnd".equals(paramzcjy.q()))
      {
        a(paramzcjy, paramLine, true);
      }
      else if ("tailEnd".equals(paramzcjy.q()))
      {
        a(paramzcjy, paramLine, false);
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void a(zcjy paramzcjy, Line paramLine, boolean paramBoolean)
    throws Exception
  {
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("len".equals(paramzcjy.q()))
        {
          if (paramBoolean) {
            paramLine.h(zaui.f(paramzcjy.t()));
          } else {
            paramLine.i(zaui.f(paramzcjy.t()));
          }
        }
        else if ("type".equals(paramzcjy.q()))
        {
          if (paramBoolean) {
            paramLine.f(zaui.d(paramzcjy.t()));
          } else {
            paramLine.g(zaui.d(paramzcjy.t()));
          }
        }
        else if ("w".equals(paramzcjy.q())) {
          if (paramBoolean) {
            paramLine.j(zaui.g(paramzcjy.t()));
          } else {
            paramLine.k(zaui.g(paramzcjy.t()));
          }
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
  }
  
  private static String a(zcjy paramzcjy)
    throws Exception
  {
    String str = paramzcjy.a("val");
    paramzcjy.a();
    return str;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zakq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */