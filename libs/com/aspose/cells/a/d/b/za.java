package com.aspose.cells.a.d.b;

import com.aspose.cells.a.d.a.zc;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D.Double;
import java.awt.geom.Point2D;
import java.io.PrintStream;

public class za
{
  public static Color a(Color paramColor)
  {
    if (paramColor == null) {
      return null;
    }
    return new Color(paramColor.getRed(), paramColor.getGreen(), paramColor.getBlue(), paramColor.getAlpha());
  }
  
  public static Font a(Font paramFont)
  {
    if (paramFont == null) {
      return null;
    }
    return new Font(paramFont.getName(), paramFont.getSize(), paramFont.getSize());
  }
  
  public static Paint a(Paint paramPaint)
  {
    if (paramPaint == null) {
      return null;
    }
    Object localObject;
    if ((paramPaint instanceof Color))
    {
      localObject = (Color)paramPaint;
      return new Color(((Color)localObject).getRed(), ((Color)localObject).getGreen(), ((Color)localObject).getBlue(), ((Color)localObject).getAlpha());
    }
    if ((paramPaint instanceof GradientPaint))
    {
      localObject = (GradientPaint)paramPaint;
      return new GradientPaint(((GradientPaint)localObject).getPoint1(), ((GradientPaint)localObject).getColor1(), ((GradientPaint)localObject).getPoint2(), ((GradientPaint)localObject).getColor2(), ((GradientPaint)localObject).isCyclic());
    }
    return paramPaint;
  }
  
  public static Stroke a(Stroke paramStroke)
  {
    if (paramStroke == null) {
      return null;
    }
    if ((paramStroke instanceof BasicStroke))
    {
      BasicStroke localBasicStroke = (BasicStroke)paramStroke;
      return new BasicStroke(localBasicStroke.getLineWidth(), localBasicStroke.getEndCap(), localBasicStroke.getLineJoin(), localBasicStroke.getMiterLimit(), localBasicStroke.getDashArray(), localBasicStroke.getDashPhase());
    }
    return paramStroke;
  }
  
  public static void a(zc paramzc, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, Point2D paramPoint2D1, Point2D paramPoint2D2, Color paramColor1, Color paramColor2)
    throws Exception
  {
    int i = paramColor1.getRed();
    int j = paramColor1.getGreen();
    int k = paramColor1.getBlue();
    int m = paramColor2.getRed();
    int n = paramColor2.getGreen();
    int i1 = paramColor2.getBlue();
    double d1 = 30.0D;
    double d2 = 1.5D;
    double d3;
    double d4;
    double d5;
    double d6;
    double d7;
    int i2;
    int i3;
    int i4;
    Color localColor1;
    if (paramPoint2D1.getX() == paramPoint2D2.getX())
    {
      d3 = paramPoint2D1.getY();
      d4 = Math.abs(paramPoint2D2.getY() - paramPoint2D1.getY());
      d5 = 1.0D;
      if (d4 < d1) {
        d5 = d4 / d1;
      }
      d6 = (paramPoint2D2.getY() - paramPoint2D1.getY()) / Math.abs(paramPoint2D2.getY() - paramPoint2D1.getY());
      paramzc.setStroke(new BasicStroke((float)Math.abs(d5 * d2)));
      d7 = 0.0D;
      while (d7 < d4 + d5 / 2.0D)
      {
        i2 = (int)(i + (m - i) * (d7 / d4));
        i3 = (int)(j + (n - j) * (d7 / d4));
        i4 = (int)(k + (i1 - k) * (d7 / d4));
        localColor1 = a(i2, i3, i4);
        paramzc.setColor(localColor1);
        paramzc.b(paramDouble1, d3, paramDouble1 + paramDouble3, d3);
        d7 += d5;
        d3 += d6 * d5;
      }
    }
    else if (paramPoint2D1.getY() == paramPoint2D2.getY())
    {
      d3 = paramPoint2D1.getX();
      d4 = Math.abs(paramPoint2D2.getX() - paramPoint2D1.getX());
      d5 = 1.0D;
      if (d4 < d1) {
        d5 = d4 / d1;
      }
      d6 = (paramPoint2D2.getX() - paramPoint2D1.getX()) / Math.abs(paramPoint2D2.getX() - paramPoint2D1.getX());
      paramzc.setStroke(new BasicStroke((float)Math.abs(d5 * d2)));
      d7 = 0.0D;
      while (d7 < d4 + d5 / 2.0D)
      {
        i2 = (int)(i + (m - i) * (d7 / d4));
        i3 = (int)(j + (n - j) * (d7 / d4));
        i4 = (int)(k + (i1 - k) * (d7 / d4));
        localColor1 = a(i2, i3, i4);
        paramzc.setColor(localColor1);
        paramzc.b(d3, paramDouble2, d3, paramDouble2 + paramDouble4);
        d7 += d5;
        d3 += d6 * d5;
      }
    }
    else
    {
      d3 = (paramPoint2D2.getY() - paramPoint2D1.getY()) / (paramPoint2D2.getX() - paramPoint2D1.getX());
      d4 = Math.tan(Math.atan2(paramPoint2D2.getY() - paramPoint2D1.getY(), paramPoint2D2.getX() - paramPoint2D1.getX()) + 1.5707963267948966D);
      d5 = paramPoint2D1.getX();
      d6 = d3 * (d5 - paramPoint2D1.getX()) + paramPoint2D1.getY();
      d7 = d4 * (paramDouble1 - d5) + d6;
      double d8 = d4 * (paramDouble1 + paramDouble3 - d5) + d6;
      d5 = paramPoint2D2.getX();
      d6 = d3 * (paramPoint2D2.getX() - paramPoint2D1.getX()) + paramPoint2D1.getY();
      double d9 = d4 * (paramDouble1 - paramPoint2D2.getX()) + d6;
      double d10 = 0.0D;
      double d11 = Math.abs(d9 - d7);
      double d12 = 1.0D;
      if (d11 < d1) {
        d12 = d11 / d1;
      }
      double d13 = (d9 - d7) / Math.abs(d9 - d7);
      paramzc.setStroke(new BasicStroke((float)Math.abs(d12 * d2)));
      while (d10 <= d11 + d12 / 2.0D)
      {
        int i5 = (int)(i + (m - i) * (d10 / d11));
        int i6 = (int)(j + (n - j) * (d10 / d11));
        int i7 = (int)(k + (i1 - k) * (d10 / d11));
        Color localColor2 = a(i5, i6, i7);
        paramzc.setColor(localColor2);
        double d14 = d7 + d13 * d10;
        double d15 = d8 + d13 * d10;
        paramzc.b(paramDouble1, d14, paramDouble1 + paramDouble3, d15);
        d10 += d12;
      }
    }
  }
  
  public static void a(Graphics paramGraphics, Shape paramShape, Point2D paramPoint2D, float paramFloat, float[] paramArrayOfFloat, Color[] paramArrayOfColor)
  {
    Graphics2D localGraphics2D1 = null;
    Graphics2D localGraphics2D2 = null;
    try
    {
      localGraphics2D1 = (Graphics2D)paramGraphics.create();
      localGraphics2D1.clip(paramShape);
      localGraphics2D2 = (Graphics2D)localGraphics2D1.create();
      double d1 = 0.0D;
      double d2 = paramPoint2D.getX() - d1;
      double d3 = paramPoint2D.getY() - d1;
      double d4 = 30.0D;
      double d5 = 1.5D;
      for (int i = 1; i < paramArrayOfColor.length; i++)
      {
        Color localColor1 = paramArrayOfColor[(i - 1)];
        Color localColor2 = paramArrayOfColor[i];
        int j = localColor1.getRed();
        int k = localColor1.getGreen();
        int m = localColor1.getBlue();
        int n = localColor2.getRed();
        int i1 = localColor2.getGreen();
        int i2 = localColor2.getBlue();
        double d6 = (paramArrayOfFloat[i] - paramArrayOfFloat[(i - 1)]) * paramFloat;
        double d7 = 1.0D;
        if (d6 < d4) {
          d7 = d6 / d4;
        }
        localGraphics2D2.setStroke(new BasicStroke((float)Math.abs(d7 * d5)));
        double d8 = 0.0D;
        while (d8 < d6 + d7 / 2.0D)
        {
          int i3 = (int)(j + (n - j) * (d8 / d6));
          int i4 = (int)(k + (i1 - k) * (d8 / d6));
          int i5 = (int)(m + (i2 - m) * (d8 / d6));
          Color localColor3 = a(i3, i4, i5);
          localGraphics2D2.setColor(localColor3);
          if (d1 > 0.0D)
          {
            Ellipse2D.Double localDouble = new Ellipse2D.Double(d2, d3, 2.0D * d1, 2.0D * d1);
            localGraphics2D2.draw(localDouble);
          }
          d8 += d7;
          d2 -= d7;
          d3 -= d7;
          d1 += d7;
        }
      }
    }
    catch (Exception localException)
    {
      System.out.print(localException.getMessage());
    }
    finally
    {
      if (localGraphics2D2 != null) {
        localGraphics2D2.dispose();
      }
      if (localGraphics2D1 != null) {
        localGraphics2D1.dispose();
      }
    }
  }
  
  private static Color a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 < 0) {
      paramInt1 = 0;
    }
    if (paramInt1 > 255) {
      paramInt1 = 255;
    }
    if (paramInt2 < 0) {
      paramInt2 = 0;
    }
    if (paramInt2 > 255) {
      paramInt2 = 255;
    }
    if (paramInt3 < 0) {
      paramInt3 = 0;
    }
    if (paramInt3 > 255) {
      paramInt3 = 255;
    }
    return new Color(paramInt1, paramInt2, paramInt3);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/b/za.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */