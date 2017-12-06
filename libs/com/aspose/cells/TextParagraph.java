package com.aspose.cells;

import java.util.Iterator;

public class TextParagraph
  extends FontSetting
{
  Workbook a;
  FontSettingCollection b;
  boolean c = true;
  Bullet d;
  TextOptions e;
  int f;
  int g;
  int h;
  TextTabStopCollection i;
  String j;
  int k;
  private int m;
  private int n;
  private int v = 0;
  private int w;
  int l;
  
  TextParagraph(int startIndex, int length, Workbook workbook, FontSettingCollection parent)
  {
    super(startIndex, length, workbook.getWorksheets(), parent);
    this.a = workbook;
    this.b = parent;
  }
  
  public Bullet getBullet()
  {
    if (this.d == null) {
      this.d = new Bullet(this);
    }
    return this.d;
  }
  
  TextOptions a()
  {
    if (this.e == null)
    {
      this.e = new TextOptions(this.a.getWorksheets(), this);
      if (this.q != null) {
        this.e.a(this.q, null);
      }
    }
    return this.e;
  }
  
  TextOptions b()
  {
    if (this.e == null) {
      this.e = new TextOptions(this.a.getWorksheets(), this);
    }
    return this.e;
  }
  
  public int getType()
  {
    return 1;
  }
  
  public int getLineSpaceSizeType()
  {
    if (a(1, false)) {
      return 0;
    }
    return 1;
  }
  
  public void setLineSpaceSizeType(int value)
  {
    b(1, value == 0);
  }
  
  public double getLineSpace()
  {
    return this.f / 100.0D;
  }
  
  public void setLineSpace(double value)
  {
    h(1);
    this.f = ((int)(value * 100.0D + 0.5D));
  }
  
  public int getSpaceAfterSizeType()
  {
    if (a(2, false)) {
      return 0;
    }
    return 1;
  }
  
  public void setSpaceAfterSizeType(int value)
  {
    b(2, value == 0);
  }
  
  public double getSpaceAfter()
  {
    return this.g / 100.0D;
  }
  
  public void setSpaceAfter(double value)
  {
    h(2);
    this.g = ((int)(value * 100.0D + 0.5D));
  }
  
  public int getSpaceBeforeSizeType()
  {
    if (a(4, false)) {
      return 0;
    }
    return 1;
  }
  
  public void setSpaceBeforeSizeType(int value)
  {
    b(4, value == 0);
  }
  
  public double getSpaceBefore()
  {
    return this.h / 100.0D;
  }
  
  public void setSpaceBefore(double value)
  {
    h(4);
    this.h = ((int)(value * 100.0D + 0.5D));
  }
  
  public TextTabStopCollection getStops()
  {
    if (this.i == null) {
      this.i = new TextTabStopCollection();
    }
    return this.i;
  }
  
  boolean c()
  {
    return a(8, false);
  }
  
  void c(boolean paramBoolean)
  {
    b(8, paramBoolean);
  }
  
  public boolean isLatinLineBreak()
  {
    return a(16, false);
  }
  
  public void setLatinLineBreak(boolean value)
  {
    b(16, value);
  }
  
  public boolean isEastAsianLineBreak()
  {
    return a(32, false);
  }
  
  public void setEastAsianLineBreak(boolean value)
  {
    b(32, value);
  }
  
  public boolean isHangingPunctuation()
  {
    return a(64, false);
  }
  
  public void setHangingPunctuation(boolean value)
  {
    b(64, value);
  }
  
  int d()
  {
    return this.m;
  }
  
  void a(int paramInt)
  {
    this.m = paramInt;
    h(128);
  }
  
  public double getRightMargin()
  {
    return zbxp.c(this.m);
  }
  
  public void setRightMargin(double value)
  {
    a(zbxp.f(value));
  }
  
  int o()
  {
    return this.n;
  }
  
  void b(int paramInt)
  {
    this.n = paramInt;
    h(256);
  }
  
  public double getLeftMargin()
  {
    return zbxp.c(this.n);
  }
  
  public void setLeftMargin(double value)
  {
    b(zbxp.f(value));
  }
  
  int p()
  {
    return this.v;
  }
  
  void c(int paramInt)
  {
    this.v = paramInt;
    h(8192);
  }
  
  public double getFirstLineIndent()
  {
    return zbxp.c(this.v);
  }
  
  public void setFirstLineIndent(double value)
  {
    c(zbxp.f(value));
  }
  
  int q()
  {
    return this.k >> 16 & 0xF;
  }
  
  void d(int paramInt)
  {
    this.k &= 0xFFF0FFFF;
    this.k |= paramInt << 16;
    h(512);
  }
  
  public int getFontAlignType()
  {
    switch (this.k >> 20 & 0xF)
    {
    case 0: 
      return 2;
    case 1: 
      return 0;
    case 2: 
      return 1;
    case 3: 
      return 3;
    case 4: 
      return 4;
    }
    return 2;
  }
  
  public void setFontAlignType(int value)
  {
    int i1 = 0;
    switch (value)
    {
    case 2: 
      i1 = 0;
      break;
    case 0: 
      i1 = 1;
      break;
    case 1: 
      i1 = 2;
      break;
    case 3: 
      i1 = 3;
      break;
    case 4: 
      i1 = 4;
      break;
    }
    this.k &= 0xFF0FFFFF;
    this.k |= i1 << 20;
    h(1024);
  }
  
  public int getAlignmentType()
  {
    switch (this.k >> 24 & 0xF)
    {
    case 0: 
      return 7;
    case 1: 
      return 1;
    case 2: 
      return 8;
    case 3: 
      return 3;
    case 4: 
      return 6;
    }
    return 7;
  }
  
  public void setAlignmentType(int value)
  {
    int i1 = 0;
    switch (value)
    {
    case 7: 
      i1 = 0;
      break;
    case 1: 
      i1 = 1;
      break;
    case 8: 
      i1 = 2;
      break;
    case 3: 
      i1 = 3;
      break;
    case 6: 
      i1 = 4;
      break;
    }
    this.k &= 0xF0FFFFFF;
    this.k |= i1 << 24;
    h(4096);
  }
  
  public double getDefaultTabSize()
  {
    return zbxp.c(this.w);
  }
  
  public void setDefaultTabSize(double value)
  {
    f(zbxp.f(value));
  }
  
  public FontSetting[] getChildren()
  {
    if (this.p != 0) {
      return new FontSetting[] { this };
    }
    int i1 = -1;
    int i2 = this.b.getCount();
    for (int i3 = 0; i3 < this.b.getCount(); i3++) {
      if (this.b.get(i3) == this)
      {
        i1 = i3;
      }
      else if ((i1 != -1) && (this.b.get(i3).getType() == 1))
      {
        i2 = i3;
        break;
      }
    }
    if (i1 != -1)
    {
      i3 = i2 - i1 - 1;
      FontSetting[] arrayOfFontSetting = new FontSetting[i3];
      for (int i4 = i2 + 1; i4 < this.b.getCount(); i4++) {
        arrayOfFontSetting[i4] = this.b.get(i4);
      }
      return arrayOfFontSetting;
    }
    return null;
  }
  
  int r()
  {
    return this.w;
  }
  
  void f(int paramInt)
  {
    this.w = paramInt;
    h(2048);
  }
  
  void a(FontSetting paramFontSetting, CopyOptions paramCopyOptions)
  {
    super.a(paramFontSetting, paramCopyOptions);
    TextParagraph localTextParagraph = (TextParagraph)paramFontSetting;
    this.w = localTextParagraph.w;
    if (localTextParagraph.e != null) {
      a().a(localTextParagraph.e, null);
    } else {
      this.e = null;
    }
    this.v = localTextParagraph.v;
    this.l = localTextParagraph.l;
    this.n = localTextParagraph.n;
    this.f = localTextParagraph.f;
    this.k = localTextParagraph.k;
    this.m = localTextParagraph.m;
    this.g = localTextParagraph.g;
    this.h = localTextParagraph.h;
    if ((localTextParagraph.i != null) && (localTextParagraph.i.getCount() > 0))
    {
      Iterator localIterator = localTextParagraph.i.iterator();
      while (localIterator.hasNext())
      {
        TextTabStop localTextTabStop = (TextTabStop)localIterator.next();
        getStops().a(localTextTabStop.a, localTextTabStop.b);
      }
    }
    this.i = localTextParagraph.i;
    this.j = localTextParagraph.j;
    this.c = localTextParagraph.c;
    if (localTextParagraph.d != null) {
      getBullet().a(localTextParagraph.d, paramCopyOptions);
    }
  }
  
  boolean g(int paramInt)
  {
    return (this.l & paramInt) != 0;
  }
  
  void h(int paramInt)
  {
    this.l |= paramInt;
  }
  
  boolean a(int paramInt, boolean paramBoolean)
  {
    if (g(paramInt)) {
      return (this.k & paramInt) != 0;
    }
    return paramBoolean;
  }
  
  void b(int paramInt, boolean paramBoolean)
  {
    this.l |= paramInt;
    if (paramBoolean) {
      this.k |= paramInt;
    } else {
      this.k &= (paramInt ^ 0xFFFFFFFF);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/TextParagraph.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */