package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbyj
  extends zcd
{
  zbyj()
  {
    c(4127);
    b(42);
    this.b = new byte[42];
    this.b[40] = 31;
    this.b[41] = 1;
  }
  
  void a(Axis paramAxis)
    throws Exception
  {
    try
    {
      double d;
      if (!paramAxis.e())
      {
        if ((paramAxis.getMinValue() instanceof Double)) {
          d = ((Double)paramAxis.getMinValue()).doubleValue();
        } else {
          d = ((DateTime)paramAxis.getMinValue()).h();
        }
        if (paramAxis.isLogarithmic())
        {
          d = Math.log10(d);
          d = b(d);
        }
        System.arraycopy(zc.a(d), 0, this.b, 0, 8);
        byte[] tmp80_75 = this.b;
        tmp80_75[40] = ((byte)(tmp80_75[40] & 0xFE));
      }
      if (!paramAxis.f())
      {
        if ((paramAxis.getMaxValue() instanceof Double)) {
          d = ((Double)paramAxis.getMaxValue()).doubleValue();
        } else {
          d = ((DateTime)paramAxis.getMaxValue()).h();
        }
        if (paramAxis.isLogarithmic())
        {
          d = Math.log10(d);
          d = a(d);
        }
        System.arraycopy(zc.a(d), 0, this.b, 8, 8);
        byte[] tmp170_165 = this.b;
        tmp170_165[40] = ((byte)(tmp170_165[40] & 0xFD));
      }
      if (!paramAxis.g())
      {
        d = paramAxis.getMajorUnit();
        if (paramAxis.isLogarithmic()) {
          d = Math.log10(d);
        }
        System.arraycopy(zc.a(d), 0, this.b, 16, 8);
        byte[] tmp224_219 = this.b;
        tmp224_219[40] = ((byte)(tmp224_219[40] & 0xFB));
      }
      if (!paramAxis.h())
      {
        d = paramAxis.getMinorUnit();
        if (paramAxis.isLogarithmic()) {
          d = Math.log10(d);
        }
        System.arraycopy(zc.a(d), 0, this.b, 24, 8);
        byte[] tmp278_273 = this.b;
        tmp278_273[40] = ((byte)(tmp278_273[40] & 0xF7));
      }
      if (paramAxis.getCrossType() == 2)
      {
        d = paramAxis.getCrossAt();
        if (paramAxis.isLogarithmic()) {
          d = Math.log10(d);
        }
        System.arraycopy(zc.a(d), 0, this.b, 32, 8);
        byte[] tmp333_328 = this.b;
        tmp333_328[40] = ((byte)(tmp333_328[40] & 0xEF));
      }
      else if (paramAxis.getCrossType() == 1)
      {
        byte[] tmp358_353 = this.b;
        tmp358_353[40] = ((byte)(tmp358_353[40] | 0x80));
      }
      if (paramAxis.isLogarithmic())
      {
        byte[] tmp379_374 = this.b;
        tmp379_374[40] = ((byte)(tmp379_374[40] | 0x20));
      }
      if (paramAxis.isPlotOrderReversed())
      {
        byte[] tmp399_394 = this.b;
        tmp399_394[40] = ((byte)(tmp399_394[40] | 0x40));
      }
    }
    catch (Exception localException1)
    {
      Exception localException2 = new Exception("Negative or zero values cannot be plotted correctly on log charts.", localException1);
      throw localException2;
    }
  }
  
  private double a(double paramDouble)
  {
    int i = 1;
    if (paramDouble < 0.0D) {
      i = 0;
    }
    paramDouble = Math.abs(paramDouble);
    if (i != 0)
    {
      d = (int)Math.floor(paramDouble);
      if (d != paramDouble) {
        d += 1.0D;
      }
      return d;
    }
    double d = (int)Math.floor(paramDouble);
    return -d;
  }
  
  private static double b(double paramDouble)
  {
    int i = 1;
    if (paramDouble < 0.0D) {
      i = 0;
    }
    paramDouble = Math.abs(paramDouble);
    if (i == 0)
    {
      d = (int)Math.floor(paramDouble);
      if (d != paramDouble) {
        d += 1.0D;
      }
      return -d;
    }
    double d = (int)Math.floor(paramDouble);
    return d;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbyj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */