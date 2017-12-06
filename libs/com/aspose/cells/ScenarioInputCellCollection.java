package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

public class ScenarioInputCellCollection
  extends CollectionBase
{
  void a(ScenarioInputCell paramScenarioInputCell)
  {
    zf.a(this.InnerList, paramScenarioInputCell);
  }
  
  public ScenarioInputCell get(int index)
  {
    return (ScenarioInputCell)this.InnerList.get(index);
  }
  
  public int add(int row, int column, String value)
  {
    ScenarioInputCell localScenarioInputCell = new ScenarioInputCell();
    localScenarioInputCell.a = row;
    localScenarioInputCell.b = column;
    localScenarioInputCell.c = value;
    zf.a(this.InnerList, localScenarioInputCell);
    return this.InnerList.size() - 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ScenarioInputCellCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */