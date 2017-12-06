package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.zo;
import java.util.ArrayList;

public class Walls
  extends Floor
{
  private Chart d;
  private float e;
  private float f;
  private float g;
  private float h;
  private float i;
  private ArrayList j = new ArrayList();
  
  Walls(Chart chart)
  {
    super(chart);
    this.d = chart;
    if (chart.m())
    {
      if (!ChartCollection.c(chart.getType())) {
        setForegroundColor(Color.fromArgb(192, 192, 192));
      }
    }
    else {
      setFormatting(0);
    }
  }
  
  public int getCenterX()
  {
    return (int)(this.e * 4000.0F / this.d.getChartObject().getWidth() + 0.5D);
  }
  
  public int getCenterY()
  {
    return (int)(this.f * 4000.0F / this.d.getChartObject().getHeight() + 0.5D);
  }
  
  public int getWidth()
  {
    return (int)(this.g * 4000.0F / this.d.getChartObject().getWidth() + 0.5D);
  }
  
  public int getDepth()
  {
    return (int)(this.h * 4000.0F / this.d.getChartObject().getWidth() + 0.5D);
  }
  
  public int getHeight()
  {
    return (int)(this.i * 4000.0F / this.d.getChartObject().getHeight() + 0.5D);
  }
  
  public int getCenterXPx()
  {
    return (int)(this.e + 0.5D);
  }
  
  public int getCenterYPx()
  {
    return (int)(this.f + 0.5D);
  }
  
  public int getWidthPx()
  {
    return (int)(this.g + 0.5D);
  }
  
  public int getDepthPx()
  {
    return (int)(this.h + 0.5D);
  }
  
  public int getHeightPx()
  {
    return (int)(this.i + 0.5D);
  }
  
  void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    this.e = paramFloat1;
    this.f = paramFloat2;
    this.g = paramFloat3;
    this.i = paramFloat4;
    this.h = paramFloat5;
  }
  
  public int getCubePointCount()
  {
    return this.j.size();
  }
  
  public float getCubePointXPx(int index)
  {
    if (index >= getCubePointCount()) {
      throw new CellsException(0, "index must be less than GetCubePointCount()");
    }
    return ((zo)this.j.get(index)).d();
  }
  
  public float getCubePointYPx(int index)
  {
    if (index >= getCubePointCount()) {
      throw new CellsException(0, "index must be less than GetCubePointCount()");
    }
    return ((zo)this.j.get(index)).e();
  }
  
  void a(ArrayList paramArrayList)
  {
    for (int k = 0; k < paramArrayList.size(); k++) {
      zf.a(this.j, new zo(((zo)paramArrayList.get(k)).d(), ((zo)paramArrayList.get(k)).e()));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Walls.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */