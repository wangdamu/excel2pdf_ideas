package com.aspose.cells.b.a.b.d.a;

import com.aspose.cells.a.d.zav;
import com.aspose.cells.a.d.zgs;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zh;
import com.aspose.cells.b.a.zf;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.font.TextAttribute;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;

public class zd
  implements Cloneable
{
  private final float a;
  private final float b;
  private final com.aspose.cells.b.a.b.zv c;
  private final String d;
  private final zg e;
  private final float f;
  private static String g = null;
  private static final AffineTransform h = AffineTransform.getRotateInstance(1.5707963267948966D);
  private za i;
  private int j;
  private int k;
  private int l;
  private float m;
  private int n = 0;
  private Graphics2D o;
  private FontMetrics p;
  private zgs q;
  
  public zd(String paramString, zg paramzg, com.aspose.cells.b.a.b.zv paramzv, float paramFloat1, float paramFloat2, Graphics2D paramGraphics2D)
  {
    this.c = (paramzv != null ? paramzv : new com.aspose.cells.b.a.b.zv());
    this.e = paramzg;
    this.d = (paramString != null ? paramString : "");
    zh localzh = paramzg.b();
    if (this.c.f()) {
      this.f = 0.0F;
    } else {
      this.f = (paramzg.h() * localzh.a(paramzg.k()) / localzh.e(paramzg.k()));
    }
    this.a = paramFloat1;
    this.b = paramFloat2;
    if (paramGraphics2D == null)
    {
      BufferedImage localBufferedImage = new BufferedImage(1, 1, 1);
      paramGraphics2D = (Graphics2D)localBufferedImage.getGraphics();
    }
    if (paramGraphics2D != null) {
      this.p = paramGraphics2D.getFontMetrics(this.e.a());
    }
    try
    {
      this.q = zav.a().b(this.e.g(), this.e.k(), false);
    }
    catch (Exception localException) {}
    this.o = paramGraphics2D;
  }
  
  public Graphics2D a()
  {
    return this.o;
  }
  
  public FontMetrics b()
  {
    return this.p;
  }
  
  public zgs c()
  {
    return this.q;
  }
  
  public final float d()
  {
    if (!this.c.g()) {
      return f();
    }
    return e();
  }
  
  public final float e()
  {
    return this.a;
  }
  
  public final float f()
  {
    return this.b;
  }
  
  public final com.aspose.cells.b.a.b.zv g()
  {
    return this.c;
  }
  
  public final float h()
  {
    return this.f;
  }
  
  public final int i()
  {
    return this.j;
  }
  
  public final float j()
  {
    return this.m;
  }
  
  public float k()
  {
    return this.e.h();
  }
  
  public final AffineTransform l()
  {
    if (!g().g()) {
      return new AffineTransform();
    }
    return h;
  }
  
  public float a(float paramFloat)
  {
    if (this.c.f()) {
      return paramFloat;
    }
    return paramFloat * 1.028F + 0.463F * k();
  }
  
  public float b(float paramFloat)
  {
    if (this.c.f()) {
      return paramFloat;
    }
    return 1.08864F * paramFloat;
  }
  
  public zc m()
  {
    if ((this.k < this.l) && (!this.c.j())) {
      return o();
    }
    this.j += this.l;
    if (this.j >= this.d.length()) {
      return null;
    }
    int i1 = this.d.indexOf(g, this.j);
    String str;
    if (i1 >= 0) {
      str = this.d.substring(this.j, this.j + (i1 - this.j + g.length()));
    } else {
      str = this.d.substring(this.j);
    }
    this.l = str.length();
    this.k = 0;
    AttributedString localAttributedString = new AttributedString(str);
    localAttributedString.addAttribute(TextAttribute.FONT, this.e.a());
    if ((this.e.k() & 0x4) != 0) {
      localAttributedString.addAttribute(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
    }
    if ((this.e.k() & 0x8) != 0) {
      localAttributedString.addAttribute(TextAttribute.STRIKETHROUGH, TextAttribute.STRIKETHROUGH_ON);
    }
    AttributedCharacterIterator localAttributedCharacterIterator = localAttributedString.getIterator();
    this.i = new za(str, this.q, this.e);
    return o();
  }
  
  public AffineTransform n()
  {
    if (this.c.b() == 0) {
      return null;
    }
    float f1 = d();
    if (com.aspose.cells.b.a.zv.b(f1)) {
      f1 = 0.0F;
    }
    float f2 = f1 - j();
    if ((f1 > 0.0F) && (f2 <= 0.0F)) {
      return null;
    }
    if (this.c.b() == 1) {
      f2 /= 2.0F;
    } else if ((this.c.g()) && (this.c.h())) {
      return null;
    }
    return this.c.g() ? AffineTransform.getTranslateInstance(f2, 0.0D) : AffineTransform.getTranslateInstance(0.0D, f2);
  }
  
  private final zc o()
  {
    if (this.m >= d())
    {
      this.j += this.k;
      return null;
    }
    int i1 = this.i.a(this.p, this.k, e());
    String str = "";
    int i2;
    if ((this.j + i1 < this.d.length()) && (this.d.charAt(this.j + i1) == '\n'))
    {
      i2 = i1;
      if (i2 < this.l)
      {
        while ((i2 >= this.k) && (com.aspose.cells.b.a.zd.a(this.d, this.j + i2))) {
          i2--;
        }
        if (i2 > this.k) {
          i1 = i2 + 1;
        }
      }
      if (i1 <= this.k) {
        str = "";
      } else {
        str = this.i.a(this.k, i1);
      }
      for (this.k = i1; (this.k < this.l) && (com.aspose.cells.b.a.zd.a(this.d, this.j + this.k)); this.k += 1) {}
    }
    else
    {
      if (i1 <= 0) {
        return null;
      }
      i2 = i1;
      if (i2 < this.l)
      {
        while ((i2 >= this.k) && (!com.aspose.cells.b.a.zd.a(this.d, this.j + i2))) {
          i2--;
        }
        if (i2 > this.k) {
          i1 = i2 + 1;
        }
      }
      if (i1 <= this.k) {
        return null;
      }
      str = this.i.a(this.k, i1);
      for (this.k = i1; (this.k < this.l) && (com.aspose.cells.b.a.zd.a(this.d, this.j + this.k)); this.k += 1) {}
    }
    zc localzc = new zc(this, this.m, str, this.e);
    this.n += 1;
    float f1 = localzc.c() + localzc.d();
    if (this.n == 1) {
      f1 += localzc.e();
    }
    f1 = b(f1);
    if ((this.c != null) && (this.c.i()) && (this.m > 0.0F) && (this.m + f1 > this.b)) {
      return null;
    }
    this.m += f1;
    return localzc;
  }
  
  static
  {
    g = zf.a();
    if ((g == null) || (g.length() == 0) || (g.charAt(g.length() - 1) == '\n')) {
      g = "\n";
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/d/a/zd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */