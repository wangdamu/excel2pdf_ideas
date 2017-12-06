package com.aspose.cells;

class zapw
{
  private GradientFill c;
  boolean a;
  byte[] b;
  
  zapw(GradientFill paramGradientFill)
  {
    this.c = paramGradientFill;
    GradientStopCollection localGradientStopCollection = paramGradientFill.getGradientStops();
    Workbook localWorkbook = paramGradientFill.e;
    switch (paramGradientFill.getGradientStops().getCount())
    {
    case 2: 
      this.a = true;
      break;
    case 3: 
      if (localGradientStopCollection.get(0).a.c(localWorkbook) == localGradientStopCollection.get(2).a.c(localWorkbook)) {
        this.a = true;
      }
      break;
    default: 
      this.b = zxh.a(localGradientStopCollection);
    }
  }
  
  int a()
  {
    Object localObject;
    if ((this.c.b instanceof zadp))
    {
      localObject = (zadp)this.c.b;
      return ((zadp)localObject).b ? 7 : 4;
    }
    if ((this.c.b instanceof zadq))
    {
      localObject = (zadq)this.c.b;
      if ((((zadq)localObject).b == ((zadq)localObject).e) && (((zadq)localObject).c == ((zadq)localObject).d) && (((zadq)localObject).b == znq.l / 2) && (((zadq)localObject).c == znq.l / 2)) {
        return 6;
      }
      return 5;
    }
    return 100;
  }
  
  double[] b()
  {
    double[] arrayOfDouble = new double[4];
    if ((this.c.b instanceof zadq))
    {
      zadq localzadq = (zadq)this.c.b;
      arrayOfDouble[0] = (localzadq.b / znq.l);
      arrayOfDouble[1] = (localzadq.c / znq.l);
      arrayOfDouble[2] = (1.0D - localzadq.e / znq.l);
      arrayOfDouble[3] = (1.0D - localzadq.d / znq.l);
    }
    return arrayOfDouble;
  }
  
  double c()
  {
    if ((this.c.b != null) && ((this.c.b instanceof zadp)))
    {
      double d = this.c.getAngle();
      d = 90.0D - d;
      if (d < 0.0D) {
        d += 360.0D;
      }
      return d;
    }
    return 0.0D;
  }
  
  int d()
  {
    if (this.a)
    {
      if (this.c.getGradientStops().getCount() == 3) {
        return (int)this.c.getGradientStops().get(1).getPosition();
      }
      return 100;
    }
    return 100;
  }
  
  GradientStop e()
  {
    return this.c.getGradientStops().get(0);
  }
  
  GradientStop f()
  {
    if ((this.c.getGradientStops().getCount() == 3) && (this.a)) {
      return this.c.getGradientStops().get(1);
    }
    return this.c.getGradientStops().get(this.c.getGradientStops().getCount() - 1);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zapw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */