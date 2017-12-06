package com.aspose.cells;

class zaox
{
  static Object[][] a(double[] paramArrayOfDouble, double[][] paramArrayOfDouble1)
  {
    Object[][] arrayOfObject = new Object[5][];
    int i = paramArrayOfDouble.length;
    int j = paramArrayOfDouble1[0].length;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    for (int k = 0; k < 5; k++) {
      arrayOfObject[k] = new Object[j + 1];
    }
    double[] arrayOfDouble1 = new double[j];
    for (int m = 0; m < j; m++)
    {
      double d4 = 0.0D;
      for (int i2 = 0; i2 < i; i2++) {
        d4 += paramArrayOfDouble1[i2][m];
      }
      arrayOfDouble1[m] = (d4 / i);
    }
    for (m = 0; m < i; m++) {
      d3 += paramArrayOfDouble[m];
    }
    d3 /= i;
    double[][] arrayOfDouble2 = new double[j][];
    for (int n = 0; n < j; n++)
    {
      arrayOfDouble2[n] = new double[j];
      for (i1 = 0; i1 < j; i1++)
      {
        double d5 = 0.0D;
        for (i5 = 0; i5 < i; i5++) {
          d5 += (paramArrayOfDouble1[i5][n] - arrayOfDouble1[n]) * (paramArrayOfDouble1[i5][i1] - arrayOfDouble1[i1]);
        }
        arrayOfDouble2[n][i1] = d5;
      }
    }
    double[] arrayOfDouble3 = new double[j];
    for (int i1 = 0; i1 < j; i1++)
    {
      arrayOfDouble3[i1] = 0.0D;
      for (i3 = 0; i3 < i; i3++) {
        arrayOfDouble3[i1] += (paramArrayOfDouble1[i3][i1] - arrayOfDouble1[i1]) * (paramArrayOfDouble[i3] - d3);
      }
    }
    double[][] arrayOfDouble4 = new double[j][];
    for (int i3 = 0; i3 < j; i3++)
    {
      arrayOfDouble4[i3] = new double[j + 1];
      for (i4 = 0; i4 < j; i4++) {
        arrayOfDouble4[i3][i4] = arrayOfDouble2[i3][i4];
      }
      arrayOfDouble4[i3][j] = arrayOfDouble3[i3];
    }
    double[] arrayOfDouble5 = c(arrayOfDouble4);
    int i4 = 0;
    for (int i5 = arrayOfDouble5.length - 1; (i5 >= 0) && (arrayOfDouble5[i5] == 0.0D); i5--) {
      i4++;
    }
    double d6 = d3;
    for (int i6 = 0; i6 < arrayOfDouble1.length; i6++) {
      d6 -= arrayOfDouble5[i6] * arrayOfDouble1[i6];
    }
    for (i6 = 0; i6 < j; i6++) {
      arrayOfObject[0][i6] = Double.valueOf(arrayOfDouble5[(j - i6 - 1)]);
    }
    arrayOfObject[0][j] = Double.valueOf(d6);
    if (i4 == arrayOfDouble5.length)
    {
      for (i6 = 0; i6 < j; i6++) {
        arrayOfObject[1][i6] = Double.valueOf(0.0D);
      }
      arrayOfObject[2][0] = Double.valueOf(1.0D);
      arrayOfObject[2][1] = Double.valueOf(0.0D);
      arrayOfObject[3][0] = Integer.valueOf(5);
      arrayOfObject[3][1] = Double.valueOf(i - j);
      arrayOfObject[4][0] = Double.valueOf(0.0D);
      arrayOfObject[4][1] = Double.valueOf(0.0D);
      return arrayOfObject;
    }
    double[] arrayOfDouble6 = new double[i];
    for (int i7 = 0; i7 < i; i7++)
    {
      arrayOfDouble6[i7] = 0.0D;
      for (int i8 = 0; i8 < j; i8++)
      {
        d8 = ((Double)arrayOfObject[0][(j - i8 - 1)]).doubleValue();
        arrayOfDouble6[i7] += d8 * paramArrayOfDouble1[i7][i8];
      }
      arrayOfDouble6[i7] += ((Double)arrayOfObject[0][j]).doubleValue();
    }
    for (i7 = 0; i7 < i; i7++)
    {
      d1 += (paramArrayOfDouble[i7] - arrayOfDouble6[i7]) * (paramArrayOfDouble[i7] - arrayOfDouble6[i7]);
      d2 += (d3 - arrayOfDouble6[i7]) * (d3 - arrayOfDouble6[i7]);
    }
    double d7 = i - j - 1 + i4;
    double d8 = d1 / d7;
    double d9 = Math.sqrt(d8);
    arrayOfObject[2][1] = Double.valueOf(d9);
    double[][] arrayOfDouble7 = new double[paramArrayOfDouble1.length][];
    for (int i9 = 0; i9 < paramArrayOfDouble1.length; i9++)
    {
      arrayOfDouble7[i9] = new double[paramArrayOfDouble1[i9].length + 1];
      for (int i10 = 0; i10 < paramArrayOfDouble1[i9].length + 1; i10++) {
        if (i10 == 0) {
          arrayOfDouble7[i9][i10] = 1.0D;
        } else {
          arrayOfDouble7[i9][i10] = paramArrayOfDouble1[i9][(i10 - 1)];
        }
      }
    }
    double[][] arrayOfDouble8 = b(arrayOfDouble7);
    double[][] arrayOfDouble9 = a(arrayOfDouble8, arrayOfDouble7);
    double[][] arrayOfDouble10 = a(arrayOfDouble9);
    for (int i11 = 0; i11 < arrayOfDouble10.length; i11++) {
      for (int i12 = 0; i12 < arrayOfDouble10[i11].length; i12++) {
        if (i11 == i12)
        {
          d11 = arrayOfDouble10[i11][i12] * d8;
          d11 = Math.sqrt(d11);
          arrayOfObject[1][(arrayOfDouble10.length - i11 - 1)] = Double.valueOf(d11);
        }
      }
    }
    double d10 = d2 / (j - i4) / d8;
    arrayOfObject[3][0] = Double.valueOf(d10);
    arrayOfObject[3][1] = Double.valueOf(d7);
    arrayOfObject[4][0] = Double.valueOf(d2);
    arrayOfObject[4][1] = Double.valueOf(d1);
    double d11 = d2 / (d2 + d1);
    arrayOfObject[2][0] = Double.valueOf(d11);
    return arrayOfObject;
  }
  
  static Object[][] b(double[] paramArrayOfDouble, double[][] paramArrayOfDouble1)
  {
    Object[][] arrayOfObject = new Object[5][];
    int i = paramArrayOfDouble.length;
    int j = paramArrayOfDouble1[0].length;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    for (int k = 0; k < 5; k++) {
      arrayOfObject[k] = new Object[j + 1];
    }
    double[] arrayOfDouble1 = new double[j];
    for (int m = 0; m < j; m++)
    {
      double d4 = 0.0D;
      for (int i2 = 0; i2 < i; i2++) {
        d4 += paramArrayOfDouble1[i2][m];
      }
      arrayOfDouble1[m] = (d4 / i);
    }
    for (m = 0; m < i; m++) {
      d3 += paramArrayOfDouble[m];
    }
    d3 /= i;
    double[][] arrayOfDouble2 = new double[j][];
    for (int n = 0; n < j; n++)
    {
      arrayOfDouble2[n] = new double[j];
      for (i1 = 0; i1 < j; i1++)
      {
        double d5 = 0.0D;
        for (int i5 = 0; i5 < i; i5++) {
          d5 += paramArrayOfDouble1[i5][i1] * paramArrayOfDouble1[i5][n];
        }
        arrayOfDouble2[n][i1] = d5;
      }
    }
    double[] arrayOfDouble3 = new double[j];
    for (int i1 = 0; i1 < j; i1++)
    {
      arrayOfDouble3[i1] = 0.0D;
      for (i3 = 0; i3 < i; i3++) {
        arrayOfDouble3[i1] += paramArrayOfDouble[i3] * paramArrayOfDouble1[i3][i1];
      }
    }
    double[][] arrayOfDouble4 = new double[j][];
    for (int i3 = 0; i3 < j; i3++)
    {
      arrayOfDouble4[i3] = new double[j + 1];
      for (int i4 = 0; i4 < j; i4++) {
        arrayOfDouble4[i3][i4] = arrayOfDouble2[i3][i4];
      }
      arrayOfDouble4[i3][j] = arrayOfDouble3[i3];
    }
    double[] arrayOfDouble5 = c(arrayOfDouble4);
    double d6 = 0.0D;
    for (int i6 = 0; i6 < j; i6++) {
      arrayOfObject[0][i6] = Double.valueOf(arrayOfDouble5[(j - i6 - 1)]);
    }
    arrayOfObject[0][j] = Double.valueOf(d6);
    double[] arrayOfDouble6 = new double[i];
    for (int i7 = 0; i7 < i; i7++)
    {
      arrayOfDouble6[i7] = 0.0D;
      for (int i8 = 0; i8 < j; i8++)
      {
        d8 = ((Double)arrayOfObject[0][(j - i8 - 1)]).doubleValue();
        arrayOfDouble6[i7] += d8 * paramArrayOfDouble1[i7][i8];
      }
      arrayOfDouble6[i7] += ((Double)arrayOfObject[0][j]).doubleValue();
    }
    for (i7 = 0; i7 < i; i7++)
    {
      d1 += (paramArrayOfDouble[i7] - arrayOfDouble6[i7]) * (paramArrayOfDouble[i7] - arrayOfDouble6[i7]);
      d2 += (d3 - arrayOfDouble6[i7]) * (d3 - arrayOfDouble6[i7]);
    }
    double d7 = i - j - 1;
    double d8 = d1 / d7;
    double d9 = Math.sqrt(d8);
    arrayOfObject[2][1] = Double.valueOf(d9);
    double[][] arrayOfDouble7 = new double[paramArrayOfDouble1.length][];
    for (int i9 = 0; i9 < paramArrayOfDouble1.length; i9++)
    {
      arrayOfDouble7[i9] = new double[paramArrayOfDouble1[i9].length + 1];
      for (int i10 = 0; i10 < paramArrayOfDouble1[i9].length + 1; i10++) {
        if (i10 == 0) {
          arrayOfDouble7[i9][i10] = 1.0D;
        } else {
          arrayOfDouble7[i9][i10] = paramArrayOfDouble1[i9][(i10 - 1)];
        }
      }
    }
    double[][] arrayOfDouble8 = b(arrayOfDouble7);
    double[][] arrayOfDouble9 = a(arrayOfDouble8, arrayOfDouble7);
    double[][] arrayOfDouble10 = a(arrayOfDouble9);
    for (int i11 = 0; i11 < arrayOfDouble10.length; i11++) {
      for (int i12 = 0; i12 < arrayOfDouble10[i11].length; i12++) {
        if (i11 == i12)
        {
          d11 = arrayOfDouble10[i11][i12] * d8;
          d11 = Math.sqrt(d11);
          arrayOfObject[1][(arrayOfDouble10.length - i11 - 1)] = Double.valueOf(d11);
        }
      }
    }
    double d10 = d2 / j / d8;
    arrayOfObject[3][0] = Double.valueOf(d10);
    arrayOfObject[3][1] = Double.valueOf(d7);
    arrayOfObject[4][0] = Double.valueOf(d2);
    arrayOfObject[4][1] = Double.valueOf(d1);
    double d11 = d2 / (d2 + d1);
    arrayOfObject[2][0] = Double.valueOf(d11);
    return arrayOfObject;
  }
  
  private static double[] c(double[][] paramArrayOfDouble)
  {
    if (paramArrayOfDouble == null) {
      return null;
    }
    int i = paramArrayOfDouble.length;
    int j = paramArrayOfDouble[0].length;
    double[] arrayOfDouble = new double[i];
    int k = 0;
    for (k = 0; k < i; k++)
    {
      int m = k;
      double d2 = paramArrayOfDouble[k][k];
      for (int i1 = k + 1; i1 < i; i1++) {
        if (Math.abs(d2) < Math.abs(paramArrayOfDouble[i1][k]))
        {
          d2 = paramArrayOfDouble[i1][k];
          m = i1;
        }
      }
      double d3;
      if (k != m) {
        for (i1 = 0; i1 < j; i1++)
        {
          d3 = paramArrayOfDouble[k][i1];
          paramArrayOfDouble[k][i1] = paramArrayOfDouble[m][i1];
          paramArrayOfDouble[m][i1] = d3;
        }
      }
      for (i1 = k + 1; i1 < i; i1++) {
        if (paramArrayOfDouble[i1][k] != 0.0D)
        {
          d3 = -(paramArrayOfDouble[i1][k] / d2);
          for (int i2 = k; i2 < j; i2++)
          {
            paramArrayOfDouble[i1][i2] += paramArrayOfDouble[k][i2] * d3;
            if (Math.abs(paramArrayOfDouble[i1][i2]) < 5.0E-14D) {
              paramArrayOfDouble[i1][i2] = 0.0D;
            }
          }
        }
      }
    }
    for (k = i - 1; k >= 0; k--) {
      if (k == i - 1)
      {
        if (Math.abs(paramArrayOfDouble[k][k]) < 5.0E-14D) {
          arrayOfDouble[k] = 0.0D;
        } else {
          arrayOfDouble[k] = (paramArrayOfDouble[k][(j - 1)] / paramArrayOfDouble[k][k]);
        }
      }
      else if (Math.abs(paramArrayOfDouble[k][k]) < 5.0E-14D)
      {
        arrayOfDouble[k] = 0.0D;
      }
      else
      {
        double d1 = 0.0D;
        for (int n = k + 1; n < j - 1; n++) {
          d1 += paramArrayOfDouble[k][n] * arrayOfDouble[n];
        }
        arrayOfDouble[k] = ((paramArrayOfDouble[k][(j - 1)] - d1) / paramArrayOfDouble[k][k]);
      }
    }
    return arrayOfDouble;
  }
  
  static double[][] a(double[][] paramArrayOfDouble)
  {
    double[][] arrayOfDouble1 = new double[paramArrayOfDouble.length][];
    for (int i = 0; i < arrayOfDouble1.length; i++)
    {
      arrayOfDouble1[i] = new double[paramArrayOfDouble[0].length + paramArrayOfDouble[0].length];
      for (j = 0; j < arrayOfDouble1[i].length; j++) {
        if (j < paramArrayOfDouble[0].length) {
          arrayOfDouble1[i][j] = paramArrayOfDouble[i][j];
        } else if (j == i + paramArrayOfDouble[0].length) {
          arrayOfDouble1[i][j] = 1.0D;
        }
      }
    }
    i = arrayOfDouble1.length;
    int j = arrayOfDouble1[0].length;
    double d1 = 1;
    double d2;
    int n;
    int i1;
    for (;;)
    {
      d2 = Math.abs(arrayOfDouble1[(d1 - 1)][(d1 - 1)]);
      n = d1 - 1;
      for (i1 = d1 - 1; i1 < i; i1++) {
        if (Math.abs(arrayOfDouble1[i1][(d1 - 1)]) > d2)
        {
          d2 = Math.abs(arrayOfDouble1[i1][(d1 - 1)]);
          n = i1;
        }
      }
      double d4;
      if (n != d1 - 1) {
        for (i1 = 0; i1 < j; i1++)
        {
          d4 = arrayOfDouble1[(d1 - 1)][i1];
          arrayOfDouble1[(d1 - 1)][i1] = arrayOfDouble1[n][i1];
          arrayOfDouble1[n][i1] = d4;
        }
      }
      for (i1 = d1; i1 < i; i1++)
      {
        if (arrayOfDouble1[(d1 - 1)][(d1 - 1)] == 0.0D) {
          return (double[][])null;
        }
        d4 = arrayOfDouble1[i1][(d1 - 1)] / arrayOfDouble1[(d1 - 1)][(d1 - 1)];
        for (int i2 = 0; i2 < j; i2++) {
          arrayOfDouble1[i1][i2] -= d4 * arrayOfDouble1[(d1 - 1)][i2];
        }
      }
      d1++;
      if (d1 > arrayOfDouble1.length) {
        break;
      }
    }
    d1 = arrayOfDouble1.length - 2;
    double d3;
    for (;;)
    {
      for (d2 = d1; d2 >= 0; d2--)
      {
        if (arrayOfDouble1[(d1 + 1)][(d1 + 1)] == 0.0D) {
          return (double[][])null;
        }
        d3 = arrayOfDouble1[d2][(d1 + 1)] / arrayOfDouble1[(d1 + 1)][(d1 + 1)];
        if (Math.abs(arrayOfDouble1[(d1 + 1)][(d1 + 1)]) < 5.0E-14D) {
          d3 = 0.0D;
        }
        for (i1 = 0; i1 < j; i1++) {
          arrayOfDouble1[d2][i1] -= d3 * arrayOfDouble1[(d1 + 1)][i1];
        }
      }
      d1--;
      if (d1 < 0) {
        break;
      }
    }
    for (int k = 0; k < i; k++)
    {
      d3 = arrayOfDouble1[k][k];
      if (Math.abs(d3) < 5.0E-14D) {
        for (i1 = 0; i1 < j; i1++) {
          arrayOfDouble1[k][i1] = 0.0D;
        }
      } else {
        for (i1 = 0; i1 < j; i1++) {
          arrayOfDouble1[k][i1] /= d3;
        }
      }
    }
    double[][] arrayOfDouble2 = new double[paramArrayOfDouble.length][];
    for (int m = 0; m < i; m++)
    {
      arrayOfDouble2[m] = new double[i];
      for (n = 0; n < i; n++) {
        arrayOfDouble2[m][n] = arrayOfDouble1[m][(n + i)];
      }
    }
    return arrayOfDouble2;
  }
  
  static double[][] b(double[][] paramArrayOfDouble)
  {
    if (paramArrayOfDouble == null) {
      return (double[][])null;
    }
    int i = paramArrayOfDouble.length;
    int j = paramArrayOfDouble[0].length;
    double[][] arrayOfDouble = new double[j][];
    for (int k = 0; k < j; k++) {
      arrayOfDouble[k] = new double[i];
    }
    for (k = 0; k < j; k++) {
      for (int m = 0; m < i; m++) {
        arrayOfDouble[k][m] = paramArrayOfDouble[m][k];
      }
    }
    return arrayOfDouble;
  }
  
  static double[][] a(double[][] paramArrayOfDouble1, double[][] paramArrayOfDouble2)
  {
    if ((paramArrayOfDouble1 == null) || (paramArrayOfDouble2 == null)) {
      return (double[][])null;
    }
    int i = paramArrayOfDouble1.length;
    int j = paramArrayOfDouble1[0].length;
    int k = paramArrayOfDouble2[0].length;
    double[][] arrayOfDouble = new double[i][];
    for (int m = 0; m < i; m++) {
      arrayOfDouble[m] = new double[k];
    }
    for (m = 0; m < i; m++) {
      for (int n = 0; n < k; n++)
      {
        arrayOfDouble[m][n] = 0.0D;
        for (int i1 = 0; i1 < j; i1++) {
          arrayOfDouble[m][n] += paramArrayOfDouble1[m][i1] * paramArrayOfDouble2[i1][n];
        }
      }
    }
    return arrayOfDouble;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */