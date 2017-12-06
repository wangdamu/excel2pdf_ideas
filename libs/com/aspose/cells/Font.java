package com.aspose.cells;

import com.aspose.cells.a.c.zh;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;

public class Font
{
  byte a;
  zaml b;
  WorksheetCollection c;
  Object d;
  private zbm i;
  private int j;
  private int k = 0;
  private short l = 400;
  byte e;
  String f;
  private int m = -1;
  int g;
  int h;
  private static final za n = new za(new String[] { "major", "minor", "none", "隶书", "宋体", "黑体", "HGS行書体", "B Traffic", "B Nazanin", "B Titr", "B Yekan", "Narkisim", "Wingdings", "Berlin Sans FB Demi", "Aharoni", "Brush Script MT", "Monotype Corsiva" });
  
  String a()
  {
    switch (n())
    {
    case 1: 
      return "major";
    case 2: 
      return "minor";
    }
    return null;
  }
  
  void a(String paramString)
  {
    if ((paramString == null) || ("".equals(paramString))) {
      e(0);
    } else {
      switch (n.a(paramString.toLowerCase()))
      {
      case 0: 
        e(1);
        break;
      case 1: 
        e(2);
        break;
      case 2: 
        e(0);
        break;
      }
    }
  }
  
  public int getCharset()
  {
    return this.a;
  }
  
  public void setCharset(int value)
  {
    this.a = ((byte)value);
    g(15);
  }
  
  int a(boolean paramBoolean, boolean[] paramArrayOfBoolean)
  {
    zaml localzaml = b();
    if (localzaml.b())
    {
      paramArrayOfBoolean[0] = true;
      return 32767;
    }
    int i1 = localzaml.a(this.c, 32767, paramBoolean, paramArrayOfBoolean);
    return i1;
  }
  
  zaml b()
  {
    return this.b;
  }
  
  void a(zaml paramzaml)
  {
    this.b = paramzaml;
  }
  
  Font(WorksheetCollection sheets, Object format, boolean isShape)
  {
    if (sheets != null)
    {
      if (sheets.A().size() == 0)
      {
        this.f = sheets.p().getSettings().q();
        this.j = sheets.p().getSettings().r();
        if ((sheets.p().f() == 1) && (!isShape)) {
          this.b = new zaml(isShape, 4, 1);
        } else {
          this.b = new zaml(isShape);
        }
      }
      else
      {
        Font localFont = (Font)sheets.A().get(0);
        this.f = localFont.f;
        this.j = localFont.j;
        zaml localzaml = new zaml(isShape);
        if (!isShape) {
          localzaml.f(localFont.b());
        }
        this.b = localzaml;
      }
      this.c = sheets;
    }
    else
    {
      this.f = "Arial";
      this.j = 200;
      this.b = new zaml(isShape);
    }
    if ((format != null) && ((format instanceof zbm))) {
      this.i = ((zbm)format);
    } else {
      this.d = format;
    }
    this.e = 2;
  }
  
  Font(WorksheetCollection sheets, Object format, boolean isShape, boolean reading)
  {
    this.c = sheets;
    if (sheets != null)
    {
      if (sheets.A().size() == 0)
      {
        this.f = sheets.p().getSettings().q();
        this.j = sheets.p().getSettings().r();
      }
      else
      {
        Font localFont = (Font)sheets.A().get(0);
        this.f = localFont.f;
        this.j = localFont.j;
      }
    }
    else
    {
      this.f = "Arial";
      this.j = 200;
    }
    this.b = new zaml(isShape);
    if ((format != null) && ((format instanceof zbm))) {
      this.i = ((zbm)format);
    } else {
      this.d = format;
    }
    this.e = 2;
  }
  
  zbm c()
  {
    return this.i;
  }
  
  void a(zbm paramzbm)
  {
    this.i = paramzbm;
  }
  
  boolean d()
  {
    return this.i != null;
  }
  
  public boolean isItalic()
  {
    return (this.g & 0x4) != 0;
  }
  
  public void setItalic(boolean value)
  {
    if (value) {
      this.g |= 0x4;
    } else {
      this.g &= 0xFFFFFFFB;
    }
    g(18);
  }
  
  public boolean isBold()
  {
    return this.l >= 700;
  }
  
  public void setBold(boolean value)
  {
    if (value) {
      this.l = 700;
    } else {
      this.l = 400;
    }
    g(17);
  }
  
  void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.l = 700;
    } else {
      this.l = 400;
    }
  }
  
  public int getCapsType()
  {
    switch ((this.g & 0x60) >> 5)
    {
    case 0: 
      return 0;
    case 1: 
      return 2;
    case 2: 
      return 1;
    }
    return 0;
  }
  
  public void setCapsType(int value)
  {
    this.g &= 0xFFFFFF9F;
    switch (value)
    {
    case 0: 
      break;
    case 2: 
      this.g |= 0x20;
      break;
    case 1: 
      this.g |= 0x40;
      break;
    }
    g(47);
  }
  
  public int getStrikeType()
  {
    switch ((this.g & 0x18) >> 3)
    {
    case 0: 
      return 2;
    case 1: 
      return 0;
    case 2: 
      return 1;
    }
    return 2;
  }
  
  public void setStrikeType(int value)
  {
    this.g &= 0xFFFFFFE7;
    switch (value)
    {
    case 2: 
      break;
    case 0: 
      this.g |= 0x8;
      break;
    case 1: 
      this.g |= 0x10;
      break;
    }
    g(20);
  }
  
  public boolean isStrikeout()
  {
    return getStrikeType() == 0;
  }
  
  public void setStrikeout(boolean value)
  {
    if (value) {
      setStrikeType(0);
    } else if (getStrikeType() == 0) {
      setStrikeType(2);
    } else {
      g(20);
    }
  }
  
  byte e()
  {
    if (this.k < 0) {
      return 2;
    }
    if (this.k > 0) {
      return 1;
    }
    return 0;
  }
  
  int f()
  {
    return this.k;
  }
  
  void a(int paramInt)
  {
    this.k = paramInt;
    g(23);
  }
  
  public double getScriptOffset()
  {
    return this.k / znq.l * 100.0D;
  }
  
  public void setScriptOffset(double value)
  {
    this.k = ((int)(value / 100.0D * znq.l));
    g(23);
  }
  
  public boolean isSuperscript()
  {
    return this.k > 0;
  }
  
  public void setSuperscript(boolean value)
  {
    if (value)
    {
      if (this.k <= 0) {
        this.k = (30 * znq.l / 100);
      }
    }
    else if (this.k > 0) {
      this.k = 0;
    }
    g(23);
  }
  
  public boolean isSubscript()
  {
    return this.k < 0;
  }
  
  public void setSubscript(boolean value)
  {
    if (value)
    {
      if (this.k >= 0) {
        this.k = (-25 * znq.l / 100);
      }
    }
    else if (this.k < 0) {
      this.k = 0;
    }
    g(23);
  }
  
  int g()
  {
    return this.l;
  }
  
  void b(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 900)) {
      return;
    }
    if (paramInt == 0) {
      this.l = 400;
    } else {
      this.l = ((short)(paramInt / 100 * 100));
    }
    g(17);
  }
  
  public int getUnderline()
  {
    return (this.g & 0x1F000) >> 12;
  }
  
  public void setUnderline(int value)
  {
    int i1 = (byte)value;
    this.g &= 0xFFFE0FFF;
    this.g |= (i1 & 0xFF) << 12;
    g(19);
  }
  
  byte h()
  {
    return this.e;
  }
  
  void a(byte paramByte)
  {
    this.e = paramByte;
    g(14);
  }
  
  public String getName()
  {
    return this.f;
  }
  
  public void setName(String value)
  {
    a(value, true, 0);
  }
  
  boolean i()
  {
    return (this.h & 0x200) != 0;
  }
  
  void b(String paramString)
  {
    this.f = paramString;
    c(this.f);
  }
  
  void a(String paramString, boolean paramBoolean, int paramInt)
  {
    this.f = paramString;
    g(13);
    c(this.f);
    if (paramBoolean) {
      e(paramInt);
    }
  }
  
  void c(String paramString)
  {
    switch (n.a(this.f))
    {
    case 3: 
    case 4: 
    case 5: 
      this.a = -122;
      break;
    case 6: 
      this.a = Byte.MIN_VALUE;
      this.e = 4;
      break;
    case 7: 
    case 8: 
    case 9: 
    case 10: 
      this.a = -78;
      break;
    case 11: 
      this.a = -79;
      break;
    case 12: 
      this.a = 2;
      break;
    default: 
      this.a = 0;
    }
  }
  
  public double getDoubleSize()
  {
    return (this.j & 0xFFFF) / 20.0D;
  }
  
  public void setDoubleSize(double value)
  {
    if ((value >= 1.0D) && (value <= 409.0D))
    {
      this.j = ((int)(value * 20.0D));
      g(12);
    }
    else
    {
      throw new CellsException(6, "Font size is out of range.");
    }
  }
  
  public int getSize()
  {
    return (short)((this.j & 0xFFFF) / 20);
  }
  
  public void setSize(int value)
  {
    if ((value >= 1) && (value <= 409))
    {
      this.j = (value * 20);
      g(12);
    }
    else
    {
      throw new CellsException(6, "Font size is out of range.");
    }
  }
  
  void a(double paramDouble)
  {
    this.j = ((int)(paramDouble * 20.0D));
    g(12);
  }
  
  void b(double paramDouble)
  {
    this.j = ((int)(paramDouble * 20.0D));
  }
  
  int j()
  {
    return this.j;
  }
  
  void c(int paramInt)
  {
    this.j = paramInt;
    g(12);
  }
  
  public ThemeColor getThemeColor()
  {
    zaml localzaml = b();
    if (localzaml.c() == 4)
    {
      int i1 = ztr.f(localzaml.e());
      return new ThemeColor(i1, localzaml.g());
    }
    return null;
  }
  
  public void setThemeColor(ThemeColor value)
  {
    zaml localzaml = b();
    if (value == null)
    {
      localzaml.b(true);
    }
    else
    {
      localzaml.a(4, ztr.g(value.getColorType()));
      localzaml.a(value.getTint());
      g(16);
    }
    a(localzaml);
  }
  
  public Color getColor()
  {
    zaml localzaml = b();
    if (localzaml.b()) {
      return Color.getBlack();
    }
    return localzaml.b(this.c == null ? null : this.c.p());
  }
  
  public void setColor(Color value)
  {
    zaml localzaml = b();
    if (zh.a(value)) {
      localzaml.b(true);
    } else {
      localzaml.a(2, value.toArgb());
    }
    localzaml.f();
    g(16);
    a(localzaml);
  }
  
  public int getArgbColor()
  {
    return getColor().toArgb();
  }
  
  public void setArgbColor(int value)
  {
    setColor(Color.fromArgb(value));
  }
  
  public boolean equals(Font font)
  {
    return (b().a(font.b())) && (this.j == font.j) && (zw.b(this.f, font.f)) && (this.g == font.g) && (this.l == font.l);
  }
  
  boolean a(Font paramFont)
  {
    return (b().a(paramFont.b())) && (this.j == paramFont.j) && (zw.b(this.f, paramFont.f)) && (this.g == paramFont.g) && (this.l == paramFont.l) && (this.k == paramFont.k);
  }
  
  boolean b(Font paramFont)
  {
    return (getColor().equals(paramFont.getColor())) && (this.j == paramFont.j) && (zw.b(this.f, paramFont.f)) && (this.g == paramFont.g) && (this.l == paramFont.l) && (this.k == paramFont.k);
  }
  
  boolean c(Font paramFont)
  {
    return (this.j == paramFont.j) && (zw.b(this.f, paramFont.f)) && (this.g == paramFont.g) && (this.l == paramFont.l) && (this.k == paramFont.k);
  }
  
  boolean d(Font paramFont)
  {
    return (b().a(paramFont.b())) && (this.j == paramFont.j) && (zw.b(this.f, paramFont.f)) && (this.g == paramFont.g) && (this.h == paramFont.h) && (this.l == paramFont.l) && (this.k == paramFont.k);
  }
  
  boolean a(Font paramFont, Workbook paramWorkbook1, Workbook paramWorkbook2)
  {
    return (b().a(paramFont.b(), paramWorkbook1, paramWorkbook2)) && (this.j == paramFont.j) && (zw.b(this.f, paramFont.f)) && (this.g == paramFont.g) && (this.l == paramFont.l) && (this.k == paramFont.k);
  }
  
  void e(Font paramFont)
  {
    zaml localzaml = b();
    localzaml.f(paramFont.b());
    a(localzaml);
  }
  
  void b(zaml paramzaml)
  {
    zaml localzaml = b();
    localzaml.f(paramzaml);
    a(localzaml);
  }
  
  boolean k()
  {
    return b().b();
  }
  
  void b(boolean paramBoolean)
  {
    zaml localzaml = b();
    localzaml.b(true);
    a(localzaml);
  }
  
  void c(boolean paramBoolean)
  {
    b().c(paramBoolean);
  }
  
  boolean l()
  {
    return false;
  }
  
  void a(Font paramFont, CopyOptions paramCopyOptions)
  {
    if (paramFont == null) {
      return;
    }
    this.a = paramFont.a;
    zaml localzaml1 = b();
    zaml localzaml2 = paramFont.b();
    if ((paramFont.c != this.c) && (paramFont.c != null) && (this.c != null))
    {
      if (((localzaml2.c() == 4) && (!zw.b(this.c.p().d().a, paramFont.c.p().d().a))) || (localzaml2.c() == 3)) {
        localzaml1.a(2, localzaml2.c(paramFont.c.p()));
      } else {
        localzaml1.f(localzaml2);
      }
    }
    else {
      localzaml1.f(localzaml2);
    }
    a(localzaml1);
    this.e = paramFont.e;
    this.j = paramFont.j;
    this.f = paramFont.getName();
    this.h = paramFont.h;
    this.g = paramFont.g;
    this.l = paramFont.l;
    this.m = paramFont.m;
    this.k = paramFont.k;
  }
  
  int m()
  {
    return this.m;
  }
  
  void d(int paramInt)
  {
    this.m = paramInt;
  }
  
  public boolean isNormalizeHeights()
  {
    return (this.g & 0x20000) != 0;
  }
  
  public void setNormalizeHeights(boolean value)
  {
    if (value) {
      this.g |= 0x20000;
    } else {
      this.g &= 0xFFFDFFFF;
    }
  }
  
  int n()
  {
    switch (this.g >> 7 & 0x3)
    {
    case 0: 
      return 0;
    case 1: 
      return 1;
    case 2: 
      return 2;
    }
    return 0;
  }
  
  void e(int paramInt)
  {
    int i1 = 0;
    switch (paramInt)
    {
    case 2: 
      i1 = 2;
      break;
    case 1: 
      i1 = 1;
      break;
    }
    this.g &= 0xFE7F;
    if (i1 != 0)
    {
      this.g |= i1 << 7;
      g(40);
    }
  }
  
  void o()
  {
    this.h = 0;
  }
  
  void f(Font paramFont)
  {
    if (paramFont.f(13)) {
      a(paramFont.f, false, 0);
    }
    if (paramFont.f(12)) {
      setSize(paramFont.getSize());
    }
    if (paramFont.f(16))
    {
      e(paramFont);
      g(16);
    }
    if (paramFont.f(18)) {
      setItalic(paramFont.isItalic());
    }
    if (paramFont.f(20)) {
      setStrikeout(paramFont.isStrikeout());
    }
    if (paramFont.f(23)) {
      a(paramFont.f());
    }
    if (paramFont.f(19)) {
      setUnderline(paramFont.getUnderline());
    }
    if (paramFont.f(17)) {
      b(paramFont.g());
    }
  }
  
  void a(StringBuilder paramStringBuilder)
  {
    paramStringBuilder.append(Byte.toString(this.a));
    paramStringBuilder.append(zs.a(getColor()));
    paramStringBuilder.append(Byte.toString(this.e));
    paramStringBuilder.append(Integer.toString(this.j));
    paramStringBuilder.append(zp.a(this.g));
    paramStringBuilder.append(this.f);
    paramStringBuilder.append(Short.toString(this.l));
  }
  
  void a(byte[] paramArrayOfByte)
  {
    this.j = zc.e(paramArrayOfByte, 0);
    g(12);
    int i1 = paramArrayOfByte[2] & 0xFF & 0x1;
    if (i1 == 1) {
      this.l = 700;
    } else {
      this.l = 400;
    }
    i1 = paramArrayOfByte[2] & 0xFF & 0x2;
    setItalic(i1 != 0);
    i1 = paramArrayOfByte[2] & 0xFF & 0x8;
    setStrikeout(i1 != 0);
    int i2 = zc.e(paramArrayOfByte, 4) & 0xFFFF;
    zaml localzaml = b();
    if ((i2 >= 64) || (i2 < 0)) {
      localzaml.b(true);
    } else {
      localzaml.a(3, i2);
    }
    a(localzaml);
    b(zc.e(paramArrayOfByte, 6));
    switch (paramArrayOfByte[8])
    {
    case 1: 
      setSuperscript(true);
      break;
    case 2: 
      setSubscript(true);
      break;
    case 0: 
      break;
    }
    switch (paramArrayOfByte[10])
    {
    case 1: 
      setUnderline(1);
      break;
    case 2: 
      setUnderline(2);
      break;
    case 33: 
      setUnderline(3);
      break;
    case 34: 
      setUnderline(4);
      break;
    default: 
      setUnderline(0);
    }
    a(paramArrayOfByte[11]);
    setCharset(paramArrayOfByte[12]);
    switch (paramArrayOfByte[15])
    {
    case 0: 
      this.f = Encoding.getASCII().a(paramArrayOfByte, 16, paramArrayOfByte[14] & 0xFF);
      break;
    case 1: 
      this.f = Encoding.getUnicode().a(paramArrayOfByte, 16, (paramArrayOfByte[14] & 0xFF) * 2);
      break;
    default: 
      int i3 = paramArrayOfByte[14] & 0xFF;
      if (i3 + 16 > paramArrayOfByte.length) {
        i3 = paramArrayOfByte.length - 16;
      }
      this.f = Encoding.getASCII().a(paramArrayOfByte, 16, i3);
    }
    switch (n.a(this.f))
    {
    case 13: 
    case 14: 
      this.l = 700;
      break;
    case 15: 
    case 16: 
      setItalic(true);
      break;
    }
  }
  
  boolean f(int paramInt)
  {
    switch (paramInt)
    {
    case 11: 
      return this.h != 0;
    case 23: 
      return (this.h & 0x1) != 0;
    case 21: 
      if ((this.h & 0x1) != 0) {
        return isSubscript();
      }
      return false;
    case 22: 
      if ((this.h & 0x1) != 0) {
        return isSuperscript();
      }
      return false;
    case 14: 
      return (this.h & 0x2) != 0;
    case 15: 
      return (this.h & 0x4) != 0;
    case 40: 
      return (this.h & 0x8) != 0;
    case 13: 
      return (this.h & 0x80) != 0;
    case 12: 
      return (this.h & 0x100) != 0;
    case 16: 
      return (this.h & 0x200) != 0;
    case 17: 
      return (this.h & 0x400) != 0;
    case 18: 
      return (this.h & 0x800) != 0;
    case 20: 
      return (this.h & 0x1000) != 0;
    case 19: 
      return (this.h & 0x2000) != 0;
    case 41: 
      return (this.h & 0x4000) != 0;
    case 42: 
      return (this.h & 0x8000) != 0;
    case 43: 
      return (this.h & 0x10000) != 0;
    case 44: 
      return (this.h & 0x20000) != 0;
    case 45: 
      return (this.h & 0x40000) != 0;
    case 46: 
      return (this.h & 0x80000) != 0;
    case 47: 
      return (this.h & 0x100000) != 0;
    }
    return false;
  }
  
  void g(int paramInt)
  {
    switch (paramInt)
    {
    case 23: 
      this.h |= 0x1;
      break;
    case 14: 
      this.h |= 0x2;
      break;
    case 15: 
      this.h |= 0x4;
      break;
    case 40: 
      this.h |= 0x8;
      break;
    case 13: 
      this.h |= 0x80;
      break;
    case 12: 
      this.h |= 0x100;
      break;
    case 16: 
      this.h |= 0x200;
      break;
    case 17: 
      this.h |= 0x400;
      break;
    case 18: 
      this.h |= 0x800;
      break;
    case 20: 
      this.h |= 0x1000;
      break;
    case 19: 
      this.h |= 0x2000;
      break;
    case 41: 
      this.h |= 0x4000;
      break;
    case 42: 
      this.h |= 0x8000;
      break;
    case 43: 
      this.h |= 0x10000;
      break;
    case 44: 
      this.h |= 0x20000;
      break;
    case 45: 
      this.h |= 0x40000;
      break;
    case 46: 
      this.h |= 0x80000;
      break;
    case 47: 
      this.h |= 0x100000;
      break;
    }
    Object localObject;
    if ((this.d != null) && ((this.d instanceof Style)))
    {
      localObject = (Style)this.d;
      if (!((Style)localObject).k()) {
        ((Style)localObject).d(true);
      }
    }
    if (this.i != null)
    {
      localObject = this.i;
      switch (paramInt)
      {
      case 12: 
      case 14: 
      case 17: 
      case 18: 
        ((zbm)localObject).a(getSize());
        break;
      }
    }
  }
  
  int p()
  {
    int i1 = (isBold() ? 1 : 0) | (isItalic() ? 2 : 0) | (isStrikeout() ? 8 : 0) | (getUnderline() != 0 ? 4 : 0);
    return i1;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Aspose.Cells.Font [ ");
    localStringBuilder.append(getName());
    localStringBuilder.append("; " + getDoubleSize());
    if ((isBold()) || (isItalic()))
    {
      if (isBold()) {
        localStringBuilder.append("; Bold");
      }
      if (isItalic()) {
        localStringBuilder.append("; Italic");
      }
    }
    else
    {
      localStringBuilder.append("; Regular");
    }
    if (getUnderline() != 0) {
      switch (getUnderline())
      {
      case 3: 
        localStringBuilder.append("; Accounting Underline");
        break;
      case 2: 
        localStringBuilder.append("; Double Underline");
        break;
      case 4: 
        localStringBuilder.append("; Double Accounting Underline");
        break;
      case 1: 
        localStringBuilder.append("; Underline");
        break;
      }
    }
    localStringBuilder.append("; " + getColor());
    localStringBuilder.append(" ]");
    return zs.a(localStringBuilder);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Font.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */