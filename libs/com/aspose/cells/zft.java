package com.aspose.cells;

import com.aspose.cells.b.a.ze;
import com.aspose.cells.b.c.a.za;

class zft
{
  private static final za a = new za(new String[] { "km", "m", "mi", "Nmi", "in", "ft", "yd", "ang", "Pica", "F", "C", "K", "yr", "day", "hr", "mn", "sec", "tsp", "tbs", "oz", "cup", "pt", "us_pt", "uk_pt", "qt", "gal", "lt", "l" });
  
  static double a(double paramDouble)
  {
    double[] arrayOfDouble1 = { 5.958930743E-11D, -1.13739022964E-9D, 1.466005199839E-8D, -1.635035446196E-7D, 1.6461004480962E-6D, -1.492559551950604E-5D, 1.2055331122299264E-4D, -8.548326981129666E-4D, 0.005223977624823223D, -0.026866170645077334D, 0.11283791670954882D, -0.3761263890318375D, 1.1283791670955126D, 2.372510631E-11D, -4.5493253732E-10D, 5.90362766598E-9D, -6.642090827576E-8D, 6.7595634268133E-7D, -6.21188515924E-6D, 5.10388300970969E-5D, -3.7015410692956176E-4D, 0.00233307631218881D, -0.012549884771821921D, 0.05657061146827042D, -0.21379664776456006D, 0.8427007929497149D, 9.49905026E-12D, -1.8310229805E-10D, 2.39463074E-9D, -2.721444369609E-8D, 2.8045522331686E-7D, -2.61830022482897E-6D, 2.195455056768781E-5D, -1.6358986921372656E-4D, 0.0010705215356411031D, -0.006082847181135901D, 0.029869784652462584D, -0.13055593046562267D, 0.674933236039655D, 3.82722073E-12D, -7.421598602E-11D, 9.793057408E-10D, -1.126008898854E-8D, 1.1775134830784E-7D, -1.1199275838265E-6D, 9.62023443095201E-6D, -7.404402135070773E-5D, 5.068999365414488E-4D, -0.003075530514392729D, 0.016689778925531657D, -0.08548534594781312D, 0.5690907664239364D, 1.55296588E-12D, -3.032205868E-11D, 4.0424830707E-10D, -4.71135111493E-9D, 5.011915876293E-8D, -4.8722516178974E-7D, 4.30683284629395E-6D, -3.445026145385764E-5D, 2.4879276133931664E-4D, -0.0016294094174807928D, 0.009887863739323505D, -0.05962426839442304D, 0.49766113250947636D };
    double[] arrayOfDouble2 = { -2.9734388465E-10D, 2.69776334046E-9D, -6.40788827665E-9D, -1.6678201321E-8D, -2.1854388148686E-7D, 2.66246030457984E-6D, 1.612722157047886E-5D, -2.5616361025506627E-4D, 1.5380842432375364E-4D, 0.00815533022524928D, -0.014022836638963193D, -0.19746892495383023D, 0.7151172032884284D, -1.951073787E-11D, -3.2302692214E-10D, 5.22461866919E-9D, 3.42940918551E-9D, -3.5772874310272E-7D, 1.9999935792654E-7D, 2.687044575042908E-5D, -1.1843240273775776E-4D, -8.099172895603227E-4D, 0.006610629705022412D, 0.009095309223548273D, -0.20160072778491014D, 0.5116969671872764D, 3.147682272E-11D, -4.8465972408E-10D, 6.3675740242E-10D, 3.377623323271E-8D, -1.5451139637086E-7D, -2.03340624738438E-6D, 1.947204525295057E-5D, 2.854147231653228E-5D, -0.0010156506315220028D, 0.0027118700352009566D, 0.023280950354228107D, -0.16725021123116876D, 0.32490054966649434D, 2.31936337E-11D, -6.303206648E-11D, -2.64888267434E-9D, 2.050708040581E-8D, 1.1371857327578E-7D, -2.11211337219663E-6D, 3.68797328322935E-6D, 9.823686253424796E-5D, -6.586024399045536E-4D, -7.528581489523087E-4D, 0.025854344242029606D, -0.11637092784486193D, 0.1826733677529661D, -3.67789363E-12D, 2.0876046746E-10D, -1.93319027226E-9D, -4.35953392472E-9D, 1.8006992266137E-7D, -7.8441223763969E-7D, -6.75407647949153E-6D, 8.428418334440096E-5D, -1.7604388937031816E-4D, -0.002397296114350716D, 0.02064129023876023D, -0.06905562880005864D, 0.09084526782065479D };
    double d1 = Math.abs(paramDouble);
    double d2 = 0.0D;
    double d3 = 0.0D;
    int i = 0;
    if (d1 < 2.2D)
    {
      d2 = d1 * d1;
      i = (int)d2;
      d2 -= i;
      i *= 13;
      d3 = ((((((((((((arrayOfDouble1[i] * d2 + arrayOfDouble1[(i + 1)]) * d2 + arrayOfDouble1[(i + 2)]) * d2 + arrayOfDouble1[(i + 3)]) * d2 + arrayOfDouble1[(i + 4)]) * d2 + arrayOfDouble1[(i + 5)]) * d2 + arrayOfDouble1[(i + 6)]) * d2 + arrayOfDouble1[(i + 7)]) * d2 + arrayOfDouble1[(i + 8)]) * d2 + arrayOfDouble1[(i + 9)]) * d2 + arrayOfDouble1[(i + 10)]) * d2 + arrayOfDouble1[(i + 11)]) * d2 + arrayOfDouble1[(i + 12)]) * d1;
    }
    else if (d1 < 6.9D)
    {
      i = (int)d1;
      d2 = d1 - i;
      i = 13 * (i - 2);
      d3 = (((((((((((arrayOfDouble2[i] * d2 + arrayOfDouble2[(i + 1)]) * d2 + arrayOfDouble2[(i + 2)]) * d2 + arrayOfDouble2[(i + 3)]) * d2 + arrayOfDouble2[(i + 4)]) * d2 + arrayOfDouble2[(i + 5)]) * d2 + arrayOfDouble2[(i + 6)]) * d2 + arrayOfDouble2[(i + 7)]) * d2 + arrayOfDouble2[(i + 8)]) * d2 + arrayOfDouble2[(i + 9)]) * d2 + arrayOfDouble2[(i + 10)]) * d2 + arrayOfDouble2[(i + 11)]) * d2 + arrayOfDouble2[(i + 12)];
      d3 *= d3;
      d3 *= d3;
      d3 *= d3;
      d3 = 1.0D - d3 * d3;
    }
    else
    {
      d3 = 1.0D;
    }
    return d3;
  }
  
  static double a(double paramDouble, int paramInt)
  {
    double d3 = 0.0D;
    double[] arrayOfDouble1 = { 1.0D, 3.5156229D, 3.0899424D, 1.2067492D, 0.2659732D, 0.0360768D, 0.0045813D };
    double[] arrayOfDouble2 = { 0.5D, 0.87890594D, 0.51498869D, 0.15084934D, 0.02658773D, 0.00301532D, 3.2411E-4D };
    double[] arrayOfDouble3 = { 0.39894228D, 0.01328592D, 0.00225319D, -0.00157565D, 0.00916281D, -0.02057706D, 0.02635537D, -0.01647633D, 0.00392377D };
    double[] arrayOfDouble4 = { 0.39894228D, -0.03988024D, -0.00362018D, 0.00163801D, -0.01031555D, 0.02282967D, -0.02895312D, 0.01787654D, -0.00420059D };
    if (paramInt < 0) {
      paramInt = -paramInt;
    }
    double d1 = Math.abs(paramDouble);
    if (paramInt != 1)
    {
      if (d1 < 3.75D)
      {
        d2 = paramDouble / 3.75D * (paramDouble / 3.75D);
        d3 = arrayOfDouble1[6];
        for (i = 5; i >= 0; i--) {
          d3 = d3 * d2 + arrayOfDouble1[i];
        }
      }
      d2 = 3.75D / d1;
      d3 = arrayOfDouble3[8];
      for (i = 7; i >= 0; i--) {
        d3 = d3 * d2 + arrayOfDouble3[i];
      }
      d3 = d3 * Math.exp(d1) / Math.sqrt(d1);
    }
    if (paramInt == 0) {
      return d3;
    }
    double d6 = d3;
    if (d1 < 3.75D)
    {
      d2 = paramDouble / 3.75D * (paramDouble / 3.75D);
      d3 = arrayOfDouble2[6];
      for (i = 5; i >= 0; i--) {
        d3 = d3 * d2 + arrayOfDouble2[i];
      }
      d3 *= d1;
    }
    else
    {
      d2 = 3.75D / d1;
      d3 = arrayOfDouble4[8];
      for (i = 7; i >= 0; i--) {
        d3 = d3 * d2 + arrayOfDouble4[i];
      }
      d3 = d3 * Math.exp(d1) / Math.sqrt(d1);
    }
    if (paramDouble < 0.0D) {
      d3 = -d3;
    }
    if (paramInt == 1) {
      return d3;
    }
    if (paramDouble == 0.0D) {
      return 0.0D;
    }
    double d2 = 2.0D / d1;
    d1 = 0.0D;
    double d5 = 1.0D;
    double d4 = 0.0D;
    int j = paramInt + (int)Math.sqrt(40.0D * paramInt);
    j = 2 * j;
    for (int i = j; i > 0; i--)
    {
      d3 = d4 + i * d2 * d5;
      d4 = d5;
      d5 = d3;
      if (Math.abs(d5) > 1.0E10D)
      {
        d1 *= 1.0E-10D;
        d4 *= 1.0E-10D;
        d5 *= 1.0E-10D;
      }
      if (i == paramInt) {
        d1 = d4;
      }
    }
    d3 = d1 * d6 / d5;
    if ((paramDouble < 0.0D) && (paramInt % 2 == 1)) {
      d3 = -d3;
    }
    return d3;
  }
  
  static double b(double paramDouble, int paramInt)
  {
    int i = 0;
    int j = 0;
    double d4 = 0.0D;
    double[] arrayOfDouble1 = { 5.7568490574E10D, -1.3362590354E10D, 6.516196407E8D, -1.121442418E7D, 77392.33017D, -184.9052456D };
    double[] arrayOfDouble2 = { 5.7568490411E10D, 1.029532985E9D, 9494680.718D, 59272.64853D, 267.8532712D, 1.0D };
    double[] arrayOfDouble3 = { 7.2362614232E10D, -7.895059235E9D, 2.423968531E8D, -2972611.439D, 15704.4826D, -30.16036606D };
    double[] arrayOfDouble4 = { 1.44725228443E11D, 2.300535178E9D, 1.858330474E7D, 99447.43394D, 376.9991397D, 1.0D };
    double[] arrayOfDouble5 = { 1.0D, -0.001098628627D, 2.734510407E-5D, -2.073370639E-6D, 2.093887211E-7D };
    double[] arrayOfDouble6 = { -0.01562499995D, 1.430488765E-4D, -6.911147651E-6D, 7.621095161E-7D, -9.34935152E-8D };
    double[] arrayOfDouble7 = { 1.0D, 0.00183105D, -3.516396496E-5D, 2.457520174E-6D, -2.40337019E-7D };
    double[] arrayOfDouble8 = { 0.04687499995D, -2.002690873E-4D, 8.449199096E-6D, -8.8228987E-7D, 1.05787412E-7D };
    double d1 = Math.abs(paramDouble);
    if (paramInt < 0) {
      paramInt = -paramInt;
    }
    double d2;
    double d3;
    if (paramInt != 1) {
      if (d1 < 8.0D)
      {
        d2 = d1 * d1;
        d4 = arrayOfDouble1[5];
        d5 = arrayOfDouble2[5];
        for (i = 4; i >= 0; i--)
        {
          d4 = d4 * d2 + arrayOfDouble1[i];
          d5 = d5 * d2 + arrayOfDouble2[i];
        }
        d4 /= d5;
      }
      else
      {
        d3 = 8.0D / d1;
        d2 = d3 * d3;
        d4 = arrayOfDouble5[4];
        d5 = arrayOfDouble6[4];
        for (i = 3; i >= 0; i--)
        {
          d4 = d4 * d2 + arrayOfDouble5[i];
          d5 = d5 * d2 + arrayOfDouble6[i];
        }
        d6 = d1 - 0.785398164D;
        d4 = d4 * Math.cos(d6) - d3 * d5 * Math.sin(d6);
        d4 *= Math.sqrt(0.636619772D / d1);
      }
    }
    if (paramInt == 0) {
      return d4;
    }
    double d7 = d4;
    if (d1 < 8.0D)
    {
      d2 = d1 * d1;
      d4 = arrayOfDouble3[5];
      d5 = arrayOfDouble4[5];
      for (i = 4; i >= 0; i--)
      {
        d4 = d4 * d2 + arrayOfDouble3[i];
        d5 = d5 * d2 + arrayOfDouble4[i];
      }
      d4 = paramDouble * d4 / d5;
    }
    else
    {
      d3 = 8.0D / d1;
      d2 = d3 * d3;
      d4 = arrayOfDouble7[4];
      d5 = arrayOfDouble8[4];
      for (i = 3; i >= 0; i--)
      {
        d4 = d4 * d2 + arrayOfDouble7[i];
        d5 = d5 * d2 + arrayOfDouble8[i];
      }
      d6 = d1 - 2.356194491D;
      d4 = d4 * Math.cos(d6) - d3 * d5 * Math.sin(d6);
      d4 = d4 * paramDouble * Math.sqrt(0.636619772D / d1) / d1;
    }
    if (paramInt == 1) {
      return d4;
    }
    double d8 = d4;
    if (paramDouble == 0.0D) {
      return 0.0D;
    }
    double d6 = 2.0D / d1;
    if (d1 > 1.0D * paramInt)
    {
      if (paramDouble < 0.0D) {
        d8 = -d8;
      }
      for (i = 1; i <= paramInt - 1; i++)
      {
        d4 = d6 * i * d8 - d7;
        d7 = d8;
        d8 = d4;
      }
    }
    j = (paramInt + (int)Math.sqrt(40.0D * paramInt)) / 2;
    j = 2 * j;
    d4 = 0.0D;
    double d5 = 0.0D;
    d7 = 1.0D;
    d8 = 0.0D;
    for (i = j - 1; i >= 0; i--)
    {
      d1 = d6 * (i + 1) * d7 - d8;
      d8 = d7;
      d7 = d1;
      if (Math.abs(d7) > 1.0E10D)
      {
        d7 *= 1.0E-10D;
        d8 *= 1.0E-10D;
        d4 *= 1.0E-10D;
        d5 *= 1.0E-10D;
      }
      if ((i + 2) % 2 == 0) {
        d5 += d7;
      }
      if (i + 1 == paramInt) {
        d4 = d8;
      }
    }
    d5 = 2.0D * d5 - d7;
    d4 /= d5;
    if ((paramDouble < 0.0D) && (paramInt % 2 == 1)) {
      d4 = -d4;
    }
    return d4;
  }
  
  static double c(double paramDouble, int paramInt)
  {
    double d3 = 0.0D;
    double[] arrayOfDouble1 = { -2.957821389E9D, 7.062834065E9D, -5.123598036E8D, 1.087988129E7D, -86327.92757D, 228.4622733D };
    double[] arrayOfDouble2 = { 4.0076544269E10D, 7.452499648E8D, 7189466.438D, 47447.2647D, 226.1030244D, 1.0D };
    double[] arrayOfDouble3 = { -4.900604943E12D, 1.27527439E12D, -5.153438139E10D, 7.349264551E8D, -4237922.726D, 8511.937935D };
    double[] arrayOfDouble4 = { 2.49958057E13D, 4.244419664E11D, 3.733650367E9D, 2.245904002E7D, 102042.605D, 354.9632885D, 1.0D };
    double[] arrayOfDouble5 = { 1.0D, -0.001098628627D, 2.734510407E-5D, -2.073370639E-6D, 2.093887211E-7D };
    double[] arrayOfDouble6 = { -0.01562499995D, 1.430488765E-4D, -6.911147651E-6D, 7.621095161E-7D, -9.34935152E-8D };
    double[] arrayOfDouble7 = { 1.0D, 0.00183105D, -3.516396496E-5D, 2.457520174E-6D, -2.40337019E-7D };
    double[] arrayOfDouble8 = { 0.04687499995D, -2.002690873E-4D, 8.449199096E-6D, -8.8228987E-7D, 1.05787412E-7D };
    if (paramInt < 0) {
      paramInt = -paramInt;
    }
    if (paramDouble < 0.0D) {
      paramDouble = -paramDouble;
    }
    if (paramDouble == 0.0D) {
      return -1.0E70D;
    }
    double d1;
    double d4;
    double d2;
    if (paramInt != 1) {
      if (paramDouble < 8.0D)
      {
        d1 = paramDouble * paramDouble;
        d3 = arrayOfDouble1[5];
        d4 = arrayOfDouble2[5];
        for (i = 4; i >= 0; i--)
        {
          d3 = d3 * d1 + arrayOfDouble1[i];
          d4 = d4 * d1 + arrayOfDouble2[i];
        }
        d3 = d3 / d4 + 0.636619772D * b(paramDouble, 0) * Math.log(paramDouble);
      }
      else
      {
        d2 = 8.0D / paramDouble;
        d1 = d2 * d2;
        d3 = arrayOfDouble5[4];
        d4 = arrayOfDouble6[4];
        for (i = 3; i >= 0; i--)
        {
          d3 = d3 * d1 + arrayOfDouble5[i];
          d4 = d4 * d1 + arrayOfDouble6[i];
        }
        d5 = paramDouble - 0.785398164D;
        d3 = d3 * Math.sin(d5) + d2 * d4 * Math.cos(d5);
        d3 *= Math.sqrt(0.636619772D / paramDouble);
      }
    }
    if (paramInt == 0) {
      return d3;
    }
    double d6 = d3;
    if (paramDouble < 8.0D)
    {
      d1 = paramDouble * paramDouble;
      d3 = arrayOfDouble3[5];
      d4 = arrayOfDouble4[6];
      for (i = 4; i >= 0; i--)
      {
        d3 = d3 * d1 + arrayOfDouble3[i];
        d4 = d4 * d1 + arrayOfDouble4[(i + 1)];
      }
      d4 = d4 * d1 + arrayOfDouble4[0];
      d3 = paramDouble * d3 / d4 + 0.636619772D * (b(paramDouble, 1) * Math.log(paramDouble) - 1.0D / paramDouble);
    }
    else
    {
      d2 = 8.0D / paramDouble;
      d1 = d2 * d2;
      d3 = arrayOfDouble7[4];
      d4 = arrayOfDouble8[4];
      for (i = 3; i >= 0; i--)
      {
        d3 = d3 * d1 + arrayOfDouble7[i];
        d4 = d4 * d1 + arrayOfDouble8[i];
      }
      d5 = paramDouble - 2.356194491D;
      d3 = d3 * Math.sin(d5) + d2 * d4 * Math.cos(d5);
      d3 *= Math.sqrt(0.636619772D / paramDouble);
    }
    if (paramInt == 1) {
      return d3;
    }
    double d7 = d3;
    double d5 = 2.0D / paramDouble;
    for (int i = 1; i <= paramInt - 1; i++)
    {
      d3 = d5 * i * d7 - d6;
      d6 = d7;
      d7 = d3;
    }
    return d3;
  }
  
  static double d(double paramDouble, int paramInt)
  {
    double d2 = 0.0D;
    double[] arrayOfDouble1 = { -0.57721566D, 0.4227842D, 0.23069756D, 0.0348859D, 0.00262698D, 1.075E-4D, 7.4E-6D };
    double[] arrayOfDouble2 = { 1.0D, 0.15443144D, -0.67278579D, -0.18156897D, -0.01919402D, -0.00110404D, -4.686E-5D };
    double[] arrayOfDouble3 = { 1.25331414D, -0.07832358D, 0.02189568D, -0.01062446D, 0.00587872D, -0.0025154D, 5.3208E-4D };
    double[] arrayOfDouble4 = { 1.25331414D, 0.23498619D, -0.0365562D, 0.01504268D, -0.00780353D, 0.00325614D, -6.8245E-4D };
    if (paramInt < 0) {
      paramInt = -paramInt;
    }
    if (paramDouble < 0.0D) {
      paramDouble = -paramDouble;
    }
    if (paramDouble == 0.0D) {
      return 1.0E70D;
    }
    if (paramInt != 1) {
      if (paramDouble <= 2.0D)
      {
        d1 = paramDouble * paramDouble / 4.0D;
        d2 = arrayOfDouble1[6];
        for (i = 5; i >= 0; i--) {
          d2 = d2 * d1 + arrayOfDouble1[i];
        }
        d2 -= a(paramDouble, 0) * Math.log(paramDouble / 2.0D);
      }
      else
      {
        d1 = 2.0D / paramDouble;
        d2 = arrayOfDouble3[6];
        for (i = 5; i >= 0; i--) {
          d2 = d2 * d1 + arrayOfDouble3[i];
        }
        d2 = d2 * Math.exp(-paramDouble) / Math.sqrt(paramDouble);
      }
    }
    if (paramInt == 0) {
      return d2;
    }
    double d3 = d2;
    if (paramDouble <= 2.0D)
    {
      d1 = paramDouble * paramDouble / 4.0D;
      d2 = arrayOfDouble2[6];
      for (i = 5; i >= 0; i--) {
        d2 = d2 * d1 + arrayOfDouble2[i];
      }
      d2 = d2 / paramDouble + a(paramDouble, 1) * Math.log(paramDouble / 2.0D);
    }
    else
    {
      d1 = 2.0D / paramDouble;
      d2 = arrayOfDouble4[6];
      for (i = 5; i >= 0; i--) {
        d2 = d2 * d1 + arrayOfDouble4[i];
      }
      d2 = d2 * Math.exp(-paramDouble) / Math.sqrt(paramDouble);
    }
    if (paramInt == 1) {
      return d2;
    }
    double d4 = d2;
    double d1 = 2.0D / paramDouble;
    for (int i = 1; i < paramInt; i++)
    {
      d2 = d3 + i * d1 * d4;
      d3 = d4;
      d4 = d2;
    }
    return d2;
  }
  
  static String a(String paramString)
  {
    if (paramString.length() > 10) {
      return null;
    }
    int i = 0;
    for (int j = paramString.length() - 1; j > -1; j--)
    {
      int k = paramString.charAt(j);
      if (k != 48)
      {
        if (k != 49) {
          return null;
        }
        i = j;
      }
    }
    return i > 0 ? paramString.substring(i) : paramString;
  }
  
  static String b(String paramString)
  {
    if (paramString.length() > 10) {
      return null;
    }
    int i = 0;
    for (int j = paramString.length() - 1; j > -1; j--)
    {
      int k = paramString.charAt(j);
      if (k != 48)
      {
        if ((k < 48) || (k > 55)) {
          return null;
        }
        i = j;
      }
    }
    return i > 0 ? paramString.substring(i) : paramString;
  }
  
  static String c(String paramString)
  {
    if (paramString.length() > 10) {
      return null;
    }
    int i = 0;
    for (int j = paramString.length() - 1; j > -1; j--)
    {
      int k = paramString.charAt(j);
      if (k != 48) {
        if (((k > 48) && (k <= 57)) || ((k >= 97) && (k <= 102)) || ((k >= 65) && (k <= 70))) {
          i = j;
        } else {
          return null;
        }
      }
    }
    return i > 0 ? paramString.substring(i) : paramString;
  }
  
  static String a(String paramString, int paramInt1, int paramInt2)
  {
    long l = 0L;
    if (paramInt1 == 2)
    {
      if ((paramString.length() == 10) && (paramString.charAt(0) == '1')) {
        l -= (ze.a(paramString.substring(1, 10), paramInt1) ^ 0x1FF) + 1L;
      } else {
        l = ze.a(paramString, paramInt1);
      }
    }
    else if (paramInt1 == 8)
    {
      if ((paramString.length() == 10) && (paramString.charAt(0) == '7')) {
        l -= (ze.a(paramString.substring(1, 10), paramInt1) ^ 0x7FFFFFF) + 1L;
      } else {
        l = ze.a(paramString, paramInt1);
      }
    }
    else if (paramInt1 == 16)
    {
      if ((paramString.length() == 10) && (paramString.toUpperCase().charAt(0) == 'F')) {
        l -= (ze.a(paramString.substring(1, 10), paramInt1) ^ 0xFFFFFFFFF) + 1L;
      } else {
        l = ze.a(paramString, paramInt1);
      }
    }
    else {
      l = ze.a(paramString, paramInt1);
    }
    return ze.a(l, paramInt2).toUpperCase();
  }
  
  static zaie a(double paramDouble, String paramString1, String paramString2)
  {
    switch (a.a(paramString1))
    {
    case 0: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
      switch (a.a(paramString2))
      {
      case 0: 
      case 1: 
      case 2: 
      case 3: 
      case 4: 
      case 5: 
      case 6: 
      case 7: 
      case 8: 
        break;
      default: 
        return zabc.g;
      }
      return new zabb(paramDouble * (f(paramString1) / f(paramString2)));
    case 9: 
    case 10: 
    case 11: 
      switch (a.a(paramString2))
      {
      case 9: 
      case 10: 
      case 11: 
        return new zabb(b(a(paramDouble, paramString1), paramString2));
      }
      return zabc.g;
    case 12: 
    case 13: 
    case 14: 
    case 15: 
    case 16: 
      switch (a.a(paramString2))
      {
      case 12: 
      case 13: 
      case 14: 
      case 15: 
      case 16: 
        return new zabb(paramDouble * e(paramString1) / e(paramString2));
      }
      return zabc.g;
    case 17: 
    case 18: 
    case 19: 
    case 20: 
    case 21: 
    case 22: 
    case 23: 
    case 24: 
    case 25: 
    case 26: 
    case 27: 
      switch (a.a(paramString2))
      {
      case 17: 
      case 18: 
      case 19: 
      case 20: 
      case 21: 
      case 22: 
      case 23: 
      case 24: 
      case 25: 
      case 26: 
      case 27: 
        return new zabb(paramDouble * d(paramString1) / d(paramString2));
      }
      return zabc.g;
    }
    return new zabb(paramDouble);
  }
  
  private static double d(String paramString)
  {
    switch (a.a(paramString))
    {
    case 17: 
      return 4.928924902900179D;
    case 18: 
      return 14.78677470870054D;
    case 19: 
      return 29.57354941740108D;
    case 20: 
      return 236.58839533920863D;
    case 21: 
    case 22: 
      return 473.17567119968953D;
    case 23: 
      return 568.2463916354131D;
    case 24: 
      return 946.3513423993791D;
    case 25: 
      return 3785.412534257983D;
    case 26: 
    case 27: 
      return 1000.0D;
    }
    return 1.0D;
  }
  
  private static double e(String paramString)
  {
    switch (a.a(paramString))
    {
    case 12: 
      return 8766.0D;
    case 13: 
      return 24.0D;
    case 14: 
      return 1.0D;
    case 15: 
      return 0.016666666666666666D;
    case 16: 
      return 2.777777777777778E-4D;
    }
    return 1.0D;
  }
  
  private static double a(double paramDouble, String paramString)
  {
    switch (paramString.charAt(0))
    {
    case 'F': 
      return (paramDouble - 32.0D) * 5.0D / 9.0D;
    case 'C': 
      return paramDouble;
    case 'K': 
      return paramDouble - 273.15D;
    }
    return paramDouble;
  }
  
  private static double b(double paramDouble, String paramString)
  {
    switch (paramString.charAt(0))
    {
    case 'F': 
      return paramDouble * 1.8D + 32.0D;
    case 'C': 
      return paramDouble;
    case 'K': 
      return paramDouble + 273.15D;
    }
    return paramDouble;
  }
  
  private static double f(String paramString)
  {
    switch (a.a(paramString))
    {
    case 0: 
      return 39370.07874015748D;
    case 1: 
      return 39.37007874015748D;
    case 2: 
      return 63360.0D;
    case 3: 
      return 72913.38583D;
    case 4: 
      return 1.0D;
    case 5: 
      return 12.0D;
    case 6: 
      return 36.0D;
    case 7: 
      return 3.93701E-9D;
    case 8: 
      return 0.013888889D;
    }
    return 1.0D;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zft.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */