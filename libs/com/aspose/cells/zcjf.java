package com.aspose.cells;

import com.aspose.cells.a.c.zy;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zo;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;

class zcjf
  extends zq
{
  private static final com.aspose.cells.b.c.a.za i = new com.aspose.cells.b.c.a.za(new String[] { "#DIV/0!", "#NULL!", "#N/A", "#NAME?", "#NUM!", "#REF!", "#VALUE!", "", "\"\"", "FALSE", "TRUE", "()", " ", "+", "-", "*", "/", "^", "&", ",", ":", "%", "<", "=", "<=", ">=", ">", "<>", "ABS", "ACOS", "ACOSH", "ADDRESS", "ASC", "ASIN", "ASINH", "AND", "ARCTAN", "ATAN", "ATAN2", "ATANH", "AVEDEV", "AVERAGE", "AVERAGEA", "BETADIST", "BETAINV", "BINOMDIST", "CELL", "CEILING", "CHAR", "CHIDIST", "CHIINV", "CHITEST", "CHOOSE", "CLEAN", "CODE", "COLUMN", "COLUMNS", "COMBIN", "CONCATENATE", "CONFIDENCE", "CORREL", "COS", "COSH", "COUNT", "COUNTA", "COUNTBLANK", "COUNTIF", "COVAR", "CRITBINOM", "DATE", "DATEDIF", "DATESTRING", "DATEVALUE", "DAVERAGE", "DAYS360", "DCOUNT", "DCOUNTA", "DAY", "DB", "DDB", "DGET", "DEGREES", "DEVSQ", "DMAX", "DMIN", "DOLLAR", "DPRODUCT", "DSTDEV", "DSTDEVP", "DSUM", "DVAR", "DVARP", "ERROR.TYPE", "EVEN", "EXACT", "EXP", "EXPONDIST", "FACT", "FDIST", "FINV", "FIND", "FINDB", "FIXED", "FLOOR", "FORECAST", "FREQUENCY", "FTEST", "FV", "GAMMADIST", "GAMMAINV", "GAMMALN", "GEOMEAN", "GETPIVOTDATA", "HARMEAN", "HLOOKUP", "HOUR", "HYPERLINK", "HYPGEOMVERT", "IF", "INDEX", "INDIRECT", "INFO", "INT", "INTERCEPT", "IPMT", "IRR", "ISBLANK", "ISERR", "ISLOGICAL", "ISERROR", "ISNA", "ISNONTEXT", "ISNUMBER", "ISPMT", "ISREF", "ISTEXT", "KURT", "LARGE", "LEFT", "LEFTB", "LEN", "LENB", "LINEST", "LN", "LOG", "LOG10", "LOGNORMDIST", "LOGINV", "LOGEST", "NEGBINOMDIST", "LOOKUP", "LOWER", "MATCH", "MAX", "MAXA", "MEDIAN", "MDETERM", "MINVERSE", "MID", "MIDB", "MIN", "MINA", "MINUTE", "MIRR", "MMULT", "MOD", "MODE", "MONTH", "N", "NA", "NORMDIST", "NORMSDIST", "NORMINV", "NORMSINV", "NOT", "NOW", "NUMBERSTRING", "NPER", "NPV", "ODD", "OFFSET", "OR", "PEARSON", "PERCENTILE", "PERCENTRANK", "PERMUT", "PHONETIC", "PI", "PMT", "POISSON", "POWER", "PPMT", "PROB", "PRODUCT", "PROPER", "PV", "QUARTILE", "RADIANS", "RAND", "RANK", "RATE", "REPLACE", "REPLACEB", "REPT", "RIGHT", "RIGHTB", "ROMAN", "ROUND", "ROUNDDOWN", "ROUNDUP", "ROW", "ROWS", "RSQ", "SEARCH", "SEARCHB", "SECOND", "SIGN", "SIN", "SINH", "SKEW", "SLN", "SMALL", "SQRT", "STANDARDIZE", "STDEV", "STDEV.S", "_XLFN.STDEV.S", "STDEVA", "STDEVP", "STDEV.P", "_XLFN.STDEV.P", "STDEVPA", "STEYX", "SUBSTITUTE", "SUBTOTAL", "SUM", "SUMPRODUCT", "SUMIF", "SUMSQ", "SUMX2MY2", "SUMX2PY2", "SUMXMY2", "SYD", "T", "TAN", "TANH", "TDIST", "TEXT", "TIME", "TIMEVALUE", "TINV", "TODAY", "TRANSPOSE", "TREND", "TRIM", "TRIMMEAN", "TRUNC", "TTEST", "TYPE", "UPPER", "VALUE", "VAR", "VARA", "VARP", "VARPA", "VDB", "VLOOKUP", "WEEKDAY", "WEIBULL", "WIDECHAR", "YEAR", "ZTEST" });
  
  zcjf(WorksheetCollection paramWorksheetCollection)
  {
    super(paramWorksheetCollection);
  }
  
  boolean h()
  {
    return true;
  }
  
  private void a(zacf paramzacf)
  {
    String str = paramzacf.a();
    if ((str == null) || (str.length() == 0))
    {
      paramzacf.a(new byte[3]);
      paramzacf.d()[0] = 1;
      return;
    }
    if (str.charAt(0) == '"')
    {
      str = str.substring(1, 1 + (str.length() - 2));
      if (str.length() == 0)
      {
        paramzacf.a(new byte[3]);
        paramzacf.d()[0] = 1;
      }
    }
    else
    {
      if (ztr.d(str))
      {
        paramzacf.a(new byte[5]);
        paramzacf.d()[0] = 4;
        switch (i.a(str))
        {
        case 0: 
          paramzacf.d()[1] = 7;
          break;
        case 1: 
          paramzacf.d()[1] = 0;
          break;
        case 2: 
          paramzacf.d()[1] = 42;
          break;
        case 3: 
          paramzacf.d()[1] = 29;
          break;
        case 4: 
          paramzacf.d()[1] = 36;
          break;
        case 5: 
          paramzacf.d()[1] = 23;
          break;
        case 6: 
          paramzacf.d()[1] = 15;
        }
        return;
      }
      if (zarb.b(str))
      {
        double d = zo.a(str, com.aspose.cells.b.a.c.za.b());
        paramzacf.a(new byte[9]);
        paramzacf.d()[0] = 0;
        System.arraycopy(zc.a(d), 0, paramzacf.d(), 1, 8);
        return;
      }
      if (str.toUpperCase().equals("TRUE"))
      {
        paramzacf.a(new byte[2]);
        paramzacf.d()[0] = 2;
        paramzacf.d()[1] = 1;
        return;
      }
      if (str.toUpperCase().equals("FALSE"))
      {
        paramzacf.a(new byte[2]);
        paramzacf.d()[0] = 2;
        return;
      }
    }
    paramzacf.a(new byte[3 + str.length() * 2]);
    paramzacf.d()[0] = 1;
    System.arraycopy(zc.a(str.length()), 0, paramzacf.d(), 1, 2);
    System.arraycopy(Encoding.getUnicode().a(str), 0, paramzacf.d(), 3, str.length() * 2);
  }
  
  int[] a(zacf paramzacf, int paramInt1, int paramInt2)
  {
    String str = paramzacf.a();
    if (str == null)
    {
      paramzacf.a(zaul.e);
      return zacn.h;
    }
    int[] arrayOfInt = zacn.h;
    Object localObject;
    switch (paramzacf.g())
    {
    case 4: 
      int j = paramzacf.c() == null ? 0 : paramzacf.c().size();
      if (j > 254) {
        throw new CellsException(5, a);
      }
      paramzacf.a(new byte[4]);
      switch (paramInt1)
      {
      case 96: 
        paramzacf.d()[0] = 98;
        break;
      case 32: 
        paramzacf.d()[0] = 34;
        break;
      case 64: 
        paramzacf.d()[0] = 66;
      }
      paramzacf.d()[1] = ((byte)(j + 1));
      paramzacf.d()[2] = -1;
      return zacn.h;
    case 0: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() == 0)) {
        throw new CellsException(5, a);
      }
      localObject = paramzacf.c().get(0);
      if (localObject == null)
      {
        paramzacf.a(new byte[15]);
        paramzacf.d()[0] = 96;
        this.b += 8;
        zf.a(this.c, new byte[8]);
        return zacn.i;
      }
      if ((localObject instanceof zacf[][]))
      {
        zacf[][] arrayOfzacf = (zacf[][])localObject;
        paramzacf.a(new byte[15]);
        switch (paramInt1)
        {
        case 64: 
          paramzacf.d()[0] = 64;
          break;
        default: 
          paramzacf.d()[0] = 96;
        }
        ArrayList localArrayList = new ArrayList();
        int k = 8;
        for (int m = 0; m < arrayOfzacf.length; m++) {
          for (n = 0; n < arrayOfzacf[m].length; n++)
          {
            zacf localzacf = arrayOfzacf[m][n];
            a(localzacf);
            zf.a(localArrayList, localzacf.d());
            k += localzacf.d().length;
          }
        }
        byte[] arrayOfByte1 = new byte[k];
        zf.a(this.c, arrayOfByte1);
        this.b += k;
        System.arraycopy(zc.a(arrayOfzacf[0].length), 0, arrayOfByte1, 0, 4);
        System.arraycopy(zc.a(arrayOfzacf.length), 0, arrayOfByte1, 4, 4);
        int n = 8;
        for (int i1 = 0; i1 < localArrayList.size(); i1++)
        {
          byte[] arrayOfByte2 = (byte[])localArrayList.get(i1);
          System.arraycopy(arrayOfByte2, 0, arrayOfByte1, n, arrayOfByte2.length);
          n += arrayOfByte2.length;
        }
      }
      return zacn.i;
    case 1: 
      switch (i.a(str))
      {
      case 7: 
      case 8: 
        paramzacf.a(new byte[3]);
        paramzacf.d()[0] = 23;
        return zacn.g;
      case 1: 
        paramzacf.a(new byte[2]);
        paramzacf.d()[0] = 28;
        paramzacf.d()[1] = 0;
        return zacn.g;
      case 0: 
        paramzacf.a(new byte[2]);
        paramzacf.d()[0] = 28;
        paramzacf.d()[1] = 7;
        return zacn.g;
      case 6: 
        paramzacf.a(new byte[2]);
        paramzacf.d()[0] = 28;
        paramzacf.d()[1] = 15;
        return zacn.g;
      case 5: 
        paramzacf.a(new byte[2]);
        paramzacf.d()[0] = 28;
        paramzacf.d()[1] = 23;
        return zacn.g;
      case 3: 
        paramzacf.a(new byte[2]);
        paramzacf.d()[0] = 28;
        paramzacf.d()[1] = 29;
        return zacn.g;
      case 4: 
        paramzacf.a(new byte[2]);
        paramzacf.d()[0] = 28;
        paramzacf.d()[1] = 36;
        return zacn.g;
      case 2: 
        paramzacf.a(new byte[2]);
        paramzacf.d()[0] = 28;
        paramzacf.d()[1] = 42;
        return zacn.g;
      case 9: 
        paramzacf.a(new byte[2]);
        paramzacf.d()[0] = 29;
        break;
      case 10: 
        paramzacf.a(new byte[2]);
        paramzacf.d()[0] = 29;
        paramzacf.d()[1] = 1;
        break;
      case 11: 
        paramzacf.a(new byte[1]);
        paramzacf.d()[0] = 21;
        return new int[] { paramInt1 };
      default: 
        if (zy.a(str, "true"))
        {
          paramzacf.a(new byte[2]);
          paramzacf.d()[0] = 29;
          paramzacf.d()[1] = 1;
        }
        else if (zy.a(str, "false"))
        {
          paramzacf.a(new byte[2]);
          paramzacf.d()[0] = 29;
        }
        else
        {
          a(paramzacf, paramInt1);
        }
        break;
      }
      return zacn.h;
    }
    switch (i.a(str))
    {
    case 12: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      paramzacf.a(zaul.r);
      arrayOfInt = zacn.h;
      break;
    case 13: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() == 0) || (paramzacf.c().size() > 2)) {
        throw new CellsException(5, a);
      }
      if (paramzacf.c().size() == 1) {
        paramzacf.a(zaul.a);
      }
      if (paramzacf.c().size() == 2) {
        paramzacf.a(zaul.f);
      }
      arrayOfInt = zacn.g;
      break;
    case 14: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() == 0) || (paramzacf.c().size() > 2)) {
        throw new CellsException(5, a);
      }
      if (paramzacf.c().size() == 1) {
        paramzacf.a(zaul.b);
      }
      if (paramzacf.c().size() == 2) {
        paramzacf.a(zaul.g);
      }
      arrayOfInt = zacn.g;
      break;
    case 15: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      paramzacf.a(zaul.h);
      arrayOfInt = zacn.g;
      break;
    case 16: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      paramzacf.a(zaul.i);
      arrayOfInt = zacn.g;
      break;
    case 17: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      paramzacf.a(zaul.j);
      arrayOfInt = zacn.g;
      break;
    case 18: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      paramzacf.a(zaul.k);
      arrayOfInt = zacn.g;
      break;
    case 19: 
      paramzacf.a(zaul.s);
      arrayOfInt = zacn.h;
      break;
    case 20: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      paramzacf.a(zaul.t);
      arrayOfInt = zacn.h;
      break;
    case 21: 
      paramzacf.a(zaul.c);
      arrayOfInt = zacn.g;
      break;
    case 11: 
      paramzacf.a(zaul.d);
      arrayOfInt = new int[] { paramInt1 };
      break;
    case 22: 
      paramzacf.a(zaul.l);
      arrayOfInt = zacn.g;
      break;
    case 23: 
      paramzacf.a(zaul.n);
      arrayOfInt = zacn.g;
      break;
    case 24: 
      paramzacf.a(zaul.m);
      arrayOfInt = zacn.g;
      break;
    case 25: 
      paramzacf.a(zaul.o);
      arrayOfInt = zacn.g;
      break;
    case 26: 
      paramzacf.a(zaul.p);
      arrayOfInt = zacn.g;
      break;
    case 27: 
      paramzacf.a(zaul.q);
      arrayOfInt = zacn.g;
      break;
    case 28: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 24, paramInt1, paramInt2);
      break;
    case 29: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 99, paramInt1, paramInt2);
      break;
    case 30: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 233, paramInt1, paramInt2);
      break;
    case 31: 
      arrayOfInt = a(paramzacf, 219, paramInt1, paramInt2);
      break;
    case 32: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 214, paramInt1, paramInt2);
      break;
    case 33: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 98, paramInt1, paramInt2);
      break;
    case 34: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 232, paramInt1, paramInt2);
      break;
    case 35: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() == 0)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 36, paramInt1, paramInt2);
      break;
    case 36: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 18, paramInt1, paramInt2);
      break;
    case 37: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 18, paramInt1, paramInt2);
      break;
    case 38: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 97, paramInt1, paramInt2);
      break;
    case 39: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 234, paramInt1, paramInt2);
      break;
    case 40: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() == 0)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 269, paramInt1, paramInt2);
      break;
    case 41: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() == 0)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 5, paramInt1, paramInt2);
      break;
    case 42: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() == 0)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 361, paramInt1, paramInt2);
      break;
    case 43: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() < 3) || (paramzacf.c().size() > 5)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 270, paramInt1, paramInt2);
      break;
    case 44: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() < 3) || (paramzacf.c().size() > 5)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 272, paramInt1, paramInt2);
      break;
    case 45: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 4)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 273, paramInt1, paramInt2);
      break;
    case 46: 
      if ((paramzacf.c() == null) || ((paramzacf.c().size() != 1) && (paramzacf.c().size() != 2))) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 125, paramInt1, paramInt2);
      break;
    case 47: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 288, paramInt1, paramInt2);
      break;
    case 48: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 111, paramInt1, paramInt2);
      break;
    case 49: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 274, paramInt1, paramInt2);
      break;
    case 50: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 275, paramInt1, paramInt2);
      break;
    case 51: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 306, paramInt1, paramInt2);
      break;
    case 52: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() <= 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 100, paramInt1, paramInt2);
      break;
    case 53: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 162, paramInt1, paramInt2);
      break;
    case 54: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 121, paramInt1, paramInt2);
      break;
    case 55: 
      if ((paramzacf.c() != null) && (paramzacf.c().size() > 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 9, paramInt1, paramInt2);
      break;
    case 56: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 77, paramInt1, paramInt2);
      break;
    case 57: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 276, paramInt1, paramInt2);
      break;
    case 58: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() < 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 336, paramInt1, paramInt2);
      break;
    case 59: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 277, paramInt1, paramInt2);
      break;
    case 60: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 307, paramInt1, paramInt2);
      break;
    case 61: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 16, paramInt1, paramInt2);
      break;
    case 62: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 230, paramInt1, paramInt2);
      break;
    case 63: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() == 0)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 0, paramInt1, paramInt2);
      break;
    case 64: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() == 0)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 169, paramInt1, paramInt2);
      break;
    case 65: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 347, paramInt1, paramInt2);
      break;
    case 66: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 346, paramInt1, paramInt2);
      break;
    case 67: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 308, paramInt1, paramInt2);
      break;
    case 68: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 278, paramInt1, paramInt2);
      break;
    case 69: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 65, paramInt1, paramInt2);
      break;
    case 70: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 351, paramInt1, paramInt2);
      break;
    case 71: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 352, paramInt1, paramInt2);
      break;
    case 72: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 140, paramInt1, paramInt2);
      break;
    case 73: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 42, paramInt1, paramInt2);
      break;
    case 74: 
      if ((paramzacf.c() == null) || ((paramzacf.c().size() != 2) && (paramzacf.c().size() != 3))) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 220, paramInt1, paramInt2);
      break;
    case 75: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 40, paramInt1, paramInt2);
      break;
    case 76: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 199, paramInt1, paramInt2);
      break;
    case 77: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 67, paramInt1, paramInt2);
      break;
    case 78: 
      if ((paramzacf.c() == null) || ((paramzacf.c().size() != 4) && (paramzacf.c().size() != 5))) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 247, paramInt1, paramInt2);
      break;
    case 79: 
      if ((paramzacf.c() == null) || ((paramzacf.c().size() != 4) && (paramzacf.c().size() != 5))) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 144, paramInt1, paramInt2);
      break;
    case 80: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 235, paramInt1, paramInt2);
      break;
    case 81: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 343, paramInt1, paramInt2);
      break;
    case 82: 
      if (paramzacf.c() == null) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 318, paramInt1, paramInt2);
      break;
    case 83: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 44, paramInt1, paramInt2);
      break;
    case 84: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 43, paramInt1, paramInt2);
      break;
    case 85: 
      if ((paramzacf.c() == null) || ((paramzacf.c().size() != 1) && (paramzacf.c().size() != 2))) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 204, paramInt1, paramInt2);
      break;
    case 86: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 189, paramInt1, paramInt2);
      break;
    case 87: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 45, paramInt1, paramInt2);
      break;
    case 88: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 195, paramInt1, paramInt2);
      break;
    case 89: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 41, paramInt1, paramInt2);
      break;
    case 90: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 47, paramInt1, paramInt2);
      break;
    case 91: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 196, paramInt1, paramInt2);
      break;
    case 92: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 261, paramInt1, paramInt2);
      break;
    case 93: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 279, paramInt1, paramInt2);
      break;
    case 94: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 117, paramInt1, paramInt2);
      break;
    case 95: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 21, paramInt1, paramInt2);
      break;
    case 96: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 280, paramInt1, paramInt2);
      break;
    case 97: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 184, paramInt1, paramInt2);
      break;
    case 9: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() == 0)) {
        arrayOfInt = b(paramzacf, 35, paramInt1, paramInt2);
      } else {
        throw new CellsException(5, a);
      }
      break;
    case 98: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 281, paramInt1, paramInt2);
      break;
    case 99: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 282, paramInt1, paramInt2);
      break;
    case 100: 
      if ((paramzacf.c() == null) || ((paramzacf.c().size() != 2) && (paramzacf.c().size() != 3))) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 124, paramInt1, paramInt2);
      break;
    case 101: 
      if ((paramzacf.c() == null) || ((paramzacf.c().size() != 2) && (paramzacf.c().size() != 3))) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 205, paramInt1, paramInt2);
      break;
    case 102: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() < 1) || (paramzacf.c().size() > 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 14, paramInt1, paramInt2);
      break;
    case 103: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 285, paramInt1, paramInt2);
      break;
    case 104: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 309, paramInt1, paramInt2);
      break;
    case 105: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 252, paramInt1, paramInt2);
      break;
    case 106: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 310, paramInt1, paramInt2);
      break;
    case 107: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() < 3) || (paramzacf.c().size() > 5)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 57, paramInt1, paramInt2);
      break;
    case 108: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 4)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 286, paramInt1, paramInt2);
      break;
    case 109: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 287, paramInt1, paramInt2);
      break;
    case 110: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 271, paramInt1, paramInt2);
      break;
    case 111: 
      if (paramzacf.c() == null) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 319, paramInt1, paramInt2);
      break;
    case 112: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() < 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 358, paramInt1, paramInt2);
      break;
    case 113: 
      if (paramzacf.c() == null) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 320, paramInt1, paramInt2);
      break;
    case 114: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() < 3) || (paramzacf.c().size() > 4)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 101, paramInt1, paramInt2);
      break;
    case 115: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 71, paramInt1, paramInt2);
      break;
    case 116: 
      if ((paramzacf.c() == null) || ((paramzacf.c().size() != 2) && (paramzacf.c().size() != 1))) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 359, paramInt1, paramInt2);
      break;
    case 117: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 4)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 289, paramInt1, paramInt2);
      break;
    case 118: 
      if ((paramzacf.c() == null) || ((paramzacf.c().size() != 2) && (paramzacf.c().size() != 3))) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 1, paramInt1, paramInt2);
      break;
    case 119: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() < 2) || (paramzacf.c().size() > 4)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 29, paramInt1, paramInt2);
      break;
    case 120: 
      if ((paramzacf.c() == null) || ((paramzacf.c().size() != 1) && (paramzacf.c().size() != 2))) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 148, paramInt1, paramInt2);
      b(true);
      break;
    case 121: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 244, paramInt1, paramInt2);
      break;
    case 122: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 25, paramInt1, paramInt2);
      break;
    case 123: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 311, paramInt1, paramInt2);
      break;
    case 124: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() < 4) || (paramzacf.c().size() > 6)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 167, paramInt1, paramInt2);
      break;
    case 125: 
      if ((paramzacf.c() == null) || ((paramzacf.c().size() != 1) && (paramzacf.c().size() != 2))) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 62, paramInt1, paramInt2);
      break;
    case 126: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 129, paramInt1, paramInt2);
      break;
    case 127: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 126, paramInt1, paramInt2);
      break;
    case 128: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 198, paramInt1, paramInt2);
      break;
    case 129: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 3, paramInt1, paramInt2);
      break;
    case 130: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 2, paramInt1, paramInt2);
      break;
    case 131: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 190, paramInt1, paramInt2);
      break;
    case 132: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 128, paramInt1, paramInt2);
      break;
    case 133: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 4)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 350, paramInt1, paramInt2);
      break;
    case 134: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 105, paramInt1, paramInt2);
      break;
    case 135: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 127, paramInt1, paramInt2);
      break;
    case 136: 
      if (paramzacf.c() == null) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 322, paramInt1, paramInt2);
      break;
    case 137: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 325, paramInt1, paramInt2);
      break;
    case 138: 
      if ((paramzacf.c() == null) || ((paramzacf.c().size() != 1) && (paramzacf.c().size() != 2))) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 115, paramInt1, paramInt2);
      break;
    case 139: 
      if ((paramzacf.c() == null) || ((paramzacf.c().size() != 1) && (paramzacf.c().size() != 2))) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 208, paramInt1, paramInt2);
      break;
    case 140: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 32, paramInt1, paramInt2);
      break;
    case 141: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 211, paramInt1, paramInt2);
      break;
    case 142: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() == 0) || (paramzacf.c().size() > 4)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 49, paramInt1, paramInt2);
      break;
    case 143: 
      arrayOfInt = b(paramzacf, 22, paramInt1, paramInt2);
      break;
    case 144: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() < 1) || (paramzacf.c().size() > 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 109, paramInt1, paramInt2);
      break;
    case 145: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 23, paramInt1, paramInt2);
      break;
    case 146: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 290, paramInt1, paramInt2);
      break;
    case 147: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 291, paramInt1, paramInt2);
      break;
    case 148: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() > 4) || (paramzacf.c().size() < 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 51, paramInt1, paramInt2);
      break;
    case 149: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 292, paramInt1, paramInt2);
      break;
    case 150: 
      if ((paramzacf.c() == null) || ((paramzacf.c().size() != 2) && (paramzacf.c().size() != 3))) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 28, paramInt1, paramInt2);
      break;
    case 151: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 112, paramInt1, paramInt2);
      break;
    case 152: 
      if ((paramzacf.c() == null) || ((paramzacf.c().size() != 2) && (paramzacf.c().size() != 3))) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 64, paramInt1, paramInt2);
      break;
    case 153: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() == 0)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 7, paramInt1, paramInt2);
      break;
    case 154: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() == 0)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 362, paramInt1, paramInt2);
      break;
    case 155: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() == 0)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 227, paramInt1, paramInt2);
      break;
    case 156: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 163, paramInt1, paramInt2);
      break;
    case 157: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 164, paramInt1, paramInt2);
      break;
    case 158: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 31, paramInt1, paramInt2);
      break;
    case 159: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 210, paramInt1, paramInt2);
      break;
    case 160: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() == 0)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 6, paramInt1, paramInt2);
      break;
    case 161: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() == 0)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 363, paramInt1, paramInt2);
      break;
    case 162: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 72, paramInt1, paramInt2);
      break;
    case 163: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 61, paramInt1, paramInt2);
      break;
    case 164: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 165, paramInt1, paramInt2);
      break;
    case 165: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 39, paramInt1, paramInt2);
      break;
    case 166: 
      if (paramzacf.c() == null) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 330, paramInt1, paramInt2);
      break;
    case 167: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 68, paramInt1, paramInt2);
      break;
    case 168: 
      arrayOfInt = b(paramzacf, 131, paramInt1, paramInt2);
      break;
    case 169: 
      arrayOfInt = b(paramzacf, 10, paramInt1, paramInt2);
      break;
    case 170: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 4)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 293, paramInt1, paramInt2);
      break;
    case 171: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 294, paramInt1, paramInt2);
      break;
    case 172: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 295, paramInt1, paramInt2);
      break;
    case 173: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 296, paramInt1, paramInt2);
      break;
    case 174: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 38, paramInt1, paramInt2);
      break;
    case 175: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() == 0)) {
        arrayOfInt = b(paramzacf, 74, paramInt1, paramInt2);
      } else {
        throw new CellsException(5, a);
      }
      break;
    case 176: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 353, paramInt1, paramInt2);
      break;
    case 177: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() < 3) || (paramzacf.c().size() > 5)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 58, paramInt1, paramInt2);
      break;
    case 178: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() < 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 11, paramInt1, paramInt2);
      break;
    case 179: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 298, paramInt1, paramInt2);
      break;
    case 180: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() < 3) || (paramzacf.c().size() > 5)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 78, paramInt1, paramInt2);
      b(true);
      break;
    case 181: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() == 0)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 37, paramInt1, paramInt2);
      break;
    case 182: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 312, paramInt1, paramInt2);
      break;
    case 183: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 328, paramInt1, paramInt2);
      break;
    case 184: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() < 2) || (paramzacf.c().size() > 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 329, paramInt1, paramInt2);
      break;
    case 185: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 299, paramInt1, paramInt2);
      break;
    case 186: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 360, paramInt1, paramInt2);
      break;
    case 187: 
      if ((paramzacf.c() != null) && (paramzacf.c().size() != 0)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 19, paramInt1, paramInt2);
      break;
    case 188: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() < 3) || (paramzacf.c().size() > 5)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 59, paramInt1, paramInt2);
      break;
    case 189: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 300, paramInt1, paramInt2);
      break;
    case 190: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 337, paramInt1, paramInt2);
      break;
    case 191: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() < 4) || (paramzacf.c().size() > 6)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 168, paramInt1, paramInt2);
      break;
    case 192: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() < 3) || (paramzacf.c().size() > 4)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 317, paramInt1, paramInt2);
      break;
    case 193: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() < 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 183, paramInt1, paramInt2);
      break;
    case 194: 
      if ((paramzacf.c() != null) && (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 114, paramInt1, paramInt2);
      break;
    case 195: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() < 3) || (paramzacf.c().size() > 5)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 56, paramInt1, paramInt2);
      break;
    case 196: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 327, paramInt1, paramInt2);
      break;
    case 197: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 342, paramInt1, paramInt2);
      break;
    case 198: 
      if ((paramzacf.c() != null) && (paramzacf.c().size() != 0)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 63, paramInt1, paramInt2);
      break;
    case 199: 
      if ((paramzacf.c() == null) || ((paramzacf.c().size() != 2) && (paramzacf.c().size() != 3))) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 216, paramInt1, paramInt2);
      break;
    case 200: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() < 3) || (paramzacf.c().size() > 6)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 60, paramInt1, paramInt2);
      break;
    case 201: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 4)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 119, paramInt1, paramInt2);
      break;
    case 202: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 4)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 207, paramInt1, paramInt2);
      break;
    case 203: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 30, paramInt1, paramInt2);
      break;
    case 204: 
      if ((paramzacf.c() == null) || ((paramzacf.c().size() != 1) && (paramzacf.c().size() != 2))) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 116, paramInt1, paramInt2);
      break;
    case 205: 
      if ((paramzacf.c() == null) || ((paramzacf.c().size() != 1) && (paramzacf.c().size() != 2))) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 209, paramInt1, paramInt2);
      break;
    case 206: 
      if ((paramzacf.c() == null) || ((paramzacf.c().size() != 1) && (paramzacf.c().size() != 2))) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 354, paramInt1, paramInt2);
      break;
    case 207: 
      if (paramzacf.c() == null) {
        throw new CellsException(5, a);
      }
      if (paramzacf.c().size() == 1)
      {
        localObject = new zacf();
        ((zacf)localObject).a("0");
        ((zacf)localObject).a(1);
        paramzacf.a((zacf)localObject);
      }
      if (paramzacf.c().size() != 2) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 27, paramInt1, paramInt2);
      break;
    case 208: 
      if (paramzacf.c() == null) {
        throw new CellsException(5, a);
      }
      if (paramzacf.c().size() == 1)
      {
        localObject = new zacf();
        ((zacf)localObject).a("0");
        ((zacf)localObject).a(1);
        paramzacf.a((zacf)localObject);
      }
      if (paramzacf.c().size() != 2) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 213, paramInt1, paramInt2);
      break;
    case 209: 
      if (paramzacf.c() == null) {
        throw new CellsException(5, a);
      }
      if (paramzacf.c().size() == 1)
      {
        localObject = new zacf();
        ((zacf)localObject).a("0");
        ((zacf)localObject).a(1);
        paramzacf.a((zacf)localObject);
      }
      if (paramzacf.c().size() != 2) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 212, paramInt1, paramInt2);
      break;
    case 210: 
      if ((paramzacf.c() != null) && (paramzacf.c().size() > 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 8, paramInt1, paramInt2);
      break;
    case 211: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 76, paramInt1, paramInt2);
      break;
    case 212: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 313, paramInt1, paramInt2);
      break;
    case 213: 
      if ((paramzacf.c() == null) || ((paramzacf.c().size() != 2) && (paramzacf.c().size() != 3))) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 82, paramInt1, paramInt2);
      break;
    case 214: 
      if ((paramzacf.c() == null) || ((paramzacf.c().size() != 2) && (paramzacf.c().size() != 3))) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 206, paramInt1, paramInt2);
      break;
    case 215: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 73, paramInt1, paramInt2);
      break;
    case 216: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 26, paramInt1, paramInt2);
      break;
    case 217: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 15, paramInt1, paramInt2);
      break;
    case 218: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 229, paramInt1, paramInt2);
      break;
    case 219: 
      if (paramzacf.c() == null) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 323, paramInt1, paramInt2);
      break;
    case 220: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 142, paramInt1, paramInt2);
      break;
    case 221: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 326, paramInt1, paramInt2);
      break;
    case 222: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 20, paramInt1, paramInt2);
      break;
    case 223: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 297, paramInt1, paramInt2);
      break;
    case 224: 
    case 225: 
    case 226: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() == 0)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 12, paramInt1, paramInt2);
      break;
    case 227: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() == 0)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 366, paramInt1, paramInt2);
      break;
    case 228: 
    case 229: 
    case 230: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() == 0)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 193, paramInt1, paramInt2);
      break;
    case 231: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() == 0)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 364, paramInt1, paramInt2);
      break;
    case 232: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 314, paramInt1, paramInt2);
      break;
    case 233: 
      if ((paramzacf.c() == null) || ((paramzacf.c().size() != 3) && (paramzacf.c().size() != 4))) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 120, paramInt1, paramInt2);
      break;
    case 234: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() < 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 344, paramInt1, paramInt2);
      break;
    case 235: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() == 0)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = c(paramzacf, paramInt1);
      break;
    case 236: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() == 0)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 228, paramInt1, paramInt2);
      break;
    case 237: 
      if ((paramzacf.c() == null) || ((paramzacf.c().size() != 2) && (paramzacf.c().size() != 3))) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 345, paramInt1, paramInt2);
      break;
    case 238: 
      if ((paramzacf.c() != null) && (paramzacf.c().size() > 30)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 321, paramInt1, paramInt2);
      break;
    case 239: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 304, paramInt1, paramInt2);
      break;
    case 240: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 305, paramInt1, paramInt2);
      break;
    case 241: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 303, paramInt1, paramInt2);
      break;
    case 242: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 4)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 143, paramInt1, paramInt2);
      break;
    case 243: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 130, paramInt1, paramInt2);
      break;
    case 244: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 17, paramInt1, paramInt2);
      break;
    case 245: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 231, paramInt1, paramInt2);
      break;
    case 246: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 301, paramInt1, paramInt2);
      break;
    case 247: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 48, paramInt1, paramInt2);
      break;
    case 248: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 66, paramInt1, paramInt2);
      break;
    case 249: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 141, paramInt1, paramInt2);
      break;
    case 250: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 332, paramInt1, paramInt2);
      break;
    case 251: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() == 0)) {
        arrayOfInt = b(paramzacf, 221, paramInt1, paramInt2);
      } else {
        throw new CellsException(5, a);
      }
      break;
    case 252: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 83, paramInt1, paramInt2);
      break;
    case 253: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() < 1) || (paramzacf.c().size() > 4)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 50, paramInt1, paramInt2);
      break;
    case 254: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 118, paramInt1, paramInt2);
      break;
    case 255: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 2)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 331, paramInt1, paramInt2);
      break;
    case 10: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() == 0)) {
        arrayOfInt = b(paramzacf, 34, paramInt1, paramInt2);
      } else {
        throw new CellsException(5, a);
      }
      break;
    case 256: 
      if ((paramzacf.c() == null) || ((paramzacf.c().size() != 1) && (paramzacf.c().size() != 2))) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 197, paramInt1, paramInt2);
      break;
    case 257: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 4)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 316, paramInt1, paramInt2);
      break;
    case 258: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 86, paramInt1, paramInt2);
      break;
    case 259: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 113, paramInt1, paramInt2);
      break;
    case 260: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 33, paramInt1, paramInt2);
      break;
    case 261: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() <= 0)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 46, paramInt1, paramInt2);
      break;
    case 262: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() <= 0)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 367, paramInt1, paramInt2);
      break;
    case 263: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() <= 0)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 194, paramInt1, paramInt2);
      break;
    case 264: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() <= 0)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 365, paramInt1, paramInt2);
      break;
    case 265: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() <= 0)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 222, paramInt1, paramInt2);
      break;
    case 266: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() < 3) || (paramzacf.c().size() > 4)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 102, paramInt1, paramInt2);
      break;
    case 267: 
      if ((paramzacf.c() == null) || ((paramzacf.c().size() != 1) && (paramzacf.c().size() != 2))) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 70, paramInt1, paramInt2);
      break;
    case 268: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 4)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 302, paramInt1, paramInt2);
      break;
    case 269: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 215, paramInt1, paramInt2);
      break;
    case 270: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() != 1)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = b(paramzacf, 69, paramInt1, paramInt2);
      break;
    case 271: 
      if ((paramzacf.c() == null) || (paramzacf.c().size() < 2) || (paramzacf.c().size() > 3)) {
        throw new CellsException(5, a);
      }
      arrayOfInt = a(paramzacf, 324, paramInt1, paramInt2);
      break;
    default: 
      if ((paramzacf.g() == 3) || (paramzacf.g() == 4))
      {
        arrayOfInt = b(paramzacf, paramInt1, paramInt2);
      }
      else
      {
        a(paramzacf, paramInt1);
        arrayOfInt = zacn.g;
      }
      break;
    }
    return arrayOfInt;
  }
  
  private void a(zacf paramzacf, int paramInt)
  {
    String str = paramzacf.a();
    if ((str.charAt(0) == '"') && (str.charAt(str.length() - 1) == '"'))
    {
      try
      {
        int j = str.length() - 2;
        if (j > 255) {
          throw new CellsException(5, a);
        }
        if (j == 0)
        {
          paramzacf.a(new byte[3]);
          paramzacf.d()[0] = 23;
          return;
        }
        byte[] arrayOfByte1 = Encoding.getUnicode().a(str);
        paramzacf.a(new byte[3 + j * 2]);
        paramzacf.d()[0] = 23;
        System.arraycopy(zc.a(j), 0, paramzacf.d(), 1, 2);
        System.arraycopy(arrayOfByte1, 2, paramzacf.d(), 3, j + j);
      }
      catch (Exception localException)
      {
        throw new CellsException(5, "Invalid formula");
      }
      return;
    }
    boolean bool1 = zarb.b(str);
    int m;
    if (bool1)
    {
      double d = zo.a(str, com.aspose.cells.b.a.c.za.b());
      if ((d < 0.0D) || (d > 65535.0D) || (d - ((int)d & 0xFFFF) > Double.MIN_VALUE))
      {
        paramzacf.a(new byte[9]);
        paramzacf.d()[0] = 31;
        System.arraycopy(zc.a(d), 0, paramzacf.d(), 1, 8);
      }
      else
      {
        m = (int)d;
        paramzacf.a(new byte[3]);
        paramzacf.d()[0] = 30;
        System.arraycopy(zc.a(m), 0, paramzacf.d(), 1, 2);
      }
    }
    else
    {
      Object localObject1;
      if (b(paramzacf.a()))
      {
        localObject1 = zbth.a(this.d, paramzacf.a());
        paramzacf.a(new byte[7]);
        switch (paramInt)
        {
        case 32: 
          paramzacf.d()[0] = 57;
          break;
        case 64: 
          paramzacf.d()[0] = 89;
          break;
        case 96: 
          paramzacf.d()[0] = 121;
        }
        System.arraycopy(zc.a(localObject1[0]), 0, paramzacf.d(), 1, 2);
        System.arraycopy(zc.a(localObject1[1]), 0, paramzacf.d(), 3, 2);
        return;
      }
      Object localObject2;
      if (this.d.c() != null)
      {
        localObject1 = null;
        if ((this.d.c() instanceof zawp))
        {
          localObject2 = (zawp)this.d.c();
          m = -1;
          m = ((zawp)localObject2).a(paramzacf.a());
          if (m != -1)
          {
            localObject1 = new byte[6];
            localObject1[0] = 24;
            localObject1[1] = 29;
            System.arraycopy(zc.a(m), 0, localObject1, 2, 4);
            paramzacf.a((byte[])localObject1);
          }
          else
          {
            throw new CellsException(12, "References,names,and arrays are not supported in the PivotTable formulas.");
          }
        }
        else if ((this.d.c() instanceof zaxa))
        {
          localObject2 = (zaxa)this.d.c();
          m = -1;
          m = ((zaxa)localObject2).a(paramzacf.a());
          if (m != -1)
          {
            localObject1 = new byte[6];
            localObject1[0] = 24;
            localObject1[1] = 29;
            System.arraycopy(zc.a(m), 0, localObject1, 2, 4);
            paramzacf.a((byte[])localObject1);
          }
          else
          {
            throw new CellsException(12, "Pivot table can only refer to items in the same field as calcualted item");
          }
        }
        return;
      }
      if (a(paramzacf.a()))
      {
        int k = 0;
        paramzacf.a(new byte[14]);
        localObject2 = new boolean[] { k };
        byte[] arrayOfByte2 = zbvl.a(paramzacf.d(), this.d, this.g, this.e, this.f, paramzacf.a(), paramInt, (boolean[])localObject2);
        k = localObject2[0];
        if (arrayOfByte2 != null)
        {
          this.b += arrayOfByte2.length;
          zf.a(this.c, arrayOfByte2);
        }
        if (k != 0) {
          a(true);
        }
        return;
      }
      boolean bool2 = c(paramzacf.a());
      if (!bool2) {
        paramzacf.a(b(paramzacf, paramInt));
      } else {
        paramzacf.a(b(paramzacf, paramzacf.a(), paramInt));
      }
    }
  }
  
  int[] a(String paramString, boolean paramBoolean)
  {
    return zaap.a(this.d, paramString, paramBoolean);
  }
  
  void a(byte[] paramArrayOfByte, int paramInt)
  {
    System.arraycopy(zc.a(paramInt), 0, paramArrayOfByte, 1, 2);
  }
  
  byte[] b(zacf paramzacf, String paramString, int paramInt)
  {
    int j = 0;
    int k = 0;
    int m = 0;
    int i1 = 0;
    int i3 = 0;
    int i4 = 0;
    try
    {
      int i5 = zaap.c(paramString, '!');
      if ((i5 == 0) && (paramString.length() == 1)) {
        return new byte[] { 28, 23 };
      }
      if (i5 == paramString.length() - 1) {
        i5 = paramString.indexOf('!');
      }
      boolean[] arrayOfBoolean1;
      boolean[] arrayOfBoolean2;
      boolean[] arrayOfBoolean3;
      boolean[] arrayOfBoolean4;
      int i10;
      if ((i5 == -1) && (d()) && (e()))
      {
        localObject1 = new int[] { j };
        localObject2 = new int[] { k };
        arrayOfBoolean1 = new boolean[] { i1 };
        arrayOfBoolean2 = new boolean[] { m };
        arrayOfBoolean3 = new boolean[] { i3 };
        arrayOfBoolean4 = new boolean[] { i4 };
        i10 = !a(paramString, (int[])localObject1, (int[])localObject2, false, arrayOfBoolean1, arrayOfBoolean2, arrayOfBoolean3, arrayOfBoolean4) ? 1 : 0;
        j = localObject1[0];
        k = localObject2[0];
        i1 = arrayOfBoolean1[0];
        m = arrayOfBoolean2[0];
        i3 = arrayOfBoolean3[0];
        i4 = arrayOfBoolean4[0];
        if (i10 != 0) {
          return d(paramzacf, paramString, paramInt);
        }
      }
      if ((i5 == -1) && (!d()))
      {
        localObject1 = new int[] { j };
        localObject2 = new int[] { k };
        arrayOfBoolean1 = new boolean[] { i1 };
        arrayOfBoolean2 = new boolean[] { m };
        arrayOfBoolean3 = new boolean[] { i3 };
        arrayOfBoolean4 = new boolean[] { i4 };
        i10 = !a(paramString, (int[])localObject1, (int[])localObject2, false, arrayOfBoolean1, arrayOfBoolean2, arrayOfBoolean3, arrayOfBoolean4) ? 1 : 0;
        j = localObject1[0];
        k = localObject2[0];
        i1 = arrayOfBoolean1[0];
        m = arrayOfBoolean2[0];
        i3 = arrayOfBoolean3[0];
        i4 = arrayOfBoolean4[0];
        if (i10 != 0) {
          return d(paramzacf, paramString, paramInt);
        }
        arrayOfByte = new byte[7];
        zcjb.a(arrayOfByte, 1, j, this.e, i1, c());
        zcjb.c(arrayOfByte, 5, k, this.f, m, c());
        if (m == 0)
        {
          byte[] tmp428_424 = arrayOfByte;
          tmp428_424[6] = ((byte)(tmp428_424[6] | 0x40));
        }
        if (i1 == 0)
        {
          byte[] tmp444_440 = arrayOfByte;
          tmp444_440[6] = ((byte)(tmp444_440[6] | 0x80));
        }
        if (c()) {
          switch (paramInt)
          {
          case 32: 
            arrayOfByte[0] = 44;
            break;
          case 64: 
            arrayOfByte[0] = 76;
            break;
          case 96: 
            arrayOfByte[0] = 108;
          }
        } else {
          switch (paramInt)
          {
          case 32: 
            arrayOfByte[0] = 36;
            break;
          case 64: 
            arrayOfByte[0] = 68;
            break;
          case 96: 
            arrayOfByte[0] = 100;
          }
        }
        return arrayOfByte;
      }
      Object localObject1 = "";
      Object localObject2 = null;
      int i6 = -1;
      int i7 = -1;
      if (i5 != -1)
      {
        if (i5 != 0) {
          localObject1 = paramString.substring(0, 0 + i5);
        }
        localObject2 = paramString.substring(i5 + 1);
      }
      else
      {
        localObject2 = paramString;
      }
      int[] arrayOfInt1 = { j };
      int[] arrayOfInt2 = { k };
      boolean[] arrayOfBoolean5 = { i1 };
      boolean[] arrayOfBoolean6 = { m };
      boolean[] arrayOfBoolean7 = { i3 };
      boolean[] arrayOfBoolean8 = { i4 };
      boolean bool = a((String)localObject2, arrayOfInt1, arrayOfInt2, false, arrayOfBoolean5, arrayOfBoolean6, arrayOfBoolean7, arrayOfBoolean8);
      j = arrayOfInt1[0];
      k = arrayOfInt2[0];
      int i2 = arrayOfBoolean5[0];
      int n = arrayOfBoolean6[0];
      i3 = arrayOfBoolean7[0];
      i4 = arrayOfBoolean8[0];
      Object localObject3;
      int i8;
      int i9;
      if (i5 != -1)
      {
        localObject3 = a((String)localObject1, !bool);
        i6 = localObject3[0];
        i7 = localObject3[1];
        i8 = localObject3[2];
        i9 = localObject3[3];
      }
      else
      {
        i7 = this.d.v();
        i8 = i9 = this.g;
        i6 = this.d.r().f(i7, i8, i9);
      }
      if (i6 == -1) {
        return d(paramzacf, paramString, paramInt);
      }
      if (!bool)
      {
        localObject3 = this.d.r().b(i6);
        if ((((zwp)localObject3).a()) || ("#REF!".equals(localObject2)))
        {
          arrayOfByte = new byte[9];
          switch (paramInt)
          {
          case 32: 
            arrayOfByte[0] = 60;
            break;
          case 64: 
            arrayOfByte[0] = 92;
            break;
          case 96: 
            arrayOfByte[0] = 124;
          }
          a(arrayOfByte, i6);
          return arrayOfByte;
        }
        return a(paramzacf, paramString, i7, i6, i8, (String)localObject2, paramzacf.g(), paramInt);
      }
      byte[] arrayOfByte = new byte[9];
      if (d()) {
        i2 = n = 1;
      }
      zcjb.a(arrayOfByte, 3, j, this.e, i2, c());
      zcjb.c(arrayOfByte, 7, k, this.f, n, c());
      if (n == 0)
      {
        byte[] tmp1052_1048 = arrayOfByte;
        tmp1052_1048[8] = ((byte)(tmp1052_1048[8] | 0x40));
      }
      if (i2 == 0)
      {
        byte[] tmp1068_1064 = arrayOfByte;
        tmp1068_1064[8] = ((byte)(tmp1068_1064[8] | 0x80));
      }
      switch (paramInt)
      {
      case 32: 
        arrayOfByte[0] = 58;
        break;
      case 64: 
        arrayOfByte[0] = 90;
        break;
      case 96: 
        arrayOfByte[0] = 122;
      }
      a(arrayOfByte, i6);
      return arrayOfByte;
    }
    catch (Exception localException) {}
    return d(paramzacf, paramString, paramInt);
  }
  
  private byte[] b(zacf paramzacf, int paramInt)
  {
    int j = paramzacf.a().indexOf(':');
    if (j == -1) {
      return b(paramzacf, paramzacf.a(), paramInt);
    }
    int k = paramzacf.a().lastIndexOf(':');
    if ((j != paramzacf.a().length() - 1) && (paramzacf.a().charAt(j + 1) == '\\')) {
      j = k;
    }
    int m = paramzacf.a().lastIndexOf('!');
    if (j == k)
    {
      str1 = paramzacf.a().substring(0, 0 + j);
      str2 = zw.a(paramzacf.a().substring(j + 1));
      if ((str1 == null) || (str2 == null)) {
        return null;
      }
      m = str1.lastIndexOf('!');
      if (m == -1) {
        return a(paramzacf, str1, str2, paramInt);
      }
      return a(paramzacf, str1, str2, m, paramInt);
    }
    if (m == -1)
    {
      localObject = zw.d(paramzacf.a(), ':');
      ArrayList localArrayList = new ArrayList();
      int n = 0;
      for (int i1 = 0; i1 < localObject.length; i1 += 2)
      {
        byte[] arrayOfByte2 = null;
        if (i1 + 1 >= localObject.length) {
          arrayOfByte2 = b(paramzacf, localObject[i1], paramInt);
        } else {
          arrayOfByte2 = a(paramzacf, localObject[i1], localObject[(i1 + 1)], paramInt);
        }
        zf.a(localArrayList, arrayOfByte2);
        n += arrayOfByte2.length;
        if (i1 != 0) {
          n++;
        }
      }
      byte[] arrayOfByte1 = new byte[n];
      int i2 = 0;
      for (int i3 = 0; i3 < localArrayList.size(); i3++)
      {
        byte[] arrayOfByte3 = (byte[])localArrayList.get(i3);
        System.arraycopy(arrayOfByte3, 0, arrayOfByte1, i2, arrayOfByte3.length);
        i2 += arrayOfByte3.length;
        if (i3 != 0) {
          arrayOfByte1[(i2++)] = 17;
        }
      }
      return arrayOfByte1;
    }
    Object localObject = paramzacf.a().substring(0, 0 + m);
    String str1 = paramzacf.a().substring(m + 1, m + 1 + (k - m - 1));
    String str2 = paramzacf.a().substring(k + 1);
    return a(paramzacf, (String)localObject, str1, str2, paramInt);
  }
  
  byte[] a(zacf paramzacf, String paramString1, String paramString2, int paramInt)
  {
    Object localObject = new byte[13];
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    try
    {
      int[] arrayOfInt1 = { i1 };
      int[] arrayOfInt2 = { i2 };
      boolean[] arrayOfBoolean1 = { j };
      boolean[] arrayOfBoolean2 = { k };
      boolean[] arrayOfBoolean3 = { m };
      boolean[] arrayOfBoolean4 = { n };
      boolean bool1 = a(paramString1, arrayOfInt1, arrayOfInt2, true, arrayOfBoolean1, arrayOfBoolean2, arrayOfBoolean3, arrayOfBoolean4);
      i1 = arrayOfInt1[0];
      i2 = arrayOfInt2[0];
      j = arrayOfBoolean1[0];
      k = arrayOfBoolean2[0];
      m = arrayOfBoolean3[0];
      n = arrayOfBoolean4[0];
      int[] arrayOfInt3 = { i7 };
      int[] arrayOfInt4 = { i8 };
      boolean[] arrayOfBoolean5 = { i3 };
      boolean[] arrayOfBoolean6 = { i4 };
      boolean[] arrayOfBoolean7 = { i5 };
      boolean[] arrayOfBoolean8 = { i6 };
      boolean bool2 = a(paramString2, arrayOfInt3, arrayOfInt4, true, arrayOfBoolean5, arrayOfBoolean6, arrayOfBoolean7, arrayOfBoolean8);
      i7 = arrayOfInt3[0];
      i8 = arrayOfInt4[0];
      i3 = arrayOfBoolean5[0];
      i4 = arrayOfBoolean6[0];
      i5 = arrayOfBoolean7[0];
      i6 = arrayOfBoolean8[0];
      if ((!bool1) || (!bool2) || (m != i5) || (n != i6))
      {
        if (paramInt != 96) {
          paramInt = 32;
        }
        paramzacf.a(paramString1);
        paramzacf.a(null);
        byte[] arrayOfByte2 = b(paramzacf, paramzacf.a(), paramInt);
        paramzacf.a(paramString2);
        paramzacf.a(null);
        byte[] arrayOfByte3 = b(paramzacf, paramzacf.a(), paramInt);
        localObject = new byte[arrayOfByte2.length + arrayOfByte3.length + 1];
        System.arraycopy(arrayOfByte2, 0, localObject, 0, arrayOfByte2.length);
        System.arraycopy(arrayOfByte3, 0, localObject, arrayOfByte2.length, arrayOfByte3.length);
        localObject[(localObject.length - 1)] = 17;
        return (byte[])localObject;
      }
      if (d()) {
        j = i3 = k = i4 = 1;
      }
      if (m != 0)
      {
        zcjb.a((byte[])localObject, 1, i1, this.e, j, c());
        zcjb.a((byte[])localObject, 5, i7, this.e, i3, c());
        System.arraycopy(zc.a(16383), 0, localObject, 11, 2);
        if (j == 0)
        {
          Object tmp489_485 = localObject;
          tmp489_485[10] = ((byte)(tmp489_485[10] | 0x80));
        }
        if (i3 == 0)
        {
          Object tmp506_502 = localObject;
          tmp506_502[12] = ((byte)(tmp506_502[12] | 0x80));
        }
      }
      else if (n != 0)
      {
        System.arraycopy(zc.a(1048575), 0, localObject, 5, 4);
        zcjb.c((byte[])localObject, 9, i2, this.f, k, c());
        zcjb.c((byte[])localObject, 11, i8, this.f, i4, c());
        if (k == 0)
        {
          Object tmp582_578 = localObject;
          tmp582_578[10] = ((byte)(tmp582_578[10] | 0x40));
        }
        if (i4 == 0)
        {
          Object tmp598_594 = localObject;
          tmp598_594[12] = ((byte)(tmp598_594[12] | 0x40));
        }
      }
      else
      {
        zcjb.a((byte[])localObject, 1, i1, this.e, j, c());
        zcjb.a((byte[])localObject, 5, i7, this.e, i3, c());
        zcjb.c((byte[])localObject, 9, i2, this.f, k, c());
        zcjb.c((byte[])localObject, 11, i8, this.f, i4, c());
        if (j == 0)
        {
          Object tmp691_687 = localObject;
          tmp691_687[10] = ((byte)(tmp691_687[10] | 0x80));
        }
        if (k == 0)
        {
          Object tmp708_704 = localObject;
          tmp708_704[10] = ((byte)(tmp708_704[10] | 0x40));
        }
        if (i3 == 0)
        {
          Object tmp724_720 = localObject;
          tmp724_720[12] = ((byte)(tmp724_720[12] | 0x80));
        }
        if (i4 == 0)
        {
          Object tmp741_737 = localObject;
          tmp741_737[12] = ((byte)(tmp741_737[12] | 0x40));
        }
      }
    }
    catch (Exception localException)
    {
      throw new CellsException(5, a);
    }
    if (d())
    {
      byte[] arrayOfByte1 = new byte[localObject.length + 2];
      int i9 = this.d.r().f(this.d.v(), this.g, this.g);
      System.arraycopy(zc.a(i9), 0, arrayOfByte1, 1, 2);
      System.arraycopy(localObject, 1, arrayOfByte1, 3, localObject.length - 1);
      localObject = arrayOfByte1;
      switch (paramInt)
      {
      case 32: 
        localObject[0] = 59;
        break;
      case 64: 
        localObject[0] = 91;
        break;
      case 96: 
        localObject[0] = 123;
      }
      return (byte[])localObject;
    }
    if (c()) {
      switch (paramInt)
      {
      case 32: 
        localObject[0] = 45;
        break;
      case 64: 
        localObject[0] = 77;
        break;
      case 96: 
        localObject[0] = 109;
      }
    } else {
      switch (paramInt)
      {
      case 32: 
        localObject[0] = 37;
        break;
      case 64: 
        localObject[0] = 69;
        break;
      case 96: 
        localObject[0] = 101;
      }
    }
    return (byte[])localObject;
  }
  
  private byte[] a(zacf paramzacf, String paramString1, String paramString2, String paramString3, int paramInt)
  {
    try
    {
      int[] arrayOfInt1 = a(paramString1, false);
      int n = arrayOfInt1[0];
      int j = arrayOfInt1[1];
      int k = arrayOfInt1[2];
      int m = arrayOfInt1[3];
      byte[] arrayOfByte1 = new byte[15];
      int i1 = 0;
      int i2 = 0;
      int i3 = 0;
      int i4 = 0;
      int i5 = 0;
      int i6 = 0;
      int i7 = 0;
      int i8 = 0;
      int i9 = 0;
      int i10 = 0;
      int i11 = 0;
      int i12 = 0;
      try
      {
        int[] arrayOfInt2 = { i5 };
        int[] arrayOfInt3 = { i6 };
        boolean[] arrayOfBoolean1 = { i1 };
        boolean[] arrayOfBoolean2 = { i2 };
        boolean[] arrayOfBoolean3 = { i3 };
        boolean[] arrayOfBoolean4 = { i4 };
        boolean bool1 = a(paramString2, arrayOfInt2, arrayOfInt3, true, arrayOfBoolean1, arrayOfBoolean2, arrayOfBoolean3, arrayOfBoolean4);
        i5 = arrayOfInt2[0];
        i6 = arrayOfInt3[0];
        i1 = arrayOfBoolean1[0];
        i2 = arrayOfBoolean2[0];
        i3 = arrayOfBoolean3[0];
        i4 = arrayOfBoolean4[0];
        int[] arrayOfInt4 = { i11 };
        int[] arrayOfInt5 = { i12 };
        boolean[] arrayOfBoolean5 = { i7 };
        boolean[] arrayOfBoolean6 = { i8 };
        boolean[] arrayOfBoolean7 = { i9 };
        boolean[] arrayOfBoolean8 = { i10 };
        boolean bool2 = a(paramString3, arrayOfInt4, arrayOfInt5, true, arrayOfBoolean5, arrayOfBoolean6, arrayOfBoolean7, arrayOfBoolean8);
        i11 = arrayOfInt4[0];
        i12 = arrayOfInt5[0];
        i7 = arrayOfBoolean5[0];
        i8 = arrayOfBoolean6[0];
        i9 = arrayOfBoolean7[0];
        i10 = arrayOfBoolean8[0];
        if ((!bool1) || (!bool2) || (i3 != i9) || (i4 != i10))
        {
          if (paramInt != 96) {
            paramInt = 32;
          }
          paramzacf.a(paramString2);
          paramzacf.a(null);
          byte[] arrayOfByte2 = b(paramzacf, paramzacf.a(), paramInt);
          paramzacf.a(paramString3);
          paramzacf.a(null);
          byte[] arrayOfByte3 = b(paramzacf, paramzacf.a(), paramInt);
          arrayOfByte1 = new byte[arrayOfByte2.length + arrayOfByte3.length + 1];
          System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, arrayOfByte2.length);
          System.arraycopy(arrayOfByte3, 0, arrayOfByte1, arrayOfByte2.length, arrayOfByte3.length);
          arrayOfByte1[(arrayOfByte1.length - 1)] = 17;
          return arrayOfByte1;
        }
        if (d()) {
          i1 = i7 = i2 = i8 = 1;
        }
        if (i3 != 0)
        {
          zcjb.a(arrayOfByte1, 3, i5, this.e, i1, c());
          zcjb.a(arrayOfByte1, 7, i11, this.e, i7, c());
          System.arraycopy(zc.a(16383), 0, arrayOfByte1, 11, 2);
          if (i1 == 0)
          {
            byte[] tmp524_520 = arrayOfByte1;
            tmp524_520[12] = ((byte)(tmp524_520[12] | 0x80));
          }
          if (i7 == 0)
          {
            byte[] tmp541_537 = arrayOfByte1;
            tmp541_537[14] = ((byte)(tmp541_537[14] | 0x80));
          }
        }
        else if (i4 != 0)
        {
          System.arraycopy(zc.a(1048575), 0, arrayOfByte1, 7, 4);
          zcjb.c(arrayOfByte1, 11, i6, this.f, i2, c());
          zcjb.c(arrayOfByte1, 13, i12, this.f, i8, c());
          if (i2 == 0)
          {
            byte[] tmp618_614 = arrayOfByte1;
            tmp618_614[12] = ((byte)(tmp618_614[12] | 0x40));
          }
          if (i8 == 0)
          {
            byte[] tmp634_630 = arrayOfByte1;
            tmp634_630[14] = ((byte)(tmp634_630[14] | 0x40));
          }
        }
        else
        {
          zcjb.a(arrayOfByte1, 3, i5, this.e, i1, c());
          zcjb.a(arrayOfByte1, 7, i11, this.e, i7, c());
          zcjb.c(arrayOfByte1, 11, i6, this.f, i2, c());
          zcjb.c(arrayOfByte1, 13, i12, this.f, i8, c());
          if (i1 == 0)
          {
            byte[] tmp728_724 = arrayOfByte1;
            tmp728_724[12] = ((byte)(tmp728_724[12] | 0x80));
          }
          if (i2 == 0)
          {
            byte[] tmp745_741 = arrayOfByte1;
            tmp745_741[12] = ((byte)(tmp745_741[12] | 0x40));
          }
          if (i7 == 0)
          {
            byte[] tmp761_757 = arrayOfByte1;
            tmp761_757[14] = ((byte)(tmp761_757[14] | 0x80));
          }
          if (i8 == 0)
          {
            byte[] tmp778_774 = arrayOfByte1;
            tmp778_774[14] = ((byte)(tmp778_774[14] | 0x40));
          }
        }
      }
      catch (Exception localException2)
      {
        throw new CellsException(5, a);
      }
      switch (paramInt)
      {
      case 32: 
        arrayOfByte1[0] = 59;
        break;
      case 64: 
        arrayOfByte1[0] = 91;
        break;
      case 96: 
        arrayOfByte1[0] = 123;
      }
      a(arrayOfByte1, n);
      return arrayOfByte1;
    }
    catch (Exception localException1)
    {
      throw new CellsException(5, a);
    }
  }
  
  private byte[] a(zacf paramzacf, String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    Object localObject;
    if (paramString2.indexOf("!") != -1)
    {
      byte[] arrayOfByte1 = b(paramzacf, paramString1, 32);
      byte[] arrayOfByte2 = b(paramzacf, paramString2, 32);
      localObject = new byte[arrayOfByte1.length + arrayOfByte2.length + 1];
      System.arraycopy(arrayOfByte1, 0, localObject, 0, arrayOfByte1.length);
      System.arraycopy(arrayOfByte2, 0, localObject, arrayOfByte1.length, arrayOfByte2.length);
      localObject[(localObject.length - 1)] = 17;
      return (byte[])localObject;
    }
    int j = 0;
    int k;
    if ((this.d.w() != null) && (this.d.w().getCount() != 0)) {
      for (k = 0; k < this.d.w().getCount(); k++)
      {
        localObject = this.d.w().a(k);
        if (((zbti)localObject).e())
        {
          j = k;
          break;
        }
      }
    }
    try
    {
      k = -1;
      if (paramInt1 > 0)
      {
        localObject = paramString1.substring(0, 0 + paramInt1);
        int m = -1;
        int[] arrayOfInt1 = a((String)localObject, false);
        k = arrayOfInt1[0];
        m = arrayOfInt1[1];
        n = arrayOfInt1[2];
        i1 = arrayOfInt1[3];
        if (k == -1) {
          k = this.d.r().b(j, -1);
        }
      }
      else
      {
        localObject = this.d.w().a(this.d);
        k = localObject[0];
      }
      localObject = new byte[15];
      String str = paramString1;
      paramString1 = paramString1.substring(paramInt1 + 1);
      int n = 0;
      int i1 = 0;
      int i2 = 0;
      int i3 = 0;
      int i4 = 0;
      int i5 = 0;
      int i6 = 0;
      int i7 = 0;
      int i8 = 0;
      int i9 = 0;
      int i10 = 0;
      int i11 = 0;
      try
      {
        int[] arrayOfInt2 = { i4 };
        int[] arrayOfInt3 = { i5 };
        boolean[] arrayOfBoolean1 = { n };
        boolean[] arrayOfBoolean2 = { i1 };
        boolean[] arrayOfBoolean3 = { i2 };
        boolean[] arrayOfBoolean4 = { i3 };
        boolean bool1 = a(paramString1, arrayOfInt2, arrayOfInt3, true, arrayOfBoolean1, arrayOfBoolean2, arrayOfBoolean3, arrayOfBoolean4);
        i4 = arrayOfInt2[0];
        i5 = arrayOfInt3[0];
        n = arrayOfBoolean1[0];
        i1 = arrayOfBoolean2[0];
        i2 = arrayOfBoolean3[0];
        i3 = arrayOfBoolean4[0];
        int[] arrayOfInt4 = { i10 };
        int[] arrayOfInt5 = { i11 };
        boolean[] arrayOfBoolean5 = { i6 };
        boolean[] arrayOfBoolean6 = { i7 };
        boolean[] arrayOfBoolean7 = { i8 };
        boolean[] arrayOfBoolean8 = { i9 };
        boolean bool2 = a(paramString2, arrayOfInt4, arrayOfInt5, true, arrayOfBoolean5, arrayOfBoolean6, arrayOfBoolean7, arrayOfBoolean8);
        i10 = arrayOfInt4[0];
        i11 = arrayOfInt5[0];
        i6 = arrayOfBoolean5[0];
        i7 = arrayOfBoolean6[0];
        i8 = arrayOfBoolean7[0];
        i9 = arrayOfBoolean8[0];
        if ((!bool1) || (!bool2) || (i2 != i8) || (i3 != i9))
        {
          if (paramInt2 != 96) {
            paramInt2 = 32;
          }
          paramzacf.a(str);
          paramzacf.a(null);
          byte[] arrayOfByte3 = b(paramzacf, paramzacf.a(), paramInt2);
          paramzacf.a(paramString2);
          paramzacf.a(null);
          byte[] arrayOfByte4 = b(paramzacf, paramzacf.a(), paramInt2);
          localObject = new byte[arrayOfByte3.length + arrayOfByte4.length + 1];
          System.arraycopy(arrayOfByte3, 0, localObject, 0, arrayOfByte3.length);
          System.arraycopy(arrayOfByte4, 0, localObject, arrayOfByte3.length, arrayOfByte4.length);
          localObject[(localObject.length - 1)] = 17;
          return (byte[])localObject;
        }
        if (d()) {
          n = i6 = i1 = i7 = 1;
        }
        if (i2 != 0)
        {
          zcjb.a((byte[])localObject, 3, i4, this.e, n, c());
          zcjb.a((byte[])localObject, 7, i10, this.e, i6, c());
          System.arraycopy(zc.a(16383), 0, localObject, 13, 2);
          if (n == 0)
          {
            Object tmp765_761 = localObject;
            tmp765_761[12] = ((byte)(tmp765_761[12] | 0x80));
          }
          if (i6 == 0)
          {
            Object tmp782_778 = localObject;
            tmp782_778[14] = ((byte)(tmp782_778[14] | 0x80));
          }
        }
        else if (i3 != 0)
        {
          System.arraycopy(zc.a(1048575), 0, localObject, 7, 4);
          zcjb.c((byte[])localObject, 11, i5, this.f, i1, c());
          zcjb.c((byte[])localObject, 13, i11, this.f, i7, c());
          if (i1 == 0)
          {
            Object tmp859_855 = localObject;
            tmp859_855[12] = ((byte)(tmp859_855[12] | 0x40));
          }
          if (i7 == 0)
          {
            Object tmp875_871 = localObject;
            tmp875_871[14] = ((byte)(tmp875_871[14] | 0x40));
          }
        }
        else
        {
          zcjb.a((byte[])localObject, 3, i4, this.e, n, c());
          zcjb.a((byte[])localObject, 7, i10, this.e, i6, c());
          zcjb.c((byte[])localObject, 11, i5, this.f, i1, c());
          zcjb.c((byte[])localObject, 13, i11, this.f, i7, c());
          if (n == 0)
          {
            Object tmp969_965 = localObject;
            tmp969_965[12] = ((byte)(tmp969_965[12] | 0x80));
          }
          if (i1 == 0)
          {
            Object tmp986_982 = localObject;
            tmp986_982[12] = ((byte)(tmp986_982[12] | 0x40));
          }
          if (i6 == 0)
          {
            Object tmp1002_998 = localObject;
            tmp1002_998[14] = ((byte)(tmp1002_998[14] | 0x80));
          }
          if (i7 == 0)
          {
            Object tmp1019_1015 = localObject;
            tmp1019_1015[14] = ((byte)(tmp1019_1015[14] | 0x40));
          }
        }
      }
      catch (Exception localException2)
      {
        throw new CellsException(5, a);
      }
      switch (paramInt2)
      {
      case 32: 
        localObject[0] = 59;
        break;
      case 64: 
        localObject[0] = 91;
        break;
      case 96: 
        localObject[0] = 123;
      }
      a((byte[])localObject, k);
      return (byte[])localObject;
    }
    catch (Exception localException1)
    {
      throw new CellsException(5, a);
    }
  }
  
  private int[] c(zacf paramzacf, int paramInt)
  {
    if ((paramzacf.c() == null) || (paramzacf.c().size() == 0))
    {
      paramzacf.a(new byte[4]);
      paramzacf.d()[0] = 25;
      paramzacf.d()[1] = 16;
    }
    else
    {
      if (paramzacf.c().size() > 255) {
        throw new CellsException(5, a);
      }
      paramzacf.a(new byte[4]);
      switch (paramInt)
      {
      case 96: 
        paramzacf.d()[0] = 98;
        break;
      default: 
        paramzacf.d()[0] = 66;
      }
      paramzacf.d()[1] = ((byte)paramzacf.c().size());
      paramzacf.d()[2] = 4;
    }
    return zacn.h;
  }
  
  private int[] a(zacf paramzacf, int paramInt1, int paramInt2, int paramInt3)
  {
    paramzacf.a(new byte[4]);
    switch (paramInt2)
    {
    case 96: 
      paramzacf.d()[0] = 98;
      break;
    case 32: 
      paramzacf.d()[0] = 34;
      break;
    case 64: 
      paramzacf.d()[0] = 66;
    }
    if ((paramzacf.c() != null) && (paramzacf.c().size() != 0)) {
      paramzacf.d()[1] = ((byte)paramzacf.c().size());
    }
    System.arraycopy(zc.a(paramInt1), 0, paramzacf.d(), 2, 2);
    return zaap.a(paramInt1 & 0xFFFF, paramInt3, paramzacf);
  }
  
  private int[] b(zacf paramzacf, int paramInt1, int paramInt2, int paramInt3)
  {
    paramzacf.a(new byte[3]);
    if (c()) {
      paramzacf.d()[0] = 33;
    } else {
      switch (paramInt2)
      {
      case 32: 
        paramzacf.d()[0] = 33;
        break;
      case 64: 
        if ((zaap.a(paramInt1 & 0xFFFF, paramInt3) == 96) && (paramzacf.b() != null)) {
          paramzacf.d()[0] = 97;
        } else {
          paramzacf.d()[0] = 65;
        }
        break;
      case 96: 
        paramzacf.d()[0] = 97;
      }
    }
    System.arraycopy(zc.a(paramInt1), 0, paramzacf.d(), 1, 2);
    return zaap.a(paramInt1 & 0xFFFF, paramInt3, paramzacf);
  }
  
  private void c(zacf paramzacf, String paramString, int paramInt)
  {
    String str = paramString;
    int j = -1;
    int k = -1;
    int m = -1;
    zbth localzbth = this.d.w();
    int n = 0;
    int i1 = 0;
    zbti localzbti = null;
    for (int i2 = 0; i2 < localzbth.getCount(); i2++)
    {
      localzbti = localzbth.a(i2);
      if (localzbti.f())
      {
        j = i2;
        n = 1;
        break;
      }
    }
    if (n == 0)
    {
      localzbti = new zbti();
      localzbti.a(2);
      zwh localzwh1 = new zwh(localzbti);
      localzwh1.a(str, true);
      zf.a(localzbti.b(), localzwh1);
      m = 1;
      this.d.w().a(localzbti);
      k = this.d.r().b(this.d.w().getCount() - 1 & 0xFFFF, 65534, 65534);
    }
    else
    {
      k = this.d.r().f(j, 65534, 65534);
      n = 1;
      for (int i3 = 0; i3 < localzbti.b().size(); i3++)
      {
        zwh localzwh2 = (zwh)localzbti.b().get(i3);
        if (zw.b(localzwh2.e().toUpperCase(), str.toUpperCase()))
        {
          m = i3 + 1;
          i1 = 1;
          break;
        }
      }
      if (i1 == 0)
      {
        localObject = new zwh(localzbti);
        ((zwh)localObject).a(str, true);
        zf.a(localzbti.b(), localObject);
        m = localzbti.b().size();
      }
    }
    Object localObject = new byte[7];
    System.arraycopy(zc.a(k), 0, localObject, 1, 2);
    System.arraycopy(zc.a(m), 0, localObject, 3, 2);
    switch (paramInt)
    {
    case 32: 
      localObject[0] = 57;
      break;
    case 64: 
      localObject[0] = 89;
      break;
    case 96: 
      localObject[0] = 121;
    }
    paramzacf.a(5);
    paramzacf.a((byte[])localObject);
  }
  
  zacn a(zacf paramzacf, String paramString, int paramInt)
  {
    zacn localzacn = zacn.a(paramString, paramInt);
    if (localzacn != null)
    {
      int[] arrayOfInt;
      int j;
      switch (localzacn.a)
      {
      case 481: 
        arrayOfInt = new int[paramzacf.c().size()];
        for (j = 0; j < arrayOfInt.length; j++) {
          arrayOfInt[j] = (j % 2 == 0 ? 32 : 64);
        }
        localzacn.e = arrayOfInt;
        break;
      case 482: 
      case 484: 
        arrayOfInt = new int[paramzacf.c().size()];
        arrayOfInt[0] = 32;
        for (j = 1; j < arrayOfInt.length; j++) {
          arrayOfInt[j] = (j % 2 == 1 ? 32 : 64);
        }
        localzacn.e = arrayOfInt;
        break;
      }
    }
    return localzacn;
  }
  
  private int[] b(zacf paramzacf, int paramInt1, int paramInt2)
  {
    String str = paramzacf.a();
    int j = 0;
    if (str.startsWith("_XL")) {
      if (str.startsWith("_XLFN."))
      {
        str = str.substring("_XLFN.".length());
      }
      else if (str.startsWith("_XLL."))
      {
        str = str.substring("_XLL.".length());
        j = 1;
      }
      else if (str.startsWith("_XLUDF."))
      {
        str = str.substring("_XLUDF.".length());
        paramzacf.a = ("_xlfn." + str);
      }
    }
    zacn localzacn = a(paramzacf, str, paramInt2);
    if (localzacn == null)
    {
      if (j != 0)
      {
        paramzacf.a(5);
        paramzacf.a = paramzacf.a.substring("_XLL.".length());
        c(paramzacf, paramzacf.a, paramInt1);
        return zacn.h;
      }
      paramzacf.a(5);
      paramzacf.a(e(paramzacf, paramzacf.a, paramInt1));
      return zacn.h;
    }
    if ((localzacn.a & 0xFFFF) == 255)
    {
      paramzacf.a(5);
      c(paramzacf, paramzacf.a, paramInt1);
    }
    else if (localzacn.c != localzacn.d)
    {
      paramzacf.a(new byte[4]);
      switch (paramInt1)
      {
      case 96: 
        paramzacf.d()[0] = 98;
        break;
      case 32: 
        paramzacf.d()[0] = 34;
        break;
      case 64: 
        paramzacf.d()[0] = 66;
      }
      if ((paramzacf.c() != null) && (paramzacf.c().size() != 0)) {
        paramzacf.d()[1] = ((byte)paramzacf.c().size());
      }
      System.arraycopy(zc.a(localzacn.a), 0, paramzacf.d(), 2, 2);
    }
    else
    {
      paramzacf.a(new byte[3]);
      if (c()) {
        paramzacf.d()[0] = 33;
      } else {
        switch (paramInt1)
        {
        case 32: 
          paramzacf.d()[0] = 33;
          break;
        case 64: 
          if ((localzacn.f == 96) && (paramzacf.b() != null)) {
            paramzacf.d()[0] = 97;
          } else {
            paramzacf.d()[0] = 65;
          }
          break;
        case 96: 
          paramzacf.d()[0] = 97;
        }
      }
      System.arraycopy(zc.a(localzacn.a), 0, paramzacf.d(), 1, 2);
    }
    return localzacn.e;
  }
  
  int[] a(zacf paramzacf, String paramString)
  {
    return this.d.getNames().a(this.g, paramString, paramzacf.g() == 5, true);
  }
  
  private byte[] d(zacf paramzacf, String paramString, int paramInt)
  {
    int j = this.d.v();
    try
    {
      byte[] arrayOfByte1;
      if (paramzacf.g() == 3)
      {
        paramzacf.a(5);
      }
      else
      {
        arrayOfByte1 = zbvl.a(this.d, paramString, paramInt);
        if (arrayOfByte1 != null) {
          return arrayOfByte1;
        }
      }
      int[] arrayOfInt = a(paramzacf, paramString);
      int k = arrayOfInt[0];
      int m = arrayOfInt[1];
      if (k != -1)
      {
        arrayOfByte1 = new byte[7];
        System.arraycopy(zc.a(k), 0, arrayOfByte1, 1, 2);
        System.arraycopy(zc.a(m + 1), 0, arrayOfByte1, 3, 4);
        switch (paramInt)
        {
        case 32: 
          arrayOfByte1[0] = 57;
          break;
        case 64: 
          arrayOfByte1[0] = 89;
          break;
        case 96: 
          arrayOfByte1[0] = 121;
        }
      }
      else
      {
        arrayOfByte1 = new byte[5];
        System.arraycopy(zc.a(m + 1), 0, arrayOfByte1, 1, 4);
        switch (paramInt)
        {
        case 32: 
          arrayOfByte1[0] = 35;
          break;
        case 64: 
          arrayOfByte1[0] = 67;
          break;
        case 96: 
          arrayOfByte1[0] = 99;
        }
      }
      if (!g())
      {
        Name localName = this.d.getNames().get(m);
        byte[] arrayOfByte2 = localName.b();
        if ((arrayOfByte2 != null) && (arrayOfByte2.length > 8) && (arrayOfByte2[4] == 25) && (arrayOfByte2[5] == 1)) {
          b(true);
        }
      }
      return arrayOfByte1;
    }
    catch (Exception localException)
    {
      throw new CellsException(5, a);
    }
  }
  
  private byte[] e(zacf paramzacf, String paramString, int paramInt)
  {
    paramzacf.a(5);
    int j = this.d.v();
    try
    {
      int[] arrayOfInt = this.d.getNames().a(this.g, paramString, true, true);
      int k = arrayOfInt[0];
      int m = arrayOfInt[1];
      byte[] arrayOfByte;
      if (k != -1)
      {
        arrayOfByte = new byte[7];
        System.arraycopy(zc.a(k), 0, arrayOfByte, 1, 2);
        System.arraycopy(zc.a(m + 1), 0, arrayOfByte, 3, 4);
        switch (paramInt)
        {
        case 32: 
          arrayOfByte[0] = 57;
          break;
        case 64: 
          arrayOfByte[0] = 89;
          break;
        case 96: 
          arrayOfByte[0] = 121;
        }
      }
      else
      {
        arrayOfByte = new byte[5];
        System.arraycopy(zc.a(m + 1), 0, arrayOfByte, 1, 4);
        switch (paramInt)
        {
        case 32: 
          arrayOfByte[0] = 35;
          break;
        case 64: 
          if (paramzacf.g() == 5) {
            arrayOfByte[0] = 35;
          } else {
            arrayOfByte[0] = 67;
          }
          break;
        case 96: 
          arrayOfByte[0] = 99;
        }
      }
      return arrayOfByte;
    }
    catch (Exception localException)
    {
      throw new CellsException(5, a);
    }
  }
  
  private boolean a(String paramString)
  {
    return (paramString.length() > 0) && (paramString.charAt(paramString.length() - 1) == ']');
  }
  
  private boolean b(String paramString)
  {
    return (paramString.length() > 0) && (paramString.charAt(0) != '\'') && (paramString.indexOf('|') != -1);
  }
  
  private boolean c(String paramString)
  {
    for (int j = paramString.length() - 1; j >= 0; j--)
    {
      int k;
      switch (paramString.charAt(j))
      {
      case '"': 
      case '\'': 
        k = paramString.charAt(j);
        j--;
      case ':': 
      case '!': 
        while ((j >= 0) && (paramString.charAt(j) != k))
        {
          j--;
          continue;
          return false;
          return true;
        }
      }
    }
    return true;
  }
  
  byte[] a(zacf paramzacf, String paramString1, int paramInt1, int paramInt2, int paramInt3, String paramString2, int paramInt4, int paramInt5)
  {
    return a(this.d, paramInt1, paramInt2, paramInt3, paramString2, paramInt4, paramInt5);
  }
  
  static byte[] a(WorksheetCollection paramWorksheetCollection, int paramInt1, int paramInt2, int paramInt3, String paramString, int paramInt4, int paramInt5)
  {
    int j = paramWorksheetCollection.v();
    byte[] arrayOfByte = null;
    int k = -1;
    if (paramInt1 == j)
    {
      arrayOfByte = zbvl.a(paramWorksheetCollection, paramString, paramInt5);
      if (arrayOfByte != null) {
        return arrayOfByte;
      }
      k = paramWorksheetCollection.getNames().d(paramInt3, paramString);
    }
    else
    {
      if ((paramString.length() > 2) && (paramString.charAt(0) == '\'')) {
        paramString = paramString.substring(1, 1 + (paramString.length() - 2));
      }
      paramString = paramString.toUpperCase();
      zbti localzbti = paramWorksheetCollection.w().a(paramInt1);
      if (localzbti.b().size() > 0) {
        for (int m = 0; m < localzbti.b().size(); m++)
        {
          zwh localzwh2 = (zwh)localzbti.b().get(m);
          if (zw.b(localzwh2.e().toUpperCase(), paramString)) {
            k = m;
          }
        }
      }
      if (k == -1)
      {
        zwh localzwh1 = new zwh(localzbti);
        localzwh1.a(paramString);
        k = zf.a(localzbti.b(), localzwh1);
      }
    }
    arrayOfByte = new byte[7];
    switch (paramInt5)
    {
    case 32: 
      arrayOfByte[0] = 57;
      break;
    case 64: 
      arrayOfByte[0] = 89;
      break;
    case 96: 
      arrayOfByte[0] = 121;
    }
    System.arraycopy(zc.a(paramInt2), 0, arrayOfByte, 1, 2);
    System.arraycopy(zc.a(k + 1), 0, arrayOfByte, 3, 2);
    return arrayOfByte;
  }
  
  static boolean a(String paramString, int[] paramArrayOfInt1, int[] paramArrayOfInt2, boolean paramBoolean, boolean[] paramArrayOfBoolean1, boolean[] paramArrayOfBoolean2, boolean[] paramArrayOfBoolean3, boolean[] paramArrayOfBoolean4)
  {
    paramArrayOfInt1[0] = -1;
    paramArrayOfInt2[0] = -1;
    if (paramString.length() == 0) {
      return false;
    }
    char[] arrayOfChar = paramString.toUpperCase().toCharArray();
    for (int j = 0; j < arrayOfChar.length; j++) {
      switch (arrayOfChar[j])
      {
      case '$': 
        break;
      case '1': 
      case '2': 
      case '3': 
      case '4': 
      case '5': 
      case '6': 
      case '7': 
      case '8': 
      case '9': 
        if (paramArrayOfInt2[0] == -1) {
          if (paramBoolean) {
            paramArrayOfBoolean3[0] = true;
          } else {
            return false;
          }
        }
        if ((j != 0) && (arrayOfChar[(j - 1)] == '$')) {
          paramArrayOfBoolean1[0] = true;
        }
        paramArrayOfInt1[0] = (arrayOfChar[j] - '0');
        j++;
        while (j < arrayOfChar.length)
        {
          if (Character.isDigit(arrayOfChar[j])) {
            paramArrayOfInt1[0] = (paramArrayOfInt1[0] * 10 + arrayOfChar[j] - 48);
          } else {
            return false;
          }
          j++;
        }
        paramArrayOfInt1[0] -= 1;
        if (paramArrayOfInt1[0] > 1048575) {
          return false;
        }
        break;
      case 'A': 
      case 'B': 
      case 'C': 
      case 'D': 
      case 'E': 
      case 'F': 
      case 'G': 
      case 'H': 
      case 'I': 
      case 'J': 
      case 'K': 
      case 'L': 
      case 'M': 
      case 'N': 
      case 'O': 
      case 'P': 
      case 'Q': 
      case 'R': 
      case 'S': 
      case 'T': 
      case 'U': 
      case 'V': 
      case 'W': 
      case 'X': 
      case 'Y': 
      case 'Z': 
        if (paramArrayOfInt2[0] != -1) {
          return false;
        }
        int k = j;
        k++;
        while ((k < arrayOfChar.length) && (Character.isLetter(arrayOfChar[k]))) {
          k++;
        }
        if (k == arrayOfChar.length) {
          if (paramBoolean) {
            paramArrayOfBoolean4[0] = true;
          } else {
            return false;
          }
        }
        if (k - j > 3) {
          return false;
        }
        if ((j != 0) && (arrayOfChar[(j - 1)] == '$')) {
          paramArrayOfBoolean2[0] = true;
        }
        paramArrayOfInt2[0] = (arrayOfChar[j] - 'A' + 1);
        j++;
        while (j < k)
        {
          paramArrayOfInt2[0] = (paramArrayOfInt2[0] * 26 + arrayOfChar[j] - 65 + 1);
          j++;
        }
        j--;
        paramArrayOfInt2[0] -= 1;
        if (paramArrayOfInt2[0] > 16383) {
          return false;
        }
        break;
      case '%': 
      case '&': 
      case '\'': 
      case '(': 
      case ')': 
      case '*': 
      case '+': 
      case ',': 
      case '-': 
      case '.': 
      case '/': 
      case '0': 
      case ':': 
      case ';': 
      case '<': 
      case '=': 
      case '>': 
      case '?': 
      case '@': 
      default: 
        return false;
      }
    }
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcjf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */