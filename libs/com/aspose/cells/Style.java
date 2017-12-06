package com.aspose.cells;

import com.aspose.cells.a.c.zh;
import com.aspose.cells.a.c.zy;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;

public class Style
{
  zaml a;
  zaml b;
  private String e;
  private int f = 0;
  private BorderCollection g;
  private int h = 0;
  private byte i = -1;
  int c;
  private byte j;
  private int k;
  private int l = -1;
  private Font m;
  private WorksheetCollection n;
  private int o;
  private byte p = 16;
  private String q = "";
  private short r = 18;
  byte d = 0;
  
  public ThemeColor getBackgroundThemeColor()
  {
    if (this.a.c() == 4)
    {
      int i1 = ztr.f(this.a.e());
      return new ThemeColor(i1, this.a.g());
    }
    return null;
  }
  
  public void setBackgroundThemeColor(ThemeColor value)
  {
    this.a.a(4, ztr.g(value.getColorType()));
    this.a.a(value.getTint());
    b(35);
  }
  
  int a()
  {
    switch (this.f)
    {
    case 0: 
      return 65;
    case 1: 
      return 64;
    }
    return a(this.a, 65);
  }
  
  public ThemeColor getForegroundThemeColor()
  {
    if (this.b.c() == 4)
    {
      int i1 = ztr.f(this.b.e());
      return new ThemeColor(i1, this.b.g());
    }
    return null;
  }
  
  public void setForegroundThemeColor(ThemeColor value)
  {
    this.b.a(4, ztr.g(value.getColorType()));
    this.b.a(value.getTint());
    b(34);
  }
  
  int b()
  {
    if (this.f == 0) {
      return 64;
    }
    if (this.f == 1) {
      return a(this.b, 65);
    }
    return a(this.b, 64);
  }
  
  public String getName()
  {
    return this.e;
  }
  
  public void setName(String value)
  {
    if ((this.n != null) && (this.n.Q() == this)) {
      return;
    }
    if (!this.n.C().a()) {
      throw new CellsException(10, "Invalid operation for LightCells mode");
    }
    this.e = value;
    if ((value != null) && (!"".equals(value)))
    {
      this.h = 0;
      a(false);
      ((zbzv)this.n.C()).h(this);
      this.n.s().a(this, true);
    }
  }
  
  String c()
  {
    return this.e;
  }
  
  void a(String paramString)
  {
    this.e = paramString;
  }
  
  public int getPattern()
  {
    return this.f;
  }
  
  public void setPattern(int value)
  {
    this.f = value;
    g(true);
    this.c |= 0x800;
  }
  
  BorderCollection d()
  {
    return this.g;
  }
  
  public BorderCollection getBorders()
  {
    if (this.g == null) {
      this.g = new BorderCollection(this);
    }
    return this.g;
  }
  
  /**
   * @deprecated
   */
  public Style()
  {
    this(null);
  }
  
  Style(WorksheetCollection sheets)
  {
    this.n = sheets;
    this.f = 0;
    this.b = new zaml(false);
    this.a = new zaml(false);
    this.a.b(true);
    this.b.b(true);
    this.p = 8;
  }
  
  WorksheetCollection e()
  {
    return this.n;
  }
  
  void a(WorksheetCollection paramWorksheetCollection)
  {
    this.n = paramWorksheetCollection;
    if (this.m != null) {
      this.m.c = this.n;
    }
  }
  
  public Color getBackgroundColor()
  {
    if (this.a.b())
    {
      if (this.f == 0) {
        return Color.getEmpty();
      }
      if (this.f == 1) {
        return Color.getWhite();
      }
      return Color.getBlack();
    }
    return this.a.b(this.n.p());
  }
  
  public void setBackgroundColor(Color value)
  {
    if (value.isEmpty())
    {
      g(true);
      this.a.b(true);
    }
    else
    {
      this.a.a(2, value.toArgb());
      this.a.f();
      g(true);
    }
    this.c |= 0x10;
  }
  
  public int getBackgroundArgbColor()
  {
    return getBackgroundColor().toArgb();
  }
  
  public void setBackgroundArgbColor(int value)
  {
    setBackgroundColor(Color.fromArgb(value));
  }
  
  public Color getForegroundColor()
  {
    if (this.b.b()) {
      return Color.getEmpty();
    }
    return this.b.b(this.n.p());
  }
  
  public void setForegroundColor(Color value)
  {
    if (value.isEmpty())
    {
      this.b.b(true);
      this.b.f();
    }
    else
    {
      this.b.a(2, value.toArgb());
      this.b.f();
    }
    this.c |= 0x20;
    g(true);
  }
  
  public int getForegroundArgbColor()
  {
    return getForegroundColor().toArgb();
  }
  
  public void setForegroundArgbColor(int value)
  {
    setForegroundColor(Color.fromArgb(value));
  }
  
  int a(zaml paramzaml, int paramInt)
  {
    int i1 = 0;
    boolean[] arrayOfBoolean = { i1 };
    int i2 = a(paramzaml, paramInt, arrayOfBoolean);
    i1 = arrayOfBoolean[0];
    return i2;
  }
  
  int a(zaml paramzaml, int paramInt, boolean[] paramArrayOfBoolean)
  {
    return paramzaml.a(this.n, paramInt, false, paramArrayOfBoolean);
  }
  
  public void copy(Style style)
  {
    a(style, null);
  }
  
  void a(Style paramStyle, CopyOptions paramCopyOptions)
  {
    if (this.n == null) {
      this.n = paramStyle.n;
    }
    this.c = paramStyle.c;
    this.i = paramStyle.i;
    if (paramStyle.m != null)
    {
      if (this.m == null) {
        this.m = new Font(this.n, this, false);
      }
      this.m.a(paramStyle.m, paramCopyOptions);
    }
    this.r = paramStyle.r;
    this.l = paramStyle.l;
    this.o = paramStyle.o;
    this.p = paramStyle.p;
    this.q = paramStyle.q;
    this.j = paramStyle.j;
    this.k = paramStyle.k;
    this.f = paramStyle.f;
    if ((paramStyle.n != this.n) && (paramStyle.n != null) && (this.n != null))
    {
      int i1 = 0;
      if (paramCopyOptions != null) {
        i1 = !paramCopyOptions.k() ? 1 : 0;
      } else {
        i1 = !zw.b(paramStyle.n.p().d().a, this.n.p().d().a) ? 1 : 0;
      }
      if (((paramStyle.a.c() == 4) && (i1 != 0)) || (paramStyle.a.c() == 3)) {
        this.a.a(2, paramStyle.a.c(paramStyle.n.p()));
      } else {
        this.a.f(paramStyle.a);
      }
      if (((paramStyle.b.c() == 4) && (i1 != 0)) || (paramStyle.b.c() == 3)) {
        this.b.a(2, paramStyle.b.c(paramStyle.n.p()));
      } else {
        this.b.f(paramStyle.b);
      }
    }
    else
    {
      this.b.f(paramStyle.b);
      this.a.f(paramStyle.a);
    }
    this.d = paramStyle.d;
    if (paramStyle.f())
    {
      this.g = new BorderCollection(this);
      this.g.a(paramStyle.getBorders(), paramCopyOptions);
    }
    if (paramStyle.n == this.n) {
      this.h = paramStyle.h;
    }
  }
  
  void a(Style paramStyle)
  {
    if (this.n == null) {
      this.n = paramStyle.n;
    }
    this.c = paramStyle.c;
    this.i = paramStyle.i;
    if ((paramStyle.k()) && (paramStyle.m != null))
    {
      if (this.m == null) {
        this.m = new Font(this.n, this, false);
      }
      this.m.a(paramStyle.m, null);
    }
    this.r = paramStyle.r;
    this.o = paramStyle.o;
    this.p = paramStyle.p;
    this.j = paramStyle.j;
    if (paramStyle.j())
    {
      this.l = paramStyle.l;
      this.q = paramStyle.q;
    }
    if (paramStyle.n())
    {
      this.f = paramStyle.f;
      if ((paramStyle.n != this.n) && (paramStyle.n != null) && (this.n != null))
      {
        int i1 = !zw.b(paramStyle.n.p().d().a, this.n.p().d().a) ? 1 : 0;
        if (((paramStyle.a.c() == 4) && (i1 != 0)) || (paramStyle.a.c() == 3)) {
          this.a.a(2, paramStyle.a.c(paramStyle.n.p()));
        } else {
          this.a.f(paramStyle.a);
        }
        if (((paramStyle.b.c() == 4) && (i1 != 0)) || (paramStyle.b.c() == 3)) {
          this.b.a(2, paramStyle.b.c(paramStyle.n.p()));
        } else {
          this.b.f(paramStyle.b);
        }
      }
      else
      {
        this.b.f(paramStyle.b);
        this.a.f(paramStyle.a);
      }
      this.d = paramStyle.d;
    }
    if ((paramStyle.m()) && (paramStyle.f()))
    {
      this.g = new BorderCollection(this);
      this.g.a(paramStyle.getBorders(), null);
    }
    if (paramStyle.n == this.n) {
      this.h = paramStyle.h;
    }
  }
  
  boolean f()
  {
    return (this.g != null) && (this.g.d());
  }
  
  boolean g()
  {
    return (this.r & 0x10) != 0;
  }
  
  void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.r = ((short)(this.r | 0x10));
      this.h = 0;
    }
    else
    {
      this.r = ((short)(this.r & 0xFFFFFFEF));
    }
  }
  
  void b(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.r = ((short)(this.r | 0x10));
    } else {
      this.r = ((short)(this.r & 0xFFFFFFEF));
    }
  }
  
  int h()
  {
    return this.h;
  }
  
  void a(int paramInt)
  {
    this.h = paramInt;
  }
  
  public Style getParentStyle()
  {
    if ((this.h > 0) && (this.h < this.n.C().b())) {
      return e().C().a(this.h);
    }
    return null;
  }
  
  void a(WorksheetCollection paramWorksheetCollection, int paramInt)
  {
    copy(paramWorksheetCollection.C().a(paramInt));
  }
  
  public void update()
  {
    if ((this.e == null) || ("".equals(this.e))) {
      return;
    }
    if ("Normal".equals(this.e))
    {
      this.n.A().set(0, getFont());
      this.n.V();
    }
    if (!this.n.C().a()) {
      throw new CellsException(10, "Invalid operation for LightCells mode");
    }
    zbzv localzbzv = (zbzv)this.n.C();
    int i1 = 0;
    Style localStyle1 = 0;
    int i2 = localzbzv.getCount();
    Style localStyle2;
    for (localStyle1 = 0; localStyle1 < i2; localStyle1++)
    {
      localStyle2 = localzbzv.a(localStyle1);
      if ((localStyle2 != null) && ((localStyle2 == this) || (zw.b(localStyle2.getName(), getName()))))
      {
        if (localStyle2 != this) {
          localzbzv.a(localStyle1, this);
        }
        i1 = 1;
        break;
      }
    }
    if (i1 == 0)
    {
      a(false);
      localzbzv.f(this);
    }
    else
    {
      localStyle2 = localStyle1;
      for (localStyle1 = localzbzv.getCount() - 1; localStyle1 > localStyle2; localStyle1--)
      {
        Style localStyle3 = localzbzv.c(localStyle1);
        if ((localStyle3 != null) && (localStyle3.h() == localStyle2)) {
          b(localStyle3);
        }
      }
    }
  }
  
  void b(Style paramStyle)
  {
    if ((j()) && (!paramStyle.j()))
    {
      paramStyle.l = this.l;
      paramStyle.q = this.q;
      if ((this.r & 0x80) != 0)
      {
        Style tmp42_41 = paramStyle;
        tmp42_41.r = ((short)(tmp42_41.r | 0x80));
      }
      else
      {
        Style tmp58_57 = paramStyle;
        tmp58_57.r = ((short)(tmp58_57.r & 0xFF7F));
      }
    }
    if ((k()) && (!paramStyle.k())) {
      paramStyle.getFont().a(getFont(), null);
    }
    if ((l()) && (!paramStyle.l()))
    {
      paramStyle.p = this.p;
      paramStyle.o = this.o;
      paramStyle.j = this.j;
      Style tmp135_134 = paramStyle;
      tmp135_134.r = ((short)(tmp135_134.r & 0xFFFFFFF3));
      Style tmp147_146 = paramStyle;
      tmp147_146.r = ((short)(tmp147_146.r | (short)(this.r & 0xC)));
      paramStyle.setJustifyDistributed(isJustifyDistributed());
    }
    if ((m()) && (!paramStyle.m())) {
      paramStyle.getBorders().a(getBorders(), null);
    }
    if ((n()) && (!paramStyle.n()))
    {
      paramStyle.f = this.f;
      paramStyle.b.f(this.b);
      paramStyle.a.f(this.a);
    }
    if ((o()) && (!paramStyle.o()))
    {
      Style tmp257_256 = paramStyle;
      tmp257_256.r = ((short)(tmp257_256.r & 0xFFFFFFFC));
      Style tmp269_268 = paramStyle;
      tmp269_268.r = ((short)(tmp269_268.r | (short)(this.r & 0x3)));
    }
  }
  
  byte i()
  {
    return this.i;
  }
  
  void a(byte paramByte)
  {
    this.i = paramByte;
  }
  
  boolean j()
  {
    return (this.i & 0xFF & 0x4) != 0;
  }
  
  void c(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.i = ((byte)(this.i | 0x4));
    } else {
      this.i = ((byte)(this.i & 0xFFFFFFFB));
    }
  }
  
  boolean k()
  {
    return (this.i & 0xFF & 0x8) != 0;
  }
  
  void d(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.i = ((byte)(this.i | 0x8));
    } else {
      this.i = ((byte)(this.i & 0xFFFFFFF7));
    }
  }
  
  boolean l()
  {
    return (this.i & 0xFF & 0x10) != 0;
  }
  
  void e(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.i = ((byte)(this.i | 0x10));
    } else {
      this.i = ((byte)(this.i & 0xFFFFFFEF));
    }
  }
  
  boolean m()
  {
    return (this.i & 0xFF & 0x20) != 0;
  }
  
  void f(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.i = ((byte)(this.i | 0x20));
    } else {
      this.i = ((byte)(this.i & 0xFFFFFFDF));
    }
  }
  
  boolean n()
  {
    return (this.i & 0xFF & 0x40) != 0;
  }
  
  void g(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.i = ((byte)(this.i | 0x40));
    } else {
      this.i = ((byte)(this.i & 0xFFFFFFBF));
    }
  }
  
  boolean o()
  {
    return (this.i & 0xFF & 0x80) != 0;
  }
  
  void h(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.i = ((byte)(this.i | 0x80));
    } else {
      this.i = ((byte)(this.i & 0x7F));
    }
  }
  
  int a(byte[] paramArrayOfByte)
  {
    int i1 = zc.e(paramArrayOfByte, 0);
    if ((i1 & 0xFFFF) > 4) {
      i1--;
    }
    if ((i1 & 0xFFFF) >= this.n.A().size()) {
      i1 = 0;
    }
    getFont().a((Font)this.n.A().get(i1 & 0xFFFF), null);
    int i2 = zc.e(paramArrayOfByte, 2);
    for (int i3 = 0; i3 < this.n.B().size(); i3++)
    {
      zzw localzzw = (zzw)this.n.B().get(i3);
      if (localzzw.b() == (i2 & 0xFFFF)) {
        if ((localzzw.a() == null) || ("".equals(localzzw.a())))
        {
          this.q = "";
          this.r = ((short)(this.r & 0xFF7F));
        }
        else
        {
          this.q = localzzw.a();
          if (c(this.q)) {
            this.r = ((short)(this.r | 0x80));
          } else {
            this.r = ((short)(this.r & 0xFF7F));
          }
        }
      }
    }
    this.l = (i2 & 0xFFFF);
    i3 = paramArrayOfByte[4] & 0xFF & 0x1;
    if (i3 == 0) {
      setLocked(false);
    } else {
      setLocked(true);
    }
    i3 = paramArrayOfByte[4] & 0xFF & 0x2;
    if (i3 == 0) {
      setFormulaHidden(false);
    } else {
      setFormulaHidden(true);
    }
    if ((paramArrayOfByte[4] & 0xFF & 0x8) != 0) {
      k(true);
    }
    i3 = paramArrayOfByte[6] & 0xFF & 0x7;
    int i4 = 0;
    this.p = 0;
    this.p = ((byte)(this.p | (byte)i3));
    if (getHorizontalAlignment() != 5)
    {
      b(25);
      i4 = 1;
    }
    if (getVerticalAlignment() != 0)
    {
      b(26);
      i4 = 1;
    }
    i3 = paramArrayOfByte[6] & 0xFF & 0x8;
    if (i3 == 0)
    {
      setTextWrapped(false);
    }
    else
    {
      setTextWrapped(true);
      i4 = 1;
    }
    i3 = (paramArrayOfByte[6] & 0xFF & 0x70) >> 4;
    this.p = ((byte)(this.p | (byte)(i3 << 3)));
    if (((paramArrayOfByte[7] & 0xFF) <= 90) || ((paramArrayOfByte[7] & 0xFF) == 255)) {
      this.o = (paramArrayOfByte[7] & 0xFF);
    } else {
      this.o = (90 - (paramArrayOfByte[7] & 0xFF));
    }
    this.j = ((byte)(paramArrayOfByte[8] & 0xFF & 0xF));
    i3 = paramArrayOfByte[8] & 0xFF & 0x10;
    if (i3 == 0) {
      setShrinkToFit(false);
    } else {
      setShrinkToFit(true);
    }
    i3 = paramArrayOfByte[8] & 0xFF & 0xC0;
    this.p = ((byte)(this.p | (byte)i3));
    i3 = paramArrayOfByte[4] & 0xFF & 0x4;
    if (i3 == 0) {
      a(true);
    } else {
      a(false);
    }
    if (!g())
    {
      this.h = 4095;
    }
    else if ((paramArrayOfByte[5] & 0xFF) == 255)
    {
      i3 = paramArrayOfByte[4] & 0xFF & 0xF0;
      if (i3 == 240) {
        this.h = 0;
      } else {
        this.h = (((paramArrayOfByte[4] & 0xFF & 0xF0) >> 4) + ((paramArrayOfByte[5] & 0xFF) << 4));
      }
    }
    else
    {
      this.h = (((paramArrayOfByte[4] & 0xFF & 0xF0) >> 4) + ((paramArrayOfByte[5] & 0xFF) << 4));
    }
    i3 = paramArrayOfByte[10] & 0xFF & 0xF;
    a(i3, 1);
    i3 = (paramArrayOfByte[10] & 0xFF & 0xF0) >> 4;
    a(i3, 2);
    i3 = paramArrayOfByte[11] & 0xFF & 0xF;
    a(i3, 4);
    i3 = (paramArrayOfByte[11] & 0xFF & 0xF0) >> 4;
    a(i3, 8);
    int i5 = paramArrayOfByte[12] & 0xFF & 0x7F;
    if ((i5 < 0) || (i5 >= 64)) {
      getBorders().getByBorderType(1).a.a(1, i5);
    } else {
      getBorders().getByBorderType(1).a.a(3, i5);
    }
    i5 = ((paramArrayOfByte[12] & 0xFF & 0x80) >> 7) + ((paramArrayOfByte[13] & 0xFF & 0x3F) << 1);
    if ((i5 < 0) || (i5 >= 64)) {
      getBorders().getByBorderType(2).a.a(1, i5);
    } else {
      getBorders().getByBorderType(2).a.a(3, i5);
    }
    int i6 = (paramArrayOfByte[13] & 0xFF & 0xC0) >> 6;
    i5 = paramArrayOfByte[14] & 0xFF & 0x7F;
    if ((i5 < 0) || (i5 >= 64)) {
      getBorders().getByBorderType(4).a.a(1, i5);
    } else {
      getBorders().getByBorderType(4).a.a(3, i5);
    }
    i5 = ((paramArrayOfByte[14] & 0xFF & 0x80) >> 7) + ((paramArrayOfByte[15] & 0xFF & 0x3F) << 1);
    if ((i5 < 0) || (i5 >= 64)) {
      getBorders().getByBorderType(8).a.a(1, i5);
    } else {
      getBorders().getByBorderType(8).a.a(3, i5);
    }
    i5 = ((paramArrayOfByte[15] & 0xFF & 0xC0) >> 6) + ((paramArrayOfByte[16] & 0xFF & 0x1F) << 2);
    zaml localzaml = new zaml(false);
    if ((i5 < 0) || (i5 >= 64)) {
      localzaml.a(1, i5);
    } else {
      localzaml.a(3, i5);
    }
    i3 = ((paramArrayOfByte[16] & 0xFF & 0xE0) >> 5) + ((paramArrayOfByte[17] & 0xFF & 0x1) << 3);
    switch (i6)
    {
    case 1: 
      getBorders().getByBorderType(16).a = localzaml;
      a(i3, 16);
      break;
    case 2: 
      getBorders().getByBorderType(32).a = localzaml;
      a(i3, 32);
      break;
    case 3: 
      getBorders().getByBorderType(16).a = localzaml;
      a(i3, 16);
      getBorders().getByBorderType(32).a = localzaml;
      a(i3, 32);
      break;
    }
    i3 = (paramArrayOfByte[17] & 0xFF & 0xFC) >> 2;
    this.f = i3;
    if (this.f == 0)
    {
      this.b.b(true);
      this.a.b(true);
    }
    else
    {
      b(33);
      i5 = paramArrayOfByte[18] & 0xFF & 0x7F;
      if ((i5 < 0) || (i5 >= 64))
      {
        this.b.b(true);
      }
      else
      {
        this.b.a(3, i5);
        b(34);
      }
      i5 = ((paramArrayOfByte[18] & 0xFF & 0x80) >> 7) + ((paramArrayOfByte[19] & 0xFF & 0x3F) << 1);
      if ((i5 < 0) || (i5 >= 64))
      {
        this.a.b(true);
      }
      else
      {
        this.a.a(3, i5);
        b(35);
      }
    }
    if ((paramArrayOfByte[19] & 0xFF & 0x40) != 0) {
      l(true);
    }
    if (g())
    {
      this.i = paramArrayOfByte[9];
      if ((!l()) && (i4 != 0)) {
        if ((this.h > 0) && (this.h < e().C().b()))
        {
          Style localStyle = e().C().a(this.h);
          if (!localStyle.l()) {
            e(true);
          }
        }
        else
        {
          e(true);
        }
      }
    }
    else
    {
      this.i = ((byte)((paramArrayOfByte[9] & 0xFF ^ 0xFFFFFFFF) & 0xFC));
    }
    return i1;
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    switch (paramInt1)
    {
    case 1: 
      getBorders().getByBorderType(paramInt2).b(1);
      break;
    case 2: 
      getBorders().getByBorderType(paramInt2).b(2);
      break;
    case 3: 
      getBorders().getByBorderType(paramInt2).b(3);
      break;
    case 4: 
      getBorders().getByBorderType(paramInt2).b(4);
      break;
    case 5: 
      getBorders().getByBorderType(paramInt2).b(5);
      break;
    case 6: 
      getBorders().getByBorderType(paramInt2).b(6);
      break;
    case 7: 
      getBorders().getByBorderType(paramInt2).b(7);
      break;
    case 8: 
      getBorders().getByBorderType(paramInt2).b(8);
      break;
    case 9: 
      getBorders().getByBorderType(paramInt2).b(9);
      break;
    case 10: 
      getBorders().getByBorderType(paramInt2).b(10);
      break;
    case 11: 
      getBorders().getByBorderType(paramInt2).b(11);
      break;
    case 12: 
      getBorders().getByBorderType(paramInt2).b(12);
      break;
    case 13: 
      getBorders().getByBorderType(paramInt2).b(13);
      break;
    default: 
      if (this.g != null) {
        this.g.getByBorderType(paramInt2).b(0);
      }
      break;
    }
  }
  
  boolean c(Style paramStyle)
  {
    Workbook localWorkbook1 = this.n.p();
    Workbook localWorkbook2 = paramStyle.n.p();
    if (this.i != paramStyle.i) {
      return false;
    }
    if (this.c != paramStyle.c) {
      return false;
    }
    if (this.r != paramStyle.r) {
      return false;
    }
    if (this.p != paramStyle.p) {
      return false;
    }
    if (this.j != paramStyle.j) {
      return false;
    }
    if (this.o != paramStyle.o) {
      return false;
    }
    if (this.d != paramStyle.d) {
      return false;
    }
    if (isGradient())
    {
      if (this.b.b(paramStyle.b, this.n.p(), paramStyle.n.p())) {
        return false;
      }
      if (this.a.b(paramStyle.a, this.n.p(), paramStyle.n.p())) {
        return false;
      }
    }
    if (n())
    {
      if ((isModified(33)) && (getPattern() != paramStyle.getPattern())) {
        return false;
      }
      if ((isModified(34)) && (this.b.b(paramStyle.b, localWorkbook1, localWorkbook2))) {
        return false;
      }
      if ((isModified(35)) && (this.a.b(paramStyle.a, localWorkbook1, localWorkbook2))) {
        return false;
      }
    }
    if ((k()) && (!getFont().a(paramStyle.getFont(), this.n.p(), paramStyle.n.p()))) {
      return false;
    }
    if (isModified(24))
    {
      if ((this.q == null) || ("".equals(this.q)))
      {
        if ((paramStyle.q != null) && (!"".equals(paramStyle.q))) {
          return false;
        }
      }
      else if ((paramStyle.q == null) || (!zw.b(this.q, paramStyle.q))) {
        return false;
      }
      if (((this.q == null) || ("".equals(this.q))) && ((paramStyle.q == null) || ("".equals(paramStyle.q)))) {
        if (this.l <= 0)
        {
          if (paramStyle.l > 0) {
            return false;
          }
        }
        else if (this.l != paramStyle.l) {
          return false;
        }
      }
    }
    if (m())
    {
      if ((isModified(2)) && (!getBorders().getByBorderType(1).a(paramStyle.getBorders().getByBorderType(1), localWorkbook1, localWorkbook2))) {
        return false;
      }
      if ((isModified(3)) && (!getBorders().getByBorderType(2).a(paramStyle.getBorders().getByBorderType(2), localWorkbook1, localWorkbook2))) {
        return false;
      }
      if ((isModified(4)) && (!getBorders().getByBorderType(4).a(paramStyle.getBorders().getByBorderType(4), localWorkbook1, localWorkbook2))) {
        return false;
      }
      if ((isModified(5)) && (!getBorders().getByBorderType(8).a(paramStyle.getBorders().getByBorderType(8), localWorkbook1, localWorkbook2))) {
        return false;
      }
      if ((isModified(9)) && (!getBorders().getByBorderType(16).a(paramStyle.getBorders().getByBorderType(16), localWorkbook1, localWorkbook2))) {
        return false;
      }
      if ((isModified(10)) && (!getBorders().getByBorderType(32).a(paramStyle.getBorders().getByBorderType(32), localWorkbook1, localWorkbook2))) {
        return false;
      }
      if ((isModified(6)) && (!getBorders().getByBorderType(128).a(paramStyle.getBorders().getByBorderType(128), localWorkbook1, localWorkbook2))) {
        return false;
      }
      if ((isModified(7)) && (!getBorders().getByBorderType(64).a(paramStyle.getBorders().getByBorderType(64), localWorkbook1, localWorkbook2))) {
        return false;
      }
    }
    return true;
  }
  
  boolean d(Style paramStyle)
  {
    if (this.i != paramStyle.i) {
      return false;
    }
    if (this.r != paramStyle.r) {
      return false;
    }
    if (this.p != paramStyle.p) {
      return false;
    }
    if (this.j != paramStyle.j) {
      return false;
    }
    if (this.k != paramStyle.k) {
      return false;
    }
    if (this.o != paramStyle.o) {
      return false;
    }
    if (this.f != paramStyle.f) {
      return false;
    }
    if (this.d != paramStyle.d) {
      return false;
    }
    if (isGradient())
    {
      if (this.b.b(paramStyle.b, this.n.p(), paramStyle.n.p())) {
        return false;
      }
      if (this.a.b(paramStyle.a, this.n.p(), paramStyle.n.p())) {
        return false;
      }
    }
    switch (this.f)
    {
    case 0: 
      break;
    case 1: 
      if (this.b.b(paramStyle.b, this.n.p(), paramStyle.n.p())) {
        return false;
      }
      break;
    default: 
      if (this.b.b(paramStyle.b, this.n.p(), paramStyle.n.p())) {
        return false;
      }
      if (this.a.b(paramStyle.a, this.n.p(), paramStyle.n.p())) {
        return false;
      }
      break;
    }
    if (this.m == null)
    {
      if ((paramStyle.m != null) && (!paramStyle.m.a(this.n.T(), paramStyle.n.p(), this.n.p()))) {
        return false;
      }
    }
    else if (paramStyle.m == null)
    {
      if (!this.m.a(this.n.T(), this.n.p(), paramStyle.n.p())) {
        return false;
      }
    }
    else if (!this.m.a(paramStyle.m, this.n.p(), paramStyle.n.p())) {
      return false;
    }
    if ((this.q == null) || ("".equals(this.q)))
    {
      if (!zw.b(paramStyle.q)) {
        return false;
      }
    }
    else if ((paramStyle.q == null) || (!zw.b(this.q, paramStyle.q))) {
      return false;
    }
    if (((this.q == null) || ("".equals(this.q))) && ((paramStyle.q == null) || ("".equals(paramStyle.q)))) {
      if (this.l <= 0)
      {
        if (paramStyle.l > 0) {
          return false;
        }
      }
      else if (this.l != paramStyle.l) {
        return false;
      }
    }
    if (paramStyle.g == null)
    {
      if (f()) {
        return false;
      }
    }
    else if (this.g == null)
    {
      if (paramStyle.f()) {
        return false;
      }
    }
    else if (!this.g.a(paramStyle.g, this.n.p(), paramStyle.n.p())) {
      return false;
    }
    return true;
  }
  
  boolean a(Style paramStyle, byte paramByte)
  {
    if (this.r != paramStyle.r) {
      return false;
    }
    if (this.p != paramStyle.p) {
      return false;
    }
    if (this.j != paramStyle.j) {
      return false;
    }
    if (this.o != paramStyle.o) {
      return false;
    }
    if (this.f != paramStyle.f) {
      return false;
    }
    if (this.d != paramStyle.d) {
      return false;
    }
    switch (this.f)
    {
    case 0: 
      break;
    case 1: 
      if (this.b.b(paramStyle.b, this.n.p(), paramStyle.n.p())) {
        return false;
      }
      break;
    default: 
      if (this.b.b(paramStyle.b, this.n.p(), paramStyle.n.p())) {
        return false;
      }
      if (this.a.b(paramStyle.a, this.n.p(), paramStyle.n.p())) {
        return false;
      }
      break;
    }
    if (this.m == null)
    {
      if ((paramStyle.m != null) && (!paramStyle.m.a(this.n.T(), paramStyle.n.p(), this.n.p()))) {
        return false;
      }
    }
    else if (paramStyle.m == null)
    {
      if (!this.m.a(this.n.T(), this.n.p(), paramStyle.n.p())) {
        return false;
      }
    }
    else if (!this.m.a(paramStyle.m, this.n.p(), paramStyle.n.p())) {
      return false;
    }
    if ((this.q == null) || ("".equals(this.q)))
    {
      if ((paramStyle.q != null) && (!"".equals(paramStyle.q))) {
        return false;
      }
    }
    else if ((paramStyle.q == null) || (!zw.b(this.q, paramStyle.q))) {
      return false;
    }
    if (((this.q == null) || ("".equals(this.q))) && ((paramStyle.q == null) || ("".equals(paramStyle.q)))) {
      if (this.l <= 0)
      {
        if (paramStyle.l > 0) {
          return false;
        }
      }
      else if (this.l != paramStyle.l) {
        return false;
      }
    }
    if (paramStyle.g == null)
    {
      if (f()) {
        return false;
      }
    }
    else if (this.g == null)
    {
      if (paramStyle.f()) {
        return false;
      }
    }
    else if (!this.g.a(paramStyle.g, this.n.p(), paramStyle.n.p())) {
      return false;
    }
    return true;
  }
  
  boolean e(Style paramStyle)
  {
    if (this.r != paramStyle.r) {
      return false;
    }
    if (this.p != paramStyle.p) {
      return false;
    }
    if (this.j != paramStyle.j) {
      return false;
    }
    if (this.m == null)
    {
      if ((paramStyle.m != null) && (paramStyle.m.m() != 0)) {
        return false;
      }
    }
    else if (paramStyle.m == null)
    {
      if (this.m.m() != 0) {
        return false;
      }
    }
    else if (!this.m.a(paramStyle.m)) {
      return false;
    }
    if ((this.q == null) || ("".equals(this.q)))
    {
      if ((paramStyle.q != null) && (!"".equals(paramStyle.q))) {
        return false;
      }
    }
    else if ((paramStyle.q == null) || (!zw.b(this.q, paramStyle.q))) {
      return false;
    }
    if (((this.q == null) || ("".equals(this.q))) && ((paramStyle.q == null) || ("".equals(paramStyle.q))) && (this.l != paramStyle.l)) {
      return false;
    }
    if (this.o != paramStyle.o) {
      return false;
    }
    if ((getBackgroundColor().toArgb() & 0xFFFFFF) != (paramStyle.getBackgroundColor().toArgb() & 0xFFFFFF)) {
      return false;
    }
    if (paramStyle.g == null)
    {
      if (this.g != null) {
        return false;
      }
    }
    else
    {
      if (this.g == null) {
        return false;
      }
      Border localBorder1 = getBorders().getByBorderType(8);
      Border localBorder2 = paramStyle.getBorders().getByBorderType(8);
      if (!a(localBorder1.getColor(), localBorder2.getColor())) {
        return false;
      }
      if (localBorder1.getLineStyle() != localBorder2.getLineStyle()) {
        return false;
      }
      localBorder1 = getBorders().getByBorderType(16);
      localBorder2 = paramStyle.getBorders().getByBorderType(16);
      if (!a(localBorder1.getColor(), localBorder2.getColor())) {
        return false;
      }
      if (localBorder1.getLineStyle() != localBorder2.getLineStyle()) {
        return false;
      }
      localBorder1 = getBorders().getByBorderType(32);
      localBorder2 = paramStyle.getBorders().getByBorderType(32);
      if (!a(localBorder1.getColor(), localBorder2.getColor())) {
        return false;
      }
      if (localBorder1.getLineStyle() != localBorder2.getLineStyle()) {
        return false;
      }
      localBorder1 = getBorders().getByBorderType(1);
      localBorder2 = paramStyle.getBorders().getByBorderType(1);
      if (!a(localBorder1.getColor(), localBorder2.getColor())) {
        return false;
      }
      if (localBorder1.getLineStyle() != localBorder2.getLineStyle()) {
        return false;
      }
      localBorder1 = getBorders().getByBorderType(2);
      localBorder2 = paramStyle.getBorders().getByBorderType(2);
      if (!a(localBorder1.getColor(), localBorder2.getColor())) {
        return false;
      }
      if (localBorder1.getLineStyle() != localBorder2.getLineStyle()) {
        return false;
      }
      localBorder1 = getBorders().getByBorderType(4);
      localBorder2 = paramStyle.getBorders().getByBorderType(4);
      if (!a(localBorder1.getColor(), localBorder2.getColor())) {
        return false;
      }
      if (localBorder1.getLineStyle() != localBorder2.getLineStyle()) {
        return false;
      }
    }
    if ((getForegroundColor().toArgb() & 0xFFFFFF) != (paramStyle.getForegroundColor().toArgb() & 0xFFFFFF)) {
      return false;
    }
    return this.f == paramStyle.f;
  }
  
  private static boolean a(Color paramColor1, Color paramColor2)
  {
    if (!zh.a(paramColor1, paramColor2)) {
      if (zh.a(paramColor1))
      {
        if (!zh.a(paramColor2, Color.getBlack())) {
          return false;
        }
      }
      else if (zh.a(paramColor1, Color.getBlack()))
      {
        if (!zh.a(paramColor2)) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    return true;
  }
  
  public boolean isModified(int modifyFlag)
  {
    switch (modifyFlag)
    {
    case 0: 
      if (this.c == 0)
      {
        if (this.m == null) {
          return false;
        }
        return this.m.f(11);
      }
      return this.c != 0;
    case 24: 
      return (this.c & 0x1) != 0;
    case 11: 
    case 12: 
    case 13: 
    case 14: 
    case 15: 
    case 16: 
    case 17: 
    case 18: 
    case 19: 
    case 20: 
    case 21: 
    case 22: 
    case 23: 
      if (this.m == null) {
        return false;
      }
      return this.m.f(modifyFlag);
    case 38: 
      return (this.c & 0xF4C2) != 0;
    case 25: 
      return (this.c & 0x40) != 0;
    case 27: 
      return (this.c & 0x80) != 0;
    case 48: 
      return (this.c & 0x2) != 0;
    case 29: 
      return (this.c & 0x400) != 0;
    case 28: 
      return (this.c & 0x1000) != 0;
    case 30: 
      return (this.c & 0x2000) != 0;
    case 31: 
      return (this.c & 0x4000) != 0;
    case 26: 
      return (this.c & 0x8000) != 0;
    case 32: 
      return (this.c & 0x830) != 0;
    case 35: 
      return (this.c & 0x10) != 0;
    case 34: 
      return (this.c & 0x20) != 0;
    case 33: 
      return (this.c & 0x800) != 0;
    case 1: 
      return (this.c & 0xFF0000) != 0;
    case 2: 
      return (this.c & 0x10000) != 0;
    case 3: 
      return (this.c & 0x20000) != 0;
    case 4: 
      return (this.c & 0x40000) != 0;
    case 5: 
      return (this.c & 0x80000) != 0;
    case 8: 
      return (this.c & 0x600000) != 0;
    case 6: 
      return (this.c & 0x100000) != 0;
    case 10: 
      return (this.c & 0x200000) != 0;
    case 9: 
      return (this.c & 0x400000) != 0;
    case 7: 
      return (this.c & 0x800000) != 0;
    case 39: 
      return (this.c & 0x300) != 0;
    case 37: 
      return (this.c & 0x100) != 0;
    case 36: 
      return (this.c & 0x200) != 0;
    }
    return false;
  }
  
  void b(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      this.c = Integer.MAX_VALUE;
      getFont().g(11);
      break;
    case 24: 
      this.c |= 0x1;
      break;
    case 11: 
    case 12: 
    case 13: 
    case 14: 
    case 15: 
    case 16: 
    case 17: 
    case 18: 
    case 19: 
    case 20: 
    case 23: 
      getFont().g(paramInt);
      break;
    case 25: 
      this.c |= 0x40;
      break;
    case 27: 
      this.c |= 0x80;
      break;
    case 48: 
      this.c |= 0x2;
      break;
    case 29: 
      this.c |= 0x400;
      break;
    case 28: 
      this.c |= 0x1000;
      break;
    case 30: 
      this.c |= 0x2000;
      break;
    case 31: 
      this.c |= 0x4000;
      break;
    case 26: 
      this.c |= 0x8000;
      break;
    case 32: 
      this.c |= 0x830;
      break;
    case 35: 
      this.c |= 0x10;
      break;
    case 34: 
      this.c |= 0x20;
      break;
    case 33: 
      this.c |= 0x800;
      break;
    case 1: 
      this.c |= 0x7F0000;
      break;
    case 2: 
      this.c |= 0x10000;
      break;
    case 3: 
      this.c |= 0x20000;
      break;
    case 4: 
      this.c |= 0x40000;
      break;
    case 5: 
      this.c |= 0x80000;
      break;
    case 8: 
      this.c |= 0x600000;
      break;
    case 10: 
      this.c |= 0x200000;
      break;
    case 9: 
      this.c |= 0x400000;
      break;
    case 6: 
      this.c |= 0x100000;
      break;
    case 7: 
      this.c |= 0x800000;
      break;
    case 37: 
      this.c |= 0x100;
      break;
    case 36: 
      this.c |= 0x200;
      break;
    }
  }
  
  void c(int paramInt)
  {
    switch (paramInt)
    {
    case 11: 
      this.m = new Font(null, this, false);
      this.m.c = this.n;
      d(false);
      break;
    }
  }
  
  public boolean equals(Object obj)
  {
    if ((obj == null) || (getClass() != obj.getClass())) {
      return false;
    }
    return d((Style)obj);
  }
  
  public int hashCode()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(zs.a(this.a));
    if (d() != null) {
      a(localStringBuilder);
    }
    localStringBuilder.append(Byte.toString(this.j));
    if (this.m != null) {
      this.m.a(localStringBuilder);
    }
    localStringBuilder.append(zs.a(this.b));
    localStringBuilder.append(Byte.toString(this.p));
    localStringBuilder.append(Byte.toString(this.j));
    localStringBuilder.append(zp.a(this.l));
    localStringBuilder.append(ztt.g(this.f));
    localStringBuilder.append(zp.a(this.o));
    localStringBuilder.append(zp.a(this.h));
    localStringBuilder.append(Short.toString(this.r));
    return zs.a(localStringBuilder).hashCode();
  }
  
  private void a(StringBuilder paramStringBuilder)
  {
    Border localBorder = getBorders().getByBorderType(8);
    a(localBorder, paramStringBuilder);
    localBorder = getBorders().getByBorderType(16);
    a(localBorder, paramStringBuilder);
    localBorder = getBorders().getByBorderType(32);
    a(localBorder, paramStringBuilder);
    localBorder = getBorders().getByBorderType(1);
    a(localBorder, paramStringBuilder);
    localBorder = getBorders().getByBorderType(2);
    a(localBorder, paramStringBuilder);
    localBorder = getBorders().getByBorderType(4);
    a(localBorder, paramStringBuilder);
  }
  
  private void a(Border paramBorder, StringBuilder paramStringBuilder)
  {
    paramStringBuilder.append(ztt.e(paramBorder.a()));
    paramStringBuilder.append(zs.a(paramBorder.getColor()));
    paramStringBuilder.append(ztt.f(paramBorder.getLineStyle()));
  }
  
  public int getIndentLevel()
  {
    return this.j & 0xFF & 0xFF;
  }
  
  public void setIndentLevel(int value)
  {
    if ((value >= 0) && (value <= 250))
    {
      if ((getHorizontalAlignment() != 8) && (getHorizontalAlignment() != 7) && (getHorizontalAlignment() != 3)) {
        setHorizontalAlignment(7);
      }
      this.j = ((byte)value);
      if (!l()) {
        e(true);
      }
      this.c |= 0x80;
    }
    else
    {
      throw new IllegalArgumentException("Indent level must be between 0 and 250.");
    }
  }
  
  void d(int paramInt)
  {
    this.j = ((byte)paramInt);
    if (!l()) {
      e(true);
    }
    this.c |= 0x80;
  }
  
  int p()
  {
    return this.k;
  }
  
  void e(int paramInt)
  {
    this.k = paramInt;
    b(48);
  }
  
  Font q()
  {
    return this.m;
  }
  
  public Font getFont()
  {
    if (this.m == null)
    {
      if (this.n == null)
      {
        this.m = new Font(this.n, this, false);
        return this.m;
      }
      this.m = new Font(this.n, this, false);
      if (this.n.C().b() > 15)
      {
        this.m.a(this.n.T(), null);
        this.m.o();
      }
    }
    return this.m;
  }
  
  public int getRotationAngle()
  {
    return this.o;
  }
  
  public void setRotationAngle(int value)
  {
    if (((value >= -90) && (value <= 90)) || (value == 255))
    {
      this.o = value;
      if (!l()) {
        e(true);
      }
      this.c |= 0x1000;
    }
  }
  
  /**
   * @deprecated
   */
  public int getRotation()
  {
    return this.o;
  }
  
  /**
   * @deprecated
   */
  public void setRotation(int value)
  {
    setRotationAngle(value);
  }
  
  public int getVerticalAlignment()
  {
    switch ((this.p & 0xFF & 0x38) >> 3)
    {
    case 0: 
      return 9;
    case 1: 
      return 1;
    case 2: 
      return 0;
    case 3: 
      return 6;
    case 4: 
      return 3;
    }
    return 1;
  }
  
  public void setVerticalAlignment(int value)
  {
    int i1 = 1;
    switch (value)
    {
    case 7: 
    case 8: 
      return;
    case 9: 
      i1 = 0;
      break;
    case 1: 
      i1 = 1;
      break;
    case 0: 
      i1 = 2;
      break;
    case 6: 
      i1 = 3;
      break;
    case 3: 
      i1 = 4;
      break;
    }
    this.p = ((byte)(this.p & 0xC7));
    this.p = ((byte)(this.p | (byte)((i1 & 0xFF) << 3)));
    if (!l()) {
      e(true);
    }
    this.c |= 0x8000;
  }
  
  public int getHorizontalAlignment()
  {
    switch (this.p & 0xFF & 0x7)
    {
    case 0: 
      return 5;
    case 1: 
      return 7;
    case 2: 
      return 1;
    case 3: 
      return 8;
    case 4: 
      return 4;
    case 5: 
      return 6;
    case 6: 
      return 2;
    case 7: 
      return 3;
    }
    return 5;
  }
  
  public void setHorizontalAlignment(int value)
  {
    int i1 = 0;
    switch (value)
    {
    case 0: 
    case 9: 
      return;
    case 5: 
      this.j = 0;
      break;
    case 7: 
      i1 = 1;
      break;
    case 1: 
      this.j = 0;
      i1 = 2;
      break;
    case 8: 
      i1 = 3;
      break;
    case 4: 
      this.j = 0;
      i1 = 4;
      break;
    case 6: 
      this.j = 0;
      i1 = 5;
      break;
    case 2: 
      this.j = 0;
      i1 = 6;
      break;
    case 3: 
      i1 = 7;
      break;
    }
    this.p = ((byte)(this.p & 0xF8));
    this.p = ((byte)(this.p | i1));
    if (!l()) {
      e(true);
    }
    this.c |= 0x40;
  }
  
  public boolean isTextWrapped()
  {
    return (this.r & 0x4) != 0;
  }
  
  public void setTextWrapped(boolean value)
  {
    if (value) {
      this.r = ((short)(this.r | 0x4));
    } else {
      this.r = ((short)(this.r & 0xFFFFFFFB));
    }
    if (!l()) {
      e(true);
    }
    this.c |= 0x400;
  }
  
  public int getNumber()
  {
    if ((this.l >= 0) && (this.l < 59)) {
      return (byte)this.l;
    }
    return 0;
  }
  
  public void setNumber(int value)
  {
    if ((value < 59) && (value >= 0))
    {
      this.q = "";
      this.l = value;
    }
    else
    {
      this.l = value;
    }
    c(true);
    this.c |= 0x1;
  }
  
  void a(int[] paramArrayOfInt, String[] paramArrayOfString)
  {
    paramArrayOfInt[0] = this.l;
    paramArrayOfString[0] = this.q;
  }
  
  void a(int paramInt, String paramString)
  {
    this.l = paramInt;
    this.q = paramString;
  }
  
  void b(int paramInt, String paramString)
  {
    if ((paramString == null) || ("".equals(paramString)) || (zy.a("General", paramString)))
    {
      this.q = "";
    }
    else
    {
      if (paramString.length() > 255) {
        throw new CellsException(6, "The Custom number format string is too long.");
      }
      this.q = paramString;
      if (c(paramString)) {
        this.r = ((short)(this.r | 0x80));
      } else {
        this.r = ((short)(this.r & 0xFF7F));
      }
    }
    this.l = paramInt;
    c(true);
    this.c |= 0x1;
  }
  
  int r()
  {
    return this.l;
  }
  
  void f(int paramInt)
  {
    this.l = paramInt;
  }
  
  public boolean setBorder(int borderEdge, int borderStyle, Color borderColor)
  {
    Border localBorder = null;
    if (borderStyle == 0)
    {
      if ((this.g == null) || (this.g.getByBorderType(borderEdge).getLineStyle() == 0)) {
        return false;
      }
      localBorder = getBorders().getByBorderType(borderEdge);
      localBorder.setLineStyle(borderStyle);
      localBorder.setColor(borderColor);
      return true;
    }
    localBorder = getBorders().getByBorderType(borderEdge);
    if ((borderStyle == localBorder.getLineStyle()) && (localBorder.a.a(borderColor, Color.getBlack(), this.n.p()))) {
      return false;
    }
    localBorder = getBorders().getByBorderType(borderEdge);
    localBorder.setLineStyle(borderStyle);
    localBorder.setColor(borderColor);
    return true;
  }
  
  public boolean isLocked()
  {
    return (this.r & 0x2) != 0;
  }
  
  public void setLocked(boolean value)
  {
    if (value) {
      this.r = ((short)(this.r | 0x2));
    } else {
      this.r = ((short)(this.r & 0xFFFFFFFD));
    }
    h(true);
    this.c |= 0x200;
  }
  
  private boolean c(String paramString)
  {
    if (this.n == null) {
      return zgx.a(paramString);
    }
    zahf localzahf1 = this.n.p().getSettings().f().a(paramString, false);
    if (localzahf1.a() == 6)
    {
      for (zahf localzahf2 : ((zaab)localzahf1).d()) {
        if (localzahf2.a() == 3) {
          return true;
        }
      }
      return false;
    }
    return localzahf1.a() == 3;
  }
  
  public void setCustom(String custom, boolean builtinPreference)
  {
    if (builtinPreference)
    {
      int i1 = this.n.p().getSettings().f().a(custom);
      if (i1 > -1)
      {
        setNumber(i1);
        return;
      }
    }
    setCustom(custom);
  }
  
  public String getCustom()
  {
    return this.q;
  }
  
  public void setCustom(String value)
  {
    if ((this.n != null) && (this.n.p().getSettings().getCheckCustomNumberFormat()) && (!d(value))) {
      throw new CellsException(6, "Invalid number format.");
    }
    b(value);
  }
  
  private boolean d(String paramString)
  {
    if ((zw.b(paramString)) || (paramString.indexOf('@') == -1)) {
      return true;
    }
    char[] arrayOfChar = paramString.toCharArray();
    int i1 = arrayOfChar.length;
    int i2 = 0;
    int i3 = 0;
    for (int i4 = 0; i4 < i1; i4++)
    {
      int i5;
      switch (arrayOfChar[i4])
      {
      case '"': 
      case '\'': 
      case '[': 
        i5 = arrayOfChar[i4];
        i4++;
      }
      while ((i4 < i1) && (arrayOfChar[i4] != i5))
      {
        i4++;
        continue;
        i4++;
        break;
        if ((i3 != 0) && (i2 > 0)) {
          return false;
        }
        i3 = 0;
        i2 = 0;
        break;
        i3 = 1;
        break;
        i2++;
      }
    }
    return (i3 == 0) || (i2 <= 0);
  }
  
  String s()
  {
    return this.q;
  }
  
  void b(String paramString)
  {
    if ((paramString == null) || ("".equals(paramString)))
    {
      this.q = "";
      this.r = ((short)(this.r & 0xFF7F));
    }
    else
    {
      if (paramString.length() > 255) {
        throw new CellsException(6, "The Custom number format string is too long.");
      }
      this.q = paramString;
      if (c(this.q)) {
        this.r = ((short)(this.r | 0x80));
      } else {
        this.r = ((short)(this.r & 0xFF7F));
      }
    }
    this.l = -1;
    c(true);
    this.c |= 0x1;
  }
  
  public String getCultureCustom()
  {
    if ((this.q == null) || ("".equals(this.q)))
    {
      if (getNumber() == 0) {
        return null;
      }
      zzx localzzx = this.n.p().getSettings().f();
      return zaac.a(localzzx.d(getNumber()), localzzx, false);
    }
    return zaac.a(this.q, this.n.p().getSettings().f(), false);
  }
  
  public void setCultureCustom(String value)
  {
    if ((value == null) || ("".equals(value))) {
      b("");
    }
    b(zaac.a(value, this.n.p().getSettings().f(), true));
  }
  
  String t()
  {
    return this.q;
  }
  
  public boolean isFormulaHidden()
  {
    return (this.r & 0x1) != 0;
  }
  
  public void setFormulaHidden(boolean value)
  {
    if (value) {
      this.r = ((short)(this.r | 0x1));
    } else {
      this.r = ((short)(this.r & 0xFFFFFFFE));
    }
    h(true);
    this.c |= 0x100;
  }
  
  public boolean getShrinkToFit()
  {
    return (this.r & 0x8) != 0;
  }
  
  public void setShrinkToFit(boolean value)
  {
    if (value) {
      this.r = ((short)(this.r | 0x8));
    } else {
      this.r = ((short)(this.r & 0xFFFFFFF7));
    }
    if (!l()) {
      e(true);
    }
    this.c |= 0x2000;
  }
  
  public int getTextDirection()
  {
    switch (this.p & 0xFF & 0xC0)
    {
    case 64: 
      return 1;
    case 128: 
      return 2;
    }
    return 0;
  }
  
  public void setTextDirection(int value)
  {
    this.p = ((byte)(this.p & 0x3F));
    switch (value)
    {
    case 1: 
      this.p = ((byte)(this.p | 0x40));
      break;
    case 2: 
      this.p = ((byte)(this.p | 0x80));
      break;
    }
    this.c |= 0x4000;
    if (!l()) {
      e(true);
    }
  }
  
  boolean u()
  {
    return (this.r & 0x400) != 0;
  }
  
  void i(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.r = ((short)(this.r | 0x400));
    } else {
      this.r = ((short)(this.r & 0xFBFF));
    }
  }
  
  boolean v()
  {
    return (this.r & 0x800) != 0;
  }
  
  void j(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.r = ((short)(this.r | 0x800));
    } else {
      this.r = ((short)(this.r & 0xFBFF));
    }
  }
  
  public boolean isJustifyDistributed()
  {
    return (this.r & 0x200) != 0;
  }
  
  public void setJustifyDistributed(boolean value)
  {
    if (value) {
      this.r = ((short)(this.r | 0x200));
    } else {
      this.r = ((short)(this.r & 0xFDFF));
    }
  }
  
  public boolean getQuotePrefix()
  {
    return w();
  }
  
  boolean w()
  {
    return (this.r & 0x100) != 0;
  }
  
  void k(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.r = ((short)(this.r | 0x100));
    } else {
      this.r = ((short)(this.r & 0xFEFF));
    }
  }
  
  boolean x()
  {
    return (this.r & 0x40) != 0;
  }
  
  void l(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.r = ((short)(this.r | 0x40));
    } else {
      this.r = ((short)(this.r & 0xFFFFFFBF));
    }
  }
  
  public boolean isGradient()
  {
    return (this.d & 0xFF & 0x80) != 0;
  }
  
  public void setGradient(boolean value)
  {
    if (value) {
      this.d = ((byte)(this.d | 0x80));
    } else {
      this.d = ((byte)(this.d & 0x7F));
    }
  }
  
  int y()
  {
    switch (this.d & 0xFF & 0xF)
    {
    case 1: 
      return 4;
    case 2: 
      return 5;
    case 3: 
      return 1;
    case 4: 
      return 0;
    case 5: 
      return 2;
    case 6: 
      return 3;
    }
    return 6;
  }
  
  void g(int paramInt)
  {
    this.d = ((byte)(this.d & 0xF0));
    int i1 = 0;
    switch (paramInt)
    {
    case 4: 
      i1 = 1;
      break;
    case 5: 
      i1 = 2;
      break;
    case 1: 
      i1 = 3;
      break;
    case 0: 
      i1 = 4;
      break;
    case 2: 
      i1 = 5;
      break;
    case 3: 
      i1 = 6;
      break;
    }
    this.d = ((byte)(this.d | i1));
  }
  
  int z()
  {
    return (this.d & 0xFF & 0x70) >> 4;
  }
  
  void h(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 4)) {
      throw new CellsException(6, "Invalid style gradient Variant");
    }
    this.d = ((byte)(this.d & 0x8F));
    this.d = ((byte)(this.d | (byte)(paramInt << 4)));
  }
  
  public void setTwoColorGradient(Color color1, Color color2, int gradientStyleType, int variant)
  {
    this.b.a(2, color1.toArgb());
    this.a.a(2, color2.toArgb());
    g(gradientStyleType);
    h(variant);
    setGradient(true);
    setPattern(1);
  }
  
  void a(zaml paramzaml1, zaml paramzaml2, int paramInt1, int paramInt2)
  {
    this.b = paramzaml1;
    this.a = paramzaml2;
    g(paramInt1);
    h(paramInt2);
    setGradient(true);
    setPattern(1);
  }
  
  public Object[] getTwoColorGradient()
  {
    if (isGradient())
    {
      Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = getForegroundColor();
      arrayOfObject[1] = getBackgroundColor();
      arrayOfObject[2] = Integer.valueOf(y());
      arrayOfObject[3] = Integer.valueOf(z());
      return arrayOfObject;
    }
    return null;
  }
  
  public boolean isPercent()
  {
    String str = this.q;
    if ((str != null) && (!str.equals(""))) {
      return str.indexOf("%") > -1;
    }
    switch (this.l)
    {
    case 9: 
    case 10: 
      return true;
    }
    return false;
  }
  
  void m(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.r = ((short)(this.r | 0x80));
    }
  }
  
  public boolean isDateTime()
  {
    String str = this.q;
    if (!"".equals(str)) {
      return (this.r & 0x80) != 0;
    }
    int i1 = this.l;
    switch (this.l)
    {
    case 14: 
    case 15: 
    case 16: 
    case 17: 
    case 18: 
    case 19: 
    case 20: 
    case 21: 
    case 22: 
    case 27: 
    case 28: 
    case 29: 
    case 30: 
    case 31: 
    case 32: 
    case 33: 
    case 34: 
    case 35: 
    case 36: 
    case 45: 
    case 46: 
    case 47: 
    case 50: 
    case 51: 
    case 52: 
    case 53: 
    case 54: 
    case 55: 
    case 56: 
    case 57: 
    case 58: 
      return true;
    }
    return false;
  }
  
  void c(int paramInt, String paramString)
  {
    switch (paramInt)
    {
    case 0: 
      if (paramString != null) {
        getBorders().getByBorderType(8).setLineStyle(zauj.j(paramString));
      }
      break;
    case 1: 
      if (paramString != null) {
        getBorders().getByBorderType(16).setLineStyle(zauj.j(paramString));
      }
      break;
    case 2: 
      if (paramString != null) {
        getBorders().getByBorderType(32).setLineStyle(zauj.j(paramString));
      }
      break;
    case 3: 
      if (paramString != null) {
        getBorders().getByBorderType(1).setLineStyle(zauj.j(paramString));
      }
      break;
    case 4: 
      if (paramString != null) {
        getBorders().getByBorderType(2).setLineStyle(zauj.j(paramString));
      }
      break;
    case 5: 
      if (paramString != null) {
        getBorders().getByBorderType(4).setLineStyle(zauj.j(paramString));
      }
      break;
    case 6: 
      if (paramString != null) {
        getBorders().setDiagonalStyle(zauj.j(paramString));
      }
      break;
    case 7: 
      if (paramString != null)
      {
        getBorders().a(new Border(getBorders(), 128));
        getBorders().b().setLineStyle(zauj.j(paramString));
      }
      break;
    case 8: 
      if (paramString != null)
      {
        getBorders().b(new Border(getBorders(), 64));
        getBorders().c().setLineStyle(zauj.j(paramString));
      }
      break;
    }
  }
  
  void a(int paramInt1, String paramString, int paramInt2, int paramInt3, double paramDouble)
  {
    switch (paramInt1)
    {
    case 0: 
      if (paramString != null) {
        getBorders().getByBorderType(8).setLineStyle(zauj.j(paramString));
      }
      getBorders().getByBorderType(8).a.a(paramInt2, paramInt3);
      getBorders().getByBorderType(8).a.a(paramDouble);
      b(5);
      break;
    case 1: 
      if (paramString != null) {
        getBorders().getByBorderType(16).setLineStyle(zauj.j(paramString));
      }
      getBorders().getByBorderType(16).a.a(paramInt2, paramInt3);
      getBorders().getByBorderType(16).a.a(paramDouble);
      b(9);
      break;
    case 2: 
      if (paramString != null) {
        getBorders().getByBorderType(32).setLineStyle(zauj.j(paramString));
      }
      getBorders().getByBorderType(32).a.a(paramInt2, paramInt3);
      getBorders().getByBorderType(32).a.a(paramDouble);
      b(10);
      break;
    case 3: 
      if (paramString != null) {
        getBorders().getByBorderType(1).setLineStyle(zauj.j(paramString));
      }
      getBorders().getByBorderType(1).a.a(paramInt2, paramInt3);
      getBorders().getByBorderType(1).a.a(paramDouble);
      b(2);
      break;
    case 4: 
      if (paramString != null) {
        getBorders().getByBorderType(2).setLineStyle(zauj.j(paramString));
      }
      getBorders().getByBorderType(2).a.a(paramInt2, paramInt3);
      getBorders().getByBorderType(2).a.a(paramDouble);
      b(3);
      break;
    case 5: 
      if (paramString != null) {
        getBorders().getByBorderType(4).setLineStyle(zauj.j(paramString));
      }
      getBorders().getByBorderType(4).a.a(paramInt2, paramInt3);
      getBorders().getByBorderType(4).a.a(paramDouble);
      b(4);
      break;
    case 6: 
      if (paramString != null) {
        getBorders().setDiagonalStyle(zauj.j(paramString));
      }
      zaml localzaml = new zaml(false);
      localzaml.a(paramInt2, paramInt3);
      localzaml.a(paramDouble);
      getBorders().getByBorderType(16).a = localzaml;
      getBorders().getByBorderType(32).a = localzaml;
      b(8);
      break;
    case 7: 
      getBorders().a(new Border(getBorders(), 128));
      if (paramString != null) {
        getBorders().b().setLineStyle(zauj.j(paramString));
      }
      getBorders().b().a.a(paramInt2, paramInt3);
      getBorders().b().a.a(paramDouble);
      b(6);
      break;
    case 8: 
      getBorders().b(new Border(getBorders(), 64));
      if (paramString != null) {
        getBorders().c().setLineStyle(zauj.j(paramString));
      }
      getBorders().c().a.a(paramInt2, paramInt3);
      getBorders().c().a.a(paramDouble);
      b(7);
      break;
    }
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, double paramDouble)
  {
    zaml localzaml = new zaml(false);
    localzaml.a(paramInt2, paramInt3);
    localzaml.a(paramDouble);
    switch (paramInt1)
    {
    case 0: 
      getFont().a(localzaml);
      b(16);
      break;
    case 1: 
      this.b = localzaml;
      b(34);
      break;
    case 2: 
      this.a = localzaml;
      b(35);
      break;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Style.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */