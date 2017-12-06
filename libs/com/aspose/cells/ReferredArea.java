package com.aspose.cells;

import com.aspose.cells.b.a.zs;

public class ReferredArea
{
  private zbap a;
  private zaca b;
  private Worksheet c;
  
  ReferredArea(zbap rr, zaca relInfo)
  {
    this.a = rr;
    this.b = relInfo;
    this.c = relInfo.c;
  }
  
  zbap a()
  {
    return this.a;
  }
  
  private zaca b()
  {
    CalculationOptions localCalculationOptions = new CalculationOptions();
    localCalculationOptions.b = true;
    localCalculationOptions.m = false;
    zaca localzaca = new zaca(this.c, 3, localCalculationOptions);
    localzaca.a = 0;
    return localzaca;
  }
  
  public boolean isExternalLink()
  {
    zwp localzwp = this.a.a();
    if (localzwp == null) {
      return false;
    }
    WorksheetCollection localWorksheetCollection = this.c.getWorkbook().getWorksheets();
    if (((localzwp.b & 0xFFFF) == 65534) && ((localzwp.c & 0xFFFF) == 65534) && (localWorksheetCollection.w().a(localzwp.a & 0xFFFF).a() == 5)) {
      return false;
    }
    return (localzwp.a & 0xFFFF) != localWorksheetCollection.v();
  }
  
  public String getExternalFileName()
  {
    zwp localzwp = this.a.a();
    if (localzwp == null) {
      return null;
    }
    WorksheetCollection localWorksheetCollection = this.c.getWorkbook().getWorksheets();
    if (((localzwp.b & 0xFFFF) == 65534) && ((localzwp.c & 0xFFFF) == 65534) && (localWorksheetCollection.w().a(localzwp.a & 0xFFFF).a() == 5)) {
      return null;
    }
    if ((localzwp.a & 0xFFFF) == localWorksheetCollection.v()) {
      return null;
    }
    zbti localzbti = localWorksheetCollection.w().a(localzwp.a & 0xFFFF);
    return localzbti.k();
  }
  
  public String getSheetName()
  {
    zwp localzwp = this.a.a();
    if (localzwp == null) {
      return this.c.getName();
    }
    WorksheetCollection localWorksheetCollection = this.c.getWorkbook().getWorksheets();
    if (((localzwp.b & 0xFFFF) == 65534) && ((localzwp.c & 0xFFFF) == 65534) && (localWorksheetCollection.w().a(localzwp.a & 0xFFFF).a() == 5)) {
      return this.c.getName();
    }
    if ((localzwp.a & 0xFFFF) != localWorksheetCollection.v())
    {
      zbti localzbti = localWorksheetCollection.w().a(localzwp.a & 0xFFFF);
      if ((localzbti.c() == null) || ((Math.max(localzwp.b, localzwp.c) & 0xFFFF) >= localzbti.c().length)) {
        return null;
      }
      return localzbti.c()[(localzwp.b & 0xFFFF)];
    }
    if (localzwp.b == localzwp.c)
    {
      if ((localzwp.b & 0xFFFF) < localWorksheetCollection.getCount()) {
        return localWorksheetCollection.get(localzwp.b & 0xFFFF).getName();
      }
      return null;
    }
    if ((Math.max(localzwp.b, localzwp.c) & 0xFFFF) < localWorksheetCollection.getCount()) {
      return localWorksheetCollection.get(localzwp.b & 0xFFFF).getName() + ":" + localWorksheetCollection.get(localzwp.c & 0xFFFF).getName();
    }
    return null;
  }
  
  public boolean isArea()
  {
    return !this.a.m();
  }
  
  public int getEndColumn()
  {
    return this.a.h();
  }
  
  public int getStartColumn()
  {
    return this.a.d();
  }
  
  public int getEndRow()
  {
    return this.a.f();
  }
  
  public int getStartRow()
  {
    return this.a.b();
  }
  
  public Object getValues()
  {
    zabo localzabo = new zabo(32, this.a);
    zaca localzaca = this.b;
    if (localzaca.p == null) {
      localzaca = b();
    }
    Object localObject;
    if (localzabo.k(localzaca))
    {
      localObject = "#REF!";
    }
    else if (this.a.m())
    {
      localObject = localzabo.e(localzaca).b(localzaca);
    }
    else
    {
      zaiw localzaiw = localzabo.a(localzaca, false);
      localObject = zbam.b(localzaiw, localzaca);
      localzaiw.a(true);
    }
    if (localzaca != this.b) {
      localzaca.c();
    }
    return localObject;
  }
  
  public Object getValue(int rowOffset, int colOffset)
  {
    zabo localzabo = new zabo(32, this.a);
    zaca localzaca = this.b;
    if (localzaca.p == null) {
      localzaca = b();
    }
    Object localObject;
    if (localzabo.k(localzaca)) {
      localObject = "#REF!";
    } else if (this.a.m()) {
      localObject = localzabo.e(localzaca).b(localzaca);
    } else {
      localObject = localzabo.a(new int[] { rowOffset, colOffset }, localzaca, false).b(localzaca);
    }
    if (localzaca != this.b) {
      localzaca.c();
    }
    return localObject;
  }
  
  boolean a(ReferredArea paramReferredArea)
  {
    return this.a.equals(paramReferredArea.a);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    zwp localzwp = this.a.a();
    if (localzwp == null)
    {
      localStringBuilder.append(this.c.getName());
      localStringBuilder.append('!');
    }
    else
    {
      WorksheetCollection localWorksheetCollection = this.c.getWorkbook().getWorksheets();
      if (((localzwp.b & 0xFFFF) == 65534) && ((localzwp.c & 0xFFFF) == 65534) && (localWorksheetCollection.w().a(localzwp.a & 0xFFFF).a() == 5))
      {
        localStringBuilder.append(this.c.getName());
        localStringBuilder.append('!');
      }
      else if ((localzwp.a & 0xFFFF) != localWorksheetCollection.v())
      {
        zbti localzbti = localWorksheetCollection.w().a(localzwp.a & 0xFFFF);
        localStringBuilder.append('[');
        localStringBuilder.append(localzbti.k());
        localStringBuilder.append(']');
        if ((localzbti.c() != null) && ((Math.max(localzwp.b, localzwp.c) & 0xFFFF) < localzbti.c().length))
        {
          localStringBuilder.append(localzbti.c()[(localzwp.b & 0xFFFF)]);
          localStringBuilder.append('!');
        }
      }
      else if (localzwp.b == localzwp.c)
      {
        if ((localzwp.b & 0xFFFF) < localWorksheetCollection.getCount())
        {
          localStringBuilder.append(localWorksheetCollection.get(localzwp.b & 0xFFFF).getName());
          localStringBuilder.append('!');
        }
      }
      else if ((Math.max(localzwp.b, localzwp.c) & 0xFFFF) < localWorksheetCollection.getCount())
      {
        localStringBuilder.append(localWorksheetCollection.get(localzwp.b & 0xFFFF).getName());
        localStringBuilder.append(':');
        localStringBuilder.append(localWorksheetCollection.get(localzwp.c & 0xFFFF).getName());
        localStringBuilder.append('!');
      }
    }
    this.a.a(localStringBuilder);
    return zs.a(localStringBuilder);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ReferredArea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */