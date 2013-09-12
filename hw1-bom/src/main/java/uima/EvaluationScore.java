

/* First created by JCasGen Wed Sep 11 13:18:12 EDT 2013 */
package uima;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Sep 11 13:18:12 EDT 2013
 * XML source: /Users/mabodx/git/hw1-bom/hw1-bom/src/main/resources/hw1-bom-typesystem.xml
 * @generated */
public class EvaluationScore extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(EvaluationScore.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected EvaluationScore() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public EvaluationScore(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public EvaluationScore(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public EvaluationScore(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: baseAnnotaion

  /** getter for baseAnnotaion - gets 
   * @generated */
  public BaseAnnotationType getBaseAnnotaion() {
    if (EvaluationScore_Type.featOkTst && ((EvaluationScore_Type)jcasType).casFeat_baseAnnotaion == null)
      jcasType.jcas.throwFeatMissing("baseAnnotaion", "uima.EvaluationScore");
    return (BaseAnnotationType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EvaluationScore_Type)jcasType).casFeatCode_baseAnnotaion)));}
    
  /** setter for baseAnnotaion - sets  
   * @generated */
  public void setBaseAnnotaion(BaseAnnotationType v) {
    if (EvaluationScore_Type.featOkTst && ((EvaluationScore_Type)jcasType).casFeat_baseAnnotaion == null)
      jcasType.jcas.throwFeatMissing("baseAnnotaion", "uima.EvaluationScore");
    jcasType.ll_cas.ll_setRefValue(addr, ((EvaluationScore_Type)jcasType).casFeatCode_baseAnnotaion, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    