package com.aspose.cells.a.d;

import com.aspose.cells.b.a.b.zj;
import com.aspose.cells.b.a.g.a.ze;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.LinearGradientPaint;
import java.awt.Paint;
import java.awt.Polygon;
import java.awt.RadialGradientPaint;
import java.awt.RenderingHints.Key;
import java.awt.Shape;
import java.awt.font.TextAttribute;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Arc2D.Double;
import java.awt.geom.Arc2D.Float;
import java.awt.geom.Area;
import java.awt.geom.CubicCurve2D.Float;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D.Double;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.awt.geom.Point2D.Float;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.text.AttributedString;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;
import javax.imageio.ImageIO;

public class zbh
  extends zf
{
  private Graphics2D g;
  private Stack h = new Stack();
  private GeneralPath i;
  private static float[] j = new float[0];
  private static float[] k = { 3.0F, 1.0F };
  private static float[] l = { 1.0F, 1.0F };
  private static float[] m = { 3.0F, 1.0F, 1.0F, 1.0F };
  private static float[] n = { 3.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F };
  private static String o = "[\\u0590-\\u05FF]+";
  private int p = Integer.MAX_VALUE;
  private int q = 0;
  
  public zbh(zhb paramzhb)
  {
    super(paramzhb);
  }
  
  public void a(int paramInt)
  {
    this.q = paramInt;
  }
  
  public void a(zn paramzn, Graphics2D paramGraphics2D)
    throws Exception
  {
    if (paramzn == null) {
      throw new Exception("ArgumentNull node");
    }
    if (paramGraphics2D == null) {
      throw new Exception("ArgumentNull graphics");
    }
    this.g = paramGraphics2D;
    paramzn.a(this);
  }
  
  public void a(zn paramzn, com.aspose.cells.b.a.b.zi paramzi)
    throws Exception
  {
    AffineTransform localAffineTransform = a(paramzi.b(), 0.0F, 0.0F);
    a(paramzn, paramzi.b(), localAffineTransform);
  }
  
  public void b(zn paramzn, Graphics2D paramGraphics2D)
    throws Exception
  {
    AffineTransform localAffineTransform = a(paramGraphics2D, 0.0F, 0.0F);
    a(paramzn, paramGraphics2D, localAffineTransform);
  }
  
  public com.aspose.cells.b.a.b.zt a(zo paramzo, Graphics2D paramGraphics2D, float paramFloat1, float paramFloat2, float paramFloat3)
    throws Exception
  {
    return a(paramzo, paramGraphics2D, paramFloat1, paramFloat2, paramFloat3, paramFloat3);
  }
  
  public com.aspose.cells.b.a.b.zt a(zo paramzo, Graphics2D paramGraphics2D, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
    throws Exception
  {
    if (paramzo == null) {
      throw new Exception("page ArgumentNull");
    }
    if (paramGraphics2D == null) {
      throw new Exception("graphics ArgumentNull");
    }
    if ((paramFloat3 <= 0.0F) || (paramFloat4 <= 0.0F)) {
      throw new Exception("ArgumentOutOfRange scale");
    }
    AffineTransform localAffineTransform = a(paramGraphics2D, paramFloat1, paramFloat2);
    localAffineTransform.scale(paramFloat3, paramFloat4);
    a(paramzo, paramGraphics2D, localAffineTransform);
    com.aspose.cells.b.a.b.zo localzo = b(new com.aspose.cells.b.a.b.zo(paramzo.c(), paramzo.d()), paramGraphics2D);
    return new com.aspose.cells.b.a.b.zt(localzo.d() * paramFloat3, localzo.e() * paramFloat4);
  }
  
  private static AffineTransform a(Graphics2D paramGraphics2D, float paramFloat1, float paramFloat2)
  {
    AffineTransform localAffineTransform1 = paramGraphics2D.getTransform();
    com.aspose.cells.b.a.b.zo localzo1 = a(new com.aspose.cells.b.a.b.zo(localAffineTransform1.getTranslateX(), localAffineTransform1.getTranslateY()), paramGraphics2D);
    double[] arrayOfDouble = new double[6];
    localAffineTransform1.getMatrix(arrayOfDouble);
    AffineTransform localAffineTransform2 = new AffineTransform(arrayOfDouble[0], arrayOfDouble[1], arrayOfDouble[2], arrayOfDouble[3], localzo1.d(), localzo1.e());
    com.aspose.cells.b.a.b.zo localzo2 = a(new com.aspose.cells.b.a.b.zo(paramFloat1, paramFloat2), paramGraphics2D);
    localAffineTransform2.translate(localzo2.d(), localzo2.e());
    return localAffineTransform2;
  }
  
  private void a(zn paramzn, Graphics2D paramGraphics2D, AffineTransform paramAffineTransform)
    throws Exception
  {
    AffineTransform localAffineTransform = paramGraphics2D.getTransform();
    paramGraphics2D.setTransform(paramAffineTransform);
    a(paramzn, paramGraphics2D);
  }
  
  private static com.aspose.cells.b.a.b.zo a(com.aspose.cells.b.a.b.zo paramzo, Graphics2D paramGraphics2D)
  {
    return new com.aspose.cells.b.a.b.zo(paramzo.d(), paramzo.e());
  }
  
  private static com.aspose.cells.b.a.b.zo b(com.aspose.cells.b.a.b.zo paramzo, Graphics2D paramGraphics2D)
  {
    return new com.aspose.cells.b.a.b.zo(paramzo.d(), paramzo.e());
  }
  
  public void a(zh paramzh)
  {
    if (this.p < this.q) {
      return;
    }
    a(paramzh);
    paramzh.a(a(paramzh.h()));
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    if (paramzh.d().g())
    {
      localHashMap1.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
      localHashMap2.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
    }
    if (paramzh.d().f()) {
      localHashMap1.put(TextAttribute.STRIKETHROUGH, TextAttribute.STRIKETHROUGH_ON);
    }
    if (paramzh.b) {
      localHashMap2.put(TextAttribute.SUPERSCRIPT, TextAttribute.SUPERSCRIPT_SUB);
    }
    if (paramzh.a) {
      localHashMap2.put(TextAttribute.SUPERSCRIPT, TextAttribute.SUPERSCRIPT_SUPER);
    }
    Font localFont = paramzh.d().k().a().deriveFont(localHashMap2);
    if (!paramzh.e().isEmpty())
    {
      float f1 = a(paramzh.g().d());
      float f2 = a(paramzh.g().e());
      this.g.translate(f1, f2);
      float f3 = paramzh.n();
      if (f3 != 0.0F) {
        this.g.scale(f3, 1.0D);
      }
      String str1 = paramzh.h();
      String str2 = localFont.getName();
      Object localObject1;
      if (zbd.a(str2))
      {
        localObject1 = str1.toCharArray();
        str1 = "";
        for (int i3 : localObject1) {
          str1 = str1 + (char)zbd.c(i3);
        }
      }
      if (localHashMap1.size() > 0)
      {
        localObject1 = new AttributedString(str1);
        ((AttributedString)localObject1).addAttribute(TextAttribute.FONT, localFont);
        ??? = localHashMap1.entrySet().iterator();
        while (((Iterator)???).hasNext())
        {
          Map.Entry localEntry = (Map.Entry)((Iterator)???).next();
          ((AttributedString)localObject1).addAttribute((TextAttribute)localEntry.getKey(), localEntry.getValue());
        }
        this.g.setPaint(paramzh.e().d());
        this.g.drawString(((AttributedString)localObject1).getIterator(), 0, 0);
      }
      else
      {
        this.g.setPaint(paramzh.e().d());
        this.g.setFont(localFont);
        this.g.drawString(str1, 0, 0);
      }
      if (f3 != 0.0F) {
        this.g.scale(1.0D / f3, 1.0D);
      }
      this.g.translate(-f1, -f2);
    }
    b(paramzh);
  }
  
  public void a(zo paramzo)
    throws Exception
  {
    this.p = paramzo.b();
  }
  
  public void b(zo paramzo)
    throws Exception
  {}
  
  public void a(zb paramzb)
  {
    if (this.p < this.q) {
      return;
    }
    a(paramzb);
    if (paramzb.b() != null)
    {
      AffineTransform localAffineTransform = this.g.getTransform();
      a(this.g, paramzb.b());
      this.g.setTransform(localAffineTransform);
    }
    if (zbn.e(paramzb)) {
      a(paramzb.f());
    }
  }
  
  public void b(zb paramzb)
  {
    if (this.p < this.q) {
      return;
    }
    b(paramzb);
  }
  
  public void a(zp paramzp)
  {
    if (this.p < this.q) {
      return;
    }
    a(paramzp);
    this.i = new GeneralPath(b(paramzp.f()));
  }
  
  public void b(zp paramzp)
  {
    if (this.p < this.q) {
      return;
    }
    com.aspose.cells.b.a.b.zc localzc = paramzp.e();
    zx localzx = paramzp.d();
    if (localzc != null) {
      if ((localzc instanceof com.aspose.cells.b.a.b.a.zh))
      {
        if ((this.g instanceof com.aspose.cells.a.d.a.zc)) {
          this.g.setClip(this.i);
        }
        a((com.aspose.cells.b.a.b.a.zh)localzc, this.g);
      }
      else
      {
        Object localObject;
        if ((localzc instanceof zr))
        {
          localObject = (zr)localzc;
          if (((zr)localObject).i() == 1)
          {
            this.g.setClip(this.i);
            a((zr)localObject, this.g);
          }
          else if (((zr)localObject).i() == 2)
          {
            if ((this.g instanceof com.aspose.cells.a.d.a.zc)) {
              this.g.setClip(this.i);
            }
            b((zr)localObject, this.g);
          }
          else
          {
            this.g.setClip(this.i);
            a((zr)localObject, this.g);
          }
        }
        else if ((localzc instanceof zv))
        {
          this.g.setClip(this.i);
          localObject = (zv)localzc;
          a((zv)localObject, this.g);
        }
        else if ((localzc instanceof com.aspose.cells.b.a.b.a.zg))
        {
          double d1 = this.g.getTransform().getScaleX();
          double d2 = this.g.getTransform().getScaleX();
          if ((d1 != 1.0D) || (d2 != 1.0D))
          {
            com.aspose.cells.b.a.b.a.zg localzg = (com.aspose.cells.b.a.b.a.zg)localzc;
            Graphics2D localGraphics2D = (Graphics2D)this.g.create();
            localGraphics2D.scale(1.0D / d1, 1.0D / d2);
            GeneralPath localGeneralPath = (GeneralPath)this.i.clone();
            AffineTransform localAffineTransform = new AffineTransform();
            localAffineTransform.scale(d1, d2);
            localGeneralPath.transform(localAffineTransform);
            localGraphics2D.setPaint(localzg.g());
            localGraphics2D.fill(localGeneralPath);
          }
          else
          {
            this.g.setPaint(localzc.g());
            this.g.fill(this.i);
          }
        }
        else
        {
          this.g.setPaint(localzc.g());
          this.g.fill(this.i);
        }
      }
    }
    if (localzx != null)
    {
      if (localzx.i == 0) {
        this.g.setColor(localzx.a.d());
      } else if (localzx.j != null) {
        this.g.setPaint(localzx.j.g());
      }
      this.g.setStroke(zx.a(paramzp.d()).r().p());
      this.g.draw(this.i);
    }
    b(paramzp);
    this.i = null;
  }
  
  private void a(com.aspose.cells.b.a.b.a.zh paramzh, Graphics2D paramGraphics2D)
  {
    com.aspose.cells.b.a.b.a.zc localzc = paramzh.m();
    if (localzc == null)
    {
      paramGraphics2D.setPaint(paramzh.g());
      paramGraphics2D.fill(this.i);
    }
    else
    {
      com.aspose.cells.b.a.b.zq localzq = paramzh.o();
      double d1 = paramzh.b().doubleValue();
      Point2D.Double localDouble = new Point2D.Double(localzq.f() + localzq.h() / 2.0F, localzq.g() + localzq.i() / 2.0F);
      double d2 = localzq.h() * Math.abs(Math.cos(d1 * 3.141592653589793D / 180.0D)) + localzq.i() * Math.abs(Math.sin(d1 * 3.141592653589793D / 180.0D));
      double d3 = localzq.i() * Math.abs(Math.cos(d1 * 3.141592653589793D / 180.0D)) + localzq.h() * Math.abs(Math.sin(d1 * 3.141592653589793D / 180.0D));
      Rectangle2D.Double localDouble1 = new Rectangle2D.Double(localDouble.getX() - d2 / 2.0D, localDouble.getY() - d3 / 2.0D, d2, d3);
      com.aspose.cells.b.a.b.a.zi localzi = new com.aspose.cells.b.a.b.a.zi();
      localzi.a((float)d1, new com.aspose.cells.b.a.b.zo(localDouble.getX(), localDouble.getY()));
      Object localObject1;
      Object localObject2;
      if ((paramGraphics2D instanceof com.aspose.cells.a.d.a.zc))
      {
        double d4 = localDouble1.getX();
        localObject1 = localzc.b();
        localObject2 = localzc.a();
        for (int i1 = 1; i1 < localzc.b().length; i1++)
        {
          double d5 = localDouble1.getWidth() * (localObject2[i1] - localObject2[(i1 - 1)]);
          double d6 = d5;
          if (i1 != localzc.b().length - 1) {
            d6 += 1.0D;
          }
          Rectangle2D.Double localDouble2 = new Rectangle2D.Double(d4, localDouble1.getY(), d6, d3);
          com.aspose.cells.b.a.b.zo[] arrayOfzo2 = { new com.aspose.cells.b.a.b.zo(localDouble2.getX(), localDouble2.getY()), new com.aspose.cells.b.a.b.zo(localDouble2.getX(), localDouble2.getY() + localDouble2.getHeight()), new com.aspose.cells.b.a.b.zo(localDouble2.getX() + localDouble2.getWidth(), localDouble2.getY() + localDouble2.getHeight()), new com.aspose.cells.b.a.b.zo(localDouble2.getX() + localDouble2.getWidth(), localDouble2.getY()), new com.aspose.cells.b.a.b.zo(localDouble2.getX(), localDouble.getY()), new com.aspose.cells.b.a.b.zo(localDouble2.getX() + localDouble2.getWidth(), localDouble.getY()) };
          localzi.a(arrayOfzo2);
          Polygon localPolygon = new Polygon();
          localPolygon.addPoint((int)arrayOfzo2[0].d(), (int)arrayOfzo2[0].e());
          localPolygon.addPoint((int)arrayOfzo2[1].d(), (int)arrayOfzo2[1].e());
          localPolygon.addPoint((int)arrayOfzo2[2].d(), (int)arrayOfzo2[2].e());
          localPolygon.addPoint((int)arrayOfzo2[3].d(), (int)arrayOfzo2[3].e());
          GradientPaint localGradientPaint = new GradientPaint(arrayOfzo2[4].d(), arrayOfzo2[4].e(), localObject1[(i1 - 1)].d(), arrayOfzo2[5].d(), arrayOfzo2[5].e(), localObject1[i1].d(), false);
          paramGraphics2D.setPaint(localGradientPaint);
          paramGraphics2D.fill(localPolygon);
          d4 += d5;
        }
      }
      else
      {
        com.aspose.cells.b.a.b.zo[] arrayOfzo1 = { new com.aspose.cells.b.a.b.zo(localDouble1.getX(), localDouble.getY()), new com.aspose.cells.b.a.b.zo(localDouble1.getX() + localDouble1.getWidth(), localDouble.getY()) };
        localzi.a(arrayOfzo1);
        Point2D.Float localFloat = new Point2D.Float(arrayOfzo1[0].d(), arrayOfzo1[0].e());
        localObject1 = new Point2D.Float(arrayOfzo1[1].d(), arrayOfzo1[1].e());
        localObject2 = localzc.a();
        Object localObject3 = new java.awt.Color[localzc.b().length];
        for (int i2 = 0; i2 < localzc.b().length; i2++) {
          localObject3[i2] = localzc.b()[i2].d();
        }
        ArrayList localArrayList = new ArrayList();
        for (int i3 = 0; i3 < localObject2.length - 1; i3++) {
          if (localObject2[i3] == localObject2[(i3 + 1)]) {
            localArrayList.add(Integer.valueOf(i3));
          }
        }
        if (localArrayList.size() > 0)
        {
          localObject4 = new float[localObject2.length - localArrayList.size()];
          java.awt.Color[] arrayOfColor = new java.awt.Color[localObject4.length];
          int i4 = 0;
          for (int i5 = 0; i5 < localObject2.length; i5++) {
            if (!localArrayList.contains(Integer.valueOf(i5)))
            {
              localObject4[i4] = localObject2[i5];
              arrayOfColor[i4] = localObject3[i5];
              i4++;
            }
          }
          localObject2 = localObject4;
          localObject3 = arrayOfColor;
        }
        Object localObject4 = new LinearGradientPaint(localFloat, (Point2D)localObject1, (float[])localObject2, (java.awt.Color[])localObject3);
        paramGraphics2D.setPaint((Paint)localObject4);
        paramGraphics2D.fill(this.i);
      }
    }
  }
  
  private void a(zr paramzr, Graphics2D paramGraphics2D)
  {
    com.aspose.cells.b.a.b.a.zc localzc = paramzr.b();
    if (localzc == null)
    {
      paramGraphics2D.setPaint(paramzr.g());
      paramGraphics2D.fill(this.i);
    }
    else
    {
      com.aspose.cells.b.a.b.zq localzq = paramzr.c();
      Rectangle2D.Double localDouble1 = new Rectangle2D.Double(localzq.f(), localzq.g(), localzq.h(), localzq.i());
      Rectangle2D.Double localDouble2 = new Rectangle2D.Double(localDouble1.getX(), localDouble1.getY(), localDouble1.getWidth() / 2.0D, localDouble1.getHeight());
      a(paramGraphics2D, localzc, localDouble2, true);
      Rectangle2D.Double localDouble3 = new Rectangle2D.Double(localDouble1.getCenterX(), localDouble1.getY(), localDouble1.getWidth() / 2.0D, localDouble1.getHeight());
      a(paramGraphics2D, localzc, localDouble3, false);
      Rectangle2D.Double localDouble4 = new Rectangle2D.Double(localDouble1.getX(), localDouble1.getY(), localDouble1.getWidth(), localDouble1.getHeight() / 2.0D);
      b(paramGraphics2D, localzc, localDouble4, true);
      Rectangle2D.Double localDouble5 = new Rectangle2D.Double(localDouble1.getX(), localDouble1.getCenterY(), localDouble1.getWidth(), localDouble1.getHeight() / 2.0D);
      b(paramGraphics2D, localzc, localDouble5, false);
    }
  }
  
  private void a(Graphics2D paramGraphics2D, com.aspose.cells.b.a.b.a.zc paramzc, Rectangle2D paramRectangle2D, boolean paramBoolean)
  {
    double d1 = paramRectangle2D.getX();
    Point2D.Double localDouble1 = null;
    Point2D.Double localDouble2 = null;
    Point2D.Double localDouble3 = null;
    Point2D.Double localDouble4 = null;
    int i1 = 0;
    if (paramBoolean)
    {
      localDouble1 = new Point2D.Double(paramRectangle2D.getX(), paramRectangle2D.getY());
      localDouble2 = new Point2D.Double(paramRectangle2D.getX(), paramRectangle2D.getY() + paramRectangle2D.getHeight());
    }
    else
    {
      i1 = 1;
      localDouble1 = new Point2D.Double(paramRectangle2D.getX(), paramRectangle2D.getCenterY());
      localDouble2 = new Point2D.Double(paramRectangle2D.getX(), paramRectangle2D.getCenterY());
    }
    int i2 = paramzc.b().length;
    com.aspose.cells.Color[] arrayOfColor = new com.aspose.cells.Color[i2];
    float[] arrayOfFloat = new float[i2];
    for (int i3 = 0; i3 < i2; i3++)
    {
      int i4 = i3;
      if (i1 != 0) {
        i4 = i2 - 1 - i3;
      }
      arrayOfColor[i3] = paramzc.b()[i4];
      float f1 = paramzc.a()[i4];
      arrayOfFloat[i3] = (i1 != 0 ? 1.0F - f1 : f1);
    }
    for (i3 = 1; i3 < arrayOfColor.length; i3++)
    {
      double d2 = paramRectangle2D.getWidth() * Math.abs(arrayOfFloat[i3] - arrayOfFloat[(i3 - 1)]);
      double d3 = paramRectangle2D.getHeight() * arrayOfFloat[i3];
      if (paramBoolean) {
        d3 = paramRectangle2D.getHeight() * (1.0F - arrayOfFloat[i3]);
      }
      localDouble3 = new Point2D.Double(d1 + d2, paramRectangle2D.getCenterY() + d3 / 2.0D);
      localDouble4 = new Point2D.Double(d1 + d2, paramRectangle2D.getCenterY() - d3 / 2.0D);
      double d4 = d2;
      if (i3 != paramzc.b().length - 1) {
        d4 += 1.0D;
      }
      Rectangle2D.Double localDouble = new Rectangle2D.Double(d1, paramRectangle2D.getY(), d4, paramRectangle2D.getHeight());
      GradientPaint localGradientPaint = new GradientPaint((float)localDouble.getX(), (float)paramRectangle2D.getCenterY(), arrayOfColor[(i3 - 1)].d(), (float)(localDouble.getX() + localDouble.getWidth()), (float)paramRectangle2D.getCenterY(), arrayOfColor[i3].d(), false);
      paramGraphics2D.setPaint(localGradientPaint);
      Polygon localPolygon = new Polygon();
      localPolygon.addPoint((int)localDouble1.getX(), (int)localDouble1.getY());
      localPolygon.addPoint((int)localDouble2.getX(), (int)localDouble2.getY());
      localPolygon.addPoint((int)localDouble3.getX(), (int)localDouble3.getY());
      localPolygon.addPoint((int)localDouble4.getX(), (int)localDouble4.getY());
      paramGraphics2D.fill(localPolygon);
      d1 += d2;
      localDouble1 = new Point2D.Double(localDouble4.getX(), localDouble4.getY());
      localDouble2 = new Point2D.Double(localDouble3.getX(), localDouble3.getY());
    }
  }
  
  private void b(Graphics2D paramGraphics2D, com.aspose.cells.b.a.b.a.zc paramzc, Rectangle2D paramRectangle2D, boolean paramBoolean)
  {
    double d1 = paramRectangle2D.getY();
    Point2D.Double localDouble1 = null;
    Point2D.Double localDouble2 = null;
    Point2D.Double localDouble3 = null;
    Point2D.Double localDouble4 = null;
    int i1 = 0;
    if (paramBoolean)
    {
      localDouble1 = new Point2D.Double(paramRectangle2D.getX() + paramRectangle2D.getWidth(), paramRectangle2D.getY());
      localDouble2 = new Point2D.Double(paramRectangle2D.getX(), paramRectangle2D.getY());
    }
    else
    {
      i1 = 1;
      localDouble1 = new Point2D.Double(paramRectangle2D.getCenterX(), paramRectangle2D.getY());
      localDouble2 = new Point2D.Double(paramRectangle2D.getCenterX(), paramRectangle2D.getY());
    }
    int i2 = paramzc.b().length;
    com.aspose.cells.Color[] arrayOfColor = new com.aspose.cells.Color[i2];
    float[] arrayOfFloat = new float[i2];
    for (int i3 = 0; i3 < i2; i3++)
    {
      int i4 = i3;
      if (i1 != 0) {
        i4 = i2 - 1 - i3;
      }
      arrayOfColor[i3] = paramzc.b()[i4];
      float f1 = paramzc.a()[i4];
      arrayOfFloat[i3] = (i1 != 0 ? 1.0F - f1 : f1);
    }
    for (i3 = 1; i3 < arrayOfColor.length; i3++)
    {
      double d2 = paramRectangle2D.getHeight() * Math.abs(arrayOfFloat[i3] - arrayOfFloat[(i3 - 1)]);
      double d3 = paramRectangle2D.getWidth() * arrayOfFloat[i3];
      if (paramBoolean) {
        d3 = paramRectangle2D.getWidth() * (1.0F - arrayOfFloat[i3]);
      }
      localDouble3 = new Point2D.Double(paramRectangle2D.getCenterX() - d3 / 2.0D, d1 + d2);
      localDouble4 = new Point2D.Double(paramRectangle2D.getCenterX() + d3 / 2.0D, d1 + d2);
      double d4 = d2;
      if (i3 != paramzc.b().length - 1) {
        d4 += 1.0D;
      }
      Rectangle2D.Double localDouble = new Rectangle2D.Double(paramRectangle2D.getX(), d1, paramRectangle2D.getWidth(), d4);
      GradientPaint localGradientPaint = new GradientPaint((float)paramRectangle2D.getCenterX(), (float)localDouble.getY(), arrayOfColor[(i3 - 1)].d(), (float)paramRectangle2D.getCenterX(), (float)(localDouble.getY() + localDouble.getHeight()), arrayOfColor[i3].d(), false);
      paramGraphics2D.setPaint(localGradientPaint);
      Polygon localPolygon = new Polygon();
      localPolygon.addPoint((int)localDouble1.getX(), (int)localDouble1.getY());
      localPolygon.addPoint((int)localDouble2.getX(), (int)localDouble2.getY());
      localPolygon.addPoint((int)localDouble3.getX(), (int)localDouble3.getY());
      localPolygon.addPoint((int)localDouble4.getX(), (int)localDouble4.getY());
      paramGraphics2D.fill(localPolygon);
      d1 += d2;
      localDouble1 = new Point2D.Double(localDouble4.getX(), localDouble4.getY());
      localDouble2 = new Point2D.Double(localDouble3.getX(), localDouble3.getY());
    }
  }
  
  private void b(zr paramzr, Graphics2D paramGraphics2D)
  {
    com.aspose.cells.b.a.b.a.zc localzc = paramzr.b();
    if (localzc == null)
    {
      paramGraphics2D.setPaint(paramzr.g());
      paramGraphics2D.fill(this.i);
    }
    else
    {
      com.aspose.cells.b.a.b.zq localzq = paramzr.c();
      Rectangle2D.Double localDouble = new Rectangle2D.Double(localzq.f(), localzq.g(), localzq.h(), localzq.i());
      int i1 = localzc.b().length;
      java.awt.Color[] arrayOfColor = new java.awt.Color[i1];
      float[] arrayOfFloat = new float[i1];
      int i2 = 1;
      for (int i3 = 0; i3 < i1; i3++)
      {
        int i5 = i3;
        if (i2 != 0) {
          i5 = i1 - 1 - i3;
        }
        arrayOfColor[i3] = localzc.b()[i5].d();
        float f1 = localzc.a()[i5];
        arrayOfFloat[i3] = (i2 != 0 ? 1.0F - f1 : f1);
      }
      if ((paramGraphics2D instanceof com.aspose.cells.a.d.a.zc))
      {
        Point2D.Double localDouble1 = new Point2D.Double(localDouble.getCenterX(), localDouble.getCenterY());
        com.aspose.cells.a.d.b.za.a(paramGraphics2D, this.i, localDouble1, (float)localDouble.getWidth() / 2.0F, arrayOfFloat, arrayOfColor);
      }
      else
      {
        for (int i4 = 0; i4 < arrayOfFloat.length - 1; i4++) {
          if (arrayOfFloat[i4] == arrayOfFloat[(i4 + 1)])
          {
            arrayOfFloat[i4] -= 0.01F;
            arrayOfFloat[(i4 + 1)] += 0.01F;
            if (arrayOfFloat[i4] < 0.0F) {
              arrayOfFloat[i4] = 0.0F;
            }
            if (arrayOfFloat[(i4 + 1)] > 1.0F) {
              arrayOfFloat[(i4 + 1)] = 1.0F;
            }
          }
        }
        RadialGradientPaint localRadialGradientPaint = new RadialGradientPaint((float)localDouble.getCenterX(), (float)localDouble.getCenterY(), (float)localDouble.getWidth() / 2.0F, arrayOfFloat, arrayOfColor);
        paramGraphics2D.setPaint(localRadialGradientPaint);
        paramGraphics2D.fill(this.i);
      }
    }
  }
  
  private void a(zv paramzv, Graphics2D paramGraphics2D)
  {
    Object localObject1;
    Object localObject2;
    int i2;
    int i4;
    int i5;
    int i6;
    int i7;
    if (paramzv.b() == 0)
    {
      localObject1 = paramzv.c();
      localObject2 = paramzv.a();
      int i1 = (int)Math.ceil(((com.aspose.cells.b.a.b.zq)localObject1).h() / ((zj)localObject2).i());
      i2 = (int)Math.ceil(((com.aspose.cells.b.a.b.zq)localObject1).i() / ((zj)localObject2).h());
      BufferedImage localBufferedImage = null;
      if ((localObject2 instanceof com.aspose.cells.b.a.b.za)) {
        localBufferedImage = ((zj)localObject2).f();
      } else if (!(localObject2 instanceof com.aspose.cells.b.a.b.b.zf)) {}
      i4 = (int)((com.aspose.cells.b.a.b.zq)localObject1).f();
      i5 = 0;
      for (i6 = 1; i6 <= i1; i6++)
      {
        i5 = (int)((com.aspose.cells.b.a.b.zq)localObject1).g();
        for (i7 = 1; i7 <= i2; i7++)
        {
          if ((localObject2 instanceof com.aspose.cells.b.a.b.za))
          {
            paramGraphics2D.drawImage(localBufferedImage, i4, i5, null);
          }
          else if ((localObject2 instanceof com.aspose.cells.b.a.b.b.zf))
          {
            com.aspose.cells.b.a.b.zo localzo = new com.aspose.cells.b.a.b.zo(b(i4), b(i5));
            com.aspose.cells.b.a.b.zt localzt2 = new com.aspose.cells.b.a.b.zt(b(((zj)localObject2).i()), b(((zj)localObject2).h()));
            zl localzl2 = new zl(localzo, localzt2, ((zj)localObject2).f);
            try
            {
              zb localzb2 = zcy.a(localzl2, b());
              localzb2.a(this);
            }
            catch (Exception localException2)
            {
              localException2.printStackTrace();
            }
          }
          i5 += ((zj)localObject2).h();
        }
        i4 += ((zj)localObject2).i();
      }
    }
    else
    {
      localObject1 = paramzv.a();
      localObject2 = paramzv.c();
      Object localObject3;
      if ((localObject1 instanceof com.aspose.cells.b.a.b.za))
      {
        localObject3 = ((zj)localObject1).f();
        i2 = (int)((com.aspose.cells.b.a.b.zq)localObject2).f();
        int i3 = (int)((com.aspose.cells.b.a.b.zq)localObject2).g();
        i4 = (int)((com.aspose.cells.b.a.b.zq)localObject2).l();
        i5 = (int)((com.aspose.cells.b.a.b.zq)localObject2).m();
        i6 = 0;
        i7 = 0;
        int i8 = ((zj)localObject1).i();
        int i9 = ((zj)localObject1).h();
        paramGraphics2D.drawImage((Image)localObject3, i2, i3, i4, i5, i6, i7, i8, i9, null);
      }
      else if ((localObject1 instanceof com.aspose.cells.b.a.b.b.zf))
      {
        localObject3 = new com.aspose.cells.b.a.b.zo(b(((com.aspose.cells.b.a.b.zq)localObject2).f()), b(((com.aspose.cells.b.a.b.zq)localObject2).g()));
        com.aspose.cells.b.a.b.zt localzt1 = new com.aspose.cells.b.a.b.zt(b(((com.aspose.cells.b.a.b.zq)localObject2).h()), b(((com.aspose.cells.b.a.b.zq)localObject2).i()));
        zl localzl1 = new zl((com.aspose.cells.b.a.b.zo)localObject3, localzt1, ((zj)localObject1).f);
        try
        {
          zb localzb1 = zcy.a(localzl1, b());
          localzb1.a(this);
        }
        catch (Exception localException1)
        {
          localException1.printStackTrace();
        }
      }
    }
  }
  
  public void a(zq paramzq)
  {
    if (this.p < this.q) {
      return;
    }
    if (paramzq == null) {
      return;
    }
    this.i.moveTo(a(paramzq.a().d()), a(paramzq.a().e()));
  }
  
  public void b(zq paramzq)
  {
    if (this.p < this.q) {
      return;
    }
    if (paramzq.b()) {
      this.i.closePath();
    }
  }
  
  public void a(zu paramzu)
  {
    if (this.p < this.q) {
      return;
    }
    for (int i1 = 0; i1 < paramzu.a().size(); i1++)
    {
      com.aspose.cells.b.a.b.zo localzo = (com.aspose.cells.b.a.b.zo)paramzu.a().get(i1);
      this.i.lineTo(a(localzo.d()), a(localzo.e()));
    }
  }
  
  public void a(zt paramzt)
  {
    if (this.p < this.q) {
      return;
    }
    ArrayList localArrayList = paramzt.a();
    if (localArrayList != null) {
      for (int i1 = 0; i1 < localArrayList.size(); i1++)
      {
        zy localzy = (zy)localArrayList.get(i1);
        CubicCurve2D.Float localFloat = new CubicCurve2D.Float(a(localzy.a().d()), a(localzy.a().e()), a(localzy.b().d()), a(localzy.b().e()), a(localzy.c().d()), a(localzy.c().e()), a(localzy.d().d()), a(localzy.d().e()));
        this.i.append(localFloat, true);
      }
    }
  }
  
  public void a(za paramza)
  {
    if (this.p < this.q) {
      return;
    }
    Arc2D.Double localDouble = new Arc2D.Double();
    localDouble.setArc(a(paramza.c().d()), a(paramza.c().e()), a(paramza.d().b()), a(paramza.d().c()), -paramza.e(), -paramza.f(), 0);
    this.i.append(localDouble, false);
  }
  
  public void a(zm paramzm)
  {
    if (this.p < this.q) {
      return;
    }
    if ((paramzm != null) && (paramzm.c != null))
    {
      com.aspose.cells.b.a.b.zm localzm = zx.a(paramzm.c).r();
      if (localzm.m() == 0) {
        this.g.setColor(localzm.c().d());
      }
      int[] arrayOfInt1 = new int[0];
      int[] arrayOfInt2 = new int[0];
      this.g.setStroke(localzm.p());
      double d1 = a(paramzm.a.d());
      double d2 = a(paramzm.a.e());
      double d3 = a(paramzm.b.d());
      double d4 = a(paramzm.b.e());
      Line2D.Double localDouble = new Line2D.Double(d1, d2, d3, d4);
      this.g.draw(localDouble);
    }
  }
  
  public void a(zl paramzl)
  {
    if (this.p < this.q) {
      return;
    }
    try
    {
      Object localObject;
      switch (paramzl.e())
      {
      case 0: 
      case 4: 
      case 5: 
      case 6: 
      case 7: 
      case 8: 
        localObject = paramzl.d();
        if (localObject != null)
        {
          ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream((byte[])localObject);
          BufferedImage localBufferedImage = ImageIO.read(localByteArrayInputStream);
          this.g.drawImage(localBufferedImage, (int)a(paramzl.b().d()), (int)a(paramzl.b().e()), (int)a(paramzl.b().d() + paramzl.c().b()), (int)a(paramzl.b().e() + paramzl.c().c()), 0, 0, localBufferedImage.getWidth(), localBufferedImage.getHeight(), null);
        }
        break;
      case 1: 
      case 2: 
        localObject = zcy.a(paramzl, b());
        ((zb)localObject).a(this);
        break;
      case 3: 
      default: 
        if (!f) {
          throw new AssertionError();
        }
        break;
      }
    }
    catch (Exception localException) {}
  }
  
  private void a(zbv paramzbv)
  {
    if (zbn.a(paramzbv))
    {
      Graphics2D localGraphics2D = (Graphics2D)this.g.create();
      this.h.push(this.g);
      this.g = localGraphics2D;
      if (zbn.c(paramzbv))
      {
        AffineTransform localAffineTransform = (AffineTransform)paramzbv.a().a().clone();
        double[] arrayOfDouble = new double[6];
        localAffineTransform.getMatrix(arrayOfDouble);
        localAffineTransform.setTransform(arrayOfDouble[0], arrayOfDouble[1], arrayOfDouble[2], arrayOfDouble[3], a((float)arrayOfDouble[4]), a((float)arrayOfDouble[5]));
        this.g.transform(localAffineTransform);
      }
    }
  }
  
  private void b(zbv paramzbv)
  {
    if (zbn.a(paramzbv))
    {
      this.g.dispose();
      this.g = ((Graphics2D)this.h.pop());
    }
  }
  
  public GeneralPath c(zp paramzp)
  {
    GeneralPath localGeneralPath = new GeneralPath();
    for (int i1 = 0; i1 < paramzp.h().size(); i1++)
    {
      zq localzq = (zq)paramzp.a(i1);
      if ((localzq.h() != null) && (localzq.h().size() != 0))
      {
        if (i1 == 0) {
          localGeneralPath.moveTo(a(localzq.a().d()), a(localzq.a().e()));
        }
        for (int i2 = 0; i2 < localzq.h().size(); i2++)
        {
          zn localzn = localzq.a(i2);
          Object localObject1;
          if ((localzn instanceof zu))
          {
            localObject1 = (zu)localzn;
            for (int i3 = 0; i3 < ((zu)localObject1).a().size(); i3++)
            {
              com.aspose.cells.b.a.b.zo localzo = (com.aspose.cells.b.a.b.zo)((zu)localObject1).a().get(i3);
              localGeneralPath.lineTo(a(localzo.d()), a(localzo.e()));
            }
          }
          else
          {
            Object localObject2;
            if ((localzn instanceof zt))
            {
              localObject1 = (zt)localzn;
              localObject2 = ((zt)localObject1).a();
              if (localObject2 != null) {
                for (int i4 = 0; i4 < ((List)localObject2).size(); i4++)
                {
                  zy localzy = (zy)((List)localObject2).get(i4);
                  CubicCurve2D.Float localFloat = new CubicCurve2D.Float(a(localzy.a().d()), a(localzy.a().e()), a(localzy.b().d()), a(localzy.b().e()), a(localzy.c().d()), a(localzy.c().e()), a(localzy.d().d()), a(localzy.d().e()));
                  localGeneralPath.append(localFloat, true);
                }
              }
            }
            else if ((localzn instanceof za))
            {
              localObject1 = (za)localzn;
              localObject2 = new Arc2D.Float();
              ((Arc2D.Float)localObject2).setArc(a(((za)localObject1).c().d()), a(((za)localObject1).c().e()), a(((za)localObject1).d().b()), a(((za)localObject1).d().c()), a(((za)localObject1).e()), a(((za)localObject1).f()), 0);
              localGeneralPath.append((Shape)localObject2, true);
            }
          }
        }
        if (localzq.b()) {
          localGeneralPath.closePath();
        }
      }
    }
    return localGeneralPath;
  }
  
  private void a(Graphics2D paramGraphics2D, zp paramzp)
  {
    AffineTransform localAffineTransform = paramzp.a() == null ? null : paramzp.a().a();
    if (paramGraphics2D.getClip() != null)
    {
      Area localArea1 = new Area(paramGraphics2D.getClip());
      localArea1 = localArea1.createTransformedArea(new AffineTransform());
      GeneralPath localGeneralPath = c(paramzp);
      Area localArea2 = new Area(localGeneralPath);
      if (paramzp.a() != null) {
        localArea2 = localArea2.createTransformedArea(localAffineTransform);
      }
      localArea1.intersect(localArea2);
      this.g.setClip(localArea1);
    }
    else
    {
      if (localAffineTransform != null) {
        this.g.transform(localAffineTransform);
      }
      this.g.setClip(c(paramzp));
      if (localAffineTransform != null) {
        try
        {
          this.g.transform(localAffineTransform.createInverse());
        }
        catch (Exception localException)
        {
          localException.printStackTrace();
        }
      }
    }
  }
  
  public float a(float paramFloat1, float paramFloat2)
  {
    return (float)zao.a(paramFloat1, paramFloat2);
  }
  
  public float a(float paramFloat)
  {
    return a(paramFloat, 96.0F);
  }
  
  public float b(float paramFloat)
  {
    return (float)zao.c(paramFloat);
  }
  
  public int b(int paramInt)
  {
    if (paramInt == 1) {
      return 1;
    }
    return 0;
  }
  
  private void a(Map<RenderingHints.Key, Object> paramMap)
  {
    if (paramMap == null) {
      return;
    }
    this.g.addRenderingHints(paramMap);
  }
  
  public static String a(String paramString)
  {
    if (!ze.b(paramString, o, 66)) {
      return paramString;
    }
    String str = paramString;
    char[] arrayOfChar1 = str.toCharArray();
    str = "";
    com.aspose.cells.b.a.za.a(arrayOfChar1);
    for (char c : arrayOfChar1) {
      str = str + c;
    }
    return str;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zbh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */