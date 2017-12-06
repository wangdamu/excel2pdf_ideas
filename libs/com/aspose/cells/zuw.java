package com.aspose.cells;

class zuw
{
  private zpe a;
  private ShapePropertyCollection b;
  private Workbook c;
  private boolean d = false;
  private zpi e;
  
  static boolean a(zcjz paramzcjz, zpe paramzpe, ShapePropertyCollection paramShapePropertyCollection)
    throws Exception
  {
    if (paramShapePropertyCollection == null) {
      return false;
    }
    zuw localzuw = new zuw(paramzpe, paramShapePropertyCollection);
    return localzuw.a(paramzcjz);
  }
  
  private zuw(zpe paramzpe, ShapePropertyCollection paramShapePropertyCollection)
  {
    this.a = paramzpe;
    this.c = paramzpe.a().a;
    this.b = paramShapePropertyCollection;
  }
  
  zuw(zpi paramzpi)
  {
    this.d = true;
    this.e = paramzpi;
    this.c = paramzpi.j.a;
  }
  
  private boolean a(zcjz paramzcjz)
    throws Exception
  {
    Area localArea = this.b.j();
    Line localLine = this.b.l();
    if ((localLine == null) && (this.b.b == 8))
    {
      Series localSeries = (Series)this.b.a;
      if (localSeries.getType() == 60) {
        localLine = localSeries.u().g();
      }
    }
    boolean bool1 = a(localArea);
    int i = (localLine != null) && (!localLine.isAuto()) ? 1 : 0;
    boolean bool2 = a();
    if ((!bool1) && (i == 0) && (!bool2)) {
      return false;
    }
    paramzcjz.c("c:spPr", null);
    Object localObject2;
    Object localObject3;
    if (bool1)
    {
      a(paramzcjz, localArea.getFillFormat());
    }
    else if ((this.b.b == 5) && ((this.b.a instanceof ChartPoint)))
    {
      localObject1 = (ChartPoint)this.b.a;
      localObject2 = ((ChartPoint)localObject1).a();
      if (localObject2 != null)
      {
        localObject3 = ((Series)localObject2).getShapeProperties().j();
        if ((localObject3 != null) && (a(localArea))) {
          a(paramzcjz, ((Area)localObject3).getFillFormat());
        }
      }
    }
    if (i != 0)
    {
      a(paramzcjz, localLine);
    }
    else if ((this.b.b == 5) && ((this.b.a instanceof ChartPoint)))
    {
      localObject1 = (ChartPoint)this.b.a;
      localObject2 = ((ChartPoint)localObject1).a();
      if (localObject2 != null)
      {
        localObject3 = ((Series)localObject2).getShapeProperties().l();
        if ((localObject3 != null) && (!((Line)localObject3).isAuto())) {
          a(paramzcjz, (Line)localObject3);
        }
      }
    }
    Object localObject1 = this.b.f();
    if (((localObject1 == null) || (((ztf)localObject1).b())) && (this.b.b == 5) && ((this.b.a instanceof ChartPoint)))
    {
      localObject2 = (ChartPoint)this.b.a;
      localObject3 = ((ChartPoint)localObject2).a();
      if (localObject3 != null)
      {
        ztf localztf = ((Series)localObject3).getShapeProperties().f();
        if ((localztf != null) && (!localztf.b()))
        {
          this.b.g().a(localztf, null);
          localObject1 = this.b.f();
        }
      }
    }
    zvl.a(paramzcjz, (ztf)localObject1);
    c(paramzcjz);
    b(paramzcjz);
    paramzcjz.b();
    return true;
  }
  
  private boolean a()
  {
    return ((this.b.f() != null) && (!this.b.f().b())) || (this.b.d() != null) || (this.b.b() != null);
  }
  
  private void b(zcjz paramzcjz)
    throws Exception
  {
    zbqq localzbqq1 = this.b.b();
    if ((localzbqq1 == null) && (this.b.b == 5) && ((this.b.a instanceof ChartPoint)))
    {
      ChartPoint localChartPoint = (ChartPoint)this.b.a;
      Series localSeries = localChartPoint.a();
      if (localSeries != null)
      {
        zbqq localzbqq2 = localSeries.getShapeProperties().b();
        if (localzbqq2 != null)
        {
          this.b.c().a(localzbqq2);
          localzbqq1 = this.b.b();
        }
      }
    }
    zvl.a(paramzcjz, localzbqq1);
  }
  
  private void c(zcjz paramzcjz)
    throws Exception
  {
    zbep localzbep1 = this.b.d();
    if ((localzbep1 == null) && (this.b.b == 5) && ((this.b.a instanceof ChartPoint)))
    {
      ChartPoint localChartPoint = (ChartPoint)this.b.a;
      Series localSeries = localChartPoint.a();
      if (localSeries != null)
      {
        zbep localzbep2 = localSeries.getShapeProperties().d();
        if (localzbep2 != null)
        {
          this.b.e().a(localzbep2);
          localzbep1 = this.b.d();
        }
      }
    }
    zvl.a(paramzcjz, localzbep1);
  }
  
  private boolean a(Area paramArea)
  {
    boolean bool = (paramArea != null) && (paramArea.getFormatting() != 0);
    if ((bool) && (paramArea.getFillFormat().getFillType() == 5) && (paramArea.getFillFormat().getPattern() == 1) && (paramArea.getFillFormat().getPatternFill().b.b())) {
      bool = false;
    }
    return bool;
  }
  
  void a(zcjz paramzcjz, FillFormat paramFillFormat)
    throws Exception
  {
    if (paramFillFormat.getFillType() == 1)
    {
      paramzcjz.b("a:noFill", null);
    }
    else if (paramFillFormat.getFillType() == 6)
    {
      paramzcjz.b("a:grpFill", null);
    }
    else if (paramFillFormat.getFillType() == 3)
    {
      GradientFill localGradientFill = paramFillFormat.getGradientFill();
      zvl.a(paramzcjz, localGradientFill, this.c);
    }
    else if (paramFillFormat.getFillType() == 5)
    {
      zvl.a(paramzcjz, paramFillFormat.getPatternFill(), this.c);
    }
    else if (paramFillFormat.getFillType() == 4)
    {
      zvl.a(paramzcjz, paramFillFormat.getTextureFill(), a(paramFillFormat.getTextureFill()));
    }
    else if (paramFillFormat.getFillType() == 2)
    {
      zvl.a(paramzcjz, paramFillFormat.getSolidFill(), this.c);
    }
  }
  
  String a(TextureFill paramTextureFill)
    throws Exception
  {
    String str = null;
    if (this.d) {
      str = this.e.k.a(paramTextureFill);
    } else {
      str = this.a.a(paramTextureFill.getImageData());
    }
    return str;
  }
  
  private void a(zcjz paramzcjz, Line paramLine)
    throws Exception
  {
    paramzcjz.c("a:ln", null);
    Object localObject = null;
    if (paramLine.k())
    {
      String str1 = zauj.z(zauj.a(paramLine.getWeightPt()));
      paramzcjz.a("w", str1);
    }
    if (paramLine.isVisible())
    {
      localObject = paramLine.g().a(2);
      int i;
      if (localObject != null)
      {
        i = ((Integer)localObject).intValue();
        paramzcjz.a("cap", zaui.c(i));
      }
      localObject = paramLine.g().a(0);
      if (localObject != null)
      {
        i = ((Integer)localObject).intValue();
        paramzcjz.a("cmpd", zauj.n(i));
      }
    }
    if (!paramLine.isVisible()) {
      paramzcjz.b("a:noFill", null);
    } else if ((paramLine.getStyle() == 8) || (paramLine.getStyle() == 7) || (paramLine.getStyle() == 6)) {
      d(paramzcjz, paramLine);
    } else if ((paramLine.getFormattingType() == 3) && (paramLine.getGradientFill() != null)) {
      zvl.a(paramzcjz, paramLine.getGradientFill(), this.c);
    } else if ((paramLine.getFormattingType() == 1) && (!paramLine.getColor().isEmpty())) {
      c(paramzcjz, paramLine);
    }
    localObject = paramLine.g().a(1);
    if (localObject != null)
    {
      String str2 = zaui.b(paramLine.getDashType());
      a(paramzcjz, "a", "prstDash", str2);
    }
    b(paramzcjz, paramLine);
    a(paramzcjz, paramLine, true);
    a(paramzcjz, paramLine, false);
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, Line paramLine, boolean paramBoolean)
    throws Exception
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    String str = null;
    if (paramBoolean)
    {
      localObject1 = paramLine.g().a(4);
      localObject2 = paramLine.g().a(5);
      localObject3 = paramLine.g().a(6);
      str = "headEnd";
    }
    else
    {
      localObject1 = paramLine.g().a(7);
      localObject2 = paramLine.g().a(8);
      localObject3 = paramLine.g().a(9);
      str = "tailEnd";
    }
    if ((localObject3 == null) && (localObject1 == null) && (localObject2 == null)) {
      return;
    }
    paramzcjz.c("a:" + str, null);
    if (localObject1 != null) {
      paramzcjz.a("type", zaui.e(((Integer)localObject1).intValue()));
    }
    if (localObject2 != null) {
      paramzcjz.a("w", zaui.g(((Integer)localObject2).intValue()));
    }
    if (localObject3 != null) {
      paramzcjz.a("len", zaui.f(((Integer)localObject3).intValue()));
    }
    paramzcjz.b();
  }
  
  private void b(zcjz paramzcjz, Line paramLine)
    throws Exception
  {
    Object localObject = paramLine.g().a(3);
    if (localObject != null)
    {
      int i = ((Integer)localObject).intValue();
      if (i == 1)
      {
        paramzcjz.b("a:bevel", null);
      }
      else if (i == 2)
      {
        paramzcjz.c("a:miter", null);
        paramzcjz.a("lim", "800000");
        paramzcjz.b();
      }
      else if (i == 0)
      {
        paramzcjz.b("a:round", null);
      }
    }
  }
  
  private void c(zcjz paramzcjz, Line paramLine)
    throws Exception
  {
    paramzcjz.c("a:solidFill", null);
    zvl.a(paramzcjz, paramLine.b, -1, this.c);
    paramzcjz.b();
  }
  
  private void d(zcjz paramzcjz, Line paramLine)
    throws Exception
  {
    String str = "pct25";
    if (paramLine.getStyle() == 7) {
      str = "pct50";
    } else if (paramLine.getStyle() == 6) {
      str = "pct75";
    }
    paramzcjz.c("a:pattFill", null);
    paramzcjz.a("prst", str);
    paramzcjz.c("a:fgClr", null);
    a(paramzcjz, "a", "srgbClr", "000000");
    paramzcjz.b();
    paramzcjz.c("a:bgClr", null);
    a(paramzcjz, "a", "srgbClr", "FFFFFF");
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private static void a(zcjz paramzcjz, String paramString1, String paramString2, String paramString3)
    throws Exception
  {
    paramzcjz.c(paramString1 + ":" + paramString2, null);
    paramzcjz.a("val", paramString3);
    paramzcjz.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zuw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */