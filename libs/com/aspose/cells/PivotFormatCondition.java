package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

public class PivotFormatCondition
{
  PivotFormatConditionCollection a;
  ArrayList b;
  int c;
  int d;
  int e;
  FormatConditionCollection f;
  
  PivotFormatCondition(PivotFormatConditionCollection pivoFmtConds, boolean addList)
  {
    this.a = pivoFmtConds;
    if (this.b == null) {
      this.b = new ArrayList();
    }
    if (addList)
    {
      zbur localzbur = new zbur();
      localzbur.f(false);
      zf.a(this.b, localzbur);
      this.f = new FormatConditionCollection(this.a.a);
      this.f.d = true;
      this.a.a.getConditionalFormattings().a(this.f);
    }
    this.d = 2;
    this.e = 0;
  }
  
  public int getScopeType()
  {
    return this.d;
  }
  
  public void setScopeType(int value)
  {
    this.d = value;
  }
  
  public int getRuleType()
  {
    return this.e;
  }
  
  public void setRuleType(int value)
  {
    this.e = value;
  }
  
  FormatConditionCollection a()
  {
    zaxj.a(this.a.a, this);
    return this.f;
  }
  
  public FormatConditionCollection getFormatConditions()
  {
    return this.f;
  }
  
  void a(PivotFormatCondition paramPivotFormatCondition)
  {
    this.c = paramPivotFormatCondition.c;
    this.d = paramPivotFormatCondition.d;
    this.e = paramPivotFormatCondition.getRuleType();
    this.b = new ArrayList();
    for (int i = 0; i < paramPivotFormatCondition.b.size(); i++)
    {
      zbur localzbur = (zbur)paramPivotFormatCondition.b.get(i);
      zf.a(this.b, localzbur);
    }
    this.f = new FormatConditionCollection(paramPivotFormatCondition.f.a);
    this.f.b(paramPivotFormatCondition.f, null);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/PivotFormatCondition.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */