package com.aspose.cells;

import com.aspose.cells.a.c.zx;
import com.aspose.cells.a.f.zi;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zo;
import com.aspose.cells.b.a.zq;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zu;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;

class zauj
{
  static boolean a = true;
  static boolean b = true;
  private static final com.aspose.cells.b.c.a.za c = new com.aspose.cells.b.c.a.za(new String[] { "landscape", "portrait", "default", "asDisplayed", "none", "atEnd", "blank", "dash", "displayed", "NA", "downThenOver", "overThenDown", "custom", "any", "date", "decimal", "list", "textLength", "time", "whole", "between", "equal", "greaterThanOrEqual", "greaterThan", "lessThanOrEqual", "lessThan", "notBetween", "notEqual", "solid", "darkGray", "mediumGray", "lightGray", "gray125", "gray0625", "darkHorizontal", "darkVertical", "darkDown", "darkUp", "darkGrid", "darkTrellis", "lightHorizontal", "lightVertical", "lightDown", "lightUp", "lightGrid", "lightTrellis", "dashDot", "dashDotDot", "dashed", "dotted", "double", "hair", "medium", "mediumDashDot", "mediumDashDotDot", "mediumDashed", "slantDashDot", "thick", "thin", "general", "left", "center", "right", "justify", "centerContinuous", "distributed", "fill", "top", "bottom", "information", "warning", "stop", "off", "on", "noControl", "disabled", "fullKatakana", "halfKatakana", "fullAlpha", "halfAlpha", "hiragana", "halfhangul", "fullhangul", "absolute", "oneCell", "twoCell", "thinThin", "thickThin", "thinThick", "thickBetweenThin", "single", "dot", "shortdash", "dashdot", "longdash", "longdashdot", "longdashdotdot", "r", "b", "l", "t", "tr", "cross", "in", "out", "high", "low", "nextTo", "autoZero", "max", "min", "ctr", "0", "1", "2", "auto", "base", "alphaLcParenBoth", "alphaLcParenR", "alphaLcPeriod", "alphaUcParenBoth", "alphaUcParenR", "alphaUcPeriod", "arabic1Minus", "arabic2Minus", "arabicDbPeriod", "arabicDbPlain", "arabicParenBoth", "arabicParenR", "arabicPeriod", "arabicPlain", "circleNumDbPlain", "circleNumWdBlackPlain", "circleNumWdWhitePlain", "ea1ChsPeriod", "ea1ChsPlain", "ea1ChtPeriod", "ea1ChtPlain", "ea1JpnChsDbPeriod", "ea1JpnKorPeriod", "ea1JpnKorPlain", "hebrew2Minus", "hindiAlpha1Period", "hindiAlphaPeriod", "hindiNumParenR", "hindiNumPeriod", "romanLcParenBoth", "romanLcParenR", "romanLcPeriod", "romanUcParenBoth", "romanUcParenR", "romanUcPeriod", "thaiAlphaParenBoth", "thaiAlphaParenR", "thaiAlphaPeriod", "thaiNumParenBoth", "thaiNumParenR", "thaiNumPeriod", "dbl", "sng", "heavy", "dottedHeavy", "dashHeavy", "dashLong", "dashLongHeavy", "dotDash", "dotDashHeavy", "dotDotDash", "dotDotDashHeavy", "wavy", "wavyHeavy", "wavyDbl", "", "singleAccounting", "doubleAccounting", "dec", "cellIs", "expression", "colorScale", "dataBar", "iconSet", "aboveAverage", "beginsWith", "containsBlanks", "containsErrors", "containsText", "duplicateValues", "endsWith", "notContainsBlanks", "notContainsErrors", "notContainsText", "timePeriod", "top10", "uniqueValues", "dist", "just", "justLow", "thaiDist", "outEnd", "bestFit", "inBase", "inEnd", "months", "years", "days", "linear", "exp", "log", "movingAvg", "poly", "power", "both", "minus", "plus", "fixedVal", "percentage", "stdDev", "stdErr", "cust", "clustered", "percentStacked", "stacked", "box", "cone", "coneToMax", "coneToPoint", "cylinder", "pyramid", "pyramidToMax", "pyramidToPoint", "standard", "square", "diamond", "triangle", "x", "star", "circle", "picture", "percent", "pos", "val", "areaChart", "area3DChart", "lineChart", "line3DChart", "stockChart", "radarChart", "scatterChart", "pieChart", "pie3DChart", "doughnutChart", "barChart", "bar3DChart", "ofPieChart", "surfaceChart", "surface3DChart", "bubbleChart", "marker", "lineMarker", "line", "smoothMarker", "smooth", "filled", "dashDnDiag", "dashHorz", "dashUpDiag", "dashVert", "diagBrick", "divot", "dkDnDiag", "dkHorz", "dkUpDiag", "dkVert", "dotDmnd", "dotGrid", "horzBrick", "lgCheck", "lgConfetti", "lgGrid", "ltDnDiag", "ltHorz", "ltUpDiag", "ltVert", "narHorz", "narVert", "pct10", "pct20", "pct25", "pct30", "pct40", "pct5", "pct50", "pct60", "pct70", "pct75", "pct80", "pct90", "plaid", "shingle", "smCheck", "smConfetti", "smGrid", "solidDmnd", "sphere", "trellis", "wave", "wdDnDiag", "wdUpDiag", "weave", "zigZag", "openDmnd", "3Arrows", "4Arrows", "5Arrows", "3ArrowsGray", "4ArrowsGray", "5ArrowsGray", "3Flags", "5Quarters", "4Rating", "5Rating", "4RedToBlack", "3Signs", "3Symbols", "3Symbols2", "3TrafficLights1", "3TrafficLights2", "4TrafficLights", "3Stars", "5Boxes", "3Triangles", "NoIcons", "leftToRight", "rightToLeft", "middle", "formula", "num", "percentile", "autoMax", "autoMin", "last7Days", "lastMonth", "lastWeek", "nextMonth", "nextWeek", "thisMonth", "thisWeek", "today", "tomorrow", "yesterday", "worksheet", "consolidation", "external", "scenario", "axisPage", "axisRow", "axisCol", "axisValues", "avg", "count", "countA", "product", "stdDevP", "sum", "var", "varP", "grand", "data", "average", "countNums", "stdDevp", "varp", "difference", "index", "normal", "percentDiff", "percentOfCol", "percentOfRow", "percentOfTotal", "runTotal", "percentOfParentRow", "percentOfParentCol", "percentOfParent", "rankAscending", "rankDescending", "percentOfRunningTotal", "lt1", "bg1", "dk1", "tx1", "lt2", "bg2", "dk2", "tx2", "accent1", "accent2", "accent3", "accent4", "accent5", "accent6", "hlink", "folHlink", "phClr", "belowAverage", "lastQuarter", "lastYear", "M1", "M2", "M3", "M4", "M5", "M6", "M7", "M8", "M9", "M10", "M11", "M12", "nextQuarter", "nextYear", "Q1", "Q2", "Q3", "Q4", "thisQuarter", "thisYear", "yearToDate", "day", "hour", "minute", "month", "second", "year", "hundreds", "thousands", "tenThousands", "hundredThousands", "millions", "tenMillions", "hundredMillions", "billions", "trillions", "shape", "rect", "stack", "stretch", "stackScale", "y", "xy", "bl", "br", "tl", "autoNoTable", "manual", "vert", "eaVert", "vert270", "wordArtVertRtl", "wordArtVert", "Single", "Multi", "multi", "Extend", "extended", "always", "never", "T", "pageBreakPreview", "pageLayout", "gap", "zero", "span", "queryTable", "xml", "blankRow", "firstColumn", "firstColumnStripe", "firstColumnSubheading", "firstHeaderCell", "firstRowStripe", "firstRowSubheading", "firstSubtotalColumn", "firstSubtotalRow", "firstTotalCell", "headerRow", "lastColumn", "lastHeaderCell", "lastTotalCell", "pageFieldLabels", "pageFieldValues", "secondColumnStripe", "secondColumnSubheading", "secondRowStripe", "secondRowSubheading", "secondSubtotalColumn", "secondSubtotalRow", "thirdColumnSubheading", "thirdRowSubheading", "thirdSubtotalColumn", "thirdSubtotalRow", "totalRow", "wholeTable", "legacyObliqueTopLeft", "legacyObliqueTop", "legacyObliqueTopRight", "legacyObliqueLeft", "legacyObliqueFront", "legacyObliqueRight", "legacyObliqueBottomLeft", "legacyObliqueBottom", "legacyObliqueBottomRight", "legacyPerspectiveTopLeft", "legacyPerspectiveTop", "legacyPerspectiveTopRight", "legacyPerspectiveLeft", "legacyPerspectiveFront", "legacyPerspectiveRight", "legacyPerspectiveBottomLeft", "legacyPerspectiveBottom", "legacyPerspectiveBottomRight", "orthographicFront", "isometricTopUp", "isometricTopDown", "isometricBottomUp", "isometricBottomDown", "isometricLeftUp", "isometricLeftDown", "isometricRightUp", "isometricRightDown", "isometricOffAxis1Left", "isometricOffAxis1Right", "isometricOffAxis1Top", "isometricOffAxis2Left", "isometricOffAxis2Right", "isometricOffAxis2Top", "isometricOffAxis3Left", "isometricOffAxis3Right", "isometricOffAxis3Bottom", "isometricOffAxis4Left", "isometricOffAxis4Right", "isometricOffAxis4Bottom", "obliqueTopLeft", "obliqueTop", "obliqueTopRight", "obliqueLeft", "obliqueRight", "obliqueBottomLeft", "obliqueBottom", "obliqueBottomRight", "perspectiveFront", "perspectiveLeft", "perspectiveRight", "perspectiveAbove", "perspectiveBelow", "perspectiveAboveLeftFacing", "perspectiveAboveRightFacing", "perspectiveContrastingLeftFacing", "perspectiveContrastingRightFacing", "perspectiveHeroicLeftFacing", "perspectiveHeroicRightFacing", "perspectiveHeroicExtremeLeftFacing", "perspectiveHeroicExtremeRightFacing", "perspectiveRelaxed", "perspectiveRelaxedModerately", "legacyFlat1", "legacyFlat2", "legacyFlat3", "legacyFlat4", "legacyNormal1", "legacyNormal2", "legacyNormal3", "legacyNormal4", "legacyHarsh1", "legacyHarsh2", "legacyHarsh3", "legacyHarsh4", "threePt", "balanced", "soft", "harsh", "flood", "contrasting", "morning", "sunrise", "sunset", "chilly", "freezing", "flat", "twoPt", "glow", "brightRoom", "legacyMatte", "legacyPlastic", "legacyMetal", "legacyWireframe", "matte", "plastic", "metal", "warmMatte", "translucentPowder", "powder", "dkEdge", "softEdge", "clear", "softmetal", "relaxedInset", "slope", "angle", "softRound", "convex", "coolSlant", "riblet", "hardEdge", "artDeco", "aliceBlue", "antiqueWhite", "aqua", "aquamarine", "azure", "beige", "bisque", "black", "blanchedAlmond", "blue", "blueViolet", "brown", "burlyWood", "cadetBlue", "chartreuse", "chocolate", "coral", "cornflowerBlue", "cornsilk", "crimson", "cyan", "deepPink", "deepSkyBlue", "dimGray", "dkBlue", "dkCyan", "dkGoldenrod", "dkGray", "dkGreen", "dkKhaki", "dkMagenta", "dkOliveGreen", "dkOrange", "dkOrchid", "dkRed", "dkSalmon", "dkSeaGreen", "dkSlateBlue", "dkSlateGray", "dkTurquoise", "dkViolet", "dodgerBlue", "firebrick", "floralWhite", "forestGreen", "fuchsia", "gainsboro", "ghostWhite", "gold", "goldenrod", "gray", "green", "greenYellow", "honeydew", "hotPink", "indianRed", "indigo", "ivory", "khaki", "lavender", "lavenderBlush", "lawnGreen", "lemonChiffon", "lime", "limeGreen", "linen", "ltBlue", "ltCoral", "ltCyan", "ltGoldenrodYellow", "ltGray", "ltGreen", "ltPink", "ltSalmon", "ltSeaGreen", "ltSkyBlue", "ltSlateGray", "ltSteelBlue", "ltYellow", "magenta", "maroon", "medAquamarine", "medBlue", "medOrchid", "medPurple", "medSeaGreen", "medSlateBlue", "medSpringGreen", "medTurquoise", "medVioletRed", "midnightBlue", "mintCream", "mistyRose", "moccasin", "navajoWhite", "navy", "oldLace", "olive", "oliveDrab", "orange", "orangeRed", "orchid", "paleGoldenrod", "paleGreen", "paleTurquoise", "paleVioletRed", "papayaWhip", "peachPuff", "peru", "pink", "plum", "powderBlue", "purple", "red", "rosyBrown", "royalBlue", "saddleBrown", "salmon", "sandyBrown", "seaGreen", "seaShell", "sienna", "silver", "skyBlue", "slateBlue", "slateGray", "snow", "springGreen", "steelBlue", "tan", "teal", "thistle", "tomato", "turquoise", "violet", "wheat", "white", "whiteSmoke", "yellow", "yellowGreen", "column", "group", "individual", "textArchDown", "textArchDownPour", "textArchUp", "textArchUpPour", "textButton", "textButtonPour", "textCanDown", "textCanUp", "textCascadeDown", "textCascadeUp", "textChevron", "textChevronInverted", "textCircle", "textCirclePour", "textCurveDown", "textCurveUp", "textDeflate", "textDeflateBottom", "textDeflateInflate", "textDeflateInflateDeflate", "textDeflateTop", "textFadeDown", "textFadeLeft", "textFadeRight", "textFadeUp", "textInflate", "textInflateBottom", "textInflateTop", "textNoShape", "textPlain", "textRingInside", "textRingOutside", "textSlantDown", "textSlantUp", "textStop", "textTriangle", "textTriangleInverted", "textWave1", "textWave2", "textDoubleWave1", "textWave4", "lineInv", "rtTriangle", "parallelogram", "trapezoid", "nonIsoscelesTrapezoid", "pentagon", "hexagon", "heptagon", "octagon", "decagon", "dodecagon", "star4", "star5", "star6", "star7", "star8", "star10", "star12", "star16", "star24", "star32", "roundRect", "round1Rect", "round2SameRect", "round2DiagRect", "snipRoundRect", "snip1Rect", "snip2SameRect", "snip2DiagRect", "plaque", "ellipse", "teardrop", "homePlate", "chevron", "pieWedge", "pie", "blockArc", "donut", "noSmoking", "rightArrow", "leftArrow", "upArrow", "downArrow", "stripedRightArrow", "notchedRightArrow", "bentUpArrow", "leftRightArrow", "upDownArrow", "leftUpArrow", "leftRightUpArrow", "quadArrow", "leftArrowCallout", "rightArrowCallout", "upArrowCallout", "downArrowCallout", "leftRightArrowCallout", "upDownArrowCallout", "quadArrowCallout", "bentArrow", "uturnArrow", "circularArrow", "leftCircularArrow", "leftRightCircularArrow", "curvedRightArrow", "curvedLeftArrow", "curvedUpArrow", "curvedDownArrow", "swooshArrow", "cube", "can", "lightningBolt", "heart", "sun", "moon", "smileyFace", "irregularSeal1", "irregularSeal2", "foldedCorner", "bevel", "frame", "halfFrame", "corner", "diagStripe", "chord", "arc", "leftBracket", "rightBracket", "leftBrace", "rightBrace", "bracketPair", "bracePair", "straightConnector1", "bentConnector2", "bentConnector3", "bentConnector4", "bentConnector5", "curvedConnector2", "curvedConnector3", "curvedConnector4", "curvedConnector5", "callout1", "callout2", "callout3", "accentCallout1", "accentCallout2", "accentCallout3", "borderCallout1", "borderCallout2", "borderCallout3", "accentBorderCallout1", "accentBorderCallout2", "accentBorderCallout3", "wedgeRectCallout", "wedgeRoundRectCallout", "wedgeEllipseCallout", "cloudCallout", "cloud", "ribbon", "ribbon2", "ellipseRibbon", "ellipseRibbon2", "leftRightRibbon", "verticalScroll", "horizontalScroll", "doubleWave", "flowChartProcess", "flowChartDecision", "flowChartInputOutput", "flowChartPredefinedProcess", "flowChartInternalStorage", "flowChartDocument", "flowChartMultidocument", "flowChartTerminator", "flowChartPreparation", "flowChartManualInput", "flowChartManualOperation", "flowChartConnector", "flowChartPunchedCard", "flowChartPunchedTape", "flowChartSummingJunction", "flowChartOr", "flowChartCollate", "flowChartSort", "flowChartExtract", "flowChartMerge", "flowChartOfflineStorage", "flowChartOnlineStorage", "flowChartMagneticTape", "flowChartMagneticDisk", "flowChartMagneticDrum", "flowChartDisplay", "flowChartDelay", "flowChartAlternateProcess", "flowChartOffpageConnector", "actionButtonBlank", "actionButtonHome", "actionButtonHelp", "actionButtonInformation", "actionButtonForwardNext", "actionButtonBackPrevious", "actionButtonEnd", "actionButtonBeginning", "actionButtonReturn", "actionButtonDocument", "actionButtonSound", "actionButtonMovie", "gear6", "gear9", "funnel", "mathPlus", "mathMinus", "mathMultiply", "mathDivide", "mathEqual", "mathNotEqual", "cornerTabs", "squareTabs", "plaqueTabs", "chartX", "chartStar", "chartPlus", "adj1", "adj2", "adj3", "adj4", "adj5", "adj6", "adj7", "adj8", "adj9", "adj10", "hours", "minutes", "quarters", "range", "seconds", "clip", "ellipsis", "overflow", "horz", "mongolianVert", "3", "4" });
  
  static String a(String paramString)
  {
    return paramString;
  }
  
  static String b(String paramString)
  {
    return paramString;
  }
  
  static int a(byte[] paramArrayOfByte, int paramInt)
  {
    int i = (short)(int)a(paramArrayOfByte, paramInt, 2);
    int j;
    if (i < 0) {
      j = i & 0xFFFF;
    } else {
      j = i;
    }
    return j;
  }
  
  static long a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = 0;
    for (int j = paramInt1 + paramInt2 - 1; j >= paramInt1; j--)
    {
      i <<= 8;
      i |= paramArrayOfByte[j] & 0xFF & 0xFF;
    }
    return i;
  }
  
  static void a(byte[] paramArrayOfByte, int paramInt, short paramShort)
  {
    a(paramArrayOfByte, paramInt, 2, paramShort);
  }
  
  static void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, long paramLong)
  {
    for (int i = paramInt1; i < paramInt2 + paramInt1; i++)
    {
      paramArrayOfByte[i] = ((byte)(int)(paramLong & 0xFF));
      paramLong >>= 8;
    }
  }
  
  static String a(CellArea paramCellArea)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    CellsHelper.a(localStringBuilder, paramCellArea.StartColumn);
    localStringBuilder.append(z(paramCellArea.StartRow + 1));
    if ((paramCellArea.StartColumn != paramCellArea.EndColumn) || (paramCellArea.StartRow != paramCellArea.EndRow))
    {
      localStringBuilder.append(":");
      CellsHelper.a(localStringBuilder, paramCellArea.EndColumn);
      localStringBuilder.append(z(paramCellArea.EndRow + 1));
    }
    return zs.a(localStringBuilder);
  }
  
  static String b(CellArea paramCellArea)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if ((paramCellArea.StartRow == 0) && ((paramCellArea.EndRow == 65535) || (paramCellArea.EndRow == 1048575)))
    {
      localStringBuilder.append("C").append(z(paramCellArea.StartColumn + 1));
      if (paramCellArea.StartColumn != paramCellArea.EndColumn) {
        localStringBuilder.append(":").append("C").append(z(paramCellArea.EndColumn + 1));
      }
    }
    else if ((paramCellArea.StartColumn == 0) && ((paramCellArea.EndColumn == 255) || (paramCellArea.EndColumn == 16383)))
    {
      localStringBuilder.append("R").append(z(paramCellArea.StartRow + 1));
      if ((paramCellArea.StartColumn != paramCellArea.EndColumn) || (paramCellArea.StartRow != paramCellArea.EndRow)) {
        localStringBuilder.append(":").append("R").append(z(paramCellArea.EndRow + 1));
      }
    }
    else
    {
      localStringBuilder.append("R").append(z(paramCellArea.StartRow + 1)).append("C").append(z(paramCellArea.StartColumn + 1));
      if ((paramCellArea.StartColumn != paramCellArea.EndColumn) || (paramCellArea.StartRow != paramCellArea.EndRow)) {
        localStringBuilder.append(":").append("R").append(z(paramCellArea.EndRow + 1)).append("C").append(z(paramCellArea.EndColumn + 1));
      }
    }
    return zs.a(localStringBuilder);
  }
  
  static String a(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "landscape";
    case 1: 
      return "portrait";
    }
    throw new CellsException(6, "Invalid PageOrientationType val");
  }
  
  static int c(String paramString)
  {
    switch (c.a(paramString))
    {
    case 0: 
      return 0;
    case 1: 
      return 1;
    case 2: 
      return 1;
    }
    throw new CellsException(6, "Invalid PageOrientationType string val");
  }
  
  static String b(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "asDisplayed";
    case 1: 
      return "none";
    case 2: 
      return "atEnd";
    }
    throw new CellsException(6, "Invalid PrintCommentsType val");
  }
  
  static int d(String paramString)
  {
    switch (c.a(paramString))
    {
    case 3: 
      return 0;
    case 4: 
      return 1;
    case 5: 
      return 2;
    }
    throw new CellsException(6, "Invalid PrintCommentsType string val");
  }
  
  static String c(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "blank";
    case 1: 
      return "dash";
    case 2: 
      return "displayed";
    case 3: 
      return "NA";
    }
    throw new CellsException(6, "Invalid PrintErrorsType val");
  }
  
  static int e(String paramString)
  {
    switch (c.a(paramString))
    {
    case 6: 
      return 0;
    case 7: 
      return 1;
    case 8: 
      return 2;
    case 9: 
      return 3;
    }
    throw new CellsException(6, "Invalid PrintErrorsType string val");
  }
  
  static String d(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "downThenOver";
    case 1: 
      return "overThenDown";
    }
    throw new CellsException(6, "Invalid PrintOrderType val");
  }
  
  static int f(String paramString)
  {
    switch (c.a(paramString))
    {
    case 10: 
      return 0;
    case 11: 
      return 1;
    }
    throw new CellsException(6, "Invalid PrintOrderType string val");
  }
  
  static String e(int paramInt)
  {
    switch (paramInt)
    {
    case 7: 
      return "custom";
    case 0: 
      return "none";
    case 4: 
      return "date";
    case 2: 
      return "decimal";
    case 3: 
      return "list";
    case 6: 
      return "textLength";
    case 5: 
      return "time";
    case 1: 
      return "whole";
    }
    throw new CellsException(6, "Invalid ValidationType val");
  }
  
  static int g(String paramString)
  {
    switch (c.a(paramString))
    {
    case 12: 
      return 7;
    case 4: 
    case 13: 
      return 0;
    case 14: 
      return 4;
    case 15: 
      return 2;
    case 16: 
      return 3;
    case 17: 
      return 6;
    case 18: 
      return 5;
    case 19: 
      return 1;
    }
    throw new CellsException(6, "Invalid ValidationType string val");
  }
  
  static String f(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "between";
    case 1: 
      return "equal";
    case 3: 
      return "greaterThanOrEqual";
    case 2: 
      return "greaterThan";
    case 5: 
      return "lessThanOrEqual";
    case 4: 
      return "lessThan";
    case 7: 
      return "notBetween";
    case 8: 
      return "notEqual";
    }
    throw new CellsException(6, "Invalid OperatorType val");
  }
  
  static int h(String paramString)
  {
    switch (c.a(paramString))
    {
    case 20: 
      return 0;
    case 21: 
      return 1;
    case 22: 
      return 3;
    case 23: 
      return 2;
    case 24: 
      return 5;
    case 25: 
      return 4;
    case 26: 
      return 7;
    case 27: 
      return 8;
    }
    throw new CellsException(6, "Invalid OperatorType string val");
  }
  
  static String a(ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = paramInt1; i < paramInt2; i++)
    {
      if (i > paramInt1) {
        localStringBuilder.append(",");
      }
      CellArea localCellArea = (CellArea)paramArrayList.get(i);
      localStringBuilder.append(b(localCellArea));
    }
    return zs.a(localStringBuilder);
  }
  
  static void a(String paramString, ArrayList paramArrayList)
  {
    String[] arrayOfString = zw.d(paramString, ' ');
    for (int i = 0; i < arrayOfString.length; i++)
    {
      String str = arrayOfString[i].trim();
      if ((str.length() > 0) && (str.charAt(0) != '#'))
      {
        CellArea localCellArea = (CellArea)CellArea.a(str, true);
        zf.a(paramArrayList, localCellArea);
      }
    }
  }
  
  static String b(ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = paramInt1; i < paramInt2; i++)
    {
      if (i > paramInt1) {
        localStringBuilder.append(" ");
      }
      CellArea localCellArea = (CellArea)paramArrayList.get(i);
      localStringBuilder.append(a(localCellArea));
    }
    return zs.a(localStringBuilder);
  }
  
  static String g(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return "solid";
    case 3: 
      return "darkGray";
    case 2: 
      return "mediumGray";
    case 4: 
      return "lightGray";
    case 17: 
      return "gray125";
    case 18: 
      return "gray0625";
    case 5: 
      return "darkHorizontal";
    case 6: 
      return "darkVertical";
    case 7: 
      return "darkDown";
    case 8: 
      return "darkUp";
    case 9: 
      return "darkGrid";
    case 10: 
      return "darkTrellis";
    case 11: 
      return "lightHorizontal";
    case 12: 
      return "lightVertical";
    case 13: 
      return "lightDown";
    case 14: 
      return "lightUp";
    case 15: 
      return "lightGrid";
    case 16: 
      return "lightTrellis";
    case 0: 
      return "none";
    }
    throw new CellsException(6, "Invalid BackgroundType value");
  }
  
  static int i(String paramString)
  {
    switch (c.a(paramString))
    {
    case 4: 
      return 0;
    case 28: 
      return 1;
    case 29: 
      return 3;
    case 30: 
      return 2;
    case 31: 
      return 4;
    case 32: 
      return 17;
    case 33: 
      return 18;
    case 34: 
      return 5;
    case 35: 
      return 6;
    case 36: 
      return 7;
    case 37: 
      return 8;
    case 38: 
      return 9;
    case 39: 
      return 10;
    case 40: 
      return 11;
    case 41: 
      return 12;
    case 42: 
      return 13;
    case 43: 
      return 14;
    case 44: 
      return 15;
    case 45: 
      return 16;
    }
    throw new CellsException(6, "Invalid PatternType string value");
  }
  
  static String h(int paramInt)
  {
    switch (paramInt)
    {
    case 9: 
      return "dashDot";
    case 11: 
      return "dashDotDot";
    case 3: 
      return "dashed";
    case 4: 
      return "dotted";
    case 6: 
      return "double";
    case 7: 
      return "hair";
    case 2: 
      return "medium";
    case 10: 
      return "mediumDashDot";
    case 12: 
      return "mediumDashDotDot";
    case 8: 
      return "mediumDashed";
    case 0: 
      return "none";
    case 13: 
      return "slantDashDot";
    case 5: 
      return "thick";
    case 1: 
      return "thin";
    }
    throw new CellsException(6, "Invalid CellBorderType value");
  }
  
  static int j(String paramString)
  {
    switch (c.a(paramString))
    {
    case 46: 
      return 9;
    case 47: 
      return 11;
    case 48: 
      return 3;
    case 49: 
      return 4;
    case 50: 
      return 6;
    case 51: 
      return 7;
    case 52: 
      return 2;
    case 53: 
      return 10;
    case 54: 
      return 12;
    case 55: 
      return 8;
    case 4: 
      return 0;
    case 56: 
      return 13;
    case 57: 
      return 5;
    case 58: 
      return 1;
    }
    throw new CellsException(6, "Invalid CellBorderType string value");
  }
  
  static String i(int paramInt)
  {
    switch (paramInt)
    {
    case 5: 
      return "general";
    case 7: 
      return "left";
    case 1: 
      return "center";
    case 8: 
      return "right";
    case 4: 
      return "fill";
    case 6: 
      return "justify";
    case 2: 
      return "centerContinuous";
    case 3: 
      return "distributed";
    }
    throw new CellsException(6, "Invalid Horizontal AlignmentType value");
  }
  
  static int k(String paramString)
  {
    switch (c.a(paramString))
    {
    case 59: 
      return 5;
    case 60: 
      return 7;
    case 61: 
      return 1;
    case 62: 
      return 8;
    case 63: 
      return 6;
    case 64: 
      return 2;
    case 65: 
      return 3;
    case 66: 
      return 4;
    }
    throw new CellsException(6, "Invalid Horizontal AlignmentType string value");
  }
  
  static String j(int paramInt)
  {
    switch (paramInt)
    {
    case 9: 
      return "top";
    case 1: 
      return "center";
    case 0: 
      return "bottom";
    case 6: 
      return "justify";
    case 3: 
      return "distributed";
    }
    throw new CellsException(6, "Invalid Vertical AlignmentType value");
  }
  
  static int l(String paramString)
  {
    switch (c.a(paramString))
    {
    case 67: 
      return 9;
    case 61: 
      return 1;
    case 68: 
      return 0;
    case 63: 
      return 6;
    case 65: 
      return 3;
    }
    throw new CellsException(6, "Invalid Vertical AlignmentType string value");
  }
  
  static int a(zcjy paramzcjy)
  {
    String str = paramzcjy.a("count");
    if (str != null) {
      return F(str);
    }
    return 0;
  }
  
  static int m(String paramString)
  {
    switch (c.a(paramString))
    {
    case 69: 
      return 0;
    case 70: 
      return 2;
    case 71: 
      return 1;
    }
    throw new CellsException(6, "Invalid ValidationAlertType string val");
  }
  
  static int n(String paramString)
  {
    switch (c.a(paramString))
    {
    case 72: 
      return 2;
    case 73: 
      return 1;
    case 74: 
      return 0;
    case 75: 
      return 3;
    case 76: 
      return 5;
    case 77: 
      return 6;
    case 78: 
      return 7;
    case 79: 
      return 8;
    case 80: 
      return 4;
    case 81: 
      return 10;
    case 82: 
      return 9;
    }
    throw new CellsException(6, "Invalid IMEModeType string val");
  }
  
  static String k(int paramInt)
  {
    switch (paramInt)
    {
    case 2: 
      return "off";
    case 1: 
      return "on";
    case 0: 
      return "noControl";
    case 3: 
      return "disabled";
    case 5: 
      return "fullKatakana";
    case 6: 
      return "halfKatakana";
    case 7: 
      return "fullAlpha";
    case 8: 
      return "halfAlpha";
    case 4: 
      return "hiragana";
    case 10: 
      return "halfhangul";
    case 9: 
      return "fullhangul";
    }
    throw new CellsException(6, "Invalid IMEModeType");
  }
  
  static int a(int paramInt1, int paramInt2)
  {
    return (int)(paramInt1 / 12700.0D / 72.0D * paramInt2 + 0.5D);
  }
  
  static double b(int paramInt1, int paramInt2)
  {
    return paramInt1 / 12700.0D / 72.0D * paramInt2;
  }
  
  static double l(int paramInt)
  {
    return paramInt / 12700.0D;
  }
  
  static int a(double paramDouble, int paramInt)
  {
    return (int)(paramDouble * 72.0D / paramInt * 12700.0D + 0.5D);
  }
  
  static int a(double paramDouble)
  {
    return (int)(paramDouble * 12700.0D + 0.5D);
  }
  
  static String m(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "absolute";
    case 1: 
      return "oneCell";
    case 2: 
      return "twoCell";
    }
    throw new CellsException(6, "Invalid PlacementType val");
  }
  
  static int o(String paramString)
  {
    switch (c.a(paramString))
    {
    case 83: 
      return 0;
    case 84: 
      return 1;
    case 85: 
      return 2;
    }
    throw new CellsException(6, "Invalid PlacementType string val");
  }
  
  static String n(int paramInt)
  {
    switch (paramInt)
    {
    case 4: 
      return "dbl";
    case 3: 
      return "thickThin";
    case 2: 
      return "thinThick";
    case 1: 
      return "tri";
    case 0: 
      return "sng";
    }
    throw new CellsException(6, "Invalid MsoLineStyle val");
  }
  
  static String o(int paramInt)
  {
    switch (paramInt)
    {
    case 4: 
      return "thinThin";
    case 3: 
      return "thickThin";
    case 2: 
      return "thinThick";
    case 1: 
      return "thickBetweenThin";
    case 0: 
      return "single";
    }
    return "single";
  }
  
  static int p(String paramString)
  {
    switch (c.a(paramString))
    {
    case 86: 
      return 4;
    case 87: 
      return 3;
    case 88: 
      return 2;
    case 89: 
      return 1;
    case 90: 
      return 0;
    }
    return 0;
  }
  
  static String p(int paramInt)
  {
    switch (paramInt)
    {
    case 5: 
      return "dot";
    case 7: 
      return "shortdash";
    case 0: 
      return "dash";
    case 1: 
      return "dashdot";
    case 3: 
      return "longdash";
    case 4: 
      return "longdashdot";
    case 2: 
      return "longdashdotdot";
    case 6: 
      return "solid";
    }
    throw new CellsException(6, "Invalid MsoLineDashStyle val");
  }
  
  static int q(String paramString)
  {
    if (paramString == null) {
      return 6;
    }
    switch (c.a(paramString.toLowerCase()))
    {
    case 91: 
      return 5;
    case 92: 
      return 7;
    case 7: 
      return 0;
    case 93: 
      return 1;
    case 94: 
      return 3;
    case 95: 
      return 4;
    case 96: 
      return 2;
    }
    return 6;
  }
  
  static int r(String paramString)
  {
    return com.aspose.cells.b.a.zp.a(paramString, 515, com.aspose.cells.b.a.c.za.b());
  }
  
  static Color s(String paramString)
  {
    if (paramString.charAt(0) == '#') {
      paramString = paramString.substring(1);
    }
    int i = com.aspose.cells.b.a.zp.a(paramString, 515, com.aspose.cells.b.a.c.za.b());
    Color localColor = Color.fromArgb(i);
    return localColor;
  }
  
  static String a(Color paramColor)
  {
    int i = paramColor.toArgb();
    String str = com.aspose.cells.a.c.zp.d(i).substring(2);
    return str;
  }
  
  static String q(int paramInt)
  {
    switch (paramInt)
    {
    case 3: 
      return "r";
    case 0: 
      return "b";
    case 4: 
      return "l";
    case 2: 
      return "t";
    case 1: 
      return "tr";
    case 7: 
      return "r";
    }
    throw new CellsException(6, "Invalid LegendPositionType val");
  }
  
  static int t(String paramString)
  {
    switch (c.a(paramString))
    {
    case 97: 
      return 3;
    case 98: 
      return 0;
    case 99: 
      return 4;
    case 100: 
      return 2;
    case 101: 
      return 1;
    }
    throw new CellsException(6, "Invalid LegendPositionType string val");
  }
  
  static String r(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "cross";
    case 1: 
      return "in";
    case 2: 
      return "none";
    case 3: 
      return "out";
    }
    throw new CellsException(6, "Invalid TickMarkType val");
  }
  
  static int u(String paramString)
  {
    switch (c.a(paramString))
    {
    case 102: 
      return 0;
    case 103: 
      return 1;
    case 4: 
      return 2;
    case 104: 
      return 3;
    }
    throw new CellsException(6, "Invalid TickMarkType string val");
  }
  
  static String s(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "high";
    case 1: 
      return "low";
    case 2: 
      return "nextTo";
    case 3: 
      return "none";
    }
    throw new CellsException(6, "Invalid TickLabelPositionType val");
  }
  
  static int v(String paramString)
  {
    switch (c.a(paramString))
    {
    case 105: 
      return 0;
    case 106: 
      return 1;
    case 107: 
      return 2;
    case 4: 
      return 3;
    }
    throw new CellsException(6, "Invalid TickLabelPositionType string val");
  }
  
  static String t(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "autoZero";
    case 1: 
      return "max";
    }
    throw new CellsException(6, "Invalid CrossType val");
  }
  
  static int w(String paramString)
  {
    switch (c.a(paramString))
    {
    case 108: 
      return 0;
    case 109: 
      return 1;
    case 110: 
      return 2;
    }
    throw new CellsException(6, "Invalid CrossType string val");
  }
  
  static String u(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "0";
    case 1: 
      return "1";
    case 2: 
      return "2";
    }
    return "0";
  }
  
  static int x(String paramString)
  {
    switch (c.a(paramString))
    {
    case 112: 
      return 0;
    case 113: 
      return 1;
    case 114: 
      return 2;
    }
    return 0;
  }
  
  static String v(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "none";
    case 1: 
    case 3: 
      return "sng";
    case 2: 
    case 4: 
      return "dbl";
    case 15: 
      return "heavy";
    case 13: 
      return "dotted";
    case 14: 
      return "dottedHeavy";
    case 5: 
      return "dash";
    case 8: 
      return "dashHeavy";
    case 9: 
      return "dashLong";
    case 10: 
      return "dashLongHeavy";
    case 11: 
      return "dotDash";
    case 7: 
      return "dotDashHeavy";
    case 12: 
      return "dotDotDash";
    case 6: 
      return "dotDotDashHeavy";
    case 16: 
      return "wavy";
    case 18: 
      return "wavyHeavy";
    case 17: 
      return "wavyDbl";
    }
    throw new CellsException(6, "Invalid FontUnderlineType value");
  }
  
  static int y(String paramString)
  {
    switch (c.a(paramString))
    {
    case 115: 
      return 0;
    case 98: 
      return 1;
    case 116: 
      return 2;
    case 111: 
      return 3;
    case 100: 
      return 4;
    }
    return 0;
  }
  
  static String w(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "auto";
    case 1: 
      return "b";
    case 2: 
      return "base";
    case 3: 
      return "ctr";
    case 4: 
      return "t";
    }
    return "auto";
  }
  
  static int z(String paramString)
  {
    switch (c.a(paramString))
    {
    case 117: 
      return 1;
    case 118: 
      return 2;
    case 119: 
      return 3;
    case 120: 
      return 4;
    case 121: 
      return 5;
    case 122: 
      return 6;
    case 123: 
      return 7;
    case 124: 
      return 8;
    case 125: 
      return 9;
    case 126: 
      return 10;
    case 127: 
      return 11;
    case 128: 
      return 12;
    case 129: 
      return 13;
    case 130: 
      return 14;
    case 131: 
      return 15;
    case 132: 
      return 16;
    case 133: 
      return 17;
    case 134: 
      return 18;
    case 135: 
      return 19;
    case 136: 
      return 20;
    case 137: 
      return 21;
    case 138: 
      return 22;
    case 139: 
      return 23;
    case 140: 
      return 24;
    case 141: 
      return 25;
    case 142: 
      return 26;
    case 143: 
      return 27;
    case 144: 
      return 28;
    case 145: 
      return 29;
    case 146: 
      return 30;
    case 147: 
      return 31;
    case 148: 
      return 32;
    case 149: 
      return 33;
    case 150: 
      return 34;
    case 151: 
      return 35;
    case 152: 
      return 36;
    case 153: 
      return 37;
    case 154: 
      return 38;
    case 155: 
      return 39;
    case 156: 
      return 40;
    case 157: 
      return 41;
    }
    return 0;
  }
  
  static String x(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return "alphaLcParenBoth";
    case 2: 
      return "alphaLcParenR";
    case 3: 
      return "alphaLcPeriod";
    case 4: 
      return "alphaUcParenBoth";
    case 5: 
      return "alphaUcParenR";
    case 6: 
      return "alphaUcPeriod";
    case 7: 
      return "arabic1Minus";
    case 8: 
      return "arabic2Minus";
    case 9: 
      return "arabicDbPeriod";
    case 10: 
      return "arabicDbPlain";
    case 11: 
      return "arabicParenBoth";
    case 12: 
      return "arabicParenR";
    case 13: 
      return "arabicPeriod";
    case 14: 
      return "arabicPlain";
    case 15: 
      return "circleNumDbPlain";
    case 16: 
      return "circleNumWdBlackPlain";
    case 17: 
      return "circleNumWdWhitePlain";
    case 18: 
      return "ea1ChsPeriod";
    case 19: 
      return "ea1ChsPlain";
    case 20: 
      return "ea1ChtPeriod";
    case 21: 
      return "ea1ChtPlain";
    case 22: 
      return "ea1JpnChsDbPeriod";
    case 23: 
      return "ea1JpnKorPeriod";
    case 24: 
      return "ea1JpnKorPlain";
    case 25: 
      return "hebrew2Minus";
    case 26: 
      return "hindiAlpha1Period";
    case 27: 
      return "hindiAlphaPeriod";
    case 28: 
      return "hindiNumParenR";
    case 29: 
      return "hindiNumPeriod";
    case 30: 
      return "romanLcParenBoth";
    case 31: 
      return "romanLcParenR";
    case 32: 
      return "romanLcPeriod";
    case 33: 
      return "romanUcParenBoth";
    case 34: 
      return "romanUcParenR";
    case 35: 
      return "romanUcPeriod";
    case 36: 
      return "thaiAlphaParenBoth";
    case 37: 
      return "thaiAlphaParenR";
    case 38: 
      return "thaiAlphaPeriod";
    case 39: 
      return "thaiNumParenBoth";
    case 40: 
      return "thaiNumParenR";
    case 41: 
      return "thaiNumPeriod";
    }
    return null;
  }
  
  static int A(String paramString)
  {
    switch (c.a(paramString))
    {
    case 4: 
      return 0;
    case 158: 
      return 2;
    case 159: 
      return 1;
    case 160: 
      return 15;
    case 49: 
      return 13;
    case 161: 
      return 14;
    case 7: 
      return 5;
    case 162: 
      return 8;
    case 163: 
      return 9;
    case 164: 
      return 10;
    case 165: 
      return 11;
    case 166: 
      return 7;
    case 167: 
      return 12;
    case 168: 
      return 6;
    case 169: 
      return 16;
    case 170: 
      return 18;
    case 171: 
      return 17;
    }
    return 1;
  }
  
  static String y(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return "single";
    case 3: 
      return "singleAccounting";
    case 2: 
      return "double";
    case 4: 
      return "doubleAccounting";
    case 0: 
      return "none";
    case 15: 
      return "heavy";
    case 13: 
      return "dotted";
    case 14: 
      return "dottedHeavy";
    case 5: 
      return "dash";
    case 8: 
      return "dashHeavy";
    case 9: 
      return "dashLong";
    case 10: 
      return "dashLongHeavy";
    case 11: 
      return "dotDash";
    case 7: 
      return "dotDashHeavy";
    case 12: 
      return "dotDotDash";
    case 6: 
      return "dotDotDashHeavy";
    case 16: 
      return "wavy";
    case 18: 
      return "wavyHeavy";
    case 17: 
      return "wavyDbl";
    }
    throw new CellsException(6, "Invalid FontUnderlineType value");
  }
  
  static int B(String paramString)
  {
    switch (c.a(paramString))
    {
    case 90: 
    case 172: 
      return 1;
    case 173: 
      return 3;
    case 50: 
      return 2;
    case 174: 
      return 4;
    case 4: 
      return 0;
    case 160: 
      return 15;
    case 49: 
      return 13;
    case 161: 
      return 14;
    case 7: 
      return 5;
    case 162: 
      return 8;
    case 163: 
      return 9;
    case 164: 
      return 10;
    case 165: 
      return 11;
    case 166: 
      return 7;
    case 167: 
      return 12;
    case 168: 
      return 6;
    case 169: 
      return 16;
    case 170: 
      return 18;
    case 171: 
      return 17;
    }
    throw new CellsException(6, "Invalid FontUnderlineType string val");
  }
  
  static String a(long paramLong)
  {
    return com.aspose.cells.a.c.zp.a(paramLong);
  }
  
  static String b(double paramDouble)
  {
    return com.aspose.cells.a.c.zp.b(paramDouble);
  }
  
  static String z(int paramInt)
  {
    return com.aspose.cells.a.c.zp.a(paramInt);
  }
  
  static String a(float paramFloat)
  {
    return com.aspose.cells.a.c.zp.b(paramFloat);
  }
  
  static String a(short paramShort)
  {
    return com.aspose.cells.a.c.zp.a(paramShort);
  }
  
  static String a(byte paramByte)
  {
    return com.aspose.cells.a.c.zp.a(paramByte);
  }
  
  static double C(String paramString)
  {
    return zo.a(paramString, com.aspose.cells.b.a.c.za.b());
  }
  
  static double D(String paramString)
  {
    if (paramString.endsWith("%"))
    {
      double d = C(paramString.substring(0, 0 + (paramString.length() - 1)));
      return d / 100.0D;
    }
    return zbxp.k(com.aspose.cells.b.a.zp.a(paramString, com.aspose.cells.b.a.c.za.b()));
  }
  
  static int E(String paramString)
  {
    if (zw.b(paramString)) {
      return 0;
    }
    if (paramString.charAt(paramString.length() - 1) == '%')
    {
      double d = C(paramString.substring(0, 0 + (paramString.length() - 1)));
      return (int)(d * 1000.0D);
    }
    return com.aspose.cells.b.a.zp.a(paramString, com.aspose.cells.b.a.c.za.b());
  }
  
  static int F(String paramString)
  {
    return com.aspose.cells.b.a.zp.a(paramString, com.aspose.cells.b.a.c.za.b());
  }
  
  static long G(String paramString)
  {
    return zq.a(paramString, com.aspose.cells.b.a.c.za.b());
  }
  
  static short H(String paramString)
  {
    return zu.a(paramString, com.aspose.cells.b.a.c.za.b());
  }
  
  static int I(String paramString)
  {
    switch (c.a(paramString))
    {
    case 111: 
      return 0;
    case 175: 
      return 1;
    case 99: 
      return 2;
    case 97: 
      return 3;
    }
    return 0;
  }
  
  static String A(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "ctr";
    case 1: 
      return "dec";
    case 2: 
      return "l";
    case 3: 
      return "r";
    }
    return "ctr";
  }
  
  static boolean J(String paramString)
  {
    switch (c.a(paramString))
    {
    case 176: 
    case 177: 
    case 178: 
    case 179: 
    case 180: 
    case 181: 
    case 182: 
    case 183: 
    case 184: 
    case 185: 
    case 186: 
    case 187: 
    case 188: 
    case 189: 
    case 190: 
    case 191: 
    case 192: 
    case 193: 
      return true;
    }
    return false;
  }
  
  static int K(String paramString)
  {
    switch (c.a(paramString))
    {
    case 176: 
      return 0;
    case 177: 
      return 1;
    case 178: 
      return 2;
    case 179: 
      return 3;
    case 180: 
      return 4;
    case 181: 
      return 17;
    case 182: 
      return 10;
    case 183: 
      return 12;
    case 184: 
      return 14;
    case 185: 
      return 8;
    case 186: 
      return 7;
    case 187: 
      return 11;
    case 188: 
      return 13;
    case 189: 
      return 15;
    case 190: 
      return 9;
    case 191: 
      return 16;
    case 192: 
      return 5;
    case 193: 
      return 6;
    }
    throw new CellsException(6, "Invalid FormatConditionType string val");
  }
  
  static String B(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "cellIs";
    case 1: 
      return "expression";
    case 2: 
      return "colorScale";
    case 3: 
      return "dataBar";
    case 4: 
      return "iconSet";
    case 17: 
      return "aboveAverage";
    case 10: 
      return "beginsWith";
    case 12: 
      return "containsBlanks";
    case 14: 
      return "containsErrors";
    case 8: 
      return "containsText";
    case 7: 
      return "duplicateValues";
    case 11: 
      return "endsWith";
    case 13: 
      return "notContainsBlanks";
    case 15: 
      return "notContainsErrors";
    case 9: 
      return "notContainsText";
    case 16: 
      return "timePeriod";
    case 5: 
      return "top10";
    case 6: 
      return "uniqueValues";
    }
    throw new CellsException(6, "Invalid FormatConditionType val");
  }
  
  static boolean a(Shape paramShape)
  {
    if (paramShape.getMsoDrawingType() == 8) {
      return false;
    }
    if ((paramShape.getAutoShapeType() != 4095) && (aH(paramShape.getAutoShapeType()) != 188)) {
      return true;
    }
    switch (paramShape.getMsoDrawingType())
    {
    case 1: 
      return true;
    }
    return false;
  }
  
  static String L(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    paramString = paramString.trim();
    if ((paramString.length() > 1) && (paramString.charAt(0) == '=')) {
      return paramString.substring(1).trim();
    }
    return paramString;
  }
  
  static String C(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "b";
    case 1: 
      return "ctr";
    case 3: 
      return "dist";
    case 6: 
      return "just";
    case 9: 
      return "t";
    }
    throw new CellsException(6, "Invalid TextAlignmentType val");
  }
  
  static int M(String paramString)
  {
    switch (c.a(paramString))
    {
    case 98: 
      return 0;
    case 111: 
      return 1;
    case 194: 
      return 3;
    case 195: 
      return 6;
    case 100: 
      return 9;
    }
    throw new CellsException(6, "Invalid ChartTextAnchor string val");
  }
  
  static String D(int paramInt)
  {
    switch (paramInt)
    {
    case 8: 
      return "r";
    case 1: 
      return "ctr";
    case 3: 
      return "dist";
    case 6: 
      return "just";
    case 7: 
      return "l";
    case 11: 
      return "thaiDist";
    case 10: 
      return "justLow";
    }
    throw new CellsException(6, "Invalid TextAlignmentType val");
  }
  
  static int N(String paramString)
  {
    switch (c.a(paramString))
    {
    case 97: 
      return 8;
    case 111: 
      return 1;
    case 194: 
      return 3;
    case 195: 
      return 6;
    case 196: 
      return 10;
    case 197: 
      return 11;
    case 99: 
      return 7;
    }
    throw new CellsException(6, "Invalid ChartTextAlignType string val");
  }
  
  static String c(int paramInt1, int paramInt2)
  {
    if (ChartCollection.c(paramInt2))
    {
      switch (paramInt1)
      {
      case 2: 
        return "inEnd";
      case 3: 
        return "outEnd";
      case 8: 
        return "bestFit";
      case 0: 
        return "ctr";
      }
      return null;
    }
    if ((ChartCollection.g(paramInt2)) || (ChartCollection.r(paramInt2)))
    {
      switch (paramInt1)
      {
      case 1: 
        return "inBase";
      case 2: 
        return "inEnd";
      case 3: 
        return "outEnd";
      case 0: 
        return "ctr";
      }
      return null;
    }
    if ((ChartCollection.n(paramInt2)) || (ChartCollection.k(paramInt2)) || (ChartCollection.q(paramInt2)))
    {
      switch (paramInt1)
      {
      case 4: 
        return "t";
      case 5: 
        return "b";
      case 0: 
        return "ctr";
      case 6: 
        return "l";
      case 7: 
        return "r";
      }
      return null;
    }
    if ((ChartCollection.p(paramInt2)) || (ChartCollection.m(paramInt2)) || (O(paramInt2)) || (ChartCollection.e(paramInt2))) {
      return null;
    }
    return null;
  }
  
  static int O(String paramString)
  {
    switch (c.a(paramString))
    {
    case 198: 
      return 3;
    case 100: 
      return 4;
    case 98: 
      return 5;
    case 199: 
      return 8;
    case 111: 
      return 0;
    case 200: 
      return 1;
    case 201: 
      return 2;
    case 99: 
      return 6;
    case 97: 
      return 7;
    }
    throw new CellsException(6, "Invalid ChartDLblPos string val");
  }
  
  static String E(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return "months";
    case 2: 
      return "years";
    case 0: 
      return "days";
    }
    throw new CellsException(6, "Invalid TimeUnit val");
  }
  
  static int P(String paramString)
  {
    switch (c.a(paramString))
    {
    case 202: 
      return 1;
    case 203: 
      return 2;
    case 204: 
      return 0;
    }
    throw new CellsException(6, "Invalid TimeUnit string val");
  }
  
  static String F(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return "linear";
    case 0: 
      return "exp";
    case 2: 
      return "log";
    case 3: 
      return "movingAvg";
    case 4: 
      return "poly";
    case 5: 
      return "power";
    }
    throw new CellsException(6, "Invalid TrendlineType val");
  }
  
  static int Q(String paramString)
  {
    switch (c.a(paramString))
    {
    case 205: 
      return 1;
    case 206: 
      return 0;
    case 207: 
      return 2;
    case 208: 
      return 3;
    case 209: 
      return 4;
    case 210: 
      return 5;
    }
    throw new CellsException(6, "Invalid TrendlineType string val");
  }
  
  static String G(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "both";
    case 1: 
      return "minus";
    case 3: 
      return "plus";
    }
    throw new CellsException(6, "Invalid ErrorBarDisplayType val");
  }
  
  static int R(String paramString)
  {
    switch (c.a(paramString))
    {
    case 211: 
      return 0;
    case 212: 
      return 1;
    case 213: 
      return 3;
    }
    throw new CellsException(6, "Invalid ErrorBarDisplayType string val");
  }
  
  static String H(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return "fixedVal";
    case 2: 
      return "percentage";
    case 3: 
      return "stdDev";
    case 4: 
      return "stdErr";
    case 0: 
      return "cust";
    }
    throw new CellsException(6, "Invalid ErrorBarType val");
  }
  
  static int S(String paramString)
  {
    switch (c.a(paramString))
    {
    case 214: 
      return 1;
    case 215: 
      return 2;
    case 216: 
      return 3;
    case 217: 
      return 4;
    case 218: 
      return 0;
    }
    throw new CellsException(6, "Invalid ErrorBarType string val");
  }
  
  static void a(int paramInt, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    switch (paramInt)
    {
    case 17: 
    case 27: 
    case 34: 
    case 56: 
      paramArrayOfString1[0] = "col";
      paramArrayOfString2[0] = "standard";
      return;
    case 6: 
    case 9: 
    case 24: 
    case 31: 
    case 53: 
      paramArrayOfString1[0] = "bar";
      paramArrayOfString2[0] = "clustered";
      return;
    case 14: 
    case 18: 
    case 21: 
    case 28: 
    case 50: 
      paramArrayOfString1[0] = "col";
      paramArrayOfString2[0] = "clustered";
      return;
    case 8: 
    case 11: 
    case 26: 
    case 33: 
    case 55: 
      paramArrayOfString1[0] = "bar";
      paramArrayOfString2[0] = "percentStacked";
      return;
    case 16: 
    case 20: 
    case 23: 
    case 30: 
    case 52: 
      paramArrayOfString1[0] = "col";
      paramArrayOfString2[0] = "percentStacked";
      return;
    case 7: 
    case 10: 
    case 25: 
    case 32: 
    case 54: 
      paramArrayOfString1[0] = "bar";
      paramArrayOfString2[0] = "stacked";
      return;
    case 15: 
    case 19: 
    case 22: 
    case 29: 
    case 51: 
      paramArrayOfString1[0] = "col";
      paramArrayOfString2[0] = "stacked";
      return;
    }
    throw new CellsException(6, "Invalid Bar ChartType val");
  }
  
  static int a(String paramString1, String paramString2, boolean paramBoolean, String paramString3)
  {
    int i = "col".equals(paramString1) ? 1 : 0;
    if (!paramBoolean) {
      switch (c.a(paramString2))
      {
      case 219: 
        if (i != 0) {
          return 14;
        }
        return 6;
      case 220: 
        if (i != 0) {
          return 16;
        }
        return 8;
      case 221: 
        if (i != 0) {
          return 15;
        }
        return 7;
      }
    } else if ("standard".equals(paramString2)) {
      switch (c.a(paramString3))
      {
      case 222: 
        return 17;
      case 223: 
      case 224: 
      case 225: 
        return 27;
      case 226: 
        return 34;
      case 227: 
      case 228: 
      case 229: 
        return 56;
      }
    } else if ("clustered".equals(paramString2)) {
      switch (c.a(paramString3))
      {
      case 222: 
        if (i != 0) {
          return 18;
        }
        return 9;
      case 223: 
      case 224: 
      case 225: 
        if (i != 0) {
          return 21;
        }
        return 24;
      case 226: 
        if (i != 0) {
          return 28;
        }
        return 31;
      case 227: 
      case 228: 
      case 229: 
        if (i != 0) {
          return 50;
        }
        return 53;
      }
    } else if ("percentStacked".equals(paramString2)) {
      switch (c.a(paramString3))
      {
      case 222: 
        if (i != 0) {
          return 20;
        }
        return 11;
      case 223: 
      case 224: 
      case 225: 
        if (i != 0) {
          return 23;
        }
        return 26;
      case 226: 
        if (i != 0) {
          return 30;
        }
        return 33;
      case 227: 
      case 228: 
      case 229: 
        if (i != 0) {
          return 52;
        }
        return 55;
      }
    } else if ("stacked".equals(paramString2)) {
      switch (c.a(paramString3))
      {
      case 222: 
        if (i != 0) {
          return 19;
        }
        return 10;
      case 223: 
      case 224: 
      case 225: 
        if (i != 0) {
          return 22;
        }
        return 25;
      case 226: 
        if (i != 0) {
          return 29;
        }
        return 32;
      case 227: 
      case 228: 
      case 229: 
        if (i != 0) {
          return 51;
        }
        return 54;
      }
    }
    return 6;
  }
  
  static String I(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
    case 3: 
      return "standard";
    case 1: 
    case 4: 
      return "stacked";
    case 2: 
    case 5: 
      return "percentStacked";
    }
    throw new CellsException(6, "Invalid area ChartType val");
  }
  
  static int a(String paramString, boolean paramBoolean)
  {
    switch (c.a(paramString))
    {
    case 230: 
      if (paramBoolean) {
        return 3;
      }
      return 0;
    case 221: 
      if (paramBoolean) {
        return 4;
      }
      return 1;
    case 220: 
      if (paramBoolean) {
        return 5;
      }
      return 2;
    }
    throw new CellsException(6, "Invalid area grouping val");
  }
  
  static String J(int paramInt)
  {
    switch (paramInt)
    {
    case 37: 
    case 40: 
    case 43: 
      return "standard";
    case 38: 
    case 41: 
      return "stacked";
    case 39: 
    case 42: 
      return "percentStacked";
    }
    throw new CellsException(6, "Invalid Line ChartType val");
  }
  
  static int a(boolean paramBoolean, String paramString)
  {
    if (paramBoolean) {
      switch (c.a(paramString))
      {
      case 230: 
        return 40;
      case 221: 
        return 41;
      case 220: 
        return 42;
      }
    } else {
      switch (c.a(paramString))
      {
      case 230: 
        return 37;
      case 221: 
        return 38;
      case 220: 
        return 39;
      }
    }
    throw new CellsException(6, "Invalid linechart marker or grouping string val");
  }
  
  static String K(int paramInt)
  {
    switch (paramInt)
    {
    case 7: 
      return "square";
    case 3: 
      return "diamond";
    case 9: 
      return "triangle";
    case 10: 
      return "x";
    case 8: 
      return "star";
    case 4: 
      return "dot";
    case 2: 
      return "dash";
    case 1: 
      return "circle";
    case 6: 
      return "plus";
    case 5: 
      return "none";
    case 11: 
      return "picture";
    }
    throw new CellsException(6, "Invalid ChartMarkerType val");
  }
  
  static int T(String paramString)
  {
    switch (c.a(paramString))
    {
    case 115: 
      return 0;
    case 231: 
      return 7;
    case 232: 
      return 3;
    case 233: 
      return 9;
    case 234: 
      return 10;
    case 235: 
      return 8;
    case 91: 
      return 4;
    case 7: 
      return 2;
    case 236: 
      return 1;
    case 213: 
      return 6;
    case 4: 
      return 5;
    case 237: 
      return 11;
    }
    throw new CellsException(6, "Invalid chart MarkerStyle string val");
  }
  
  static int a(Font paramFont, WorksheetCollection paramWorksheetCollection)
  {
    ArrayList localArrayList = paramWorksheetCollection.A();
    for (int i = 0; i < localArrayList.size(); i++)
    {
      Font localFont = (Font)localArrayList.get(i);
      if (localFont.d(paramFont)) {
        return localFont.m();
      }
    }
    if (localArrayList.size() > 3) {
      paramFont.d(localArrayList.size() + 1);
    } else {
      paramFont.d(localArrayList.size());
    }
    zf.a(localArrayList, paramFont);
    return localArrayList.size();
  }
  
  static int a(zpw paramzpw, WorksheetCollection paramWorksheetCollection)
  {
    Font localFont = new Font(paramWorksheetCollection, null, false, true);
    paramzpw.a(localFont);
    return a(localFont, paramWorksheetCollection);
  }
  
  static String L(int paramInt)
  {
    switch (paramInt)
    {
    case 3: 
      return "cust";
    case 2: 
      return "percent";
    case 0: 
      return "pos";
    case 1: 
      return "val";
    }
    throw new CellsException(6, "Invalid ChartSplitType val");
  }
  
  static int U(String paramString)
  {
    switch (c.a(paramString))
    {
    case 115: 
      return 0;
    case 218: 
      return 3;
    case 238: 
      return 2;
    case 239: 
      return 0;
    case 240: 
      return 1;
    }
    throw new CellsException(6, "Invalid chart splitType string val");
  }
  
  static boolean M(int paramInt)
  {
    return true;
  }
  
  static boolean a(Chart paramChart)
  {
    zkb localzkb = paramChart.q();
    for (int i = 0; i < localzkb.getCount(); i++)
    {
      zka localzka = localzkb.a(i);
      int j = localzka.j();
      if (!M(j)) {
        return false;
      }
    }
    return true;
  }
  
  static String N(int paramInt)
  {
    switch (paramInt)
    {
    case 60: 
      return "lineMarker";
    case 63: 
      return "lineMarker";
    case 64: 
      return "line";
    case 61: 
      return "smoothMarker";
    case 62: 
      return "smooth";
    }
    throw new CellsException(6, "Invalid scatter ChartType val");
  }
  
  static int V(String paramString)
  {
    switch (c.a(paramString))
    {
    case 4: 
    case 257: 
      return 60;
    case 258: 
      return 63;
    case 259: 
      return 64;
    case 260: 
      return 61;
    case 261: 
      return 62;
    }
    throw new CellsException(6, "Invalid scatter style val");
  }
  
  static boolean O(int paramInt)
  {
    return (paramInt == 57) || (paramInt == 59) || (paramInt == 58);
  }
  
  static String P(int paramInt)
  {
    switch (paramInt)
    {
    case 58: 
      return "marker";
    case 57: 
      return "standard";
    case 59: 
      return "filled";
    }
    throw new CellsException(6, "Invalid radar ChartType val");
  }
  
  static int W(String paramString)
  {
    switch (c.a(paramString))
    {
    case 257: 
      return 58;
    case 230: 
      return 57;
    case 262: 
      return 59;
    }
    throw new CellsException(6, "Invalid radar style val");
  }
  
  static String Q(int paramInt)
  {
    switch (paramInt)
    {
    case 9: 
    case 10: 
    case 11: 
    case 17: 
    case 18: 
    case 19: 
    case 20: 
      return "box";
    case 21: 
    case 22: 
    case 23: 
    case 24: 
    case 25: 
    case 26: 
    case 27: 
      return "cone";
    case 28: 
    case 29: 
    case 30: 
    case 31: 
    case 32: 
    case 33: 
    case 34: 
      return "cylinder";
    case 50: 
    case 51: 
    case 52: 
    case 53: 
    case 54: 
    case 55: 
    case 56: 
      return "pyramid";
    }
    return null;
  }
  
  static String R(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "box";
    case 5: 
      return "coneToMax";
    case 4: 
      return "cone";
    case 3: 
      return "cylinder";
    case 2: 
      return "pyramidToMax";
    case 1: 
      return "pyramid";
    }
    return null;
  }
  
  static int X(String paramString)
  {
    switch (c.a(paramString))
    {
    case 222: 
      return 0;
    case 224: 
      return 5;
    case 223: 
      return 4;
    case 226: 
      return 3;
    case 228: 
      return 2;
    case 227: 
      return 1;
    }
    return 0;
  }
  
  static String S(int paramInt)
  {
    switch (paramInt)
    {
    case 26: 
      return "dashDnDiag";
    case 29: 
      return "dashHorz";
    case 27: 
      return "dashUpDiag";
    case 28: 
      return "dashVert";
    case 34: 
      return "diagBrick";
    case 38: 
      return "divot";
    case 16: 
      return "dkDnDiag";
    case 25: 
      return "dkHorz";
    case 17: 
      return "dkUpDiag";
    case 24: 
      return "dkVert";
    case 40: 
      return "dotDmnd";
    case 39: 
      return "dotGrid";
    case 35: 
      return "horzBrick";
    case 47: 
      return "lgCheck";
    case 31: 
      return "lgConfetti";
    case 45: 
      return "lgGrid";
    case 14: 
      return "ltDnDiag";
    case 21: 
      return "ltHorz";
    case 15: 
      return "ltUpDiag";
    case 20: 
      return "ltVert";
    case 23: 
      return "narHorz";
    case 22: 
      return "narVert";
    case 3: 
      return "pct10";
    case 4: 
      return "pct20";
    case 13: 
      return "pct25";
    case 5: 
      return "pct30";
    case 6: 
      return "pct40";
    case 2: 
      return "pct5";
    case 7: 
      return "pct50";
    case 8: 
      return "pct60";
    case 9: 
      return "pct70";
    case 10: 
      return "pct75";
    case 11: 
      return "pct80";
    case 12: 
      return "pct90";
    case 37: 
      return "plaid";
    case 41: 
      return "shingle";
    case 46: 
      return "smCheck";
    case 30: 
      return "smConfetti";
    case 44: 
      return "smGrid";
    case 49: 
      return "solidDmnd";
    case 43: 
      return "sphere";
    case 42: 
      return "trellis";
    case 33: 
      return "wave";
    case 18: 
      return "wdDnDiag";
    case 19: 
      return "wdUpDiag";
    case 36: 
      return "weave";
    case 32: 
      return "zigZag";
    case 48: 
      return "openDmnd";
    }
    return "pct10";
  }
  
  static int Y(String paramString)
  {
    switch (c.a(paramString))
    {
    case 263: 
      return 26;
    case 264: 
      return 29;
    case 265: 
      return 27;
    case 266: 
      return 28;
    case 267: 
      return 34;
    case 268: 
      return 38;
    case 269: 
      return 16;
    case 270: 
      return 25;
    case 271: 
      return 17;
    case 272: 
      return 24;
    case 273: 
      return 40;
    case 274: 
      return 39;
    case 275: 
      return 35;
    case 276: 
      return 47;
    case 277: 
      return 31;
    case 278: 
      return 45;
    case 279: 
      return 14;
    case 280: 
      return 21;
    case 281: 
      return 15;
    case 282: 
      return 20;
    case 283: 
      return 23;
    case 284: 
      return 22;
    case 285: 
      return 3;
    case 286: 
      return 4;
    case 287: 
      return 13;
    case 288: 
      return 5;
    case 289: 
      return 6;
    case 290: 
      return 2;
    case 291: 
      return 7;
    case 292: 
      return 8;
    case 293: 
      return 9;
    case 294: 
      return 10;
    case 295: 
      return 11;
    case 296: 
      return 12;
    case 297: 
      return 37;
    case 298: 
      return 41;
    case 299: 
      return 46;
    case 300: 
      return 30;
    case 301: 
      return 44;
    case 302: 
      return 49;
    case 303: 
      return 43;
    case 304: 
      return 42;
    case 305: 
      return 33;
    case 306: 
      return 18;
    case 307: 
      return 19;
    case 308: 
      return 36;
    case 309: 
      return 32;
    case 310: 
      return 48;
    }
    return 3;
  }
  
  static String T(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "3Arrows";
    case 8: 
      return "4Arrows";
    case 13: 
      return "5Arrows";
    case 1: 
      return "3ArrowsGray";
    case 9: 
      return "4ArrowsGray";
    case 14: 
      return "5ArrowsGray";
    case 2: 
      return "3Flags";
    case 15: 
      return "5Quarters";
    case 10: 
      return "4Rating";
    case 16: 
      return "5Rating";
    case 11: 
      return "4RedToBlack";
    case 3: 
      return "3Signs";
    case 4: 
      return "3Symbols";
    case 5: 
      return "3Symbols2";
    case 6: 
      return "3TrafficLights1";
    case 7: 
      return "3TrafficLights2";
    case 12: 
      return "4TrafficLights";
    case 17: 
      return "3Stars";
    case 18: 
      return "5Boxes";
    case 19: 
      return "3Triangles";
    case 20: 
      return "NoIcons";
    }
    return null;
  }
  
  static int Z(String paramString)
  {
    switch (c.a(paramString))
    {
    case 311: 
      return 0;
    case 312: 
      return 8;
    case 313: 
      return 13;
    case 314: 
      return 1;
    case 315: 
      return 9;
    case 316: 
      return 14;
    case 317: 
      return 2;
    case 318: 
      return 15;
    case 319: 
      return 10;
    case 320: 
      return 16;
    case 321: 
      return 11;
    case 322: 
      return 3;
    case 323: 
      return 4;
    case 324: 
      return 5;
    case 325: 
      return 6;
    case 326: 
      return 7;
    case 327: 
      return 12;
    case 328: 
      return 17;
    case 329: 
      return 18;
    case 330: 
      return 19;
    case 331: 
      return 20;
    }
    throw new CellsException(6, "Invalid IconSetType val");
  }
  
  static String U(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "formula";
    case 1: 
      return "max";
    case 2: 
      return "min";
    case 3: 
      return "num";
    case 4: 
      return "percent";
    case 5: 
      return "percentile";
    case 6: 
      return "autoMax";
    case 7: 
      return "autoMin";
    }
    return null;
  }
  
  static int aa(String paramString)
  {
    switch (c.a(paramString))
    {
    case 332: 
      return 1;
    case 333: 
      return 2;
    }
    return 0;
  }
  
  static String V(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return "leftToRight";
    case 2: 
      return "rightToLeft";
    }
    return null;
  }
  
  static int ab(String paramString)
  {
    switch (c.a(paramString))
    {
    case 4: 
      return 2;
    case 334: 
      return 1;
    }
    return 0;
  }
  
  static String W(int paramInt)
  {
    switch (paramInt)
    {
    case 2: 
      return "none";
    case 1: 
      return "middle";
    }
    return null;
  }
  
  static int ac(String paramString)
  {
    switch (c.a(paramString))
    {
    case 335: 
      return 0;
    case 109: 
      return 1;
    case 110: 
      return 2;
    case 336: 
      return 3;
    case 238: 
      return 4;
    case 337: 
      return 5;
    case 338: 
      return 6;
    case 339: 
      return 7;
    }
    throw new CellsException(6, "Invalid FormatConditionValueType val");
  }
  
  static String X(int paramInt)
  {
    switch (paramInt)
    {
    case 3: 
      return "last7Days";
    case 5: 
      return "lastMonth";
    case 8: 
      return "lastWeek";
    case 6: 
      return "nextMonth";
    case 9: 
      return "nextWeek";
    case 4: 
      return "thisMonth";
    case 7: 
      return "thisWeek";
    case 0: 
      return "today";
    case 2: 
      return "tomorrow";
    case 1: 
      return "yesterday";
    }
    return null;
  }
  
  static int ad(String paramString)
  {
    switch (c.a(paramString))
    {
    case 340: 
      return 3;
    case 341: 
      return 5;
    case 342: 
      return 8;
    case 343: 
      return 6;
    case 344: 
      return 9;
    case 345: 
      return 4;
    case 346: 
      return 7;
    case 347: 
      return 0;
    case 348: 
      return 2;
    case 349: 
      return 1;
    }
    throw new CellsException(6, "Invalid TimePeriod val");
  }
  
  static int Y(int paramInt)
  {
    int i = 0;
    switch (paramInt)
    {
    case 0: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 17: 
    case 19: 
      i = 3;
      break;
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
      i = 4;
      break;
    case 13: 
    case 14: 
    case 15: 
    case 16: 
    case 18: 
      i = 5;
      break;
    }
    return i;
  }
  
  static int ae(String paramString)
  {
    int i = paramString.lastIndexOf('.');
    paramString = paramString.substring(0, 0 + i);
    int j = af(paramString);
    return j;
  }
  
  static int af(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return -1;
    }
    int i = -1;
    try
    {
      int j = 0;
      StringBuilder localStringBuilder = new StringBuilder(paramString.length());
      for (int k = paramString.length() - 1; k >= 0; k--)
      {
        char c1 = paramString.charAt(k);
        if ((c1 < '0') || (c1 > '9')) {
          break;
        }
        j = 1;
        localStringBuilder.insert(0, c1);
      }
      if (j != 0) {
        i = F(zs.a(localStringBuilder));
      }
    }
    catch (Exception localException) {}
    return i;
  }
  
  static byte ag(String paramString)
  {
    switch (c.a(paramString))
    {
    case 350: 
      return 1;
    case 351: 
      return 4;
    case 352: 
      return 2;
    case 353: 
      return 8;
    }
    throw new CellsException(6, "Invalid PivotTableSourceType val");
  }
  
  static int Z(int paramInt)
  {
    switch (paramInt)
    {
    case 8: 
      return 4102;
    case 9: 
      return 4103;
    case 10: 
      return 4104;
    case 12: 
      return 4106;
    case 21: 
      return 4115;
    case 13: 
      return 4107;
    case 14: 
      return 4108;
    case 15: 
      return 4109;
    case 16: 
      return 4110;
    case 17: 
      return 4111;
    case 0: 
      return 4117;
    case 18: 
      return 4112;
    case 19: 
      return 4113;
    case 20: 
      return 4114;
    case 2: 
      return 4096;
    case 11: 
      return 4105;
    case 3: 
      return 4097;
    case 4: 
      return 4098;
    case 5: 
      return 4099;
    case 6: 
      return 4100;
    case 7: 
      return 4101;
    }
    return 4117;
  }
  
  static int aa(int paramInt)
  {
    switch (paramInt)
    {
    case 4102: 
      return 8;
    case 4103: 
      return 9;
    case 4104: 
      return 10;
    case 4106: 
      return 12;
    case 4115: 
      return 21;
    case 4107: 
      return 13;
    case 4108: 
      return 14;
    case 4109: 
      return 15;
    case 4110: 
      return 16;
    case 4111: 
      return 17;
    case 4117: 
      return 0;
    case 4112: 
      return 18;
    case 4113: 
      return 19;
    case 4114: 
      return 20;
    case 4096: 
      return 2;
    case 4105: 
      return 11;
    case 4097: 
      return 3;
    case 4098: 
      return 4;
    case 4099: 
      return 5;
    case 4100: 
      return 6;
    case 4101: 
      return 7;
    }
    return 0;
  }
  
  static String ab(int paramInt)
  {
    switch (paramInt)
    {
    case 4: 
      return "axisPage";
    case 1: 
      return "axisRow";
    case 2: 
      return "axisCol";
    case 8: 
      return "axisValues";
    }
    return null;
  }
  
  static String ac(int paramInt)
  {
    switch (paramInt)
    {
    case 8: 
      return "avg";
    case 4: 
      return "count";
    case 128: 
      return "countA";
    case 16: 
      return "max";
    case 32: 
      return "min";
    case 64: 
      return "product";
    case 256: 
      return "stdDev";
    case 512: 
      return "stdDevP";
    case 2: 
      return "sum";
    case 1024: 
      return "var";
    case 2048: 
      return "varP";
    case 1: 
      return "default";
    }
    return null;
  }
  
  static int ah(String paramString)
  {
    switch (c.a(paramString))
    {
    case 358: 
      return 8;
    case 359: 
      return 4;
    case 360: 
      return 128;
    case 109: 
      return 16;
    case 110: 
      return 32;
    case 361: 
      return 64;
    case 216: 
      return 256;
    case 362: 
      return 512;
    case 363: 
      return 2;
    case 364: 
      return 1024;
    case 365: 
      return 2048;
    case 2: 
    case 6: 
    case 366: 
    case 367: 
      return 1;
    }
    throw new CellsException(6, "Invalid PivotFieldSubtotalType val");
  }
  
  static String ad(int paramInt)
  {
    switch (paramInt)
    {
    case 2: 
      return "average";
    case 1: 
      return "count";
    case 6: 
      return "countNums";
    case 3: 
      return "max";
    case 4: 
      return "min";
    case 5: 
      return "product";
    case 7: 
      return "stdDev";
    case 8: 
      return "stdDevp";
    case 9: 
      return "var";
    case 10: 
      return "varp";
    case 11: 
      return "count";
    }
    return "sum";
  }
  
  static int ai(String paramString)
  {
    switch (c.a(paramString))
    {
    case 368: 
      return 2;
    case 359: 
      return 1;
    case 369: 
      return 6;
    case 109: 
      return 3;
    case 110: 
      return 4;
    case 361: 
      return 5;
    case 216: 
      return 7;
    case 370: 
      return 8;
    case 364: 
      return 9;
    case 371: 
      return 10;
    case 363: 
      return 0;
    }
    throw new CellsException(6, "Invalid ConsolidationFunction val");
  }
  
  static String ae(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return "difference";
    case 8: 
      return "index";
    case 0: 
      return "normal";
    case 3: 
      return "percentDiff";
    case 2: 
      return "percent";
    case 6: 
      return "percentOfCol";
    case 5: 
      return "percentOfRow";
    case 7: 
      return "percentOfTotal";
    case 4: 
      return "runTotal";
    case 9: 
      return "percentOfParentRow";
    case 10: 
      return "percentOfParentCol";
    case 11: 
      return "percentOfParent";
    case 13: 
      return "rankAscending";
    case 14: 
      return "rankDescending";
    case 12: 
      return "percentOfRunningTotal";
    }
    return "normal";
  }
  
  static int aj(String paramString)
  {
    switch (c.a(paramString))
    {
    case 372: 
      return 1;
    case 373: 
      return 8;
    case 374: 
      return 0;
    case 375: 
      return 3;
    case 238: 
      return 2;
    case 376: 
      return 6;
    case 377: 
      return 5;
    case 378: 
      return 7;
    case 379: 
      return 4;
    case 380: 
      return 9;
    case 381: 
      return 10;
    case 382: 
      return 11;
    case 383: 
      return 13;
    case 384: 
      return 14;
    case 385: 
      return 12;
    }
    throw new CellsException(6, "Invalid PivotFieldDataDisplayFormat val");
  }
  
  static String af(int paramInt)
  {
    switch (paramInt)
    {
    case 7: 
      return "Left";
    case 1: 
      return "Center";
    case 8: 
      return "Right";
    case 6: 
      return "Justify";
    case 3: 
      return "Distributed";
    case 9: 
      return "Top";
    case 0: 
      return "Bottom";
    case 2: 
    case 4: 
    case 5: 
      return null;
    }
    return null;
  }
  
  static int ak(String paramString)
  {
    switch (c.a(paramString.toLowerCase()))
    {
    case 60: 
      return 7;
    case 61: 
      return 1;
    case 62: 
      return 8;
    case 63: 
      return 6;
    case 65: 
      return 3;
    case 67: 
      return 9;
    case 68: 
      return 0;
    }
    return 5;
  }
  
  static int al(String paramString)
  {
    int i = 0;
    switch (c.a(paramString))
    {
    case 386: 
    case 387: 
      i = 0;
      break;
    case 388: 
    case 389: 
      i = 1;
      break;
    case 390: 
    case 391: 
      i = 2;
      break;
    case 392: 
    case 393: 
      i = 3;
      break;
    case 394: 
      i = 4;
      break;
    case 395: 
      i = 5;
      break;
    case 396: 
      i = 6;
      break;
    case 397: 
      i = 7;
      break;
    case 398: 
      i = 8;
      break;
    case 399: 
      i = 9;
      break;
    case 400: 
      i = 10;
      break;
    case 401: 
      i = 11;
      break;
    case 402: 
      i = 12;
      break;
    default: 
      i = 11;
    }
    return i;
  }
  
  static String ag(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "lt1";
    case 1: 
      return "dk1";
    case 2: 
      return "lt2";
    case 3: 
      return "dk2";
    case 4: 
      return "accent1";
    case 5: 
      return "accent2";
    case 6: 
      return "accent3";
    case 7: 
      return "accent4";
    case 8: 
      return "accent5";
    case 9: 
      return "accent6";
    case 10: 
      return "hlink";
    case 11: 
      return "folHlink";
    case 15: 
      return "phClr";
    }
    return "lt1";
  }
  
  static String ah(int paramInt)
  {
    String str = ag(paramInt);
    return am(str);
  }
  
  static String am(String paramString)
  {
    if ("dk1".equals(paramString)) {
      return "tx1";
    }
    if ("dk2".equals(paramString)) {
      return "tx2";
    }
    if ("lt1".equals(paramString)) {
      return "bg1";
    }
    if ("lt2".equals(paramString)) {
      return "bg2";
    }
    return paramString;
  }
  
  static String a(zcjs paramzcjs, String paramString)
  {
    if (!(paramzcjs instanceof zcjn)) {
      return null;
    }
    zcjg localzcjg = zauz.a((zcjn)paramzcjs, paramString);
    if (localzcjg != null) {
      return localzcjg.h;
    }
    return null;
  }
  
  static zcjn b(zcjs paramzcjs, String paramString)
  {
    for (zcjs localzcjs = paramzcjs.m(); localzcjs != null; localzcjs = localzcjs.n()) {
      if ((localzcjs.e == 1) && (zw.b(localzcjs.g, paramString))) {
        return (zcjn)localzcjs;
      }
    }
    return null;
  }
  
  static String a(String paramString1, String paramString2)
  {
    int i = paramString1.lastIndexOf("/");
    if (i != -1) {
      paramString1 = paramString1.substring(0, 0 + (i + 1));
    }
    return paramString1 + paramString2;
  }
  
  static String an(String paramString)
  {
    int i = paramString.lastIndexOf("/");
    if (i != -1) {
      paramString = paramString.substring(0, 0 + i);
    }
    i = paramString.lastIndexOf("/");
    if ((i != -1) && (paramString.length() > 1)) {
      paramString = paramString.substring(i + 1);
    }
    return paramString;
  }
  
  static String ao(String paramString)
  {
    int i = paramString.lastIndexOf("/");
    if (i != -1)
    {
      String str1 = paramString.substring(0, 0 + (i + 1));
      String str2 = paramString.substring(i + 1);
      return str1 + "_rels/" + str2 + ".rels";
    }
    return paramString + ".rels";
  }
  
  static byte[] a(zi paramzi, String paramString)
    throws Exception
  {
    String str = aH(paramString);
    com.aspose.cells.a.f.zh localzh = paramzi.a(str);
    if (localzh == null) {
      return null;
    }
    zm localzm = paramzi.a(localzh);
    byte[] arrayOfByte = zx.a(localzm, false);
    return arrayOfByte;
  }
  
  static boolean ap(String paramString)
  {
    if (paramString.length() == 0) {
      return false;
    }
    int i = paramString.charAt(0);
    if ((i == 32) || (i == 10) || (i == 13)) {
      return true;
    }
    i = paramString.charAt(paramString.length() - 1);
    return (i == 32) || (i == 10) || (i == 13);
  }
  
  static String ai(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "aboveAverage";
    case 1: 
      return "belowAverage";
    case 2: 
      return "lastMonth";
    case 3: 
      return "lastQuarter";
    case 4: 
      return "lastWeek";
    case 5: 
      return "lastYear";
    case 6: 
      return "M1";
    case 10: 
      return "M2";
    case 11: 
      return "M3";
    case 12: 
      return "M4";
    case 13: 
      return "M5";
    case 14: 
      return "M6";
    case 15: 
      return "M7";
    case 16: 
      return "M8";
    case 17: 
      return "M9";
    case 7: 
      return "M10";
    case 8: 
      return "M11";
    case 9: 
      return "M12";
    case 18: 
      return "nextMonth";
    case 19: 
      return "nextQuarter";
    case 20: 
      return "nextWeek";
    case 21: 
      return "nextYear";
    case 22: 
      return "null";
    case 23: 
      return "Q1";
    case 24: 
      return "Q2";
    case 25: 
      return "Q3";
    case 26: 
      return "Q4";
    case 27: 
      return "thisMonth";
    case 28: 
      return "thisQuarter";
    case 29: 
      return "thisWeek";
    case 30: 
      return "thisYear";
    case 31: 
      return "today";
    case 32: 
      return "tomorrow";
    case 33: 
      return "yearToDate";
    case 34: 
      return "yesterday";
    }
    return "null";
  }
  
  static int aq(String paramString)
  {
    switch (c.a(paramString))
    {
    case 181: 
      return 0;
    case 403: 
      return 1;
    case 341: 
      return 2;
    case 404: 
      return 3;
    case 342: 
      return 4;
    case 405: 
      return 5;
    case 406: 
      return 6;
    case 407: 
      return 10;
    case 408: 
      return 11;
    case 409: 
      return 12;
    case 410: 
      return 13;
    case 411: 
      return 14;
    case 412: 
      return 15;
    case 413: 
      return 16;
    case 414: 
      return 17;
    case 415: 
      return 7;
    case 416: 
      return 8;
    case 417: 
      return 9;
    case 343: 
      return 18;
    case 418: 
      return 19;
    case 344: 
      return 20;
    case 419: 
      return 21;
    case 420: 
      return 23;
    case 421: 
      return 24;
    case 422: 
      return 25;
    case 423: 
      return 26;
    case 345: 
      return 27;
    case 424: 
      return 28;
    case 346: 
      return 29;
    case 425: 
      return 30;
    case 347: 
      return 31;
    case 348: 
      return 32;
    case 426: 
      return 33;
    case 349: 
      return 34;
    }
    return 22;
  }
  
  static String aj(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "day";
    case 1: 
      return "hour";
    case 2: 
      return "minute";
    case 3: 
      return "month";
    case 4: 
      return "second";
    case 5: 
      return "year";
    }
    return "day";
  }
  
  static int ar(String paramString)
  {
    switch (c.a(paramString))
    {
    case 427: 
      return 0;
    case 428: 
      return 1;
    case 429: 
      return 2;
    case 430: 
      return 3;
    case 431: 
      return 4;
    case 432: 
      return 5;
    }
    return 0;
  }
  
  static int as(String paramString)
  {
    if (paramString == null) {
      return 0;
    }
    switch (c.a(paramString))
    {
    case 433: 
      return 1;
    case 434: 
      return 2;
    case 435: 
      return 3;
    case 436: 
      return 4;
    case 437: 
      return 5;
    case 438: 
      return 6;
    case 439: 
      return 7;
    case 440: 
      return 8;
    case 441: 
      return 9;
    case 215: 
      return 10;
    }
    return 0;
  }
  
  static String ak(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return "hundreds";
    case 2: 
      return "thousands";
    case 3: 
      return "tenThousands";
    case 4: 
      return "hundredThousands";
    case 5: 
      return "millions";
    case 6: 
      return "tenMillions";
    case 7: 
      return "hundredMillions";
    case 8: 
      return "billions";
    case 9: 
      return "trillions";
    case 10: 
      return "percentage";
    }
    return "";
  }
  
  static String al(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "circle";
    case 2: 
      return "shape";
    }
    return "rect";
  }
  
  static String am(int paramInt)
  {
    switch (paramInt)
    {
    case 3: 
      return "greaterThan";
    case 5: 
      return "greaterThanOrEqual";
    case 1: 
      return "lessThan";
    case 0: 
      return "lessThanOrEqual";
    case 4: 
      return "notEqual";
    }
    return null;
  }
  
  static int at(String paramString)
  {
    switch (c.a(paramString))
    {
    case 23: 
      return 3;
    case 22: 
      return 5;
    case 25: 
      return 1;
    case 24: 
      return 0;
    case 27: 
      return 4;
    case 21: 
      return 2;
    case 4: 
      return 6;
    }
    return 2;
  }
  
  static int au(String paramString)
  {
    switch (c.a(paramString))
    {
    case 236: 
      return 0;
    case 442: 
      return 2;
    }
    return 1;
  }
  
  static String an(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return "stack";
    case 0: 
      return "stretch";
    case 2: 
      return "stackScale";
    }
    return "stretch";
  }
  
  static int av(String paramString)
  {
    switch (c.a(paramString))
    {
    case 444: 
      return 1;
    case 445: 
      return 0;
    case 446: 
      return 2;
    }
    return 0;
  }
  
  static String ao(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return "x";
    case 2: 
      return "y";
    case 3: 
      return "xy";
    }
    return "none";
  }
  
  static int aw(String paramString)
  {
    switch (c.a(paramString))
    {
    case 234: 
      return 1;
    case 447: 
      return 2;
    case 448: 
      return 3;
    }
    return 0;
  }
  
  static String ap(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "b";
    case 1: 
      return "bl";
    case 2: 
      return "br";
    case 3: 
      return "ctr";
    case 4: 
      return "l";
    case 5: 
      return "r";
    case 6: 
      return "t";
    case 7: 
      return "tl";
    case 8: 
      return "tr";
    }
    return "t";
  }
  
  static int ax(String paramString)
  {
    switch (c.a(paramString))
    {
    case 98: 
      return 0;
    case 449: 
      return 1;
    case 450: 
      return 2;
    case 111: 
      return 3;
    case 99: 
      return 4;
    case 97: 
      return 5;
    case 100: 
      return 6;
    case 451: 
      return 7;
    case 101: 
      return 8;
    }
    return 6;
  }
  
  static String aq(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "auto";
    case 1: 
      return "autoNoTable";
    case 2: 
      return "manual";
    }
    return "auto";
  }
  
  static int ay(String paramString)
  {
    switch (c.a(paramString))
    {
    case 115: 
      return 0;
    case 452: 
      return 1;
    case 453: 
      return 2;
    }
    return 0;
  }
  
  static String ar(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "Single";
    case 1: 
      return "Multi";
    case 2: 
      return "Extend";
    }
    return "Single";
  }
  
  static int az(String paramString)
  {
    switch (c.a(paramString))
    {
    case 90: 
    case 459: 
      return 0;
    case 460: 
    case 461: 
      return 1;
    case 462: 
    case 463: 
      return 2;
    }
    return 0;
  }
  
  static int aA(String paramString)
  {
    switch (c.a(paramString))
    {
    case 464: 
      return 2;
    case 465: 
      return 1;
    }
    return 0;
  }
  
  static boolean b(String paramString, boolean paramBoolean)
  {
    if ((paramString == null) || ("".equals(paramString))) {
      return paramBoolean;
    }
    if (paramString.length() == 1)
    {
      switch (c.a(paramString))
      {
      case 100: 
      case 113: 
      case 466: 
        return true;
      }
      return false;
    }
    return zw.a(paramString, "true", true) == 0;
  }
  
  static boolean aB(String paramString)
  {
    if (paramString.length() == 1)
    {
      switch (c.a(paramString))
      {
      case 100: 
      case 113: 
      case 466: 
        return true;
      }
      return false;
    }
    return zw.a(paramString, "true", true) == 0;
  }
  
  static int aC(String paramString)
  {
    switch (c.a(paramString))
    {
    case 467: 
      return 1;
    case 468: 
      return 2;
    }
    return 0;
  }
  
  static String as(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return "pageBreakPreview";
    case 2: 
      return "pageLayout";
    }
    return null;
  }
  
  static int aD(String paramString)
  {
    switch (c.a(paramString))
    {
    case 469: 
      return 0;
    case 470: 
      return 1;
    case 471: 
      return 2;
    }
    return 1;
  }
  
  static String at(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "gap";
    case 1: 
      return "zero";
    case 2: 
      return "span";
    }
    return "zero";
  }
  
  static int aE(String paramString)
  {
    switch (c.a(paramString))
    {
    case 368: 
      return 1;
    case 359: 
      return 2;
    case 369: 
      return 3;
    case 12: 
      return 9;
    case 109: 
      return 4;
    case 110: 
      return 5;
    case 4: 
      return 0;
    case 216: 
      return 7;
    case 363: 
      return 6;
    case 364: 
      return 8;
    }
    return 0;
  }
  
  static String au(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return "average";
    case 2: 
      return "count";
    case 3: 
      return "countNums";
    case 9: 
      return "custom";
    case 4: 
      return "max";
    case 5: 
      return "min";
    case 0: 
      return "none";
    case 7: 
      return "stdDev";
    case 6: 
      return "sum";
    case 8: 
      return "var";
    }
    return "none";
  }
  
  static int aF(String paramString)
  {
    switch (c.a(paramString))
    {
    case 472: 
      return 3;
    case 473: 
      return 2;
    }
    return 0;
  }
  
  static String av(int paramInt)
  {
    switch (paramInt)
    {
    case 3: 
      return "queryTable";
    case 2: 
      return "xml";
    }
    return "worksheet";
  }
  
  static int aG(String paramString)
  {
    switch (c.a(paramString))
    {
    case 474: 
      return 18;
    case 475: 
      return 8;
    case 476: 
      return 3;
    case 477: 
      return 22;
    case 478: 
      return 11;
    case 479: 
      return 5;
    case 480: 
      return 25;
    case 481: 
      return 15;
    case 482: 
      return 19;
    case 483: 
      return 13;
    case 484: 
      return 9;
    case 485: 
      return 7;
    case 486: 
      return 12;
    case 487: 
      return 14;
    case 488: 
      return 1;
    case 489: 
      return 2;
    case 490: 
      return 4;
    case 491: 
      return 23;
    case 492: 
      return 6;
    case 493: 
      return 26;
    case 494: 
      return 16;
    case 495: 
      return 20;
    case 496: 
      return 24;
    case 497: 
      return 27;
    case 498: 
      return 17;
    case 499: 
      return 21;
    case 500: 
      return 10;
    case 501: 
      return 0;
    }
    throw new CellsException(6, "Error TableStyleElementType value");
  }
  
  static String aw(int paramInt)
  {
    switch (paramInt)
    {
    case 18: 
      return "blankRow";
    case 8: 
      return "firstColumn";
    case 3: 
      return "firstColumnStripe";
    case 22: 
      return "firstColumnSubheading";
    case 11: 
      return "firstHeaderCell";
    case 5: 
      return "firstRowStripe";
    case 25: 
      return "firstRowSubheading";
    case 15: 
      return "firstSubtotalColumn";
    case 19: 
      return "firstSubtotalRow";
    case 13: 
      return "firstTotalCell";
    case 9: 
      return "headerRow";
    case 7: 
      return "lastColumn";
    case 12: 
      return "lastHeaderCell";
    case 14: 
      return "lastTotalCell";
    case 1: 
      return "pageFieldLabels";
    case 2: 
      return "pageFieldValues";
    case 4: 
      return "secondColumnStripe";
    case 23: 
      return "secondColumnSubheading";
    case 6: 
      return "secondRowStripe";
    case 26: 
      return "secondRowSubheading";
    case 16: 
      return "secondSubtotalColumn";
    case 20: 
      return "secondSubtotalRow";
    case 24: 
      return "thirdColumnSubheading";
    case 27: 
      return "thirdRowSubheading";
    case 17: 
      return "thirdSubtotalColumn";
    case 21: 
      return "thirdSubtotalRow";
    case 10: 
      return "totalRow";
    case 0: 
      return "wholeTable";
    }
    throw new CellsException(6, "Error TableStyleElementType value");
  }
  
  static String aH(String paramString)
  {
    if (paramString.charAt(0) == '/') {
      return paramString.substring(1);
    }
    if (paramString.charAt(0) == '.') {
      return "xl/" + paramString.substring(3);
    }
    return "xl/" + paramString;
  }
  
  static int a(char[] paramArrayOfChar, int paramInt)
  {
    int i = 0;
    for (int j = paramInt - 1; j >= 0; j--) {
      switch (paramArrayOfChar[j])
      {
      case '/': 
      case '\\': 
        i = 1;
        break;
      default: 
        if (i != 0) {
          return j;
        }
        break;
      }
    }
    return -1;
  }
  
  static String[] a(String paramString1, String paramString2, boolean paramBoolean)
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = paramString2.toCharArray();
    int i;
    if (arrayOfChar1[0] == '/')
    {
      arrayOfString[0] = paramString2.substring(1);
      i = a(arrayOfChar1, paramString2.length() - 1);
      if (paramBoolean)
      {
        arrayOfString[2] = paramString2.substring(1, 1 + i);
        arrayOfString[1] = (arrayOfString[2] + "/_rels" + paramString2.substring(i + 1) + ".rels");
      }
    }
    else if (paramString1 != null)
    {
      i = -1;
      char[] arrayOfChar2 = null;
      for (int j = 0; (j <= arrayOfChar1.length) && (j + 1 < arrayOfChar1.length) && (arrayOfChar1[j] == '.') && (arrayOfChar1[(j + 1)] == '.'); j++)
      {
        j += 2;
        if (arrayOfChar2 == null)
        {
          arrayOfChar2 = paramString1.toCharArray();
          i = a(arrayOfChar2, arrayOfChar2.length - 1);
        }
        else
        {
          i = a(arrayOfChar2, i);
        }
      }
      String str = null;
      if (arrayOfChar2 != null) {
        str = paramString1.substring(0, 0 + (i + 2));
      } else {
        str = paramString1 + "/";
      }
      arrayOfString[0] = (str + (j == 0 ? paramString2 : paramString2.substring(j)));
      if (paramBoolean)
      {
        int k = a(arrayOfChar1, paramString2.length() - 1);
        arrayOfString[2] = (str + paramString2.substring(j, j + (k - j + 1)));
        arrayOfString[1] = (arrayOfString[2] + "/_rels" + paramString2.substring(k + 1) + ".rels");
      }
    }
    if (arrayOfString[0] == null)
    {
      arrayOfString[0] = paramString2;
      i = a(arrayOfChar1, paramString2.length() - 1);
      if (paramBoolean)
      {
        arrayOfString[2] = paramString2.substring(0, 0 + (i + 1));
        arrayOfString[1] = (arrayOfString[2] + "/_rels" + paramString2.substring(i + 1) + ".rels");
      }
    }
    return arrayOfString;
  }
  
  static int aI(String paramString)
  {
    switch (c.a(paramString))
    {
    case 502: 
      return 27;
    case 503: 
      return 26;
    case 504: 
      return 28;
    case 505: 
      return 24;
    case 506: 
      return 23;
    case 507: 
      return 25;
    case 508: 
      return 21;
    case 509: 
      return 20;
    case 510: 
      return 22;
    case 511: 
      return 36;
    case 512: 
      return 35;
    case 513: 
      return 37;
    case 514: 
      return 33;
    case 515: 
      return 32;
    case 516: 
      return 34;
    case 517: 
      return 30;
    case 518: 
      return 29;
    case 519: 
      return 31;
    case 520: 
      return 46;
    case 521: 
      return 19;
    case 522: 
      return 18;
    case 523: 
      return 1;
    case 524: 
      return 0;
    case 525: 
      return 3;
    case 526: 
      return 2;
    case 527: 
      return 17;
    case 528: 
      return 16;
    case 529: 
      return 4;
    case 530: 
      return 5;
    case 531: 
      return 6;
    case 532: 
      return 7;
    case 533: 
      return 8;
    case 534: 
      return 9;
    case 535: 
      return 11;
    case 536: 
      return 12;
    case 537: 
      return 10;
    case 538: 
      return 14;
    case 539: 
      return 15;
    case 540: 
      return 13;
    case 541: 
      return 44;
    case 542: 
      return 43;
    case 543: 
      return 45;
    case 544: 
      return 41;
    case 545: 
      return 42;
    case 546: 
      return 39;
    case 547: 
      return 38;
    case 548: 
      return 40;
    case 549: 
      return 53;
    case 550: 
      return 58;
    case 551: 
      return 61;
    case 552: 
      return 47;
    case 553: 
      return 50;
    case 554: 
      return 48;
    case 555: 
      return 49;
    case 556: 
      return 51;
    case 557: 
      return 52;
    case 558: 
      return 56;
    case 559: 
      return 57;
    case 560: 
      return 54;
    case 561: 
      return 55;
    case 562: 
      return 59;
    case 563: 
      return 60;
    }
    return 46;
  }
  
  static String ax(int paramInt)
  {
    switch (paramInt)
    {
    case 27: 
      return "legacyObliqueTopLeft";
    case 26: 
      return "legacyObliqueTop";
    case 28: 
      return "legacyObliqueTopRight";
    case 24: 
      return "legacyObliqueLeft";
    case 23: 
      return "legacyObliqueFront";
    case 25: 
      return "legacyObliqueRight";
    case 21: 
      return "legacyObliqueBottomLeft";
    case 20: 
      return "legacyObliqueBottom";
    case 22: 
      return "legacyObliqueBottomRight";
    case 36: 
      return "legacyPerspectiveTopLeft";
    case 35: 
      return "legacyPerspectiveTop";
    case 37: 
      return "legacyPerspectiveTopRight";
    case 33: 
      return "legacyPerspectiveLeft";
    case 32: 
      return "legacyPerspectiveFront";
    case 34: 
      return "legacyPerspectiveRight";
    case 30: 
      return "legacyPerspectiveBottomLeft";
    case 29: 
      return "legacyPerspectiveBottom";
    case 31: 
      return "legacyPerspectiveBottomRight";
    case 46: 
      return "orthographicFront";
    case 19: 
      return "isometricTopUp";
    case 18: 
      return "isometricTopDown";
    case 1: 
      return "isometricBottomUp";
    case 0: 
      return "isometricBottomDown";
    case 3: 
      return "isometricLeftUp";
    case 2: 
      return "isometricLeftDown";
    case 17: 
      return "isometricRightUp";
    case 16: 
      return "isometricRightDown";
    case 4: 
      return "isometricOffAxis1Left";
    case 5: 
      return "isometricOffAxis1Right";
    case 6: 
      return "isometricOffAxis1Top";
    case 7: 
      return "isometricOffAxis2Left";
    case 8: 
      return "isometricOffAxis2Right";
    case 9: 
      return "isometricOffAxis2Top";
    case 11: 
      return "isometricOffAxis3Left";
    case 12: 
      return "isometricOffAxis3Right";
    case 10: 
      return "isometricOffAxis3Bottom";
    case 14: 
      return "isometricOffAxis4Left";
    case 15: 
      return "isometricOffAxis4Right";
    case 13: 
      return "isometricOffAxis4Bottom";
    case 44: 
      return "obliqueTopLeft";
    case 43: 
      return "obliqueTop";
    case 45: 
      return "obliqueTopRight";
    case 41: 
      return "obliqueLeft";
    case 42: 
      return "obliqueRight";
    case 39: 
      return "obliqueBottomLeft";
    case 38: 
      return "obliqueBottom";
    case 40: 
      return "obliqueBottomRight";
    case 53: 
      return "perspectiveFront";
    case 58: 
      return "perspectiveLeft";
    case 61: 
      return "perspectiveRight";
    case 47: 
      return "perspectiveAbove";
    case 50: 
      return "perspectiveBelow";
    case 48: 
      return "perspectiveAboveLeftFacing";
    case 49: 
      return "perspectiveAboveRightFacing";
    case 51: 
      return "perspectiveContrastingLeftFacing";
    case 52: 
      return "perspectiveContrastingRightFacing";
    case 56: 
      return "perspectiveHeroicLeftFacing";
    case 57: 
      return "perspectiveHeroicRightFacing";
    case 54: 
      return "perspectiveHeroicExtremeLeftFacing";
    case 55: 
      return "perspectiveHeroicExtremeRightFacing";
    case 59: 
      return "perspectiveRelaxed";
    case 60: 
      return "perspectiveRelaxedModerately";
    }
    return "orthographicFront";
  }
  
  static int aJ(String paramString)
  {
    switch (c.a(paramString))
    {
    case 564: 
      return 9;
    case 565: 
      return 10;
    case 566: 
      return 11;
    case 567: 
      return 12;
    case 568: 
      return 17;
    case 569: 
      return 18;
    case 570: 
      return 19;
    case 571: 
      return 20;
    case 572: 
      return 13;
    case 573: 
      return 14;
    case 574: 
      return 15;
    case 575: 
      return 16;
    case 576: 
      return 25;
    case 577: 
      return 0;
    case 578: 
      return 22;
    case 579: 
      return 8;
    case 580: 
      return 5;
    case 581: 
      return 3;
    case 582: 
      return 21;
    case 583: 
      return 23;
    case 584: 
      return 24;
    case 585: 
      return 2;
    case 586: 
      return 6;
    case 587: 
      return 4;
    case 588: 
      return 26;
    case 589: 
      return 7;
    case 590: 
      return 1;
    }
    return 25;
  }
  
  static String ay(int paramInt)
  {
    switch (paramInt)
    {
    case 9: 
      return "legacyFlat1";
    case 10: 
      return "legacyFlat2";
    case 11: 
      return "legacyFlat3";
    case 12: 
      return "legacyFlat4";
    case 17: 
      return "legacyNormal1";
    case 18: 
      return "legacyNormal2";
    case 19: 
      return "legacyNormal3";
    case 20: 
      return "legacyNormal4";
    case 13: 
      return "legacyHarsh1";
    case 14: 
      return "legacyHarsh2";
    case 15: 
      return "legacyHarsh3";
    case 16: 
      return "legacyHarsh4";
    case 25: 
      return "threePt";
    case 0: 
      return "balanced";
    case 22: 
      return "soft";
    case 8: 
      return "harsh";
    case 5: 
      return "flood";
    case 3: 
      return "contrasting";
    case 21: 
      return "morning";
    case 23: 
      return "sunrise";
    case 24: 
      return "sunset";
    case 2: 
      return "chilly";
    case 6: 
      return "freezing";
    case 4: 
      return "flat";
    case 26: 
      return "twoPt";
    case 7: 
      return "glow";
    case 1: 
      return "brightRoom";
    }
    return "threePt";
  }
  
  static int aK(String paramString)
  {
    switch (c.a(paramString))
    {
    case 451: 
      return 6;
    case 100: 
      return 5;
    case 101: 
      return 7;
    case 99: 
      return 3;
    case 97: 
      return 4;
    case 449: 
      return 1;
    case 98: 
      return 0;
    case 450: 
      return 2;
    }
    return 5;
  }
  
  static String az(int paramInt)
  {
    switch (paramInt)
    {
    case 6: 
      return "tl";
    case 5: 
      return "t";
    case 7: 
      return "tr";
    case 3: 
      return "l";
    case 4: 
      return "r";
    case 1: 
      return "bl";
    case 0: 
      return "b";
    case 2: 
      return "br";
    }
    return "t";
  }
  
  static int aL(String paramString)
  {
    switch (c.a(paramString))
    {
    case 591: 
      return 3;
    case 592: 
      return 5;
    case 593: 
      return 4;
    case 594: 
      return 6;
    case 595: 
      return 7;
    case 596: 
      return 9;
    case 597: 
      return 8;
    case 598: 
      return 14;
    case 599: 
      return 13;
    case 600: 
      return 10;
    case 601: 
      return 1;
    case 602: 
      return 11;
    case 603: 
      return 0;
    case 587: 
      return 2;
    case 604: 
      return 12;
    }
    return 14;
  }
  
  static String aA(int paramInt)
  {
    switch (paramInt)
    {
    case 3: 
      return "legacyMatte";
    case 5: 
      return "legacyPlastic";
    case 4: 
      return "legacyMetal";
    case 6: 
      return "legacyWireframe";
    case 7: 
      return "matte";
    case 9: 
      return "plastic";
    case 8: 
      return "metal";
    case 14: 
      return "warmMatte";
    case 13: 
      return "translucentPowder";
    case 10: 
      return "powder";
    case 1: 
      return "dkEdge";
    case 11: 
      return "softEdge";
    case 0: 
      return "clear";
    case 2: 
      return "flat";
    case 12: 
      return "softmetal";
    }
    return "warmMatte";
  }
  
  static int aM(String paramString)
  {
    switch (c.a(paramString))
    {
    case 605: 
      return 9;
    case 236: 
      return 3;
    case 606: 
      return 11;
    case 102: 
      return 6;
    case 607: 
      return 1;
    case 608: 
      return 12;
    case 609: 
      return 4;
    case 610: 
      return 5;
    case 268: 
      return 7;
    case 611: 
      return 10;
    case 612: 
      return 8;
    case 613: 
      return 2;
    }
    return 3;
  }
  
  static String aB(int paramInt)
  {
    switch (paramInt)
    {
    case 9: 
      return "relaxedInset";
    case 3: 
      return "circle";
    case 11: 
      return "slope";
    case 6: 
      return "cross";
    case 1: 
      return "angle";
    case 12: 
      return "softRound";
    case 4: 
      return "convex";
    case 5: 
      return "coolSlant";
    case 7: 
      return "divot";
    case 10: 
      return "riblet";
    case 8: 
      return "hardEdge";
    case 2: 
      return "artDeco";
    }
    return "circle";
  }
  
  static Color aN(String paramString)
  {
    switch (c.a(paramString))
    {
    case 614: 
      return Color.fromArgb(240, 248, 255);
    case 615: 
      return Color.fromArgb(250, 235, 215);
    case 616: 
      return Color.fromArgb(0, 255, 255);
    case 617: 
      return Color.fromArgb(127, 255, 212);
    case 618: 
      return Color.fromArgb(240, 255, 255);
    case 619: 
      return Color.fromArgb(245, 245, 220);
    case 620: 
      return Color.fromArgb(255, 228, 196);
    case 621: 
      return Color.fromArgb(0, 0, 0);
    case 622: 
      return Color.fromArgb(255, 235, 205);
    case 623: 
      return Color.fromArgb(0, 0, 255);
    case 624: 
      return Color.fromArgb(138, 43, 226);
    case 625: 
      return Color.fromArgb(165, 42, 42);
    case 626: 
      return Color.fromArgb(222, 184, 135);
    case 627: 
      return Color.fromArgb(95, 158, 160);
    case 628: 
      return Color.fromArgb(127, 255, 0);
    case 629: 
      return Color.fromArgb(210, 105, 30);
    case 630: 
      return Color.fromArgb(255, 127, 80);
    case 631: 
      return Color.fromArgb(100, 149, 237);
    case 632: 
      return Color.fromArgb(255, 248, 220);
    case 633: 
      return Color.fromArgb(220, 20, 60);
    case 634: 
      return Color.fromArgb(0, 255, 255);
    case 635: 
      return Color.fromArgb(255, 20, 147);
    case 636: 
      return Color.fromArgb(0, 191, 255);
    case 637: 
      return Color.fromArgb(105, 105, 105);
    case 638: 
      return Color.fromArgb(0, 0, 139);
    case 639: 
      return Color.fromArgb(0, 139, 139);
    case 640: 
      return Color.fromArgb(184, 134, 11);
    case 641: 
      return Color.fromArgb(169, 169, 169);
    case 642: 
      return Color.fromArgb(0, 100, 0);
    case 643: 
      return Color.fromArgb(189, 183, 107);
    case 644: 
      return Color.fromArgb(139, 0, 139);
    case 645: 
      return Color.fromArgb(85, 107, 47);
    case 646: 
      return Color.fromArgb(255, 140, 0);
    case 647: 
      return Color.fromArgb(153, 50, 204);
    case 648: 
      return Color.fromArgb(139, 0, 0);
    case 649: 
      return Color.fromArgb(233, 150, 122);
    case 650: 
      return Color.fromArgb(143, 188, 139);
    case 651: 
      return Color.fromArgb(72, 61, 139);
    case 652: 
      return Color.fromArgb(47, 79, 79);
    case 653: 
      return Color.fromArgb(0, 206, 209);
    case 654: 
      return Color.fromArgb(148, 0, 211);
    case 655: 
      return Color.fromArgb(30, 144, 255);
    case 656: 
      return Color.fromArgb(178, 34, 34);
    case 657: 
      return Color.fromArgb(255, 250, 240);
    case 658: 
      return Color.fromArgb(34, 139, 34);
    case 659: 
      return Color.fromArgb(255, 0, 255);
    case 660: 
      return Color.fromArgb(220, 220, 220);
    case 661: 
      return Color.fromArgb(248, 248, 255);
    case 662: 
      return Color.fromArgb(255, 215, 0);
    case 663: 
      return Color.fromArgb(218, 165, 32);
    case 664: 
      return Color.fromArgb(128, 128, 128);
    case 665: 
      return Color.fromArgb(0, 128, 0);
    case 666: 
      return Color.fromArgb(173, 255, 47);
    case 667: 
      return Color.fromArgb(240, 255, 240);
    case 668: 
      return Color.fromArgb(255, 105, 180);
    case 669: 
      return Color.fromArgb(205, 92, 92);
    case 670: 
      return Color.fromArgb(75, 0, 130);
    case 671: 
      return Color.fromArgb(255, 255, 240);
    case 672: 
      return Color.fromArgb(240, 230, 140);
    case 673: 
      return Color.fromArgb(230, 230, 250);
    case 674: 
      return Color.fromArgb(255, 240, 245);
    case 675: 
      return Color.fromArgb(124, 252, 0);
    case 676: 
      return Color.fromArgb(255, 250, 205);
    case 677: 
      return Color.fromArgb(0, 255, 0);
    case 678: 
      return Color.fromArgb(50, 205, 50);
    case 679: 
      return Color.fromArgb(250, 240, 230);
    case 680: 
      return Color.fromArgb(173, 216, 230);
    case 681: 
      return Color.fromArgb(240, 128, 128);
    case 682: 
      return Color.fromArgb(224, 255, 255);
    case 683: 
      return Color.fromArgb(250, 250, 120);
    case 684: 
      return Color.fromArgb(211, 211, 211);
    case 685: 
      return Color.fromArgb(144, 238, 144);
    case 686: 
      return Color.fromArgb(255, 182, 193);
    case 687: 
      return Color.fromArgb(255, 160, 122);
    case 688: 
      return Color.fromArgb(32, 178, 170);
    case 689: 
      return Color.fromArgb(135, 206, 250);
    case 690: 
      return Color.fromArgb(119, 136, 153);
    case 691: 
      return Color.fromArgb(176, 196, 222);
    case 692: 
      return Color.fromArgb(255, 255, 224);
    case 693: 
      return Color.fromArgb(255, 0, 255);
    case 694: 
      return Color.fromArgb(128, 0, 0);
    case 695: 
      return Color.fromArgb(102, 205, 170);
    case 696: 
      return Color.fromArgb(0, 0, 205);
    case 697: 
      return Color.fromArgb(186, 85, 211);
    case 698: 
      return Color.fromArgb(147, 112, 219);
    case 699: 
      return Color.fromArgb(60, 179, 113);
    case 700: 
      return Color.fromArgb(123, 104, 238);
    case 701: 
      return Color.fromArgb(0, 250, 154);
    case 702: 
      return Color.fromArgb(72, 209, 204);
    case 703: 
      return Color.fromArgb(199, 21, 133);
    case 704: 
      return Color.fromArgb(25, 25, 112);
    case 705: 
      return Color.fromArgb(245, 255, 250);
    case 706: 
      return Color.fromArgb(255, 228, 225);
    case 707: 
      return Color.fromArgb(255, 228, 181);
    case 708: 
      return Color.fromArgb(255, 222, 173);
    case 709: 
      return Color.fromArgb(0, 0, 128);
    case 710: 
      return Color.fromArgb(253, 245, 230);
    case 711: 
      return Color.fromArgb(128, 128, 0);
    case 712: 
      return Color.fromArgb(107, 142, 35);
    case 713: 
      return Color.fromArgb(255, 165, 0);
    case 714: 
      return Color.fromArgb(255, 69, 0);
    case 715: 
      return Color.fromArgb(218, 112, 214);
    case 716: 
      return Color.fromArgb(238, 232, 170);
    case 717: 
      return Color.fromArgb(152, 251, 152);
    case 718: 
      return Color.fromArgb(175, 238, 238);
    case 719: 
      return Color.fromArgb(219, 112, 147);
    case 720: 
      return Color.fromArgb(255, 239, 213);
    case 721: 
      return Color.fromArgb(255, 218, 185);
    case 722: 
      return Color.fromArgb(205, 133, 63);
    case 723: 
      return Color.fromArgb(255, 192, 203);
    case 724: 
      return Color.fromArgb(221, 160, 221);
    case 725: 
      return Color.fromArgb(176, 224, 230);
    case 726: 
      return Color.fromArgb(128, 0, 128);
    case 727: 
      return Color.fromArgb(255, 0, 0);
    case 728: 
      return Color.fromArgb(188, 143, 143);
    case 729: 
      return Color.fromArgb(65, 105, 225);
    case 730: 
      return Color.fromArgb(139, 69, 19);
    case 731: 
      return Color.fromArgb(250, 128, 114);
    case 732: 
      return Color.fromArgb(244, 164, 96);
    case 733: 
      return Color.fromArgb(46, 139, 87);
    case 734: 
      return Color.fromArgb(255, 245, 238);
    case 735: 
      return Color.fromArgb(160, 82, 45);
    case 736: 
      return Color.fromArgb(192, 192, 192);
    case 737: 
      return Color.fromArgb(135, 206, 235);
    case 738: 
      return Color.fromArgb(106, 90, 205);
    case 739: 
      return Color.fromArgb(112, 128, 144);
    case 740: 
      return Color.fromArgb(255, 250, 250);
    case 741: 
      return Color.fromArgb(0, 255, 127);
    case 742: 
      return Color.fromArgb(70, 130, 180);
    case 743: 
      return Color.fromArgb(210, 180, 140);
    case 744: 
      return Color.fromArgb(0, 128, 128);
    case 745: 
      return Color.fromArgb(216, 191, 216);
    case 746: 
      return Color.fromArgb(255, 99, 71);
    case 747: 
      return Color.fromArgb(64, 224, 208);
    case 748: 
      return Color.fromArgb(238, 130, 238);
    case 749: 
      return Color.fromArgb(245, 222, 179);
    case 750: 
      return Color.fromArgb(255, 255, 255);
    case 751: 
      return Color.fromArgb(245, 245, 245);
    case 752: 
      return Color.fromArgb(255, 255, 0);
    case 753: 
      return Color.fromArgb(154, 205, 50);
    }
    return Color.fromArgb(0, 0, 0);
  }
  
  static String aC(int paramInt)
  {
    switch (paramInt)
    {
    case -984833: 
      return "aliceBlue";
    case -332841: 
      return "antiqueWhite";
    case -16711681: 
      return "aqua";
    case -8388652: 
      return "aquamarine";
    case -983041: 
      return "azure";
    case -657956: 
      return "beige";
    case -6972: 
      return "bisque";
    case -16777216: 
      return "black";
    case -5171: 
      return "blanchedAlmond";
    case -16776961: 
      return "blue";
    case -7722014: 
      return "blueViolet";
    case -5952982: 
      return "brown";
    case -2180985: 
      return "burlyWood";
    case -10510688: 
      return "cadetBlue";
    case -8388864: 
      return "chartreuse";
    case -2987746: 
      return "chocolate";
    case -32944: 
      return "coral";
    case -10185235: 
      return "cornflowerBlue";
    case -1828: 
      return "cornsilk";
    case -2354116: 
      return "crimson";
    case -60269: 
      return "deepPink";
    case -16728065: 
      return "deepSkyBlue";
    case -9868951: 
      return "dimGray";
    case -16777077: 
      return "dkBlue";
    case -16741493: 
      return "dkCyan";
    case -4684277: 
      return "dkGoldenrod";
    case -5658199: 
      return "dkGray";
    case -16751616: 
      return "dkGreen";
    case -4343957: 
      return "dkKhaki";
    case -7667573: 
      return "dkMagenta";
    case -11179217: 
      return "dkOliveGreen";
    case -29696: 
      return "dkOrange";
    case -6737204: 
      return "dkOrchid";
    case -7667712: 
      return "dkRed";
    case -1468806: 
      return "dkSalmon";
    case -7357301: 
      return "dkSeaGreen";
    case -12042869: 
      return "dkSlateBlue";
    case -13676721: 
      return "dkSlateGray";
    case -16724271: 
      return "dkTurquoise";
    case -7077677: 
      return "dkViolet";
    case -14774017: 
      return "dodgerBlue";
    case -5103070: 
      return "firebrick";
    case -1296: 
      return "floralWhite";
    case -14513374: 
      return "forestGreen";
    case -65281: 
      return "fuchsia";
    case -2302756: 
      return "gainsboro";
    case -460545: 
      return "ghostWhite";
    case -10496: 
      return "gold";
    case -2448096: 
      return "goldenrod";
    case -8355712: 
      return "gray";
    case -16744448: 
      return "green";
    case -5374161: 
      return "greenYellow";
    case -983056: 
      return "honeydew";
    case -38476: 
      return "hotPink";
    case -3318692: 
      return "indianRed";
    case -11861886: 
      return "indigo";
    case -16: 
      return "ivory";
    case -989556: 
      return "khaki";
    case -1644806: 
      return "lavender";
    case -3851: 
      return "lavenderBlush";
    case -8586240: 
      return "lawnGreen";
    case -1331: 
      return "lemonChiffon";
    case -16711936: 
      return "lime";
    case -13447886: 
      return "limeGreen";
    case -331546: 
      return "linen";
    case -5383962: 
      return "ltBlue";
    case -1015680: 
      return "ltCoral";
    case -2031617: 
      return "ltCyan";
    case -329096: 
      return "ltGoldenrodYellow";
    case -2894893: 
      return "ltGray";
    case -7278960: 
      return "ltGreen";
    case -18751: 
      return "ltPink";
    case -24454: 
      return "ltSalmon";
    case -14634326: 
      return "ltSeaGreen";
    case -7876870: 
      return "ltSkyBlue";
    case -8943463: 
      return "ltSlateGray";
    case -5192482: 
      return "ltSteelBlue";
    case -32: 
      return "ltYellow";
    case -8388608: 
      return "maroon";
    case -10039894: 
      return "medAquamarine";
    case -16777011: 
      return "medBlue";
    case -4565549: 
      return "medOrchid";
    case -7114533: 
      return "medPurple";
    case -12799119: 
      return "medSeaGreen";
    case -8689426: 
      return "medSlateBlue";
    case -16713062: 
      return "medSpringGreen";
    case -12004916: 
      return "medTurquoise";
    case -3730043: 
      return "medVioletRed";
    case -15132304: 
      return "midnightBlue";
    case -655366: 
      return "mintCream";
    case -6943: 
      return "mistyRose";
    case -6987: 
      return "moccasin";
    case -8531: 
      return "navajoWhite";
    case -16777088: 
      return "navy";
    case -133658: 
      return "oldLace";
    case -8355840: 
      return "olive";
    case -9728477: 
      return "oliveDrab";
    case -23296: 
      return "orange";
    case -47872: 
      return "orangeRed";
    case -2461482: 
      return "orchid";
    case -1120086: 
      return "paleGoldenrod";
    case -6751336: 
      return "paleGreen";
    case -5247250: 
      return "paleTurquoise";
    case -2396013: 
      return "paleVioletRed";
    case -4139: 
      return "papayaWhip";
    case -9543: 
      return "peachPuff";
    case -3308225: 
      return "peru";
    case -16181: 
      return "pink";
    case -2252579: 
      return "plum";
    case -5185306: 
      return "powderBlue";
    case -8388480: 
      return "purple";
    case -65536: 
      return "red";
    case -4419697: 
      return "rosyBrown";
    case -12490271: 
      return "royalBlue";
    case -7650029: 
      return "saddleBrown";
    case -360334: 
      return "salmon";
    case -744352: 
      return "sandyBrown";
    case -13726889: 
      return "seaGreen";
    case -2578: 
      return "seaShell";
    case -6270419: 
      return "sienna";
    case -4144960: 
      return "silver";
    case -7876885: 
      return "skyBlue";
    case -9807155: 
      return "slateBlue";
    case -9404272: 
      return "slateGray";
    case -1286: 
      return "snow";
    case -16711809: 
      return "springGreen";
    case -12156236: 
      return "steelBlue";
    case -2968436: 
      return "tan";
    case -16744320: 
      return "teal";
    case -2572328: 
      return "thistle";
    case -40121: 
      return "tomato";
    case -12525360: 
      return "turquoise";
    case -1146130: 
      return "violet";
    case -663885: 
      return "wheat";
    case -1: 
      return "white";
    case -657931: 
      return "whiteSmoke";
    case -256: 
      return "yellow";
    case -6632142: 
      return "yellowGreen";
    }
    return "black";
  }
  
  static int aO(String paramString)
  {
    switch (c.a(paramString))
    {
    case 754: 
      return 1;
    case 221: 
      return 2;
    }
    return 0;
  }
  
  static String aD(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return "column";
    case 2: 
      return "stacked";
    }
    return "line";
  }
  
  static int aP(String paramString)
  {
    switch (c.a(paramString))
    {
    case 755: 
      return 1;
    case 12: 
      return 2;
    }
    return 0;
  }
  
  static String aE(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return "group";
    case 2: 
      return "custom";
    }
    return "individual";
  }
  
  static String aF(int paramInt)
  {
    switch (paramInt)
    {
    case 145: 
      return "textArchDown";
    case 149: 
      return "textArchDownPour";
    case 144: 
      return "textArchUp";
    case 148: 
      return "textArchUpPour";
    case 147: 
      return "textButton";
    case 151: 
      return "textButtonPour";
    case 175: 
      return "textCanDown";
    case 174: 
      return "textCanUp";
    case 155: 
      return "textCascadeDown";
    case 154: 
      return "textCascadeUp";
    case 140: 
      return "textChevron";
    case 141: 
      return "textChevronInverted";
    case 146: 
      return "textCircle";
    case 150: 
      return "textCirclePour";
    case 153: 
      return "textCurveDown";
    case 152: 
      return "textCurveUp";
    case 161: 
      return "textDeflate";
    case 163: 
      return "textDeflateBottom";
    case 166: 
      return "textDeflateInflate";
    case 167: 
      return "textDeflateInflateDeflate";
    case 165: 
      return "textDeflateTop";
    case 171: 
      return "textFadeDown";
    case 169: 
      return "textFadeLeft";
    case 168: 
      return "textFadeRight";
    case 170: 
      return "textFadeUp";
    case 160: 
      return "textInflate";
    case 162: 
      return "textInflateBottom";
    case 164: 
      return "textInflateTop";
    case 2084: 
      return "textNoShape";
    case 136: 
      return "textPlain";
    case 142: 
      return "textRingInside";
    case 143: 
      return "textRingOutside";
    case 173: 
      return "textSlantDown";
    case 172: 
      return "textSlantUp";
    case 137: 
      return "textStop";
    case 138: 
      return "textTriangle";
    case 139: 
      return "textTriangleInverted";
    case 156: 
      return "textWave1";
    case 157: 
      return "textWave2";
    case 158: 
      return "textWave3";
    case 159: 
      return "textWave4";
    case 20: 
      return "line";
    case 2077: 
      return "lineInv";
    case 5: 
      return "triangle";
    case 6: 
      return "rtTriangle";
    case 1: 
    case 75: 
    case 202: 
      return "rect";
    case 4: 
      return "diamond";
    case 7: 
      return "parallelogram";
    case 8: 
      return "trapezoid";
    case 2078: 
      return "nonIsoscelesTrapezoid";
    case 56: 
      return "pentagon";
    case 9: 
      return "hexagon";
    case 2049: 
      return "heptagon";
    case 10: 
      return "octagon";
    case 2050: 
      return "decagon";
    case 2051: 
      return "dodecagon";
    case 187: 
      return "star4";
    case 12: 
      return "star5";
    case 2052: 
      return "star6";
    case 2053: 
      return "star7";
    case 58: 
      return "star8";
    case 2054: 
      return "star10";
    case 2055: 
      return "star12";
    case 59: 
      return "star16";
    case 92: 
      return "star24";
    case 60: 
      return "star32";
    case 2: 
      return "roundRect";
    case 2056: 
      return "round1Rect";
    case 2057: 
      return "round2SameRect";
    case 2058: 
      return "round2DiagRect";
    case 2059: 
      return "snipRoundRect";
    case 2060: 
      return "snip1Rect";
    case 2061: 
      return "snip2SameRect";
    case 2062: 
      return "snip2DiagRect";
    case 21: 
      return "plaque";
    case 3: 
      return "ellipse";
    case 2063: 
      return "teardrop";
    case 15: 
      return "homePlate";
    case 55: 
      return "chevron";
    case 2079: 
      return "pieWedge";
    case 2064: 
      return "pie";
    case 95: 
      return "blockArc";
    case 23: 
      return "donut";
    case 57: 
      return "noSmoking";
    case 13: 
      return "rightArrow";
    case 66: 
      return "leftArrow";
    case 68: 
      return "upArrow";
    case 67: 
      return "downArrow";
    case 93: 
      return "stripedRightArrow";
    case 94: 
      return "notchedRightArrow";
    case 90: 
      return "bentUpArrow";
    case 69: 
      return "leftRightArrow";
    case 70: 
      return "upDownArrow";
    case 89: 
      return "leftUpArrow";
    case 182: 
      return "leftRightUpArrow";
    case 76: 
      return "quadArrow";
    case 77: 
      return "leftArrowCallout";
    case 78: 
      return "rightArrowCallout";
    case 79: 
      return "upArrowCallout";
    case 80: 
      return "downArrowCallout";
    case 81: 
      return "leftRightArrowCallout";
    case 82: 
      return "upDownArrowCallout";
    case 83: 
      return "quadArrowCallout";
    case 91: 
      return "bentArrow";
    case 101: 
      return "uturnArrow";
    case 99: 
      return "circularArrow";
    case 2080: 
      return "leftCircularArrow";
    case 2081: 
      return "leftRightCircularArrow";
    case 102: 
      return "curvedRightArrow";
    case 103: 
      return "curvedLeftArrow";
    case 104: 
      return "curvedUpArrow";
    case 105: 
      return "curvedDownArrow";
    case 2082: 
      return "swooshArrow";
    case 16: 
      return "cube";
    case 22: 
      return "can";
    case 73: 
      return "lightningBolt";
    case 74: 
      return "heart";
    case 183: 
      return "sun";
    case 184: 
      return "moon";
    case 96: 
      return "smileyFace";
    case 71: 
      return "irregularSeal1";
    case 72: 
      return "irregularSeal2";
    case 65: 
      return "foldedCorner";
    case 84: 
      return "bevel";
    case 2112: 
      return "frame";
    case 2066: 
      return "halfFrame";
    case 2067: 
      return "corner";
    case 2068: 
      return "diagStripe";
    case 2069: 
      return "chord";
    case 19: 
      return "arc";
    case 85: 
      return "leftBracket";
    case 86: 
      return "rightBracket";
    case 87: 
      return "leftBrace";
    case 88: 
      return "rightBrace";
    case 185: 
      return "bracketPair";
    case 186: 
      return "bracePair";
    case 32: 
      return "straightConnector1";
    case 33: 
      return "bentConnector2";
    case 34: 
      return "bentConnector3";
    case 35: 
      return "bentConnector4";
    case 36: 
      return "bentConnector5";
    case 37: 
      return "curvedConnector2";
    case 38: 
      return "curvedConnector3";
    case 39: 
      return "curvedConnector4";
    case 40: 
      return "curvedConnector5";
    case 41: 
      return "callout1";
    case 42: 
      return "callout2";
    case 43: 
      return "callout3";
    case 44: 
      return "accentCallout1";
    case 45: 
      return "accentCallout2";
    case 46: 
      return "accentCallout3";
    case 47: 
      return "borderCallout1";
    case 48: 
      return "borderCallout2";
    case 49: 
      return "borderCallout3";
    case 50: 
      return "accentBorderCallout1";
    case 51: 
      return "accentBorderCallout2";
    case 52: 
      return "accentBorderCallout3";
    case 61: 
      return "wedgeRectCallout";
    case 62: 
      return "wedgeRoundRectCallout";
    case 63: 
      return "wedgeEllipseCallout";
    case 106: 
      return "cloudCallout";
    case 2070: 
      return "cloud";
    case 53: 
      return "ribbon";
    case 54: 
      return "ribbon2";
    case 107: 
      return "ellipseRibbon";
    case 108: 
      return "ellipseRibbon2";
    case 2083: 
      return "leftRightRibbon";
    case 97: 
      return "verticalScroll";
    case 98: 
      return "horizontalScroll";
    case 64: 
      return "wave";
    case 188: 
      return "doubleWave";
    case 11: 
      return "plus";
    case 109: 
      return "flowChartProcess";
    case 110: 
      return "flowChartDecision";
    case 111: 
      return "flowChartInputOutput";
    case 112: 
      return "flowChartPredefinedProcess";
    case 113: 
      return "flowChartInternalStorage";
    case 114: 
      return "flowChartDocument";
    case 115: 
      return "flowChartMultidocument";
    case 116: 
      return "flowChartTerminator";
    case 117: 
      return "flowChartPreparation";
    case 118: 
      return "flowChartManualInput";
    case 119: 
      return "flowChartManualOperation";
    case 120: 
      return "flowChartConnector";
    case 121: 
      return "flowChartPunchedCard";
    case 122: 
      return "flowChartPunchedTape";
    case 123: 
      return "flowChartSummingJunction";
    case 124: 
      return "flowChartOr";
    case 125: 
      return "flowChartCollate";
    case 126: 
      return "flowChartSort";
    case 127: 
      return "flowChartExtract";
    case 128: 
      return "flowChartMerge";
    case 129: 
      return "flowChartOfflineStorage";
    case 130: 
      return "flowChartOnlineStorage";
    case 131: 
      return "flowChartMagneticTape";
    case 132: 
      return "flowChartMagneticDisk";
    case 133: 
      return "flowChartMagneticDrum";
    case 134: 
      return "flowChartDisplay";
    case 135: 
      return "flowChartDelay";
    case 176: 
      return "flowChartAlternateProcess";
    case 177: 
      return "flowChartOffpageConnector";
    case 189: 
      return "actionButtonBlank";
    case 190: 
      return "actionButtonHome";
    case 191: 
      return "actionButtonHelp";
    case 192: 
      return "actionButtonInformation";
    case 193: 
      return "actionButtonForwardNext";
    case 194: 
      return "actionButtonBackPrevious";
    case 195: 
      return "actionButtonEnd";
    case 196: 
      return "actionButtonBeginning";
    case 197: 
      return "actionButtonReturn";
    case 198: 
      return "actionButtonDocument";
    case 199: 
      return "actionButtonSound";
    case 200: 
      return "actionButtonMovie";
    case 2097: 
      return "gear6";
    case 2098: 
      return "gear9";
    case 2099: 
      return "funnel";
    case 2071: 
      return "mathPlus";
    case 2072: 
      return "mathMinus";
    case 2073: 
      return "mathMultiply";
    case 2074: 
      return "mathDivide";
    case 2075: 
      return "mathEqual";
    case 2076: 
      return "mathNotEqual";
    case 2100: 
      return "cornerTabs";
    case 2101: 
      return "squareTabs";
    case 2102: 
      return "plaqueTabs";
    case 2103: 
      return "chartX";
    case 2104: 
      return "chartStar";
    case 2105: 
      return "chartPlus";
    }
    return "rect";
  }
  
  static int aQ(String paramString)
  {
    switch (c.a(paramString))
    {
    case 757: 
      return 145;
    case 758: 
      return 149;
    case 759: 
      return 144;
    case 760: 
      return 148;
    case 761: 
      return 147;
    case 762: 
      return 151;
    case 763: 
      return 175;
    case 764: 
      return 174;
    case 765: 
      return 155;
    case 766: 
      return 154;
    case 767: 
      return 140;
    case 768: 
      return 141;
    case 769: 
      return 146;
    case 770: 
      return 150;
    case 771: 
      return 153;
    case 772: 
      return 152;
    case 773: 
      return 161;
    case 774: 
      return 163;
    case 775: 
      return 166;
    case 776: 
      return 167;
    case 777: 
      return 165;
    case 778: 
      return 171;
    case 779: 
      return 169;
    case 780: 
      return 168;
    case 781: 
      return 170;
    case 782: 
      return 160;
    case 783: 
      return 162;
    case 784: 
      return 164;
    case 785: 
      return 2084;
    case 786: 
      return 136;
    case 787: 
      return 142;
    case 788: 
      return 143;
    case 789: 
      return 173;
    case 790: 
      return 172;
    case 791: 
      return 137;
    case 792: 
      return 138;
    case 793: 
      return 139;
    case 794: 
      return 156;
    case 795: 
      return 157;
    case 796: 
      return 158;
    case 797: 
      return 159;
    case 259: 
      return 20;
    case 798: 
      return 2077;
    case 233: 
      return 5;
    case 799: 
      return 6;
    case 443: 
      return 1;
    case 232: 
      return 4;
    case 800: 
      return 7;
    case 801: 
      return 8;
    case 802: 
      return 2078;
    case 803: 
      return 56;
    case 804: 
      return 9;
    case 805: 
      return 2049;
    case 806: 
      return 10;
    case 807: 
      return 2050;
    case 808: 
      return 2051;
    case 809: 
      return 187;
    case 810: 
      return 12;
    case 811: 
      return 2052;
    case 812: 
      return 2053;
    case 813: 
      return 58;
    case 814: 
      return 2054;
    case 815: 
      return 2055;
    case 816: 
      return 59;
    case 817: 
      return 92;
    case 818: 
      return 60;
    case 819: 
      return 2;
    case 820: 
      return 2056;
    case 821: 
      return 2057;
    case 822: 
      return 2058;
    case 823: 
      return 2059;
    case 824: 
      return 2060;
    case 825: 
      return 2061;
    case 826: 
      return 2062;
    case 827: 
      return 21;
    case 828: 
      return 3;
    case 829: 
      return 2063;
    case 830: 
      return 15;
    case 831: 
      return 55;
    case 832: 
      return 2079;
    case 833: 
      return 2064;
    case 834: 
      return 95;
    case 835: 
      return 23;
    case 836: 
      return 57;
    case 837: 
      return 13;
    case 838: 
      return 66;
    case 839: 
      return 68;
    case 840: 
      return 67;
    case 841: 
      return 93;
    case 842: 
      return 94;
    case 843: 
      return 90;
    case 844: 
      return 69;
    case 845: 
      return 70;
    case 846: 
      return 89;
    case 847: 
      return 182;
    case 848: 
      return 76;
    case 849: 
      return 77;
    case 850: 
      return 78;
    case 851: 
      return 79;
    case 852: 
      return 80;
    case 853: 
      return 81;
    case 854: 
      return 82;
    case 855: 
      return 83;
    case 856: 
      return 91;
    case 857: 
      return 101;
    case 858: 
      return 99;
    case 859: 
      return 2080;
    case 860: 
      return 2081;
    case 861: 
      return 102;
    case 862: 
      return 103;
    case 863: 
      return 104;
    case 864: 
      return 105;
    case 865: 
      return 2082;
    case 866: 
      return 16;
    case 867: 
      return 22;
    case 868: 
      return 73;
    case 869: 
      return 74;
    case 870: 
      return 183;
    case 871: 
      return 184;
    case 872: 
      return 96;
    case 873: 
      return 71;
    case 874: 
      return 72;
    case 875: 
      return 65;
    case 876: 
      return 84;
    case 877: 
      return 2112;
    case 878: 
      return 2066;
    case 879: 
      return 2067;
    case 880: 
      return 2068;
    case 881: 
      return 2069;
    case 882: 
      return 19;
    case 883: 
      return 85;
    case 884: 
      return 86;
    case 885: 
      return 87;
    case 886: 
      return 88;
    case 887: 
      return 185;
    case 888: 
      return 186;
    case 889: 
      return 32;
    case 890: 
      return 33;
    case 891: 
      return 34;
    case 892: 
      return 35;
    case 893: 
      return 36;
    case 894: 
      return 37;
    case 895: 
      return 38;
    case 896: 
      return 39;
    case 897: 
      return 40;
    case 898: 
      return 41;
    case 899: 
      return 42;
    case 900: 
      return 43;
    case 901: 
      return 44;
    case 902: 
      return 45;
    case 903: 
      return 46;
    case 904: 
      return 47;
    case 905: 
      return 48;
    case 906: 
      return 49;
    case 907: 
      return 50;
    case 908: 
      return 51;
    case 909: 
      return 52;
    case 910: 
      return 61;
    case 911: 
      return 62;
    case 912: 
      return 63;
    case 913: 
      return 106;
    case 914: 
      return 2070;
    case 915: 
      return 53;
    case 916: 
      return 54;
    case 917: 
      return 107;
    case 918: 
      return 108;
    case 919: 
      return 2083;
    case 920: 
      return 97;
    case 921: 
      return 98;
    case 305: 
      return 64;
    case 922: 
      return 188;
    case 213: 
      return 11;
    case 923: 
      return 109;
    case 924: 
      return 110;
    case 925: 
      return 111;
    case 926: 
      return 112;
    case 927: 
      return 113;
    case 928: 
      return 114;
    case 929: 
      return 115;
    case 930: 
      return 116;
    case 931: 
      return 117;
    case 932: 
      return 118;
    case 933: 
      return 119;
    case 934: 
      return 120;
    case 935: 
      return 121;
    case 936: 
      return 122;
    case 937: 
      return 123;
    case 938: 
      return 124;
    case 939: 
      return 125;
    case 940: 
      return 126;
    case 941: 
      return 127;
    case 942: 
      return 128;
    case 943: 
      return 129;
    case 944: 
      return 130;
    case 945: 
      return 131;
    case 946: 
      return 132;
    case 947: 
      return 133;
    case 948: 
      return 134;
    case 949: 
      return 135;
    case 950: 
      return 176;
    case 951: 
      return 177;
    case 952: 
      return 189;
    case 953: 
      return 190;
    case 954: 
      return 191;
    case 955: 
      return 192;
    case 956: 
      return 193;
    case 957: 
      return 194;
    case 958: 
      return 195;
    case 959: 
      return 196;
    case 960: 
      return 197;
    case 961: 
      return 198;
    case 962: 
      return 199;
    case 963: 
      return 200;
    case 964: 
      return 2097;
    case 965: 
      return 2098;
    case 966: 
      return 2099;
    case 967: 
      return 2071;
    case 968: 
      return 2072;
    case 969: 
      return 2073;
    case 970: 
      return 2074;
    case 971: 
      return 2075;
    case 972: 
      return 2076;
    case 973: 
      return 2100;
    case 974: 
      return 2101;
    case 975: 
      return 2102;
    case 976: 
      return 2103;
    case 977: 
      return 2104;
    case 978: 
      return 2105;
    }
    return 4095;
  }
  
  static int aR(String paramString)
  {
    switch (c.a(paramString))
    {
    case 259: 
      return 1;
    case 798: 
      return 2;
    case 233: 
      return 3;
    case 799: 
      return 4;
    case 443: 
      return 5;
    case 232: 
      return 6;
    case 800: 
      return 7;
    case 801: 
      return 8;
    case 802: 
      return 9;
    case 803: 
      return 10;
    case 804: 
      return 11;
    case 805: 
      return 12;
    case 806: 
      return 13;
    case 807: 
      return 14;
    case 808: 
      return 15;
    case 809: 
      return 16;
    case 810: 
      return 17;
    case 811: 
      return 18;
    case 812: 
      return 19;
    case 813: 
      return 20;
    case 814: 
      return 21;
    case 815: 
      return 22;
    case 816: 
      return 23;
    case 817: 
      return 24;
    case 818: 
      return 25;
    case 819: 
      return 26;
    case 820: 
      return 27;
    case 821: 
      return 28;
    case 822: 
      return 29;
    case 823: 
      return 30;
    case 824: 
      return 31;
    case 825: 
      return 32;
    case 826: 
      return 33;
    case 827: 
      return 34;
    case 828: 
      return 35;
    case 829: 
      return 36;
    case 830: 
      return 37;
    case 831: 
      return 38;
    case 832: 
      return 39;
    case 833: 
      return 40;
    case 834: 
      return 41;
    case 835: 
      return 42;
    case 836: 
      return 43;
    case 837: 
      return 44;
    case 838: 
      return 45;
    case 839: 
      return 46;
    case 840: 
      return 47;
    case 841: 
      return 48;
    case 842: 
      return 49;
    case 843: 
      return 50;
    case 844: 
      return 51;
    case 845: 
      return 52;
    case 846: 
      return 53;
    case 847: 
      return 54;
    case 848: 
      return 55;
    case 849: 
      return 56;
    case 850: 
      return 57;
    case 851: 
      return 58;
    case 852: 
      return 59;
    case 853: 
      return 60;
    case 854: 
      return 61;
    case 855: 
      return 62;
    case 856: 
      return 63;
    case 857: 
      return 64;
    case 858: 
      return 65;
    case 859: 
      return 66;
    case 860: 
      return 67;
    case 861: 
      return 68;
    case 862: 
      return 69;
    case 863: 
      return 70;
    case 864: 
      return 71;
    case 865: 
      return 72;
    case 866: 
      return 73;
    case 867: 
      return 74;
    case 868: 
      return 75;
    case 869: 
      return 76;
    case 870: 
      return 77;
    case 871: 
      return 78;
    case 872: 
      return 79;
    case 873: 
      return 80;
    case 874: 
      return 81;
    case 875: 
      return 82;
    case 876: 
      return 83;
    case 877: 
      return 84;
    case 878: 
      return 85;
    case 879: 
      return 86;
    case 880: 
      return 87;
    case 881: 
      return 88;
    case 882: 
      return 89;
    case 883: 
      return 90;
    case 884: 
      return 91;
    case 885: 
      return 92;
    case 886: 
      return 93;
    case 887: 
      return 94;
    case 888: 
      return 95;
    case 889: 
      return 96;
    case 890: 
      return 97;
    case 891: 
      return 98;
    case 892: 
      return 99;
    case 893: 
      return 100;
    case 894: 
      return 101;
    case 895: 
      return 102;
    case 896: 
      return 103;
    case 897: 
      return 104;
    case 898: 
      return 105;
    case 899: 
      return 106;
    case 900: 
      return 107;
    case 901: 
      return 108;
    case 902: 
      return 109;
    case 903: 
      return 110;
    case 904: 
      return 111;
    case 905: 
      return 112;
    case 906: 
      return 113;
    case 907: 
      return 114;
    case 908: 
      return 115;
    case 909: 
      return 116;
    case 910: 
      return 117;
    case 911: 
      return 118;
    case 912: 
      return 119;
    case 913: 
      return 120;
    case 914: 
      return 121;
    case 915: 
      return 122;
    case 916: 
      return 123;
    case 917: 
      return 124;
    case 918: 
      return 125;
    case 919: 
      return 126;
    case 920: 
      return 127;
    case 921: 
      return 128;
    case 305: 
      return 129;
    case 922: 
      return 130;
    case 213: 
      return 131;
    case 923: 
      return 132;
    case 924: 
      return 133;
    case 925: 
      return 134;
    case 926: 
      return 135;
    case 927: 
      return 136;
    case 928: 
      return 137;
    case 929: 
      return 138;
    case 930: 
      return 139;
    case 931: 
      return 140;
    case 932: 
      return 141;
    case 933: 
      return 142;
    case 934: 
      return 143;
    case 935: 
      return 144;
    case 936: 
      return 145;
    case 937: 
      return 146;
    case 938: 
      return 147;
    case 939: 
      return 148;
    case 940: 
      return 149;
    case 941: 
      return 150;
    case 942: 
      return 151;
    case 943: 
      return 152;
    case 944: 
      return 153;
    case 945: 
      return 154;
    case 946: 
      return 155;
    case 947: 
      return 156;
    case 948: 
      return 157;
    case 949: 
      return 158;
    case 950: 
      return 159;
    case 951: 
      return 160;
    case 952: 
      return 161;
    case 953: 
      return 162;
    case 954: 
      return 163;
    case 955: 
      return 164;
    case 956: 
      return 165;
    case 957: 
      return 166;
    case 958: 
      return 167;
    case 959: 
      return 168;
    case 960: 
      return 169;
    case 961: 
      return 170;
    case 962: 
      return 171;
    case 963: 
      return 172;
    case 964: 
      return 173;
    case 965: 
      return 174;
    case 966: 
      return 175;
    case 967: 
      return 176;
    case 968: 
      return 177;
    case 969: 
      return 178;
    case 970: 
      return 179;
    case 971: 
      return 180;
    case 972: 
      return 181;
    case 973: 
      return 182;
    case 974: 
      return 183;
    case 975: 
      return 184;
    case 976: 
      return 185;
    case 977: 
      return 186;
    case 978: 
      return 187;
    }
    return 188;
  }
  
  static String aG(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return "line";
    case 2: 
      return "lineInv";
    case 3: 
      return "triangle";
    case 4: 
      return "rtTriangle";
    case 5: 
      return "rect";
    case 6: 
      return "diamond";
    case 7: 
      return "parallelogram";
    case 8: 
      return "trapezoid";
    case 9: 
      return "nonIsoscelesTrapezoid";
    case 10: 
      return "pentagon";
    case 11: 
      return "hexagon";
    case 12: 
      return "heptagon";
    case 13: 
      return "octagon";
    case 14: 
      return "decagon";
    case 15: 
      return "dodecagon";
    case 16: 
      return "star4";
    case 17: 
      return "star5";
    case 18: 
      return "star6";
    case 19: 
      return "star7";
    case 20: 
      return "star8";
    case 21: 
      return "star10";
    case 22: 
      return "star12";
    case 23: 
      return "star16";
    case 24: 
      return "star24";
    case 25: 
      return "star32";
    case 26: 
      return "roundRect";
    case 27: 
      return "round1Rect";
    case 28: 
      return "round2SameRect";
    case 29: 
      return "round2DiagRect";
    case 30: 
      return "snipRoundRect";
    case 31: 
      return "snip1Rect";
    case 32: 
      return "snip2SameRect";
    case 33: 
      return "snip2DiagRect";
    case 34: 
      return "plaque";
    case 35: 
      return "ellipse";
    case 36: 
      return "teardrop";
    case 37: 
      return "homePlate";
    case 38: 
      return "chevron";
    case 39: 
      return "pieWedge";
    case 40: 
      return "pie";
    case 41: 
      return "blockArc";
    case 42: 
      return "donut";
    case 43: 
      return "noSmoking";
    case 44: 
      return "rightArrow";
    case 45: 
      return "leftArrow";
    case 46: 
      return "upArrow";
    case 47: 
      return "downArrow";
    case 48: 
      return "stripedRightArrow";
    case 49: 
      return "notchedRightArrow";
    case 50: 
      return "bentUpArrow";
    case 51: 
      return "leftRightArrow";
    case 52: 
      return "upDownArrow";
    case 53: 
      return "leftUpArrow";
    case 54: 
      return "leftRightUpArrow";
    case 55: 
      return "quadArrow";
    case 56: 
      return "leftArrowCallout";
    case 57: 
      return "rightArrowCallout";
    case 58: 
      return "upArrowCallout";
    case 59: 
      return "downArrowCallout";
    case 60: 
      return "leftRightArrowCallout";
    case 61: 
      return "upDownArrowCallout";
    case 62: 
      return "quadArrowCallout";
    case 63: 
      return "bentArrow";
    case 64: 
      return "uturnArrow";
    case 65: 
      return "circularArrow";
    case 66: 
      return "leftCircularArrow";
    case 67: 
      return "leftRightCircularArrow";
    case 68: 
      return "curvedRightArrow";
    case 69: 
      return "curvedLeftArrow";
    case 70: 
      return "curvedUpArrow";
    case 71: 
      return "curvedDownArrow";
    case 72: 
      return "swooshArrow";
    case 73: 
      return "cube";
    case 74: 
      return "can";
    case 75: 
      return "lightningBolt";
    case 76: 
      return "heart";
    case 77: 
      return "sun";
    case 78: 
      return "moon";
    case 79: 
      return "smileyFace";
    case 80: 
      return "irregularSeal1";
    case 81: 
      return "irregularSeal2";
    case 82: 
      return "foldedCorner";
    case 83: 
      return "bevel";
    case 84: 
      return "frame";
    case 85: 
      return "halfFrame";
    case 86: 
      return "corner";
    case 87: 
      return "diagStripe";
    case 88: 
      return "chord";
    case 89: 
      return "arc";
    case 90: 
      return "leftBracket";
    case 91: 
      return "rightBracket";
    case 92: 
      return "leftBrace";
    case 93: 
      return "rightBrace";
    case 94: 
      return "bracketPair";
    case 95: 
      return "bracePair";
    case 96: 
      return "straightConnector1";
    case 97: 
      return "bentConnector2";
    case 98: 
      return "bentConnector3";
    case 99: 
      return "bentConnector4";
    case 100: 
      return "bentConnector5";
    case 101: 
      return "curvedConnector2";
    case 102: 
      return "curvedConnector3";
    case 103: 
      return "curvedConnector4";
    case 104: 
      return "curvedConnector5";
    case 105: 
      return "callout1";
    case 106: 
      return "callout2";
    case 107: 
      return "callout3";
    case 108: 
      return "accentCallout1";
    case 109: 
      return "accentCallout2";
    case 110: 
      return "accentCallout3";
    case 111: 
      return "borderCallout1";
    case 112: 
      return "borderCallout2";
    case 113: 
      return "borderCallout3";
    case 114: 
      return "accentBorderCallout1";
    case 115: 
      return "accentBorderCallout2";
    case 116: 
      return "accentBorderCallout3";
    case 117: 
      return "wedgeRectCallout";
    case 118: 
      return "wedgeRoundRectCallout";
    case 119: 
      return "wedgeEllipseCallout";
    case 120: 
      return "cloudCallout";
    case 121: 
      return "cloud";
    case 122: 
      return "ribbon";
    case 123: 
      return "ribbon2";
    case 124: 
      return "ellipseRibbon";
    case 125: 
      return "ellipseRibbon2";
    case 126: 
      return "leftRightRibbon";
    case 127: 
      return "verticalScroll";
    case 128: 
      return "horizontalScroll";
    case 129: 
      return "wave";
    case 130: 
      return "doubleWave";
    case 131: 
      return "plus";
    case 132: 
      return "flowChartProcess";
    case 133: 
      return "flowChartDecision";
    case 134: 
      return "flowChartInputOutput";
    case 135: 
      return "flowChartPredefinedProcess";
    case 136: 
      return "flowChartInternalStorage";
    case 137: 
      return "flowChartDocument";
    case 138: 
      return "flowChartMultidocument";
    case 139: 
      return "flowChartTerminator";
    case 140: 
      return "flowChartPreparation";
    case 141: 
      return "flowChartManualInput";
    case 142: 
      return "flowChartManualOperation";
    case 143: 
      return "flowChartConnector";
    case 144: 
      return "flowChartPunchedCard";
    case 145: 
      return "flowChartPunchedTape";
    case 146: 
      return "flowChartSummingJunction";
    case 147: 
      return "flowChartOr";
    case 148: 
      return "flowChartCollate";
    case 149: 
      return "flowChartSort";
    case 150: 
      return "flowChartExtract";
    case 151: 
      return "flowChartMerge";
    case 152: 
      return "flowChartOfflineStorage";
    case 153: 
      return "flowChartOnlineStorage";
    case 154: 
      return "flowChartMagneticTape";
    case 155: 
      return "flowChartMagneticDisk";
    case 156: 
      return "flowChartMagneticDrum";
    case 157: 
      return "flowChartDisplay";
    case 158: 
      return "flowChartDelay";
    case 159: 
      return "flowChartAlternateProcess";
    case 160: 
      return "flowChartOffpageConnector";
    case 161: 
      return "actionButtonBlank";
    case 162: 
      return "actionButtonHome";
    case 163: 
      return "actionButtonHelp";
    case 164: 
      return "actionButtonInformation";
    case 165: 
      return "actionButtonForwardNext";
    case 166: 
      return "actionButtonBackPrevious";
    case 167: 
      return "actionButtonEnd";
    case 168: 
      return "actionButtonBeginning";
    case 169: 
      return "actionButtonReturn";
    case 170: 
      return "actionButtonDocument";
    case 171: 
      return "actionButtonSound";
    case 172: 
      return "actionButtonMovie";
    case 173: 
      return "gear6";
    case 174: 
      return "gear9";
    case 175: 
      return "funnel";
    case 176: 
      return "mathPlus";
    case 177: 
      return "mathMinus";
    case 178: 
      return "mathMultiply";
    case 179: 
      return "mathDivide";
    case 180: 
      return "mathEqual";
    case 181: 
      return "mathNotEqual";
    case 182: 
      return "cornerTabs";
    case 183: 
      return "squareTabs";
    case 184: 
      return "plaqueTabs";
    case 185: 
      return "chartX";
    case 186: 
      return "chartStar";
    case 187: 
      return "chartPlus";
    }
    return null;
  }
  
  static int aH(int paramInt)
  {
    switch (paramInt)
    {
    case 19: 
      return 89;
    case 91: 
      return 63;
    case 33: 
      return 97;
    case 35: 
      return 99;
    case 36: 
      return 100;
    case 90: 
      return 50;
    case 84: 
      return 83;
    case 95: 
      return 41;
    case 22: 
      return 74;
    case 55: 
      return 38;
    case 99: 
      return 65;
    case 106: 
      return 120;
    case 11: 
      return 131;
    case 16: 
      return 73;
    case 38: 
      return 102;
    case 37: 
      return 101;
    case 39: 
      return 103;
    case 40: 
      return 104;
    case 105: 
      return 71;
    case 107: 
      return 124;
    case 103: 
      return 69;
    case 102: 
      return 68;
    case 104: 
      return 70;
    case 108: 
      return 125;
    case 4: 
      return 6;
    case 23: 
      return 42;
    case 186: 
      return 95;
    case 185: 
      return 94;
    case 188: 
      return 130;
    case 67: 
      return 47;
    case 80: 
      return 59;
    case 53: 
      return 122;
    case 34: 
      return 98;
    case 71: 
      return 80;
    case 72: 
      return 81;
    case 176: 
      return 159;
    case 121: 
      return 144;
    case 125: 
      return 148;
    case 120: 
      return 143;
    case 111: 
      return 134;
    case 110: 
      return 133;
    case 135: 
      return 158;
    case 133: 
      return 156;
    case 134: 
      return 157;
    case 114: 
      return 137;
    case 127: 
      return 150;
    case 113: 
      return 136;
    case 132: 
      return 155;
    case 118: 
      return 141;
    case 119: 
      return 142;
    case 128: 
      return 151;
    case 115: 
      return 138;
    case 177: 
      return 160;
    case 124: 
      return 147;
    case 112: 
      return 135;
    case 117: 
      return 140;
    case 109: 
      return 132;
    case 122: 
      return 145;
    case 131: 
      return 154;
    case 126: 
      return 149;
    case 130: 
      return 153;
    case 123: 
      return 146;
    case 116: 
      return 139;
    case 65: 
      return 82;
    case 74: 
      return 76;
    case 9: 
      return 11;
    case 15: 
      return 37;
    case 98: 
      return 128;
    case 5: 
      return 3;
    case 66: 
      return 45;
    case 77: 
      return 56;
    case 87: 
      return 92;
    case 85: 
      return 90;
    case 69: 
      return 51;
    case 81: 
      return 60;
    case 182: 
      return 54;
    case 89: 
      return 53;
    case 73: 
      return 75;
    case 20: 
      return 1;
    case 178: 
      return 105;
    case 41: 
      return 105;
    case 42: 
      return 106;
    case 43: 
      return 107;
    case 179: 
      return 105;
    case 44: 
      return 108;
    case 45: 
      return 109;
    case 46: 
      return 110;
    case 180: 
      return 111;
    case 47: 
      return 111;
    case 48: 
      return 112;
    case 49: 
      return 113;
    case 181: 
      return 111;
    case 50: 
      return 114;
    case 51: 
      return 115;
    case 52: 
      return 116;
    case 184: 
      return 78;
    case 57: 
      return 43;
    case 94: 
      return 49;
    case 10: 
      return 13;
    case 3: 
      return 35;
    case 63: 
      return 119;
    case 7: 
      return 7;
    case 21: 
      return 34;
    case 76: 
      return 55;
    case 83: 
      return 62;
    case 1: 
      return 5;
    case 61: 
      return 117;
    case 56: 
      return 10;
    case 13: 
      return 44;
    case 78: 
      return 57;
    case 88: 
      return 93;
    case 86: 
      return 91;
    case 6: 
      return 4;
    case 2: 
      return 26;
    case 62: 
      return 118;
    case 96: 
      return 79;
    case 59: 
      return 23;
    case 92: 
      return 24;
    case 60: 
      return 25;
    case 187: 
      return 16;
    case 12: 
      return 17;
    case 58: 
      return 20;
    case 32: 
      return 96;
    case 93: 
      return 48;
    case 183: 
      return 77;
    case 8: 
      return 8;
    case 68: 
      return 46;
    case 79: 
      return 58;
    case 70: 
      return 52;
    case 82: 
      return 61;
    case 54: 
      return 123;
    case 101: 
      return 64;
    case 97: 
      return 127;
    case 64: 
      return 129;
    case 2049: 
      return 12;
    case 2050: 
      return 14;
    case 2051: 
      return 15;
    case 2052: 
      return 18;
    case 2053: 
      return 19;
    case 2054: 
      return 21;
    case 2055: 
      return 22;
    case 2056: 
      return 27;
    case 2057: 
      return 28;
    case 2058: 
      return 29;
    case 2059: 
      return 30;
    case 2060: 
      return 31;
    case 2061: 
      return 32;
    case 2062: 
      return 33;
    case 2063: 
      return 36;
    case 2064: 
      return 40;
    case 2112: 
      return 84;
    case 2066: 
      return 85;
    case 2067: 
      return 86;
    case 2068: 
      return 87;
    case 2069: 
      return 88;
    case 2070: 
      return 121;
    case 2071: 
      return 176;
    case 2072: 
      return 177;
    case 2073: 
      return 178;
    case 2074: 
      return 179;
    case 2075: 
      return 180;
    case 2076: 
      return 181;
    }
    return 188;
  }
  
  static int aI(int paramInt)
  {
    switch (paramInt)
    {
    case 89: 
      return 19;
    case 63: 
      return 91;
    case 50: 
      return 90;
    case 83: 
      return 84;
    case 41: 
      return 95;
    case 74: 
      return 22;
    case 38: 
      return 55;
    case 65: 
      return 99;
    case 120: 
      return 106;
    case 131: 
      return 11;
    case 73: 
      return 16;
    case 102: 
      return 38;
    case 101: 
      return 37;
    case 103: 
      return 39;
    case 104: 
      return 40;
    case 71: 
      return 105;
    case 124: 
      return 107;
    case 69: 
      return 103;
    case 68: 
      return 102;
    case 70: 
      return 104;
    case 125: 
      return 108;
    case 6: 
      return 4;
    case 42: 
      return 23;
    case 95: 
      return 186;
    case 94: 
      return 185;
    case 130: 
      return 188;
    case 47: 
      return 67;
    case 59: 
      return 80;
    case 122: 
      return 53;
    case 97: 
      return 33;
    case 98: 
      return 34;
    case 99: 
      return 35;
    case 100: 
      return 36;
    case 80: 
      return 71;
    case 81: 
      return 72;
    case 159: 
      return 176;
    case 144: 
      return 121;
    case 148: 
      return 125;
    case 143: 
      return 120;
    case 134: 
      return 111;
    case 133: 
      return 110;
    case 158: 
      return 135;
    case 156: 
      return 133;
    case 157: 
      return 134;
    case 137: 
      return 114;
    case 150: 
      return 127;
    case 136: 
      return 113;
    case 155: 
      return 132;
    case 141: 
      return 118;
    case 142: 
      return 119;
    case 151: 
      return 128;
    case 138: 
      return 115;
    case 160: 
      return 177;
    case 147: 
      return 124;
    case 135: 
      return 112;
    case 140: 
      return 117;
    case 132: 
      return 109;
    case 145: 
      return 122;
    case 154: 
      return 131;
    case 149: 
      return 126;
    case 153: 
      return 130;
    case 146: 
      return 123;
    case 139: 
      return 116;
    case 82: 
      return 65;
    case 76: 
      return 74;
    case 11: 
      return 9;
    case 37: 
      return 15;
    case 128: 
      return 98;
    case 3: 
      return 5;
    case 45: 
      return 66;
    case 56: 
      return 77;
    case 92: 
      return 87;
    case 90: 
      return 85;
    case 51: 
      return 69;
    case 60: 
      return 81;
    case 54: 
      return 182;
    case 53: 
      return 89;
    case 75: 
      return 73;
    case 1: 
      return 20;
    case 105: 
      return 178;
    case 106: 
      return 42;
    case 107: 
      return 43;
    case 108: 
      return 44;
    case 109: 
      return 45;
    case 110: 
      return 46;
    case 111: 
      return 180;
    case 112: 
      return 48;
    case 113: 
      return 49;
    case 114: 
      return 50;
    case 115: 
      return 51;
    case 116: 
      return 52;
    case 78: 
      return 184;
    case 43: 
      return 57;
    case 49: 
      return 94;
    case 13: 
      return 10;
    case 35: 
      return 3;
    case 119: 
      return 63;
    case 7: 
      return 7;
    case 34: 
      return 21;
    case 55: 
      return 76;
    case 62: 
      return 83;
    case 5: 
      return 1;
    case 117: 
      return 61;
    case 10: 
      return 56;
    case 44: 
      return 13;
    case 57: 
      return 78;
    case 93: 
      return 88;
    case 91: 
      return 86;
    case 4: 
      return 6;
    case 26: 
      return 2;
    case 118: 
      return 62;
    case 79: 
      return 96;
    case 23: 
      return 59;
    case 24: 
      return 92;
    case 25: 
      return 60;
    case 16: 
      return 187;
    case 17: 
      return 12;
    case 20: 
      return 58;
    case 96: 
      return 32;
    case 48: 
      return 93;
    case 77: 
      return 183;
    case 8: 
      return 8;
    case 46: 
      return 68;
    case 58: 
      return 79;
    case 52: 
      return 70;
    case 61: 
      return 82;
    case 123: 
      return 54;
    case 64: 
      return 101;
    case 127: 
      return 97;
    case 129: 
      return 64;
    case 12: 
      return 2049;
    case 14: 
      return 2050;
    case 15: 
      return 2051;
    case 18: 
      return 2052;
    case 19: 
      return 2053;
    case 21: 
      return 2054;
    case 22: 
      return 2055;
    case 27: 
      return 2056;
    case 28: 
      return 2057;
    case 29: 
      return 2058;
    case 30: 
      return 2059;
    case 31: 
      return 2060;
    case 32: 
      return 2061;
    case 33: 
      return 2062;
    case 36: 
      return 2063;
    case 40: 
      return 2064;
    case 84: 
      return 2112;
    case 85: 
      return 2066;
    case 86: 
      return 2067;
    case 87: 
      return 2068;
    case 88: 
      return 2069;
    case 121: 
      return 2070;
    case 176: 
      return 2071;
    case 177: 
      return 2072;
    case 178: 
      return 2073;
    case 179: 
      return 2074;
    case 180: 
      return 2075;
    case 181: 
      return 2076;
    }
    return 4095;
  }
  
  static String aJ(int paramInt)
  {
    switch (paramInt)
    {
    case 152: 
      return "textCurveUp";
    case 153: 
      return "textCurveDown";
    case 175: 
      return "textCanDown";
    case 174: 
      return "textCanUp";
    case 156: 
      return "textWave1";
    case 157: 
      return "textWave2";
    case 158: 
      return "textDoubleWave1";
    case 159: 
      return "textWave4";
    case 145: 
      return "textArchDownCurve";
    case 149: 
      return "textArchDownPour";
    case 144: 
      return "textArchUp";
    case 148: 
      return "textArchUpPour";
    case 146: 
      return "textCircleCurve";
    case 150: 
      return "textCirclePour";
    case 147: 
      return "textButtonCurve";
    case 151: 
      return "textButtonPour";
    case 169: 
      return "textFadeLeft";
    case 168: 
      return "textFadeRight";
    case 171: 
      return "textFadeDown";
    case 170: 
      return "textFadeUp";
    case 136: 
      return "textPlain";
    case 137: 
      return "textStop";
    case 142: 
      return "textRingInside";
    case 143: 
      return "textRingOutside";
    case 138: 
      return "textTriangle";
    case 139: 
      return "textTriangleInverted";
    case 140: 
      return "textChevron";
    case 141: 
      return "textChevronInverted";
    case 173: 
      return "textSlantDown";
    case 172: 
      return "textSlantUp";
    case 155: 
      return "textCascadeDown";
    case 154: 
      return "textCascadeUp";
    case 160: 
      return "textInflate";
    case 162: 
      return "textInflateBottom";
    case 164: 
      return "textInflateTop";
    case 161: 
      return "textDeflate";
    case 163: 
      return "textDeflateBottom";
    case 167: 
      return "textDeflateInflateDeflate";
    case 165: 
      return "textDeflateTop";
    }
    return "";
  }
  
  static boolean aK(int paramInt)
  {
    switch (paramInt)
    {
    case 136: 
    case 137: 
    case 138: 
    case 139: 
    case 140: 
    case 141: 
    case 142: 
    case 143: 
    case 144: 
    case 145: 
    case 146: 
    case 147: 
    case 148: 
    case 149: 
    case 150: 
    case 151: 
    case 152: 
    case 153: 
    case 154: 
    case 155: 
    case 156: 
    case 157: 
    case 158: 
    case 159: 
    case 160: 
    case 161: 
    case 162: 
    case 163: 
    case 164: 
    case 165: 
    case 167: 
    case 168: 
    case 169: 
    case 170: 
    case 171: 
    case 172: 
    case 173: 
    case 174: 
    case 175: 
      return true;
    }
    return false;
  }
  
  static String aL(int paramInt)
  {
    switch (paramInt)
    {
    case 4: 
      return "days";
    case 3: 
      return "hours";
    case 2: 
      return "minutes";
    case 5: 
      return "months";
    case 6: 
      return "quarters";
    case 0: 
      return "range";
    case 1: 
      return "seconds";
    case 7: 
      return "years";
    }
    return "";
  }
  
  static int aS(String paramString)
  {
    switch (c.a(paramString))
    {
    case 204: 
      return 4;
    case 989: 
      return 3;
    case 990: 
      return 2;
    case 202: 
      return 5;
    case 991: 
      return 6;
    case 992: 
      return 0;
    case 993: 
      return 1;
    case 203: 
      return 7;
    }
    return 0;
  }
  
  static String aM(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "data";
    case 1: 
      return "default";
    case 5: 
      return "avg";
    case 4: 
      return "count";
    case 3: 
      return "countA";
    case 13: 
      return "grand";
    case 6: 
      return "max";
    case 7: 
      return "min";
    case 8: 
      return "product";
    case 9: 
      return "stdDev";
    case 10: 
      return "stdDevP";
    case 2: 
      return "sum";
    case 11: 
      return "var";
    case 12: 
      return "varP";
    case 14: 
      return "blank";
    }
    return "";
  }
  
  static int aT(String paramString)
  {
    switch (c.a(paramString))
    {
    case 367: 
      return 0;
    case 2: 
      return 1;
    case 358: 
      return 5;
    case 359: 
      return 4;
    case 360: 
      return 3;
    case 366: 
      return 13;
    case 109: 
      return 6;
    case 110: 
      return 7;
    case 361: 
      return 8;
    case 216: 
      return 9;
    case 362: 
      return 10;
    case 363: 
      return 2;
    case 364: 
      return 11;
    case 365: 
      return 12;
    case 6: 
      return 14;
    }
    return 1;
  }
  
  static String aN(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "clip";
    case 1: 
      return "ellipsis";
    }
    return "overflow";
  }
  
  static int aU(String paramString)
  {
    switch (c.a(paramString))
    {
    case 994: 
      return 0;
    case 995: 
      return 1;
    }
    return 2;
  }
  
  static int aV(String paramString)
  {
    switch (c.a(paramString))
    {
    case 455: 
      return 0;
    case 997: 
      return 1;
    case 998: 
      return 2;
    case 454: 
      return 3;
    case 456: 
      return 4;
    case 458: 
      return 5;
    case 457: 
      return 6;
    }
    return 1;
  }
  
  static String aO(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "eaVert";
    case 1: 
      return "horz";
    case 2: 
      return "mongolianVert";
    case 3: 
      return "vert";
    case 4: 
      return "vert270";
    case 5: 
      return "wordArtVert";
    case 6: 
      return "wordArtVertRtl";
    }
    return "horz";
  }
  
  static String aP(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "0";
    case 1: 
      return "1";
    case 2: 
      return "2";
    case 3: 
      return "3";
    case 4: 
      return "4";
    }
    return "1";
  }
  
  static int aW(String paramString)
  {
    switch (c.a(paramString))
    {
    case 112: 
      return 0;
    case 113: 
      return 1;
    case 114: 
      return 2;
    case 999: 
      return 3;
    case 1000: 
      return 4;
    }
    return 1;
  }
  
  static com.aspose.cells.b.a.zh aX(String paramString)
  {
    return new com.aspose.cells.b.a.zh(paramString.substring(1, 1 + (paramString.length() - 2)));
  }
  
  static String a(byte[] paramArrayOfByte)
  {
    com.aspose.cells.b.a.zh localzh = new com.aspose.cells.b.a.zh(paramArrayOfByte);
    return "{" + zs.a(localzh) + "}";
  }
  
  static String b(String paramString1, String paramString2)
  {
    if ((paramString2.charAt(0) == '/') || (paramString2.charAt(0) == '\\')) {
      return paramString2;
    }
    switch (paramString2.charAt(0))
    {
    case '/': 
    case '\\': 
      return paramString2;
    case '.': 
      int i = 0;
      int j = 0;
      j = 0;
      while ((j < paramString2.length()) && (j + 3 < paramString2.length()) && (paramString2.charAt(j) == '.') && (paramString2.charAt(j + 1) == '.') && ((paramString2.charAt(j + 2) == '/') || (paramString2.charAt(j + 2) == '\\')))
      {
        j += 3;
        i++;
      }
      for (int k = paramString1.length() - 1; k >= 0; k--) {
        if ((paramString1.charAt(k) == '/') || (paramString1.charAt(k) == '\\'))
        {
          i--;
          if (i < 0) {
            return paramString1.substring(0, 0 + (k + 1)) + paramString2.substring(j);
          }
        }
      }
      break;
    default: 
      return paramString1 + paramString2;
    }
    return paramString2;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zauj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */