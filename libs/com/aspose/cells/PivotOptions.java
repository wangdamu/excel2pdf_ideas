package com.aspose.cells;

public class PivotOptions
{
  private Chart b;
  boolean a = true;
  public boolean DropZoneFilter = true;
  public boolean DropZoneCategories = true;
  public boolean DropZoneData = true;
  public boolean DropZoneSeries = true;
  public boolean DropZonesVisible = false;
  
  private PivotOptions() {}
  
  PivotOptions(Chart chart)
  {
    this.b = chart;
  }
  
  void a(PivotOptions paramPivotOptions) {}
  
  void a()
  {
    this.DropZoneCategories = false;
    this.DropZoneData = false;
    this.DropZoneSeries = false;
    this.DropZonesVisible = false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/PivotOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */