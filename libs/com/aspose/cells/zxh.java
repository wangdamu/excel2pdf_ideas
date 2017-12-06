package com.aspose.cells;

import com.aspose.cells.a.c.zh;
import com.aspose.cells.b.a.zc;

class zxh
{
  static byte[] a(GradientStopCollection paramGradientStopCollection)
  {
    Workbook localWorkbook = paramGradientStopCollection.a().e;
    byte[] arrayOfByte = new byte[paramGradientStopCollection.getCount() * 8 + 6];
    System.arraycopy(zc.a(paramGradientStopCollection.getCount()), 0, arrayOfByte, 0, 2);
    System.arraycopy(zc.a(paramGradientStopCollection.getCount()), 0, arrayOfByte, 2, 2);
    arrayOfByte[4] = 8;
    int i = 6;
    for (int j = 0; j < paramGradientStopCollection.getCount(); j++)
    {
      GradientStop localGradientStop = paramGradientStopCollection.get(j);
      Color localColor = localGradientStop.a.b(localWorkbook);
      arrayOfByte[i] = zh.b(localColor);
      arrayOfByte[(i + 1)] = zh.c(localColor);
      arrayOfByte[(i + 2)] = zh.d(localColor);
      int k = (int)(localGradientStop.getPosition() / 100.0D);
      System.arraycopy(zc.a((int)((localGradientStop.getPosition() / 100.0D - k) * 65536.0D)), 0, arrayOfByte, i + 4, 2);
      System.arraycopy(zc.a(k), 0, arrayOfByte, i + 6, 2);
      i += 8;
    }
    return arrayOfByte;
  }
  
  static GradientStopCollection a(GradientStopCollection paramGradientStopCollection, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    int i = zc.e(paramArrayOfByte, 0) & 0xFFFF;
    int j = zc.e(paramArrayOfByte, 4) & 0xFFFF;
    if ((j != 8) && (i * j != paramArrayOfByte.length - 6)) {
      return null;
    }
    int k = 6;
    for (int m = 0; m < i; m++)
    {
      GradientStop localGradientStop = new GradientStop(paramGradientStopCollection);
      localGradientStop.a.a(2, ((paramArrayOfByte[k] & 0xFF) << 16) + ((paramArrayOfByte[(k + 1)] & 0xFF) << 8) + (paramArrayOfByte[(k + 2)] & 0xFF));
      k += 4;
      localGradientStop.setPosition(((zc.e(paramArrayOfByte, k) & 0xFFFF) / 65536.0F + (paramArrayOfByte[(k + 2)] & 0xFF)) * 100.0F);
      k += 4;
      if (paramBoolean)
      {
        localGradientStop.setPosition(100.0D - localGradientStop.getPosition());
        paramGradientStopCollection.a(0, localGradientStop);
      }
      else
      {
        paramGradientStopCollection.a(localGradientStop);
      }
    }
    return paramGradientStopCollection;
  }
  
  static GradientStopCollection a(GradientFill paramGradientFill, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    byte[] arrayOfByte = MsoFillFormatHelper.d(paramInt);
    return a(paramGradientFill, arrayOfByte, paramBoolean1, paramBoolean2);
  }
  
  static GradientStopCollection a(GradientFill paramGradientFill, byte[] paramArrayOfByte, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = zc.e(paramArrayOfByte, 0) & 0xFFFF;
    int j = zc.e(paramArrayOfByte, 4) & 0xFFFF;
    if ((j != 8) && (i * j != paramArrayOfByte.length - 6)) {
      return null;
    }
    int k = 6;
    GradientStopCollection localGradientStopCollection = new GradientStopCollection(paramGradientFill);
    GradientStop localGradientStop1;
    for (int m = 0; m < i; m++)
    {
      localGradientStop1 = new GradientStop(localGradientStopCollection);
      localGradientStop1.a.a(2, ((paramArrayOfByte[k] & 0xFF) << 16) + ((paramArrayOfByte[(k + 1)] & 0xFF) << 8) + (paramArrayOfByte[(k + 2)] & 0xFF));
      k += 4;
      localGradientStop1.setPosition(((zc.e(paramArrayOfByte, k) & 0xFFFF) / 65536.0F + (paramArrayOfByte[(k + 2)] & 0xFF)) * 100.0F);
      k += 4;
      if (paramBoolean1)
      {
        localGradientStop1.setPosition(100.0D - localGradientStop1.getPosition());
        localGradientStopCollection.a(0, localGradientStop1);
      }
      else
      {
        localGradientStopCollection.a(localGradientStop1);
      }
    }
    if (paramBoolean2) {
      for (m = 0; m < i; m++)
      {
        localGradientStop1 = localGradientStopCollection.get(m);
        localGradientStop1.setPosition(localGradientStop1.getPosition() / 2.0D);
        if (100.0D - localGradientStop1.getPosition() != localGradientStop1.getPosition())
        {
          GradientStop localGradientStop2 = new GradientStop(localGradientStopCollection);
          localGradientStop2.setPosition(100.0D - localGradientStop1.getPosition());
          localGradientStop2.a.f(localGradientStop1.a);
          localGradientStopCollection.a(i, localGradientStop2);
        }
      }
    }
    return localGradientStopCollection;
  }
  
  static byte[] a(int paramInt)
  {
    switch (paramInt)
    {
    case 10: 
      return MsoFillFormatHelper.ar();
    case 17: 
      return MsoFillFormatHelper.as();
    case 14: 
      return MsoFillFormatHelper.at();
    case 19: 
      return MsoFillFormatHelper.au();
    case 8: 
      return MsoFillFormatHelper.av();
    case 22: 
      return MsoFillFormatHelper.aw();
    case 2: 
      return MsoFillFormatHelper.ax();
    case 7: 
      return MsoFillFormatHelper.ay();
    case 0: 
      return MsoFillFormatHelper.az();
    case 15: 
      return MsoFillFormatHelper.aA();
    case 16: 
      return MsoFillFormatHelper.aB();
    case 1: 
      return MsoFillFormatHelper.aC();
    case 13: 
      return MsoFillFormatHelper.aD();
    case 3: 
      return MsoFillFormatHelper.aE();
    case 5: 
      return MsoFillFormatHelper.aF();
    case 23: 
      return MsoFillFormatHelper.aG();
    case 21: 
      return MsoFillFormatHelper.aH();
    case 12: 
      return MsoFillFormatHelper.aI();
    case 6: 
      return MsoFillFormatHelper.aJ();
    case 18: 
      return MsoFillFormatHelper.aK();
    case 4: 
      return MsoFillFormatHelper.aL();
    case 20: 
      return MsoFillFormatHelper.aM();
    case 11: 
      return MsoFillFormatHelper.aN();
    case 9: 
      return MsoFillFormatHelper.aO();
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zxh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */