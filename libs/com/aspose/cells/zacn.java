package com.aspose.cells;

import com.aspose.cells.b.c.a.za;
import java.util.HashMap;

class zacn
{
  int a;
  String b;
  byte c;
  byte d;
  int[] e;
  int f;
  static int[] g = { 64 };
  static int[] h = { 32 };
  static int[] i = { 96 };
  static int[] j = { 96, 64 };
  static int[] k = { 96, 96, 64 };
  static int[] l = { 32, 64 };
  static int[] m = { 32, 64, 32 };
  static int[] n = { 64, 32 };
  static int[] o = { 64, 64, 64, 32 };
  static int[] p = { 64, 32, 64 };
  static int[] q = { 64, 32, 32, 64 };
  static int[] r = { 64, 96 };
  static int[] s = { 32, 32, 64 };
  static int[] t = { 32, 32, 32, 64 };
  private static zacn[] u;
  private static HashMap v = new HashMap();
  private static final za w = new za(new String[] { "CUBEVALUE", "CUBESETCOUNT", "CUBESET", "CUBERANKEDMEMBER", "CUBEMEMBERPROPERTY", "CUBEMEMBER", "CUBEKPIMEMBER", "_xlfn.CUBEVALUE", "_xlfn.CUBESETCOUNT", "_xlfn.CUBESET", "_xlfn.CUBERANKEDMEMBER", "_xlfn.CUBEMEMBERPROPERTY", "_xlfn.CUBEMEMBER", "_xlfn.CUBEKPIMEMBER", "OFFSET", "SUM", " ", ",", ":", "EDATE", "EOMONTH", "NETWORKDAYS", "WEEKNUM", "ISOWEEKNUM", "FORMULATEXT", "WORKDAY", "YEARFRAC", "EUROCONVERT", "FACTDOUBLE", "GCD", "LCM", "MULTINOMIAL", "QUOTIENT", "RANDBETWEEN", "MROUND", "SQRTPI", "SERIESSUM", "ISEVEN", "ISODD", "ACCRINT", "ACCRINTM", "AMORDEGRC", "AMORLINC", "COUPDAYBS", "COUPDAYS", "COUPDAYSNC", "COUPNCD", "COUPNUM", "COUPPCD", "CUMIPMT", "CUMPRINC", "DISC", "DOLLARDE", "DOLLARFR", "DURATION", "EFFECT", "FVSCHEDULE", "INTRATE", "MDURATION", "NOMINAL", "ODDFPRICE", "ODDFYIELD", "ODDLPRICE", "ODDLYIELD", "PRICE", "PRICEDISC", "PRICEMAT", "RECEIVED", "TBILLEQ", "TBILLPRICE", "TBILLYIELD", "XIRR", "XNPV", "YIELD", "YIELDDISC", "YIELDMAT", "BESSELI", "BESSELJ", "BESSELK", "BESSELY", "BIN2DEC", "BIN2HEX", "BIN2OCT", "COMPLEX", "CONVERT", "DEC2BIN", "DEC2HEX", "DEC2OCT", "DELTA", "ERF", "ERFC", "GESTEP", "HEX2BIN", "HEX2DEC", "HEX2OCT", "IMABS", "IMAGINARY", "IMARGUMENT", "IMCONJUGATE", "IMCOS", "IMDIV", "IMEXP", "IMLN", "IMLOG10", "IMLOG2", "IMPOWER", "IMPRODUCT", "IMREAL", "IMSIN", "IMSQRT", "IMSUB", "IMSUM", "OCT2BIN", "OCT2DEC", "OCT2HEX", "IF", "LOOKUP" });
  
  zacn(int paramInt1, String paramString, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
  {
    this.a = paramInt1;
    this.b = paramString;
    this.c = ((byte)paramInt2);
    this.d = ((byte)paramInt3);
    this.e = paramArrayOfInt;
    this.f = paramInt4;
  }
  
  static void a(String paramString, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3)
  {
    if (u == null) {
      a();
    }
    if (v.get(paramString.toUpperCase()) == null) {
      v.put(paramString.toUpperCase(), new zacn(255, paramString, paramInt1, paramInt2, paramArrayOfInt, paramInt3));
    }
  }
  
  static void a()
  {
    synchronized (v)
    {
      if (u != null) {
        return;
      }
      u = new zacn[] { new zacn(0, "COUNT", 0, 255, h, 64), new zacn(1, "IF", 2, 3, n, 32), new zacn(2, "ISNA", 1, 1, g, 64), new zacn(3, "ISERROR", 1, 1, g, 64), new zacn(4, "SUM", 0, 255, h, 64), new zacn(5, "AVERAGE", 1, 255, h, 64), new zacn(6, "MIN", 1, 255, h, 64), new zacn(7, "MAX", 1, 255, h, 64), new zacn(8, "ROW", 0, 1, g, 64), new zacn(9, "COLUMN", 0, 1, g, 64), new zacn(10, "NA", 0, 0, g, 64), new zacn(11, "NPV", 2, 255, n, 64), new zacn(12, "STDEV", 1, 255, h, 64), new zacn(13, "DOLLAR", 1, 2, g, 64), new zacn(14, "FIXED", 2, 3, g, 64), new zacn(15, "SIN", 1, 1, g, 64), new zacn(16, "COS", 1, 1, g, 64), new zacn(17, "TAN", 1, 1, g, 64), new zacn(18, "ARCTAN", 1, 1, g, 64), new zacn(19, "PI", 0, 0, g, 64), new zacn(20, "SQRT", 1, 1, g, 64), new zacn(21, "EXP", 1, 1, g, 64), new zacn(22, "LN", 1, 1, g, 64), new zacn(23, "LOG10", 1, 1, g, 64), new zacn(24, "ABS", 1, 1, g, 64), new zacn(25, "INT", 1, 1, g, 64), new zacn(26, "SIGN", 1, 1, g, 64), new zacn(27, "ROUND", 2, 2, g, 64), new zacn(28, "LOOKUP", 2, 3, n, 64), new zacn(29, "INDEX", 2, 4, l, 32), new zacn(30, "REPT", 2, 2, g, 64), new zacn(31, "MID", 3, 3, g, 64), new zacn(32, "LEN", 1, 1, g, 64), new zacn(33, "VALUE", 1, 1, g, 64), new zacn(34, "TRUE", 0, 0, g, 64), new zacn(35, "FALSE", 0, 0, g, 64), new zacn(36, "AND", 1, 255, h, 64), new zacn(37, "OR", 1, 255, h, 64), new zacn(38, "NOT", 1, 1, g, 64), new zacn(39, "MOD", 2, 2, g, 64), new zacn(40, "DCOUNT", 3, 3, h, 64), new zacn(41, "DSUM", 3, 3, h, 64), new zacn(42, "DAVERAGE", 3, 3, h, 64), new zacn(43, "DMIN", 3, 3, h, 64), new zacn(44, "DMAX", 3, 3, h, 64), new zacn(45, "DSTDEV", 3, 3, h, 64), new zacn(46, "VAR", 1, 255, h, 64), new zacn(47, "DVAR", 3, 3, h, 64), new zacn(48, "TEXT", 2, 2, g, 64), new zacn(49, "LINEST", 1, 4, s, 96), new zacn(50, "TREND", 1, 3, t, 96), new zacn(51, "LOGEST", 1, 4, s, 96), new zacn(52, "GROWTH", 1, 4, t, 96), new zacn(56, "PV", 3, 5, g, 64), new zacn(57, "FV", 3, 5, g, 64), new zacn(58, "NPER", 3, 5, g, 64), new zacn(59, "PMT", 3, 5, g, 64), new zacn(60, "RATE", 3, 6, g, 64), new zacn(61, "MIRR", 3, 3, l, 64), new zacn(62, "IRR", 1, 2, l, 64), new zacn(63, "RAND", 0, 0, g, 64), new zacn(64, "MATCH", 2, 3, n, 64), new zacn(65, "DATE", 3, 3, g, 64), new zacn(66, "TIME", 3, 3, g, 64), new zacn(67, "DAY", 1, 1, g, 64), new zacn(68, "MONTH", 1, 1, g, 64), new zacn(69, "YEAR", 1, 1, g, 64), new zacn(70, "WEEKDAY", 1, 2, g, 64), new zacn(71, "HOUR", 1, 1, g, 64), new zacn(72, "MINUTE", 1, 1, g, 64), new zacn(73, "SECOND", 1, 1, g, 64), new zacn(74, "NOW", 0, 0, g, 64), new zacn(75, "AREAS", 1, 1, h, 64), new zacn(76, "ROWS", 1, 1, h, 64), new zacn(77, "COLUMNS", 1, 1, h, 64), new zacn(78, "OFFSET", 3, 5, l, 32), new zacn(82, "SEARCH", 2, 3, g, 32), new zacn(83, "TRANSPOSE", 1, 1, i, 96), new zacn(86, "TYPE", 1, 1, g, 64), new zacn(97, "ATAN2", 2, 2, g, 64), new zacn(98, "ASIN", 1, 1, g, 64), new zacn(99, "ACOS", 1, 1, g, 64), new zacn(100, "CHOOSE", 2, 255, n, 32), new zacn(101, "HLOOKUP", 3, 4, q, 64), new zacn(102, "VLOOKUP", 3, 4, q, 64), new zacn(105, "ISREF", 1, 1, h, 64), new zacn(109, "LOG", 1, 2, g, 64), new zacn(111, "CHAR", 1, 1, g, 64), new zacn(112, "LOWER", 1, 1, g, 64), new zacn(113, "UPPER", 1, 1, g, 64), new zacn(114, "PROPER", 1, 1, g, 64), new zacn(115, "LEFT", 1, 2, g, 64), new zacn(116, "RIGHT", 1, 2, g, 64), new zacn(117, "EXACT", 2, 2, g, 64), new zacn(118, "TRIM", 1, 1, g, 64), new zacn(119, "REPLACE", 4, 4, g, 64), new zacn(120, "SUBSTITUTE", 3, 4, g, 64), new zacn(121, "CODE", 1, 1, g, 64), new zacn(124, "FIND", 2, 3, g, 64), new zacn(125, "CELL", 1, 2, n, 64), new zacn(126, "ISERR", 1, 1, g, 64), new zacn(127, "ISTEXT", 1, 1, g, 64), new zacn(128, "ISNUMBER", 1, 1, g, 64), new zacn(129, "ISBLANK", 1, 1, g, 64), new zacn(130, "T", 1, 1, h, 64), new zacn(131, "N", 1, 1, h, 64), new zacn(140, "DATEVALUE", 1, 1, g, 64), new zacn(141, "TIMEVALUE", 1, 1, g, 64), new zacn(142, "SLN", 3, 3, g, 64), new zacn(143, "SYD", 4, 4, g, 64), new zacn(144, "DDB", 4, 5, g, 64), new zacn(148, "INDIRECT", 1, 2, g, 32), new zacn(162, "CLEAN", 1, 1, g, 64), new zacn(163, "MDETERM", 1, 1, i, 64), new zacn(164, "MINVERSE", 1, 1, i, 96), new zacn(165, "MMULT", 2, 2, i, 96), new zacn(167, "IPMT", 4, 6, g, 64), new zacn(168, "PPMT", 4, 6, g, 64), new zacn(169, "COUNTA", 0, 255, h, 64), new zacn(170, "CANCEL.KEY", 1, 2, n, 64), new zacn(171, "FOR", 3, 4, g, 64), new zacn(172, "WHILE", 1, 1, g, 64), new zacn(173, "BREAK", 0, 0, g, 64), new zacn(174, "NEXT", 0, 0, g, 64), new zacn(175, "INITIATE", 2, 2, g, 64), new zacn(176, "REQUEST", 2, 2, g, 64), new zacn(177, "POKE", 1, 2, g, 64), new zacn(178, "EXECUTE", 2, 2, g, 64), new zacn(179, "TERMINATE", 1, 1, g, 64), new zacn(180, "RESTART", 0, 1, g, 64), new zacn(181, "HELP", 0, 1, g, 64), new zacn(182, "GET.BAR", 4, 4, g, 64), new zacn(183, "PRODUCT", 0, 255, h, 64), new zacn(184, "FACT", 1, 1, g, 64), new zacn(185, "GET.CELL", 1, 2, n, 64), new zacn(186, "GET.WORKSPACE", 1, 1, g, 64), new zacn(187, "GET.WINDOW", 1, 2, g, 64), new zacn(188, "GET.DOCUMENT", 1, 2, g, 64), new zacn(189, "DPRODUCT", 3, 3, h, 64), new zacn(190, "ISNONTEXT", 1, 1, g, 64), new zacn(193, "STDEVP", 1, 255, h, 64), new zacn(194, "VARP", 1, 255, h, 64), new zacn(195, "DSTDEVP", 3, 3, h, 64), new zacn(196, "DVARP", 3, 3, h, 64), new zacn(197, "TRUNC", 1, 2, g, 64), new zacn(198, "ISLOGICAL", 1, 1, g, 64), new zacn(199, "DCOUNTA", 3, 3, h, 64), new zacn(204, "USDOLLAR", 1, 2, g, 64), new zacn(205, "FINDB", 2, 3, g, 64), new zacn(206, "SEARCHB", 2, 3, g, 64), new zacn(207, "REPLACEB", 4, 4, g, 64), new zacn(208, "LEFTB", 1, 2, g, 64), new zacn(209, "RIGHTB", 1, 2, g, 64), new zacn(210, "MIDB", 3, 3, g, 64), new zacn(211, "LENB", 1, 1, g, 64), new zacn(212, "ROUNDUP", 2, 2, g, 64), new zacn(213, "ROUNDDOWN", 2, 2, g, 64), new zacn(214, "ASC", 1, 1, g, 64), new zacn(215, "DBSC", 1, 1, g, 64), new zacn(216, "RANK", 2, 3, p, 64), new zacn(219, "ADDRESS", 2, 5, g, 64), new zacn(220, "DAYS360", 2, 3, g, 64), new zacn(221, "TODAY", 0, 0, g, 64), new zacn(222, "VDB", 5, 7, g, 64), new zacn(227, "MEDIAN", 1, 255, h, 64), new zacn(228, "SUMPRODUCT", 1, 255, i, 64), new zacn(229, "SINH", 1, 1, g, 64), new zacn(230, "COSH", 1, 1, g, 64), new zacn(231, "TANH", 1, 1, g, 64), new zacn(232, "ASINH", 1, 1, g, 64), new zacn(233, "ACOSH", 1, 1, g, 64), new zacn(234, "ATANH", 1, 1, g, 64), new zacn(235, "DGET", 3, 3, h, 64), new zacn(236, "CREATE.OBJECT", 1, 255, n, 64), new zacn(237, "VOLATILE", 0, 1, g, 64), new zacn(238, "LAST.ERROR", 0, 0, g, 64), new zacn(239, "CUSTOM.UNDO", 0, 2, g, 64), new zacn(240, "CUSTOM.REPEAT", 0, 3, g, 64), new zacn(241, "FORMULA.CONVERT", 2, 5, g, 64), new zacn(242, "GET.LINK.INFO", 2, 4, g, 64), new zacn(243, "TEXT.BOX", 1, 4, g, 64), new zacn(244, "INFO", 1, 1, g, 64), new zacn(245, "GROUP", 0, 0, g, 64), new zacn(246, "GET.OBJECT", 1, 5, g, 64), new zacn(247, "DB", 4, 5, g, 64), new zacn(248, "PAUSE", 0, 1, g, 64), new zacn(251, "RESUME", 0, 1, g, 64), new zacn(252, "FREQUENCY", 2, 2, h, 96), new zacn(253, "ADD.TOOLBAR", 0, 2, g, 64), new zacn(254, "DELETE.TOOLBAR", 1, 1, h, 96), new zacn(256, "RESET.TOOLBAR", 1, 1, g, 64), new zacn(257, "EVALUATE", 1, 1, g, 64), new zacn(258, "GET.TOOLBAR", 1, 2, g, 64), new zacn(259, "GET.TOOL", 1, 3, g, 64), new zacn(260, "SPELLING.CHECK", 1, 3, g, 64), new zacn(261, "ERROR.TYPE", 1, 1, g, 64), new zacn(262, "APP.TITLE", 0, 1, g, 64), new zacn(263, "WINDOW.TITLE", 0, 1, g, 64), new zacn(264, "SAVE.TOOLBAR", 1, 2, g, 64), new zacn(265, "ENABLE.TOOL", 3, 3, g, 64), new zacn(266, "PRESS.TOOL", 3, 3, g, 64), new zacn(267, "REGISTER.ID", 2, 3, g, 64), new zacn(268, "GET.WORKBOOK", 1, 2, g, 64), new zacn(269, "AVEDEV", 1, 255, h, 64), new zacn(270, "BETADIST", 3, 5, g, 64), new zacn(271, "GAMMALN", 1, 1, g, 64), new zacn(272, "BETAINV", 3, 5, g, 64), new zacn(273, "BINOMDIST", 4, 4, g, 64), new zacn(274, "CHIDIST", 2, 2, g, 64), new zacn(275, "CHIINV", 2, 2, g, 64), new zacn(276, "COMBIN", 2, 2, g, 64), new zacn(277, "CONFIDENCE", 3, 3, g, 64), new zacn(278, "CRITBINOM", 3, 3, g, 64), new zacn(279, "EVEN", 1, 1, g, 64), new zacn(280, "EXPONDIST", 3, 3, g, 64), new zacn(281, "FDIST", 3, 3, g, 64), new zacn(282, "FINV", 3, 3, g, 64), new zacn(283, "FISHER", 1, 1, g, 64), new zacn(284, "FISHERINV", 1, 1, g, 64), new zacn(285, "FLOOR", 2, 2, g, 64), new zacn(286, "GAMMADIST", 4, 4, g, 64), new zacn(287, "GAMMAINV", 3, 3, g, 64), new zacn(288, "CEILING", 2, 2, g, 64), new zacn(289, "HYPGEOMDIST", 4, 4, g, 64), new zacn(290, "LOGNORMDIST", 3, 3, g, 64), new zacn(291, "LOGINV", 3, 3, g, 64), new zacn(292, "NEGBINOMDIST", 3, 3, g, 64), new zacn(293, "NORMDIST", 4, 4, g, 64), new zacn(294, "NORMSDIST", 1, 1, g, 64), new zacn(295, "NORMINV", 3, 3, g, 64), new zacn(296, "MNORMSINV", 1, 1, g, 64), new zacn(297, "STANDARDIZE", 3, 3, g, 64), new zacn(298, "ODD", 1, 1, g, 64), new zacn(299, "PERMUT", 2, 2, g, 64), new zacn(300, "POISSON", 3, 3, g, 64), new zacn(301, "TDIST", 3, 3, g, 64), new zacn(302, "WEIBULL", 4, 4, g, 64), new zacn(303, "SUMXMY2", 2, 2, i, 64), new zacn(304, "SUMX2MY2", 2, 2, i, 64), new zacn(305, "SUMX2PY2", 2, 2, i, 64), new zacn(306, "CHITEST", 2, 2, i, 64), new zacn(307, "CORREL", 2, 2, i, 64), new zacn(308, "COVAR", 2, 2, i, 64), new zacn(309, "FORECAST", 3, 3, r, 64), new zacn(310, "FTEST", 2, 2, i, 64), new zacn(311, "INTERCEPT", 2, 2, i, 64), new zacn(312, "PEARSON", 2, 2, i, 64), new zacn(313, "RSQ", 2, 2, i, 64), new zacn(314, "STEYX", 2, 2, i, 64), new zacn(315, "SLOPE", 2, 2, i, 64), new zacn(316, "TTEST", 4, 4, k, 64), new zacn(317, "PROB", 3, 4, k, 64), new zacn(318, "DEVSQ", 1, 255, h, 64), new zacn(319, "GEOMEAN", 1, 255, h, 64), new zacn(320, "HARMEAN", 1, 255, h, 64), new zacn(321, "SUMSQ", 0, 255, h, 64), new zacn(322, "KURT", 1, 255, h, 64), new zacn(323, "SKEW", 1, 255, h, 64), new zacn(324, "ZTEST", 2, 3, l, 64), new zacn(325, "LARGE", 2, 2, l, 64), new zacn(326, "SMALL", 2, 2, l, 64), new zacn(327, "QUARTILE", 2, 2, l, 64), new zacn(328, "PERCENTILE", 2, 2, l, 64), new zacn(329, "PERCENTRANK", 2, 2, l, 64), new zacn(330, "MODE", 1, 255, i, 64), new zacn(331, "TRIMMEAN", 2, 2, l, 64), new zacn(332, "TINV", 2, 2, g, 64), new zacn(336, "CONCATENATE", 0, 255, g, 64), new zacn(337, "POWER", 2, 2, g, 64), new zacn(342, "RADIANS", 1, 1, g, 64), new zacn(343, "DEGREES", 1, 1, g, 64), new zacn(344, "SUBTOTAL", 2, 255, n, 64), new zacn(345, "SUMIF", 2, 3, m, 64), new zacn(346, "COUNTIF", 2, 2, m, 64), new zacn(347, "COUNTBLANK", 1, 1, h, 64), new zacn(350, "ISPMT", 4, 4, g, 64), new zacn(351, "DATEDIF", 3, 3, g, 64), new zacn(352, "DATESTRING", 1, 1, g, 64), new zacn(353, "NUMBERSTRING", 2, 2, g, 64), new zacn(354, "ROMAN", 1, 2, g, 64), new zacn(358, "GETPIVOTDATA", 2, 255, g, 64), new zacn(359, "HYPERLINK", 1, 2, g, 64), new zacn(360, "PHONETIC", 1, 1, h, 64), new zacn(361, "AVERAGEA", 1, 255, h, 64), new zacn(362, "MAXA", 1, 255, h, 64), new zacn(363, "MINA", 1, 255, h, 64), new zacn(364, "STDEVPA", 1, 255, h, 64), new zacn(365, "VARPA", 1, 255, h, 64), new zacn(366, "STDEVA", 1, 255, h, 64), new zacn(367, "VARA", 1, 255, h, 64), new zacn(464, "RANDBETWEEN", 2, 2, g, 64), new zacn(480, "IFERROR", 2, 2, g, 64), new zacn(481, "COUNTIFS", 2, 255, h, 64), new zacn(482, "SUMIFS", 3, 255, h, 64), new zacn(483, "AVERAGEIF", 2, 3, m, 64), new zacn(484, "AVERAGEIFS", 3, 255, h, 64) };
      for (int i1 = 0; i1 < u.length; i1++) {
        if (u[i1] != null) {
          v.put(u[i1].b, u[i1]);
        }
      }
      v.put("EDATE", new zacn(255, "EDATE", 2, 2, g, 64));
      v.put("EOMONTH", new zacn(255, "EOMONTH", 2, 2, g, 64));
      v.put("NETWORKDAYS", new zacn(255, "NETWORKDAYS", 2, 3, h, 64));
      v.put("WEEKNUM", new zacn(255, "WEEKNUM", 1, 2, g, 64));
      v.put("ISOWEEKNUM", new zacn(255, "ISOWEEKNUM", 1, 1, g, 64));
      v.put("WORKDAY", new zacn(255, "WORKDAY", 2, 3, g, 64));
      v.put("YEARFRAC", new zacn(255, "YEARFRAC", 2, 3, g, 64));
      v.put("EUROCONVERT", new zacn(255, "EUROCONVERT", 3, 5, g, 64));
      v.put("FACTDOUBLE", new zacn(255, "FACTDOUBLE", 1, 1, g, 64));
      v.put("GCD", new zacn(255, "GCD", 1, 255, g, 64));
      v.put("LCM", new zacn(255, "LCM", 1, 255, g, 64));
      v.put("MULTINOMIAL", new zacn(255, "MULTINOMIAL", 1, 255, g, 64));
      v.put("QUOTIENT", new zacn(255, "QUOTIENT", 2, 2, g, 64));
      v.put("RANDBETWEEN", new zacn(255, "RANDBETWEEN", 2, 2, g, 64));
      v.put("MROUND", new zacn(255, "MROUND", 2, 2, g, 64));
      v.put("SQRTPI", new zacn(255, "SQRTPI", 1, 1, g, 64));
      v.put("SERIESSUM", new zacn(255, "SERIESSUM ", 4, 4, o, 64));
      v.put("FORMULATEXT", new zacn(255, "FORMULATEXT", 1, 1, h, 64));
      v.put("ISEVEN", new zacn(255, "ISEVEN", 1, 1, g, 64));
      v.put("ISODD", new zacn(255, "ISODD", 1, 1, g, 64));
      v.put("ACCRINT", new zacn(255, "ACCRINT", 5, 7, g, 64));
      v.put("ACCRINTM", new zacn(255, "ACCRINTM", 5, 7, g, 64));
      v.put("AMORDEGRC", new zacn(255, "AMORDEGRC", 6, 7, g, 64));
      v.put("AMORLINC", new zacn(255, "AMORLINC", 6, 7, g, 64));
      v.put("COUPDAYBS", new zacn(255, "COUPDAYBS", 3, 4, g, 64));
      v.put("COUPDAYS", new zacn(255, "COUPDAYS", 3, 4, g, 64));
      v.put("COUPDAYSNC", new zacn(255, "COUPDAYSNC", 3, 4, g, 64));
      v.put("COUPNCD", new zacn(255, "COUPNCD", 3, 4, g, 64));
      v.put("COUPNUM", new zacn(255, "COUPNUM", 3, 4, g, 64));
      v.put("COUPPCD", new zacn(255, "COUPPCD", 3, 4, g, 64));
      v.put("CUMIPMT", new zacn(255, "CUMIPMT", 6, 6, g, 64));
      v.put("CUMPRINC", new zacn(255, "CUMPRINC", 6, 6, g, 64));
      v.put("DISC", new zacn(255, "DISC", 4, 5, g, 64));
      v.put("DOLLARDE", new zacn(255, "DOLLARDE", 2, 2, g, 64));
      v.put("DOLLARFR", new zacn(255, "DOLLARFR", 2, 2, g, 64));
      v.put("DURATION", new zacn(255, "DURATION", 4, 5, g, 64));
      v.put("EFFECT", new zacn(255, "EFFECT", 2, 2, g, 64));
      v.put("FVSCHEDULE", new zacn(255, "FVSCHEDULE", 2, 2, g, 64));
      v.put("INTRATE", new zacn(255, "INTRATE", 4, 5, g, 64));
      v.put("MDURATION", new zacn(255, "MDURATION", 5, 6, g, 64));
      v.put("NOMINAL", new zacn(255, "NOMINAL", 2, 2, g, 64));
      v.put("ODDFPRICE", new zacn(255, "ODDFPRICE", 8, 9, g, 64));
      v.put("ODDFYIELD", new zacn(255, "ODDFYIELD", 8, 9, g, 64));
      v.put("ODDLPRICE", new zacn(255, "ODDLPRICE", 7, 8, g, 64));
      v.put("ODDLYIELD", new zacn(255, "ODDLYIELD", 7, 8, g, 64));
      v.put("PRICE", new zacn(255, "PRICE", 6, 7, g, 64));
      v.put("PRICEDISC", new zacn(255, "PRICEDISC", 4, 5, g, 64));
      v.put("PRICEMAT", new zacn(255, "PRICEMAT", 5, 6, g, 64));
      v.put("RECEIVED", new zacn(255, "RECEIVED", 4, 5, g, 64));
      v.put("TBILLEQ", new zacn(255, "TBILLEQ", 3, 3, g, 64));
      v.put("TBILLPRICE", new zacn(255, "TBILLPRICE", 3, 3, g, 64));
      v.put("TBILLYIELD", new zacn(255, "TBILLYIELD", 3, 3, g, 64));
      v.put("XIRR", new zacn(255, "XIRR", 2, 3, s, 64));
      v.put("XNPV", new zacn(255, "XNPV", 3, 3, n, 64));
      v.put("YIELD", new zacn(255, "YIELD", 6, 7, g, 64));
      v.put("YIELDDISC", new zacn(255, "YIELDDISC", 4, 5, g, 64));
      v.put("YIELDMAT", new zacn(255, "YIELDMAT", 5, 6, g, 64));
      v.put("BESSELI", new zacn(255, "BESSELI", 2, 2, g, 64));
      v.put("BESSELJ", new zacn(255, "BESSELJ", 2, 2, g, 64));
      v.put("BESSELK", new zacn(255, "BESSELK", 2, 2, g, 64));
      v.put("BESSELY", new zacn(255, "BESSELY", 2, 2, g, 64));
      v.put("BIN2DEC", new zacn(255, "BIN2DEC", 1, 1, g, 64));
      v.put("BIN2HEX", new zacn(255, "BIN2HEX", 1, 2, g, 64));
      v.put("BIN2OCT", new zacn(255, "BIN2OCT", 1, 2, g, 64));
      v.put("COMPLEX", new zacn(255, "COMPLEX", 2, 3, g, 64));
      v.put("CONVERT", new zacn(255, "CONVERT", 3, 3, g, 64));
      v.put("DEC2BIN", new zacn(255, "DEC2BIN", 1, 2, g, 64));
      v.put("DEC2HEX", new zacn(255, "DEC2HEX", 1, 2, g, 64));
      v.put("DEC2OCT", new zacn(255, "DEC2OCT", 1, 2, g, 64));
      v.put("DELTA", new zacn(255, "DELTA", 2, 2, g, 64));
      v.put("ERF", new zacn(255, "ERF", 1, 2, g, 64));
      v.put("ERFC", new zacn(255, "ERFC", 1, 1, g, 64));
      v.put("GESTEP", new zacn(255, "GESTEP", 1, 2, g, 64));
      v.put("HEX2BIN", new zacn(255, "HEX2BIN", 1, 2, g, 64));
      v.put("HEX2DEC", new zacn(255, "HEX2DEC", 1, 1, g, 64));
      v.put("HEX2OCT", new zacn(255, "ERFC", 1, 2, g, 64));
      v.put("IMABS", new zacn(255, "IMABS", 1, 1, g, 64));
      v.put("IMAGINARY", new zacn(255, "IMAGINARY", 1, 1, g, 64));
      v.put("IMARGUMENT", new zacn(255, "IMARGUMENT", 1, 1, g, 64));
      v.put("IMCONJUGATE", new zacn(255, "IMCONJUGATE", 1, 1, g, 64));
      v.put("IMCOS", new zacn(255, "IMCOS", 1, 1, g, 64));
      v.put("IMDIV", new zacn(255, "IMDIV", 2, 2, g, 64));
      v.put("IMEXP", new zacn(255, "IMEXP", 1, 1, g, 64));
      v.put("IMLN", new zacn(255, "IMLN", 1, 1, g, 64));
      v.put("IMLOG10", new zacn(255, "IMLOG10", 1, 1, g, 64));
      v.put("IMLOG2", new zacn(255, "IMLOG2", 1, 1, g, 64));
      v.put("IMPOWER", new zacn(255, "IMPOWER", 2, 2, g, 64));
      v.put("IMPRODUCT", new zacn(255, "IMPRODUCT", 1, 255, g, 64));
      v.put("IMREAL", new zacn(255, "IMREAL", 1, 1, g, 64));
      v.put("IMSIN", new zacn(255, "IMSIN", 1, 1, g, 64));
      v.put("IMSQRT", new zacn(255, "IMSQRT", 1, 1, g, 64));
      v.put("IMSUB", new zacn(255, "IMSUB", 2, 2, g, 64));
      v.put("IMSUM", new zacn(255, "IMSUM", 1, 255, g, 64));
      v.put("OCT2BIN", new zacn(255, "OCT2BIN", 1, 2, g, 64));
      v.put("OCT2DEC", new zacn(255, "OCT2DEC", 1, 1, g, 64));
      v.put("OCT2HEX", new zacn(255, "OCT2HEX", 1, 2, g, 64));
    }
  }
  
  static boolean a(String paramString)
  {
    if (paramString.startsWith("_xlfn.")) {
      return false;
    }
    switch (w.a(paramString))
    {
    case 19: 
    case 20: 
    case 21: 
    case 22: 
    case 23: 
    case 24: 
    case 25: 
    case 26: 
    case 27: 
    case 28: 
    case 29: 
    case 30: 
    case 31: 
    case 32: 
    case 33: 
    case 34: 
    case 35: 
    case 36: 
    case 37: 
    case 38: 
    case 39: 
    case 40: 
    case 41: 
    case 42: 
    case 43: 
    case 44: 
    case 45: 
    case 46: 
    case 47: 
    case 48: 
    case 49: 
    case 50: 
    case 51: 
    case 52: 
    case 53: 
    case 54: 
    case 55: 
    case 56: 
    case 57: 
    case 58: 
    case 59: 
    case 60: 
    case 61: 
    case 62: 
    case 63: 
    case 64: 
    case 65: 
    case 66: 
    case 67: 
    case 68: 
    case 69: 
    case 70: 
    case 71: 
    case 72: 
    case 73: 
    case 74: 
    case 75: 
    case 76: 
    case 77: 
    case 78: 
    case 79: 
    case 80: 
    case 81: 
    case 82: 
    case 83: 
    case 84: 
    case 85: 
    case 86: 
    case 87: 
    case 88: 
    case 89: 
    case 90: 
    case 91: 
    case 92: 
    case 93: 
    case 94: 
    case 95: 
    case 96: 
    case 97: 
    case 98: 
    case 99: 
    case 100: 
    case 101: 
    case 102: 
    case 103: 
    case 104: 
    case 105: 
    case 106: 
    case 107: 
    case 108: 
    case 109: 
    case 110: 
    case 111: 
    case 112: 
    case 113: 
    case 114: 
      return false;
    }
    return true;
  }
  
  static zacn a(int paramInt)
  {
    if (u == null) {
      a();
    }
    int i1 = 0;
    int i2 = u.length - 1;
    while (i1 <= i2)
    {
      int i3 = i1 + i2 >> 1;
      int i4 = u[i3].a & 0xFFFF;
      if (i4 < paramInt) {
        i1 = i3 + 1;
      } else if (i4 > paramInt) {
        i2 = i3 - 1;
      } else {
        return u[i3];
      }
    }
    return null;
  }
  
  static zacn a(String paramString, int paramInt)
  {
    if (u == null) {
      a();
    }
    if (paramInt == 1) {
      switch (w.a(paramString))
      {
      case 115: 
        return new zacn(1, "IF", 2, 3, r, 32);
      case 116: 
        return new zacn(28, "LOOKUP", 2, 3, r, 64);
      }
    }
    return (zacn)v.get(paramString);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zacn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */