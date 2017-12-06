package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.HashMap;

class zla
{
  private static final za a = new za(new String[] { "Between", "NotBetween" });
  
  public static zfe a(Worksheet paramWorksheet, Cell paramCell, zaca paramzaca, Style paramStyle, boolean paramBoolean)
  {
    zfe localzfe = a(paramWorksheet, paramCell, paramzaca);
    if (localzfe == null) {
      return new zfe(null, null, paramStyle);
    }
    if (localzfe.a == null)
    {
      localzfe.b = paramStyle;
      return localzfe;
    }
    Style localStyle1 = paramStyle;
    Style localStyle2 = localzfe.a;
    if (paramBoolean)
    {
      localStyle1 = new Style(paramWorksheet.c());
      localStyle1.copy(paramStyle);
    }
    b(localStyle1, localStyle2);
    localzfe.b = localStyle1;
    return localzfe;
  }
  
  static zaca a(Worksheet paramWorksheet)
  {
    CalculationOptions localCalculationOptions = new CalculationOptions();
    localCalculationOptions.b = true;
    localCalculationOptions.m = false;
    return new zaca(paramWorksheet, 3, localCalculationOptions);
  }
  
  static zaca a(Workbook paramWorkbook)
  {
    CalculationOptions localCalculationOptions = new CalculationOptions();
    localCalculationOptions.b = true;
    localCalculationOptions.m = false;
    return new zaca(paramWorkbook, 3, localCalculationOptions);
  }
  
  static void a(Style paramStyle1, Style paramStyle2)
  {
    if ((paramStyle2.isModified(11)) && (paramStyle2.k()))
    {
      if (paramStyle2.isModified(13)) {
        paramStyle1.getFont().a(paramStyle2.getFont().getName(), true, paramStyle2.getFont().n());
      }
      if (paramStyle2.isModified(12)) {
        paramStyle1.getFont().setSize(paramStyle2.getFont().getSize());
      }
      if (paramStyle2.isModified(16))
      {
        paramStyle1.getFont().e(paramStyle2.getFont());
        paramStyle1.b(16);
      }
      if (paramStyle2.isModified(18)) {
        paramStyle1.getFont().setItalic(paramStyle2.getFont().isItalic());
      }
      if (paramStyle2.isModified(17)) {
        paramStyle1.getFont().setBold(paramStyle2.getFont().isBold());
      }
      if (paramStyle2.isModified(19)) {
        paramStyle1.getFont().setUnderline(paramStyle2.getFont().getUnderline());
      }
      if (paramStyle2.isModified(23)) {
        paramStyle1.getFont().a(paramStyle2.getFont().f());
      }
      if (paramStyle2.isModified(20)) {
        paramStyle1.getFont().setStrikeout(paramStyle2.getFont().isStrikeout());
      }
    }
    if ((paramStyle2.isModified(1)) && (paramStyle2.m()))
    {
      if (paramStyle2.isModified(2))
      {
        paramStyle1.getBorders().getByBorderType(1).a(paramStyle2.getBorders().getByBorderType(1));
        paramStyle1.b(2);
      }
      if (paramStyle2.isModified(3))
      {
        paramStyle1.getBorders().getByBorderType(2).a(paramStyle2.getBorders().getByBorderType(2));
        paramStyle1.b(3);
      }
      if (paramStyle2.isModified(4))
      {
        paramStyle1.getBorders().getByBorderType(4).a(paramStyle2.getBorders().getByBorderType(4));
        paramStyle1.b(4);
      }
      if (paramStyle2.isModified(5))
      {
        paramStyle1.getBorders().getByBorderType(8).a(paramStyle2.getBorders().getByBorderType(8));
        paramStyle1.b(5);
      }
      if (paramStyle2.isModified(10))
      {
        paramStyle1.getBorders().getByBorderType(32).a(paramStyle2.getBorders().getByBorderType(32));
        paramStyle1.b(10);
      }
      if (paramStyle2.isModified(9))
      {
        paramStyle1.getBorders().getByBorderType(16).a(paramStyle2.getBorders().getByBorderType(16));
        paramStyle1.b(9);
      }
    }
    if ((paramStyle2.isModified(32)) && (paramStyle2.n()))
    {
      if (paramStyle2.isModified(33)) {
        paramStyle1.setPattern(paramStyle2.getPattern());
      }
      if (paramStyle2.isModified(34))
      {
        paramStyle1.b.f(paramStyle2.b);
        paramStyle1.b(34);
      }
      if (paramStyle2.isModified(35)) {
        if ((paramStyle1.getPattern() == 0) || (paramStyle1.getPattern() == 1))
        {
          paramStyle1.setPattern(1);
          paramStyle1.b.f(paramStyle2.a);
          paramStyle1.b(34);
        }
        else
        {
          paramStyle1.a.f(paramStyle2.a);
          paramStyle1.b(35);
        }
      }
    }
    if ((paramStyle2.isModified(25)) && (paramStyle2.l())) {
      paramStyle1.setHorizontalAlignment(paramStyle2.getHorizontalAlignment());
    }
    if ((paramStyle2.isModified(28)) && (paramStyle2.l())) {
      paramStyle1.setRotationAngle(paramStyle2.getRotationAngle());
    }
    if ((paramStyle2.isModified(27)) && (paramStyle2.l())) {
      paramStyle1.setIndentLevel(paramStyle2.getIndentLevel());
    }
    if ((paramStyle2.isModified(24)) && (paramStyle2.j()))
    {
      paramStyle1.b(paramStyle2.s());
      paramStyle1.f(paramStyle2.getNumber());
    }
  }
  
  static void b(Style paramStyle1, Style paramStyle2)
  {
    if (paramStyle2.isModified(11))
    {
      if (paramStyle2.isModified(13)) {
        paramStyle1.getFont().a(paramStyle2.getFont().getName(), true, paramStyle2.getFont().n());
      }
      if (paramStyle2.isModified(12)) {
        paramStyle1.getFont().setSize(paramStyle2.getFont().getSize());
      }
      if (paramStyle2.isModified(16))
      {
        paramStyle1.getFont().e(paramStyle2.getFont());
        paramStyle1.b(16);
      }
      if (paramStyle2.isModified(18)) {
        paramStyle1.getFont().setItalic(paramStyle2.getFont().isItalic());
      }
      if (paramStyle2.isModified(17)) {
        paramStyle1.getFont().setBold(paramStyle2.getFont().isBold());
      }
      if (paramStyle2.isModified(19)) {
        paramStyle1.getFont().setUnderline(paramStyle2.getFont().getUnderline());
      }
      if (paramStyle2.isModified(23)) {
        paramStyle1.getFont().a(paramStyle2.getFont().f());
      }
      if (paramStyle2.isModified(20)) {
        paramStyle1.getFont().setStrikeout(paramStyle2.getFont().isStrikeout());
      }
    }
    c(paramStyle1, paramStyle2);
    if (paramStyle2.isModified(32))
    {
      if (paramStyle1.isGradient()) {
        paramStyle1.setGradient(false);
      }
      if (paramStyle2.isModified(33)) {
        paramStyle1.setPattern(paramStyle2.getPattern());
      }
      if (paramStyle2.isModified(34))
      {
        paramStyle1.b.f(paramStyle2.b);
        paramStyle1.b(34);
        if ((paramStyle1.getPattern() == 0) && (!paramStyle2.isModified(35))) {
          paramStyle1.setPattern(1);
        }
      }
      if (paramStyle2.isModified(35)) {
        if ((paramStyle1.getPattern() == 0) || (paramStyle1.getPattern() == 1))
        {
          paramStyle1.setGradient(false);
          paramStyle1.setPattern(1);
          paramStyle1.b.f(paramStyle2.a);
          paramStyle1.b(34);
        }
        else
        {
          paramStyle1.a.f(paramStyle2.a);
          paramStyle1.b(35);
        }
      }
    }
    if (paramStyle2.isGradient())
    {
      paramStyle1.setGradient(true);
      paramStyle1.h(paramStyle2.z());
      paramStyle1.g(paramStyle2.y());
      paramStyle1.setForegroundColor(paramStyle2.getForegroundColor());
      paramStyle1.b(34);
      paramStyle1.setBackgroundColor(paramStyle2.getBackgroundColor());
      paramStyle1.b(35);
    }
    if (paramStyle2.isModified(25)) {
      paramStyle1.setHorizontalAlignment(paramStyle2.getHorizontalAlignment());
    }
    if (paramStyle2.isModified(26)) {
      paramStyle1.setVerticalAlignment(paramStyle2.getVerticalAlignment());
    }
    if (paramStyle2.isModified(28)) {
      paramStyle1.setRotationAngle(paramStyle2.getRotationAngle());
    }
    if (paramStyle2.isModified(27)) {
      paramStyle1.setIndentLevel(paramStyle2.getIndentLevel());
    }
    if (paramStyle2.isModified(24))
    {
      paramStyle1.b(paramStyle2.s());
      paramStyle1.f(paramStyle2.getNumber());
    }
    if (paramStyle2.isModified(29)) {
      paramStyle1.setTextWrapped(paramStyle2.isTextWrapped());
    }
  }
  
  static void c(Style paramStyle1, Style paramStyle2)
  {
    if (paramStyle2.isModified(1))
    {
      if (paramStyle2.isModified(2))
      {
        paramStyle1.getBorders().getByBorderType(1).a(paramStyle2.getBorders().getByBorderType(1));
        paramStyle1.b(2);
      }
      if (paramStyle2.isModified(3))
      {
        paramStyle1.getBorders().getByBorderType(2).a(paramStyle2.getBorders().getByBorderType(2));
        paramStyle1.b(3);
      }
      if (paramStyle2.isModified(4))
      {
        paramStyle1.getBorders().getByBorderType(4).a(paramStyle2.getBorders().getByBorderType(4));
        paramStyle1.b(4);
      }
      if (paramStyle2.isModified(5))
      {
        paramStyle1.getBorders().getByBorderType(8).a(paramStyle2.getBorders().getByBorderType(8));
        paramStyle1.b(5);
      }
      if (paramStyle2.isModified(10))
      {
        paramStyle1.getBorders().getByBorderType(32).a(paramStyle2.getBorders().getByBorderType(32));
        paramStyle1.b(10);
      }
      if (paramStyle2.isModified(9))
      {
        paramStyle1.getBorders().getByBorderType(16).a(paramStyle2.getBorders().getByBorderType(16));
        paramStyle1.b(9);
      }
    }
  }
  
  static void d(Style paramStyle1, Style paramStyle2)
  {
    if (paramStyle2.isModified(11))
    {
      if ((paramStyle2.isModified(13)) && (!paramStyle1.isModified(13))) {
        paramStyle1.getFont().a(paramStyle2.getFont().getName(), true, paramStyle2.getFont().n());
      }
      if ((paramStyle2.isModified(12)) && (!paramStyle1.isModified(12))) {
        paramStyle1.getFont().setSize(paramStyle2.getFont().getSize());
      }
      if ((paramStyle2.isModified(16)) && (!paramStyle1.isModified(16)))
      {
        paramStyle1.getFont().e(paramStyle2.getFont());
        paramStyle1.b(16);
      }
      if ((paramStyle2.isModified(18)) && (!paramStyle1.isModified(18))) {
        paramStyle1.getFont().setItalic(paramStyle2.getFont().isItalic());
      }
      if ((paramStyle2.isModified(17)) && (!paramStyle1.isModified(17))) {
        paramStyle1.getFont().setBold(paramStyle2.getFont().isBold());
      }
      if ((paramStyle2.isModified(19)) && (!paramStyle1.isModified(19))) {
        paramStyle1.getFont().setUnderline(paramStyle2.getFont().getUnderline());
      }
      if ((paramStyle2.isModified(23)) && (!paramStyle1.isModified(23))) {
        paramStyle1.getFont().a(paramStyle2.getFont().f());
      }
      if ((paramStyle2.isModified(20)) && (!paramStyle1.isModified(20))) {
        paramStyle1.getFont().setStrikeout(paramStyle2.getFont().isStrikeout());
      }
    }
    if (paramStyle2.isModified(1))
    {
      if ((paramStyle2.isModified(2)) && (!paramStyle1.isModified(2)))
      {
        paramStyle1.getBorders().getByBorderType(1).a(paramStyle2.getBorders().getByBorderType(1));
        paramStyle1.b(2);
      }
      if ((paramStyle2.isModified(3)) && (!paramStyle1.isModified(3)))
      {
        paramStyle1.getBorders().getByBorderType(2).a(paramStyle2.getBorders().getByBorderType(2));
        paramStyle1.b(3);
      }
      if ((paramStyle2.isModified(4)) && (!paramStyle1.isModified(4)))
      {
        paramStyle1.getBorders().getByBorderType(4).a(paramStyle2.getBorders().getByBorderType(4));
        paramStyle1.b(4);
      }
      if ((paramStyle2.isModified(5)) && (!paramStyle1.isModified(5)))
      {
        paramStyle1.getBorders().getByBorderType(8).a(paramStyle2.getBorders().getByBorderType(8));
        paramStyle1.b(5);
      }
      if ((paramStyle2.isModified(10)) && (!paramStyle1.isModified(10)))
      {
        paramStyle1.getBorders().getByBorderType(32).a(paramStyle2.getBorders().getByBorderType(32));
        paramStyle1.b(10);
      }
      if ((paramStyle2.isModified(9)) && (!paramStyle1.isModified(9)))
      {
        paramStyle1.getBorders().getByBorderType(16).a(paramStyle2.getBorders().getByBorderType(16));
        paramStyle1.b(9);
      }
    }
    if (paramStyle2.isModified(32))
    {
      if ((paramStyle2.isModified(33)) && (!paramStyle1.isModified(33))) {
        paramStyle1.setPattern(paramStyle2.getPattern());
      }
      if ((paramStyle2.isModified(34)) && (paramStyle2.getPattern() != 1) && (!paramStyle1.isModified(34)))
      {
        paramStyle1.b.f(paramStyle2.b);
        paramStyle1.b(34);
      }
      if (paramStyle2.isModified(35)) {
        if ((paramStyle1.getPattern() == 0) || (paramStyle1.getPattern() == 1))
        {
          if (!paramStyle1.isModified(34))
          {
            paramStyle1.setGradient(false);
            paramStyle1.setPattern(1);
            paramStyle1.b.f(paramStyle2.a);
            paramStyle1.b(34);
          }
        }
        else if (!paramStyle1.isModified(35))
        {
          paramStyle1.a.f(paramStyle2.a);
          paramStyle1.b(35);
        }
      }
    }
    if (paramStyle2.isGradient())
    {
      paramStyle1.setGradient(true);
      paramStyle1.h(paramStyle2.z());
      paramStyle1.g(paramStyle2.y());
      paramStyle1.setForegroundColor(paramStyle2.getForegroundColor());
      paramStyle1.b(34);
      paramStyle1.setBackgroundColor(paramStyle2.getBackgroundColor());
      paramStyle1.b(35);
    }
    if ((paramStyle2.isModified(25)) && (!paramStyle1.isModified(25))) {
      paramStyle1.setHorizontalAlignment(paramStyle2.getHorizontalAlignment());
    }
    if ((paramStyle2.isModified(28)) && (!paramStyle1.isModified(28))) {
      paramStyle1.setRotationAngle(paramStyle2.getRotationAngle());
    }
    if ((paramStyle2.isModified(27)) && (!paramStyle1.isModified(28))) {
      paramStyle1.setIndentLevel(paramStyle2.getIndentLevel());
    }
    if (paramStyle2.isModified(48))
    {
      int i = paramStyle1.getIndentLevel() + paramStyle2.p();
      i = i < 0 ? 0 : i;
      paramStyle1.setIndentLevel(i);
    }
    if ((paramStyle2.isModified(24)) && (!paramStyle1.isModified(24)))
    {
      paramStyle1.b(paramStyle2.s());
      paramStyle1.f(paramStyle2.getNumber());
    }
  }
  
  static void a(Font paramFont, Style paramStyle1, Style paramStyle2)
  {
    if ((paramStyle1.isModified(13)) && (!paramFont.f(13))) {
      paramFont.a(paramStyle1.getFont().getName(), true, paramStyle1.getFont().n());
    }
    if ((paramStyle1.isModified(12)) && (!paramFont.f(12))) {
      paramFont.setSize(paramStyle1.getFont().getSize());
    }
    if ((paramStyle1.isModified(16)) && (paramFont.b().a(paramStyle2.getFont().b())))
    {
      paramFont.e(paramStyle1.getFont());
      paramFont.g(16);
    }
    if ((paramStyle1.isModified(18)) && (!paramFont.f(18))) {
      paramFont.setItalic(paramStyle1.getFont().isItalic());
    }
    if ((paramStyle1.isModified(17)) && (!paramFont.f(17))) {
      paramFont.setBold(paramStyle1.getFont().isBold());
    }
    if ((paramStyle1.isModified(19)) && (!paramFont.f(19))) {
      paramFont.setUnderline(paramStyle1.getFont().getUnderline());
    }
    if ((paramStyle1.isModified(23)) && (!paramFont.f(23))) {
      paramFont.a(paramStyle1.getFont().f());
    }
    if ((paramStyle1.isModified(20)) && (!paramFont.f(20))) {
      paramFont.setStrikeout(paramStyle1.getFont().isStrikeout());
    }
  }
  
  static void a(Style paramStyle1, Style paramStyle2, Style paramStyle3)
  {
    if (paramStyle2 == null) {
      return;
    }
    if (paramStyle2.isModified(11))
    {
      if ((paramStyle2.isModified(13)) && (!paramStyle1.isModified(13))) {
        paramStyle1.getFont().a(paramStyle2.getFont().getName(), true, paramStyle2.getFont().n());
      }
      if ((paramStyle2.isModified(12)) && (!paramStyle1.isModified(12))) {
        paramStyle1.getFont().setSize(paramStyle2.getFont().getSize());
      }
      if ((paramStyle2.isModified(16)) && ((paramStyle1.q() == null) || (paramStyle1.q().b().a(paramStyle3.getFont().b()))))
      {
        paramStyle1.getFont().e(paramStyle2.getFont());
        paramStyle1.b(16);
      }
      if ((paramStyle2.isModified(18)) && (!paramStyle1.isModified(18))) {
        paramStyle1.getFont().setItalic(paramStyle2.getFont().isItalic());
      }
      if ((paramStyle2.isModified(17)) && (!paramStyle1.isModified(17))) {
        paramStyle1.getFont().setBold(paramStyle2.getFont().isBold());
      }
      if ((paramStyle2.isModified(19)) && (!paramStyle1.isModified(19))) {
        paramStyle1.getFont().setUnderline(paramStyle2.getFont().getUnderline());
      }
      if ((paramStyle2.isModified(23)) && (!paramStyle1.isModified(23))) {
        paramStyle1.getFont().a(paramStyle2.getFont().f());
      }
      if ((paramStyle2.isModified(20)) && (!paramStyle1.isModified(20))) {
        paramStyle1.getFont().setStrikeout(paramStyle2.getFont().isStrikeout());
      }
    }
    if (paramStyle2.isModified(1))
    {
      if ((paramStyle2.isModified(2)) && (!paramStyle1.isModified(2)))
      {
        paramStyle1.getBorders().getByBorderType(1).a(paramStyle2.getBorders().getByBorderType(1));
        paramStyle1.b(2);
      }
      if ((paramStyle2.isModified(3)) && (!paramStyle1.isModified(3)))
      {
        paramStyle1.getBorders().getByBorderType(2).a(paramStyle2.getBorders().getByBorderType(2));
        paramStyle1.b(3);
      }
      if ((paramStyle2.isModified(4)) && (!paramStyle1.isModified(4)))
      {
        paramStyle1.getBorders().getByBorderType(4).a(paramStyle2.getBorders().getByBorderType(4));
        paramStyle1.b(4);
      }
      if ((paramStyle2.isModified(5)) && (!paramStyle1.isModified(5)))
      {
        paramStyle1.getBorders().getByBorderType(8).a(paramStyle2.getBorders().getByBorderType(8));
        paramStyle1.b(5);
      }
      if ((paramStyle2.isModified(10)) && (!paramStyle1.isModified(10)))
      {
        paramStyle1.getBorders().getByBorderType(32).a(paramStyle2.getBorders().getByBorderType(32));
        paramStyle1.b(10);
      }
      if ((paramStyle2.isModified(9)) && (!paramStyle1.isModified(9)))
      {
        paramStyle1.getBorders().getByBorderType(16).a(paramStyle2.getBorders().getByBorderType(16));
        paramStyle1.b(9);
      }
    }
    if (paramStyle2.isModified(32))
    {
      if ((paramStyle2.isModified(33)) && (!paramStyle1.isModified(33))) {
        paramStyle1.setPattern(paramStyle2.getPattern());
      }
      if ((paramStyle2.isModified(34)) && (!paramStyle1.isModified(34)))
      {
        paramStyle1.b.f(paramStyle2.b);
        paramStyle1.b(34);
      }
      if (paramStyle2.isModified(35)) {
        if ((paramStyle1.getPattern() == 0) || (paramStyle1.getPattern() == 1))
        {
          paramStyle1.setGradient(false);
          paramStyle1.setPattern(1);
          paramStyle1.b.f(paramStyle2.a);
          paramStyle1.b(34);
        }
        else
        {
          paramStyle1.a.f(paramStyle2.a);
          paramStyle1.b(35);
        }
      }
    }
    if (paramStyle2.isGradient())
    {
      paramStyle1.setGradient(true);
      paramStyle1.h(paramStyle2.z());
      paramStyle1.g(paramStyle2.y());
      paramStyle1.setForegroundColor(paramStyle2.getForegroundColor());
      paramStyle1.b(34);
      paramStyle1.setBackgroundColor(paramStyle2.getBackgroundColor());
      paramStyle1.b(35);
    }
    if (paramStyle2.isModified(25)) {
      paramStyle1.setHorizontalAlignment(paramStyle2.getHorizontalAlignment());
    }
    if (paramStyle2.isModified(28)) {
      paramStyle1.setRotationAngle(paramStyle2.getRotationAngle());
    }
    if (paramStyle2.isModified(27)) {
      paramStyle1.setIndentLevel(paramStyle2.getIndentLevel());
    }
    if (paramStyle2.isModified(24))
    {
      paramStyle1.b(paramStyle2.s());
      paramStyle1.f(paramStyle2.getNumber());
    }
  }
  
  static int a(int paramInt1, int paramInt2)
  {
    int i = -1;
    switch (paramInt2)
    {
    case 1: 
      i = paramInt1 & 0xFF;
      break;
    case 2: 
      i = paramInt1 >> 8 & 0xFF;
      break;
    case 4: 
      i = paramInt1 >> 16 & 0xFF;
      break;
    case 8: 
      i = paramInt1 >> 24 & 0xFF;
      break;
    case 3: 
    case 5: 
    case 6: 
    case 7: 
    default: 
      throw new CellsException(7, "Invalid operation for table style");
    }
    return i == 255 ? -1 : i;
  }
  
  static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    switch (paramInt2)
    {
    case 1: 
      if (paramInt3 < 0) {
        return paramInt1 | 0xFF;
      }
      return (int)(paramInt1 & 0xFFFFFF00) | paramInt3;
    case 2: 
      if (paramInt3 < 0) {
        return paramInt1 | 0xFF00;
      }
      return (int)(paramInt1 & 0xFFFF00FF) | paramInt3 << 8;
    case 4: 
      if (paramInt3 < 0) {
        return paramInt1 | 0xFF0000;
      }
      return (int)(paramInt1 & 0xFF00FFFF) | paramInt3 << 16;
    case 8: 
      if (paramInt3 < 0) {
        return (int)(paramInt1 | 0xFF000000);
      }
      return paramInt1 & 0xFFFFFF | paramInt3 << 24;
    }
    throw new CellsException(7, "Invalid operation for table style");
  }
  
  static int a(Style paramStyle1, Style paramStyle2, zdk paramzdk, int paramInt1, int paramInt2)
  {
    int i = paramInt2;
    if (paramStyle2.isModified(11))
    {
      if (paramStyle2.isModified(13)) {
        paramStyle1.getFont().a(paramStyle2.getFont().getName(), true, paramStyle2.getFont().n());
      }
      if (paramStyle2.isModified(12)) {
        paramStyle1.getFont().setSize(paramStyle2.getFont().getSize());
      }
      if (paramStyle2.isModified(16))
      {
        paramStyle1.getFont().e(paramStyle2.getFont());
        paramStyle1.b(16);
      }
      if (paramStyle2.isModified(18)) {
        paramStyle1.getFont().setItalic(paramStyle2.getFont().isItalic());
      }
      if (paramStyle2.isModified(17)) {
        paramStyle1.getFont().setBold(paramStyle2.getFont().isBold());
      }
      if (paramStyle2.isModified(19)) {
        paramStyle1.getFont().setUnderline(paramStyle2.getFont().getUnderline());
      }
      if (paramStyle2.isModified(23)) {
        paramStyle1.getFont().a(paramStyle2.getFont().f());
      }
      if (paramStyle2.isModified(20)) {
        paramStyle1.getFont().setStrikeout(paramStyle2.getFont().isStrikeout());
      }
    }
    if (paramStyle2.isModified(1))
    {
      if ((paramStyle2.isModified(2)) && (paramzdk.c))
      {
        paramStyle1.getBorders().getByBorderType(1).a(paramStyle2.getBorders().getByBorderType(1));
        i = a(i, 1, paramInt1);
        paramStyle1.b(2);
      }
      if ((paramStyle2.isModified(3)) && (paramzdk.d))
      {
        paramStyle1.getBorders().getByBorderType(2).a(paramStyle2.getBorders().getByBorderType(2));
        i = a(i, 2, paramInt1);
        paramStyle1.b(3);
      }
      if ((paramStyle2.isModified(4)) && (paramzdk.a))
      {
        paramStyle1.getBorders().getByBorderType(4).a(paramStyle2.getBorders().getByBorderType(4));
        i = a(i, 4, paramInt1);
        paramStyle1.b(4);
      }
      if ((paramStyle2.isModified(5)) && (paramzdk.b))
      {
        paramStyle1.getBorders().getByBorderType(8).a(paramStyle2.getBorders().getByBorderType(8));
        i = a(i, 8, paramInt1);
        paramStyle1.b(5);
      }
      if (paramStyle2.getBorders().b() != null)
      {
        if ((paramzdk.e) && (!paramzdk.a))
        {
          paramStyle1.getBorders().getByBorderType(4).a(paramStyle2.getBorders().b());
          i = a(i, 4, paramInt1);
          paramStyle1.b(4);
        }
        if ((paramzdk.f) && (!paramzdk.b))
        {
          paramStyle1.getBorders().getByBorderType(8).a(paramStyle2.getBorders().b());
          i = a(i, 8, paramInt1);
          paramStyle1.b(5);
        }
      }
      if (paramStyle2.getBorders().c() != null)
      {
        if ((paramzdk.g) && (!paramzdk.c))
        {
          paramStyle1.getBorders().getByBorderType(1).a(paramStyle2.getBorders().c());
          i = a(i, 1, paramInt1);
          paramStyle1.b(2);
        }
        if ((paramzdk.h) && (!paramzdk.d))
        {
          paramStyle1.getBorders().getByBorderType(2).a(paramStyle2.getBorders().c());
          i = a(i, 2, paramInt1);
          paramStyle1.b(3);
        }
      }
    }
    if (paramStyle2.isModified(32))
    {
      if (paramStyle2.isModified(33)) {
        paramStyle1.setPattern(paramStyle2.getPattern());
      }
      if (paramStyle2.isModified(34))
      {
        paramStyle1.b.f(paramStyle2.b);
        paramStyle1.b(34);
      }
      if (paramStyle2.isModified(35)) {
        if ((paramStyle1.getPattern() == 0) || (paramStyle1.getPattern() == 1))
        {
          paramStyle1.setPattern(1);
          paramStyle1.b.f(paramStyle2.a);
          paramStyle1.b(34);
        }
        else
        {
          paramStyle1.a.f(paramStyle2.a);
          paramStyle1.b(35);
        }
      }
      if (paramStyle2.isGradient())
      {
        paramStyle1.setGradient(true);
        paramStyle1.h(paramStyle2.z());
        paramStyle1.g(paramStyle2.y());
        paramStyle1.setForegroundColor(paramStyle2.getForegroundColor());
        paramStyle1.b(34);
        paramStyle1.setBackgroundColor(paramStyle2.getBackgroundColor());
        paramStyle1.b(35);
      }
    }
    if (paramStyle2.isModified(25)) {
      paramStyle1.setHorizontalAlignment(paramStyle2.getHorizontalAlignment());
    }
    if (paramStyle2.isModified(28)) {
      paramStyle1.setRotationAngle(paramStyle2.getRotationAngle());
    }
    if (paramStyle2.isModified(27)) {
      paramStyle1.setIndentLevel(paramStyle2.getIndentLevel());
    }
    return i;
  }
  
  static FormatConditionCollection[] a(Worksheet paramWorksheet, int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = new ArrayList();
    ConditionalFormattingCollection localConditionalFormattingCollection = paramWorksheet.getConditionalFormattings();
    for (int i = 0; i < localConditionalFormattingCollection.getCount(); i++)
    {
      FormatConditionCollection localFormatConditionCollection = localConditionalFormattingCollection.get(i);
      for (int k = 0; k < localFormatConditionCollection.b.size(); k++)
      {
        CellArea localCellArea = (CellArea)localFormatConditionCollection.b.get(k);
        if ((localCellArea.StartRow <= paramInt1) && (localCellArea.EndRow >= paramInt1) && (localCellArea.StartColumn <= paramInt2) && (localCellArea.EndColumn >= paramInt2)) {
          zf.a(localArrayList, localFormatConditionCollection);
        }
      }
    }
    if (localArrayList.size() == 0) {
      return null;
    }
    FormatConditionCollection[] arrayOfFormatConditionCollection = new FormatConditionCollection[localArrayList.size()];
    for (int j = 0; j < localArrayList.size(); j++) {
      arrayOfFormatConditionCollection[j] = ((FormatConditionCollection)localArrayList.get(j));
    }
    return arrayOfFormatConditionCollection;
  }
  
  static ArrayList a(ArrayList paramArrayList)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      FormatCondition localFormatCondition1 = (FormatCondition)paramArrayList.get(i);
      int j = 0;
      for (int k = 0; k < localArrayList.size(); k++)
      {
        FormatCondition localFormatCondition2 = (FormatCondition)localArrayList.get(k);
        if (localFormatCondition2.getPriority() > localFormatCondition1.getPriority())
        {
          localArrayList.add(k, localFormatCondition1);
          j = 1;
          break;
        }
      }
      if (j == 0) {
        zf.a(localArrayList, localFormatCondition1);
      }
    }
    return localArrayList;
  }
  
  private static zfe a(Worksheet paramWorksheet, Cell paramCell, zaca paramzaca)
  {
    ConditionalFormattingCollection localConditionalFormattingCollection = paramWorksheet.getConditionalFormattings();
    Style localStyle = null;
    zahw localzahw = null;
    ArrayList localArrayList = new ArrayList();
    HashMap localHashMap = new HashMap();
    int i;
    int j;
    if (paramzaca != null)
    {
      i = paramzaca.d;
      j = paramzaca.e;
    }
    else
    {
      i = paramCell.getRow();
      j = paramCell.getColumn();
    }
    Object localObject1;
    int m;
    Object localObject2;
    for (int k = 0; k < localConditionalFormattingCollection.getCount(); k++)
    {
      localObject1 = localConditionalFormattingCollection.get(k);
      for (m = 0; m < ((FormatConditionCollection)localObject1).b.size(); m++)
      {
        localObject2 = (CellArea)((FormatConditionCollection)localObject1).b.get(m);
        if (((CellArea)localObject2).a(i, j))
        {
          zf.a(localArrayList, ((FormatConditionCollection)localObject1).a());
          break;
        }
      }
    }
    if (localArrayList.size() > 0)
    {
      k = 0;
      if (paramzaca == null)
      {
        k = 1;
        paramzaca = a(paramCell.getWorksheet());
        paramzaca.d = i;
        paramzaca.e = ((short)j);
      }
      else
      {
        paramzaca.d();
        if (paramzaca.c != paramWorksheet) {
          paramzaca.a(paramWorksheet);
        }
      }
      localObject1 = a(localArrayList);
      for (m = 0; m < ((ArrayList)localObject1).size(); m++)
      {
        localObject2 = (FormatCondition)((ArrayList)localObject1).get(m);
        FormatConditionCollection localFormatConditionCollection = ((FormatCondition)localObject2).a;
        CellArea localCellArea = new CellArea();
        for (int n = 0; n < localFormatConditionCollection.b.size(); n++)
        {
          localCellArea = (CellArea)localFormatConditionCollection.b.get(n);
          if (localCellArea.a(i, j)) {
            break;
          }
        }
        n = 0;
        boolean[] arrayOfBoolean = { n };
        Object localObject3 = a(paramWorksheet, paramCell, (FormatCondition)localObject2, paramzaca, localCellArea, arrayOfBoolean);
        n = arrayOfBoolean[0];
        if ((localObject3 == null) && (((FormatCondition)localObject2).getStopIfTrue()) && (n != 0)) {
          return null;
        }
        if (localObject3 != null)
        {
          boolean bool = localObject3 instanceof Style;
          if (bool)
          {
            if (localStyle == null) {
              localStyle = new Style(paramWorksheet.c());
            }
            d(localStyle, (Style)localObject3);
          }
          if (((FormatCondition)localObject2).getStopIfTrue())
          {
            if (bool)
            {
              if (k != 0) {
                paramzaca.c();
              }
              return new zfe(localStyle, null, null);
            }
            if (!localHashMap.containsKey(zs.a(localObject3))) {
              localHashMap.put(zs.a(localObject3), localObject3);
            }
            if (k != 0) {
              paramzaca.c();
            }
            return new zfe(null, localHashMap, null);
          }
          if (!bool)
          {
            localzahw = (zahw)localObject3;
            if (((localStyle == null) || (!localStyle.isModified(32)) || (!(localzahw instanceof zli))) && (localzahw != null)) {
              if (((localzahw instanceof zli)) && (!localHashMap.containsKey("ColorScaledStyle"))) {
                localHashMap.put("ColorScaledStyle", localzahw);
              } else if (((localzahw instanceof zov)) && (!localHashMap.containsKey("DataBarStyle"))) {
                localHashMap.put("DataBarStyle", localzahw);
              } else if (((localzahw instanceof zajx)) && (!localHashMap.containsKey("IconSetStyle"))) {
                localHashMap.put("IconSetStyle", localzahw);
              }
            }
          }
        }
      }
      if (k != 0) {
        paramzaca.c();
      }
    }
    return new zfe(localStyle, localHashMap, null);
  }
  
  private static Object a(Worksheet paramWorksheet, Cell paramCell, FormatCondition paramFormatCondition, zaca paramzaca, CellArea paramCellArea, boolean[] paramArrayOfBoolean)
  {
    paramzaca.a(paramFormatCondition);
    paramFormatCondition.f();
    paramArrayOfBoolean[0] = false;
    switch (paramFormatCondition.c)
    {
    case 0: 
    case 2: 
    case 3: 
    case 4: 
      break;
    case 1: 
    default: 
      if ((paramCell == null) || (paramCell.c.c == 4) || (paramCell.c.c == 0)) {
        switch (paramFormatCondition.getType())
        {
        case 5: 
        case 17: 
          return null;
        }
      }
      if (paramFormatCondition.a() == null) {
        switch (paramFormatCondition.c)
        {
        case 0: 
        case 1: 
          break;
        default: 
          paramFormatCondition.setFormula1(paramFormatCondition.g());
        }
      }
      if (paramFormatCondition.a() == null) {
        return null;
      }
      zaag localzaag = new zaag(paramzaca, paramFormatCondition.a(), 0, -1);
      localObject = localzaag.a().j(paramzaca);
      if ((localObject != null) && (((zaba)localObject).o())) {
        return paramFormatCondition.f;
      }
      return null;
    }
    if (paramCell != null)
    {
      int i = paramCell.c.c;
      if (i != 1) {
        if (i == 6)
        {
          i = 1;
        }
        else if (i == 5)
        {
          i = ((zaai)paramCell.c.d).c;
          if (i == 6) {
            i = 1;
          }
        }
      }
      if (i == 1)
      {
        if ((paramFormatCondition.getType() == 4) && (paramFormatCondition.getIconSet() != null)) {
          return new zajx(paramFormatCondition.getIconSet(), paramzaca, paramCell == null ? null : paramCell.c, paramFormatCondition.a.b);
        }
        if ((paramFormatCondition.getType() == 3) && (paramFormatCondition.getDataBar() != null)) {
          return new zov(paramFormatCondition.getDataBar(), paramzaca, paramCell == null ? null : paramCell.c, paramFormatCondition.a.b);
        }
        if ((paramFormatCondition.getType() == 2) && (paramFormatCondition.getColorScale() != null)) {
          return new zli(paramFormatCondition.getColorScale(), paramzaca, paramCell == null ? null : paramCell.c, paramFormatCondition.a.b);
        }
      }
    }
    if ((paramFormatCondition.getOperator() == 6) || (paramFormatCondition.a() == null)) {
      return null;
    }
    zabi localzabi;
    switch (paramFormatCondition.getOperator())
    {
    case 1: 
      localzabi = zabi.q();
      break;
    case 3: 
      localzabi = zabi.r();
      break;
    case 2: 
      localzabi = zabi.s();
      break;
    case 5: 
      localzabi = zabi.t();
      break;
    case 4: 
      localzabi = zabi.u();
      break;
    case 8: 
      localzabi = zabi.v();
      break;
    case 0: 
      localObject = a(paramFormatCondition, paramzaca, paramCell);
      localzabi = zabi.t();
      localzabi.d(localObject[1]);
      if (a(paramCell, paramzaca, localzabi))
      {
        localzabi = zabi.r();
        localzabi.d(localObject[0]);
        if (a(paramCell, paramzaca, localzabi))
        {
          paramArrayOfBoolean[0] = true;
          return paramFormatCondition.f;
        }
      }
      return null;
    case 7: 
      localObject = a(paramFormatCondition, paramzaca, paramCell);
      localzabi = zabi.s();
      localzabi.d(localObject[1]);
      if (a(paramCell, paramzaca, localzabi))
      {
        paramArrayOfBoolean[0] = true;
        return paramFormatCondition.f;
      }
      localzabi = zabi.u();
      localzabi.d(localObject[0]);
      if (a(paramCell, paramzaca, localzabi))
      {
        paramArrayOfBoolean[0] = true;
        return paramFormatCondition.f;
      }
      return null;
    case 6: 
    default: 
      return Boolean.valueOf(false);
    }
    Object localObject = new zaag(paramzaca, paramFormatCondition.a(), 0, -1);
    localzabi.d(((zaag)localObject).a());
    if (a(paramCell, paramzaca, localzabi))
    {
      paramArrayOfBoolean[0] = true;
      return paramFormatCondition.f;
    }
    return null;
  }
  
  private static zaie[] a(FormatCondition paramFormatCondition, zaca paramzaca, Cell paramCell)
  {
    zaag localzaag = new zaag(paramzaca, paramFormatCondition.a(), 0, -1);
    zaie localzaie1 = localzaag.a();
    localzaag = new zaag(paramzaca, paramFormatCondition.c(), 0, -1);
    zaie localzaie2 = localzaag.a();
    zabi localzabi = zabi.t();
    localzabi.c(localzaie1);
    localzabi.d(localzaie2);
    if (!a(paramCell, paramzaca, localzabi)) {
      return new zaie[] { localzaie2, localzaie1 };
    }
    return new zaie[] { localzaie1, localzaie2 };
  }
  
  private static boolean a(Cell paramCell, zaca paramzaca, zabi paramzabi)
  {
    if (paramCell != null)
    {
      paramzabi.c(zabt.a(paramCell.c.c, paramCell.c.d));
    }
    else
    {
      localObject = paramzaca.c.getCells().getRows().a.a(paramzaca.d, new zgs(paramzaca.e), 4);
      if (localObject == null) {
        paramzabi.c(zabg.a);
      } else {
        paramzabi.c(zabt.a(((zgs)localObject).c, ((zgs)localObject).d));
      }
    }
    Object localObject = paramzabi.d(paramzaca);
    return (((zaie)localObject).b() == 1) && (((zaba)localObject).o());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zla.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */