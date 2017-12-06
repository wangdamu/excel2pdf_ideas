package com.aspose.cells;

import com.aspose.cells.a.f.zi;
import com.aspose.cells.a.f.zj;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;

class zbqr
{
  private Shape a;
  private zsc b;
  private zbqp c;
  private zaum d;
  private zkx e;
  private zaum f;
  private ArrayList g;
  
  zbqr(Shape paramShape, zsc paramzsc)
  {
    this.a = paramShape;
    this.b = paramzsc;
    this.c = new zbqp(paramShape.getMsoDrawingType(), 1025, 2560);
  }
  
  Shape a()
  {
    return this.a;
  }
  
  byte[] b()
  {
    int i = 50089;
    byte[] arrayOfByte = this.a.R().d().d(i);
    if ((arrayOfByte == null) && (this.a.R().e() != null)) {
      arrayOfByte = this.a.R().g().d(i);
    }
    return arrayOfByte;
  }
  
  void a(byte[] paramArrayOfByte)
  {
    int i = 50089;
    this.a.R().g().a(i, 4, paramArrayOfByte);
  }
  
  ArrayList c()
  {
    if (this.g == null) {
      this.g = new ArrayList();
    }
    return this.g;
  }
  
  void a(zbqr paramzbqr, CopyOptions paramCopyOptions)
  {
    if (paramzbqr.d != null) {
      d().a(paramzbqr.d());
    }
    if (paramzbqr.f != null) {
      g().a(paramzbqr.f);
    }
    Object localObject;
    if (paramzbqr.e != null) {
      if (paramCopyOptions.i)
      {
        i().a(paramzbqr.i());
      }
      else
      {
        localObject = new zky();
        ((zky)localObject).a = paramzbqr.i().e();
        ((zky)localObject).f = paramzbqr.i().i();
        ((zky)localObject).h = paramzbqr.i().f();
        ((zky)localObject).g = paramzbqr.i().o();
        ((zky)localObject).i = paramzbqr.i().l();
        ((zky)localObject).b = paramzbqr.i().j();
        ((zky)localObject).c = paramzbqr.i().g();
        ((zky)localObject).d = paramzbqr.i().m();
        ((zky)localObject).e = paramzbqr.i().p();
        i().c = ((zky)localObject);
      }
    }
    if (paramzbqr.c != null) {
      j().a(paramzbqr.c, paramCopyOptions);
    }
    if ((paramzbqr.g != null) && (paramzbqr.g.size() != 0))
    {
      this.g = new ArrayList();
      localObject = paramzbqr.g.iterator();
      while (((Iterator)localObject).hasNext())
      {
        byte[] arrayOfByte1 = (byte[])((Iterator)localObject).next();
        byte[] arrayOfByte2 = new byte[arrayOfByte1.length];
        System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte2.length);
        zf.a(this.g, arrayOfByte2);
      }
    }
  }
  
  zaum d()
  {
    if (this.d == null) {
      this.d = new zaum(this);
    }
    return this.d;
  }
  
  zaum e()
  {
    return this.f;
  }
  
  void f()
  {
    this.f = null;
  }
  
  zaum g()
  {
    if (this.f == null) {
      this.f = new zaum(this);
    }
    return this.f;
  }
  
  zsc h()
  {
    return this.b;
  }
  
  zkx i()
  {
    if (this.e == null) {
      this.e = new zkx(this);
    }
    return this.e;
  }
  
  void a(zkx paramzkx)
  {
    this.e = paramzkx;
  }
  
  zbqp j()
  {
    return this.c;
  }
  
  int k()
  {
    int i = 0;
    if (this.c != null) {
      i += j().g() + 8;
    }
    if (!this.a.V()) {
      i += i().c() + 8;
    }
    if (this.d != null) {
      i += d().d() + 8;
    }
    if ((this.f != null) && (this.f.b() > 0)) {
      i += this.f.d() + 8;
    }
    if (this.a.isGroup()) {
      i += 24;
    }
    if (this.a.F()) {
      i += 8;
    }
    if (this.g != null)
    {
      Iterator localIterator = this.g.iterator();
      while (localIterator.hasNext())
      {
        byte[] arrayOfByte = (byte[])localIterator.next();
        i += arrayOfByte.length;
      }
    }
    return i;
  }
  
  boolean l()
  {
    zbme localzbme = d().c(49478);
    return localzbme != null;
  }
  
  void a(ShapePathCollection paramShapePathCollection)
  {
    zbme localzbme1 = d().c(49477);
    zbme localzbme2 = d().c(49478);
    if (localzbme2 == null) {
      return;
    }
    ShapePathPointCollection localShapePathPointCollection = new ShapePathPointCollection();
    if (localzbme1 != null)
    {
      arrayOfByte = (byte[])localzbme1.d();
      i = zc.e(arrayOfByte, 0) & 0xFFFF;
      j = 0;
      if (((arrayOfByte[4] & 0xFF) == 240) && ((arrayOfByte[5] & 0xFF) == 255)) {
        j = 1;
      }
      k = 6;
      for (int m = 0; m < i; m++) {
        if (j != 0)
        {
          localShapePathPointCollection.a(new ShapePathPoint(Integer.valueOf(zc.b(arrayOfByte, k)), Integer.valueOf(zc.b(arrayOfByte, k + 2))));
          k += 4;
        }
        else
        {
          localShapePathPointCollection.a(new ShapePathPoint(Integer.valueOf(zc.a(arrayOfByte, k)), Integer.valueOf(zc.a(arrayOfByte, k + 4))));
          k += 8;
        }
      }
    }
    byte[] arrayOfByte = (byte[])localzbme2.d();
    int i = zc.e(arrayOfByte, 0) & 0xFFFF;
    int j = 6;
    int k = 0;
    ShapePath localShapePath = new ShapePath();
    for (int n = 0; n < i; n++)
    {
      int i1 = ztr.j((arrayOfByte[(j + 1)] & 0xFF & 0xE0) >> 5);
      if (i1 != 7)
      {
        int i2 = ((arrayOfByte[(j + 1)] & 0xFF & 0x1F) << 8) + (arrayOfByte[j] & 0xFF);
        int i3;
        ShapeSegmentPath localShapeSegmentPath;
        switch (i1)
        {
        case 0: 
          for (i3 = 0; i3 < i2; i3++)
          {
            if (k + 1 > localShapePathPointCollection.getCount() - 1)
            {
              paramShapePathCollection.clear();
              break;
            }
            localShapeSegmentPath = new ShapeSegmentPath(0);
            localShapeSegmentPath.getPoints().a(localShapePathPointCollection.get(k++));
            localShapeSegmentPath.getPoints().a(localShapePathPointCollection.get(k));
            localShapePath.a(localShapeSegmentPath);
          }
          break;
        case 1: 
          for (i3 = 0; i3 < i2; i3++)
          {
            if (k + 3 > localShapePathPointCollection.getCount() - 1)
            {
              paramShapePathCollection.clear();
              break;
            }
            localShapeSegmentPath = new ShapeSegmentPath(1);
            localShapeSegmentPath.getPoints().a(localShapePathPointCollection.get(k++));
            localShapeSegmentPath.getPoints().a(localShapePathPointCollection.get(k++));
            localShapeSegmentPath.getPoints().a(localShapePathPointCollection.get(k++));
            localShapeSegmentPath.getPoints().a(localShapePathPointCollection.get(k));
            localShapePath.a(localShapeSegmentPath);
          }
          break;
        case 2: 
          localShapeSegmentPath = new ShapeSegmentPath(2);
          localShapeSegmentPath.getPoints().a(localShapePathPointCollection.get(k));
          localShapePath.a(localShapeSegmentPath);
          break;
        case 4: 
          localShapeSegmentPath = new ShapeSegmentPath(4);
          localShapePath.a(localShapeSegmentPath);
          k++;
          paramShapePathCollection.a(localShapePath);
          localShapePath = new ShapePath();
          break;
        case 3: 
          localShapeSegmentPath = new ShapeSegmentPath(3);
          localShapePath.a(localShapeSegmentPath);
          break;
        case 5: 
          i3 = arrayOfByte[(j + 1)] & 0xFF & 0x1F;
          if (i3 == 10)
          {
            localShapePath.b = 4;
            localShapePath.a = false;
          }
          else if (i3 == 11)
          {
            localShapePath.c = false;
            localShapePath.a = false;
          }
          break;
        }
      }
      j += 2;
    }
  }
  
  void m()
    throws Exception
  {
    Geometry localGeometry = this.a.an();
    Object localObject2;
    if ((this.a.getAutoShapeType() == 0) && (localGeometry != null) && (localGeometry.a()) && (((CustomGeometry)localGeometry).c() != null))
    {
      localObject1 = ((CustomGeometry)localGeometry).c();
      ((ShapePathCollection)localObject1).b();
      d().a(320, 0, Integer.valueOf(0));
      d().a(321, 0, Integer.valueOf(0));
      d().a(322, 0, Integer.valueOf((int)((ShapePathCollection)localObject1).b));
      d().a(323, 0, Integer.valueOf((int)((ShapePathCollection)localObject1).a));
      d().a(324, 0, Integer.valueOf(4));
      localObject2 = new ShapePathPointCollection();
      Object localObject3;
      for (int i = 0; i < ((ShapePathCollection)localObject1).getCount(); i++)
      {
        ShapePath localShapePath1 = ((ShapePathCollection)localObject1).get(i);
        for (k = 0; k < localShapePath1.getPathSegementList().getCount(); k++)
        {
          localObject3 = localShapePath1.getPathSegementList().get(k);
          switch (((ShapeSegmentPath)localObject3).getType())
          {
          case 2: 
            if (k == 0) {
              ((ShapePathPointCollection)localObject2).a(((ShapeSegmentPath)localObject3).getPoints().get(0));
            }
            break;
          case 0: 
            ((ShapePathPointCollection)localObject2).a(((ShapeSegmentPath)localObject3).getPoints().get(1));
            break;
          case 1: 
            ((ShapePathPointCollection)localObject2).a(((ShapeSegmentPath)localObject3).getPoints().get(1));
            ((ShapePathPointCollection)localObject2).a(((ShapeSegmentPath)localObject3).getPoints().get(2));
            ((ShapePathPointCollection)localObject2).a(((ShapeSegmentPath)localObject3).getPoints().get(3));
          }
        }
      }
      if (((ShapePathPointCollection)localObject2).getCount() > 0)
      {
        if (((ShapePathCollection)localObject1).c) {
          arrayOfByte = new byte[4 * ((ShapePathPointCollection)localObject2).getCount() + 6];
        } else {
          arrayOfByte = new byte[8 * ((ShapePathPointCollection)localObject2).getCount() + 6];
        }
        System.arraycopy(zc.a(((ShapePathPointCollection)localObject2).getCount()), 0, arrayOfByte, 0, 2);
        System.arraycopy(zc.a(((ShapePathPointCollection)localObject2).getCount()), 0, arrayOfByte, 2, 2);
        if (((ShapePathCollection)localObject1).c)
        {
          arrayOfByte[4] = -16;
          arrayOfByte[5] = -1;
        }
        else
        {
          System.arraycopy(zc.a(8), 0, arrayOfByte, 4, 2);
        }
        j = 6;
        for (k = 0; k < ((ShapePathPointCollection)localObject2).getCount(); k++)
        {
          localObject3 = ((ShapePathPointCollection)localObject2).get(k);
          if (((ShapePathCollection)localObject1).c)
          {
            System.arraycopy(zc.a(((ShapePathPoint)localObject3).getX()), 0, arrayOfByte, j, 2);
            System.arraycopy(zc.a(((ShapePathPoint)localObject3).getY()), 0, arrayOfByte, j + 2, 2);
            j += 4;
          }
          else
          {
            System.arraycopy(zc.a(((ShapePathPoint)localObject3).getX()), 0, arrayOfByte, j, 4);
            System.arraycopy(zc.a(((ShapePathPoint)localObject3).getY()), 0, arrayOfByte, j + 4, 4);
            j += 8;
          }
        }
        d().a(49477, 5, arrayOfByte);
      }
      byte[] arrayOfByte = new byte[((ShapePathCollection)localObject1).a() + 6];
      int k = ((ShapePathCollection)localObject1).a() / 2;
      System.arraycopy(zc.a(k), 0, arrayOfByte, 0, 2);
      System.arraycopy(zc.a(k), 0, arrayOfByte, 2, 2);
      System.arraycopy(zc.a(2), 0, arrayOfByte, 4, 2);
      int j = 6;
      for (int m = 0; m < ((ShapePathCollection)localObject1).getCount(); m++)
      {
        ShapePath localShapePath2 = ((ShapePathCollection)localObject1).get(m);
        for (int n = 0; n < localShapePath2.getPathSegementList().getCount(); n++)
        {
          ShapeSegmentPath localShapeSegmentPath = localShapePath2.getPathSegementList().get(n);
          int i1 = 0;
          int i2 = ztr.k(localShapeSegmentPath.getType());
          switch (localShapeSegmentPath.getType())
          {
          case 0: 
            i1 = 1;
            break;
          case 1: 
            i1 = 1;
            break;
          case 3: 
            i1 = 1;
            break;
          }
          System.arraycopy(zc.a((i2 << 13) + i1), 0, arrayOfByte, j, 2);
          j += 2;
          if (localShapeSegmentPath.getType() == 2)
          {
            if (localShapePath2.b == 4)
            {
              arrayOfByte[(j++)] = 0;
              arrayOfByte[(j++)] = -86;
            }
            if (!localShapePath2.c)
            {
              arrayOfByte[(j++)] = 0;
              arrayOfByte[(j++)] = -85;
            }
          }
        }
      }
      d().a(49478, 5, arrayOfByte);
    }
    Object localObject1 = new zaqb(this.a);
    ((zaqb)localObject1).i();
    if ((this.a.x != null) && (this.a.x.getTextAlignment().f != null)) {
      o();
    } else {
      q();
    }
    if ((!this.a.r) || ((this.a.q != null) && (this.a.q.b != null)))
    {
      localObject2 = new MsoLineFormatHelper(this.a);
      ((MsoLineFormatHelper)localObject2).a(this.a.B());
    }
    n();
  }
  
  private static void a(Shape paramShape)
    throws Exception
  {
    byte[] arrayOfByte = paramShape.R().b();
    if (arrayOfByte == null) {
      return;
    }
    zi localzi = zi.a(new com.aspose.cells.b.a.d.zh(arrayOfByte));
    com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh();
    zj localzj = new zj(localzh);
    localzj.b(6);
    localzj.d(0);
    Iterator localIterator = localzi.iterator();
    while (localIterator.hasNext())
    {
      com.aspose.cells.a.f.zh localzh1 = (com.aspose.cells.a.f.zh)localIterator.next();
      if (!localzh1.c())
      {
        String str = localzh1.b();
        if (str.endsWith("downrev.xml"))
        {
          zm localzm = localzi.a(localzh1);
          zcjm localzcjm = zauz.a(localzm, null, true);
          zcjn localzcjn = (zcjn)localzcjm.m();
          zcjg localzcjg = localzcjn.e().a("shapeCheckSum");
          if (localzcjg != null) {
            localzcjg.h = "";
          } else {
            localzcjn.e().a("shapeCheckSum", "");
          }
          localzcjn = (zcjn)localzcjm.m();
          localzcjg = localzcjn.e().a("textCheckSum");
          if (localzcjg != null) {
            localzcjg.h = "";
          } else {
            localzcjn.e().a("textCheckSum", "");
          }
          zcjz localzcjz = zauy.a(str, localzj, true);
          localzcjm.b(localzcjz);
          localzcjz.e();
        }
        else
        {
          zvw.a(localzi, localzh1, localzj, str);
        }
      }
    }
    localzj.b();
    localzj.f_();
    localzh.b();
    paramShape.R().a(localzh.o());
  }
  
  private void n()
    throws Exception
  {
    if (!this.a.C()) {
      return;
    }
    if (!zw.b(this.a.o))
    {
      a(this.a);
      return;
    }
    XlsSaveOptions localXlsSaveOptions = new XlsSaveOptions(5);
    com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh();
    zvv.a(this.a, localzh, localXlsSaveOptions);
    localzh.b();
    a(localzh.o());
    localzh.a();
  }
  
  private void o() {}
  
  private void p()
  {
    d().a(384, 447);
  }
  
  private void q()
  {
    FillFormat localFillFormat = this.a.a(1, true);
    if (localFillFormat == null) {
      return;
    }
    p();
    MsoFillFormatHelper localMsoFillFormatHelper = new MsoFillFormatHelper(this.a, d(), this.a.P().p());
    if (localFillFormat.getFillType() == 0)
    {
      d().a(385, 0, Integer.valueOf(134217793));
      switch (this.a.getMsoDrawingType())
      {
      case 4: 
      case 8: 
      case 24: 
        break;
      default: 
        if ((this.a.x() == null) || (this.a.x().d == null)) {
          break;
        }
        localMsoFillFormatHelper.a(0);
        localMsoFillFormatHelper.setForeColor(this.a.x().d.b.b(this.a.P().p()));
        break;
      }
    }
    else if (localFillFormat.getFillType() == 1)
    {
      d().a(447, 0, Integer.valueOf(1048576));
    }
    else if (localFillFormat.getFillType() == 2)
    {
      localMsoFillFormatHelper.a(0);
      localMsoFillFormatHelper.setForeColor(localFillFormat.getSolidFill().getColor());
      localMsoFillFormatHelper.setForeColorTransparency(localFillFormat.getSolidFill().getTransparency());
    }
    else
    {
      Object localObject;
      if (localFillFormat.getFillType() == 5)
      {
        localObject = MsoFillFormatHelper.g(localFillFormat.getPatternFill().getPattern());
        if (localObject == null) {
          return;
        }
        localMsoFillFormatHelper.a(1);
        localMsoFillFormatHelper.a((byte[])localObject);
        localMsoFillFormatHelper.setForeColor(localFillFormat.getPatternFill().getForegroundColor());
        localMsoFillFormatHelper.setForeColorTransparency(localFillFormat.getPatternFill().getForeTransparency());
        localMsoFillFormatHelper.setBackColor(localFillFormat.getPatternFill().getBackgroundColor());
        localMsoFillFormatHelper.c(localFillFormat.getPatternFill().getBackTransparency());
      }
      else if (localFillFormat.getFillType() == 4)
      {
        localObject = localFillFormat.getTextureFill();
        if (((TextureFill)localObject).getType() == 24) {
          localMsoFillFormatHelper.a(3);
        } else {
          localMsoFillFormatHelper.a(2);
        }
        if (((TextureFill)localObject).c != -1) {
          localMsoFillFormatHelper.c(((TextureFill)localObject).c + 1);
        } else if (((TextureFill)localObject).b() != null) {
          localMsoFillFormatHelper.a(((TextureFill)localObject).b().e());
        }
        localMsoFillFormatHelper.setForeColorTransparency(((TextureFill)localObject).getTransparency());
      }
      else if (localFillFormat.getFillType() == 3)
      {
        localObject = localFillFormat.getGradientFill();
        Workbook localWorkbook = ((GradientFill)localObject).e;
        zapw localzapw = new zapw((GradientFill)localObject);
        byte[] arrayOfByte = localzapw.b;
        if (arrayOfByte != null) {
          localMsoFillFormatHelper.c(arrayOfByte);
        }
        localMsoFillFormatHelper.a(4);
        GradientStop localGradientStop = localzapw.e();
        localMsoFillFormatHelper.setForeColor(localGradientStop.a.b(localWorkbook));
        localMsoFillFormatHelper.setForeColorTransparency(localGradientStop.getTransparency());
        localGradientStop = localzapw.f();
        localMsoFillFormatHelper.setBackColor(localGradientStop.a.b(localWorkbook));
        localMsoFillFormatHelper.c(localGradientStop.getTransparency());
        localMsoFillFormatHelper.a((float)localzapw.c());
        localMsoFillFormatHelper.b(localzapw.d() / 100.0F);
        double[] arrayOfDouble = localzapw.b();
        if (arrayOfDouble != null)
        {
          if (arrayOfDouble[0] != 0.0D) {
            localMsoFillFormatHelper.d((float)arrayOfDouble[0]);
          }
          if (arrayOfDouble[1] != 0.0D) {
            localMsoFillFormatHelper.e((float)arrayOfDouble[1]);
          }
          if (arrayOfDouble[2] != 0.0D) {
            localMsoFillFormatHelper.f((float)arrayOfDouble[2]);
          }
          if (arrayOfDouble[3] != 0.0D) {
            localMsoFillFormatHelper.g((float)arrayOfDouble[3]);
          }
        }
        if (localzapw.a) {
          localMsoFillFormatHelper.f(1073741827);
        }
      }
    }
  }
  
  int a(byte[] paramArrayOfByte, int paramInt, zbrf paramzbrf)
  {
    paramArrayOfByte[paramInt] = 15;
    paramArrayOfByte[(paramInt + 2)] = 4;
    paramArrayOfByte[(paramInt + 3)] = -16;
    System.arraycopy(zc.a(k()), 0, paramArrayOfByte, paramInt + 4, 4);
    paramInt += 8;
    int i = 0;
    if (this.a.isGroup())
    {
      paramArrayOfByte[paramInt] = 1;
      paramArrayOfByte[(paramInt + 2)] = 9;
      paramArrayOfByte[(paramInt + 3)] = -16;
      paramArrayOfByte[(paramInt + 4)] = 16;
      paramInt += 8;
      System.arraycopy(zc.a(paramzbrf.a), 0, paramArrayOfByte, paramInt, 4);
      System.arraycopy(zc.a(paramzbrf.c), 0, paramArrayOfByte, paramInt + 4, 4);
      System.arraycopy(zc.a(paramzbrf.b + paramzbrf.a), 0, paramArrayOfByte, paramInt + 8, 4);
      System.arraycopy(zc.a(paramzbrf.d + paramzbrf.c), 0, paramArrayOfByte, paramInt + 12, 4);
      paramInt += 16;
    }
    if (this.c != null)
    {
      i = 2;
      i |= j().b() << 4;
      System.arraycopy(zc.a(i), 0, paramArrayOfByte, paramInt, 2);
      paramArrayOfByte[(paramInt + 2)] = 10;
      paramArrayOfByte[(paramInt + 3)] = -16;
      paramArrayOfByte[(paramInt + 4)] = 8;
      paramInt += 8;
      System.arraycopy(zc.a(j().c()), 0, paramArrayOfByte, paramInt, 4);
      System.arraycopy(zc.a(j().d()), 0, paramArrayOfByte, paramInt + 4, 4);
      paramInt += 8;
    }
    if (this.d != null) {
      paramInt += d().a(this.a, paramArrayOfByte, paramInt, false);
    }
    if ((this.f != null) && (this.f.b() > 0)) {
      paramInt += this.f.a(this.a, paramArrayOfByte, paramInt, true);
    }
    if (this.g != null)
    {
      Iterator localIterator = this.g.iterator();
      while (localIterator.hasNext())
      {
        byte[] arrayOfByte = (byte[])localIterator.next();
        System.arraycopy(arrayOfByte, 0, paramArrayOfByte, paramInt, arrayOfByte.length);
        paramInt += arrayOfByte.length;
      }
    }
    return paramInt;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbqr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */