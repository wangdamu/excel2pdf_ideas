package com.aspose.cells;

import com.aspose.cells.b.a.zr;

class zlk
{
  static Color a(Color paramColor, double paramDouble)
  {
    int[] arrayOfInt = new int[3];
    arrayOfInt[0] = (paramColor.getR() & 0xFF);
    arrayOfInt[1] = (paramColor.getG() & 0xFF);
    arrayOfInt[2] = (paramColor.getB() & 0xFF);
    for (int i = 0; i < 3; i++)
    {
      double d1 = a(arrayOfInt[i]);
      double d2 = d1 * (1.0D + (1.0D - paramDouble));
      if (paramDouble > 0.0D) {
        d2 = d1 * (1.0D - (1.0D - paramDouble)) + (1.0D - paramDouble);
      }
      arrayOfInt[i] = a(d2);
    }
    return Color.fromArgb(arrayOfInt[0], arrayOfInt[1], arrayOfInt[2]);
  }
  
  static Color b(Color paramColor, double paramDouble)
  {
    int[] arrayOfInt = new int[3];
    arrayOfInt[0] = (paramColor.getR() & 0xFF);
    arrayOfInt[1] = (paramColor.getG() & 0xFF);
    arrayOfInt[2] = (paramColor.getB() & 0xFF);
    for (int i = 0; i < 3; i++)
    {
      double d1 = a(arrayOfInt[i]);
      double d2 = d1 * paramDouble;
      if (d2 < 0.0D) {
        d2 = 0.0D;
      } else if (d2 > 1.0D) {
        d2 = 1.0D;
      }
      arrayOfInt[i] = a(d2);
    }
    return Color.fromArgb(arrayOfInt[0], arrayOfInt[1], arrayOfInt[2]);
  }
  
  static Color c(Color paramColor, double paramDouble)
  {
    if (paramDouble == 0.0D) {
      return paramColor;
    }
    zaez localzaez = f(paramColor);
    if (paramDouble < 0.0D) {
      localzaez.c(localzaez.c() * (1.0D + paramDouble));
    } else if (paramDouble > 0.0D) {
      localzaez.c(localzaez.c() * (1.0D - paramDouble) + paramDouble);
    }
    return a(localzaez);
  }
  
  static Color d(Color paramColor, double paramDouble)
  {
    int i = (int)zr.a(255.0D * paramDouble, 0, 1);
    return Color.a(i, paramColor);
  }
  
  static Color e(Color paramColor, double paramDouble)
  {
    int i = (int)zr.a(255.0D * (1.0D - (1.0D - (paramColor.getA() & 0xFF) / 255.0D) * paramDouble), 0, 1);
    return Color.a(i, paramColor);
  }
  
  static Color f(Color paramColor, double paramDouble)
  {
    int i = (int)zr.a(255.0D * (1.0D - (1.0D - (paramColor.getA() & 0xFF) / 255.0D) - paramDouble), 0, 1);
    return Color.a(i, paramColor);
  }
  
  static Color g(Color paramColor, double paramDouble)
  {
    double d = a(255);
    d *= paramDouble;
    int i = a(d);
    return Color.fromArgb(i, paramColor.getG() & 0xFF, paramColor.getB() & 0xFF);
  }
  
  static Color h(Color paramColor, double paramDouble)
  {
    double d = a(paramColor.getR() & 0xFF);
    d *= paramDouble;
    int i = a(d);
    return Color.fromArgb(i, paramColor.getG() & 0xFF, paramColor.getB() & 0xFF);
  }
  
  static Color i(Color paramColor, double paramDouble)
  {
    double d = a(paramColor.getR() & 0xFF);
    d += paramDouble;
    int i = a(d);
    return Color.fromArgb(i, paramColor.getG() & 0xFF, paramColor.getB() & 0xFF);
  }
  
  static Color j(Color paramColor, double paramDouble)
  {
    double d = a(255);
    d *= paramDouble;
    int i = a(d);
    return Color.fromArgb(paramColor.getR() & 0xFF, i, paramColor.getB() & 0xFF);
  }
  
  static Color k(Color paramColor, double paramDouble)
  {
    double d = a(paramColor.getG() & 0xFF);
    d *= paramDouble;
    int i = a(d);
    return Color.fromArgb(paramColor.getR() & 0xFF, i, paramColor.getB() & 0xFF);
  }
  
  static Color l(Color paramColor, double paramDouble)
  {
    double d = a(paramColor.getG() & 0xFF);
    d += paramDouble;
    int i = a(d);
    return Color.fromArgb(paramColor.getR() & 0xFF, i, paramColor.getB() & 0xFF);
  }
  
  static Color m(Color paramColor, double paramDouble)
  {
    double d = a(255);
    d *= paramDouble;
    int i = a(d);
    return Color.fromArgb(paramColor.getR() & 0xFF, paramColor.getG() & 0xFF, i);
  }
  
  static Color n(Color paramColor, double paramDouble)
  {
    double d = a(paramColor.getB() & 0xFF);
    d *= paramDouble;
    int i = a(d);
    return Color.fromArgb(paramColor.getR() & 0xFF, paramColor.getG() & 0xFF, i);
  }
  
  static Color o(Color paramColor, double paramDouble)
  {
    double d = a(paramColor.getB() & 0xFF);
    d += paramDouble;
    int i = a(d);
    return Color.fromArgb(paramColor.getR() & 0xFF, paramColor.getG() & 0xFF, i);
  }
  
  static Color a(Color paramColor)
  {
    zaez localzaez = f(paramColor);
    if (localzaez.a() < 180.0D) {
      localzaez.a(localzaez.a() + 180.0D);
    } else {
      localzaez.a(localzaez.a() - 180.0D);
    }
    return a(localzaez);
  }
  
  static Color b(Color paramColor)
  {
    int[] arrayOfInt = new int[3];
    arrayOfInt[0] = (paramColor.getR() & 0xFF);
    arrayOfInt[1] = (paramColor.getG() & 0xFF);
    arrayOfInt[2] = (paramColor.getB() & 0xFF);
    for (int i = 0; i < 3; i++)
    {
      double d = 1.0D - a(arrayOfInt[i]);
      arrayOfInt[i] = a(d);
    }
    return Color.fromArgb(arrayOfInt[0], arrayOfInt[1], arrayOfInt[2]);
  }
  
  static double a(int paramInt)
  {
    double d1 = paramInt / 255.0D;
    double d2 = 0.0D;
    if (d1 < 0.0D) {
      d2 = 0.0D;
    } else if (d1 <= 0.04045D) {
      d2 = d1 / 12.92D;
    } else if (d1 <= 1.0D) {
      d2 = Math.pow((d1 + 0.055D) / 1.055D, 2.4D);
    } else {
      d2 = 1.0D;
    }
    return d2;
  }
  
  static int a(double paramDouble)
  {
    double d = 0.0D;
    if (paramDouble < 0.0D) {
      d = 0.0D;
    } else if (paramDouble <= 0.0031308D) {
      d = paramDouble * 12.92D;
    } else if (paramDouble < 1.0D) {
      d = 1.055D * Math.pow(paramDouble, 0.4166666666666667D) - 0.055D;
    } else {
      d = 1.0D;
    }
    return (int)zr.a(d * 255.0D, 0, 1);
  }
  
  static Color p(Color paramColor, double paramDouble)
  {
    zaez localzaez = f(paramColor);
    localzaez.a(paramDouble);
    return a(localzaez);
  }
  
  static Color q(Color paramColor, double paramDouble)
  {
    zaez localzaez = f(paramColor);
    localzaez.a(localzaez.a() * paramDouble);
    return a(localzaez);
  }
  
  static Color r(Color paramColor, double paramDouble)
  {
    zaez localzaez = f(paramColor);
    localzaez.a(localzaez.a() + paramDouble);
    return a(localzaez);
  }
  
  static Color s(Color paramColor, double paramDouble)
  {
    zaez localzaez = f(paramColor);
    localzaez.b(paramDouble);
    return a(localzaez);
  }
  
  static Color t(Color paramColor, double paramDouble)
  {
    zaez localzaez = f(paramColor);
    localzaez.b(localzaez.b() * paramDouble);
    return a(localzaez);
  }
  
  static Color u(Color paramColor, double paramDouble)
  {
    zaez localzaez = f(paramColor);
    localzaez.b(localzaez.b() + paramDouble);
    return a(localzaez);
  }
  
  static Color v(Color paramColor, double paramDouble)
  {
    zaez localzaez = f(paramColor);
    localzaez.c(paramDouble);
    return a(localzaez);
  }
  
  static Color w(Color paramColor, double paramDouble)
  {
    zaez localzaez = f(paramColor);
    localzaez.c(localzaez.c() * paramDouble);
    return a(localzaez);
  }
  
  static Color x(Color paramColor, double paramDouble)
  {
    zaez localzaez = f(paramColor);
    localzaez.c(localzaez.c() + paramDouble);
    return a(localzaez);
  }
  
  static Color c(Color paramColor)
  {
    int[] arrayOfInt = new int[3];
    arrayOfInt[0] = (paramColor.getR() & 0xFF);
    arrayOfInt[1] = (paramColor.getG() & 0xFF);
    arrayOfInt[2] = (paramColor.getB() & 0xFF);
    for (int i = 0; i < 3; i++) {
      arrayOfInt[i] = ((int)zr.a(Math.min(255.0D, 255.0D * Math.pow(arrayOfInt[i] / 255.0D, 0.45454545454545453D) + 0.5D), 0, 1));
    }
    return Color.fromArgb(arrayOfInt[0], arrayOfInt[1], arrayOfInt[2]);
  }
  
  static Color d(Color paramColor)
  {
    int[] arrayOfInt = new int[3];
    arrayOfInt[0] = (paramColor.getR() & 0xFF);
    arrayOfInt[1] = (paramColor.getG() & 0xFF);
    arrayOfInt[2] = (paramColor.getB() & 0xFF);
    for (int i = 0; i < 3; i++) {
      arrayOfInt[i] = ((int)zr.a(255.0D * Math.pow(arrayOfInt[i] / 255.0D, 2.2D), 0, 1));
    }
    return Color.fromArgb(arrayOfInt[0], arrayOfInt[1], arrayOfInt[2]);
  }
  
  static Color e(Color paramColor)
  {
    int i = (int)zr.a((paramColor.getR() & 0xFF) * 0.2126D + (paramColor.getG() & 0xFF) * 0.7152D + (paramColor.getB() & 0xFF) * 0.0722D, 0, 1);
    return Color.fromArgb(i, i, i);
  }
  
  static zaez f(Color paramColor)
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = (paramColor.getR() & 0xFF) / 255.0D;
    double d5 = (paramColor.getG() & 0xFF) / 255.0D;
    double d6 = (paramColor.getB() & 0xFF) / 255.0D;
    double d7 = Math.max(d4, Math.max(d5, d6));
    double d8 = Math.min(d4, Math.min(d5, d6));
    if (d7 == d8) {
      d1 = 0.0D;
    } else if ((d7 == d4) && (d5 >= d6)) {
      d1 = 60.0D * (d5 - d6) / (d7 - d8);
    } else if ((d7 == d4) && (d5 < d6)) {
      d1 = 60.0D * (d5 - d6) / (d7 - d8) + 360.0D;
    } else if (d7 == d5) {
      d1 = 60.0D * (d6 - d4) / (d7 - d8) + 120.0D;
    } else if (d7 == d6) {
      d1 = 60.0D * (d4 - d5) / (d7 - d8) + 240.0D;
    }
    d3 = (d7 + d8) / 2.0D;
    if ((d3 == 0.0D) || (d7 == d8)) {
      d2 = 0.0D;
    } else if ((0.0D < d3) && (d3 <= 0.5D)) {
      d2 = (d7 - d8) / (d7 + d8);
    } else if (d3 > 0.5D) {
      d2 = (d7 - d8) / (2.0D - (d7 + d8));
    }
    return new zaez(d1, d2, d3);
  }
  
  static Color a(zaez paramzaez)
  {
    if (paramzaez.b() == 0.0D)
    {
      int i = (int)zr.a(paramzaez.c() * 255.0D, 0, 1);
      return Color.fromArgb(i, i, i);
    }
    double d1 = paramzaez.c() < 0.5D ? paramzaez.c() * (1.0D + paramzaez.b()) : paramzaez.c() + paramzaez.b() - paramzaez.c() * paramzaez.b();
    double d2 = 2.0D * paramzaez.c() - d1;
    double d3 = paramzaez.a() / 360.0D;
    double[] arrayOfDouble = new double[3];
    arrayOfDouble[0] = (d3 + 0.3333333333333333D);
    arrayOfDouble[1] = d3;
    arrayOfDouble[2] = (d3 - 0.3333333333333333D);
    for (int j = 0; j < 3; j++)
    {
      if (arrayOfDouble[j] < 0.0D) {
        arrayOfDouble[j] += 1.0D;
      }
      if (arrayOfDouble[j] > 1.0D) {
        arrayOfDouble[j] -= 1.0D;
      }
      if (arrayOfDouble[j] * 6.0D < 1.0D) {
        arrayOfDouble[j] = (d2 + (d1 - d2) * 6.0D * arrayOfDouble[j]);
      } else if (arrayOfDouble[j] * 2.0D < 1.0D) {
        arrayOfDouble[j] = d1;
      } else if (arrayOfDouble[j] * 3.0D < 2.0D) {
        arrayOfDouble[j] = (d2 + (d1 - d2) * (0.6666666666666666D - arrayOfDouble[j]) * 6.0D);
      } else {
        arrayOfDouble[j] = d2;
      }
    }
    return Color.fromArgb((int)zr.a(arrayOfDouble[0] * 255.0D, 0, 1), (int)zr.a(arrayOfDouble[1] * 255.0D, 0, 1), (int)zr.a(arrayOfDouble[2] * 255.0D, 0, 1));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zlk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */