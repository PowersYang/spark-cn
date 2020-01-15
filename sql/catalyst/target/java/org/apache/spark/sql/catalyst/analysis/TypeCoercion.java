package org.apache.spark.sql.catalyst.analysis;
/**
 * A collection of {@link Rule} that can be used to coerce differing types that participate in
 * operations into compatible ones.
 * <p>
 * Notes about type widening / tightest common types: Broadly, there are two cases when we need
 * to widen data types (e.g. union, binary comparison). In case 1, we are looking for a common
 * data type for two or more data types, and in this case no loss of precision is allowed. Examples
 * include type inference in JSON (e.g. what's the column's data type if one row is an integer
 * while the other row is a long?). In case 2, we are looking for a widened data type with
 * some acceptable loss of precision (e.g. there is no common type for double and decimal because
 * double's range is larger than decimal, and yet decimal is more precise than double, but in
 * union we would cast the decimal into double).
 */
public  class TypeCoercion {
  /**
   * Widens numeric types and converts strings to numbers when appropriate.
   * <p>
   * Loosely based on rules from "Hadoop: The Definitive Guide" 2nd edition, by Tom White
   * <p>
   * The implicit conversion rules can be summarized as follows:
   *   - Any integral numeric type can be implicitly converted to a wider type.
   *   - All the integral numeric types, FLOAT, and (perhaps surprisingly) STRING can be implicitly
   *     converted to DOUBLE.
   *   - TINYINT, SMALLINT, and INT can all be converted to FLOAT.
   *   - BOOLEAN types cannot be converted to any other type.
   *   - Any integral numeric type can be implicitly converted to decimal type.
   *   - two different decimal types will be converted into a wider decimal type for both of them.
   *   - decimal type will be converted into double if there float or double together with it.
   * <p>
   * Additionally, all types when UNION-ed with strings will be promoted to strings.
   * Other string conversions are handled by PromoteStrings.
   * <p>
   * Widening types might result in loss of precision in the following cases:
   * - IntegerType to FloatType
   * - LongType to FloatType
   * - LongType to DoubleType
   * - DecimalType to Double
   * <p>
   * This rule is only applied to Union/Except/Intersect
   */
  static public  class WidenSetOperationTypes$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final WidenSetOperationTypes$ MODULE$ = null;
    public   WidenSetOperationTypes$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * Promotes strings that appear in arithmetic expressions.
   */
  static public  class PromoteStrings extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.TypeCoercionRule, scala.Product, scala.Serializable {
    public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
    // not preceding
    public   PromoteStrings (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
    protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan coerceTypes (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  static public  class PromoteStrings$ extends scala.runtime.AbstractFunction1<org.apache.spark.sql.internal.SQLConf, org.apache.spark.sql.catalyst.analysis.TypeCoercion.PromoteStrings> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final PromoteStrings$ MODULE$ = null;
    public   PromoteStrings$ ()  { throw new RuntimeException(); }
  }
  /**
   * Handles type coercion for both IN expression with subquery and IN
   * expressions without subquery.
   * 1. In the first case, find the common type by comparing the left hand side (LHS)
   *    expression types against corresponding right hand side (RHS) expression derived
   *    from the subquery expression's plan output. Inject appropriate casts in the
   *    LHS and RHS side of IN expression.
   * <p>
   * 2. In the second case, convert the value and in list expressions to the
   *    common operator type by looking at all the argument types and finding
   *    the closest one that all the arguments can be cast to. When no common
   *    operator type is found the original expression will be returned and an
   *    Analysis Exception will be raised at the type checking phase.
   */
  static public  class InConversion extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.TypeCoercionRule, scala.Product, scala.Serializable {
    public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
    // not preceding
    public   InConversion (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
    protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan coerceTypes (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  static public  class InConversion$ extends scala.runtime.AbstractFunction1<org.apache.spark.sql.internal.SQLConf, org.apache.spark.sql.catalyst.analysis.TypeCoercion.InConversion> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final InConversion$ MODULE$ = null;
    public   InConversion$ ()  { throw new RuntimeException(); }
  }
  /**
   * Changes numeric values to booleans so that expressions like true = 1 can be evaluated.
   */
  static public  class BooleanEquality$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final BooleanEquality$ MODULE$ = null;
    public   BooleanEquality$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * This ensure that the types for various functions are as expected.
   */
  static public  class FunctionArgumentConversion$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.TypeCoercionRule {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final FunctionArgumentConversion$ MODULE$ = null;
    public   FunctionArgumentConversion$ ()  { throw new RuntimeException(); }
    protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan coerceTypes (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * Hive only performs integral division with the DIV operator. The arguments to / are always
   * converted to fractional types.
   */
  static public  class Division extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.TypeCoercionRule, scala.Product, scala.Serializable {
    public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
    // not preceding
    public   Division (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
    protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan coerceTypes (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  static public  class Division$ extends scala.runtime.AbstractFunction1<org.apache.spark.sql.internal.SQLConf, org.apache.spark.sql.catalyst.analysis.TypeCoercion.Division> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Division$ MODULE$ = null;
    public   Division$ ()  { throw new RuntimeException(); }
  }
  /**
   * Coerces the type of different branches of a CASE WHEN statement to a common type.
   */
  static public  class CaseWhenCoercion$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.TypeCoercionRule {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CaseWhenCoercion$ MODULE$ = null;
    public   CaseWhenCoercion$ ()  { throw new RuntimeException(); }
    protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan coerceTypes (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * Coerces the type of different branches of If statement to a common type.
   */
  static public  class IfCoercion$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.TypeCoercionRule {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final IfCoercion$ MODULE$ = null;
    public   IfCoercion$ ()  { throw new RuntimeException(); }
    protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan coerceTypes (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * Coerces NullTypes in the Stack expression to the column types of the corresponding positions.
   */
  static public  class StackCoercion$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.TypeCoercionRule {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StackCoercion$ MODULE$ = null;
    public   StackCoercion$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan coerceTypes (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * Coerces the types of {@link Concat} children to expected ones.
   * <p>
   * If <code>spark.sql.function.concatBinaryAsString</code> is false and all children types are binary,
   * the expected types are binary. Otherwise, the expected ones are strings.
   */
  static public  class ConcatCoercion extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.TypeCoercionRule, scala.Product, scala.Serializable {
    public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
    // not preceding
    public   ConcatCoercion (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
    protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan coerceTypes (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  static public  class ConcatCoercion$ extends scala.runtime.AbstractFunction1<org.apache.spark.sql.internal.SQLConf, org.apache.spark.sql.catalyst.analysis.TypeCoercion.ConcatCoercion> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ConcatCoercion$ MODULE$ = null;
    public   ConcatCoercion$ ()  { throw new RuntimeException(); }
  }
  /**
   * Coerces key types of two different {@link MapType} arguments of the {@link MapZipWith} expression
   * to a common type.
   */
  static public  class MapZipWithCoercion$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.TypeCoercionRule {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final MapZipWithCoercion$ MODULE$ = null;
    public   MapZipWithCoercion$ ()  { throw new RuntimeException(); }
    protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan coerceTypes (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * Coerces the types of {@link Elt} children to expected ones.
   * <p>
   * If <code>spark.sql.function.eltOutputAsString</code> is false and all children types are binary,
   * the expected types are binary. Otherwise, the expected ones are strings.
   */
  static public  class EltCoercion extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.TypeCoercionRule, scala.Product, scala.Serializable {
    public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
    // not preceding
    public   EltCoercion (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
    protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan coerceTypes (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  static public  class EltCoercion$ extends scala.runtime.AbstractFunction1<org.apache.spark.sql.internal.SQLConf, org.apache.spark.sql.catalyst.analysis.TypeCoercion.EltCoercion> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final EltCoercion$ MODULE$ = null;
    public   EltCoercion$ ()  { throw new RuntimeException(); }
  }
  /**
   * 1. Turns Add/Subtract of DateType/TimestampType/StringType and CalendarIntervalType
   *    to TimeAdd/TimeSub.
   * 2. Turns Add/Subtract of TimestampType/DateType/IntegerType
   *    and TimestampType/IntegerType/DateType to DateAdd/DateSub/SubtractDates and
   *    to SubtractTimestamps.
   */
  static public  class DateTimeOperations$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DateTimeOperations$ MODULE$ = null;
    public   DateTimeOperations$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * Casts types according to the expected input types for {@link Expression}s.
   */
  static public  class ImplicitTypeCasts$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.TypeCoercionRule {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ImplicitTypeCasts$ MODULE$ = null;
    public   ImplicitTypeCasts$ ()  { throw new RuntimeException(); }
    protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan coerceTypes (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    /**
     * Given an expected data type, try to cast the expression and return the cast expression.
     * <p>
     * If the expression already fits the input type, we simply return the expression itself.
     * If the expression has an incompatible type that cannot be implicitly cast, return None.
     * @param e (undocumented)
     * @param expectedType (undocumented)
     * @return (undocumented)
     */
    public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> implicitCast (org.apache.spark.sql.catalyst.expressions.Expression e, org.apache.spark.sql.types.AbstractDataType expectedType)  { throw new RuntimeException(); }
  }
  /**
   * Cast WindowFrame boundaries to the type they operate upon.
   */
  static public  class WindowFrameCoercion$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.TypeCoercionRule {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final WindowFrameCoercion$ MODULE$ = null;
    public   WindowFrameCoercion$ ()  { throw new RuntimeException(); }
    protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan coerceTypes (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  static public  scala.collection.immutable.List<org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> typeCoercionRules (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  static public  scala.collection.IndexedSeq<org.apache.spark.sql.types.NumericType> numericPrecedence ()  { throw new RuntimeException(); }
  /**
   * Case 1 type widening (see the classdoc comment above for TypeCoercion).
   * <p>
   * Find the tightest common type of two types that might be used in a binary expression.
   * This handles all numeric types except fixed-precision decimals interacting with each other or
   * with primitive types, because in that case the precision and scale of the result depends on
   * the operation. Those rules are implemented in {@link DecimalPrecision}.
   * @return (undocumented)
   */
  static public  scala.Function2<org.apache.spark.sql.types.DataType, org.apache.spark.sql.types.DataType, scala.Option<org.apache.spark.sql.types.DataType>> findTightestCommonType ()  { throw new RuntimeException(); }
  /**
   * The method finds a common type for data types that differ only in nullable flags, including
   * <code>nullable</code>, <code>containsNull</code> of {@link ArrayType} and <code>valueContainsNull</code> of {@link MapType}.
   * If the input types are different besides nullable flags, None is returned.
   * @param t1 (undocumented)
   * @param t2 (undocumented)
   * @return (undocumented)
   */
  static public  scala.Option<org.apache.spark.sql.types.DataType> findCommonTypeDifferentOnlyInNullFlags (org.apache.spark.sql.types.DataType t1, org.apache.spark.sql.types.DataType t2)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.sql.types.DataType> findCommonTypeDifferentOnlyInNullFlags (scala.collection.Seq<org.apache.spark.sql.types.DataType> types)  { throw new RuntimeException(); }
  /**
   * Case 2 type widening (see the classdoc comment above for TypeCoercion).
   * <p>
   * i.e. the main difference with {@link findTightestCommonType} is that here we allow some
   * loss of precision when widening decimal and double, and promotion to string.
   * @param t1 (undocumented)
   * @param t2 (undocumented)
   * @return (undocumented)
   */
  static public  scala.Option<org.apache.spark.sql.types.DataType> findWiderTypeForTwo (org.apache.spark.sql.types.DataType t1, org.apache.spark.sql.types.DataType t2)  { throw new RuntimeException(); }
  /**
   * Whether the data type contains StringType.
   * @param dt (undocumented)
   * @return (undocumented)
   */
  static public  boolean hasStringType (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  /**
   * Similar to {@link findWiderTypeForTwo} that can handle decimal types, but can't promote to
   * string. If the wider decimal type exceeds system limitation, this rule will truncate
   * the decimal type before return it.
   * @param t1 (undocumented)
   * @param t2 (undocumented)
   * @return (undocumented)
   */
  static   scala.Option<org.apache.spark.sql.types.DataType> findWiderTypeWithoutStringPromotionForTwo (org.apache.spark.sql.types.DataType t1, org.apache.spark.sql.types.DataType t2)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.sql.types.DataType> findWiderTypeWithoutStringPromotion (scala.collection.Seq<org.apache.spark.sql.types.DataType> types)  { throw new RuntimeException(); }
  /**
   * Check whether the given types are equal ignoring nullable, containsNull and valueContainsNull.
   * @param types (undocumented)
   * @return (undocumented)
   */
  static public  boolean haveSameType (scala.collection.Seq<org.apache.spark.sql.types.DataType> types)  { throw new RuntimeException(); }
}
