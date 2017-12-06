package com.aspose.cells;

class zaqs
{
  public static double a(double paramDouble)
  {
    double d1 = paramDouble - 0.5D;
    double d2;
    double d3;
    if (Math.abs(d1) <= 0.425D)
    {
      d2 = 0.180625D - d1 * d1;
      d3 = d1 * (((((((d2 * 2509.0809287301227D + 33430.57558358813D) * d2 + 67265.7709270087D) * d2 + 45921.95393154987D) * d2 + 13731.69376550946D) * d2 + 1971.5909503065513D) * d2 + 133.14166789178438D) * d2 + 3.3871328727963665D) / (((((((d2 * 5226.495278852854D + 28729.085735721943D) * d2 + 39307.89580009271D) * d2 + 21213.794301586597D) * d2 + 5394.196021424751D) * d2 + 687.1870074920579D) * d2 + 42.31333070160091D) * d2 + 1.0D);
    }
    else
    {
      if (d1 > 0.0D) {
        d2 = 1.0D - paramDouble;
      } else {
        d2 = paramDouble;
      }
      d2 = Math.sqrt(-Math.log(d2));
      if (d2 <= 5.0D)
      {
        d2 += -1.6D;
        d3 = (((((((d2 * 7.745450142783414E-4D + 0.022723844989269184D) * d2 + 0.2417807251774506D) * d2 + 1.2704582524523684D) * d2 + 3.6478483247632045D) * d2 + 5.769497221460691D) * d2 + 4.630337846156546D) * d2 + 1.4234371107496835D) / (((((((d2 * 1.0507500716444169E-9D + 5.475938084995345E-4D) * d2 + 0.015198666563616457D) * d2 + 0.14810397642748008D) * d2 + 0.6897673349851D) * d2 + 1.6763848301838038D) * d2 + 2.053191626637759D) * d2 + 1.0D);
      }
      else
      {
        d2 += -5.0D;
        d3 = (((((((d2 * 2.0103343992922881E-7D + 2.7115555687434876E-5D) * d2 + 0.0012426609473880784D) * d2 + 0.026532189526576124D) * d2 + 0.29656057182850487D) * d2 + 1.7848265399172913D) * d2 + 5.463784911164114D) * d2 + 6.657904643501103D) / (((((((d2 * 2.0442631033899397E-15D + 1.421511758316446E-7D) * d2 + 1.8463183175100548E-5D) * d2 + 7.868691311456133E-4D) * d2 + 0.014875361290850615D) * d2 + 0.1369298809227358D) * d2 + 0.599832206555888D) * d2 + 1.0D);
      }
      if (d1 < 0.0D) {
        d3 = -d3;
      }
    }
    return d3;
  }
  
  public static double a(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    return a(paramDouble1) * paramDouble3 + paramDouble2;
  }
  
  public static double a(double paramDouble1, double paramDouble2, double paramDouble3, boolean paramBoolean)
  {
    if (paramBoolean) {
      return 0.5D + d((paramDouble1 - paramDouble2) / paramDouble3);
    }
    return c((paramDouble1 - paramDouble2) / paramDouble3) / paramDouble3;
  }
  
  public static double b(double paramDouble)
  {
    return 0.5D + d(paramDouble);
  }
  
  private static double c(double paramDouble)
  {
    return 0.3989422804014327D * Math.exp(-(paramDouble * paramDouble) / 2.0D);
  }
  
  private static double d(double paramDouble)
  {
    double[] arrayOfDouble1 = { 0.3989422804014327D, -0.06649038006690546D, 0.00997355701003582D, -0.00118732821548045D, 1.1543468761616E-4D, -9.4446562595E-6D, 6.6596935163E-7D, -4.122667415E-8D, 2.27352982E-9D, 1.1301172E-10D, 5.11243E-12D, -2.1218E-13D };
    double[] arrayOfDouble2 = { 0.4772498680518208D, 0.05399096651318805D, -0.05399096651318805D, 0.02699548325659403D, -0.00449924720943234D, -0.00224962360471617D, 0.0013497741628297D, -1.178374269137E-4D, -1.1515930357476E-4D, 3.704737285544E-5D, 2.82690796889E-6D, -3.54513195524E-6D, 3.7669563126E-7D, 1.9202407921E-7D, -5.22690859E-8D, -4.91799345E-9D, 3.66377919E-9D, -1.5981997E-10D, -1.7381238E-10D, 2.624031E-11D, 5.60919E-12D, -1.72127E-12D, -8.634E-14D, 7.894E-14D };
    double[] arrayOfDouble3 = { 0.4999683287581669D, 1.3383022576489E-4D, -2.6766045152977E-4D, 3.3457556441221E-4D, -2.8996548915725E-4D, 1.8178605666397E-4D, -8.252863922168E-5D, 2.551802519049E-5D, -3.91665839292E-6D, -7.4018205222E-7D, 6.4422023359E-7D, -1.737015534E-7D, 9.09595465E-9D, 9.44943118E-9D, -3.29957075E-9D, 2.9492075E-10D, 1.1874477E-10D, -4.420396E-11D, 3.61422E-12D, 1.43638E-12D, -4.5848E-13D };
    double[] arrayOfDouble4 = { -1.0D, 1.0D, -3.0D, 15.0D, -105.0D };
    double d1 = Math.abs(paramDouble);
    double d2 = (short)(int)e(d1);
    double d3 = 0.0D;
    if (d2 == 0.0D) {
      d3 = a(arrayOfDouble1, 11, d1 * d1) * d1;
    } else if ((d2 >= 1.0D) && (d2 <= 2.0D)) {
      d3 = a(arrayOfDouble2, 23, d1 - 2.0D);
    } else if ((d2 >= 3.0D) && (d2 <= 4.0D)) {
      d3 = a(arrayOfDouble3, 20, d1 - 4.0D);
    } else {
      d3 = 0.5D + c(d1) * a(arrayOfDouble4, 4, 1.0D / (d1 * d1)) / d1;
    }
    if (paramDouble < 0.0D) {
      return -d3;
    }
    return d3;
  }
  
  private static double e(double paramDouble)
  {
    double d = Math.floor(paramDouble);
    if ((a(paramDouble - 1.0D, d)) && (!a(paramDouble, d))) {
      return d + 1.0D;
    }
    return d;
  }
  
  private static boolean a(double paramDouble1, double paramDouble2)
  {
    if (paramDouble1 == paramDouble2) {
      return true;
    }
    double d = paramDouble1 - paramDouble2;
    return (d < 0.0D ? -d : d) < (paramDouble1 < 0.0D ? -paramDouble1 : paramDouble1) * 3.552713678800501E-15D;
  }
  
  private static double a(double[] paramArrayOfDouble, int paramInt, double paramDouble)
  {
    double d = paramArrayOfDouble[paramInt];
    for (int i = paramInt - 1; i >= 0; i--) {
      d = paramArrayOfDouble[i] + d * paramDouble;
    }
    return d;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaqs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */