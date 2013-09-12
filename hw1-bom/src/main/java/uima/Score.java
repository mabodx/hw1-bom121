

/* First created by JCasGen Wed Sep 11 12:41:27 EDT 2013 */
package uima;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Sep 11 12:46:58 EDT 2013
 * XML source: /Users/mabodx/git/hw1-bom/hw1-bom/src/main/resources/hw1-bom-typesystem.xml
 * @generated */
public class Score extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Score.class);
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
  protected Score() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Score(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Score(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Score(JCas jcas, int begin, int end) {
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
  //* Feature: baseAnnotation

  /** getter for baseAnnotation - gets 
   * @generated */
  public BaseAnnotationType getBaseAnnotation() {
    if (Score_Type.featOkTst && ((Score_Type)jcasType).casFeat_baseAnnotation == null)
      jcasType.jcas.throwFeatMissing("baseAnnotation", "uima.Score");
    return (BaseAnnotationType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Score_Type)jcasType).casFeatCode_baseAnnotation)));}
    
  /** setter for baseAnnotation - sets  
   * @generated */
  public void setBaseAnnotation(BaseAnnotationType v) {
    if (Score_Type.featOkTst && ((Score_Type)jcasType).casFeat_baseAnnotation == null)
      jcasType.jcas.throwFeatMissing("baseAnnotation", "uima.Score");
    jcasType.ll_cas.ll_setRefValue(addr, ((Score_Type)jcasType).casFeatCode_baseAnnotation, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    