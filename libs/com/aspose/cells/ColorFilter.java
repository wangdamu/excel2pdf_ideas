package com.aspose.cells;

public class ColorFilter
{
  private FilterColumn a;
  private boolean b = true;
  private int c;
  private zaml d = new zaml(false);
  
  ColorFilter(FilterColumn filter)
  {
    this.a = filter;
  }
  
  boolean a(Cell paramCell, int paramInt1, int paramInt2)
  {
    Worksheet localWorksheet = this.a.c().a().a();
    WorksheetCollection localWorksheetCollection = localWorksheet.c();
    if ((this.c < 0) || (this.c > localWorksheetCollection.getDxfs().getCount())) {
      return true;
    }
    Style localStyle1 = localWorksheetCollection.getDxfs().get(this.c);
    Style localStyle2 = null;
    int i;
    if (paramCell != null) {
      i = paramCell.r();
    } else {
      i = localWorksheet.getCells().d(paramInt1, paramInt2);
    }
    if (i == -1) {
      localStyle2 = localWorksheetCollection.Q();
    } else {
      localStyle2 = localWorksheetCollection.e(i);
    }
    if (this.b)
    {
      switch (localStyle1.getPattern())
      {
      case 0: 
        return localStyle2.getPattern() == 0;
      case 1: 
        return (localStyle2.getPattern() == 1) && (localStyle2.b.a(localStyle1.b, localWorksheetCollection.p(), localWorksheetCollection.p()));
      }
      return (localStyle2.getPattern() == localStyle1.getPattern()) && (localStyle2.b.a(localStyle1.b, localWorksheetCollection.p(), localWorksheetCollection.p())) && (localStyle2.a.a(localStyle1.a, localWorksheetCollection.p(), localWorksheetCollection.p()));
    }
    if (localStyle1.b.b()) {
      return (localStyle2.getFont().getColor().toArgb() & 0xFFFFFF) == 0;
    }
    return localStyle2.getFont().b().a(localStyle1.b, localWorksheetCollection.p(), localWorksheetCollection.p());
  }
  
  void a(ColorFilter paramColorFilter, boolean paramBoolean)
  {
    this.b = paramColorFilter.b;
    this.c = paramColorFilter.c;
  }
  
  public boolean getFilterByFillColor()
  {
    return this.b;
  }
  
  public void setFilterByFillColor(boolean value)
  {
    this.b = value;
  }
  
  int a()
  {
    return this.c;
  }
  
  void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  public Color getColor(WorksheetCollection sheets)
  {
    return this.d.b(sheets.p());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ColorFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */