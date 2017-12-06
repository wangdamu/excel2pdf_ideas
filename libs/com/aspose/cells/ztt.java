package com.aspose.cells;

class ztt
{
  static String a(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "none";
    case 1: 
      return ".5pt solid";
    case 2: 
      return "1.0pt solid";
    case 3: 
      return ".5pt dashed";
    case 4: 
      return ".5pt dotted";
    case 5: 
      return "1.5pt solid";
    case 6: 
      return "2.0pt double";
    case 7: 
      return ".5pt hairline";
    case 8: 
      return "1.0pt dashed";
    case 9: 
      return ".5pt dot-dash";
    case 10: 
      return "1.0pt dot-dash";
    case 11: 
      return ".5pt dot-dot-dash";
    case 12: 
      return "1.0pt dot-dot-dash";
    case 13: 
      return "1.0pt dot-dash-slanted";
    }
    return "none";
  }
  
  static String b(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "";
    case 1: 
      return "none";
    case 3: 
      return "gray-75";
    case 2: 
      return "gray-50";
    case 4: 
      return "gray-25";
    case 17: 
      return "gray-125";
    case 18: 
      return "gray-0625";
    case 5: 
      return "horz-stripe";
    case 6: 
      return "vert-stripe";
    case 7: 
      return "reverse-diag-stripe";
    case 8: 
      return "diag-stripe";
    case 9: 
      return "diag-cross";
    case 10: 
      return "thick-diag-cross";
    case 11: 
      return "thin-horz-stripe";
    case 12: 
      return "thin-vert-stripe";
    case 13: 
      return "thin-reverse-diag-stripe";
    case 14: 
      return "thin-diag-stripe";
    case 15: 
      return "thin-horz-cross";
    case 16: 
      return "thin-diag-cross";
    }
    return "";
  }
  
  static int[] a()
  {
    int[] arrayOfInt = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24 };
    return arrayOfInt;
  }
  
  static int[] b()
  {
    int[] arrayOfInt = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24 };
    return arrayOfInt;
  }
  
  static String c(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "Arrows3";
    case 1: 
      return "ArrowsGray3";
    case 2: 
      return "Flags3";
    case 3: 
      return "Signs3";
    case 4: 
      return "Symbols3";
    case 5: 
      return "Symbols32";
    case 6: 
      return "TrafficLights31";
    case 7: 
      return "TrafficLights32";
    case 8: 
      return "Arrows4";
    case 9: 
      return "ArrowsGray4";
    case 10: 
      return "Rating4";
    case 11: 
      return "RedToBlack4";
    case 12: 
      return "TrafficLights4";
    case 13: 
      return "Arrows5";
    case 14: 
      return "ArrowsGray5";
    case 15: 
      return "Quarters5";
    case 16: 
      return "Rating5";
    case 17: 
      return "Stars3";
    case 18: 
      return "Boxes5";
    case 19: 
      return "Triangles3";
    }
    return "";
  }
  
  static String d(int paramInt)
  {
    String str = "";
    switch (paramInt)
    {
    case 0: 
      str = "Group";
      break;
    case 1: 
      str = "Line";
      break;
    case 2: 
      str = "Rectangle";
      break;
    case 3: 
      str = "Oval";
      break;
    case 4: 
      str = "Arc";
      break;
    case 5: 
      str = "Chart";
      break;
    case 6: 
      str = "TextBox";
      break;
    case 7: 
      str = "Button";
      break;
    case 8: 
      str = "Picture";
      break;
    case 9: 
      str = "Polygon";
      break;
    case 11: 
      str = "CheckBox";
      break;
    case 12: 
      str = "RadioButton";
      break;
    case 14: 
      str = "Label";
      break;
    case 15: 
      str = "DialogBox";
      break;
    case 16: 
      str = "Spinner";
      break;
    case 17: 
      str = "ScrollBar";
      break;
    case 18: 
      str = "ListBox";
      break;
    case 19: 
      str = "GroupBox";
      break;
    case 20: 
      str = "ComboBox";
      break;
    case 25: 
      str = "Comment";
      break;
    case 24: 
      str = "OleObject";
      break;
    case 30: 
      str = "CellsDrawing";
      break;
    case 29: 
      str = "Unknown";
    }
    return str;
  }
  
  static String e(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return "LeftBorder";
    case 2: 
      return "RightBorder";
    case 4: 
      return "TopBorder";
    case 8: 
      return "BottomBorder";
    case 16: 
      return "DiagonalDown";
    case 32: 
      return "DiagonalUp";
    case 128: 
      return "Horizontal";
    case 64: 
      return "Vertical";
    }
    return "";
  }
  
  static String f(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "None";
    case 1: 
      return "Thin";
    case 2: 
      return "Medium";
    case 3: 
      return "Dashed";
    case 4: 
      return "Dotted";
    case 5: 
      return "Thick";
    case 6: 
      return "Double";
    case 7: 
      return "Hair";
    case 8: 
      return "MediumDashed";
    case 9: 
      return "DashDot";
    case 10: 
      return "MediumDashDot";
    case 11: 
      return "DashDotDot";
    case 12: 
      return "MediumDashDotDot";
    case 13: 
      return "SlantedDashDot";
    }
    return "";
  }
  
  static String g(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "None";
    case 1: 
      return "Solid";
    case 2: 
      return "Gray50";
    case 3: 
      return "Gray75";
    case 4: 
      return "Gray25";
    case 5: 
      return "HorizontalStripe";
    case 6: 
      return "VerticalStripe";
    case 7: 
      return "ReverseDiagonalStripe";
    case 8: 
      return "DiagonalStripe";
    case 9: 
      return "DiagonalCrosshatch";
    case 10: 
      return "ThickDiagonalCrosshatch";
    case 11: 
      return "ThinHorizontalStripe";
    case 12: 
      return "ThinVerticalStripe";
    case 13: 
      return "ThinReverseDiagonalStripe";
    case 14: 
      return "ThinDiagonalStripe";
    case 15: 
      return "ThinHorizontalCrosshatch";
    case 16: 
      return "ThinDiagonalCrosshatch";
    case 17: 
      return "Gray12";
    case 18: 
      return "Gray6";
    }
    return "";
  }
  
  static String h(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "IsBool";
    case 1: 
      return "IsDateTime";
    case 2: 
      return "IsError";
    case 3: 
      return "IsNull";
    case 4: 
      return "IsNumeric";
    case 5: 
      return "IsString";
    }
    return "IsString";
  }
  
  static int i(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return 9;
    case 1: 
      return 2;
    case 2: 
      return 1;
    case 3: 
      return 4;
    case 4: 
      return 5;
    case 5: 
      return 6;
    case 6: 
      return 3;
    case 7: 
      return 7;
    case 8: 
      return 8;
    case 9: 
      return 10;
    case 10: 
      return 11;
    }
    return 9;
  }
  
  static String j(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "Sum";
    case 1: 
      return "Count";
    case 2: 
      return "Average";
    case 3: 
      return "Max";
    case 4: 
      return "Min";
    case 5: 
      return "PRODUCT";
    case 6: 
      return "Count Nums";
    case 7: 
      return "Sed Dev";
    case 8: 
      return "STD Devp";
    case 9: 
      return "Var";
    case 10: 
      return "Varp";
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ztt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */