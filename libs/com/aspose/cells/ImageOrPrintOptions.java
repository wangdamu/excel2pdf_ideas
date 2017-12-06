package com.aspose.cells;

import com.aspose.cells.b.a.b.c.za;
import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.Map;

public class ImageOrPrintOptions
{
  private int n = 96;
  private int o = 96;
  private int p = 2;
  private int q = 0;
  private int r = 100;
  private ImageFormat s = ImageFormat.getBmp();
  private boolean t = false;
  private boolean u = true;
  boolean a = false;
  boolean b = false;
  boolean c = false;
  boolean d = false;
  boolean e = false;
  boolean f = false;
  private int v = 0;
  private za w = null;
  boolean g = true;
  private boolean x = false;
  private boolean y = false;
  private boolean z = false;
  private DrawObjectEventHandler A = null;
  private ImageFormat B = ImageFormat.getEmf();
  private String C = "c:\\xpsEmbeded";
  private boolean D = false;
  private boolean E = false;
  Map<RenderingHints.Key, Object> h = new HashMap();
  private int F = -1;
  private boolean G = false;
  private int H = 2498570;
  private IWarningCallback I = null;
  IStreamProvider i;
  private boolean J = false;
  private boolean K = true;
  private int L = 0;
  private int M = Integer.MAX_VALUE;
  int j = 0;
  int k = 0;
  boolean l = false;
  boolean m = false;
  private String N = null;
  private boolean O = true;
  private boolean P = false;
  private int Q = 0;
  
  public int getSaveFormat()
  {
    return this.v;
  }
  
  public void setSaveFormat(int value)
  {
    this.v = value;
  }
  
  public boolean getPrintWithStatusDialog()
  {
    return this.g;
  }
  
  public void setPrintWithStatusDialog(boolean value)
  {
    this.g = value;
  }
  
  public int getHorizontalResolution()
  {
    return this.n;
  }
  
  public void setHorizontalResolution(int value)
  {
    this.a = true;
    this.n = value;
  }
  
  public int getVerticalResolution()
  {
    return this.o;
  }
  
  public void setVerticalResolution(int value)
  {
    this.a = true;
    this.o = value;
  }
  
  public int getTiffCompression()
  {
    return this.p;
  }
  
  public void setTiffCompression(int value)
  {
    this.c = true;
    this.p = value;
  }
  
  public int getPrintingPage()
  {
    return this.q;
  }
  
  public void setPrintingPage(int value)
  {
    this.b = true;
    this.q = value;
  }
  
  public int getQuality()
  {
    return this.r;
  }
  
  public void setQuality(int value)
  {
    if ((value < 0) || (value > 100)) {
      throw new IllegalArgumentException("Parameter name: Quality must be between 0 and 100");
    }
    this.r = value;
  }
  
  public ImageFormat getImageFormat()
  {
    return this.s;
  }
  
  public void setImageFormat(ImageFormat value)
  {
    this.s = value;
    this.d = true;
  }
  
  public boolean isCellAutoFit()
  {
    return this.t;
  }
  
  public void setCellAutoFit(boolean value)
  {
    this.t = value;
  }
  
  boolean a()
  {
    return this.u;
  }
  
  void a(boolean paramBoolean)
  {
    this.u = paramBoolean;
  }
  
  /**
   * @deprecated
   */
  public boolean isImageFitToPage()
  {
    return this.x;
  }
  
  /**
   * @deprecated
   */
  public void setImageFitToPage(boolean value)
  {
    this.x = value;
  }
  
  public boolean getOnePagePerSheet()
  {
    return this.y;
  }
  
  public void setOnePagePerSheet(boolean value)
  {
    this.y = value;
  }
  
  public boolean getAllColumnsInOnePagePerSheet()
  {
    return this.z;
  }
  
  public void setAllColumnsInOnePagePerSheet(boolean value)
  {
    this.z = value;
  }
  
  public DrawObjectEventHandler getDrawObjectEventHandler()
  {
    return this.A;
  }
  
  public void setDrawObjectEventHandler(DrawObjectEventHandler value)
  {
    this.A = value;
  }
  
  public ImageFormat getChartImageType()
  {
    return this.B;
  }
  
  public void setChartImageType(ImageFormat value)
  {
    this.B = value;
  }
  
  public String getEmbededImageNameInSvg()
  {
    return this.C;
  }
  
  public void setEmbededImageNameInSvg(String value)
  {
    this.C = value;
  }
  
  public boolean getSVGFitToViewPort()
  {
    return this.D;
  }
  
  public void setSVGFitToViewPort(boolean value)
  {
    this.D = value;
  }
  
  public boolean getOnlyArea()
  {
    return this.E;
  }
  
  public void setOnlyArea(boolean value)
  {
    this.E = value;
  }
  
  public void setRenderingHint(RenderingHints.Key key, Object value)
  {
    this.h.put(key, value);
  }
  
  public int getTiffPhotometricInterpretation()
  {
    return this.F;
  }
  
  public void setTiffPhotometricInterpretation(int value)
  {
    this.F = value;
  }
  
  public boolean getTransparent()
  {
    return this.G;
  }
  
  public void setTransparent(boolean value)
  {
    this.G = value;
  }
  
  int b()
  {
    return this.H;
  }
  
  void a(int paramInt)
  {
    this.H = paramInt;
  }
  
  public IWarningCallback getWarningCallback()
  {
    return this.I;
  }
  
  public void setWarningCallback(IWarningCallback value)
  {
    this.I = value;
  }
  
  boolean c()
  {
    return this.J;
  }
  
  void b(boolean paramBoolean)
  {
    this.J = paramBoolean;
  }
  
  boolean d()
  {
    return this.K;
  }
  
  void c(boolean paramBoolean)
  {
    this.K = paramBoolean;
  }
  
  int e()
  {
    return this.L;
  }
  
  void b(int paramInt)
  {
    if (paramInt >= 0) {
      this.L = paramInt;
    }
  }
  
  int f()
  {
    return this.M;
  }
  
  void c(int paramInt)
  {
    if (paramInt > 0) {
      this.M = paramInt;
    }
  }
  
  public void setDesiredSize(int desiredWidth, int desiredHeight)
  {
    if ((desiredWidth > 0) && (desiredHeight > 0))
    {
      this.j = desiredWidth;
      this.k = desiredHeight;
    }
  }
  
  public String getDefaultFont()
  {
    return this.N;
  }
  
  public void setDefaultFont(String value)
  {
    this.N = value;
  }
  
  public boolean getCheckWorkbookDefaultFont()
  {
    return this.O;
  }
  
  public void setCheckWorkbookDefaultFont(boolean value)
  {
    this.O = value;
  }
  
  public boolean getOutputBlankPageWhenNothingToPrint()
  {
    return this.P;
  }
  
  public void setOutputBlankPageWhenNothingToPrint(boolean value)
  {
    this.P = value;
  }
  
  public int getGridlineType()
  {
    return this.Q;
  }
  
  public void setGridlineType(int value)
  {
    this.Q = value;
  }
  
  void a(ImageOrPrintOptions paramImageOrPrintOptions)
  {
    this.n = paramImageOrPrintOptions.n;
    this.o = paramImageOrPrintOptions.o;
    this.p = paramImageOrPrintOptions.p;
    this.q = paramImageOrPrintOptions.q;
    this.r = paramImageOrPrintOptions.r;
    this.s = paramImageOrPrintOptions.s;
    this.t = paramImageOrPrintOptions.t;
    this.u = paramImageOrPrintOptions.u;
    this.a = paramImageOrPrintOptions.a;
    this.b = paramImageOrPrintOptions.b;
    this.c = paramImageOrPrintOptions.c;
    this.d = paramImageOrPrintOptions.d;
    this.e = paramImageOrPrintOptions.e;
    this.v = paramImageOrPrintOptions.v;
    this.w = paramImageOrPrintOptions.w;
    this.g = paramImageOrPrintOptions.g;
    this.x = paramImageOrPrintOptions.x;
    this.y = paramImageOrPrintOptions.y;
    this.z = paramImageOrPrintOptions.z;
    this.A = paramImageOrPrintOptions.A;
    this.B = paramImageOrPrintOptions.B;
    this.C = paramImageOrPrintOptions.C;
    this.D = paramImageOrPrintOptions.D;
    this.E = paramImageOrPrintOptions.E;
    this.G = paramImageOrPrintOptions.G;
    this.H = paramImageOrPrintOptions.H;
    this.I = paramImageOrPrintOptions.I;
    this.J = paramImageOrPrintOptions.J;
    this.K = paramImageOrPrintOptions.K;
    this.L = paramImageOrPrintOptions.L;
    this.M = paramImageOrPrintOptions.M;
    this.j = paramImageOrPrintOptions.j;
    this.k = paramImageOrPrintOptions.k;
    this.m = paramImageOrPrintOptions.m;
    this.N = paramImageOrPrintOptions.N;
    this.O = paramImageOrPrintOptions.O;
    this.P = paramImageOrPrintOptions.P;
    this.Q = paramImageOrPrintOptions.Q;
    this.h.putAll(paramImageOrPrintOptions.h);
    this.F = paramImageOrPrintOptions.F;
    this.F = paramImageOrPrintOptions.F;
    this.f = paramImageOrPrintOptions.f;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ImageOrPrintOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */