package com.aspose.cells;

import com.aspose.cells.a.c.zh;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.c.za;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zr;
import java.util.ArrayList;
import java.util.List;

class zbwo
{
  private zjf a;
  private Color[] b = new Color[12];
  private int c = 0;
  private ArrayList d = new ArrayList();
  private int e = 6;
  
  public zbwo(zjf paramzjf)
  {
    this.a = paramzjf;
    a();
    int[] arrayOfInt1 = { 0, 0 };
    zf.a(this.d, arrayOfInt1);
    int[] arrayOfInt2 = { 60000, 0 };
    zf.a(this.d, arrayOfInt2);
    int[] arrayOfInt3 = { 80000, 20000 };
    zf.a(this.d, arrayOfInt3);
    int[] arrayOfInt4 = { 80000, 0 };
    zf.a(this.d, arrayOfInt4);
    int[] arrayOfInt5 = { 60000, 40000 };
    zf.a(this.d, arrayOfInt5);
    int[] arrayOfInt6 = { 50000, 0 };
    zf.a(this.d, arrayOfInt6);
    int[] arrayOfInt7 = { 70000, 30000 };
    zf.a(this.d, arrayOfInt7);
    int[] arrayOfInt8 = { 70000, 0 };
    zf.a(this.d, arrayOfInt8);
    int[] arrayOfInt9 = { 50000, 50000 };
    zf.a(this.d, arrayOfInt9);
  }
  
  private void a()
  {
    for (int i = 0; i < this.b.length; i++) {
      this.b[i] = a(i);
    }
  }
  
  private Color a(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return b("ffffff");
    case 1: 
      return b("000000");
    case 2: 
      return b("EEECE1");
    case 3: 
      return b("1F497D");
    case 4: 
      return b("4F81BD");
    case 5: 
      return b("C0504D");
    case 6: 
      return b("9BBB59");
    case 7: 
      return b("8064A2");
    case 8: 
      return b("4BACC6");
    case 9: 
      return b("F79646");
    case 10: 
      return b("0000FF");
    case 11: 
      return b("800080");
    }
    return b("000000");
  }
  
  private static Color b(String paramString)
  {
    int i = zp.a(paramString, 515, za.b());
    Color localColor = Color.fromArgb(i);
    localColor = Color.a(255, localColor);
    return localColor;
  }
  
  public void a(Color[] paramArrayOfColor, int paramInt1, int paramInt2, List paramList)
  {
    this.c = paramInt1;
    this.e = paramInt2;
    for (int i = 0; i < paramList.size(); i++)
    {
      int[] arrayOfInt = (int[])paramList.get(i);
      if (i < this.d.size())
      {
        this.d.remove(i);
        if (i < this.d.size()) {
          this.d.add(i, arrayOfInt);
        } else {
          zf.a(this.d, arrayOfInt);
        }
      }
      else
      {
        zf.a(this.d, arrayOfInt);
      }
    }
    if ((paramArrayOfColor != null) && (paramArrayOfColor.length > 0))
    {
      for (i = 0; (i < paramArrayOfColor.length) && (i < this.b.length); i++) {
        if (!zh.a(paramArrayOfColor[i])) {
          this.b[i] = Color.fromArgb(255, paramArrayOfColor[i].getR() & 0xFF, paramArrayOfColor[i].getG() & 0xFF, paramArrayOfColor[i].getB() & 0xFF);
        } else {
          this.b[i] = a(i);
        }
      }
      if (i < this.b.length) {
        while (i < this.b.length)
        {
          this.b[i] = a(i);
          i++;
        }
      }
    }
  }
  
  Color a(String paramString)
  {
    int i = c(paramString);
    return this.b[i];
  }
  
  private int c(String paramString)
  {
    int i = 0;
    if ((paramString.equals("lt1")) || (paramString.equals("bg1"))) {
      i = 0;
    } else if ((paramString.equals("dk1")) || (paramString.equals("tx1"))) {
      i = 1;
    } else if ((paramString.equals("lt2")) || (paramString.equals("bg2"))) {
      i = 2;
    } else if ((paramString.equals("dk2")) || (paramString.equals("tx2"))) {
      i = 3;
    } else if (paramString.equals("accent1")) {
      i = 4;
    } else if (paramString.equals("accent2")) {
      i = 5;
    } else if (paramString.equals("accent3")) {
      i = 6;
    } else if (paramString.equals("accent4")) {
      i = 7;
    } else if (paramString.equals("accent5")) {
      i = 8;
    } else if (paramString.equals("accent6")) {
      i = 9;
    } else if (paramString.equals("hlink")) {
      i = 10;
    } else if (paramString.equals("folHlink")) {
      i = 11;
    } else {
      i = 11;
    }
    return i;
  }
  
  public Color[] a(int paramInt1, int paramInt2)
  {
    if (paramInt2 <= 0) {
      return null;
    }
    if (this.a.aA())
    {
      if (this.c == 0)
      {
        localObject = b(paramInt2);
        a((Color[])localObject);
        return (Color[])localObject;
      }
      if (this.c == 1)
      {
        localObject = a("accent1");
        Color[] arrayOfColor1 = a(new Color[] { localObject }, 4, paramInt2);
        a(arrayOfColor1);
        return arrayOfColor1;
      }
    }
    Object localObject = new Color[6];
    for (int i = 1; i < 7; i++) {
      localObject[(i - 1)] = a("accent" + i);
    }
    i = paramInt1 % 8;
    Color[] arrayOfColor2;
    switch (i)
    {
    case 0: 
      arrayOfColor2 = a(new Color[] { localObject[5] }, i, paramInt2);
      break;
    case 1: 
      Color localColor = a("dk1");
      if (paramInt1 == 41)
      {
        arrayOfDouble = new double[6];
        arrayOfDouble[0] = 0.05D;
        arrayOfDouble[1] = 0.55D;
        arrayOfDouble[2] = 0.78D;
        arrayOfDouble[3] = 0.15D;
        arrayOfDouble[4] = 0.7D;
        arrayOfDouble[5] = 0.3D;
        for (j = 0; j < 6; j++) {
          localObject[j] = a(localColor, arrayOfDouble[j]);
        }
        return a((Color[])localObject, i, paramInt2);
      }
      double[] arrayOfDouble = new double[6];
      arrayOfDouble[0] = 0.88D;
      arrayOfDouble[1] = 0.55D;
      arrayOfDouble[2] = 0.78D;
      arrayOfDouble[3] = 0.92D;
      arrayOfDouble[4] = 0.7D;
      arrayOfDouble[5] = 0.3D;
      for (int j = 0; j < 6; j++) {
        localObject[j] = a(localColor, arrayOfDouble[j]);
      }
      arrayOfColor2 = a((Color[])localObject, i, paramInt2);
      break;
    case 2: 
      arrayOfColor2 = a((Color[])localObject, i, paramInt2);
      break;
    case 3: 
      arrayOfColor2 = a(new Color[] { localObject[0] }, i, paramInt2);
      break;
    case 4: 
      arrayOfColor2 = a(new Color[] { localObject[1] }, i, paramInt2);
      break;
    case 5: 
      arrayOfColor2 = a(new Color[] { localObject[2] }, i, paramInt2);
      break;
    case 6: 
      arrayOfColor2 = a(new Color[] { localObject[3] }, i, paramInt2);
      break;
    case 7: 
      arrayOfColor2 = a(new Color[] { localObject[4] }, i, paramInt2);
      break;
    default: 
      arrayOfColor2 = a((Color[])localObject, i, paramInt2);
    }
    a(arrayOfColor2);
    return arrayOfColor2;
  }
  
  private Color[] a(Color[] paramArrayOfColor, int paramInt1, int paramInt2)
  {
    Color[] arrayOfColor = new Color[paramInt2];
    int i = 0;
    if (((paramInt1 != 1) && (paramInt1 != 2)) || ((paramArrayOfColor.length == 6) || (((paramInt1 == 0) || (paramInt1 > 2)) && (paramArrayOfColor.length == 1))))
    {
      if (paramArrayOfColor.length == 6)
      {
        if (paramInt2 < paramArrayOfColor.length)
        {
          while (i < paramInt2)
          {
            arrayOfColor[i] = paramArrayOfColor[i];
            i++;
          }
          return arrayOfColor;
        }
      }
      else if ((paramInt1 > 2) && (paramInt2 == 1))
      {
        arrayOfColor[0] = paramArrayOfColor[0];
        return arrayOfColor;
      }
    }
    else {
      return null;
    }
    int j;
    if (paramArrayOfColor.length == 6) {
      j = paramInt2 / 6 + 1;
    } else {
      j = paramInt2;
    }
    int k = (int)(j / 2.0D + 0.5D);
    double d1;
    Color localColor3;
    for (int m = 1; (m < k + 1) && (i < paramInt2); m++)
    {
      d1 = Math.floor(30.0D + 140.0D * m / (j + 1.0D)) / 100.0D;
      if (paramArrayOfColor.length == 6)
      {
        for (int n = 0; (n < 6) && (i < paramInt2); n++)
        {
          localColor3 = b(paramArrayOfColor[n], d1);
          arrayOfColor[i] = localColor3;
          i++;
        }
      }
      else
      {
        Color localColor1 = b(paramArrayOfColor[0], d1);
        arrayOfColor[i] = localColor1;
        i++;
      }
    }
    while ((m < j + 1) && (i < paramInt2))
    {
      d1 = Math.ceil(170.0D - 140.0D * m / (j + 1.0D)) / 100.0D;
      if (paramArrayOfColor.length == 6)
      {
        for (int i1 = 0; (i1 < 6) && (i < paramInt2); i1++)
        {
          localColor3 = a(paramArrayOfColor[i1], d1);
          arrayOfColor[i] = localColor3;
          i++;
        }
      }
      else
      {
        Color localColor2 = a(paramArrayOfColor[0], d1);
        arrayOfColor[i] = localColor2;
        i++;
      }
      m++;
    }
    return arrayOfColor;
  }
  
  private Color[] b(int paramInt)
  {
    Color[] arrayOfColor1 = new Color[this.e];
    for (int i = 1; i < this.e + 1; i++) {
      arrayOfColor1[(i - 1)] = a("accent" + i);
    }
    Color[] arrayOfColor2 = new Color[paramInt];
    int j = 0;
    for (int k = 0; j < paramInt; k++)
    {
      int[] arrayOfInt = (int[])this.d.get(k % this.d.size());
      for (int m = 0; (m < arrayOfColor1.length) && (j < paramInt); m++)
      {
        Color localColor = arrayOfColor1[m];
        arrayOfColor2[j] = a(localColor, arrayOfInt);
        j++;
      }
    }
    return arrayOfColor2;
  }
  
  Color a(Color paramColor, double paramDouble)
  {
    int[] arrayOfInt = new int[3];
    arrayOfInt[0] = (paramColor.getR() & 0xFF);
    arrayOfInt[1] = (paramColor.getG() & 0xFF);
    arrayOfInt[2] = (paramColor.getB() & 0xFF);
    for (int i = 0; i < 3; i++)
    {
      double d1 = c(arrayOfInt[i]);
      double d2 = d1 * (1.0D + (1.0D - paramDouble));
      if (paramDouble > 0.0D) {
        d2 = d1 * (1.0D - (1.0D - paramDouble)) + (1.0D - paramDouble);
      }
      arrayOfInt[i] = a(d2);
    }
    return Color.fromArgb(arrayOfInt[0], arrayOfInt[1], arrayOfInt[2]);
  }
  
  Color b(Color paramColor, double paramDouble)
  {
    int[] arrayOfInt = new int[3];
    arrayOfInt[0] = (paramColor.getR() & 0xFF);
    arrayOfInt[1] = (paramColor.getG() & 0xFF);
    arrayOfInt[2] = (paramColor.getB() & 0xFF);
    for (int i = 0; i < 3; i++)
    {
      double d1 = c(arrayOfInt[i]);
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
  
  private double c(int paramInt)
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
  
  private int a(double paramDouble)
  {
    double d1 = 0.0D;
    if (paramDouble < 0.0D) {
      d1 = 0.0D;
    } else if (paramDouble <= 0.0031308D) {
      d1 = paramDouble * 12.92D;
    } else if (paramDouble < 1.0D) {
      d1 = 1.055D * Math.pow(paramDouble, 0.4166666666666667D) - 0.055D;
    } else {
      d1 = 1.0D;
    }
    return (int)zr.a(d1 * 255.0D, 0, 1);
  }
  
  private void a(Color[] paramArrayOfColor)
  {
    if (paramArrayOfColor == null) {
      return;
    }
    for (int i = 0; i < paramArrayOfColor.length; i++)
    {
      Color localColor = paramArrayOfColor[i];
      paramArrayOfColor[i] = Color.a(255, localColor);
    }
  }
  
  private Color a(Color paramColor, int[] paramArrayOfInt)
  {
    zaml localzaml = new zaml(true);
    localzaml.a(2, paramColor.toArgb());
    int i = paramArrayOfInt[0];
    int j = paramArrayOfInt[1];
    if (i != 0) {
      localzaml.l().a(new zlf(21, i));
    }
    if (j != 0) {
      localzaml.l().a(new zlf(22, j));
    }
    return localzaml.a(this.a.az().getWorksheet().c().p(), this.a.az());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbwo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */