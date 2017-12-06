package com.aspose.cells;

import com.aspose.cells.a.d.zap;
import com.aspose.cells.a.d.zav;
import com.aspose.cells.a.d.zbj;
import com.aspose.cells.a.d.zcd;
import com.aspose.cells.a.d.zce;
import com.aspose.cells.a.d.zgs;
import com.aspose.cells.a.d.zh;
import com.aspose.cells.a.d.zhb;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.g.a.ze;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;

class zavt
{
  private static float c = ;
  static ze a = new ze("[-+]?(\\d+([\\.\\,]\\d*)?|[\\.\\,]\\d+)([eE]([-+]?([012]?\\d{1,2}|30[0-7])|-3([01]?[4-9]|[012]?[0-3])))?[dD]?[\\s]*");
  static ze b = new ze("[\\d,\\.]+");
  
  static int a(Workbook paramWorkbook)
  {
    if (paramWorkbook.h()) {
      return 1048575;
    }
    return 65535;
  }
  
  static int b(Workbook paramWorkbook)
  {
    if (paramWorkbook.h()) {
      return 16383;
    }
    return 255;
  }
  
  static int a(int paramInt)
  {
    switch (paramInt)
    {
    case 9: 
      return 49;
    case 8: 
      return 21;
    case 18: 
      return 7;
    case 17: 
      return 8;
    case 4: 
      return 9;
    case 2: 
      return 12;
    case 3: 
      return 14;
    case 5: 
      return 29;
    case 7: 
      return 20;
    case 10: 
      return 46;
    case 16: 
      return 10;
    case 14: 
      return 19;
    case 15: 
      return 48;
    case 11: 
      return 25;
    case 13: 
      return 18;
    case 12: 
      return 24;
    case 6: 
      return 28;
    }
    return 0;
  }
  
  static boolean a(zbje paramzbje, zgr paramzgr, int paramInt)
    throws Exception
  {
    if (paramInt != paramzbje.l().Q().getIndex()) {
      return false;
    }
    if ((paramzbje.c() > paramzbje.d()) || (paramzbje.f() > paramzbje.g())) {
      return false;
    }
    if (paramzbje.l().isHidden()) {
      return false;
    }
    if ((!(paramzbje.l() instanceof ChartShape)) && (paramzbje.l().ae().h() * paramzbje.l().ae().i() == 0.0F)) {
      return false;
    }
    if ((paramzbje.l() instanceof ChartShape))
    {
      localObject = (ChartShape)paramzbje.l();
      if (((ChartShape)localObject).getChart().getChartObject().getWidth() * ((ChartShape)localObject).getChart().getChartObject().getHeight() == 0) {
        return false;
      }
    }
    Object localObject = new com.aspose.cells.b.a.b.zp(paramzbje.f(), paramzbje.c(), paramzbje.g() - paramzbje.f() + 1, paramzbje.d() - paramzbje.c() + 1);
    com.aspose.cells.b.a.b.zp localzp = new com.aspose.cells.b.a.b.zp(paramzgr.b, paramzgr.a, paramzgr.d - paramzgr.b + 1, paramzgr.c - paramzgr.a + 1);
    return ((com.aspose.cells.b.a.b.zp)localObject).a(localzp);
  }
  
  static String a(int paramInt, char paramChar, Font paramFont)
    throws Exception
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = a(Character.toString(paramChar), paramFont, 1.0D);
    int j = paramInt / i;
    for (int k = 0; k < j; k++) {
      localStringBuilder.append(paramChar);
    }
    return com.aspose.cells.b.a.zs.a(localStringBuilder);
  }
  
  static int a(Font paramFont)
    throws Exception
  {
    com.aspose.cells.b.a.b.zs localzs = zgs.a(paramFont.getName(), (float)paramFont.getDoubleSize(), "|", paramFont.p());
    return localzs.c();
  }
  
  static boolean a(Style paramStyle1, Style paramStyle2)
  {
    if (paramStyle1 == null) {
      return false;
    }
    if ((paramStyle1.getForegroundColor().toArgb() != paramStyle2.getForegroundColor().toArgb()) || (paramStyle1.getPattern() != 0)) {
      return true;
    }
    if (paramStyle1.d() != null) {
      return (paramStyle1.getBorders().getByBorderType(4).getLineStyle() != 0) || (paramStyle1.getBorders().getByBorderType(8).getLineStyle() != 0) || (paramStyle1.getBorders().getByBorderType(1).getLineStyle() != 0) || (paramStyle1.getBorders().getByBorderType(2).getLineStyle() != 0);
    }
    return false;
  }
  
  static ArrayList a(Worksheet paramWorksheet)
  {
    Range[] arrayOfRange = paramWorksheet.getPageSetup().b(false);
    if (arrayOfRange == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    WorkbookSettings localWorkbookSettings = paramWorksheet.c().p().getSettings();
    int i = localWorkbookSettings.m();
    int j = localWorkbookSettings.n();
    for (int k = 0; k < arrayOfRange.length; k++)
    {
      CellArea localCellArea = arrayOfRange[k].a();
      if (localCellArea.c(j)) {
        localCellArea.StartColumn = (localCellArea.EndColumn = -1);
      } else if (localCellArea.d(i)) {
        localCellArea.StartRow = (localCellArea.EndRow = -1);
      }
      zf.a(localArrayList, localCellArea);
    }
    return localArrayList;
  }
  
  static int a(zahq paramzahq, int paramInt, double paramDouble1, double paramDouble2, boolean paramBoolean)
  {
    double d = paramzahq.b(paramInt) * 72.0D * paramDouble2;
    if (d > paramDouble1) {
      return paramInt;
    }
    paramDouble1 -= d;
    paramInt++;
    for (;;)
    {
      d = paramzahq.b(paramInt) * 72.0D * paramDouble2;
      paramDouble1 -= d;
      if (paramDouble1 > 0.0D)
      {
        paramInt++;
        if (paramInt == 255) {
          break;
        }
      }
    }
    if ((paramDouble1 < 0.0D) && (paramBoolean)) {
      paramInt--;
    }
    return paramInt;
  }
  
  static int a(Worksheet paramWorksheet, ArrayList paramArrayList)
  {
    return 0;
  }
  
  static int b(Worksheet paramWorksheet, ArrayList paramArrayList)
  {
    return 0;
  }
  
  static int a(String paramString, Font paramFont, double paramDouble, int paramInt)
    throws Exception
  {
    zqb localzqb = new zqb();
    localzqb.a = paramString;
    localzqb.b = paramFont;
    float f = Math.max(0.1F, (float)(localzqb.b.getDoubleSize() * paramDouble));
    int i = (localzqb.b.isBold() ? 1 : 0) | (localzqb.b.isItalic() ? 2 : 0) | (localzqb.b.isStrikeout() ? 8 : 0) | (localzqb.b.getUnderline() != 0 ? 4 : 0);
    zbj localzbj = zbj.a(localzqb.b.getName(), f, i);
    zh localzh = new zh(localzbj, Color.getBlack(), new zo(0.0F, 0.0F), localzqb.a, localzqb.b.isSuperscript(), localzqb.b.isSubscript());
    if (Math.abs(paramInt) == 90) {
      return (int)(localzh.i().c() / 72.0F * c * paramDouble + 0.9990000128746033D);
    }
    return (int)(localzh.i().b() / 72.0F * c * paramDouble + 0.9990000128746033D);
  }
  
  static double b(String paramString, Font paramFont, double paramDouble, int paramInt)
    throws Exception
  {
    zqb localzqb = new zqb();
    localzqb.a = paramString;
    localzqb.b = paramFont;
    float f = Math.max(0.1F, (float)(localzqb.b.getDoubleSize() * paramDouble));
    int i = paramFont.p();
    zbj localzbj = zbj.a(localzqb.b.getName(), f, i);
    zh localzh = new zh(localzbj, Color.getBlack(), new zo(0.0F, 0.0F), localzqb.a, localzqb.b.isSuperscript(), localzqb.b.isSubscript());
    if (Math.abs(paramInt) == 90) {
      return localzh.j().c();
    }
    if ((paramInt != 0) && (paramInt != 255)) {
      return localzh.j().b() * Math.cos(Math.abs(paramInt) / 180.0F * 3.14F);
    }
    return localzh.j().b();
  }
  
  static int a(String paramString, Font paramFont, double paramDouble)
    throws Exception
  {
    zqb localzqb = new zqb();
    localzqb.a = paramString;
    localzqb.b = paramFont;
    float f = Math.max(0.1F, (float)(localzqb.b.getDoubleSize() * paramDouble));
    int i = paramFont.p();
    zbj localzbj = zbj.a(localzqb.b.getName(), f, i);
    zh localzh = new zh(localzbj, Color.getBlack(), new zo(0.0F, 0.0F), localzqb.a, localzqb.b.isSuperscript(), localzqb.b.isSubscript());
    return (int)(localzh.i().b() / 72.0F * c * paramDouble + 0.5D) + 1;
  }
  
  static int b(String paramString, Font paramFont, double paramDouble)
    throws Exception
  {
    zqb localzqb = new zqb();
    localzqb.a = paramString;
    localzqb.b = paramFont;
    float f = Math.max(0.1F, zgz.b(paramFont.getDoubleSize(), (float)paramDouble));
    if ((paramFont.isSubscript()) || (paramFont.isSuperscript())) {
      f *= zgz.b;
    }
    int i = paramFont.p();
    zbj localzbj = zbj.a(localzqb.b.getName(), f, i);
    zh localzh = new zh(localzbj, Color.getBlack(), new zo(0.0F, 0.0F), localzqb.a, localzqb.b.isSuperscript(), localzqb.b.isSubscript());
    return (int)(localzh.j().b() / 72.0F * c + 0.5F);
  }
  
  public static zt a(String paramString, Font paramFont, double[] paramArrayOfDouble)
    throws Exception
  {
    zqb localzqb = new zqb();
    localzqb.a = paramString;
    localzqb.b = paramFont;
    float f = Math.max(0.1F, (float)(localzqb.b.getDoubleSize() * paramArrayOfDouble[1]));
    int i = (localzqb.b.isBold() ? 1 : 0) | (localzqb.b.isItalic() ? 2 : 0) | (localzqb.b.isStrikeout() ? 8 : 0) | (localzqb.b.getUnderline() != 0 ? 4 : 0);
    zbj localzbj = zbj.a(localzqb.b.getName(), f, i);
    zh localzh = new zh(localzbj, Color.getBlack(), new zo(0.0F, 0.0F), localzqb.a, localzqb.b.isSuperscript(), localzqb.b.isSubscript());
    return localzh.i();
  }
  
  private static Color a(String paramString, Color paramColor)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return paramColor;
    }
    paramString = paramString.toLowerCase();
    if (paramString.indexOf("[red]") >= 0) {
      return Color.getRed();
    }
    if (paramString.indexOf("[green]") >= 0) {
      return Color.getGreen();
    }
    return paramColor;
  }
  
  static Color a(double paramDouble, String paramString, Color paramColor)
  {
    String[] arrayOfString = zw.d(paramString, new char[] { ';' });
    if (arrayOfString.length >= 1)
    {
      if (paramDouble > 0.0D) {
        return a(arrayOfString[0], paramColor);
      }
      if ((paramDouble < 0.0D) && (arrayOfString.length >= 2)) {
        return a(arrayOfString[1], paramColor);
      }
      if ((Math.abs(paramDouble) < 1.0E-14D) && (arrayOfString.length >= 3)) {
        return a(arrayOfString[2], paramColor);
      }
    }
    return paramColor;
  }
  
  static Color a(Style paramStyle, Font paramFont, Cell paramCell)
  {
    if ((paramCell == null) || (paramCell.getType() != 4)) {
      return paramFont.getColor();
    }
    switch (paramStyle.getNumber())
    {
    case 0: 
      String str = paramStyle.s();
      if ((str == null) || ("".equals(str))) {
        return paramFont.getColor();
      }
      return a(paramCell.getDoubleValue(), paramStyle.s(), paramFont.getColor());
    case 6: 
    case 8: 
    case 38: 
    case 40: 
      return paramCell.getDoubleValue() < 0.0D ? Color.getRed() : paramFont.getColor();
    }
    return paramFont.getColor();
  }
  
  static Color a(Style paramStyle)
  {
    if (paramStyle.getPattern() == 0) {
      return Color.getEmpty();
    }
    return paramStyle.getForegroundColor();
  }
  
  static int[] b(Worksheet paramWorksheet)
  {
    Range[] arrayOfRange = paramWorksheet.getPageSetup().b(true);
    int[] arrayOfInt = { -1, -1, -1, -1 };
    if ((arrayOfRange == null) || (arrayOfRange.length == 0)) {
      return arrayOfInt;
    }
    if (arrayOfRange[0] != null)
    {
      arrayOfInt[0] = Math.min(arrayOfRange[0].a().StartRow, arrayOfRange[0].a().EndRow);
      arrayOfInt[1] = Math.max(arrayOfRange[0].a().StartRow, arrayOfRange[0].a().EndRow);
    }
    if ((arrayOfRange.length >= 2) && (arrayOfRange[1] != null))
    {
      arrayOfInt[2] = Math.min(arrayOfRange[1].a().StartColumn, arrayOfRange[1].a().EndColumn);
      arrayOfInt[3] = Math.max(arrayOfRange[1].a().StartColumn, arrayOfRange[1].a().EndColumn);
    }
    return arrayOfInt;
  }
  
  static double a(int paramInt, Font paramFont, double paramDouble)
    throws Exception
  {
    zgs localzgs = zav.a().b(paramFont.getName(), paramFont.p(), false);
    return localzgs.a(32, (float)paramFont.getDoubleSize()) * 3.0F * paramInt * paramDouble;
  }
  
  static double b(int paramInt, Font paramFont, double paramDouble)
    throws Exception
  {
    zgs localzgs = zav.a().b(paramFont.getName(), paramFont.p(), false);
    float f = zgz.b(paramFont.getDoubleSize(), (float)paramDouble);
    return localzgs.a(32, f) * 3.0F * paramInt;
  }
  
  static zt a(int paramInt, Font paramFont, double[] paramArrayOfDouble)
    throws Exception
  {
    zgs localzgs = zav.a().b(paramFont.getName(), paramFont.p(), false);
    float f1 = localzgs.c(com.aspose.cells.b.a.zp.a(paramInt) + " ", (float)paramFont.getDoubleSize()) * (float)paramArrayOfDouble[0];
    float f2 = localzgs.a((float)paramFont.getDoubleSize()) * (float)paramArrayOfDouble[1];
    return new zt(f1, f2);
  }
  
  static double a(Cells paramCells, int paramInt)
  {
    return paramCells.getRows().b.b(paramInt);
  }
  
  static int b(Cells paramCells, int paramInt)
  {
    return paramCells.getRows().b.a(paramInt);
  }
  
  static double a(Cells paramCells, int paramInt1, int paramInt2)
  {
    if (paramInt1 > paramInt2) {
      return 0.0D;
    }
    return paramCells.getRows().b.b(paramInt1, paramInt2);
  }
  
  static int b(Cells paramCells, int paramInt1, int paramInt2)
  {
    if (paramInt1 > paramInt2) {
      return 0;
    }
    return paramCells.getRows().b.a(paramInt1, paramInt2);
  }
  
  static double c(Cells paramCells, int paramInt)
  {
    return paramCells.b.b(paramInt) * 72.0D;
  }
  
  static double c(Cells paramCells, int paramInt1, int paramInt2)
  {
    if (paramInt1 > paramInt2) {
      return 0.0D;
    }
    return paramCells.b.c(paramInt1, paramInt2) * 72.0D;
  }
  
  static int d(Cells paramCells, int paramInt)
  {
    return paramCells.b.a(paramInt);
  }
  
  static int d(Cells paramCells, int paramInt1, int paramInt2)
  {
    if (paramInt1 > paramInt2) {
      return 0;
    }
    return paramCells.b.b(paramInt1, paramInt2);
  }
  
  static void a(ArrayList paramArrayList, Workbook paramWorkbook, boolean paramBoolean, zhb paramzhb)
    throws Exception
  {
    zgz.a(paramArrayList);
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      zqb localzqb = (zqb)localIterator.next();
      if (!zav.a().a(localzqb.b.getName(), localzqb.b.p(), localzqb.a, paramBoolean))
      {
        Font localFont = new Font(paramWorkbook.getWorksheets(), null, false);
        localFont.a(localzqb.b, null);
        localFont.setDoubleSize(localzqb.b.getDoubleSize());
        String str = paramzhb.a(localzqb.b.getName(), localzqb.b.p(), paramBoolean, localzqb.a);
        if (str != null)
        {
          localFont.setName(str);
          localzqb.b = localFont;
        }
        else
        {
          zcd[] arrayOfzcd = zce.a().a(localzqb.a);
          if (arrayOfzcd.length > 0)
          {
            zgs localzgs = zav.a().a(localzqb.b.p(), arrayOfzcd[0].a);
            if (localzgs != null)
            {
              localFont.setName(localzgs.a());
              localzqb.b = localFont;
            }
          }
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zavt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */