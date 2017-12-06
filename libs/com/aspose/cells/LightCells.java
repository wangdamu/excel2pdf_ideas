package com.aspose.cells;

import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import java.io.IOException;
import java.io.InputStream;

/**
 * @deprecated
 */
public class LightCells
{
  private String[] a;
  private String b;
  private zm c;
  
  public static LightCells getInstance(String file)
  {
    LightCells localLightCells = new LightCells();
    localLightCells.b = file;
    return localLightCells;
  }
  
  public static LightCells getInstance(InputStream stream)
    throws IOException
  {
    LightCells localLightCells = new LightCells();
    try
    {
      localLightCells.c = new zh(stream);
    }
    catch (IOException localIOException)
    {
      throw localIOException;
    }
    catch (Exception localException)
    {
      throw new IOException(localException.getMessage());
    }
    return localLightCells;
  }
  
  private void a()
    throws Exception
  {
    LoadOptions localLoadOptions = new LoadOptions();
    localLoadOptions.setLoadDataFilterOptions(0);
    Workbook localWorkbook;
    if (this.b != null) {
      localWorkbook = new Workbook(this.b, localLoadOptions);
    } else {
      localWorkbook = new Workbook(this.c, localLoadOptions);
    }
    this.a = new String[localWorkbook.getWorksheets().getCount()];
    for (int i = 0; i < this.a.length; i++) {
      this.a[i] = localWorkbook.getWorksheets().get(i).getName();
    }
  }
  
  public int getSheetCount()
    throws Exception
  {
    if (this.a == null) {
      a();
    }
    return this.a.length;
  }
  
  public String getSheetName(int sheetIndex)
    throws Exception
  {
    if (this.a == null) {
      a();
    }
    return this.a[sheetIndex];
  }
  
  public void processWorkbook(CellHandler cellHandler)
    throws Exception
  {
    LoadOptions localLoadOptions = new LoadOptions();
    localLoadOptions.setLoadDataFilterOptions(31);
    localLoadOptions.setLightCellsDataHandler(new zgu(cellHandler, -1));
    Workbook localWorkbook;
    if (this.b != null) {
      localWorkbook = new Workbook(this.b, localLoadOptions);
    } else {
      localWorkbook = new Workbook(this.c, localLoadOptions);
    }
    if (this.a == null)
    {
      this.a = new String[localWorkbook.getWorksheets().getCount()];
      for (int i = 0; i < this.a.length; i++) {
        this.a[i] = localWorkbook.getWorksheets().get(i).getName();
      }
    }
  }
  
  private void a(LightCellsDataHandler paramLightCellsDataHandler)
    throws Exception
  {
    LoadOptions localLoadOptions = new LoadOptions();
    localLoadOptions.setLoadDataFilterOptions(0);
    localLoadOptions.setLightCellsDataHandler(paramLightCellsDataHandler);
    Workbook localWorkbook;
    if (this.b != null) {
      localWorkbook = new Workbook(this.b, localLoadOptions);
    } else {
      localWorkbook = new Workbook(this.c, localLoadOptions);
    }
    if (this.a == null)
    {
      this.a = new String[localWorkbook.getWorksheets().getCount()];
      for (int i = 0; i < this.a.length; i++) {
        this.a[i] = localWorkbook.getWorksheets().get(i).getName();
      }
    }
  }
  
  public void processWorksheet(String sheetName, CellHandler cellHandler)
    throws Exception
  {
    a(new zgu(cellHandler, sheetName));
  }
  
  public void processWorksheet(int sheetIndex, CellHandler cellHandler)
    throws Exception
  {
    a(new zgu(cellHandler, sheetIndex));
  }
  
  public void release()
  {
    this.c = null;
    this.b = null;
    this.a = null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/LightCells.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */