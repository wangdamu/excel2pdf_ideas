package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

class zavb
{
  static Color[] a(Workbook paramWorkbook)
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = paramWorkbook.getWorksheets().A();
    int i = localArrayList2.size();
    for (int j = 0; j < i; j++)
    {
      Font localFont = (Font)localArrayList2.get(j);
      a(localFont, localArrayList1);
    }
    zajm localzajm = paramWorkbook.getWorksheets().C();
    i = localArrayList2.size();
    for (int k = 0; k < i; k++)
    {
      Style localStyle = localzajm.a(k);
      if (localStyle != null) {
        a(localStyle, localArrayList1);
      }
    }
    DxfCollection localDxfCollection = paramWorkbook.getWorksheets().getDxfs();
    i = localDxfCollection.getCount();
    Object localObject;
    for (int m = 0; m < i; m++)
    {
      localObject = localDxfCollection.get(m);
      b((Style)localObject, localArrayList1);
    }
    for (m = 0; m < paramWorkbook.getWorksheets().getCount(); m++)
    {
      localObject = paramWorkbook.getWorksheets().get(m).getCharts();
      for (int i1 = 0; i1 < ((ChartCollection)localObject).getCount(); i1++) {
        a(((ChartCollection)localObject).get(i1), localArrayList1);
      }
    }
    Color[] arrayOfColor = new Color[localArrayList1.size()];
    for (int n = 0; n < localArrayList1.size(); n++) {
      arrayOfColor[n] = ((Color)localArrayList1.get(n));
    }
    return arrayOfColor;
  }
  
  static void a(Style paramStyle, ArrayList paramArrayList)
  {
    a(paramStyle.getFont(), paramArrayList);
    if (paramStyle.isGradient())
    {
      a(paramArrayList, paramStyle.getForegroundColor());
      a(paramArrayList, paramStyle.getBackgroundColor());
    }
    else
    {
      switch (paramStyle.getPattern())
      {
      case 0: 
        break;
      case 1: 
        a(paramArrayList, paramStyle.getForegroundColor());
        break;
      default: 
        a(paramArrayList, paramStyle.getForegroundColor());
        a(paramArrayList, paramStyle.getBackgroundColor());
      }
    }
  }
  
  static void b(Style paramStyle, ArrayList paramArrayList)
  {
    if (paramStyle.isModified(16)) {
      a(paramStyle.getFont(), paramArrayList);
    }
    if (paramStyle.isModified(34)) {
      a(paramArrayList, paramStyle.getForegroundColor());
    }
    if (paramStyle.isModified(35)) {
      a(paramArrayList, paramStyle.getBackgroundColor());
    }
    if (paramStyle.isGradient())
    {
      a(paramArrayList, paramStyle.getForegroundColor());
      a(paramArrayList, paramStyle.getBackgroundColor());
    }
  }
  
  static void a(Font paramFont, ArrayList paramArrayList)
  {
    if (!paramFont.getColor().isEmpty()) {
      a(paramArrayList, paramFont.getColor());
    }
  }
  
  static void a(Chart paramChart, ArrayList paramArrayList)
  {
    a(paramChart.getChartArea(), paramArrayList);
    a(paramChart.getPlotArea(), paramArrayList);
    a(paramChart.getLegend(), paramArrayList);
    if ((paramChart.u() == null) || (paramChart.r() != null)) {
      a(paramChart.r(), paramArrayList);
    }
    if (paramChart.getCategoryAxis().isVisible()) {
      a(paramChart.getCategoryAxis(), paramArrayList);
    }
    if (paramChart.getValueAxis().isVisible()) {
      a(paramChart.getValueAxis(), paramArrayList);
    }
    if ((paramChart.s() != null) && (paramChart.getSeriesAxis().isVisible())) {
      a(paramChart.getSeriesAxis(), paramArrayList);
    }
    if (paramChart.getSecondCategoryAxis().isVisible()) {
      a(paramChart.getSecondCategoryAxis(), paramArrayList);
    }
    if (paramChart.getSecondValueAxis().isVisible()) {
      a(paramChart.getSecondValueAxis(), paramArrayList);
    }
    for (int i = 0; i < paramChart.getNSeries().getCount(); i++)
    {
      Series localSeries = paramChart.getNSeries().get(i);
      a(localSeries, paramArrayList);
    }
    if (ChartCollection.b(paramChart.getType()))
    {
      if (paramChart.w() != null) {
        a(paramChart.w(), paramArrayList);
      }
      if (paramChart.x() != null) {
        a(paramChart.x(), paramArrayList);
      }
    }
  }
  
  static void a(Floor paramFloor, ArrayList paramArrayList)
  {
    a(paramFloor, paramArrayList);
    if (paramFloor.c != null) {
      a(paramFloor.c, paramArrayList);
    }
  }
  
  static void a(Series paramSeries, ArrayList paramArrayList)
  {
    if (paramSeries.r() != null) {
      a(paramSeries.r(), paramArrayList);
    }
    if (paramSeries.e() != null) {
      a(paramSeries.e(), paramArrayList);
    }
    if (paramSeries.f() != null) {
      a(paramSeries.f(), paramArrayList);
    }
    if (paramSeries.c() != null)
    {
      ArrayList localArrayList = paramSeries.c().a;
      for (int i = 0; i < localArrayList.size(); i++)
      {
        ChartPoint localChartPoint = (ChartPoint)localArrayList.get(i);
        a(localChartPoint, paramArrayList);
      }
    }
  }
  
  static void a(ChartPoint paramChartPoint, ArrayList paramArrayList)
  {
    if (paramChartPoint.j() != null) {
      a(paramChartPoint.j(), paramArrayList);
    }
    if (paramChartPoint.g() != null) {
      a(paramChartPoint.g(), paramArrayList);
    }
    if (paramChartPoint.f() != null) {
      a(paramChartPoint.f(), paramArrayList);
    }
  }
  
  static void a(Axis paramAxis, ArrayList paramArrayList)
  {
    a(paramAxis.n(), paramArrayList);
  }
  
  static void a(ChartFrame paramChartFrame, ArrayList paramArrayList)
  {
    if (paramChartFrame.j() != null) {
      a(paramChartFrame.getFont(), paramArrayList);
    }
    if (paramChartFrame.h() != null) {
      a(paramChartFrame.h(), paramArrayList);
    }
    if (paramChartFrame.g() != null) {
      a(paramChartFrame.g(), paramArrayList);
    }
  }
  
  static void a(Line paramLine, ArrayList paramArrayList)
  {
    if ((paramLine.isVisible()) && (!paramLine.isAutomaticColor())) {
      a(paramArrayList, paramLine.getColor());
    }
  }
  
  static void a(Area paramArea, ArrayList paramArrayList)
  {
    if (paramArea.getFormatting() == 2) {
      a(paramArrayList, paramArea.getForegroundColor());
    }
  }
  
  static void a(ArrayList paramArrayList, Color paramColor)
  {
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      Color localColor = (Color)paramArrayList.get(i);
      if ((localColor.toArgb() & 0xFFFFFF) == (paramColor.toArgb() & 0xFFFFFF)) {
        return;
      }
    }
    zf.a(paramArrayList, paramColor);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zavb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */