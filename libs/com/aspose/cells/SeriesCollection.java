package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SeriesCollection
  extends CollectionBase
{
  private Chart b;
  ShapePropertyCollection a;
  
  SeriesCollection(Chart chart)
  {
    this.b = chart;
  }
  
  Worksheet a()
  {
    return this.b.getWorksheet();
  }
  
  WorksheetCollection b()
  {
    return this.b.n();
  }
  
  public Series get(int index)
  {
    return (Series)this.InnerList.get(index);
  }
  
  public Series getSeriesByOrder(int order)
  {
    c();
    Iterator localIterator = this.InnerList.iterator();
    while (localIterator.hasNext())
    {
      Series localSeries = (Series)localIterator.next();
      if (localSeries.C() == order) {
        return localSeries;
      }
    }
    return null;
  }
  
  void c()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.InnerList.iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      localObject = (Series)localIterator.next();
      zna localzna = new zna((Series)localObject);
      zf.a(localArrayList, localzna);
    }
    Collections.sort(localArrayList);
    for (int i = 0; i < localArrayList.size(); i++)
    {
      localObject = (zna)localArrayList.get(i);
      ((zna)localObject).a().e(i);
    }
  }
  
  ArrayList d()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.InnerList.iterator();
    while (localIterator.hasNext())
    {
      Series localSeries = (Series)localIterator.next();
      znb localznb = new znb(localSeries);
      zf.a(localArrayList, localznb);
    }
    Collections.sort(localArrayList);
    return localArrayList;
  }
  
  public void removeAt(int index)
  {
    Series localSeries = (Series)this.InnerList.get(index);
    this.InnerList.remove(index);
  }
  
  void a(int paramInt1, int paramInt2)
  {
    zf.a(this.InnerList, paramInt1, paramInt2);
  }
  
  public String getCategoryData()
  {
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      Series localSeries = (Series)localIterator.next();
      if (!localSeries.getPlotOnSecondAxis()) {
        return localSeries.getXValues();
      }
    }
    return "";
  }
  
  public void setCategoryData(String value)
  {
    String str = value.trim();
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      Series localSeries = (Series)localIterator.next();
      if (!localSeries.getPlotOnSecondAxis()) {
        localSeries.setXValues(str);
      }
    }
  }
  
  /**
   * @deprecated
   */
  public String getSecondCatergoryData()
  {
    return getSecondCategoryData();
  }
  
  /**
   * @deprecated
   */
  public void setSecondCatergoryData(String value)
  {
    setSecondCategoryData(value);
  }
  
  public String getSecondCategoryData()
  {
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      Series localSeries = (Series)localIterator.next();
      if (localSeries.getPlotOnSecondAxis()) {
        return localSeries.getXValues();
      }
    }
    return "";
  }
  
  public void setSecondCategoryData(String value)
  {
    String str = value.trim();
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      Series localSeries = (Series)localIterator.next();
      if (localSeries.getPlotOnSecondAxis()) {
        localSeries.setXValues(str);
      }
    }
  }
  
  private void b(Series paramSeries)
  {
    switch (this.b.getType())
    {
    case 65: 
      paramSeries.getBorder().setVisible(false);
      if (this.InnerList.size() == 2)
      {
        paramSeries.getMarker().setMarkerStyle(4);
        paramSeries.getMarker().a(Color.getBlack());
        paramSeries.getMarker().b(Color.getBlack());
      }
      break;
    case 66: 
      paramSeries.getBorder().setVisible(false);
      break;
    case 67: 
      paramSeries.getBorder().setVisible(false);
      paramSeries.getMarker().setMarkerStyle(5);
      if (this.InnerList.size() == 0)
      {
        paramSeries.a(this.b.i.a(0));
        paramSeries.a(3);
      }
      else if (this.InnerList.size() < 3)
      {
        paramSeries.a(this.b.i.a(1));
        paramSeries.a(this.InnerList.size() - 1);
      }
      else if (this.InnerList.size() == 3)
      {
        paramSeries.a(this.b.i.a(1));
        paramSeries.getMarker().setMarkerStyle(4);
        paramSeries.getMarker().a(Color.getBlack());
        paramSeries.getMarker().b(Color.getBlack());
        paramSeries.a(this.InnerList.size() - 1);
      }
      break;
    case 68: 
      if (this.InnerList.size() == 0)
      {
        paramSeries.a(this.b.i.a(0));
        paramSeries.a(4);
      }
      else if (this.InnerList.size() < 5)
      {
        paramSeries.getBorder().setVisible(false);
        paramSeries.getMarker().setMarkerStyle(5);
        paramSeries.a(this.b.i.a(1));
        paramSeries.setGapWidth((short)100);
        paramSeries.a(this.InnerList.size() - 1);
      }
      break;
    }
  }
  
  private void c(Series paramSeries)
  {
    b(paramSeries);
    if (paramSeries.getType() == 13) {
      paramSeries.setHas3DEffect(true);
    }
  }
  
  private void d(Series paramSeries)
  {
    c(paramSeries);
    zf.a(this.InnerList, paramSeries);
  }
  
  public void changeSeriesOrder(int sourceIndex, int destIndex)
  {
    Series localSeries1 = get(destIndex);
    Series localSeries2 = get(sourceIndex);
    this.InnerList.set(destIndex, localSeries2);
    this.InnerList.set(sourceIndex, localSeries1);
  }
  
  void b(int paramInt1, int paramInt2)
  {
    Series localSeries = get(paramInt1);
    this.InnerList.add(paramInt2, localSeries);
    this.InnerList.remove(paramInt1 + 1);
  }
  
  void c(int paramInt1, int paramInt2)
  {
    Series localSeries = get(paramInt1);
    this.InnerList.add(paramInt2, localSeries);
    this.InnerList.remove(paramInt1);
  }
  
  void a(Series paramSeries)
  {
    zf.a(this.InnerList, paramSeries);
  }
  
  public int addR1C1(String area, boolean isVertical)
  {
    area = zauw.b(area, 0, 0);
    return add(area, isVertical);
  }
  
  public int add(String area, boolean isVertical)
  {
    return a(area, isVertical, false);
  }
  
  int a(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramString == null) {
      return -1;
    }
    paramString = paramString.trim();
    zjk localzjk = new zjk(this.b, paramString, null);
    int i = getCount();
    Series localSeries;
    switch (localzjk.a())
    {
    case 1: 
    case 3: 
      localSeries = new Series(b(), this, getCount());
      localSeries.setValues(paramString);
      localSeries.d(this.b.getType());
      d(localSeries);
      break;
    case 2: 
      zbap[] arrayOfzbap = localzjk.j();
      if ((arrayOfzbap == null) || (arrayOfzbap.length > 1))
      {
        localSeries = new Series(b(), this, getCount());
        localSeries.setValues(paramString);
        localSeries.d(this.b.getType());
        d(localSeries);
      }
      else
      {
        Range localRange = zabx.a(this.b.n(), arrayOfzbap[0], this.b.getWorksheet().f);
        if ((localRange == null) || ((paramBoolean1) && (localRange.getColumnCount() == 1)) || ((!paramBoolean1) && (localRange.getRowCount() == 1)))
        {
          localSeries = new Series(b(), this, getCount());
          localSeries.a(localzjk);
          localSeries.d(this.b.getType());
          d(localSeries);
        }
        else
        {
          CellArea localCellArea = localRange.a();
          a(paramBoolean1, localRange.getWorksheet(), localCellArea.StartRow, localCellArea.StartColumn, localCellArea.EndRow, localCellArea.EndColumn, false);
        }
      }
      break;
    default: 
      throw new CellsException(6, "Invalid series values");
    }
    if (getCount() >= 256) {
      throw new CellsException(10, "The number of series could not exceed 256.");
    }
    return i;
  }
  
  private void a(boolean paramBoolean1, Worksheet paramWorksheet, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean2)
  {
    String str = paramWorksheet.getName();
    if (zamm.a(str)) {
      str = "'" + str + "'";
    }
    str = str + "!";
    int i = paramInt1;
    int j = paramInt2;
    Object localObject;
    if ((paramWorksheet != null) && (paramBoolean2))
    {
      localObject = paramWorksheet.getCells();
      CalculationOptions localCalculationOptions = new CalculationOptions();
      localCalculationOptions.setRecursive(false);
      int m = 0;
      int i1;
      Cell localCell;
      for (int n = paramInt1; n <= paramInt3; n++)
      {
        for (i1 = paramInt2; i1 <= paramInt4; i1++)
        {
          localCell = ((Cells)localObject).get(n, i1);
          if (a(localCell, localCalculationOptions))
          {
            i = n;
            m = 1;
            break;
          }
        }
        if (m != 0) {
          break;
        }
      }
      m = 0;
      for (n = paramInt2; n <= paramInt4; n++)
      {
        for (i1 = paramInt1; i1 <= paramInt3; i1++)
        {
          localCell = ((Cells)localObject).get(i1, n);
          if (a(localCell, localCalculationOptions))
          {
            j = n;
            m = 1;
            break;
          }
        }
        if (m != 0) {
          break;
        }
      }
    }
    int k;
    Series localSeries;
    if (paramBoolean1)
    {
      localObject = "";
      if (i > paramInt1) {
        localObject = str + CellsHelper.a(i, paramInt2, paramInt3, j - 1);
      }
      for (k = j; k <= paramInt4; k++)
      {
        localSeries = new Series(b(), this, getCount());
        localSeries.setValues(str + CellsHelper.a(i, k, paramInt3, k));
        if (i > paramInt1) {
          localSeries.setName("=" + str + CellsHelper.a(paramInt1, k, i - 1, k));
        }
        if (!"".equals(localObject)) {
          localSeries.setXValues((String)localObject);
        }
        localSeries.d(this.b.getType());
        if (getCount() < 65535) {
          d(localSeries);
        }
      }
    }
    else
    {
      localObject = "";
      if (i > paramInt1) {
        localObject = str + CellsHelper.a(paramInt1, j, i - 1, paramInt4);
      }
      for (k = i; k <= paramInt3; k++)
      {
        localSeries = new Series(b(), this, getCount());
        localSeries.setValues(str + CellsHelper.a(k, j, k, paramInt4));
        if (j > paramInt2) {
          localSeries.setName("=" + str + CellsHelper.a(k, paramInt2, k, j - 1));
        }
        if (!"".equals(localObject)) {
          localSeries.setXValues((String)localObject);
        }
        localSeries.d(this.b.getType());
        if (getCount() < 65535) {
          d(localSeries);
        }
      }
    }
  }
  
  private boolean a(Cell paramCell, CalculationOptions paramCalculationOptions)
  {
    if (paramCell == null) {
      return false;
    }
    if ((paramCell.isFormula()) && (paramCell.getValue() == null)) {
      paramCell.calculate(paramCalculationOptions);
    }
    if (paramCell.getType() == 4) {
      return true;
    }
    return paramCell.getType() == 0;
  }
  
  void a(SeriesCollection paramSeriesCollection, CopyOptions paramCopyOptions)
  {
    for (int i = 0; i < paramSeriesCollection.InnerList.size(); i++)
    {
      Series localSeries1 = (Series)paramSeriesCollection.InnerList.get(i);
      Series localSeries2 = new Series(b(), this, getCount());
      localSeries2.a(localSeries1, paramCopyOptions);
      zf.a(this.InnerList, localSeries2);
    }
  }
  
  public boolean isColorVaried()
  {
    return this.b.i.a(0).y();
  }
  
  public void setColorVaried(boolean value)
  {
    switch (this.b.getType())
    {
    case 44: 
    case 45: 
    case 46: 
    case 47: 
    case 48: 
    case 49: 
      this.b.i.a(0).k(value);
      break;
    default: 
      if (getCount() == 1) {
        this.b.i.a(0).k(value);
      }
      break;
    }
  }
  
  Chart e()
  {
    return this.b;
  }
  
  int a(boolean paramBoolean)
  {
    int i = 0;
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      Series localSeries = (Series)localIterator.next();
      if (localSeries.u().m() == paramBoolean) {
        i++;
      }
    }
    return i;
  }
  
  void a(zka paramzka, DataLabels paramDataLabels)
  {
    CopyOptions localCopyOptions = new CopyOptions(0);
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      Series localSeries = (Series)localIterator.next();
      if ((localSeries.u() == paramzka) && (localSeries.r() == null)) {
        localSeries.getDataLabels().a(paramDataLabels, localCopyOptions);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/SeriesCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */