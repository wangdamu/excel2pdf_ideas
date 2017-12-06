package com.aspose.cells;

public class GlobalizationSettings
{
  public String getPivotTotalName()
  {
    return "Total";
  }
  
  public String getPivotGrandTotalName()
  {
    return "Grand Total";
  }
  
  public String getMultipleItemsName()
  {
    return "(Multiple Items)";
  }
  
  public String getAllName()
  {
    return "(All)";
  }
  
  public String getColumnLablesName()
  {
    return "Column Labels";
  }
  
  public String getRowLablesName()
  {
    return "Row Labels";
  }
  
  public String getEmptyDataName()
  {
    return "(blank)";
  }
  
  public String getSubTotalName(int subTotalType)
  {
    switch (subTotalType)
    {
    case 2: 
      return "Sum";
    case 4: 
      return "Count";
    case 8: 
      return "Average";
    case 16: 
      return "Max";
    case 32: 
      return "Min";
    case 64: 
      return "Product";
    case 128: 
      return "Count";
    case 256: 
      return "StdDev";
    case 512: 
      return "StdDevp";
    case 1024: 
      return "Var";
    case 2048: 
      return "Varp";
    }
    return "Total";
  }
  
  public String getTotalName(int functionType)
  {
    switch (functionType)
    {
    case 1: 
      return "Count";
    case 2: 
      return "Average";
    case 3: 
      return "Max";
    case 4: 
      return "Min";
    case 5: 
      return "Product";
    case 6: 
      return "Count";
    case 7: 
      return "SedDev";
    case 8: 
      return "STDDevp";
    case 9: 
      return "Var";
    case 10: 
      return "Varp";
    }
    return "Total";
  }
  
  public String getGrandTotalName(int functionType)
  {
    String str = getTotalName(functionType);
    return "Grand " + str;
  }
  
  public String getOtherName()
  {
    return "Other";
  }
  
  public String getErrorValueString(String err)
  {
    return err;
  }
  
  public String getBooleanValueString(boolean bv)
  {
    return bv ? "TRUE" : "FALSE";
  }
  
  public String getLocalFunctionName(String standardName)
  {
    return standardName;
  }
  
  public String getStandardFunctionName(String localName)
  {
    return localName;
  }
  
  public String getLocalBuiltInName(String standardName)
  {
    return standardName;
  }
  
  public String getStandardBuiltInName(String localName)
  {
    return localName;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/GlobalizationSettings.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */