package com.aspose.cells;

abstract class zada
{
  static double a(double[] paramArrayOfDouble1, int paramInt1, double[] paramArrayOfDouble2, int paramInt2, double paramDouble)
  {
    double d1 = paramArrayOfDouble1[(paramInt1 - 1)];
    for (int i = paramInt1 - 1; i > 0; i--) {
      d1 = paramDouble * d1 + paramArrayOfDouble1[(i - 1)];
    }
    double d2 = paramArrayOfDouble2[(paramInt2 - 1)];
    for (int j = paramInt2 - 1; j > 0; j--) {
      d2 = paramDouble * d2 + paramArrayOfDouble2[(j - 1)];
    }
    return d1 / d2;
  }
  
  static double a(double paramDouble)
  {
    double[] arrayOfDouble1 = { 3.3871328727963665D, 133.14166789178438D, 1971.5909503065513D, 13731.69376550946D, 45921.95393154987D, 67265.7709270087D, 33430.57558358813D, 2509.0809287301227D };
    double[] arrayOfDouble2 = { 1.0D, 42.31333070160091D, 687.1870074920579D, 5394.196021424751D, 21213.794301586597D, 39307.89580009271D, 28729.085735721943D, 5226.495278852854D };
    return paramDouble * a(arrayOfDouble1, 8, arrayOfDouble2, 8, 0.180625D - paramDouble * paramDouble);
  }
  
  static double b(double paramDouble)
  {
    double[] arrayOfDouble1 = { 1.4234371107496835D, 4.630337846156546D, 5.769497221460691D, 3.6478483247632045D, 1.2704582524523684D, 0.2417807251774506D, 0.022723844989269184D, 7.745450142783414E-4D };
    double[] arrayOfDouble2 = { 1.0D, 2.053191626637759D, 1.6763848301838038D, 0.6897673349851D, 0.14810397642748008D, 0.015198666563616457D, 5.475938084995345E-4D, 1.0507500716444169E-9D };
    return a(arrayOfDouble1, 8, arrayOfDouble2, 8, paramDouble - 1.6D);
  }
  
  static double c(double paramDouble)
  {
    double[] arrayOfDouble1 = { 6.657904643501103D, 5.463784911164114D, 1.7848265399172913D, 0.29656057182850487D, 0.026532189526576124D, 0.0012426609473880784D, 2.7115555687434876E-5D, 2.0103343992922881E-7D };
    double[] arrayOfDouble2 = { 1.0D, 0.599832206555888D, 0.1369298809227358D, 0.014875361290850615D, 7.868691311456133E-4D, 1.8463183175100548E-5D, 1.421511758316446E-7D, 2.0442631033899397E-15D };
    return a(arrayOfDouble1, 8, arrayOfDouble2, 8, paramDouble - 5.0D);
  }
  
  public static double d(double paramDouble)
  {
    if (paramDouble == 1.0D) {
      return 100000.0D;
    }
    if (paramDouble == 0.0D) {
      return -100000.0D;
    }
    double d1 = paramDouble - 0.5D;
    if (Math.abs(d1) <= 0.425D) {
      return a(d1);
    }
    double d3 = paramDouble < 0.5D ? paramDouble : 1.0D - paramDouble;
    double d2 = Math.sqrt(-Math.log(d3));
    double d4;
    if (d2 <= 5.0D) {
      d4 = b(d2);
    } else {
      d4 = c(d2);
    }
    if (paramDouble < 0.5D) {
      return -d4;
    }
    return d4;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zada.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */