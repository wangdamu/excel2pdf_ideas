package com.aspose.cells;

import com.aspose.cells.b.c.a.za;

public class TextOptions
  extends Font
{
  int i;
  zbwk j;
  ShapeFormat k;
  zaml l;
  private int m = 0;
  private int n = 0;
  private static final za o = new za(new String[] { "+mn-lt", "+mn-ea", "+mn-cs", "+mj-lt", "+mj-ea", "+mj-cs" });
  
  TextOptions(WorksheetCollection sheets, Object parent)
  {
    super(sheets, parent, true);
    if (this.c.p().h()) {
      b(11.0D);
    }
  }
  
  boolean l()
  {
    return true;
  }
  
  void a(Font paramFont, CopyOptions paramCopyOptions)
  {
    super.a(paramFont, paramCopyOptions);
    if ((paramFont instanceof TextOptions))
    {
      TextOptions localTextOptions = (TextOptions)paramFont;
      this.m = localTextOptions.m;
      this.i = localTextOptions.i;
      this.n = localTextOptions.n;
      if (localTextOptions.j != null)
      {
        this.j = new zbwk();
        this.j.a(localTextOptions.j);
      }
      if (localTextOptions.l != null)
      {
        this.l = new zaml(true);
        this.l.a(localTextOptions.l, localTextOptions.c, this.c);
      }
      if (localTextOptions.k != null) {
        this.k.b(localTextOptions.k, paramCopyOptions);
      } else {
        this.k = null;
      }
    }
    else
    {
      setName(paramFont.getName());
    }
  }
  
  void b(String paramString)
  {
    t().b(paramString);
    c(paramString);
  }
  
  void a(String paramString, boolean paramBoolean, int paramInt)
  {
    t().b(paramString);
    g(13);
    c(paramString);
    if (paramBoolean) {
      e(paramInt);
    }
  }
  
  TextParagraph q()
  {
    if ((this.d instanceof Shape))
    {
      FontSettingCollection localFontSettingCollection = ((Shape)this.d).getTextBody();
      zane localzane = localFontSettingCollection.b();
      if ((localzane != null) && (localzane.getCount() > 0)) {
        return localzane.a(0);
      }
    }
    return null;
  }
  
  private static String a(int paramInt1, int paramInt2, zrs paramzrs, String paramString, WorksheetCollection paramWorksheetCollection)
  {
    String str = paramString;
    if ((paramzrs != null) && (paramzrs.f != null))
    {
      boolean bool = false;
      switch (o.a(paramString))
      {
      case 0: 
        str = paramzrs.f.c.a;
        break;
      case 1: 
        str = paramzrs.f.c.b;
        break;
      case 2: 
        str = paramzrs.f.c.c;
        break;
      case 3: 
        bool = true;
        str = paramzrs.f.b.a;
        break;
      case 4: 
        bool = true;
        str = paramzrs.f.b.b;
        break;
      case 5: 
        bool = true;
        str = paramzrs.f.b.c;
        break;
      default: 
        return str;
      }
      if ((paramInt2 != 0) && ((str == null) || ("".equals(str)))) {
        str = paramzrs.f.b(paramInt2, bool);
      }
    }
    return str;
  }
  
  public String getName()
  {
    zrs localzrs = this.c.p().d();
    int i1 = s();
    int i2 = r();
    if (i1 == 0) {
      i1 = i2;
    }
    int i3 = 0;
    zbwj localzbwj = null;
    if (i1 != 0) {
      i3 = zamr.c(i1);
    }
    if (this.j != null) {
      localzbwj = this.j.b(i3);
    }
    TextOptions localTextOptions;
    if (localzbwj == null)
    {
      localObject1 = q();
      if ((localObject1 != null) && (((TextParagraph)localObject1).q != null) && ((((TextParagraph)localObject1).q instanceof TextOptions)))
      {
        localTextOptions = (TextOptions)((TextParagraph)localObject1).q;
        if (localTextOptions.j != null) {
          localzbwj = localTextOptions.j.b(i3);
        }
      }
    }
    Object localObject1 = null;
    if (localzbwj != null) {
      localObject1 = a(i1, i2, localzrs, localzbwj.a, this.c);
    }
    if ((localObject1 == null) || ("".equals(localObject1)))
    {
      localTextOptions = (this.d instanceof Shape) ? (Shape)this.d : null;
      if ((this.c.p().h()) || ((localTextOptions != null) && (!localTextOptions.T()) && (localTextOptions.R().b() != null)))
      {
        localObject2 = null;
        if (i1 != 0) {
          localObject2 = localzrs.f.b(i1, false);
        }
        if ((localObject2 == null) || ("".equals(localObject2))) {
          if ((this.d != null) && ((this.d instanceof Shape)) && (zax.a(((Shape)this.d).getText()))) {
            localObject2 = "Arial";
          } else {
            localObject2 = localzrs.f.a(this.c.p().getSettings().getRegion(), false);
          }
        }
        if ((localObject2 != null) && (!"".equals(localObject2))) {
          return (String)localObject2;
        }
        return "Calibri";
      }
      Object localObject2 = this.c.T();
      return ((Font)localObject2).f;
    }
    return (String)localObject1;
  }
  
  public void setName(String value)
  {
    t().clear();
    t().a(0, value);
    t().a(1, value);
  }
  
  int r()
  {
    return this.i >> 16 & 0xFFFF;
  }
  
  void h(int paramInt)
  {
    this.i &= 0xFFFF;
    this.i |= paramInt << 16;
  }
  
  int s()
  {
    return this.i & 0xFFFF;
  }
  
  void i(int paramInt)
  {
    this.i &= 0xFFFF0000;
    this.i |= paramInt;
  }
  
  zbwk t()
  {
    if (this.j == null) {
      this.j = new zbwk();
    }
    return this.j;
  }
  
  public FillFormat getFill()
  {
    return u().getFill();
  }
  
  public LineFormat getOutline()
  {
    return u().getLine();
  }
  
  public ShadowEffect getShadow()
    throws Exception
  {
    return u().getShadowEffect();
  }
  
  ShapeFormat u()
  {
    if (this.k == null)
    {
      zaml localzaml = b();
      this.k = new ShapeFormat(this.c.p(), this);
      this.k.a(2);
      this.k.getFill().getSolidFill().a = localzaml;
    }
    return this.k;
  }
  
  boolean i()
  {
    return (this.k != null) && (this.k.a != null);
  }
  
  zaml b()
  {
    zaml localzaml1 = this.b;
    Object localObject1;
    Object localObject2;
    if (this.k == null)
    {
      if (super.i()) {
        return localzaml1;
      }
      localObject1 = this.d;
      if ((localObject1 != null) && ((localObject1 instanceof Shape)))
      {
        Shape localShape = (Shape)localObject1;
        if ((localShape.p != null) && (localShape.p.b != null))
        {
          localObject2 = localShape.p.b;
          zaml localzaml2 = ((zbsy)localObject2).b;
          localzaml1 = new zaml(true);
          localzaml1.f(localzaml2);
          return localzaml1;
        }
      }
    }
    else if (this.k.a() == 2)
    {
      localzaml1 = this.k.getFill().getSolidFill().a;
    }
    else if (this.k.a() == 3)
    {
      localObject1 = this.k.getFill().getGradientFill();
      for (int i1 = ((GradientFill)localObject1).getGradientStops().getCount() - 1; i1 >= 0; i1--)
      {
        localObject2 = ((GradientFill)localObject1).getGradientStops().get(i1);
        if (((GradientStop)localObject2).a != null) {
          return ((GradientStop)localObject2).a;
        }
      }
    }
    return localzaml1;
  }
  
  void a(zaml paramzaml)
  {
    if (paramzaml.b())
    {
      u().a(0);
    }
    else
    {
      u().a(2);
      this.k.getFill().getSolidFill().a = paramzaml;
    }
  }
  
  public CellsColor getUnderlineColor()
  {
    if (getUnderline() == 0) {
      return null;
    }
    if (this.l == null) {
      this.l = new zaml(true);
    }
    return new CellsColor(this.c.p(), this.l);
  }
  
  public void setUnderlineColor(CellsColor value)
  {
    this.l = value.a;
  }
  
  boolean v()
  {
    return (this.g & 0x40000) != 0;
  }
  
  void d(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.g |= 0x40000;
    } else {
      this.g &= 0xFFFBFFFF;
    }
    g(41);
  }
  
  public double getKerning()
  {
    return zbxp.e(w());
  }
  
  public void setKerning(double value)
  {
    j(zbxp.i(value));
  }
  
  int w()
  {
    return this.m;
  }
  
  void j(int paramInt)
  {
    this.m = paramInt;
    g(45);
  }
  
  public double getSpacing()
  {
    return zbxp.e(x());
  }
  
  public void setSpacing(double value)
  {
    k(zbxp.i(value));
  }
  
  int x()
  {
    return this.n;
  }
  
  void k(int paramInt)
  {
    this.n = paramInt;
    g(44);
  }
  
  boolean y()
  {
    return (this.g & 0x80000) != 0;
  }
  
  void e(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.g |= 0x80000;
    } else {
      this.g &= 0xFFF7FFFF;
    }
    g(26);
  }
  
  boolean z()
  {
    return (this.g & 0x100000) != 0;
  }
  
  void f(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.g |= 0x100000;
    } else {
      this.g &= 0xFFEFFFFF;
    }
    g(42);
  }
  
  void g(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.g |= 0x200000;
    } else {
      this.g &= 0xFFDFFFFF;
    }
    g(43);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/TextOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */