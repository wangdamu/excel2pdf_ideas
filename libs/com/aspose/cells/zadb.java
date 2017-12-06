package com.aspose.cells;

import com.aspose.cells.a.c.zh;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;
import java.util.Iterator;

class zadb
  extends zcd
{
  ArrayList a;
  
  zadb()
  {
    c(4198);
  }
  
  void a(FillFormat paramFillFormat)
  {
    switch (paramFillFormat.getFillType())
    {
    case 4: 
      if (paramFillFormat.getTexture() == 24) {
        a(paramFillFormat.getTextureFill().c());
      } else {
        a(paramFillFormat.getTexture());
      }
      break;
    case 5: 
      b(paramFillFormat);
      break;
    case 3: 
      if (paramFillFormat.getGradientFill().getGradientStops().getCount() != 0) {
        c(paramFillFormat);
      }
      break;
    case 2: 
      d(paramFillFormat);
    }
  }
  
  private void a(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte1 = g();
    int i = a() + paramArrayOfByte.length + arrayOfByte1.length;
    if (i > 8224) {
      a((short)8224);
    } else {
      a((short)i);
    }
    this.b = new byte[d()];
    int j = a();
    System.arraycopy(c(), 0, this.b, 0, a());
    System.arraycopy(zc.a(i - 8 - arrayOfByte1.length), 0, this.b, 4, 4);
    this.b[10] = 3;
    System.arraycopy(zc.a(paramArrayOfByte.length), 0, this.b, b(), 4);
    if (i <= 8224)
    {
      System.arraycopy(paramArrayOfByte, 0, this.b, j, paramArrayOfByte.length);
      System.arraycopy(arrayOfByte1, 0, this.b, j + paramArrayOfByte.length, arrayOfByte1.length);
    }
    else
    {
      this.a = new ArrayList();
      int k = 8224 - j;
      if (k > paramArrayOfByte.length)
      {
        System.arraycopy(paramArrayOfByte, 0, this.b, j, paramArrayOfByte.length);
        System.arraycopy(arrayOfByte1, 0, this.b, paramArrayOfByte.length, k - paramArrayOfByte.length);
      }
      else
      {
        System.arraycopy(paramArrayOfByte, 0, this.b, j, 8224 - j);
      }
      byte[] arrayOfByte2 = null;
      int m = 0;
      while (k < paramArrayOfByte.length + arrayOfByte1.length)
      {
        m = paramArrayOfByte.length + arrayOfByte1.length - k;
        znt localznt = new znt();
        zf.a(this.a, localznt);
        if (m <= 8224)
        {
          arrayOfByte2 = new byte[m];
          if (m <= arrayOfByte1.length)
          {
            System.arraycopy(arrayOfByte1, arrayOfByte1.length - m, arrayOfByte2, 0, m);
          }
          else
          {
            System.arraycopy(paramArrayOfByte, k, arrayOfByte2, 0, m - arrayOfByte1.length);
            System.arraycopy(arrayOfByte1, 0, arrayOfByte2, m - arrayOfByte1.length, arrayOfByte1.length);
          }
          localznt.b(arrayOfByte2);
          k = paramArrayOfByte.length + arrayOfByte1.length;
        }
        else
        {
          arrayOfByte2 = new byte['†'];
          if (k + 8224 > paramArrayOfByte.length)
          {
            System.arraycopy(paramArrayOfByte, k, arrayOfByte2, 0, paramArrayOfByte.length - k);
            System.arraycopy(arrayOfByte1, 0, arrayOfByte2, paramArrayOfByte.length - k, 8224 + k - paramArrayOfByte.length);
          }
          else
          {
            System.arraycopy(paramArrayOfByte, k, arrayOfByte2, 0, 8224);
          }
          localznt.b(arrayOfByte2);
          k += 8224;
        }
      }
    }
  }
  
  void a(int paramInt)
  {
    byte[] arrayOfByte = zxh.a(paramInt);
    if (arrayOfByte == null) {
      return;
    }
    a((short)(arrayOfByte.length + a()));
    this.b = new byte[d()];
    System.arraycopy(c(), 0, this.b, 0, a());
    System.arraycopy(arrayOfByte, 0, this.b, a(), arrayOfByte.length);
    System.arraycopy(zc.a((short)(d() - 8)), 0, this.b, 4, 2);
    this.b[10] = 2;
    System.arraycopy(zc.a(arrayOfByte.length), 0, this.b, b(), 4);
  }
  
  void b(FillFormat paramFillFormat)
  {
    byte[] arrayOfByte = MsoFillFormatHelper.g(paramFillFormat.getPattern());
    if (arrayOfByte == null) {
      return;
    }
    a((short)(arrayOfByte.length + a()));
    this.b = new byte[d()];
    System.arraycopy(c(), 0, this.b, 0, a());
    System.arraycopy(arrayOfByte, 0, this.b, a(), arrayOfByte.length);
    System.arraycopy(zc.a((short)(d() - 8)), 0, this.b, 4, 2);
    this.b[10] = 1;
    System.arraycopy(zc.a(arrayOfByte.length), 0, this.b, b(), 4);
    a(16, paramFillFormat.getPatternFill().getForegroundColor());
    a(28, paramFillFormat.getPatternFill().getBackgroundColor());
  }
  
  void a(Area paramArea)
  {
    a((short)a());
    this.b = new byte[d()];
    System.arraycopy(c(), 0, this.b, 0, a());
    System.arraycopy(zc.a((short)(d() - 8)), 0, this.b, 4, 2);
    a(16, paramArea.getForegroundColor());
    a(22, (float)paramArea.getTransparency());
    a(28, paramArea.getBackgroundColor());
  }
  
  private void d(FillFormat paramFillFormat)
  {
    a((short)a());
    this.b = new byte[d()];
    System.arraycopy(c(), 0, this.b, 0, a());
    System.arraycopy(zc.a((short)(d() - 8)), 0, this.b, 4, 2);
    a(16, paramFillFormat.getSolidFill().getColor());
    a(22, (float)paramFillFormat.getSolidFill().getTransparency());
    a(28, Color.getEmpty());
  }
  
  private void a(int paramInt, Color paramColor)
  {
    this.b[paramInt] = zh.b(paramColor);
    this.b[(paramInt + 1)] = zh.c(paramColor);
    this.b[(paramInt + 2)] = zh.d(paramColor);
  }
  
  private void a(int paramInt, float paramFloat)
  {
    int i = zaum.a(1.0F - paramFloat);
    System.arraycopy(zc.a(i), 0, this.b, paramInt, 4);
  }
  
  void c(FillFormat paramFillFormat)
  {
    zapw localzapw = new zapw(paramFillFormat.getGradientFill());
    byte[] arrayOfByte = localzapw.b;
    if (arrayOfByte != null)
    {
      a((short)(a() + arrayOfByte.length));
      this.b = new byte[d()];
      System.arraycopy(arrayOfByte, 0, this.b, a(), arrayOfByte.length);
    }
    else
    {
      b(188);
      this.b = new byte[d()];
    }
    this.b[0] = -29;
    this.b[1] = 1;
    this.b[2] = 11;
    this.b[3] = -16;
    System.arraycopy(zc.a((short)(d() - 8)), 0, this.b, 4, 2);
    this.b[8] = Byte.MIN_VALUE;
    this.b[9] = 1;
    switch (localzapw.a())
    {
    case 5: 
      this.b[10] = 5;
      break;
    case 6: 
      this.b[10] = 6;
      break;
    default: 
      this.b[10] = 7;
    }
    a(this.b, 14, 385, localzapw.e(), paramFillFormat.b.f);
    a(this.b, 26, 387, localzapw.f(), paramFillFormat.b.f);
    this.b[38] = -123;
    this.b[39] = 1;
    this.b[40] = -12;
    this.b[43] = 16;
    this.b[44] = -122;
    this.b[45] = -63;
    this.b[50] = -121;
    this.b[51] = -63;
    this.b[56] = -120;
    this.b[57] = 1;
    this.b[62] = -119;
    this.b[63] = 1;
    this.b[68] = -118;
    this.b[69] = 1;
    this.b[74] = -117;
    this.b[75] = 1;
    System.arraycopy(zc.a(zaum.a((float)localzapw.c())), 0, this.b, 76, 4);
    this.b[80] = -116;
    this.b[81] = 1;
    System.arraycopy(zc.a(localzapw.d()), 0, this.b, 82, 2);
    double[] arrayOfDouble = localzapw.b();
    this.b[86] = -115;
    this.b[87] = 1;
    System.arraycopy(zc.a(zaum.a((float)arrayOfDouble[0])), 0, this.b, 88, 4);
    this.b[92] = -114;
    this.b[93] = 1;
    System.arraycopy(zc.a(zaum.a((float)arrayOfDouble[1])), 0, this.b, 94, 4);
    this.b[98] = -113;
    this.b[99] = 1;
    System.arraycopy(zc.a(zaum.a((float)arrayOfDouble[2])), 0, this.b, 100, 4);
    this.b[104] = -112;
    this.b[105] = 1;
    System.arraycopy(zc.a(zaum.a((float)arrayOfDouble[3])), 0, this.b, 106, 4);
    this.b[110] = -111;
    this.b[111] = 1;
    this.b[116] = -110;
    this.b[117] = 1;
    this.b[122] = -109;
    this.b[123] = 1;
    this.b[''] = -108;
    this.b[''] = 1;
    this.b[''] = -107;
    this.b[''] = 1;
    this.b[''] = -106;
    this.b[''] = 1;
    this.b[''] = -105;
    this.b[''] = -63;
    if (arrayOfByte != null) {
      System.arraycopy(zc.a(arrayOfByte.length), 0, this.b, 148, 4);
    }
    this.b[''] = -104;
    this.b[''] = 1;
    this.b[''] = -103;
    this.b[''] = 1;
    this.b['¤'] = -102;
    this.b['¥'] = 1;
    this.b['ª'] = -101;
    this.b['«'] = 1;
    this.b['°'] = -100;
    this.b['±'] = 1;
    this.b['²'] = 3;
    this.b['µ'] = 64;
    this.b['¶'] = -65;
    this.b['·'] = 1;
    this.b['¸'] = 28;
    this.b['º'] = 31;
  }
  
  private void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, GradientStop paramGradientStop, Workbook paramWorkbook)
  {
    System.arraycopy(zc.a(paramInt2), 0, paramArrayOfByte, paramInt1, 2);
    a(paramInt1 + 2, paramGradientStop.a.b(paramWorkbook));
    paramInt1 += 6;
    System.arraycopy(zc.a(paramInt2 + 1), 0, paramArrayOfByte, paramInt1, 2);
    System.arraycopy(zc.a(zaum.a(1.0F - (float)paramGradientStop.getTransparency())), 0, this.b, paramInt1 + 2, 4);
    paramInt1 += 6;
  }
  
  int a()
  {
    return 188;
  }
  
  int b()
  {
    return 46;
  }
  
  private byte[] c()
  {
    return new byte[] { -29, 1, 11, -16, -76, 0, 0, 0, Byte.MIN_VALUE, 1, 0, 0, 0, 0, -127, 1, 0, 0, 0, 0, -126, 1, 0, 0, 1, 0, -125, 1, 0, 0, 0, 0, -124, 1, 0, 0, 1, 0, -123, 1, -12, 0, 0, 16, -122, -63, 0, 0, 0, 0, -121, -63, 0, 0, 0, 0, -120, 1, 0, 0, 0, 0, -119, 1, 0, 0, 0, 0, -118, 1, 0, 0, 0, 0, -117, 1, 0, 0, 0, 0, -116, 1, 100, 0, 0, 0, -115, 1, 0, 0, 0, 0, -114, 1, 0, 0, 0, 0, -113, 1, 0, 0, 0, 0, -112, 1, 0, 0, 0, 0, -111, 1, 0, 0, 0, 0, -110, 1, 0, 0, 0, 0, -109, 1, 0, 0, 0, 0, -108, 1, 0, 0, 0, 0, -107, 1, 0, 0, 0, 0, -106, 1, 0, 0, 0, 0, -105, -63, 0, 0, 0, 0, -104, 1, 0, 0, 0, 0, -103, 1, 0, 0, 0, 0, -102, 1, 0, 0, 0, 0, -101, 1, 0, 0, 0, 0, -100, 1, 11, 0, 0, 64, -65, 1, 28, 0, 31, 0 };
  }
  
  private byte[] g()
  {
    return new byte[] { 3, 0, 34, -15, 0, 0, 0, 0 };
  }
  
  void a(zrg paramzrg)
    throws Exception
  {
    if (this.b == null) {
      return;
    }
    paramzrg.a(f());
    paramzrg.a(d());
    paramzrg.a(this.b);
    if (this.a != null)
    {
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext())
      {
        znt localznt = (znt)localIterator.next();
        localznt.a(paramzrg);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zadb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */