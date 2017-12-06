package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;
import java.util.Iterator;

class zcfm
  extends zche
{
  private ArrayList a;
  
  zcfm()
  {
    this.d = 507;
  }
  
  void a(Style paramStyle, boolean paramBoolean, Workbook paramWorkbook)
  {
    this.a = new ArrayList();
    int i = 6;
    int i2;
    if ((paramStyle.q() != null) && (paramStyle.isModified(11)))
    {
      Font localFont = paramStyle.getFont();
      if (paramStyle.isModified(16))
      {
        int n = 0;
        boolean[] arrayOfBoolean = { n };
        i2 = localFont.a(false, arrayOfBoolean);
        n = arrayOfBoolean[0];
        zf.a(this.a, a(5, localFont.b(), i2, false, paramWorkbook));
      }
      if ((paramStyle.isModified(13)) && (localFont.getName() != null)) {
        zf.a(this.a, a(24, localFont.getName()));
      }
      if (paramStyle.isModified(17)) {
        zf.a(this.a, a(25, localFont.g()));
      }
      if (paramStyle.isModified(19)) {
        zf.a(this.a, a(26, zcij.d(localFont.getUnderline())));
      }
      if (paramStyle.isModified(23)) {
        zf.a(this.a, a(27, localFont.e()));
      }
      if (paramStyle.getFont().a() != null) {
        zf.a(this.a, a(37, zcij.b(paramStyle.getFont().a())));
      }
      if (paramStyle.isModified(18)) {
        zf.a(this.a, a(28, localFont.isItalic()));
      }
      if (paramStyle.isModified(20)) {
        zf.a(this.a, a(29, localFont.isStrikeout()));
      }
      if (paramStyle.isModified(14)) {
        zf.a(this.a, a(35, localFont.h()));
      }
      if (paramStyle.isModified(12)) {
        zf.a(this.a, b(36, localFont.j()));
      }
    }
    if (paramStyle.isModified(24))
    {
      int j = paramStyle.r();
      zf.a(this.a, a(38, paramStyle.s()));
      zf.a(this.a, a(41, j));
    }
    int k;
    if ((paramStyle.isModified(33)) || (paramStyle.isModified(34)) || (paramStyle.isModified(35)) || (paramStyle.isGradient())) {
      if (paramStyle.isGradient())
      {
        zpv localzpv = zpv.a(paramStyle);
        localObject2 = localzpv.c;
        zf.a(this.a, a(3, (zoy)localObject2));
        if (((zoy)localObject2).g != null)
        {
          int i1 = ((zoy)localObject2).g.length;
          for (i2 = 0; i2 < i1; i2++) {
            zf.a(this.a, a(4, localObject2.g[i2], localObject2.h[i2], paramWorkbook));
          }
        }
      }
      else
      {
        k = zcij.o(paramStyle.getPattern());
        if (paramStyle.isModified(33)) {
          zf.a(this.a, a(0, (byte)k));
        }
        if (paramStyle.isModified(34)) {
          zf.a(this.a, a(1, paramStyle.b, paramStyle.b(), false, paramWorkbook));
        }
        if (paramStyle.isModified(35)) {
          zf.a(this.a, a(2, paramStyle.a, paramStyle.a(), false, paramWorkbook));
        }
      }
    }
    if (paramStyle.isModified(31))
    {
      zf.a(this.a, a(15, (byte)zcij.h(paramStyle.getHorizontalAlignment())));
      zf.a(this.a, a(16, (byte)zcij.f(paramStyle.getVerticalAlignment())));
      k = paramStyle.getRotationAngle();
      if (k < 0) {
        k = 90 - k;
      }
      zf.a(this.a, a(17, (byte)k));
      zf.a(this.a, a(18, paramStyle.getIndentLevel()));
      if (paramStyle.getTextDirection() == 1) {
        zf.a(this.a, a(19, (byte)1));
      } else if (paramStyle.getTextDirection() == 2) {
        zf.a(this.a, a(19, (byte)2));
      }
      zf.a(this.a, a(20, paramStyle.isTextWrapped()));
      zf.a(this.a, a(22, paramStyle.getShrinkToFit()));
    }
    if ((paramStyle.isModified(1)) && (paramStyle.d() != null))
    {
      localObject1 = paramStyle.d();
      localObject2 = ((BorderCollection)localObject1).getByBorderType(4);
      if (paramStyle.isModified(4)) {
        zf.a(this.a, a(6, 4, (Border)localObject2, paramStyle, false, paramWorkbook));
      }
      localObject2 = ((BorderCollection)localObject1).getByBorderType(8);
      if (paramStyle.isModified(5)) {
        zf.a(this.a, a(7, 8, (Border)localObject2, paramStyle, false, paramWorkbook));
      }
      localObject2 = ((BorderCollection)localObject1).getByBorderType(1);
      if (paramStyle.isModified(2)) {
        zf.a(this.a, a(8, 1, (Border)localObject2, paramStyle, false, paramWorkbook));
      }
      localObject2 = ((BorderCollection)localObject1).getByBorderType(2);
      if (paramStyle.isModified(3)) {
        zf.a(this.a, a(9, 2, (Border)localObject2, paramStyle, false, paramWorkbook));
      }
      localObject2 = ((BorderCollection)localObject1).getByBorderType(32);
      if (paramStyle.isModified(10)) {
        zf.a(this.a, a(13, 32, (Border)localObject2, paramStyle, false, paramWorkbook));
      }
      localObject2 = ((BorderCollection)localObject1).getByBorderType(16);
      if (paramStyle.isModified(9)) {
        zf.a(this.a, a(14, 16, (Border)localObject2, paramStyle, false, paramWorkbook));
      }
    }
    if (paramStyle.isModified(36))
    {
      zf.a(this.a, a(43, paramStyle.isLocked()));
      zf.a(this.a, a(44, paramStyle.isFormulaHidden()));
    }
    Object localObject1 = this.a.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (byte[])((Iterator)localObject1).next();
      i += localObject2.length;
    }
    this.c = new byte[i];
    if (paramBoolean) {
      this.c[1] = Byte.MIN_VALUE;
    }
    int m = 2;
    m += 2;
    System.arraycopy(zc.a(this.a.size()), 0, this.c, m, 2);
    m += 2;
    Object localObject2 = this.a.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      byte[] arrayOfByte = (byte[])((Iterator)localObject2).next();
      System.arraycopy(arrayOfByte, 0, this.c, m, arrayOfByte.length);
      m += arrayOfByte.length;
    }
  }
  
  private byte[] a(int paramInt, double paramDouble, zaml paramzaml, Workbook paramWorkbook)
  {
    byte[] arrayOfByte = new byte[22];
    System.arraycopy(zc.a(paramInt), 0, arrayOfByte, 0, 2);
    arrayOfByte[2] = 22;
    System.arraycopy(zc.a(paramDouble), 0, arrayOfByte, 6, 8);
    a(arrayOfByte, 14, paramzaml, 64, paramWorkbook);
    return arrayOfByte;
  }
  
  private byte[] a(int paramInt, zoy paramzoy)
  {
    byte[] arrayOfByte = new byte[48];
    System.arraycopy(zc.a(paramInt), 0, arrayOfByte, 0, 2);
    arrayOfByte[2] = 48;
    if ("path".equals(paramzoy.e)) {
      System.arraycopy(zc.a(1), 0, arrayOfByte, 4, 4);
    }
    System.arraycopy(zc.a(paramzoy.f), 0, arrayOfByte, 8, 8);
    System.arraycopy(zc.a(paramzoy.a), 0, arrayOfByte, 16, 8);
    System.arraycopy(zc.a(paramzoy.b), 0, arrayOfByte, 24, 8);
    System.arraycopy(zc.a(paramzoy.c), 0, arrayOfByte, 32, 8);
    System.arraycopy(zc.a(paramzoy.d), 0, arrayOfByte, 40, 8);
    return arrayOfByte;
  }
  
  private byte[] a(int paramInt, boolean paramBoolean)
  {
    return a(paramInt, (byte)(paramBoolean ? 1 : 0));
  }
  
  private byte[] a(int paramInt, byte paramByte)
  {
    byte[] arrayOfByte = new byte[5];
    System.arraycopy(zc.a(paramInt), 0, arrayOfByte, 0, 2);
    arrayOfByte[2] = 5;
    arrayOfByte[4] = paramByte;
    return arrayOfByte;
  }
  
  private byte[] a(int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[6];
    System.arraycopy(zc.a(paramInt1), 0, arrayOfByte, 0, 2);
    arrayOfByte[2] = 6;
    System.arraycopy(zc.a(paramInt2), 0, arrayOfByte, 4, 2);
    return arrayOfByte;
  }
  
  private byte[] b(int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[8];
    System.arraycopy(zc.a(paramInt1), 0, arrayOfByte, 0, 2);
    arrayOfByte[2] = 8;
    System.arraycopy(zc.a(paramInt2), 0, arrayOfByte, 4, 4);
    return arrayOfByte;
  }
  
  private byte[] a(int paramInt1, zaml paramzaml, int paramInt2, boolean paramBoolean, Workbook paramWorkbook)
  {
    this.c = new byte[12];
    System.arraycopy(zc.a(paramInt1), 0, this.c, 0, 2);
    this.c[2] = 12;
    if (paramBoolean)
    {
      this.c[4] = 4;
      return this.c;
    }
    zche.a(this.c, 4, paramzaml, 64, paramWorkbook);
    if (paramzaml.c() == 2)
    {
      int tmp73_72 = 4;
      byte[] tmp73_69 = this.c;
      tmp73_69[tmp73_72] = ((byte)(tmp73_69[tmp73_72] | 0x1));
      this.c[5] = -1;
    }
    return this.c;
  }
  
  private byte[] a(int paramInt, String paramString)
  {
    byte[] arrayOfByte1 = new byte[6 + paramString.length() * 2];
    System.arraycopy(zc.a(paramInt), 0, arrayOfByte1, 0, 2);
    System.arraycopy(zc.a(arrayOfByte1.length), 0, arrayOfByte1, 2, 2);
    System.arraycopy(zc.a(paramString.length()), 0, arrayOfByte1, 4, 2);
    byte[] arrayOfByte2 = Encoding.getUnicode().a(paramString);
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 6, arrayOfByte2.length);
    return arrayOfByte1;
  }
  
  private byte[] a(int paramInt1, int paramInt2, Border paramBorder, Style paramStyle, boolean paramBoolean, Workbook paramWorkbook)
  {
    this.c = new byte[14];
    System.arraycopy(zc.a(paramInt1), 0, this.c, 0, 2);
    this.c[2] = 14;
    if (paramBoolean) {
      this.c[4] = 4;
    } else {
      zche.a(this.c, 4, paramBorder.a, 64, paramWorkbook);
    }
    int i = zcij.n(paramBorder.getLineStyle());
    System.arraycopy(zc.a(i), 0, this.c, 12, 2);
    return this.c;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcfm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */