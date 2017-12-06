package com.aspose.cells;

import com.aspose.cells.b.a.b.zk;
import com.aspose.cells.b.a.b.zl;

public class Color
  implements Cloneable
{
  private int a;
  private final boolean b;
  private final boolean c;
  private String d = null;
  
  public Color()
  {
    this.a = 0;
    this.b = true;
    this.c = false;
    this.d = null;
  }
  
  private Color(boolean isEmpty, boolean isKnown)
  {
    this.b = isEmpty;
    this.c = isKnown;
  }
  
  public Color a()
  {
    Color localColor = new Color(this.b, this.c);
    localColor.a = this.a;
    localColor.d = this.d;
    return localColor;
  }
  
  public boolean equals(Object obj)
  {
    if (obj == null) {
      return false;
    }
    if (obj == this) {
      return true;
    }
    if ((obj instanceof Color))
    {
      Color localColor = (Color)obj;
      if (localColor.b) {
        return this.b;
      }
      if (this.b) {
        return false;
      }
      return (localColor.a & 0xFFFFFF) == (this.a & 0xFFFFFF);
    }
    return false;
  }
  
  public int hashCode()
  {
    return Integer.valueOf(this.a).hashCode();
  }
  
  public static Color fromArgb(int argb)
  {
    return fromArgb(argb >> 24 & 0xFF, argb >> 16 & 0xFF, argb >> 8 & 0xFF, argb & 0xFF);
  }
  
  public static Color fromArgb(int red, int green, int blue)
  {
    return fromArgb(255, red, green, blue);
  }
  
  public static Color fromArgb(int alpha, int red, int green, int blue)
  {
    Color localColor = new Color(false, false);
    a(alpha, red, green, blue);
    localColor.a = ((alpha << 24) + (red << 16) + (green << 8) + blue);
    return localColor;
  }
  
  public static Color a(int paramInt, Color paramColor)
  {
    return fromArgb(paramInt, paramColor.getR() & 0xFF & 0xFF, paramColor.getG() & 0xFF & 0xFF, paramColor.getB() & 0xFF & 0xFF);
  }
  
  public static Color a(zk paramzk)
  {
    Color localColor = new Color(false, true);
    localColor.a = paramzk.b();
    localColor.d = paramzk.name();
    return localColor;
  }
  
  public static Color a(String paramString)
  {
    return zl.a(zk.a(paramString));
  }
  
  public static Color getEmpty()
  {
    return new Color();
  }
  
  public static Color getAliceBlue()
  {
    return zl.a(zk.C);
  }
  
  public static Color getAntiqueWhite()
  {
    return zl.a(zk.D);
  }
  
  public static Color getAzure()
  {
    return zl.a(zk.G);
  }
  
  public static Color getAquamarine()
  {
    return zl.a(zk.F);
  }
  
  public static Color getAqua()
  {
    return zl.a(zk.E);
  }
  
  public static Color getBeige()
  {
    return zl.a(zk.H);
  }
  
  public static Color getBisque()
  {
    return zl.a(zk.I);
  }
  
  public static Color getBlack()
  {
    return zl.a(zk.J);
  }
  
  public static Color getBlanchedAlmond()
  {
    return zl.a(zk.K);
  }
  
  public static Color getBlue()
  {
    return zl.a(zk.L);
  }
  
  public static Color getBlueViolet()
  {
    return zl.a(zk.M);
  }
  
  public static Color getBrown()
  {
    return zl.a(zk.N);
  }
  
  public static Color getCadetBlue()
  {
    return zl.a(zk.P);
  }
  
  public static Color getBurlyWood()
  {
    return zl.a(zk.O);
  }
  
  public static Color getChartreuse()
  {
    return zl.a(zk.Q);
  }
  
  public static Color getChocolate()
  {
    return zl.a(zk.R);
  }
  
  public static Color getCoral()
  {
    return zl.a(zk.S);
  }
  
  public static Color getCornflowerBlue()
  {
    return zl.a(zk.T);
  }
  
  public static Color getCornsilk()
  {
    return zl.a(zk.U);
  }
  
  public static Color getCrimson()
  {
    return zl.a(zk.V);
  }
  
  public static Color getCyan()
  {
    return zl.a(zk.W);
  }
  
  public static Color getDarkBlue()
  {
    return zl.a(zk.X);
  }
  
  public static Color getDarkCyan()
  {
    return zl.a(zk.Y);
  }
  
  public static Color getDarkGoldenrod()
  {
    return zl.a(zk.Z);
  }
  
  public static Color getDarkGray()
  {
    return zl.a(zk.aa);
  }
  
  public static Color getDarkGreen()
  {
    return zl.a(zk.ab);
  }
  
  public static Color getDarkKhaki()
  {
    return zl.a(zk.ac);
  }
  
  public static Color getDarkMagenta()
  {
    return zl.a(zk.ad);
  }
  
  public static Color getDarkOliveGreen()
  {
    return zl.a(zk.ae);
  }
  
  public static Color getDarkOrange()
  {
    return zl.a(zk.af);
  }
  
  public static Color getDarkOrchid()
  {
    return zl.a(zk.ag);
  }
  
  public static Color getDarkRed()
  {
    return zl.a(zk.ah);
  }
  
  public static Color getDarkSalmon()
  {
    return zl.a(zk.ai);
  }
  
  public static Color getDarkSeaGreen()
  {
    return zl.a(zk.aj);
  }
  
  public static Color getDarkSlateBlue()
  {
    return zl.a(zk.ak);
  }
  
  public static Color getDarkSlateGray()
  {
    return zl.a(zk.al);
  }
  
  public static Color getDarkTurquoise()
  {
    return zl.a(zk.am);
  }
  
  public static Color getDarkViolet()
  {
    return zl.a(zk.an);
  }
  
  public static Color getDeepPink()
  {
    return zl.a(zk.ao);
  }
  
  public static Color getDeepSkyBlue()
  {
    return zl.a(zk.ap);
  }
  
  public static Color getDimGray()
  {
    return zl.a(zk.aq);
  }
  
  public static Color getDodgerBlue()
  {
    return zl.a(zk.ar);
  }
  
  public static Color getFirebrick()
  {
    return zl.a(zk.as);
  }
  
  public static Color getFloralWhite()
  {
    return zl.a(zk.at);
  }
  
  public static Color getForestGreen()
  {
    return zl.a(zk.au);
  }
  
  public static Color getFuchsia()
  {
    return zl.a(zk.av);
  }
  
  public static Color getGainsboro()
  {
    return zl.a(zk.aw);
  }
  
  public static Color getGhostWhite()
  {
    return zl.a(zk.ax);
  }
  
  public static Color getGold()
  {
    return zl.a(zk.ay);
  }
  
  public static Color getGoldenrod()
  {
    return zl.a(zk.az);
  }
  
  public static Color getGray()
  {
    return zl.a(zk.aA);
  }
  
  public static Color getGreen()
  {
    return zl.a(zk.aB);
  }
  
  public static Color getGreenYellow()
  {
    return zl.a(zk.aC);
  }
  
  public static Color getHoneydew()
  {
    return zl.a(zk.aD);
  }
  
  public static Color getHotPink()
  {
    return zl.a(zk.aE);
  }
  
  public static Color getIndianRed()
  {
    return zl.a(zk.aF);
  }
  
  public static Color getIndigo()
  {
    return zl.a(zk.aG);
  }
  
  public static Color getIvory()
  {
    return zl.a(zk.aH);
  }
  
  public static Color getKhaki()
  {
    return zl.a(zk.aI);
  }
  
  public static Color getLavender()
  {
    return zl.a(zk.aJ);
  }
  
  public static Color getLavenderBlush()
  {
    return zl.a(zk.aK);
  }
  
  public static Color getLawnGreen()
  {
    return zl.a(zk.aL);
  }
  
  public static Color getLemonChiffon()
  {
    return zl.a(zk.aM);
  }
  
  public static Color getLightBlue()
  {
    return zl.a(zk.aN);
  }
  
  public static Color getLightCoral()
  {
    return zl.a(zk.aO);
  }
  
  public static Color getLightCyan()
  {
    return zl.a(zk.aP);
  }
  
  public static Color getLightGoldenrodYellow()
  {
    return zl.a(zk.aQ);
  }
  
  public static Color getLightGray()
  {
    return zl.a(zk.aR);
  }
  
  public static Color getLightGreen()
  {
    return zl.a(zk.aS);
  }
  
  public static Color getLightPink()
  {
    return zl.a(zk.aT);
  }
  
  public static Color getLightSalmon()
  {
    return zl.a(zk.aU);
  }
  
  public static Color getLightSeaGreen()
  {
    return zl.a(zk.aV);
  }
  
  public static Color getLightSkyBlue()
  {
    return zl.a(zk.aW);
  }
  
  public static Color getLightSlateGray()
  {
    return zl.a(zk.aX);
  }
  
  public static Color getLightSteelBlue()
  {
    return zl.a(zk.aY);
  }
  
  public static Color getLightYellow()
  {
    return zl.a(zk.aZ);
  }
  
  public static Color getLime()
  {
    return zl.a(zk.ba);
  }
  
  public static Color getLimeGreen()
  {
    return zl.a(zk.bb);
  }
  
  public static Color getLinen()
  {
    return zl.a(zk.bc);
  }
  
  public static Color getMagenta()
  {
    return zl.a(zk.bd);
  }
  
  public static Color getMaroon()
  {
    return zl.a(zk.be);
  }
  
  public static Color getMediumAquamarine()
  {
    return zl.a(zk.bf);
  }
  
  public static Color getMediumBlue()
  {
    return zl.a(zk.bg);
  }
  
  public static Color getMediumOrchid()
  {
    return zl.a(zk.bh);
  }
  
  public static Color getMediumPurple()
  {
    return zl.a(zk.bi);
  }
  
  public static Color getMediumSeaGreen()
  {
    return zl.a(zk.bj);
  }
  
  public static Color getMediumSlateBlue()
  {
    return zl.a(zk.bk);
  }
  
  public static Color getMediumSpringGreen()
  {
    return zl.a(zk.bl);
  }
  
  public static Color getMediumTurquoise()
  {
    return zl.a(zk.bm);
  }
  
  public static Color getMediumVioletRed()
  {
    return zl.a(zk.bn);
  }
  
  public static Color getMidnightBlue()
  {
    return zl.a(zk.bo);
  }
  
  public static Color getMintCream()
  {
    return zl.a(zk.bp);
  }
  
  public static Color getMistyRose()
  {
    return zl.a(zk.bq);
  }
  
  public static Color getMoccasin()
  {
    return zl.a(zk.br);
  }
  
  public static Color getNavajoWhite()
  {
    return zl.a(zk.bs);
  }
  
  public static Color getNavy()
  {
    return zl.a(zk.bt);
  }
  
  public static Color getOldLace()
  {
    return zl.a(zk.bu);
  }
  
  public static Color getOlive()
  {
    return zl.a(zk.bv);
  }
  
  public static Color getOliveDrab()
  {
    return zl.a(zk.bw);
  }
  
  public static Color getOrange()
  {
    return zl.a(zk.bx);
  }
  
  public static Color getOrangeRed()
  {
    return zl.a(zk.by);
  }
  
  public static Color getOrchid()
  {
    return zl.a(zk.bz);
  }
  
  public static Color getPaleGoldenrod()
  {
    return zl.a(zk.bA);
  }
  
  public static Color getPaleGreen()
  {
    return zl.a(zk.bB);
  }
  
  public static Color getPaleTurquoise()
  {
    return zl.a(zk.bC);
  }
  
  public static Color getPaleVioletRed()
  {
    return zl.a(zk.bD);
  }
  
  public static Color getPapayaWhip()
  {
    return zl.a(zk.bE);
  }
  
  public static Color getPeachPuff()
  {
    return zl.a(zk.bF);
  }
  
  public static Color getPeru()
  {
    return zl.a(zk.bG);
  }
  
  public static Color getPink()
  {
    return zl.a(zk.bH);
  }
  
  public static Color getPlum()
  {
    return zl.a(zk.bI);
  }
  
  public static Color getPowderBlue()
  {
    return zl.a(zk.bJ);
  }
  
  public static Color getPurple()
  {
    return zl.a(zk.bK);
  }
  
  public static Color getRed()
  {
    return zl.a(zk.bL);
  }
  
  public static Color getRosyBrown()
  {
    return zl.a(zk.bM);
  }
  
  public static Color getRoyalBlue()
  {
    return zl.a(zk.bN);
  }
  
  public static Color getSaddleBrown()
  {
    return zl.a(zk.bO);
  }
  
  public static Color getSalmon()
  {
    return zl.a(zk.bP);
  }
  
  public static Color getSandyBrown()
  {
    return zl.a(zk.bQ);
  }
  
  public static Color getSeaGreen()
  {
    return zl.a(zk.bR);
  }
  
  public static Color getSeaShell()
  {
    return zl.a(zk.bS);
  }
  
  public static Color getSienna()
  {
    return zl.a(zk.bT);
  }
  
  public static Color getSilver()
  {
    return zl.a(zk.bU);
  }
  
  public static Color getSkyBlue()
  {
    return zl.a(zk.bV);
  }
  
  public static Color getSlateBlue()
  {
    return zl.a(zk.bW);
  }
  
  public static Color getSlateGray()
  {
    return zl.a(zk.bX);
  }
  
  public static Color getSnow()
  {
    return zl.a(zk.bY);
  }
  
  public static Color getSpringGreen()
  {
    return zl.a(zk.bZ);
  }
  
  public static Color getSteelBlue()
  {
    return zl.a(zk.ca);
  }
  
  public static Color getTan()
  {
    return zl.a(zk.cb);
  }
  
  public static Color getTeal()
  {
    return zl.a(zk.cc);
  }
  
  public static Color getThistle()
  {
    return zl.a(zk.cd);
  }
  
  public static Color getTomato()
  {
    return zl.a(zk.ce);
  }
  
  public static Color getTransparent()
  {
    return zl.a(zk.B);
  }
  
  public static Color getTurquoise()
  {
    return zl.a(zk.cf);
  }
  
  public static Color getViolet()
  {
    return zl.a(zk.cg);
  }
  
  public static Color getWheat()
  {
    return zl.a(zk.ch);
  }
  
  public static Color getWhite()
  {
    return zl.a(zk.ci);
  }
  
  public static Color getWhiteSmoke()
  {
    return zl.a(zk.cj);
  }
  
  public static Color getYellow()
  {
    return zl.a(zk.ck);
  }
  
  public static Color getYellowGreen()
  {
    return zl.a(zk.cl);
  }
  
  public final byte getA()
  {
    return (byte)(this.a >> 24 & 0xFF);
  }
  
  public final byte getR()
  {
    return (byte)(this.a >> 16 & 0xFF);
  }
  
  public final byte getG()
  {
    return (byte)(this.a >> 8 & 0xFF);
  }
  
  public final byte getB()
  {
    return (byte)(this.a & 0xFF);
  }
  
  public float b()
  {
    int i = Math.min(getR() & 0xFF, Math.min(getG() & 0xFF, getB() & 0xFF));
    int j = Math.max(getR() & 0xFF, Math.max(getG() & 0xFF, getB() & 0xFF));
    return (j + i) / 510.0F;
  }
  
  public boolean isEmpty()
  {
    return this.b;
  }
  
  public String c()
  {
    return this.d;
  }
  
  public int toArgb()
  {
    return this.a;
  }
  
  public java.awt.Color d()
  {
    return new java.awt.Color(getR() & 0xFF, getG() & 0xFF, getB() & 0xFF, getA() & 0xFF);
  }
  
  private static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt1 > 255) || (paramInt1 < 0)) {
      throw a(paramInt1, "alpha");
    }
    a(paramInt2, paramInt3, paramInt4);
  }
  
  private static void a(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 > 255) || (paramInt1 < 0)) {
      throw a(paramInt1, "red");
    }
    if ((paramInt2 > 255) || (paramInt2 < 0)) {
      throw a(paramInt2, "green");
    }
    if ((paramInt3 > 255) || (paramInt3 < 0)) {
      throw a(paramInt3, "blue");
    }
  }
  
  private static IllegalArgumentException a(int paramInt, String paramString)
  {
    String str = String.format("%1$d is not a valid value for '%2$s'. '%2$s' should be greater or equal to 0 and less than or equal to 255.", new Object[] { Integer.valueOf(paramInt), paramString });
    return new IllegalArgumentException(str);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Color.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */