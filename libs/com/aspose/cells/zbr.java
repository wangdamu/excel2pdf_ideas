package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbr
  extends zcd
{
  zbr(Axis paramAxis)
  {
    c(4194);
    b(18);
    this.b = new byte[18];
    this.b[4] = 1;
    this.b[8] = 1;
    this.b[16] = -17;
    boolean bool1 = paramAxis.a().n().p().getSettings().getDate1904();
    boolean bool2 = false;
    if (paramAxis.getCategoryType() == 2)
    {
      byte[] tmp82_77 = this.b;
      tmp82_77[16] = ((byte)(tmp82_77[16] | 0x10));
      if (!paramAxis.isBaseUnitAuto())
      {
        byte[] tmp102_97 = this.b;
        tmp102_97[16] = ((byte)(tmp102_97[16] & 0xDF));
        bool2 = paramAxis.getBaseUnitScale() != 0;
      }
      switch (paramAxis.getBaseUnitScale())
      {
      case 0: 
        break;
      case 1: 
        this.b[12] = 1;
        break;
      case 2: 
        this.b[12] = 2;
      }
    }
    if (!paramAxis.g())
    {
      byte[] tmp187_182 = this.b;
      tmp187_182[16] = ((byte)(tmp187_182[16] & 0xFB));
      if ((paramAxis.getCategoryType() == 2) || (paramAxis.getCategoryType() == 0)) {
        switch (paramAxis.getMajorUnitScale())
        {
        case 0: 
          break;
        case 1: 
          this.b[6] = 1;
          break;
        case 2: 
          this.b[6] = 2;
        }
      }
      System.arraycopy(zc.a((int)paramAxis.getMajorUnit()), 0, this.b, 4, 2);
    }
    if (!paramAxis.h())
    {
      byte[] tmp293_288 = this.b;
      tmp293_288[16] = ((byte)(tmp293_288[16] & 0xF7));
      if ((paramAxis.getCategoryType() == 2) || (paramAxis.getCategoryType() == 0)) {
        switch (paramAxis.getMinorUnitScale())
        {
        case 0: 
          break;
        case 1: 
          this.b[10] = 1;
          break;
        case 2: 
          this.b[10] = 2;
        }
      }
      System.arraycopy(zc.a((int)paramAxis.getMinorUnit()), 0, this.b, 8, 2);
    }
    double d;
    if (!paramAxis.e())
    {
      byte[] tmp402_397 = this.b;
      tmp402_397[16] = ((byte)(tmp402_397[16] & 0xFE));
      d = a(paramAxis.getMinValue(), bool2, paramAxis.getBaseUnitScale(), bool1);
      System.arraycopy(zc.a((int)d), 0, this.b, 0, 2);
    }
    if (!paramAxis.f())
    {
      byte[] tmp455_450 = this.b;
      tmp455_450[16] = ((byte)(tmp455_450[16] & 0xFD));
      d = a(paramAxis.getMaxValue(), bool2, paramAxis.getBaseUnitScale(), bool1);
      System.arraycopy(zc.a((int)d), 0, this.b, 2, 2);
    }
    if (paramAxis.getCategoryType() != 0)
    {
      byte[] tmp508_503 = this.b;
      tmp508_503[16] = ((byte)(tmp508_503[16] & 0x7F));
    }
    if (paramAxis.getCrossType() == 2)
    {
      byte[] tmp529_524 = this.b;
      tmp529_524[16] = ((byte)(tmp529_524[16] & 0xBF));
      System.arraycopy(zc.a((int)paramAxis.getCrossAt()), 0, this.b, 14, 2);
    }
    if (paramAxis.f)
    {
      byte[] tmp569_564 = this.b;
      tmp569_564[16] = ((byte)(tmp569_564[16] | 0x40));
    }
  }
  
  double a(Object paramObject, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    double d = 0.0D;
    if (paramBoolean1)
    {
      if ((paramObject instanceof Double)) {
        d = a(((Double)paramObject).doubleValue(), paramInt, paramBoolean2);
      } else {
        d = a((DateTime)paramObject, paramInt, paramBoolean2);
      }
    }
    else if ((paramObject instanceof Double)) {
      d = ((Double)paramObject).doubleValue();
    } else {
      d = CellsHelper.getDoubleFromDateTime((DateTime)paramObject, paramBoolean2);
    }
    return d;
  }
  
  double a(DateTime paramDateTime, int paramInt, boolean paramBoolean)
  {
    switch (paramInt)
    {
    case 2: 
      return paramDateTime.getYear() - (paramBoolean ? 1904 : 1900);
    case 1: 
      return (paramDateTime.getYear() - (paramBoolean ? 1904 : 1900)) * 12 + paramDateTime.getMonth() - 1;
    }
    return CellsHelper.getDoubleFromDateTime(paramDateTime, paramBoolean);
  }
  
  double a(double paramDouble, int paramInt, boolean paramBoolean)
  {
    DateTime localDateTime;
    switch (paramInt)
    {
    case 2: 
      localDateTime = CellsHelper.getDateTimeFromDouble(paramDouble, paramBoolean);
      return localDateTime.getYear() - (paramBoolean ? 1904 : 1900);
    case 1: 
      localDateTime = CellsHelper.getDateTimeFromDouble(paramDouble, paramBoolean);
      return (localDateTime.getYear() - (paramBoolean ? 1904 : 1900)) * 12 + localDateTime.getMonth() - 1;
    }
    return paramDouble;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */