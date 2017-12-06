package com.aspose.cells;

import com.aspose.cells.a.c.zo;

public class CalculationOptions
{
  static boolean a = "OLD".equals(zo.a("Aspose.Cells.FormulaEngine"));
  boolean b = true;
  ICustomFunction c;
  AbstractCalculationEngine d;
  AbstractCalculationMonitor e;
  int f = -1;
  int g = 0;
  zais h = zaov.a;
  int i = 1;
  Encoding j;
  int k = 100;
  boolean l = true;
  boolean m = true;
  zaan n = new zaan();
  
  public boolean getIgnoreError()
  {
    return this.b;
  }
  
  public void setIgnoreError(boolean value)
  {
    this.b = value;
  }
  
  public ICustomFunction getCustomFunction()
  {
    return this.c;
  }
  
  public void setCustomFunction(ICustomFunction value)
  {
    this.c = value;
    if (value != null) {
      this.l = false;
    } else {
      this.l = true;
    }
  }
  
  public AbstractCalculationEngine getCustomEngine()
  {
    return this.d;
  }
  
  public void setCustomEngine(AbstractCalculationEngine value)
  {
    this.d = value;
    this.l = ((value == null) || (!value.isParamLiteralRequired()));
  }
  
  public AbstractCalculationMonitor getCalculationMonitor()
  {
    return this.e;
  }
  
  public void setCalculationMonitor(AbstractCalculationMonitor value)
  {
    this.e = value;
  }
  
  public int getCalcStackSize()
  {
    return this.f;
  }
  
  public void setCalcStackSize(int value)
  {
    this.f = value;
  }
  
  public int getPrecisionStrategy()
  {
    return this.g;
  }
  
  public void setPrecisionStrategy(int value)
  {
    if (this.g != value)
    {
      this.g = value;
      if (value == 0) {
        this.h = zaov.a;
      } else if (value == 1) {
        this.h = zaow.a;
      } else {
        this.h = zaou.a;
      }
    }
  }
  
  int a()
  {
    return this.k;
  }
  
  public boolean getRecursive()
  {
    return this.m;
  }
  
  public void setRecursive(boolean value)
  {
    this.m = value;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/CalculationOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */