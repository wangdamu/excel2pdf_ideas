package com.aspose.cells;

import com.aspose.cells.a.c.zh;
import com.aspose.cells.a.c.zi;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.za;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

class zaum
{
  private HashMap a;
  private Object b;
  
  zaum(Object paramObject)
  {
    this.b = paramObject;
    this.a = new HashMap();
  }
  
  void a()
  {
    this.a.clear();
  }
  
  boolean a(int paramInt)
  {
    return this.a.containsKey(Integer.valueOf(paramInt));
  }
  
  void a(int paramInt1, int paramInt2)
  {
    for (int i = paramInt1; (i & 0xFFFF) <= (paramInt2 & 0xFFFF); i++) {
      this.a.remove(Integer.valueOf(i));
    }
  }
  
  void b(int paramInt)
  {
    this.a.remove(Integer.valueOf(paramInt));
  }
  
  void a(zaum paramzaum)
  {
    this.a = new HashMap();
    Iterator localIterator = paramzaum.a.values().iterator();
    while (localIterator.hasNext())
    {
      zbme localzbme = (zbme)localIterator.next();
      Object localObject1 = localzbme.d();
      switch (localzbme.c())
      {
      case 3: 
        localObject2 = new Hyperlink();
        ((Hyperlink)localObject2).a((Hyperlink)localObject1, null);
        localObject1 = localObject2;
        break;
      case 4: 
        localObject1 = (byte[])za.a((byte[])localObject1);
        break;
      }
      Object localObject2 = new zbme(localzbme.b(), localzbme.c(), localObject1);
      this.a.put(Integer.valueOf(((zbme)localObject2).b()), localObject2);
    }
  }
  
  int b()
  {
    return this.a.size();
  }
  
  ArrayList c()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.a.values().iterator();
    while (localIterator.hasNext())
    {
      zbme localzbme = (zbme)localIterator.next();
      zf.a(localArrayList, localzbme);
    }
    Collections.sort(localArrayList, new znx());
    return localArrayList;
  }
  
  int d()
  {
    Hyperlink localHyperlink = null;
    int i = this.a.size() * 6;
    Iterator localIterator = this.a.values().iterator();
    while (localIterator.hasNext())
    {
      zbme localzbme = (zbme)localIterator.next();
      if (localzbme.a()) {
        switch (localzbme.c())
        {
        case 5: 
          i += ((byte[])localzbme.d()).length;
          break;
        case 4: 
          i += ((byte[])localzbme.d()).length;
          break;
        case 2: 
          String str = (String)localzbme.d();
          i += str.length() * 2 + 2;
          break;
        case 3: 
          localHyperlink = (Hyperlink)localzbme.d();
          zaex localzaex = new zaex(localHyperlink.getArea(), "", localHyperlink.getAddress(), localHyperlink);
          int j = localzaex.d() - 8;
          byte[] arrayOfByte = new byte[j];
          System.arraycopy(localzaex.e(), 8, arrayOfByte, 0, j);
          localzbme.a(arrayOfByte);
          localzbme.a(4);
          i += j;
        }
      }
    }
    if (((this.b instanceof zbqr)) && (localHyperlink != null) && (localHyperlink.getScreenTip() != null) && (!"".equals(localHyperlink.getScreenTip()))) {
      ((zbqr)this.b).g().a(50061, 2, localHyperlink.getScreenTip());
    }
    return i;
  }
  
  zbme c(int paramInt)
  {
    return (zbme)this.a.get(Integer.valueOf(paramInt));
  }
  
  static boolean b(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return false;
    }
    switch (paramInt1 & 0xFFFF & 0x3FFF)
    {
    case 325: 
    case 326: 
    case 337: 
    case 341: 
    case 342: 
    case 343: 
      return true;
    }
    return false;
  }
  
  void a(int paramInt1, int paramInt2, Object paramObject)
  {
    if (paramObject == null)
    {
      b(paramInt1);
      return;
    }
    zbme localzbme = c(paramInt1);
    if (localzbme != null)
    {
      localzbme.a(paramInt2);
      localzbme.a(paramObject);
      return;
    }
    this.a.put(Integer.valueOf(paramInt1), new zbme(paramInt1, paramInt2, paramObject));
  }
  
  Hyperlink e()
  {
    zbme localzbme = c(50050);
    if (localzbme == null) {
      return null;
    }
    if (localzbme.c() == 4)
    {
      byte[] arrayOfByte1 = (byte[])localzbme.d();
      HyperlinkCollection localHyperlinkCollection = new HyperlinkCollection(null);
      byte[] arrayOfByte2 = new byte[arrayOfByte1.length + 8];
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 8, arrayOfByte1.length);
      localHyperlinkCollection.a(arrayOfByte2);
      localzbme.a(3);
      localzbme.a(localHyperlinkCollection.get(0));
      if ((this.b != null) && ((this.b instanceof zbqr)))
      {
        zbqr localzbqr = (zbqr)this.b;
        if (localzbqr.e() != null)
        {
          String str = localzbqr.g().e(50061);
          if ((str != null) && (!"".equals(str)))
          {
            localHyperlinkCollection.get(0).setScreenTip(str);
            localzbqr.g().b(50061);
          }
        }
      }
      return localHyperlinkCollection.get(0);
    }
    if (localzbme.c() == 3) {
      return (Hyperlink)localzbme.d();
    }
    return null;
  }
  
  byte[] d(int paramInt)
  {
    zbme localzbme = c(paramInt);
    if (localzbme == null) {
      return null;
    }
    if (localzbme.c() == 4) {
      return (byte[])localzbme.d();
    }
    return null;
  }
  
  byte[] f()
  {
    zbme localzbme = c(49542);
    if (localzbme == null)
    {
      localzbme = c(33158);
      if (localzbme == null) {
        return null;
      }
    }
    if (localzbme.c() == 4) {
      return (byte[])localzbme.d();
    }
    return null;
  }
  
  String e(int paramInt)
  {
    zbme localzbme = c(paramInt);
    if (localzbme == null) {
      return "";
    }
    switch (localzbme.c())
    {
    case 2: 
      return (String)localzbme.d();
    case 4: 
      byte[] arrayOfByte = (byte[])localzbme.d();
      return Encoding.getUnicode().a(arrayOfByte, 0, arrayOfByte.length - 2);
    }
    return null;
  }
  
  int c(int paramInt1, int paramInt2)
  {
    zbme localzbme = c(paramInt1);
    if (localzbme == null) {
      return paramInt2;
    }
    Object localObject = localzbme.d();
    if ((localObject instanceof Color)) {
      return ((Color)localObject).toArgb() & 0xFFFFFF;
    }
    return ((Integer)localzbme.d()).intValue();
  }
  
  boolean a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    zbme localzbme = c(paramInt1);
    if (localzbme == null) {
      return paramBoolean;
    }
    long l = ((Integer)localzbme.d()).intValue();
    int i = 1 << paramInt2;
    if (((l & 0xFFFFFFFF) >> 16 & i) == 0L) {
      return paramBoolean;
    }
    return (l & 0xFFFFFFFF & i) != 0L;
  }
  
  void b(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    long l1 = 1 << paramInt2;
    zbme localzbme = c(paramInt1);
    if (localzbme == null)
    {
      localzbme = new zbme(paramInt1, 0, Integer.valueOf(0));
      this.a.put(Integer.valueOf(paramInt1), localzbme);
    }
    long l2 = zi.a(localzbme.d());
    long l3 = l1 << 16 & 0xFFFFFFFF;
    l2 &= ((l3 & 0xFFFFFFFF) + (l1 & 0xFFFFFFFF) ^ 0xFFFFFFFFFFFFFFFF);
    l2 |= (paramBoolean ? (l3 & 0xFFFFFFFF) + (l1 & 0xFFFFFFFF) : l1 << 16 & 0xFFFFFFFF);
    localzbme.a(Integer.valueOf((int)(l2 & 0xFFFFFFFF)));
  }
  
  float a(int paramInt, float paramFloat)
  {
    zbme localzbme = c(paramInt);
    if (localzbme == null) {
      return paramFloat;
    }
    int i = ((Integer)localzbme.d()).intValue();
    return (i >> 16) + (i & 0xFFFF) / 65536.0F;
  }
  
  void b(int paramInt, float paramFloat)
  {
    int i = (int)paramFloat;
    int j = (i << 16) + (int)((paramFloat - i) * 65536.0F);
    a(paramInt, 0, Integer.valueOf(j));
  }
  
  static int a(float paramFloat)
  {
    int i = (int)paramFloat;
    int j = (i << 16) + (int)((paramFloat - i) * 65536.0F);
    return j;
  }
  
  static float f(int paramInt)
  {
    return (paramInt >> 16) + (paramInt & 0xFFFF) / 65536.0F;
  }
  
  WorksheetCollection g()
  {
    if ((this.b instanceof zbqr)) {
      return ((zbqr)this.b).h().b();
    }
    if ((this.b instanceof FillFormat)) {
      return ((FillFormat)this.b).b.f.getWorksheets();
    }
    return null;
  }
  
  Color a(int paramInt, Color paramColor)
  {
    zbme localzbme = c(paramInt);
    if (localzbme == null) {
      return paramColor;
    }
    if (localzbme.c() == 1) {
      return (Color)localzbme.d();
    }
    int i = ((Integer)localzbme.d()).intValue();
    Color localColor = paramColor;
    switch (i >> 24 & 0xFF)
    {
    case 0: 
    case 2: 
    case 4: 
      localColor = Color.fromArgb(i & 0xFF, i >> 8 & 0xFF, i >> 16 & 0xFF);
      localzbme.a(localColor);
      localzbme.a(1);
      break;
    case 1: 
    case 8: 
      localColor = g().o().e(i & 0xFFFFFF);
      if (!zh.a(localColor))
      {
        localzbme.a(localColor);
        localzbme.a(1);
      }
      else
      {
        return paramColor;
      }
      break;
    case 16: 
      return paramColor;
    case 3: 
    case 5: 
    case 6: 
    case 7: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    case 14: 
    case 15: 
    default: 
      return paramColor;
    }
    return localColor;
  }
  
  boolean g(int paramInt)
  {
    zbme localzbme = c(paramInt);
    if (localzbme == null) {
      return true;
    }
    if (localzbme.c() == 1) {
      return zh.a((Color)localzbme.d());
    }
    int i = ((Integer)localzbme.d()).intValue();
    switch (i >> 24 & 0xFF)
    {
    case 1: 
    case 8: 
      return (i & 0xFFFFFF) >= 64;
    case 16: 
      return true;
    }
    return false;
  }
  
  int a(Shape paramShape, byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    int i = 3;
    i |= b() << 4;
    System.arraycopy(zc.a(i), 0, paramArrayOfByte, paramInt, 2);
    if (paramBoolean)
    {
      paramArrayOfByte[(paramInt + 2)] = 34;
      paramArrayOfByte[(paramInt + 3)] = -15;
    }
    else
    {
      paramArrayOfByte[(paramInt + 2)] = 11;
      paramArrayOfByte[(paramInt + 3)] = -16;
    }
    int j = d();
    System.arraycopy(zc.a(j), 0, paramArrayOfByte, paramInt + 4, 4);
    paramInt += 8;
    ArrayList localArrayList = c();
    int k = paramInt + localArrayList.size() * 6;
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      zbme localzbme = (zbme)localIterator.next();
      System.arraycopy(zc.a(localzbme.b()), 0, paramArrayOfByte, paramInt, 2);
      switch (localzbme.c())
      {
      case 1: 
        Color localColor = (Color)localzbme.d();
        if (zh.a(localColor))
        {
          switch (localzbme.b())
          {
          case 448: 
            paramArrayOfByte[(paramInt + 2)] = 64;
            break;
          }
          paramArrayOfByte[(paramInt + 5)] = 8;
        }
        else
        {
          paramArrayOfByte[(paramInt + 2)] = zh.b(localColor);
          paramArrayOfByte[(paramInt + 3)] = zh.c(localColor);
          paramArrayOfByte[(paramInt + 4)] = zh.d(localColor);
        }
        break;
      case 0: 
        if ((localzbme.b() & 0xFFFF) == 4)
        {
          double d = f(((Integer)localzbme.d()).intValue());
          if ((paramShape != null) && ((paramShape.isFlippedHorizontally() ^ paramShape.isFlippedVertically())))
          {
            d = -d;
            if (d < 0.0D) {
              d += 360.0D;
            }
          }
          int m = a((float)d);
          zi.a(paramArrayOfByte, paramInt + 2, m);
        }
        else
        {
          zi.a(paramArrayOfByte, paramInt + 2, zi.c(localzbme.d()));
        }
        break;
      case 4: 
        byte[] arrayOfByte1 = (byte[])localzbme.d();
        System.arraycopy(zc.a(arrayOfByte1.length), 0, paramArrayOfByte, paramInt + 2, 4);
        System.arraycopy(arrayOfByte1, 0, paramArrayOfByte, k, arrayOfByte1.length);
        k += arrayOfByte1.length;
        break;
      case 2: 
        byte[] arrayOfByte2 = Encoding.getUnicode().a((String)localzbme.d());
        System.arraycopy(zc.a(arrayOfByte2.length + 2), 0, paramArrayOfByte, paramInt + 2, 4);
        System.arraycopy(arrayOfByte2, 0, paramArrayOfByte, k, arrayOfByte2.length);
        k += arrayOfByte2.length + 2;
        break;
      case 5: 
        byte[] arrayOfByte3 = (byte[])localzbme.d();
        if (((localzbme.b() & 0xFFFF) == 49477) && (arrayOfByte3.length == 6)) {
          paramArrayOfByte[(paramInt + 2)] = 6;
        } else {
          System.arraycopy(zc.a(arrayOfByte3.length - 6), 0, paramArrayOfByte, paramInt + 2, 4);
        }
        System.arraycopy(arrayOfByte3, 0, paramArrayOfByte, k, arrayOfByte3.length);
        k += arrayOfByte3.length;
      }
      paramInt += 6;
    }
    return j + 8;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaum.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */