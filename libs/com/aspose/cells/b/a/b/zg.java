package com.aspose.cells.b.a.b;

import com.aspose.cells.a.c.zl;
import com.aspose.cells.a.d.zav;
import java.awt.Container;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.font.TextAttribute;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class zg
  implements Cloneable
{
  private int a = 3;
  private zh b;
  private Font c;
  private byte d;
  private static final float[] e = { 1.0F, 1.0F, 1.0F, zi.c(), zi.c(), zi.c(), zi.c() };
  private final String f = null;
  
  public Font a()
  {
    return this.c;
  }
  
  public zg(zh paramzh, float paramFloat)
  {
    this(paramzh, paramFloat, 0, 3, (byte)1, false);
  }
  
  public zg(zh paramzh, float paramFloat, int paramInt)
  {
    this(paramzh, paramFloat, paramInt, 3, (byte)1, false);
  }
  
  public zg(zh paramzh, float paramFloat, int paramInt1, int paramInt2)
  {
    this(paramzh, paramFloat, paramInt1, paramInt2, (byte)1, false);
  }
  
  public zg(String paramString, float paramFloat)
  {
    this(paramString, paramFloat, 0, 3, (byte)0, false);
  }
  
  public zg(String paramString, float paramFloat, int paramInt)
  {
    this(paramString, paramFloat, paramInt, 3, (byte)0, false);
  }
  
  public zg(String paramString, float paramFloat, int paramInt1, int paramInt2)
  {
    this(paramString, paramFloat, paramInt1, paramInt2, (byte)0, false);
  }
  
  public zg(String paramString, float paramFloat, int paramInt1, int paramInt2, byte paramByte, boolean paramBoolean)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      throw new IllegalArgumentException("family");
    }
    this.a = paramInt2;
    this.d = paramByte;
    float f1 = paramFloat * zi.a()[this.a];
    try
    {
      this.c = zav.a().a(paramString, paramInt1, f1, false);
      this.b = new zh(paramString, this.c);
    }
    catch (Exception localException)
    {
      zl.b(localException);
      Hashtable localHashtable = new Hashtable();
      localHashtable.put(TextAttribute.FAMILY, paramString);
      localHashtable.put(TextAttribute.POSTURE, TextAttribute.POSTURE_REGULAR);
      localHashtable.put(TextAttribute.SIZE, new Float(f1));
      a(localHashtable, paramInt1, false);
      this.b = a(paramString);
      if ((this.b == null) || (this.b.c() == null)) {
        throw new IllegalArgumentException("Cannot find required font defination[Family:" + paramString + "]. Please specify correct font path.");
      }
      this.c = this.b.c().deriveFont(localHashtable);
    }
  }
  
  public zg(zh paramzh, float paramFloat, int paramInt1, int paramInt2, byte paramByte, boolean paramBoolean)
  {
    if (paramzh == null) {
      throw new IllegalArgumentException("family");
    }
    this.a = paramInt2;
    this.b = paramzh;
    this.d = paramByte;
    float f1 = paramFloat * zi.a()[this.a];
    try
    {
      this.c = zav.a().a(paramzh.b(), paramInt1, f1, false);
    }
    catch (Exception localException)
    {
      zl.b(localException);
      Hashtable localHashtable = new Hashtable();
      localHashtable.put(TextAttribute.FAMILY, paramzh.b());
      localHashtable.put(TextAttribute.POSTURE, TextAttribute.POSTURE_REGULAR);
      localHashtable.put(TextAttribute.SIZE, new Float(f1));
      a(localHashtable, paramInt1, false);
      if (paramzh.c() == null) {
        throw new IllegalArgumentException("Cannot find required font defination by Family[" + paramzh.b() + "]. Please specify correct font path.");
      }
      this.c = paramzh.c().deriveFont(localHashtable);
    }
  }
  
  private static zh a(String paramString)
  {
    try
    {
      return new zh(paramString);
    }
    catch (Exception localException) {}
    return zh.a();
  }
  
  public boolean equals(Object obj)
  {
    Object localObject1 = null;
    Object localObject2 = obj;
    localObject1 = (localObject2 instanceof zg) ? (zg)localObject2 : null;
    if (localObject1 == null) {
      return false;
    }
    return a().equals(((zg)localObject1).a());
  }
  
  public int hashCode()
  {
    return a().hashCode();
  }
  
  public final zh b()
  {
    return this.b;
  }
  
  public boolean c()
  {
    return this.c.isBold();
  }
  
  public int d()
  {
    return zh.a.getFontMetrics(a()).getHeight();
  }
  
  public float e()
  {
    return a(zi.c());
  }
  
  public float a(float paramFloat)
  {
    float f1 = this.b.f(k()) * (i() / this.b.e(k())) / 72.0F;
    return f1 * paramFloat;
  }
  
  public boolean f()
  {
    return this.c.isItalic();
  }
  
  public String g()
  {
    return this.c.getFamily();
  }
  
  public float h()
  {
    return this.c.getSize2D() / zi.a()[this.a];
  }
  
  public float i()
  {
    return this.c.getSize2D() / zi.a()[3];
  }
  
  public boolean j()
  {
    try
    {
      if ((Boolean)this.c.getAttributes().get(TextAttribute.STRIKETHROUGH) == TextAttribute.STRIKETHROUGH_ON) {
        return true;
      }
    }
    catch (Exception localException) {}
    return false;
  }
  
  public int k()
  {
    int i = 0;
    if (c()) {
      i |= 0x1;
    }
    if (f()) {
      i |= 0x2;
    }
    if (l()) {
      i |= 0x4;
    }
    if (j()) {
      i |= 0x8;
    }
    return i;
  }
  
  public boolean l()
  {
    try
    {
      if ((Integer)this.c.getAttributes().get(TextAttribute.UNDERLINE) == TextAttribute.UNDERLINE_ON) {
        return true;
      }
    }
    catch (Exception localException) {}
    return false;
  }
  
  public int m()
  {
    return this.a;
  }
  
  public String toString()
  {
    return "[Font: Name=" + g() + ", Size=" + h() + ", Style=" + k() + ", Units=" + m() + "]";
  }
  
  public void n() {}
  
  public static Map a(Map paramMap, int paramInt, boolean paramBoolean)
  {
    Object localObject1;
    if (paramBoolean)
    {
      localObject1 = new Hashtable(paramMap.size());
      Iterator localIterator = paramMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject2 = localIterator.next();
        Object localObject3 = paramMap.get(localObject2);
        if (localObject3 != null) {
          ((Map)localObject1).put(localObject2, localObject3);
        }
      }
    }
    else
    {
      localObject1 = paramMap;
    }
    if ((paramInt & 0x1) == 1) {
      ((Map)localObject1).put(TextAttribute.WEIGHT, TextAttribute.WEIGHT_BOLD);
    } else {
      ((Map)localObject1).remove(TextAttribute.WEIGHT);
    }
    if ((paramInt & 0x2) == 2) {
      ((Map)localObject1).put(TextAttribute.POSTURE, TextAttribute.POSTURE_OBLIQUE);
    } else {
      ((Map)localObject1).put(TextAttribute.POSTURE, TextAttribute.POSTURE_REGULAR);
    }
    if ((paramInt & 0x4) == 4) {
      ((Map)localObject1).put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
    } else {
      ((Map)localObject1).remove(TextAttribute.UNDERLINE);
    }
    if ((paramInt & 0x8) == 8) {
      ((Map)localObject1).put(TextAttribute.STRIKETHROUGH, TextAttribute.STRIKETHROUGH_ON);
    } else {
      ((Map)localObject1).remove(TextAttribute.STRIKETHROUGH);
    }
    return (Map)localObject1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/zg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */