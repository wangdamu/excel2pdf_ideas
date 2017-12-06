package com.aspose.cells.a.d.a;

import com.aspose.cells.a.d.a.a.zcx;
import com.aspose.cells.a.d.b.za;
import com.aspose.cells.a.d.b.zb;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.RenderingHints.Key;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.Toolkit;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.font.LineMetrics;
import java.awt.font.TextAttribute;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D.Double;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D.Double;
import java.awt.geom.Line2D.Double;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderContext;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;

public class zc
  extends Graphics2D
{
  private zj k = null;
  private Rectangle l;
  private Dimension m;
  private Color n;
  private Paint o;
  private Stroke p = null;
  private Color q;
  private Color r;
  private Color s;
  private Color t;
  private Font u;
  private Map v;
  private Map w;
  private zm x;
  private static final zm y = new zm();
  private static final String z = zc.class.getName();
  public static final String a = z + ".Transparent";
  public static final String b = z + ".Background";
  public static final String c = z + ".BackgroundColor";
  public static final String d = z + ".EMIT_WARNINGS";
  public static final String e = z + ".TEXT_AS_SHAPES";
  public static final String f = z + ".EMIT_ERRORS";
  public static final String g = z + ".CLIP";
  private RenderingHints A;
  protected Rectangle h;
  protected Area i;
  protected AffineTransform j;
  private static final Rectangle B = new Rectangle(0, 0, -1, -1);
  private boolean C;
  private int D = 0;
  private int E = 0;
  private int F = 0;
  private int G = 3;
  private int H = 0;
  
  public zc(zj paramzj, Rectangle paramRectangle)
  {
    this(paramzj, paramRectangle, Color.BLACK);
  }
  
  public zc(zj paramzj, Rectangle paramRectangle, Color paramColor)
  {
    this.k = paramzj;
    this.l = paramRectangle;
    a(y);
    this.v = new HashMap();
    this.w = new HashMap();
    this.m = new Dimension(paramRectangle.width, paramRectangle.height);
    this.h = (this.m != null ? new Rectangle(0, 0, this.m.width, this.m.height) : null);
    this.i = null;
    this.j = new AffineTransform();
    setColor(paramColor);
    setFont(new Font("Dialog", 0, 12));
    this.C = false;
    this.A = new RenderingHints(null);
    this.p = new BasicStroke(1.0F, 2, 0, 10.0F, null, 0.0F);
    setFont(new Font("Dialog", 0, 12));
    a();
    b();
  }
  
  public zc(zc paramzc, boolean paramBoolean)
  {
    this.k = paramzc.k;
    this.l = paramzc.l;
    this.m = paramzc.m;
    this.n = za.a(paramzc.n);
    this.o = za.a(paramzc.o);
    this.p = za.a(paramzc.p);
    this.q = za.a(paramzc.q);
    this.r = za.a(paramzc.r);
    this.s = za.a(paramzc.s);
    this.t = za.a(paramzc.t);
    this.u = za.a(paramzc.u);
    this.x = paramzc.x;
    this.v = paramzc.v;
    this.w = paramzc.w;
    this.h = new Rectangle(paramzc.h);
    this.i = (paramzc.i != null ? new Area(paramzc.i) : null);
    this.j = new AffineTransform(paramzc.j);
    this.A = paramzc.A;
    this.C = paramBoolean;
  }
  
  public Graphics create()
  {
    d();
    return new zc(this, true);
  }
  
  public void dispose()
  {
    if (this.C)
    {
      e();
      this.C = false;
    }
  }
  
  public void draw(Shape shape)
  {
    if ((getStroke() instanceof BasicStroke))
    {
      Color localColor = getColor();
      if (localColor.getAlpha() == 0) {
        return;
      }
      a((BasicStroke)getStroke(), getColor());
      if (this.F != 0) {
        this.k.h(this.F);
      }
      this.F = this.k.a(shape);
      this.k.a(this.l, this.D - 1, this.F - 1);
    }
    else
    {
      c();
      if (this.F != 0) {
        this.k.h(this.F);
      }
      this.F = this.k.a(getStroke().createStrokedShape(shape));
      this.k.b(this.l, this.E - 1, this.F - 1);
    }
  }
  
  public void clip(Shape shape)
  {
    Area localArea = new Area(shape);
    if (this.i != null)
    {
      this.i = new Area(b(this.i));
      this.i.intersect(localArea);
    }
    else
    {
      this.i = localArea;
    }
    setClip(this.i);
  }
  
  public void drawGlyphVector(GlyphVector glyphvector, float x, float y)
  {
    fill(glyphvector.getOutline(x, y));
  }
  
  public void drawImage(BufferedImage img, BufferedImageOp op, int x, int y)
  {
    drawImage(op.filter(img, null), x, y, null);
  }
  
  public boolean drawImage(Image image, AffineTransform xform, ImageObserver observer)
  {
    drawRenderedImage(zb.a(image, observer, null), xform);
    return true;
  }
  
  public void drawRenderedImage(RenderedImage img, AffineTransform xform)
  {
    a(img, xform, null);
  }
  
  private void a(RenderedImage paramRenderedImage, AffineTransform paramAffineTransform, Color paramColor)
  {
    d();
    a(paramAffineTransform);
    this.k.a(paramRenderedImage, paramColor);
    e();
  }
  
  public void drawRenderableImage(RenderableImage image, AffineTransform xform)
  {
    drawRenderedImage(image.createRendering(new RenderContext(new AffineTransform(), getRenderingHints())), xform);
  }
  
  public void drawString(AttributedCharacterIterator iterator, float x, float y)
  {
    Font localFont1 = getFont();
    Color localColor1 = getColor();
    StringBuffer localStringBuffer = new StringBuffer();
    Object localObject1 = getFont();
    Object localObject2 = getColor();
    Hashtable localHashtable = new Hashtable();
    Object localObject3 = null;
    int i2;
    for (int i1 = iterator.first(); i1 != 65535; i2 = iterator.next())
    {
      localHashtable.clear();
      localObject3 = iterator.getAttribute(TextAttribute.UNDERLINE);
      Font localFont2 = (Font)iterator.getAttribute(TextAttribute.FONT);
      Color localColor2 = (Color)iterator.getAttribute(TextAttribute.FOREGROUND);
      if ((localFont2 == null) || ((((Font)localObject1).getAttributes().equals(localFont2.getAttributes())) && (((localColor2 != null) && (localObject2 != null) && (((Color)localObject2).equals(localColor2))) || ((localColor2 == null) && (localObject2 == null)))))
      {
        localStringBuffer.append(i1);
      }
      else
      {
        if (localStringBuffer.length() > 0)
        {
          FontMetrics localFontMetrics2 = getFontMetrics((Font)localObject1);
          localHashtable.clear();
          if (localObject3 != null) {
            localHashtable.put(TextAttribute.UNDERLINE, localObject3);
          }
          a(localStringBuffer.toString(), x, y, localHashtable);
          for (int i5 = 0; i5 < localStringBuffer.length(); i5++)
          {
            char c2 = localStringBuffer.charAt(i5);
            int i6 = localFontMetrics2.charWidth(c2);
            x += i6;
          }
        }
        localStringBuffer = new StringBuffer();
        localStringBuffer.append(i1);
        setFont(localFont2);
        setColor(localColor2);
        localObject1 = localFont2;
        localObject2 = localColor2;
      }
    }
    if (localStringBuffer.length() > 0)
    {
      FontMetrics localFontMetrics1 = getFontMetrics((Font)localObject1);
      localHashtable.clear();
      if (localObject3 != null) {
        localHashtable.put(TextAttribute.UNDERLINE, localObject3);
      }
      a(localStringBuffer.toString(), x, y, localHashtable);
      for (int i3 = 0; i3 < localStringBuffer.length(); i3++)
      {
        char c1 = localStringBuffer.charAt(i3);
        int i4 = localFontMetrics1.charWidth(c1);
        x += i4;
      }
    }
    setFont(localFont1);
    setColor(localColor1);
  }
  
  public void drawString(AttributedCharacterIterator iterator, int x, int y)
  {
    drawString(iterator, x, y);
  }
  
  public void drawString(String str, int x, int y)
  {
    drawString(str, x, y);
  }
  
  public void drawString(String str, float x, float y)
  {
    a(str, x, y, null);
  }
  
  private void a(String paramString, float paramFloat1, float paramFloat2, Map<TextAttribute, ?> paramMap)
  {
    if ((paramString == null) || (paramString.equals(""))) {
      return;
    }
    if (b(e))
    {
      Font localFont = getFont();
      String str = localFont.getName();
      if ((str.equals("Symbol")) || (str.equals("ZapfDingbats"))) {
        localFont = new Font("Serif", localFont.getStyle(), localFont.getSize());
      }
      GlyphVector localGlyphVector = localFont.createGlyphVector(getFontRenderContext(), paramString);
      drawGlyphVector(localGlyphVector, paramFloat1, paramFloat2);
    }
    else
    {
      a(paramString, paramFloat1, paramFloat2, paramMap);
    }
  }
  
  public void fill(Shape shape)
  {
    if (getPaint() == null) {
      return;
    }
    if ((getPaint() instanceof GradientPaint))
    {
      Rectangle2D localRectangle2D = shape.getBounds2D();
      GradientPaint localGradientPaint = (GradientPaint)getPaint();
      Point2D localPoint2D1 = localGradientPaint.getPoint1();
      Point2D localPoint2D2 = localGradientPaint.getPoint2();
      Color localColor1 = localGradientPaint.getColor1();
      Color localColor2 = localGradientPaint.getColor2();
      double d1 = localRectangle2D.getX();
      double d2 = localRectangle2D.getY();
      double d3 = localRectangle2D.getWidth();
      double d4 = localRectangle2D.getHeight();
      zc localzc1 = null;
      zc localzc2 = null;
      try
      {
        localzc1 = (zc)create();
        localzc1.clip(shape);
        localzc2 = (zc)localzc1.create();
        za.a(localzc2, d1, d2, d3, d4, localPoint2D1, localPoint2D2, localColor1, localColor2);
      }
      catch (Exception localException)
      {
        com.aspose.cells.a.c.zl.b(localException);
      }
      finally
      {
        if (localzc2 != null) {
          localzc2.dispose();
        }
        if (localzc1 != null) {
          localzc1.dispose();
        }
      }
    }
    else
    {
      c();
      if (this.F != 0) {
        this.k.h(this.F);
      }
      this.F = this.k.a(shape);
      this.k.b(this.l, this.E - 1, this.F - 1);
    }
  }
  
  public Color getBackground()
  {
    return this.q;
  }
  
  public Composite getComposite()
  {
    throw new RuntimeException("The method is not supported");
  }
  
  public GraphicsConfiguration getDeviceConfiguration()
  {
    throw new RuntimeException("The method is not supported");
  }
  
  public FontRenderContext getFontRenderContext()
  {
    return new FontRenderContext(new AffineTransform(1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F), true, true);
  }
  
  public Paint getPaint()
  {
    return this.o;
  }
  
  public Object getRenderingHint(RenderingHints.Key hintKey)
  {
    return this.A.get(hintKey);
  }
  
  public RenderingHints getRenderingHints()
  {
    return (RenderingHints)this.A.clone();
  }
  
  public Stroke getStroke()
  {
    return this.p;
  }
  
  public AffineTransform getTransform()
  {
    return new AffineTransform(this.j);
  }
  
  public boolean hit(Rectangle rect, Shape s, boolean onStroke)
  {
    throw new RuntimeException("The method is not supported");
  }
  
  public void rotate(double theta)
  {
    this.j.rotate(theta);
    a(new AffineTransform(Math.cos(theta), Math.sin(theta), -Math.sin(theta), Math.cos(theta), 0.0D, 0.0D));
  }
  
  public void rotate(double theta, double x, double y)
  {
    this.j.rotate(theta, x, y);
    a(new AffineTransform(Math.cos(theta), Math.sin(theta), -Math.sin(theta), Math.cos(theta), x, y));
  }
  
  public void scale(double sx, double sy)
  {
    this.j.scale(sx, sy);
    a(new AffineTransform(sx, 0.0D, 0.0D, sy, 0.0D, 0.0D));
  }
  
  public void setBackground(Color color)
  {
    this.q = color;
  }
  
  public void setComposite(Composite comp)
  {
    throw new RuntimeException("The method is not supported");
  }
  
  public void setPaint(Paint paint)
  {
    if (paint == null)
    {
      this.o = null;
    }
    else
    {
      if (paint.equals(this.o)) {
        return;
      }
      if ((paint instanceof Color)) {
        setColor((Color)paint);
      }
      this.o = paint;
    }
  }
  
  public void setRenderingHint(RenderingHints.Key hintKey, Object hintValue)
  {
    if ((hintKey == null) || (hintValue == null)) {
      return;
    }
    this.A.put(hintKey, hintValue);
    if (hintKey == RenderingHints.KEY_ANTIALIASING)
    {
      if (hintValue == RenderingHints.VALUE_ANTIALIAS_OFF)
      {
        if (this.A.get(RenderingHints.KEY_RENDERING) == RenderingHints.VALUE_RENDER_SPEED)
        {
          if (this.G != 1)
          {
            this.G = 1;
            this.k.i(this.G);
          }
        }
        else if (this.G != 3)
        {
          this.G = 3;
          this.k.i(this.G);
        }
      }
      else if (hintValue == RenderingHints.VALUE_ANTIALIAS_ON)
      {
        if (this.A.get(RenderingHints.KEY_RENDERING) == RenderingHints.VALUE_RENDER_QUALITY)
        {
          if (this.G != 2)
          {
            this.G = 2;
            this.k.i(this.G);
          }
        }
        else if (this.G != 4)
        {
          this.G = 4;
          this.k.i(this.G);
        }
      }
      else
      {
        Object localObject = this.A.get(RenderingHints.KEY_RENDERING);
        if (localObject == RenderingHints.VALUE_RENDER_QUALITY)
        {
          if (this.G != 2)
          {
            this.G = 2;
            this.k.i(this.G);
          }
        }
        else if (localObject == RenderingHints.VALUE_RENDER_SPEED)
        {
          if (this.G != 1)
          {
            this.G = 1;
            this.k.i(this.G);
          }
        }
        else if (this.G != 0)
        {
          this.G = 0;
          this.k.i(this.G);
        }
      }
    }
    else if (hintKey == RenderingHints.KEY_RENDERING)
    {
      if (hintValue == RenderingHints.VALUE_RENDER_QUALITY)
      {
        if (this.G != 2)
        {
          this.G = 2;
          this.k.i(this.G);
        }
      }
      else if (hintValue == RenderingHints.VALUE_RENDER_SPEED)
      {
        if (this.G != 1)
        {
          this.G = 1;
          this.k.i(this.G);
        }
      }
      else
      {
        hintValue = this.A.get(RenderingHints.KEY_ANTIALIASING);
        if (hintValue == RenderingHints.VALUE_ANTIALIAS_ON)
        {
          if (this.G != 4)
          {
            this.G = 4;
            this.k.i(this.G);
          }
        }
        else if (hintValue == RenderingHints.VALUE_ANTIALIAS_OFF)
        {
          if (this.G != 3)
          {
            this.G = 3;
            this.k.i(this.G);
          }
        }
        else if (this.G != 0)
        {
          this.G = 0;
          this.k.i(this.G);
        }
      }
    }
    else if (hintKey == RenderingHints.KEY_TEXT_ANTIALIASING)
    {
      int i1 = 0;
      if (hintValue == RenderingHints.VALUE_TEXT_ANTIALIAS_ON) {
        i1 = 4;
      } else if (hintValue == RenderingHints.VALUE_TEXT_ANTIALIAS_ON) {
        i1 = 2;
      }
      if (this.H != i1)
      {
        this.H = i1;
        this.k.j(i1);
      }
    }
  }
  
  private void a(Map paramMap)
  {
    Object localObject = paramMap.get(RenderingHints.KEY_ANTIALIASING);
    if ((localObject == RenderingHints.VALUE_ANTIALIAS_ON) && (this.G != 4))
    {
      this.G = 4;
      this.k.i(this.G);
    }
    localObject = paramMap.get(RenderingHints.KEY_RENDERING);
    if (localObject != null) {
      if (localObject == RenderingHints.VALUE_RENDER_QUALITY)
      {
        if (this.G != 2)
        {
          this.G = 2;
          this.k.i(this.G);
        }
      }
      else if (localObject == RenderingHints.VALUE_RENDER_SPEED)
      {
        localObject = paramMap.get(RenderingHints.KEY_ANTIALIASING);
        if (localObject == RenderingHints.VALUE_ANTIALIAS_ON)
        {
          if (this.G != 4)
          {
            this.G = 4;
            this.k.i(this.G);
          }
        }
        else if (this.G != 1)
        {
          this.G = 1;
          this.k.i(this.G);
        }
      }
      else
      {
        localObject = paramMap.get(RenderingHints.KEY_ANTIALIASING);
        if (localObject != null) {
          if (localObject == RenderingHints.VALUE_ANTIALIAS_ON)
          {
            if (this.G != 4)
            {
              this.G = 4;
              this.k.i(this.G);
            }
          }
          else if (this.G != 0)
          {
            this.G = 0;
            this.k.i(this.G);
          }
        }
      }
    }
    localObject = paramMap.get(RenderingHints.KEY_TEXT_ANTIALIASING);
    if (localObject != null)
    {
      int i1 = 0;
      if (localObject == RenderingHints.VALUE_TEXT_ANTIALIAS_ON) {
        i1 = 4;
      } else if (localObject == RenderingHints.VALUE_TEXT_ANTIALIAS_ON) {
        i1 = 2;
      }
      if (this.H != i1)
      {
        this.H = i1;
        this.k.j(i1);
      }
    }
  }
  
  public void addRenderingHints(Map hintsNew)
  {
    this.A.putAll(hintsNew);
    a(hintsNew);
  }
  
  public void setRenderingHints(Map hintsNew)
  {
    this.A.clear();
    this.A.putAll(hintsNew);
    a(hintsNew);
  }
  
  public void setStroke(Stroke stroke)
  {
    if (stroke == null) {
      return;
    }
    if (stroke.equals(getStroke())) {
      return;
    }
    if ((stroke instanceof BasicStroke)) {
      a((BasicStroke)stroke, getColor());
    }
    this.p = stroke;
  }
  
  public void setTransform(AffineTransform tx)
  {
    this.j.setTransform(tx);
    b(tx);
  }
  
  public void shear(double shx, double shy)
  {
    this.j.shear(shx, shy);
    a(new AffineTransform(1.0D, shy, shx, 1.0D, 0.0D, 0.0D));
  }
  
  public void transform(AffineTransform tx)
  {
    if (tx != null)
    {
      this.j.concatenate(tx);
      a(tx);
    }
  }
  
  public void translate(int x, int y)
  {
    this.j.translate(x, y);
    a(new AffineTransform(1.0F, 0.0F, 0.0F, 1.0F, x, y));
  }
  
  public void translate(double tx, double ty)
  {
    this.j.translate(tx, ty);
    a(new AffineTransform(1.0D, 0.0D, 0.0D, 1.0D, tx, ty));
  }
  
  public void clearRect(int x, int y, int width, int height)
  {
    Paint localPaint = getPaint();
    setPaint(getBackground());
    fillRect(x, y, width, height);
    setPaint(localPaint);
  }
  
  public void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    clearRect((int)paramDouble1, (int)paramDouble2, (int)paramDouble3, (int)paramDouble4);
  }
  
  public void clipRect(int x, int y, int width, int height)
  {
    throw new RuntimeException("The method is not supported");
  }
  
  public void copyArea(int x, int y, int width, int height, int dx, int dy)
  {
    throw new RuntimeException("The method is not supported");
  }
  
  public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle)
  {
    throw new RuntimeException("The method is not supported");
  }
  
  public boolean drawImage(Image image, int x, int y, ImageObserver observer)
  {
    int i1 = image.getWidth(observer);
    int i2 = image.getHeight(observer);
    return drawImage(image, x, y, x + i1, y + i2, 0, 0, i1, i2, null, observer);
  }
  
  public boolean drawImage(Image image, int x, int y, int width, int height, ImageObserver observer)
  {
    int i1 = image.getWidth(observer);
    int i2 = image.getHeight(observer);
    return drawImage(image, x, y, x + width, y + height, 0, 0, i1, i2, null, observer);
  }
  
  public boolean drawImage(Image image, int x, int y, Color bgColor, ImageObserver observer)
  {
    int i1 = image.getWidth(observer);
    int i2 = image.getHeight(observer);
    return drawImage(image, x, y, x + i1, y + i2, 0, 0, i1, i2, bgColor, observer);
  }
  
  public boolean drawImage(Image image, int x, int y, int width, int height, Color bgColor, ImageObserver observer)
  {
    int i1 = image.getWidth(observer);
    int i2 = image.getHeight(observer);
    return drawImage(image, x, y, x + width, y + height, 0, 0, i1, i2, bgColor, observer);
  }
  
  public boolean drawImage(Image image, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, ImageObserver observer)
  {
    return drawImage(image, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, null, observer);
  }
  
  public boolean drawImage(Image image, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, Color bgcolor, ImageObserver observer)
  {
    int i1 = Math.min(sx1, sx2);
    int i2 = Math.min(sy1, sy2);
    int i3 = Math.abs(sx2 - sx1);
    int i4 = Math.abs(sy2 - sy1);
    int i5 = Math.abs(dx2 - dx1);
    int i6 = Math.abs(dy2 - dy1);
    if ((i1 != 0) || (i2 != 0) || (i3 != image.getWidth(observer)) || (i4 != image.getHeight(observer)))
    {
      CropImageFilter localCropImageFilter = new CropImageFilter(i1, i2, i3, i4);
      image = Toolkit.getDefaultToolkit().createImage(new FilteredImageSource(image.getSource(), localCropImageFilter));
    }
    int i7 = (dx2 < dx1 ? 1 : 0) ^ (sx2 < sx1 ? 1 : 0);
    int i8 = (dy2 < dy1 ? 1 : 0) ^ (sy2 < sy1 ? 1 : 0);
    double d1 = i7 != 0 ? dx2 : dx1;
    double d2 = i8 != 0 ? dy2 : dy1;
    double d3 = i5 / i3;
    d3 = i7 != 0 ? -1.0D * d3 : d3;
    double d4 = i6 / i4;
    d4 = i8 != 0 ? -1.0D * d4 : d4;
    a(zb.a(image, observer, bgcolor), new AffineTransform(d3, 0.0D, 0.0D, d4, d1, d2), bgcolor);
    return true;
  }
  
  public void drawLine(int x1, int y1, int x2, int y2)
  {
    Line2D.Double localDouble = new Line2D.Double(x1, y1, x2, y2);
    draw(localDouble);
  }
  
  public void b(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    Line2D.Double localDouble = new Line2D.Double(paramDouble1, paramDouble2, paramDouble3, paramDouble4);
    draw(localDouble);
  }
  
  public void drawOval(int x, int y, int width, int height)
  {
    throw new RuntimeException("The method is not supported");
  }
  
  public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints)
  {
    throw new RuntimeException("The method is not supported");
  }
  
  public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints)
  {
    throw new RuntimeException("The method is not supported");
  }
  
  public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight)
  {
    throw new RuntimeException("The method is not supported");
  }
  
  public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle)
  {
    fill(new Arc2D.Double(x, y, width, height, startAngle, arcAngle, 2));
  }
  
  public void fillOval(int x, int y, int width, int height)
  {
    fill(new Ellipse2D.Double(x, y, width, height));
  }
  
  public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints)
  {
    throw new RuntimeException("The method is not supported");
  }
  
  public void fillRect(int x, int y, int width, int height)
  {
    fill(new Rectangle2D.Double(x, y, width, height));
  }
  
  public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight)
  {
    throw new RuntimeException("The method is not supported");
  }
  
  public Shape getClip()
  {
    return this.i != null ? new Area(b(this.i)) : null;
  }
  
  public Rectangle getClipBounds()
  {
    throw new RuntimeException("The method is not supported");
  }
  
  public Color getColor()
  {
    return this.n;
  }
  
  public Font getFont()
  {
    return this.u;
  }
  
  public FontMetrics getFontMetrics(Font f)
  {
    return Toolkit.getDefaultToolkit().getFontMetrics(f);
  }
  
  public void setClip(int x, int y, int width, int height)
  {
    throw new RuntimeException("The method is not supported");
  }
  
  public void setClip(Shape clip)
  {
    Shape localShape = a(clip);
    this.i = (localShape != null ? new Area(localShape) : null);
    c(clip);
  }
  
  public void setColor(Color color)
  {
    if (color == null) {
      return;
    }
    if (color.equals(this.n)) {
      return;
    }
    this.n = color;
    this.k.a(color);
  }
  
  public void setFont(Font font)
  {
    if (font == null) {
      return;
    }
    this.u = font;
  }
  
  public void setPaintMode()
  {
    throw new RuntimeException("The method is not supported");
  }
  
  public void setXORMode(Color c1)
  {
    throw new RuntimeException("The method is not supported");
  }
  
  private void a(BasicStroke paramBasicStroke, Color paramColor)
  {
    if ((paramColor.equals(this.r)) && (paramBasicStroke.equals(getStroke()))) {
      return;
    }
    if (this.D != 0) {
      this.k.h(this.D);
    }
    this.D = this.k.a(paramBasicStroke, paramColor, getStroke(), this.j);
    this.r = paramColor;
  }
  
  private void c()
  {
    Paint localPaint = getPaint();
    if ((localPaint instanceof Color))
    {
      Color localColor = (Color)localPaint;
      if (localColor.equals(this.s)) {
        return;
      }
      if (this.E != 0) {
        this.k.h(this.E);
      }
      this.E = this.k.a(localPaint);
      this.s = localColor;
    }
    else
    {
      if (this.E != 0) {
        this.k.h(this.E);
      }
      this.E = this.k.a(localPaint);
    }
  }
  
  private void a(String paramString, double paramDouble1, double paramDouble2, Map<TextAttribute, ?> paramMap)
  {
    Paint localPaint = getPaint();
    Object localObject1;
    if ((localPaint instanceof Color))
    {
      localObject1 = (Color)localPaint;
    }
    else if ((localPaint instanceof GradientPaint))
    {
      localObject2 = (GradientPaint)localPaint;
      localObject1 = zl.a(((GradientPaint)localObject2).getColor1(), ((GradientPaint)localObject2).getColor2());
    }
    else
    {
      localObject2 = getBackground();
      if (localObject2 == null) {
        localObject1 = Color.BLACK;
      } else {
        localObject1 = localObject2;
      }
    }
    if (!((Color)localObject1).equals(this.t))
    {
      this.t = ((Color)localObject1);
      this.k.a(this.t);
    }
    Object localObject2 = getFont();
    Font localFont = (Font)this.w.get(localObject2);
    Integer localInteger = (Integer)this.v.get(localObject2);
    if (localInteger == null)
    {
      localFont = ((Font)localObject2).deriveFont(((Font)localObject2).getSize2D() * 1.0F * 20.0F);
      this.w.put(localObject2, localFont);
      int i1 = this.k.a(localFont, paramMap);
      localInteger = new Integer(i1);
      this.v.put(localObject2, localInteger);
    }
    this.k.g(localInteger.intValue());
    int[] arrayOfInt = new int[paramString.length()];
    FontRenderContext localFontRenderContext = new FontRenderContext(getTransform(), true, true);
    for (int i2 = 0; i2 < arrayOfInt.length; i2++)
    {
      localObject3 = localFont.getStringBounds(paramString, i2, i2 + 1, localFontRenderContext);
      double d1 = ((Rectangle2D)localObject3).getWidth();
      arrayOfInt[i2] = ((int)Math.round(d1));
    }
    translate(paramDouble1, paramDouble2);
    AffineTransform localAffineTransform = ((Font)localObject2).getTransform();
    if (!localAffineTransform.isIdentity())
    {
      d();
      a(localAffineTransform);
    }
    Object localObject3 = new zcx(new Point(0, 0), paramString, 0, B, arrayOfInt);
    LineMetrics localLineMetrics = localFont.getLineMetrics(paramString, localFontRenderContext);
    this.k.a(new Rectangle(0, (int)-localLineMetrics.getAscent(), Integer.MAX_VALUE, Integer.MAX_VALUE), 2, 1.0F, 1.0F, (zcx)localObject3, this.t, localInteger.intValue());
    if (!localAffineTransform.isIdentity()) {
      e();
    }
    translate(-paramDouble1, -paramDouble2);
  }
  
  private void d()
  {
    this.k.b();
  }
  
  private void e()
  {
    if (this.D != 0)
    {
      this.k.h(this.D);
      this.D = 0;
    }
    if (this.E != 0)
    {
      this.k.h(this.E);
      this.E = 0;
    }
    if (this.F != 0)
    {
      this.k.h(this.F);
      this.F = 0;
    }
    this.k.c();
  }
  
  public void a(AffineTransform paramAffineTransform)
  {
    AffineTransform localAffineTransform = new AffineTransform(paramAffineTransform.getScaleX(), paramAffineTransform.getShearY(), paramAffineTransform.getShearX(), paramAffineTransform.getScaleY(), paramAffineTransform.getTranslateX() * 1.0D * 20.0D, paramAffineTransform.getTranslateY() * 1.0D * 20.0D);
    this.k.a(localAffineTransform, 2);
  }
  
  public void b(AffineTransform paramAffineTransform)
  {
    AffineTransform localAffineTransform = AffineTransform.getScaleInstance(0.05D, 0.05D);
    this.k.a(localAffineTransform);
    a(paramAffineTransform);
  }
  
  public void a()
  {
    AffineTransform localAffineTransform = AffineTransform.getScaleInstance(0.05D, 0.05D);
    this.k.a(localAffineTransform);
    setClip(getClip());
  }
  
  public void b()
  {
    if (b(a))
    {
      setBackground(null);
      this.k.f(1);
    }
    else if (b(b))
    {
      this.k.f(2);
      setBackground(a(c));
      a(0.0D, 0.0D, this.m.getWidth(), this.m.getHeight());
    }
    else
    {
      this.k.f(2);
      a(0.0D, 0.0D, this.m.getWidth(), this.m.getHeight());
    }
  }
  
  private Shape a(AffineTransform paramAffineTransform, Shape paramShape)
  {
    if (paramShape == null) {
      return null;
    }
    return paramAffineTransform.createTransformedShape(paramShape);
  }
  
  private Shape a(Shape paramShape)
  {
    return a(getTransform(), paramShape);
  }
  
  private Shape b(Shape paramShape)
  {
    if (paramShape == null) {
      return null;
    }
    try
    {
      return a(getTransform().createInverse(), paramShape);
    }
    catch (Exception localException) {}
    return null;
  }
  
  private void c(Shape paramShape)
  {
    if ((paramShape == null) && (this.l != null))
    {
      paramShape = new Rectangle(this.l);
      AffineTransform localAffineTransform = getTransform();
      if (localAffineTransform != null) {
        paramShape = localAffineTransform.createTransformedShape(paramShape);
      }
    }
    this.F = this.k.b(paramShape);
  }
  
  protected void a(Properties paramProperties)
  {
    this.x = new zm();
    this.x.a(paramProperties);
  }
  
  public Color a(String paramString)
  {
    return this.x.a(paramString);
  }
  
  public boolean b(String paramString)
  {
    return this.x.b(paramString);
  }
  
  static
  {
    y.a(a, true);
    y.a(b, false);
    y.a(c, Color.GRAY);
    y.a(g, true);
    y.a(e, false);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/a/zc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */