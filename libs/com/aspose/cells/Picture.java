package com.aspose.cells;

public class Picture
  extends Shape
{
  double a = -1.0D;
  double b = -1.0D;
  boolean c = false;
  boolean d = false;
  short e = 1;
  SignatureLine f;
  
  Picture(ShapeCollection shapes)
  {
    super(shapes, 8, shapes);
  }
  
  public void copy(Picture source, CopyOptions options)
  {
    super.a(source, options);
    if (source.a() != null)
    {
      zcf localzcf = source.a();
      if (localzcf != null) {
        a(N().e().b().a(localzcf, source.b(), P() == source.P()));
      } else {
        a(0);
      }
    }
  }
  
  public void move(int upperLeftRow, int upperLeftColumn)
  {
    a(upperLeftRow, 0, upperLeftColumn, 0);
  }
  
  zcf a()
  {
    if (b() < 1) {
      return null;
    }
    if (b() - 1 >= N().e().b().getCount()) {
      return null;
    }
    return N().e().b().a(b() - 1);
  }
  
  public int getOriginalHeight()
  {
    zcf localzcf = a();
    if (localzcf == null) {
      return 0;
    }
    return a().l();
  }
  
  public int getOriginalWidth()
  {
    zcf localzcf = a();
    if (localzcf == null) {
      return 0;
    }
    return a().k();
  }
  
  int b()
  {
    return R().d().c(16644, 0);
  }
  
  void a(int paramInt)
  {
    R().d().a(16644, 0, Integer.valueOf(paramInt));
  }
  
  public Color getBorderLineColor()
  {
    return B().getLine().b();
  }
  
  public void setBorderLineColor(Color value)
  {
    B().getLine().a(value);
  }
  
  public double getBorderWeight()
  {
    return B().getLine().getWeight();
  }
  
  public void setBorderWeight(double value)
  {
    B().getLine().setWeight(value);
  }
  
  public byte[] getData()
  {
    zcf localzcf = a();
    if (localzcf == null) {
      return null;
    }
    return localzcf.b();
  }
  
  public void setData(byte[] value)
    throws Exception
  {
    if (b() != -1)
    {
      int i = b();
      a(0);
      N().f(i);
    }
    if (value == null) {
      return;
    }
    a(N().e().b().a(value) + 1);
  }
  
  public String getSourceFullName()
  {
    if ((c() & 0xA) != 0) {
      return R().d().e(49413);
    }
    return null;
  }
  
  public void setSourceFullName(String value)
  {
    R().d().a(49413, 2, value);
    b(14);
    if (R().d().c(16644) != null)
    {
      zcf localzcf = a();
      if (localzcf != null) {
        localzcf.j();
      }
      R().d().b(16644);
    }
  }
  
  void a(String paramString)
  {
    R().d().a(49413, 2, paramString);
    b(14);
  }
  
  public String getFormula()
  {
    return aj();
  }
  
  public void setFormula(String value)
  {
    e(value);
    this.d = true;
  }
  
  int c()
  {
    return R().d().c(262, 0);
  }
  
  void b(int paramInt)
  {
    R().d().a(262, 0, Integer.valueOf(paramInt));
  }
  
  boolean d()
  {
    return (c() & 0x8) != 0;
  }
  
  void a(short paramShort)
  {
    this.e = paramShort;
  }
  
  public boolean isAutoSize()
  {
    return (this.e & 0x1) != 0;
  }
  
  public void setAutoSize(boolean value)
  {
    if (value) {
      this.e = ((short)(this.e | 0x1));
    } else {
      this.e = ((short)(this.e & 0xFFFFFFFE));
    }
  }
  
  public boolean isLink()
  {
    return (this.e & 0x2) == 2;
  }
  
  public void setLink(boolean value)
  {
    if (value) {
      this.e = ((short)(this.e | 0x2));
    } else {
      this.e = ((short)(this.e & 0xFFFFFFFD));
    }
  }
  
  public boolean isDynamicDataExchange()
  {
    return (this.e & 0x4) != 0;
  }
  
  public void setDynamicDataExchange(boolean value)
  {
    if (value) {
      this.e = ((short)(this.e | 0x4));
    } else {
      this.e = ((short)(this.e & 0xFFFFFFFB));
    }
  }
  
  public boolean getDisplayAsIcon()
  {
    return (this.e & 0x8) != 0;
  }
  
  public void setDisplayAsIcon(boolean value)
  {
    if (value) {
      this.e = ((short)(this.e | 0x8));
    } else {
      this.e = ((short)(this.e & 0xFFFFFFF7));
    }
  }
  
  boolean e()
  {
    return (this.e & 0x10) != 0;
  }
  
  boolean f()
  {
    return (this.e & 0x20) == 0;
  }
  
  public ImageFormat getImageFormat()
    throws Exception
  {
    zcf localzcf = a();
    if ((localzcf == null) || (localzcf.f() == null) || (localzcf.f().e() == null)) {
      return ImageFormat.getBmp();
    }
    return localzcf.a();
  }
  
  public double getOriginalHeightCM()
  {
    return zbxp.a(getOriginalHeight());
  }
  
  public double getOriginalWidthCM()
  {
    return zbxp.a(getOriginalWidth());
  }
  
  public double getOriginalHeightInch()
  {
    return zbxp.b(getOriginalHeight());
  }
  
  public double getOriginalWidthInch()
  {
    return zbxp.b(getOriginalWidth());
  }
  
  public SignatureLine getSignatureLine()
  {
    return this.f;
  }
  
  public void setSignatureLine(SignatureLine value)
  {
    this.f = value;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Picture.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */