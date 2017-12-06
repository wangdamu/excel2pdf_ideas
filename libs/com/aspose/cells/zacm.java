package com.aspose.cells;

import com.aspose.cells.b.a.zw;
import java.util.HashMap;

class zacm
{
  private static HashMap c = new HashMap();
  private static HashMap d = new HashMap();
  private static zacm[] e = new zacm['ȩ'];
  protected String a;
  protected zaif b;
  
  public String a()
  {
    return this.a;
  }
  
  public int b()
  {
    Object localObject = c.get(this.a);
    if (localObject == null) {
      return 255;
    }
    return ((Integer)localObject).intValue();
  }
  
  public zaif c()
  {
    return this.b;
  }
  
  public static zacm a(int paramInt)
  {
    if (paramInt < e.length)
    {
      if (e[paramInt] == null) {
        synchronized (e)
        {
          if (e[paramInt] == null) {
            e[paramInt] = b(paramInt);
          }
        }
      }
      return e[paramInt];
    }
    return null;
  }
  
  public static zacm a(String paramString)
  {
    Object localObject = c.get(paramString);
    if (localObject != null) {
      return a(((Integer)localObject).intValue());
    }
    localObject = d.get(paramString);
    if (localObject != null) {
      return (zacm)localObject;
    }
    String str = paramString.toUpperCase();
    if (str.startsWith("_XL")) {
      if (str.startsWith("_XLFN.")) {
        str = str.substring(6);
      } else if (str.startsWith("_XLL.")) {
        str = str.substring(5);
      } else if (str.startsWith("_XLUDF.")) {
        str = str.substring(7);
      }
    }
    if (!zw.b(str, paramString))
    {
      paramString = str;
      localObject = c.get(paramString);
      if (localObject != null) {
        return a(((Integer)localObject).intValue());
      }
      localObject = d.get(paramString);
      if (localObject != null) {
        return (zacm)localObject;
      }
    }
    return null;
  }
  
  public static zacm b(String paramString)
  {
    return new zacm(paramString, zacu.a("0-255-V-V-V"));
  }
  
  private zacm(String paramString, zaif paramzaif)
  {
    this.a = paramString;
    this.b = paramzaif;
  }
  
  protected zacm(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = zacu.a(paramString2);
  }
  
  private static zacm b(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return new zacm("COUNT", "1-255-V-R-A");
    case 1: 
      return new zacm("IF", "2-3-R-VR-VV");
    case 2: 
      return new zacm("ISNA", "1-1-V-V-V");
    case 3: 
      return new zacm("ISERROR", "1-1-V-V-V");
    case 4: 
      return new zacm("SUM", "1-255-V-R-A");
    case 5: 
      return new zacm("AVERAGE", "1-255-V-R-A");
    case 6: 
      return new zacm("MIN", "1-255-V-R-A");
    case 7: 
      return new zacm("MAX", "1-255-V-R-A");
    case 8: 
      return new zacm("ROW", "0-1-V-R-R");
    case 9: 
      return new zacm("COLUMN", "0-1-V-R-R");
    case 10: 
      return new zacm("NA", "V");
    case 11: 
      return new zacm("NPV", "2-255-V-VR-VA");
    case 12: 
      return new zacm("STDEV", "1-255-V-R-A");
    case 13: 
      return new zacm("DOLLAR", "1-2-V-V-V");
    case 14: 
      return new zacm("FIXED", "1-3-V-V-V");
    case 15: 
      return new zacm("SIN", "1-1-V-V-V");
    case 16: 
      return new zacm("COS", "1-1-V-V-V");
    case 17: 
      return new zacm("TAN", "1-1-V-V-V");
    case 18: 
      return new zacm("ATAN", "1-1-V-V-V");
    case 19: 
      return new zacm("PI", "V");
    case 20: 
      return new zacm("SQRT", "1-1-V-V-V");
    case 21: 
      return new zacm("EXP", "1-1-V-V-V");
    case 22: 
      return new zacm("LN", "1-1-V-V-V");
    case 23: 
      return new zacm("LOG10", "1-1-V-V-V");
    case 24: 
      return new zacm("ABS", "1-1-V-V-V");
    case 25: 
      return new zacm("INT", "1-1-V-V-V");
    case 26: 
      return new zacm("SIGN", "1-1-V-V-V");
    case 27: 
      return new zacm("ROUND", "2-2-V-V-V");
    case 28: 
      return new zacm("LOOKUP", "2-3-V-VR-VA");
    case 29: 
      return new zacm("INDEX", "2-4-R-RV-AV");
    case 30: 
      return new zacm("REPT", "2-2-V-V-V");
    case 31: 
      return new zacm("MID", "3-3-V-V-V");
    case 32: 
      return new zacm("LEN", "1-1-V-V-V");
    case 33: 
      return new zacm("VALUE", "1-1-V-V-V");
    case 34: 
      return new zacm("TRUE", "V");
    case 35: 
      return new zacm("FALSE", "V");
    case 36: 
      return new zacm("AND", "1-255-V-R-A");
    case 37: 
      return new zacm("OR", "1-255-V-R-A");
    case 38: 
      return new zacm("NOT", "1-1-V-V-V");
    case 39: 
      return new zacm("MOD", "2-2-V-V-V");
    case 40: 
      return new zacm("DCOUNT", "3-3-V-R-A");
    case 41: 
      return new zacm("DSUM", "3-3-V-R-A");
    case 42: 
      return new zacm("DAVERAGE", "3-3-V-R-A");
    case 43: 
      return new zacm("DMIN", "3-3-V-R-A");
    case 44: 
      return new zacm("DMAX", "3-3-V-R-A");
    case 45: 
      return new zacm("DSTDEV", "3-3-V-R-A");
    case 46: 
      return new zacm("VAR", "1-255-V-R-A");
    case 47: 
      return new zacm("DVAR", "3-3-V-R-A");
    case 48: 
      return new zacm("TEXT", "2-2-V-V-V");
    case 49: 
      return new zacm("LINEST", "1-4-A-RRV-AAV");
    case 50: 
      return new zacm("TREND", "1-4-A-RRRV-AAAV");
    case 51: 
      return new zacm("LOGEST", "1-4-A-RRV-AAV");
    case 52: 
      return new zacm("GROWTH", "1-4-A-RRRV-AAAV");
    case 53: 
      return new zacm("TYPE", "1-1-V-R-V");
    case 54: 
      return new zacm("HALT", "0-1-V-V-V");
    case 55: 
      return new zacm("RETURN", "0-1-V-R-V");
    case 56: 
      return new zacm("PV", "3-5-V-V-V");
    case 57: 
      return new zacm("FV", "3-5-V-V-V");
    case 58: 
      return new zacm("NPER", "3-5-V-V-V");
    case 59: 
      return new zacm("PMT", "3-5-V-V-V");
    case 60: 
      return new zacm("RATE", "3-6-V-V-V");
    case 61: 
      return new zacm("MIRR", "3-3-V-RV-AV");
    case 62: 
      return new zacm("IRR", "1-2-V-RV-AV");
    case 63: 
      return new zacm("RAND", "V");
    case 64: 
      return new zacm("MATCH", "2-3-V-VR-VA");
    case 65: 
      return new zacm("DATE", "3-3-V-V-V");
    case 66: 
      return new zacm("TIME", "3-3-V-V-V");
    case 67: 
      return new zacm("DAY", "1-1-V-V-V");
    case 68: 
      return new zacm("MONTH", "1-1-V-V-V");
    case 69: 
      return new zacm("YEAR", "1-1-V-V-V");
    case 70: 
      return new zacm("WEEKDAY", "1-2-V-V-V");
    case 71: 
      return new zacm("HOUR", "1-1-V-V-V");
    case 72: 
      return new zacm("MINUTE", "1-1-V-V-V");
    case 73: 
      return new zacm("SECOND", "1-1-V-V-V");
    case 74: 
      return new zacm("NOW", "V");
    case 75: 
      return new zacm("AREAS", "1-1-V-R-A");
    case 76: 
      return new zacm("ROWS", "1-1-V-R-A");
    case 77: 
      return new zacm("COLUMNS", "1-1-V-R-A");
    case 78: 
      return new zacm("OFFSET", "3-5-R-RV-AV");
    case 79: 
      return new zacm("ABSREF", "2-2-R-VR-AV");
    case 80: 
      return new zacm("RELREF", "2-2-R-R-V");
    case 81: 
      return new zacm("ARGUMENT", "0-3-V-VR-VV");
    case 82: 
      return new zacm("SEARCH", "2-3-R-V-V");
    case 83: 
      return new zacm("TRANSPOSE", "1-1-A-A-A");
    case 84: 
      return new zacm("ERROR", "0-2-V-VR-VA");
    case 85: 
      return new zacm("STEP", "V");
    case 86: 
      return new zacm("TYPE", "1-1-V-V-V");
    case 87: 
      return new zacm("ECHO", "0-1-V-V-V");
    case 97: 
      return new zacm("ATAN2", "2-2-V-V-V");
    case 98: 
      return new zacm("ASIN", "1-1-V-V-V");
    case 99: 
      return new zacm("ACOS", "1-1-V-V-V");
    case 100: 
      return new zacm("CHOOSE", "2-255-R-VR-VV");
    case 101: 
      return new zacm("HLOOKUP", "3-4-V-VRRV-VAAV");
    case 102: 
      return new zacm("VLOOKUP", "3-4-V-VRRV-VAAV");
    case 105: 
      return new zacm("ISREF", "1-1-V-R-R");
    case 109: 
      return new zacm("LOG", "1-2-V-V-V");
    case 111: 
      return new zacm("CHAR", "1-1-V-V-V");
    case 112: 
      return new zacm("LOWER", "1-1-V-V-V");
    case 113: 
      return new zacm("UPPER", "1-1-V-V-V");
    case 114: 
      return new zacm("PROPER", "1-1-V-V-V");
    case 115: 
      return new zacm("LEFT", "1-2-V-V-V");
    case 116: 
      return new zacm("RIGHT", "1-2-V-V-V");
    case 117: 
      return new zacm("EXACT", "2-2-V-V-V");
    case 118: 
      return new zacm("TRIM", "1-1-V-V-V");
    case 119: 
      return new zacm("REPLACE", "4-4-V-V-V");
    case 120: 
      return new zacm("SUBSTITUTE", "3-4-V-V-V");
    case 121: 
      return new zacm("CODE", "1-1-V-V-V");
    case 124: 
      return new zacm("FIND", "2-3-V-V-V");
    case 125: 
      return new zacm("CELL", "1-2-V-VR-VR");
    case 126: 
      return new zacm("ISERR", "1-1-V-V-V");
    case 127: 
      return new zacm("ISTEXT", "1-1-V-V-V");
    case 128: 
      return new zacm("ISNUMBER", "1-1-V-V-V");
    case 129: 
      return new zacm("ISBLANK", "1-1-V-V-V");
    case 130: 
      return new zacm("T", "1-1-V-R-V");
    case 131: 
      return new zacm("N", "1-1-V-R-V");
    case 140: 
      return new zacm("DATEVALUE", "1-1-V-V-V");
    case 141: 
      return new zacm("TIMEVALUE", "1-1-V-V-V");
    case 142: 
      return new zacm("SLN", "3-3-V-V-V");
    case 143: 
      return new zacm("SYD", "4-4-V-V-V");
    case 144: 
      return new zacm("DDB", "4-5-V-V-V");
    case 148: 
      return new zacm("INDIRECT", "1-2-R-V-V");
    case 162: 
      return new zacm("CLEAN", "1-1-V-V-V");
    case 163: 
      return new zacm("MDETERM", "1-1-V-A-A");
    case 164: 
      return new zacm("MINVERSE", "1-1-A-A-A");
    case 165: 
      return new zacm("MMULT", "2-2-A-A-A");
    case 167: 
      return new zacm("IPMT", "4-6-V-V-V");
    case 168: 
      return new zacm("PPMT", "4-6-V-V-V");
    case 169: 
      return new zacm("COUNTA", "1-255-V-R-A");
    case 170: 
      return new zacm("CANCEL.KEY", "1-2-V-VR-VA");
    case 171: 
      return new zacm("FOR", "3-4-V-V-V");
    case 172: 
      return new zacm("WHILE", "1-1-V-V-V");
    case 173: 
      return new zacm("BREAK", "V");
    case 174: 
      return new zacm("NEXT", "V");
    case 175: 
      return new zacm("INITIATE", "2-2-V-V-V");
    case 176: 
      return new zacm("REQUEST", "2-2-V-V-V");
    case 177: 
      return new zacm("POKE", "1-2-V-V-V");
    case 178: 
      return new zacm("EXECUTE", "2-2-V-V-V");
    case 179: 
      return new zacm("TERMINATE", "1-1-V-V-V");
    case 180: 
      return new zacm("RESTART", "0-1-V-V-V");
    case 181: 
      return new zacm("HELP", "0-1-V-V-V");
    case 182: 
      return new zacm("GET.BAR", "4-4-V-V-V");
    case 183: 
      return new zacm("PRODUCT", "1-255-V-R-A");
    case 184: 
      return new zacm("FACT", "1-1-V-V-V");
    case 185: 
      return new zacm("GET.CELL", "1-2-V-VR-VA");
    case 186: 
      return new zacm("GET.WORKSPACE", "1-1-V-V-V");
    case 187: 
      return new zacm("GET.WINDOW", "1-2-V-V-V");
    case 188: 
      return new zacm("GET.DOCUMENT", "1-2-V-V-V");
    case 189: 
      return new zacm("DPRODUCT", "3-3-V-R-A");
    case 190: 
      return new zacm("ISNONTEXT", "1-1-V-V-V");
    case 191: 
      return new zacm("GET.NOTE", "1-1-V-V-V");
    case 192: 
      return new zacm("NOTE", "1-1-V-V-V");
    case 193: 
      return new zacm("STDEVP", "1-255-V-R-A");
    case 194: 
      return new zacm("VARP", "1-255-V-R-A");
    case 195: 
      return new zacm("DSTDEVP", "3-3-V-R-A");
    case 196: 
      return new zacm("DVARP", "3-3-V-R-A");
    case 197: 
      return new zacm("TRUNC", "1-2-V-V-V");
    case 198: 
      return new zacm("ISLOGICAL", "1-1-V-V-V");
    case 199: 
      return new zacm("DCOUNTA", "3-3-V-R-A");
    case 204: 
      return new zacm("USDOLLAR", "1-2-V-V-V");
    case 205: 
      return new zacm("FINDB", "2-3-V-V-V");
    case 206: 
      return new zacm("SEARCHB", "2-3-V-V-V");
    case 207: 
      return new zacm("REPLACEB", "4-4-V-V-V");
    case 208: 
      return new zacm("LEFTB", "1-2-V-V-V");
    case 209: 
      return new zacm("RIGHTB", "1-2-V-V-V");
    case 210: 
      return new zacm("MIDB", "3-3-V-V-V");
    case 211: 
      return new zacm("LENB", "1-1-V-V-V");
    case 212: 
      return new zacm("ROUNDUP", "2-2-V-V-V");
    case 213: 
      return new zacm("ROUNDDOWN", "2-2-V-V-V");
    case 214: 
      return new zacm("ASC", "1-1-V-V-V");
    case 215: 
      return new zacm("WIDECHAR", "1-1-V-V-V");
    case 216: 
      return new zacm("RANK", "2-3-V-VRV-VAV");
    case 219: 
      return new zacm("ADDRESS", "2-5-V-V-V");
    case 220: 
      return new zacm("DAYS360", "2-3-V-V-V");
    case 221: 
      return new zacm("TODAY", "V");
    case 222: 
      return new zacm("VDB", "5-7-V-V-V");
    case 227: 
      return new zacm("MEDIAN", "1-255-V-R-A");
    case 228: 
      return new zacm("SUMPRODUCT", "1-255-V-A-A");
    case 229: 
      return new zacm("SINH", "1-1-V-V-V");
    case 230: 
      return new zacm("COSH", "1-1-V-V-V");
    case 231: 
      return new zacm("TANH", "1-1-V-V-V");
    case 232: 
      return new zacm("ASINH", "1-1-V-V-V");
    case 233: 
      return new zacm("ACOSH", "1-1-V-V-V");
    case 234: 
      return new zacm("ATANH", "1-1-V-V-V");
    case 235: 
      return new zacm("DGET", "3-3-V-R-A");
    case 244: 
      return new zacm("INFO", "1-1-V-V-V");
    case 247: 
      return new zacm("DB", "4-5-V-V-V");
    case 252: 
      return new zacm("FREQUENCY", "2-2-A-R-A");
    case 261: 
      return new zacm("ERROR.TYPE", "1-1-V-V-V");
    case 268: 
      return new zacm("GET.WORKBOOK", "1-2-V-V-V");
    case 269: 
      return new zacm("AVEDEV", "1-255-V-R-A");
    case 270: 
      return new zacm("BETADIST", "3-5-V-V-V");
    case 271: 
      return new zacm("GAMMALN", "1-1-V-V-V");
    case 272: 
      return new zacm("BETAINV", "3-5-V-V-V");
    case 273: 
      return new zacm("BINOMDIST", "4-4-V-V-V");
    case 274: 
      return new zacm("CHIDIST", "2-2-V-V-V");
    case 275: 
      return new zacm("CHIINV", "2-2-V-V-V");
    case 276: 
      return new zacm("COMBIN", "2-2-V-V-V");
    case 277: 
      return new zacm("CONFIDENCE", "3-3-V-V-V");
    case 278: 
      return new zacm("CRITBINOM", "3-3-V-V-V");
    case 279: 
      return new zacm("EVEN", "1-1-V-V-V");
    case 280: 
      return new zacm("EXPONDIST", "3-3-V-V-V");
    case 281: 
      return new zacm("FDIST", "3-3-V-V-V");
    case 282: 
      return new zacm("FINV", "3-3-V-V-V");
    case 283: 
      return new zacm("FISHER", "1-1-V-V-V");
    case 284: 
      return new zacm("FISHERINV", "1-1-V-V-V");
    case 285: 
      return new zacm("FLOOR", "2-2-V-V-V");
    case 286: 
      return new zacm("GAMMADIST", "4-4-V-V-V");
    case 287: 
      return new zacm("GAMMAINV", "3-3-V-V-V");
    case 288: 
      return new zacm("CEILING", "2-2-V-V-V");
    case 289: 
      return new zacm("HYPGEOMDIST", "4-4-V-V-V");
    case 290: 
      return new zacm("LOGNORMDIST", "3-3-V-V-V");
    case 291: 
      return new zacm("LOGINV", "3-3-V-V-V");
    case 292: 
      return new zacm("NEGBINOMDIST", "3-3-V-V-V");
    case 293: 
      return new zacm("NORMDIST", "4-4-V-V-V");
    case 294: 
      return new zacm("NORMSDIST", "1-1-V-V-V");
    case 295: 
      return new zacm("NORMINV", "3-3-V-V-V");
    case 296: 
      return new zacm("NORMSINV", "1-1-V-V-V");
    case 297: 
      return new zacm("STANDARDIZE", "3-3-V-V-V");
    case 298: 
      return new zacm("ODD", "1-1-V-V-V");
    case 299: 
      return new zacm("PERMUT", "2-2-V-V-V");
    case 300: 
      return new zacm("POISSON", "3-3-V-V-V");
    case 301: 
      return new zacm("TDIST", "3-3-V-V-V");
    case 302: 
      return new zacm("WEIBULL", "4-4-V-V-V");
    case 303: 
      return new zacm("SUMXMY2", "2-2-V-A-A");
    case 304: 
      return new zacm("SUMX2MY2", "2-2-V-A-A");
    case 305: 
      return new zacm("SUMX2PY2", "2-2-V-A-A");
    case 306: 
      return new zacm("CHITEST", "2-2-V-A-A");
    case 307: 
      return new zacm("CORREL", "2-2-V-A-A");
    case 308: 
      return new zacm("COVAR", "2-2-V-A-A");
    case 309: 
      return new zacm("FORECAST", "3-3-V-VA-VA");
    case 310: 
      return new zacm("FTEST", "2-2-V-A-A");
    case 311: 
      return new zacm("INTERCEPT", "2-2-V-A-A");
    case 312: 
      return new zacm("PEARSON", "2-2-V-A-A");
    case 313: 
      return new zacm("RSQ", "2-2-V-A-A");
    case 314: 
      return new zacm("STEYX", "2-2-V-A-A");
    case 315: 
      return new zacm("SLOPE", "2-2-V-A-A");
    case 316: 
      return new zacm("TTEST", "4-4-V-AAV-AAV");
    case 317: 
      return new zacm("PROB", "3-4-V-AAV-AAV");
    case 318: 
      return new zacm("DEVSQ", "1-255-V-R-A");
    case 319: 
      return new zacm("GEOMEAN", "1-255-V-R-A");
    case 320: 
      return new zacm("HARMEAN", "1-255-V-R-A");
    case 321: 
      return new zacm("SUMSQ", "1-255-V-R-A");
    case 322: 
      return new zacm("KURT", "1-255-V-R-A");
    case 323: 
      return new zacm("SKEW", "1-255-V-R-A");
    case 324: 
      return new zacm("ZTEST", "2-3-V-RV-AV");
    case 325: 
      return new zacm("LARGE", "2-2-V-RV-AV");
    case 326: 
      return new zacm("SMALL", "2-2-V-RV-AV");
    case 327: 
      return new zacm("QUARTILE", "2-2-V-RV-AV");
    case 497: 
      return new zacm("QUARTILE.INC", "2-2-V-RV-AV");
    case 498: 
      return new zacm("QUARTILE.EXC", "2-2-V-RV-AV");
    case 328: 
      return new zacm("PERCENTILE", "2-2-V-RV-AV");
    case 495: 
      return new zacm("PERCENTILE.INC", "2-2-V-RV-AV");
    case 496: 
      return new zacm("PERCENTILE.EXC", "2-2-V-RV-AV");
    case 329: 
      return new zacm("PERCENTRANK", "2-3-V-RV-AV");
    case 330: 
      return new zacm("MODE", "1-255-V-A-A");
    case 331: 
      return new zacm("TRIMMEAN", "2-2-V-RV-AV");
    case 332: 
      return new zacm("TINV", "2-2-V-V-V");
    case 336: 
      return new zacm("CONCATENATE", "1-255-V-V-V");
    case 337: 
      return new zacm("POWER", "2-2-V-V-V");
    case 342: 
      return new zacm("RADIANS", "1-1-V-V-V");
    case 343: 
      return new zacm("DEGREES", "1-1-V-V-V");
    case 344: 
      return new zacm("SUBTOTAL", "2-255-V-VR-VA");
    case 345: 
      return new zacm("SUMIF", "2-3-V-RVR-AVA");
    case 346: 
      return new zacm("COUNTIF", "2-2-V-RVR-AVA");
    case 347: 
      return new zacm("COUNTBLANK", "1-1-V-R-A");
    case 350: 
      return new zacm("ISPMT", "4-4-V-V-V");
    case 351: 
      return new zacm("DATEDIF", "3-3-V-V-V");
    case 352: 
      return new zacm("DATESTRING", "1-1-V-V-V");
    case 353: 
      return new zacm("NUMBERSTRING", "2-2-V-V-V");
    case 354: 
      return new zacm("ROMAN", "1-2-V-V-V");
    case 358: 
      return new zacm("GETPIVOTDATA", "2-255-V-VRV-VRV");
    case 359: 
      return new zacm("HYPERLINK", "1-2-V-V-V");
    case 360: 
      return new zacm("PHONETIC", "1-1-V-R-A");
    case 361: 
      return new zacm("AVERAGEA", "1-255-V-R-A");
    case 362: 
      return new zacm("MAXA", "1-255-V-R-A");
    case 363: 
      return new zacm("MINA", "1-255-V-R-A");
    case 364: 
      return new zacm("STDEVPA", "1-255-V-R-A");
    case 365: 
      return new zacm("VARPA", "1-255-V-R-A");
    case 366: 
      return new zacm("STDEVA", "1-255-V-R-A");
    case 367: 
      return new zacm("VARA", "1-255-V-R-A");
    case 380: 
      return new zacm("CUBEVALUE", "1-255-V-V-V");
    case 381: 
      return new zacm("CUBEMEMBER", "2-3-V-V-V");
    case 382: 
      return new zacm("CUBEMEMBERPROPERTY", "3-3-V-V-V");
    case 383: 
      return new zacm("CUBERANKEDMEMBER", "2-3-V-V-V");
    case 384: 
      return new zacm("HEX2BIN", "1-2-V-V-V");
    case 385: 
      return new zacm("HEX2DEC", "1-1-V-V-V");
    case 386: 
      return new zacm("HEX2OCT", "1-2-V-V-V");
    case 387: 
      return new zacm("DEC2BIN", "1-2-V-V-V");
    case 388: 
      return new zacm("DEC2HEX", "1-2-V-V-V");
    case 389: 
      return new zacm("DEC2OCT", "1-2-V-V-V");
    case 390: 
      return new zacm("OCT2BIN", "1-2-V-V-V");
    case 392: 
      return new zacm("OCT2DEC", "1-1-V-V-V");
    case 391: 
      return new zacm("OCT2HEX", "1-2-V-V-V");
    case 393: 
      return new zacm("BIN2DEC", "1-1-V-V-V");
    case 394: 
      return new zacm("BIN2OCT", "1-2-V-V-V");
    case 395: 
      return new zacm("BIN2HEX", "1-2-V-V-V");
    case 396: 
      return new zacm("IMSUB", "2-2-V-V-V");
    case 397: 
      return new zacm("IMDIV", "2-2-V-V-V");
    case 398: 
      return new zacm("IMPOWER", "2-2-V-V-V");
    case 399: 
      return new zacm("IMABS", "1-1-V-V-V");
    case 400: 
      return new zacm("IMSQRT", "1-1-V-V-V");
    case 401: 
      return new zacm("IMLN", "1-1-V-V-V");
    case 402: 
      return new zacm("IMLOG2", "1-1-V-V-V");
    case 403: 
      return new zacm("IMLOG10", "1-1-V-V-V");
    case 404: 
      return new zacm("IMSIN", "1-1-V-V-V");
    case 405: 
      return new zacm("IMCOS", "1-1-V-V-V");
    case 406: 
      return new zacm("IMEXP", "1-1-V-V-V");
    case 407: 
      return new zacm("IMARGUMENT", "1-1-V-V-V");
    case 408: 
      return new zacm("IMCONJUGATE", "1-1-V-V-V");
    case 409: 
      return new zacm("IMAGINARY", "1-1-V-V-V");
    case 410: 
      return new zacm("IMREAL", "1-1-V-V-V");
    case 411: 
      return new zacm("COMPLEX", "2-3-V-V-V");
    case 412: 
      return new zacm("IMSUM", "1-255-V-V-V");
    case 413: 
      return new zacm("IMPRODUCT", "1-255-V-V-V");
    case 414: 
      return new zacm("SERIESSUM", "4-4-V-VVVR-VVVA");
    case 415: 
      return new zacm("FACTDOUBLE", "1-1-V-V-V");
    case 416: 
      return new zacm("SQRTPI", "1-1-V-V-V");
    case 417: 
      return new zacm("QUOTIENT", "2-2-V-V-V");
    case 418: 
      return new zacm("DELTA", "2-2-V-V-V");
    case 419: 
      return new zacm("GESTEP", "1-2-V-V-V");
    case 420: 
      return new zacm("ISEVEN", "1-1-V-V-V");
    case 421: 
      return new zacm("ISODD", "1-1-V-V-V");
    case 422: 
      return new zacm("MROUND", "2-2-V-V-V");
    case 423: 
      return new zacm("ERF", "1-2-V-V-V");
    case 424: 
      return new zacm("ERFC", "1-1-V-V-V");
    case 425: 
      return new zacm("BESSELJ", "2-2-V-V-V");
    case 426: 
      return new zacm("BESSELK", "2-2-V-V-V");
    case 427: 
      return new zacm("BESSELY", "2-2-V-V-V");
    case 428: 
      return new zacm("BESSELI", "2-2-V-V-V");
    case 429: 
      return new zacm("XIRR", "2-3-V-RRV-AAV");
    case 430: 
      return new zacm("XNPV", "3-3-V-VR-VA");
    case 431: 
      return new zacm("PRICEMAT", "5-6-V-V-V");
    case 432: 
      return new zacm("YIELDMAT", "5-6-V-V-V");
    case 433: 
      return new zacm("INTRATE", "4-5-V-V-V");
    case 434: 
      return new zacm("RECEIVED", "4-5-V-V-V");
    case 435: 
      return new zacm("DISC", "4-5-V-V-V");
    case 436: 
      return new zacm("PRICEDISC", "4-5-V-V-V");
    case 437: 
      return new zacm("YIELDDISC", "4-5-V-V-V");
    case 438: 
      return new zacm("TBILLEQ", "3-3-V-V-V");
    case 439: 
      return new zacm("TBILLPRICE", "3-3-V-V-V");
    case 440: 
      return new zacm("TBILLYIELD", "3-3-V-V-V");
    case 441: 
      return new zacm("PRICE", "6-7-V-V-V");
    case 442: 
      return new zacm("YIELD", "6-7-V-V-V");
    case 443: 
      return new zacm("DOLLARDE", "2-2-V-V-V");
    case 444: 
      return new zacm("DOLLARFR", "2-2-V-V-V");
    case 445: 
      return new zacm("NOMINAL", "2-2-V-V-V");
    case 446: 
      return new zacm("EFFECT", "2-2-V-V-V");
    case 447: 
      return new zacm("CUMPRINC", "6-6-V-V-V");
    case 448: 
      return new zacm("CUMIPMT", "6-6-V-V-V");
    case 449: 
      return new zacm("EDATE", "2-2-V-V-V");
    case 450: 
      return new zacm("EOMONTH", "2-2-V-V-V");
    case 451: 
      return new zacm("YEARFRAC", "2-3-V-V-V");
    case 452: 
      return new zacm("COUPDAYBS", "3-4-V-V-V");
    case 453: 
      return new zacm("COUPDAYS", "3-4-V-V-V");
    case 454: 
      return new zacm("COUPDAYSNC", "3-4-V-V-V");
    case 455: 
      return new zacm("COUPNCD", "3-4-V-V-V");
    case 456: 
      return new zacm("COUPNUM", "3-4-V-V-V");
    case 457: 
      return new zacm("COUPPCD", "3-4-V-V-V");
    case 458: 
      return new zacm("DURATION", "5-6-V-V-V");
    case 459: 
      return new zacm("MDURATION", "5-6-V-V-V");
    case 460: 
      return new zacm("ODDLPRICE", "7-8-V-V-V");
    case 461: 
      return new zacm("ODDLYIELD", "7-8-V-V-V");
    case 462: 
      return new zacm("ODDFPRICE", "8-9-V-V-V");
    case 463: 
      return new zacm("ODDFYIELD", "8-9-V-V-V");
    case 464: 
      return new zacm("RANDBETWEEN", "2-2-V-V-V");
    case 465: 
      return new zacm("WEEKNUM", "1-2-V-V-V");
    case 545: 
      return new zacm("ISOWEEKNUM", "1-1-V-V-V");
    case 546: 
      return new zacm("FORMULATEXT", "1-1-V-R-V");
    case 466: 
      return new zacm("AMORDEGRC", "6-7-V-V-V");
    case 467: 
      return new zacm("AMORLINC", "6-7-V-V-V");
    case 468: 
      return new zacm("CONVERT", "3-3-V-V-V");
    case 469: 
      return new zacm("ACCRINT", "5-8-V-V-V");
    case 470: 
      return new zacm("ACCRINTM", "4-5-V-V-V");
    case 471: 
      return new zacm("WORKDAY", "2-3-V-V-V");
    case 472: 
      return new zacm("NETWORKDAYS", "2-3-V-R-A");
    case 473: 
      return new zacm("GCD", "1-255-V-V-V");
    case 474: 
      return new zacm("MULTINOMIAL", "1-255-V-V-V");
    case 475: 
      return new zacm("LCM", "1-255-V-V-V");
    case 476: 
      return new zacm("FVSCHEDULE", "2-2-V-V-V");
    case 477: 
      return new zacm("CUBEKPIMEMBER", "3-4-V-V-V");
    case 478: 
      return new zacm("CUBESET", "2-5-V-V-V");
    case 479: 
      return new zacm("CUBESETCOUNT", "1-1-V-V-V");
    case 480: 
      return new zacm("IFERROR", "2-2-V-V-V");
    case 481: 
      return new zacm("COUNTIFS", "2-255-V-RV-AV-2");
    case 482: 
      return new zacm("SUMIFS", "3-255-V-RRV-AAV-2");
    case 483: 
      return new zacm("AVERAGEIF", "2-3-V-RVR-AVA");
    case 484: 
      return new zacm("AVERAGEIFS", "3-255-V-RRV-AAV-2");
    case 485: 
      return new zacm("DAYS", "2-2-V-V-V");
    case 486: 
      return new zacm("WORKDAY.INTL", "2-4-V-VVVR-VVVA");
    case 487: 
      return new zacm("NETWORKDAYS.INTL", "2-4-V-VVVR-VVVA");
    case 488: 
      return new zacm("AGGREGATE", "3-255-V-VVR-VVA");
    case 489: 
      return new zacm("IFNA", "2-2-V-V-V");
    case 490: 
      return new zacm("BITAND", "2-2-V-V-V");
    case 491: 
      return new zacm("BITOR", "2-2-V-V-V");
    case 492: 
      return new zacm("BITXOR", "2-2-V-V-V");
    case 493: 
      return new zacm("BITLSHIFT", "2-2-V-V-V");
    case 494: 
      return new zacm("BITRSHIFT", "2-2-V-V-V");
    case 499: 
      return new zacm("NORM.DIST", "4-4-V-V-V");
    case 500: 
      return new zacm("NORM.S.DIST", "2-2-V-V-V");
    case 501: 
      return new zacm("NORM.INV", "3-3-V-V-V");
    case 502: 
      return new zacm("NORM.S.INV", "1-1-V-V-V");
    case 503: 
      return new zacm("BETA.DIST", "4-6-V-V-V");
    case 504: 
      return new zacm("BETA.INV", "3-5-V-V-V");
    case 505: 
      return new zacm("BINOM.DIST", "4-4-V-V-V");
    case 506: 
      return new zacm("BINOM.INV", "3-3-V-V-V");
    case 507: 
      return new zacm("CHISQ.DIST", "3-3-V-V-V");
    case 508: 
      return new zacm("CHISQ.DIST.RT", "2-2-V-V-V");
    case 509: 
      return new zacm("CHISQ.INV", "2-2-V-V-V");
    case 510: 
      return new zacm("CHISQ.INV.RT", "2-2-V-V-V");
    case 511: 
      return new zacm("CHISQ.TEST", "2-2-V-V-V");
    case 512: 
      return new zacm("CONFIDENCE.NORM", "3-3-V-V-V");
    case 513: 
      return new zacm("CONFIDENCE.T", "3-3-V-V-V");
    case 514: 
      return new zacm("COVARIANCE.P", "2-2-V-A-A");
    case 515: 
      return new zacm("COVARIANCE.S", "2-2-V-A-A");
    case 516: 
      return new zacm("F.DIST", "4-4-V-V-V");
    case 517: 
      return new zacm("F.DIST.RT", "3-3-V-V-V");
    case 518: 
      return new zacm("F.INV", "3-3-V-V-V");
    case 519: 
      return new zacm("F.INV.RT", "3-3-V-V-V");
    case 520: 
      return new zacm("F.TEST", "2-2-V-A-A");
    case 521: 
      return new zacm("GAMMA.DIST", "4-4-V-V-V");
    case 522: 
      return new zacm("GAMMA.INV", "3-3-V-V-V");
    case 523: 
      return new zacm("HYPGEOM_DIST", "5-5-V-V-V");
    case 524: 
      return new zacm("LOGNORM.DIST", "4-4-V-V-V");
    case 525: 
      return new zacm("LOGNORM.INV", "3-3-V-V-V");
    case 527: 
      return new zacm("MODE.MULT", "1-255-V-A-A");
    case 526: 
      return new zacm("MODE.SNGL", "1-255-V-A-A");
    case 528: 
      return new zacm("NEGBINOM.DIST", "4-4-V-V-V");
    case 529: 
      return new zacm("PERCENTRANK.INC", "2-3-V-RV-AV");
    case 530: 
      return new zacm("PERCENTRANK.EXC", "2-3-V-RV-AV");
    case 531: 
      return new zacm("POISSON.DIST", "3-3-V-V-V");
    case 532: 
      return new zacm("RANK.AVG", "2-3-V-VRV-VAV");
    case 533: 
      return new zacm("RANK.EQ", "2-3-V-VRV-VAV");
    case 534: 
      return new zacm("T.DIST", "3-3-V-V-V");
    case 535: 
      return new zacm("T.DIST.2T", "2-2-V-V-V");
    case 536: 
      return new zacm("T.DIST.RT", "2-2-V-V-V");
    case 537: 
      return new zacm("T.INV", "2-2-V-V-V");
    case 538: 
      return new zacm("T.INV.2T", "2-2-V-V-V");
    case 539: 
      return new zacm("T.TEST", "4-4-V-AAV-AAV");
    case 540: 
      return new zacm("VAR.P", "1-255-V-R-A");
    case 541: 
      return new zacm("VAR.S", "1-255-V-R-A");
    case 542: 
      return new zacm("WEIBULL.DIST", "4-4-V-V-V");
    case 543: 
      return new zacm("Z.TEST", "2-3-V-RV-AV");
    case 544: 
      return new zacm("GAMMALN.PRECISE", "1-1-V-V-V");
    case 547: 
      return new zacm("MAXIFS", "3-255-V-RRV-AAV-2");
    case 548: 
      return new zacm("MINIFS", "3-255-V-RRV-AAV-2");
    case 549: 
      return new zacm("IFS", "2-255-V-VR-VA-2");
    case 550: 
      return new zacm("SWITCH", "3-255-V-RV-RV");
    case 551: 
      return new zacm("CONCAT", "1-255-V-R-A");
    case 552: 
      return new zacm("TEXTJOIN", "3-3-V-VVR-VVA");
    }
    return null;
  }
  
  static
  {
    c.put("COUNT", Integer.valueOf(0));
    c.put("IF", Integer.valueOf(1));
    c.put("ISNA", Integer.valueOf(2));
    c.put("ISERROR", Integer.valueOf(3));
    c.put("SUM", Integer.valueOf(4));
    c.put("AVERAGE", Integer.valueOf(5));
    c.put("MIN", Integer.valueOf(6));
    c.put("MAX", Integer.valueOf(7));
    c.put("ROW", Integer.valueOf(8));
    c.put("COLUMN", Integer.valueOf(9));
    c.put("NA", Integer.valueOf(10));
    c.put("NPV", Integer.valueOf(11));
    c.put("STDEV", Integer.valueOf(12));
    c.put("DOLLAR", Integer.valueOf(13));
    c.put("FIXED", Integer.valueOf(14));
    c.put("SIN", Integer.valueOf(15));
    c.put("COS", Integer.valueOf(16));
    c.put("TAN", Integer.valueOf(17));
    c.put("ATAN", Integer.valueOf(18));
    c.put("PI", Integer.valueOf(19));
    c.put("SQRT", Integer.valueOf(20));
    c.put("EXP", Integer.valueOf(21));
    c.put("LN", Integer.valueOf(22));
    c.put("LOG10", Integer.valueOf(23));
    c.put("ABS", Integer.valueOf(24));
    c.put("INT", Integer.valueOf(25));
    c.put("SIGN", Integer.valueOf(26));
    c.put("ROUND", Integer.valueOf(27));
    c.put("LOOKUP", Integer.valueOf(28));
    c.put("INDEX", Integer.valueOf(29));
    c.put("REPT", Integer.valueOf(30));
    c.put("MID", Integer.valueOf(31));
    c.put("LEN", Integer.valueOf(32));
    c.put("VALUE", Integer.valueOf(33));
    c.put("TRUE", Integer.valueOf(34));
    c.put("FALSE", Integer.valueOf(35));
    c.put("AND", Integer.valueOf(36));
    c.put("OR", Integer.valueOf(37));
    c.put("NOT", Integer.valueOf(38));
    c.put("MOD", Integer.valueOf(39));
    c.put("DCOUNT", Integer.valueOf(40));
    c.put("DSUM", Integer.valueOf(41));
    c.put("DAVERAGE", Integer.valueOf(42));
    c.put("DMIN", Integer.valueOf(43));
    c.put("DMAX", Integer.valueOf(44));
    c.put("DSTDEV", Integer.valueOf(45));
    c.put("VAR", Integer.valueOf(46));
    c.put("DVAR", Integer.valueOf(47));
    c.put("TEXT", Integer.valueOf(48));
    c.put("LINEST", Integer.valueOf(49));
    c.put("TREND", Integer.valueOf(50));
    c.put("LOGEST", Integer.valueOf(51));
    c.put("GROWTH", Integer.valueOf(52));
    c.put("PV", Integer.valueOf(56));
    c.put("FV", Integer.valueOf(57));
    c.put("NPER", Integer.valueOf(58));
    c.put("PMT", Integer.valueOf(59));
    c.put("RATE", Integer.valueOf(60));
    c.put("IRR", Integer.valueOf(62));
    c.put("RAND", Integer.valueOf(63));
    c.put("MATCH", Integer.valueOf(64));
    c.put("DATE", Integer.valueOf(65));
    c.put("TIME", Integer.valueOf(66));
    c.put("DAY", Integer.valueOf(67));
    c.put("MONTH", Integer.valueOf(68));
    c.put("YEAR", Integer.valueOf(69));
    c.put("WEEKDAY", Integer.valueOf(70));
    c.put("HOUR", Integer.valueOf(71));
    c.put("MINUTE", Integer.valueOf(72));
    c.put("SECOND", Integer.valueOf(73));
    c.put("NOW", Integer.valueOf(74));
    c.put("AREAS", Integer.valueOf(75));
    c.put("ROWS", Integer.valueOf(76));
    c.put("COLUMNS", Integer.valueOf(77));
    c.put("OFFSET", Integer.valueOf(78));
    c.put("SEARCH", Integer.valueOf(82));
    c.put("TRANSPOSE", Integer.valueOf(83));
    c.put("TYPE", Integer.valueOf(86));
    c.put("ATAN2", Integer.valueOf(97));
    c.put("ASIN", Integer.valueOf(98));
    c.put("ACOS", Integer.valueOf(99));
    c.put("CHOOSE", Integer.valueOf(100));
    c.put("HLOOKUP", Integer.valueOf(101));
    c.put("VLOOKUP", Integer.valueOf(102));
    c.put("ISREF", Integer.valueOf(105));
    c.put("LOG", Integer.valueOf(109));
    c.put("CHAR", Integer.valueOf(111));
    c.put("LOWER", Integer.valueOf(112));
    c.put("UPPER", Integer.valueOf(113));
    c.put("PROPER", Integer.valueOf(114));
    c.put("LEFT", Integer.valueOf(115));
    c.put("RIGHT", Integer.valueOf(116));
    c.put("EXACT", Integer.valueOf(117));
    c.put("TRIM", Integer.valueOf(118));
    c.put("REPLACE", Integer.valueOf(119));
    c.put("SUBSTITUTE", Integer.valueOf(120));
    c.put("CODE", Integer.valueOf(121));
    c.put("FIND", Integer.valueOf(124));
    c.put("CELL", Integer.valueOf(125));
    c.put("ISERR", Integer.valueOf(126));
    c.put("ISTEXT", Integer.valueOf(127));
    c.put("ISNUMBER", Integer.valueOf(128));
    c.put("ISBLANK", Integer.valueOf(129));
    c.put("T", Integer.valueOf(130));
    c.put("N", Integer.valueOf(131));
    c.put("DATEVALUE", Integer.valueOf(140));
    c.put("TIMEVALUE", Integer.valueOf(141));
    c.put("SLN", Integer.valueOf(142));
    c.put("SYD", Integer.valueOf(143));
    c.put("DDB", Integer.valueOf(144));
    c.put("INDIRECT", Integer.valueOf(148));
    c.put("CLEAN", Integer.valueOf(162));
    c.put("MDETERM", Integer.valueOf(163));
    c.put("MINVERSE", Integer.valueOf(164));
    c.put("MMULT", Integer.valueOf(165));
    c.put("IPMT", Integer.valueOf(167));
    c.put("PPMT", Integer.valueOf(168));
    c.put("COUNTA", Integer.valueOf(169));
    c.put("PRODUCT", Integer.valueOf(183));
    c.put("FACT", Integer.valueOf(184));
    c.put("ISNONTEXT", Integer.valueOf(190));
    c.put("DPRODUCT", Integer.valueOf(189));
    c.put("STDEVP", Integer.valueOf(193));
    c.put("VARP", Integer.valueOf(194));
    c.put("DSTDEVP", Integer.valueOf(195));
    c.put("DVARP", Integer.valueOf(196));
    c.put("TRUNC", Integer.valueOf(197));
    c.put("ISLOGICAL", Integer.valueOf(198));
    c.put("DCOUNTA", Integer.valueOf(199));
    c.put("USDOLLAR", Integer.valueOf(204));
    c.put("ROUNDUP", Integer.valueOf(212));
    c.put("ROUNDDOWN", Integer.valueOf(213));
    c.put("ASC", Integer.valueOf(214));
    c.put("WIDECHAR", Integer.valueOf(215));
    c.put("DBCS", Integer.valueOf(215));
    c.put("RANK", Integer.valueOf(216));
    c.put("ADDRESS", Integer.valueOf(219));
    c.put("DAYS360", Integer.valueOf(220));
    c.put("TODAY", Integer.valueOf(221));
    c.put("VDB", Integer.valueOf(222));
    c.put("MEDIAN", Integer.valueOf(227));
    c.put("SUMPRODUCT", Integer.valueOf(228));
    c.put("SINH", Integer.valueOf(229));
    c.put("COSH", Integer.valueOf(230));
    c.put("TANH", Integer.valueOf(231));
    c.put("ASINH", Integer.valueOf(232));
    c.put("ACOSH", Integer.valueOf(233));
    c.put("ATANH", Integer.valueOf(234));
    c.put("DGET", Integer.valueOf(235));
    c.put("INFO", Integer.valueOf(244));
    c.put("DB", Integer.valueOf(247));
    c.put("FREQUENCY", Integer.valueOf(252));
    c.put("ERROR.TYPE", Integer.valueOf(261));
    c.put("AVEDEV", Integer.valueOf(269));
    c.put("BETADIST", Integer.valueOf(270));
    c.put("GAMMALN", Integer.valueOf(271));
    c.put("BETAINV", Integer.valueOf(272));
    c.put("BINOMDIST", Integer.valueOf(273));
    c.put("CHIDIST", Integer.valueOf(274));
    c.put("COMBIN", Integer.valueOf(276));
    c.put("CONFIDENCE", Integer.valueOf(277));
    c.put("CRITBINOM", Integer.valueOf(278));
    c.put("EVEN", Integer.valueOf(279));
    c.put("EXPONDIST", Integer.valueOf(280));
    c.put("FDIST", Integer.valueOf(281));
    c.put("FINV", Integer.valueOf(282));
    c.put("FISHER", Integer.valueOf(283));
    c.put("FISHERINV", Integer.valueOf(284));
    c.put("FLOOR", Integer.valueOf(285));
    c.put("GAMMADIST", Integer.valueOf(286));
    c.put("GAMMAINV", Integer.valueOf(287));
    c.put("CEILING", Integer.valueOf(288));
    c.put("HYPGEOMDIST", Integer.valueOf(289));
    c.put("NEGBINOMDIST", Integer.valueOf(292));
    c.put("NORMDIST", Integer.valueOf(293));
    c.put("NORMSDIST", Integer.valueOf(294));
    c.put("NORMINV", Integer.valueOf(295));
    c.put("NORMSINV", Integer.valueOf(296));
    c.put("STANDARDIZE", Integer.valueOf(297));
    c.put("ODD", Integer.valueOf(298));
    c.put("PERMUT", Integer.valueOf(299));
    c.put("POISSON", Integer.valueOf(300));
    c.put("TDIST", Integer.valueOf(301));
    c.put("WEIBULL", Integer.valueOf(302));
    c.put("SUMXMY2", Integer.valueOf(303));
    c.put("SUMX2MY2", Integer.valueOf(304));
    c.put("SUMX2PY2", Integer.valueOf(305));
    c.put("CHITEST", Integer.valueOf(306));
    c.put("CORREL", Integer.valueOf(307));
    c.put("COVAR", Integer.valueOf(308));
    c.put("FORECAST", Integer.valueOf(309));
    c.put("FTEST", Integer.valueOf(310));
    c.put("INTERCEPT", Integer.valueOf(311));
    c.put("PEARSON", Integer.valueOf(312));
    c.put("RSQ", Integer.valueOf(313));
    c.put("STEYX", Integer.valueOf(314));
    c.put("SLOPE", Integer.valueOf(315));
    c.put("TTEST", Integer.valueOf(316));
    c.put("PROB", Integer.valueOf(317));
    c.put("DEVSQ", Integer.valueOf(318));
    c.put("GEOMEAN", Integer.valueOf(319));
    c.put("HARMEAN", Integer.valueOf(320));
    c.put("SUMSQ", Integer.valueOf(321));
    c.put("KURT", Integer.valueOf(322));
    c.put("SKEW", Integer.valueOf(323));
    c.put("ZTEST", Integer.valueOf(324));
    c.put("LARGE", Integer.valueOf(325));
    c.put("SMALL", Integer.valueOf(326));
    c.put("QUARTILE", Integer.valueOf(327));
    c.put("QUARTILE.INC", Integer.valueOf(497));
    c.put("QUARTILE.EXC", Integer.valueOf(498));
    c.put("PERCENTILE", Integer.valueOf(328));
    c.put("PERCENTILE.INC", Integer.valueOf(495));
    c.put("PERCENTILE.EXC", Integer.valueOf(496));
    c.put("PERCENTRANK", Integer.valueOf(329));
    c.put("MODE", Integer.valueOf(330));
    c.put("TRIMMEAN", Integer.valueOf(331));
    c.put("TINV", Integer.valueOf(332));
    c.put("CONCATENATE", Integer.valueOf(336));
    c.put("POWER", Integer.valueOf(337));
    c.put("RADIANS", Integer.valueOf(342));
    c.put("DEGREES", Integer.valueOf(343));
    c.put("SUBTOTAL", Integer.valueOf(344));
    c.put("SUMIF", Integer.valueOf(345));
    c.put("COUNTIF", Integer.valueOf(346));
    c.put("COUNTBLANK", Integer.valueOf(347));
    c.put("ISPMT", Integer.valueOf(350));
    c.put("DATEDIF", Integer.valueOf(351));
    c.put("DATESTRING", Integer.valueOf(352));
    c.put("NUMBERSTRING", Integer.valueOf(353));
    c.put("ROMAN", Integer.valueOf(354));
    c.put("GETPIVOTDATA", Integer.valueOf(358));
    c.put("HYPERLINK", Integer.valueOf(359));
    c.put("PHONETIC", Integer.valueOf(360));
    c.put("AVERAGEA", Integer.valueOf(361));
    c.put("MAXA", Integer.valueOf(362));
    c.put("MINA", Integer.valueOf(363));
    c.put("STDEVPA", Integer.valueOf(364));
    c.put("VARPA", Integer.valueOf(365));
    c.put("STDEVA", Integer.valueOf(366));
    c.put("VARA", Integer.valueOf(367));
    c.put("CUBEVALUE", Integer.valueOf(380));
    c.put("CUBERANKEDMEMBER", Integer.valueOf(383));
    c.put("CUBEMEMBERPROPERTY", Integer.valueOf(382));
    c.put("CUBEMEMBER", Integer.valueOf(381));
    c.put("ISEVEN", Integer.valueOf(420));
    c.put("ISODD", Integer.valueOf(421));
    c.put("MROUND", Integer.valueOf(422));
    c.put("XIRR", Integer.valueOf(429));
    c.put("XNPV", Integer.valueOf(430));
    c.put("EDATE", Integer.valueOf(449));
    c.put("EOMONTH", Integer.valueOf(450));
    c.put("WORKDAY", Integer.valueOf(471));
    c.put("NETWORKDAYS", Integer.valueOf(472));
    c.put("YEARFRAC", Integer.valueOf(451));
    c.put("CONVERT", Integer.valueOf(468));
    c.put("ACCRINT", Integer.valueOf(469));
    c.put("ACCRINTM", Integer.valueOf(470));
    c.put("AMORDEGRC", Integer.valueOf(466));
    c.put("AMORLINC", Integer.valueOf(467));
    c.put("COUPDAYBS", Integer.valueOf(452));
    c.put("COUPDAYS", Integer.valueOf(453));
    c.put("COUPDAYSNC", Integer.valueOf(454));
    c.put("COUPNCD", Integer.valueOf(455));
    c.put("COUPNUM", Integer.valueOf(456));
    c.put("COUPPCD", Integer.valueOf(457));
    c.put("DISC", Integer.valueOf(435));
    c.put("DOLLARDE", Integer.valueOf(443));
    c.put("DOLLARFR", Integer.valueOf(444));
    c.put("DURATION", Integer.valueOf(458));
    c.put("EFFECT", Integer.valueOf(446));
    c.put("FVSCHEDULE", Integer.valueOf(476));
    c.put("CUBEKPIMEMBER", Integer.valueOf(477));
    c.put("CUBESET", Integer.valueOf(478));
    c.put("CUBESETCOUNT", Integer.valueOf(479));
    c.put("INTRATE", Integer.valueOf(433));
    c.put("MDURATION", Integer.valueOf(459));
    c.put("MIRR", Integer.valueOf(61));
    c.put("NOMINAL", Integer.valueOf(445));
    c.put("ODDFPRICE", Integer.valueOf(462));
    c.put("ODDFYIELD", Integer.valueOf(463));
    c.put("ODDLPRICE", Integer.valueOf(460));
    c.put("ODDLYIELD", Integer.valueOf(461));
    c.put("RANDBETWEEN", Integer.valueOf(464));
    c.put("PRICE", Integer.valueOf(441));
    c.put("PRICEDISC", Integer.valueOf(436));
    c.put("PRICEMAT", Integer.valueOf(431));
    c.put("RECEIVED", Integer.valueOf(434));
    c.put("TBILLEQ", Integer.valueOf(438));
    c.put("TBILLPRICE", Integer.valueOf(439));
    c.put("TBILLYIELD", Integer.valueOf(440));
    c.put("YIELD", Integer.valueOf(442));
    c.put("YIELDDISC", Integer.valueOf(437));
    c.put("YIELDMAT", Integer.valueOf(432));
    c.put("CUMIPMT", Integer.valueOf(448));
    c.put("CUMPRINC", Integer.valueOf(447));
    c.put("WEEKNUM", Integer.valueOf(465));
    c.put("ISOWEEKNUM", Integer.valueOf(545));
    c.put("FORMULATEXT", Integer.valueOf(546));
    c.put("IMSUB", Integer.valueOf(396));
    c.put("IMSQRT", Integer.valueOf(400));
    c.put("IMSIN", Integer.valueOf(404));
    c.put("IMDIV", Integer.valueOf(397));
    c.put("IMPOWER", Integer.valueOf(398));
    c.put("IMABS", Integer.valueOf(399));
    c.put("IMLN", Integer.valueOf(401));
    c.put("IMLOG2", Integer.valueOf(402));
    c.put("IMLOG10", Integer.valueOf(403));
    c.put("IMCOS", Integer.valueOf(405));
    c.put("IMEXP", Integer.valueOf(406));
    c.put("IMARGUMENT", Integer.valueOf(407));
    c.put("IMCONJUGATE", Integer.valueOf(408));
    c.put("IMAGINARY", Integer.valueOf(409));
    c.put("IMREAL", Integer.valueOf(410));
    c.put("COMPLEX", Integer.valueOf(411));
    c.put("IMSUM", Integer.valueOf(412));
    c.put("IMPRODUCT", Integer.valueOf(413));
    c.put("HEX2BIN", Integer.valueOf(384));
    c.put("HEX2DEC", Integer.valueOf(385));
    c.put("HEX2OCT", Integer.valueOf(386));
    c.put("DEC2BIN", Integer.valueOf(387));
    c.put("DEC2HEX", Integer.valueOf(388));
    c.put("DEC2OCT", Integer.valueOf(389));
    c.put("OCT2BIN", Integer.valueOf(390));
    c.put("OCT2HEX", Integer.valueOf(391));
    c.put("OCT2DEC", Integer.valueOf(392));
    c.put("BIN2DEC", Integer.valueOf(393));
    c.put("BIN2OCT", Integer.valueOf(394));
    c.put("BIN2HEX", Integer.valueOf(395));
    c.put("GESTEP", Integer.valueOf(419));
    c.put("ERF", Integer.valueOf(423));
    c.put("ERFC", Integer.valueOf(424));
    c.put("DELTA", Integer.valueOf(418));
    c.put("BESSELJ", Integer.valueOf(425));
    c.put("BESSELK", Integer.valueOf(426));
    c.put("BESSELY", Integer.valueOf(427));
    c.put("BESSELI", Integer.valueOf(428));
    c.put("AVERAGEIF", Integer.valueOf(483));
    c.put("CHIINV", Integer.valueOf(275));
    c.put("LOGINV", Integer.valueOf(291));
    c.put("LOGNORMDIST", Integer.valueOf(290));
    c.put("FACTDOUBLE", Integer.valueOf(415));
    c.put("GCD", Integer.valueOf(473));
    c.put("LCM", Integer.valueOf(475));
    c.put("MULTINOMIAL", Integer.valueOf(474));
    c.put("QUOTIENT", Integer.valueOf(417));
    c.put("SERIESSUM", Integer.valueOf(414));
    c.put("SQRTPI", Integer.valueOf(416));
    c.put("FINDB", Integer.valueOf(205));
    c.put("LEFTB", Integer.valueOf(208));
    c.put("LENB", Integer.valueOf(211));
    c.put("MIDB", Integer.valueOf(210));
    c.put("REPLACEB", Integer.valueOf(207));
    c.put("RIGHTB", Integer.valueOf(209));
    c.put("SEARCHB", Integer.valueOf(206));
    c.put("IFERROR", Integer.valueOf(480));
    c.put("COUNTIFS", Integer.valueOf(481));
    c.put("SUMIFS", Integer.valueOf(482));
    c.put("AVERAGEIFS", Integer.valueOf(484));
    c.put("DAYS", Integer.valueOf(485));
    c.put("WORKDAY.INTL", Integer.valueOf(486));
    c.put("NETWORKDAYS.INTL", Integer.valueOf(487));
    c.put("AGGREGATE", Integer.valueOf(488));
    c.put("IFNA", Integer.valueOf(489));
    c.put("BITAND", Integer.valueOf(490));
    c.put("BITOR", Integer.valueOf(491));
    c.put("BITXOR", Integer.valueOf(492));
    c.put("BITLSHIFT", Integer.valueOf(493));
    c.put("BITRSHIFT", Integer.valueOf(494));
    c.put("NORM.DIST", Integer.valueOf(499));
    c.put("NORM.S.DIST", Integer.valueOf(500));
    c.put("NORM.INV", Integer.valueOf(501));
    c.put("NORM.S.INV", Integer.valueOf(502));
    c.put("BETA.DIST", Integer.valueOf(503));
    c.put("BETA.INV", Integer.valueOf(504));
    c.put("BINOM.DIST", Integer.valueOf(505));
    c.put("BINOM.INV", Integer.valueOf(506));
    c.put("CHISQ.DIST", Integer.valueOf(507));
    c.put("CHISQ.DIST.RT", Integer.valueOf(508));
    c.put("CHISQ.INV", Integer.valueOf(509));
    c.put("CHISQ.INV.RT", Integer.valueOf(510));
    c.put("CHISQ.TEST", Integer.valueOf(511));
    c.put("CONFIDENCE.NORM", Integer.valueOf(512));
    c.put("CONFIDENCE.T", Integer.valueOf(513));
    c.put("COVARIANCE.P", Integer.valueOf(514));
    c.put("COVARIANCE.S", Integer.valueOf(515));
    c.put("F.DIST", Integer.valueOf(516));
    c.put("F.DIST.RT", Integer.valueOf(517));
    c.put("F.INV", Integer.valueOf(518));
    c.put("F.INV.RT", Integer.valueOf(519));
    c.put("F.TEST", Integer.valueOf(520));
    c.put("GAMMA.DIST", Integer.valueOf(521));
    c.put("GAMMA.INV", Integer.valueOf(522));
    c.put("HYPGEOM.DIST", Integer.valueOf(523));
    c.put("LOGNORM.DIST", Integer.valueOf(524));
    c.put("LOGNORM.INV", Integer.valueOf(525));
    c.put("MODE.MULT", Integer.valueOf(527));
    c.put("MODE.SNGL", Integer.valueOf(526));
    c.put("NEGBINOM.DIST", Integer.valueOf(528));
    c.put("PERCENTRANK.INC", Integer.valueOf(529));
    c.put("PERCENTRANK.EXC", Integer.valueOf(530));
    c.put("POISSON.DIST", Integer.valueOf(531));
    c.put("RANK.AVG", Integer.valueOf(532));
    c.put("RANK.EQ", Integer.valueOf(533));
    c.put("T.DIST", Integer.valueOf(534));
    c.put("T.DIST.2T", Integer.valueOf(535));
    c.put("T.DIST.RT", Integer.valueOf(536));
    c.put("T.INV", Integer.valueOf(537));
    c.put("T.INV.2T", Integer.valueOf(538));
    c.put("T.TEST", Integer.valueOf(539));
    c.put("VAR.P", Integer.valueOf(540));
    c.put("VAR.S", Integer.valueOf(541));
    c.put("WEIBULL.DIST", Integer.valueOf(542));
    c.put("Z.TEST", Integer.valueOf(543));
    c.put("GAMMALN.PRECISE", Integer.valueOf(544));
    c.put("MAXIFS", Integer.valueOf(547));
    c.put("MINIFS", Integer.valueOf(548));
    c.put("IFS", Integer.valueOf(549));
    c.put("SWITCH", Integer.valueOf(550));
    c.put("CONCAT", Integer.valueOf(551));
    c.put("TEXTJOIN", Integer.valueOf(552));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zacm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */