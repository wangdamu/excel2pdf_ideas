package com.aspose.cells;

import com.aspose.cells.b.c.a.za;

class zbtc
{
  private static final za a = new za(new String[] { "Normal", "Comma", "Currency", "Percent", "Comma [0]", "Currency [0]", "Hyperlink", "Followed Hyperlink", "Note", "Warning Text", "Title", "Header 1", "Header 2", "Header 3", "Header 4", "Input", "Ouput", "Calculation", "Check Cell", "Linked Cell", "Total", "Good", "Bad", "Neutral", "Accent1", "20% - Accent1", "40% - Accent1", "60% - Accent1", "Accent2", "20% - Accent2", "40% - Accent2", "60% - Accent2", "Accent3", "20% - Accent3", "40% - Accent3", "60% - Accent3", "Accent4", "20% - Accent4", "40% - Accent4", "60% - Accent4", "Accent5", "20% - Accent5", "40% - Accent5", "60% - Accent5", "Accent6", "20% - Accent6", "40% - Accent6", "60% - Accent6", "Explanatory Text" });
  
  static void a(Style paramStyle1, Style paramStyle2, StyleFlag paramStyleFlag)
  {
    if (paramStyleFlag.getAll())
    {
      paramStyleFlag = new StyleFlag();
      paramStyleFlag.setBorders(true);
      paramStyleFlag.setFont(true);
      paramStyleFlag.setCellShading(true);
      paramStyleFlag.setHideFormula(true);
      paramStyleFlag.setHorizontalAlignment(true);
      paramStyleFlag.setIndent(true);
      paramStyleFlag.setLocked(true);
      paramStyleFlag.setNumberFormat(true);
      paramStyleFlag.setRotation(true);
      paramStyleFlag.setShrinkToFit(true);
      paramStyleFlag.setTextDirection(true);
      paramStyleFlag.setVerticalAlignment(true);
      paramStyleFlag.setWrapText(true);
    }
    if (paramStyleFlag.getBorders())
    {
      paramStyle2.getBorders().a(paramStyle1.getBorders(), null);
    }
    else
    {
      if (paramStyleFlag.getLeftBorder())
      {
        paramStyle2.getBorders().getByBorderType(1).setColor(paramStyle1.getBorders().getByBorderType(1).getColor());
        paramStyle2.getBorders().getByBorderType(1).setLineStyle(paramStyle1.getBorders().getByBorderType(1).getLineStyle());
      }
      if (paramStyleFlag.getRightBorder())
      {
        paramStyle2.getBorders().getByBorderType(2).setColor(paramStyle1.getBorders().getByBorderType(2).getColor());
        paramStyle2.getBorders().getByBorderType(2).setLineStyle(paramStyle1.getBorders().getByBorderType(2).getLineStyle());
      }
      if (paramStyleFlag.getTopBorder())
      {
        paramStyle2.getBorders().getByBorderType(4).setColor(paramStyle1.getBorders().getByBorderType(4).getColor());
        paramStyle2.getBorders().getByBorderType(4).setLineStyle(paramStyle1.getBorders().getByBorderType(4).getLineStyle());
      }
      if (paramStyleFlag.getBottomBorder())
      {
        paramStyle2.getBorders().getByBorderType(8).setColor(paramStyle1.getBorders().getByBorderType(8).getColor());
        paramStyle2.getBorders().getByBorderType(8).setLineStyle(paramStyle1.getBorders().getByBorderType(8).getLineStyle());
      }
      if (paramStyleFlag.getDiagonalDownBorder())
      {
        paramStyle2.getBorders().getByBorderType(16).setColor(paramStyle1.getBorders().getByBorderType(16).getColor());
        paramStyle2.getBorders().getByBorderType(16).setLineStyle(paramStyle1.getBorders().getByBorderType(16).getLineStyle());
      }
      if (paramStyleFlag.getDiagonalUpBorder())
      {
        paramStyle2.getBorders().getByBorderType(32).setColor(paramStyle1.getBorders().getByBorderType(32).getColor());
        paramStyle2.getBorders().getByBorderType(32).setLineStyle(paramStyle1.getBorders().getByBorderType(32).getLineStyle());
      }
    }
    if (paramStyleFlag.getFont())
    {
      paramStyle2.getFont().a(paramStyle1.getFont(), null);
    }
    else
    {
      if (paramStyleFlag.getFontBold()) {
        paramStyle2.getFont().setBold(paramStyle1.getFont().isBold());
      }
      if (paramStyleFlag.getFontColor()) {
        paramStyle2.getFont().setColor(paramStyle1.getFont().getColor());
      }
      if (paramStyleFlag.getFontItalic()) {
        paramStyle2.getFont().setItalic(paramStyle1.getFont().isItalic());
      }
      if (paramStyleFlag.getFontName()) {
        paramStyle2.getFont().a(paramStyle1.getFont().getName(), true, paramStyle1.getFont().n());
      }
      if (paramStyleFlag.getFontScript()) {
        paramStyle2.getFont().a(paramStyle1.getFont().f());
      }
      if (paramStyleFlag.getFontSize()) {
        paramStyle2.getFont().setSize(paramStyle1.getFont().getSize());
      }
      if (paramStyleFlag.getFontStrike()) {
        paramStyle2.getFont().setStrikeout(paramStyle1.getFont().isStrikeout());
      }
      if (paramStyleFlag.getFontUnderline()) {
        paramStyle2.getFont().setUnderline(paramStyle1.getFont().getUnderline());
      }
    }
    if (paramStyleFlag.getNumberFormat()) {
      if ((paramStyle1.s() == null) || ("".equals(paramStyle1.s()))) {
        paramStyle2.setNumber(paramStyle1.getNumber());
      } else {
        paramStyle2.b(paramStyle1.s());
      }
    }
    if (paramStyleFlag.getHorizontalAlignment()) {
      paramStyle2.setHorizontalAlignment(paramStyle1.getHorizontalAlignment());
    }
    if (paramStyleFlag.getVerticalAlignment()) {
      paramStyle2.setVerticalAlignment(paramStyle1.getVerticalAlignment());
    }
    if (paramStyleFlag.getIndent()) {
      paramStyle2.d(paramStyle1.getIndentLevel());
    }
    if (paramStyleFlag.getRotation()) {
      paramStyle2.setRotationAngle(paramStyle1.getRotationAngle());
    }
    if (paramStyleFlag.getWrapText()) {
      paramStyle2.setTextWrapped(paramStyle1.isTextWrapped());
    }
    if (paramStyleFlag.getShrinkToFit()) {
      paramStyle2.setShrinkToFit(paramStyle1.getShrinkToFit());
    }
    if (paramStyleFlag.getTextDirection()) {
      paramStyle2.setTextDirection(paramStyle1.getTextDirection());
    }
    if (paramStyleFlag.getCellShading())
    {
      paramStyle2.setForegroundColor(paramStyle1.getForegroundColor());
      paramStyle2.setBackgroundColor(paramStyle1.getBackgroundColor());
      paramStyle2.setPattern(paramStyle1.getPattern());
    }
    if (paramStyleFlag.getLocked()) {
      paramStyle2.setLocked(paramStyle1.isLocked());
    }
    if (paramStyleFlag.getHideFormula()) {
      paramStyle2.setFormulaHidden(paramStyle1.isFormulaHidden());
    }
  }
  
  static void a(Style paramStyle, Font paramFont, StyleFlag paramStyleFlag)
  {
    a(paramStyle.getFont(), paramFont, paramStyleFlag);
  }
  
  static void a(Font paramFont1, Font paramFont2, StyleFlag paramStyleFlag)
  {
    if ((paramStyleFlag.getFont()) || (paramStyleFlag.getAll()))
    {
      paramFont2.a(paramFont1, null);
    }
    else
    {
      if (paramStyleFlag.getFontBold()) {
        paramFont2.setBold(paramFont1.isBold());
      }
      if (paramStyleFlag.getFontColor()) {
        paramFont2.setColor(paramFont1.getColor());
      }
      if (paramStyleFlag.getFontItalic()) {
        paramFont2.setItalic(paramFont1.isItalic());
      }
      if (paramStyleFlag.getFontName()) {
        paramFont2.a(paramFont1.getName(), false, 0);
      }
      if (paramStyleFlag.getFontScript()) {
        paramFont2.a(paramFont1.f());
      }
      if (paramStyleFlag.getFontSize()) {
        paramFont2.setSize(paramFont1.getSize());
      }
      if (paramStyleFlag.getFontStrike()) {
        paramFont2.setStrikeout(paramFont1.isStrikeout());
      }
      if (paramStyleFlag.getFontUnderline()) {
        paramFont2.setUnderline(paramFont1.getUnderline());
      }
    }
  }
  
  static void a(Font paramFont1, Font paramFont2)
  {
    if (paramFont1.f(17)) {
      paramFont2.setBold(paramFont1.isBold());
    }
    if (paramFont1.f(16)) {
      paramFont2.setColor(paramFont1.getColor());
    }
    if (paramFont1.f(18)) {
      paramFont2.setItalic(paramFont1.isItalic());
    }
    if (paramFont1.f(13)) {
      paramFont2.a(paramFont1.getName(), false, 0);
    }
    if (paramFont1.f(23)) {
      paramFont2.a(paramFont1.f());
    }
    if (paramFont1.f(12)) {
      paramFont2.setSize(paramFont1.getSize());
    }
    if (paramFont1.f(20)) {
      paramFont2.setStrikeout(paramFont1.isStrikeout());
    }
    if (paramFont1.f(19)) {
      paramFont2.setUnderline(paramFont1.getUnderline());
    }
  }
  
  static Style a(int paramInt, WorksheetCollection paramWorksheetCollection)
  {
    Style localStyle1 = new Style(paramWorksheetCollection);
    localStyle1.a(false);
    Style localStyle2 = paramWorksheetCollection.Q();
    switch (paramInt)
    {
    case 0: 
      localStyle1.copy(localStyle2);
      localStyle1.a("Normal");
      return localStyle1;
    case 3: 
      localStyle1.setNumber(43);
      localStyle1.a("Comma");
      return localStyle1;
    case 6: 
      localStyle1.setNumber(41);
      localStyle1.a("Comma [0]");
      return localStyle1;
    case 4: 
      localStyle1.setNumber(44);
      localStyle1.a("Currency");
      return localStyle1;
    case 7: 
      localStyle1.setNumber(42);
      localStyle1.a("Currency [0]");
      return localStyle1;
    case 5: 
      localStyle1.setNumber(9);
      localStyle1.a("Percent");
      return localStyle1;
    case 8: 
      localStyle1.a("Hyperlink");
      localStyle1.getFont().a(localStyle2.getFont().getName(), true, localStyle2.getFont().n());
      localStyle1.getFont().setSize(localStyle2.getFont().getSize());
      localStyle1.getFont().a(new zaml(false, 2, Color.getBlue().toArgb()));
      localStyle1.b(16);
      localStyle1.getFont().setUnderline(1);
      return localStyle1;
    case 9: 
      localStyle1.a("Followed Hyperlink");
      localStyle1.getFont().a(localStyle2.getFont().getName(), true, localStyle2.getFont().n());
      localStyle1.getFont().setSize(localStyle2.getFont().getSize());
      localStyle1.getFont().a(new zaml(false, 2, Color.getBlue().toArgb()));
      localStyle1.b(16);
      localStyle1.getFont().setUnderline(1);
      return localStyle1;
    case 29: 
      a(localStyle1, localStyle2, 0);
      a(localStyle1, 4, 0.0D);
      localStyle1.a("Accent1");
      return localStyle1;
    case 33: 
      a(localStyle1, localStyle2, 0);
      a(localStyle1, 5, 0.0D);
      localStyle1.a("Accent2");
      return localStyle1;
    case 37: 
      a(localStyle1, localStyle2, 0);
      a(localStyle1, 6, 0.0D);
      localStyle1.a("Accent3");
      return localStyle1;
    case 41: 
      a(localStyle1, localStyle2, 0);
      a(localStyle1, 7, 0.0D);
      localStyle1.a("Accent4");
      return localStyle1;
    case 45: 
      a(localStyle1, localStyle2, 0);
      a(localStyle1, 8, 0.0D);
      localStyle1.a("Accent5");
      return localStyle1;
    case 49: 
      a(localStyle1, localStyle2, 0);
      a(localStyle1, 9, 0.0D);
      localStyle1.a("Accent6");
      return localStyle1;
    case 30: 
      a(localStyle1, localStyle2, 1);
      a(localStyle1, 4, 0.7999816888943144D);
      localStyle1.a("20% - Accent1");
      return localStyle1;
    case 34: 
      a(localStyle1, localStyle2, 1);
      a(localStyle1, 5, 0.7999816888943144D);
      localStyle1.a("20% - Accent2");
      return localStyle1;
    case 38: 
      a(localStyle1, localStyle2, 1);
      a(localStyle1, 6, 7.999816888943144E16D);
      localStyle1.a("20% - Accent3");
      return localStyle1;
    case 42: 
      a(localStyle1, localStyle2, 1);
      a(localStyle1, 7, 0.7999816888943144D);
      localStyle1.a("20% - Accent4");
      return localStyle1;
    case 46: 
      a(localStyle1, localStyle2, 1);
      a(localStyle1, 8, 0.7999816888943144D);
      localStyle1.a("20% - Accent5");
      return localStyle1;
    case 50: 
      a(localStyle1, localStyle2, 1);
      a(localStyle1, 9, 0.7999816888943144D);
      localStyle1.a("20% - Accent6");
      return localStyle1;
    case 31: 
      a(localStyle1, localStyle2, 1);
      a(localStyle1, 4, 0.5999938962981048D);
      localStyle1.a("40% - Accent1");
      return localStyle1;
    case 35: 
      a(localStyle1, localStyle2, 1);
      a(localStyle1, 5, 0.5999938962981048D);
      localStyle1.a("40% - Accent2");
      return localStyle1;
    case 39: 
      a(localStyle1, localStyle2, 1);
      a(localStyle1, 6, 0.5999938962981048D);
      localStyle1.a("40% - Accent3");
      return localStyle1;
    case 43: 
      a(localStyle1, localStyle2, 1);
      a(localStyle1, 7, 0.5999938962981048D);
      localStyle1.a("40% - Accent4");
      return localStyle1;
    case 47: 
      a(localStyle1, localStyle2, 1);
      a(localStyle1, 8, 0.5999938962981048D);
      localStyle1.a("40% - Accent5");
      return localStyle1;
    case 51: 
      a(localStyle1, localStyle2, 1);
      a(localStyle1, 9, 0.5999938962981048D);
      localStyle1.a("40% - Accent6");
      return localStyle1;
    case 32: 
      a(localStyle1, localStyle2, 0);
      a(localStyle1, 4, 0.3999755851924192D);
      localStyle1.a("60% - Accent1");
      return localStyle1;
    case 36: 
      a(localStyle1, localStyle2, 0);
      a(localStyle1, 5, 0.3999755851924192D);
      localStyle1.a("60% - Accent2");
      return localStyle1;
    case 40: 
      a(localStyle1, localStyle2, 0);
      a(localStyle1, 6, 0.3999755851924192D);
      localStyle1.a("60% - Accent3");
      return localStyle1;
    case 44: 
      a(localStyle1, localStyle2, 0);
      a(localStyle1, 7, 0.3999755851924192D);
      localStyle1.a("60% - Accent4");
      return localStyle1;
    case 48: 
      a(localStyle1, localStyle2, 0);
      a(localStyle1, 8, 0.3999755851924192D);
      localStyle1.a("60% - Accent5");
      return localStyle1;
    case 52: 
      a(localStyle1, localStyle2, 0);
      a(localStyle1, 9, 0.3999755851924192D);
      localStyle1.a("60% - Accent6");
      return localStyle1;
    case 27: 
      localStyle1.a("Bad");
      localStyle1.getFont().a(localStyle2.getFont().getName(), true, localStyle2.getFont().n());
      localStyle1.getFont().setSize(localStyle2.getFont().getSize());
      localStyle1.getFont().a(new zaml(false, 2, 10223622));
      localStyle1.b(16);
      localStyle1.setPattern(1);
      localStyle1.b.a(2, 16762830);
      localStyle1.b(34);
      return localStyle1;
    case 26: 
      localStyle1.a("Good");
      localStyle1.getFont().a(localStyle2.getFont().getName(), true, localStyle2.getFont().n());
      localStyle1.getFont().setSize(localStyle2.getFont().getSize());
      localStyle1.getFont().a(new zaml(false, 2, 24832));
      localStyle1.b(16);
      localStyle1.setPattern(1);
      localStyle1.b.a(2, 13037518);
      localStyle1.b(34);
      return localStyle1;
    case 28: 
      localStyle1.a("Neutral");
      localStyle1.getFont().a(localStyle2.getFont().getName(), true, localStyle2.getFont().n());
      localStyle1.getFont().setSize(localStyle2.getFont().getSize());
      localStyle1.getFont().a(new zaml(false, 2, 10249472));
      localStyle1.b(16);
      localStyle1.setPattern(1);
      localStyle1.b.a(2, 16771996);
      localStyle1.b(34);
      return localStyle1;
    case 15: 
      localStyle1.a("Title");
      localStyle1.getFont().a("Cambria", true, 1);
      localStyle1.getFont().setBold(true);
      localStyle1.getFont().setSize(18);
      localStyle1.getFont().a((byte)2);
      localStyle1.getFont().a(new zaml(false, 4, 3));
      localStyle1.b(16);
      return localStyle1;
    case 16: 
      localStyle1.a("Header 1");
      localStyle1.getFont().a(localStyle2.getFont().getName(), true, localStyle2.getFont().n());
      localStyle1.getFont().setBold(true);
      localStyle1.getFont().setSize(15);
      localStyle1.getFont().a((byte)2);
      localStyle1.getFont().a(new zaml(false, 4, 3));
      localStyle1.b(16);
      localStyle1.getBorders().getByBorderType(8).setLineStyle(5);
      localStyle1.getBorders().getByBorderType(8).a.a(4, 4);
      localStyle1.b(5);
      return localStyle1;
    case 17: 
      localStyle1.a("Header 2");
      localStyle1.getFont().a(localStyle2.getFont().getName(), true, localStyle2.getFont().n());
      localStyle1.getFont().setBold(true);
      localStyle1.getFont().setSize(13);
      localStyle1.getFont().a((byte)2);
      localStyle1.getFont().a(new zaml(false, 4, 3));
      localStyle1.b(16);
      localStyle1.getBorders().getByBorderType(8).setLineStyle(5);
      localStyle1.getBorders().getByBorderType(8).a.a(4, 4);
      localStyle1.getBorders().getByBorderType(8).a.a(0.499984740745262D);
      localStyle1.b(5);
      return localStyle1;
    case 18: 
      localStyle1.a("Header 3");
      localStyle1.getFont().a(localStyle2.getFont().getName(), true, localStyle2.getFont().n());
      localStyle1.getFont().setBold(true);
      localStyle1.getFont().setSize(11);
      localStyle1.getFont().a((byte)2);
      localStyle1.getFont().a(new zaml(false, 4, 3));
      localStyle1.b(16);
      localStyle1.getBorders().getByBorderType(8).setLineStyle(2);
      localStyle1.getBorders().getByBorderType(8).a.a(4, 4);
      localStyle1.getBorders().getByBorderType(8).a.a(0.3999755851924192D);
      localStyle1.b(5);
      return localStyle1;
    case 19: 
      localStyle1.a("Header 4");
      localStyle1.getFont().a(localStyle2.getFont().getName(), true, localStyle2.getFont().n());
      localStyle1.getFont().setBold(true);
      localStyle1.getFont().setSize(localStyle2.getFont().getSize());
      localStyle1.getFont().a((byte)2);
      localStyle1.getFont().a(new zaml(false, 4, 3));
      localStyle1.b(16);
      return localStyle1;
    case 25: 
      localStyle1.a("Total");
      localStyle1.getFont().a(localStyle2.getFont().getName(), true, localStyle2.getFont().n());
      localStyle1.getFont().setBold(true);
      localStyle1.getFont().setSize(localStyle2.getFont().getSize());
      localStyle1.getFont().a((byte)2);
      localStyle1.getFont().a(new zaml(false, 4, 3));
      localStyle1.b(16);
      localStyle1.getBorders().getByBorderType(8).setLineStyle(6);
      localStyle1.getBorders().getByBorderType(8).a.a(4, 4);
      localStyle1.b(5);
      localStyle1.getBorders().getByBorderType(4).setLineStyle(1);
      localStyle1.getBorders().getByBorderType(4).a.a(4, 4);
      localStyle1.b(4);
      return localStyle1;
    case 20: 
      localStyle1.a("Input");
      localStyle1.getFont().setBold(true);
      localStyle1.getFont().a(localStyle2.getFont().getName(), true, 2);
      localStyle1.getFont().setSize(localStyle2.getFont().getSize());
      localStyle1.getFont().a((byte)2);
      localStyle1.getFont().a(new zaml(false, 2, 4145014));
      localStyle1.b(16);
      localStyle1.setPattern(1);
      localStyle1.b.a(2, 16764057);
      localStyle1.b(34);
      localStyle1.getBorders().getByBorderType(1).setLineStyle(1);
      localStyle1.getBorders().getByBorderType(1).a.a(2, 8355711);
      localStyle1.getBorders().getByBorderType(4).setLineStyle(1);
      localStyle1.getBorders().getByBorderType(4).a.a(2, 8355711);
      localStyle1.getBorders().getByBorderType(2).setLineStyle(1);
      localStyle1.getBorders().getByBorderType(2).a.a(2, 8355711);
      localStyle1.getBorders().getByBorderType(8).setLineStyle(1);
      localStyle1.getBorders().getByBorderType(8).a.a(2, 8355711);
      return localStyle1;
    case 21: 
      localStyle1.a("Output");
      localStyle1.getFont().setBold(true);
      localStyle1.getFont().a(localStyle2.getFont().getName(), true, 2);
      localStyle1.getFont().setSize(localStyle2.getFont().getSize());
      localStyle1.getFont().a((byte)2);
      localStyle1.getFont().a(new zaml(false, 2, 4144959));
      localStyle1.b(16);
      localStyle1.setPattern(1);
      localStyle1.b.a(2, 15921906);
      localStyle1.b(34);
      localStyle1.getBorders().getByBorderType(1).setLineStyle(1);
      localStyle1.getBorders().getByBorderType(1).a.a(2, 4144959);
      localStyle1.getBorders().getByBorderType(4).setLineStyle(1);
      localStyle1.getBorders().getByBorderType(4).a.a(2, 4144959);
      localStyle1.getBorders().getByBorderType(2).setLineStyle(1);
      localStyle1.getBorders().getByBorderType(2).a.a(2, 4144959);
      localStyle1.getBorders().getByBorderType(8).setLineStyle(1);
      localStyle1.getBorders().getByBorderType(8).a.a(2, 4144959);
      return localStyle1;
    case 10: 
      localStyle1.a("Note");
      localStyle1.getFont().a(localStyle2.getFont().getName(), true, 2);
      localStyle1.getFont().setSize(localStyle2.getFont().getSize());
      localStyle1.getFont().a((byte)2);
      localStyle1.getFont().a(new zaml(false, 4, 1));
      localStyle1.b(16);
      localStyle1.setPattern(1);
      localStyle1.b.a(2, 16777164);
      localStyle1.b(34);
      localStyle1.getBorders().getByBorderType(1).setLineStyle(1);
      localStyle1.getBorders().getByBorderType(1).a.a(2, 11711154);
      localStyle1.getBorders().getByBorderType(4).setLineStyle(1);
      localStyle1.getBorders().getByBorderType(4).a.a(2, 11711154);
      localStyle1.getBorders().getByBorderType(2).setLineStyle(1);
      localStyle1.getBorders().getByBorderType(2).a.a(2, 11711154);
      localStyle1.getBorders().getByBorderType(8).setLineStyle(1);
      localStyle1.getBorders().getByBorderType(8).a.a(2, 11711154);
      return localStyle1;
    case 11: 
      localStyle1.a("Warning Text");
      localStyle1.getFont().a(localStyle2.getFont().getName(), true, 2);
      localStyle1.getFont().setSize(localStyle2.getFont().getSize());
      localStyle1.getFont().a((byte)2);
      localStyle1.getFont().a(new zaml(false, 2, Color.getRed().toArgb()));
      localStyle1.b(16);
      return localStyle1;
    case 22: 
      localStyle1.a("Calculation");
      localStyle1.getFont().setBold(true);
      localStyle1.getFont().a(localStyle2.getFont().getName(), true, 2);
      localStyle1.getFont().setSize(localStyle2.getFont().getSize());
      localStyle1.getFont().a((byte)2);
      localStyle1.getFont().a(new zaml(false, 2, 16416000));
      localStyle1.b(16);
      localStyle1.setPattern(1);
      localStyle1.b.a(2, 15921906);
      localStyle1.b(34);
      localStyle1.getBorders().getByBorderType(1).setLineStyle(1);
      localStyle1.getBorders().getByBorderType(1).a.a(2, 4144959);
      localStyle1.getBorders().getByBorderType(4).setLineStyle(1);
      localStyle1.getBorders().getByBorderType(4).a.a(2, 4144959);
      localStyle1.getBorders().getByBorderType(2).setLineStyle(1);
      localStyle1.getBorders().getByBorderType(2).a.a(2, 4144959);
      localStyle1.getBorders().getByBorderType(8).setLineStyle(1);
      localStyle1.getBorders().getByBorderType(8).a.a(2, 4144959);
      return localStyle1;
    case 23: 
      localStyle1.a("Check Cell");
      localStyle1.getFont().setBold(true);
      localStyle1.getFont().a(localStyle2.getFont().getName(), true, 2);
      localStyle1.getFont().setSize(localStyle2.getFont().getSize());
      localStyle1.getFont().a((byte)2);
      localStyle1.getFont().a(new zaml(false, 4, 0));
      localStyle1.b(16);
      localStyle1.setPattern(1);
      localStyle1.b.a(2, 10855845);
      localStyle1.b(34);
      localStyle1.getBorders().getByBorderType(1).setLineStyle(6);
      localStyle1.getBorders().getByBorderType(1).a.a(2, 4144959);
      localStyle1.getBorders().getByBorderType(4).setLineStyle(6);
      localStyle1.getBorders().getByBorderType(4).a.a(2, 4144959);
      localStyle1.getBorders().getByBorderType(2).setLineStyle(6);
      localStyle1.getBorders().getByBorderType(2).a.a(2, 4144959);
      localStyle1.getBorders().getByBorderType(8).setLineStyle(6);
      localStyle1.getBorders().getByBorderType(8).a.a(2, 4144959);
      return localStyle1;
    case 24: 
      localStyle1.a("Linked Cell");
      localStyle1.getFont().a(localStyle2.getFont().getName(), true, 2);
      localStyle1.getFont().setSize(localStyle2.getFont().getSize());
      localStyle1.getFont().a((byte)2);
      localStyle1.getFont().a(new zaml(false, 2, 16416000));
      localStyle1.b(16);
      localStyle1.getBorders().getByBorderType(8).setLineStyle(6);
      localStyle1.getBorders().getByBorderType(8).a.a(2, 16744449);
      localStyle1.b(5);
      return localStyle1;
    case 53: 
      localStyle1.a("Explanatory Text");
      localStyle1.getFont().setItalic(true);
      localStyle1.getFont().a(localStyle2.getFont().getName(), true, 2);
      localStyle1.getFont().setSize(localStyle2.getFont().getSize());
      localStyle1.getFont().a((byte)2);
      localStyle1.getFont().a(new zaml(false, 2, 8355711));
      localStyle1.b(16);
      return localStyle1;
    }
    return null;
  }
  
  static void a(Style paramStyle, int paramInt, double paramDouble)
  {
    paramStyle.setPattern(1);
    paramStyle.b(34);
    paramStyle.b.a(4, paramInt);
    paramStyle.b.a(paramDouble);
  }
  
  static void a(Style paramStyle1, Style paramStyle2, int paramInt)
  {
    paramStyle1.getFont().setSize(paramStyle2.getFont().getSize());
    paramStyle1.getFont().a(paramStyle2.getFont().getName(), true, 2);
    paramStyle1.getFont().a(paramStyle2.getFont().h());
    paramStyle1.getFont().a(new zaml(false, 4, paramInt));
    paramStyle1.b(16);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbtc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */