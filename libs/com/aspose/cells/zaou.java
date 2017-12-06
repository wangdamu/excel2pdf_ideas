package com.aspose.cells;

import java.math.BigDecimal;
import java.math.RoundingMode;

class zaou
  implements zais
{
  static final zaou a = new zaou();
  
  public double a(double paramDouble1, double paramDouble2)
  {
    return BigDecimal.valueOf(paramDouble1).add(BigDecimal.valueOf(paramDouble2)).doubleValue();
  }
  
  public double b(double paramDouble1, double paramDouble2)
  {
    return BigDecimal.valueOf(paramDouble1).subtract(BigDecimal.valueOf(paramDouble2)).doubleValue();
  }
  
  public double c(double paramDouble1, double paramDouble2)
  {
    return BigDecimal.valueOf(paramDouble1).multiply(BigDecimal.valueOf(paramDouble2)).doubleValue();
  }
  
  public double d(double paramDouble1, double paramDouble2)
  {
    return BigDecimal.valueOf(paramDouble1).divide(BigDecimal.valueOf(paramDouble2), 17, RoundingMode.HALF_EVEN).doubleValue();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaou.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */