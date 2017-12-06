package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

public class ScenarioCollection
  extends CollectionBase
{
  int a;
  int b;
  ArrayList c;
  
  public int getActiveIndex()
  {
    return this.a;
  }
  
  public void setActiveIndex(int value)
  {
    this.a = value;
  }
  
  public int getLastSelected()
  {
    return this.b;
  }
  
  public void setLastSelected(int value)
  {
    this.b = value;
  }
  
  public Scenario get(int index)
  {
    return (Scenario)this.InnerList.get(index);
  }
  
  public int add(String name)
  {
    Scenario localScenario = new Scenario();
    localScenario.b = name;
    zf.a(this.InnerList, localScenario);
    return this.InnerList.size() - 1;
  }
  
  int a(Scenario paramScenario)
  {
    zf.a(this.InnerList, paramScenario);
    return this.InnerList.size() - 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ScenarioCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */