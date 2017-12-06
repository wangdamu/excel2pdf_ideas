package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbzh
  extends zcd
{
  zbzh()
  {
    c(2173);
  }
  
  void a(int paramInt, zbzi paramzbzi)
  {
    b(20);
    b(d() + (short)a(paramzbzi));
    this.b = new byte[d()];
    this.b[0] = 125;
    this.b[1] = 8;
    System.arraycopy(zc.a(paramInt), 0, this.b, 14, 2);
    System.arraycopy(zc.a(paramzbzi.getCount()), 0, this.b, 18, 2);
    a(paramzbzi, this.b, 20);
  }
  
  static int a(zbzi paramzbzi)
  {
    int i = 0;
    for (int j = 0; j < paramzbzi.getCount(); j++) {
      switch (paramzbzi.a(j).a)
      {
      case 4: 
      case 5: 
      case 7: 
      case 8: 
      case 9: 
      case 10: 
      case 11: 
      case 13: 
        i += 20;
        break;
      case 14: 
        i += 5;
        break;
      case 15: 
        i += 6;
        break;
      case 6: 
        i += (short)(52 + 22 * ((GradientFill)paramzbzi.a(j).b).getGradientStops().getCount());
      }
    }
    return i;
  }
  
  static int a(zbzi paramzbzi, byte[] paramArrayOfByte, int paramInt)
  {
    for (int i = 0; i < paramzbzi.getCount(); i++)
    {
      zbzg localzbzg = paramzbzi.a(i);
      paramArrayOfByte[paramInt] = ((byte)localzbzg.a);
      switch (paramzbzi.a(i).a)
      {
      case 4: 
      case 5: 
      case 7: 
      case 8: 
      case 9: 
      case 10: 
      case 11: 
      case 13: 
        paramArrayOfByte[(paramInt + 2)] = 20;
        zaml localzaml = (zaml)localzbzg.b;
        switch (localzaml.c())
        {
        case 0: 
        case 1: 
          paramArrayOfByte[(paramInt + 4)] = 0;
          break;
        case 3: 
          paramArrayOfByte[(paramInt + 4)] = 1;
          System.arraycopy(zc.a(localzaml.e()), 0, paramArrayOfByte, paramInt + 8, 4);
          break;
        case 4: 
          paramArrayOfByte[(paramInt + 4)] = 3;
          System.arraycopy(zc.a((short)(int)(localzaml.g() * 32767.0D)), 0, paramArrayOfByte, paramInt + 6, 2);
          System.arraycopy(zc.a(localzaml.e()), 0, paramArrayOfByte, paramInt + 8, 4);
          break;
        case 2: 
          paramArrayOfByte[(paramInt + 4)] = 2;
          int j = localzaml.e();
          paramArrayOfByte[(paramInt + 8)] = ((byte)(j >> 16 & 0xFF));
          paramArrayOfByte[(paramInt + 9)] = ((byte)(j >> 8 & 0xFF));
          paramArrayOfByte[(paramInt + 10)] = ((byte)(j & 0xFF));
          paramArrayOfByte[(paramInt + 11)] = -1;
          break;
        }
        paramInt += 20;
        break;
      case 14: 
        paramArrayOfByte[(paramInt + 2)] = 5;
        paramArrayOfByte[(paramInt + 4)] = ((Byte)localzbzg.b).byteValue();
        paramInt += 5;
        break;
      case 15: 
        paramArrayOfByte[(paramInt + 2)] = 6;
        System.arraycopy(zc.a(((Short)localzbzg.b).shortValue()), 0, paramArrayOfByte, paramInt + 4, 2);
        paramInt += 6;
        break;
      case 6: 
        paramInt = a(paramArrayOfByte, paramInt, (GradientFill)localzbzg.b);
      }
    }
    return paramInt;
  }
  
  private static int a(byte[] paramArrayOfByte, int paramInt, GradientFill paramGradientFill)
  {
    paramArrayOfByte[paramInt] = 6;
    System.arraycopy(zc.a(52 + 22 * paramGradientFill.getGradientStops().getCount()), 0, paramArrayOfByte, paramInt + 2, 2);
    paramInt += 4;
    switch (paramGradientFill.getFillType())
    {
    case 2: 
      paramArrayOfByte[paramInt] = 1;
      paramInt += 12;
      System.arraycopy(zc.a(paramGradientFill.f().b / 100000.0D), 0, paramArrayOfByte, paramInt + 0, 8);
      System.arraycopy(zc.a(paramGradientFill.f().e / 100000.0D), 0, paramArrayOfByte, paramInt + 8, 8);
      System.arraycopy(zc.a(paramGradientFill.f().c / 100000.0D), 0, paramArrayOfByte, paramInt + 16, 8);
      System.arraycopy(zc.a(paramGradientFill.f().d / 100000.0D), 0, paramArrayOfByte, paramInt + 24, 8);
      break;
    default: 
      paramArrayOfByte[paramInt] = 0;
      double d = paramGradientFill.getAngle();
      System.arraycopy(zc.a(d), 0, paramArrayOfByte, paramInt + 4, 8);
      paramInt += 12;
      if (paramGradientFill.g() != null)
      {
        System.arraycopy(zc.a(paramGradientFill.g().b / 100000.0D), 0, paramArrayOfByte, paramInt + 0, 8);
        System.arraycopy(zc.a(paramGradientFill.g().e / 100000.0D), 0, paramArrayOfByte, paramInt + 8, 8);
        System.arraycopy(zc.a(paramGradientFill.g().c / 100000.0D), 0, paramArrayOfByte, paramInt + 16, 8);
        System.arraycopy(zc.a(paramGradientFill.g().d / 100000.0D), 0, paramArrayOfByte, paramInt + 24, 8);
      }
      break;
    }
    paramInt += 32;
    System.arraycopy(zc.a(paramGradientFill.getGradientStops().getCount()), 0, paramArrayOfByte, paramInt, 4);
    paramInt += 4;
    for (int i = 0; i < paramGradientFill.getGradientStops().getCount(); i++)
    {
      GradientStop localGradientStop = paramGradientFill.getGradientStops().get(i);
      int j = localGradientStop.a.e();
      switch (localGradientStop.a.c())
      {
      case 0: 
      case 1: 
        paramArrayOfByte[paramInt] = 0;
        break;
      case 3: 
        paramArrayOfByte[paramInt] = 1;
        break;
      case 2: 
        int k = j & 0xFF;
        int m = (j & 0xFF00) >> 8;
        int n = (j & 0xFF0000) >> 16;
        j = (k << 16) + (m << 8) + n;
        paramArrayOfByte[paramInt] = 2;
        break;
      case 4: 
        paramArrayOfByte[paramInt] = 3;
      }
      System.arraycopy(zc.a(j), 0, paramArrayOfByte, paramInt + 2, 4);
      System.arraycopy(zc.a(localGradientStop.getPosition() / 100.0D), 0, paramArrayOfByte, paramInt + 6, 8);
      System.arraycopy(zc.a(localGradientStop.a.g()), 0, paramArrayOfByte, paramInt + 14, 8);
      paramInt += 22;
    }
    return paramInt;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbzh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */