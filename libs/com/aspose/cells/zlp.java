package com.aspose.cells;

class zlp
{
  static int a = 5;
  
  static double a(Worksheet paramWorksheet, double paramDouble, WorksheetCollection paramWorksheetCollection)
  {
    switch (paramWorksheet.getViewType())
    {
    case 2: 
      double d = paramWorksheet.D()[0];
      paramDouble = (int)(paramDouble / d + 0.5D);
    }
    return a(paramDouble, paramWorksheetCollection);
  }
  
  static int a(WorksheetCollection paramWorksheetCollection)
  {
    return (int)(5.0D / paramWorksheetCollection.U() * 256.0D);
  }
  
  static double a(double paramDouble, WorksheetCollection paramWorksheetCollection)
  {
    int i = paramWorksheetCollection.U();
    if (paramDouble < i + a) {
      return 1.0D * paramDouble / (i + a);
    }
    double d = (int)((paramDouble - a) * 100.0D / i + 0.5D) / 100.0D;
    if (d > 255.0D) {
      d = 255.0D;
    }
    return d;
  }
  
  static int a(double paramDouble, Worksheet paramWorksheet)
  {
    int i = paramWorksheet.getViewType() == 2 ? 1 : 0;
    double d = i != 0 ? paramWorksheet.D()[0] : 1.0D;
    int j = b(paramDouble, paramWorksheet.c());
    return (int)(j * d + 0.5D);
  }
  
  static int b(double paramDouble, WorksheetCollection paramWorksheetCollection)
  {
    if (paramDouble > 1.0D)
    {
      i = (int)(paramDouble * paramWorksheetCollection.U() + 0.5D);
      int j = (int)(paramWorksheetCollection.U() * a(paramWorksheetCollection) / 256.0D + 0.5D);
      return i + j;
    }
    int i = (int)(paramDouble * (paramWorksheetCollection.U() + (int)(paramWorksheetCollection.U() * a(paramWorksheetCollection) / 256.0D + 0.5D)) + 0.5D);
    return i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zlp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */