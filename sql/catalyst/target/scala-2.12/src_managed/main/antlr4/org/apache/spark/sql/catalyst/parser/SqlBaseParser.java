// Generated from /Users/ysir/Documents/GitHub/spark/sql/catalyst/src/main/antlr4/org/apache/spark/sql/catalyst/parser/SqlBase.g4 by ANTLR 4.7.1
package org.apache.spark.sql.catalyst.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, ADD=11, AFTER=12, ALL=13, ALTER=14, ANALYZE=15, AND=16, ANTI=17, 
		ANY=18, ARCHIVE=19, ARRAY=20, AS=21, ASC=22, AT=23, AUTHORIZATION=24, 
		BETWEEN=25, BOTH=26, BUCKET=27, BUCKETS=28, BY=29, CACHE=30, CASCADE=31, 
		CASE=32, CAST=33, CHANGE=34, CHECK=35, CLEAR=36, CLUSTER=37, CLUSTERED=38, 
		CODEGEN=39, COLLATE=40, COLLECTION=41, COLUMN=42, COLUMNS=43, COMMENT=44, 
		COMMIT=45, COMPACT=46, COMPACTIONS=47, COMPUTE=48, CONCATENATE=49, CONSTRAINT=50, 
		COST=51, CREATE=52, CROSS=53, CUBE=54, CURRENT=55, CURRENT_DATE=56, CURRENT_TIME=57, 
		CURRENT_TIMESTAMP=58, CURRENT_USER=59, DATA=60, DATABASE=61, DATABASES=62, 
		DAY=63, DAYS=64, DBPROPERTIES=65, DEFINED=66, DELETE=67, DELIMITED=68, 
		DESC=69, DESCRIBE=70, DFS=71, DIRECTORIES=72, DIRECTORY=73, DISTINCT=74, 
		DISTRIBUTE=75, DROP=76, ELSE=77, END=78, ESCAPED=79, EXCEPT=80, EXCHANGE=81, 
		EXISTS=82, EXPLAIN=83, EXPORT=84, EXTENDED=85, EXTERNAL=86, EXTRACT=87, 
		FALSE=88, FETCH=89, FIELDS=90, FILEFORMAT=91, FIRST=92, FIRST_VALUE=93, 
		FOLLOWING=94, FOR=95, FOREIGN=96, FORMAT=97, FORMATTED=98, FROM=99, FULL=100, 
		FUNCTION=101, FUNCTIONS=102, GLOBAL=103, GRANT=104, GROUP=105, GROUPING=106, 
		HAVING=107, HOUR=108, HOURS=109, IF=110, IGNORE=111, IMPORT=112, IN=113, 
		INDEX=114, INDEXES=115, INNER=116, INPATH=117, INPUTFORMAT=118, INSERT=119, 
		INTERSECT=120, INTERVAL=121, INTO=122, IS=123, ITEMS=124, JOIN=125, KEYS=126, 
		LAST=127, LAST_VALUE=128, LATERAL=129, LAZY=130, LEADING=131, LEFT=132, 
		LIKE=133, LIMIT=134, LINES=135, LIST=136, LOAD=137, LOCAL=138, LOCATION=139, 
		LOCK=140, LOCKS=141, LOGICAL=142, MACRO=143, MAP=144, MICROSECOND=145, 
		MICROSECONDS=146, MILLISECOND=147, MILLISECONDS=148, MINUTE=149, MINUTES=150, 
		MONTH=151, MONTHS=152, MSCK=153, NAMESPACE=154, NAMESPACES=155, NATURAL=156, 
		NO=157, NOT=158, NULL=159, NULLS=160, OF=161, ON=162, ONLY=163, OPTION=164, 
		OPTIONS=165, OR=166, ORDER=167, OUT=168, OUTER=169, OUTPUTFORMAT=170, 
		OVER=171, OVERLAPS=172, OVERLAY=173, OVERWRITE=174, PARTITION=175, PARTITIONED=176, 
		PARTITIONS=177, PERCENTLIT=178, PIVOT=179, PLACING=180, POSITION=181, 
		PRECEDING=182, PRIMARY=183, PRINCIPALS=184, PROPERTIES=185, PURGE=186, 
		QUERY=187, RANGE=188, RECORDREADER=189, RECORDWRITER=190, RECOVER=191, 
		REDUCE=192, REFERENCES=193, REFRESH=194, RENAME=195, REPAIR=196, REPLACE=197, 
		RESET=198, RESPECT=199, RESTRICT=200, REVOKE=201, RIGHT=202, RLIKE=203, 
		ROLE=204, ROLES=205, ROLLBACK=206, ROLLUP=207, ROW=208, ROWS=209, SCHEMA=210, 
		SECOND=211, SECONDS=212, SELECT=213, SEMI=214, SEPARATED=215, SERDE=216, 
		SERDEPROPERTIES=217, SESSION_USER=218, SET=219, SETMINUS=220, SETS=221, 
		SHOW=222, SKEWED=223, SOME=224, SORT=225, SORTED=226, START=227, STATISTICS=228, 
		STORED=229, STRATIFY=230, STRUCT=231, SUBSTR=232, SUBSTRING=233, TABLE=234, 
		TABLES=235, TABLESAMPLE=236, TBLPROPERTIES=237, TEMPORARY=238, TERMINATED=239, 
		THEN=240, TO=241, TOUCH=242, TRAILING=243, TRANSACTION=244, TRANSACTIONS=245, 
		TRANSFORM=246, TRIM=247, TRUE=248, TRUNCATE=249, TYPE=250, UNARCHIVE=251, 
		UNBOUNDED=252, UNCACHE=253, UNION=254, UNIQUE=255, UNKNOWN=256, UNLOCK=257, 
		UNSET=258, UPDATE=259, USE=260, USER=261, USING=262, VALUES=263, VIEW=264, 
		WEEK=265, WEEKS=266, WHEN=267, WHERE=268, WINDOW=269, WITH=270, YEAR=271, 
		YEARS=272, EQ=273, NSEQ=274, NEQ=275, NEQJ=276, LT=277, LTE=278, GT=279, 
		GTE=280, PLUS=281, MINUS=282, ASTERISK=283, SLASH=284, PERCENT=285, DIV=286, 
		TILDE=287, AMPERSAND=288, PIPE=289, CONCAT_PIPE=290, HAT=291, STRING=292, 
		BIGINT_LITERAL=293, SMALLINT_LITERAL=294, TINYINT_LITERAL=295, INTEGER_VALUE=296, 
		DECIMAL_VALUE=297, DOUBLE_LITERAL=298, BIGDECIMAL_LITERAL=299, IDENTIFIER=300, 
		BACKQUOTED_IDENTIFIER=301, SIMPLE_COMMENT=302, BRACKETED_EMPTY_COMMENT=303, 
		BRACKETED_COMMENT=304, WS=305, UNRECOGNIZED=306;
	public static final int
		RULE_singleStatement = 0, RULE_singleExpression = 1, RULE_singleTableIdentifier = 2, 
		RULE_singleMultipartIdentifier = 3, RULE_singleFunctionIdentifier = 4, 
		RULE_singleDataType = 5, RULE_singleTableSchema = 6, RULE_singleInterval = 7, 
		RULE_statement = 8, RULE_unsupportedHiveNativeCommands = 9, RULE_createTableHeader = 10, 
		RULE_replaceTableHeader = 11, RULE_bucketSpec = 12, RULE_skewSpec = 13, 
		RULE_locationSpec = 14, RULE_query = 15, RULE_insertInto = 16, RULE_partitionSpecLocation = 17, 
		RULE_partitionSpec = 18, RULE_partitionVal = 19, RULE_database = 20, RULE_describeFuncName = 21, 
		RULE_describeColName = 22, RULE_ctes = 23, RULE_namedQuery = 24, RULE_tableProvider = 25, 
		RULE_tablePropertyList = 26, RULE_tableProperty = 27, RULE_tablePropertyKey = 28, 
		RULE_tablePropertyValue = 29, RULE_constantList = 30, RULE_nestedConstantList = 31, 
		RULE_createFileFormat = 32, RULE_fileFormat = 33, RULE_storageHandler = 34, 
		RULE_resource = 35, RULE_dmlStatementNoWith = 36, RULE_queryOrganization = 37, 
		RULE_multiInsertQueryBody = 38, RULE_queryTerm = 39, RULE_queryPrimary = 40, 
		RULE_sortItem = 41, RULE_fromStatement = 42, RULE_fromStatementBody = 43, 
		RULE_querySpecification = 44, RULE_transformClause = 45, RULE_selectClause = 46, 
		RULE_setClause = 47, RULE_assign = 48, RULE_whereClause = 49, RULE_havingClause = 50, 
		RULE_hint = 51, RULE_hintStatement = 52, RULE_fromClause = 53, RULE_aggregationClause = 54, 
		RULE_groupingSet = 55, RULE_pivotClause = 56, RULE_pivotColumn = 57, RULE_pivotValue = 58, 
		RULE_lateralView = 59, RULE_setQuantifier = 60, RULE_relation = 61, RULE_joinRelation = 62, 
		RULE_joinType = 63, RULE_joinCriteria = 64, RULE_sample = 65, RULE_sampleMethod = 66, 
		RULE_identifierList = 67, RULE_identifierSeq = 68, RULE_orderedIdentifierList = 69, 
		RULE_orderedIdentifier = 70, RULE_identifierCommentList = 71, RULE_identifierComment = 72, 
		RULE_relationPrimary = 73, RULE_inlineTable = 74, RULE_functionTable = 75, 
		RULE_tableAlias = 76, RULE_rowFormat = 77, RULE_multipartIdentifier = 78, 
		RULE_tableIdentifier = 79, RULE_functionIdentifier = 80, RULE_namedExpression = 81, 
		RULE_namedExpressionSeq = 82, RULE_transformList = 83, RULE_transform = 84, 
		RULE_transformArgument = 85, RULE_expression = 86, RULE_booleanExpression = 87, 
		RULE_predicate = 88, RULE_valueExpression = 89, RULE_primaryExpression = 90, 
		RULE_constant = 91, RULE_comparisonOperator = 92, RULE_arithmeticOperator = 93, 
		RULE_predicateOperator = 94, RULE_booleanValue = 95, RULE_interval = 96, 
		RULE_errorCapturingMultiUnitsInterval = 97, RULE_multiUnitsInterval = 98, 
		RULE_errorCapturingUnitToUnitInterval = 99, RULE_unitToUnitInterval = 100, 
		RULE_intervalValue = 101, RULE_intervalUnit = 102, RULE_colPosition = 103, 
		RULE_dataType = 104, RULE_qualifiedColTypeWithPositionList = 105, RULE_qualifiedColTypeWithPosition = 106, 
		RULE_colTypeList = 107, RULE_colType = 108, RULE_complexColTypeList = 109, 
		RULE_complexColType = 110, RULE_whenClause = 111, RULE_windowClause = 112, 
		RULE_namedWindow = 113, RULE_windowSpec = 114, RULE_windowFrame = 115, 
		RULE_frameBound = 116, RULE_qualifiedNameList = 117, RULE_qualifiedName = 118, 
		RULE_errorCapturingIdentifier = 119, RULE_errorCapturingIdentifierExtra = 120, 
		RULE_identifier = 121, RULE_strictIdentifier = 122, RULE_quotedIdentifier = 123, 
		RULE_number = 124, RULE_ansiNonReserved = 125, RULE_strictNonReserved = 126, 
		RULE_nonReserved = 127;
	public static final String[] ruleNames = {
		"singleStatement", "singleExpression", "singleTableIdentifier", "singleMultipartIdentifier", 
		"singleFunctionIdentifier", "singleDataType", "singleTableSchema", "singleInterval", 
		"statement", "unsupportedHiveNativeCommands", "createTableHeader", "replaceTableHeader", 
		"bucketSpec", "skewSpec", "locationSpec", "query", "insertInto", "partitionSpecLocation", 
		"partitionSpec", "partitionVal", "database", "describeFuncName", "describeColName", 
		"ctes", "namedQuery", "tableProvider", "tablePropertyList", "tableProperty", 
		"tablePropertyKey", "tablePropertyValue", "constantList", "nestedConstantList", 
		"createFileFormat", "fileFormat", "storageHandler", "resource", "dmlStatementNoWith", 
		"queryOrganization", "multiInsertQueryBody", "queryTerm", "queryPrimary", 
		"sortItem", "fromStatement", "fromStatementBody", "querySpecification", 
		"transformClause", "selectClause", "setClause", "assign", "whereClause", 
		"havingClause", "hint", "hintStatement", "fromClause", "aggregationClause", 
		"groupingSet", "pivotClause", "pivotColumn", "pivotValue", "lateralView", 
		"setQuantifier", "relation", "joinRelation", "joinType", "joinCriteria", 
		"sample", "sampleMethod", "identifierList", "identifierSeq", "orderedIdentifierList", 
		"orderedIdentifier", "identifierCommentList", "identifierComment", "relationPrimary", 
		"inlineTable", "functionTable", "tableAlias", "rowFormat", "multipartIdentifier", 
		"tableIdentifier", "functionIdentifier", "namedExpression", "namedExpressionSeq", 
		"transformList", "transform", "transformArgument", "expression", "booleanExpression", 
		"predicate", "valueExpression", "primaryExpression", "constant", "comparisonOperator", 
		"arithmeticOperator", "predicateOperator", "booleanValue", "interval", 
		"errorCapturingMultiUnitsInterval", "multiUnitsInterval", "errorCapturingUnitToUnitInterval", 
		"unitToUnitInterval", "intervalValue", "intervalUnit", "colPosition", 
		"dataType", "qualifiedColTypeWithPositionList", "qualifiedColTypeWithPosition", 
		"colTypeList", "colType", "complexColTypeList", "complexColType", "whenClause", 
		"windowClause", "namedWindow", "windowSpec", "windowFrame", "frameBound", 
		"qualifiedNameList", "qualifiedName", "errorCapturingIdentifier", "errorCapturingIdentifierExtra", 
		"identifier", "strictIdentifier", "quotedIdentifier", "number", "ansiNonReserved", 
		"strictNonReserved", "nonReserved"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'.'", "'/*+'", "'*/'", "'->'", "'['", "']'", 
		"':'", "'ADD'", "'AFTER'", "'ALL'", "'ALTER'", "'ANALYZE'", "'AND'", "'ANTI'", 
		"'ANY'", "'ARCHIVE'", "'ARRAY'", "'AS'", "'ASC'", "'AT'", "'AUTHORIZATION'", 
		"'BETWEEN'", "'BOTH'", "'BUCKET'", "'BUCKETS'", "'BY'", "'CACHE'", "'CASCADE'", 
		"'CASE'", "'CAST'", "'CHANGE'", "'CHECK'", "'CLEAR'", "'CLUSTER'", "'CLUSTERED'", 
		"'CODEGEN'", "'COLLATE'", "'COLLECTION'", "'COLUMN'", "'COLUMNS'", "'COMMENT'", 
		"'COMMIT'", "'COMPACT'", "'COMPACTIONS'", "'COMPUTE'", "'CONCATENATE'", 
		"'CONSTRAINT'", "'COST'", "'CREATE'", "'CROSS'", "'CUBE'", "'CURRENT'", 
		"'CURRENT_DATE'", "'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", "'CURRENT_USER'", 
		"'DATA'", "'DATABASE'", null, "'DAY'", "'DAYS'", "'DBPROPERTIES'", "'DEFINED'", 
		"'DELETE'", "'DELIMITED'", "'DESC'", "'DESCRIBE'", "'DFS'", "'DIRECTORIES'", 
		"'DIRECTORY'", "'DISTINCT'", "'DISTRIBUTE'", "'DROP'", "'ELSE'", "'END'", 
		"'ESCAPED'", "'EXCEPT'", "'EXCHANGE'", "'EXISTS'", "'EXPLAIN'", "'EXPORT'", 
		"'EXTENDED'", "'EXTERNAL'", "'EXTRACT'", "'FALSE'", "'FETCH'", "'FIELDS'", 
		"'FILEFORMAT'", "'FIRST'", "'FIRST_VALUE'", "'FOLLOWING'", "'FOR'", "'FOREIGN'", 
		"'FORMAT'", "'FORMATTED'", "'FROM'", "'FULL'", "'FUNCTION'", "'FUNCTIONS'", 
		"'GLOBAL'", "'GRANT'", "'GROUP'", "'GROUPING'", "'HAVING'", "'HOUR'", 
		"'HOURS'", "'IF'", "'IGNORE'", "'IMPORT'", "'IN'", "'INDEX'", "'INDEXES'", 
		"'INNER'", "'INPATH'", "'INPUTFORMAT'", "'INSERT'", "'INTERSECT'", "'INTERVAL'", 
		"'INTO'", "'IS'", "'ITEMS'", "'JOIN'", "'KEYS'", "'LAST'", "'LAST_VALUE'", 
		"'LATERAL'", "'LAZY'", "'LEADING'", "'LEFT'", "'LIKE'", "'LIMIT'", "'LINES'", 
		"'LIST'", "'LOAD'", "'LOCAL'", "'LOCATION'", "'LOCK'", "'LOCKS'", "'LOGICAL'", 
		"'MACRO'", "'MAP'", "'MICROSECOND'", "'MICROSECONDS'", "'MILLISECOND'", 
		"'MILLISECONDS'", "'MINUTE'", "'MINUTES'", "'MONTH'", "'MONTHS'", "'MSCK'", 
		"'NAMESPACE'", "'NAMESPACES'", "'NATURAL'", "'NO'", null, "'NULL'", "'NULLS'", 
		"'OF'", "'ON'", "'ONLY'", "'OPTION'", "'OPTIONS'", "'OR'", "'ORDER'", 
		"'OUT'", "'OUTER'", "'OUTPUTFORMAT'", "'OVER'", "'OVERLAPS'", "'OVERLAY'", 
		"'OVERWRITE'", "'PARTITION'", "'PARTITIONED'", "'PARTITIONS'", "'PERCENT'", 
		"'PIVOT'", "'PLACING'", "'POSITION'", "'PRECEDING'", "'PRIMARY'", "'PRINCIPALS'", 
		"'PROPERTIES'", "'PURGE'", "'QUERY'", "'RANGE'", "'RECORDREADER'", "'RECORDWRITER'", 
		"'RECOVER'", "'REDUCE'", "'REFERENCES'", "'REFRESH'", "'RENAME'", "'REPAIR'", 
		"'REPLACE'", "'RESET'", "'RESPECT'", "'RESTRICT'", "'REVOKE'", "'RIGHT'", 
		null, "'ROLE'", "'ROLES'", "'ROLLBACK'", "'ROLLUP'", "'ROW'", "'ROWS'", 
		"'SCHEMA'", "'SECOND'", "'SECONDS'", "'SELECT'", "'SEMI'", "'SEPARATED'", 
		"'SERDE'", "'SERDEPROPERTIES'", "'SESSION_USER'", "'SET'", "'MINUS'", 
		"'SETS'", "'SHOW'", "'SKEWED'", "'SOME'", "'SORT'", "'SORTED'", "'START'", 
		"'STATISTICS'", "'STORED'", "'STRATIFY'", "'STRUCT'", "'SUBSTR'", "'SUBSTRING'", 
		"'TABLE'", "'TABLES'", "'TABLESAMPLE'", "'TBLPROPERTIES'", null, "'TERMINATED'", 
		"'THEN'", "'TO'", "'TOUCH'", "'TRAILING'", "'TRANSACTION'", "'TRANSACTIONS'", 
		"'TRANSFORM'", "'TRIM'", "'TRUE'", "'TRUNCATE'", "'TYPE'", "'UNARCHIVE'", 
		"'UNBOUNDED'", "'UNCACHE'", "'UNION'", "'UNIQUE'", "'UNKNOWN'", "'UNLOCK'", 
		"'UNSET'", "'UPDATE'", "'USE'", "'USER'", "'USING'", "'VALUES'", "'VIEW'", 
		"'WEEK'", "'WEEKS'", "'WHEN'", "'WHERE'", "'WINDOW'", "'WITH'", "'YEAR'", 
		"'YEARS'", null, "'<=>'", "'<>'", "'!='", "'<'", null, "'>'", null, "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'DIV'", "'~'", "'&'", "'|'", "'||'", "'^'", 
		null, null, null, null, null, null, null, null, null, null, null, "'/**/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "ADD", 
		"AFTER", "ALL", "ALTER", "ANALYZE", "AND", "ANTI", "ANY", "ARCHIVE", "ARRAY", 
		"AS", "ASC", "AT", "AUTHORIZATION", "BETWEEN", "BOTH", "BUCKET", "BUCKETS", 
		"BY", "CACHE", "CASCADE", "CASE", "CAST", "CHANGE", "CHECK", "CLEAR", 
		"CLUSTER", "CLUSTERED", "CODEGEN", "COLLATE", "COLLECTION", "COLUMN", 
		"COLUMNS", "COMMENT", "COMMIT", "COMPACT", "COMPACTIONS", "COMPUTE", "CONCATENATE", 
		"CONSTRAINT", "COST", "CREATE", "CROSS", "CUBE", "CURRENT", "CURRENT_DATE", 
		"CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", "DATA", "DATABASE", 
		"DATABASES", "DAY", "DAYS", "DBPROPERTIES", "DEFINED", "DELETE", "DELIMITED", 
		"DESC", "DESCRIBE", "DFS", "DIRECTORIES", "DIRECTORY", "DISTINCT", "DISTRIBUTE", 
		"DROP", "ELSE", "END", "ESCAPED", "EXCEPT", "EXCHANGE", "EXISTS", "EXPLAIN", 
		"EXPORT", "EXTENDED", "EXTERNAL", "EXTRACT", "FALSE", "FETCH", "FIELDS", 
		"FILEFORMAT", "FIRST", "FIRST_VALUE", "FOLLOWING", "FOR", "FOREIGN", "FORMAT", 
		"FORMATTED", "FROM", "FULL", "FUNCTION", "FUNCTIONS", "GLOBAL", "GRANT", 
		"GROUP", "GROUPING", "HAVING", "HOUR", "HOURS", "IF", "IGNORE", "IMPORT", 
		"IN", "INDEX", "INDEXES", "INNER", "INPATH", "INPUTFORMAT", "INSERT", 
		"INTERSECT", "INTERVAL", "INTO", "IS", "ITEMS", "JOIN", "KEYS", "LAST", 
		"LAST_VALUE", "LATERAL", "LAZY", "LEADING", "LEFT", "LIKE", "LIMIT", "LINES", 
		"LIST", "LOAD", "LOCAL", "LOCATION", "LOCK", "LOCKS", "LOGICAL", "MACRO", 
		"MAP", "MICROSECOND", "MICROSECONDS", "MILLISECOND", "MILLISECONDS", "MINUTE", 
		"MINUTES", "MONTH", "MONTHS", "MSCK", "NAMESPACE", "NAMESPACES", "NATURAL", 
		"NO", "NOT", "NULL", "NULLS", "OF", "ON", "ONLY", "OPTION", "OPTIONS", 
		"OR", "ORDER", "OUT", "OUTER", "OUTPUTFORMAT", "OVER", "OVERLAPS", "OVERLAY", 
		"OVERWRITE", "PARTITION", "PARTITIONED", "PARTITIONS", "PERCENTLIT", "PIVOT", 
		"PLACING", "POSITION", "PRECEDING", "PRIMARY", "PRINCIPALS", "PROPERTIES", 
		"PURGE", "QUERY", "RANGE", "RECORDREADER", "RECORDWRITER", "RECOVER", 
		"REDUCE", "REFERENCES", "REFRESH", "RENAME", "REPAIR", "REPLACE", "RESET", 
		"RESPECT", "RESTRICT", "REVOKE", "RIGHT", "RLIKE", "ROLE", "ROLES", "ROLLBACK", 
		"ROLLUP", "ROW", "ROWS", "SCHEMA", "SECOND", "SECONDS", "SELECT", "SEMI", 
		"SEPARATED", "SERDE", "SERDEPROPERTIES", "SESSION_USER", "SET", "SETMINUS", 
		"SETS", "SHOW", "SKEWED", "SOME", "SORT", "SORTED", "START", "STATISTICS", 
		"STORED", "STRATIFY", "STRUCT", "SUBSTR", "SUBSTRING", "TABLE", "TABLES", 
		"TABLESAMPLE", "TBLPROPERTIES", "TEMPORARY", "TERMINATED", "THEN", "TO", 
		"TOUCH", "TRAILING", "TRANSACTION", "TRANSACTIONS", "TRANSFORM", "TRIM", 
		"TRUE", "TRUNCATE", "TYPE", "UNARCHIVE", "UNBOUNDED", "UNCACHE", "UNION", 
		"UNIQUE", "UNKNOWN", "UNLOCK", "UNSET", "UPDATE", "USE", "USER", "USING", 
		"VALUES", "VIEW", "WEEK", "WEEKS", "WHEN", "WHERE", "WINDOW", "WITH", 
		"YEAR", "YEARS", "EQ", "NSEQ", "NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", 
		"PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", "DIV", "TILDE", "AMPERSAND", 
		"PIPE", "CONCAT_PIPE", "HAT", "STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", 
		"TINYINT_LITERAL", "INTEGER_VALUE", "DECIMAL_VALUE", "DOUBLE_LITERAL", 
		"BIGDECIMAL_LITERAL", "IDENTIFIER", "BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", 
		"BRACKETED_EMPTY_COMMENT", "BRACKETED_COMMENT", "WS", "UNRECOGNIZED"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  /**
	   * When false, INTERSECT is given the greater precedence over the other set
	   * operations (UNION, EXCEPT and MINUS) as per the SQL standard.
	   */
	  public boolean legacy_setops_precedence_enbled = false;

	  /**
	   * Verify whether current token is a valid decimal token (which contains dot).
	   * Returns true if the character that follows the token is not a digit or letter or underscore.
	   *
	   * For example:
	   * For char stream "2.3", "2." is not a valid decimal token, because it is followed by digit '3'.
	   * For char stream "2.3_", "2.3" is not a valid decimal token, because it is followed by '_'.
	   * For char stream "2.3W", "2.3" is not a valid decimal token, because it is followed by 'W'.
	   * For char stream "12.0D 34.E2+0.12 "  12.0D is a valid decimal token because it is followed
	   * by a space. 34.E2 is a valid decimal token because it is followed by symbol '+'
	   * which is not a digit or letter or underscore.
	   */
	  public boolean isValidDecimal() {
	    int nextChar = _input.LA(1);
	    if (nextChar >= 'A' && nextChar <= 'Z' || nextChar >= '0' && nextChar <= '9' ||
	      nextChar == '_') {
	      return false;
	    } else {
	      return true;
	    }
	  }

	  /**
	   * When true, ANSI SQL parsing mode is enabled.
	   */
	  public boolean ansi = false;

	public SqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			statement();
			setState(257);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleExpressionContext extends ParserRuleContext {
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			namedExpression();
			setState(260);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTableIdentifierContext extends ParserRuleContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleTableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableIdentifierContext singleTableIdentifier() throws RecognitionException {
		SingleTableIdentifierContext _localctx = new SingleTableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleTableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			tableIdentifier();
			setState(263);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleMultipartIdentifierContext extends ParserRuleContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleMultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleMultipartIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleMultipartIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleMultipartIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleMultipartIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleMultipartIdentifierContext singleMultipartIdentifier() throws RecognitionException {
		SingleMultipartIdentifierContext _localctx = new SingleMultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleMultipartIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			multipartIdentifier();
			setState(266);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleFunctionIdentifierContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleFunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleFunctionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleFunctionIdentifierContext singleFunctionIdentifier() throws RecognitionException {
		SingleFunctionIdentifierContext _localctx = new SingleFunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleFunctionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			functionIdentifier();
			setState(269);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleDataTypeContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDataTypeContext singleDataType() throws RecognitionException {
		SingleDataTypeContext _localctx = new SingleDataTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			dataType();
			setState(272);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTableSchemaContext extends ParserRuleContext {
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleTableSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableSchema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleTableSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleTableSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleTableSchema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableSchemaContext singleTableSchema() throws RecognitionException {
		SingleTableSchemaContext _localctx = new SingleTableSchemaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singleTableSchema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			colTypeList();
			setState(275);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleIntervalContext extends ParserRuleContext {
		public MultiUnitsIntervalContext multiUnitsInterval() {
			return getRuleContext(MultiUnitsIntervalContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public SingleIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleIntervalContext singleInterval() throws RecognitionException {
		SingleIntervalContext _localctx = new SingleIntervalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_singleInterval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERVAL) {
				{
				setState(277);
				match(INTERVAL);
				}
			}

			setState(280);
			multiUnitsInterval();
			setState(281);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public ResetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitResetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeDatabaseContext extends StatementContext {
		public ErrorCapturingIdentifierContext db;
		public DatabaseContext database() {
			return getRuleContext(DatabaseContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public DescribeDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeDatabase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterViewQueryContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public AlterViewQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAlterViewQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAlterViewQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAlterViewQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseContext extends StatementContext {
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropNamespaceContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public DatabaseContext database() {
			return getRuleContext(DatabaseContext.class,0);
		}
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public DropNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTempViewUsingContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public CreateTempViewUsingContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTempViewUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTempViewUsing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTempViewUsing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableContext extends StatementContext {
		public TableIdentifierContext from;
		public TableIdentifierContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FailNativeCommandContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() {
			return getRuleContext(UnsupportedHiveNativeCommandsContext.class,0);
		}
		public FailNativeCommandContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFailNativeCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFailNativeCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFailNativeCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClearCacheContext extends StatementContext {
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public ClearCacheContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterClearCache(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitClearCache(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitClearCache(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropViewContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RecoverPartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public RecoverPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRecoverPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRecoverPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRecoverPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeleteFromTableContext extends StatementContext {
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteFromTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDeleteFromTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDeleteFromTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDeleteFromTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTablePartitionContext extends StatementContext {
		public PartitionSpecContext from;
		public PartitionSpecContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public RenameTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepairTableContext extends StatementContext {
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public RepairTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRepairTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRepairTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRepairTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshResourceContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public RefreshResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRefreshResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRefreshResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRefreshResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowNamespacesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode NAMESPACES() { return getToken(SqlBaseParser.NAMESPACES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowNamespacesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowNamespaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowNamespaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowNamespaces(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowColumnsContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext namespace;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public List<TerminalNode> FROM() { return getTokens(SqlBaseParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(SqlBaseParser.FROM, i);
		}
		public List<TerminalNode> IN() { return getTokens(SqlBaseParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(SqlBaseParser.IN, i);
		}
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReplaceTableContext extends StatementContext {
		public TablePropertyListContext options;
		public TransformListContext partitioning;
		public Token comment;
		public TablePropertyListContext tableProps;
		public ReplaceTableHeaderContext replaceTableHeader() {
			return getRuleContext(ReplaceTableHeaderContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public List<BucketSpecContext> bucketSpec() {
			return getRuleContexts(BucketSpecContext.class);
		}
		public BucketSpecContext bucketSpec(int i) {
			return getRuleContext(BucketSpecContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<TerminalNode> OPTIONS() { return getTokens(SqlBaseParser.OPTIONS); }
		public TerminalNode OPTIONS(int i) {
			return getToken(SqlBaseParser.OPTIONS, i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(SqlBaseParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(SqlBaseParser.COMMENT, i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public List<TransformListContext> transformList() {
			return getRuleContexts(TransformListContext.class);
		}
		public TransformListContext transformList(int i) {
			return getRuleContext(TransformListContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public ReplaceTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterReplaceTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitReplaceTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitReplaceTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddTablePartitionContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<PartitionSpecLocationContext> partitionSpecLocation() {
			return getRuleContexts(PartitionSpecLocationContext.class);
		}
		public PartitionSpecLocationContext partitionSpecLocation(int i) {
			return getRuleContext(PartitionSpecLocationContext.class,i);
		}
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public AddTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAddTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAddTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAddTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshTableContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public RefreshTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRefreshTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRefreshTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRefreshTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UpdateTableContext extends StatementContext {
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SetClauseContext setClause() {
			return getRuleContext(SetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUpdateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUpdateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUpdateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ManageResourceContext extends StatementContext {
		public Token op;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public ManageResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterManageResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitManageResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitManageResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnalyzeContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public AnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAnalyze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAnalyze(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAnalyze(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateHiveTableContext extends StatementContext {
		public ColTypeListContext columns;
		public Token comment;
		public ColTypeListContext partitionColumns;
		public IdentifierListContext partitionColumnNames;
		public TablePropertyListContext tableProps;
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public List<BucketSpecContext> bucketSpec() {
			return getRuleContexts(BucketSpecContext.class);
		}
		public BucketSpecContext bucketSpec(int i) {
			return getRuleContext(BucketSpecContext.class,i);
		}
		public List<SkewSpecContext> skewSpec() {
			return getRuleContexts(SkewSpecContext.class);
		}
		public SkewSpecContext skewSpec(int i) {
			return getRuleContext(SkewSpecContext.class,i);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<CreateFileFormatContext> createFileFormat() {
			return getRuleContexts(CreateFileFormatContext.class);
		}
		public CreateFileFormatContext createFileFormat(int i) {
			return getRuleContext(CreateFileFormatContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<ColTypeListContext> colTypeList() {
			return getRuleContexts(ColTypeListContext.class);
		}
		public ColTypeListContext colTypeList(int i) {
			return getRuleContext(ColTypeListContext.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(SqlBaseParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(SqlBaseParser.COMMENT, i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CreateHiveTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateHiveTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateHiveTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateHiveTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateFunctionContext extends StatementContext {
		public Token className;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public CreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTableContext extends StatementContext {
		public ErrorCapturingIdentifierContext db;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public ShowTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetDatabaseLocationContext extends StatementContext {
		public ErrorCapturingIdentifierContext db;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public DatabaseContext database() {
			return getRuleContext(DatabaseContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public SetDatabaseLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetDatabaseLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetDatabaseLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetDatabaseLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetDatabasePropertiesContext extends StatementContext {
		public ErrorCapturingIdentifierContext db;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public DatabaseContext database() {
			return getRuleContext(DatabaseContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public SetDatabasePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetDatabaseProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetDatabaseProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetDatabaseProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableContext extends StatementContext {
		public TablePropertyListContext options;
		public TransformListContext partitioning;
		public Token comment;
		public TablePropertyListContext tableProps;
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public List<BucketSpecContext> bucketSpec() {
			return getRuleContexts(BucketSpecContext.class);
		}
		public BucketSpecContext bucketSpec(int i) {
			return getRuleContext(BucketSpecContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<TerminalNode> OPTIONS() { return getTokens(SqlBaseParser.OPTIONS); }
		public TerminalNode OPTIONS(int i) {
			return getToken(SqlBaseParser.OPTIONS, i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(SqlBaseParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(SqlBaseParser.COMMENT, i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public List<TransformListContext> transformList() {
			return getRuleContexts(TransformListContext.class);
		}
		public TransformListContext transformList(int i) {
			return getRuleContext(TransformListContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DmlStatementContext extends StatementContext {
		public DmlStatementNoWithContext dmlStatementNoWith() {
			return getRuleContext(DmlStatementNoWithContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public DmlStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDmlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDmlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDmlStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeTableContext extends StatementContext {
		public Token option;
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public DescribeColNameContext describeColName() {
			return getRuleContext(DescribeColNameContext.class,0);
		}
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public DescribeTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableLikeContext extends StatementContext {
		public TableIdentifierContext target;
		public TableIdentifierContext source;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public CreateTableLikeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UncacheTableContext extends StatementContext {
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public UncacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUncacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUncacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUncacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropFunctionContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoadDataContext extends StatementContext {
		public Token path;
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LoadDataContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLoadData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLoadData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLoadData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowPartitionsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public ShowPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeFunctionContext extends StatementContext {
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public DescribeFuncNameContext describeFuncName() {
			return getRuleContext(DescribeFuncNameContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public DescribeFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableColumnContext extends StatementContext {
		public QualifiedNameContext from;
		public IdentifierContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RenameTableColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTableColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTableColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTableColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChangeColumnContext extends StatementContext {
		public ErrorCapturingIdentifierContext colName;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public ChangeColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterChangeColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitChangeColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitChangeColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeQueryContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode QUERY() { return getToken(SqlBaseParser.QUERY, 0); }
		public DescribeQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TruncateTableContext extends StatementContext {
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TruncateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTruncateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTruncateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTruncateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableSerDeContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public SetTableSerDeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTableSerDe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTableSerDe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTableSerDe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public IdentifierCommentListContext identifierCommentList() {
			return getRuleContext(IdentifierCommentListContext.class,0);
		}
		public List<TerminalNode> COMMENT() { return getTokens(SqlBaseParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(SqlBaseParser.COMMENT, i);
		}
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> ON() { return getTokens(SqlBaseParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(SqlBaseParser.ON, i);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTablePartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public DropTablePartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTablePartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTablePartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTablePartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public SetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableColumnContext extends StatementContext {
		public Token comment;
		public List<TerminalNode> ALTER() { return getTokens(SqlBaseParser.ALTER); }
		public TerminalNode ALTER(int i) {
			return getToken(SqlBaseParser.ALTER, i);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public AlterTableColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAlterTableColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAlterTableColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAlterTableColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateNamespaceContext extends StatementContext {
		public Token comment;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public DatabaseContext database() {
			return getRuleContext(DatabaseContext.class,0);
		}
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(SqlBaseParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(SqlBaseParser.COMMENT, i);
		}
		public List<TerminalNode> WITH() { return getTokens(SqlBaseParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(SqlBaseParser.WITH, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public List<TerminalNode> DBPROPERTIES() { return getTokens(SqlBaseParser.DBPROPERTIES); }
		public TerminalNode DBPROPERTIES(int i) {
			return getToken(SqlBaseParser.DBPROPERTIES, i);
		}
		public List<TerminalNode> PROPERTIES() { return getTokens(SqlBaseParser.PROPERTIES); }
		public TerminalNode PROPERTIES(int i) {
			return getToken(SqlBaseParser.PROPERTIES, i);
		}
		public CreateNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTblPropertiesContext extends StatementContext {
		public TableIdentifierContext table;
		public TablePropertyKeyContext key;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public ShowTblPropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTblProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTblProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTblProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnsetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public UnsetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnsetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnsetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnsetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public SetTableLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTableLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTableLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTableLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableColumnsContext extends StatementContext {
		public QualifiedNameListContext columns;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public DropTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTableColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTableColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowFunctionsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CacheTableContext extends StatementContext {
		public TablePropertyListContext options;
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddTableColumnsContext extends StatementContext {
		public QualifiedColTypeWithPositionListContext columns;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() {
			return getRuleContext(QualifiedColTypeWithPositionListContext.class,0);
		}
		public AddTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAddTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAddTableColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAddTableColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public SetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(1007);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				query();
				}
				break;
			case 2:
				_localctx = new DmlStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(284);
					ctes();
					}
				}

				setState(287);
				dmlStatementNoWith();
				}
				break;
			case 3:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				match(USE);
				setState(290);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(289);
					match(NAMESPACE);
					}
					break;
				}
				setState(292);
				multipartIdentifier();
				}
				break;
			case 4:
				_localctx = new CreateNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(293);
				match(CREATE);
				setState(296);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATABASE:
				case SCHEMA:
					{
					setState(294);
					database();
					}
					break;
				case NAMESPACE:
					{
					setState(295);
					match(NAMESPACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(301);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(298);
					match(IF);
					setState(299);
					match(NOT);
					setState(300);
					match(EXISTS);
					}
					break;
				}
				setState(303);
				multipartIdentifier();
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==LOCATION || _la==WITH) {
					{
					setState(310);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						{
						setState(304);
						match(COMMENT);
						setState(305);
						((CreateNamespaceContext)_localctx).comment = match(STRING);
						}
						}
						break;
					case LOCATION:
						{
						setState(306);
						locationSpec();
						}
						break;
					case WITH:
						{
						{
						setState(307);
						match(WITH);
						setState(308);
						_la = _input.LA(1);
						if ( !(_la==DBPROPERTIES || _la==PROPERTIES) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(309);
						tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				_localctx = new SetDatabasePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(315);
				match(ALTER);
				setState(316);
				database();
				setState(317);
				((SetDatabasePropertiesContext)_localctx).db = errorCapturingIdentifier();
				setState(318);
				match(SET);
				setState(319);
				match(DBPROPERTIES);
				setState(320);
				tablePropertyList();
				}
				break;
			case 6:
				_localctx = new SetDatabaseLocationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(322);
				match(ALTER);
				setState(323);
				database();
				setState(324);
				((SetDatabaseLocationContext)_localctx).db = errorCapturingIdentifier();
				setState(325);
				match(SET);
				setState(326);
				locationSpec();
				}
				break;
			case 7:
				_localctx = new DropNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(328);
				match(DROP);
				setState(331);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATABASE:
				case SCHEMA:
					{
					setState(329);
					database();
					}
					break;
				case NAMESPACE:
					{
					setState(330);
					match(NAMESPACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(335);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(333);
					match(IF);
					setState(334);
					match(EXISTS);
					}
					break;
				}
				setState(337);
				multipartIdentifier();
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(338);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 8:
				_localctx = new ShowNamespacesContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(341);
				match(SHOW);
				setState(342);
				_la = _input.LA(1);
				if ( !(_la==DATABASES || _la==NAMESPACES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(343);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(344);
					multipartIdentifier();
					}
				}

				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(348);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(347);
						match(LIKE);
						}
					}

					setState(350);
					((ShowNamespacesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 9:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(353);
				createTableHeader();
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(354);
					match(T__0);
					setState(355);
					colTypeList();
					setState(356);
					match(T__1);
					}
				}

				setState(360);
				tableProvider();
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CLUSTERED || _la==COMMENT || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (LOCATION - 139)) | (1L << (OPTIONS - 139)) | (1L << (PARTITIONED - 139)))) != 0) || _la==TBLPROPERTIES) {
					{
					setState(372);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPTIONS:
						{
						{
						setState(361);
						match(OPTIONS);
						setState(362);
						((CreateTableContext)_localctx).options = tablePropertyList();
						}
						}
						break;
					case PARTITIONED:
						{
						{
						setState(363);
						match(PARTITIONED);
						setState(364);
						match(BY);
						setState(365);
						((CreateTableContext)_localctx).partitioning = transformList();
						}
						}
						break;
					case CLUSTERED:
						{
						setState(366);
						bucketSpec();
						}
						break;
					case LOCATION:
						{
						setState(367);
						locationSpec();
						}
						break;
					case COMMENT:
						{
						{
						setState(368);
						match(COMMENT);
						setState(369);
						((CreateTableContext)_localctx).comment = match(STRING);
						}
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(370);
						match(TBLPROPERTIES);
						setState(371);
						((CreateTableContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(376);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0 || _la==AS || _la==FROM || _la==MAP || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (REDUCE - 192)) | (1L << (SELECT - 192)) | (1L << (TABLE - 192)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(378);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(377);
						match(AS);
						}
					}

					setState(380);
					query();
					}
				}

				}
				break;
			case 10:
				_localctx = new CreateHiveTableContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(383);
				createTableHeader();
				setState(388);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(384);
					match(T__0);
					setState(385);
					((CreateHiveTableContext)_localctx).columns = colTypeList();
					setState(386);
					match(T__1);
					}
					break;
				}
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CLUSTERED || _la==COMMENT || _la==LOCATION || _la==PARTITIONED || ((((_la - 208)) & ~0x3f) == 0 && ((1L << (_la - 208)) & ((1L << (ROW - 208)) | (1L << (SKEWED - 208)) | (1L << (STORED - 208)) | (1L << (TBLPROPERTIES - 208)))) != 0)) {
					{
					setState(410);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						{
						setState(390);
						match(COMMENT);
						setState(391);
						((CreateHiveTableContext)_localctx).comment = match(STRING);
						}
						}
						break;
					case PARTITIONED:
						{
						setState(401);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
						case 1:
							{
							setState(392);
							match(PARTITIONED);
							setState(393);
							match(BY);
							setState(394);
							match(T__0);
							setState(395);
							((CreateHiveTableContext)_localctx).partitionColumns = colTypeList();
							setState(396);
							match(T__1);
							}
							break;
						case 2:
							{
							setState(398);
							match(PARTITIONED);
							setState(399);
							match(BY);
							setState(400);
							((CreateHiveTableContext)_localctx).partitionColumnNames = identifierList();
							}
							break;
						}
						}
						break;
					case CLUSTERED:
						{
						setState(403);
						bucketSpec();
						}
						break;
					case SKEWED:
						{
						setState(404);
						skewSpec();
						}
						break;
					case ROW:
						{
						setState(405);
						rowFormat();
						}
						break;
					case STORED:
						{
						setState(406);
						createFileFormat();
						}
						break;
					case LOCATION:
						{
						setState(407);
						locationSpec();
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(408);
						match(TBLPROPERTIES);
						setState(409);
						((CreateHiveTableContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(414);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0 || _la==AS || _la==FROM || _la==MAP || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (REDUCE - 192)) | (1L << (SELECT - 192)) | (1L << (TABLE - 192)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(416);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(415);
						match(AS);
						}
					}

					setState(418);
					query();
					}
				}

				}
				break;
			case 11:
				_localctx = new CreateTableLikeContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(421);
				match(CREATE);
				setState(422);
				match(TABLE);
				setState(426);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(423);
					match(IF);
					setState(424);
					match(NOT);
					setState(425);
					match(EXISTS);
					}
					break;
				}
				setState(428);
				((CreateTableLikeContext)_localctx).target = tableIdentifier();
				setState(429);
				match(LIKE);
				setState(430);
				((CreateTableLikeContext)_localctx).source = tableIdentifier();
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(431);
					locationSpec();
					}
				}

				}
				break;
			case 12:
				_localctx = new ReplaceTableContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(434);
				replaceTableHeader();
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(435);
					match(T__0);
					setState(436);
					colTypeList();
					setState(437);
					match(T__1);
					}
				}

				setState(441);
				tableProvider();
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CLUSTERED || _la==COMMENT || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (LOCATION - 139)) | (1L << (OPTIONS - 139)) | (1L << (PARTITIONED - 139)))) != 0) || _la==TBLPROPERTIES) {
					{
					setState(453);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPTIONS:
						{
						{
						setState(442);
						match(OPTIONS);
						setState(443);
						((ReplaceTableContext)_localctx).options = tablePropertyList();
						}
						}
						break;
					case PARTITIONED:
						{
						{
						setState(444);
						match(PARTITIONED);
						setState(445);
						match(BY);
						setState(446);
						((ReplaceTableContext)_localctx).partitioning = transformList();
						}
						}
						break;
					case CLUSTERED:
						{
						setState(447);
						bucketSpec();
						}
						break;
					case LOCATION:
						{
						setState(448);
						locationSpec();
						}
						break;
					case COMMENT:
						{
						{
						setState(449);
						match(COMMENT);
						setState(450);
						((ReplaceTableContext)_localctx).comment = match(STRING);
						}
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(451);
						match(TBLPROPERTIES);
						setState(452);
						((ReplaceTableContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(457);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0 || _la==AS || _la==FROM || _la==MAP || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (REDUCE - 192)) | (1L << (SELECT - 192)) | (1L << (TABLE - 192)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(459);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(458);
						match(AS);
						}
					}

					setState(461);
					query();
					}
				}

				}
				break;
			case 13:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(464);
				match(ANALYZE);
				setState(465);
				match(TABLE);
				setState(466);
				multipartIdentifier();
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(467);
					partitionSpec();
					}
				}

				setState(470);
				match(COMPUTE);
				setState(471);
				match(STATISTICS);
				setState(479);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(472);
					identifier();
					}
					break;
				case 2:
					{
					setState(473);
					match(FOR);
					setState(474);
					match(COLUMNS);
					setState(475);
					identifierSeq();
					}
					break;
				case 3:
					{
					setState(476);
					match(FOR);
					setState(477);
					match(ALL);
					setState(478);
					match(COLUMNS);
					}
					break;
				}
				}
				break;
			case 14:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(481);
				match(ALTER);
				setState(482);
				match(TABLE);
				setState(483);
				multipartIdentifier();
				setState(484);
				match(ADD);
				setState(485);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(486);
				((AddTableColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				}
				break;
			case 15:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(488);
				match(ALTER);
				setState(489);
				match(TABLE);
				setState(490);
				multipartIdentifier();
				setState(491);
				match(ADD);
				setState(492);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(493);
				match(T__0);
				setState(494);
				((AddTableColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				setState(495);
				match(T__1);
				}
				break;
			case 16:
				_localctx = new RenameTableColumnContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(497);
				match(ALTER);
				setState(498);
				match(TABLE);
				setState(499);
				multipartIdentifier();
				setState(500);
				match(RENAME);
				setState(501);
				match(COLUMN);
				setState(502);
				((RenameTableColumnContext)_localctx).from = qualifiedName();
				setState(503);
				match(TO);
				setState(504);
				((RenameTableColumnContext)_localctx).to = identifier();
				}
				break;
			case 17:
				_localctx = new DropTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(506);
				match(ALTER);
				setState(507);
				match(TABLE);
				setState(508);
				multipartIdentifier();
				setState(509);
				match(DROP);
				setState(510);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(511);
				match(T__0);
				setState(512);
				((DropTableColumnsContext)_localctx).columns = qualifiedNameList();
				setState(513);
				match(T__1);
				}
				break;
			case 18:
				_localctx = new DropTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(515);
				match(ALTER);
				setState(516);
				match(TABLE);
				setState(517);
				multipartIdentifier();
				setState(518);
				match(DROP);
				setState(519);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(520);
				((DropTableColumnsContext)_localctx).columns = qualifiedNameList();
				}
				break;
			case 19:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(522);
				match(ALTER);
				setState(523);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(524);
				((RenameTableContext)_localctx).from = tableIdentifier();
				setState(525);
				match(RENAME);
				setState(526);
				match(TO);
				setState(527);
				((RenameTableContext)_localctx).to = tableIdentifier();
				}
				break;
			case 20:
				_localctx = new SetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(529);
				match(ALTER);
				setState(530);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(531);
				multipartIdentifier();
				setState(532);
				match(SET);
				setState(533);
				match(TBLPROPERTIES);
				setState(534);
				tablePropertyList();
				}
				break;
			case 21:
				_localctx = new UnsetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(536);
				match(ALTER);
				setState(537);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(538);
				multipartIdentifier();
				setState(539);
				match(UNSET);
				setState(540);
				match(TBLPROPERTIES);
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(541);
					match(IF);
					setState(542);
					match(EXISTS);
					}
				}

				setState(545);
				tablePropertyList();
				}
				break;
			case 22:
				_localctx = new AlterTableColumnContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(547);
				match(ALTER);
				setState(548);
				match(TABLE);
				setState(549);
				multipartIdentifier();
				setState(550);
				_la = _input.LA(1);
				if ( !(_la==ALTER || _la==CHANGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(552);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(551);
					match(COLUMN);
					}
					break;
				}
				setState(554);
				qualifiedName();
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(555);
					match(TYPE);
					setState(556);
					dataType();
					}
				}

				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(559);
					match(COMMENT);
					setState(560);
					((AlterTableColumnContext)_localctx).comment = match(STRING);
					}
				}

				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==FIRST) {
					{
					setState(563);
					colPosition();
					}
				}

				}
				break;
			case 23:
				_localctx = new ChangeColumnContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(566);
				match(ALTER);
				setState(567);
				match(TABLE);
				setState(568);
				tableIdentifier();
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(569);
					partitionSpec();
					}
				}

				setState(572);
				match(CHANGE);
				setState(574);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(573);
					match(COLUMN);
					}
					break;
				}
				setState(576);
				((ChangeColumnContext)_localctx).colName = errorCapturingIdentifier();
				setState(577);
				colType();
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==FIRST) {
					{
					setState(578);
					colPosition();
					}
				}

				}
				break;
			case 24:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(581);
				match(ALTER);
				setState(582);
				match(TABLE);
				setState(583);
				tableIdentifier();
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(584);
					partitionSpec();
					}
				}

				setState(587);
				match(SET);
				setState(588);
				match(SERDE);
				setState(589);
				match(STRING);
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(590);
					match(WITH);
					setState(591);
					match(SERDEPROPERTIES);
					setState(592);
					tablePropertyList();
					}
				}

				}
				break;
			case 25:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(595);
				match(ALTER);
				setState(596);
				match(TABLE);
				setState(597);
				tableIdentifier();
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(598);
					partitionSpec();
					}
				}

				setState(601);
				match(SET);
				setState(602);
				match(SERDEPROPERTIES);
				setState(603);
				tablePropertyList();
				}
				break;
			case 26:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(605);
				match(ALTER);
				setState(606);
				match(TABLE);
				setState(607);
				tableIdentifier();
				setState(608);
				match(ADD);
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(609);
					match(IF);
					setState(610);
					match(NOT);
					setState(611);
					match(EXISTS);
					}
				}

				setState(615); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(614);
					partitionSpecLocation();
					}
					}
					setState(617); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 27:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(619);
				match(ALTER);
				setState(620);
				match(VIEW);
				setState(621);
				tableIdentifier();
				setState(622);
				match(ADD);
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(623);
					match(IF);
					setState(624);
					match(NOT);
					setState(625);
					match(EXISTS);
					}
				}

				setState(629); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(628);
					partitionSpec();
					}
					}
					setState(631); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 28:
				_localctx = new RenameTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(633);
				match(ALTER);
				setState(634);
				match(TABLE);
				setState(635);
				multipartIdentifier();
				setState(636);
				((RenameTablePartitionContext)_localctx).from = partitionSpec();
				setState(637);
				match(RENAME);
				setState(638);
				match(TO);
				setState(639);
				((RenameTablePartitionContext)_localctx).to = partitionSpec();
				}
				break;
			case 29:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(641);
				match(ALTER);
				setState(642);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(643);
				multipartIdentifier();
				setState(644);
				match(DROP);
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(645);
					match(IF);
					setState(646);
					match(EXISTS);
					}
				}

				setState(649);
				partitionSpec();
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(650);
					match(T__2);
					setState(651);
					partitionSpec();
					}
					}
					setState(656);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(657);
					match(PURGE);
					}
				}

				}
				break;
			case 30:
				_localctx = new SetTableLocationContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(660);
				match(ALTER);
				setState(661);
				match(TABLE);
				setState(662);
				multipartIdentifier();
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(663);
					partitionSpec();
					}
				}

				setState(666);
				match(SET);
				setState(667);
				locationSpec();
				}
				break;
			case 31:
				_localctx = new RecoverPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(669);
				match(ALTER);
				setState(670);
				match(TABLE);
				setState(671);
				multipartIdentifier();
				setState(672);
				match(RECOVER);
				setState(673);
				match(PARTITIONS);
				}
				break;
			case 32:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(675);
				match(DROP);
				setState(676);
				match(TABLE);
				setState(679);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(677);
					match(IF);
					setState(678);
					match(EXISTS);
					}
					break;
				}
				setState(681);
				multipartIdentifier();
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(682);
					match(PURGE);
					}
				}

				}
				break;
			case 33:
				_localctx = new DropViewContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(685);
				match(DROP);
				setState(686);
				match(VIEW);
				setState(689);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(687);
					match(IF);
					setState(688);
					match(EXISTS);
					}
					break;
				}
				setState(691);
				multipartIdentifier();
				}
				break;
			case 34:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(692);
				match(CREATE);
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(693);
					match(OR);
					setState(694);
					match(REPLACE);
					}
				}

				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==TEMPORARY) {
					{
					setState(698);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GLOBAL) {
						{
						setState(697);
						match(GLOBAL);
						}
					}

					setState(700);
					match(TEMPORARY);
					}
				}

				setState(703);
				match(VIEW);
				setState(707);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(704);
					match(IF);
					setState(705);
					match(NOT);
					setState(706);
					match(EXISTS);
					}
					break;
				}
				setState(709);
				tableIdentifier();
				setState(711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(710);
					identifierCommentList();
					}
				}

				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==PARTITIONED || _la==TBLPROPERTIES) {
					{
					setState(720);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						{
						setState(713);
						match(COMMENT);
						setState(714);
						match(STRING);
						}
						}
						break;
					case PARTITIONED:
						{
						{
						setState(715);
						match(PARTITIONED);
						setState(716);
						match(ON);
						setState(717);
						identifierList();
						}
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(718);
						match(TBLPROPERTIES);
						setState(719);
						tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(724);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(725);
				match(AS);
				setState(726);
				query();
				}
				break;
			case 35:
				_localctx = new CreateTempViewUsingContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(728);
				match(CREATE);
				setState(731);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(729);
					match(OR);
					setState(730);
					match(REPLACE);
					}
				}

				setState(734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(733);
					match(GLOBAL);
					}
				}

				setState(736);
				match(TEMPORARY);
				setState(737);
				match(VIEW);
				setState(738);
				tableIdentifier();
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(739);
					match(T__0);
					setState(740);
					colTypeList();
					setState(741);
					match(T__1);
					}
				}

				setState(745);
				tableProvider();
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(746);
					match(OPTIONS);
					setState(747);
					tablePropertyList();
					}
				}

				}
				break;
			case 36:
				_localctx = new AlterViewQueryContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(750);
				match(ALTER);
				setState(751);
				match(VIEW);
				setState(752);
				tableIdentifier();
				setState(754);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(753);
					match(AS);
					}
				}

				setState(756);
				query();
				}
				break;
			case 37:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(758);
				match(CREATE);
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(759);
					match(OR);
					setState(760);
					match(REPLACE);
					}
				}

				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(763);
					match(TEMPORARY);
					}
				}

				setState(766);
				match(FUNCTION);
				setState(770);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(767);
					match(IF);
					setState(768);
					match(NOT);
					setState(769);
					match(EXISTS);
					}
					break;
				}
				setState(772);
				qualifiedName();
				setState(773);
				match(AS);
				setState(774);
				((CreateFunctionContext)_localctx).className = match(STRING);
				setState(784);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(775);
					match(USING);
					setState(776);
					resource();
					setState(781);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(777);
						match(T__2);
						setState(778);
						resource();
						}
						}
						setState(783);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 38:
				_localctx = new DropFunctionContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(786);
				match(DROP);
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(787);
					match(TEMPORARY);
					}
				}

				setState(790);
				match(FUNCTION);
				setState(793);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(791);
					match(IF);
					setState(792);
					match(EXISTS);
					}
					break;
				}
				setState(795);
				qualifiedName();
				}
				break;
			case 39:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(796);
				match(EXPLAIN);
				setState(798);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODEGEN || _la==COST || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (EXTENDED - 85)) | (1L << (FORMATTED - 85)) | (1L << (LOGICAL - 85)))) != 0)) {
					{
					setState(797);
					_la = _input.LA(1);
					if ( !(_la==CODEGEN || _la==COST || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (EXTENDED - 85)) | (1L << (FORMATTED - 85)) | (1L << (LOGICAL - 85)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(800);
				statement();
				}
				break;
			case 40:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(801);
				match(SHOW);
				setState(802);
				match(TABLES);
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(803);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(804);
					multipartIdentifier();
					}
				}

				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(808);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(807);
						match(LIKE);
						}
					}

					setState(810);
					((ShowTablesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 41:
				_localctx = new ShowTableContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(813);
				match(SHOW);
				setState(814);
				match(TABLE);
				setState(815);
				match(EXTENDED);
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(816);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(817);
					((ShowTableContext)_localctx).db = errorCapturingIdentifier();
					}
				}

				setState(820);
				match(LIKE);
				setState(821);
				((ShowTableContext)_localctx).pattern = match(STRING);
				setState(823);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(822);
					partitionSpec();
					}
				}

				}
				break;
			case 42:
				_localctx = new ShowTblPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(825);
				match(SHOW);
				setState(826);
				match(TBLPROPERTIES);
				setState(827);
				((ShowTblPropertiesContext)_localctx).table = tableIdentifier();
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(828);
					match(T__0);
					setState(829);
					((ShowTblPropertiesContext)_localctx).key = tablePropertyKey();
					setState(830);
					match(T__1);
					}
				}

				}
				break;
			case 43:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(834);
				match(SHOW);
				setState(835);
				match(COLUMNS);
				setState(836);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(837);
				((ShowColumnsContext)_localctx).table = multipartIdentifier();
				setState(840);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(838);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(839);
					((ShowColumnsContext)_localctx).namespace = multipartIdentifier();
					}
				}

				}
				break;
			case 44:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(842);
				match(SHOW);
				setState(843);
				match(PARTITIONS);
				setState(844);
				multipartIdentifier();
				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(845);
					partitionSpec();
					}
				}

				}
				break;
			case 45:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(848);
				match(SHOW);
				setState(850);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(849);
					identifier();
					}
					break;
				}
				setState(852);
				match(FUNCTIONS);
				setState(860);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(854);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
					case 1:
						{
						setState(853);
						match(LIKE);
						}
						break;
					}
					setState(858);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
					case 1:
						{
						setState(856);
						qualifiedName();
						}
						break;
					case 2:
						{
						setState(857);
						((ShowFunctionsContext)_localctx).pattern = match(STRING);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 46:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(862);
				match(SHOW);
				setState(863);
				match(CREATE);
				setState(864);
				match(TABLE);
				setState(865);
				multipartIdentifier();
				}
				break;
			case 47:
				_localctx = new DescribeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(866);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(867);
				match(FUNCTION);
				setState(869);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(868);
					match(EXTENDED);
					}
					break;
				}
				setState(871);
				describeFuncName();
				}
				break;
			case 48:
				_localctx = new DescribeDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(872);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(873);
				database();
				setState(875);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(874);
					match(EXTENDED);
					}
					break;
				}
				setState(877);
				((DescribeDatabaseContext)_localctx).db = errorCapturingIdentifier();
				}
				break;
			case 49:
				_localctx = new DescribeTableContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(879);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(881);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(880);
					match(TABLE);
					}
					break;
				}
				setState(884);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(883);
					((DescribeTableContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXTENDED || _la==FORMATTED) ) {
						((DescribeTableContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(886);
				multipartIdentifier();
				setState(888);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(887);
					partitionSpec();
					}
					break;
				}
				setState(891);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(890);
					describeColName();
					}
					break;
				}
				}
				break;
			case 50:
				_localctx = new DescribeQueryContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(893);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(895);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUERY) {
					{
					setState(894);
					match(QUERY);
					}
				}

				setState(897);
				query();
				}
				break;
			case 51:
				_localctx = new RefreshTableContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(898);
				match(REFRESH);
				setState(899);
				match(TABLE);
				setState(900);
				multipartIdentifier();
				}
				break;
			case 52:
				_localctx = new RefreshResourceContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(901);
				match(REFRESH);
				setState(909);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(902);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(906);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(903);
							matchWildcard();
							}
							} 
						}
						setState(908);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
					}
					}
					break;
				}
				}
				break;
			case 53:
				_localctx = new CacheTableContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(911);
				match(CACHE);
				setState(913);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAZY) {
					{
					setState(912);
					match(LAZY);
					}
				}

				setState(915);
				match(TABLE);
				setState(916);
				multipartIdentifier();
				setState(919);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(917);
					match(OPTIONS);
					setState(918);
					((CacheTableContext)_localctx).options = tablePropertyList();
					}
				}

				setState(925);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0 || _la==AS || _la==FROM || _la==MAP || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (REDUCE - 192)) | (1L << (SELECT - 192)) | (1L << (TABLE - 192)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(922);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(921);
						match(AS);
						}
					}

					setState(924);
					query();
					}
				}

				}
				break;
			case 54:
				_localctx = new UncacheTableContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(927);
				match(UNCACHE);
				setState(928);
				match(TABLE);
				setState(931);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(929);
					match(IF);
					setState(930);
					match(EXISTS);
					}
					break;
				}
				setState(933);
				multipartIdentifier();
				}
				break;
			case 55:
				_localctx = new ClearCacheContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(934);
				match(CLEAR);
				setState(935);
				match(CACHE);
				}
				break;
			case 56:
				_localctx = new LoadDataContext(_localctx);
				enterOuterAlt(_localctx, 56);
				{
				setState(936);
				match(LOAD);
				setState(937);
				match(DATA);
				setState(939);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(938);
					match(LOCAL);
					}
				}

				setState(941);
				match(INPATH);
				setState(942);
				((LoadDataContext)_localctx).path = match(STRING);
				setState(944);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(943);
					match(OVERWRITE);
					}
				}

				setState(946);
				match(INTO);
				setState(947);
				match(TABLE);
				setState(948);
				multipartIdentifier();
				setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(949);
					partitionSpec();
					}
				}

				}
				break;
			case 57:
				_localctx = new TruncateTableContext(_localctx);
				enterOuterAlt(_localctx, 57);
				{
				setState(952);
				match(TRUNCATE);
				setState(953);
				match(TABLE);
				setState(954);
				multipartIdentifier();
				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(955);
					partitionSpec();
					}
				}

				}
				break;
			case 58:
				_localctx = new RepairTableContext(_localctx);
				enterOuterAlt(_localctx, 58);
				{
				setState(958);
				match(MSCK);
				setState(959);
				match(REPAIR);
				setState(960);
				match(TABLE);
				setState(961);
				multipartIdentifier();
				}
				break;
			case 59:
				_localctx = new ManageResourceContext(_localctx);
				enterOuterAlt(_localctx, 59);
				{
				setState(962);
				((ManageResourceContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==LIST) ) {
					((ManageResourceContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(963);
				identifier();
				setState(967);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(964);
						matchWildcard();
						}
						} 
					}
					setState(969);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				}
				}
				break;
			case 60:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 60);
				{
				setState(970);
				match(SET);
				setState(971);
				match(ROLE);
				setState(975);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(972);
						matchWildcard();
						}
						} 
					}
					setState(977);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				}
				}
				break;
			case 61:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 61);
				{
				setState(978);
				match(SET);
				setState(982);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(979);
						matchWildcard();
						}
						} 
					}
					setState(984);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				}
				}
				break;
			case 62:
				_localctx = new ResetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 62);
				{
				setState(985);
				match(RESET);
				}
				break;
			case 63:
				_localctx = new DeleteFromTableContext(_localctx);
				enterOuterAlt(_localctx, 63);
				{
				setState(986);
				match(DELETE);
				setState(987);
				match(FROM);
				setState(988);
				multipartIdentifier();
				setState(989);
				tableAlias();
				setState(991);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(990);
					whereClause();
					}
				}

				}
				break;
			case 64:
				_localctx = new UpdateTableContext(_localctx);
				enterOuterAlt(_localctx, 64);
				{
				setState(993);
				match(UPDATE);
				setState(994);
				multipartIdentifier();
				setState(995);
				tableAlias();
				setState(996);
				setClause();
				setState(998);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(997);
					whereClause();
					}
				}

				}
				break;
			case 65:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 65);
				{
				setState(1000);
				unsupportedHiveNativeCommands();
				setState(1004);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1001);
						matchWildcard();
						}
						} 
					}
					setState(1006);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsupportedHiveNativeCommandsContext extends ParserRuleContext {
		public Token kw1;
		public Token kw2;
		public Token kw3;
		public Token kw4;
		public Token kw5;
		public Token kw6;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public UnsupportedHiveNativeCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsupportedHiveNativeCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnsupportedHiveNativeCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnsupportedHiveNativeCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnsupportedHiveNativeCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() throws RecognitionException {
		UnsupportedHiveNativeCommandsContext _localctx = new UnsupportedHiveNativeCommandsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_unsupportedHiveNativeCommands);
		int _la;
		try {
			setState(1179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1009);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1010);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1011);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1012);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1013);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(GRANT);
				setState(1015);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(1014);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1017);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(REVOKE);
				setState(1019);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(1018);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1021);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1022);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(GRANT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1023);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1024);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				setState(1026);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1025);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(GRANT);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1028);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1029);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(PRINCIPALS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1030);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1031);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1032);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1033);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CURRENT);
				setState(1034);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ROLES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1035);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(EXPORT);
				setState(1036);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1037);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(IMPORT);
				setState(1038);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1039);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1040);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(COMPACTIONS);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1041);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1042);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CREATE);
				setState(1043);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1044);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1045);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTIONS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1046);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1047);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEXES);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1048);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1049);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(LOCKS);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1050);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1051);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1052);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1053);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1054);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1055);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1056);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1057);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1058);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1059);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1060);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1061);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1062);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1063);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1064);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1065);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1066);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1067);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1068);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1069);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1070);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1071);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1072);
				tableIdentifier();
				setState(1073);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1074);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(CLUSTERED);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1076);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1077);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1078);
				tableIdentifier();
				setState(1079);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CLUSTERED);
				setState(1080);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1082);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1083);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1084);
				tableIdentifier();
				setState(1085);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1086);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SORTED);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1088);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1089);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1090);
				tableIdentifier();
				setState(1091);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SKEWED);
				setState(1092);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1094);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1095);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1096);
				tableIdentifier();
				setState(1097);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1098);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1100);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1101);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1102);
				tableIdentifier();
				setState(1103);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1104);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(STORED);
				setState(1105);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(AS);
				setState(1106);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw6 = match(DIRECTORIES);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1108);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1109);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1110);
				tableIdentifier();
				setState(1111);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1112);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				setState(1113);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(LOCATION);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1115);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1116);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1117);
				tableIdentifier();
				setState(1118);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(EXCHANGE);
				setState(1119);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1121);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1122);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1123);
				tableIdentifier();
				setState(1124);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ARCHIVE);
				setState(1125);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1127);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1128);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1129);
				tableIdentifier();
				setState(1130);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(UNARCHIVE);
				setState(1131);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1133);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1134);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1135);
				tableIdentifier();
				setState(1136);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TOUCH);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1138);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1139);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1140);
				tableIdentifier();
				setState(1142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1141);
					partitionSpec();
					}
				}

				setState(1144);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(COMPACT);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1146);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1147);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1148);
				tableIdentifier();
				setState(1150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1149);
					partitionSpec();
					}
				}

				setState(1152);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CONCATENATE);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(1154);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1155);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1156);
				tableIdentifier();
				setState(1158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1157);
					partitionSpec();
					}
				}

				setState(1160);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1161);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(FILEFORMAT);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(1163);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1164);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1165);
				tableIdentifier();
				setState(1167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1166);
					partitionSpec();
					}
				}

				setState(1169);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(REPLACE);
				setState(1170);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1172);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(START);
				setState(1173);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTION);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1174);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(COMMIT);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1175);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ROLLBACK);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(1176);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DFS);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(1177);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DELETE);
				setState(1178);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(FROM);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableHeaderContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1181);
			match(CREATE);
			setState(1183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1182);
				match(TEMPORARY);
				}
			}

			setState(1186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1185);
				match(EXTERNAL);
				}
			}

			setState(1188);
			match(TABLE);
			setState(1192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1189);
				match(IF);
				setState(1190);
				match(NOT);
				setState(1191);
				match(EXISTS);
				}
				break;
			}
			setState(1194);
			multipartIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReplaceTableHeaderContext extends ParserRuleContext {
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public ReplaceTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replaceTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterReplaceTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitReplaceTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitReplaceTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplaceTableHeaderContext replaceTableHeader() throws RecognitionException {
		ReplaceTableHeaderContext _localctx = new ReplaceTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_replaceTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CREATE) {
				{
				setState(1196);
				match(CREATE);
				setState(1197);
				match(OR);
				}
			}

			setState(1200);
			match(REPLACE);
			setState(1201);
			match(TABLE);
			setState(1202);
			multipartIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BucketSpecContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public OrderedIdentifierListContext orderedIdentifierList() {
			return getRuleContext(OrderedIdentifierListContext.class,0);
		}
		public BucketSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucketSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBucketSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBucketSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBucketSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BucketSpecContext bucketSpec() throws RecognitionException {
		BucketSpecContext _localctx = new BucketSpecContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bucketSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1204);
			match(CLUSTERED);
			setState(1205);
			match(BY);
			setState(1206);
			identifierList();
			setState(1210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORTED) {
				{
				setState(1207);
				match(SORTED);
				setState(1208);
				match(BY);
				setState(1209);
				orderedIdentifierList();
				}
			}

			setState(1212);
			match(INTO);
			setState(1213);
			match(INTEGER_VALUE);
			setState(1214);
			match(BUCKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkewSpecContext extends ParserRuleContext {
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public NestedConstantListContext nestedConstantList() {
			return getRuleContext(NestedConstantListContext.class,0);
		}
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public SkewSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSkewSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSkewSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSkewSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkewSpecContext skewSpec() throws RecognitionException {
		SkewSpecContext _localctx = new SkewSpecContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_skewSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1216);
			match(SKEWED);
			setState(1217);
			match(BY);
			setState(1218);
			identifierList();
			setState(1219);
			match(ON);
			setState(1222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1220);
				constantList();
				}
				break;
			case 2:
				{
				setState(1221);
				nestedConstantList();
				}
				break;
			}
			setState(1227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1224);
				match(STORED);
				setState(1225);
				match(AS);
				setState(1226);
				match(DIRECTORIES);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationSpecContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public LocationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLocationSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLocationSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLocationSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationSpecContext locationSpec() throws RecognitionException {
		LocationSpecContext _localctx = new LocationSpecContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_locationSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1229);
			match(LOCATION);
			setState(1230);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1232);
				ctes();
				}
			}

			setState(1235);
			queryTerm(0);
			setState(1236);
			queryOrganization();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertIntoContext extends ParserRuleContext {
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
	 
		public InsertIntoContext() { }
		public void copyFrom(InsertIntoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InsertOverwriteHiveDirContext extends InsertIntoContext {
		public Token path;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public RowFormatContext rowFormat() {
			return getRuleContext(RowFormatContext.class,0);
		}
		public CreateFileFormatContext createFileFormat() {
			return getRuleContext(CreateFileFormatContext.class,0);
		}
		public InsertOverwriteHiveDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertOverwriteHiveDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertOverwriteHiveDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteHiveDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteDirContext extends InsertIntoContext {
		public Token path;
		public TablePropertyListContext options;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public InsertOverwriteDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertOverwriteDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertOverwriteDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public InsertOverwriteTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertOverwriteTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertOverwriteTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertIntoTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public InsertIntoTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertIntoTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertIntoTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_insertInto);
		int _la;
		try {
			setState(1293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				_localctx = new InsertOverwriteTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1238);
				match(INSERT);
				setState(1239);
				match(OVERWRITE);
				setState(1241);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1240);
					match(TABLE);
					}
					break;
				}
				setState(1243);
				multipartIdentifier();
				setState(1250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1244);
					partitionSpec();
					setState(1248);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(1245);
						match(IF);
						setState(1246);
						match(NOT);
						setState(1247);
						match(EXISTS);
						}
					}

					}
				}

				}
				break;
			case 2:
				_localctx = new InsertIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1252);
				match(INSERT);
				setState(1253);
				match(INTO);
				setState(1255);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(1254);
					match(TABLE);
					}
					break;
				}
				setState(1257);
				multipartIdentifier();
				setState(1259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1258);
					partitionSpec();
					}
				}

				setState(1264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(1261);
					match(IF);
					setState(1262);
					match(NOT);
					setState(1263);
					match(EXISTS);
					}
				}

				}
				break;
			case 3:
				_localctx = new InsertOverwriteHiveDirContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1266);
				match(INSERT);
				setState(1267);
				match(OVERWRITE);
				setState(1269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1268);
					match(LOCAL);
					}
				}

				setState(1271);
				match(DIRECTORY);
				setState(1272);
				((InsertOverwriteHiveDirContext)_localctx).path = match(STRING);
				setState(1274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1273);
					rowFormat();
					}
				}

				setState(1277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(1276);
					createFileFormat();
					}
				}

				}
				break;
			case 4:
				_localctx = new InsertOverwriteDirContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1279);
				match(INSERT);
				setState(1280);
				match(OVERWRITE);
				setState(1282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1281);
					match(LOCAL);
					}
				}

				setState(1284);
				match(DIRECTORY);
				setState(1286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(1285);
					((InsertOverwriteDirContext)_localctx).path = match(STRING);
					}
				}

				setState(1288);
				tableProvider();
				setState(1291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1289);
					match(OPTIONS);
					setState(1290);
					((InsertOverwriteDirContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionSpecLocationContext extends ParserRuleContext {
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpecLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionSpecLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionSpecLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionSpecLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecLocationContext partitionSpecLocation() throws RecognitionException {
		PartitionSpecLocationContext _localctx = new PartitionSpecLocationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_partitionSpecLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1295);
			partitionSpec();
			setState(1297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(1296);
				locationSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionSpecContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public List<PartitionValContext> partitionVal() {
			return getRuleContexts(PartitionValContext.class);
		}
		public PartitionValContext partitionVal(int i) {
			return getRuleContext(PartitionValContext.class,i);
		}
		public PartitionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecContext partitionSpec() throws RecognitionException {
		PartitionSpecContext _localctx = new PartitionSpecContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_partitionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1299);
			match(PARTITION);
			setState(1300);
			match(T__0);
			setState(1301);
			partitionVal();
			setState(1306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1302);
				match(T__2);
				setState(1303);
				partitionVal();
				}
				}
				setState(1308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1309);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionValContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PartitionValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionValContext partitionVal() throws RecognitionException {
		PartitionValContext _localctx = new PartitionValContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_partitionVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1311);
			identifier();
			setState(1314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1312);
				match(EQ);
				setState(1313);
				constant();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatabaseContext extends ParserRuleContext {
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public DatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseContext database() throws RecognitionException {
		DatabaseContext _localctx = new DatabaseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_database);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1316);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescribeFuncNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public PredicateOperatorContext predicateOperator() {
			return getRuleContext(PredicateOperatorContext.class,0);
		}
		public DescribeFuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeFuncName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeFuncName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeFuncName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeFuncNameContext describeFuncName() throws RecognitionException {
		DescribeFuncNameContext _localctx = new DescribeFuncNameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_describeFuncName);
		try {
			setState(1323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1318);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1319);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1320);
				comparisonOperator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1321);
				arithmeticOperator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1322);
				predicateOperator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescribeColNameContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> nameParts = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public DescribeColNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeColName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeColName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeColName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeColName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeColNameContext describeColName() throws RecognitionException {
		DescribeColNameContext _localctx = new DescribeColNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_describeColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1325);
			((DescribeColNameContext)_localctx).identifier = identifier();
			((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
			setState(1330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1326);
				match(T__3);
				setState(1327);
				((DescribeColNameContext)_localctx).identifier = identifier();
				((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
				}
				}
				setState(1332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CtesContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCtes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCtes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCtes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1333);
			match(WITH);
			setState(1334);
			namedQuery();
			setState(1339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1335);
				match(T__2);
				setState(1336);
				namedQuery();
				}
				}
				setState(1341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedQueryContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public IdentifierListContext columnAliases;
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1342);
			((NamedQueryContext)_localctx).name = errorCapturingIdentifier();
			setState(1344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1343);
				((NamedQueryContext)_localctx).columnAliases = identifierList();
				}
				break;
			}
			setState(1347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1346);
				match(AS);
				}
			}

			setState(1349);
			match(T__0);
			setState(1350);
			query();
			setState(1351);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableProviderContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableProviderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProvider; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableProvider(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableProvider(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableProvider(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableProviderContext tableProvider() throws RecognitionException {
		TableProviderContext _localctx = new TableProviderContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tableProvider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1353);
			match(USING);
			setState(1354);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyListContext extends ParserRuleContext {
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public TablePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTablePropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyListContext tablePropertyList() throws RecognitionException {
		TablePropertyListContext _localctx = new TablePropertyListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tablePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1356);
			match(T__0);
			setState(1357);
			tableProperty();
			setState(1362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1358);
				match(T__2);
				setState(1359);
				tableProperty();
				}
				}
				setState(1364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1365);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyContext extends ParserRuleContext {
		public TablePropertyKeyContext key;
		public TablePropertyValueContext value;
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public TablePropertyValueContext tablePropertyValue() {
			return getRuleContext(TablePropertyValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tableProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1367);
			((TablePropertyContext)_localctx).key = tablePropertyKey();
			setState(1372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FALSE || ((((_la - 248)) & ~0x3f) == 0 && ((1L << (_la - 248)) & ((1L << (TRUE - 248)) | (1L << (EQ - 248)) | (1L << (STRING - 248)) | (1L << (INTEGER_VALUE - 248)) | (1L << (DECIMAL_VALUE - 248)))) != 0)) {
				{
				setState(1369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1368);
					match(EQ);
					}
				}

				setState(1371);
				((TablePropertyContext)_localctx).value = tablePropertyValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyKeyContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTablePropertyKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyKeyContext tablePropertyKey() throws RecognitionException {
		TablePropertyKeyContext _localctx = new TablePropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tablePropertyKey);
		int _la;
		try {
			setState(1383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1374);
				identifier();
				setState(1379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1375);
					match(T__3);
					setState(1376);
					identifier();
					}
					}
					setState(1381);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1382);
				match(STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTablePropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyValueContext tablePropertyValue() throws RecognitionException {
		TablePropertyValueContext _localctx = new TablePropertyValueContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_tablePropertyValue);
		try {
			setState(1389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1385);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1386);
				match(DECIMAL_VALUE);
				}
				break;
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1387);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1388);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1391);
			match(T__0);
			setState(1392);
			constant();
			setState(1397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1393);
				match(T__2);
				setState(1394);
				constant();
				}
				}
				setState(1399);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1400);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestedConstantListContext extends ParserRuleContext {
		public List<ConstantListContext> constantList() {
			return getRuleContexts(ConstantListContext.class);
		}
		public ConstantListContext constantList(int i) {
			return getRuleContext(ConstantListContext.class,i);
		}
		public NestedConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNestedConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNestedConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNestedConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedConstantListContext nestedConstantList() throws RecognitionException {
		NestedConstantListContext _localctx = new NestedConstantListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_nestedConstantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1402);
			match(T__0);
			setState(1403);
			constantList();
			setState(1408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1404);
				match(T__2);
				setState(1405);
				constantList();
				}
				}
				setState(1410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1411);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateFileFormatContext extends ParserRuleContext {
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public FileFormatContext fileFormat() {
			return getRuleContext(FileFormatContext.class,0);
		}
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public StorageHandlerContext storageHandler() {
			return getRuleContext(StorageHandlerContext.class,0);
		}
		public CreateFileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFileFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFileFormatContext createFileFormat() throws RecognitionException {
		CreateFileFormatContext _localctx = new CreateFileFormatContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_createFileFormat);
		try {
			setState(1419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1413);
				match(STORED);
				setState(1414);
				match(AS);
				setState(1415);
				fileFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1416);
				match(STORED);
				setState(1417);
				match(BY);
				setState(1418);
				storageHandler();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileFormatContext extends ParserRuleContext {
		public FileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFormat; }
	 
		public FileFormatContext() { }
		public void copyFrom(FileFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableFileFormatContext extends FileFormatContext {
		public Token inFmt;
		public Token outFmt;
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TableFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenericFileFormatContext extends FileFormatContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGenericFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGenericFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGenericFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileFormatContext fileFormat() throws RecognitionException {
		FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_fileFormat);
		try {
			setState(1426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1421);
				match(INPUTFORMAT);
				setState(1422);
				((TableFileFormatContext)_localctx).inFmt = match(STRING);
				setState(1423);
				match(OUTPUTFORMAT);
				setState(1424);
				((TableFileFormatContext)_localctx).outFmt = match(STRING);
				}
				break;
			case 2:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1425);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageHandlerContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public StorageHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStorageHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStorageHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStorageHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageHandlerContext storageHandler() throws RecognitionException {
		StorageHandlerContext _localctx = new StorageHandlerContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_storageHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1428);
			match(STRING);
			setState(1432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1429);
				match(WITH);
				setState(1430);
				match(SERDEPROPERTIES);
				setState(1431);
				tablePropertyList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1434);
			identifier();
			setState(1435);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DmlStatementNoWithContext extends ParserRuleContext {
		public DmlStatementNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dmlStatementNoWith; }
	 
		public DmlStatementNoWithContext() { }
		public void copyFrom(DmlStatementNoWithContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleInsertQueryContext extends DmlStatementNoWithContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public SingleInsertQueryContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiInsertQueryContext extends DmlStatementNoWithContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<MultiInsertQueryBodyContext> multiInsertQueryBody() {
			return getRuleContexts(MultiInsertQueryBodyContext.class);
		}
		public MultiInsertQueryBodyContext multiInsertQueryBody(int i) {
			return getRuleContext(MultiInsertQueryBodyContext.class,i);
		}
		public MultiInsertQueryContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultiInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultiInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultiInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DmlStatementNoWithContext dmlStatementNoWith() throws RecognitionException {
		DmlStatementNoWithContext _localctx = new DmlStatementNoWithContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_dmlStatementNoWith);
		int _la;
		try {
			setState(1447);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSERT:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1437);
				insertInto();
				setState(1438);
				queryTerm(0);
				setState(1439);
				queryOrganization();
				}
				break;
			case FROM:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1441);
				fromClause();
				setState(1443); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1442);
					multiInsertQueryBody();
					}
					}
					setState(1445); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INSERT );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryOrganizationContext extends ParserRuleContext {
		public SortItemContext sortItem;
		public List<SortItemContext> order = new ArrayList<SortItemContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> clusterBy = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> distributeBy = new ArrayList<ExpressionContext>();
		public List<SortItemContext> sort = new ArrayList<SortItemContext>();
		public ExpressionContext limit;
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryOrganization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryOrganization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryOrganization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_queryOrganization);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1449);
				match(ORDER);
				setState(1450);
				match(BY);
				setState(1451);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1456);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1452);
						match(T__2);
						setState(1453);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(1458);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				}
				}
				break;
			}
			setState(1471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1461);
				match(CLUSTER);
				setState(1462);
				match(BY);
				setState(1463);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1468);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1464);
						match(T__2);
						setState(1465);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(1470);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
				}
				}
				break;
			}
			setState(1483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1473);
				match(DISTRIBUTE);
				setState(1474);
				match(BY);
				setState(1475);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1480);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1476);
						match(T__2);
						setState(1477);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(1482);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
				}
				}
				break;
			}
			setState(1495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1485);
				match(SORT);
				setState(1486);
				match(BY);
				setState(1487);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1492);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1488);
						match(T__2);
						setState(1489);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(1494);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
				}
				}
				break;
			}
			setState(1498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1497);
				windowClause();
				}
				break;
			}
			setState(1505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1500);
				match(LIMIT);
				setState(1503);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1501);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(1502);
					((QueryOrganizationContext)_localctx).limit = expression();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiInsertQueryBodyContext extends ParserRuleContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public FromStatementBodyContext fromStatementBody() {
			return getRuleContext(FromStatementBodyContext.class,0);
		}
		public MultiInsertQueryBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiInsertQueryBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultiInsertQueryBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultiInsertQueryBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultiInsertQueryBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiInsertQueryBodyContext multiInsertQueryBody() throws RecognitionException {
		MultiInsertQueryBodyContext _localctx = new MultiInsertQueryBodyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_multiInsertQueryBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1507);
			insertInto();
			setState(1508);
			fromStatementBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1511);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(1536);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1534);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1513);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1514);
						if (!(legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "legacy_setops_precedence_enbled");
						setState(1515);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==INTERSECT || _la==SETMINUS || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1517);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1516);
							setQuantifier();
							}
						}

						setState(1519);
						((SetOperationContext)_localctx).right = queryTerm(4);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1520);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1521);
						if (!(!legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enbled");
						setState(1522);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(1524);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1523);
							setQuantifier();
							}
						}

						setState(1526);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 3:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1527);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1528);
						if (!(!legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enbled");
						setState(1529);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==SETMINUS || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1531);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1530);
							setQuantifier();
							}
						}

						setState(1533);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(1538);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault1Context extends QueryPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault1Context(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTableDefault1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTableDefault1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTableDefault1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FromStmtContext extends QueryPrimaryContext {
		public FromStatementContext fromStatement() {
			return getRuleContext(FromStatementContext.class,0);
		}
		public FromStmtContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFromStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFromStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFromStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_queryPrimary);
		try {
			setState(1548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAP:
			case REDUCE:
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1539);
				querySpecification();
				}
				break;
			case FROM:
				_localctx = new FromStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1540);
				fromStatement();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1541);
				match(TABLE);
				setState(1542);
				multipartIdentifier();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefault1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1543);
				inlineTable();
				}
				break;
			case T__0:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1544);
				match(T__0);
				setState(1545);
				query();
				setState(1546);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrder;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1550);
			expression();
			setState(1552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				setState(1551);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1554);
				match(NULLS);
				setState(1555);
				((SortItemContext)_localctx).nullOrder = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrder = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromStatementContext extends ParserRuleContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<FromStatementBodyContext> fromStatementBody() {
			return getRuleContexts(FromStatementBodyContext.class);
		}
		public FromStatementBodyContext fromStatementBody(int i) {
			return getRuleContext(FromStatementBodyContext.class,i);
		}
		public FromStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFromStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFromStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFromStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromStatementContext fromStatement() throws RecognitionException {
		FromStatementContext _localctx = new FromStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_fromStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1558);
			fromClause();
			setState(1560); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1559);
					fromStatementBody();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1562); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromStatementBodyContext extends ParserRuleContext {
		public TransformClauseContext transformClause() {
			return getRuleContext(TransformClauseContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public FromStatementBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatementBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFromStatementBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFromStatementBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFromStatementBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromStatementBodyContext fromStatementBody() throws RecognitionException {
		FromStatementBodyContext _localctx = new FromStatementBodyContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_fromStatementBody);
		try {
			int _alt;
			setState(1591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1564);
				transformClause();
				setState(1566);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
				case 1:
					{
					setState(1565);
					whereClause();
					}
					break;
				}
				setState(1568);
				queryOrganization();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1570);
				selectClause();
				setState(1574);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1571);
						lateralView();
						}
						} 
					}
					setState(1576);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
				}
				setState(1578);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1577);
					whereClause();
					}
					break;
				}
				setState(1581);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1580);
					aggregationClause();
					}
					break;
				}
				setState(1584);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1583);
					havingClause();
					}
					break;
				}
				setState(1587);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1586);
					windowClause();
					}
					break;
				}
				setState(1589);
				queryOrganization();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuerySpecificationContext extends ParserRuleContext {
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
	 
		public QuerySpecificationContext() { }
		public void copyFrom(QuerySpecificationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegularQuerySpecificationContext extends QuerySpecificationContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public RegularQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRegularQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRegularQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRegularQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransformQuerySpecificationContext extends QuerySpecificationContext {
		public TransformClauseContext transformClause() {
			return getRuleContext(TransformClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TransformQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTransformQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTransformQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTransformQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_querySpecification);
		try {
			int _alt;
			setState(1622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				_localctx = new TransformQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1593);
				transformClause();
				setState(1595);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1594);
					fromClause();
					}
					break;
				}
				setState(1598);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1597);
					whereClause();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RegularQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1600);
				selectClause();
				setState(1602);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1601);
					fromClause();
					}
					break;
				}
				setState(1607);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1604);
						lateralView();
						}
						} 
					}
					setState(1609);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
				}
				setState(1611);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1610);
					whereClause();
					}
					break;
				}
				setState(1614);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1613);
					aggregationClause();
					}
					break;
				}
				setState(1617);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1616);
					havingClause();
					}
					break;
				}
				setState(1620);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1619);
					windowClause();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformClauseContext extends ParserRuleContext {
		public Token kind;
		public RowFormatContext inRowFormat;
		public Token recordWriter;
		public Token script;
		public RowFormatContext outRowFormat;
		public Token recordReader;
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TransformClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTransformClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTransformClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTransformClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformClauseContext transformClause() throws RecognitionException {
		TransformClauseContext _localctx = new TransformClauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_transformClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1634);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(1624);
				match(SELECT);
				setState(1625);
				((TransformClauseContext)_localctx).kind = match(TRANSFORM);
				setState(1626);
				match(T__0);
				setState(1627);
				namedExpressionSeq();
				setState(1628);
				match(T__1);
				}
				break;
			case MAP:
				{
				setState(1630);
				((TransformClauseContext)_localctx).kind = match(MAP);
				setState(1631);
				namedExpressionSeq();
				}
				break;
			case REDUCE:
				{
				setState(1632);
				((TransformClauseContext)_localctx).kind = match(REDUCE);
				setState(1633);
				namedExpressionSeq();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROW) {
				{
				setState(1636);
				((TransformClauseContext)_localctx).inRowFormat = rowFormat();
				}
			}

			setState(1641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECORDWRITER) {
				{
				setState(1639);
				match(RECORDWRITER);
				setState(1640);
				((TransformClauseContext)_localctx).recordWriter = match(STRING);
				}
			}

			setState(1643);
			match(USING);
			setState(1644);
			((TransformClauseContext)_localctx).script = match(STRING);
			setState(1657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1645);
				match(AS);
				setState(1655);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1646);
					identifierSeq();
					}
					break;
				case 2:
					{
					setState(1647);
					colTypeList();
					}
					break;
				case 3:
					{
					{
					setState(1648);
					match(T__0);
					setState(1651);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
					case 1:
						{
						setState(1649);
						identifierSeq();
						}
						break;
					case 2:
						{
						setState(1650);
						colTypeList();
						}
						break;
					}
					setState(1653);
					match(T__1);
					}
					}
					break;
				}
				}
				break;
			}
			setState(1660);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1659);
				((TransformClauseContext)_localctx).outRowFormat = rowFormat();
				}
				break;
			}
			setState(1664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(1662);
				match(RECORDREADER);
				setState(1663);
				((TransformClauseContext)_localctx).recordReader = match(STRING);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectClauseContext extends ParserRuleContext {
		public HintContext hint;
		public List<HintContext> hints = new ArrayList<HintContext>();
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public List<HintContext> hint() {
			return getRuleContexts(HintContext.class);
		}
		public HintContext hint(int i) {
			return getRuleContext(HintContext.class,i);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_selectClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1666);
			match(SELECT);
			setState(1670);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1667);
					((SelectClauseContext)_localctx).hint = hint();
					((SelectClauseContext)_localctx).hints.add(((SelectClauseContext)_localctx).hint);
					}
					} 
				}
				setState(1672);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			}
			setState(1674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				{
				setState(1673);
				setQuantifier();
				}
				break;
			}
			setState(1676);
			namedExpressionSeq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public SetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetClauseContext setClause() throws RecognitionException {
		SetClauseContext _localctx = new SetClauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_setClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1678);
			match(SET);
			setState(1679);
			assign();
			setState(1684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1680);
				match(T__2);
				setState(1681);
				assign();
				}
				}
				setState(1686);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public MultipartIdentifierContext key;
		public ExpressionContext value;
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1687);
			((AssignContext)_localctx).key = multipartIdentifier();
			setState(1688);
			match(EQ);
			setState(1689);
			((AssignContext)_localctx).value = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1691);
			match(WHERE);
			setState(1692);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1694);
			match(HAVING);
			setState(1695);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintContext extends ParserRuleContext {
		public HintStatementContext hintStatement;
		public List<HintStatementContext> hintStatements = new ArrayList<HintStatementContext>();
		public List<HintStatementContext> hintStatement() {
			return getRuleContexts(HintStatementContext.class);
		}
		public HintStatementContext hintStatement(int i) {
			return getRuleContext(HintStatementContext.class,i);
		}
		public HintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintContext hint() throws RecognitionException {
		HintContext _localctx = new HintContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_hint);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1697);
			match(T__4);
			setState(1698);
			((HintContext)_localctx).hintStatement = hintStatement();
			((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
			setState(1705);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1700);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
					case 1:
						{
						setState(1699);
						match(T__2);
						}
						break;
					}
					setState(1702);
					((HintContext)_localctx).hintStatement = hintStatement();
					((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
					}
					} 
				}
				setState(1707);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			}
			setState(1708);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintStatementContext extends ParserRuleContext {
		public IdentifierContext hintName;
		public PrimaryExpressionContext primaryExpression;
		public List<PrimaryExpressionContext> parameters = new ArrayList<PrimaryExpressionContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public HintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintStatementContext hintStatement() throws RecognitionException {
		HintStatementContext _localctx = new HintStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_hintStatement);
		int _la;
		try {
			setState(1723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1710);
				((HintStatementContext)_localctx).hintName = identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1711);
				((HintStatementContext)_localctx).hintName = identifier();
				setState(1712);
				match(T__0);
				setState(1713);
				((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
				((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
				setState(1718);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1714);
					match(T__2);
					setState(1715);
					((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
					((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
					}
					}
					setState(1720);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1721);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public PivotClauseContext pivotClause() {
			return getRuleContext(PivotClauseContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1725);
			match(FROM);
			setState(1726);
			relation();
			setState(1731);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1727);
					match(T__2);
					setState(1728);
					relation();
					}
					} 
				}
				setState(1733);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			}
			setState(1737);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1734);
					lateralView();
					}
					} 
				}
				setState(1739);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			}
			setState(1741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				{
				setState(1740);
				pivotClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregationClauseContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
		public Token kind;
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public AggregationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAggregationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAggregationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAggregationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationClauseContext aggregationClause() throws RecognitionException {
		AggregationClauseContext _localctx = new AggregationClauseContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_aggregationClause);
		int _la;
		try {
			int _alt;
			setState(1787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1743);
				match(GROUP);
				setState(1744);
				match(BY);
				setState(1745);
				((AggregationClauseContext)_localctx).expression = expression();
				((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
				setState(1750);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1746);
						match(T__2);
						setState(1747);
						((AggregationClauseContext)_localctx).expression = expression();
						((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
						}
						} 
					}
					setState(1752);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
				}
				setState(1770);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(1753);
					match(WITH);
					setState(1754);
					((AggregationClauseContext)_localctx).kind = match(ROLLUP);
					}
					break;
				case 2:
					{
					setState(1755);
					match(WITH);
					setState(1756);
					((AggregationClauseContext)_localctx).kind = match(CUBE);
					}
					break;
				case 3:
					{
					setState(1757);
					((AggregationClauseContext)_localctx).kind = match(GROUPING);
					setState(1758);
					match(SETS);
					setState(1759);
					match(T__0);
					setState(1760);
					groupingSet();
					setState(1765);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1761);
						match(T__2);
						setState(1762);
						groupingSet();
						}
						}
						setState(1767);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1768);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1772);
				match(GROUP);
				setState(1773);
				match(BY);
				setState(1774);
				((AggregationClauseContext)_localctx).kind = match(GROUPING);
				setState(1775);
				match(SETS);
				setState(1776);
				match(T__0);
				setState(1777);
				groupingSet();
				setState(1782);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1778);
					match(T__2);
					setState(1779);
					groupingSet();
					}
					}
					setState(1784);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1785);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingSetContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_groupingSet);
		int _la;
		try {
			setState(1802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1789);
				match(T__0);
				setState(1798);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
				case 1:
					{
					setState(1790);
					expression();
					setState(1795);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1791);
						match(T__2);
						setState(1792);
						expression();
						}
						}
						setState(1797);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(1800);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1801);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PivotClauseContext extends ParserRuleContext {
		public NamedExpressionSeqContext aggregates;
		public PivotValueContext pivotValue;
		public List<PivotValueContext> pivotValues = new ArrayList<PivotValueContext>();
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public PivotColumnContext pivotColumn() {
			return getRuleContext(PivotColumnContext.class,0);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public List<PivotValueContext> pivotValue() {
			return getRuleContexts(PivotValueContext.class);
		}
		public PivotValueContext pivotValue(int i) {
			return getRuleContext(PivotValueContext.class,i);
		}
		public PivotClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPivotClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPivotClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPivotClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotClauseContext pivotClause() throws RecognitionException {
		PivotClauseContext _localctx = new PivotClauseContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_pivotClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1804);
			match(PIVOT);
			setState(1805);
			match(T__0);
			setState(1806);
			((PivotClauseContext)_localctx).aggregates = namedExpressionSeq();
			setState(1807);
			match(FOR);
			setState(1808);
			pivotColumn();
			setState(1809);
			match(IN);
			setState(1810);
			match(T__0);
			setState(1811);
			((PivotClauseContext)_localctx).pivotValue = pivotValue();
			((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
			setState(1816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1812);
				match(T__2);
				setState(1813);
				((PivotClauseContext)_localctx).pivotValue = pivotValue();
				((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
				}
				}
				setState(1818);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1819);
			match(T__1);
			setState(1820);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PivotColumnContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> identifiers = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public PivotColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPivotColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPivotColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPivotColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotColumnContext pivotColumn() throws RecognitionException {
		PivotColumnContext _localctx = new PivotColumnContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_pivotColumn);
		int _la;
		try {
			setState(1834);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1822);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1823);
				match(T__0);
				setState(1824);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				setState(1829);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1825);
					match(T__2);
					setState(1826);
					((PivotColumnContext)_localctx).identifier = identifier();
					((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
					}
					}
					setState(1831);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1832);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PivotValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public PivotValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPivotValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPivotValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPivotValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotValueContext pivotValue() throws RecognitionException {
		PivotValueContext _localctx = new PivotValueContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_pivotValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1836);
			expression();
			setState(1841);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(1838);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
				case 1:
					{
					setState(1837);
					match(AS);
					}
					break;
				}
				setState(1840);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LateralViewContext extends ParserRuleContext {
		public IdentifierContext tblName;
		public IdentifierContext identifier;
		public List<IdentifierContext> colName = new ArrayList<IdentifierContext>();
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public LateralViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateralView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLateralView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLateralView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLateralView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LateralViewContext lateralView() throws RecognitionException {
		LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_lateralView);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1843);
			match(LATERAL);
			setState(1844);
			match(VIEW);
			setState(1846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				setState(1845);
				match(OUTER);
				}
				break;
			}
			setState(1848);
			qualifiedName();
			setState(1849);
			match(T__0);
			setState(1858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				{
				setState(1850);
				expression();
				setState(1855);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1851);
					match(T__2);
					setState(1852);
					expression();
					}
					}
					setState(1857);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1860);
			match(T__1);
			setState(1861);
			((LateralViewContext)_localctx).tblName = identifier();
			setState(1873);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				{
				setState(1863);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(1862);
					match(AS);
					}
					break;
				}
				setState(1865);
				((LateralViewContext)_localctx).identifier = identifier();
				((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
				setState(1870);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1866);
						match(T__2);
						setState(1867);
						((LateralViewContext)_localctx).identifier = identifier();
						((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
						}
						} 
					}
					setState(1872);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1875);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public List<JoinRelationContext> joinRelation() {
			return getRuleContexts(JoinRelationContext.class);
		}
		public JoinRelationContext joinRelation(int i) {
			return getRuleContext(JoinRelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1877);
			relationPrimary();
			setState(1881);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1878);
					joinRelation();
					}
					} 
				}
				setState(1883);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext right;
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_joinRelation);
		try {
			setState(1895);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANTI:
			case CROSS:
			case FULL:
			case INNER:
			case JOIN:
			case LEFT:
			case RIGHT:
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1884);
				joinType();
				}
				setState(1885);
				match(JOIN);
				setState(1886);
				((JoinRelationContext)_localctx).right = relationPrimary();
				setState(1888);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
				case 1:
					{
					setState(1887);
					joinCriteria();
					}
					break;
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1890);
				match(NATURAL);
				setState(1891);
				joinType();
				setState(1892);
				match(JOIN);
				setState(1893);
				((JoinRelationContext)_localctx).right = relationPrimary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_joinType);
		int _la;
		try {
			setState(1921);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1898);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(1897);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1900);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1901);
				match(LEFT);
				setState(1903);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1902);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1906);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(1905);
					match(LEFT);
					}
				}

				setState(1908);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1909);
				match(RIGHT);
				setState(1911);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1910);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1913);
				match(FULL);
				setState(1915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1914);
					match(OUTER);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1918);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(1917);
					match(LEFT);
					}
				}

				setState(1920);
				match(ANTI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_joinCriteria);
		try {
			setState(1927);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1923);
				match(ON);
				setState(1924);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1925);
				match(USING);
				setState(1926);
				identifierList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleContext extends ParserRuleContext {
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public SampleMethodContext sampleMethod() {
			return getRuleContext(SampleMethodContext.class,0);
		}
		public SampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSample(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSample(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleContext sample() throws RecognitionException {
		SampleContext _localctx = new SampleContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_sample);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1929);
			match(TABLESAMPLE);
			setState(1930);
			match(T__0);
			setState(1932);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				{
				setState(1931);
				sampleMethod();
				}
				break;
			}
			setState(1934);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleMethodContext extends ParserRuleContext {
		public SampleMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleMethod; }
	 
		public SampleMethodContext() { }
		public void copyFrom(SampleMethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SampleByRowsContext extends SampleMethodContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public SampleByRowsContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByRows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByRows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleByRows(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByPercentileContext extends SampleMethodContext {
		public Token negativeSign;
		public Token percentage;
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public SampleByPercentileContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByPercentile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByPercentile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleByPercentile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByBucketContext extends SampleMethodContext {
		public Token sampleType;
		public Token numerator;
		public Token denominator;
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SampleByBucketContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByBucket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByBucket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleByBucket(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByBytesContext extends SampleMethodContext {
		public ExpressionContext bytes;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SampleByBytesContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByBytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByBytes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleByBytes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleMethodContext sampleMethod() throws RecognitionException {
		SampleMethodContext _localctx = new SampleMethodContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_sampleMethod);
		int _la;
		try {
			setState(1960);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				_localctx = new SampleByPercentileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1937);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1936);
					((SampleByPercentileContext)_localctx).negativeSign = match(MINUS);
					}
				}

				setState(1939);
				((SampleByPercentileContext)_localctx).percentage = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((SampleByPercentileContext)_localctx).percentage = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1940);
				match(PERCENTLIT);
				}
				break;
			case 2:
				_localctx = new SampleByRowsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1941);
				expression();
				setState(1942);
				match(ROWS);
				}
				break;
			case 3:
				_localctx = new SampleByBucketContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1944);
				((SampleByBucketContext)_localctx).sampleType = match(BUCKET);
				setState(1945);
				((SampleByBucketContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(1946);
				match(OUT);
				setState(1947);
				match(OF);
				setState(1948);
				((SampleByBucketContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(1957);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1949);
					match(ON);
					setState(1955);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
					case 1:
						{
						setState(1950);
						identifier();
						}
						break;
					case 2:
						{
						setState(1951);
						qualifiedName();
						setState(1952);
						match(T__0);
						setState(1953);
						match(T__1);
						}
						break;
					}
					}
				}

				}
				break;
			case 4:
				_localctx = new SampleByBytesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1959);
				((SampleByBytesContext)_localctx).bytes = expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1962);
			match(T__0);
			setState(1963);
			identifierSeq();
			setState(1964);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierSeqContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> ident = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_identifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1966);
			((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
			setState(1971);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1967);
					match(T__2);
					setState(1968);
					((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(1973);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderedIdentifierListContext extends ParserRuleContext {
		public List<OrderedIdentifierContext> orderedIdentifier() {
			return getRuleContexts(OrderedIdentifierContext.class);
		}
		public OrderedIdentifierContext orderedIdentifier(int i) {
			return getRuleContext(OrderedIdentifierContext.class,i);
		}
		public OrderedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOrderedIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOrderedIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOrderedIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierListContext orderedIdentifierList() throws RecognitionException {
		OrderedIdentifierListContext _localctx = new OrderedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_orderedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1974);
			match(T__0);
			setState(1975);
			orderedIdentifier();
			setState(1980);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1976);
				match(T__2);
				setState(1977);
				orderedIdentifier();
				}
				}
				setState(1982);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1983);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderedIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext ident;
		public Token ordering;
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public OrderedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOrderedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOrderedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOrderedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierContext orderedIdentifier() throws RecognitionException {
		OrderedIdentifierContext _localctx = new OrderedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_orderedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1985);
			((OrderedIdentifierContext)_localctx).ident = errorCapturingIdentifier();
			setState(1987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1986);
				((OrderedIdentifierContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderedIdentifierContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierCommentListContext extends ParserRuleContext {
		public List<IdentifierCommentContext> identifierComment() {
			return getRuleContexts(IdentifierCommentContext.class);
		}
		public IdentifierCommentContext identifierComment(int i) {
			return getRuleContext(IdentifierCommentContext.class,i);
		}
		public IdentifierCommentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierCommentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierCommentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierCommentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierCommentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentListContext identifierCommentList() throws RecognitionException {
		IdentifierCommentListContext _localctx = new IdentifierCommentListContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_identifierCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1989);
			match(T__0);
			setState(1990);
			identifierComment();
			setState(1995);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1991);
				match(T__2);
				setState(1992);
				identifierComment();
				}
				}
				setState(1997);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1998);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierCommentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public IdentifierCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentContext identifierComment() throws RecognitionException {
		IdentifierCommentContext _localctx = new IdentifierCommentContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_identifierComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2000);
			identifier();
			setState(2003);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2001);
				match(COMMENT);
				setState(2002);
				match(STRING);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableValuedFunctionContext extends RelationPrimaryContext {
		public FunctionTableContext functionTable() {
			return getRuleContext(FunctionTableContext.class,0);
		}
		public TableValuedFunctionContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableValuedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableValuedFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableValuedFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault2Context extends RelationPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault2Context(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTableDefault2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTableDefault2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTableDefault2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAliasedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAliasedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAliasedQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_relationPrimary);
		try {
			setState(2029);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2005);
				multipartIdentifier();
				setState(2007);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
				case 1:
					{
					setState(2006);
					sample();
					}
					break;
				}
				setState(2009);
				tableAlias();
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2011);
				match(T__0);
				setState(2012);
				query();
				setState(2013);
				match(T__1);
				setState(2015);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
				case 1:
					{
					setState(2014);
					sample();
					}
					break;
				}
				setState(2017);
				tableAlias();
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2019);
				match(T__0);
				setState(2020);
				relation();
				setState(2021);
				match(T__1);
				setState(2023);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
				case 1:
					{
					setState(2022);
					sample();
					}
					break;
				}
				setState(2025);
				tableAlias();
				}
				break;
			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2027);
				inlineTable();
				}
				break;
			case 5:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2028);
				functionTable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2031);
			match(VALUES);
			setState(2032);
			expression();
			setState(2037);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2033);
					match(T__2);
					setState(2034);
					expression();
					}
					} 
				}
				setState(2039);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			}
			setState(2040);
			tableAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTableContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext funcName;
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTableContext functionTable() throws RecognitionException {
		FunctionTableContext _localctx = new FunctionTableContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_functionTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2042);
			((FunctionTableContext)_localctx).funcName = errorCapturingIdentifier();
			setState(2043);
			match(T__0);
			setState(2052);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				{
				setState(2044);
				expression();
				setState(2049);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(2045);
					match(T__2);
					setState(2046);
					expression();
					}
					}
					setState(2051);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(2054);
			match(T__1);
			setState(2055);
			tableAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableAliasContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_tableAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
			case 1:
				{
				setState(2058);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
				case 1:
					{
					setState(2057);
					match(AS);
					}
					break;
				}
				setState(2060);
				strictIdentifier();
				setState(2062);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
				case 1:
					{
					setState(2061);
					identifierList();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowFormatContext extends ParserRuleContext {
		public RowFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormat; }
	 
		public RowFormatContext() { }
		public void copyFrom(RowFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RowFormatSerdeContext extends RowFormatContext {
		public Token name;
		public TablePropertyListContext props;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public RowFormatSerdeContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowFormatSerde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowFormatSerde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowFormatSerde(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowFormatDelimitedContext extends RowFormatContext {
		public Token fieldsTerminatedBy;
		public Token escapedBy;
		public Token collectionItemsTerminatedBy;
		public Token keysTerminatedBy;
		public Token linesSeparatedBy;
		public Token nullDefinedAs;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(SqlBaseParser.TERMINATED); }
		public TerminalNode TERMINATED(int i) {
			return getToken(SqlBaseParser.TERMINATED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public RowFormatDelimitedContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowFormatDelimited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowFormatDelimited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowFormatDelimited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowFormatContext rowFormat() throws RecognitionException {
		RowFormatContext _localctx = new RowFormatContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_rowFormat);
		try {
			setState(2115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2066);
				match(ROW);
				setState(2067);
				match(FORMAT);
				setState(2068);
				match(SERDE);
				setState(2069);
				((RowFormatSerdeContext)_localctx).name = match(STRING);
				setState(2073);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
				case 1:
					{
					setState(2070);
					match(WITH);
					setState(2071);
					match(SERDEPROPERTIES);
					setState(2072);
					((RowFormatSerdeContext)_localctx).props = tablePropertyList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RowFormatDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2075);
				match(ROW);
				setState(2076);
				match(FORMAT);
				setState(2077);
				match(DELIMITED);
				setState(2087);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
				case 1:
					{
					setState(2078);
					match(FIELDS);
					setState(2079);
					match(TERMINATED);
					setState(2080);
					match(BY);
					setState(2081);
					((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = match(STRING);
					setState(2085);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
					case 1:
						{
						setState(2082);
						match(ESCAPED);
						setState(2083);
						match(BY);
						setState(2084);
						((RowFormatDelimitedContext)_localctx).escapedBy = match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(2094);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
				case 1:
					{
					setState(2089);
					match(COLLECTION);
					setState(2090);
					match(ITEMS);
					setState(2091);
					match(TERMINATED);
					setState(2092);
					match(BY);
					setState(2093);
					((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = match(STRING);
					}
					break;
				}
				setState(2101);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
				case 1:
					{
					setState(2096);
					match(MAP);
					setState(2097);
					match(KEYS);
					setState(2098);
					match(TERMINATED);
					setState(2099);
					match(BY);
					setState(2100);
					((RowFormatDelimitedContext)_localctx).keysTerminatedBy = match(STRING);
					}
					break;
				}
				setState(2107);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
				case 1:
					{
					setState(2103);
					match(LINES);
					setState(2104);
					match(TERMINATED);
					setState(2105);
					match(BY);
					setState(2106);
					((RowFormatDelimitedContext)_localctx).linesSeparatedBy = match(STRING);
					}
					break;
				}
				setState(2113);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
				case 1:
					{
					setState(2109);
					match(NULL);
					setState(2110);
					match(DEFINED);
					setState(2111);
					match(AS);
					setState(2112);
					((RowFormatDelimitedContext)_localctx).nullDefinedAs = match(STRING);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultipartIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> parts = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public MultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultipartIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultipartIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultipartIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierContext multipartIdentifier() throws RecognitionException {
		MultipartIdentifierContext _localctx = new MultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_multipartIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2117);
			((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
			setState(2122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,274,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2118);
					match(T__3);
					setState(2119);
					((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(2124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,274,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext table;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				{
				setState(2125);
				((TableIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(2126);
				match(T__3);
				}
				break;
			}
			setState(2130);
			((TableIdentifierContext)_localctx).table = errorCapturingIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext function;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				{
				setState(2132);
				((FunctionIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(2133);
				match(T__3);
				}
				break;
			}
			setState(2137);
			((FunctionIdentifierContext)_localctx).function = errorCapturingIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2139);
			expression();
			setState(2147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				{
				setState(2141);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
				case 1:
					{
					setState(2140);
					match(AS);
					}
					break;
				}
				setState(2145);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
				case 1:
					{
					setState(2143);
					((NamedExpressionContext)_localctx).name = errorCapturingIdentifier();
					}
					break;
				case 2:
					{
					setState(2144);
					identifierList();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_namedExpressionSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2149);
			namedExpression();
			setState(2154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2150);
					match(T__2);
					setState(2151);
					namedExpression();
					}
					} 
				}
				setState(2156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformListContext extends ParserRuleContext {
		public TransformContext transform;
		public List<TransformContext> transforms = new ArrayList<TransformContext>();
		public List<TransformContext> transform() {
			return getRuleContexts(TransformContext.class);
		}
		public TransformContext transform(int i) {
			return getRuleContext(TransformContext.class,i);
		}
		public TransformListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTransformList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTransformList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTransformList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformListContext transformList() throws RecognitionException {
		TransformListContext _localctx = new TransformListContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_transformList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2157);
			match(T__0);
			setState(2158);
			((TransformListContext)_localctx).transform = transform();
			((TransformListContext)_localctx).transforms.add(((TransformListContext)_localctx).transform);
			setState(2163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(2159);
				match(T__2);
				setState(2160);
				((TransformListContext)_localctx).transform = transform();
				((TransformListContext)_localctx).transforms.add(((TransformListContext)_localctx).transform);
				}
				}
				setState(2165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2166);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformContext extends ParserRuleContext {
		public TransformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transform; }
	 
		public TransformContext() { }
		public void copyFrom(TransformContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentityTransformContext extends TransformContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public IdentityTransformContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentityTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentityTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentityTransform(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ApplyTransformContext extends TransformContext {
		public IdentifierContext transformName;
		public TransformArgumentContext transformArgument;
		public List<TransformArgumentContext> argument = new ArrayList<TransformArgumentContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TransformArgumentContext> transformArgument() {
			return getRuleContexts(TransformArgumentContext.class);
		}
		public TransformArgumentContext transformArgument(int i) {
			return getRuleContext(TransformArgumentContext.class,i);
		}
		public ApplyTransformContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterApplyTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitApplyTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitApplyTransform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformContext transform() throws RecognitionException {
		TransformContext _localctx = new TransformContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_transform);
		int _la;
		try {
			setState(2181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				_localctx = new IdentityTransformContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2168);
				qualifiedName();
				}
				break;
			case 2:
				_localctx = new ApplyTransformContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2169);
				((ApplyTransformContext)_localctx).transformName = identifier();
				setState(2170);
				match(T__0);
				setState(2171);
				((ApplyTransformContext)_localctx).transformArgument = transformArgument();
				((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
				setState(2176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(2172);
					match(T__2);
					setState(2173);
					((ApplyTransformContext)_localctx).transformArgument = transformArgument();
					((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
					}
					}
					setState(2178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2179);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformArgumentContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TransformArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTransformArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTransformArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTransformArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformArgumentContext transformArgument() throws RecognitionException {
		TransformArgumentContext _localctx = new TransformArgumentContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_transformArgument);
		try {
			setState(2185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2183);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2184);
				constant();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2187);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends BooleanExpressionContext {
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 174;
		enterRecursionRule(_localctx, 174, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2190);
				match(NOT);
				setState(2191);
				booleanExpression(5);
				}
				break;
			case 2:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2192);
				match(EXISTS);
				setState(2193);
				match(T__0);
				setState(2194);
				query();
				setState(2195);
				match(T__1);
				}
				break;
			case 3:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2197);
				valueExpression(0);
				setState(2199);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
				case 1:
					{
					setState(2198);
					predicate();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,288,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2209);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2203);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2204);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(2205);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2206);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2207);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(2208);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(2213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,288,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public ValueExpressionContext right;
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SqlBaseParser.UNKNOWN, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_predicate);
		int _la;
		try {
			setState(2267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2214);
					match(NOT);
					}
				}

				setState(2217);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(2218);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(2219);
				match(AND);
				setState(2220);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2222);
					match(NOT);
					}
				}

				setState(2225);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2226);
				match(T__0);
				setState(2227);
				expression();
				setState(2232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(2228);
					match(T__2);
					setState(2229);
					expression();
					}
					}
					setState(2234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2235);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2237);
					match(NOT);
					}
				}

				setState(2240);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2241);
				match(T__0);
				setState(2242);
				query();
				setState(2243);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2245);
					match(NOT);
					}
				}

				setState(2248);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LIKE || _la==RLIKE) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2249);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2250);
				match(IS);
				setState(2252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2251);
					match(NOT);
					}
				}

				setState(2254);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2255);
				match(IS);
				setState(2257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2256);
					match(NOT);
					}
				}

				setState(2259);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FALSE || _la==TRUE || _la==UNKNOWN) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2260);
				match(IS);
				setState(2262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2261);
					match(NOT);
					}
				}

				setState(2264);
				((PredicateContext)_localctx).kind = match(DISTINCT);
				setState(2265);
				match(FROM);
				setState(2266);
				((PredicateContext)_localctx).right = valueExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 178;
		enterRecursionRule(_localctx, 178, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2270);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2271);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 281)) & ~0x3f) == 0 && ((1L << (_la - 281)) & ((1L << (PLUS - 281)) | (1L << (MINUS - 281)) | (1L << (TILDE - 281)))) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2272);
				valueExpression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2294);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2275);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2276);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 283)) & ~0x3f) == 0 && ((1L << (_la - 283)) & ((1L << (ASTERISK - 283)) | (1L << (SLASH - 283)) | (1L << (PERCENT - 283)) | (1L << (DIV - 283)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2277);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2278);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2279);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 281)) & ~0x3f) == 0 && ((1L << (_la - 281)) & ((1L << (PLUS - 281)) | (1L << (MINUS - 281)) | (1L << (CONCAT_PIPE - 281)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2280);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2281);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2282);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(2283);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2284);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2285);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(2286);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2287);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2288);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(2289);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2290);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2291);
						comparisonOperator();
						setState(2292);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(2298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructContext extends PrimaryExpressionContext {
		public NamedExpressionContext namedExpression;
		public List<NamedExpressionContext> argument = new ArrayList<NamedExpressionContext>();
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public StructContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext value;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LastContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LAST_VALUE() { return getToken(SqlBaseParser.LAST_VALUE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public LastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OverlayContext extends PrimaryExpressionContext {
		public ValueExpressionContext input;
		public ValueExpressionContext replace;
		public ValueExpressionContext position;
		public ValueExpressionContext length;
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public OverlayContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOverlay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOverlay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOverlay(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstringContext extends PrimaryExpressionContext {
		public ValueExpressionContext str;
		public ValueExpressionContext pos;
		public ValueExpressionContext len;
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public SubstringContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubstring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentDatetimeContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public CurrentDatetimeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCurrentDatetime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCurrentDatetime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCurrentDatetime(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConstantDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConstantDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConstantDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaContext extends PrimaryExpressionContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SqlBaseParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SqlBaseParser.IDENTIFIER, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExtractContext extends PrimaryExpressionContext {
		public IdentifierContext field;
		public ValueExpressionContext source;
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrimContext extends PrimaryExpressionContext {
		public Token trimOption;
		public ValueExpressionContext trimStr;
		public ValueExpressionContext srcStr;
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode BOTH() { return getToken(SqlBaseParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(SqlBaseParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(SqlBaseParser.TRAILING, 0); }
		public TrimContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTrim(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public ExpressionContext expression;
		public List<ExpressionContext> argument = new ArrayList<ExpressionContext>();
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositionContext extends PrimaryExpressionContext {
		public ValueExpressionContext substr;
		public ValueExpressionContext str;
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FirstContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode FIRST_VALUE() { return getToken(SqlBaseParser.FIRST_VALUE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public FirstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 180;
		enterRecursionRule(_localctx, 180, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
			case 1:
				{
				_localctx = new CurrentDatetimeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2300);
				((CurrentDatetimeContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CURRENT_DATE || _la==CURRENT_TIMESTAMP) ) {
					((CurrentDatetimeContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2301);
				match(CASE);
				setState(2303); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2302);
					whenClause();
					}
					}
					setState(2305); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2307);
					match(ELSE);
					setState(2308);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2311);
				match(END);
				}
				break;
			case 3:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2313);
				match(CASE);
				setState(2314);
				((SimpleCaseContext)_localctx).value = expression();
				setState(2316); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2315);
					whenClause();
					}
					}
					setState(2318); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2320);
					match(ELSE);
					setState(2321);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2324);
				match(END);
				}
				break;
			case 4:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2326);
				match(CAST);
				setState(2327);
				match(T__0);
				setState(2328);
				expression();
				setState(2329);
				match(AS);
				setState(2330);
				dataType();
				setState(2331);
				match(T__1);
				}
				break;
			case 5:
				{
				_localctx = new StructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2333);
				match(STRUCT);
				setState(2334);
				match(T__0);
				setState(2343);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
				case 1:
					{
					setState(2335);
					((StructContext)_localctx).namedExpression = namedExpression();
					((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
					setState(2340);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2336);
						match(T__2);
						setState(2337);
						((StructContext)_localctx).namedExpression = namedExpression();
						((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
						}
						}
						setState(2342);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2345);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2346);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==FIRST_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2347);
				match(T__0);
				setState(2348);
				expression();
				setState(2351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE || _la==RESPECT) {
					{
					setState(2349);
					_la = _input.LA(1);
					if ( !(_la==IGNORE || _la==RESPECT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2350);
					match(NULLS);
					}
				}

				setState(2353);
				match(T__1);
				}
				break;
			case 7:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2355);
				_la = _input.LA(1);
				if ( !(_la==LAST || _la==LAST_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2356);
				match(T__0);
				setState(2357);
				expression();
				setState(2360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE || _la==RESPECT) {
					{
					setState(2358);
					_la = _input.LA(1);
					if ( !(_la==IGNORE || _la==RESPECT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2359);
					match(NULLS);
					}
				}

				setState(2362);
				match(T__1);
				}
				break;
			case 8:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2364);
				match(POSITION);
				setState(2365);
				match(T__0);
				setState(2366);
				((PositionContext)_localctx).substr = valueExpression(0);
				setState(2367);
				match(IN);
				setState(2368);
				((PositionContext)_localctx).str = valueExpression(0);
				setState(2369);
				match(T__1);
				}
				break;
			case 9:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2371);
				constant();
				}
				break;
			case 10:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2372);
				match(ASTERISK);
				}
				break;
			case 11:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2373);
				qualifiedName();
				setState(2374);
				match(T__3);
				setState(2375);
				match(ASTERISK);
				}
				break;
			case 12:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2377);
				match(T__0);
				setState(2378);
				namedExpression();
				setState(2381); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2379);
					match(T__2);
					setState(2380);
					namedExpression();
					}
					}
					setState(2383); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(2385);
				match(T__1);
				}
				break;
			case 13:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2387);
				match(T__0);
				setState(2388);
				query();
				setState(2389);
				match(T__1);
				}
				break;
			case 14:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2391);
				qualifiedName();
				setState(2392);
				match(T__0);
				setState(2404);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
				case 1:
					{
					setState(2394);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
					case 1:
						{
						setState(2393);
						setQuantifier();
						}
						break;
					}
					setState(2396);
					((FunctionCallContext)_localctx).expression = expression();
					((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
					setState(2401);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2397);
						match(T__2);
						setState(2398);
						((FunctionCallContext)_localctx).expression = expression();
						((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
						}
						}
						setState(2403);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2406);
				match(T__1);
				setState(2409);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
				case 1:
					{
					setState(2407);
					match(OVER);
					setState(2408);
					windowSpec();
					}
					break;
				}
				}
				break;
			case 15:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2411);
				match(IDENTIFIER);
				setState(2412);
				match(T__6);
				setState(2413);
				expression();
				}
				break;
			case 16:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2414);
				match(T__0);
				setState(2415);
				match(IDENTIFIER);
				setState(2418); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2416);
					match(T__2);
					setState(2417);
					match(IDENTIFIER);
					}
					}
					setState(2420); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(2422);
				match(T__1);
				setState(2423);
				match(T__6);
				setState(2424);
				expression();
				}
				break;
			case 17:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2425);
				identifier();
				}
				break;
			case 18:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2426);
				match(T__0);
				setState(2427);
				expression();
				setState(2428);
				match(T__1);
				}
				break;
			case 19:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2430);
				match(EXTRACT);
				setState(2431);
				match(T__0);
				setState(2432);
				((ExtractContext)_localctx).field = identifier();
				setState(2433);
				match(FROM);
				setState(2434);
				((ExtractContext)_localctx).source = valueExpression(0);
				setState(2435);
				match(T__1);
				}
				break;
			case 20:
				{
				_localctx = new SubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2437);
				_la = _input.LA(1);
				if ( !(_la==SUBSTR || _la==SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2438);
				match(T__0);
				setState(2439);
				((SubstringContext)_localctx).str = valueExpression(0);
				setState(2440);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==FROM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2441);
				((SubstringContext)_localctx).pos = valueExpression(0);
				setState(2444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2 || _la==FOR) {
					{
					setState(2442);
					_la = _input.LA(1);
					if ( !(_la==T__2 || _la==FOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2443);
					((SubstringContext)_localctx).len = valueExpression(0);
					}
				}

				setState(2446);
				match(T__1);
				}
				break;
			case 21:
				{
				_localctx = new TrimContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2448);
				match(TRIM);
				setState(2449);
				match(T__0);
				setState(2451);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
				case 1:
					{
					setState(2450);
					((TrimContext)_localctx).trimOption = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==BOTH || _la==LEADING || _la==TRAILING) ) {
						((TrimContext)_localctx).trimOption = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(2454);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
				case 1:
					{
					setState(2453);
					((TrimContext)_localctx).trimStr = valueExpression(0);
					}
					break;
				}
				setState(2456);
				match(FROM);
				setState(2457);
				((TrimContext)_localctx).srcStr = valueExpression(0);
				setState(2458);
				match(T__1);
				}
				break;
			case 22:
				{
				_localctx = new OverlayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2460);
				match(OVERLAY);
				setState(2461);
				match(T__0);
				setState(2462);
				((OverlayContext)_localctx).input = valueExpression(0);
				setState(2463);
				match(PLACING);
				setState(2464);
				((OverlayContext)_localctx).replace = valueExpression(0);
				setState(2465);
				match(FROM);
				setState(2466);
				((OverlayContext)_localctx).position = valueExpression(0);
				setState(2469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(2467);
					match(FOR);
					setState(2468);
					((OverlayContext)_localctx).length = valueExpression(0);
					}
				}

				setState(2471);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2485);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,321,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2483);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2475);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2476);
						match(T__7);
						setState(2477);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(2478);
						match(T__8);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2480);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2481);
						match(T__3);
						setState(2482);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(2487);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,321,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends ConstantContext {
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends ConstantContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_constant);
		try {
			int _alt;
			setState(2500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2488);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2489);
				interval();
				}
				break;
			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2490);
				identifier();
				setState(2491);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2493);
				number();
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2494);
				booleanValue();
				}
				break;
			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2496); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2495);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2498); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public TerminalNode NEQJ() { return getToken(SqlBaseParser.NEQJ, 0); }
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SqlBaseParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(SqlBaseParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2502);
			_la = _input.LA(1);
			if ( !(((((_la - 273)) & ~0x3f) == 0 && ((1L << (_la - 273)) & ((1L << (EQ - 273)) | (1L << (NSEQ - 273)) | (1L << (NEQ - 273)) | (1L << (NEQJ - 273)) | (1L << (LT - 273)) | (1L << (LTE - 273)) | (1L << (GT - 273)) | (1L << (GTE - 273)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2504);
			_la = _input.LA(1);
			if ( !(((((_la - 281)) & ~0x3f) == 0 && ((1L << (_la - 281)) & ((1L << (PLUS - 281)) | (1L << (MINUS - 281)) | (1L << (ASTERISK - 281)) | (1L << (SLASH - 281)) | (1L << (PERCENT - 281)) | (1L << (DIV - 281)) | (1L << (TILDE - 281)) | (1L << (AMPERSAND - 281)) | (1L << (PIPE - 281)) | (1L << (CONCAT_PIPE - 281)) | (1L << (HAT - 281)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicateOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicateOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicateOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateOperatorContext predicateOperator() throws RecognitionException {
		PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2506);
			_la = _input.LA(1);
			if ( !(_la==AND || ((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (IN - 113)) | (1L << (NOT - 113)) | (1L << (OR - 113)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2508);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public ErrorCapturingMultiUnitsIntervalContext errorCapturingMultiUnitsInterval() {
			return getRuleContext(ErrorCapturingMultiUnitsIntervalContext.class,0);
		}
		public ErrorCapturingUnitToUnitIntervalContext errorCapturingUnitToUnitInterval() {
			return getRuleContext(ErrorCapturingUnitToUnitIntervalContext.class,0);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_interval);
		try {
			setState(2520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2510);
				match(INTERVAL);
				setState(2513);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
				case 1:
					{
					setState(2511);
					errorCapturingMultiUnitsInterval();
					}
					break;
				case 2:
					{
					setState(2512);
					errorCapturingUnitToUnitInterval();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2515);
				if (!(ansi)) throw new FailedPredicateException(this, "ansi");
				setState(2518);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
				case 1:
					{
					setState(2516);
					errorCapturingMultiUnitsInterval();
					}
					break;
				case 2:
					{
					setState(2517);
					errorCapturingUnitToUnitInterval();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingMultiUnitsIntervalContext extends ParserRuleContext {
		public MultiUnitsIntervalContext multiUnitsInterval() {
			return getRuleContext(MultiUnitsIntervalContext.class,0);
		}
		public UnitToUnitIntervalContext unitToUnitInterval() {
			return getRuleContext(UnitToUnitIntervalContext.class,0);
		}
		public ErrorCapturingMultiUnitsIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingMultiUnitsInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterErrorCapturingMultiUnitsInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitErrorCapturingMultiUnitsInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitErrorCapturingMultiUnitsInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingMultiUnitsIntervalContext errorCapturingMultiUnitsInterval() throws RecognitionException {
		ErrorCapturingMultiUnitsIntervalContext _localctx = new ErrorCapturingMultiUnitsIntervalContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_errorCapturingMultiUnitsInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2522);
			multiUnitsInterval();
			setState(2524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
			case 1:
				{
				setState(2523);
				unitToUnitInterval();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiUnitsIntervalContext extends ParserRuleContext {
		public List<IntervalValueContext> intervalValue() {
			return getRuleContexts(IntervalValueContext.class);
		}
		public IntervalValueContext intervalValue(int i) {
			return getRuleContext(IntervalValueContext.class,i);
		}
		public List<IntervalUnitContext> intervalUnit() {
			return getRuleContexts(IntervalUnitContext.class);
		}
		public IntervalUnitContext intervalUnit(int i) {
			return getRuleContext(IntervalUnitContext.class,i);
		}
		public MultiUnitsIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiUnitsInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultiUnitsInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultiUnitsInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultiUnitsInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiUnitsIntervalContext multiUnitsInterval() throws RecognitionException {
		MultiUnitsIntervalContext _localctx = new MultiUnitsIntervalContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_multiUnitsInterval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2529); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2526);
					intervalValue();
					setState(2527);
					intervalUnit();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2531); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,328,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingUnitToUnitIntervalContext extends ParserRuleContext {
		public UnitToUnitIntervalContext body;
		public MultiUnitsIntervalContext error1;
		public UnitToUnitIntervalContext error2;
		public List<UnitToUnitIntervalContext> unitToUnitInterval() {
			return getRuleContexts(UnitToUnitIntervalContext.class);
		}
		public UnitToUnitIntervalContext unitToUnitInterval(int i) {
			return getRuleContext(UnitToUnitIntervalContext.class,i);
		}
		public MultiUnitsIntervalContext multiUnitsInterval() {
			return getRuleContext(MultiUnitsIntervalContext.class,0);
		}
		public ErrorCapturingUnitToUnitIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingUnitToUnitInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterErrorCapturingUnitToUnitInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitErrorCapturingUnitToUnitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitErrorCapturingUnitToUnitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingUnitToUnitIntervalContext errorCapturingUnitToUnitInterval() throws RecognitionException {
		ErrorCapturingUnitToUnitIntervalContext _localctx = new ErrorCapturingUnitToUnitIntervalContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_errorCapturingUnitToUnitInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2533);
			((ErrorCapturingUnitToUnitIntervalContext)_localctx).body = unitToUnitInterval();
			setState(2536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
			case 1:
				{
				setState(2534);
				((ErrorCapturingUnitToUnitIntervalContext)_localctx).error1 = multiUnitsInterval();
				}
				break;
			case 2:
				{
				setState(2535);
				((ErrorCapturingUnitToUnitIntervalContext)_localctx).error2 = unitToUnitInterval();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnitToUnitIntervalContext extends ParserRuleContext {
		public IntervalValueContext value;
		public IntervalUnitContext from;
		public IntervalUnitContext to;
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public List<IntervalUnitContext> intervalUnit() {
			return getRuleContexts(IntervalUnitContext.class);
		}
		public IntervalUnitContext intervalUnit(int i) {
			return getRuleContext(IntervalUnitContext.class,i);
		}
		public UnitToUnitIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitToUnitInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnitToUnitInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnitToUnitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnitToUnitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitToUnitIntervalContext unitToUnitInterval() throws RecognitionException {
		UnitToUnitIntervalContext _localctx = new UnitToUnitIntervalContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_unitToUnitInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2538);
			((UnitToUnitIntervalContext)_localctx).value = intervalValue();
			setState(2539);
			((UnitToUnitIntervalContext)_localctx).from = intervalUnit();
			setState(2540);
			match(TO);
			setState(2541);
			((UnitToUnitIntervalContext)_localctx).to = intervalUnit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_intervalValue);
		int _la;
		try {
			setState(2548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(2543);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(2546);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2547);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalUnitContext extends ParserRuleContext {
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode DAYS() { return getToken(SqlBaseParser.DAYS, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode HOURS() { return getToken(SqlBaseParser.HOURS, 0); }
		public TerminalNode MICROSECOND() { return getToken(SqlBaseParser.MICROSECOND, 0); }
		public TerminalNode MICROSECONDS() { return getToken(SqlBaseParser.MICROSECONDS, 0); }
		public TerminalNode MILLISECOND() { return getToken(SqlBaseParser.MILLISECOND, 0); }
		public TerminalNode MILLISECONDS() { return getToken(SqlBaseParser.MILLISECONDS, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode MINUTES() { return getToken(SqlBaseParser.MINUTES, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode MONTHS() { return getToken(SqlBaseParser.MONTHS, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode SECONDS() { return getToken(SqlBaseParser.SECONDS, 0); }
		public TerminalNode WEEK() { return getToken(SqlBaseParser.WEEK, 0); }
		public TerminalNode WEEKS() { return getToken(SqlBaseParser.WEEKS, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode YEARS() { return getToken(SqlBaseParser.YEARS, 0); }
		public IntervalUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalUnitContext intervalUnit() throws RecognitionException {
		IntervalUnitContext _localctx = new IntervalUnitContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_intervalUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2550);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (DAY - 63)) | (1L << (DAYS - 63)) | (1L << (HOUR - 63)) | (1L << (HOURS - 63)))) != 0) || ((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (MICROSECOND - 145)) | (1L << (MICROSECONDS - 145)) | (1L << (MILLISECOND - 145)) | (1L << (MILLISECONDS - 145)) | (1L << (MINUTE - 145)) | (1L << (MINUTES - 145)) | (1L << (MONTH - 145)) | (1L << (MONTHS - 145)))) != 0) || ((((_la - 211)) & ~0x3f) == 0 && ((1L << (_la - 211)) & ((1L << (SECOND - 211)) | (1L << (SECONDS - 211)) | (1L << (WEEK - 211)) | (1L << (WEEKS - 211)) | (1L << (YEAR - 211)) | (1L << (YEARS - 211)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColPositionContext extends ParserRuleContext {
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ColPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColPositionContext colPosition() throws RecognitionException {
		ColPositionContext _localctx = new ColPositionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_colPosition);
		try {
			setState(2555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2552);
				match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2553);
				match(AFTER);
				setState(2554);
				qualifiedName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public ComplexColTypeListContext complexColTypeList() {
			return getRuleContext(ComplexColTypeListContext.class,0);
		}
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComplexDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_dataType);
		int _la;
		try {
			setState(2591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,337,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2557);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(2558);
				match(LT);
				setState(2559);
				dataType();
				setState(2560);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2562);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(2563);
				match(LT);
				setState(2564);
				dataType();
				setState(2565);
				match(T__2);
				setState(2566);
				dataType();
				setState(2567);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2569);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(2576);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(2570);
					match(LT);
					setState(2572);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
					case 1:
						{
						setState(2571);
						complexColTypeList();
						}
						break;
					}
					setState(2574);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(2575);
					match(NEQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2578);
				identifier();
				setState(2589);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
				case 1:
					{
					setState(2579);
					match(T__0);
					setState(2580);
					match(INTEGER_VALUE);
					setState(2585);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2581);
						match(T__2);
						setState(2582);
						match(INTEGER_VALUE);
						}
						}
						setState(2587);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2588);
					match(T__1);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedColTypeWithPositionListContext extends ParserRuleContext {
		public List<QualifiedColTypeWithPositionContext> qualifiedColTypeWithPosition() {
			return getRuleContexts(QualifiedColTypeWithPositionContext.class);
		}
		public QualifiedColTypeWithPositionContext qualifiedColTypeWithPosition(int i) {
			return getRuleContext(QualifiedColTypeWithPositionContext.class,i);
		}
		public QualifiedColTypeWithPositionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedColTypeWithPositionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedColTypeWithPositionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedColTypeWithPositionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedColTypeWithPositionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() throws RecognitionException {
		QualifiedColTypeWithPositionListContext _localctx = new QualifiedColTypeWithPositionListContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_qualifiedColTypeWithPositionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2593);
			qualifiedColTypeWithPosition();
			setState(2598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(2594);
				match(T__2);
				setState(2595);
				qualifiedColTypeWithPosition();
				}
				}
				setState(2600);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedColTypeWithPositionContext extends ParserRuleContext {
		public QualifiedNameContext name;
		public Token comment;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public QualifiedColTypeWithPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedColTypeWithPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedColTypeWithPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedColTypeWithPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedColTypeWithPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedColTypeWithPositionContext qualifiedColTypeWithPosition() throws RecognitionException {
		QualifiedColTypeWithPositionContext _localctx = new QualifiedColTypeWithPositionContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_qualifiedColTypeWithPosition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2601);
			((QualifiedColTypeWithPositionContext)_localctx).name = qualifiedName();
			setState(2602);
			dataType();
			setState(2605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2603);
				match(COMMENT);
				setState(2604);
				((QualifiedColTypeWithPositionContext)_localctx).comment = match(STRING);
				}
			}

			setState(2608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFTER || _la==FIRST) {
				{
				setState(2607);
				colPosition();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_colTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2610);
			colType();
			setState(2615);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,341,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2611);
					match(T__2);
					setState(2612);
					colType();
					}
					} 
				}
				setState(2617);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,341,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext colName;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_colType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2618);
			((ColTypeContext)_localctx).colName = errorCapturingIdentifier();
			setState(2619);
			dataType();
			setState(2622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,342,_ctx) ) {
			case 1:
				{
				setState(2620);
				match(COMMENT);
				setState(2621);
				match(STRING);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexColTypeListContext extends ParserRuleContext {
		public List<ComplexColTypeContext> complexColType() {
			return getRuleContexts(ComplexColTypeContext.class);
		}
		public ComplexColTypeContext complexColType(int i) {
			return getRuleContext(ComplexColTypeContext.class,i);
		}
		public ComplexColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComplexColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeListContext complexColTypeList() throws RecognitionException {
		ComplexColTypeListContext _localctx = new ComplexColTypeListContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2624);
			complexColType();
			setState(2629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(2625);
				match(T__2);
				setState(2626);
				complexColType();
				}
				}
				setState(2631);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ComplexColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComplexColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeContext complexColType() throws RecognitionException {
		ComplexColTypeContext _localctx = new ComplexColTypeContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2632);
			identifier();
			setState(2633);
			match(T__9);
			setState(2634);
			dataType();
			setState(2637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2635);
				match(COMMENT);
				setState(2636);
				match(STRING);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2639);
			match(WHEN);
			setState(2640);
			((WhenClauseContext)_localctx).condition = expression();
			setState(2641);
			match(THEN);
			setState(2642);
			((WhenClauseContext)_localctx).result = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowClauseContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public List<NamedWindowContext> namedWindow() {
			return getRuleContexts(NamedWindowContext.class);
		}
		public NamedWindowContext namedWindow(int i) {
			return getRuleContext(NamedWindowContext.class,i);
		}
		public WindowClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowClauseContext windowClause() throws RecognitionException {
		WindowClauseContext _localctx = new WindowClauseContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_windowClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2644);
			match(WINDOW);
			setState(2645);
			namedWindow();
			setState(2650);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,345,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2646);
					match(T__2);
					setState(2647);
					namedWindow();
					}
					} 
				}
				setState(2652);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,345,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedWindowContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public NamedWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedWindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedWindowContext namedWindow() throws RecognitionException {
		NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2653);
			((NamedWindowContext)_localctx).name = errorCapturingIdentifier();
			setState(2654);
			match(AS);
			setState(2655);
			windowSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowSpecContext extends ParserRuleContext {
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	 
		public WindowSpecContext() { }
		public void copyFrom(WindowSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WindowRefContext extends WindowSpecContext {
		public ErrorCapturingIdentifierContext name;
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public WindowRefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WindowDefContext extends WindowSpecContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public WindowDefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_windowSpec);
		int _la;
		try {
			setState(2703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,353,_ctx) ) {
			case 1:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2657);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				}
				break;
			case 2:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2658);
				match(T__0);
				setState(2659);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				setState(2660);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2662);
				match(T__0);
				setState(2697);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(2663);
					match(CLUSTER);
					setState(2664);
					match(BY);
					setState(2665);
					((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(2670);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2666);
						match(T__2);
						setState(2667);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(2672);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__1:
				case DISTRIBUTE:
				case ORDER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case SORT:
					{
					setState(2683);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DISTRIBUTE || _la==PARTITION) {
						{
						setState(2673);
						_la = _input.LA(1);
						if ( !(_la==DISTRIBUTE || _la==PARTITION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2674);
						match(BY);
						setState(2675);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						setState(2680);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(2676);
							match(T__2);
							setState(2677);
							((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							}
							}
							setState(2682);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(2695);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(2685);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2686);
						match(BY);
						setState(2687);
						sortItem();
						setState(2692);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(2688);
							match(T__2);
							setState(2689);
							sortItem();
							}
							}
							setState(2694);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(2699);
					windowFrame();
					}
				}

				setState(2702);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_windowFrame);
		try {
			setState(2721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,354,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2705);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2706);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2707);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2708);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2709);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2710);
				match(BETWEEN);
				setState(2711);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2712);
				match(AND);
				setState(2713);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2715);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2716);
				match(BETWEEN);
				setState(2717);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2718);
				match(AND);
				setState(2719);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameBoundContext extends ParserRuleContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFrameBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFrameBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFrameBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_frameBound);
		int _la;
		try {
			setState(2730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,355,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2723);
				match(UNBOUNDED);
				setState(2724);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2725);
				((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(2726);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2727);
				expression();
				setState(2728);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2732);
			qualifiedName();
			setState(2737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(2733);
				match(T__2);
				setState(2734);
				qualifiedName();
				}
				}
				setState(2739);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2740);
			identifier();
			setState(2745);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,357,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2741);
					match(T__3);
					setState(2742);
					identifier();
					}
					} 
				}
				setState(2747);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,357,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() {
			return getRuleContext(ErrorCapturingIdentifierExtraContext.class,0);
		}
		public ErrorCapturingIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterErrorCapturingIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitErrorCapturingIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitErrorCapturingIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierContext errorCapturingIdentifier() throws RecognitionException {
		ErrorCapturingIdentifierContext _localctx = new ErrorCapturingIdentifierContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_errorCapturingIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2748);
			identifier();
			setState(2749);
			errorCapturingIdentifierExtra();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingIdentifierExtraContext extends ParserRuleContext {
		public ErrorCapturingIdentifierExtraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifierExtra; }
	 
		public ErrorCapturingIdentifierExtraContext() { }
		public void copyFrom(ErrorCapturingIdentifierExtraContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ErrorIdentContext extends ErrorCapturingIdentifierExtraContext {
		public List<TerminalNode> MINUS() { return getTokens(SqlBaseParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SqlBaseParser.MINUS, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ErrorIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterErrorIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitErrorIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitErrorIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealIdentContext extends ErrorCapturingIdentifierExtraContext {
		public RealIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRealIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRealIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRealIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() throws RecognitionException {
		ErrorCapturingIdentifierExtraContext _localctx = new ErrorCapturingIdentifierExtraContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_errorCapturingIdentifierExtra);
		try {
			int _alt;
			setState(2758);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,359,_ctx) ) {
			case 1:
				_localctx = new ErrorIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2753); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2751);
						match(MINUS);
						setState(2752);
						identifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2755); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,358,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new RealIdentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public StrictNonReservedContext strictNonReserved() {
			return getRuleContext(StrictNonReservedContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_identifier);
		try {
			setState(2763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,360,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2760);
				strictIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2761);
				if (!(!ansi)) throw new FailedPredicateException(this, "!ansi");
				setState(2762);
				strictNonReserved();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlBaseParser.IDENTIFIER, 0); }
		public AnsiNonReservedContext ansiNonReserved() {
			return getRuleContext(AnsiNonReservedContext.class,0);
		}
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_strictIdentifier);
		try {
			setState(2771);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,361,_ctx) ) {
			case 1:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2765);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2766);
				quotedIdentifier();
				}
				break;
			case 3:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2767);
				if (!(ansi)) throw new FailedPredicateException(this, "ansi");
				setState(2768);
				ansiNonReserved();
				}
				break;
			case 4:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2769);
				if (!(!ansi)) throw new FailedPredicateException(this, "!ansi");
				setState(2770);
				nonReserved();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2773);
			match(BACKQUOTED_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(SqlBaseParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBigIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBigIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(SqlBaseParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTinyIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTinyIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(SqlBaseParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBigDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBigDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBigDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(SqlBaseParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(SqlBaseParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSmallIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSmallIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_number);
		int _la;
		try {
			setState(2803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,369,_ctx) ) {
			case 1:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2776);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2775);
					match(MINUS);
					}
				}

				setState(2778);
				match(DECIMAL_VALUE);
				}
				break;
			case 2:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2779);
					match(MINUS);
					}
				}

				setState(2782);
				match(INTEGER_VALUE);
				}
				break;
			case 3:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2784);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2783);
					match(MINUS);
					}
				}

				setState(2786);
				match(BIGINT_LITERAL);
				}
				break;
			case 4:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2787);
					match(MINUS);
					}
				}

				setState(2790);
				match(SMALLINT_LITERAL);
				}
				break;
			case 5:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2791);
					match(MINUS);
					}
				}

				setState(2794);
				match(TINYINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2795);
					match(MINUS);
					}
				}

				setState(2798);
				match(DOUBLE_LITERAL);
				}
				break;
			case 7:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2800);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2799);
					match(MINUS);
					}
				}

				setState(2802);
				match(BIGDECIMAL_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnsiNonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode DAYS() { return getToken(SqlBaseParser.DAYS, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode HOURS() { return getToken(SqlBaseParser.HOURS, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode MICROSECOND() { return getToken(SqlBaseParser.MICROSECOND, 0); }
		public TerminalNode MICROSECONDS() { return getToken(SqlBaseParser.MICROSECONDS, 0); }
		public TerminalNode MILLISECOND() { return getToken(SqlBaseParser.MILLISECOND, 0); }
		public TerminalNode MILLISECONDS() { return getToken(SqlBaseParser.MILLISECONDS, 0); }
		public TerminalNode MINUTES() { return getToken(SqlBaseParser.MINUTES, 0); }
		public TerminalNode MONTHS() { return getToken(SqlBaseParser.MONTHS, 0); }
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode NAMESPACES() { return getToken(SqlBaseParser.NAMESPACES, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode QUERY() { return getToken(SqlBaseParser.QUERY, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public TerminalNode SECONDS() { return getToken(SqlBaseParser.SECONDS, 0); }
		public TerminalNode SEPARATED() { return getToken(SqlBaseParser.SEPARATED, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode STRATIFY() { return getToken(SqlBaseParser.STRATIFY, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TERMINATED() { return getToken(SqlBaseParser.TERMINATED, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode WEEK() { return getToken(SqlBaseParser.WEEK, 0); }
		public TerminalNode WEEKS() { return getToken(SqlBaseParser.WEEKS, 0); }
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public TerminalNode YEARS() { return getToken(SqlBaseParser.YEARS, 0); }
		public AnsiNonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ansiNonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAnsiNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAnsiNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAnsiNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnsiNonReservedContext ansiNonReserved() throws RecognitionException {
		AnsiNonReservedContext _localctx = new AnsiNonReservedContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_ansiNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2805);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << AFTER) | (1L << ALTER) | (1L << ANALYZE) | (1L << ARCHIVE) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BETWEEN) | (1L << BUCKET) | (1L << BUCKETS) | (1L << BY) | (1L << CACHE) | (1L << CASCADE) | (1L << CHANGE) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CLUSTERED) | (1L << CODEGEN) | (1L << COLLECTION) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMPACT) | (1L << COMPACTIONS) | (1L << COMPUTE) | (1L << CONCATENATE) | (1L << COST) | (1L << CUBE) | (1L << CURRENT) | (1L << DATA) | (1L << DATABASE) | (1L << DATABASES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DAYS - 64)) | (1L << (DBPROPERTIES - 64)) | (1L << (DEFINED - 64)) | (1L << (DELETE - 64)) | (1L << (DELIMITED - 64)) | (1L << (DESC - 64)) | (1L << (DESCRIBE - 64)) | (1L << (DFS - 64)) | (1L << (DIRECTORIES - 64)) | (1L << (DIRECTORY - 64)) | (1L << (DISTRIBUTE - 64)) | (1L << (DROP - 64)) | (1L << (ESCAPED - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXPORT - 64)) | (1L << (EXTENDED - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FIELDS - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FORMATTED - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GLOBAL - 64)) | (1L << (GROUPING - 64)) | (1L << (HOURS - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (IMPORT - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXES - 64)) | (1L << (INPATH - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (ITEMS - 64)) | (1L << (KEYS - 64)) | (1L << (LAST - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (LATERAL - 129)) | (1L << (LAZY - 129)) | (1L << (LIKE - 129)) | (1L << (LIMIT - 129)) | (1L << (LINES - 129)) | (1L << (LIST - 129)) | (1L << (LOAD - 129)) | (1L << (LOCAL - 129)) | (1L << (LOCATION - 129)) | (1L << (LOCK - 129)) | (1L << (LOCKS - 129)) | (1L << (LOGICAL - 129)) | (1L << (MACRO - 129)) | (1L << (MAP - 129)) | (1L << (MICROSECOND - 129)) | (1L << (MICROSECONDS - 129)) | (1L << (MILLISECOND - 129)) | (1L << (MILLISECONDS - 129)) | (1L << (MINUTES - 129)) | (1L << (MONTHS - 129)) | (1L << (MSCK - 129)) | (1L << (NAMESPACE - 129)) | (1L << (NAMESPACES - 129)) | (1L << (NO - 129)) | (1L << (NULLS - 129)) | (1L << (OF - 129)) | (1L << (OPTION - 129)) | (1L << (OPTIONS - 129)) | (1L << (OUT - 129)) | (1L << (OUTPUTFORMAT - 129)) | (1L << (OVER - 129)) | (1L << (OVERLAY - 129)) | (1L << (OVERWRITE - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONED - 129)) | (1L << (PARTITIONS - 129)) | (1L << (PERCENTLIT - 129)) | (1L << (PIVOT - 129)) | (1L << (PLACING - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)) | (1L << (PRINCIPALS - 129)) | (1L << (PROPERTIES - 129)) | (1L << (PURGE - 129)) | (1L << (QUERY - 129)) | (1L << (RANGE - 129)) | (1L << (RECORDREADER - 129)) | (1L << (RECORDWRITER - 129)) | (1L << (RECOVER - 129)) | (1L << (REDUCE - 129)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (REFRESH - 194)) | (1L << (RENAME - 194)) | (1L << (REPAIR - 194)) | (1L << (REPLACE - 194)) | (1L << (RESET - 194)) | (1L << (RESPECT - 194)) | (1L << (RESTRICT - 194)) | (1L << (REVOKE - 194)) | (1L << (RLIKE - 194)) | (1L << (ROLE - 194)) | (1L << (ROLES - 194)) | (1L << (ROLLBACK - 194)) | (1L << (ROLLUP - 194)) | (1L << (ROW - 194)) | (1L << (ROWS - 194)) | (1L << (SCHEMA - 194)) | (1L << (SECONDS - 194)) | (1L << (SEPARATED - 194)) | (1L << (SERDE - 194)) | (1L << (SERDEPROPERTIES - 194)) | (1L << (SET - 194)) | (1L << (SETS - 194)) | (1L << (SHOW - 194)) | (1L << (SKEWED - 194)) | (1L << (SORT - 194)) | (1L << (SORTED - 194)) | (1L << (START - 194)) | (1L << (STATISTICS - 194)) | (1L << (STORED - 194)) | (1L << (STRATIFY - 194)) | (1L << (STRUCT - 194)) | (1L << (SUBSTR - 194)) | (1L << (SUBSTRING - 194)) | (1L << (TABLES - 194)) | (1L << (TABLESAMPLE - 194)) | (1L << (TBLPROPERTIES - 194)) | (1L << (TEMPORARY - 194)) | (1L << (TERMINATED - 194)) | (1L << (TOUCH - 194)) | (1L << (TRANSACTION - 194)) | (1L << (TRANSACTIONS - 194)) | (1L << (TRANSFORM - 194)) | (1L << (TRIM - 194)) | (1L << (TRUE - 194)) | (1L << (TRUNCATE - 194)) | (1L << (UNARCHIVE - 194)) | (1L << (UNBOUNDED - 194)) | (1L << (UNCACHE - 194)) | (1L << (UNLOCK - 194)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (UNSET - 258)) | (1L << (UPDATE - 258)) | (1L << (USE - 258)) | (1L << (VALUES - 258)) | (1L << (VIEW - 258)) | (1L << (WEEK - 258)) | (1L << (WEEKS - 258)) | (1L << (WINDOW - 258)) | (1L << (YEARS - 258)) | (1L << (DIV - 258)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrictNonReservedContext extends ParserRuleContext {
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public StrictNonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictNonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStrictNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStrictNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStrictNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictNonReservedContext strictNonReserved() throws RecognitionException {
		StrictNonReservedContext _localctx = new StrictNonReservedContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_strictNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2807);
			_la = _input.LA(1);
			if ( !(((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (ANTI - 17)) | (1L << (CROSS - 17)) | (1L << (EXCEPT - 17)))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (FULL - 100)) | (1L << (INNER - 100)) | (1L << (INTERSECT - 100)) | (1L << (JOIN - 100)) | (1L << (LEFT - 100)) | (1L << (NATURAL - 100)) | (1L << (ON - 100)))) != 0) || ((((_la - 202)) & ~0x3f) == 0 && ((1L << (_la - 202)) & ((1L << (RIGHT - 202)) | (1L << (SEMI - 202)) | (1L << (SETMINUS - 202)) | (1L << (UNION - 202)) | (1L << (USING - 202)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode AUTHORIZATION() { return getToken(SqlBaseParser.AUTHORIZATION, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode BOTH() { return getToken(SqlBaseParser.BOTH, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode CHECK() { return getToken(SqlBaseParser.CHECK, 0); }
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COLLATE() { return getToken(SqlBaseParser.COLLATE, 0); }
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode CONSTRAINT() { return getToken(SqlBaseParser.CONSTRAINT, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(SqlBaseParser.CURRENT_TIME, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_USER() { return getToken(SqlBaseParser.CURRENT_USER, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode DAYS() { return getToken(SqlBaseParser.DAYS, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public TerminalNode FETCH() { return getToken(SqlBaseParser.FETCH, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode FIRST_VALUE() { return getToken(SqlBaseParser.FIRST_VALUE, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode FOREIGN() { return getToken(SqlBaseParser.FOREIGN, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode HOURS() { return getToken(SqlBaseParser.HOURS, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LAST_VALUE() { return getToken(SqlBaseParser.LAST_VALUE, 0); }
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode LEADING() { return getToken(SqlBaseParser.LEADING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode MICROSECOND() { return getToken(SqlBaseParser.MICROSECOND, 0); }
		public TerminalNode MICROSECONDS() { return getToken(SqlBaseParser.MICROSECONDS, 0); }
		public TerminalNode MILLISECOND() { return getToken(SqlBaseParser.MILLISECOND, 0); }
		public TerminalNode MILLISECONDS() { return getToken(SqlBaseParser.MILLISECONDS, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode MINUTES() { return getToken(SqlBaseParser.MINUTES, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode MONTHS() { return getToken(SqlBaseParser.MONTHS, 0); }
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode NAMESPACES() { return getToken(SqlBaseParser.NAMESPACES, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode ONLY() { return getToken(SqlBaseParser.ONLY, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode OVERLAPS() { return getToken(SqlBaseParser.OVERLAPS, 0); }
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRIMARY() { return getToken(SqlBaseParser.PRIMARY, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode QUERY() { return getToken(SqlBaseParser.QUERY, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode REFERENCES() { return getToken(SqlBaseParser.REFERENCES, 0); }
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode SECONDS() { return getToken(SqlBaseParser.SECONDS, 0); }
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public TerminalNode SEPARATED() { return getToken(SqlBaseParser.SEPARATED, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode SESSION_USER() { return getToken(SqlBaseParser.SESSION_USER, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode SOME() { return getToken(SqlBaseParser.SOME, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode STRATIFY() { return getToken(SqlBaseParser.STRATIFY, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TERMINATED() { return getToken(SqlBaseParser.TERMINATED, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode TRAILING() { return getToken(SqlBaseParser.TRAILING, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode UNIQUE() { return getToken(SqlBaseParser.UNIQUE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SqlBaseParser.UNKNOWN, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode USER() { return getToken(SqlBaseParser.USER, 0); }
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode WEEK() { return getToken(SqlBaseParser.WEEK, 0); }
		public TerminalNode WEEKS() { return getToken(SqlBaseParser.WEEKS, 0); }
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode YEARS() { return getToken(SqlBaseParser.YEARS, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2809);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << AFTER) | (1L << ALL) | (1L << ALTER) | (1L << ANALYZE) | (1L << AND) | (1L << ANY) | (1L << ARCHIVE) | (1L << ARRAY) | (1L << AS) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BETWEEN) | (1L << BOTH) | (1L << BUCKET) | (1L << BUCKETS) | (1L << BY) | (1L << CACHE) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CHANGE) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CLUSTERED) | (1L << CODEGEN) | (1L << COLLATE) | (1L << COLLECTION) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMPACT) | (1L << COMPACTIONS) | (1L << COMPUTE) | (1L << CONCATENATE) | (1L << CONSTRAINT) | (1L << COST) | (1L << CREATE) | (1L << CUBE) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATABASE) | (1L << DATABASES) | (1L << DAY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DAYS - 64)) | (1L << (DBPROPERTIES - 64)) | (1L << (DEFINED - 64)) | (1L << (DELETE - 64)) | (1L << (DELIMITED - 64)) | (1L << (DESC - 64)) | (1L << (DESCRIBE - 64)) | (1L << (DFS - 64)) | (1L << (DIRECTORIES - 64)) | (1L << (DIRECTORY - 64)) | (1L << (DISTINCT - 64)) | (1L << (DISTRIBUTE - 64)) | (1L << (DROP - 64)) | (1L << (ELSE - 64)) | (1L << (END - 64)) | (1L << (ESCAPED - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXPORT - 64)) | (1L << (EXTENDED - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FIELDS - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (FIRST - 64)) | (1L << (FIRST_VALUE - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FOR - 64)) | (1L << (FOREIGN - 64)) | (1L << (FORMAT - 64)) | (1L << (FORMATTED - 64)) | (1L << (FROM - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANT - 64)) | (1L << (GROUP - 64)) | (1L << (GROUPING - 64)) | (1L << (HAVING - 64)) | (1L << (HOUR - 64)) | (1L << (HOURS - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (IMPORT - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXES - 64)) | (1L << (INPATH - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (ITEMS - 64)) | (1L << (KEYS - 64)) | (1L << (LAST - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LAST_VALUE - 128)) | (1L << (LATERAL - 128)) | (1L << (LAZY - 128)) | (1L << (LEADING - 128)) | (1L << (LIKE - 128)) | (1L << (LIMIT - 128)) | (1L << (LINES - 128)) | (1L << (LIST - 128)) | (1L << (LOAD - 128)) | (1L << (LOCAL - 128)) | (1L << (LOCATION - 128)) | (1L << (LOCK - 128)) | (1L << (LOCKS - 128)) | (1L << (LOGICAL - 128)) | (1L << (MACRO - 128)) | (1L << (MAP - 128)) | (1L << (MICROSECOND - 128)) | (1L << (MICROSECONDS - 128)) | (1L << (MILLISECOND - 128)) | (1L << (MILLISECONDS - 128)) | (1L << (MINUTE - 128)) | (1L << (MINUTES - 128)) | (1L << (MONTH - 128)) | (1L << (MONTHS - 128)) | (1L << (MSCK - 128)) | (1L << (NAMESPACE - 128)) | (1L << (NAMESPACES - 128)) | (1L << (NO - 128)) | (1L << (NOT - 128)) | (1L << (NULL - 128)) | (1L << (NULLS - 128)) | (1L << (OF - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (OPTIONS - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OUT - 128)) | (1L << (OUTER - 128)) | (1L << (OUTPUTFORMAT - 128)) | (1L << (OVER - 128)) | (1L << (OVERLAPS - 128)) | (1L << (OVERLAY - 128)) | (1L << (OVERWRITE - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONED - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (PIVOT - 128)) | (1L << (PLACING - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRIMARY - 128)) | (1L << (PRINCIPALS - 128)) | (1L << (PROPERTIES - 128)) | (1L << (PURGE - 128)) | (1L << (QUERY - 128)) | (1L << (RANGE - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (RECOVER - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (REDUCE - 192)) | (1L << (REFERENCES - 192)) | (1L << (REFRESH - 192)) | (1L << (RENAME - 192)) | (1L << (REPAIR - 192)) | (1L << (REPLACE - 192)) | (1L << (RESET - 192)) | (1L << (RESPECT - 192)) | (1L << (RESTRICT - 192)) | (1L << (REVOKE - 192)) | (1L << (RLIKE - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (ROLLBACK - 192)) | (1L << (ROLLUP - 192)) | (1L << (ROW - 192)) | (1L << (ROWS - 192)) | (1L << (SCHEMA - 192)) | (1L << (SECOND - 192)) | (1L << (SECONDS - 192)) | (1L << (SELECT - 192)) | (1L << (SEPARATED - 192)) | (1L << (SERDE - 192)) | (1L << (SERDEPROPERTIES - 192)) | (1L << (SESSION_USER - 192)) | (1L << (SET - 192)) | (1L << (SETS - 192)) | (1L << (SHOW - 192)) | (1L << (SKEWED - 192)) | (1L << (SOME - 192)) | (1L << (SORT - 192)) | (1L << (SORTED - 192)) | (1L << (START - 192)) | (1L << (STATISTICS - 192)) | (1L << (STORED - 192)) | (1L << (STRATIFY - 192)) | (1L << (STRUCT - 192)) | (1L << (SUBSTR - 192)) | (1L << (SUBSTRING - 192)) | (1L << (TABLE - 192)) | (1L << (TABLES - 192)) | (1L << (TABLESAMPLE - 192)) | (1L << (TBLPROPERTIES - 192)) | (1L << (TEMPORARY - 192)) | (1L << (TERMINATED - 192)) | (1L << (THEN - 192)) | (1L << (TO - 192)) | (1L << (TOUCH - 192)) | (1L << (TRAILING - 192)) | (1L << (TRANSACTION - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (TRANSFORM - 192)) | (1L << (TRIM - 192)) | (1L << (TRUE - 192)) | (1L << (TRUNCATE - 192)) | (1L << (TYPE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCACHE - 192)) | (1L << (UNIQUE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (UNKNOWN - 256)) | (1L << (UNLOCK - 256)) | (1L << (UNSET - 256)) | (1L << (UPDATE - 256)) | (1L << (USE - 256)) | (1L << (USER - 256)) | (1L << (VALUES - 256)) | (1L << (VIEW - 256)) | (1L << (WEEK - 256)) | (1L << (WEEKS - 256)) | (1L << (WHEN - 256)) | (1L << (WHERE - 256)) | (1L << (WINDOW - 256)) | (1L << (WITH - 256)) | (1L << (YEAR - 256)) | (1L << (YEARS - 256)) | (1L << (DIV - 256)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 39:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 87:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 89:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 90:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 96:
			return interval_sempred((IntervalContext)_localctx, predIndex);
		case 121:
			return identifier_sempred((IdentifierContext)_localctx, predIndex);
		case 122:
			return strictIdentifier_sempred((StrictIdentifierContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return legacy_setops_precedence_enbled;
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return !legacy_setops_precedence_enbled;
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return !legacy_setops_precedence_enbled;
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 8);
		case 15:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean interval_sempred(IntervalContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return ansi;
		}
		return true;
	}
	private boolean identifier_sempred(IdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return !ansi;
		}
		return true;
	}
	private boolean strictIdentifier_sempred(StrictIdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return ansi;
		case 19:
			return !ansi;
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0134\u0afe\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\5\t\u0119\n\t\3\t\3\t\3\t\3\n\3\n\5"+
		"\n\u0120\n\n\3\n\3\n\3\n\5\n\u0125\n\n\3\n\3\n\3\n\3\n\5\n\u012b\n\n\3"+
		"\n\3\n\3\n\5\n\u0130\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0139\n\n\f\n"+
		"\16\n\u013c\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u014e\n\n\3\n\3\n\5\n\u0152\n\n\3\n\3\n\5\n\u0156\n\n\3"+
		"\n\3\n\3\n\3\n\5\n\u015c\n\n\3\n\5\n\u015f\n\n\3\n\5\n\u0162\n\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u0169\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\7\n\u0177\n\n\f\n\16\n\u017a\13\n\3\n\5\n\u017d\n\n\3\n\5\n\u0180"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u0187\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u0194\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u019d\n\n\f"+
		"\n\16\n\u01a0\13\n\3\n\5\n\u01a3\n\n\3\n\5\n\u01a6\n\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u01ad\n\n\3\n\3\n\3\n\3\n\5\n\u01b3\n\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u01ba\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u01c8"+
		"\n\n\f\n\16\n\u01cb\13\n\3\n\5\n\u01ce\n\n\3\n\5\n\u01d1\n\n\3\n\3\n\3"+
		"\n\3\n\5\n\u01d7\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u01e2\n\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0222\n\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u022b\n\n\3\n\3\n\3\n\5\n\u0230\n\n\3\n\3\n\5\n\u0234\n"+
		"\n\3\n\5\n\u0237\n\n\3\n\3\n\3\n\3\n\5\n\u023d\n\n\3\n\3\n\5\n\u0241\n"+
		"\n\3\n\3\n\3\n\5\n\u0246\n\n\3\n\3\n\3\n\3\n\5\n\u024c\n\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u0254\n\n\3\n\3\n\3\n\3\n\5\n\u025a\n\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0267\n\n\3\n\6\n\u026a\n\n\r\n\16"+
		"\n\u026b\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0275\n\n\3\n\6\n\u0278\n\n\r"+
		"\n\16\n\u0279\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u028a\n\n\3\n\3\n\3\n\7\n\u028f\n\n\f\n\16\n\u0292\13\n\3\n\5\n\u0295"+
		"\n\n\3\n\3\n\3\n\3\n\5\n\u029b\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n\u02aa\n\n\3\n\3\n\5\n\u02ae\n\n\3\n\3\n\3\n\3\n\5"+
		"\n\u02b4\n\n\3\n\3\n\3\n\3\n\5\n\u02ba\n\n\3\n\5\n\u02bd\n\n\3\n\5\n\u02c0"+
		"\n\n\3\n\3\n\3\n\3\n\5\n\u02c6\n\n\3\n\3\n\5\n\u02ca\n\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\7\n\u02d3\n\n\f\n\16\n\u02d6\13\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u02de\n\n\3\n\5\n\u02e1\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u02ea"+
		"\n\n\3\n\3\n\3\n\5\n\u02ef\n\n\3\n\3\n\3\n\3\n\5\n\u02f5\n\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u02fc\n\n\3\n\5\n\u02ff\n\n\3\n\3\n\3\n\3\n\5\n\u0305\n"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u030e\n\n\f\n\16\n\u0311\13\n\5\n\u0313"+
		"\n\n\3\n\3\n\5\n\u0317\n\n\3\n\3\n\3\n\5\n\u031c\n\n\3\n\3\n\3\n\5\n\u0321"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u0328\n\n\3\n\5\n\u032b\n\n\3\n\5\n\u032e"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u0335\n\n\3\n\3\n\3\n\5\n\u033a\n\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\n\u0343\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u034b"+
		"\n\n\3\n\3\n\3\n\3\n\5\n\u0351\n\n\3\n\3\n\5\n\u0355\n\n\3\n\3\n\5\n\u0359"+
		"\n\n\3\n\3\n\5\n\u035d\n\n\5\n\u035f\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u0368\n\n\3\n\3\n\3\n\3\n\5\n\u036e\n\n\3\n\3\n\3\n\3\n\5\n\u0374\n"+
		"\n\3\n\5\n\u0377\n\n\3\n\3\n\5\n\u037b\n\n\3\n\5\n\u037e\n\n\3\n\3\n\5"+
		"\n\u0382\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u038b\n\n\f\n\16\n\u038e"+
		"\13\n\5\n\u0390\n\n\3\n\3\n\5\n\u0394\n\n\3\n\3\n\3\n\3\n\5\n\u039a\n"+
		"\n\3\n\5\n\u039d\n\n\3\n\5\n\u03a0\n\n\3\n\3\n\3\n\3\n\5\n\u03a6\n\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\n\u03ae\n\n\3\n\3\n\3\n\5\n\u03b3\n\n\3\n\3\n"+
		"\3\n\3\n\5\n\u03b9\n\n\3\n\3\n\3\n\3\n\5\n\u03bf\n\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\7\n\u03c8\n\n\f\n\16\n\u03cb\13\n\3\n\3\n\3\n\7\n\u03d0\n\n"+
		"\f\n\16\n\u03d3\13\n\3\n\3\n\7\n\u03d7\n\n\f\n\16\n\u03da\13\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n\u03e2\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u03e9\n\n\3\n\3"+
		"\n\7\n\u03ed\n\n\f\n\16\n\u03f0\13\n\5\n\u03f2\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u03fa\n\13\3\13\3\13\5\13\u03fe\n\13\3\13\3\13\3\13\3"+
		"\13\3\13\5\13\u0405\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0479\n\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u0481\n\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0489\n"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0492\n\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u049e\n\13\3\f\3\f\5\f\u04a2"+
		"\n\f\3\f\5\f\u04a5\n\f\3\f\3\f\3\f\3\f\5\f\u04ab\n\f\3\f\3\f\3\r\3\r\5"+
		"\r\u04b1\n\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u04bd"+
		"\n\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u04c9\n\17"+
		"\3\17\3\17\3\17\5\17\u04ce\n\17\3\20\3\20\3\20\3\21\5\21\u04d4\n\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\5\22\u04dc\n\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u04e3\n\22\5\22\u04e5\n\22\3\22\3\22\3\22\5\22\u04ea\n\22\3\22\3"+
		"\22\5\22\u04ee\n\22\3\22\3\22\3\22\5\22\u04f3\n\22\3\22\3\22\3\22\5\22"+
		"\u04f8\n\22\3\22\3\22\3\22\5\22\u04fd\n\22\3\22\5\22\u0500\n\22\3\22\3"+
		"\22\3\22\5\22\u0505\n\22\3\22\3\22\5\22\u0509\n\22\3\22\3\22\3\22\5\22"+
		"\u050e\n\22\5\22\u0510\n\22\3\23\3\23\5\23\u0514\n\23\3\24\3\24\3\24\3"+
		"\24\3\24\7\24\u051b\n\24\f\24\16\24\u051e\13\24\3\24\3\24\3\25\3\25\3"+
		"\25\5\25\u0525\n\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u052e\n\27"+
		"\3\30\3\30\3\30\7\30\u0533\n\30\f\30\16\30\u0536\13\30\3\31\3\31\3\31"+
		"\3\31\7\31\u053c\n\31\f\31\16\31\u053f\13\31\3\32\3\32\5\32\u0543\n\32"+
		"\3\32\5\32\u0546\n\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\7\34\u0553\n\34\f\34\16\34\u0556\13\34\3\34\3\34\3\35\3\35\5\35"+
		"\u055c\n\35\3\35\5\35\u055f\n\35\3\36\3\36\3\36\7\36\u0564\n\36\f\36\16"+
		"\36\u0567\13\36\3\36\5\36\u056a\n\36\3\37\3\37\3\37\3\37\5\37\u0570\n"+
		"\37\3 \3 \3 \3 \7 \u0576\n \f \16 \u0579\13 \3 \3 \3!\3!\3!\3!\7!\u0581"+
		"\n!\f!\16!\u0584\13!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u058e\n\"\3#\3"+
		"#\3#\3#\3#\5#\u0595\n#\3$\3$\3$\3$\5$\u059b\n$\3%\3%\3%\3&\3&\3&\3&\3"+
		"&\3&\6&\u05a6\n&\r&\16&\u05a7\5&\u05aa\n&\3\'\3\'\3\'\3\'\3\'\7\'\u05b1"+
		"\n\'\f\'\16\'\u05b4\13\'\5\'\u05b6\n\'\3\'\3\'\3\'\3\'\3\'\7\'\u05bd\n"+
		"\'\f\'\16\'\u05c0\13\'\5\'\u05c2\n\'\3\'\3\'\3\'\3\'\3\'\7\'\u05c9\n\'"+
		"\f\'\16\'\u05cc\13\'\5\'\u05ce\n\'\3\'\3\'\3\'\3\'\3\'\7\'\u05d5\n\'\f"+
		"\'\16\'\u05d8\13\'\5\'\u05da\n\'\3\'\5\'\u05dd\n\'\3\'\3\'\3\'\5\'\u05e2"+
		"\n\'\5\'\u05e4\n\'\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\5)\u05f0\n)\3)\3)\3)"+
		"\3)\3)\5)\u05f7\n)\3)\3)\3)\3)\3)\5)\u05fe\n)\3)\7)\u0601\n)\f)\16)\u0604"+
		"\13)\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u060f\n*\3+\3+\5+\u0613\n+\3+\3+\5"+
		"+\u0617\n+\3,\3,\6,\u061b\n,\r,\16,\u061c\3-\3-\5-\u0621\n-\3-\3-\3-\3"+
		"-\7-\u0627\n-\f-\16-\u062a\13-\3-\5-\u062d\n-\3-\5-\u0630\n-\3-\5-\u0633"+
		"\n-\3-\5-\u0636\n-\3-\3-\5-\u063a\n-\3.\3.\5.\u063e\n.\3.\5.\u0641\n."+
		"\3.\3.\5.\u0645\n.\3.\7.\u0648\n.\f.\16.\u064b\13.\3.\5.\u064e\n.\3.\5"+
		".\u0651\n.\3.\5.\u0654\n.\3.\5.\u0657\n.\5.\u0659\n.\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\5/\u0665\n/\3/\5/\u0668\n/\3/\3/\5/\u066c\n/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\5/\u0676\n/\3/\3/\5/\u067a\n/\5/\u067c\n/\3/\5/\u067f\n"+
		"/\3/\3/\5/\u0683\n/\3\60\3\60\7\60\u0687\n\60\f\60\16\60\u068a\13\60\3"+
		"\60\5\60\u068d\n\60\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u0695\n\61\f\61"+
		"\16\61\u0698\13\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3"+
		"\65\3\65\3\65\5\65\u06a7\n\65\3\65\7\65\u06aa\n\65\f\65\16\65\u06ad\13"+
		"\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u06b7\n\66\f\66\16\66"+
		"\u06ba\13\66\3\66\3\66\5\66\u06be\n\66\3\67\3\67\3\67\3\67\7\67\u06c4"+
		"\n\67\f\67\16\67\u06c7\13\67\3\67\7\67\u06ca\n\67\f\67\16\67\u06cd\13"+
		"\67\3\67\5\67\u06d0\n\67\38\38\38\38\38\78\u06d7\n8\f8\168\u06da\138\3"+
		"8\38\38\38\38\38\38\38\38\38\78\u06e6\n8\f8\168\u06e9\138\38\38\58\u06ed"+
		"\n8\38\38\38\38\38\38\38\38\78\u06f7\n8\f8\168\u06fa\138\38\38\58\u06fe"+
		"\n8\39\39\39\39\79\u0704\n9\f9\169\u0707\139\59\u0709\n9\39\39\59\u070d"+
		"\n9\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\7:\u0719\n:\f:\16:\u071c\13:\3:\3:\3"+
		":\3;\3;\3;\3;\3;\7;\u0726\n;\f;\16;\u0729\13;\3;\3;\5;\u072d\n;\3<\3<"+
		"\5<\u0731\n<\3<\5<\u0734\n<\3=\3=\3=\5=\u0739\n=\3=\3=\3=\3=\3=\7=\u0740"+
		"\n=\f=\16=\u0743\13=\5=\u0745\n=\3=\3=\3=\5=\u074a\n=\3=\3=\3=\7=\u074f"+
		"\n=\f=\16=\u0752\13=\5=\u0754\n=\3>\3>\3?\3?\7?\u075a\n?\f?\16?\u075d"+
		"\13?\3@\3@\3@\3@\5@\u0763\n@\3@\3@\3@\3@\3@\5@\u076a\n@\3A\5A\u076d\n"+
		"A\3A\3A\3A\5A\u0772\nA\3A\5A\u0775\nA\3A\3A\3A\5A\u077a\nA\3A\3A\5A\u077e"+
		"\nA\3A\5A\u0781\nA\3A\5A\u0784\nA\3B\3B\3B\3B\5B\u078a\nB\3C\3C\3C\5C"+
		"\u078f\nC\3C\3C\3D\5D\u0794\nD\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D"+
		"\3D\3D\3D\5D\u07a6\nD\5D\u07a8\nD\3D\5D\u07ab\nD\3E\3E\3E\3E\3F\3F\3F"+
		"\7F\u07b4\nF\fF\16F\u07b7\13F\3G\3G\3G\3G\7G\u07bd\nG\fG\16G\u07c0\13"+
		"G\3G\3G\3H\3H\5H\u07c6\nH\3I\3I\3I\3I\7I\u07cc\nI\fI\16I\u07cf\13I\3I"+
		"\3I\3J\3J\3J\5J\u07d6\nJ\3K\3K\5K\u07da\nK\3K\3K\3K\3K\3K\3K\5K\u07e2"+
		"\nK\3K\3K\3K\3K\3K\3K\5K\u07ea\nK\3K\3K\3K\3K\5K\u07f0\nK\3L\3L\3L\3L"+
		"\7L\u07f6\nL\fL\16L\u07f9\13L\3L\3L\3M\3M\3M\3M\3M\7M\u0802\nM\fM\16M"+
		"\u0805\13M\5M\u0807\nM\3M\3M\3M\3N\5N\u080d\nN\3N\3N\5N\u0811\nN\5N\u0813"+
		"\nN\3O\3O\3O\3O\3O\3O\3O\5O\u081c\nO\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O"+
		"\u0828\nO\5O\u082a\nO\3O\3O\3O\3O\3O\5O\u0831\nO\3O\3O\3O\3O\3O\5O\u0838"+
		"\nO\3O\3O\3O\3O\5O\u083e\nO\3O\3O\3O\3O\5O\u0844\nO\5O\u0846\nO\3P\3P"+
		"\3P\7P\u084b\nP\fP\16P\u084e\13P\3Q\3Q\3Q\5Q\u0853\nQ\3Q\3Q\3R\3R\3R\5"+
		"R\u085a\nR\3R\3R\3S\3S\5S\u0860\nS\3S\3S\5S\u0864\nS\5S\u0866\nS\3T\3"+
		"T\3T\7T\u086b\nT\fT\16T\u086e\13T\3U\3U\3U\3U\7U\u0874\nU\fU\16U\u0877"+
		"\13U\3U\3U\3V\3V\3V\3V\3V\3V\7V\u0881\nV\fV\16V\u0884\13V\3V\3V\5V\u0888"+
		"\nV\3W\3W\5W\u088c\nW\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u089a\nY"+
		"\5Y\u089c\nY\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u08a4\nY\fY\16Y\u08a7\13Y\3Z\5Z\u08aa"+
		"\nZ\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u08b2\nZ\3Z\3Z\3Z\3Z\3Z\7Z\u08b9\nZ\fZ\16Z\u08bc"+
		"\13Z\3Z\3Z\3Z\5Z\u08c1\nZ\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u08c9\nZ\3Z\3Z\3Z\3Z\5"+
		"Z\u08cf\nZ\3Z\3Z\3Z\5Z\u08d4\nZ\3Z\3Z\3Z\5Z\u08d9\nZ\3Z\3Z\3Z\5Z\u08de"+
		"\nZ\3[\3[\3[\3[\5[\u08e4\n[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3["+
		"\3[\3[\3[\3[\3[\7[\u08f9\n[\f[\16[\u08fc\13[\3\\\3\\\3\\\3\\\6\\\u0902"+
		"\n\\\r\\\16\\\u0903\3\\\3\\\5\\\u0908\n\\\3\\\3\\\3\\\3\\\3\\\6\\\u090f"+
		"\n\\\r\\\16\\\u0910\3\\\3\\\5\\\u0915\n\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\7\\\u0925\n\\\f\\\16\\\u0928\13\\\5\\\u092a"+
		"\n\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u0932\n\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\5\\\u093b\n\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\6\\\u0950\n\\\r\\\16\\\u0951\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\5\\\u095d\n\\\3\\\3\\\3\\\7\\\u0962\n\\\f\\\16\\\u0965"+
		"\13\\\5\\\u0967\n\\\3\\\3\\\3\\\5\\\u096c\n\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\6\\\u0975\n\\\r\\\16\\\u0976\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u098f\n\\\3\\"+
		"\3\\\3\\\3\\\3\\\5\\\u0996\n\\\3\\\5\\\u0999\n\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u09a8\n\\\3\\\3\\\5\\\u09ac\n\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\7\\\u09b6\n\\\f\\\16\\\u09b9\13\\\3]\3]\3"+
		"]\3]\3]\3]\3]\3]\6]\u09c3\n]\r]\16]\u09c4\5]\u09c7\n]\3^\3^\3_\3_\3`\3"+
		"`\3a\3a\3b\3b\3b\5b\u09d4\nb\3b\3b\3b\5b\u09d9\nb\5b\u09db\nb\3c\3c\5"+
		"c\u09df\nc\3d\3d\3d\6d\u09e4\nd\rd\16d\u09e5\3e\3e\3e\5e\u09eb\ne\3f\3"+
		"f\3f\3f\3f\3g\5g\u09f3\ng\3g\3g\5g\u09f7\ng\3h\3h\3i\3i\3i\5i\u09fe\n"+
		"i\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\5j\u0a0f\nj\3j\3j\5j\u0a13"+
		"\nj\3j\3j\3j\3j\3j\7j\u0a1a\nj\fj\16j\u0a1d\13j\3j\5j\u0a20\nj\5j\u0a22"+
		"\nj\3k\3k\3k\7k\u0a27\nk\fk\16k\u0a2a\13k\3l\3l\3l\3l\5l\u0a30\nl\3l\5"+
		"l\u0a33\nl\3m\3m\3m\7m\u0a38\nm\fm\16m\u0a3b\13m\3n\3n\3n\3n\5n\u0a41"+
		"\nn\3o\3o\3o\7o\u0a46\no\fo\16o\u0a49\13o\3p\3p\3p\3p\3p\5p\u0a50\np\3"+
		"q\3q\3q\3q\3q\3r\3r\3r\3r\7r\u0a5b\nr\fr\16r\u0a5e\13r\3s\3s\3s\3s\3t"+
		"\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\7t\u0a6f\nt\ft\16t\u0a72\13t\3t\3t\3t\3"+
		"t\3t\7t\u0a79\nt\ft\16t\u0a7c\13t\5t\u0a7e\nt\3t\3t\3t\3t\3t\7t\u0a85"+
		"\nt\ft\16t\u0a88\13t\5t\u0a8a\nt\5t\u0a8c\nt\3t\5t\u0a8f\nt\3t\5t\u0a92"+
		"\nt\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\5u\u0aa4\nu\3v\3v"+
		"\3v\3v\3v\3v\3v\5v\u0aad\nv\3w\3w\3w\7w\u0ab2\nw\fw\16w\u0ab5\13w\3x\3"+
		"x\3x\7x\u0aba\nx\fx\16x\u0abd\13x\3y\3y\3y\3z\3z\6z\u0ac4\nz\rz\16z\u0ac5"+
		"\3z\5z\u0ac9\nz\3{\3{\3{\5{\u0ace\n{\3|\3|\3|\3|\3|\3|\5|\u0ad6\n|\3}"+
		"\3}\3~\5~\u0adb\n~\3~\3~\5~\u0adf\n~\3~\3~\5~\u0ae3\n~\3~\3~\5~\u0ae7"+
		"\n~\3~\3~\5~\u0aeb\n~\3~\3~\5~\u0aef\n~\3~\3~\5~\u0af3\n~\3~\5~\u0af6"+
		"\n~\3\177\3\177\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\7\u038c\u03c9"+
		"\u03d1\u03d8\u03ee\6P\u00b0\u00b4\u00b6\u0082\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4"+
		"\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\2-\4\2CC\u00bb\u00bb\4\2!!\u00ca"+
		"\u00ca\4\2@@\u009d\u009d\4\2eess\3\2,-\4\2\u00ec\u00ec\u010a\u010a\4\2"+
		"\20\20$$\7\2))\65\65WWdd\u0090\u0090\3\2GH\4\2WWdd\4\2\r\r\u008a\u008a"+
		"\4\2??\u00d4\u00d4\6\2RRzz\u00de\u00de\u0100\u0100\5\2RR\u00de\u00de\u0100"+
		"\u0100\4\2\30\30GG\4\2^^\u0081\u0081\4\2\17\17LL\3\2\u012a\u012b\4\2\u0087"+
		"\u0087\u00cd\u00cd\5\2ZZ\u00fa\u00fa\u0102\u0102\4\2\u011b\u011c\u0121"+
		"\u0121\3\2\u011d\u0120\4\2\u011b\u011c\u0124\u0124\4\2::<<\3\2^_\4\2q"+
		"q\u00c9\u00c9\3\2\u0081\u0082\3\2\u00ea\u00eb\4\2\5\5ee\4\2\5\5aa\5\2"+
		"\34\34\u0085\u0085\u00f5\u00f5\3\2\u0113\u011a\3\2\u011b\u0125\6\2\22"+
		"\22ss\u00a0\u00a0\u00a8\u00a8\4\2ZZ\u00fa\u00fa\3\2\u011b\u011c\b\2AB"+
		"no\u0093\u009a\u00d5\u00d6\u010b\u010c\u0111\u0112\4\2MM\u00b1\u00b1\4"+
		"\2\u00a9\u00a9\u00e3\u00e3\4\2``\u00b8\u00b89\2\r\16\20\21\25\26\30\31"+
		"\33\33\35!$$&)++-\63\65\6589>@BKMNQQSY\\^``cdgillortuwy{{~~\u0080\u0081"+
		"\u0083\u0084\u0087\u0096\u0098\u0098\u009a\u009d\u009f\u009f\u00a2\u00a3"+
		"\u00a6\u00a7\u00aa\u00aa\u00ac\u00ad\u00af\u00b8\u00ba\u00c2\u00c4\u00cb"+
		"\u00cd\u00d4\u00d6\u00d6\u00d9\u00db\u00dd\u00dd\u00df\u00e1\u00e3\u00eb"+
		"\u00ed\u00f1\u00f4\u00f4\u00f6\u00fb\u00fd\u00ff\u0103\u0106\u0109\u010c"+
		"\u010f\u010f\u0112\u0112\u0120\u0120\21\2\23\23\67\67RRffvvzz\177\177"+
		"\u0086\u0086\u009e\u009e\u00a4\u00a4\u00cc\u00cc\u00d8\u00d8\u00de\u00de"+
		"\u0100\u0100\u0108\u0108\23\2\r\22\24\668QSeguwy{~\u0080\u0085\u0087\u009d"+
		"\u009f\u00a3\u00a5\u00cb\u00cd\u00d7\u00d9\u00dd\u00df\u00ff\u0101\u0107"+
		"\u0109\u0112\u0120\u0120\2\u0cb5\2\u0102\3\2\2\2\4\u0105\3\2\2\2\6\u0108"+
		"\3\2\2\2\b\u010b\3\2\2\2\n\u010e\3\2\2\2\f\u0111\3\2\2\2\16\u0114\3\2"+
		"\2\2\20\u0118\3\2\2\2\22\u03f1\3\2\2\2\24\u049d\3\2\2\2\26\u049f\3\2\2"+
		"\2\30\u04b0\3\2\2\2\32\u04b6\3\2\2\2\34\u04c2\3\2\2\2\36\u04cf\3\2\2\2"+
		" \u04d3\3\2\2\2\"\u050f\3\2\2\2$\u0511\3\2\2\2&\u0515\3\2\2\2(\u0521\3"+
		"\2\2\2*\u0526\3\2\2\2,\u052d\3\2\2\2.\u052f\3\2\2\2\60\u0537\3\2\2\2\62"+
		"\u0540\3\2\2\2\64\u054b\3\2\2\2\66\u054e\3\2\2\28\u0559\3\2\2\2:\u0569"+
		"\3\2\2\2<\u056f\3\2\2\2>\u0571\3\2\2\2@\u057c\3\2\2\2B\u058d\3\2\2\2D"+
		"\u0594\3\2\2\2F\u0596\3\2\2\2H\u059c\3\2\2\2J\u05a9\3\2\2\2L\u05b5\3\2"+
		"\2\2N\u05e5\3\2\2\2P\u05e8\3\2\2\2R\u060e\3\2\2\2T\u0610\3\2\2\2V\u0618"+
		"\3\2\2\2X\u0639\3\2\2\2Z\u0658\3\2\2\2\\\u0664\3\2\2\2^\u0684\3\2\2\2"+
		"`\u0690\3\2\2\2b\u0699\3\2\2\2d\u069d\3\2\2\2f\u06a0\3\2\2\2h\u06a3\3"+
		"\2\2\2j\u06bd\3\2\2\2l\u06bf\3\2\2\2n\u06fd\3\2\2\2p\u070c\3\2\2\2r\u070e"+
		"\3\2\2\2t\u072c\3\2\2\2v\u072e\3\2\2\2x\u0735\3\2\2\2z\u0755\3\2\2\2|"+
		"\u0757\3\2\2\2~\u0769\3\2\2\2\u0080\u0783\3\2\2\2\u0082\u0789\3\2\2\2"+
		"\u0084\u078b\3\2\2\2\u0086\u07aa\3\2\2\2\u0088\u07ac\3\2\2\2\u008a\u07b0"+
		"\3\2\2\2\u008c\u07b8\3\2\2\2\u008e\u07c3\3\2\2\2\u0090\u07c7\3\2\2\2\u0092"+
		"\u07d2\3\2\2\2\u0094\u07ef\3\2\2\2\u0096\u07f1\3\2\2\2\u0098\u07fc\3\2"+
		"\2\2\u009a\u0812\3\2\2\2\u009c\u0845\3\2\2\2\u009e\u0847\3\2\2\2\u00a0"+
		"\u0852\3\2\2\2\u00a2\u0859\3\2\2\2\u00a4\u085d\3\2\2\2\u00a6\u0867\3\2"+
		"\2\2\u00a8\u086f\3\2\2\2\u00aa\u0887\3\2\2\2\u00ac\u088b\3\2\2\2\u00ae"+
		"\u088d\3\2\2\2\u00b0\u089b\3\2\2\2\u00b2\u08dd\3\2\2\2\u00b4\u08e3\3\2"+
		"\2\2\u00b6\u09ab\3\2\2\2\u00b8\u09c6\3\2\2\2\u00ba\u09c8\3\2\2\2\u00bc"+
		"\u09ca\3\2\2\2\u00be\u09cc\3\2\2\2\u00c0\u09ce\3\2\2\2\u00c2\u09da\3\2"+
		"\2\2\u00c4\u09dc\3\2\2\2\u00c6\u09e3\3\2\2\2\u00c8\u09e7\3\2\2\2\u00ca"+
		"\u09ec\3\2\2\2\u00cc\u09f6\3\2\2\2\u00ce\u09f8\3\2\2\2\u00d0\u09fd\3\2"+
		"\2\2\u00d2\u0a21\3\2\2\2\u00d4\u0a23\3\2\2\2\u00d6\u0a2b\3\2\2\2\u00d8"+
		"\u0a34\3\2\2\2\u00da\u0a3c\3\2\2\2\u00dc\u0a42\3\2\2\2\u00de\u0a4a\3\2"+
		"\2\2\u00e0\u0a51\3\2\2\2\u00e2\u0a56\3\2\2\2\u00e4\u0a5f\3\2\2\2\u00e6"+
		"\u0a91\3\2\2\2\u00e8\u0aa3\3\2\2\2\u00ea\u0aac\3\2\2\2\u00ec\u0aae\3\2"+
		"\2\2\u00ee\u0ab6\3\2\2\2\u00f0\u0abe\3\2\2\2\u00f2\u0ac8\3\2\2\2\u00f4"+
		"\u0acd\3\2\2\2\u00f6\u0ad5\3\2\2\2\u00f8\u0ad7\3\2\2\2\u00fa\u0af5\3\2"+
		"\2\2\u00fc\u0af7\3\2\2\2\u00fe\u0af9\3\2\2\2\u0100\u0afb\3\2\2\2\u0102"+
		"\u0103\5\22\n\2\u0103\u0104\7\2\2\3\u0104\3\3\2\2\2\u0105\u0106\5\u00a4"+
		"S\2\u0106\u0107\7\2\2\3\u0107\5\3\2\2\2\u0108\u0109\5\u00a0Q\2\u0109\u010a"+
		"\7\2\2\3\u010a\7\3\2\2\2\u010b\u010c\5\u009eP\2\u010c\u010d\7\2\2\3\u010d"+
		"\t\3\2\2\2\u010e\u010f\5\u00a2R\2\u010f\u0110\7\2\2\3\u0110\13\3\2\2\2"+
		"\u0111\u0112\5\u00d2j\2\u0112\u0113\7\2\2\3\u0113\r\3\2\2\2\u0114\u0115"+
		"\5\u00d8m\2\u0115\u0116\7\2\2\3\u0116\17\3\2\2\2\u0117\u0119\7{\2\2\u0118"+
		"\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\5\u00c6"+
		"d\2\u011b\u011c\7\2\2\3\u011c\21\3\2\2\2\u011d\u03f2\5 \21\2\u011e\u0120"+
		"\5\60\31\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2"+
		"\u0121\u03f2\5J&\2\u0122\u0124\7\u0106\2\2\u0123\u0125\7\u009c\2\2\u0124"+
		"\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u03f2\5\u009e"+
		"P\2\u0127\u012a\7\66\2\2\u0128\u012b\5*\26\2\u0129\u012b\7\u009c\2\2\u012a"+
		"\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b\u012f\3\2\2\2\u012c\u012d\7p"+
		"\2\2\u012d\u012e\7\u00a0\2\2\u012e\u0130\7T\2\2\u012f\u012c\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u013a\5\u009eP\2\u0132\u0133"+
		"\7.\2\2\u0133\u0139\7\u0126\2\2\u0134\u0139\5\36\20\2\u0135\u0136\7\u0110"+
		"\2\2\u0136\u0137\t\2\2\2\u0137\u0139\5\66\34\2\u0138\u0132\3\2\2\2\u0138"+
		"\u0134\3\2\2\2\u0138\u0135\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2"+
		"\2\2\u013a\u013b\3\2\2\2\u013b\u03f2\3\2\2\2\u013c\u013a\3\2\2\2\u013d"+
		"\u013e\7\20\2\2\u013e\u013f\5*\26\2\u013f\u0140\5\u00f0y\2\u0140\u0141"+
		"\7\u00dd\2\2\u0141\u0142\7C\2\2\u0142\u0143\5\66\34\2\u0143\u03f2\3\2"+
		"\2\2\u0144\u0145\7\20\2\2\u0145\u0146\5*\26\2\u0146\u0147\5\u00f0y\2\u0147"+
		"\u0148\7\u00dd\2\2\u0148\u0149\5\36\20\2\u0149\u03f2\3\2\2\2\u014a\u014d"+
		"\7N\2\2\u014b\u014e\5*\26\2\u014c\u014e\7\u009c\2\2\u014d\u014b\3\2\2"+
		"\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u0150\7p\2\2\u0150\u0152"+
		"\7T\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0155\5\u009eP\2\u0154\u0156\t\3\2\2\u0155\u0154\3\2\2\2\u0155\u0156"+
		"\3\2\2\2\u0156\u03f2\3\2\2\2\u0157\u0158\7\u00e0\2\2\u0158\u015b\t\4\2"+
		"\2\u0159\u015a\t\5\2\2\u015a\u015c\5\u009eP\2\u015b\u0159\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015c\u0161\3\2\2\2\u015d\u015f\7\u0087\2\2\u015e\u015d"+
		"\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0162\7\u0126\2"+
		"\2\u0161\u015e\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u03f2\3\2\2\2\u0163\u0168"+
		"\5\26\f\2\u0164\u0165\7\3\2\2\u0165\u0166\5\u00d8m\2\u0166\u0167\7\4\2"+
		"\2\u0167\u0169\3\2\2\2\u0168\u0164\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a"+
		"\3\2\2\2\u016a\u0178\5\64\33\2\u016b\u016c\7\u00a7\2\2\u016c\u0177\5\66"+
		"\34\2\u016d\u016e\7\u00b2\2\2\u016e\u016f\7\37\2\2\u016f\u0177\5\u00a8"+
		"U\2\u0170\u0177\5\32\16\2\u0171\u0177\5\36\20\2\u0172\u0173\7.\2\2\u0173"+
		"\u0177\7\u0126\2\2\u0174\u0175\7\u00ef\2\2\u0175\u0177\5\66\34\2\u0176"+
		"\u016b\3\2\2\2\u0176\u016d\3\2\2\2\u0176\u0170\3\2\2\2\u0176\u0171\3\2"+
		"\2\2\u0176\u0172\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u017a\3\2\2\2\u0178"+
		"\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017f\3\2\2\2\u017a\u0178\3\2"+
		"\2\2\u017b\u017d\7\27\2\2\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"\u017e\3\2\2\2\u017e\u0180\5 \21\2\u017f\u017c\3\2\2\2\u017f\u0180\3\2"+
		"\2\2\u0180\u03f2\3\2\2\2\u0181\u0186\5\26\f\2\u0182\u0183\7\3\2\2\u0183"+
		"\u0184\5\u00d8m\2\u0184\u0185\7\4\2\2\u0185\u0187\3\2\2\2\u0186\u0182"+
		"\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u019e\3\2\2\2\u0188\u0189\7.\2\2\u0189"+
		"\u019d\7\u0126\2\2\u018a\u018b\7\u00b2\2\2\u018b\u018c\7\37\2\2\u018c"+
		"\u018d\7\3\2\2\u018d\u018e\5\u00d8m\2\u018e\u018f\7\4\2\2\u018f\u0194"+
		"\3\2\2\2\u0190\u0191\7\u00b2\2\2\u0191\u0192\7\37\2\2\u0192\u0194\5\u0088"+
		"E\2\u0193\u018a\3\2\2\2\u0193\u0190\3\2\2\2\u0194\u019d\3\2\2\2\u0195"+
		"\u019d\5\32\16\2\u0196\u019d\5\34\17\2\u0197\u019d\5\u009cO\2\u0198\u019d"+
		"\5B\"\2\u0199\u019d\5\36\20\2\u019a\u019b\7\u00ef\2\2\u019b\u019d\5\66"+
		"\34\2\u019c\u0188\3\2\2\2\u019c\u0193\3\2\2\2\u019c\u0195\3\2\2\2\u019c"+
		"\u0196\3\2\2\2\u019c\u0197\3\2\2\2\u019c\u0198\3\2\2\2\u019c\u0199\3\2"+
		"\2\2\u019c\u019a\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019f\u01a5\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a3\7\27"+
		"\2\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4"+
		"\u01a6\5 \21\2\u01a5\u01a2\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u03f2\3\2"+
		"\2\2\u01a7\u01a8\7\66\2\2\u01a8\u01ac\7\u00ec\2\2\u01a9\u01aa\7p\2\2\u01aa"+
		"\u01ab\7\u00a0\2\2\u01ab\u01ad\7T\2\2\u01ac\u01a9\3\2\2\2\u01ac\u01ad"+
		"\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\5\u00a0Q\2\u01af\u01b0\7\u0087"+
		"\2\2\u01b0\u01b2\5\u00a0Q\2\u01b1\u01b3\5\36\20\2\u01b2\u01b1\3\2\2\2"+
		"\u01b2\u01b3\3\2\2\2\u01b3\u03f2\3\2\2\2\u01b4\u01b9\5\30\r\2\u01b5\u01b6"+
		"\7\3\2\2\u01b6\u01b7\5\u00d8m\2\u01b7\u01b8\7\4\2\2\u01b8\u01ba\3\2\2"+
		"\2\u01b9\u01b5\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01c9"+
		"\5\64\33\2\u01bc\u01bd\7\u00a7\2\2\u01bd\u01c8\5\66\34\2\u01be\u01bf\7"+
		"\u00b2\2\2\u01bf\u01c0\7\37\2\2\u01c0\u01c8\5\u00a8U\2\u01c1\u01c8\5\32"+
		"\16\2\u01c2\u01c8\5\36\20\2\u01c3\u01c4\7.\2\2\u01c4\u01c8\7\u0126\2\2"+
		"\u01c5\u01c6\7\u00ef\2\2\u01c6\u01c8\5\66\34\2\u01c7\u01bc\3\2\2\2\u01c7"+
		"\u01be\3\2\2\2\u01c7\u01c1\3\2\2\2\u01c7\u01c2\3\2\2\2\u01c7\u01c3\3\2"+
		"\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9"+
		"\u01ca\3\2\2\2\u01ca\u01d0\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc\u01ce\7\27"+
		"\2\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf"+
		"\u01d1\5 \21\2\u01d0\u01cd\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u03f2\3\2"+
		"\2\2\u01d2\u01d3\7\21\2\2\u01d3\u01d4\7\u00ec\2\2\u01d4\u01d6\5\u009e"+
		"P\2\u01d5\u01d7\5&\24\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"\u01d8\3\2\2\2\u01d8\u01d9\7\62\2\2\u01d9\u01e1\7\u00e6\2\2\u01da\u01e2"+
		"\5\u00f4{\2\u01db\u01dc\7a\2\2\u01dc\u01dd\7-\2\2\u01dd\u01e2\5\u008a"+
		"F\2\u01de\u01df\7a\2\2\u01df\u01e0\7\17\2\2\u01e0\u01e2\7-\2\2\u01e1\u01da"+
		"\3\2\2\2\u01e1\u01db\3\2\2\2\u01e1\u01de\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2"+
		"\u03f2\3\2\2\2\u01e3\u01e4\7\20\2\2\u01e4\u01e5\7\u00ec\2\2\u01e5\u01e6"+
		"\5\u009eP\2\u01e6\u01e7\7\r\2\2\u01e7\u01e8\t\6\2\2\u01e8\u01e9\5\u00d4"+
		"k\2\u01e9\u03f2\3\2\2\2\u01ea\u01eb\7\20\2\2\u01eb\u01ec\7\u00ec\2\2\u01ec"+
		"\u01ed\5\u009eP\2\u01ed\u01ee\7\r\2\2\u01ee\u01ef\t\6\2\2\u01ef\u01f0"+
		"\7\3\2\2\u01f0\u01f1\5\u00d4k\2\u01f1\u01f2\7\4\2\2\u01f2\u03f2\3\2\2"+
		"\2\u01f3\u01f4\7\20\2\2\u01f4\u01f5\7\u00ec\2\2\u01f5\u01f6\5\u009eP\2"+
		"\u01f6\u01f7\7\u00c5\2\2\u01f7\u01f8\7,\2\2\u01f8\u01f9\5\u00eex\2\u01f9"+
		"\u01fa\7\u00f3\2\2\u01fa\u01fb\5\u00f4{\2\u01fb\u03f2\3\2\2\2\u01fc\u01fd"+
		"\7\20\2\2\u01fd\u01fe\7\u00ec\2\2\u01fe\u01ff\5\u009eP\2\u01ff\u0200\7"+
		"N\2\2\u0200\u0201\t\6\2\2\u0201\u0202\7\3\2\2\u0202\u0203\5\u00ecw\2\u0203"+
		"\u0204\7\4\2\2\u0204\u03f2\3\2\2\2\u0205\u0206\7\20\2\2\u0206\u0207\7"+
		"\u00ec\2\2\u0207\u0208\5\u009eP\2\u0208\u0209\7N\2\2\u0209\u020a\t\6\2"+
		"\2\u020a\u020b\5\u00ecw\2\u020b\u03f2\3\2\2\2\u020c\u020d\7\20\2\2\u020d"+
		"\u020e\t\7\2\2\u020e\u020f\5\u00a0Q\2\u020f\u0210\7\u00c5\2\2\u0210\u0211"+
		"\7\u00f3\2\2\u0211\u0212\5\u00a0Q\2\u0212\u03f2\3\2\2\2\u0213\u0214\7"+
		"\20\2\2\u0214\u0215\t\7\2\2\u0215\u0216\5\u009eP\2\u0216\u0217\7\u00dd"+
		"\2\2\u0217\u0218\7\u00ef\2\2\u0218\u0219\5\66\34\2\u0219\u03f2\3\2\2\2"+
		"\u021a\u021b\7\20\2\2\u021b\u021c\t\7\2\2\u021c\u021d\5\u009eP\2\u021d"+
		"\u021e\7\u0104\2\2\u021e\u0221\7\u00ef\2\2\u021f\u0220\7p\2\2\u0220\u0222"+
		"\7T\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0223\3\2\2\2\u0223"+
		"\u0224\5\66\34\2\u0224\u03f2\3\2\2\2\u0225\u0226\7\20\2\2\u0226\u0227"+
		"\7\u00ec\2\2\u0227\u0228\5\u009eP\2\u0228\u022a\t\b\2\2\u0229\u022b\7"+
		",\2\2\u022a\u0229\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022c\3\2\2\2\u022c"+
		"\u022f\5\u00eex\2\u022d\u022e\7\u00fc\2\2\u022e\u0230\5\u00d2j\2\u022f"+
		"\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0233\3\2\2\2\u0231\u0232\7."+
		"\2\2\u0232\u0234\7\u0126\2\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234"+
		"\u0236\3\2\2\2\u0235\u0237\5\u00d0i\2\u0236\u0235\3\2\2\2\u0236\u0237"+
		"\3\2\2\2\u0237\u03f2\3\2\2\2\u0238\u0239\7\20\2\2\u0239\u023a\7\u00ec"+
		"\2\2\u023a\u023c\5\u00a0Q\2\u023b\u023d\5&\24\2\u023c\u023b\3\2\2\2\u023c"+
		"\u023d\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0240\7$\2\2\u023f\u0241\7,\2"+
		"\2\u0240\u023f\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0243"+
		"\5\u00f0y\2\u0243\u0245\5\u00dan\2\u0244\u0246\5\u00d0i\2\u0245\u0244"+
		"\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u03f2\3\2\2\2\u0247\u0248\7\20\2\2"+
		"\u0248\u0249\7\u00ec\2\2\u0249\u024b\5\u00a0Q\2\u024a\u024c\5&\24\2\u024b"+
		"\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\7\u00dd"+
		"\2\2\u024e\u024f\7\u00da\2\2\u024f\u0253\7\u0126\2\2\u0250\u0251\7\u0110"+
		"\2\2\u0251\u0252\7\u00db\2\2\u0252\u0254\5\66\34\2\u0253\u0250\3\2\2\2"+
		"\u0253\u0254\3\2\2\2\u0254\u03f2\3\2\2\2\u0255\u0256\7\20\2\2\u0256\u0257"+
		"\7\u00ec\2\2\u0257\u0259\5\u00a0Q\2\u0258\u025a\5&\24\2\u0259\u0258\3"+
		"\2\2\2\u0259\u025a\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025c\7\u00dd\2\2"+
		"\u025c\u025d\7\u00db\2\2\u025d\u025e\5\66\34\2\u025e\u03f2\3\2\2\2\u025f"+
		"\u0260\7\20\2\2\u0260\u0261\7\u00ec\2\2\u0261\u0262\5\u00a0Q\2\u0262\u0266"+
		"\7\r\2\2\u0263\u0264\7p\2\2\u0264\u0265\7\u00a0\2\2\u0265\u0267\7T\2\2"+
		"\u0266\u0263\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0269\3\2\2\2\u0268\u026a"+
		"\5$\23\2\u0269\u0268\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u0269\3\2\2\2\u026b"+
		"\u026c\3\2\2\2\u026c\u03f2\3\2\2\2\u026d\u026e\7\20\2\2\u026e\u026f\7"+
		"\u010a\2\2\u026f\u0270\5\u00a0Q\2\u0270\u0274\7\r\2\2\u0271\u0272\7p\2"+
		"\2\u0272\u0273\7\u00a0\2\2\u0273\u0275\7T\2\2\u0274\u0271\3\2\2\2\u0274"+
		"\u0275\3\2\2\2\u0275\u0277\3\2\2\2\u0276\u0278\5&\24\2\u0277\u0276\3\2"+
		"\2\2\u0278\u0279\3\2\2\2\u0279\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a"+
		"\u03f2\3\2\2\2\u027b\u027c\7\20\2\2\u027c\u027d\7\u00ec\2\2\u027d\u027e"+
		"\5\u009eP\2\u027e\u027f\5&\24\2\u027f\u0280\7\u00c5\2\2\u0280\u0281\7"+
		"\u00f3\2\2\u0281\u0282\5&\24\2\u0282\u03f2\3\2\2\2\u0283\u0284\7\20\2"+
		"\2\u0284\u0285\t\7\2\2\u0285\u0286\5\u009eP\2\u0286\u0289\7N\2\2\u0287"+
		"\u0288\7p\2\2\u0288\u028a\7T\2\2\u0289\u0287\3\2\2\2\u0289\u028a\3\2\2"+
		"\2\u028a\u028b\3\2\2\2\u028b\u0290\5&\24\2\u028c\u028d\7\5\2\2\u028d\u028f"+
		"\5&\24\2\u028e\u028c\3\2\2\2\u028f\u0292\3\2\2\2\u0290\u028e\3\2\2\2\u0290"+
		"\u0291\3\2\2\2\u0291\u0294\3\2\2\2\u0292\u0290\3\2\2\2\u0293\u0295\7\u00bc"+
		"\2\2\u0294\u0293\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u03f2\3\2\2\2\u0296"+
		"\u0297\7\20\2\2\u0297\u0298\7\u00ec\2\2\u0298\u029a\5\u009eP\2\u0299\u029b"+
		"\5&\24\2\u029a\u0299\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029c\3\2\2\2\u029c"+
		"\u029d\7\u00dd\2\2\u029d\u029e\5\36\20\2\u029e\u03f2\3\2\2\2\u029f\u02a0"+
		"\7\20\2\2\u02a0\u02a1\7\u00ec\2\2\u02a1\u02a2\5\u009eP\2\u02a2\u02a3\7"+
		"\u00c1\2\2\u02a3\u02a4\7\u00b3\2\2\u02a4\u03f2\3\2\2\2\u02a5\u02a6\7N"+
		"\2\2\u02a6\u02a9\7\u00ec\2\2\u02a7\u02a8\7p\2\2\u02a8\u02aa\7T\2\2\u02a9"+
		"\u02a7\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ad\5\u009e"+
		"P\2\u02ac\u02ae\7\u00bc\2\2\u02ad\u02ac\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae"+
		"\u03f2\3\2\2\2\u02af\u02b0\7N\2\2\u02b0\u02b3\7\u010a\2\2\u02b1\u02b2"+
		"\7p\2\2\u02b2\u02b4\7T\2\2\u02b3\u02b1\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4"+
		"\u02b5\3\2\2\2\u02b5\u03f2\5\u009eP\2\u02b6\u02b9\7\66\2\2\u02b7\u02b8"+
		"\7\u00a8\2\2\u02b8\u02ba\7\u00c7\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3"+
		"\2\2\2\u02ba\u02bf\3\2\2\2\u02bb\u02bd\7i\2\2\u02bc\u02bb\3\2\2\2\u02bc"+
		"\u02bd\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02c0\7\u00f0\2\2\u02bf\u02bc"+
		"\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c5\7\u010a\2"+
		"\2\u02c2\u02c3\7p\2\2\u02c3\u02c4\7\u00a0\2\2\u02c4\u02c6\7T\2\2\u02c5"+
		"\u02c2\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c9\5\u00a0"+
		"Q\2\u02c8\u02ca\5\u0090I\2\u02c9\u02c8\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca"+
		"\u02d4\3\2\2\2\u02cb\u02cc\7.\2\2\u02cc\u02d3\7\u0126\2\2\u02cd\u02ce"+
		"\7\u00b2\2\2\u02ce\u02cf\7\u00a4\2\2\u02cf\u02d3\5\u0088E\2\u02d0\u02d1"+
		"\7\u00ef\2\2\u02d1\u02d3\5\66\34\2\u02d2\u02cb\3\2\2\2\u02d2\u02cd\3\2"+
		"\2\2\u02d2\u02d0\3\2\2\2\u02d3\u02d6\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d4"+
		"\u02d5\3\2\2\2\u02d5\u02d7\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d7\u02d8\7\27"+
		"\2\2\u02d8\u02d9\5 \21\2\u02d9\u03f2\3\2\2\2\u02da\u02dd\7\66\2\2\u02db"+
		"\u02dc\7\u00a8\2\2\u02dc\u02de\7\u00c7\2\2\u02dd\u02db\3\2\2\2\u02dd\u02de"+
		"\3\2\2\2\u02de\u02e0\3\2\2\2\u02df\u02e1\7i\2\2\u02e0\u02df\3\2\2\2\u02e0"+
		"\u02e1\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e3\7\u00f0\2\2\u02e3\u02e4"+
		"\7\u010a\2\2\u02e4\u02e9\5\u00a0Q\2\u02e5\u02e6\7\3\2\2\u02e6\u02e7\5"+
		"\u00d8m\2\u02e7\u02e8\7\4\2\2\u02e8\u02ea\3\2\2\2\u02e9\u02e5\3\2\2\2"+
		"\u02e9\u02ea\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ee\5\64\33\2\u02ec\u02ed"+
		"\7\u00a7\2\2\u02ed\u02ef\5\66\34\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef\3\2"+
		"\2\2\u02ef\u03f2\3\2\2\2\u02f0\u02f1\7\20\2\2\u02f1\u02f2\7\u010a\2\2"+
		"\u02f2\u02f4\5\u00a0Q\2\u02f3\u02f5\7\27\2\2\u02f4\u02f3\3\2\2\2\u02f4"+
		"\u02f5\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\5 \21\2\u02f7\u03f2\3\2"+
		"\2\2\u02f8\u02fb\7\66\2\2\u02f9\u02fa\7\u00a8\2\2\u02fa\u02fc\7\u00c7"+
		"\2\2\u02fb\u02f9\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fe\3\2\2\2\u02fd"+
		"\u02ff\7\u00f0\2\2\u02fe\u02fd\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0300"+
		"\3\2\2\2\u0300\u0304\7g\2\2\u0301\u0302\7p\2\2\u0302\u0303\7\u00a0\2\2"+
		"\u0303\u0305\7T\2\2\u0304\u0301\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0306"+
		"\3\2\2\2\u0306\u0307\5\u00eex\2\u0307\u0308\7\27\2\2\u0308\u0312\7\u0126"+
		"\2\2\u0309\u030a\7\u0108\2\2\u030a\u030f\5H%\2\u030b\u030c\7\5\2\2\u030c"+
		"\u030e\5H%\2\u030d\u030b\3\2\2\2\u030e\u0311\3\2\2\2\u030f\u030d\3\2\2"+
		"\2\u030f\u0310\3\2\2\2\u0310\u0313\3\2\2\2\u0311\u030f\3\2\2\2\u0312\u0309"+
		"\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u03f2\3\2\2\2\u0314\u0316\7N\2\2\u0315"+
		"\u0317\7\u00f0\2\2\u0316\u0315\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0318"+
		"\3\2\2\2\u0318\u031b\7g\2\2\u0319\u031a\7p\2\2\u031a\u031c\7T\2\2\u031b"+
		"\u0319\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u03f2\5\u00ee"+
		"x\2\u031e\u0320\7U\2\2\u031f\u0321\t\t\2\2\u0320\u031f\3\2\2\2\u0320\u0321"+
		"\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u03f2\5\22\n\2\u0323\u0324\7\u00e0"+
		"\2\2\u0324\u0327\7\u00ed\2\2\u0325\u0326\t\5\2\2\u0326\u0328\5\u009eP"+
		"\2\u0327\u0325\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u032d\3\2\2\2\u0329\u032b"+
		"\7\u0087\2\2\u032a\u0329\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032c\3\2\2"+
		"\2\u032c\u032e\7\u0126\2\2\u032d\u032a\3\2\2\2\u032d\u032e\3\2\2\2\u032e"+
		"\u03f2\3\2\2\2\u032f\u0330\7\u00e0\2\2\u0330\u0331\7\u00ec\2\2\u0331\u0334"+
		"\7W\2\2\u0332\u0333\t\5\2\2\u0333\u0335\5\u00f0y\2\u0334\u0332\3\2\2\2"+
		"\u0334\u0335\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0337\7\u0087\2\2\u0337"+
		"\u0339\7\u0126\2\2\u0338\u033a\5&\24\2\u0339\u0338\3\2\2\2\u0339\u033a"+
		"\3\2\2\2\u033a\u03f2\3\2\2\2\u033b\u033c\7\u00e0\2\2\u033c\u033d\7\u00ef"+
		"\2\2\u033d\u0342\5\u00a0Q\2\u033e\u033f\7\3\2\2\u033f\u0340\5:\36\2\u0340"+
		"\u0341\7\4\2\2\u0341\u0343\3\2\2\2\u0342\u033e\3\2\2\2\u0342\u0343\3\2"+
		"\2\2\u0343\u03f2\3\2\2\2\u0344\u0345\7\u00e0\2\2\u0345\u0346\7-\2\2\u0346"+
		"\u0347\t\5\2\2\u0347\u034a\5\u009eP\2\u0348\u0349\t\5\2\2\u0349\u034b"+
		"\5\u009eP\2\u034a\u0348\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u03f2\3\2\2"+
		"\2\u034c\u034d\7\u00e0\2\2\u034d\u034e\7\u00b3\2\2\u034e\u0350\5\u009e"+
		"P\2\u034f\u0351\5&\24\2\u0350\u034f\3\2\2\2\u0350\u0351\3\2\2\2\u0351"+
		"\u03f2\3\2\2\2\u0352\u0354\7\u00e0\2\2\u0353\u0355\5\u00f4{\2\u0354\u0353"+
		"\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u035e\7h\2\2\u0357"+
		"\u0359\7\u0087\2\2\u0358\u0357\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u035c"+
		"\3\2\2\2\u035a\u035d\5\u00eex\2\u035b\u035d\7\u0126\2\2\u035c\u035a\3"+
		"\2\2\2\u035c\u035b\3\2\2\2\u035d\u035f\3\2\2\2\u035e\u0358\3\2\2\2\u035e"+
		"\u035f\3\2\2\2\u035f\u03f2\3\2\2\2\u0360\u0361\7\u00e0\2\2\u0361\u0362"+
		"\7\66\2\2\u0362\u0363\7\u00ec\2\2\u0363\u03f2\5\u009eP\2\u0364\u0365\t"+
		"\n\2\2\u0365\u0367\7g\2\2\u0366\u0368\7W\2\2\u0367\u0366\3\2\2\2\u0367"+
		"\u0368\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u03f2\5,\27\2\u036a\u036b\t\n"+
		"\2\2\u036b\u036d\5*\26\2\u036c\u036e\7W\2\2\u036d\u036c\3\2\2\2\u036d"+
		"\u036e\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0370\5\u00f0y\2\u0370\u03f2"+
		"\3\2\2\2\u0371\u0373\t\n\2\2\u0372\u0374\7\u00ec\2\2\u0373\u0372\3\2\2"+
		"\2\u0373\u0374\3\2\2\2\u0374\u0376\3\2\2\2\u0375\u0377\t\13\2\2\u0376"+
		"\u0375\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u037a\5\u009e"+
		"P\2\u0379\u037b\5&\24\2\u037a\u0379\3\2\2\2\u037a\u037b\3\2\2\2\u037b"+
		"\u037d\3\2\2\2\u037c\u037e\5.\30\2\u037d\u037c\3\2\2\2\u037d\u037e\3\2"+
		"\2\2\u037e\u03f2\3\2\2\2\u037f\u0381\t\n\2\2\u0380\u0382\7\u00bd\2\2\u0381"+
		"\u0380\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u03f2\5 "+
		"\21\2\u0384\u0385\7\u00c4\2\2\u0385\u0386\7\u00ec\2\2\u0386\u03f2\5\u009e"+
		"P\2\u0387\u038f\7\u00c4\2\2\u0388\u0390\7\u0126\2\2\u0389\u038b\13\2\2"+
		"\2\u038a\u0389\3\2\2\2\u038b\u038e\3\2\2\2\u038c\u038d\3\2\2\2\u038c\u038a"+
		"\3\2\2\2\u038d\u0390\3\2\2\2\u038e\u038c\3\2\2\2\u038f\u0388\3\2\2\2\u038f"+
		"\u038c\3\2\2\2\u0390\u03f2\3\2\2\2\u0391\u0393\7 \2\2\u0392\u0394\7\u0084"+
		"\2\2\u0393\u0392\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0395\3\2\2\2\u0395"+
		"\u0396\7\u00ec\2\2\u0396\u0399\5\u009eP\2\u0397\u0398\7\u00a7\2\2\u0398"+
		"\u039a\5\66\34\2\u0399\u0397\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039f\3"+
		"\2\2\2\u039b\u039d\7\27\2\2\u039c\u039b\3\2\2\2\u039c\u039d\3\2\2\2\u039d"+
		"\u039e\3\2\2\2\u039e\u03a0\5 \21\2\u039f\u039c\3\2\2\2\u039f\u03a0\3\2"+
		"\2\2\u03a0\u03f2\3\2\2\2\u03a1\u03a2\7\u00ff\2\2\u03a2\u03a5\7\u00ec\2"+
		"\2\u03a3\u03a4\7p\2\2\u03a4\u03a6\7T\2\2\u03a5\u03a3\3\2\2\2\u03a5\u03a6"+
		"\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03f2\5\u009eP\2\u03a8\u03a9\7&\2\2"+
		"\u03a9\u03f2\7 \2\2\u03aa\u03ab\7\u008b\2\2\u03ab\u03ad\7>\2\2\u03ac\u03ae"+
		"\7\u008c\2\2\u03ad\u03ac\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03af\3\2\2"+
		"\2\u03af\u03b0\7w\2\2\u03b0\u03b2\7\u0126\2\2\u03b1\u03b3\7\u00b0\2\2"+
		"\u03b2\u03b1\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b5"+
		"\7|\2\2\u03b5\u03b6\7\u00ec\2\2\u03b6\u03b8\5\u009eP\2\u03b7\u03b9\5&"+
		"\24\2\u03b8\u03b7\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03f2\3\2\2\2\u03ba"+
		"\u03bb\7\u00fb\2\2\u03bb\u03bc\7\u00ec\2\2\u03bc\u03be\5\u009eP\2\u03bd"+
		"\u03bf\5&\24\2\u03be\u03bd\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03f2\3\2"+
		"\2\2\u03c0\u03c1\7\u009b\2\2\u03c1\u03c2\7\u00c6\2\2\u03c2\u03c3\7\u00ec"+
		"\2\2\u03c3\u03f2\5\u009eP\2\u03c4\u03c5\t\f\2\2\u03c5\u03c9\5\u00f4{\2"+
		"\u03c6\u03c8\13\2\2\2\u03c7\u03c6\3\2\2\2\u03c8\u03cb\3\2\2\2\u03c9\u03ca"+
		"\3\2\2\2\u03c9\u03c7\3\2\2\2\u03ca\u03f2\3\2\2\2\u03cb\u03c9\3\2\2\2\u03cc"+
		"\u03cd\7\u00dd\2\2\u03cd\u03d1\7\u00ce\2\2\u03ce\u03d0\13\2\2\2\u03cf"+
		"\u03ce\3\2\2\2\u03d0\u03d3\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d1\u03cf\3\2"+
		"\2\2\u03d2\u03f2\3\2\2\2\u03d3\u03d1\3\2\2\2\u03d4\u03d8\7\u00dd\2\2\u03d5"+
		"\u03d7\13\2\2\2\u03d6\u03d5\3\2\2\2\u03d7\u03da\3\2\2\2\u03d8\u03d9\3"+
		"\2\2\2\u03d8\u03d6\3\2\2\2\u03d9\u03f2\3\2\2\2\u03da\u03d8\3\2\2\2\u03db"+
		"\u03f2\7\u00c8\2\2\u03dc\u03dd\7E\2\2\u03dd\u03de\7e\2\2\u03de\u03df\5"+
		"\u009eP\2\u03df\u03e1\5\u009aN\2\u03e0\u03e2\5d\63\2\u03e1\u03e0\3\2\2"+
		"\2\u03e1\u03e2\3\2\2\2\u03e2\u03f2\3\2\2\2\u03e3\u03e4\7\u0105\2\2\u03e4"+
		"\u03e5\5\u009eP\2\u03e5\u03e6\5\u009aN\2\u03e6\u03e8\5`\61\2\u03e7\u03e9"+
		"\5d\63\2\u03e8\u03e7\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03f2\3\2\2\2\u03ea"+
		"\u03ee\5\24\13\2\u03eb\u03ed\13\2\2\2\u03ec\u03eb\3\2\2\2\u03ed\u03f0"+
		"\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ef\u03f2\3\2\2\2\u03f0"+
		"\u03ee\3\2\2\2\u03f1\u011d\3\2\2\2\u03f1\u011f\3\2\2\2\u03f1\u0122\3\2"+
		"\2\2\u03f1\u0127\3\2\2\2\u03f1\u013d\3\2\2\2\u03f1\u0144\3\2\2\2\u03f1"+
		"\u014a\3\2\2\2\u03f1\u0157\3\2\2\2\u03f1\u0163\3\2\2\2\u03f1\u0181\3\2"+
		"\2\2\u03f1\u01a7\3\2\2\2\u03f1\u01b4\3\2\2\2\u03f1\u01d2\3\2\2\2\u03f1"+
		"\u01e3\3\2\2\2\u03f1\u01ea\3\2\2\2\u03f1\u01f3\3\2\2\2\u03f1\u01fc\3\2"+
		"\2\2\u03f1\u0205\3\2\2\2\u03f1\u020c\3\2\2\2\u03f1\u0213\3\2\2\2\u03f1"+
		"\u021a\3\2\2\2\u03f1\u0225\3\2\2\2\u03f1\u0238\3\2\2\2\u03f1\u0247\3\2"+
		"\2\2\u03f1\u0255\3\2\2\2\u03f1\u025f\3\2\2\2\u03f1\u026d\3\2\2\2\u03f1"+
		"\u027b\3\2\2\2\u03f1\u0283\3\2\2\2\u03f1\u0296\3\2\2\2\u03f1\u029f\3\2"+
		"\2\2\u03f1\u02a5\3\2\2\2\u03f1\u02af\3\2\2\2\u03f1\u02b6\3\2\2\2\u03f1"+
		"\u02da\3\2\2\2\u03f1\u02f0\3\2\2\2\u03f1\u02f8\3\2\2\2\u03f1\u0314\3\2"+
		"\2\2\u03f1\u031e\3\2\2\2\u03f1\u0323\3\2\2\2\u03f1\u032f\3\2\2\2\u03f1"+
		"\u033b\3\2\2\2\u03f1\u0344\3\2\2\2\u03f1\u034c\3\2\2\2\u03f1\u0352\3\2"+
		"\2\2\u03f1\u0360\3\2\2\2\u03f1\u0364\3\2\2\2\u03f1\u036a\3\2\2\2\u03f1"+
		"\u0371\3\2\2\2\u03f1\u037f\3\2\2\2\u03f1\u0384\3\2\2\2\u03f1\u0387\3\2"+
		"\2\2\u03f1\u0391\3\2\2\2\u03f1\u03a1\3\2\2\2\u03f1\u03a8\3\2\2\2\u03f1"+
		"\u03aa\3\2\2\2\u03f1\u03ba\3\2\2\2\u03f1\u03c0\3\2\2\2\u03f1\u03c4\3\2"+
		"\2\2\u03f1\u03cc\3\2\2\2\u03f1\u03d4\3\2\2\2\u03f1\u03db\3\2\2\2\u03f1"+
		"\u03dc\3\2\2\2\u03f1\u03e3\3\2\2\2\u03f1\u03ea\3\2\2\2\u03f2\23\3\2\2"+
		"\2\u03f3\u03f4\7\66\2\2\u03f4\u049e\7\u00ce\2\2\u03f5\u03f6\7N\2\2\u03f6"+
		"\u049e\7\u00ce\2\2\u03f7\u03f9\7j\2\2\u03f8\u03fa\7\u00ce\2\2\u03f9\u03f8"+
		"\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u049e\3\2\2\2\u03fb\u03fd\7\u00cb\2"+
		"\2\u03fc\u03fe\7\u00ce\2\2\u03fd\u03fc\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe"+
		"\u049e\3\2\2\2\u03ff\u0400\7\u00e0\2\2\u0400\u049e\7j\2\2\u0401\u0402"+
		"\7\u00e0\2\2\u0402\u0404\7\u00ce\2\2\u0403\u0405\7j\2\2\u0404\u0403\3"+
		"\2\2\2\u0404\u0405\3\2\2\2\u0405\u049e\3\2\2\2\u0406\u0407\7\u00e0\2\2"+
		"\u0407\u049e\7\u00ba\2\2\u0408\u0409\7\u00e0\2\2\u0409\u049e\7\u00cf\2"+
		"\2\u040a\u040b\7\u00e0\2\2\u040b\u040c\79\2\2\u040c\u049e\7\u00cf\2\2"+
		"\u040d\u040e\7V\2\2\u040e\u049e\7\u00ec\2\2\u040f\u0410\7r\2\2\u0410\u049e"+
		"\7\u00ec\2\2\u0411\u0412\7\u00e0\2\2\u0412\u049e\7\61\2\2\u0413\u0414"+
		"\7\u00e0\2\2\u0414\u0415\7\66\2\2\u0415\u049e\7\u00ec\2\2\u0416\u0417"+
		"\7\u00e0\2\2\u0417\u049e\7\u00f7\2\2\u0418\u0419\7\u00e0\2\2\u0419\u049e"+
		"\7u\2\2\u041a\u041b\7\u00e0\2\2\u041b\u049e\7\u008f\2\2\u041c\u041d\7"+
		"\66\2\2\u041d\u049e\7t\2\2\u041e\u041f\7N\2\2\u041f\u049e\7t\2\2\u0420"+
		"\u0421\7\20\2\2\u0421\u049e\7t\2\2\u0422\u0423\7\u008e\2\2\u0423\u049e"+
		"\7\u00ec\2\2\u0424\u0425\7\u008e\2\2\u0425\u049e\7?\2\2\u0426\u0427\7"+
		"\u0103\2\2\u0427\u049e\7\u00ec\2\2\u0428\u0429\7\u0103\2\2\u0429\u049e"+
		"\7?\2\2\u042a\u042b\7\66\2\2\u042b\u042c\7\u00f0\2\2\u042c\u049e\7\u0091"+
		"\2\2\u042d\u042e\7N\2\2\u042e\u042f\7\u00f0\2\2\u042f\u049e\7\u0091\2"+
		"\2\u0430\u0431\7\20\2\2\u0431\u0432\7\u00ec\2\2\u0432\u0433\5\u00a0Q\2"+
		"\u0433\u0434\7\u00a0\2\2\u0434\u0435\7(\2\2\u0435\u049e\3\2\2\2\u0436"+
		"\u0437\7\20\2\2\u0437\u0438\7\u00ec\2\2\u0438\u0439\5\u00a0Q\2\u0439\u043a"+
		"\7(\2\2\u043a\u043b\7\37\2\2\u043b\u049e\3\2\2\2\u043c\u043d\7\20\2\2"+
		"\u043d\u043e\7\u00ec\2\2\u043e\u043f\5\u00a0Q\2\u043f\u0440\7\u00a0\2"+
		"\2\u0440\u0441\7\u00e4\2\2\u0441\u049e\3\2\2\2\u0442\u0443\7\20\2\2\u0443"+
		"\u0444\7\u00ec\2\2\u0444\u0445\5\u00a0Q\2\u0445\u0446\7\u00e1\2\2\u0446"+
		"\u0447\7\37\2\2\u0447\u049e\3\2\2\2\u0448\u0449\7\20\2\2\u0449\u044a\7"+
		"\u00ec\2\2\u044a\u044b\5\u00a0Q\2\u044b\u044c\7\u00a0\2\2\u044c\u044d"+
		"\7\u00e1\2\2\u044d\u049e\3\2\2\2\u044e\u044f\7\20\2\2\u044f\u0450\7\u00ec"+
		"\2\2\u0450\u0451\5\u00a0Q\2\u0451\u0452\7\u00a0\2\2\u0452\u0453\7\u00e7"+
		"\2\2\u0453\u0454\7\27\2\2\u0454\u0455\7J\2\2\u0455\u049e\3\2\2\2\u0456"+
		"\u0457\7\20\2\2\u0457\u0458\7\u00ec\2\2\u0458\u0459\5\u00a0Q\2\u0459\u045a"+
		"\7\u00dd\2\2\u045a\u045b\7\u00e1\2\2\u045b\u045c\7\u008d\2\2\u045c\u049e"+
		"\3\2\2\2\u045d\u045e\7\20\2\2\u045e\u045f\7\u00ec\2\2\u045f\u0460\5\u00a0"+
		"Q\2\u0460\u0461\7S\2\2\u0461\u0462\7\u00b1\2\2\u0462\u049e\3\2\2\2\u0463"+
		"\u0464\7\20\2\2\u0464\u0465\7\u00ec\2\2\u0465\u0466\5\u00a0Q\2\u0466\u0467"+
		"\7\25\2\2\u0467\u0468\7\u00b1\2\2\u0468\u049e\3\2\2\2\u0469\u046a\7\20"+
		"\2\2\u046a\u046b\7\u00ec\2\2\u046b\u046c\5\u00a0Q\2\u046c\u046d\7\u00fd"+
		"\2\2\u046d\u046e\7\u00b1\2\2\u046e\u049e\3\2\2\2\u046f\u0470\7\20\2\2"+
		"\u0470\u0471\7\u00ec\2\2\u0471\u0472\5\u00a0Q\2\u0472\u0473\7\u00f4\2"+
		"\2\u0473\u049e\3\2\2\2\u0474\u0475\7\20\2\2\u0475\u0476\7\u00ec\2\2\u0476"+
		"\u0478\5\u00a0Q\2\u0477\u0479\5&\24\2\u0478\u0477\3\2\2\2\u0478\u0479"+
		"\3\2\2\2\u0479\u047a\3\2\2\2\u047a\u047b\7\60\2\2\u047b\u049e\3\2\2\2"+
		"\u047c\u047d\7\20\2\2\u047d\u047e\7\u00ec\2\2\u047e\u0480\5\u00a0Q\2\u047f"+
		"\u0481\5&\24\2\u0480\u047f\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u0482\3\2"+
		"\2\2\u0482\u0483\7\63\2\2\u0483\u049e\3\2\2\2\u0484\u0485\7\20\2\2\u0485"+
		"\u0486\7\u00ec\2\2\u0486\u0488\5\u00a0Q\2\u0487\u0489\5&\24\2\u0488\u0487"+
		"\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u048b\7\u00dd\2"+
		"\2\u048b\u048c\7]\2\2\u048c\u049e\3\2\2\2\u048d\u048e\7\20\2\2\u048e\u048f"+
		"\7\u00ec\2\2\u048f\u0491\5\u00a0Q\2\u0490\u0492\5&\24\2\u0491\u0490\3"+
		"\2\2\2\u0491\u0492\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0494\7\u00c7\2\2"+
		"\u0494\u0495\7-\2\2\u0495\u049e\3\2\2\2\u0496\u0497\7\u00e5\2\2\u0497"+
		"\u049e\7\u00f6\2\2\u0498\u049e\7/\2\2\u0499\u049e\7\u00d0\2\2\u049a\u049e"+
		"\7I\2\2\u049b\u049c\7E\2\2\u049c\u049e\7e\2\2\u049d\u03f3\3\2\2\2\u049d"+
		"\u03f5\3\2\2\2\u049d\u03f7\3\2\2\2\u049d\u03fb\3\2\2\2\u049d\u03ff\3\2"+
		"\2\2\u049d\u0401\3\2\2\2\u049d\u0406\3\2\2\2\u049d\u0408\3\2\2\2\u049d"+
		"\u040a\3\2\2\2\u049d\u040d\3\2\2\2\u049d\u040f\3\2\2\2\u049d\u0411\3\2"+
		"\2\2\u049d\u0413\3\2\2\2\u049d\u0416\3\2\2\2\u049d\u0418\3\2\2\2\u049d"+
		"\u041a\3\2\2\2\u049d\u041c\3\2\2\2\u049d\u041e\3\2\2\2\u049d\u0420\3\2"+
		"\2\2\u049d\u0422\3\2\2\2\u049d\u0424\3\2\2\2\u049d\u0426\3\2\2\2\u049d"+
		"\u0428\3\2\2\2\u049d\u042a\3\2\2\2\u049d\u042d\3\2\2\2\u049d\u0430\3\2"+
		"\2\2\u049d\u0436\3\2\2\2\u049d\u043c\3\2\2\2\u049d\u0442\3\2\2\2\u049d"+
		"\u0448\3\2\2\2\u049d\u044e\3\2\2\2\u049d\u0456\3\2\2\2\u049d\u045d\3\2"+
		"\2\2\u049d\u0463\3\2\2\2\u049d\u0469\3\2\2\2\u049d\u046f\3\2\2\2\u049d"+
		"\u0474\3\2\2\2\u049d\u047c\3\2\2\2\u049d\u0484\3\2\2\2\u049d\u048d\3\2"+
		"\2\2\u049d\u0496\3\2\2\2\u049d\u0498\3\2\2\2\u049d\u0499\3\2\2\2\u049d"+
		"\u049a\3\2\2\2\u049d\u049b\3\2\2\2\u049e\25\3\2\2\2\u049f\u04a1\7\66\2"+
		"\2\u04a0\u04a2\7\u00f0\2\2\u04a1\u04a0\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2"+
		"\u04a4\3\2\2\2\u04a3\u04a5\7X\2\2\u04a4\u04a3\3\2\2\2\u04a4\u04a5\3\2"+
		"\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04aa\7\u00ec\2\2\u04a7\u04a8\7p\2\2\u04a8"+
		"\u04a9\7\u00a0\2\2\u04a9\u04ab\7T\2\2\u04aa\u04a7\3\2\2\2\u04aa\u04ab"+
		"\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04ad\5\u009eP\2\u04ad\27\3\2\2\2\u04ae"+
		"\u04af\7\66\2\2\u04af\u04b1\7\u00a8\2\2\u04b0\u04ae\3\2\2\2\u04b0\u04b1"+
		"\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b3\7\u00c7\2\2\u04b3\u04b4\7\u00ec"+
		"\2\2\u04b4\u04b5\5\u009eP\2\u04b5\31\3\2\2\2\u04b6\u04b7\7(\2\2\u04b7"+
		"\u04b8\7\37\2\2\u04b8\u04bc\5\u0088E\2\u04b9\u04ba\7\u00e4\2\2\u04ba\u04bb"+
		"\7\37\2\2\u04bb\u04bd\5\u008cG\2\u04bc\u04b9\3\2\2\2\u04bc\u04bd\3\2\2"+
		"\2\u04bd\u04be\3\2\2\2\u04be\u04bf\7|\2\2\u04bf\u04c0\7\u012a\2\2\u04c0"+
		"\u04c1\7\36\2\2\u04c1\33\3\2\2\2\u04c2\u04c3\7\u00e1\2\2\u04c3\u04c4\7"+
		"\37\2\2\u04c4\u04c5\5\u0088E\2\u04c5\u04c8\7\u00a4\2\2\u04c6\u04c9\5>"+
		" \2\u04c7\u04c9\5@!\2\u04c8\u04c6\3\2\2\2\u04c8\u04c7\3\2\2\2\u04c9\u04cd"+
		"\3\2\2\2\u04ca\u04cb\7\u00e7\2\2\u04cb\u04cc\7\27\2\2\u04cc\u04ce\7J\2"+
		"\2\u04cd\u04ca\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\35\3\2\2\2\u04cf\u04d0"+
		"\7\u008d\2\2\u04d0\u04d1\7\u0126\2\2\u04d1\37\3\2\2\2\u04d2\u04d4\5\60"+
		"\31\2\u04d3\u04d2\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5"+
		"\u04d6\5P)\2\u04d6\u04d7\5L\'\2\u04d7!\3\2\2\2\u04d8\u04d9\7y\2\2\u04d9"+
		"\u04db\7\u00b0\2\2\u04da\u04dc\7\u00ec\2\2\u04db\u04da\3\2\2\2\u04db\u04dc"+
		"\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04e4\5\u009eP\2\u04de\u04e2\5&\24"+
		"\2\u04df\u04e0\7p\2\2\u04e0\u04e1\7\u00a0\2\2\u04e1\u04e3\7T\2\2\u04e2"+
		"\u04df\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e5\3\2\2\2\u04e4\u04de\3\2"+
		"\2\2\u04e4\u04e5\3\2\2\2\u04e5\u0510\3\2\2\2\u04e6\u04e7\7y\2\2\u04e7"+
		"\u04e9\7|\2\2\u04e8\u04ea\7\u00ec\2\2\u04e9\u04e8\3\2\2\2\u04e9\u04ea"+
		"\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04ed\5\u009eP\2\u04ec\u04ee\5&\24"+
		"\2\u04ed\u04ec\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04f2\3\2\2\2\u04ef\u04f0"+
		"\7p\2\2\u04f0\u04f1\7\u00a0\2\2\u04f1\u04f3\7T\2\2\u04f2\u04ef\3\2\2\2"+
		"\u04f2\u04f3\3\2\2\2\u04f3\u0510\3\2\2\2\u04f4\u04f5\7y\2\2\u04f5\u04f7"+
		"\7\u00b0\2\2\u04f6\u04f8\7\u008c\2\2\u04f7\u04f6\3\2\2\2\u04f7\u04f8\3"+
		"\2\2\2\u04f8\u04f9\3\2\2\2\u04f9\u04fa\7K\2\2\u04fa\u04fc\7\u0126\2\2"+
		"\u04fb\u04fd\5\u009cO\2\u04fc\u04fb\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd"+
		"\u04ff\3\2\2\2\u04fe\u0500\5B\"\2\u04ff\u04fe\3\2\2\2\u04ff\u0500\3\2"+
		"\2\2\u0500\u0510\3\2\2\2\u0501\u0502\7y\2\2\u0502\u0504\7\u00b0\2\2\u0503"+
		"\u0505\7\u008c\2\2\u0504\u0503\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0506"+
		"\3\2\2\2\u0506\u0508\7K\2\2\u0507\u0509\7\u0126\2\2\u0508\u0507\3\2\2"+
		"\2\u0508\u0509\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050d\5\64\33\2\u050b"+
		"\u050c\7\u00a7\2\2\u050c\u050e\5\66\34\2\u050d\u050b\3\2\2\2\u050d\u050e"+
		"\3\2\2\2\u050e\u0510\3\2\2\2\u050f\u04d8\3\2\2\2\u050f\u04e6\3\2\2\2\u050f"+
		"\u04f4\3\2\2\2\u050f\u0501\3\2\2\2\u0510#\3\2\2\2\u0511\u0513\5&\24\2"+
		"\u0512\u0514\5\36\20\2\u0513\u0512\3\2\2\2\u0513\u0514\3\2\2\2\u0514%"+
		"\3\2\2\2\u0515\u0516\7\u00b1\2\2\u0516\u0517\7\3\2\2\u0517\u051c\5(\25"+
		"\2\u0518\u0519\7\5\2\2\u0519\u051b\5(\25\2\u051a\u0518\3\2\2\2\u051b\u051e"+
		"\3\2\2\2\u051c\u051a\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u051f\3\2\2\2\u051e"+
		"\u051c\3\2\2\2\u051f\u0520\7\4\2\2\u0520\'\3\2\2\2\u0521\u0524\5\u00f4"+
		"{\2\u0522\u0523\7\u0113\2\2\u0523\u0525\5\u00b8]\2\u0524\u0522\3\2\2\2"+
		"\u0524\u0525\3\2\2\2\u0525)\3\2\2\2\u0526\u0527\t\r\2\2\u0527+\3\2\2\2"+
		"\u0528\u052e\5\u00eex\2\u0529\u052e\7\u0126\2\2\u052a\u052e\5\u00ba^\2"+
		"\u052b\u052e\5\u00bc_\2\u052c\u052e\5\u00be`\2\u052d\u0528\3\2\2\2\u052d"+
		"\u0529\3\2\2\2\u052d\u052a\3\2\2\2\u052d\u052b\3\2\2\2\u052d\u052c\3\2"+
		"\2\2\u052e-\3\2\2\2\u052f\u0534\5\u00f4{\2\u0530\u0531\7\6\2\2\u0531\u0533"+
		"\5\u00f4{\2\u0532\u0530\3\2\2\2\u0533\u0536\3\2\2\2\u0534\u0532\3\2\2"+
		"\2\u0534\u0535\3\2\2\2\u0535/\3\2\2\2\u0536\u0534\3\2\2\2\u0537\u0538"+
		"\7\u0110\2\2\u0538\u053d\5\62\32\2\u0539\u053a\7\5\2\2\u053a\u053c\5\62"+
		"\32\2\u053b\u0539\3\2\2\2\u053c\u053f\3\2\2\2\u053d\u053b\3\2\2\2\u053d"+
		"\u053e\3\2\2\2\u053e\61\3\2\2\2\u053f\u053d\3\2\2\2\u0540\u0542\5\u00f0"+
		"y\2\u0541\u0543\5\u0088E\2\u0542\u0541\3\2\2\2\u0542\u0543\3\2\2\2\u0543"+
		"\u0545\3\2\2\2\u0544\u0546\7\27\2\2\u0545\u0544\3\2\2\2\u0545\u0546\3"+
		"\2\2\2\u0546\u0547\3\2\2\2\u0547\u0548\7\3\2\2\u0548\u0549\5 \21\2\u0549"+
		"\u054a\7\4\2\2\u054a\63\3\2\2\2\u054b\u054c\7\u0108\2\2\u054c\u054d\5"+
		"\u00eex\2\u054d\65\3\2\2\2\u054e\u054f\7\3\2\2\u054f\u0554\58\35\2\u0550"+
		"\u0551\7\5\2\2\u0551\u0553\58\35\2\u0552\u0550\3\2\2\2\u0553\u0556\3\2"+
		"\2\2\u0554\u0552\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u0557\3\2\2\2\u0556"+
		"\u0554\3\2\2\2\u0557\u0558\7\4\2\2\u0558\67\3\2\2\2\u0559\u055e\5:\36"+
		"\2\u055a\u055c\7\u0113\2\2\u055b\u055a\3\2\2\2\u055b\u055c\3\2\2\2\u055c"+
		"\u055d\3\2\2\2\u055d\u055f\5<\37\2\u055e\u055b\3\2\2\2\u055e\u055f\3\2"+
		"\2\2\u055f9\3\2\2\2\u0560\u0565\5\u00f4{\2\u0561\u0562\7\6\2\2\u0562\u0564"+
		"\5\u00f4{\2\u0563\u0561\3\2\2\2\u0564\u0567\3\2\2\2\u0565\u0563\3\2\2"+
		"\2\u0565\u0566\3\2\2\2\u0566\u056a\3\2\2\2\u0567\u0565\3\2\2\2\u0568\u056a"+
		"\7\u0126\2\2\u0569\u0560\3\2\2\2\u0569\u0568\3\2\2\2\u056a;\3\2\2\2\u056b"+
		"\u0570\7\u012a\2\2\u056c\u0570\7\u012b\2\2\u056d\u0570\5\u00c0a\2\u056e"+
		"\u0570\7\u0126\2\2\u056f\u056b\3\2\2\2\u056f\u056c\3\2\2\2\u056f\u056d"+
		"\3\2\2\2\u056f\u056e\3\2\2\2\u0570=\3\2\2\2\u0571\u0572\7\3\2\2\u0572"+
		"\u0577\5\u00b8]\2\u0573\u0574\7\5\2\2\u0574\u0576\5\u00b8]\2\u0575\u0573"+
		"\3\2\2\2\u0576\u0579\3\2\2\2\u0577\u0575\3\2\2\2\u0577\u0578\3\2\2\2\u0578"+
		"\u057a\3\2\2\2\u0579\u0577\3\2\2\2\u057a\u057b\7\4\2\2\u057b?\3\2\2\2"+
		"\u057c\u057d\7\3\2\2\u057d\u0582\5> \2\u057e\u057f\7\5\2\2\u057f\u0581"+
		"\5> \2\u0580\u057e\3\2\2\2\u0581\u0584\3\2\2\2\u0582\u0580\3\2\2\2\u0582"+
		"\u0583\3\2\2\2\u0583\u0585\3\2\2\2\u0584\u0582\3\2\2\2\u0585\u0586\7\4"+
		"\2\2\u0586A\3\2\2\2\u0587\u0588\7\u00e7\2\2\u0588\u0589\7\27\2\2\u0589"+
		"\u058e\5D#\2\u058a\u058b\7\u00e7\2\2\u058b\u058c\7\37\2\2\u058c\u058e"+
		"\5F$\2\u058d\u0587\3\2\2\2\u058d\u058a\3\2\2\2\u058eC\3\2\2\2\u058f\u0590"+
		"\7x\2\2\u0590\u0591\7\u0126\2\2\u0591\u0592\7\u00ac\2\2\u0592\u0595\7"+
		"\u0126\2\2\u0593\u0595\5\u00f4{\2\u0594\u058f\3\2\2\2\u0594\u0593\3\2"+
		"\2\2\u0595E\3\2\2\2\u0596\u059a\7\u0126\2\2\u0597\u0598\7\u0110\2\2\u0598"+
		"\u0599\7\u00db\2\2\u0599\u059b\5\66\34\2\u059a\u0597\3\2\2\2\u059a\u059b"+
		"\3\2\2\2\u059bG\3\2\2\2\u059c\u059d\5\u00f4{\2\u059d\u059e\7\u0126\2\2"+
		"\u059eI\3\2\2\2\u059f\u05a0\5\"\22\2\u05a0\u05a1\5P)\2\u05a1\u05a2\5L"+
		"\'\2\u05a2\u05aa\3\2\2\2\u05a3\u05a5\5l\67\2\u05a4\u05a6\5N(\2\u05a5\u05a4"+
		"\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7\u05a5\3\2\2\2\u05a7\u05a8\3\2\2\2\u05a8"+
		"\u05aa\3\2\2\2\u05a9\u059f\3\2\2\2\u05a9\u05a3\3\2\2\2\u05aaK\3\2\2\2"+
		"\u05ab\u05ac\7\u00a9\2\2\u05ac\u05ad\7\37\2\2\u05ad\u05b2\5T+\2\u05ae"+
		"\u05af\7\5\2\2\u05af\u05b1\5T+\2\u05b0\u05ae\3\2\2\2\u05b1\u05b4\3\2\2"+
		"\2\u05b2\u05b0\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05b6\3\2\2\2\u05b4\u05b2"+
		"\3\2\2\2\u05b5\u05ab\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6\u05c1\3\2\2\2\u05b7"+
		"\u05b8\7\'\2\2\u05b8\u05b9\7\37\2\2\u05b9\u05be\5\u00aeX\2\u05ba\u05bb"+
		"\7\5\2\2\u05bb\u05bd\5\u00aeX\2\u05bc\u05ba\3\2\2\2\u05bd\u05c0\3\2\2"+
		"\2\u05be\u05bc\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u05c2\3\2\2\2\u05c0\u05be"+
		"\3\2\2\2\u05c1\u05b7\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05cd\3\2\2\2\u05c3"+
		"\u05c4\7M\2\2\u05c4\u05c5\7\37\2\2\u05c5\u05ca\5\u00aeX\2\u05c6\u05c7"+
		"\7\5\2\2\u05c7\u05c9\5\u00aeX\2\u05c8\u05c6\3\2\2\2\u05c9\u05cc\3\2\2"+
		"\2\u05ca\u05c8\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb\u05ce\3\2\2\2\u05cc\u05ca"+
		"\3\2\2\2\u05cd\u05c3\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05d9\3\2\2\2\u05cf"+
		"\u05d0\7\u00e3\2\2\u05d0\u05d1\7\37\2\2\u05d1\u05d6\5T+\2\u05d2\u05d3"+
		"\7\5\2\2\u05d3\u05d5\5T+\2\u05d4\u05d2\3\2\2\2\u05d5\u05d8\3\2\2\2\u05d6"+
		"\u05d4\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7\u05da\3\2\2\2\u05d8\u05d6\3\2"+
		"\2\2\u05d9\u05cf\3\2\2\2\u05d9\u05da\3\2\2\2\u05da\u05dc\3\2\2\2\u05db"+
		"\u05dd\5\u00e2r\2\u05dc\u05db\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd\u05e3"+
		"\3\2\2\2\u05de\u05e1\7\u0088\2\2\u05df\u05e2\7\17\2\2\u05e0\u05e2\5\u00ae"+
		"X\2\u05e1\u05df\3\2\2\2\u05e1\u05e0\3\2\2\2\u05e2\u05e4\3\2\2\2\u05e3"+
		"\u05de\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4M\3\2\2\2\u05e5\u05e6\5\"\22\2"+
		"\u05e6\u05e7\5X-\2\u05e7O\3\2\2\2\u05e8\u05e9\b)\1\2\u05e9\u05ea\5R*\2"+
		"\u05ea\u0602\3\2\2\2\u05eb\u05ec\f\5\2\2\u05ec\u05ed\6)\3\2\u05ed\u05ef"+
		"\t\16\2\2\u05ee\u05f0\5z>\2\u05ef\u05ee\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0"+
		"\u05f1\3\2\2\2\u05f1\u0601\5P)\6\u05f2\u05f3\f\4\2\2\u05f3\u05f4\6)\5"+
		"\2\u05f4\u05f6\7z\2\2\u05f5\u05f7\5z>\2\u05f6\u05f5\3\2\2\2\u05f6\u05f7"+
		"\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u0601\5P)\5\u05f9\u05fa\f\3\2\2\u05fa"+
		"\u05fb\6)\7\2\u05fb\u05fd\t\17\2\2\u05fc\u05fe\5z>\2\u05fd\u05fc\3\2\2"+
		"\2\u05fd\u05fe\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff\u0601\5P)\4\u0600\u05eb"+
		"\3\2\2\2\u0600\u05f2\3\2\2\2\u0600\u05f9\3\2\2\2\u0601\u0604\3\2\2\2\u0602"+
		"\u0600\3\2\2\2\u0602\u0603\3\2\2\2\u0603Q\3\2\2\2\u0604\u0602\3\2\2\2"+
		"\u0605\u060f\5Z.\2\u0606\u060f\5V,\2\u0607\u0608\7\u00ec\2\2\u0608\u060f"+
		"\5\u009eP\2\u0609\u060f\5\u0096L\2\u060a\u060b\7\3\2\2\u060b\u060c\5 "+
		"\21\2\u060c\u060d\7\4\2\2\u060d\u060f\3\2\2\2\u060e\u0605\3\2\2\2\u060e"+
		"\u0606\3\2\2\2\u060e\u0607\3\2\2\2\u060e\u0609\3\2\2\2\u060e\u060a\3\2"+
		"\2\2\u060fS\3\2\2\2\u0610\u0612\5\u00aeX\2\u0611\u0613\t\20\2\2\u0612"+
		"\u0611\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0616\3\2\2\2\u0614\u0615\7\u00a2"+
		"\2\2\u0615\u0617\t\21\2\2\u0616\u0614\3\2\2\2\u0616\u0617\3\2\2\2\u0617"+
		"U\3\2\2\2\u0618\u061a\5l\67\2\u0619\u061b\5X-\2\u061a\u0619\3\2\2\2\u061b"+
		"\u061c\3\2\2\2\u061c\u061a\3\2\2\2\u061c\u061d\3\2\2\2\u061dW\3\2\2\2"+
		"\u061e\u0620\5\\/\2\u061f\u0621\5d\63\2\u0620\u061f\3\2\2\2\u0620\u0621"+
		"\3\2\2\2\u0621\u0622\3\2\2\2\u0622\u0623\5L\'\2\u0623\u063a\3\2\2\2\u0624"+
		"\u0628\5^\60\2\u0625\u0627\5x=\2\u0626\u0625\3\2\2\2\u0627\u062a\3\2\2"+
		"\2\u0628\u0626\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u062c\3\2\2\2\u062a\u0628"+
		"\3\2\2\2\u062b\u062d\5d\63\2\u062c\u062b\3\2\2\2\u062c\u062d\3\2\2\2\u062d"+
		"\u062f\3\2\2\2\u062e\u0630\5n8\2\u062f\u062e\3\2\2\2\u062f\u0630\3\2\2"+
		"\2\u0630\u0632\3\2\2\2\u0631\u0633\5f\64\2\u0632\u0631\3\2\2\2\u0632\u0633"+
		"\3\2\2\2\u0633\u0635\3\2\2\2\u0634\u0636\5\u00e2r\2\u0635\u0634\3\2\2"+
		"\2\u0635\u0636\3\2\2\2\u0636\u0637\3\2\2\2\u0637\u0638\5L\'\2\u0638\u063a"+
		"\3\2\2\2\u0639\u061e\3\2\2\2\u0639\u0624\3\2\2\2\u063aY\3\2\2\2\u063b"+
		"\u063d\5\\/\2\u063c\u063e\5l\67\2\u063d\u063c\3\2\2\2\u063d\u063e\3\2"+
		"\2\2\u063e\u0640\3\2\2\2\u063f\u0641\5d\63\2\u0640\u063f\3\2\2\2\u0640"+
		"\u0641\3\2\2\2\u0641\u0659\3\2\2\2\u0642\u0644\5^\60\2\u0643\u0645\5l"+
		"\67\2\u0644\u0643\3\2\2\2\u0644\u0645\3\2\2\2\u0645\u0649\3\2\2\2\u0646"+
		"\u0648\5x=\2\u0647\u0646\3\2\2\2\u0648\u064b\3\2\2\2\u0649\u0647\3\2\2"+
		"\2\u0649\u064a\3\2\2\2\u064a\u064d\3\2\2\2\u064b\u0649\3\2\2\2\u064c\u064e"+
		"\5d\63\2\u064d\u064c\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u0650\3\2\2\2\u064f"+
		"\u0651\5n8\2\u0650\u064f\3\2\2\2\u0650\u0651\3\2\2\2\u0651\u0653\3\2\2"+
		"\2\u0652\u0654\5f\64\2\u0653\u0652\3\2\2\2\u0653\u0654\3\2\2\2\u0654\u0656"+
		"\3\2\2\2\u0655\u0657\5\u00e2r\2\u0656\u0655\3\2\2\2\u0656\u0657\3\2\2"+
		"\2\u0657\u0659\3\2\2\2\u0658\u063b\3\2\2\2\u0658\u0642\3\2\2\2\u0659["+
		"\3\2\2\2\u065a\u065b\7\u00d7\2\2\u065b\u065c\7\u00f8\2\2\u065c\u065d\7"+
		"\3\2\2\u065d\u065e\5\u00a6T\2\u065e\u065f\7\4\2\2\u065f\u0665\3\2\2\2"+
		"\u0660\u0661\7\u0092\2\2\u0661\u0665\5\u00a6T\2\u0662\u0663\7\u00c2\2"+
		"\2\u0663\u0665\5\u00a6T\2\u0664\u065a\3\2\2\2\u0664\u0660\3\2\2\2\u0664"+
		"\u0662\3\2\2\2\u0665\u0667\3\2\2\2\u0666\u0668\5\u009cO\2\u0667\u0666"+
		"\3\2\2\2\u0667\u0668\3\2\2\2\u0668\u066b\3\2\2\2\u0669\u066a\7\u00c0\2"+
		"\2\u066a\u066c\7\u0126\2\2\u066b\u0669\3\2\2\2\u066b\u066c\3\2\2\2\u066c"+
		"\u066d\3\2\2\2\u066d\u066e\7\u0108\2\2\u066e\u067b\7\u0126\2\2\u066f\u0679"+
		"\7\27\2\2\u0670\u067a\5\u008aF\2\u0671\u067a\5\u00d8m\2\u0672\u0675\7"+
		"\3\2\2\u0673\u0676\5\u008aF\2\u0674\u0676\5\u00d8m\2\u0675\u0673\3\2\2"+
		"\2\u0675\u0674\3\2\2\2\u0676\u0677\3\2\2\2\u0677\u0678\7\4\2\2\u0678\u067a"+
		"\3\2\2\2\u0679\u0670\3\2\2\2\u0679\u0671\3\2\2\2\u0679\u0672\3\2\2\2\u067a"+
		"\u067c\3\2\2\2\u067b\u066f\3\2\2\2\u067b\u067c\3\2\2\2\u067c\u067e\3\2"+
		"\2\2\u067d\u067f\5\u009cO\2\u067e\u067d\3\2\2\2\u067e\u067f\3\2\2\2\u067f"+
		"\u0682\3\2\2\2\u0680\u0681\7\u00bf\2\2\u0681\u0683\7\u0126\2\2\u0682\u0680"+
		"\3\2\2\2\u0682\u0683\3\2\2\2\u0683]\3\2\2\2\u0684\u0688\7\u00d7\2\2\u0685"+
		"\u0687\5h\65\2\u0686\u0685\3\2\2\2\u0687\u068a\3\2\2\2\u0688\u0686\3\2"+
		"\2\2\u0688\u0689\3\2\2\2\u0689\u068c\3\2\2\2\u068a\u0688\3\2\2\2\u068b"+
		"\u068d\5z>\2\u068c\u068b\3\2\2\2\u068c\u068d\3\2\2\2\u068d\u068e\3\2\2"+
		"\2\u068e\u068f\5\u00a6T\2\u068f_\3\2\2\2\u0690\u0691\7\u00dd\2\2\u0691"+
		"\u0696\5b\62\2\u0692\u0693\7\5\2\2\u0693\u0695\5b\62\2\u0694\u0692\3\2"+
		"\2\2\u0695\u0698\3\2\2\2\u0696\u0694\3\2\2\2\u0696\u0697\3\2\2\2\u0697"+
		"a\3\2\2\2\u0698\u0696\3\2\2\2\u0699\u069a\5\u009eP\2\u069a\u069b\7\u0113"+
		"\2\2\u069b\u069c\5\u00aeX\2\u069cc\3\2\2\2\u069d\u069e\7\u010e\2\2\u069e"+
		"\u069f\5\u00b0Y\2\u069fe\3\2\2\2\u06a0\u06a1\7m\2\2\u06a1\u06a2\5\u00b0"+
		"Y\2\u06a2g\3\2\2\2\u06a3\u06a4\7\7\2\2\u06a4\u06ab\5j\66\2\u06a5\u06a7"+
		"\7\5\2\2\u06a6\u06a5\3\2\2\2\u06a6\u06a7\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8"+
		"\u06aa\5j\66\2\u06a9\u06a6\3\2\2\2\u06aa\u06ad\3\2\2\2\u06ab\u06a9\3\2"+
		"\2\2\u06ab\u06ac\3\2\2\2\u06ac\u06ae\3\2\2\2\u06ad\u06ab\3\2\2\2\u06ae"+
		"\u06af\7\b\2\2\u06afi\3\2\2\2\u06b0\u06be\5\u00f4{\2\u06b1\u06b2\5\u00f4"+
		"{\2\u06b2\u06b3\7\3\2\2\u06b3\u06b8\5\u00b6\\\2\u06b4\u06b5\7\5\2\2\u06b5"+
		"\u06b7\5\u00b6\\\2\u06b6\u06b4\3\2\2\2\u06b7\u06ba\3\2\2\2\u06b8\u06b6"+
		"\3\2\2\2\u06b8\u06b9\3\2\2\2\u06b9\u06bb\3\2\2\2\u06ba\u06b8\3\2\2\2\u06bb"+
		"\u06bc\7\4\2\2\u06bc\u06be\3\2\2\2\u06bd\u06b0\3\2\2\2\u06bd\u06b1\3\2"+
		"\2\2\u06bek\3\2\2\2\u06bf\u06c0\7e\2\2\u06c0\u06c5\5|?\2\u06c1\u06c2\7"+
		"\5\2\2\u06c2\u06c4\5|?\2\u06c3\u06c1\3\2\2\2\u06c4\u06c7\3\2\2\2\u06c5"+
		"\u06c3\3\2\2\2\u06c5\u06c6\3\2\2\2\u06c6\u06cb\3\2\2\2\u06c7\u06c5\3\2"+
		"\2\2\u06c8\u06ca\5x=\2\u06c9\u06c8\3\2\2\2\u06ca\u06cd\3\2\2\2\u06cb\u06c9"+
		"\3\2\2\2\u06cb\u06cc\3\2\2\2\u06cc\u06cf\3\2\2\2\u06cd\u06cb\3\2\2\2\u06ce"+
		"\u06d0\5r:\2\u06cf\u06ce\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0m\3\2\2\2\u06d1"+
		"\u06d2\7k\2\2\u06d2\u06d3\7\37\2\2\u06d3\u06d8\5\u00aeX\2\u06d4\u06d5"+
		"\7\5\2\2\u06d5\u06d7\5\u00aeX\2\u06d6\u06d4\3\2\2\2\u06d7\u06da\3\2\2"+
		"\2\u06d8\u06d6\3\2\2\2\u06d8\u06d9\3\2\2\2\u06d9\u06ec\3\2\2\2\u06da\u06d8"+
		"\3\2\2\2\u06db\u06dc\7\u0110\2\2\u06dc\u06ed\7\u00d1\2\2\u06dd\u06de\7"+
		"\u0110\2\2\u06de\u06ed\78\2\2\u06df\u06e0\7l\2\2\u06e0\u06e1\7\u00df\2"+
		"\2\u06e1\u06e2\7\3\2\2\u06e2\u06e7\5p9\2\u06e3\u06e4\7\5\2\2\u06e4\u06e6"+
		"\5p9\2\u06e5\u06e3\3\2\2\2\u06e6\u06e9\3\2\2\2\u06e7\u06e5\3\2\2\2\u06e7"+
		"\u06e8\3\2\2\2\u06e8\u06ea\3\2\2\2\u06e9\u06e7\3\2\2\2\u06ea\u06eb\7\4"+
		"\2\2\u06eb\u06ed\3\2\2\2\u06ec\u06db\3\2\2\2\u06ec\u06dd\3\2\2\2\u06ec"+
		"\u06df\3\2\2\2\u06ec\u06ed\3\2\2\2\u06ed\u06fe\3\2\2\2\u06ee\u06ef\7k"+
		"\2\2\u06ef\u06f0\7\37\2\2\u06f0\u06f1\7l\2\2\u06f1\u06f2\7\u00df\2\2\u06f2"+
		"\u06f3\7\3\2\2\u06f3\u06f8\5p9\2\u06f4\u06f5\7\5\2\2\u06f5\u06f7\5p9\2"+
		"\u06f6\u06f4\3\2\2\2\u06f7\u06fa\3\2\2\2\u06f8\u06f6\3\2\2\2\u06f8\u06f9"+
		"\3\2\2\2\u06f9\u06fb\3\2\2\2\u06fa\u06f8\3\2\2\2\u06fb\u06fc\7\4\2\2\u06fc"+
		"\u06fe\3\2\2\2\u06fd\u06d1\3\2\2\2\u06fd\u06ee\3\2\2\2\u06feo\3\2\2\2"+
		"\u06ff\u0708\7\3\2\2\u0700\u0705\5\u00aeX\2\u0701\u0702\7\5\2\2\u0702"+
		"\u0704\5\u00aeX\2\u0703\u0701\3\2\2\2\u0704\u0707\3\2\2\2\u0705\u0703"+
		"\3\2\2\2\u0705\u0706\3\2\2\2\u0706\u0709\3\2\2\2\u0707\u0705\3\2\2\2\u0708"+
		"\u0700\3\2\2\2\u0708\u0709\3\2\2\2\u0709\u070a\3\2\2\2\u070a\u070d\7\4"+
		"\2\2\u070b\u070d\5\u00aeX\2\u070c\u06ff\3\2\2\2\u070c\u070b\3\2\2\2\u070d"+
		"q\3\2\2\2\u070e\u070f\7\u00b5\2\2\u070f\u0710\7\3\2\2\u0710\u0711\5\u00a6"+
		"T\2\u0711\u0712\7a\2\2\u0712\u0713\5t;\2\u0713\u0714\7s\2\2\u0714\u0715"+
		"\7\3\2\2\u0715\u071a\5v<\2\u0716\u0717\7\5\2\2\u0717\u0719\5v<\2\u0718"+
		"\u0716\3\2\2\2\u0719\u071c\3\2\2\2\u071a\u0718\3\2\2\2\u071a\u071b\3\2"+
		"\2\2\u071b\u071d\3\2\2\2\u071c\u071a\3\2\2\2\u071d\u071e\7\4\2\2\u071e"+
		"\u071f\7\4\2\2\u071fs\3\2\2\2\u0720\u072d\5\u00f4{\2\u0721\u0722\7\3\2"+
		"\2\u0722\u0727\5\u00f4{\2\u0723\u0724\7\5\2\2\u0724\u0726\5\u00f4{\2\u0725"+
		"\u0723\3\2\2\2\u0726\u0729\3\2\2\2\u0727\u0725\3\2\2\2\u0727\u0728\3\2"+
		"\2\2\u0728\u072a\3\2\2\2\u0729\u0727\3\2\2\2\u072a\u072b\7\4\2\2\u072b"+
		"\u072d\3\2\2\2\u072c\u0720\3\2\2\2\u072c\u0721\3\2\2\2\u072du\3\2\2\2"+
		"\u072e\u0733\5\u00aeX\2\u072f\u0731\7\27\2\2\u0730\u072f\3\2\2\2\u0730"+
		"\u0731\3\2\2\2\u0731\u0732\3\2\2\2\u0732\u0734\5\u00f4{\2\u0733\u0730"+
		"\3\2\2\2\u0733\u0734\3\2\2\2\u0734w\3\2\2\2\u0735\u0736\7\u0083\2\2\u0736"+
		"\u0738\7\u010a\2\2\u0737\u0739\7\u00ab\2\2\u0738\u0737\3\2\2\2\u0738\u0739"+
		"\3\2\2\2\u0739\u073a\3\2\2\2\u073a\u073b\5\u00eex\2\u073b\u0744\7\3\2"+
		"\2\u073c\u0741\5\u00aeX\2\u073d\u073e\7\5\2\2\u073e\u0740\5\u00aeX\2\u073f"+
		"\u073d\3\2\2\2\u0740\u0743\3\2\2\2\u0741\u073f\3\2\2\2\u0741\u0742\3\2"+
		"\2\2\u0742\u0745\3\2\2\2\u0743\u0741\3\2\2\2\u0744\u073c\3\2\2\2\u0744"+
		"\u0745\3\2\2\2\u0745\u0746\3\2\2\2\u0746\u0747\7\4\2\2\u0747\u0753\5\u00f4"+
		"{\2\u0748\u074a\7\27\2\2\u0749\u0748\3\2\2\2\u0749\u074a\3\2\2\2\u074a"+
		"\u074b\3\2\2\2\u074b\u0750\5\u00f4{\2\u074c\u074d\7\5\2\2\u074d\u074f"+
		"\5\u00f4{\2\u074e\u074c\3\2\2\2\u074f\u0752\3\2\2\2\u0750\u074e\3\2\2"+
		"\2\u0750\u0751\3\2\2\2\u0751\u0754\3\2\2\2\u0752\u0750\3\2\2\2\u0753\u0749"+
		"\3\2\2\2\u0753\u0754\3\2\2\2\u0754y\3\2\2\2\u0755\u0756\t\22\2\2\u0756"+
		"{\3\2\2\2\u0757\u075b\5\u0094K\2\u0758\u075a\5~@\2\u0759\u0758\3\2\2\2"+
		"\u075a\u075d\3\2\2\2\u075b\u0759\3\2\2\2\u075b\u075c\3\2\2\2\u075c}\3"+
		"\2\2\2\u075d\u075b\3\2\2\2\u075e\u075f\5\u0080A\2\u075f\u0760\7\177\2"+
		"\2\u0760\u0762\5\u0094K\2\u0761\u0763\5\u0082B\2\u0762\u0761\3\2\2\2\u0762"+
		"\u0763\3\2\2\2\u0763\u076a\3\2\2\2\u0764\u0765\7\u009e\2\2\u0765\u0766"+
		"\5\u0080A\2\u0766\u0767\7\177\2\2\u0767\u0768\5\u0094K\2\u0768\u076a\3"+
		"\2\2\2\u0769\u075e\3\2\2\2\u0769\u0764\3\2\2\2\u076a\177\3\2\2\2\u076b"+
		"\u076d\7v\2\2\u076c\u076b\3\2\2\2\u076c\u076d\3\2\2\2\u076d\u0784\3\2"+
		"\2\2\u076e\u0784\7\67\2\2\u076f\u0771\7\u0086\2\2\u0770\u0772\7\u00ab"+
		"\2\2\u0771\u0770\3\2\2\2\u0771\u0772\3\2\2\2\u0772\u0784\3\2\2\2\u0773"+
		"\u0775\7\u0086\2\2\u0774\u0773\3\2\2\2\u0774\u0775\3\2\2\2\u0775\u0776"+
		"\3\2\2\2\u0776\u0784\7\u00d8\2\2\u0777\u0779\7\u00cc\2\2\u0778\u077a\7"+
		"\u00ab\2\2\u0779\u0778\3\2\2\2\u0779\u077a\3\2\2\2\u077a\u0784\3\2\2\2"+
		"\u077b\u077d\7f\2\2\u077c\u077e\7\u00ab\2\2\u077d\u077c\3\2\2\2\u077d"+
		"\u077e\3\2\2\2\u077e\u0784\3\2\2\2\u077f\u0781\7\u0086\2\2\u0780\u077f"+
		"\3\2\2\2\u0780\u0781\3\2\2\2\u0781\u0782\3\2\2\2\u0782\u0784\7\23\2\2"+
		"\u0783\u076c\3\2\2\2\u0783\u076e\3\2\2\2\u0783\u076f\3\2\2\2\u0783\u0774"+
		"\3\2\2\2\u0783\u0777\3\2\2\2\u0783\u077b\3\2\2\2\u0783\u0780\3\2\2\2\u0784"+
		"\u0081\3\2\2\2\u0785\u0786\7\u00a4\2\2\u0786\u078a\5\u00b0Y\2\u0787\u0788"+
		"\7\u0108\2\2\u0788\u078a\5\u0088E\2\u0789\u0785\3\2\2\2\u0789\u0787\3"+
		"\2\2\2\u078a\u0083\3\2\2\2\u078b\u078c\7\u00ee\2\2\u078c\u078e\7\3\2\2"+
		"\u078d\u078f\5\u0086D\2\u078e\u078d\3\2\2\2\u078e\u078f\3\2\2\2\u078f"+
		"\u0790\3\2\2\2\u0790\u0791\7\4\2\2\u0791\u0085\3\2\2\2\u0792\u0794\7\u011c"+
		"\2\2\u0793\u0792\3\2\2\2\u0793\u0794\3\2\2\2\u0794\u0795\3\2\2\2\u0795"+
		"\u0796\t\23\2\2\u0796\u07ab\7\u00b4\2\2\u0797\u0798\5\u00aeX\2\u0798\u0799"+
		"\7\u00d3\2\2\u0799\u07ab\3\2\2\2\u079a\u079b\7\35\2\2\u079b\u079c\7\u012a"+
		"\2\2\u079c\u079d\7\u00aa\2\2\u079d\u079e\7\u00a3\2\2\u079e\u07a7\7\u012a"+
		"\2\2\u079f\u07a5\7\u00a4\2\2\u07a0\u07a6\5\u00f4{\2\u07a1\u07a2\5\u00ee"+
		"x\2\u07a2\u07a3\7\3\2\2\u07a3\u07a4\7\4\2\2\u07a4\u07a6\3\2\2\2\u07a5"+
		"\u07a0\3\2\2\2\u07a5\u07a1\3\2\2\2\u07a6\u07a8\3\2\2\2\u07a7\u079f\3\2"+
		"\2\2\u07a7\u07a8\3\2\2\2\u07a8\u07ab\3\2\2\2\u07a9\u07ab\5\u00aeX\2\u07aa"+
		"\u0793\3\2\2\2\u07aa\u0797\3\2\2\2\u07aa\u079a\3\2\2\2\u07aa\u07a9\3\2"+
		"\2\2\u07ab\u0087\3\2\2\2\u07ac\u07ad\7\3\2\2\u07ad\u07ae\5\u008aF\2\u07ae"+
		"\u07af\7\4\2\2\u07af\u0089\3\2\2\2\u07b0\u07b5\5\u00f0y\2\u07b1\u07b2"+
		"\7\5\2\2\u07b2\u07b4\5\u00f0y\2\u07b3\u07b1\3\2\2\2\u07b4\u07b7\3\2\2"+
		"\2\u07b5\u07b3\3\2\2\2\u07b5\u07b6\3\2\2\2\u07b6\u008b\3\2\2\2\u07b7\u07b5"+
		"\3\2\2\2\u07b8\u07b9\7\3\2\2\u07b9\u07be\5\u008eH\2\u07ba\u07bb\7\5\2"+
		"\2\u07bb\u07bd\5\u008eH\2\u07bc\u07ba\3\2\2\2\u07bd\u07c0\3\2\2\2\u07be"+
		"\u07bc\3\2\2\2\u07be\u07bf\3\2\2\2\u07bf\u07c1\3\2\2\2\u07c0\u07be\3\2"+
		"\2\2\u07c1\u07c2\7\4\2\2\u07c2\u008d\3\2\2\2\u07c3\u07c5\5\u00f0y\2\u07c4"+
		"\u07c6\t\20\2\2\u07c5\u07c4\3\2\2\2\u07c5\u07c6\3\2\2\2\u07c6\u008f\3"+
		"\2\2\2\u07c7\u07c8\7\3\2\2\u07c8\u07cd\5\u0092J\2\u07c9\u07ca\7\5\2\2"+
		"\u07ca\u07cc\5\u0092J\2\u07cb\u07c9\3\2\2\2\u07cc\u07cf\3\2\2\2\u07cd"+
		"\u07cb\3\2\2\2\u07cd\u07ce\3\2\2\2\u07ce\u07d0\3\2\2\2\u07cf\u07cd\3\2"+
		"\2\2\u07d0\u07d1\7\4\2\2\u07d1\u0091\3\2\2\2\u07d2\u07d5\5\u00f4{\2\u07d3"+
		"\u07d4\7.\2\2\u07d4\u07d6\7\u0126\2\2\u07d5\u07d3\3\2\2\2\u07d5\u07d6"+
		"\3\2\2\2\u07d6\u0093\3\2\2\2\u07d7\u07d9\5\u009eP\2\u07d8\u07da\5\u0084"+
		"C\2\u07d9\u07d8\3\2\2\2\u07d9\u07da\3\2\2\2\u07da\u07db\3\2\2\2\u07db"+
		"\u07dc\5\u009aN\2\u07dc\u07f0\3\2\2\2\u07dd\u07de\7\3\2\2\u07de\u07df"+
		"\5 \21\2\u07df\u07e1\7\4\2\2\u07e0\u07e2\5\u0084C\2\u07e1\u07e0\3\2\2"+
		"\2\u07e1\u07e2\3\2\2\2\u07e2\u07e3\3\2\2\2\u07e3\u07e4\5\u009aN\2\u07e4"+
		"\u07f0\3\2\2\2\u07e5\u07e6\7\3\2\2\u07e6\u07e7\5|?\2\u07e7\u07e9\7\4\2"+
		"\2\u07e8\u07ea\5\u0084C\2\u07e9\u07e8\3\2\2\2\u07e9\u07ea\3\2\2\2\u07ea"+
		"\u07eb\3\2\2\2\u07eb\u07ec\5\u009aN\2\u07ec\u07f0\3\2\2\2\u07ed\u07f0"+
		"\5\u0096L\2\u07ee\u07f0\5\u0098M\2\u07ef\u07d7\3\2\2\2\u07ef\u07dd\3\2"+
		"\2\2\u07ef\u07e5\3\2\2\2\u07ef\u07ed\3\2\2\2\u07ef\u07ee\3\2\2\2\u07f0"+
		"\u0095\3\2\2\2\u07f1\u07f2\7\u0109\2\2\u07f2\u07f7\5\u00aeX\2\u07f3\u07f4"+
		"\7\5\2\2\u07f4\u07f6\5\u00aeX\2\u07f5\u07f3\3\2\2\2\u07f6\u07f9\3\2\2"+
		"\2\u07f7\u07f5\3\2\2\2\u07f7\u07f8\3\2\2\2\u07f8\u07fa\3\2\2\2\u07f9\u07f7"+
		"\3\2\2\2\u07fa\u07fb\5\u009aN\2\u07fb\u0097\3\2\2\2\u07fc\u07fd\5\u00f0"+
		"y\2\u07fd\u0806\7\3\2\2\u07fe\u0803\5\u00aeX\2\u07ff\u0800\7\5\2\2\u0800"+
		"\u0802\5\u00aeX\2\u0801\u07ff\3\2\2\2\u0802\u0805\3\2\2\2\u0803\u0801"+
		"\3\2\2\2\u0803\u0804\3\2\2\2\u0804\u0807\3\2\2\2\u0805\u0803\3\2\2\2\u0806"+
		"\u07fe\3\2\2\2\u0806\u0807\3\2\2\2\u0807\u0808\3\2\2\2\u0808\u0809\7\4"+
		"\2\2\u0809\u080a\5\u009aN\2\u080a\u0099\3\2\2\2\u080b\u080d\7\27\2\2\u080c"+
		"\u080b\3\2\2\2\u080c\u080d\3\2\2\2\u080d\u080e\3\2\2\2\u080e\u0810\5\u00f6"+
		"|\2\u080f\u0811\5\u0088E\2\u0810\u080f\3\2\2\2\u0810\u0811\3\2\2\2\u0811"+
		"\u0813\3\2\2\2\u0812\u080c\3\2\2\2\u0812\u0813\3\2\2\2\u0813\u009b\3\2"+
		"\2\2\u0814\u0815\7\u00d2\2\2\u0815\u0816\7c\2\2\u0816\u0817\7\u00da\2"+
		"\2\u0817\u081b\7\u0126\2\2\u0818\u0819\7\u0110\2\2\u0819\u081a\7\u00db"+
		"\2\2\u081a\u081c\5\66\34\2\u081b\u0818\3\2\2\2\u081b\u081c\3\2\2\2\u081c"+
		"\u0846\3\2\2\2\u081d\u081e\7\u00d2\2\2\u081e\u081f\7c\2\2\u081f\u0829"+
		"\7F\2\2\u0820\u0821\7\\\2\2\u0821\u0822\7\u00f1\2\2\u0822\u0823\7\37\2"+
		"\2\u0823\u0827\7\u0126\2\2\u0824\u0825\7Q\2\2\u0825\u0826\7\37\2\2\u0826"+
		"\u0828\7\u0126\2\2\u0827\u0824\3\2\2\2\u0827\u0828\3\2\2\2\u0828\u082a"+
		"\3\2\2\2\u0829\u0820\3\2\2\2\u0829\u082a\3\2\2\2\u082a\u0830\3\2\2\2\u082b"+
		"\u082c\7+\2\2\u082c\u082d\7~\2\2\u082d\u082e\7\u00f1\2\2\u082e\u082f\7"+
		"\37\2\2\u082f\u0831\7\u0126\2\2\u0830\u082b\3\2\2\2\u0830\u0831\3\2\2"+
		"\2\u0831\u0837\3\2\2\2\u0832\u0833\7\u0092\2\2\u0833\u0834\7\u0080\2\2"+
		"\u0834\u0835\7\u00f1\2\2\u0835\u0836\7\37\2\2\u0836\u0838\7\u0126\2\2"+
		"\u0837\u0832\3\2\2\2\u0837\u0838\3\2\2\2\u0838\u083d\3\2\2\2\u0839\u083a"+
		"\7\u0089\2\2\u083a\u083b\7\u00f1\2\2\u083b\u083c\7\37\2\2\u083c\u083e"+
		"\7\u0126\2\2\u083d\u0839\3\2\2\2\u083d\u083e\3\2\2\2\u083e\u0843\3\2\2"+
		"\2\u083f\u0840\7\u00a1\2\2\u0840\u0841\7D\2\2\u0841\u0842\7\27\2\2\u0842"+
		"\u0844\7\u0126\2\2\u0843\u083f\3\2\2\2\u0843\u0844\3\2\2\2\u0844\u0846"+
		"\3\2\2\2\u0845\u0814\3\2\2\2\u0845\u081d\3\2\2\2\u0846\u009d\3\2\2\2\u0847"+
		"\u084c\5\u00f0y\2\u0848\u0849\7\6\2\2\u0849\u084b\5\u00f0y\2\u084a\u0848"+
		"\3\2\2\2\u084b\u084e\3\2\2\2\u084c\u084a\3\2\2\2\u084c\u084d\3\2\2\2\u084d"+
		"\u009f\3\2\2\2\u084e\u084c\3\2\2\2\u084f\u0850\5\u00f0y\2\u0850\u0851"+
		"\7\6\2\2\u0851\u0853\3\2\2\2\u0852\u084f\3\2\2\2\u0852\u0853\3\2\2\2\u0853"+
		"\u0854\3\2\2\2\u0854\u0855\5\u00f0y\2\u0855\u00a1\3\2\2\2\u0856\u0857"+
		"\5\u00f0y\2\u0857\u0858\7\6\2\2\u0858\u085a\3\2\2\2\u0859\u0856\3\2\2"+
		"\2\u0859\u085a\3\2\2\2\u085a\u085b\3\2\2\2\u085b\u085c\5\u00f0y\2\u085c"+
		"\u00a3\3\2\2\2\u085d\u0865\5\u00aeX\2\u085e\u0860\7\27\2\2\u085f\u085e"+
		"\3\2\2\2\u085f\u0860\3\2\2\2\u0860\u0863\3\2\2\2\u0861\u0864\5\u00f0y"+
		"\2\u0862\u0864\5\u0088E\2\u0863\u0861\3\2\2\2\u0863\u0862\3\2\2\2\u0864"+
		"\u0866\3\2\2\2\u0865\u085f\3\2\2\2\u0865\u0866\3\2\2\2\u0866\u00a5\3\2"+
		"\2\2\u0867\u086c\5\u00a4S\2\u0868\u0869\7\5\2\2\u0869\u086b\5\u00a4S\2"+
		"\u086a\u0868\3\2\2\2\u086b\u086e\3\2\2\2\u086c\u086a\3\2\2\2\u086c\u086d"+
		"\3\2\2\2\u086d\u00a7\3\2\2\2\u086e\u086c\3\2\2\2\u086f\u0870\7\3\2\2\u0870"+
		"\u0875\5\u00aaV\2\u0871\u0872\7\5\2\2\u0872\u0874\5\u00aaV\2\u0873\u0871"+
		"\3\2\2\2\u0874\u0877\3\2\2\2\u0875\u0873\3\2\2\2\u0875\u0876\3\2\2\2\u0876"+
		"\u0878\3\2\2\2\u0877\u0875\3\2\2\2\u0878\u0879\7\4\2\2\u0879\u00a9\3\2"+
		"\2\2\u087a\u0888\5\u00eex\2\u087b\u087c\5\u00f4{\2\u087c\u087d\7\3\2\2"+
		"\u087d\u0882\5\u00acW\2\u087e\u087f\7\5\2\2\u087f\u0881\5\u00acW\2\u0880"+
		"\u087e\3\2\2\2\u0881\u0884\3\2\2\2\u0882\u0880\3\2\2\2\u0882\u0883\3\2"+
		"\2\2\u0883\u0885\3\2\2\2\u0884\u0882\3\2\2\2\u0885\u0886\7\4\2\2\u0886"+
		"\u0888\3\2\2\2\u0887\u087a\3\2\2\2\u0887\u087b\3\2\2\2\u0888\u00ab\3\2"+
		"\2\2\u0889\u088c\5\u00eex\2\u088a\u088c\5\u00b8]\2\u088b\u0889\3\2\2\2"+
		"\u088b\u088a\3\2\2\2\u088c\u00ad\3\2\2\2\u088d\u088e\5\u00b0Y\2\u088e"+
		"\u00af\3\2\2\2\u088f\u0890\bY\1\2\u0890\u0891\7\u00a0\2\2\u0891\u089c"+
		"\5\u00b0Y\7\u0892\u0893\7T\2\2\u0893\u0894\7\3\2\2\u0894\u0895\5 \21\2"+
		"\u0895\u0896\7\4\2\2\u0896\u089c\3\2\2\2\u0897\u0899\5\u00b4[\2\u0898"+
		"\u089a\5\u00b2Z\2\u0899\u0898\3\2\2\2\u0899\u089a\3\2\2\2\u089a\u089c"+
		"\3\2\2\2\u089b\u088f\3\2\2\2\u089b\u0892\3\2\2\2\u089b\u0897\3\2\2\2\u089c"+
		"\u08a5\3\2\2\2\u089d\u089e\f\4\2\2\u089e\u089f\7\22\2\2\u089f\u08a4\5"+
		"\u00b0Y\5\u08a0\u08a1\f\3\2\2\u08a1\u08a2\7\u00a8\2\2\u08a2\u08a4\5\u00b0"+
		"Y\4\u08a3\u089d\3\2\2\2\u08a3\u08a0\3\2\2\2\u08a4\u08a7\3\2\2\2\u08a5"+
		"\u08a3\3\2\2\2\u08a5\u08a6\3\2\2\2\u08a6\u00b1\3\2\2\2\u08a7\u08a5\3\2"+
		"\2\2\u08a8\u08aa\7\u00a0\2\2\u08a9\u08a8\3\2\2\2\u08a9\u08aa\3\2\2\2\u08aa"+
		"\u08ab\3\2\2\2\u08ab\u08ac\7\33\2\2\u08ac\u08ad\5\u00b4[\2\u08ad\u08ae"+
		"\7\22\2\2\u08ae\u08af\5\u00b4[\2\u08af";
	private static final String _serializedATNSegment1 =
		"\u08de\3\2\2\2\u08b0\u08b2\7\u00a0\2\2\u08b1\u08b0\3\2\2\2\u08b1\u08b2"+
		"\3\2\2\2\u08b2\u08b3\3\2\2\2\u08b3\u08b4\7s\2\2\u08b4\u08b5\7\3\2\2\u08b5"+
		"\u08ba\5\u00aeX\2\u08b6\u08b7\7\5\2\2\u08b7\u08b9\5\u00aeX\2\u08b8\u08b6"+
		"\3\2\2\2\u08b9\u08bc\3\2\2\2\u08ba\u08b8\3\2\2\2\u08ba\u08bb\3\2\2\2\u08bb"+
		"\u08bd\3\2\2\2\u08bc\u08ba\3\2\2\2\u08bd\u08be\7\4\2\2\u08be\u08de\3\2"+
		"\2\2\u08bf\u08c1\7\u00a0\2\2\u08c0\u08bf\3\2\2\2\u08c0\u08c1\3\2\2\2\u08c1"+
		"\u08c2\3\2\2\2\u08c2\u08c3\7s\2\2\u08c3\u08c4\7\3\2\2\u08c4\u08c5\5 \21"+
		"\2\u08c5\u08c6\7\4\2\2\u08c6\u08de\3\2\2\2\u08c7\u08c9\7\u00a0\2\2\u08c8"+
		"\u08c7\3\2\2\2\u08c8\u08c9\3\2\2\2\u08c9\u08ca\3\2\2\2\u08ca\u08cb\t\24"+
		"\2\2\u08cb\u08de\5\u00b4[\2\u08cc\u08ce\7}\2\2\u08cd\u08cf\7\u00a0\2\2"+
		"\u08ce\u08cd\3\2\2\2\u08ce\u08cf\3\2\2\2\u08cf\u08d0\3\2\2\2\u08d0\u08de"+
		"\7\u00a1\2\2\u08d1\u08d3\7}\2\2\u08d2\u08d4\7\u00a0\2\2\u08d3\u08d2\3"+
		"\2\2\2\u08d3\u08d4\3\2\2\2\u08d4\u08d5\3\2\2\2\u08d5\u08de\t\25\2\2\u08d6"+
		"\u08d8\7}\2\2\u08d7\u08d9\7\u00a0\2\2\u08d8\u08d7\3\2\2\2\u08d8\u08d9"+
		"\3\2\2\2\u08d9\u08da\3\2\2\2\u08da\u08db\7L\2\2\u08db\u08dc\7e\2\2\u08dc"+
		"\u08de\5\u00b4[\2\u08dd\u08a9\3\2\2\2\u08dd\u08b1\3\2\2\2\u08dd\u08c0"+
		"\3\2\2\2\u08dd\u08c8\3\2\2\2\u08dd\u08cc\3\2\2\2\u08dd\u08d1\3\2\2\2\u08dd"+
		"\u08d6\3\2\2\2\u08de\u00b3\3\2\2\2\u08df\u08e0\b[\1\2\u08e0\u08e4\5\u00b6"+
		"\\\2\u08e1\u08e2\t\26\2\2\u08e2\u08e4\5\u00b4[\t\u08e3\u08df\3\2\2\2\u08e3"+
		"\u08e1\3\2\2\2\u08e4\u08fa\3\2\2\2\u08e5\u08e6\f\b\2\2\u08e6\u08e7\t\27"+
		"\2\2\u08e7\u08f9\5\u00b4[\t\u08e8\u08e9\f\7\2\2\u08e9\u08ea\t\30\2\2\u08ea"+
		"\u08f9\5\u00b4[\b\u08eb\u08ec\f\6\2\2\u08ec\u08ed\7\u0122\2\2\u08ed\u08f9"+
		"\5\u00b4[\7\u08ee\u08ef\f\5\2\2\u08ef\u08f0\7\u0125\2\2\u08f0\u08f9\5"+
		"\u00b4[\6\u08f1\u08f2\f\4\2\2\u08f2\u08f3\7\u0123\2\2\u08f3\u08f9\5\u00b4"+
		"[\5\u08f4\u08f5\f\3\2\2\u08f5\u08f6\5\u00ba^\2\u08f6\u08f7\5\u00b4[\4"+
		"\u08f7\u08f9\3\2\2\2\u08f8\u08e5\3\2\2\2\u08f8\u08e8\3\2\2\2\u08f8\u08eb"+
		"\3\2\2\2\u08f8\u08ee\3\2\2\2\u08f8\u08f1\3\2\2\2\u08f8\u08f4\3\2\2\2\u08f9"+
		"\u08fc\3\2\2\2\u08fa\u08f8\3\2\2\2\u08fa\u08fb\3\2\2\2\u08fb\u00b5\3\2"+
		"\2\2\u08fc\u08fa\3\2\2\2\u08fd\u08fe\b\\\1\2\u08fe\u09ac\t\31\2\2\u08ff"+
		"\u0901\7\"\2\2\u0900\u0902\5\u00e0q\2\u0901\u0900\3\2\2\2\u0902\u0903"+
		"\3\2\2\2\u0903\u0901\3\2\2\2\u0903\u0904\3\2\2\2\u0904\u0907\3\2\2\2\u0905"+
		"\u0906\7O\2\2\u0906\u0908\5\u00aeX\2\u0907\u0905\3\2\2\2\u0907\u0908\3"+
		"\2\2\2\u0908\u0909\3\2\2\2\u0909\u090a\7P\2\2\u090a\u09ac\3\2\2\2\u090b"+
		"\u090c\7\"\2\2\u090c\u090e\5\u00aeX\2\u090d\u090f\5\u00e0q\2\u090e\u090d"+
		"\3\2\2\2\u090f\u0910\3\2\2\2\u0910\u090e\3\2\2\2\u0910\u0911\3\2\2\2\u0911"+
		"\u0914\3\2\2\2\u0912\u0913\7O\2\2\u0913\u0915\5\u00aeX\2\u0914\u0912\3"+
		"\2\2\2\u0914\u0915\3\2\2\2\u0915\u0916\3\2\2\2\u0916\u0917\7P\2\2\u0917"+
		"\u09ac\3\2\2\2\u0918\u0919\7#\2\2\u0919\u091a\7\3\2\2\u091a\u091b\5\u00ae"+
		"X\2\u091b\u091c\7\27\2\2\u091c\u091d\5\u00d2j\2\u091d\u091e\7\4\2\2\u091e"+
		"\u09ac\3\2\2\2\u091f\u0920\7\u00e9\2\2\u0920\u0929\7\3\2\2\u0921\u0926"+
		"\5\u00a4S\2\u0922\u0923\7\5\2\2\u0923\u0925\5\u00a4S\2\u0924\u0922\3\2"+
		"\2\2\u0925\u0928\3\2\2\2\u0926\u0924\3\2\2\2\u0926\u0927\3\2\2\2\u0927"+
		"\u092a\3\2\2\2\u0928\u0926\3\2\2\2\u0929\u0921\3\2\2\2\u0929\u092a\3\2"+
		"\2\2\u092a\u092b\3\2\2\2\u092b\u09ac\7\4\2\2\u092c\u092d\t\32\2\2\u092d"+
		"\u092e\7\3\2\2\u092e\u0931\5\u00aeX\2\u092f\u0930\t\33\2\2\u0930\u0932"+
		"\7\u00a2\2\2\u0931\u092f\3\2\2\2\u0931\u0932\3\2\2\2\u0932\u0933\3\2\2"+
		"\2\u0933\u0934\7\4\2\2\u0934\u09ac\3\2\2\2\u0935\u0936\t\34\2\2\u0936"+
		"\u0937\7\3\2\2\u0937\u093a\5\u00aeX\2\u0938\u0939\t\33\2\2\u0939\u093b"+
		"\7\u00a2\2\2\u093a\u0938\3\2\2\2\u093a\u093b\3\2\2\2\u093b\u093c\3\2\2"+
		"\2\u093c\u093d\7\4\2\2\u093d\u09ac\3\2\2\2\u093e\u093f\7\u00b7\2\2\u093f"+
		"\u0940\7\3\2\2\u0940\u0941\5\u00b4[\2\u0941\u0942\7s\2\2\u0942\u0943\5"+
		"\u00b4[\2\u0943\u0944\7\4\2\2\u0944\u09ac\3\2\2\2\u0945\u09ac\5\u00b8"+
		"]\2\u0946\u09ac\7\u011d\2\2\u0947\u0948\5\u00eex\2\u0948\u0949\7\6\2\2"+
		"\u0949\u094a\7\u011d\2\2\u094a\u09ac\3\2\2\2\u094b\u094c\7\3\2\2\u094c"+
		"\u094f\5\u00a4S\2\u094d\u094e\7\5\2\2\u094e\u0950\5\u00a4S\2\u094f\u094d"+
		"\3\2\2\2\u0950\u0951\3\2\2\2\u0951\u094f\3\2\2\2\u0951\u0952\3\2\2\2\u0952"+
		"\u0953\3\2\2\2\u0953\u0954\7\4\2\2\u0954\u09ac\3\2\2\2\u0955\u0956\7\3"+
		"\2\2\u0956\u0957\5 \21\2\u0957\u0958\7\4\2\2\u0958\u09ac\3\2\2\2\u0959"+
		"\u095a\5\u00eex\2\u095a\u0966\7\3\2\2\u095b\u095d\5z>\2\u095c\u095b\3"+
		"\2\2\2\u095c\u095d\3\2\2\2\u095d\u095e\3\2\2\2\u095e\u0963\5\u00aeX\2"+
		"\u095f\u0960\7\5\2\2\u0960\u0962\5\u00aeX\2\u0961\u095f\3\2\2\2\u0962"+
		"\u0965\3\2\2\2\u0963\u0961\3\2\2\2\u0963\u0964\3\2\2\2\u0964\u0967\3\2"+
		"\2\2\u0965\u0963\3\2\2\2\u0966\u095c\3\2\2\2\u0966\u0967\3\2\2\2\u0967"+
		"\u0968\3\2\2\2\u0968\u096b\7\4\2\2\u0969\u096a\7\u00ad\2\2\u096a\u096c"+
		"\5\u00e6t\2\u096b\u0969\3\2\2\2\u096b\u096c\3\2\2\2\u096c\u09ac\3\2\2"+
		"\2\u096d\u096e\7\u012e\2\2\u096e\u096f\7\t\2\2\u096f\u09ac\5\u00aeX\2"+
		"\u0970\u0971\7\3\2\2\u0971\u0974\7\u012e\2\2\u0972\u0973\7\5\2\2\u0973"+
		"\u0975\7\u012e\2\2\u0974\u0972\3\2\2\2\u0975\u0976\3\2\2\2\u0976\u0974"+
		"\3\2\2\2\u0976\u0977\3\2\2\2\u0977\u0978\3\2\2\2\u0978\u0979\7\4\2\2\u0979"+
		"\u097a\7\t\2\2\u097a\u09ac\5\u00aeX\2\u097b\u09ac\5\u00f4{\2\u097c\u097d"+
		"\7\3\2\2\u097d\u097e\5\u00aeX\2\u097e\u097f\7\4\2\2\u097f\u09ac\3\2\2"+
		"\2\u0980\u0981\7Y\2\2\u0981\u0982\7\3\2\2\u0982\u0983\5\u00f4{\2\u0983"+
		"\u0984\7e\2\2\u0984\u0985\5\u00b4[\2\u0985\u0986\7\4\2\2\u0986\u09ac\3"+
		"\2\2\2\u0987\u0988\t\35\2\2\u0988\u0989\7\3\2\2\u0989\u098a\5\u00b4[\2"+
		"\u098a\u098b\t\36\2\2\u098b\u098e\5\u00b4[\2\u098c\u098d\t\37\2\2\u098d"+
		"\u098f\5\u00b4[\2\u098e\u098c\3\2\2\2\u098e\u098f\3\2\2\2\u098f\u0990"+
		"\3\2\2\2\u0990\u0991\7\4\2\2\u0991\u09ac\3\2\2\2\u0992\u0993\7\u00f9\2"+
		"\2\u0993\u0995\7\3\2\2\u0994\u0996\t \2\2\u0995\u0994\3\2\2\2\u0995\u0996"+
		"\3\2\2\2\u0996\u0998\3\2\2\2\u0997\u0999\5\u00b4[\2\u0998\u0997\3\2\2"+
		"\2\u0998\u0999\3\2\2\2\u0999\u099a\3\2\2\2\u099a\u099b\7e\2\2\u099b\u099c"+
		"\5\u00b4[\2\u099c\u099d\7\4\2\2\u099d\u09ac\3\2\2\2\u099e\u099f\7\u00af"+
		"\2\2\u099f\u09a0\7\3\2\2\u09a0\u09a1\5\u00b4[\2\u09a1\u09a2\7\u00b6\2"+
		"\2\u09a2\u09a3\5\u00b4[\2\u09a3\u09a4\7e\2\2\u09a4\u09a7\5\u00b4[\2\u09a5"+
		"\u09a6\7a\2\2\u09a6\u09a8\5\u00b4[\2\u09a7\u09a5\3\2\2\2\u09a7\u09a8\3"+
		"\2\2\2\u09a8\u09a9\3\2\2\2\u09a9\u09aa\7\4\2\2\u09aa\u09ac\3\2\2\2\u09ab"+
		"\u08fd\3\2\2\2\u09ab\u08ff\3\2\2\2\u09ab\u090b\3\2\2\2\u09ab\u0918\3\2"+
		"\2\2\u09ab\u091f\3\2\2\2\u09ab\u092c\3\2\2\2\u09ab\u0935\3\2\2\2\u09ab"+
		"\u093e\3\2\2\2\u09ab\u0945\3\2\2\2\u09ab\u0946\3\2\2\2\u09ab\u0947\3\2"+
		"\2\2\u09ab\u094b\3\2\2\2\u09ab\u0955\3\2\2\2\u09ab\u0959\3\2\2\2\u09ab"+
		"\u096d\3\2\2\2\u09ab\u0970\3\2\2\2\u09ab\u097b\3\2\2\2\u09ab\u097c\3\2"+
		"\2\2\u09ab\u0980\3\2\2\2\u09ab\u0987\3\2\2\2\u09ab\u0992\3\2\2\2\u09ab"+
		"\u099e\3\2\2\2\u09ac\u09b7\3\2\2\2\u09ad\u09ae\f\n\2\2\u09ae\u09af\7\n"+
		"\2\2\u09af\u09b0\5\u00b4[\2\u09b0\u09b1\7\13\2\2\u09b1\u09b6\3\2\2\2\u09b2"+
		"\u09b3\f\b\2\2\u09b3\u09b4\7\6\2\2\u09b4\u09b6\5\u00f4{\2\u09b5\u09ad"+
		"\3\2\2\2\u09b5\u09b2\3\2\2\2\u09b6\u09b9\3\2\2\2\u09b7\u09b5\3\2\2\2\u09b7"+
		"\u09b8\3\2\2\2\u09b8\u00b7\3\2\2\2\u09b9\u09b7\3\2\2\2\u09ba\u09c7\7\u00a1"+
		"\2\2\u09bb\u09c7\5\u00c2b\2\u09bc\u09bd\5\u00f4{\2\u09bd\u09be\7\u0126"+
		"\2\2\u09be\u09c7\3\2\2\2\u09bf\u09c7\5\u00fa~\2\u09c0\u09c7\5\u00c0a\2"+
		"\u09c1\u09c3\7\u0126\2\2\u09c2\u09c1\3\2\2\2\u09c3\u09c4\3\2\2\2\u09c4"+
		"\u09c2\3\2\2\2\u09c4\u09c5\3\2\2\2\u09c5\u09c7\3\2\2\2\u09c6\u09ba\3\2"+
		"\2\2\u09c6\u09bb\3\2\2\2\u09c6\u09bc\3\2\2\2\u09c6\u09bf\3\2\2\2\u09c6"+
		"\u09c0\3\2\2\2\u09c6\u09c2\3\2\2\2\u09c7\u00b9\3\2\2\2\u09c8\u09c9\t!"+
		"\2\2\u09c9\u00bb\3\2\2\2\u09ca\u09cb\t\"\2\2\u09cb\u00bd\3\2\2\2\u09cc"+
		"\u09cd\t#\2\2\u09cd\u00bf\3\2\2\2\u09ce\u09cf\t$\2\2\u09cf\u00c1\3\2\2"+
		"\2\u09d0\u09d3\7{\2\2\u09d1\u09d4\5\u00c4c\2\u09d2\u09d4\5\u00c8e\2\u09d3"+
		"\u09d1\3\2\2\2\u09d3\u09d2\3\2\2\2\u09d3\u09d4\3\2\2\2\u09d4\u09db\3\2"+
		"\2\2\u09d5\u09d8\6b\22\2\u09d6\u09d9\5\u00c4c\2\u09d7\u09d9\5\u00c8e\2"+
		"\u09d8\u09d6\3\2\2\2\u09d8\u09d7\3\2\2\2\u09d9\u09db\3\2\2\2\u09da\u09d0"+
		"\3\2\2\2\u09da\u09d5\3\2\2\2\u09db\u00c3\3\2\2\2\u09dc\u09de\5\u00c6d"+
		"\2\u09dd\u09df\5\u00caf\2\u09de\u09dd\3\2\2\2\u09de\u09df\3\2\2\2\u09df"+
		"\u00c5\3\2\2\2\u09e0\u09e1\5\u00ccg\2\u09e1\u09e2\5\u00ceh\2\u09e2\u09e4"+
		"\3\2\2\2\u09e3\u09e0\3\2\2\2\u09e4\u09e5\3\2\2\2\u09e5\u09e3\3\2\2\2\u09e5"+
		"\u09e6\3\2\2\2\u09e6\u00c7\3\2\2\2\u09e7\u09ea\5\u00caf\2\u09e8\u09eb"+
		"\5\u00c6d\2\u09e9\u09eb\5\u00caf\2\u09ea\u09e8\3\2\2\2\u09ea\u09e9\3\2"+
		"\2\2\u09ea\u09eb\3\2\2\2\u09eb\u00c9\3\2\2\2\u09ec\u09ed\5\u00ccg\2\u09ed"+
		"\u09ee\5\u00ceh\2\u09ee\u09ef\7\u00f3\2\2\u09ef\u09f0\5\u00ceh\2\u09f0"+
		"\u00cb\3\2\2\2\u09f1\u09f3\t%\2\2\u09f2\u09f1\3\2\2\2\u09f2\u09f3\3\2"+
		"\2\2\u09f3\u09f4\3\2\2\2\u09f4\u09f7\t\23\2\2\u09f5\u09f7\7\u0126\2\2"+
		"\u09f6\u09f2\3\2\2\2\u09f6\u09f5\3\2\2\2\u09f7\u00cd\3\2\2\2\u09f8\u09f9"+
		"\t&\2\2\u09f9\u00cf\3\2\2\2\u09fa\u09fe\7^\2\2\u09fb\u09fc\7\16\2\2\u09fc"+
		"\u09fe\5\u00eex\2\u09fd\u09fa\3\2\2\2\u09fd\u09fb\3\2\2\2\u09fe\u00d1"+
		"\3\2\2\2\u09ff\u0a00\7\26\2\2\u0a00\u0a01\7\u0117\2\2\u0a01\u0a02\5\u00d2"+
		"j\2\u0a02\u0a03\7\u0119\2\2\u0a03\u0a22\3\2\2\2\u0a04\u0a05\7\u0092\2"+
		"\2\u0a05\u0a06\7\u0117\2\2\u0a06\u0a07\5\u00d2j\2\u0a07\u0a08\7\5\2\2"+
		"\u0a08\u0a09\5\u00d2j\2\u0a09\u0a0a\7\u0119\2\2\u0a0a\u0a22\3\2\2\2\u0a0b"+
		"\u0a12\7\u00e9\2\2\u0a0c\u0a0e\7\u0117\2\2\u0a0d\u0a0f\5\u00dco\2\u0a0e"+
		"\u0a0d\3\2\2\2\u0a0e\u0a0f\3\2\2\2\u0a0f\u0a10\3\2\2\2\u0a10\u0a13\7\u0119"+
		"\2\2\u0a11\u0a13\7\u0115\2\2\u0a12\u0a0c\3\2\2\2\u0a12\u0a11\3\2\2\2\u0a13"+
		"\u0a22\3\2\2\2\u0a14\u0a1f\5\u00f4{\2\u0a15\u0a16\7\3\2\2\u0a16\u0a1b"+
		"\7\u012a\2\2\u0a17\u0a18\7\5\2\2\u0a18\u0a1a\7\u012a\2\2\u0a19\u0a17\3"+
		"\2\2\2\u0a1a\u0a1d\3\2\2\2\u0a1b\u0a19\3\2\2\2\u0a1b\u0a1c\3\2\2\2\u0a1c"+
		"\u0a1e\3\2\2\2\u0a1d\u0a1b\3\2\2\2\u0a1e\u0a20\7\4\2\2\u0a1f\u0a15\3\2"+
		"\2\2\u0a1f\u0a20\3\2\2\2\u0a20\u0a22\3\2\2\2\u0a21\u09ff\3\2\2\2\u0a21"+
		"\u0a04\3\2\2\2\u0a21\u0a0b\3\2\2\2\u0a21\u0a14\3\2\2\2\u0a22\u00d3\3\2"+
		"\2\2\u0a23\u0a28\5\u00d6l\2\u0a24\u0a25\7\5\2\2\u0a25\u0a27\5\u00d6l\2"+
		"\u0a26\u0a24\3\2\2\2\u0a27\u0a2a\3\2\2\2\u0a28\u0a26\3\2\2\2\u0a28\u0a29"+
		"\3\2\2\2\u0a29\u00d5\3\2\2\2\u0a2a\u0a28\3\2\2\2\u0a2b\u0a2c\5\u00eex"+
		"\2\u0a2c\u0a2f\5\u00d2j\2\u0a2d\u0a2e\7.\2\2\u0a2e\u0a30\7\u0126\2\2\u0a2f"+
		"\u0a2d\3\2\2\2\u0a2f\u0a30\3\2\2\2\u0a30\u0a32\3\2\2\2\u0a31\u0a33\5\u00d0"+
		"i\2\u0a32\u0a31\3\2\2\2\u0a32\u0a33\3\2\2\2\u0a33\u00d7\3\2\2\2\u0a34"+
		"\u0a39\5\u00dan\2\u0a35\u0a36\7\5\2\2\u0a36\u0a38\5\u00dan\2\u0a37\u0a35"+
		"\3\2\2\2\u0a38\u0a3b\3\2\2\2\u0a39\u0a37\3\2\2\2\u0a39\u0a3a\3\2\2\2\u0a3a"+
		"\u00d9\3\2\2\2\u0a3b\u0a39\3\2\2\2\u0a3c\u0a3d\5\u00f0y\2\u0a3d\u0a40"+
		"\5\u00d2j\2\u0a3e\u0a3f\7.\2\2\u0a3f\u0a41\7\u0126\2\2\u0a40\u0a3e\3\2"+
		"\2\2\u0a40\u0a41\3\2\2\2\u0a41\u00db\3\2\2\2\u0a42\u0a47\5\u00dep\2\u0a43"+
		"\u0a44\7\5\2\2\u0a44\u0a46\5\u00dep\2\u0a45\u0a43\3\2\2\2\u0a46\u0a49"+
		"\3\2\2\2\u0a47\u0a45\3\2\2\2\u0a47\u0a48\3\2\2\2\u0a48\u00dd\3\2\2\2\u0a49"+
		"\u0a47\3\2\2\2\u0a4a\u0a4b\5\u00f4{\2\u0a4b\u0a4c\7\f\2\2\u0a4c\u0a4f"+
		"\5\u00d2j\2\u0a4d\u0a4e\7.\2\2\u0a4e\u0a50\7\u0126\2\2\u0a4f\u0a4d\3\2"+
		"\2\2\u0a4f\u0a50\3\2\2\2\u0a50\u00df\3\2\2\2\u0a51\u0a52\7\u010d\2\2\u0a52"+
		"\u0a53\5\u00aeX\2\u0a53\u0a54\7\u00f2\2\2\u0a54\u0a55\5\u00aeX\2\u0a55"+
		"\u00e1\3\2\2\2\u0a56\u0a57\7\u010f\2\2\u0a57\u0a5c\5\u00e4s\2\u0a58\u0a59"+
		"\7\5\2\2\u0a59\u0a5b\5\u00e4s\2\u0a5a\u0a58\3\2\2\2\u0a5b\u0a5e\3\2\2"+
		"\2\u0a5c\u0a5a\3\2\2\2\u0a5c\u0a5d\3\2\2\2\u0a5d\u00e3\3\2\2\2\u0a5e\u0a5c"+
		"\3\2\2\2\u0a5f\u0a60\5\u00f0y\2\u0a60\u0a61\7\27\2\2\u0a61\u0a62\5\u00e6"+
		"t\2\u0a62\u00e5\3\2\2\2\u0a63\u0a92\5\u00f0y\2\u0a64\u0a65\7\3\2\2\u0a65"+
		"\u0a66\5\u00f0y\2\u0a66\u0a67\7\4\2\2\u0a67\u0a92\3\2\2\2\u0a68\u0a8b"+
		"\7\3\2\2\u0a69\u0a6a\7\'\2\2\u0a6a\u0a6b\7\37\2\2\u0a6b\u0a70\5\u00ae"+
		"X\2\u0a6c\u0a6d\7\5\2\2\u0a6d\u0a6f\5\u00aeX\2\u0a6e\u0a6c\3\2\2\2\u0a6f"+
		"\u0a72\3\2\2\2\u0a70\u0a6e\3\2\2\2\u0a70\u0a71\3\2\2\2\u0a71\u0a8c\3\2"+
		"\2\2\u0a72\u0a70\3\2\2\2\u0a73\u0a74\t\'\2\2\u0a74\u0a75\7\37\2\2\u0a75"+
		"\u0a7a\5\u00aeX\2\u0a76\u0a77\7\5\2\2\u0a77\u0a79\5\u00aeX\2\u0a78\u0a76"+
		"\3\2\2\2\u0a79\u0a7c\3\2\2\2\u0a7a\u0a78\3\2\2\2\u0a7a\u0a7b\3\2\2\2\u0a7b"+
		"\u0a7e\3\2\2\2\u0a7c\u0a7a\3\2\2\2\u0a7d\u0a73\3\2\2\2\u0a7d\u0a7e\3\2"+
		"\2\2\u0a7e\u0a89\3\2\2\2\u0a7f\u0a80\t(\2\2\u0a80\u0a81\7\37\2\2\u0a81"+
		"\u0a86\5T+\2\u0a82\u0a83\7\5\2\2\u0a83\u0a85\5T+\2\u0a84\u0a82\3\2\2\2"+
		"\u0a85\u0a88\3\2\2\2\u0a86\u0a84\3\2\2\2\u0a86\u0a87\3\2\2\2\u0a87\u0a8a"+
		"\3\2\2\2\u0a88\u0a86\3\2\2\2\u0a89\u0a7f\3\2\2\2\u0a89\u0a8a\3\2\2\2\u0a8a"+
		"\u0a8c\3\2\2\2\u0a8b\u0a69\3\2\2\2\u0a8b\u0a7d\3\2\2\2\u0a8c\u0a8e\3\2"+
		"\2\2\u0a8d\u0a8f\5\u00e8u\2\u0a8e\u0a8d\3\2\2\2\u0a8e\u0a8f\3\2\2\2\u0a8f"+
		"\u0a90\3\2\2\2\u0a90\u0a92\7\4\2\2\u0a91\u0a63\3\2\2\2\u0a91\u0a64\3\2"+
		"\2\2\u0a91\u0a68\3\2\2\2\u0a92\u00e7\3\2\2\2\u0a93\u0a94\7\u00be\2\2\u0a94"+
		"\u0aa4\5\u00eav\2\u0a95\u0a96\7\u00d3\2\2\u0a96\u0aa4\5\u00eav\2\u0a97"+
		"\u0a98\7\u00be\2\2\u0a98\u0a99\7\33\2\2\u0a99\u0a9a\5\u00eav\2\u0a9a\u0a9b"+
		"\7\22\2\2\u0a9b\u0a9c\5\u00eav\2\u0a9c\u0aa4\3\2\2\2\u0a9d\u0a9e\7\u00d3"+
		"\2\2\u0a9e\u0a9f\7\33\2\2\u0a9f\u0aa0\5\u00eav\2\u0aa0\u0aa1\7\22\2\2"+
		"\u0aa1\u0aa2\5\u00eav\2\u0aa2\u0aa4\3\2\2\2\u0aa3\u0a93\3\2\2\2\u0aa3"+
		"\u0a95\3\2\2\2\u0aa3\u0a97\3\2\2\2\u0aa3\u0a9d\3\2\2\2\u0aa4\u00e9\3\2"+
		"\2\2\u0aa5\u0aa6\7\u00fe\2\2\u0aa6\u0aad\t)\2\2\u0aa7\u0aa8\79\2\2\u0aa8"+
		"\u0aad\7\u00d2\2\2\u0aa9\u0aaa\5\u00aeX\2\u0aaa\u0aab\t)\2\2\u0aab\u0aad"+
		"\3\2\2\2\u0aac\u0aa5\3\2\2\2\u0aac\u0aa7\3\2\2\2\u0aac\u0aa9\3\2\2\2\u0aad"+
		"\u00eb\3\2\2\2\u0aae\u0ab3\5\u00eex\2\u0aaf\u0ab0\7\5\2\2\u0ab0\u0ab2"+
		"\5\u00eex\2\u0ab1\u0aaf\3\2\2\2\u0ab2\u0ab5\3\2\2\2\u0ab3\u0ab1\3\2\2"+
		"\2\u0ab3\u0ab4\3\2\2\2\u0ab4\u00ed\3\2\2\2\u0ab5\u0ab3\3\2\2\2\u0ab6\u0abb"+
		"\5\u00f4{\2\u0ab7\u0ab8\7\6\2\2\u0ab8\u0aba\5\u00f4{\2\u0ab9\u0ab7\3\2"+
		"\2\2\u0aba\u0abd\3\2\2\2\u0abb\u0ab9\3\2\2\2\u0abb\u0abc\3\2\2\2\u0abc"+
		"\u00ef\3\2\2\2\u0abd\u0abb\3\2\2\2\u0abe\u0abf\5\u00f4{\2\u0abf\u0ac0"+
		"\5\u00f2z\2\u0ac0\u00f1\3\2\2\2\u0ac1\u0ac2\7\u011c\2\2\u0ac2\u0ac4\5"+
		"\u00f4{\2\u0ac3\u0ac1\3\2\2\2\u0ac4\u0ac5\3\2\2\2\u0ac5\u0ac3\3\2\2\2"+
		"\u0ac5\u0ac6\3\2\2\2\u0ac6\u0ac9\3\2\2\2\u0ac7\u0ac9\3\2\2\2\u0ac8\u0ac3"+
		"\3\2\2\2\u0ac8\u0ac7\3\2\2\2\u0ac9\u00f3\3\2\2\2\u0aca\u0ace\5\u00f6|"+
		"\2\u0acb\u0acc\6{\23\2\u0acc\u0ace\5\u00fe\u0080\2\u0acd\u0aca\3\2\2\2"+
		"\u0acd\u0acb\3\2\2\2\u0ace\u00f5\3\2\2\2\u0acf\u0ad6\7\u012e\2\2\u0ad0"+
		"\u0ad6\5\u00f8}\2\u0ad1\u0ad2\6|\24\2\u0ad2\u0ad6\5\u00fc\177\2\u0ad3"+
		"\u0ad4\6|\25\2\u0ad4\u0ad6\5\u0100\u0081\2\u0ad5\u0acf\3\2\2\2\u0ad5\u0ad0"+
		"\3\2\2\2\u0ad5\u0ad1\3\2\2\2\u0ad5\u0ad3\3\2\2\2\u0ad6\u00f7\3\2\2\2\u0ad7"+
		"\u0ad8\7\u012f\2\2\u0ad8\u00f9\3\2\2\2\u0ad9\u0adb\7\u011c\2\2\u0ada\u0ad9"+
		"\3\2\2\2\u0ada\u0adb\3\2\2\2\u0adb\u0adc\3\2\2\2\u0adc\u0af6\7\u012b\2"+
		"\2\u0add\u0adf\7\u011c\2\2\u0ade\u0add\3\2\2\2\u0ade\u0adf\3\2\2\2\u0adf"+
		"\u0ae0\3\2\2\2\u0ae0\u0af6\7\u012a\2\2\u0ae1\u0ae3\7\u011c\2\2\u0ae2\u0ae1"+
		"\3\2\2\2\u0ae2\u0ae3\3\2\2\2\u0ae3\u0ae4\3\2\2\2\u0ae4\u0af6\7\u0127\2"+
		"\2\u0ae5\u0ae7\7\u011c\2\2\u0ae6\u0ae5\3\2\2\2\u0ae6\u0ae7\3\2\2\2\u0ae7"+
		"\u0ae8\3\2\2\2\u0ae8\u0af6\7\u0128\2\2\u0ae9\u0aeb\7\u011c\2\2\u0aea\u0ae9"+
		"\3\2\2\2\u0aea\u0aeb\3\2\2\2\u0aeb\u0aec\3\2\2\2\u0aec\u0af6\7\u0129\2"+
		"\2\u0aed\u0aef\7\u011c\2\2\u0aee\u0aed\3\2\2\2\u0aee\u0aef\3\2\2\2\u0aef"+
		"\u0af0\3\2\2\2\u0af0\u0af6\7\u012c\2\2\u0af1\u0af3\7\u011c\2\2\u0af2\u0af1"+
		"\3\2\2\2\u0af2\u0af3\3\2\2\2\u0af3\u0af4\3\2\2\2\u0af4\u0af6\7\u012d\2"+
		"\2\u0af5\u0ada\3\2\2\2\u0af5\u0ade\3\2\2\2\u0af5\u0ae2\3\2\2\2\u0af5\u0ae6"+
		"\3\2\2\2\u0af5\u0aea\3\2\2\2\u0af5\u0aee\3\2\2\2\u0af5\u0af2\3\2\2\2\u0af6"+
		"\u00fb\3\2\2\2\u0af7\u0af8\t*\2\2\u0af8\u00fd\3\2\2\2\u0af9\u0afa\t+\2"+
		"\2\u0afa\u00ff\3\2\2\2\u0afb\u0afc\t,\2\2\u0afc\u0101\3\2\2\2\u0174\u0118"+
		"\u011f\u0124\u012a\u012f\u0138\u013a\u014d\u0151\u0155\u015b\u015e\u0161"+
		"\u0168\u0176\u0178\u017c\u017f\u0186\u0193\u019c\u019e\u01a2\u01a5\u01ac"+
		"\u01b2\u01b9\u01c7\u01c9\u01cd\u01d0\u01d6\u01e1\u0221\u022a\u022f\u0233"+
		"\u0236\u023c\u0240\u0245\u024b\u0253\u0259\u0266\u026b\u0274\u0279\u0289"+
		"\u0290\u0294\u029a\u02a9\u02ad\u02b3\u02b9\u02bc\u02bf\u02c5\u02c9\u02d2"+
		"\u02d4\u02dd\u02e0\u02e9\u02ee\u02f4\u02fb\u02fe\u0304\u030f\u0312\u0316"+
		"\u031b\u0320\u0327\u032a\u032d\u0334\u0339\u0342\u034a\u0350\u0354\u0358"+
		"\u035c\u035e\u0367\u036d\u0373\u0376\u037a\u037d\u0381\u038c\u038f\u0393"+
		"\u0399\u039c\u039f\u03a5\u03ad\u03b2\u03b8\u03be\u03c9\u03d1\u03d8\u03e1"+
		"\u03e8\u03ee\u03f1\u03f9\u03fd\u0404\u0478\u0480\u0488\u0491\u049d\u04a1"+
		"\u04a4\u04aa\u04b0\u04bc\u04c8\u04cd\u04d3\u04db\u04e2\u04e4\u04e9\u04ed"+
		"\u04f2\u04f7\u04fc\u04ff\u0504\u0508\u050d\u050f\u0513\u051c\u0524\u052d"+
		"\u0534\u053d\u0542\u0545\u0554\u055b\u055e\u0565\u0569\u056f\u0577\u0582"+
		"\u058d\u0594\u059a\u05a7\u05a9\u05b2\u05b5\u05be\u05c1\u05ca\u05cd\u05d6"+
		"\u05d9\u05dc\u05e1\u05e3\u05ef\u05f6\u05fd\u0600\u0602\u060e\u0612\u0616"+
		"\u061c\u0620\u0628\u062c\u062f\u0632\u0635\u0639\u063d\u0640\u0644\u0649"+
		"\u064d\u0650\u0653\u0656\u0658\u0664\u0667\u066b\u0675\u0679\u067b\u067e"+
		"\u0682\u0688\u068c\u0696\u06a6\u06ab\u06b8\u06bd\u06c5\u06cb\u06cf\u06d8"+
		"\u06e7\u06ec\u06f8\u06fd\u0705\u0708\u070c\u071a\u0727\u072c\u0730\u0733"+
		"\u0738\u0741\u0744\u0749\u0750\u0753\u075b\u0762\u0769\u076c\u0771\u0774"+
		"\u0779\u077d\u0780\u0783\u0789\u078e\u0793\u07a5\u07a7\u07aa\u07b5\u07be"+
		"\u07c5\u07cd\u07d5\u07d9\u07e1\u07e9\u07ef\u07f7\u0803\u0806\u080c\u0810"+
		"\u0812\u081b\u0827\u0829\u0830\u0837\u083d\u0843\u0845\u084c\u0852\u0859"+
		"\u085f\u0863\u0865\u086c\u0875\u0882\u0887\u088b\u0899\u089b\u08a3\u08a5"+
		"\u08a9\u08b1\u08ba\u08c0\u08c8\u08ce\u08d3\u08d8\u08dd\u08e3\u08f8\u08fa"+
		"\u0903\u0907\u0910\u0914\u0926\u0929\u0931\u093a\u0951\u095c\u0963\u0966"+
		"\u096b\u0976\u098e\u0995\u0998\u09a7\u09ab\u09b5\u09b7\u09c4\u09c6\u09d3"+
		"\u09d8\u09da\u09de\u09e5\u09ea\u09f2\u09f6\u09fd\u0a0e\u0a12\u0a1b\u0a1f"+
		"\u0a21\u0a28\u0a2f\u0a32\u0a39\u0a40\u0a47\u0a4f\u0a5c\u0a70\u0a7a\u0a7d"+
		"\u0a86\u0a89\u0a8b\u0a8e\u0a91\u0aa3\u0aac\u0ab3\u0abb\u0ac5\u0ac8\u0acd"+
		"\u0ad5\u0ada\u0ade\u0ae2\u0ae6\u0aea\u0aee\u0af2\u0af5";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}