package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

public class ConditionalFormattingValueCollection
  extends CollectionBase
{
  FormatCondition a;
  boolean b = false;
  
  ConditionalFormattingValueCollection(FormatCondition fc)
  {
    this.a = fc;
  }
  
  void a(ConditionalFormattingValueCollection paramConditionalFormattingValueCollection, CopyOptions paramCopyOptions, int paramInt1, int paramInt2)
  {
    WorksheetCollection localWorksheetCollection1 = paramConditionalFormattingValueCollection.a.a.a.a.c();
    WorksheetCollection localWorksheetCollection2 = this.a.a.a.a.c();
    this.b = paramConditionalFormattingValueCollection.b;
    for (int i = 0; i < paramConditionalFormattingValueCollection.getCount(); i++)
    {
      ConditionalFormattingValue localConditionalFormattingValue1 = paramConditionalFormattingValueCollection.get(i);
      ConditionalFormattingValue localConditionalFormattingValue2 = new ConditionalFormattingValue(this.a);
      localConditionalFormattingValue2.a(localConditionalFormattingValue1, localWorksheetCollection1, localWorksheetCollection2, paramCopyOptions, paramInt1, paramInt2);
      zf.a(this.InnerList, localConditionalFormattingValue2);
    }
  }
  
  public ConditionalFormattingValue get(int index)
  {
    return (ConditionalFormattingValue)this.InnerList.get(index);
  }
  
  void a(ConditionalFormattingValue paramConditionalFormattingValue)
  {
    if ((this.b) && ((paramConditionalFormattingValue.getType() == 1) || (paramConditionalFormattingValue.getType() == 2))) {
      throw new CellsException(2, "Cannot add a CFVO with type FormatConditionValueType.Max or FormatConditionValueType.Min to IconSet's CFVOS.");
    }
    zf.a(this.InnerList, paramConditionalFormattingValue);
  }
  
  public int add(int type, String value)
  {
    zf.a(this.InnerList, new ConditionalFormattingValue(this.a, type, value));
    return getCount() - 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ConditionalFormattingValueCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */