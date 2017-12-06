package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;
import java.util.Iterator;

class zsy
  extends zcd
{
  private ArrayList a;
  
  zsy()
  {
    c(2189);
  }
  
  void a(Style paramStyle, boolean paramBoolean, Workbook paramWorkbook)
  {
    this.a = new ArrayList();
    int i = 18;
    Object localObject3;
    if ((paramStyle.q() != null) && (paramStyle.isModified(11)))
    {
      Font localFont = paramStyle.getFont();
      if (paramStyle.isModified(16))
      {
        int m = 0;
        localObject3 = new boolean[] { m };
        int n = localFont.a(false, (boolean[])localObject3);
        m = localObject3[0];
        zf.a(this.a, a(5, localFont.b(), n, false, paramWorkbook));
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
    int j;
    if (paramStyle.isModified(24))
    {
      j = paramStyle.r();
      zf.a(this.a, a(38, paramStyle.s()));
      zf.a(this.a, a(41, j));
    }
    if ((paramStyle.isModified(33)) || (paramStyle.isModified(34)) || (paramStyle.isModified(35)))
    {
      j = zcij.o(paramStyle.getPattern());
      if (paramStyle.isModified(33)) {
        zf.a(this.a, a(0, (byte)j));
      }
      if (paramStyle.isModified(34)) {
        zf.a(this.a, a(1, paramStyle.b, paramStyle.b(), false, paramWorkbook));
      }
      if (paramStyle.isModified(35)) {
        zf.a(this.a, a(2, paramStyle.a, paramStyle.a(), false, paramWorkbook));
      }
    }
    if (paramStyle.isModified(31))
    {
      zf.a(this.a, a(15, (byte)zcij.h(paramStyle.getHorizontalAlignment())));
      zf.a(this.a, a(16, (byte)zcij.f(paramStyle.getVerticalAlignment())));
      j = paramStyle.getRotationAngle();
      if (j < 0) {
        j = 90 - j;
      }
      zf.a(this.a, a(17, (byte)j));
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
      localObject2 = null;
      if (paramStyle.isModified(4))
      {
        localObject2 = ((BorderCollection)localObject1).getByBorderType(4);
        zf.a(this.a, a(6, (Border)localObject2, paramWorkbook));
      }
      if (paramStyle.isModified(5))
      {
        localObject2 = ((BorderCollection)localObject1).getByBorderType(8);
        zf.a(this.a, a(7, (Border)localObject2, paramWorkbook));
      }
      if (paramStyle.isModified(2))
      {
        localObject2 = ((BorderCollection)localObject1).getByBorderType(1);
        zf.a(this.a, a(8, (Border)localObject2, paramWorkbook));
      }
      if (paramStyle.isModified(3))
      {
        localObject2 = ((BorderCollection)localObject1).getByBorderType(2);
        zf.a(this.a, a(9, (Border)localObject2, paramWorkbook));
      }
      localObject3 = null;
      if (paramStyle.isModified(10))
      {
        localObject3 = ((BorderCollection)localObject1).getByBorderType(32);
        zf.a(this.a, new byte[] { 13, 0, 2, 0, 1 });
      }
      if (paramStyle.isModified(9))
      {
        localObject3 = ((BorderCollection)localObject1).getByBorderType(16);
        zf.a(this.a, new byte[] { 14, 0, 2, 0, 1 });
      }
      if (localObject3 != null) {
        zf.a(this.a, a(10, (Border)localObject3, paramWorkbook));
      }
      if (paramStyle.isModified(7))
      {
        localObject2 = ((BorderCollection)localObject1).getByBorderType(64);
        zf.a(this.a, a(11, (Border)localObject2, paramWorkbook));
      }
      if (paramStyle.isModified(6))
      {
        localObject2 = ((BorderCollection)localObject1).getByBorderType(128);
        zf.a(this.a, a(12, (Border)localObject2, paramWorkbook));
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
    this.b = new byte[i];
    a((short)i);
    this.b[0] = -115;
    this.b[1] = 8;
    if (paramBoolean)
    {
      byte[] tmp1214_1209 = this.b;
      tmp1214_1209[12] = ((byte)(tmp1214_1209[12] | 0x2));
    }
    this.b[12] = 3;
    int k = 14;
    k += 2;
    System.arraycopy(zc.a(this.a.size()), 0, this.b, k, 2);
    k += 2;
    Object localObject2 = this.a.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (byte[])((Iterator)localObject2).next();
      System.arraycopy(localObject3, 0, this.b, k, localObject3.length);
      k += localObject3.length;
    }
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
    this.b = new byte[12];
    System.arraycopy(zc.a(paramInt1), 0, this.b, 0, 2);
    this.b[2] = 12;
    if (paramBoolean)
    {
      this.b[4] = 4;
      return this.b;
    }
    a(this.b, 4, paramzaml, 64, paramWorkbook);
    return this.b;
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
  
  private byte[] a(int paramInt, Border paramBorder, Workbook paramWorkbook)
  {
    this.b = new byte[14];
    System.arraycopy(zc.a(paramInt), 0, this.b, 0, 2);
    this.b[2] = 14;
    a(this.b, 4, paramBorder.a, 64, paramWorkbook);
    int i = zcij.n(paramBorder.getLineStyle());
    System.arraycopy(zc.a(i), 0, this.b, 12, 2);
    return this.b;
  }
  
  void a(byte[] paramArrayOfByte, int paramInt1, zaml paramzaml, int paramInt2, Workbook paramWorkbook)
  {
    if (paramzaml.b())
    {
      this.b[paramInt1] = 1;
      System.arraycopy(zc.a(paramInt2), 0, this.b, paramInt1 + 1, 2);
      return;
    }
    this.b[(paramInt1 + 0)] = ((byte)(((a(paramzaml.c()) & 0xFF) << 1) + 1));
    this.b[(paramInt1 + 1)] = ((byte)paramzaml.e());
    System.arraycopy(zc.a((short)(int)(paramzaml.g() * 32767.0D)), 0, this.b, paramInt1 + 2, 2);
    int i = paramzaml.c(paramWorkbook);
    this.b[(paramInt1 + 4)] = ((byte)((i & 0xFF0000) >> 16));
    this.b[(paramInt1 + 5)] = ((byte)((i & 0xFF00) >> 8));
    this.b[(paramInt1 + 6)] = ((byte)(i & 0xFF));
    this.b[(paramInt1 + 7)] = -1;
  }
  
  byte a(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return 0;
    case 3: 
      return 1;
    case 2: 
      return 2;
    case 4: 
      return 3;
    case 1: 
      return 4;
    }
    return 4;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zsy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */